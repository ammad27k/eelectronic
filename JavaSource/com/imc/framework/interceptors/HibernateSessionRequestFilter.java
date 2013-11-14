package com.imc.framework.interceptors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.StaleObjectStateException;


import com.imc.framework.action.HomeAction;
import com.imc.framework.common.BaseAction;
import com.imc.utils.HibernateUtil;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class HibernateSessionRequestFilter implements Interceptor {


	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8752911348187411384L;
	 private SessionFactory sf;
	 private static Logger log = Logger.getLogger(HibernateSessionRequestFilter.class);

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		 sf = HibernateUtil.getSessionFactory();
		
	}

	@Override
	public String intercept(ActionInvocation action) throws Exception {
		String result;
		try {
            log.debug("Starting a database transaction");
            
            	
           
            	sf.getCurrentSession().beginTransaction();
            	
           	 
	            // Call the next filter (continue request processing)
            	result = action.invoke();
	 
	            // Commit and cleanup
	            log.debug("Committing the database transaction");
	            sf.getCurrentSession().getTransaction().commit();
	 
           
            
        } catch (StaleObjectStateException staleEx) {
            log.error("This interceptor does not implement optimistic concurrency control!");
            log.error("Your application will not work until you add compensation actions!");
            // Rollback, close everything, possibly compensate for any permanent changes
            // during the conversation, and finally restart business conversation. Maybe
            // give the user of the application a chance to merge some of his work with
            // fresh data... what you do here depends on your applications design.
            throw staleEx;
        } catch (Throwable ex) {
            // Rollback only
            ex.printStackTrace();
            try {
                if (sf.getCurrentSession().getTransaction().isActive()) {
                    log.debug("Trying to rollback database transaction after exception");
                    sf.getCurrentSession().getTransaction().rollback();
                }
            } catch (Throwable rbEx) {
                log.error("Could not rollback transaction after exception!", rbEx);
            }
 
            // Let others handle it... maybe another interceptor for exceptions?
            throw new ServletException(ex);
        }
		return result;
	}

}

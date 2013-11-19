package com.imc.framework.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.imc.utils.HibernateUtil;

import com.imc.cron.Scrap;

/**
 * Servlet implementation class TestServalet
 */
public class CronServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CronServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Scrap scrap = new Scrap();
		try{
			String url = "http://www.gsmarena.com/sony_ericsson_xperia_neo_v-";
			int start = 1500;
			
			int limit =1560;
			
			boolean brands = false;
			for(int i = start ;i< start + limit ; i++) {
				HibernateUtil.getSessionFactory().getCurrentSession().beginTransaction();
				scrap.scrapHtmlPage(url + i + ".php");
				if(!brands){
					scrap.saveBrands();
				}
				scrap.getBrandTitle();
				
				scrap.downloadPhoneImage(this.getServletContext().getRealPath("/"));
				scrap.persistMobilePhoneData();
				HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
				brands = true;
			}
			
			
			
		}catch (Exception e) {
			HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
			System.out.print(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

}

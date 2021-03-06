package com.imc.service;

import com.imc.dao.CategoriesDao;
import com.imc.dao.CategoriesDaoImpl;
import java.math.BigInteger;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.imc.dao.MobilePhoneMultipleFeatureDao;
import com.imc.dao.PersistenceDao;
import com.imc.framework.bean.Categories;
import com.imc.framework.bean.MobileAlertTypes;
import com.imc.framework.bean.MobileBrands;
import com.imc.framework.bean.MobileBrowsers;
import com.imc.framework.bean.MobileCameraFeatures;
import com.imc.framework.bean.MobileCameraPrimary;
import com.imc.framework.bean.MobileCameraSecondary;
import com.imc.framework.bean.MobileCameraVideo;
import com.imc.framework.bean.MobileColors;
import com.imc.framework.bean.MobileDataSpeeds;
import com.imc.framework.bean.MobileDisplayProtection;
import com.imc.framework.bean.MobileDisplayTypes;
import com.imc.framework.bean.MobileFeatures;
import com.imc.framework.bean.MobileGames;
import com.imc.framework.bean.MobileJava;
import com.imc.framework.bean.MobileMemory;
import com.imc.framework.bean.MobileMemoryCardslots;
import com.imc.framework.bean.MobileMessaging;
import com.imc.framework.bean.MobileNetworks;
import com.imc.framework.bean.MobileNfc;
import com.imc.framework.bean.MobilePhoneReviews;
import com.imc.framework.bean.MobilePhones;
import com.imc.framework.bean.MobileRadio;
import com.imc.framework.bean.MobileSensors;
import com.imc.framework.bean.MobileSoundFeatures;
import com.imc.framework.factory.DAOFactory;
import com.imc.utils.HibernateUtil;

public class MobileService {
	private static Logger LGR = Logger.getLogger(MobileService.class);
	
	public MobileService() {
		
	}
	
	public static List<MobileAlertTypes> getMobileAlertType(MobilePhones phone,long phoneId) throws Exception{
		try{
			MobilePhoneMultipleFeatureDao multipleFeature = DAOFactory.getInstance().getMultipleFeatureDao();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			
			List<MobileAlertTypes> mobileAlertType = multipleFeature.getMobileAlertTypes(phone, session,phoneId);	
			
			return mobileAlertType;
		}catch(Exception e){
			throw new Exception(e);
		}
		
	}
	
	public static List<MobileBrowsers> getMobileBrowsers(MobilePhones phone,long phoneId) throws Exception{
		try{
			MobilePhoneMultipleFeatureDao multipleFeature = DAOFactory.getInstance().getMultipleFeatureDao();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		//	session.beginTransaction();
			List<MobileBrowsers> mobileBrowsers = multipleFeature.getMobileBrowsers(phone, session,phoneId);
			return mobileBrowsers;
		}catch(Exception e){
			throw new Exception(e);
		}
	}
	
	public static List<MobileCameraFeatures> getMobileCameraFeatures(MobilePhones phone,long phoneId) throws Exception{
		try{
			MobilePhoneMultipleFeatureDao multipleFeature = DAOFactory.getInstance().getMultipleFeatureDao();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		//	session.beginTransaction();
			List<MobileCameraFeatures> mobileBrowsers = multipleFeature.getCameraFeatures(phone, session,phoneId);
			return mobileBrowsers;
		}catch(Exception e){
			throw new Exception(e);
		}
	}
	
	public static List<MobileCameraPrimary> getCameraPrimaries(MobilePhones phone,long phoneId) throws Exception{
		try{
			MobilePhoneMultipleFeatureDao multipleFeature = DAOFactory.getInstance().getMultipleFeatureDao();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		//	session.beginTransaction();
			List<MobileCameraPrimary> mobileCameraPrimaries = multipleFeature.getCameraPrimaries(phone, session,phoneId);
			return mobileCameraPrimaries;
		}catch(Exception e){
			throw new Exception(e);
		}
	}
	public static List<MobileCameraSecondary> getCameraSecondaries(MobilePhones phone,long phoneId) throws Exception{
		try{
			MobilePhoneMultipleFeatureDao multipleFeature = DAOFactory.getInstance().getMultipleFeatureDao();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		//	session.beginTransaction();
			List<MobileCameraSecondary> mobileCameraSecondaries = multipleFeature.getCameraSecondaries(phone, session, phoneId);
			return mobileCameraSecondaries;
		}catch(Exception e){
			throw new Exception(e);
		}
	}
	public static List<MobileCameraVideo> getCameraVideos(MobilePhones phone,long phoneId) throws Exception{
		try{
			MobilePhoneMultipleFeatureDao multipleFeature = DAOFactory.getInstance().getMultipleFeatureDao();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		//	session.beginTransaction();
			List<MobileCameraVideo> mobileCameraVideos = multipleFeature.getCameraVideos(phone, session, phoneId);
			return mobileCameraVideos;
		}catch(Exception e){
			throw new Exception(e);
		}
	}
	public static List<MobileColors> getMobileColors(MobilePhones phone,long phoneId) throws Exception{
		try{
			MobilePhoneMultipleFeatureDao multipleFeature = DAOFactory.getInstance().getMultipleFeatureDao();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		//	session.beginTransaction();
			List<MobileColors> mobileColors = multipleFeature.getMobileColors(phone, session, phoneId);
			return mobileColors;
		}catch(Exception e){
			throw new Exception(e);
		}
	}
	public static List<MobileDataSpeeds> getMobileDataSpeeds(MobilePhones phone,long phoneId) throws Exception{
		try{
			MobilePhoneMultipleFeatureDao multipleFeature = DAOFactory.getInstance().getMultipleFeatureDao();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		//	session.beginTransaction();
			List<MobileDataSpeeds> mobileDataSpeeds = multipleFeature.getMobileDataSpeeds(phone, session, phoneId);
			return mobileDataSpeeds;
		}catch(Exception e){
			throw new Exception(e);
		}
	}
	public static List<MobileDisplayTypes> getDisplayTypes(MobilePhones phone,long phoneId) throws Exception{
		try{
			MobilePhoneMultipleFeatureDao multipleFeature = DAOFactory.getInstance().getMultipleFeatureDao();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		//	session.beginTransaction();
			List<MobileDisplayTypes> mobileDisplayTypes = multipleFeature.getDisplayTypes(phone, session, phoneId);
			return mobileDisplayTypes;
		}catch(Exception e){
			throw new Exception(e);
		}
	}
	public static List<MobileFeatures> getMobileFeatures(MobilePhones phone,long phoneId) throws Exception{
		try{
			MobilePhoneMultipleFeatureDao multipleFeature = DAOFactory.getInstance().getMultipleFeatureDao();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		//	session.beginTransaction();
			List<MobileFeatures> mobileFeatures = multipleFeature.getMobileFeatures(phone, session, phoneId);
			return mobileFeatures;
		}catch(Exception e){
			throw new Exception(e);
		}
	}
	public static List<MobileGames> getMobileGames(MobilePhones phone,long phoneId) throws Exception{
		try{
			MobilePhoneMultipleFeatureDao multipleFeature = DAOFactory.getInstance().getMultipleFeatureDao();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		//	session.beginTransaction();
			List<MobileGames> mobileGames = multipleFeature.getMobileGames(phone, session, phoneId);
			return mobileGames;
		}catch(Exception e){
			throw new Exception(e);
		}
	}
	public static List<MobileJava> getMobileJavas(MobilePhones phone,long phoneId) throws Exception{
		try{
			MobilePhoneMultipleFeatureDao multipleFeature = DAOFactory.getInstance().getMultipleFeatureDao();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			//session.beginTransaction();
			List<MobileJava> mobileJavas = multipleFeature.getMobileJavas(phone, session, phoneId);
			return mobileJavas;
		}catch(Exception e){
			throw new Exception(e);
		}
	}
	public static List<MobileMemory> getMobileMemories(MobilePhones phone,long phoneId) throws Exception{
		try{
			MobilePhoneMultipleFeatureDao multipleFeature = DAOFactory.getInstance().getMultipleFeatureDao();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			//session.beginTransaction();
			List<MobileMemory> mobileMemories = multipleFeature.getMobileMemories(phone, session, phoneId);
			return mobileMemories;
		}catch(Exception e){
			throw new Exception(e);
		}
	}
	public static List<MobileMemoryCardslots> getMobileMemoryCardslots(MobilePhones phone,long phoneId) throws Exception{
		try{
			MobilePhoneMultipleFeatureDao multipleFeature = DAOFactory.getInstance().getMultipleFeatureDao();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		//	session.beginTransaction();
			List<MobileMemoryCardslots> mobileMemoryCardslots = multipleFeature.getMobileMemoryCardslots(phone, session, phoneId);
			return mobileMemoryCardslots;
		}catch(Exception e){
			throw new Exception(e);
		}
	}
	public static List<MobileMessaging> getMobileMessagings(MobilePhones phone,long phoneId) throws Exception{
		try{
			MobilePhoneMultipleFeatureDao multipleFeature = DAOFactory.getInstance().getMultipleFeatureDao();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		//	session.beginTransaction();
			List<MobileMessaging> mobileMessagings = multipleFeature.getMobileMessagings(phone, session, phoneId);
			return mobileMessagings;
		}catch(Exception e){
			throw new Exception(e);
		}
	}
	public static List<MobileNetworks> getMobileNetworks(MobilePhones phone,long phoneId) throws Exception{
		try{
			MobilePhoneMultipleFeatureDao multipleFeature = DAOFactory.getInstance().getMultipleFeatureDao();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		//	session.beginTransaction();
			List<MobileNetworks> mobileNetworks = multipleFeature.getMobileNetworks(phone, session, phoneId);
			return mobileNetworks;
		}catch(Exception e){
			throw new Exception(e);
		}
	}
	public static List<MobileNfc> getMobileNfcs(MobilePhones phones,long phoneId) throws Exception{
		try{
			MobilePhoneMultipleFeatureDao multipleFeature = DAOFactory.getInstance().getMultipleFeatureDao();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		//	session.beginTransaction();
			List<MobileNfc> mobileNfcs = multipleFeature.getMobileNfcs(phones, session, phoneId);
			return mobileNfcs;
		}catch(Exception e){
			throw new Exception(e);
		}
	}
	public static List<MobileDisplayProtection> getDisplayProtections(MobilePhones phones,long phoneId) throws Exception{
		try{
			MobilePhoneMultipleFeatureDao multipleFeature = DAOFactory.getInstance().getMultipleFeatureDao();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			//session.beginTransaction();
			List<MobileDisplayProtection> mobileDisplayProtections = multipleFeature.getDisplayProtections(phones, session, phoneId);
			return mobileDisplayProtections;
		}catch(Exception e){
			throw new Exception(e);
		}
	}
	public static List<MobileRadio> getMobileRadios(MobilePhones phones,long phoneId) throws Exception{
		try{
			MobilePhoneMultipleFeatureDao multipleFeature = DAOFactory.getInstance().getMultipleFeatureDao();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			//session.beginTransaction();
			List<MobileRadio> mobileRadios = multipleFeature.getMobileRadios(phones, session, phoneId);
			return mobileRadios;
		}catch(Exception e){
			throw new Exception(e);
		}
	}
	public static List<MobileSensors> getMobileSensors(MobilePhones phones,long phoneId) throws Exception{
		try{
			MobilePhoneMultipleFeatureDao multipleFeature = DAOFactory.getInstance().getMultipleFeatureDao();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		//	session.beginTransaction();
			List<MobileSensors> mobileSensors = multipleFeature.getMobileSensors(phones, session, phoneId);
			return mobileSensors;
		}catch(Exception e){
			throw new Exception(e);
		}
	}
	public static List<MobileSoundFeatures> getMobileSoundFeatures(MobilePhones phones,long phoneId) throws Exception{
		try{
			MobilePhoneMultipleFeatureDao multipleFeature = DAOFactory.getInstance().getMultipleFeatureDao();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			//session.beginTransaction();
			List<MobileSoundFeatures> mobileSoundFeatures = multipleFeature.getMobileSoundFeatures(phones, session, phoneId);
			return mobileSoundFeatures;
		}catch(Exception e){
			throw new Exception(e);
		}
	}
	
	public static int persisteMobilePhones(MobilePhones phones) throws Exception{
		try{
			PersistenceDao persistenceDao = DAOFactory.getInstance().getPersistenceDao();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			
			int result = persistenceDao.persistMobilePhone(phones, session);
			return result;
		}catch(Exception e){
			throw new Exception(e);
		}
	}
	public static Object getId(Class<?> clss,String value) throws Exception{
		try{
			PersistenceDao persistenceDao = DAOFactory.getInstance().getPersistenceDao();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			
			return  persistenceDao.getId(clss, session, value);
			
		}catch(Exception e){
			throw new Exception(e);
		}
	}
	public static Object getIdByNameValue(Class<?> clss,String name , Object value ,boolean id) throws Exception{
		try{
			PersistenceDao persistenceDao = DAOFactory.getInstance().getPersistenceDao();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			return persistenceDao.getIdByNameValue(clss, session, name, value,id);
		}catch(Exception e){
			throw new Exception(e);
		}
		
				
	}
	public static Object getMobilePhoneId(Class<?> clss,String name , Object value ,boolean id) throws Exception{
		try{
			PersistenceDao persistenceDao = DAOFactory.getInstance().getPersistenceDao();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			return persistenceDao.getIdByNameValue(clss, session, name, value,id);
		}catch(Exception e){
			throw new Exception(e);
		}
		
				
	}
	public static void persistObject(String tablename,Object object) throws Exception{
		PersistenceDao persistenceDao = DAOFactory.getInstance().getPersistenceDao();
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		persistenceDao.persistObject(tablename, object, session);
		
	}
	
	public static void persistReviews(MobilePhoneReviews object) throws Exception{
		PersistenceDao persistenceDao = DAOFactory.getInstance().getPersistenceDao();
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		persistenceDao.persistReviews(object, session);
		session.getTransaction().commit();
		
	}
	
	public static void deleteObject(String tableName,String name,String value) throws Exception{
		try{
			PersistenceDao persistenceDao = DAOFactory.getInstance().getPersistenceDao();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			persistenceDao.deleteObject(session, tableName, name, value);
		}catch(Exception e){
			throw new Exception(e);
		}
	}
	public static List<MobileBrands> getAllMobileBrands(String catId) throws Exception{
		try{
			MobilePhoneMultipleFeatureDao multipleFeature = DAOFactory.getInstance().getMultipleFeatureDao();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
                        return multipleFeature.getMobileAllBrands(null,catId, session);
		}catch(Exception e){
			throw new Exception(e);
		}
	}
	
	public static List<MobilePhones> getAllMobilePhonesByBrands(MobilePhones phones,long brandId,int limit) throws Exception{
		try{
			MobilePhoneMultipleFeatureDao multipleFeature = DAOFactory.getInstance().getMultipleFeatureDao();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			return multipleFeature.getAllMobilePhoneByBrands(phones, session, brandId,limit);
		}catch(Exception e){
			throw new Exception(e);
		}
	}
	

	public static BigInteger getMobilePhonesCount(MobilePhones phones ,long brandId,int limit) throws Exception{
		try{
			MobilePhoneMultipleFeatureDao multipleFeature = DAOFactory.getInstance().getMultipleFeatureDao();
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			return multipleFeature.getMobilePhonesCount(phones, session, brandId, limit);
		}catch(Exception e){
			throw new Exception(e);
		}
	}
	
	@SuppressWarnings("unchecked")
	public static List<MobilePhones> getAllMobilePhonesByBrandsForPagination(MobilePhones phones,long brandId,int limit,int start,int end) throws Exception{
		try{
			
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			return session.createCriteria(MobilePhones.class).add(Restrictions.eq("brandId", brandId)).setFirstResult(start).setMaxResults(limit).list();
		//	return session.createSQLQuery("select * from mobile_phones where brand_id = " + brandId + " limit " + limit + " offset " + start).addEntity(MobilePhones.class).list();
		}catch(Exception e){
			throw new Exception(e);
		}
	}
	
	
	public static List<MobilePhoneReviews> getMobilePhoneReviews(MobilePhones phones,long id) throws Exception{
		try{
			Session session = HibernateUtil.getSessionFactory().getCurrentSession();
			MobilePhoneMultipleFeatureDao multipleFeature = DAOFactory.getInstance().getMultipleFeatureDao();
			return multipleFeature.getMobilePhoneReviews(phones, session, id);
			
		}catch(Exception e){
			throw new Exception(e);
		}
	}
        
        
        public static List<Categories> getAllCategories(){
                try{
                    Session session = HibernateUtil.getSessionFactory().getCurrentSession();
                    CategoriesDao categoriesDao = new CategoriesDaoImpl();
                    
                    return categoriesDao.getAllCategories(session);
                }catch(Exception e){
                    LGR.error("some error occured while getting all categories",e);
                }
            return null;
                      
        }
	
	
}

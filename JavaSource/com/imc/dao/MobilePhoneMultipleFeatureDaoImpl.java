package com.imc.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

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

public class MobilePhoneMultipleFeatureDaoImpl implements MobilePhoneMultipleFeatureDao
{
	Logger LGR = Logger.getLogger(MobilePhoneMultipleFeatureDaoImpl.class);
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<MobileAlertTypes> getMobileAlertTypes(MobilePhones phone,Session session,long phoneId) throws Exception {
		try{
			phone = ((MobilePhones)session.get(MobilePhones.class, new Long(phoneId)));
			Set<MobileAlertTypes> set =  (Set<MobileAlertTypes>) phone.getMobilePhoneToAlertTypeses();
			Iterator<MobileAlertTypes> iterator = set.iterator();
			List<MobileAlertTypes> mobileAlertsType = new ArrayList<>();
			while(iterator.hasNext()){
				mobileAlertsType.add(((MobileAlertTypes)iterator.next()));
			}
			return mobileAlertsType;
			
		}catch(Exception ex){
			LGR.info("#DAOException# some error occured while getting mobile Alerts type");
			throw new Exception(ex);
		}
	}


	
	@Override
	public List<MobileBrowsers> getMobileBrowsers(MobilePhones phone,Session session, long phoneId) throws Exception {
		try{
			phone = ((MobilePhones)session.get(MobilePhones.class, new Long(phoneId)));
			Set<MobileBrowsers> set =  (Set<MobileBrowsers>) phone.getMobilePhoneToBrowserses();
			Iterator<MobileBrowsers> iterator = set.iterator();
			List<MobileBrowsers> mobileBrowsers = new ArrayList<>();
			while(iterator.hasNext()){
				mobileBrowsers.add(((MobileBrowsers)iterator.next()));
			}
			return mobileBrowsers;
		}catch(Exception ex){
			LGR.info("#DAOException# some error occured while getting mobile Browser");
			throw new Exception(ex);
		}

	}


	
	@Override
	public List<MobileCameraFeatures> getCameraFeatures(MobilePhones phone,Session session, long phoneId) throws Exception {
		try{
			phone = ((MobilePhones)session.get(MobilePhones.class, new Long(phoneId)));
			Set<MobileCameraFeatures> set =  (Set<MobileCameraFeatures>) phone.getMobilePhoneToCameraFeatureses();
			Iterator<MobileCameraFeatures> iterator = set.iterator();
			List<MobileCameraFeatures> mobileCameraFeatures = new ArrayList<>();
			while(iterator.hasNext()){
				mobileCameraFeatures.add(((MobileCameraFeatures)iterator.next()));
			}
			return mobileCameraFeatures;
		}catch(Exception ex){
			LGR.info("#DAOException# some error occured while getting mobile Browser");
			throw new Exception(ex);
		}
	}

	@Override
	public List<MobileCameraPrimary> getCameraPrimaries(MobilePhones phone,Session session, long phoneId) throws Exception {
		try{
			phone = ((MobilePhones)session.get(MobilePhones.class, new Long(phoneId)));
			Set<MobileCameraPrimary> set =  (Set<MobileCameraPrimary>) phone.getMobilePhoneToCameraPrimaries();
			Iterator<MobileCameraPrimary> iterator = set.iterator();
			List<MobileCameraPrimary> mobileCameraPrimaries = new ArrayList<>();
			while(iterator.hasNext()){
				mobileCameraPrimaries.add(((MobileCameraPrimary)iterator.next()));
			}
			return mobileCameraPrimaries;
		}catch(Exception ex){
			LGR.info("#DAOException# some error occured while getting mobile Browser");
			throw new Exception(ex);
		}
	}

	
	@Override
	public List<MobileCameraSecondary> getCameraSecondaries(MobilePhones phone,Session session, long phoneId) throws Exception {
		try{
			phone = ((MobilePhones)session.get(MobilePhones.class, new Long(phoneId)));
			Set<MobileCameraSecondary> set =  (Set<MobileCameraSecondary>) phone.getMobilePhoneToCameraSecondaries();
			Iterator<MobileCameraSecondary> iterator = set.iterator();
			List<MobileCameraSecondary> mobileCameraSecondaries = new ArrayList<>();
			while(iterator.hasNext()){
				mobileCameraSecondaries.add(((MobileCameraSecondary)iterator.next()));
			}
			return mobileCameraSecondaries;
		}catch(Exception ex){
			LGR.info("#DAOException# some error occured while getting mobile Browser");
			throw new Exception(ex);
		}
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<MobileCameraVideo> getCameraVideos(MobilePhones phone,Session session, long phoneId) throws Exception {
		try{
			phone = ((MobilePhones)session.get(MobilePhones.class, new Long(phoneId)));
			Set<MobileCameraVideo> set =  (Set<MobileCameraVideo>) phone.getMobilePhoneToCameraVideos();
			Iterator<MobileCameraVideo> iterator = set.iterator();
			List<MobileCameraVideo> mobileCameraVideos = new ArrayList<>();
			while(iterator.hasNext()){
				mobileCameraVideos.add(((MobileCameraVideo)iterator.next()));
			}
			return mobileCameraVideos;
		}catch(Exception ex){
			LGR.info("#DAOException# some error occured while getting mobile Browser");
			throw new Exception(ex);
		}
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<MobileColors> getMobileColors(MobilePhones phone,Session session, long phoneId) throws Exception {
		try{
			phone = ((MobilePhones)session.get(MobilePhones.class, new Long(phoneId)));
			Set<MobileColors> set =  (Set<MobileColors>) phone.getMobilePhoneToColorses();
			Iterator<MobileColors> iterator = set.iterator();
			List<MobileColors> mobileColors = new ArrayList<>();
			while(iterator.hasNext()){
				mobileColors.add(((MobileColors)iterator.next()));
			}
			return mobileColors;
		}catch(Exception ex){
			LGR.info("#DAOException# some error occured while getting mobile Browser");
			throw new Exception(ex);
		}
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<MobileDataSpeeds> getMobileDataSpeeds(MobilePhones phone,Session session, long phoneId) throws Exception {
		try{
			phone = ((MobilePhones)session.get(MobilePhones.class, new Long(phoneId)));
			Set<MobileDataSpeeds> set =  (Set<MobileDataSpeeds>) phone.getMobilePhoneToColorses();
			Iterator<MobileDataSpeeds> iterator = set.iterator();
			List<MobileDataSpeeds> mobileDataSpeeds = new ArrayList<>();
			while(iterator.hasNext()){
				mobileDataSpeeds.add(((MobileDataSpeeds)iterator.next()));
			}
			return mobileDataSpeeds;
		}catch(Exception ex){
			LGR.info("#DAOException# some error occured while getting mobile Browser");
			throw new Exception(ex);
		}
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<MobileDisplayTypes> getDisplayTypes(MobilePhones phone,Session session, long phoneId) throws Exception {
		try{
			phone = ((MobilePhones)session.get(MobilePhones.class, new Long(phoneId)));
			Set<MobileDisplayTypes> set =  (Set<MobileDisplayTypes>) phone.getMobilePhoneToDisplayTypeses();
			Iterator<MobileDisplayTypes> iterator = set.iterator();
			List<MobileDisplayTypes> mobileDisplayTypes = new ArrayList<>();
			while(iterator.hasNext()){
				mobileDisplayTypes.add(((MobileDisplayTypes)iterator.next()));
			}
			return mobileDisplayTypes;
		}catch(Exception ex){
			LGR.info("#DAOException# some error occured while getting mobile Browser");
			throw new Exception(ex);
		}
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<MobileFeatures> getMobileFeatures(MobilePhones phone,Session session, long phoneId) throws Exception {
		try{
			phone = ((MobilePhones)session.get(MobilePhones.class, new Long(phoneId)));
			Set<MobileFeatures> set =  (Set<MobileFeatures>) phone.getMobilePhoneToFeatureses();
			Iterator<MobileFeatures> iterator = set.iterator();
			List<MobileFeatures> mobileFeatures = new ArrayList<>();
			while(iterator.hasNext()){
				mobileFeatures.add(((MobileFeatures)iterator.next()));
			}
			return mobileFeatures;
		}catch(Exception ex){
			LGR.info("#DAOException# some error occured while getting mobile Browser");
			throw new Exception(ex);
		}
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<MobileGames> getMobileGames(MobilePhones phone,Session session, long phoneId) throws Exception {
		try{
			phone = ((MobilePhones)session.get(MobilePhones.class, new Long(phoneId)));
			Set<MobileGames> set =  (Set<MobileGames>) phone.getMobilePhoneToGameses();
			Iterator<MobileGames> iterator = set.iterator();
			List<MobileGames> mobileGames = new ArrayList<>();
			while(iterator.hasNext()){
				mobileGames.add(((MobileGames)iterator.next()));
			}
			return mobileGames;
		}catch(Exception ex){
			LGR.info("#DAOException# some error occured while getting mobile games");
			throw new Exception(ex);
		}
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<MobileJava> getMobileJavas(MobilePhones phone, Session session,long phoneId) throws Exception {
		try{
			phone = ((MobilePhones)session.get(MobilePhones.class, new Long(phoneId)));
			Set<MobileJava> set =  (Set<MobileJava>) phone.getMobilePhoneToGameses();
			Iterator<MobileJava> iterator = set.iterator();
			List<MobileJava> mobileGames = new ArrayList<>();
			while(iterator.hasNext()){
				mobileGames.add(((MobileJava)iterator.next()));
			}
			return mobileGames;
		}catch(Exception ex){
			LGR.info("#DAOException# some error occured while getting mobile games");
			throw new Exception(ex);
		}
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<MobileMemory> getMobileMemories(MobilePhones phone,Session session, long phoneId) throws Exception {
		try{
			phone = ((MobilePhones)session.get(MobilePhones.class, new Long(phoneId)));
			Set<MobileMemory> set =  (Set<MobileMemory>) phone.getMobilePhoneToMemories();
			Iterator<MobileMemory> iterator = set.iterator();
			List<MobileMemory> mobileMemories = new ArrayList<>();
			while(iterator.hasNext()){
				mobileMemories.add(((MobileMemory)iterator.next()));
			}
			return mobileMemories;
		}catch(Exception ex){
			LGR.info("#DAOException# some error occured while getting mobile games");
			throw new Exception(ex);
		}
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<MobileMemoryCardslots> getMobileMemoryCardslots(MobilePhones phone, Session session, long phoneId) throws Exception {
		try{
			phone = ((MobilePhones)session.get(MobilePhones.class, new Long(phoneId)));
			Set<MobileMemoryCardslots> set =  (Set<MobileMemoryCardslots>) phone.getMobilePhoneToMemoryCardslotses();
			Iterator<MobileMemoryCardslots> iterator = set.iterator();
			List<MobileMemoryCardslots> mobileMemoryCardslots = new ArrayList<>();
			while(iterator.hasNext()){
				mobileMemoryCardslots.add(((MobileMemoryCardslots)iterator.next()));
			}
			return mobileMemoryCardslots;
		}catch(Exception ex){
			LGR.info("#DAOException# some error occured while getting mobile games");
			throw new Exception(ex);
		}
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<MobileMessaging> getMobileMessagings(MobilePhones phone,Session session, long phoneId) throws Exception {
		try{
			phone = ((MobilePhones)session.get(MobilePhones.class, new Long(phoneId)));
			Set<MobileMessaging> set =  (Set<MobileMessaging>) phone.getMobilePhoneToMessagings();
			Iterator<MobileMessaging> iterator = set.iterator();
			List<MobileMessaging> mobileMessagings = new ArrayList<>();
			while(iterator.hasNext()){
				mobileMessagings.add(((MobileMessaging)iterator.next()));
			}
			return mobileMessagings;
		}catch(Exception ex){
			LGR.info("#DAOException# some error occured while getting mobile games");
			throw new Exception(ex);
		}
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<MobileNetworks> getMobileNetworks(MobilePhones phone,Session session, long phoneId) throws Exception {
		try{
			phone = ((MobilePhones)session.get(MobilePhones.class, new Long(phoneId)));
			Set<MobileNetworks> set =  (Set<MobileNetworks>) phone.getMobilePhoneToNetworkses();
			Iterator<MobileNetworks> iterator = set.iterator();
			List<MobileNetworks> mobileNetworks = new ArrayList<>();
			while(iterator.hasNext()){
				mobileNetworks.add(((MobileNetworks)iterator.next()));
			}
			return mobileNetworks;
		}catch(Exception ex){
			LGR.info("#DAOException# some error occured while getting mobile networks");
			throw new Exception(ex);
		}
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<MobileNfc> getMobileNfcs(MobilePhones phone, Session session,long phoneId) throws Exception {
		try{
			phone = ((MobilePhones)session.get(MobilePhones.class, new Long(phoneId)));
			Set<MobileNfc> set =  (Set<MobileNfc>) phone.getMobilePhoneToNfcs();
			Iterator<MobileNfc> iterator = set.iterator();
			List<MobileNfc> mobileNfcs= new ArrayList<>();
			while(iterator.hasNext()){
				mobileNfcs.add(((MobileNfc)iterator.next()));
			}
			return mobileNfcs;
		}catch(Exception ex){
			LGR.info("#DAOException# some error occured while getting mobile networks");
			throw new Exception(ex);
		}
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<MobileDisplayProtection> getDisplayProtections(MobilePhones phone, Session session, long phoneId) throws Exception {
		try{
			phone = ((MobilePhones)session.get(MobilePhones.class, new Long(phoneId)));
			Set<MobileDisplayProtection> set =  (Set<MobileDisplayProtection>) phone.getMobilePhoneToProtectionses();
			Iterator<MobileDisplayProtection> iterator = set.iterator();
			List<MobileDisplayProtection> mobileDisplayProtections= new ArrayList<>();
			while(iterator.hasNext()){
				mobileDisplayProtections.add(((MobileDisplayProtection)iterator.next()));
			}
			return mobileDisplayProtections;
		}catch(Exception ex){
			LGR.info("#DAOException# some error occured while getting mobile networks");
			throw new Exception(ex);
		}
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<MobileRadio> getMobileRadios(MobilePhones phone,Session session, long phoneId) throws Exception {
		try{
			phone = ((MobilePhones)session.get(MobilePhones.class, new Long(phoneId)));
			Set<MobileRadio> set =  (Set<MobileRadio>) phone.getMobilePhoneToRadios();
			Iterator<MobileRadio> iterator = set.iterator();
			List<MobileRadio> mobileRadios= new ArrayList<>();
			while(iterator.hasNext()){
				mobileRadios.add(((MobileRadio)iterator.next()));
			}
			return mobileRadios;
		}catch(Exception ex){
			LGR.info("#DAOException# some error occured while getting mobile networks");
			throw new Exception(ex);
		}
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<MobileSensors> getMobileSensors(MobilePhones phone,Session session, long phoneId) throws Exception {
		try{
			phone = ((MobilePhones)session.get(MobilePhones.class, new Long(phoneId)));
			Set<MobileSensors> set =  (Set<MobileSensors>) phone.getMobilePhoneToSensorses();
			Iterator<MobileSensors> iterator = set.iterator();
			List<MobileSensors> mobileSensors = new ArrayList<>();
			while(iterator.hasNext()){
				mobileSensors.add(((MobileSensors)iterator.next()));
			}
			return mobileSensors;
		}catch(Exception ex){
			LGR.info("#DAOException# some error occured while getting mobile networks");
			throw new Exception(ex);
		}
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<MobileSoundFeatures> getMobileSoundFeatures(MobilePhones phone,Session session, long phoneId) throws Exception {
		try{
			phone = ((MobilePhones)session.get(MobilePhones.class, new Long(phoneId)));
			Set<MobileSoundFeatures> set =  (Set<MobileSoundFeatures>) phone.getMobilePhoneToSoundFeatureses();
			Iterator<MobileSoundFeatures> iterator = set.iterator();
			List<MobileSoundFeatures> mobileSoundFeatures = new ArrayList<>();
			while(iterator.hasNext()){
				mobileSoundFeatures.add(((MobileSoundFeatures)iterator.next()));
			}
			return mobileSoundFeatures;
		}catch(Exception ex){
			LGR.info("#DAOException# some error occured while getting mobile networks");
			throw new Exception(ex);
		}
	}
	
	@SuppressWarnings("unchecked")
	
	public List<MobileBrands> getMobileAllBrands(MobileBrands brands,String catId,Session session) throws Exception {
		try{
			//return session.createCriteria(MobileBrands.class).add(Restrictions.eq("", catId)).list();
			return session.createSQLQuery("SELECT mb.id , mb.title , mb.slug , mb.is_active , mb.is_deleted , mb.cat_id, cat.id , cat.title, cat.parent_id , cat.slug ,cat.is_active , cat.is_deleted FROM mobilephones.mobile_brands mb LEFT OUTER JOIN categories cat ON mb.cat_id=cat.id\n" +
                                                " where mb.cat_id = '" + catId+"'").addEntity(MobileBrands.class).list();
		}catch(Exception ex){
			LGR.info("#DAOException# some error occured while getting mobile networks");
			throw new Exception(ex);
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<MobilePhones> getAllMobilePhoneByBrands(MobilePhones phones ,Session session, long brandId,int limit) throws Exception{
		try{
			Criteria criteria = session.createCriteria(MobilePhones.class).setMaxResults(limit);
			List<MobilePhones> moiblePhones = criteria.add(Restrictions.eq("brandId", brandId)).list();
			return moiblePhones;
		}catch(Exception e){
			LGR.info("#DAOException# some error occured while getting all mobile phone by brandId");
			throw new Exception(e);
		}
	}
	
	
	public  BigInteger getMobilePhonesCount(MobilePhones phones ,Session session ,long brandId,int limit) throws Exception{
		try{
			BigInteger count = (BigInteger) session.createSQLQuery("select count(*) as count from mobile_phones where brand_id = "+brandId).list().get(0);
			return count;
		}catch(Exception e){
			LGR.info("#DAOException# some error occured while getting all mobile phone count");
			throw new Exception(e);
		}
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<MobilePhoneReviews> getMobilePhoneReviews(MobilePhones phones,Session session, long id)throws Exception {
		try{
			List<MobilePhoneReviews> mobilePhoneReviews = session.createSQLQuery("select * from mobile_phones_reviews " +
					"where phone_id = "+id +" order by created_at desc").addEntity(MobilePhoneReviews.class).list();
			return mobilePhoneReviews;
		}catch(Exception e){
			LGR.info("#DAOException# some error occured while getting mobile phone reviews");
			throw new Exception(e);
		}
	}
	

}

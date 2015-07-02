package com.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.entity.TCcDimensionMappingDetail;

/**
 * A data access object (DAO) providing persistence and search support for
 * TCcDimensionMappingDetail entities. Transaction control of the save(),
 * update() and delete() operations can directly support Spring
 * container-managed transactions or they can be augmented to handle
 * user-managed Spring transactions. Each of these methods provides additional
 * information for how to configure it for the desired type of transaction
 * control.
 * 
 * @see com.dao.TCcDimensionMappingDetail
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class TCcDimensionMappingDetailDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TCcDimensionMappingDetailDAO.class);
	// property constants
	public static final String DIMENSIONMEMBER_MAPPINGID = "dimensionmemberMappingid";
	public static final String MEMBERID = "memberid";
	public static final String DIMENSIONMEMBERFORMULA = "dimensionmemberformula";
	public static final String DEFAULTMEMBERID = "defaultmemberid";

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	private Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	protected void initDao() {
		// do nothing
	}

	public void save(TCcDimensionMappingDetail transientInstance) {
		log.debug("saving TCcDimensionMappingDetail instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TCcDimensionMappingDetail persistentInstance) {
		log.debug("deleting TCcDimensionMappingDetail instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TCcDimensionMappingDetail findById(java.lang.Long id) {
		log.debug("getting TCcDimensionMappingDetail instance with id: " + id);
		try {
			TCcDimensionMappingDetail instance = (TCcDimensionMappingDetail) getCurrentSession()
					.get("com.dao.TCcDimensionMappingDetail", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TCcDimensionMappingDetail instance) {
		log.debug("finding TCcDimensionMappingDetail instance by example");
		try {
			List results = getCurrentSession()
					.createCriteria("com.dao.TCcDimensionMappingDetail")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding TCcDimensionMappingDetail instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TCcDimensionMappingDetail as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDimensionmemberMappingid(Object dimensionmemberMappingid) {
		return findByProperty(DIMENSIONMEMBER_MAPPINGID,
				dimensionmemberMappingid);
	}

	public List findByMemberid(Object memberid) {
		return findByProperty(MEMBERID, memberid);
	}

	public List findByDimensionmemberformula(Object dimensionmemberformula) {
		return findByProperty(DIMENSIONMEMBERFORMULA, dimensionmemberformula);
	}

	public List findByDefaultmemberid(Object defaultmemberid) {
		return findByProperty(DEFAULTMEMBERID, defaultmemberid);
	}

	public List findAll() {
		log.debug("finding all TCcDimensionMappingDetail instances");
		try {
			String queryString = "from TCcDimensionMappingDetail";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TCcDimensionMappingDetail merge(
			TCcDimensionMappingDetail detachedInstance) {
		log.debug("merging TCcDimensionMappingDetail instance");
		try {
			TCcDimensionMappingDetail result = (TCcDimensionMappingDetail) getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TCcDimensionMappingDetail instance) {
		log.debug("attaching dirty TCcDimensionMappingDetail instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TCcDimensionMappingDetail instance) {
		log.debug("attaching clean TCcDimensionMappingDetail instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TCcDimensionMappingDetailDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TCcDimensionMappingDetailDAO) ctx
				.getBean("TCcDimensionMappingDetailDAO");
	}
}
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

import com.entity.TCcDimensionMapping;

/**
 * A data access object (DAO) providing persistence and search support for
 * TCcDimensionMapping entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.dao.TCcDimensionMapping
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class TCcDimensionMappingDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TCcDimensionMappingDAO.class);
	// property constants
	public static final String OBJECTID = "objectid";
	public static final String OBJECTID_MAPPING = "objectidMapping";

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

	public void save(TCcDimensionMapping transientInstance) {
		log.debug("saving TCcDimensionMapping instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TCcDimensionMapping persistentInstance) {
		log.debug("deleting TCcDimensionMapping instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TCcDimensionMapping findById(java.lang.Long id) {
		log.debug("getting TCcDimensionMapping instance with id: " + id);
		try {
			TCcDimensionMapping instance = (TCcDimensionMapping) getCurrentSession()
					.get("com.dao.TCcDimensionMapping", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TCcDimensionMapping instance) {
		log.debug("finding TCcDimensionMapping instance by example");
		try {
			List results = getCurrentSession()
					.createCriteria("com.dao.TCcDimensionMapping")
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
		log.debug("finding TCcDimensionMapping instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TCcDimensionMapping as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByObjectid(Object objectid) {
		return findByProperty(OBJECTID, objectid);
	}

	public List findByObjectidMapping(Object objectidMapping) {
		return findByProperty(OBJECTID_MAPPING, objectidMapping);
	}

	public List findAll() {
		log.debug("finding all TCcDimensionMapping instances");
		try {
			String queryString = "from TCcDimensionMapping";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TCcDimensionMapping merge(TCcDimensionMapping detachedInstance) {
		log.debug("merging TCcDimensionMapping instance");
		try {
			TCcDimensionMapping result = (TCcDimensionMapping) getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TCcDimensionMapping instance) {
		log.debug("attaching dirty TCcDimensionMapping instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TCcDimensionMapping instance) {
		log.debug("attaching clean TCcDimensionMapping instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TCcDimensionMappingDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TCcDimensionMappingDAO) ctx.getBean("TCcDimensionMappingDAO");
	}
}
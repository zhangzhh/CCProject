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

import com.entity.TCcDimSuppliers;

/**
 * A data access object (DAO) providing persistence and search support for
 * TCcDimSuppliers entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.dao.TCcDimSuppliers
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class TCcDimSuppliersDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TCcDimSuppliersDAO.class);
	// property constants
	public static final String BANKACCOUNTID = "bankaccountid";
	public static final String ORGID = "orgid";

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

	public void save(TCcDimSuppliers transientInstance) {
		log.debug("saving TCcDimSuppliers instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TCcDimSuppliers persistentInstance) {
		log.debug("deleting TCcDimSuppliers instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TCcDimSuppliers findById(java.lang.Long id) {
		log.debug("getting TCcDimSuppliers instance with id: " + id);
		try {
			TCcDimSuppliers instance = (TCcDimSuppliers) getCurrentSession()
					.get("com.dao.TCcDimSuppliers", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TCcDimSuppliers instance) {
		log.debug("finding TCcDimSuppliers instance by example");
		try {
			List results = getCurrentSession()
					.createCriteria("com.dao.TCcDimSuppliers")
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
		log.debug("finding TCcDimSuppliers instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TCcDimSuppliers as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByBankaccountid(Object bankaccountid) {
		return findByProperty(BANKACCOUNTID, bankaccountid);
	}

	public List findByOrgid(Object orgid) {
		return findByProperty(ORGID, orgid);
	}

	public List findAll() {
		log.debug("finding all TCcDimSuppliers instances");
		try {
			String queryString = "from TCcDimSuppliers";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TCcDimSuppliers merge(TCcDimSuppliers detachedInstance) {
		log.debug("merging TCcDimSuppliers instance");
		try {
			TCcDimSuppliers result = (TCcDimSuppliers) getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TCcDimSuppliers instance) {
		log.debug("attaching dirty TCcDimSuppliers instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TCcDimSuppliers instance) {
		log.debug("attaching clean TCcDimSuppliers instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TCcDimSuppliersDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TCcDimSuppliersDAO) ctx.getBean("TCcDimSuppliersDAO");
	}
}
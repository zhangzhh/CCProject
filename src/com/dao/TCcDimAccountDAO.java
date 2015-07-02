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

import com.entity.TCcDimAccount;

/**
 * A data access object (DAO) providing persistence and search support for
 * TCcDimAccount entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.dao.TCcDimAccount
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class TCcDimAccountDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TCcDimAccountDAO.class);
	// property constants
	public static final String HASDETAIL = "hasdetail";
	public static final String HASMULTICURRENCY = "hasmulticurrency";
	public static final String ACCOUNTPERCENT = "accountpercent";
	public static final String EXPENSEID = "expenseid";
	public static final String OBJECTALIAS = "objectalias";
	public static final String OBJECTALIASVALUE = "objectaliasvalue";

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

	public void save(TCcDimAccount transientInstance) {
		log.debug("saving TCcDimAccount instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TCcDimAccount persistentInstance) {
		log.debug("deleting TCcDimAccount instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TCcDimAccount findById(java.lang.Long id) {
		log.debug("getting TCcDimAccount instance with id: " + id);
		try {
			TCcDimAccount instance = (TCcDimAccount) getCurrentSession().get(
					"com.dao.TCcDimAccount", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TCcDimAccount instance) {
		log.debug("finding TCcDimAccount instance by example");
		try {
			List results = getCurrentSession()
					.createCriteria("com.dao.TCcDimAccount")
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
		log.debug("finding TCcDimAccount instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TCcDimAccount as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByHasdetail(Object hasdetail) {
		return findByProperty(HASDETAIL, hasdetail);
	}

	public List findByHasmulticurrency(Object hasmulticurrency) {
		return findByProperty(HASMULTICURRENCY, hasmulticurrency);
	}

	public List findByAccountpercent(Object accountpercent) {
		return findByProperty(ACCOUNTPERCENT, accountpercent);
	}

	public List findByExpenseid(Object expenseid) {
		return findByProperty(EXPENSEID, expenseid);
	}

	public List findByObjectalias(Object objectalias) {
		return findByProperty(OBJECTALIAS, objectalias);
	}

	public List findByObjectaliasvalue(Object objectaliasvalue) {
		return findByProperty(OBJECTALIASVALUE, objectaliasvalue);
	}

	public List findAll() {
		log.debug("finding all TCcDimAccount instances");
		try {
			String queryString = "from TCcDimAccount";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TCcDimAccount merge(TCcDimAccount detachedInstance) {
		log.debug("merging TCcDimAccount instance");
		try {
			TCcDimAccount result = (TCcDimAccount) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TCcDimAccount instance) {
		log.debug("attaching dirty TCcDimAccount instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TCcDimAccount instance) {
		log.debug("attaching clean TCcDimAccount instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TCcDimAccountDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TCcDimAccountDAO) ctx.getBean("TCcDimAccountDAO");
	}
}
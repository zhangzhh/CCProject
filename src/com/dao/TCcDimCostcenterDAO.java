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

import com.entity.TCcDimCostcenter;

/**
 * A data access object (DAO) providing persistence and search support for
 * TCcDimCostcenter entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.dao.TCcDimCostcenter
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class TCcDimCostcenterDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TCcDimCostcenterDAO.class);
	// property constants
	public static final String KOKRS = "kokrs";
	public static final String KOSTL = "kostl";
	public static final String DATAB = "datab";
	public static final String DATBI = "datbi";
	public static final String KTEXT = "ktext";
	public static final String LTEXT = "ltext";
	public static final String VERAK = "verak";
	public static final String KOSAR = "kosar";
	public static final String KHINR = "khinr";
	public static final String BUKRS = "bukrs";
	public static final String DEL_FLAG = "delFlag";
	public static final String PRCTR = "prctr";

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

	public void save(TCcDimCostcenter transientInstance) {
		log.debug("saving TCcDimCostcenter instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TCcDimCostcenter persistentInstance) {
		log.debug("deleting TCcDimCostcenter instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TCcDimCostcenter findById(java.lang.String id) {
		log.debug("getting TCcDimCostcenter instance with id: " + id);
		try {
			TCcDimCostcenter instance = (TCcDimCostcenter) getCurrentSession()
					.get("com.dao.TCcDimCostcenter", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TCcDimCostcenter instance) {
		log.debug("finding TCcDimCostcenter instance by example");
		try {
			List results = getCurrentSession()
					.createCriteria("com.dao.TCcDimCostcenter")
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
		log.debug("finding TCcDimCostcenter instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from TCcDimCostcenter as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByKokrs(Object kokrs) {
		return findByProperty(KOKRS, kokrs);
	}

	public List findByKostl(Object kostl) {
		return findByProperty(KOSTL, kostl);
	}

	public List findByDatab(Object datab) {
		return findByProperty(DATAB, datab);
	}

	public List findByDatbi(Object datbi) {
		return findByProperty(DATBI, datbi);
	}

	public List findByKtext(Object ktext) {
		return findByProperty(KTEXT, ktext);
	}

	public List findByLtext(Object ltext) {
		return findByProperty(LTEXT, ltext);
	}

	public List findByVerak(Object verak) {
		return findByProperty(VERAK, verak);
	}

	public List findByKosar(Object kosar) {
		return findByProperty(KOSAR, kosar);
	}

	public List findByKhinr(Object khinr) {
		return findByProperty(KHINR, khinr);
	}

	public List findByBukrs(Object bukrs) {
		return findByProperty(BUKRS, bukrs);
	}

	public List findByDelFlag(Object delFlag) {
		return findByProperty(DEL_FLAG, delFlag);
	}

	public List findByPrctr(Object prctr) {
		return findByProperty(PRCTR, prctr);
	}

	public List findAll() {
		log.debug("finding all TCcDimCostcenter instances");
		try {
			String queryString = "from TCcDimCostcenter";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TCcDimCostcenter merge(TCcDimCostcenter detachedInstance) {
		log.debug("merging TCcDimCostcenter instance");
		try {
			TCcDimCostcenter result = (TCcDimCostcenter) getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TCcDimCostcenter instance) {
		log.debug("attaching dirty TCcDimCostcenter instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TCcDimCostcenter instance) {
		log.debug("attaching clean TCcDimCostcenter instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TCcDimCostcenterDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (TCcDimCostcenterDAO) ctx.getBean("TCcDimCostcenterDAO");
	}
}
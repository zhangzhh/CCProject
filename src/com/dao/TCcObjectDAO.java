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

import com.entity.TCcObject;

/**
 * A data access object (DAO) providing persistence and search support for
 * TCcObject entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.dao.TCcObject
 * @author MyEclipse Persistence Tools
 */
@Transactional
public class TCcObjectDAO {
	private static final Logger log = LoggerFactory
			.getLogger(TCcObjectDAO.class);
	// property constants
	public static final String OBJECTTYPEID = "objecttypeid";
	public static final String TOTALCODE = "totalcode";
	public static final String ENABLED = "enabled";
	public static final String OBJECTCODE = "objectcode";
	public static final String OBJECTNAME = "objectname";
	public static final String DESCRIPTION = "description";
	public static final String PARENTID = "parentid";
	public static final String HASCHILDREN = "haschildren";

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

	public void save(TCcObject transientInstance) {
		log.debug("saving TCcObject instance");
		try {
			getCurrentSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(TCcObject persistentInstance) {
		log.debug("deleting TCcObject instance");
		try {
			getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public TCcObject findById(java.lang.Long id) {
		log.debug("getting TCcObject instance with id: " + id);
		try {
			TCcObject instance = (TCcObject) getCurrentSession().get(
					"com.dao.TCcObject", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(TCcObject instance) {
		log.debug("finding TCcObject instance by example");
		try {
			List results = getCurrentSession()
					.createCriteria("com.dao.TCcObject")
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
		log.debug("finding TCcObject instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from TCcObject as model where model."
					+ propertyName + "= ?";
			Query queryObject = getCurrentSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByObjecttypeid(Object objecttypeid) {
		return findByProperty(OBJECTTYPEID, objecttypeid);
	}

	public List findByTotalcode(Object totalcode) {
		return findByProperty(TOTALCODE, totalcode);
	}

	public List findByEnabled(Object enabled) {
		return findByProperty(ENABLED, enabled);
	}

	public List findByObjectcode(Object objectcode) {
		return findByProperty(OBJECTCODE, objectcode);
	}

	public List findByObjectname(Object objectname) {
		return findByProperty(OBJECTNAME, objectname);
	}

	public List findByDescription(Object description) {
		return findByProperty(DESCRIPTION, description);
	}

	public List findByParentid(Object parentid) {
		return findByProperty(PARENTID, parentid);
	}

	public List findByHaschildren(Object haschildren) {
		return findByProperty(HASCHILDREN, haschildren);
	}

	public List findAll() {
		log.debug("finding all TCcObject instances");
		try {
			String queryString = "from TCcObject";
			Query queryObject = getCurrentSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public TCcObject merge(TCcObject detachedInstance) {
		log.debug("merging TCcObject instance");
		try {
			TCcObject result = (TCcObject) getCurrentSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(TCcObject instance) {
		log.debug("attaching dirty TCcObject instance");
		try {
			getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(TCcObject instance) {
		log.debug("attaching clean TCcObject instance");
		try {
			getCurrentSession().buildLockRequest(LockOptions.NONE).lock(
					instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static TCcObjectDAO getFromApplicationContext(ApplicationContext ctx) {
		return (TCcObjectDAO) ctx.getBean("TCcObjectDAO");
	}
}
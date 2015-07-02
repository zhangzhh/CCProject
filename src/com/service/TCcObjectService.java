/**
 * 
 */
package com.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.TCcObjectDAO;
import com.entity.TCcObject;

/**
 * @author zhihui
 *
 */
public class TCcObjectService {

	@Autowired
	private TCcObjectDAO objectDAO;
	
	public TCcObject getTCcObjectById(Long id)
	{
		return objectDAO.findById(id);
	}

}

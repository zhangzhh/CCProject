/**
 * 
 */
package com.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.entity.TCcObject;
import com.service.TCcObjectService;

/**
 * @author zhihui
 *
 */
public class TCcObjectAction {

	@Autowired
	private TCcObjectService objectService;
	
	public TCcObject getTCcObjectById(Long id)
	{
		return objectService.getTCcObjectById(id);
	}
}

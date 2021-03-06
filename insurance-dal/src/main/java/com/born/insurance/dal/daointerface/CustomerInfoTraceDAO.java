/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.daointerface;

// auto generated imports
import com.born.insurance.dal.dataobject.CustomerInfoTraceDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>customer_info_trace</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/customer_info_trace.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface CustomerInfoTraceDAO {
	/**
	 *  Insert one <tt>CustomerInfoTraceDO</tt> object to DB table <tt>customer_info_trace</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into customer_info_trace(id,customer_user_id,customer_user_name,remark,creator_id,creator_name,raw_add_time) values (?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param customerInfoTrace
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(CustomerInfoTraceDO customerInfoTrace) throws DataAccessException;

	/**
	 *  Update DB table <tt>customer_info_trace</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update customer_info_trace set customer_user_id=?, customer_user_name=?, remark=?, creator_id=?, creator_name=? where (id = ?)</tt>
	 *
	 *	@param customerInfoTrace
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(CustomerInfoTraceDO customerInfoTrace) throws DataAccessException;

	/**
	 *  Query DB table <tt>customer_info_trace</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, customer_user_id, customer_user_name, remark, creator_id, creator_name, raw_add_time, raw_update_time from customer_info_trace where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return CustomerInfoTraceDO
	 *	@throws DataAccessException
	 */	 
    public CustomerInfoTraceDO findById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>customer_info_trace</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from customer_info_trace where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Query DB table <tt>customer_info_trace</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, customer_user_id, customer_user_name, remark, creator_id, creator_name, raw_add_time, raw_update_time from customer_info_trace where (1 = 1)</tt>
	 *
	 *	@param customerInfoTrace
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<CustomerInfoTraceDO>
	 *	@throws DataAccessException
	 */	 
    public List<CustomerInfoTraceDO> findByCondition(CustomerInfoTraceDO customerInfoTrace, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>customer_info_trace</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from customer_info_trace where (1 = 1)</tt>
	 *
	 *	@param customerInfoTrace
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(CustomerInfoTraceDO customerInfoTrace) throws DataAccessException;

}
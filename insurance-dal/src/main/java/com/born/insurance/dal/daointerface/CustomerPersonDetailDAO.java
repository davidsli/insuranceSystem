/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.daointerface;

// auto generated imports
import com.born.insurance.dal.dataobject.CustomerPersonDetailDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>customer_person_detail</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/customer_person_detail.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface CustomerPersonDetailDAO {
	/**
	 *  Insert one <tt>CustomerPersonDetailDO</tt> object to DB table <tt>customer_person_detail</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into customer_person_detail(customer_id,sex,customer_name,org_id,nation,birthDay,marital_status,company,dept,job) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param customerPersonDetail
	 *	@return String
	 *	@throws DataAccessException
	 */	 
    public String insert(CustomerPersonDetailDO customerPersonDetail) throws DataAccessException;

	/**
	 *  Update DB table <tt>customer_person_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update customer_person_detail set sex=?, customer_name=?, org_id=?, nation=?, birthDay=?, marital_status=?, company=?, dept=?, job=? where (customer_id = ?)</tt>
	 *
	 *	@param customerPersonDetail
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(CustomerPersonDetailDO customerPersonDetail) throws DataAccessException;

	/**
	 *  Query DB table <tt>customer_person_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select customer_id, sex, customer_name, org_id, nation, birthDay, marital_status, company, dept, job from customer_person_detail where (customer_id = ?)</tt>
	 *
	 *	@param customerId
	 *	@return CustomerPersonDetailDO
	 *	@throws DataAccessException
	 */	 
    public CustomerPersonDetailDO findById(String customerId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>customer_person_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from customer_person_detail where (customer_id = ?)</tt>
	 *
	 *	@param customerId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(String customerId) throws DataAccessException;

	/**
	 *  Query DB table <tt>customer_person_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select customer_id, sex, customer_name, org_id, nation, birthDay, marital_status, company, dept, job from customer_person_detail where (1 = 1)</tt>
	 *
	 *	@param customerPersonDetail
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<CustomerPersonDetailDO>
	 *	@throws DataAccessException
	 */	 
    public List<CustomerPersonDetailDO> findByCondition(CustomerPersonDetailDO customerPersonDetail, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>customer_person_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from customer_person_detail where (1 = 1)</tt>
	 *
	 *	@param customerPersonDetail
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(CustomerPersonDetailDO customerPersonDetail) throws DataAccessException;

}
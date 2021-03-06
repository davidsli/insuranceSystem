/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.daointerface;

// auto generated imports
import com.born.insurance.dal.dataobject.BusinessBillCoinsInfoDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>business_bill_coins_info</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/business_bill_coins_info.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface BusinessBillCoinsInfoDAO {
	/**
	 *  Insert one <tt>BusinessBillCoinsInfoDO</tt> object to DB table <tt>business_bill_coins_info</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into business_bill_coins_info(coins_info_id,insurace_company_id,insurace_company_name,chief,portion,premium_amount,broker_amount,out_amount,other_amount,business_bill_id) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param businessBillCoinsInfo
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(BusinessBillCoinsInfoDO businessBillCoinsInfo) throws DataAccessException;

	/**
	 *  Update DB table <tt>business_bill_coins_info</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update business_bill_coins_info set insurace_company_id=?, insurace_company_name=?, chief=?, portion=?, premium_amount=?, broker_amount=?, out_amount=?, other_amount=?, business_bill_id=? where (coins_info_id = ?)</tt>
	 *
	 *	@param businessBillCoinsInfo
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(BusinessBillCoinsInfoDO businessBillCoinsInfo) throws DataAccessException;

	/**
	 *  Query DB table <tt>business_bill_coins_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select coins_info_id, insurace_company_id, insurace_company_name, chief, portion, premium_amount, broker_amount, out_amount, other_amount, business_bill_id from business_bill_coins_info where (coins_info_id = ?)</tt>
	 *
	 *	@param coinsInfoId
	 *	@return BusinessBillCoinsInfoDO
	 *	@throws DataAccessException
	 */	 
    public BusinessBillCoinsInfoDO findById(long coinsInfoId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>business_bill_coins_info</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from business_bill_coins_info where (coins_info_id = ?)</tt>
	 *
	 *	@param coinsInfoId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long coinsInfoId) throws DataAccessException;

	/**
	 *  Query DB table <tt>business_bill_coins_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select coins_info_id, insurace_company_id, insurace_company_name, chief, portion, premium_amount, broker_amount, out_amount, other_amount, business_bill_id from business_bill_coins_info where (1 = 1)</tt>
	 *
	 *	@param businessBillCoinsInfo
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<BusinessBillCoinsInfoDO>
	 *	@throws DataAccessException
	 */	 
    public List<BusinessBillCoinsInfoDO> findByCondition(BusinessBillCoinsInfoDO businessBillCoinsInfo, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>business_bill_coins_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from business_bill_coins_info where (1 = 1)</tt>
	 *
	 *	@param businessBillCoinsInfo
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(BusinessBillCoinsInfoDO businessBillCoinsInfo) throws DataAccessException;

	/**
	 *  Query DB table <tt>business_bill_coins_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select coins_info_id, insurace_company_id, insurace_company_name, chief, portion, premium_amount, broker_amount, out_amount, other_amount, business_bill_id from business_bill_coins_info where (business_bill_id = ?)</tt>
	 *
	 *	@param businessBillId
	 *	@return List<BusinessBillCoinsInfoDO>
	 *	@throws DataAccessException
	 */	 
    public List<BusinessBillCoinsInfoDO> findBusinessBillCoinsInfo(long businessBillId) throws DataAccessException;

}
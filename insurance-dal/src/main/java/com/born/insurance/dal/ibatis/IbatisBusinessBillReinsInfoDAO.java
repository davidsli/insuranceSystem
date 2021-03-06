/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.insurance.dal.daointerface.BusinessBillReinsInfoDAO;


// auto generated imports
import com.born.insurance.dal.dataobject.BusinessBillReinsInfoDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.insurance.dal.daointerface.BusinessBillReinsInfoDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/business_bill_reins_info.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisBusinessBillReinsInfoDAO extends SqlMapClientDaoSupport implements BusinessBillReinsInfoDAO {
	/**
	 *  Insert one <tt>BusinessBillReinsInfoDO</tt> object to DB table <tt>business_bill_reins_info</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into business_bill_reins_info(reins_info_id,insurace_company_id,insurace_company_name,premium_amount,poundage_amount,business_bill_id) values (?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param businessBillReinsInfo
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(BusinessBillReinsInfoDO businessBillReinsInfo) throws DataAccessException {
    	if (businessBillReinsInfo == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-BUSINESS-BILL-REINS-INFO-INSERT", businessBillReinsInfo);

        return businessBillReinsInfo.getReinsInfoId();
    }

	/**
	 *  Update DB table <tt>business_bill_reins_info</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update business_bill_reins_info set insurace_company_id=?, insurace_company_name=?, premium_amount=?, poundage_amount=?, business_bill_id=? where (reins_info_id = ?)</tt>
	 *
	 *	@param businessBillReinsInfo
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(BusinessBillReinsInfoDO businessBillReinsInfo) throws DataAccessException {
    	if (businessBillReinsInfo == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-BUSINESS-BILL-REINS-INFO-UPDATE", businessBillReinsInfo);
    }

	/**
	 *  Query DB table <tt>business_bill_reins_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select reins_info_id, insurace_company_id, insurace_company_name, premium_amount, poundage_amount, business_bill_id from business_bill_reins_info where (reins_info_id = ?)</tt>
	 *
	 *	@param reinsInfoId
	 *	@return BusinessBillReinsInfoDO
	 *	@throws DataAccessException
	 */	 
    public BusinessBillReinsInfoDO findById(long reinsInfoId) throws DataAccessException {
        Long param = new Long(reinsInfoId);

        return (BusinessBillReinsInfoDO) getSqlMapClientTemplate().queryForObject("MS-BUSINESS-BILL-REINS-INFO-FIND-BY-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>business_bill_reins_info</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from business_bill_reins_info where (reins_info_id = ?)</tt>
	 *
	 *	@param reinsInfoId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long reinsInfoId) throws DataAccessException {
        Long param = new Long(reinsInfoId);

        return getSqlMapClientTemplate().delete("MS-BUSINESS-BILL-REINS-INFO-DELETE-BY-ID", param);
    }

	/**
	 *  Query DB table <tt>business_bill_reins_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select reins_info_id, insurace_company_id, insurace_company_name, premium_amount, poundage_amount, business_bill_id from business_bill_reins_info where (1 = 1)</tt>
	 *
	 *	@param businessBillReinsInfo
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<BusinessBillReinsInfoDO>
	 *	@throws DataAccessException
	 */	 
    public List<BusinessBillReinsInfoDO> findByCondition(BusinessBillReinsInfoDO businessBillReinsInfo, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException {
    	if (businessBillReinsInfo == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("businessBillReinsInfo", businessBillReinsInfo);
        param.put("sortCol", sortCol);
        param.put("sortOrder", sortOrder);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-BUSINESS-BILL-REINS-INFO-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>business_bill_reins_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from business_bill_reins_info where (1 = 1)</tt>
	 *
	 *	@param businessBillReinsInfo
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(BusinessBillReinsInfoDO businessBillReinsInfo) throws DataAccessException {
    	if (businessBillReinsInfo == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-BUSINESS-BILL-REINS-INFO-FIND-BY-CONDITION-COUNT", businessBillReinsInfo);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

	/**
	 *  Query DB table <tt>business_bill_reins_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select reins_info_id, insurace_company_id, insurace_company_name, premium_amount, poundage_amount, business_bill_id from business_bill_reins_info where (business_bill_id = ?)</tt>
	 *
	 *	@param businessBillId
	 *	@return List<BusinessBillReinsInfoDO>
	 *	@throws DataAccessException
	 */	 
    public List<BusinessBillReinsInfoDO> findBusinessBillReinsInfo(long businessBillId) throws DataAccessException {
        Long param = new Long(businessBillId);

        return getSqlMapClientTemplate().queryForList("MS-BUSINESS-BILL-REINS-INFO-FIND-BUSINESS-BILL-REINS-INFO", param);

    }

}
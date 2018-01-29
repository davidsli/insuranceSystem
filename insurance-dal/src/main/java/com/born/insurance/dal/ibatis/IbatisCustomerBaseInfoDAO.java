/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.insurance.dal.daointerface.CustomerBaseInfoDAO;


// auto generated imports
import com.born.insurance.dal.dataobject.CustomerBaseInfoDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.insurance.dal.daointerface.CustomerBaseInfoDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/customer_base_info.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisCustomerBaseInfoDAO extends SqlMapClientDaoSupport implements CustomerBaseInfoDAO {
	/**
	 *  Insert one <tt>CustomerBaseInfoDO</tt> object to DB table <tt>customer_base_info</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into customer_base_info(user_id,customer_id,customer_name,contact_mobile,cert_type,cert_no,cert_exp_date,long_time,country_code,country_name,province_code,province_name,city_code,city_name,county_code,county_name,address,email,mobile,telphone,fix,weixin,qq,status,business_user_id,business_user_name,creator_id,creator_name,customer_type,abbr1,abbr2,abbr3,owner_id,owner_user_name,out_user,remark,referee_id,referee_name,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param customerBaseInfo
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(CustomerBaseInfoDO customerBaseInfo) throws DataAccessException {
    	if (customerBaseInfo == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-CUSTOMER-BASE-INFO-INSERT", customerBaseInfo);

        return customerBaseInfo.getUserId();
    }

	/**
	 *  Update DB table <tt>customer_base_info</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update customer_base_info set customer_id=?, customer_name=?, contact_mobile=?, cert_type=?, cert_no=?, cert_exp_date=?, long_time=?, country_code=?, country_name=?, province_code=?, province_name=?, city_code=?, city_name=?, county_code=?, county_name=?, address=?, email=?, mobile=?, telphone=?, fix=?, weixin=?, qq=?, status=?, business_user_id=?, business_user_name=?, creator_id=?, creator_name=?, customer_type=?, abbr1=?, abbr2=?, abbr3=?, owner_id=?, owner_user_name=?, out_user=?, remark=?, referee_id=?, referee_name=? where (user_id = ?)</tt>
	 *
	 *	@param customerBaseInfo
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(CustomerBaseInfoDO customerBaseInfo) throws DataAccessException {
    	if (customerBaseInfo == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-CUSTOMER-BASE-INFO-UPDATE", customerBaseInfo);
    }

	/**
	 *  Query DB table <tt>customer_base_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select user_id, customer_id, customer_name, contact_mobile, cert_type, cert_no, cert_exp_date, long_time, country_code, country_name, province_code, province_name, city_code, city_name, county_code, county_name, address, email, mobile, telphone, fix, weixin, qq, status, business_user_id, business_user_name, creator_id, creator_name, customer_type, abbr1, abbr2, abbr3, owner_id, owner_user_name, out_user, remark, referee_id, referee_name, raw_add_time, raw_update_time from customer_base_info where (user_id = ?)</tt>
	 *
	 *	@param userId
	 *	@return CustomerBaseInfoDO
	 *	@throws DataAccessException
	 */	 
    public CustomerBaseInfoDO findById(long userId) throws DataAccessException {
        Long param = new Long(userId);

        return (CustomerBaseInfoDO) getSqlMapClientTemplate().queryForObject("MS-CUSTOMER-BASE-INFO-FIND-BY-ID", param);

    }

	/**
	 *  Query DB table <tt>customer_base_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select user_id, customer_id, customer_name, contact_mobile, cert_type, cert_no, cert_exp_date, long_time, country_code, country_name, province_code, province_name, city_code, city_name, county_code, county_name, address, email, mobile, telphone, fix, weixin, qq, status, business_user_id, business_user_name, creator_id, creator_name, customer_type, abbr1, abbr2, abbr3, owner_id, owner_user_name, out_user, remark, referee_id, referee_name, raw_add_time, raw_update_time from customer_base_info where (owner_id = ?)</tt>
	 *
	 *	@param ownerId
	 *	@return CustomerBaseInfoDO
	 *	@throws DataAccessException
	 */	 
    public CustomerBaseInfoDO findByOwnerId(long ownerId) throws DataAccessException {
        Long param = new Long(ownerId);

        return (CustomerBaseInfoDO) getSqlMapClientTemplate().queryForObject("MS-CUSTOMER-BASE-INFO-FIND-BY-OWNER-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>customer_base_info</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from customer_base_info where (user_id = ?)</tt>
	 *
	 *	@param userId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long userId) throws DataAccessException {
        Long param = new Long(userId);

        return getSqlMapClientTemplate().delete("MS-CUSTOMER-BASE-INFO-DELETE-BY-ID", param);
    }

	/**
	 *  Query DB table <tt>customer_base_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select * from customer_base_info where (1 = 1)</tt>
	 *
	 *	@param customerBaseInfo
	 *	@param companys
	 *	@param removeCompanys
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<CustomerBaseInfoDO>
	 *	@throws DataAccessException
	 */	 
    public List<CustomerBaseInfoDO> findByCondition(CustomerBaseInfoDO customerBaseInfo, String companys, String removeCompanys, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException {
    	if (customerBaseInfo == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("customerBaseInfo", customerBaseInfo);
        param.put("companys", companys);
        param.put("removeCompanys", removeCompanys);
        param.put("sortCol", sortCol);
        param.put("sortOrder", sortOrder);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-CUSTOMER-BASE-INFO-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>customer_base_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from customer_base_info where (1 = 1)</tt>
	 *
	 *	@param customerBaseInfo
	 *	@param companys
	 *	@param removeCompanys
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(CustomerBaseInfoDO customerBaseInfo, String companys, String removeCompanys) throws DataAccessException {
    	if (customerBaseInfo == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("customerBaseInfo", customerBaseInfo);
        param.put("companys", companys);
        param.put("removeCompanys", removeCompanys);

	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-CUSTOMER-BASE-INFO-FIND-BY-CONDITION-COUNT", param);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

	/**
	 *  Query DB table <tt>customer_base_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select user_id, customer_id, customer_name, contact_mobile, cert_type, cert_no, cert_exp_date, long_time, country_code, country_name, province_code, province_name, city_code, city_name, county_code, county_name, address, email, mobile, telphone, fix, weixin, qq, status, business_user_id, business_user_name, creator_id, creator_name, customer_type, abbr1, abbr2, abbr3, owner_id, owner_user_name, out_user, remark, referee_id, referee_name, raw_add_time, raw_update_time from customer_base_info where (1 = 1)</tt>
	 *
	 *	@param customerUserId
	 *	@return CustomerBaseInfoDO
	 *	@throws DataAccessException
	 */	 
    public CustomerBaseInfoDO findByCustomerId(String customerUserId) throws DataAccessException {

        return (CustomerBaseInfoDO) getSqlMapClientTemplate().queryForObject("MS-CUSTOMER-BASE-INFO-FIND-BY-CUSTOMER-ID", customerUserId);

    }

	/**
	 *  Query DB table <tt>customer_base_info</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select user_id, customer_id, customer_name, contact_mobile, cert_type, cert_no, cert_exp_date, long_time, country_code, country_name, province_code, province_name, city_code, city_name, county_code, county_name, address, email, mobile, telphone, fix, weixin, qq, status, business_user_id, business_user_name, creator_id, creator_name, customer_type, abbr1, abbr2, abbr3, owner_id, owner_user_name, out_user, remark, referee_id, referee_name, raw_add_time, raw_update_time from customer_base_info where (1 = 1)</tt>
	 *
	 *	@param customerType
	 *	@return List<CustomerBaseInfoDO>
	 *	@throws DataAccessException
	 */	 
    public List<CustomerBaseInfoDO> findAgencyCompany(String customerType) throws DataAccessException {

        return getSqlMapClientTemplate().queryForList("MS-CUSTOMER-BASE-INFO-FIND-AGENCY-COMPANY", customerType);

    }

}
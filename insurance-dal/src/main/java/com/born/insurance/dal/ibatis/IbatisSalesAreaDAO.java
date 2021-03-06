/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.insurance.dal.daointerface.SalesAreaDAO;


// auto generated imports
import com.born.insurance.dal.dataobject.SalesAreaDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.insurance.dal.daointerface.SalesAreaDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/sales_areas.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisSalesAreaDAO extends SqlMapClientDaoSupport implements SalesAreaDAO {
	/**
	 *  Insert one <tt>SalesAreaDO</tt> object to DB table <tt>sales_areas</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into sales_areas(id,product_id,province_code,province_name,is_all_province,city_code,city_name,type) values (?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param salesArea
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(SalesAreaDO salesArea) throws DataAccessException {
    	if (salesArea == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-SALES-AREA-INSERT", salesArea);

        return salesArea.getId();
    }

	/**
	 *  Update DB table <tt>sales_areas</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update sales_areas set product_id=?, province_code=?, province_name=?, is_all_province=?, city_code=?, city_name=?, type=? where (id = ?)</tt>
	 *
	 *	@param salesArea
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(SalesAreaDO salesArea) throws DataAccessException {
    	if (salesArea == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-SALES-AREA-UPDATE", salesArea);
    }

	/**
	 *  Query DB table <tt>sales_areas</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, product_id, province_code, province_name, is_all_province, city_code, city_name, type from sales_areas where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return SalesAreaDO
	 *	@throws DataAccessException
	 */	 
    public SalesAreaDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (SalesAreaDO) getSqlMapClientTemplate().queryForObject("MS-SALES-AREA-FIND-BY-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>sales_areas</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from sales_areas where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-SALES-AREA-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>sales_areas</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from sales_areas where ((product_id = ?) AND (type = ?))</tt>
	 *
	 *	@param productId
	 *	@param type
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByProductIdAndType(long productId, String type) throws DataAccessException {
        Map param = new HashMap();

        param.put("productId", new Long(productId));
        param.put("type", type);

        return getSqlMapClientTemplate().delete("MS-SALES-AREA-DELETE-BY-PRODUCT-ID-AND-TYPE", param);
    }

	/**
	 *  Query DB table <tt>sales_areas</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, product_id, province_code, province_name, is_all_province, city_code, city_name, type from sales_areas where (1 = 1)</tt>
	 *
	 *	@param salesArea
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<SalesAreaDO>
	 *	@throws DataAccessException
	 */	 
    public List<SalesAreaDO> findByCondition(SalesAreaDO salesArea, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException {
    	if (salesArea == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("salesArea", salesArea);
        param.put("sortCol", sortCol);
        param.put("sortOrder", sortOrder);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-SALES-AREA-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>sales_areas</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from sales_areas where (1 = 1)</tt>
	 *
	 *	@param salesArea
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(SalesAreaDO salesArea) throws DataAccessException {
    	if (salesArea == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-SALES-AREA-FIND-BY-CONDITION-COUNT", salesArea);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}
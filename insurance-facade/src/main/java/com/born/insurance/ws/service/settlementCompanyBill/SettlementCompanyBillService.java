package com.born.insurance.ws.service.settlementCompanyBill;
import com.born.insurance.ws.result.base.QueryBaseBatchResult;
import com.born.insurance.ws.result.base.InsuranceBaseResult;

import java.util.List;

import com.born.insurance.ws.info.settlementCompanyBill.SettlementCompanyBillInfo;
import com.born.insurance.ws.order.settlementCompanyBill.SettlementCompanyBillOrder;
import com.born.insurance.ws.order.settlementCompanyBill.SettlementCompanyBillQueryOrder;
import com.born.insurance.ws.order.settlementCompanyBillProcess.SettlementCompanyBillProcessQueryOrder;

public interface SettlementCompanyBillService  {
	/**
     * 保存(新增/修改)
     *
     * @param order 不能为null
     * @return 成功/失败
     */
    InsuranceBaseResult save(SettlementCompanyBillOrder order);

    /**
     * 查询信息
     *
     * @param id 单据编号
     * @return 风险预警对象
     */
    SettlementCompanyBillInfo findById(long id);



    /**
     * 根据条件查询列表
     *
     * @param queryOrder 查询条件
     * @return 结果集
     */
    QueryBaseBatchResult<SettlementCompanyBillInfo> queryList(SettlementCompanyBillQueryOrder queryOrder);

    /**
     * 更改经纪费待结算记录状态和 新增结算单
     * @param queryOrder
     */
	void dealSettlementCompanyBill(SettlementCompanyBillProcessQueryOrder queryOrder);

	/**
	 * 结算单详情
	 * @param settlementCompanyIds
	 * @return
	 */
	List<SettlementCompanyBillInfo> findSettlementCompanyBills(String settlementCompanyIds);
	
}	
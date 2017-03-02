package com.deppon.crm.module.complaint.action;

import java.util.List;

import com.deppon.crm.module.common.shared.domain.TreeNode;
import com.deppon.crm.module.complaint.entity.CompReportedConfig;
import com.deppon.crm.module.complaint.manager.ICompRepConfigManager;
import com.deppon.foss.framework.server.web.action.AbstractAction;
import com.deppon.foss.framework.server.web.result.json.annotation.JSON;

/**
 * Description ComplRepConfigAction 工单上报基础资料配置测试A
 * @author 316231
 * @version 0.1 2016-03-24 16:35:58
 */
@SuppressWarnings("serial")
public class CompRepConfigAction extends AbstractAction {
	// 工单配置表 Manager
	private ICompRepConfigManager compRepConfigManager;
	
	// 加载树
	private List<TreeNode<CompReportedConfig>> nodes;
	/**
	 * 父节点id
	 */
	private String node;
	/**
	 * 工单上报基础资料配置项list 集合
	 */
	private List<CompReportedConfig> compRepConfigLists;
	/**
	 * 工单上报基础资料
	 */
	private CompReportedConfig compRepConfig;
	/**
	 * 工单上报基础资料集合 for delete
	 */
	private List<CompReportedConfig> delLists;
	/**
	 * 工单项集合
	 */
	private List<CompReportedConfig> compNameList;
	/**
	 * 工单范围集合
	 */
	private List<CompReportedConfig> compScopeList;
	/**
	 * 工单性质集合
	 */
	private List<CompReportedConfig> compNatureList;
	/**
	 * 
	 * @Title: Trees 
	 * @Description: 加载工单上报基础资料tree 
	 * @param @return    设定文件 
	 * @return String    返回类型 
	 * @throws
	 */
	@JSON
	public String trees(){
		nodes=compRepConfigManager.treeChildNodeList(node);
		return SUCCESS;
	}
	/**
	 * 
	 * @Title: queryCompRepConfigLists
	 * @Description: 根据不同条件返回工单上报基础资料集合
	 * @return
	 * @throws
	 */
	@JSON
	public String queryCompRepConfigLists(){
		this.setCompRepConfigLists(compRepConfigManager.queryList(compRepConfig));
		compRepConfig=null;
		return SUCCESS;
	}
	
	/**
	 * 
	 * @Title: queryCompRepConfigLists
	 * @Description: 根据不同条件返回工单项集合
	 * @return
	 * @throws
	 */
	@JSON
	public String compRepItemNameLists(){
		this.setCompNameList(compRepConfigManager.queryList(compRepConfig));
		compRepConfig=null;
		return SUCCESS;
	}
	
	/**
	 * 
	 * @Title: queryCompRepConfigLists
	 * @Description: 根据不同条件返回工单性质集合
	 * @return
	 * @throws
	 */
	@JSON
	public String compRepNatureLists(){
		this.setCompNatureList(compRepConfigManager.queryList(compRepConfig));
		compRepConfig=null;
		return SUCCESS;
	}
	
	/**
	 * 
	 * @Title: queryCompRepConfigLists
	 * @Description: 根据不同条件返回工单范围集合
	 * @return
	 * @throws
	 */
	@JSON
	public String compRepScopeLists(){
		this.setCompScopeList(compRepConfigManager.queryList(compRepConfig));
		compRepConfig=null;
		return SUCCESS;
	}
	
	/**
	 * 
	 * @Title：addCompRepConfig
	 * @Description: 添加工单上报基础资料配置项
	 * @return
	 * @throws
	 */
	@JSON
	public String addCompRepConfig(){
		compRepConfigManager.addReportedConfig(compRepConfig);
		compRepConfig=null;
		return SUCCESS;
	}
	
	/**
	 * @Title：modifyCompRepConfig
	 * @Description: 修改工单上报基础资料配置项
	 * @return
	 * @throws
	 */
	@JSON
	public String modifyCompRepConfig(){
		compRepConfigManager.updateReportedConfig(compRepConfig);
		compRepConfig=null;
		return SUCCESS;
	}
	
	/**
	 * 
	 * @Title：delCompRepConfig
	 * @Description: 批量删除工单上报基础资料配置项
	 * @return
	 * @throws
	 */
	public String delCompRepConfig(){
		compRepConfigManager.deleteReportedConfig(delLists);
		return SUCCESS;
	}
	
	public List<TreeNode<CompReportedConfig>> getNodes() {
		return nodes;
	}
	public void setNodes(List<TreeNode<CompReportedConfig>> nodes) {
		this.nodes = nodes;
	}
	public String getNode() {
		return node;
	}
	public void setNode(String node) {
		this.node = node;
	}
	public List<CompReportedConfig> getCompRepConfigLists() {
		return compRepConfigLists;
	}
	public void setCompRepConfigLists(List<CompReportedConfig> compRepConfigLists) {
		this.compRepConfigLists = compRepConfigLists;
	}
	public CompReportedConfig getCompRepConfig() {
		return compRepConfig;
	}
	public void setCompRepConfig(CompReportedConfig compRepConfig) {
		this.compRepConfig = compRepConfig;
	}
	public List<CompReportedConfig> getDelLists() {
		return delLists;
	}
	public void setDelLists(List<CompReportedConfig> lists) {
		this.delLists = lists;
	}
	public ICompRepConfigManager getCompRepConfigManager() {
		return compRepConfigManager;
	}
	public void setCompRepConfigManager(ICompRepConfigManager compRepConfigManager) {
		this.compRepConfigManager = compRepConfigManager;
	}
	public List<CompReportedConfig> getCompNameList() {
		return compNameList;
	}
	public void setCompNameList(List<CompReportedConfig> compNameList) {
		this.compNameList = compNameList;
	}
	public List<CompReportedConfig> getCompScopeList() {
		return compScopeList;
	}
	public void setCompScopeList(List<CompReportedConfig> compScopeList) {
		this.compScopeList = compScopeList;
	}
	public List<CompReportedConfig> getCompNatureList() {
		return compNatureList;
	}
	public void setCompNatureList(List<CompReportedConfig> compNatureList) {
		this.compNatureList = compNatureList;
	}
	
}

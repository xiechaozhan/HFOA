/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.11.v20150529
 * Generated at: 2018-12-24 01:14:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.authority;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class permission_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>权限列表</title>\r\n");
      out.write("<link rel=\"shortcut icon\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/img/entertainImg/favicon.ico\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/CSS/jqueryui/themes/default/easyui.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/CSS/jqueryui/themes/icon.css\">\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/CSS/jquery.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/CSS/jquery.easyui.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/CSS/easyui-lang-zh_CN.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/CSS/PublicStyle.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/CSS/DataImport.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/CSS/main.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/CSS/UserManage.css\">\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/CSS/jquery.form.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tvar es = \"新建\";\r\n");
      out.write("\t//提交action 的url\r\n");
      out.write("\tvar url = \"\";\r\n");
      out.write("\tvar idd = 1;\r\n");
      out.write("\tvar es = \"\";\r\n");
      out.write("\t//返回json对象的长度\r\n");
      out.write("\tfunction getJsonObjLength(jsonObj) {\r\n");
      out.write("\t\tvar Length = 0;\r\n");
      out.write("\t\tfor ( var item in jsonObj) {\r\n");
      out.write("\t\t\tLength++;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\treturn Length;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t//格式化json\r\n");
      out.write("\tfunction formatJson(json) {\r\n");
      out.write("\t\tvar jsobj = eval(json);\r\n");
      out.write("\t\treturn '{\"total\":' + jsobj.bingdings.length + ',\"rows\":' + json + \"}\";\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t// js格式化Date方法\r\n");
      out.write("\t\r\n");
      out.write("\tDate.prototype.Format = function (fmt) { //author: meizz \r\n");
      out.write("\t    var o = { \r\n");
      out.write("\t        \"M+\": this.getMonth() + 1, //月份 \r\n");
      out.write("\t        \"d+\": this.getDate(), //日 \r\n");
      out.write("\t        \"h+\": this.getHours(), //小时 \r\n");
      out.write("\t        \"m+\": this.getMinutes(), //分 \r\n");
      out.write("\t        \"s+\": this.getSeconds(), //秒 \r\n");
      out.write("\t        \"q+\": Math.floor((this.getMonth() + 3) / 3), //季度 \r\n");
      out.write("\t        \"S\": this.getMilliseconds() //毫秒 \r\n");
      out.write("\t    };\r\n");
      out.write("\t    if (/(y+)/.test(fmt)) fmt = fmt.replace(RegExp.$1, (this.getFullYear() + \"\").substr(4 - RegExp.$1.length));\r\n");
      out.write("\t    for (var k in o)\r\n");
      out.write("\t    if (new RegExp(\"(\" + k + \")\").test(fmt)) fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : ((\"00\" + o[k]).substr((\"\" + o[k]).length)));\r\n");
      out.write("\t    return fmt;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction loadGrid(url,data){\r\n");
      out.write("\t\t//汉化 datagrid 翻页\r\n");
      out.write("\t\t$(\"#llbinfo\").datagrid({\r\n");
      out.write("\t\t\turl : url,\r\n");
      out.write("\t\t\tmethod : 'post',\r\n");
      out.write("\t\t\tqueryParams:data,\r\n");
      out.write("\t\t\tpageSize : 20,\r\n");
      out.write("\t\t\trownumbers : true,\r\n");
      out.write("\t\t\tsingleSelect : true,\r\n");
      out.write("\t\t\tpagination : true,\r\n");
      out.write("\t\t\ttoolbar : [  {\r\n");
      out.write("\t\t\t\ttext : '添加',\r\n");
      out.write("\t\t\t\ticonCls : 'icon-add',\r\n");
      out.write("\t\t\t\thandler : function() {\r\n");
      out.write("\t\t\t\t\tadd();\r\n");
      out.write("\t\t\t\t}},'-',{\r\n");
      out.write("\t\t\t\ttext : '修改',\r\n");
      out.write("\t\t\t\ticonCls : 'icon-edit',\r\n");
      out.write("\t\t\t\thandler : function() {\r\n");
      out.write("\t\t\t\t\tedit();\r\n");
      out.write("\t\t\t\t}},'-',{\r\n");
      out.write("\t\t\t\t\ttext : '删除',\r\n");
      out.write("\t\t\t\t\ticonCls : 'icon-remove',\r\n");
      out.write("\t\t\t\t\thandler : function() {\r\n");
      out.write("\t\t\t\t\t\tdeletePermission();\r\n");
      out.write("\t\t\t\t}},'-',{\r\n");
      out.write("\t\t\t\ttext : '名称：<input type=\"text\" id=\"title\"/>',\r\n");
      out.write("\t\t\t\t},'-',{\r\n");
      out.write("\t\t\t\ttext : '查询',\r\n");
      out.write("\t\t\t\ticonCls : 'icon-search',\r\n");
      out.write("\t\t\t\thandler : function() {\r\n");
      out.write("\t\t\t\t\tsearchPermission();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}],\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tonLoadSuccess:function(data){  \r\n");
      out.write("\t\t\t\t $('.preScan').linkbutton({text:'查看明细',plain:true,iconCls:'icon-search'}); \r\n");
      out.write("\t\t\t\t $('.preScan1').linkbutton({text:'凭证号登记',plain:true,iconCls:'icon-save'}); \r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\tvar pager = $('#llbinfo').datagrid().datagrid('getPager');\r\n");
      out.write("\t\tpager.pagination({\r\n");
      out.write("\t\t\tbeforePageText : \"转到\",\r\n");
      out.write("\t\t\tafterPageText : \"共{pages}页\",\r\n");
      out.write("\t\t\tdisplayMsg : '当前显示从{from}到{to}  共{total}记录',\r\n");
      out.write("\t\t\tonBeforeRefresh : function(pageNumber, pageSize) {\r\n");
      out.write("\t\t\t\t$(this).pagination('loading');\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$(this).pagination('loaded');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\t$(\"#urlclass\").combobox(\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tonSelect : function(record) {\r\n");
      out.write("\t\t\t\tvar info = $(\"#urlclass\").combobox('getValue');\r\n");
      out.write("\t\t\t\tif(info==2){\r\n");
      out.write("\t\t\t\t\t$(\"#weixin\").show();\r\n");
      out.write("\t\t\t\t\t$(\"#Icon\").show();\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$(\"#weixin\").hide();\r\n");
      out.write("\t\t\t\t\t$(\"#Icon\").hide();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tif(info==1||info==3){\r\n");
      out.write("\t\t\t\t\t$(\"#grade\").show();\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$(\"#grade\").hide();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\tloadGrid('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/permission/showAllPermission',null);\r\n");
      out.write("\t\t// 确认按钮\r\n");
      out.write("\t\t$(\"#btn_ok\").click(function(){\r\n");
      out.write("\t\t\t\tvar permissionname = $(\"#permissionname\").textbox(\"getText\");\r\n");
      out.write("\t\t\t\tvar permissionurl = $(\"#permissionurl\").textbox(\"getText\");\r\n");
      out.write("\t\t\t\tvar urlclass = $(\"#urlclass\").textbox(\"getValue\");\r\n");
      out.write("\t\t\t\tvar showUrlClass = $(\"#urlclass\").textbox(\"getText\");\r\n");
      out.write("\t\t\t\tvar permissionsort = $(\"#permissionsort\").textbox(\"getText\");\r\n");
      out.write("        \t    var available=$(\"#avaiable\").val();\r\n");
      out.write("\t\t\t\tvar parentid = $(\"#parentid\").textbox(\"getText\");\r\n");
      out.write("\t\t\t\tvar permissionlable=$(\"#weixin1\").val();\r\n");
      out.write("\t\t\t\tvar permissiontype=$(\"#grade1\").val();\r\n");
      out.write("\t\t\tif(es==\"添加\"){\r\n");
      out.write("\t\t\t\tif(urlclass==\"\"){\r\n");
      out.write("\t\t\t\t\talert(\"请选择路径类型！\");\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\tvar param = {permissionname:permissionname,permissionurl:permissionurl,urlclass:urlclass,permissionsort:permissionsort,\r\n");
      out.write("\t\t\t\t\t\t\tavailable:available,parentid:parentid,permissionlable:permissionlable,permissiontype:permissiontype};\r\n");
      out.write("\t\t\t\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/permission/insertPermission\",param, function(result) {\r\n");
      out.write("\t\t\t\t\t\t$(\"#pId\").val(result);\r\n");
      out.write("\t\t\t\t\t\t if($(\"#file\").val()!=\"\"){\r\n");
      out.write("\t\t\t\t\t\t\t $(\"#myform\").form(\"submit\", {    \r\n");
      out.write("\t\t\t\t\t\t\t\ttype: 'post',    \r\n");
      out.write("\t\t\t\t\t\t\t\turl: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/permission/uploadFile', \r\n");
      out.write("\t\t\t\t\t\t\t\tsuccess: function (data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t if(data>0){\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\talert(\"上传成功！\");\r\n");
      out.write("\t\t\t\t\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t\t\t\t}});\r\n");
      out.write("\t\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t\t\t$(\"#dlg\").dialog(\"close\");\r\n");
      out.write("\t\t\t\t\t\t$('#llbinfo').datagrid('reload');\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}else{\r\n");
      out.write("\t\t\t\tvar row = $('#llbinfo').datagrid('getSelected');\r\n");
      out.write("\t\t\t\tvar param = {id:row.id,permissionname:permissionname,permissionurl:permissionurl,showUrlClass:showUrlClass,permissionsort:permissionsort,\r\n");
      out.write("\t\t\t\t\t\tavailable:available,parentid:parentid,permissionlable:permissionlable,permissiontype:permissiontype};\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/permission/updatePermission\",param, function(result) {\r\n");
      out.write("\t\t\t\t\t$(\"#pId\").val(row.id);\r\n");
      out.write("\t\t\t\t\t if($(\"#file\").val()!=\"\"){\r\n");
      out.write("\t\t\t\t\t\t $(\"#myform\").form(\"submit\", {    \r\n");
      out.write("\t\t\t\t\t\t\ttype: 'post',    \r\n");
      out.write("\t\t\t\t\t\t\turl: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/permission/uploadFile', \r\n");
      out.write("\t\t\t\t\t\t\tsuccess: function (data) {\r\n");
      out.write("\t\t\t\t\t\t\t\t if(data>0){\r\n");
      out.write("\t\t\t\t\t\t\t\t\talert(\"上传成功！\");\r\n");
      out.write("\t\t\t\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t\t\t}});\r\n");
      out.write("\t\t\t\t\t }\r\n");
      out.write("\t\t\t\t\t$(\"#dlg\").dialog(\"close\");\r\n");
      out.write("\t\t\t\t\t$('#llbinfo').datagrid('reload');\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t// 取消按钮\r\n");
      out.write("\t\t$(\"#btn_cancel\").click(function() {\r\n");
      out.write("\t\t\t$('#dlg').dialog('close')\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t// 上传取消按钮\r\n");
      out.write("\t\t$(\"#uploadFileCancel\").click(function() {\r\n");
      out.write("\t\t\tdocument.getElementById('fileImport').value = null;\r\n");
      out.write("\t\t\t$('#import-excel').window('close')\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t})\t\r\n");
      out.write("\t\r\n");
      out.write("\tfunction fixWidth(percent) {\r\n");
      out.write("\t\treturn ($(\".mdiv\").width() - 30) * percent;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\tfunction edit(){\r\n");
      out.write("\t\tes = \"修改\";\r\n");
      out.write("\t\tvar row = $('#llbinfo').datagrid('getSelected');\r\n");
      out.write("\t\tif (row){\r\n");
      out.write("\t\t\t $('#dlg').dialog('open').dialog('setTitle',es);\r\n");
      out.write("\t\t     $('#fm').form('clear');\r\n");
      out.write("\t\t    $(\"#permissionname\").textbox(\"setText\",row.permissionname);\r\n");
      out.write("\t\t\t$(\"#permissionurl\").textbox(\"setText\",row.permissionurl);\r\n");
      out.write("\t\t\t$(\"#urlclass\").textbox(\"setText\",row.showUrlClass);\r\n");
      out.write("\t\t\t$(\"#permissionsort\").textbox(\"setText\",row.permissionsort);\r\n");
      out.write("\t\t\t$(\"#avaiable\").val(row.available);\r\n");
      out.write("\t\t\t$(\"#parentid\").textbox(\"setText\",row.parentid);\r\n");
      out.write("\t\t\t$(\"#grade1\").val(row.permissiontype);\r\n");
      out.write("\t\t\t$(\"#wexin1\").val(row.permissionlable);\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t    \talert(\"请选择要修改的数据！\");\r\n");
      out.write("\t    }\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction add(){\r\n");
      out.write("\t\t es = \"添加\";\r\n");
      out.write("\t\t $('#dlg').dialog('open').dialog('setTitle',es);\r\n");
      out.write("\t     $('#fm').form('clear');\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction deletePermission(){\r\n");
      out.write("\t\tes = \"删除\";\r\n");
      out.write("\t\tvar row = $('#llbinfo').datagrid('getSelected');\r\n");
      out.write("\t\tif (row){\r\n");
      out.write("\t\t\tvar param = {id:row.id};\r\n");
      out.write("\t\t\t$.post(\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/permission/deletePermission\",param, function(result) {\r\n");
      out.write("\t\t\t\t$(\"#dlg\").dialog(\"close\");\r\n");
      out.write("\t\t\t\t$('#llbinfo').datagrid('reload');\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t}else{\r\n");
      out.write("\t\t\talert(\"请选择要删除的数据！\");\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\tfunction searchPermission(){\r\n");
      out.write("\t\tes = \"查询\";\r\n");
      out.write("\t\tvar param = {title:$(\"#title\").val()};\r\n");
      out.write("\t\tloadGrid('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/permission/searchPermission',param);\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\t<!-- 权限编辑表 -->\r\n");
      out.write("\t<div id=\"dlg\" class=\"easyui-dialog\" style=\"width:400px;height:300px;padding:0px 0px;\"closed=\"true\" buttons=\"#dlg-buttons\">\r\n");
      out.write("        <!--<div>用户编辑</div>  -->\r\n");
      out.write("        <form id=\"fm\" method=\"post\">\r\n");
      out.write("       <div style=\"text-align:center;\">\r\n");
      out.write("        \t\t<table style=\"margin:auto;\" cellspacing=\"10\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><label>名称</label></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input id=\"permissionname\" class=\"easyui-textbox\" style=\"width: 220px;\"></input></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><label>路径</label></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input id=\"permissionurl\" class=\"easyui-textbox\" style=\"width: 220px;\"></input></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><label>路径类别</label></td>\r\n");
      out.write("<!-- \t\t\t\t\t\t<td><input id=\"urlclass\" class=\"easyui-textbox\" style=\"width: 220px;\"></input></td> -->\r\n");
      out.write("\t\t\t\t\t\t<td><input id=\"urlclass\" class=\"easyui-combobox\" \r\n");
      out.write("\t\t\t\t\t\tdata-options=\"\r\n");
      out.write("\t\t\t\t\t\t\turl:'");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/dictionary/selectDict.action?type=url',\r\n");
      out.write("\t\t\t\t\t\t\tmethod:'get',\r\n");
      out.write("\t\t\t\t\t\t\tvalueField:'info',\r\n");
      out.write("\t\t\t\t\t\t\ttextField:'text',\r\n");
      out.write("\t\t\t\t\t\t\teditable:false,\r\n");
      out.write("\t\t\t\t\t\t\tpanelHeight:'70'\r\n");
      out.write("\t\t\t\t\t\t\t\" style=\"width: 220px;\"></input></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><label>排序</label></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input id=\"permissionsort\" class=\"easyui-textbox\" style=\"width: 220px;\"></input></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><label>是否可用</label></td>\r\n");
      out.write("\t\t\t\t\t\t<td><select id=\"avaiable\" style=\"width: 220px;\"><option value=\"1\" selected>是</option><option value=\"0\">否</option></select></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><label>父级编号</label></td>\r\n");
      out.write("\t\t\t\t\t\t<td><input id=\"parentid\" class=\"easyui-textbox\" style=\"width: 220px;\"></input></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr id=\"grade\" style=\"display:none\">\r\n");
      out.write("\t\t\t\t\t\t<td><label>菜单级别</label></td>\r\n");
      out.write("\t\t\t\t\t\t<td><select id=\"grade1\" style=\"width: 220px;\"><option value=\"fatherLevel\" selected>父级菜单</option><option value=\"childLevel\">子级菜单</option></select></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr id=\"weixin\" style=\"display:none\">\r\n");
      out.write("\t\t\t\t\t\t<td><label>微信标识</label></td>\r\n");
      out.write("\t\t\t\t\t\t<td><select id=\"weixin1\" style=\"width: 220px;\"><option value=\"my\" selected>我的界面</option><option value=\"first\">首界面</option></select></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("        \t\t</table>\r\n");
      out.write("        \t\t\r\n");
      out.write("        \t\t </form>\r\n");
      out.write("        \t\t  <div id=\"Icon\" style=\"display:none\">\r\n");
      out.write("\t\t\t\t\t<div style=\"width: 20%;height: 10%;margin-left: 10%\"><label>微信图标</label></div>\r\n");
      out.write("\t\t\t\t\t<form  id=\"myform\" method=\"POST\" enctype=\"multipart/form-data\"accept=\"image/gif, image/jpeg,image/jpg, image/png\">\r\n");
      out.write("\t\t\t\t\t<div style=\"width: 80%;height: 10%;margin-left: 30%\">\r\n");
      out.write("\t\t\t\t\t<input value=\"\" id=\"pId\" style=\"display:none\" name=\"pId\">\r\n");
      out.write("\t\t\t\t\t <input  id=\"file\" type=\"file\" name=\"icon\"/></div></form>\r\n");
      out.write("\t\t       </div>\r\n");
      out.write("        \t</div>\r\n");
      out.write("  \t\t\t<div style=\"text-align:center;bottom:15px;margin-top:20px;\">\r\n");
      out.write("        \t\t<a href=\"#\" id=\"btn_ok\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-save'\" style=\"width:20%;\">确定</a>\r\n");
      out.write("\t\t\t\t<a href=\"#\" id=\"btn_cancel\" class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-cancel'\" style=\"width:20%;\">取消</a>\r\n");
      out.write("        \t</div>\r\n");
      out.write("       \r\n");
      out.write("       \r\n");
      out.write("    </div>\r\n");
      out.write("\t<div class=\"mdiv\" style=\"width:100%;height:100%;\">\r\n");
      out.write("\t\t<table id=\"llbinfo\" class=\"easyui-datagrid\"  title=\"权限信息\"\r\n");
      out.write("\t\t\tstyle=\"width: auto; height:100%;\">\r\n");
      out.write("\t\t\t<thead>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"field:'id',width:fixWidth(0.1),align:'center'\">编号</th>\r\n");
      out.write("\t\t\t\t\t<th\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"field:'permissionname',width:fixWidth(0.2),align:'center'\">名称</th>\r\n");
      out.write("\t\t\t\t \t<th\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"field:'permissionurl',width:fixWidth(0.3),align:'center'\">路径</th>\r\n");
      out.write("\t\t\t\t\t<th \r\n");
      out.write("\t\t\t\t\t\tdata-options=\"field:'showUrlClass',width:fixWidth(0.2),align:'center'\">路径类别</th>\r\n");
      out.write("\t\t\t\t\t<th\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"field:'permissionsort',width:fixWidth(0.1),align:'center'\">排序</th>\r\n");
      out.write("\t\t\t\t\t<th\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"field:'showAvailable',width:fixWidth(0.1),align:'center'\">是否可用</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t</table>  \r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
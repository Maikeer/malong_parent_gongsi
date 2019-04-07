<%--
  Created by IntelliJ IDEA.
  User: jin.tang
  Date: 2019/3/27
  Time: 13:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品列表</title>
    <link rel="stylesheet" type="text/css" href="/css/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="/css/themes/icon.css">
    <script type="text/javascript" src="/js/jquery.min.js">
    </script>
    <script type="text/javascript" src="/js/jquery.easyui.min.js">
    </script>
</head>
<body>
<table class="easyui-datagrid"
       data-options="url:'/product/list',fitColumns:true,singleSelect:true,pageSize:5,pageList:[5,10,15,20]"
       toolbar="#bar" pagination="true" rownumbers="true">
    <thead>
    <tr>
        <th data-options="field:'id',width:100">id</th>
        <th data-options="field:'name',width:100">商品名称</th>
        <th data-options="field:'image',width:100,formatter:showImage">主图</th>
        <th data-options="field:'maketPrice',width:100">市场价格</th>
        <th data-options="field:'price',width:100">价格</th>
        <th data-options="field:'productNumber',width:100">商品编码</th>
    </tr>
    </thead>
</table>

<div id="bar">
    <a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'">搜索</a>
    <a id="btn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-edit'">编辑</a>
</div>

<script>
    function showImage(value,row,index) {
        if(row.image) {
            return "<img style='height: 100px; width: auto' src='http://192.168.199.128:8888/"+row.image+"'/>"
        }
    }
</script>
</body>
</html>

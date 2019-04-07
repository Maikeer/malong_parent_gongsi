<%--
  Created by IntelliJ IDEA.
  User: jin.tang
  Date: 2019/3/25
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="/css/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="/css/themes/icon.css">
    <script type="text/javascript" src="/js/jquery.min.js">
    </script>
    <script type="text/javascript" src="/js/jquery.easyui.min.js">
    </script>
    <script type="text/javascript" src="/js/ajaxFileUpload.js"></script>
</head>
<body class="easyui-layout">
<div data-options="region:'west',title:'菜单',split:true , minWidth:180" style="width:100px;">
    <ul id="tt" class="easyui-tree">
        <li>
        <span>商品分类管理</span>
        <ul>
            <li data-options="attributes:{url:'product_cat_list'}"><span>商品分类列表</span></li>
        </ul>
    </li>
        <li>
            <span>商品管理</span>
            <ul>
                <li data-options="attributes:{url:'product_list'}"><span>商品列表</span></li>
                <li data-options="attributes:{url:'product_add'}"><span>商品添加</span></li>
            </ul>
        </li>
    </ul>
</div>
<div data-options="region:'center'" style="padding:5px;background:#eee;">
    <div id="tabs" class="easyui-tabs" >
        <div  title="首页" style="padding:20px;display:none;">
            默认首页
        </div>

    </div>
</div>
<script >
    $('#tt').tree({
        onClick: function(node){
            var tabs =$("#tabs");
            // var tab=tabs.getTab();
            var exit=tabs.tabs('exists',node.text);
            if(exit){
                tabs.tabs('select',node.text)
            }else{
                tabs.tabs('add',{
                    title: node.text,
                    content:"conten bas",
                    href:node.attributes.url,
                    closable:true,
                    selected: true
                    //...
                });
            }

        }
    });
</script>
</body>
</html>

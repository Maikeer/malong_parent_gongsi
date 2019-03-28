<%--
  Created by IntelliJ IDEA.
  User: jin.tang
  Date: 2019/3/27
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品分类</title>
</head>
<body>
<ul id="productCategory"></ul>
<div id="mm" class="easyui-menu" style="width:120px;">
    <div onclick="append()" data-options="iconCls:'icon-add'">添加</div>
    <div onclick="rename()" data-options="iconCls:'icon-edit'">修改</div>
    <div onclick="remove()" data-options="iconCls:'icon-remove'">删除</div>
</div>
<script type="text/javascript">
    $(function(){
        $('#productCategory').tree({
            url:"/product_category/list",
            onContextMenu: function(e, node){
                e.preventDefault();
                // select the node
                $('#productCategory').tree('select', node.target);
                // display context menu
                $('#mm').menu('show', {
                    left: e.pageX,
                    top: e.pageY
                });
            },
            onAfterEdit: function(node){
               var id= node.id;
               if(id==0){
                   $.post("/product_category/add",{parentId:node.parentId,name:node.text},function(data){
                       var status=data.status;
                       if(status==200){
                           if (node){
                               $('#productCategory').tree('update', {
                                   target: node.target,
                                   id:data.msg
                               });
                           }
                       }else{
                            $.message.alert("添加分类失败");
                       }
                   });

               }else{
                   alert("rename onAfterEdit");
               }

            }
        });
    })
    function append() {
        var selected = $('#productCategory').tree('getSelected');
        $('#productCategory').tree('append', {
            parent: selected.target,
            data: [{
                id: 0,
                parentId:selected.id,
                checked:true,
                text: '新建分类'
            }]
        });
        var node = $('#productCategory').tree('find', 0);
        $('#productCategory').tree('select', node.target).tree('beginEdit',node.target);
    };
    function rename() {
        var selected = $('#productCategory').tree('getSelected');
        $('#productCategory').tree('beginEdit',selected.target)
    };
    function remove() {
        var selected = $('#productCategory').tree('getSelected');
        $('#productCategory').tree('remove',selected.target);
        $.post("/product_category/del",{parentId:selected.parentId,id:selected.id},function(data){
            var status=data.status;
            if(status==200){

            }else{
                $.message.alert("添加分类失败");
            }
        });
    }
</script>
</body>
</html>

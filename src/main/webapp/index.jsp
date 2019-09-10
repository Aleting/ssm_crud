<%--
  Created by IntelliJ IDEA.
  User: 10910
  Date: 2019/6/18
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    pageContext.setAttribute("APP_PATH",request.getContextPath());
%>
<html>
<head>
    <title>学生列表</title>
    <link href="${APP_PATH}/static/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <script src="${APP_PATH}/static/jquary/jquery-3.4.1.min.js"></script>
    <script src="${APP_PATH}/static/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
<!--修改模态框 -->
<div class="modal fade" id="stuUpdateModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabe2">修改学生信息</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label for="stName_add_input" class="col-sm-2 control-label">姓名:</label>
                        <div class="col-sm-10">
                            <p class="form-control-static" id="stu_update_static"></p>
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">性别:</label>
                        <div class="col-sm-10">
                            <label class="radio-inline">
                                <input type="radio" name="stSex" id="sex_update_input1" value="M" checked="checked"> 男
                            </label>
                            <label class="radio-inline">
                                <input type="radio" name="stSex" id="sex_update_input2" value="F"> 女
                            </label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="stEmail_add_input" class="col-sm-2 control-label">Email</label>
                        <div class="col-sm-10">
                            <input type="email" class="form-control" id="stEmail_update_input" name="stEmail" placeholder="stEmail">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">指导老师:</label>
                        <div class="col-sm-4">
                            <select class="form-control" name="teId"></select>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="stu_update_btn">修改</button>
            </div>
        </div>
    </div>
</div>
<!--新增模态框 -->
<div class="modal fade" id="stuAddModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">添加学生信息</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label for="stName_add_input" class="col-sm-2 control-label">姓名:</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="stName_add_input" name="stName" placeholder="stName">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">性别:</label>
                        <div class="col-sm-10">
                            <label class="radio-inline">
                                <input type="radio" name="stSex" id="sex_add_input1" value="M" checked="checked"> 男
                            </label>
                            <label class="radio-inline">
                                <input type="radio" name="stSex" id="sex_add_input2" value="F"> 女
                            </label>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="stEmail_add_input" class="col-sm-2 control-label">Email</label>
                        <div class="col-sm-10">
                            <input type="email" class="form-control" id="stEmail_add_input" name="stEmail" placeholder="stEmail">
                            <span class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label class="col-sm-2 control-label">指导老师:</label>
                        <div class="col-sm-4">
                            <select class="form-control" name="teId"></select>
                        </div>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="stu_save_btn">保存</button>
            </div>
        </div>
    </div>
</div>
<!--页面信息-->
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <h1>SSM-CRUD</h1>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4 col-md-offset-8">
            <button class="btn btn-primary" id="stu_add_modal_btn">新增</button>
            <button class="btn btn-danger" id="stu_delete_all_btn">删除</button>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <table class="table table-hover" id="stu_table">
                <thead>
                    <tr>
                        <th><input type="checkbox" id="check_all"></th>
                        <th>学号</th>
                        <th>姓名</th>
                        <th>性别</th>
                        <th>电子邮件</th>
                        <th>指导老师</th>
                        <th>操作</th>
                    </tr>
                </thead>
                <tbody>

                </tbody>

            </table>
        </div>
    </div>
    <!--分页信息-->
    <div class="row">
        <!--文字信息-->
        <div class="col-md-6" id="page_info_area">
        </div>
        <!--分页条信息-->
        <div class="col-md-6" id="page_nav_area">
        </div>
    </div>
    <div class="row"></div>
</div>
<script type="text/javascript">
    //总记录数
    var totalRecord,currentPage;
    //页面加载完成后发送ajax请求，要到分页请求
    $(function () {
        //去首页
        to_page(1);
    });
    
    function to_page(pn) {
        $.ajax({
            url:"${APP_PATH}/stu",
            data:"pn="+pn,//就是问号的内容
            type:"GET",
            success:function (result) {
                //解析显示学生信息
                build_stu_table(result);
                //解析分页信息
                build_page_info(result);
                //解析显示分页条数据
                build_page_nav(result);
            }
        });
    }
    
    function build_stu_table(result) {
        //清空table表格
        $("#stu_table tbody").empty();
        var stu = result.extend.pageInfo.list;
        $.each(stu,function (index,item) {
            var checkBoxTd = $("<td><input type='checkbox' class='check_item'></td>");
            var stuIdTd = $("<td></td>").append(item.stId);
            var stuNameTd = $("<td></td>").append(item.stName);
            var stuSexTd = $("<td></td>").append(item.stSex=='M'?'男':'女');
            var stuEmailTd = $("<td></td>").append(item.stEmail);
            var stuTeacherTd = $("<td></td>").append(item.teacher.teName);
            /**
             *<button class="btn btn-primary btn-sm">
             <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> 编辑
             </button>
             */
            var editBtn = $("<button></button>").addClass("btn btn-primary btn-sm edit_btn").append($("<spen></spen>").addClass("glyphicon glyphicon-pencil")).append("编辑");
            //为编辑按钮添加属性存储id的值
            editBtn.attr("edit_id",item.stId);
            var delBtn = $("<button></button>").addClass("btn btn-danger btn-sm delete_btn").append($("<spen></spen>").addClass("glyphicon glyphicon-trash")).append("删除");
            delBtn.attr("del_id",item.stId);
            var btnTd = $("<td></td>").append(editBtn).append(" ").append(delBtn);
            $("<tr></tr>").append(checkBoxTd).append(stuIdTd).append(stuNameTd).append(stuSexTd).append(stuEmailTd).append(stuTeacherTd).append(btnTd).appendTo("#stu_table tbody");
        });
    }

    function build_page_info(result) {
        $("#page_info_area").empty();
        $("#page_info_area").append("当前"+result.extend.pageInfo.pageNum+"页,总共"+result.extend.pageInfo.pages+"页,总"+result.extend.pageInfo.total+"条记录");
        totalRecord = result.extend.pageInfo.total;
        currentPage = result.extend.pageInfo.pageNum;
    }

    //解析显示分页条，点击分页要能去下一页....
    function build_page_nav(result) {
        $("#page_nav_area").empty();
        var ul = $("<ul></ul>").addClass("pagination");
        //构建元素
        var firstPageLi = $("<li></li>").append($("<a></a>").append("首页").attr("href","#"));
        var prePageLi = $("<li></li>").append($("<a></a>").append("&laquo;"));
        if(result.extend.pageInfo.hasPreviousPage == false){
            firstPageLi.addClass("disabled");
            prePageLi.addClass("disabled");
        }else {
            //为元素添加点击翻页的事件
            firstPageLi.click(function () {
                to_page(1);
            });
            prePageLi.click(function () {
                to_page(result.extend.pageInfo.pageNum - 1);
            })
        }
        var nextPageLi = $("<li></li>").append($("<a></a>").append("&raquo;"));
        var lastPageLi = $("<li></li>").append($("<a></a>").append("末页").attr("href","#"));
        if(result.extend.pageInfo.hasNextPage == false){
            nextPageLi.addClass("disabled");
            lastPageLi.addClass("disabled");
        }else {
            nextPageLi.click(function () {
                to_page(result.extend.pageInfo.pageNum + 1);
            });
            lastPageLi.click(function () {
                to_page(result.extend.pageInfo.pages);
            });
        }
        ul.append(firstPageLi).append(prePageLi);
        $.each(result.extend.pageInfo.navigatepageNums,function (index,item) {
            var numLi = $("<li></li>").append($("<a></a>").append(item));
            if(result.extend.pageInfo.pageNum == item){
                numLi.addClass("active");
            }
            numLi.click(function () {
                to_page(item);
            });
            ul.append(numLi);
        });
        //添加下一页和末页的提示
        ul.append(nextPageLi).append(lastPageLi);
        var navEle = $("<nav></nav>").append(ul);
        navEle.appendTo("#page_nav_area");
    }
    //清空表单样式及内容
    function reset_form(ele){
        $(ele)[0].reset();
        $(ele).find("*").removeClass("has-error has-success");
        $(ele).find(".help-block").text("");
    }

    <!--模态框-->
    $("#stu_add_modal_btn").click(function () {
        //清除表单数据
        reset_form("#stuAddModal form");
        //查询部门信息
        getTeacher("#stuAddModal select");
        //弹出模态框
        $("#stuAddModal").modal({
            backdrop:"static"
        });
    });
    //获取老师信息
    function getTeacher(ele) {
        $(ele).empty();
        $.ajax({
            url:"${APP_PATH}/teacher",
            type:"GET",
            success:function (result) {
                //console.log(result);
                $.each(result.extend.teacher,function () {
                    var optionEle = $("<option></option>").append(this.teName).attr("value",this.teId);
                    optionEle.appendTo($(ele))
                });
            }
        });
    }
    //数据校验
    function validate_add_form(){
        var stName = $("#stName_add_input").val();
        var regName = /(^[a-z0-9_-]{3,16}$)|(^[u2E80-\u9FFF]{2,5})/;
        if(!regName.test(stName)){
            show_validate_msg("#stName_add_input","error","必须是3-16位字母数字组合,或者2-5位汉字");
            return false;
        }else {
            show_validate_msg("#stName_add_input","success","")
        }

        var stEmail = $("#stEmail_add_input").val();
        var regEmail = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
        if(!regEmail.test(stEmail)){
            show_validate_msg("#stEmail_add_input","error","邮箱格式错误");
            return false;
        }else {
            show_validate_msg("#stEmail_add_input","success","");
        }
        return true;
    }
    //显示结果的校验信息
    function show_validate_msg(ele,status,msg){
        $(ele).parent().removeClass("has-success has-error");
        $(ele).next("span").text("");
        if("success" == status){
            $(ele).parent().addClass("has-success");
            $(ele).next("span").text(msg);
        }else if("error" == status){
            $(ele).parent().addClass("has-error");
            $(ele).next("span").text(msg);
        }
    }
    //改变校验
    $("#stName_add_input").change(function () {
        var stName = this.value;
        $.ajax({
            url:"${APP_PATH}/checkUser",
            type:"POST",
            data: "stName="+stName,
            success:function (result) {
                if(result.code==100){
                    show_validate_msg("#stName_add_input","success","用户名可用");
                    $("#stu_save_btn").attr("ajax-va","success");

                }else {
                    show_validate_msg("#stName_add_input","error",result.extend.va_msg);
                    $("#stu_save_btn").attr("ajax-va","error");
                }
            }
        });
    });

    //保存员工
    $("#stu_save_btn").click(function () {
        //进行数据校验
        if (!validate_add_form()){
            return false;
        }
        if($("#stu_save_btn").attr("ajax-va")=="error"){
            return false;
        }
        $.ajax({
            url:"${APP_PATH}/student",
            type:"POST",
            data: $("#stuAddModal form").serialize(),
            success:function (result) {
                if(result.code == 100){
                    //alert(result.msg);
                    //关闭模态框
                    $("#stuAddModal").modal('hide');
                    //显示最后一页
                    //发送ajax请求最后一页数据
                    //总记录数一定比总页数大
                    to_page(totalRecord);
                }else {
                    //显示失败信息
                    if(undefined != result.extend.errorfields.stEmail){
                        show_validate_msg("#stEmail_add_input","error",result.extend.errorfields.stEmail);                    }
                    if(undefined != result.extend.errorfields.stName){
                        show_validate_msg("#stName_add_input","error",result.extend.errorfields.stName);
                    }
                }
            }
        });
    });

    //1.我们是按钮创建之前就绑定click，所以绑不上
    //2.可以在创建按钮的时候绑定（2）、绑定单击事件.live方法
    //3.不过.live方法在jquary更新中淘汰了，替代的是.on方法，使用方法如下
    $(document).on("click",".edit_btn",function () {
        //把员工id给模态框更新按钮
        //弹出模态框
        $("#stuUpdateModal").modal({
            backdrop:"static"
        });
        //获取老师
        getTeacher("#stuUpdateModal select");
        getStudent($(this).attr("edit_id"));
        $("#stu_update_btn").attr("edit_id",$(this).attr("edit_id"));

    })
    //查询学生
    function getStudent(id) {
        $.ajax({
            url:"${APP_PATH}/stu/"+id,
            type:"GET",
            success:function (result) {
                var stuData = result.extend.stu;
                $("#stu_update_static").text(stuData.stName);
                $("#stEmail_update_input").val(stuData.stEmail);
                $("#stuUpdateModal input[name=stSex]").val([stuData.stSex]);
                $("#stuUpdateModal select").val([stuData.teId]);
            }
        });
    }

    $("#stu_update_btn").click(function () {
        var stEmail = $("#stEmail_update_input").val();
        var regEmail = /^([a-z0-9_\.-]+)@([\da-z\.-]+)\.([a-z\.]{2,6})$/;
        if(!regEmail.test(stEmail)){
            show_validate_msg("#stEmail_update_input","error","邮箱格式错误");
            return false;
        }else {
            show_validate_msg("#stEmail_update_input","success","");
        }
        //2.更新信息
        $.ajax({
            url:"${APP_PATH}/stu/"+$(this).attr("edit_id"),
            type:"PUT",
            //"&_method=PUT"的意思是把POST转化为PUT，与后台web.xml有关使用Rest风格的URI
            data:$("#stuUpdateModal form").serialize(),
            success:function (result) {
                // alert(result.msg);
                //关闭模态框
                $("#stuUpdateModal").modal("hide");
                //回到本页面
                to_page(currentPage);
            }
        });
    })
    //删除
    $(document).on("click",".delete_btn",function () {
        //1.弹出是否删除
        var stName = $(this).parents("tr").find("td:eq(2)").text();//找到第二个td
        if(confirm("确认删除【"+stName+"】吗？")){
            $.ajax({
                url:"${APP_PATH}/stu/"+$(this).attr("del_id"),
                type:"DELETE",
                //"&_method=PUT"的意思是把POST转化为PUT，与后台web.xml有关使用Rest风格的URI
                success:function (result) {
                    alert(result.msg);
                    to_page(currentPage);
                }
            });
        }
    })
    //完成全选全部选
    $("#check_all").click(function () {
        $(".check_item").prop("checked",$(this).prop("checked"));
    });

    $(document).on("click",".check_item",function () {
        alert( $(".check_item:checked").length);
        var flag = $(".check_item:checked").length==$(".check_item").length;
        $("#check_all").prop("checked",flag);
    });

    //全部删除
    $("#stu_delete_all_btn").click(function () {
        var stuName = "";
        var del_idstr = "";
        $.each($(".check_item:checked"),function () {
            stuName += $(this).parents("tr").find("td:eq(2)").text()+",";
            del_idstr += $(this).parents("tr").find("td:eq(1)").text()+"-";
        });
        stuName = stuName.substring(0,stuName.length-1);
        del_idstr = del_idstr.substring(0,del_idstr.length-1);
        if(confirm("确认删除【"+stuName+"】吗？")){
            $.ajax({
                url:"${APP_PATH}/stu/"+del_idstr,
                type:"DELETE",
                //"&_method=PUT"的意思是把POST转化为PUT，与后台web.xml有关使用Rest风格的URI
                success:function (result) {
                    alert(result.msg);
                    to_page(currentPage);
                }
            });
        }
    });
</script>
</body>
</html>

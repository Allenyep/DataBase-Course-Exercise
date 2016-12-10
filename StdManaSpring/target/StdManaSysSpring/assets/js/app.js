(function($) {
  'use strict';

  $(function() {
    var $fullText = $('.admin-fullText');
    $('#admin-fullscreen').on('click', function() {
      $.AMUI.fullscreen.toggle();
    });

    $(document).on($.AMUI.fullscreen.raw.fullscreenchange, function() {
      $fullText.text($.AMUI.fullscreen.isFullscreen ? '退出全屏' : '开启全屏');
    });
  });

    $("#Btn_login_std").on('click',function () {
        ajaxValidation();
    });
    
    $("#Btn_login_admin").on('click',function () {
        ajaxValidation_admin();
    });

    function ajaxValidation() {
        var account=$("#account").val();
        var userpwd=$("#password").val();
        $.ajax({
            type:"POST",
            url:"/login/validate/std",
            data:{ name: account, pwd: sha256_digest(userpwd) },
            beforeSend:function(){
                //打开模态框
                $("#modal-login").modal("open");
                 },
            success:function(data){
                if(data){
                    //alert("Data Loaded: " + data+"登录状态！");
                    //关闭模态框
                    //$("#modal-login").modal("close");
                    //跳转到学生详情页
                    location.href = "/student";
                }else{
                    $("#modal-login").modal("close");
                    $(".login-info").show();
                }
            }
        });
    }

    function ajaxValidation_admin() {
        var account=$("#account").val();
        var userpwd=$("#password").val();
        $.ajax({
            type:"POST",
            url:"/login/validate/zg",
            data:{ name: account, pwd: sha256_digest(userpwd) },
            beforeSend:function(){
                //打开模态框
                $("#modal-login").modal("open");
            },
            success:function(data){
                if(data){
                    //alert("Data Loaded: " + data+"登录状态！");
                    //关闭模态框
                    //$("#modal-login").modal("close");
                    //跳转到学生详情页
                    location.href = "/admin";
                }else{
                    $("#modal-login").modal("close");
                    $(".login-info").show();
                }
            }
        });
    }












    /*学生用户详情页面数据处理*/
    $("#personal-Info").on('click',function () {
        var ajaxContainer=$("#ajaxContainer");
        ajaxContainer.load("/views/personal-Info.html #Content");
    });
})(jQuery);
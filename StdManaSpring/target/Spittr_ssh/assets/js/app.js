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

    $("#Btn_login").on('click',function () {
        ajaxValidation();
    });

    function ajaxValidation() {
        var account=$("#account").val();
        var userpwd=$("#password").val();
        $.post("/login/validate",{ name: account, pwd: sha256_digest(userpwd) }, function(data){
            alert("Data Loaded: " + data+"登录成功！");
        });
    }












    /*学生用户详情页面数据处理*/

})(jQuery);
/**
 * Created by tanjian on 16/10/13.
 * js
 */
$(document).ready(function () {
    $("#iframeContent").attr("src", "../views/load.html");

    (function ($) {
        /*开启animations*/
        new WOW().init();

        var iframe = $("#iframeContent");
        var mymusicId = $("#mymusic");

        var navbarBtnfunc = {
            mymusic: function () {
                //TODO:完善逻辑
                /*1、如果浏览器cookie用户为空,则跳转登录*/
                /* mymusicId.attr("target","iframeContent").attr("href","../views/login.html");*/
                mymusicId.attr("target", "iframeContent").attr("href", "../views/personal.html");
            }
        };

        var detailsBtn = $(".detailsBtn");
        var evetfunc = {
            login: function () {

            },
            moreInfo: function () {
                //注意：此时在子界面中改变iframe元素内容，因此，应先获取父界面中iframe的id再进行改变
                iframe = $('#iframeContent', parent.document);
                iframe.attr("src", "../views/playlist.html");
            }
        };
        mymusicId.on("click", function () {
            navbarBtnfunc.mymusic();
        });
        detailsBtn.on("click", function () {
            evetfunc.moreInfo();
        });
    })(jQuery);


    (function ($) {
        var audio = $('footer #audioplayerprobar')[0];
        /*获取audio需要[0]，因为js操作获得的是audio对象，
         jQuery选择器获得的是jQuery对象，[0]对象的才是对应的节点对象，
         所以不能直接使用jQuery对象去操作。*/
        var btnGroupAudio = [$('.musicPre'), $('.musicStart'), $('.musicPause'), $('.musicNext')];
        var btnGroupFa=[$('.fa-star-o'),$('.fa-star')];
        var btnGroupVolume=[$('.fa-volume-up'),$('.fa-volume-off')];
        btnGroupAudio[2].hide();
        btnGroupFa[1].hide();
        btnGroupVolume[1].hide();
        var AudioPlayer = {
            play: function () {
                /*TODO:应该先暂停mv播放*/
                if (audio.paused) {
                    audio.play();
                    btnGroupAudio[1].hide();
                    btnGroupAudio[2].show();
                }
            },
            puase: function () {
                if (!audio.paused) {
                    audio.pause();
                    btnGroupAudio[2].hide();
                    btnGroupAudio[1].show();
                }
            }
        };


        btnGroupAudio[1].on('click', function () {
            AudioPlayer.play();
        });
        btnGroupAudio[2].on('click', function () {
            AudioPlayer.puase();
        });

        btnGroupFa[0].on('click',function(){
            //TODO:将该歌曲添加到个人收藏
            btnGroupFa[0].hide();
            btnGroupFa[1].show();
        });
        btnGroupFa[1].on('click',function(){
            //TODO:将该歌曲从个人收藏中删除
            btnGroupFa[1].hide();
            btnGroupFa[0].show();
        });

        btnGroupVolume[0].on('click',function(){
            btnGroupVolume[0].hide();
            btnGroupVolume[1].show();
        });
        btnGroupVolume[1].on('click',function(){
            btnGroupVolume[1].hide();
            btnGroupVolume[0].show();
        });

    })(jQuery);
});





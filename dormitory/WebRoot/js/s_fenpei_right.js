	/*luoqin*/
	/*�������䲽����ת*/
	$(".right_ul_newfenpei li:first-child").click(function(){
		$("#base_right").empty().load("super/s_newstu_fenpei.html");
	});
	$(".right_ul_newfenpei li:nth-child(2)").click(function(){
		if(sum_newfenpei>0){
		$(".right_contain").empty().load("super/s_qinshi_xuanze.html");
		$(this).find("a").addClass("editornav").parent().siblings().find("a").removeAttr("class");/*����һ�������ʽ*/
		}
	});
	$(".right_ul_newfenpei li:nth-child(3)").click(function(){
		if(sum_newstu_kong>0){
		$(".right_contain").empty().load("super/s_fenpei_finish.html");
		$(this).find("a").addClass("editornav").parent().siblings().find("a").removeAttr("class");
		}
	});
	/*���ҵ�����ת*/
$(".right_ul_diaohuan li:first-child").click(function(){
		$("#base_right").empty().load("super/s_qinshi_diaohuan.html");
	});
	$(".right_ul_diaohuan li:nth-child(2)").click(function(){
		if(sum_diaohuan>0){
		$(".right_contain").empty().load("super/s_atuo_qsxuanze.html");
		$(this).find("a").addClass("editornav").parent().siblings().find("a").removeAttr("class");
		}
	});
	$(".right_ul_diaohuan li:nth-child(3)").click(function(){
		if(sum_dhstu_kong>0){
		$(".right_contain").empty().load("super/s_fenpei_finish.html");
		$(this).find("a").addClass("editornav").parent().siblings().find("a").removeAttr("class");
		}
	});
	$(".right_ul_diaohuan li:nth-child(4)").click(function(){
		$(".right_contain").empty().load("super/s_diaohuan_yijian.html");
		$(this).find("a").addClass("editornav").parent().siblings().find("a").removeAttr("class");
	});
	/*��������Ա���ѧ����Ϣģ����ת*/
	$(".right_ul_tianjia li:first-child").click(function(){//���ѧ��
		$("#base_right").empty().load("super/s_tianjia_xuesheng_xinxi.html");
		$(this).find("a").addClass("editornav").parent().siblings().find("a").removeAttr("class");
	});
	$(".right_ul_tianjia li:nth-child(2)").click(function(){//�������ѧ��
		$(".right_contain").empty().load("super/s_piliang_daoru.html");
		$(this).find("a").addClass("editornav").parent().siblings().find("a").removeAttr("class");
	});
	/*У��ס�޹���ģ����ת*/
	$(".right_ul_xiaowai li:first-child").click(function(){//У��ס�޹�����ת
		$("#base_right").empty().load("super/s_xiaowai_zhusu_guanli.html");
		$(this).find("a").addClass("editornav").parent().siblings().find("a").removeAttr("class");
	});
	$(".right_ul_xiaowai li:nth-child(2)").click(function(){//���У��ס�޹�����ת
		$(".right_contain").empty().load("super/s_tianjia_xiaowai.html");
		$(this).find("a").addClass("editornav").parent().siblings().find("a").removeAttr("class");
	});
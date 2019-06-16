$(document).ready(function() {	
	$(".studentApplicationSumbit").click(function(){
		var values= "";
		if(!$(':checkbox[name=studentCourseAdd]:checked').length) {
		    alert('请选择你选课的科目');
		}
		else
		{
		
        $("input:checkbox[name='studentCourseAdd']:checked").each(function () {
        	values+= $(this).val() + ",";
        });
//        alert(values);
      		$.ajax({
			method: 'GET',
	        url: "/courseApplicationAdd/"+values,
	        dataType : "json"
	    }).then(function(data) {
	    	 var str1 = "";
	    	 var total=$(':checkbox[name=studentCourseAdd]:checked').length;
	    	 $(".x_content").html("");
	    	 if(data==0)
	    		 {
	    		 $(".x_content").append("此科目你已经选择过了,请核对你课程表信息");
	    		 }
	    	 else if($(':checkbox[name=studentCourseAdd]').length!=data){
	    		 $(".x_content").append("你已经选择了"+data+"科目",total-data+"未选择成功");
	    	 }
	    	 else {
	    		 $(".x_content").append("你已经选择了"+data+"科目");
	    	 }
	    	
	    });
		}
	}); 
	
});

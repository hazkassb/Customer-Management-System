
$('document').ready(function(){
	
	$('.table .btn').on('click',function(event){
		
		event.preventDefault();
		
		var href = $(this).attr('href');
		$.get(href, function(customer, status){
			$('#IdEdit').val(customer.Id);
			$('#nameEdit').val(customer.name);
			$('#departmentEdit').val(customer.department);
			$('#updatedByEdit').val(customer.updatedBy);
			$('#updatedOnEdit').val(customer.updatedOn.substr(0, 10));
			$('#editModal').modal();
			
		});
		
		
		
	});
	
	$('.table #deleteButton').on('click',function(event){
		event.preventDefault();		
		var ref = $(this).attr('href');
		$('#deleteModal #delRef').attr('ref', ref);		
		$('#deleteModal').modal();
	});
	
});

/**
 * 
 */
alert("script2");
$(document).ready (function()
{
	$('#btnAcepta').click(function()
	{
		alert("Entro el boton")
		var contenidoCajaTexto= $('#txtTesto').val();
		alert("contenido de la caja de texto\n"+contenidoCajaTexto);
		/*$.getJSON("data/data.json",function(data)
				{
					//alert("Datos:"+data+"\nStatus:"+status);
					alert('Contenido de data:');
					$('#divTestoBienbenida').html("resultado de mi Jquery\n"+data.peliculas[3].nombre);
				});*/
				
		$.ajax
			({
				type:'GET',
				data:{contenidoCajaTexto:contenidoCajaTexto },
				url :'data/data.json',
				success: function(data)
				{
					$('#divTestoBienbenida').html("Resultado de mi jquery\n"+data.peliculas[3].nombre);
				},
				error: function(data)
				{
					$('#divTestoBienbenida').html("Resultado");
				}
			});
	});
});

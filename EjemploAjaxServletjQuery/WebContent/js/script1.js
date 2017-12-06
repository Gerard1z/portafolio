/**
 * 
 */
alert("scrpt1");

document.getElementById('btnAcepta').onclick = function(evnt)
{
	//alert("Entro al boton");
	var xhr = new XMLHttpRequest();
	var contenidoCajaTexto = document.getElementById("txtTesto");
	
	//alert("contenido de la caja de texto:"+contenidoCajaTexto.value);
	xhr.onreadystatechange = function ()
		{
		//alert("State:"+xhr.readyState+" Status:"+xhr.status);
			if(xhr.readyState == 4 && xhr.status==200)
				{
				   document.getElementById("divTestoBienvenida").innerHTML = contenidoCajaTexto.value+"contenido del Json:" +xhr.responseText;
				}
		}
	xhr.open("GET","data/data.json",true);
	xhr.send();
}
/**
 * 
 */
//alert("si estoy corriendo");

var xhr = new XMLHttpRequest();//objeto AJAX
	
//forma 1
document.getElementById('botoncito').onclick = function (evnt) 
  {
	xhr.open("get","data/usuarios.xml",true);
	xhr.onreadystatechange = function()
		{
			if(xhr.readyState == 4 && xhr.status==200)
				{
					document.getElementById('resultado_ajax').innerHTML = xhr.responseText;
				}
		}
	xhr.send();
  }








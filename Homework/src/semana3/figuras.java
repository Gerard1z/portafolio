package semana3;

public class figuras {
	
		private int iradio;
		private int ibaseRec;
		private int ialturaRec;
		private int iladoCuadro;
		private int ibaseMenorTrapecio;
		private int ibaseMayorTrapecio;
		private int ialturaTrapecio;
		private int iladoTrapecio;
		private int idiagoMayor;
		private int idiagoMenor;
		private int iladoRombo;
		private float area;
		private float perimetro; 
		
		public void setRadio(int iradio)
		{
			this.iradio = iradio;
		}
		public void setBaseRectangulo(int ibaseRec)
		{
			this.ibaseRec = ibaseRec;
		}
		public void setAlturaRectangulo(int ialturaRec)
		{
			this.ialturaRec = ialturaRec;
		}
		public void setLadoCuadro(int iladoCuadro)
		{
			this.iladoCuadro = iladoCuadro;
		}
		public void setBaseMenor(int ibaseMenorTrapecio)
		{
			this.ibaseMenorTrapecio = ibaseMenorTrapecio;
		}
		public void setBaseMayor(int ibaseMayorTrapecio)
		{
			this.ibaseMayorTrapecio = ibaseMayorTrapecio;
		}
		public void setAlturaTrapecio(int ialturaTrapecio)
		{
			this.ialturaTrapecio = ialturaTrapecio;
		}
		public void setLadoTrapecio(int iladoTrapecio)
		{
			this.iladoTrapecio = iladoTrapecio;
		}
		public void setDiagonalMayor(int idiagoMayor)
		{
			this.idiagoMayor = idiagoMayor;
		}
		public void setDiagonalMenor(int idiagoMenor)
		{
			this.idiagoMenor = idiagoMenor;
		}
		public void setLadoRombo(int iladoRombo)
		{
			this.iladoRombo = iladoRombo;
		}
		protected void calculaAreaCirculo()
		{
			area = (float)(Math.pow(iradio,2)*Math.PI);
		}
		protected void calculaPerimetroCirculo()
		{
			perimetro = (float)((iradio*2)*Math.PI);
		}
		protected void calcularAreaRectangulo()
		{
			area = (float)(ibaseRec*ialturaRec);
		}
		protected void calcularPerimetroRectangulo()
		{
			perimetro = (float)(ibaseRec*2+ialturaRec*2);
		}
		protected void calcularAreaCuadro()
		{
			area = (float)(iladoCuadro*iladoCuadro);
		}
		protected void calcularPerimetroCuadro()
		{
			perimetro = (float)(iladoCuadro*4);
		}
		protected void calcularAreaTrapecio()
		{
			area = (float)(((ibaseMayorTrapecio+ibaseMenorTrapecio)/2)*ialturaTrapecio);
		}
		protected void calcularPerimetroTrapecio()
		{
			perimetro = (float)(ibaseMayorTrapecio+ibaseMenorTrapecio+(iladoTrapecio*2));
		}
		protected void calcularAreaRombo()
		{
			area = (float)((idiagoMayor*idiagoMenor)/2);
		}
		protected void calcularPerimetroRombo()
		{
			area = (float)(iladoRombo*4);
		}
		public float getArea()
		{
			return area;
		}
		public float getPerimetro()
		{
			return perimetro;
		}
	

}

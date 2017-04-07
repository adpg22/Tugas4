public class motor { // ini kelas induk
    
	 public void melaju (){
	 System.out.println("Motor Melaju");
}
	public void mengerem (){
		System.out.println("Motor Mengerem");
	}
	public void cepat (){
		System.out.println("Motor Cepat");
	}
}
 
 class yamaha extends motor {

 	public void melaju(){
 		System.out.println("");
 		System.out.println("Motor Yamaha Sedang Melaju");
 	}
 	public void mengerem (){
 		System.out.println("Motor Yamaha Sedang Mengerem");
 	}
 	public void cepat(){
 		System.out.println("Motor Yamaha Melaju Cepat");
 	}

 	public void tampil(){
 		super.mengerem();
 		super.melaju();
 		super.cepat();
 	}

 	
 }
 
  class honda extends motor {

 	public void melaju(){
 		System.out.println("");
 		System.out.println("Motor Honda Sedang Melaju");
 	}
 	public void Mengerem(){
 		System.out.println("Motor Honda Sedang Mengerem");
 	}
 	public void cepat (){
 		System.out.println("Motor Honda Melaju Cepat");
 	}

 	/*public void tampil(){
 		super.Melaju();
 		super.Mengerem();
 		super.Cepat();
 	}*/
 	
 }
 	class cetak{
 		public static void main(String []args){
 		yamaha Yamaha = new yamaha();
 		honda Honda = new honda();
 		
 		Yamaha.tampil();
 		Yamaha.melaju();
 		Yamaha.mengerem();
 		Yamaha.cepat();

 		Honda.melaju();
 		Honda.mengerem();
 		Honda.cepat();

 		 	}
 		 }
 
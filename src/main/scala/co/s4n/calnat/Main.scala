package co.s4n.calnat

import scala.io.StdIn

object Main extends App{
	def leerint(prompt:String):Int = {
		val s = StdIn.readLine(prompt)
		s.toInt
	}
	
	def esCero(nat:Nat)=nat match{
		case Cero() => true
		case Suc(nat) => false
	}
	
	//Convierte un entero a un valor natural
	def conIntANat(ent:Int):Nat = {
		
		def iconv(n:Int,num:Nat):Nat= n match{
			case 0 => num
			case n => iconv(n-1,Suc(num))
		}
		
		val a = Cero()
		
		iconv(ent,a)	
	
	}	
	
	//Imprimir un natural siguiendo su estructura
	def imprimirNat(nat:Nat):String ={	
  		
		
	
	}
	
	//Toma dos naturales y realiza la suma entre ellos
	def sumaNat(nat1:Nat,nat2:Nat):Nat = {
  		def isum(a:Int,b:Nat,c:Nat):Int = {
    			val temp1=conIntANat(a-1)
    			if (b==c)  a
    			else isum(a+1,b,temp1)
  		}
  		val mTemp= Cero()
  		conIntANat(isum(1,nat1,mTemp)+isum(1,nat2,mTemp))	
  		
  	}
  	
  	print(("Leer primer entero"))
  	val a1=leerint("")
  	print(("Leer segundo entero"))
  	val a2=leerint("")
  	
  	imprimirNat(sumaNat(conIntANAt(a1),conIntANAt(a2)))

	
}



package interfaces;

//Bir class sadece 1 class' ve abstract class'ı miras alabilir.
//Bir class birden fazla interface'i implement edebilir.
public class MySqlCustomerDal extends OracleCustomerDal implements IRepository {

	@Override
	public void add() {
		System.out.println("MySql'e eklendi");	
	}
}

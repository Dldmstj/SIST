package javaexp.a09_inherit.abstrac;

import java.util.ArrayList;

public class A02_CompanyAbstract {

	public static void main(String[] args) {
		/*
		 ex)
		   상위 추상 Company 클래스: 필드 - 회사명, working() 공통, 추상earnMoney() 돈을 버는 방법
		   하위 실제 클래스 (HyunDai, Samsung)
		 */
		ArrayList<Company> comlist= new ArrayList<Company>();
		comlist.add(new HyunDae());
		comlist.add(new Samsung());
		for(Company com: comlist) {
			com.earnMoney();
		}
	}

}
abstract class Company {
	private String companyName;
	
	public Company(String companyName) {
		this.companyName = companyName;
	}
	public void working() {
		System.out.println(companyName + "가 일을 합니다.");
	}
	abstract void earnMoney();
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
}
class HyunDae extends Company{

	public HyunDae() {super("현대");}
	@Override
	void earnMoney() {
		System.out.println(getCompanyName()+"(이)가 자동차를 만들어서 돈을 법니다.");
	}
}
class Samsung extends Company{
	public Samsung() {super("삼성전자");}
	@Override
	void earnMoney() {
		System.out.println(getCompanyName() + "(이)가 전자기기를 만들어서 돈을 법니다.");
	}
	
}
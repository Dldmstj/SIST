package javaexp.a08_relation.vo;

public class Mart {
	
	private String mname;
	private Product[] pArry;
	private String buyer;
	private int bIdx;		// 구매 index;
	
	public Mart() {}

	public Mart(String mname) {
		this.mname = mname;
	}
	// 구매 갯수와 구매자 처리 메서드
	public void buyProdPlan(String buyer, int cnt) {
		this.buyer = buyer;
		pArry = new Product[cnt];	// 받은 cnt 값의 크기만큼 pArry 배열생성
		bIdx = 0;		// 구매자에 따라 구매 종류 초기화. (buyProdPlan() 메소드 호출할 때마다 bIdx 값은 0으로 초기화)
		System.out.println(buyer+"가 물건 "+cnt+"종을 구매하려고 합니다.");
	}
	// 단위 구매 내용 처리
	public void buyProduct(Product prod) {
		
		if(pArry != null) {		// pArry 배열이 비어있을 때 (nullpoint error 방지)
		
//			System.out.println(buyer+"가 " +mname+ "에서 물건을 구매함");
			int cnt = pArry.length;
			// 구매하는 물건의 index가 구매할 갯수보다 작아야 한다.
			if(bIdx < cnt) {	// product 배열의 길이보다 bIdx가 작을 때	
				// pArr의 크기가 3이면 bIdx가 0~2일 때 아래 구문 출력
				pArry[bIdx] = prod;
				System.out.print((bIdx+1)+"번째 물건 " + prod.getName());
				System.out.println("를 " + prod.getCnt()+"개 구매함");
				bIdx++;		// buyProduct() 메소드 호출할 때마다 bIdx 1씩 증가
				if(bIdx == cnt) {	// bIdx가 pArry배열의 크기랑 같아지면
					// pArr의 크기가 3인데 bIdx가 3이 되면 더이상 구매 x
					System.out.println("구매가 완료되었습니다.");		// 구매 완료 출력
				}
				
			}else {		// product 배열의 길이보다 bIdx가 커지면
				// pArr의 크기가 3인데 bIdx가 1 더 증가되어 4가 되면
				System.out.println("구매하려고 한 종류는 " + cnt + "개 이므로 더이상 구매할 수 없습니다.");
					// 구매 불가 출력
				
			}
		}else {
			checkValid();
			
		}
	}
	
	private void checkValid() {
		System.out.println("구매자와 구매할 갯수를 입력 처리 필요합니다!");
		System.out.println("buyProdPlan(구매자명,구매종류 갯수)호출 필요!");		
	}
	
	public void buyList() {
		if( pArry != null) {
		System.out.println(buyer +"가" +mname+"에서 구매한 물건 정보");
		System.out.println("총 종류 갯수: "+pArry.length+"종");
		System.out.println("물건명 \t가격\t갯수\t단위계");
		int tot = 0;
		for(Product prod:pArry) {
			tot+=prod.totBuyInfo();
		}
		System.out.println("총 구매 비용:"+tot);
	}else {
		checkValid();
	}
	}
}


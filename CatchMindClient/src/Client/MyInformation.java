package Client;
public class MyInformation {

	private String gameId;
	private String numId;
	private int level;
	private int exp;
	private int avatar;
	private int coin;
	private String introduce;
	private int MoreExp;
	private int MoreCoin;
	private int Oneword;
	private int Howmanyword;

	public MyInformation() {
		// TODO Auto-generated constructor stub
		gameId="";
		numId="";
		level=1;
		exp=0;
		setCoin(0);
		setAvatar(0);
		introduce="";

	}

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public String getNumId() {
		return numId;
	}

	public void setNumId(String numId) {
		this.numId = numId;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
		
	}

	public String getIntroduce() {
		return introduce;
	}

	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	public int getCoin() {
		return coin;
	}

	public void setCoin(int coin) {
		this.coin = coin;
	}

	public int getAvatar() {
		return avatar;
	}

	public void setAvatar(int avatar) {
		this.avatar = avatar;
	}
	
	public void upCoin(int coin){
		this.coin+=coin;
	}
	
	public void upExp(int exp)
	{
		this.exp+=exp;
		if(this.exp>=400)
		{
			this.exp=this.exp-400;
			this.level++;
		}
	}
	
	public int getMoreExp() {
		return MoreExp;
	}

	public void setMoreExp(int moreExp) {
		MoreExp = moreExp;
	}

	public int getMoreCoin() {
		return MoreCoin;
	}

	public void setMoreCoin(int moreCoin) {
		MoreCoin = moreCoin;
	}

	public int getOneword() {
		return Oneword;
	}

	public void setOneword(int oneword) {
		Oneword = oneword;
	}

	public int getHowmanyword() {
		return Howmanyword;
	}

	public void setHowmanyword(int howmanyword) {
		Howmanyword = howmanyword;
	}

}

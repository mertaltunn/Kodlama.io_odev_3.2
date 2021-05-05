package Entities;

public class Campaign {

	private int campaingId;
	private String campaingName;
	private int campaingDiscountPercent;
	public Game game;

	public Campaign(int campaingId, String campaingName, int campaingDiscount, Game game) {
		this.campaingId = campaingId;
		this.campaingName = campaingName;
		this.campaingDiscountPercent = campaingDiscount;
		this.game = game;
	}

	public int getCampaingId() {
		return campaingId;
	}

	public void setCampaingId(int campaingId) {
		this.campaingId = campaingId;
	}

	public String getCampaingName() {
		return campaingName;
	}

	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}

	public int getCampaingDiscountPercent() {
		return campaingDiscountPercent;
	}

	public void setCampaingDiscountPercent(int campaingDiscount) {
		this.campaingDiscountPercent = campaingDiscount;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}
}

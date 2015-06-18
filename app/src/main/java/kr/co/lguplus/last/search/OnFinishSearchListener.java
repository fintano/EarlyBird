package kr.co.lguplus.last.search;

import java.util.List;

import kr.co.lguplus.last.search.Item;

public interface OnFinishSearchListener {
	public void onSuccess(List<Item> itemList);
	public void onFail();
}

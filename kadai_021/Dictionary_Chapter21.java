package kadai_021;
import java.util.HashMap;
public class Dictionary_Chapter21 {

	HashMap<String,String>Dictionary =new HashMap<String,String>();

	public  Dictionary_Chapter21(){
		Dictionary.put("apple","りんご");
		Dictionary.put("peach","桃");
		Dictionary.put("banana","バナナ");
		Dictionary.put("lemon","レモン");
		Dictionary.put("pear","梨");
		Dictionary.put("kiwi","キウィ");
		Dictionary.put("strawberry","いちご");
		Dictionary.put("grape","ぶどう");
		Dictionary.put("muscat","マスカット");
		Dictionary.put("cherry","さくらんぼ");


	}


	public void Search(String[]fruit){
		for(int i=0;i<fruit.length;i++) {
			if(Dictionary.get(fruit[i])!=null) {
				System.out.println(fruit[i]+"の意味は"+Dictionary.get(fruit[i]));
			}else{
				System.out.println((fruit[i])+"は辞書に存在しません");


			}
		}
	}




}

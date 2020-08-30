package backingBeans;

import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class TopPage implements Serializable{
	private Integer number;
	private String name="堀内";

	public String next(){
                System.out.println("number="+this.number+"/ name="+this.name);
                test();
		System.out.println("number="+this.number+"/ name="+this.name);
//                test();

//ここはpublic void test()も、public String test()も、可
		return "output.xhtml";
//                return "https://www.google.com/?hl=ja";は不可でった
//                多分、プロジェクト内のファイルでないとだめなのだろう
	}
        public String test(){
            this.name = "test";
            return this.name;
        }
//        public void test(){
//            this.name = "test";
//        }
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public Integer getNumber(){
		return number;
	}
	public void setNumber(Integer number){
		this.number = number;
	}
}

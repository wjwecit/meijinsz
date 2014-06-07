public class Regex{

  //正则去除标签外正文中匹配关键字方法：
  public static void regMatchNoneTag(){

      String regex="(?!<[^>]*)((?:c)|(?:b))(?![^<]*>)";
  		Pattern p=Pattern.compile(regex);
  		String text="aaa<img src=\"bbb\"/>bc<a href=\"b\">d</a>";
  		Matcher m=p.matcher(text);
  		while(m.find()){
  			for(int i=0;i<m.groupCount();i++){
  				System.out.println(i+":"+m.group());
  			}
  			System.out.println(m.replaceAll("<span class=\"msg\">$1</span>"));
  		}
      System.out.println(text.replaceAll(regex, "<span class=\"msg\">$1</span>"));

  }
}

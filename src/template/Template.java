package template;

import java.util.HashMap;
import java.util.Map;

/*CREATE BY ECLIPSE*/
/**************************************************************************
 * NAME : Template.java 
 * DATE : 22-May-2018 
 * DESCRIPTION : this is a template file, please add u gitHub name in this file then push it to u repository
 * 
 * MODIFICATION HISTORY 
 * Name 		   Date 		 Description 
 * =============== ============= =================================
 * Ricci Liao 	   12-Feb-2018   Initial
 **************************************************************************/

public class Template {
	public Template() {
		Map<String, String> gitHubMap = new HashMap<>();
		/*
		 * we should encapsulate all common methods in a 'Common.java' file 
		 * for example: isNullOrSpace(String target);dateToString(Date target) ...... 
		 * each function  in 'Common.java' file should be a static type 
		 * invoke: Common.isNullOrSpace(string);
		 * 
		 * we should encapsulate all common value in a 'Constants.java' file 
		 * for example: Regular Expression;Common Value ...... 
		 * format: NUMBER_REGEX;MIN_USER_NAME_LENGTH ...... 
		 * each constant in 'Constants.java' file should be a static and final type 
		 * refer: Constants.NUMBER_REGEX
		 * 
		 * 我们应该把一些常用的方法封装在 'Common.java' 文件 
		 * 例如：isNullOrSpace(String target);dateToString(Date target) 等等 
		 * 每一个在 'Common.java' 文件里面的方法应该设为 static 的类型 
		 * 调用：Common.isNullOrSpace(string);
		 * 
		 * 我们应该把一些常量封装在 'Constants.java' 文件中 
		 * 例如：正则表达式；常用值 等等 
		 * 格式：NUMBER_REGEX;MIN_USER_NAME_LENGTH 等等 
		 * 每个在 'Constants.java' 文件中的常量的类型应该为 static 和 final
		 * 引用：Constants.NUMBER_REGEX
		 * 
		 */
		
		/* ------ 美丽的分割线 ------ */
		
		/*
		* 
		* we should add our own GitHub name and date after we add or modify the code
		* we should comment out the ori-code instead of delete it when we modify the code
		* we can add some simple desc if u consider the delta are too complex
		* we had better to add a simple history record in 'MODIFICATION HISTORY' to desc what we have done in each modified file when we before commit the delta
		* for example:
		* 
		* 我们在添加或修改代码的时候添加自己的 GitHub 名字和日期
		* 当我们在修改代码的时候应该先把原代码注释掉而不是删除它
		* 当我们觉得修改的代码比较复杂的时候我们可以添加一些简单的说明
		* 在我们提交代码之前，最好先在每个修改过的文件的 'MODIFICATION HISTORY' 区域添加一个简单的修改描述
		* 栗子：
		* 
		*      👇👇👇👇👇👇👇
		* 
		*/
		// RicciLiao 20180522 start --
		/*String strOld = new String("这是需要修改的代码");*/
		String strNew = new String("这是修改后的代码");	// 一些简单的说明
		// RicciLiao 20180522 end --
		
		/* ------ 美丽的分割线 ------ */
		
		/*
		 * 现在我们来添加我们的代码，然后 commit → push → pull create
		 * 把我们的姓名和 GitHub 帐号名 put 进 gitHubMap 中
		 *       👇👇👇👇👇👇👇
		 * 
		 */
		
	
	}
}

package edu.nuc.onlinedu.action.login;



import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.nuc.onlinedu.model.loginModel;


public class loginAction extends ActionSupport implements ModelDriven<loginModel>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private loginModel login=new loginModel();
		public String execute() {
			String check=(String)ActionContext.getContext().getSession().get("Rand");
        	if(login.getUsername().equals("徐涛")&&login.getPassword().equals("123")&&login.getChecking().equals(check)&&login.getType().equals("管理员")) {
        		ActionContext.getContext().getSession().put("user", login.getUsername());
        	return SUCCESS;
        }else {
        	ActionContext.getContext().put("error","用户名或密码或验证码或用户类型错误");
        	return ERROR;
        }
      }
		//检验数据的正确性  equalsignoreCase在比较时忽略大小写
		/*
		 * null代表一个空对象，没有分配内存空间，""代表一个字符为空的对象，已经分配了内存空间
		 * 并没有实例化对象，对象可能不为空
		 * 
		 */
		@Override
		public void validate() {
			// TODO Auto-generated method stub
			if(login.getUsername()==null||login.getUsername().trim().equalsIgnoreCase("")) {
				this.addFieldError("username","用户名不能为空");
			}
			if(login.getPassword()==null||login.getPassword().trim().equals("")) {
				this.addFieldError("password","密码不能为空");
			}
			if(login.getChecking()==null||login.getChecking().trim().equals("")) {
				this.addFieldError("checking","验证码不能为空");
			}
		}
		@Override
		public loginModel getModel() {
			// TODO Auto-generated method stub
			return login;
		}
}

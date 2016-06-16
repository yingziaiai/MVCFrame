package filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import model.ActionDispather;
import model.ValueStackHelper;

public class FilterDispather implements Filter{
private	ValueStackHelper valueStackHelper=new ValueStackHelper();
ActionDispather actionDispatcher=new ActionDispather();
public void destroy(){
	
}
public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain){
	
}
public void init(FilterConfig arg0){
	
}
private String getActionNameFromURL(HttpServletRequest req){
	String path=(String)req.getRequestURI();
	String actionName=path.substring(path.lastIndexOf("/"), path.lastIndexOf("."));
	return actionName;
}
}

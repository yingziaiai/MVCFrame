package model;

import java.util.ArrayList;

public class ActionDispather implements IActionDispather {
private ActionManager actionManager=new ActionManager();
private ArrayList<Interceptors> listInterceptors=InterceptorFactory.createInterceptors();
public String actionInvoke(String actionName){
	return actionManager.execAction(actionName);
}
}

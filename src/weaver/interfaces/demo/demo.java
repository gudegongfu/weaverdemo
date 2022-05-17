package weaver.interfaces.demo;

import weaver.general.BaseBean;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.RequestInfo;

/**
 * @description:
 * @Author: JZF
 * @DateTime: 2022/4/26 17:19
 */
public class demo implements Action {
   @Override
   public String execute(RequestInfo requestInfo) {
      BaseBean bs = new BaseBean();
      bs.writeLog("ceshi");
      return SUCCESS;
   }
}

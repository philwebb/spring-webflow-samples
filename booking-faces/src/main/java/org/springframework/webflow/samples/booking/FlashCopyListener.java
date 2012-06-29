package org.springframework.webflow.samples.booking;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.FlashMap;
import org.springframework.web.servlet.FlashMapManager;
import org.springframework.web.servlet.support.RequestContextUtils;
import org.springframework.webflow.context.ExternalContext;
import org.springframework.webflow.core.collection.AttributeMap;
import org.springframework.webflow.execution.FlowExecutionListenerAdapter;
import org.springframework.webflow.execution.FlowSession;
import org.springframework.webflow.execution.RequestContext;

@Component
public class FlashCopyListener extends FlowExecutionListenerAdapter {

	@Override
	public void sessionEnded(RequestContext context, FlowSession session, String outcome, AttributeMap<?> output) {
//		ExternalContext externalContext = context.getExternalContext();
//		HttpServletRequest request = (HttpServletRequest) externalContext.getNativeRequest();
//		HttpServletResponse response = (HttpServletResponse) externalContext.getNativeResponse();
//		FlashMapManager manager = RequestContextUtils.getFlashMapManager(request);
//		FlashMap flashMap = new FlashMap();
//		flashMap.putAll(context.getFlashScope().asMap());
//		manager.saveOutputFlashMap(flashMap , request, response);
	}
	
}

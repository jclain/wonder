package er.extensions.components._ajax;

import com.webobjects.appserver.*;

import er.ajax.AjaxUtils;
import er.extensions.components.ERXErrorDictionaryPanel;

// Generated by the WOLips Templateengine Plug-in at Aug 22, 2008 2:00:04 PM
public class ERXAjaxErrorDictionaryPanel extends ERXErrorDictionaryPanel {
    public ERXAjaxErrorDictionaryPanel(WOContext context) {
        super(context);
    }
    
    // R/R
    @Override
	public void appendToResponse(WOResponse response, WOContext context) {
    	super.appendToResponse(response, context);
        AjaxUtils.addScriptResourceInHead(context, response, "prototype.js");
    }
}
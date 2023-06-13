package zendesk.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
/* loaded from: classes8.dex */
class ZendeskActionHandlerRegistry implements ActionHandlerRegistry {
    private static final Comparator<ActionHandler> PRIORITY_ACTION_HANDLER_COMPARATOR = new Comparator<ActionHandler>() { // from class: zendesk.core.ZendeskActionHandlerRegistry.2
        @Override // java.util.Comparator
        public int compare(ActionHandler actionHandler, ActionHandler actionHandler2) {
            return actionHandler2.getPriority() - actionHandler.getPriority();
        }
    };
    private List<ActionHandler> registry = new ArrayList();

    @Override // zendesk.core.ActionHandlerRegistry
    public void add(ActionHandler actionHandler) {
        if (actionHandler == null) {
            return;
        }
        this.registry.add(actionHandler);
    }

    @Override // zendesk.core.ActionHandlerRegistry
    public void clear() {
        this.registry.clear();
    }

    @Override // zendesk.core.ActionHandlerRegistry
    public ActionHandler handlerByAction(String str) {
        if (C44504lS5.m27271d(str)) {
            return null;
        }
        ArrayList<ActionHandler> arrayList = new ArrayList(this.registry);
        Collections.sort(arrayList, PRIORITY_ACTION_HANDLER_COMPARATOR);
        for (ActionHandler actionHandler : arrayList) {
            if (actionHandler.canHandle(str)) {
                return actionHandler;
            }
        }
        return null;
    }

    @Override // zendesk.core.ActionHandlerRegistry
    public List<ActionHandler> handlersByAction(final String str) {
        if (C44504lS5.m27271d(str)) {
            return Collections.emptyList();
        }
        List<ActionHandler> m29951f = C43505jm0.m29951f(this.registry, new InterfaceC42043hI6<ActionHandler, Boolean>() { // from class: zendesk.core.ZendeskActionHandlerRegistry.1
            @Override // p000.InterfaceC42043hI6
            public Boolean apply(ActionHandler actionHandler) {
                return Boolean.valueOf(actionHandler.canHandle(str));
            }
        });
        Collections.sort(m29951f, PRIORITY_ACTION_HANDLER_COMPARATOR);
        return m29951f;
    }

    @Override // zendesk.core.ActionHandlerRegistry
    public void remove(ActionHandler actionHandler) {
        if (actionHandler == null) {
            return;
        }
        this.registry.remove(actionHandler);
    }

    @Override // zendesk.core.ActionHandlerRegistry
    public void updateSettings(Map<String, AbstractC52360yi2> map) {
        for (ActionHandler actionHandler : this.registry) {
            if (actionHandler != null) {
                actionHandler.updateSettings(map);
            }
        }
    }
}

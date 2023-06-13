package zendesk.core;

import java.util.List;
import java.util.Map;
/* loaded from: classes8.dex */
public interface ActionHandlerRegistry {
    void add(ActionHandler actionHandler);

    void clear();

    ActionHandler handlerByAction(String str);

    List<ActionHandler> handlersByAction(String str);

    void remove(ActionHandler actionHandler);

    void updateSettings(Map<String, AbstractC52360yi2> map);
}

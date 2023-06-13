package zendesk.core;

import android.content.Context;
import java.util.Map;
/* loaded from: classes8.dex */
public interface ActionHandler {
    boolean canHandle(String str);

    ActionDescription getActionDescription();

    int getPriority();

    void handle(Map<String, Object> map, Context context);

    void updateSettings(Map<String, AbstractC52360yi2> map);
}

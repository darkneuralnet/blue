package zendesk.support.guide;

import java.util.List;
import zendesk.support.HelpItem;
/* loaded from: classes8.dex */
public interface HelpMvp$View {
    void addItem(int i, HelpItem helpItem);

    void removeItem(int i);

    void showItems(List<HelpItem> list);
}

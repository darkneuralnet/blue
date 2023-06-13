package zendesk.messaging.p061ui;

import android.view.MenuItem;
import android.view.View;
import java.util.Set;
import p000.C51670xY3;
import zendesk.messaging.R$id;
import zendesk.messaging.R$menu;
/* renamed from: zendesk.messaging.ui.MessagePopUpHelper */
/* loaded from: classes8.dex */
class MessagePopUpHelper {

    /* renamed from: zendesk.messaging.ui.MessagePopUpHelper$Option */
    /* loaded from: classes8.dex */
    public enum Option {
        COPY,
        RETRY,
        DELETE
    }

    private static C51670xY3.InterfaceC30233c createOnMenuItemClickListener(final MessageActionListener messageActionListener, final String str) {
        if (messageActionListener == null) {
            return null;
        }
        return new C51670xY3.InterfaceC30233c() { // from class: zendesk.messaging.ui.MessagePopUpHelper.1
            @Override // p000.C51670xY3.InterfaceC30233c
            public boolean onMenuItemClick(MenuItem menuItem) {
                if (menuItem.getItemId() == R$id.zui_failed_message_retry) {
                    MessageActionListener.this.retry(str);
                    return true;
                } else if (menuItem.getItemId() == R$id.zui_failed_message_delete) {
                    MessageActionListener.this.delete(str);
                    return true;
                } else if (menuItem.getItemId() == R$id.zui_message_copy) {
                    MessageActionListener.this.copy(str);
                    return true;
                } else {
                    return false;
                }
            }
        };
    }

    private static C51670xY3 createPopUpMenu(View view, int i, C51670xY3.InterfaceC30233c interfaceC30233c) {
        C51670xY3 c51670xY3 = new C51670xY3(view.getContext(), view);
        c51670xY3.m5024c(i);
        c51670xY3.m5022e(interfaceC30233c);
        c51670xY3.m5023d(8388613);
        return c51670xY3;
    }

    public static void showPopUpMenu(View view, Set<Option> set, MessageActionListener messageActionListener, String str) {
        C51670xY3 createPopUpMenu = createPopUpMenu(view, R$menu.zui_message_options_copy_retry_delete, createOnMenuItemClickListener(messageActionListener, str));
        createPopUpMenu.m5026a().getItem(0).setVisible(set.contains(Option.COPY));
        createPopUpMenu.m5026a().getItem(1).setVisible(set.contains(Option.RETRY));
        createPopUpMenu.m5026a().getItem(2).setVisible(set.contains(Option.DELETE));
        createPopUpMenu.m5021f();
    }
}

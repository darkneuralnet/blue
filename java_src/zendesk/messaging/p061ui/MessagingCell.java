package zendesk.messaging.p061ui;

import android.view.View;
import zendesk.messaging.p061ui.Updatable;
/* renamed from: zendesk.messaging.ui.MessagingCell */
/* loaded from: classes8.dex */
class MessagingCell<T, V extends View & Updatable<T>> {

    /* renamed from: id */
    private final String f121937id;
    private final int layoutRes;
    private final T state;
    private final Class<V> viewClassType;

    public MessagingCell(String str, T t, int i, Class<V> cls) {
        this.f121937id = str;
        this.state = t;
        this.layoutRes = i;
        this.viewClassType = cls;
    }

    public boolean areContentsTheSame(MessagingCell messagingCell) {
        if (getId().equals(messagingCell.getId()) && messagingCell.state.equals(this.state)) {
            return true;
        }
        return false;
    }

    public void bind(V v) {
        ((Updatable) v).update(this.state);
    }

    public String getId() {
        return this.f121937id;
    }

    public int getLayoutRes() {
        return this.layoutRes;
    }

    public Class<V> getViewClassType() {
        return this.viewClassType;
    }
}

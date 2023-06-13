package p000;

import android.widget.Checkable;
import p000.GM2;
/* renamed from: GM2 */
/* loaded from: classes6.dex */
public interface GM2<T extends GM2<T>> extends Checkable {

    /* renamed from: GM2$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC2832a<C> {
        /* renamed from: a */
        void mo18934a(C c, boolean z);
    }

    int getId();

    void setInternalOnCheckedChangeListener(InterfaceC2832a<T> interfaceC2832a);
}

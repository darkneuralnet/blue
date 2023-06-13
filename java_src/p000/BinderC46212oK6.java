package p000;

import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;
/* renamed from: oK6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC46212oK6 extends BinderC42654iK6<Void> {

    /* renamed from: c */
    public final /* synthetic */ C49769uK6 f101792c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC46212oK6(C49769uK6 c49769uK6, C37929aO6<Void> c37929aO6) {
        super(c49769uK6, c37929aO6);
        this.f101792c = c49769uK6;
    }

    @Override // p000.BinderC42654iK6, p000.InterfaceC42699iP6
    /* renamed from: x1 */
    public final void mo21339x1(Bundle bundle, Bundle bundle2) {
        AtomicBoolean atomicBoolean;
        C42061hK6 c42061hK6;
        super.mo21339x1(bundle, bundle2);
        atomicBoolean = this.f101792c.f112219e;
        if (!atomicBoolean.compareAndSet(true, false)) {
            c42061hK6 = C49769uK6.f112213f;
            c42061hK6.m36534e("Expected keepingAlive to be true, but was false.", new Object[0]);
        }
        if (bundle.getBoolean("keep_alive")) {
            this.f101792c.mo10441j();
        }
    }
}

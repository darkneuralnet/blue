package p000;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
import p000.C35204Pj0;
/* renamed from: vY7  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C50488vY7 extends PhantomReference implements C35204Pj0.InterfaceC6455a {

    /* renamed from: a */
    public final Set f114266a;

    /* renamed from: b */
    public final Runnable f114267b;

    public /* synthetic */ C50488vY7(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, C45081mQ7 c45081mQ7) {
        super(obj, referenceQueue);
        this.f114266a = set;
        this.f114267b = runnable;
    }

    @Override // p000.C35204Pj0.InterfaceC6455a
    /* renamed from: a */
    public final void mo8447a() {
        if (!this.f114266a.remove(this)) {
            return;
        }
        clear();
        this.f114267b.run();
    }
}

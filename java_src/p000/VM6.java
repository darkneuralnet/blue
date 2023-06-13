package p000;

import android.support.annotation.Nullable;
import java.util.concurrent.Executor;
/* renamed from: VM6 */
/* loaded from: classes6.dex */
public final class VM6<ResultT> implements GN6<ResultT> {

    /* renamed from: a */
    public final Executor f38906a;

    /* renamed from: b */
    public final Object f38907b = new Object();
    @Nullable

    /* renamed from: c */
    public final InterfaceC34946Og3 f38908c;

    public VM6(Executor executor, InterfaceC34946Og3 interfaceC34946Og3) {
        this.f38906a = executor;
        this.f38908c = interfaceC34946Og3;
    }

    @Override // p000.GN6
    /* renamed from: a */
    public final void mo5321a(XY5<ResultT> xy5) {
        if (xy5.mo1421g()) {
            return;
        }
        synchronized (this.f38907b) {
            if (this.f38908c == null) {
                return;
            }
            this.f38906a.execute(new RunnableC43265jM6(this, xy5));
        }
    }
}

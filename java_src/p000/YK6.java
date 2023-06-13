package p000;

import android.support.annotation.Nullable;
import java.util.concurrent.Executor;
/* renamed from: YK6 */
/* loaded from: classes6.dex */
public final class YK6<ResultT> implements GN6<ResultT> {

    /* renamed from: a */
    public final Executor f45001a;

    /* renamed from: b */
    public final Object f45002b = new Object();
    @Nullable

    /* renamed from: c */
    public final InterfaceC44031kf3<ResultT> f45003c;

    public YK6(Executor executor, InterfaceC44031kf3<ResultT> interfaceC44031kf3) {
        this.f45001a = executor;
        this.f45003c = interfaceC44031kf3;
    }

    @Override // p000.GN6
    /* renamed from: a */
    public final void mo5321a(XY5<ResultT> xy5) {
        synchronized (this.f45002b) {
            if (this.f45003c == null) {
                return;
            }
            this.f45001a.execute(new VJ6(this, xy5));
        }
    }
}

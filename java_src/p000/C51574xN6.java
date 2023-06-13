package p000;

import android.support.annotation.Nullable;
import java.util.concurrent.Executor;
/* renamed from: xN6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C51574xN6<ResultT> implements GN6<ResultT> {

    /* renamed from: a */
    public final Executor f117536a;

    /* renamed from: b */
    public final Object f117537b = new Object();
    @Nullable

    /* renamed from: c */
    public final InterfaceC45830nh3<? super ResultT> f117538c;

    public C51574xN6(Executor executor, InterfaceC45830nh3<? super ResultT> interfaceC45830nh3) {
        this.f117536a = executor;
        this.f117538c = interfaceC45830nh3;
    }

    @Override // p000.GN6
    /* renamed from: a */
    public final void mo5321a(XY5<ResultT> xy5) {
        if (xy5.mo1421g()) {
            synchronized (this.f117537b) {
                if (this.f117538c == null) {
                    return;
                }
                this.f117536a.execute(new RunnableC43274jN6(this, xy5));
            }
        }
    }
}

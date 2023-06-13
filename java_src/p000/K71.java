package p000;

import android.os.Handler;
import co.bird.android.core.mvp.BaseActivity;
import com.uber.autodispose.ScopeProvider;
/* renamed from: K71 */
/* loaded from: classes2.dex */
public final class K71 {

    /* renamed from: a */
    public final Y94<InterfaceC45102mT1> f19102a;

    /* renamed from: b */
    public final Y94<InterfaceC1880Ea> f19103b;

    /* renamed from: c */
    public final Y94<Handler> f19104c;

    /* renamed from: d */
    public final Y94<InterfaceC32604Eg1> f19105d;

    /* renamed from: e */
    public final Y94<C36207Tq4> f19106e;

    /* renamed from: f */
    public final Y94<C22454gl> f19107f;

    public K71(Y94<InterfaceC45102mT1> y94, Y94<InterfaceC1880Ea> y942, Y94<Handler> y943, Y94<InterfaceC32604Eg1> y944, Y94<C36207Tq4> y945, Y94<C22454gl> y946) {
        this.f19102a = y94;
        this.f19103b = y942;
        this.f19104c = y943;
        this.f19105d = y944;
        this.f19106e = y945;
        this.f19107f = y946;
    }

    /* renamed from: a */
    public static K71 m99213a(Y94<InterfaceC45102mT1> y94, Y94<InterfaceC1880Ea> y942, Y94<Handler> y943, Y94<InterfaceC32604Eg1> y944, Y94<C36207Tq4> y945, Y94<C22454gl> y946) {
        return new K71(y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static G71 m99211c(InterfaceC45102mT1 interfaceC45102mT1, InterfaceC1880Ea interfaceC1880Ea, Handler handler, InterfaceC32604Eg1 interfaceC32604Eg1, C36207Tq4 c36207Tq4, C22454gl c22454gl, BaseActivity baseActivity, ScopeProvider scopeProvider, M71 m71, InterfaceC40099e13 interfaceC40099e13, C52759zN5 c52759zN5) {
        return new G71(interfaceC45102mT1, interfaceC1880Ea, handler, interfaceC32604Eg1, c36207Tq4, c22454gl, baseActivity, scopeProvider, m71, interfaceC40099e13, c52759zN5);
    }

    /* renamed from: b */
    public G71 m99212b(BaseActivity baseActivity, ScopeProvider scopeProvider, M71 m71, InterfaceC40099e13 interfaceC40099e13, C52759zN5 c52759zN5) {
        return m99211c(this.f19102a.get(), this.f19103b.get(), this.f19104c.get(), this.f19105d.get(), this.f19106e.get(), this.f19107f.get(), baseActivity, scopeProvider, m71, interfaceC40099e13, c52759zN5);
    }
}

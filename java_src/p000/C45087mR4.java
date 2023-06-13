package p000;

import android.os.Handler;
import com.uber.autodispose.ScopeProvider;
/* renamed from: mR4  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45087mR4 implements InterfaceC48812sj1<C44494lR4> {

    /* renamed from: a */
    public final Y94<C22454gl> f98020a;

    /* renamed from: b */
    public final Y94<InterfaceC32874Fk1> f98021b;

    /* renamed from: c */
    public final Y94<Handler> f98022c;

    /* renamed from: d */
    public final Y94<ScopeProvider> f98023d;

    /* renamed from: e */
    public final Y94<InterfaceC45680nR4> f98024e;

    /* renamed from: f */
    public final Y94<InterfaceC40099e13> f98025f;

    public C45087mR4(Y94<C22454gl> y94, Y94<InterfaceC32874Fk1> y942, Y94<Handler> y943, Y94<ScopeProvider> y944, Y94<InterfaceC45680nR4> y945, Y94<InterfaceC40099e13> y946) {
        this.f98020a = y94;
        this.f98021b = y942;
        this.f98022c = y943;
        this.f98023d = y944;
        this.f98024e = y945;
        this.f98025f = y946;
    }

    /* renamed from: a */
    public static C45087mR4 m25624a(Y94<C22454gl> y94, Y94<InterfaceC32874Fk1> y942, Y94<Handler> y943, Y94<ScopeProvider> y944, Y94<InterfaceC45680nR4> y945, Y94<InterfaceC40099e13> y946) {
        return new C45087mR4(y94, y942, y943, y944, y945, y946);
    }

    /* renamed from: c */
    public static C44494lR4 m25622c(C22454gl c22454gl, InterfaceC32874Fk1 interfaceC32874Fk1, Handler handler, ScopeProvider scopeProvider, InterfaceC45680nR4 interfaceC45680nR4, InterfaceC40099e13 interfaceC40099e13) {
        return new C44494lR4(c22454gl, interfaceC32874Fk1, handler, scopeProvider, interfaceC45680nR4, interfaceC40099e13);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public C44494lR4 get() {
        return m25622c(this.f98020a.get(), this.f98021b.get(), this.f98022c.get(), this.f98023d.get(), this.f98024e.get(), this.f98025f.get());
    }
}

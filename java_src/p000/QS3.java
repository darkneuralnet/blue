package p000;

import com.uber.autodispose.lifecycle.LifecycleScopeProvider;
/* renamed from: QS3 */
/* loaded from: classes2.dex */
public final class QS3 implements InterfaceC48812sj1<PS3> {

    /* renamed from: a */
    public final Y94<LifecycleScopeProvider<EnumC7097RE>> f30382a;

    /* renamed from: b */
    public final Y94<InterfaceC40099e13> f30383b;

    /* renamed from: c */
    public final Y94<YR4> f30384c;

    /* renamed from: d */
    public final Y94<C22454gl> f30385d;

    /* renamed from: e */
    public final Y94<InterfaceC1880Ea> f30386e;

    /* renamed from: f */
    public final Y94<InterfaceC44791lw0> f30387f;

    /* renamed from: g */
    public final Y94<InterfaceC41546gT3> f30388g;

    public QS3(Y94<LifecycleScopeProvider<EnumC7097RE>> y94, Y94<InterfaceC40099e13> y942, Y94<YR4> y943, Y94<C22454gl> y944, Y94<InterfaceC1880Ea> y945, Y94<InterfaceC44791lw0> y946, Y94<InterfaceC41546gT3> y947) {
        this.f30382a = y94;
        this.f30383b = y942;
        this.f30384c = y943;
        this.f30385d = y944;
        this.f30386e = y945;
        this.f30387f = y946;
        this.f30388g = y947;
    }

    /* renamed from: a */
    public static QS3 m88501a(Y94<LifecycleScopeProvider<EnumC7097RE>> y94, Y94<InterfaceC40099e13> y942, Y94<YR4> y943, Y94<C22454gl> y944, Y94<InterfaceC1880Ea> y945, Y94<InterfaceC44791lw0> y946, Y94<InterfaceC41546gT3> y947) {
        return new QS3(y94, y942, y943, y944, y945, y946, y947);
    }

    /* renamed from: c */
    public static PS3 m88499c(LifecycleScopeProvider<EnumC7097RE> lifecycleScopeProvider, InterfaceC40099e13 interfaceC40099e13, YR4 yr4, C22454gl c22454gl, InterfaceC1880Ea interfaceC1880Ea, InterfaceC44791lw0 interfaceC44791lw0, InterfaceC41546gT3 interfaceC41546gT3) {
        return new PS3(lifecycleScopeProvider, interfaceC40099e13, yr4, c22454gl, interfaceC1880Ea, interfaceC44791lw0, interfaceC41546gT3);
    }

    @Override // p000.Y94
    /* renamed from: b */
    public PS3 get() {
        return m88499c(this.f30382a.get(), this.f30383b.get(), this.f30384c.get(), this.f30385d.get(), this.f30386e.get(), this.f30387f.get(), this.f30388g.get());
    }
}

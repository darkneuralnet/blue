package p000;

import android.view.Surface;
import androidx.camera.core.C11243o;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;
import p000.InterfaceC44582lb1;
import p000.O80;
/* renamed from: rp6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48285rp6 {

    /* renamed from: a */
    public final Executor f107715a;

    /* renamed from: b */
    public final Executor f107716b;

    /* renamed from: c */
    public final InterfaceC51103wb1 f107717c;

    /* renamed from: d */
    public InterfaceC44582lb1 f107718d = null;

    /* renamed from: e */
    public Surface f107719e = null;

    /* renamed from: f */
    public C11243o f107720f = null;

    /* renamed from: g */
    public Executor f107721g = null;

    /* renamed from: h */
    public InterfaceC44582lb1.InterfaceC25734b.InterfaceC25735a f107722h = null;

    /* renamed from: i */
    public EnumC28020c f107723i = EnumC28020c.NOT_INITIALIZED;

    /* renamed from: j */
    public ListenableFuture<Void> f107724j = IA1.m102838f(new IllegalStateException("Cannot close the encoder before configuring."));

    /* renamed from: k */
    public O80.C5832a<Void> f107725k = null;

    /* renamed from: l */
    public ListenableFuture<InterfaceC44582lb1> f107726l = IA1.m102838f(new IllegalStateException("Cannot close the encoder before configuring."));

    /* renamed from: m */
    public O80.C5832a<InterfaceC44582lb1> f107727m = null;

    /* renamed from: rp6$a */
    /* loaded from: classes.dex */
    public class C28018a implements CA1<InterfaceC44582lb1> {
        public C28018a() {
        }

        @Override // p000.CA1
        /* renamed from: a */
        public void onSuccess(InterfaceC44582lb1 interfaceC44582lb1) {
        }

        @Override // p000.CA1
        public void onFailure(Throwable th) {
            C33928Jx2.m99521m("VideoEncoderSession", "VideoEncoder configuration failed.", th);
            C48285rp6.this.m15285x();
        }
    }

    /* renamed from: rp6$b */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C28019b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f107729a;

        static {
            int[] iArr = new int[EnumC28020c.values().length];
            f107729a = iArr;
            try {
                iArr[EnumC28020c.NOT_INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f107729a[EnumC28020c.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f107729a[EnumC28020c.READY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f107729a[EnumC28020c.PENDING_RELEASE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f107729a[EnumC28020c.RELEASED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: rp6$c */
    /* loaded from: classes.dex */
    public enum EnumC28020c {
        NOT_INITIALIZED,
        INITIALIZING,
        PENDING_RELEASE,
        READY,
        RELEASED
    }

    public C48285rp6(InterfaceC51103wb1 interfaceC51103wb1, Executor executor, Executor executor2) {
        this.f107715a = executor2;
        this.f107716b = executor;
        this.f107717c = interfaceC51103wb1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object m15294o(O80.C5832a c5832a) throws Exception {
        this.f107725k = c5832a;
        return "ReleasedFuture " + this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Object m15293p(O80.C5832a c5832a) throws Exception {
        this.f107727m = c5832a;
        return "ReadyToReleaseFuture " + this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object m15292q(C11243o c11243o, EnumC47841r46 enumC47841r46, AbstractC52434yp6 abstractC52434yp6, FP2 fp2, O80.C5832a c5832a) throws Exception {
        m15299j(c11243o, enumC47841r46, abstractC52434yp6, fp2, c5832a);
        return "ConfigureVideoEncoderFuture " + this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m15291r(Surface surface) {
        this.f107722h.mo6197a(surface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m15290s(O80.C5832a c5832a, C11243o c11243o, final Surface surface) {
        Executor executor;
        int i = C28019b.f107729a[this.f107723i.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4 && i != 5) {
                        throw new IllegalStateException("State " + this.f107723i + " is not handled");
                    }
                } else {
                    if (this.f107722h != null && (executor = this.f107721g) != null) {
                        executor.execute(new Runnable() { // from class: lp6
                            @Override // java.lang.Runnable
                            public final void run() {
                                C48285rp6.this.m15291r(surface);
                            }
                        });
                    }
                    C33928Jx2.m99522l("VideoEncoderSession", "Surface is updated in READY state: " + surface);
                    return;
                }
            } else if (c11243o.m69102q()) {
                C33928Jx2.m99533a("VideoEncoderSession", "Not provide surface, " + Objects.toString(c11243o, "EMPTY") + " is already serviced.");
                c5832a.m92861c(null);
                m15301h();
                return;
            } else {
                this.f107719e = surface;
                C33928Jx2.m99533a("VideoEncoderSession", "provide surface: " + surface);
                c11243o.m69122A(surface, this.f107716b, new InterfaceC48378rz0() { // from class: kp6
                    @Override // p000.InterfaceC48378rz0
                    public final void accept(Object obj) {
                        C48285rp6.this.m15288u((C11243o.AbstractC11250g) obj);
                    }
                });
                this.f107723i = EnumC28020c.READY;
                c5832a.m92861c(this.f107718d);
                return;
            }
        }
        C33928Jx2.m99533a("VideoEncoderSession", "Not provide surface in " + this.f107723i);
        c5832a.m92861c(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void m15289t() {
        this.f107725k.m92861c(null);
    }

    /* renamed from: h */
    public final void m15301h() {
        int i = C28019b.f107729a[this.f107723i.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                if (i == 5) {
                    C33928Jx2.m99533a("VideoEncoderSession", "closeInternal in RELEASED state, No-op");
                    return;
                }
                throw new IllegalStateException("State " + this.f107723i + " is not handled");
            }
            C33928Jx2.m99533a("VideoEncoderSession", "closeInternal in " + this.f107723i + " state");
            this.f107723i = EnumC28020c.PENDING_RELEASE;
            return;
        }
        m15285x();
    }

    /* renamed from: i */
    public ListenableFuture<InterfaceC44582lb1> m15300i(final C11243o c11243o, final EnumC47841r46 enumC47841r46, final FP2 fp2, final AbstractC52434yp6 abstractC52434yp6) {
        if (C28019b.f107729a[this.f107723i.ordinal()] != 1) {
            return IA1.m102838f(new IllegalStateException("configure() shouldn't be called in " + this.f107723i));
        }
        this.f107723i = EnumC28020c.INITIALIZING;
        this.f107720f = c11243o;
        C33928Jx2.m99533a("VideoEncoderSession", "Create VideoEncoderSession: " + this);
        this.f107724j = O80.m92864a(new O80.InterfaceC5834c() { // from class: np6
            @Override // p000.O80.InterfaceC5834c
            /* renamed from: a */
            public final Object mo3207a(O80.C5832a c5832a) {
                Object m15294o;
                m15294o = C48285rp6.this.m15294o(c5832a);
                return m15294o;
            }
        });
        this.f107726l = O80.m92864a(new O80.InterfaceC5834c() { // from class: op6
            @Override // p000.O80.InterfaceC5834c
            /* renamed from: a */
            public final Object mo3207a(O80.C5832a c5832a) {
                Object m15293p;
                m15293p = C48285rp6.this.m15293p(c5832a);
                return m15293p;
            }
        });
        ListenableFuture m92864a = O80.m92864a(new O80.InterfaceC5834c() { // from class: pp6
            @Override // p000.O80.InterfaceC5834c
            /* renamed from: a */
            public final Object mo3207a(O80.C5832a c5832a) {
                Object m15292q;
                m15292q = C48285rp6.this.m15292q(c11243o, enumC47841r46, abstractC52434yp6, fp2, c5832a);
                return m15292q;
            }
        });
        IA1.m102842b(m92864a, new C28018a(), this.f107716b);
        return IA1.m102834j(m92864a);
    }

    /* renamed from: j */
    public final void m15299j(final C11243o c11243o, EnumC47841r46 enumC47841r46, AbstractC52434yp6 abstractC52434yp6, FP2 fp2, final O80.C5832a<InterfaceC44582lb1> c5832a) {
        try {
            InterfaceC44582lb1 mo2354a = this.f107717c.mo2354a(this.f107715a, C37595Zo6.m72478b(C37595Zo6.m72477c(fp2, abstractC52434yp6), enumC47841r46, fp2.mo91218d(), c11243o.m69105n(), c11243o.m69106m()));
            this.f107718d = mo2354a;
            InterfaceC44582lb1.InterfaceC25733a mo27107c = mo2354a.mo27107c();
            if (!(mo27107c instanceof InterfaceC44582lb1.InterfaceC25734b)) {
                c5832a.m92858f(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
            } else {
                ((InterfaceC44582lb1.InterfaceC25734b) mo27107c).mo27103a(this.f107716b, new InterfaceC44582lb1.InterfaceC25734b.InterfaceC25735a() { // from class: qp6
                    @Override // p000.InterfaceC44582lb1.InterfaceC25734b.InterfaceC25735a
                    /* renamed from: a */
                    public final void mo6197a(Surface surface) {
                        C48285rp6.this.m15290s(c5832a, c11243o, surface);
                    }
                });
            }
        } catch (InvalidConfigException e) {
            C33928Jx2.m99530d("VideoEncoderSession", "Unable to initialize video encoder.", e);
            c5832a.m92858f(e);
        }
    }

    /* renamed from: k */
    public Surface m15298k() {
        if (this.f107723i != EnumC28020c.READY) {
            return null;
        }
        return this.f107719e;
    }

    /* renamed from: l */
    public ListenableFuture<InterfaceC44582lb1> m15297l() {
        return IA1.m102834j(this.f107726l);
    }

    /* renamed from: m */
    public InterfaceC44582lb1 m15296m() {
        return this.f107718d;
    }

    /* renamed from: n */
    public boolean m15295n(C11243o c11243o) {
        int i = C28019b.f107729a[this.f107723i.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i != 2 && i != 3) {
            if (i == 4 || i == 5) {
                return false;
            }
            throw new IllegalStateException("State " + this.f107723i + " is not handled");
        } else if (this.f107720f != c11243o) {
            return false;
        } else {
            return true;
        }
    }

    public String toString() {
        return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString(this.f107720f, "SURFACE_REQUEST_NOT_CONFIGURED");
    }

    /* renamed from: u */
    public final void m15288u(C11243o.AbstractC11250g abstractC11250g) {
        C33928Jx2.m99533a("VideoEncoderSession", "Surface can be closed: " + abstractC11250g.mo69087b().hashCode());
        Surface mo69087b = abstractC11250g.mo69087b();
        if (mo69087b == this.f107719e) {
            this.f107719e = null;
            this.f107727m.m92861c(this.f107718d);
            m15301h();
            return;
        }
        mo69087b.release();
    }

    /* renamed from: v */
    public void m15287v(Executor executor, InterfaceC44582lb1.InterfaceC25734b.InterfaceC25735a interfaceC25735a) {
        this.f107721g = executor;
        this.f107722h = interfaceC25735a;
    }

    /* renamed from: w */
    public ListenableFuture<Void> m15286w() {
        m15301h();
        return IA1.m102834j(this.f107724j);
    }

    /* renamed from: x */
    public void m15285x() {
        int i = C28019b.f107729a[this.f107723i.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3 && i != 4) {
                if (i == 5) {
                    C33928Jx2.m99533a("VideoEncoderSession", "terminateNow in " + this.f107723i + ", No-op");
                    return;
                }
                throw new IllegalStateException("State " + this.f107723i + " is not handled");
            }
            this.f107723i = EnumC28020c.RELEASED;
            this.f107727m.m92861c(this.f107718d);
            this.f107720f = null;
            if (this.f107718d != null) {
                C33928Jx2.m99533a("VideoEncoderSession", "VideoEncoder is releasing: " + this.f107718d);
                this.f107718d.release();
                this.f107718d.mo27106d().addListener(new Runnable() { // from class: mp6
                    @Override // java.lang.Runnable
                    public final void run() {
                        C48285rp6.this.m15289t();
                    }
                }, this.f107716b);
                this.f107718d = null;
                return;
            }
            C33928Jx2.m99522l("VideoEncoderSession", "There's no VideoEncoder to release! Finish release completer.");
            this.f107725k.m92861c(null);
            return;
        }
        this.f107723i = EnumC28020c.RELEASED;
    }
}

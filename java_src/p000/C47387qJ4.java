package p000;

import androidx.camera.core.C11164h;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.InterfaceC11183i;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import p000.JY5;
import p000.O80;
/* renamed from: qJ4  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C47387qJ4 implements BY5 {

    /* renamed from: a */
    public final JY5 f105102a;

    /* renamed from: b */
    public final JY5.InterfaceC4143a f105103b;

    /* renamed from: e */
    public O80.C5832a<Void> f105106e;

    /* renamed from: f */
    public O80.C5832a<Void> f105107f;

    /* renamed from: h */
    public ListenableFuture<Void> f105109h;

    /* renamed from: g */
    public boolean f105108g = false;

    /* renamed from: c */
    public final ListenableFuture<Void> f105104c = O80.m92864a(new O80.InterfaceC5834c() { // from class: oJ4
        @Override // p000.O80.InterfaceC5834c
        /* renamed from: a */
        public final Object mo3207a(O80.C5832a c5832a) {
            Object m17615o;
            m17615o = C47387qJ4.this.m17615o(c5832a);
            return m17615o;
        }
    });

    /* renamed from: d */
    public final ListenableFuture<Void> f105105d = O80.m92864a(new O80.InterfaceC5834c() { // from class: pJ4
        @Override // p000.O80.InterfaceC5834c
        /* renamed from: a */
        public final Object mo3207a(O80.C5832a c5832a) {
            Object m17614p;
            m17614p = C47387qJ4.this.m17614p(c5832a);
            return m17614p;
        }
    });

    public C47387qJ4(JY5 jy5, JY5.InterfaceC4143a interfaceC4143a) {
        this.f105102a = jy5;
        this.f105103b = interfaceC4143a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object m17615o(O80.C5832a c5832a) throws Exception {
        this.f105106e = c5832a;
        return "CaptureCompleteFuture";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ Object m17614p(O80.C5832a c5832a) throws Exception {
        this.f105107f = c5832a;
        return "RequestCompleteFuture";
    }

    @Override // p000.BY5
    /* renamed from: a */
    public void mo17629a(ImageCaptureException imageCaptureException) {
        O36.m92961a();
        if (this.f105108g) {
            return;
        }
        m17618l();
        m17613q();
        m17612r(imageCaptureException);
    }

    @Override // p000.BY5
    /* renamed from: b */
    public void mo17628b(InterfaceC11183i interfaceC11183i) {
        O36.m92961a();
        if (this.f105108g) {
            return;
        }
        m17618l();
        m17613q();
        this.f105102a.m100232u(interfaceC11183i);
    }

    @Override // p000.BY5
    /* renamed from: c */
    public boolean mo17627c() {
        return this.f105108g;
    }

    @Override // p000.BY5
    /* renamed from: d */
    public void mo17626d() {
        O36.m92961a();
        if (this.f105108g) {
            return;
        }
        this.f105106e.m92861c(null);
    }

    @Override // p000.BY5
    /* renamed from: e */
    public void mo17625e(C11164h.C11182o c11182o) {
        O36.m92961a();
        if (this.f105108g) {
            return;
        }
        m17618l();
        m17613q();
        this.f105102a.m100233t(c11182o);
    }

    @Override // p000.BY5
    /* renamed from: f */
    public void mo17624f(ImageCaptureException imageCaptureException) {
        O36.m92961a();
        if (this.f105108g) {
            return;
        }
        if (this.f105102a.m100239d()) {
            this.f105103b.mo100231a(this.f105102a);
        } else {
            m17612r(imageCaptureException);
        }
        m17613q();
        this.f105106e.m92858f(imageCaptureException);
    }

    /* renamed from: i */
    public final void m17621i(ImageCaptureException imageCaptureException) {
        O36.m92961a();
        this.f105108g = true;
        ListenableFuture<Void> listenableFuture = this.f105109h;
        Objects.requireNonNull(listenableFuture);
        listenableFuture.cancel(true);
        this.f105106e.m92858f(imageCaptureException);
        this.f105107f.m92861c(null);
    }

    /* renamed from: j */
    public void m17620j(ImageCaptureException imageCaptureException) {
        O36.m92961a();
        if (this.f105105d.isDone()) {
            return;
        }
        m17621i(imageCaptureException);
        m17612r(imageCaptureException);
    }

    /* renamed from: k */
    public void m17619k() {
        O36.m92961a();
        if (this.f105105d.isDone()) {
            return;
        }
        m17621i(new ImageCaptureException(3, "The request is aborted silently and retried.", null));
        this.f105103b.mo100231a(this.f105102a);
    }

    /* renamed from: l */
    public final void m17618l() {
        HZ3.m103728j(this.f105104c.isDone(), "onImageCaptured() must be called before onFinalResult()");
    }

    /* renamed from: m */
    public ListenableFuture<Void> m17617m() {
        O36.m92961a();
        return this.f105104c;
    }

    /* renamed from: n */
    public ListenableFuture<Void> m17616n() {
        O36.m92961a();
        return this.f105105d;
    }

    /* renamed from: q */
    public final void m17613q() {
        HZ3.m103728j(!this.f105105d.isDone(), "The callback can only complete once.");
        this.f105107f.m92861c(null);
    }

    /* renamed from: r */
    public final void m17612r(ImageCaptureException imageCaptureException) {
        O36.m92961a();
        this.f105102a.m100234s(imageCaptureException);
    }

    /* renamed from: s */
    public void m17611s(ListenableFuture<Void> listenableFuture) {
        boolean z;
        O36.m92961a();
        if (this.f105109h == null) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103728j(z, "CaptureRequestFuture can only be set once.");
        this.f105109h = listenableFuture;
    }
}

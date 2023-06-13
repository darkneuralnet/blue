package p000;

import android.util.Log;
import androidx.camera.core.AbstractC11152d;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.InterfaceC11183i;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import p000.JY5;
/* renamed from: FY5 */
/* loaded from: classes.dex */
public class FY5 implements AbstractC11152d.InterfaceC11153a, JY5.InterfaceC4143a {

    /* renamed from: b */
    public final InterfaceC40394eX1 f9659b;

    /* renamed from: c */
    public EX1 f9660c;

    /* renamed from: d */
    public C47387qJ4 f9661d;

    /* renamed from: e */
    public final List<C47387qJ4> f9662e;

    /* renamed from: a */
    public final Deque<JY5> f9658a = new ArrayDeque();

    /* renamed from: f */
    public boolean f9663f = false;

    /* renamed from: FY5$a */
    /* loaded from: classes.dex */
    public class C2355a implements CA1<Void> {

        /* renamed from: a */
        public final /* synthetic */ C41626gc0 f9664a;

        public C2355a(C41626gc0 c41626gc0) {
            this.f9664a = c41626gc0;
        }

        @Override // p000.CA1
        /* renamed from: a */
        public void onSuccess(Void r1) {
            FY5.this.f9659b.mo42811b();
        }

        @Override // p000.CA1
        public void onFailure(Throwable th) {
            if (this.f9664a.m37981b()) {
                return;
            }
            if (th instanceof ImageCaptureException) {
                FY5.this.f9660c.m108859i((ImageCaptureException) th);
            } else {
                FY5.this.f9660c.m108859i(new ImageCaptureException(2, "Failed to submit capture request", th));
            }
            FY5.this.f9659b.mo42811b();
        }
    }

    public FY5(InterfaceC40394eX1 interfaceC40394eX1) {
        O36.m92961a();
        this.f9659b = interfaceC40394eX1;
        this.f9662e = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ void m106963h() {
        this.f9661d = null;
        m106964g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ void m106962i(C47387qJ4 c47387qJ4) {
        this.f9662e.remove(c47387qJ4);
    }

    @Override // p000.JY5.InterfaceC4143a
    /* renamed from: a */
    public void mo100231a(JY5 jy5) {
        O36.m92961a();
        this.f9658a.addFirst(jy5);
    }

    /* renamed from: d */
    public void m106966d() {
        O36.m92961a();
        ImageCaptureException imageCaptureException = new ImageCaptureException(3, "Camera is closed.", null);
        for (JY5 jy5 : this.f9658a) {
            jy5.m100234s(imageCaptureException);
        }
        this.f9658a.clear();
        for (C47387qJ4 c47387qJ4 : new ArrayList(this.f9662e)) {
            c47387qJ4.m17620j(imageCaptureException);
        }
    }

    /* renamed from: e */
    public boolean m106965e() {
        return this.f9661d != null;
    }

    @Override // androidx.camera.core.AbstractC11152d.InterfaceC11153a
    /* renamed from: f */
    public void mo43878f(InterfaceC11183i interfaceC11183i) {
        C31631Ac0.m115446d().execute(new Runnable() { // from class: EY5
            @Override // java.lang.Runnable
            public final void run() {
                FY5.this.m106964g();
            }
        });
    }

    /* renamed from: g */
    public void m106964g() {
        O36.m92961a();
        Log.d("TakePictureManager", "Issue the next TakePictureRequest.");
        if (m106965e()) {
            Log.d("TakePictureManager", "There is already a request in-flight.");
        } else if (this.f9663f) {
            Log.d("TakePictureManager", "The class is paused.");
        } else if (this.f9660c.m108860h() == 0) {
            Log.d("TakePictureManager", "Too many acquire images. Close image to be able to process next.");
        } else {
            JY5 poll = this.f9658a.poll();
            if (poll == null) {
                Log.d("TakePictureManager", "No new request.");
                return;
            }
            C47387qJ4 c47387qJ4 = new C47387qJ4(poll, this);
            m106956o(c47387qJ4);
            C48526sE3<C41626gc0, C40753f74> m108863e = this.f9660c.m108863e(poll, c47387qJ4, c47387qJ4.m17617m());
            C41626gc0 c41626gc0 = m108863e.f108491a;
            Objects.requireNonNull(c41626gc0);
            C40753f74 c40753f74 = m108863e.f108492b;
            Objects.requireNonNull(c40753f74);
            this.f9660c.m108857k(c40753f74);
            c47387qJ4.m17611s(m106957n(c41626gc0));
        }
    }

    /* renamed from: j */
    public void m106961j(JY5 jy5) {
        O36.m92961a();
        this.f9658a.offer(jy5);
        m106964g();
    }

    /* renamed from: k */
    public void m106960k() {
        O36.m92961a();
        this.f9663f = true;
        C47387qJ4 c47387qJ4 = this.f9661d;
        if (c47387qJ4 != null) {
            c47387qJ4.m17619k();
        }
    }

    /* renamed from: l */
    public void m106959l() {
        O36.m92961a();
        this.f9663f = false;
        m106964g();
    }

    /* renamed from: m */
    public void m106958m(EX1 ex1) {
        O36.m92961a();
        this.f9660c = ex1;
        ex1.m108858j(this);
    }

    /* renamed from: n */
    public final ListenableFuture<Void> m106957n(C41626gc0 c41626gc0) {
        O36.m92961a();
        this.f9659b.mo42812a();
        ListenableFuture<Void> mo42810c = this.f9659b.mo42810c(c41626gc0.m37982a());
        IA1.m102842b(mo42810c, new C2355a(c41626gc0), C31631Ac0.m115446d());
        return mo42810c;
    }

    /* renamed from: o */
    public final void m106956o(final C47387qJ4 c47387qJ4) {
        HZ3.m103729i(!m106965e());
        this.f9661d = c47387qJ4;
        c47387qJ4.m17617m().addListener(new Runnable() { // from class: CY5
            @Override // java.lang.Runnable
            public final void run() {
                FY5.this.m106963h();
            }
        }, C31631Ac0.m115449a());
        this.f9662e.add(c47387qJ4);
        c47387qJ4.m17616n().addListener(new Runnable() { // from class: DY5
            @Override // java.lang.Runnable
            public final void run() {
                FY5.this.m106962i(c47387qJ4);
            }
        }, C31631Ac0.m115449a());
    }
}

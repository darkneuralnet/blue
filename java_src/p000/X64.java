package p000;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Size;
import androidx.camera.core.C11154e;
import androidx.camera.core.C11164h;
import androidx.camera.core.C11236l;
import androidx.camera.core.impl.C11192d;
import androidx.camera.core.impl.C11201g;
import androidx.camera.core.impl.C11213q;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.InterfaceC11197f;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p000.C43385ja0;
import p000.C45807nf0;
import p000.InterfaceC52493yv5;
/* renamed from: X64 */
/* loaded from: classes.dex */
public final class X64 implements InterfaceC48771sf0 {

    /* renamed from: q */
    public static List<DeferrableSurface> f42648q = new ArrayList();

    /* renamed from: r */
    public static int f42649r = 0;

    /* renamed from: a */
    public final InterfaceC52493yv5 f42650a;

    /* renamed from: b */
    public final J90 f42651b;

    /* renamed from: c */
    public final Executor f42652c;

    /* renamed from: d */
    public final ScheduledExecutorService f42653d;

    /* renamed from: g */
    public C11213q f42656g;

    /* renamed from: h */
    public C43978ka0 f42657h;

    /* renamed from: i */
    public C11213q f42658i;

    /* renamed from: p */
    public int f42665p;

    /* renamed from: f */
    public List<DeferrableSurface> f42655f = new ArrayList();

    /* renamed from: k */
    public volatile List<C11192d> f42660k = null;

    /* renamed from: l */
    public volatile boolean f42661l = false;

    /* renamed from: n */
    public C45807nf0 f42663n = new C45807nf0.C26566a().m23350c();

    /* renamed from: o */
    public C45807nf0 f42664o = new C45807nf0.C26566a().m23350c();

    /* renamed from: e */
    public final C48179rf0 f42654e = new C48179rf0();

    /* renamed from: j */
    public EnumC9302e f42659j = EnumC9302e.UNINITIALIZED;

    /* renamed from: m */
    public final C9303f f42662m = new C9303f();

    /* renamed from: X64$a */
    /* loaded from: classes.dex */
    public class C9298a implements CA1<Void> {
        public C9298a() {
        }

        @Override // p000.CA1
        /* renamed from: a */
        public void onSuccess(Void r1) {
        }

        @Override // p000.CA1
        public void onFailure(Throwable th) {
            C33928Jx2.m99530d("ProcessingCaptureSession", "open session failed ", th);
            X64.this.close();
            X64.this.mo13898b(false);
        }
    }

    /* renamed from: X64$b */
    /* loaded from: classes.dex */
    public class C9299b implements InterfaceC52493yv5.InterfaceC30780a {

        /* renamed from: a */
        public final /* synthetic */ C11192d f42667a;

        public C9299b(C11192d c11192d) {
            this.f42667a = c11192d;
        }
    }

    /* renamed from: X64$c */
    /* loaded from: classes.dex */
    public class C9300c implements InterfaceC52493yv5.InterfaceC30780a {

        /* renamed from: a */
        public final /* synthetic */ C11192d f42669a;

        public C9300c(C11192d c11192d) {
            this.f42669a = c11192d;
        }
    }

    /* renamed from: X64$d */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C9301d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42671a;

        static {
            int[] iArr = new int[EnumC9302e.values().length];
            f42671a = iArr;
            try {
                iArr[EnumC9302e.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42671a[EnumC9302e.SESSION_INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42671a[EnumC9302e.ON_CAPTURE_SESSION_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42671a[EnumC9302e.ON_CAPTURE_SESSION_ENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42671a[EnumC9302e.DE_INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* renamed from: X64$e */
    /* loaded from: classes.dex */
    public enum EnumC9302e {
        UNINITIALIZED,
        SESSION_INITIALIZED,
        ON_CAPTURE_SESSION_STARTED,
        ON_CAPTURE_SESSION_ENDED,
        DE_INITIALIZED
    }

    /* renamed from: X64$f */
    /* loaded from: classes.dex */
    public static class C9303f implements InterfaceC52493yv5.InterfaceC30780a {
    }

    public X64(InterfaceC52493yv5 interfaceC52493yv5, J90 j90, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f42665p = 0;
        this.f42650a = interfaceC52493yv5;
        this.f42651b = j90;
        this.f42652c = executor;
        this.f42653d = scheduledExecutorService;
        int i = f42649r;
        f42649r = i + 1;
        this.f42665p = i;
        C33928Jx2.m99533a("ProcessingCaptureSession", "New ProcessingCaptureSession (id=" + this.f42665p + ")");
    }

    /* renamed from: n */
    public static void m77389n(List<C11192d> list) {
        for (C11192d c11192d : list) {
            for (AbstractC46943pa0 abstractC46943pa0 : c11192d.m69451b()) {
                abstractC46943pa0.mo16367a();
            }
        }
    }

    /* renamed from: o */
    public static List<C53086zv5> m77388o(List<DeferrableSurface> list) {
        ArrayList arrayList = new ArrayList();
        for (DeferrableSurface deferrableSurface : list) {
            HZ3.m103736b(deferrableSurface instanceof C53086zv5, "Surface must be SessionProcessorSurface");
            arrayList.add((C53086zv5) deferrableSurface);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ void m77385r() {
        C11201g.m69410e(this.f42655f);
    }

    /* renamed from: s */
    public static /* synthetic */ void m77384s(DeferrableSurface deferrableSurface) {
        f42648q.remove(deferrableSurface);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ ListenableFuture m77383t(C11213q c11213q, CameraDevice cameraDevice, PX5 px5, List list) throws Exception {
        C33928Jx2.m99533a("ProcessingCaptureSession", "-- getSurfaces done, start init (id=" + this.f42665p + ")");
        if (this.f42659j == EnumC9302e.DE_INITIALIZED) {
            return IA1.m102838f(new IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        AbstractC42561iA3 abstractC42561iA3 = null;
        if (list.contains(null)) {
            return IA1.m102838f(new DeferrableSurface.SurfaceClosedException("Surface closed", c11213q.m69345k().get(list.indexOf(null))));
        }
        try {
            C11201g.m69409f(this.f42655f);
            AbstractC42561iA3 abstractC42561iA32 = null;
            AbstractC42561iA3 abstractC42561iA33 = null;
            for (int i = 0; i < c11213q.m69345k().size(); i++) {
                DeferrableSurface deferrableSurface = c11213q.m69345k().get(i);
                if (Objects.equals(deferrableSurface.m69468e(), C11236l.class)) {
                    abstractC42561iA3 = AbstractC42561iA3.m34386a(deferrableSurface.m69465h().get(), new Size(deferrableSurface.m69467f().getWidth(), deferrableSurface.m69467f().getHeight()), deferrableSurface.m69466g());
                } else if (Objects.equals(deferrableSurface.m69468e(), C11164h.class)) {
                    abstractC42561iA32 = AbstractC42561iA3.m34386a(deferrableSurface.m69465h().get(), new Size(deferrableSurface.m69467f().getWidth(), deferrableSurface.m69467f().getHeight()), deferrableSurface.m69466g());
                } else if (Objects.equals(deferrableSurface.m69468e(), C11154e.class)) {
                    abstractC42561iA33 = AbstractC42561iA3.m34386a(deferrableSurface.m69465h().get(), new Size(deferrableSurface.m69467f().getWidth(), deferrableSurface.m69467f().getHeight()), deferrableSurface.m69466g());
                }
            }
            this.f42659j = EnumC9302e.SESSION_INITIALIZED;
            C33928Jx2.m99522l("ProcessingCaptureSession", "== initSession (id=" + this.f42665p + ")");
            C11213q m2252h = this.f42650a.m2252h(this.f42651b, abstractC42561iA3, abstractC42561iA32, abstractC42561iA33);
            this.f42658i = m2252h;
            m2252h.m69345k().get(0).m69464i().addListener(new Runnable() { // from class: V64
                @Override // java.lang.Runnable
                public final void run() {
                    X64.this.m77385r();
                }
            }, C31631Ac0.m115449a());
            for (final DeferrableSurface deferrableSurface2 : this.f42658i.m69345k()) {
                f42648q.add(deferrableSurface2);
                deferrableSurface2.m69464i().addListener(new Runnable() { // from class: W64
                    @Override // java.lang.Runnable
                    public final void run() {
                        X64.m77384s(DeferrableSurface.this);
                    }
                }, this.f42652c);
            }
            C11213q.C11221g c11221g = new C11213q.C11221g();
            c11221g.m69312a(c11213q);
            c11221g.m69310c();
            c11221g.m69312a(this.f42658i);
            HZ3.m103736b(c11221g.m69308e(), "Cannot transform the SessionConfig");
            ListenableFuture<Void> mo13899a = this.f42654e.mo13899a(c11221g.m69311b(), (CameraDevice) HZ3.m103731g(cameraDevice), px5);
            IA1.m102842b(mo13899a, new C9298a(), this.f42652c);
            return mo13899a;
        } catch (DeferrableSurface.SurfaceClosedException e) {
            return IA1.m102838f(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ Void m77382u(Void r1) {
        m77380w(this.f42654e);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void m77381v() {
        this.f42650a.m2255e();
    }

    @Override // p000.InterfaceC48771sf0
    /* renamed from: a */
    public ListenableFuture<Void> mo13899a(final C11213q c11213q, final CameraDevice cameraDevice, final PX5 px5) {
        boolean z;
        if (this.f42659j == EnumC9302e.UNINITIALIZED) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103736b(z, "Invalid state state:" + this.f42659j);
        HZ3.m103736b(c11213q.m69345k().isEmpty() ^ true, "SessionConfig contains no surfaces");
        C33928Jx2.m99533a("ProcessingCaptureSession", "open (id=" + this.f42665p + ")");
        List<DeferrableSurface> m69345k = c11213q.m69345k();
        this.f42655f = m69345k;
        return DA1.m110820a(C11201g.m69404k(m69345k, false, 5000L, this.f42652c, this.f42653d)).m110816e(new InterfaceC20537fp() { // from class: T64
            @Override // p000.InterfaceC20537fp
            public final ListenableFuture apply(Object obj) {
                ListenableFuture m77383t;
                m77383t = X64.this.m77383t(c11213q, cameraDevice, px5, (List) obj);
                return m77383t;
            }
        }, this.f42652c).m110817d(new InterfaceC51452xA1() { // from class: U64
            @Override // p000.InterfaceC51452xA1
            public final Object apply(Object obj) {
                Void m77382u;
                m77382u = X64.this.m77382u((Void) obj);
                return m77382u;
            }
        }, this.f42652c);
    }

    @Override // p000.InterfaceC48771sf0
    /* renamed from: b */
    public ListenableFuture<Void> mo13898b(boolean z) {
        C33928Jx2.m99533a("ProcessingCaptureSession", "release (id=" + this.f42665p + ") mProcessorState=" + this.f42659j);
        ListenableFuture<Void> mo13898b = this.f42654e.mo13898b(z);
        int i = C9301d.f42671a[this.f42659j.ordinal()];
        if (i == 2 || i == 4) {
            mo13898b.addListener(new Runnable() { // from class: S64
                @Override // java.lang.Runnable
                public final void run() {
                    X64.this.m77381v();
                }
            }, this.f42652c);
        }
        this.f42659j = EnumC9302e.DE_INITIALIZED;
        return mo13898b;
    }

    @Override // p000.InterfaceC48771sf0
    /* renamed from: c */
    public C11213q mo13897c() {
        return this.f42656g;
    }

    @Override // p000.InterfaceC48771sf0
    public void close() {
        C33928Jx2.m99533a("ProcessingCaptureSession", "close (id=" + this.f42665p + ") state=" + this.f42659j);
        if (this.f42659j == EnumC9302e.ON_CAPTURE_SESSION_STARTED) {
            this.f42650a.m2256d();
            C43978ka0 c43978ka0 = this.f42657h;
            if (c43978ka0 != null) {
                c43978ka0.m28826a();
            }
            this.f42659j = EnumC9302e.ON_CAPTURE_SESSION_ENDED;
        }
        this.f42654e.close();
    }

    @Override // p000.InterfaceC48771sf0
    /* renamed from: d */
    public void mo13896d(C11213q c11213q) {
        C33928Jx2.m99533a("ProcessingCaptureSession", "setSessionConfig (id=" + this.f42665p + ")");
        this.f42656g = c11213q;
        if (c11213q == null) {
            return;
        }
        C43978ka0 c43978ka0 = this.f42657h;
        if (c43978ka0 != null) {
            c43978ka0.m28825b(c11213q);
        }
        if (this.f42659j == EnumC9302e.ON_CAPTURE_SESSION_STARTED) {
            C45807nf0 m23350c = C45807nf0.C26566a.m23349e(c11213q.m69352d()).m23350c();
            this.f42663n = m23350c;
            m77379x(m23350c, this.f42664o);
            this.f42650a.m2259a(this.f42662m);
        }
    }

    @Override // p000.InterfaceC48771sf0
    /* renamed from: e */
    public void mo13895e(List<C11192d> list) {
        if (list.isEmpty()) {
            return;
        }
        C33928Jx2.m99533a("ProcessingCaptureSession", "issueCaptureRequests (id=" + this.f42665p + ") + state =" + this.f42659j);
        int i = C9301d.f42671a[this.f42659j.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3) {
                if (i == 4 || i == 5) {
                    C33928Jx2.m99533a("ProcessingCaptureSession", "Run issueCaptureRequests in wrong state, state = " + this.f42659j);
                    m77389n(list);
                    return;
                }
                return;
            }
            for (C11192d c11192d : list) {
                if (c11192d.m69445h() == 2) {
                    m77387p(c11192d);
                } else {
                    m77386q(c11192d);
                }
            }
            return;
        }
        this.f42660k = list;
    }

    @Override // p000.InterfaceC48771sf0
    /* renamed from: f */
    public void mo13894f() {
        C33928Jx2.m99533a("ProcessingCaptureSession", "cancelIssuedCaptureRequests (id=" + this.f42665p + ")");
        if (this.f42660k != null) {
            for (C11192d c11192d : this.f42660k) {
                for (AbstractC46943pa0 abstractC46943pa0 : c11192d.m69451b()) {
                    abstractC46943pa0.mo16367a();
                }
            }
            this.f42660k = null;
        }
    }

    @Override // p000.InterfaceC48771sf0
    /* renamed from: g */
    public List<C11192d> mo13893g() {
        return this.f42660k != null ? this.f42660k : Collections.emptyList();
    }

    @Override // p000.InterfaceC48771sf0
    /* renamed from: h */
    public void mo13892h(Map<DeferrableSurface, Long> map) {
    }

    /* renamed from: p */
    public void m77387p(C11192d c11192d) {
        C45807nf0.C26566a m23349e = C45807nf0.C26566a.m23349e(c11192d.m69448e());
        InterfaceC11197f m69448e = c11192d.m69448e();
        InterfaceC11197f.AbstractC11198a<Integer> abstractC11198a = C11192d.f52582i;
        if (m69448e.mo69359e(abstractC11198a)) {
            m23349e.m23347g(CaptureRequest.JPEG_ORIENTATION, (Integer) c11192d.m69448e().mo69363a(abstractC11198a));
        }
        InterfaceC11197f m69448e2 = c11192d.m69448e();
        InterfaceC11197f.AbstractC11198a<Integer> abstractC11198a2 = C11192d.f52583j;
        if (m69448e2.mo69359e(abstractC11198a2)) {
            m23349e.m23347g(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) c11192d.m69448e().mo69363a(abstractC11198a2)).byteValue()));
        }
        C45807nf0 m23350c = m23349e.m23350c();
        this.f42664o = m23350c;
        m77379x(this.f42663n, m23350c);
        this.f42650a.m2253g(new C9300c(c11192d));
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0023  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m77386q(C11192d c11192d) {
        boolean z;
        C33928Jx2.m99533a("ProcessingCaptureSession", "issueTriggerRequest");
        C45807nf0 m23350c = C45807nf0.C26566a.m23349e(c11192d.m69448e()).m23350c();
        for (InterfaceC11197f.AbstractC11198a<?> abstractC11198a : m23350c.mo69357g()) {
            CaptureRequest.Key key = (CaptureRequest.Key) abstractC11198a.mo69417d();
            if (key.equals(CaptureRequest.CONTROL_AF_TRIGGER) || key.equals(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER)) {
                z = true;
                break;
            }
            while (r1.hasNext()) {
            }
        }
        z = false;
        if (!z) {
            m77389n(Arrays.asList(c11192d));
        } else {
            this.f42650a.m2257c(m23350c, new C9299b(c11192d));
        }
    }

    /* renamed from: w */
    public void m77380w(C48179rf0 c48179rf0) {
        boolean z;
        if (this.f42659j == EnumC9302e.SESSION_INITIALIZED) {
            z = true;
        } else {
            z = false;
        }
        HZ3.m103736b(z, "Invalid state state:" + this.f42659j);
        C43978ka0 c43978ka0 = new C43978ka0(c48179rf0, m77388o(this.f42658i.m69345k()));
        this.f42657h = c43978ka0;
        this.f42650a.m2258b(c43978ka0);
        this.f42659j = EnumC9302e.ON_CAPTURE_SESSION_STARTED;
        C11213q c11213q = this.f42656g;
        if (c11213q != null) {
            mo13896d(c11213q);
        }
        if (this.f42660k != null) {
            mo13895e(this.f42660k);
            this.f42660k = null;
        }
    }

    /* renamed from: x */
    public final void m77379x(C45807nf0 c45807nf0, C45807nf0 c45807nf02) {
        C43385ja0.C24930a c24930a = new C43385ja0.C24930a();
        c24930a.m30299c(c45807nf0);
        c24930a.m30299c(c45807nf02);
        this.f42650a.m2254f(c24930a.m30300a());
    }
}

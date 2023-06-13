package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.view.Surface;
import androidx.camera.core.impl.C11192d;
import androidx.camera.core.impl.C11209m;
import androidx.camera.core.impl.C11210n;
import androidx.camera.core.impl.C11213q;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.InterfaceC11197f;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import p000.C46350oa0;
import p000.DX5;
import p000.O80;
import p000.QX5;
/* renamed from: rf0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C48179rf0 implements InterfaceC48771sf0 {

    /* renamed from: e */
    public PX5 f107412e;

    /* renamed from: f */
    public DX5 f107413f;

    /* renamed from: g */
    public C11213q f107414g;

    /* renamed from: l */
    public EnumC27973e f107419l;

    /* renamed from: m */
    public ListenableFuture<Void> f107420m;

    /* renamed from: n */
    public O80.C5832a<Void> f107421n;

    /* renamed from: a */
    public final Object f107408a = new Object();

    /* renamed from: b */
    public final List<C11192d> f107409b = new ArrayList();

    /* renamed from: c */
    public final CameraCaptureSession.CaptureCallback f107410c = new C27969a();

    /* renamed from: h */
    public InterfaceC11197f f107415h = C11210n.m69367S();

    /* renamed from: i */
    public C32090Cb0 f107416i = C32090Cb0.m112090e();

    /* renamed from: j */
    public final Map<DeferrableSurface, Surface> f107417j = new HashMap();

    /* renamed from: k */
    public List<DeferrableSurface> f107418k = Collections.emptyList();

    /* renamed from: o */
    public Map<DeferrableSurface, Long> f107422o = new HashMap();

    /* renamed from: p */
    public final SQ5 f107423p = new SQ5();

    /* renamed from: q */
    public final W56 f107424q = new W56();

    /* renamed from: d */
    public final C27974f f107411d = new C27974f();

    /* renamed from: rf0$a */
    /* loaded from: classes.dex */
    public class C27969a extends CameraCaptureSession.CaptureCallback {
        public C27969a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }
    }

    /* renamed from: rf0$b */
    /* loaded from: classes.dex */
    public class C27970b implements CA1<Void> {
        public C27970b() {
        }

        @Override // p000.CA1
        /* renamed from: a */
        public void onSuccess(Void r1) {
        }

        @Override // p000.CA1
        public void onFailure(Throwable th) {
            synchronized (C48179rf0.this.f107408a) {
                C48179rf0.this.f107412e.m90152e();
                int i = C27972d.f107428a[C48179rf0.this.f107419l.ordinal()];
                if ((i == 4 || i == 6 || i == 7) && !(th instanceof CancellationException)) {
                    C33928Jx2.m99521m("CaptureSession", "Opening session with fail " + C48179rf0.this.f107419l, th);
                    C48179rf0.this.m15608m();
                }
            }
        }
    }

    /* renamed from: rf0$c */
    /* loaded from: classes.dex */
    public class C27971c extends CameraCaptureSession.CaptureCallback {
        public C27971c() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            synchronized (C48179rf0.this.f107408a) {
                C11213q c11213q = C48179rf0.this.f107414g;
                if (c11213q == null) {
                    return;
                }
                C11192d m69348h = c11213q.m69348h();
                C33928Jx2.m99533a("CaptureSession", "Submit FLASH_MODE_OFF request");
                C48179rf0 c48179rf0 = C48179rf0.this;
                c48179rf0.mo13895e(Collections.singletonList(c48179rf0.f107424q.m78846a(m69348h)));
            }
        }
    }

    /* renamed from: rf0$d */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C27972d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f107428a;

        static {
            int[] iArr = new int[EnumC27973e.values().length];
            f107428a = iArr;
            try {
                iArr[EnumC27973e.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f107428a[EnumC27973e.INITIALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f107428a[EnumC27973e.GET_SURFACE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f107428a[EnumC27973e.OPENING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f107428a[EnumC27973e.OPENED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f107428a[EnumC27973e.CLOSED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f107428a[EnumC27973e.RELEASING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f107428a[EnumC27973e.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: rf0$e */
    /* loaded from: classes.dex */
    public enum EnumC27973e {
        UNINITIALIZED,
        INITIALIZED,
        GET_SURFACE,
        OPENING,
        OPENED,
        CLOSED,
        RELEASING,
        RELEASED
    }

    /* renamed from: rf0$f */
    /* loaded from: classes.dex */
    public final class C27974f extends DX5.AbstractC1519a {
        public C27974f() {
        }

        @Override // p000.DX5.AbstractC1519a
        /* renamed from: p */
        public void mo15594p(DX5 dx5) {
            synchronized (C48179rf0.this.f107408a) {
                switch (C27972d.f107428a[C48179rf0.this.f107419l.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                        throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + C48179rf0.this.f107419l);
                    case 4:
                    case 6:
                    case 7:
                        C48179rf0.this.m15608m();
                        break;
                    case 8:
                        C33928Jx2.m99533a("CaptureSession", "ConfigureFailed callback after change to RELEASED state");
                        break;
                }
                C33928Jx2.m99531c("CaptureSession", "CameraCaptureSession.onConfigureFailed() " + C48179rf0.this.f107419l);
            }
        }

        @Override // p000.DX5.AbstractC1519a
        /* renamed from: q */
        public void mo15593q(DX5 dx5) {
            synchronized (C48179rf0.this.f107408a) {
                switch (C27972d.f107428a[C48179rf0.this.f107419l.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 5:
                    case 8:
                        throw new IllegalStateException("onConfigured() should not be possible in state: " + C48179rf0.this.f107419l);
                    case 4:
                        C48179rf0 c48179rf0 = C48179rf0.this;
                        c48179rf0.f107419l = EnumC27973e.OPENED;
                        c48179rf0.f107413f = dx5;
                        if (c48179rf0.f107414g != null) {
                            List<C11192d> m112087c = c48179rf0.f107416i.m112091d().m112087c();
                            if (!m112087c.isEmpty()) {
                                C48179rf0 c48179rf02 = C48179rf0.this;
                                c48179rf02.m15605p(c48179rf02.m15597x(m112087c));
                            }
                        }
                        C33928Jx2.m99533a("CaptureSession", "Attempting to send capture request onConfigured");
                        C48179rf0 c48179rf03 = C48179rf0.this;
                        c48179rf03.m15603r(c48179rf03.f107414g);
                        C48179rf0.this.m15604q();
                        break;
                    case 6:
                        C48179rf0.this.f107413f = dx5;
                        break;
                    case 7:
                        dx5.close();
                        break;
                }
                C33928Jx2.m99533a("CaptureSession", "CameraCaptureSession.onConfigured() mState=" + C48179rf0.this.f107419l);
            }
        }

        @Override // p000.DX5.AbstractC1519a
        /* renamed from: r */
        public void mo15592r(DX5 dx5) {
            synchronized (C48179rf0.this.f107408a) {
                if (C27972d.f107428a[C48179rf0.this.f107419l.ordinal()] != 1) {
                    C33928Jx2.m99533a("CaptureSession", "CameraCaptureSession.onReady() " + C48179rf0.this.f107419l);
                } else {
                    throw new IllegalStateException("onReady() should not be possible in state: " + C48179rf0.this.f107419l);
                }
            }
        }

        @Override // p000.DX5.AbstractC1519a
        /* renamed from: s */
        public void mo15591s(DX5 dx5) {
            synchronized (C48179rf0.this.f107408a) {
                if (C48179rf0.this.f107419l != EnumC27973e.UNINITIALIZED) {
                    C33928Jx2.m99533a("CaptureSession", "onSessionFinished()");
                    C48179rf0.this.m15608m();
                } else {
                    throw new IllegalStateException("onSessionFinished() should not be possible in state: " + C48179rf0.this.f107419l);
                }
            }
        }
    }

    public C48179rf0() {
        this.f107419l = EnumC27973e.UNINITIALIZED;
        this.f107419l = EnumC27973e.INITIALIZED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void m15602s(CameraCaptureSession cameraCaptureSession, int i, boolean z) {
        synchronized (this.f107408a) {
            if (this.f107419l == EnumC27973e.OPENED) {
                m15603r(this.f107414g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ Object m15600u(O80.C5832a c5832a) throws Exception {
        boolean z;
        String str;
        synchronized (this.f107408a) {
            if (this.f107421n == null) {
                z = true;
            } else {
                z = false;
            }
            HZ3.m103728j(z, "Release completer expected to be null");
            this.f107421n = c5832a;
            str = "Release[session=" + this + "]";
        }
        return str;
    }

    /* renamed from: v */
    public static InterfaceC11197f m15599v(List<C11192d> list) {
        C11209m m69372V = C11209m.m69372V();
        for (C11192d c11192d : list) {
            InterfaceC11197f m69448e = c11192d.m69448e();
            for (InterfaceC11197f.AbstractC11198a<?> abstractC11198a : m69448e.mo69357g()) {
                Object mo69360d = m69448e.mo69360d(abstractC11198a, null);
                if (m69372V.mo69359e(abstractC11198a)) {
                    Object mo69360d2 = m69372V.mo69360d(abstractC11198a, null);
                    if (!Objects.equals(mo69360d2, mo69360d)) {
                        C33928Jx2.m99533a("CaptureSession", "Detect conflicting option " + abstractC11198a.mo69418c() + " : " + mo69360d + " != " + mo69360d2);
                    }
                } else {
                    m69372V.mo69373C(abstractC11198a, mo69360d);
                }
            }
        }
        return m69372V;
    }

    @Override // p000.InterfaceC48771sf0
    /* renamed from: a */
    public ListenableFuture<Void> mo13899a(final C11213q c11213q, final CameraDevice cameraDevice, PX5 px5) {
        synchronized (this.f107408a) {
            if (C27972d.f107428a[this.f107419l.ordinal()] != 2) {
                C33928Jx2.m99531c("CaptureSession", "Open not allowed in state: " + this.f107419l);
                return IA1.m102838f(new IllegalStateException("open() should not allow the state: " + this.f107419l));
            }
            this.f107419l = EnumC27973e.GET_SURFACE;
            ArrayList arrayList = new ArrayList(c11213q.m69345k());
            this.f107418k = arrayList;
            this.f107412e = px5;
            DA1 m110816e = DA1.m110820a(px5.m90153d(arrayList, 5000L)).m110816e(new InterfaceC20537fp() { // from class: pf0
                @Override // p000.InterfaceC20537fp
                public final ListenableFuture apply(Object obj) {
                    ListenableFuture m15601t;
                    m15601t = C48179rf0.this.m15601t(c11213q, cameraDevice, (List) obj);
                    return m15601t;
                }
            }, this.f107412e.m90155b());
            IA1.m102842b(m110816e, new C27970b(), this.f107412e.m90155b());
            return IA1.m102834j(m110816e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056 A[Catch: all -> 0x00af, TryCatch #1 {, blocks: (B:4:0x0003, B:5:0x000d, B:28:0x00a8, B:7:0x0012, B:10:0x0018, B:14:0x0024, B:13:0x001d, B:15:0x0029, B:17:0x0056, B:18:0x005a, B:20:0x005e, B:21:0x0069, B:22:0x006b, B:24:0x006d, B:25:0x008a, B:26:0x008f, B:27:0x00a7), top: B:36:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e A[Catch: all -> 0x00af, TryCatch #1 {, blocks: (B:4:0x0003, B:5:0x000d, B:28:0x00a8, B:7:0x0012, B:10:0x0018, B:14:0x0024, B:13:0x001d, B:15:0x0029, B:17:0x0056, B:18:0x005a, B:20:0x005e, B:21:0x0069, B:22:0x006b, B:24:0x006d, B:25:0x008a, B:26:0x008f, B:27:0x00a7), top: B:36:0x0003, inners: #0 }] */
    @Override // p000.InterfaceC48771sf0
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ListenableFuture<Void> mo13898b(boolean z) {
        synchronized (this.f107408a) {
            switch (C27972d.f107428a[this.f107419l.ordinal()]) {
                case 1:
                    throw new IllegalStateException("release() should not be possible in state: " + this.f107419l);
                case 2:
                    this.f107419l = EnumC27973e.RELEASED;
                    return IA1.m102836h(null);
                case 3:
                    PX5 px5 = this.f107412e;
                    HZ3.m103730h(px5, "The Opener shouldn't null in state:" + this.f107419l);
                    this.f107412e.m90152e();
                    this.f107419l = EnumC27973e.RELEASED;
                    return IA1.m102836h(null);
                case 4:
                    this.f107416i.m112091d().m112089a();
                    this.f107419l = EnumC27973e.RELEASING;
                    PX5 px52 = this.f107412e;
                    HZ3.m103730h(px52, "The Opener shouldn't null in state:" + this.f107419l);
                    if (this.f107412e.m90152e()) {
                        m15608m();
                        return IA1.m102836h(null);
                    }
                    if (this.f107420m == null) {
                        this.f107420m = O80.m92864a(new O80.InterfaceC5834c() { // from class: qf0
                            @Override // p000.O80.InterfaceC5834c
                            /* renamed from: a */
                            public final Object mo3207a(O80.C5832a c5832a) {
                                Object m15600u;
                                m15600u = C48179rf0.this.m15600u(c5832a);
                                return m15600u;
                            }
                        });
                    }
                    return this.f107420m;
                case 5:
                case 6:
                    DX5 dx5 = this.f107413f;
                    if (dx5 != null) {
                        if (z) {
                            try {
                                dx5.mo100283d();
                            } catch (CameraAccessException e) {
                                C33928Jx2.m99530d("CaptureSession", "Unable to abort captures.", e);
                            }
                        }
                        this.f107413f.close();
                    }
                    this.f107416i.m112091d().m112089a();
                    this.f107419l = EnumC27973e.RELEASING;
                    PX5 px522 = this.f107412e;
                    HZ3.m103730h(px522, "The Opener shouldn't null in state:" + this.f107419l);
                    if (this.f107412e.m90152e()) {
                    }
                    if (this.f107420m == null) {
                    }
                    return this.f107420m;
                case 7:
                    if (this.f107420m == null) {
                    }
                    return this.f107420m;
                default:
                    return IA1.m102836h(null);
            }
        }
    }

    @Override // p000.InterfaceC48771sf0
    /* renamed from: c */
    public C11213q mo13897c() {
        C11213q c11213q;
        synchronized (this.f107408a) {
            c11213q = this.f107414g;
        }
        return c11213q;
    }

    @Override // p000.InterfaceC48771sf0
    public void close() {
        synchronized (this.f107408a) {
            int i = C27972d.f107428a[this.f107419l.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                if (this.f107414g != null) {
                                    List<C11192d> m112088b = this.f107416i.m112091d().m112088b();
                                    if (!m112088b.isEmpty()) {
                                        try {
                                            mo13895e(m15597x(m112088b));
                                        } catch (IllegalStateException e) {
                                            C33928Jx2.m99530d("CaptureSession", "Unable to issue the request before close the capture session", e);
                                        }
                                    }
                                }
                            }
                        }
                        PX5 px5 = this.f107412e;
                        HZ3.m103730h(px5, "The Opener shouldn't null in state:" + this.f107419l);
                        this.f107412e.m90152e();
                        this.f107419l = EnumC27973e.CLOSED;
                        this.f107414g = null;
                    } else {
                        PX5 px52 = this.f107412e;
                        HZ3.m103730h(px52, "The Opener shouldn't null in state:" + this.f107419l);
                        this.f107412e.m90152e();
                    }
                }
                this.f107419l = EnumC27973e.RELEASED;
            } else {
                throw new IllegalStateException("close() should not be possible in state: " + this.f107419l);
            }
        }
    }

    @Override // p000.InterfaceC48771sf0
    /* renamed from: d */
    public void mo13896d(C11213q c11213q) {
        synchronized (this.f107408a) {
            switch (C27972d.f107428a[this.f107419l.ordinal()]) {
                case 1:
                    throw new IllegalStateException("setSessionConfig() should not be possible in state: " + this.f107419l);
                case 2:
                case 3:
                case 4:
                    this.f107414g = c11213q;
                    break;
                case 5:
                    this.f107414g = c11213q;
                    if (c11213q == null) {
                        return;
                    }
                    if (!this.f107417j.keySet().containsAll(c11213q.m69345k())) {
                        C33928Jx2.m99531c("CaptureSession", "Does not have the proper configured lists");
                        return;
                    }
                    C33928Jx2.m99533a("CaptureSession", "Attempting to submit CaptureRequest after setting");
                    m15603r(this.f107414g);
                    break;
                case 6:
                case 7:
                case 8:
                    throw new IllegalStateException("Session configuration cannot be set on a closed/released session.");
            }
        }
    }

    @Override // p000.InterfaceC48771sf0
    /* renamed from: e */
    public void mo13895e(List<C11192d> list) {
        synchronized (this.f107408a) {
            switch (C27972d.f107428a[this.f107419l.ordinal()]) {
                case 1:
                    throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + this.f107419l);
                case 2:
                case 3:
                case 4:
                    this.f107409b.addAll(list);
                    break;
                case 5:
                    this.f107409b.addAll(list);
                    m15604q();
                    break;
                case 6:
                case 7:
                case 8:
                    throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
            }
        }
    }

    @Override // p000.InterfaceC48771sf0
    /* renamed from: f */
    public void mo13894f() {
        ArrayList<C11192d> arrayList;
        synchronized (this.f107408a) {
            if (!this.f107409b.isEmpty()) {
                arrayList = new ArrayList(this.f107409b);
                this.f107409b.clear();
            } else {
                arrayList = null;
            }
        }
        if (arrayList != null) {
            for (C11192d c11192d : arrayList) {
                for (AbstractC46943pa0 abstractC46943pa0 : c11192d.m69451b()) {
                    abstractC46943pa0.mo16367a();
                }
            }
        }
    }

    @Override // p000.InterfaceC48771sf0
    /* renamed from: g */
    public List<C11192d> mo13893g() {
        List<C11192d> unmodifiableList;
        synchronized (this.f107408a) {
            unmodifiableList = Collections.unmodifiableList(this.f107409b);
        }
        return unmodifiableList;
    }

    @Override // p000.InterfaceC48771sf0
    /* renamed from: h */
    public void mo13892h(Map<DeferrableSurface, Long> map) {
        synchronized (this.f107408a) {
            this.f107422o = map;
        }
    }

    /* renamed from: l */
    public final CameraCaptureSession.CaptureCallback m15609l(List<AbstractC46943pa0> list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        for (AbstractC46943pa0 abstractC46943pa0 : list) {
            arrayList.add(C39878df0.m43935a(abstractC46943pa0));
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return K90.m99129a(arrayList);
    }

    /* renamed from: m */
    public void m15608m() {
        EnumC27973e enumC27973e = this.f107419l;
        EnumC27973e enumC27973e2 = EnumC27973e.RELEASED;
        if (enumC27973e == enumC27973e2) {
            C33928Jx2.m99533a("CaptureSession", "Skipping finishClose due to being state RELEASED.");
            return;
        }
        this.f107419l = enumC27973e2;
        this.f107413f = null;
        O80.C5832a<Void> c5832a = this.f107421n;
        if (c5832a != null) {
            c5832a.m92861c(null);
            this.f107421n = null;
        }
    }

    /* renamed from: n */
    public final C36053Sz3 m15607n(C11213q.AbstractC11218e abstractC11218e, Map<DeferrableSurface, Surface> map, String str) {
        Surface surface = map.get(abstractC11218e.mo69319d());
        HZ3.m103730h(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        C36053Sz3 c36053Sz3 = new C36053Sz3(abstractC11218e.mo69318e(), surface);
        if (str != null) {
            c36053Sz3.m84505e(str);
        } else {
            c36053Sz3.m84505e(abstractC11218e.mo69321b());
        }
        if (!abstractC11218e.mo69320c().isEmpty()) {
            c36053Sz3.m84508b();
            for (DeferrableSurface deferrableSurface : abstractC11218e.mo69320c()) {
                Surface surface2 = map.get(deferrableSurface);
                HZ3.m103730h(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                c36053Sz3.m84509a(surface2);
            }
        }
        return c36053Sz3;
    }

    /* renamed from: o */
    public final List<C36053Sz3> m15606o(List<C36053Sz3> list) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (C36053Sz3 c36053Sz3 : list) {
            if (!arrayList.contains(c36053Sz3.m84506d())) {
                arrayList.add(c36053Sz3.m84506d());
                arrayList2.add(c36053Sz3);
            }
        }
        return arrayList2;
    }

    /* renamed from: p */
    public int m15605p(List<C11192d> list) {
        C46350oa0 c46350oa0;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        synchronized (this.f107408a) {
            if (list.isEmpty()) {
                return -1;
            }
            try {
                c46350oa0 = new C46350oa0();
                arrayList = new ArrayList();
                C33928Jx2.m99533a("CaptureSession", "Issuing capture request.");
                z = false;
                for (C11192d c11192d : list) {
                    if (c11192d.m69447f().isEmpty()) {
                        C33928Jx2.m99533a("CaptureSession", "Skipping issuing empty capture request.");
                    } else {
                        Iterator<DeferrableSurface> it = c11192d.m69447f().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                DeferrableSurface next = it.next();
                                if (!this.f107417j.containsKey(next)) {
                                    C33928Jx2.m99533a("CaptureSession", "Skipping capture request with invalid surface: " + next);
                                    z2 = false;
                                    break;
                                }
                            } else {
                                z2 = true;
                                break;
                            }
                        }
                        if (z2) {
                            if (c11192d.m69445h() == 2) {
                                z = true;
                            }
                            C11192d.C11193a m69433k = C11192d.C11193a.m69433k(c11192d);
                            if (c11192d.m69445h() == 5 && c11192d.m69450c() != null) {
                                m69433k.m69428p(c11192d.m69450c());
                            }
                            C11213q c11213q = this.f107414g;
                            if (c11213q != null) {
                                m69433k.m69439e(c11213q.m69348h().m69448e());
                            }
                            m69433k.m69439e(this.f107415h);
                            m69433k.m69439e(c11192d.m69448e());
                            CaptureRequest m61197c = C39217ca0.m61197c(m69433k.m69436h(), this.f107413f.getDevice(), this.f107417j);
                            if (m61197c == null) {
                                C33928Jx2.m99533a("CaptureSession", "Skipping issuing request without surface.");
                                return -1;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (AbstractC46943pa0 abstractC46943pa0 : c11192d.m69451b()) {
                                C39878df0.m43934b(abstractC46943pa0, arrayList2);
                            }
                            c46350oa0.m20837a(m61197c, arrayList2);
                            arrayList.add(m61197c);
                        }
                    }
                }
            } catch (CameraAccessException e) {
                C33928Jx2.m99531c("CaptureSession", "Unable to access camera: " + e.getMessage());
                Thread.dumpStack();
            }
            if (!arrayList.isEmpty()) {
                if (this.f107423p.m85478a(arrayList, z)) {
                    this.f107413f.mo100280g();
                    c46350oa0.m20835c(new C46350oa0.InterfaceC27009a() { // from class: of0
                        @Override // p000.C46350oa0.InterfaceC27009a
                        /* renamed from: a */
                        public final void mo20692a(CameraCaptureSession cameraCaptureSession, int i, boolean z3) {
                            C48179rf0.this.m15602s(cameraCaptureSession, i, z3);
                        }
                    });
                }
                if (this.f107424q.m78845b(arrayList, z)) {
                    c46350oa0.m20837a((CaptureRequest) arrayList.get(arrayList.size() - 1), Collections.singletonList(new C27971c()));
                }
                return this.f107413f.mo100282e(arrayList, c46350oa0);
            }
            C33928Jx2.m99533a("CaptureSession", "Skipping issuing burst request due to no valid request elements");
            return -1;
        }
    }

    /* renamed from: q */
    public void m15604q() {
        if (this.f107409b.isEmpty()) {
            return;
        }
        try {
            m15605p(this.f107409b);
        } finally {
            this.f107409b.clear();
        }
    }

    /* renamed from: r */
    public int m15603r(C11213q c11213q) {
        synchronized (this.f107408a) {
            if (c11213q == null) {
                C33928Jx2.m99533a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no configuration case.");
                return -1;
            }
            C11192d m69348h = c11213q.m69348h();
            if (m69348h.m69447f().isEmpty()) {
                C33928Jx2.m99533a("CaptureSession", "Skipping issueRepeatingCaptureRequests for no surface.");
                try {
                    this.f107413f.mo100280g();
                } catch (CameraAccessException e) {
                    C33928Jx2.m99531c("CaptureSession", "Unable to access camera: " + e.getMessage());
                    Thread.dumpStack();
                }
                return -1;
            }
            try {
                C33928Jx2.m99533a("CaptureSession", "Issuing request for session.");
                C11192d.C11193a m69433k = C11192d.C11193a.m69433k(m69348h);
                InterfaceC11197f m15599v = m15599v(this.f107416i.m112091d().m112085e());
                this.f107415h = m15599v;
                m69433k.m69439e(m15599v);
                CaptureRequest m61197c = C39217ca0.m61197c(m69433k.m69436h(), this.f107413f.getDevice(), this.f107417j);
                if (m61197c == null) {
                    C33928Jx2.m99533a("CaptureSession", "Skipping issuing empty request for session.");
                    return -1;
                }
                return this.f107413f.mo92027j(m61197c, m15609l(m69348h.m69451b(), this.f107410c));
            } catch (CameraAccessException e2) {
                C33928Jx2.m99531c("CaptureSession", "Unable to access camera: " + e2.getMessage());
                Thread.dumpStack();
                return -1;
            }
        }
    }

    /* renamed from: w */
    public final ListenableFuture<Void> m15601t(List<Surface> list, C11213q c11213q, CameraDevice cameraDevice) {
        synchronized (this.f107408a) {
            int i = C27972d.f107428a[this.f107419l.ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        return IA1.m102838f(new CancellationException("openCaptureSession() not execute in state: " + this.f107419l));
                    }
                } else {
                    this.f107417j.clear();
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        this.f107417j.put(this.f107418k.get(i2), list.get(i2));
                    }
                    this.f107419l = EnumC27973e.OPENING;
                    C33928Jx2.m99533a("CaptureSession", "Opening capture session.");
                    DX5.AbstractC1519a m88423u = QX5.m88423u(this.f107411d, new QX5.C6795a(c11213q.m69347i()));
                    C43385ja0 c43385ja0 = new C43385ja0(c11213q.m69352d());
                    C32090Cb0 m30309S = c43385ja0.m30309S(C32090Cb0.m112090e());
                    this.f107416i = m30309S;
                    List<C11192d> m112086d = m30309S.m112091d().m112086d();
                    C11192d.C11193a m69433k = C11192d.C11193a.m69433k(c11213q.m69348h());
                    for (C11192d c11192d : m112086d) {
                        m69433k.m69439e(c11192d.m69448e());
                    }
                    ArrayList arrayList = new ArrayList();
                    String m30304X = c43385ja0.m30304X(null);
                    for (C11213q.AbstractC11218e abstractC11218e : c11213q.m69350f()) {
                        C36053Sz3 m15607n = m15607n(abstractC11218e, this.f107417j, m30304X);
                        if (this.f107422o.containsKey(abstractC11218e.mo69319d())) {
                            m15607n.m84504f(this.f107422o.get(abstractC11218e.mo69319d()).longValue());
                        }
                        arrayList.add(m15607n);
                    }
                    C49529tv5 m90156a = this.f107412e.m90156a(0, m15606o(arrayList), m88423u);
                    if (c11213q.m69344l() == 5 && c11213q.m69351e() != null) {
                        m90156a.m11214f(R22.m87400b(c11213q.m69351e()));
                    }
                    try {
                        CaptureRequest m61196d = C39217ca0.m61196d(m69433k.m69436h(), cameraDevice);
                        if (m61196d != null) {
                            m90156a.m11213g(m61196d);
                        }
                        return this.f107412e.m90154c(cameraDevice, m90156a, this.f107418k);
                    } catch (CameraAccessException e) {
                        return IA1.m102838f(e);
                    }
                }
            }
            return IA1.m102838f(new IllegalStateException("openCaptureSession() should not be possible in state: " + this.f107419l));
        }
    }

    /* renamed from: x */
    public List<C11192d> m15597x(List<C11192d> list) {
        ArrayList arrayList = new ArrayList();
        for (C11192d c11192d : list) {
            C11192d.C11193a m69433k = C11192d.C11193a.m69433k(c11192d);
            m69433k.m69425s(1);
            for (DeferrableSurface deferrableSurface : this.f107414g.m69348h().m69447f()) {
                m69433k.m69438f(deferrableSurface);
            }
            arrayList.add(m69433k.m69436h());
        }
        return arrayList;
    }
}

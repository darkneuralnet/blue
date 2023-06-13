package p000;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import android.util.Rational;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.C11192d;
import androidx.camera.core.impl.C11213q;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.InterfaceC11197f;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import p000.C43385ja0;
import p000.C45807nf0;
import p000.C47885r90;
import p000.O80;
/* renamed from: r90  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C47885r90 implements CameraControlInternal {

    /* renamed from: b */
    public final C27857b f106526b;

    /* renamed from: c */
    public final Executor f106527c;

    /* renamed from: d */
    public final Object f106528d = new Object();

    /* renamed from: e */
    public final C36761Wa0 f106529e;

    /* renamed from: f */
    public final CameraControlInternal.InterfaceC11186b f106530f;

    /* renamed from: g */
    public final C11213q.C11215b f106531g;

    /* renamed from: h */
    public final C34377Lv1 f106532h;

    /* renamed from: i */
    public final C46203oJ6 f106533i;

    /* renamed from: j */
    public final U56 f106534j;

    /* renamed from: k */
    public final C31920Bi1 f106535k;

    /* renamed from: l */
    public InterfaceC48574sJ6 f106536l;

    /* renamed from: m */
    public final C38973c90 f106537m;

    /* renamed from: n */
    public final P90 f106538n;

    /* renamed from: o */
    public int f106539o;

    /* renamed from: p */
    public volatile boolean f106540p;

    /* renamed from: q */
    public volatile int f106541q;

    /* renamed from: r */
    public final C26416n8 f106542r;

    /* renamed from: s */
    public final C7278Rq f106543s;

    /* renamed from: t */
    public final AtomicLong f106544t;

    /* renamed from: u */
    public volatile ListenableFuture<Void> f106545u;

    /* renamed from: v */
    public int f106546v;

    /* renamed from: w */
    public long f106547w;

    /* renamed from: x */
    public final C27856a f106548x;

    /* renamed from: r90$a */
    /* loaded from: classes.dex */
    public static final class C27856a extends AbstractC46943pa0 {

        /* renamed from: a */
        public Set<AbstractC46943pa0> f106549a = new HashSet();

        /* renamed from: b */
        public Map<AbstractC46943pa0, Executor> f106550b = new ArrayMap();

        @Override // p000.AbstractC46943pa0
        /* renamed from: a */
        public void mo16367a() {
            for (final AbstractC46943pa0 abstractC46943pa0 : this.f106549a) {
                try {
                    this.f106550b.get(abstractC46943pa0).execute(new Runnable() { // from class: p90
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC46943pa0.this.mo16367a();
                        }
                    });
                } catch (RejectedExecutionException e) {
                    C33928Jx2.m99530d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e);
                }
            }
        }

        @Override // p000.AbstractC46943pa0
        /* renamed from: b */
        public void mo4448b(final InterfaceC51685xa0 interfaceC51685xa0) {
            for (final AbstractC46943pa0 abstractC46943pa0 : this.f106549a) {
                try {
                    this.f106550b.get(abstractC46943pa0).execute(new Runnable() { // from class: q90
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC46943pa0.this.mo4448b(interfaceC51685xa0);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    C33928Jx2.m99530d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e);
                }
            }
        }

        @Override // p000.AbstractC46943pa0
        /* renamed from: c */
        public void mo16366c(final C48129ra0 c48129ra0) {
            for (final AbstractC46943pa0 abstractC46943pa0 : this.f106549a) {
                try {
                    this.f106550b.get(abstractC46943pa0).execute(new Runnable() { // from class: o90
                        @Override // java.lang.Runnable
                        public final void run() {
                            AbstractC46943pa0.this.mo16366c(c48129ra0);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    C33928Jx2.m99530d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e);
                }
            }
        }

        /* renamed from: g */
        public void m16362g(Executor executor, AbstractC46943pa0 abstractC46943pa0) {
            this.f106549a.add(abstractC46943pa0);
            this.f106550b.put(abstractC46943pa0, executor);
        }

        /* renamed from: k */
        public void m16358k(AbstractC46943pa0 abstractC46943pa0) {
            this.f106549a.remove(abstractC46943pa0);
            this.f106550b.remove(abstractC46943pa0);
        }
    }

    /* renamed from: r90$b */
    /* loaded from: classes.dex */
    public static final class C27857b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: a */
        public final Set<InterfaceC27858c> f106551a = new HashSet();

        /* renamed from: b */
        public final Executor f106552b;

        public C27857b(Executor executor) {
            this.f106552b = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m16355c(TotalCaptureResult totalCaptureResult) {
            HashSet hashSet = new HashSet();
            for (InterfaceC27858c interfaceC27858c : this.f106551a) {
                if (interfaceC27858c.mo16353a(totalCaptureResult)) {
                    hashSet.add(interfaceC27858c);
                }
            }
            if (!hashSet.isEmpty()) {
                this.f106551a.removeAll(hashSet);
            }
        }

        /* renamed from: b */
        public void m16356b(InterfaceC27858c interfaceC27858c) {
            this.f106551a.add(interfaceC27858c);
        }

        /* renamed from: d */
        public void m16354d(InterfaceC27858c interfaceC27858c) {
            this.f106551a.remove(interfaceC27858c);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f106552b.execute(new Runnable() { // from class: s90
                @Override // java.lang.Runnable
                public final void run() {
                    C47885r90.C27857b.this.m16355c(totalCaptureResult);
                }
            });
        }
    }

    /* renamed from: r90$c */
    /* loaded from: classes.dex */
    public interface InterfaceC27858c {
        /* renamed from: a */
        boolean mo16353a(TotalCaptureResult totalCaptureResult);
    }

    public C47885r90(C36761Wa0 c36761Wa0, ScheduledExecutorService scheduledExecutorService, Executor executor, CameraControlInternal.InterfaceC11186b interfaceC11186b, C36099Te4 c36099Te4) {
        C11213q.C11215b c11215b = new C11213q.C11215b();
        this.f106531g = c11215b;
        this.f106539o = 0;
        this.f106540p = false;
        this.f106541q = 2;
        this.f106544t = new AtomicLong(0L);
        this.f106545u = IA1.m102836h(null);
        this.f106546v = 1;
        this.f106547w = 0L;
        C27856a c27856a = new C27856a();
        this.f106548x = c27856a;
        this.f106529e = c36761Wa0;
        this.f106530f = interfaceC11186b;
        this.f106527c = executor;
        C27857b c27857b = new C27857b(executor);
        this.f106526b = c27857b;
        c11215b.m69323u(this.f106546v);
        c11215b.m69335i(C39267cf0.m61091d(c27857b));
        c11215b.m69335i(c27856a);
        this.f106535k = new C31920Bi1(this, c36761Wa0, executor);
        this.f106532h = new C34377Lv1(this, scheduledExecutorService, executor, c36099Te4);
        this.f106533i = new C46203oJ6(this, c36761Wa0, executor);
        this.f106534j = new U56(this, c36761Wa0, executor);
        this.f106536l = new C50945wJ6(c36761Wa0);
        this.f106542r = new C26416n8(c36099Te4);
        this.f106543s = new C7278Rq(c36099Te4);
        this.f106537m = new C38973c90(this, executor);
        this.f106538n = new P90(this, c36761Wa0, c36099Te4, executor);
        executor.execute(new Runnable() { // from class: j90
            @Override // java.lang.Runnable
            public final void run() {
                C47885r90.this.m16412W();
            }
        });
    }

    /* renamed from: R */
    public static boolean m16417R(TotalCaptureResult totalCaptureResult, long j) {
        Long l;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        if (!(tag instanceof C51672xY5) || (l = (Long) ((C51672xY5) tag).m5016c("CameraControlSessionUpdateId")) == null || l.longValue() < j) {
            return false;
        }
        return true;
    }

    /* renamed from: T */
    public static /* synthetic */ void m16415T() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U */
    public /* synthetic */ void m16414U(Executor executor, AbstractC46943pa0 abstractC46943pa0) {
        this.f106548x.m16362g(executor, abstractC46943pa0);
    }

    /* renamed from: V */
    public static /* synthetic */ void m16413V() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ void m16412W() {
        m16372v(this.f106537m.m61895l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ void m16411X(AbstractC46943pa0 abstractC46943pa0) {
        this.f106548x.m16358k(abstractC46943pa0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ ListenableFuture m16410Y(List list, int i, int i2, int i3, Void r5) throws Exception {
        return this.f106538n.m90675e(list, i, i2, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ void m16409Z(O80.C5832a c5832a) {
        IA1.m102833k(m16379o0(m16381n0()), c5832a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public /* synthetic */ Object m16407a0(final O80.C5832a c5832a) throws Exception {
        this.f106527c.execute(new Runnable() { // from class: l90
            @Override // java.lang.Runnable
            public final void run() {
                C47885r90.this.m16409Z(c5832a);
            }
        });
        return "updateSessionConfigAsync";
    }

    /* renamed from: b0 */
    public static /* synthetic */ boolean m16405b0(long j, O80.C5832a c5832a, TotalCaptureResult totalCaptureResult) {
        if (m16417R(totalCaptureResult, j)) {
            c5832a.m92861c(null);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public /* synthetic */ Object m16403c0(final long j, final O80.C5832a c5832a) throws Exception {
        m16372v(new InterfaceC27858c() { // from class: e90
            @Override // p000.C47885r90.InterfaceC27858c
            /* renamed from: a */
            public final boolean mo16353a(TotalCaptureResult totalCaptureResult) {
                boolean m16405b0;
                m16405b0 = C47885r90.m16405b0(j, c5832a, totalCaptureResult);
                return m16405b0;
            }
        });
        return "waitForSessionUpdateId:" + j;
    }

    /* renamed from: A */
    public int m16434A() {
        return this.f106541q;
    }

    /* renamed from: B */
    public C34377Lv1 m16433B() {
        return this.f106532h;
    }

    /* renamed from: C */
    public int m16432C() {
        Integer num = (Integer) this.f106529e.m78176a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: D */
    public int m16431D() {
        Integer num = (Integer) this.f106529e.m78176a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: E */
    public int m16430E() {
        Integer num = (Integer) this.f106529e.m78176a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* renamed from: F */
    public C11213q m16429F() {
        this.f106531g.m69323u(this.f106546v);
        this.f106531g.m69325s(m16428G());
        Object m30307U = this.f106537m.m61896k().m30307U(null);
        if (m30307U != null && (m30307U instanceof Integer)) {
            this.f106531g.m69332l("Camera2CameraControl", m30307U);
        }
        this.f106531g.m69332l("CameraControlSessionUpdateId", Long.valueOf(this.f106547w));
        return this.f106531g.m69331m();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0070 A[LOOP:0: B:12:0x006a->B:14:0x0070, LOOP_END] */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InterfaceC11197f m16428G() {
        int m86275a;
        C43385ja0.C24930a c24930a = new C43385ja0.C24930a();
        c24930a.m30298e(CaptureRequest.CONTROL_MODE, 1);
        this.f106532h.m96176i(c24930a);
        this.f106542r.m24286a(c24930a);
        this.f106533i.m21368e(c24930a);
        if (this.f106540p) {
            c24930a.m30298e(CaptureRequest.FLASH_MODE, 2);
        } else {
            int i = this.f106541q;
            if (i != 0) {
                if (i == 1) {
                    m86275a = 3;
                }
            } else {
                m86275a = this.f106543s.m86275a(2);
            }
            c24930a.m30298e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(m16427H(m86275a)));
            c24930a.m30298e(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(m16425J(1)));
            this.f106535k.m113659c(c24930a);
            C43385ja0 m61896k = this.f106537m.m61896k();
            for (InterfaceC11197f.AbstractC11198a<?> abstractC11198a : m61896k.mo69357g()) {
                c24930a.mo1343b().mo69369n(abstractC11198a, InterfaceC11197f.EnumC11200c.ALWAYS_OVERRIDE, m61896k.mo69363a(abstractC11198a));
            }
            return c24930a.m30300a();
        }
        m86275a = 1;
        c24930a.m30298e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(m16427H(m86275a)));
        c24930a.m30298e(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(m16425J(1)));
        this.f106535k.m113659c(c24930a);
        C43385ja0 m61896k2 = this.f106537m.m61896k();
        while (r2.hasNext()) {
        }
        return c24930a.m30300a();
    }

    /* renamed from: H */
    public int m16427H(int i) {
        int[] iArr = (int[]) this.f106529e.m78176a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (m16418Q(i, iArr)) {
            return i;
        }
        if (!m16418Q(1, iArr)) {
            return 0;
        }
        return 1;
    }

    /* renamed from: I */
    public int m16426I(int i) {
        int[] iArr = (int[]) this.f106529e.m78176a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (m16418Q(i, iArr)) {
            return i;
        }
        if (m16418Q(4, iArr)) {
            return 4;
        }
        if (!m16418Q(1, iArr)) {
            return 0;
        }
        return 1;
    }

    /* renamed from: J */
    public final int m16425J(int i) {
        int[] iArr = (int[]) this.f106529e.m78176a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (m16418Q(i, iArr)) {
            return i;
        }
        if (!m16418Q(1, iArr)) {
            return 0;
        }
        return 1;
    }

    /* renamed from: K */
    public U56 m16424K() {
        return this.f106534j;
    }

    /* renamed from: L */
    public int m16423L() {
        int i;
        synchronized (this.f106528d) {
            i = this.f106539o;
        }
        return i;
    }

    /* renamed from: M */
    public C46203oJ6 m16422M() {
        return this.f106533i;
    }

    /* renamed from: N */
    public InterfaceC48574sJ6 m16421N() {
        return this.f106536l;
    }

    /* renamed from: O */
    public void m16420O() {
        synchronized (this.f106528d) {
            this.f106539o++;
        }
    }

    /* renamed from: P */
    public final boolean m16419P() {
        return m16423L() > 0;
    }

    /* renamed from: Q */
    public final boolean m16418Q(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: S */
    public boolean m16416S() {
        return this.f106540p;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    /* renamed from: a */
    public void mo16408a(C11213q.C11215b c11215b) {
        this.f106536l.mo7018a(c11215b);
    }

    @Override // androidx.camera.core.CameraControl
    /* renamed from: b */
    public ListenableFuture<Void> mo16406b(float f) {
        if (!m16419P()) {
            return IA1.m102838f(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return IA1.m102834j(this.f106533i.m21356q(f));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    /* renamed from: c */
    public ListenableFuture<List<Void>> mo16404c(final List<C11192d> list, final int i, final int i2) {
        if (!m16419P()) {
            C33928Jx2.m99522l("Camera2CameraControlImp", "Camera is not active.");
            return IA1.m102838f(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        final int m16434A = m16434A();
        return DA1.m110820a(IA1.m102834j(this.f106545u)).m110816e(new InterfaceC20537fp() { // from class: i90
            @Override // p000.InterfaceC20537fp
            public final ListenableFuture apply(Object obj) {
                ListenableFuture m16410Y;
                m16410Y = C47885r90.this.m16410Y(list, i, m16434A, i2, (Void) obj);
                return m16410Y;
            }
        }, this.f106527c);
    }

    @Override // androidx.camera.core.CameraControl
    /* renamed from: d */
    public ListenableFuture<Void> mo16402d(float f) {
        if (!m16419P()) {
            return IA1.m102838f(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return IA1.m102834j(this.f106533i.m21355r(f));
    }

    /* renamed from: d0 */
    public void m16401d0(InterfaceC27858c interfaceC27858c) {
        this.f106526b.m16354d(interfaceC27858c);
    }

    @Override // androidx.camera.core.CameraControl
    /* renamed from: e */
    public ListenableFuture<Void> mo16400e(boolean z) {
        if (!m16419P()) {
            return IA1.m102838f(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return IA1.m102834j(this.f106534j.m81987d(z));
    }

    /* renamed from: e0 */
    public void m16399e0(final AbstractC46943pa0 abstractC46943pa0) {
        this.f106527c.execute(new Runnable() { // from class: d90
            @Override // java.lang.Runnable
            public final void run() {
                C47885r90.this.m16411X(abstractC46943pa0);
            }
        });
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    /* renamed from: f */
    public void mo16398f(InterfaceC11197f interfaceC11197f) {
        this.f106537m.m61900g(C45807nf0.C26566a.m23349e(interfaceC11197f).m23350c()).addListener(new Runnable() { // from class: k90
            @Override // java.lang.Runnable
            public final void run() {
                C47885r90.m16415T();
            }
        }, C31631Ac0.m115449a());
    }

    /* renamed from: f0 */
    public void m16397f0() {
        m16391i0(1);
    }

    @Override // androidx.camera.core.CameraControl
    /* renamed from: g */
    public ListenableFuture<C34611Mv1> mo16396g(C32271Cv1 c32271Cv1) {
        if (!m16419P()) {
            return IA1.m102838f(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return IA1.m102834j(this.f106532h.m96189N(c32271Cv1));
    }

    /* renamed from: g0 */
    public void m16395g0(boolean z) {
        this.f106532h.m96193J(z);
        this.f106533i.m21357p(z);
        this.f106534j.m81981j(z);
        this.f106535k.m113660b(z);
        this.f106537m.m61888s(z);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    /* renamed from: h */
    public Rect mo16394h() {
        return (Rect) HZ3.m103731g((Rect) this.f106529e.m78176a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    /* renamed from: h0 */
    public void m16393h0(Rational rational) {
        this.f106532h.m96192K(rational);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    /* renamed from: i */
    public void mo16392i(int i) {
        if (!m16419P()) {
            C33928Jx2.m99522l("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f106541q = i;
        InterfaceC48574sJ6 interfaceC48574sJ6 = this.f106536l;
        boolean z = true;
        if (this.f106541q != 1 && this.f106541q != 0) {
            z = false;
        }
        interfaceC48574sJ6.mo7016c(z);
        this.f106545u = m16383m0();
    }

    /* renamed from: i0 */
    public void m16391i0(int i) {
        this.f106546v = i;
        this.f106532h.m96191L(i);
        this.f106538n.m90676d(this.f106546v);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    /* renamed from: j */
    public InterfaceC11197f mo16390j() {
        return this.f106537m.m61896k();
    }

    /* renamed from: j0 */
    public void m16389j0(boolean z) {
        this.f106536l.mo7015d(z);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    /* renamed from: k */
    public void mo16388k() {
        this.f106537m.m61898i().addListener(new Runnable() { // from class: g90
            @Override // java.lang.Runnable
            public final void run() {
                C47885r90.m16413V();
            }
        }, C31631Ac0.m115449a());
    }

    /* renamed from: k0 */
    public void m16387k0(List<C11192d> list) {
        this.f106530f.mo69475a(list);
    }

    /* renamed from: l0 */
    public void m16385l0() {
        this.f106527c.execute(new Runnable() { // from class: m90
            @Override // java.lang.Runnable
            public final void run() {
                C47885r90.this.m16381n0();
            }
        });
    }

    /* renamed from: m0 */
    public ListenableFuture<Void> m16383m0() {
        return IA1.m102834j(O80.m92864a(new O80.InterfaceC5834c() { // from class: f90
            @Override // p000.O80.InterfaceC5834c
            /* renamed from: a */
            public final Object mo3207a(O80.C5832a c5832a) {
                Object m16407a0;
                m16407a0 = C47885r90.this.m16407a0(c5832a);
                return m16407a0;
            }
        }));
    }

    /* renamed from: n0 */
    public long m16381n0() {
        this.f106547w = this.f106544t.getAndIncrement();
        this.f106530f.mo69474b();
        return this.f106547w;
    }

    /* renamed from: o0 */
    public final ListenableFuture<Void> m16379o0(final long j) {
        return O80.m92864a(new O80.InterfaceC5834c() { // from class: n90
            @Override // p000.O80.InterfaceC5834c
            /* renamed from: a */
            public final Object mo3207a(O80.C5832a c5832a) {
                Object m16403c0;
                m16403c0 = C47885r90.this.m16403c0(j, c5832a);
                return m16403c0;
            }
        });
    }

    /* renamed from: v */
    public void m16372v(InterfaceC27858c interfaceC27858c) {
        this.f106526b.m16356b(interfaceC27858c);
    }

    /* renamed from: w */
    public void m16371w(final Executor executor, final AbstractC46943pa0 abstractC46943pa0) {
        this.f106527c.execute(new Runnable() { // from class: h90
            @Override // java.lang.Runnable
            public final void run() {
                C47885r90.this.m16414U(executor, abstractC46943pa0);
            }
        });
    }

    /* renamed from: x */
    public void m16370x() {
        synchronized (this.f106528d) {
            int i = this.f106539o;
            if (i != 0) {
                this.f106539o = i - 1;
            } else {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
        }
    }

    /* renamed from: y */
    public void m16369y(boolean z) {
        this.f106540p = z;
        if (!z) {
            C11192d.C11193a c11193a = new C11192d.C11193a();
            c11193a.m69425s(this.f106546v);
            c11193a.m69424t(true);
            C43385ja0.C24930a c24930a = new C43385ja0.C24930a();
            c24930a.m30298e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(m16427H(1)));
            c24930a.m30298e(CaptureRequest.FLASH_MODE, 0);
            c11193a.m69439e(c24930a.m30300a());
            m16387k0(Collections.singletonList(c11193a.m69436h()));
        }
        m16381n0();
    }

    /* renamed from: z */
    public Rect m16368z() {
        return this.f106533i.m21366g();
    }
}

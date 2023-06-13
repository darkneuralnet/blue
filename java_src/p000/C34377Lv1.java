package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Rational;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.C11192d;
import androidx.camera.core.impl.CameraControlInternal;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p000.C43385ja0;
import p000.C47885r90;
import p000.O80;
/* renamed from: Lv1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C34377Lv1 {

    /* renamed from: v */
    public static final MeteringRectangle[] f22239v = new MeteringRectangle[0];

    /* renamed from: a */
    public final C47885r90 f22240a;

    /* renamed from: b */
    public final Executor f22241b;

    /* renamed from: c */
    public final ScheduledExecutorService f22242c;

    /* renamed from: f */
    public final TT2 f22245f;

    /* renamed from: i */
    public ScheduledFuture<?> f22248i;

    /* renamed from: j */
    public ScheduledFuture<?> f22249j;

    /* renamed from: q */
    public MeteringRectangle[] f22256q;

    /* renamed from: r */
    public MeteringRectangle[] f22257r;

    /* renamed from: s */
    public MeteringRectangle[] f22258s;

    /* renamed from: t */
    public O80.C5832a<C34611Mv1> f22259t;

    /* renamed from: u */
    public O80.C5832a<Void> f22260u;

    /* renamed from: d */
    public volatile boolean f22243d = false;

    /* renamed from: e */
    public volatile Rational f22244e = null;

    /* renamed from: g */
    public boolean f22246g = false;

    /* renamed from: h */
    public Integer f22247h = 0;

    /* renamed from: k */
    public long f22250k = 0;

    /* renamed from: l */
    public boolean f22251l = false;

    /* renamed from: m */
    public boolean f22252m = false;

    /* renamed from: n */
    public int f22253n = 1;

    /* renamed from: o */
    public C47885r90.InterfaceC27858c f22254o = null;

    /* renamed from: p */
    public C47885r90.InterfaceC27858c f22255p = null;

    /* renamed from: Lv1$a */
    /* loaded from: classes.dex */
    public class C5127a extends AbstractC46943pa0 {

        /* renamed from: a */
        public final /* synthetic */ O80.C5832a f22261a;

        public C5127a(O80.C5832a c5832a) {
            this.f22261a = c5832a;
        }

        @Override // p000.AbstractC46943pa0
        /* renamed from: a */
        public void mo16367a() {
            O80.C5832a c5832a = this.f22261a;
            if (c5832a != null) {
                c5832a.m92858f(new CameraControl.OperationCanceledException("Camera is closed"));
            }
        }

        @Override // p000.AbstractC46943pa0
        /* renamed from: b */
        public void mo4448b(InterfaceC51685xa0 interfaceC51685xa0) {
            O80.C5832a c5832a = this.f22261a;
            if (c5832a != null) {
                c5832a.m92861c(interfaceC51685xa0);
            }
        }

        @Override // p000.AbstractC46943pa0
        /* renamed from: c */
        public void mo16366c(C48129ra0 c48129ra0) {
            O80.C5832a c5832a = this.f22261a;
            if (c5832a != null) {
                c5832a.m92858f(new CameraControlInternal.CameraControlException(c48129ra0));
            }
        }
    }

    /* renamed from: Lv1$b */
    /* loaded from: classes.dex */
    public class C5128b extends AbstractC46943pa0 {

        /* renamed from: a */
        public final /* synthetic */ O80.C5832a f22263a;

        public C5128b(O80.C5832a c5832a) {
            this.f22263a = c5832a;
        }

        @Override // p000.AbstractC46943pa0
        /* renamed from: a */
        public void mo16367a() {
            O80.C5832a c5832a = this.f22263a;
            if (c5832a != null) {
                c5832a.m92858f(new CameraControl.OperationCanceledException("Camera is closed"));
            }
        }

        @Override // p000.AbstractC46943pa0
        /* renamed from: b */
        public void mo4448b(InterfaceC51685xa0 interfaceC51685xa0) {
            O80.C5832a c5832a = this.f22263a;
            if (c5832a != null) {
                c5832a.m92861c(null);
            }
        }

        @Override // p000.AbstractC46943pa0
        /* renamed from: c */
        public void mo16366c(C48129ra0 c48129ra0) {
            O80.C5832a c5832a = this.f22263a;
            if (c5832a != null) {
                c5832a.m92858f(new CameraControlInternal.CameraControlException(c48129ra0));
            }
        }
    }

    public C34377Lv1(C47885r90 c47885r90, ScheduledExecutorService scheduledExecutorService, Executor executor, C36099Te4 c36099Te4) {
        MeteringRectangle[] meteringRectangleArr = f22239v;
        this.f22256q = meteringRectangleArr;
        this.f22257r = meteringRectangleArr;
        this.f22258s = meteringRectangleArr;
        this.f22259t = null;
        this.f22260u = null;
        this.f22240a = c47885r90;
        this.f22241b = executor;
        this.f22242c = scheduledExecutorService;
        this.f22245f = new TT2(c36099Te4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ boolean m96202A(int i, long j, TotalCaptureResult totalCaptureResult) {
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() == i && C47885r90.m16417R(totalCaptureResult, j)) {
            m96170o();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ boolean m96201B(boolean z, long j, TotalCaptureResult totalCaptureResult) {
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (m96190M()) {
            if (z && num != null) {
                if (this.f22247h.intValue() == 3) {
                    if (num.intValue() == 4) {
                        this.f22252m = true;
                        this.f22251l = true;
                    } else if (num.intValue() == 5) {
                        this.f22252m = false;
                        this.f22251l = true;
                    }
                }
            } else {
                this.f22252m = true;
                this.f22251l = true;
            }
        }
        if (this.f22251l && C47885r90.m16417R(totalCaptureResult, j)) {
            m96171n(this.f22252m);
            return true;
        }
        if (!this.f22247h.equals(num) && num != null) {
            this.f22247h = num;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ void m96200C(long j) {
        if (j == this.f22250k) {
            this.f22252m = false;
            m96171n(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void m96199D(final long j) {
        this.f22241b.execute(new Runnable() { // from class: Ev1
            @Override // java.lang.Runnable
            public final void run() {
                C34377Lv1.this.m96200C(j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ void m96198E(long j) {
        if (j == this.f22250k) {
            m96173l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public /* synthetic */ void m96197F(final long j) {
        this.f22241b.execute(new Runnable() { // from class: Dv1
            @Override // java.lang.Runnable
            public final void run() {
                C34377Lv1.this.m96198E(j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ Object m96195H(final C32271Cv1 c32271Cv1, final long j, final O80.C5832a c5832a) throws Exception {
        this.f22241b.execute(new Runnable() { // from class: Hv1
            @Override // java.lang.Runnable
            public final void run() {
                C34377Lv1.this.m96196G(c5832a, c32271Cv1, j);
            }
        });
        return "startFocusAndMetering";
    }

    /* renamed from: I */
    public static int m96194I(int i, int i2, int i3) {
        return Math.min(Math.max(i, i3), i2);
    }

    /* renamed from: v */
    public static PointF m96163v(RT2 rt2, Rational rational, Rational rational2, int i, TT2 tt2) {
        if (rt2.m86731b() != null) {
            rational2 = rt2.m86731b();
        }
        PointF m83584a = tt2.m83584a(rt2, i);
        if (!rational2.equals(rational)) {
            if (rational2.compareTo(rational) > 0) {
                float doubleValue = (float) (rational2.doubleValue() / rational.doubleValue());
                m83584a.y = (((float) ((doubleValue - 1.0d) / 2.0d)) + m83584a.y) * (1.0f / doubleValue);
            } else {
                float doubleValue2 = (float) (rational.doubleValue() / rational2.doubleValue());
                m83584a.x = (((float) ((doubleValue2 - 1.0d) / 2.0d)) + m83584a.x) * (1.0f / doubleValue2);
            }
        }
        return m83584a;
    }

    /* renamed from: w */
    public static MeteringRectangle m96162w(RT2 rt2, PointF pointF, Rect rect) {
        int width = (int) (rect.left + (pointF.x * rect.width()));
        int height = (int) (rect.top + (pointF.y * rect.height()));
        int m86732a = ((int) (rt2.m86732a() * rect.width())) / 2;
        int m86732a2 = ((int) (rt2.m86732a() * rect.height())) / 2;
        Rect rect2 = new Rect(width - m86732a, height - m86732a2, width + m86732a, height + m86732a2);
        rect2.left = m96194I(rect2.left, rect.right, rect.left);
        rect2.right = m96194I(rect2.right, rect.right, rect.left);
        rect2.top = m96194I(rect2.top, rect.bottom, rect.top);
        rect2.bottom = m96194I(rect2.bottom, rect.bottom, rect.top);
        return new MeteringRectangle(rect2, 1000);
    }

    /* renamed from: z */
    public static boolean m96159z(RT2 rt2) {
        return rt2.m86730c() >= 0.0f && rt2.m86730c() <= 1.0f && rt2.m86729d() >= 0.0f && rt2.m86729d() <= 1.0f;
    }

    /* renamed from: J */
    public void m96193J(boolean z) {
        if (z == this.f22243d) {
            return;
        }
        this.f22243d = z;
        if (!this.f22243d) {
            m96173l();
        }
    }

    /* renamed from: K */
    public void m96192K(Rational rational) {
        this.f22244e = rational;
    }

    /* renamed from: L */
    public void m96191L(int i) {
        this.f22253n = i;
    }

    /* renamed from: M */
    public final boolean m96190M() {
        return this.f22256q.length > 0;
    }

    /* renamed from: N */
    public ListenableFuture<C34611Mv1> m96189N(C32271Cv1 c32271Cv1) {
        return m96188O(c32271Cv1, 5000L);
    }

    /* renamed from: O */
    public ListenableFuture<C34611Mv1> m96188O(final C32271Cv1 c32271Cv1, final long j) {
        return O80.m92864a(new O80.InterfaceC5834c() { // from class: Fv1
            @Override // p000.O80.InterfaceC5834c
            /* renamed from: a */
            public final Object mo3207a(O80.C5832a c5832a) {
                Object m96195H;
                m96195H = C34377Lv1.this.m96195H(c32271Cv1, j, c5832a);
                return m96195H;
            }
        });
    }

    /* renamed from: P */
    public void m96196G(O80.C5832a<C34611Mv1> c5832a, C32271Cv1 c32271Cv1, long j) {
        if (!this.f22243d) {
            c5832a.m92858f(new CameraControl.OperationCanceledException("Camera is not active."));
            return;
        }
        Rect m16368z = this.f22240a.m16368z();
        Rational m96164u = m96164u();
        List<MeteringRectangle> m96161x = m96161x(c32271Cv1.m111350c(), this.f22240a.m16431D(), m96164u, m16368z, 1);
        List<MeteringRectangle> m96161x2 = m96161x(c32271Cv1.m111351b(), this.f22240a.m16432C(), m96164u, m16368z, 2);
        List<MeteringRectangle> m96161x3 = m96161x(c32271Cv1.m111349d(), this.f22240a.m16430E(), m96164u, m16368z, 4);
        if (m96161x.isEmpty() && m96161x2.isEmpty() && m96161x3.isEmpty()) {
            c5832a.m92858f(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
            return;
        }
        m96167r("Cancelled by another startFocusAndMetering()");
        m96166s("Cancelled by another startFocusAndMetering()");
        m96169p();
        this.f22259t = c5832a;
        MeteringRectangle[] meteringRectangleArr = f22239v;
        m96168q((MeteringRectangle[]) m96161x.toArray(meteringRectangleArr), (MeteringRectangle[]) m96161x2.toArray(meteringRectangleArr), (MeteringRectangle[]) m96161x3.toArray(meteringRectangleArr), c32271Cv1, j);
    }

    /* renamed from: Q */
    public void m96186Q(O80.C5832a<Void> c5832a) {
        if (!this.f22243d) {
            if (c5832a != null) {
                c5832a.m92858f(new CameraControl.OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        C11192d.C11193a c11193a = new C11192d.C11193a();
        c11193a.m69425s(this.f22253n);
        c11193a.m69424t(true);
        C43385ja0.C24930a c24930a = new C43385ja0.C24930a();
        c24930a.m30298e(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        c11193a.m69439e(c24930a.m30300a());
        c11193a.m69441c(new C5128b(c5832a));
        this.f22240a.m16387k0(Collections.singletonList(c11193a.m69436h()));
    }

    /* renamed from: R */
    public void m96185R(O80.C5832a<InterfaceC51685xa0> c5832a, boolean z) {
        if (!this.f22243d) {
            if (c5832a != null) {
                c5832a.m92858f(new CameraControl.OperationCanceledException("Camera is not active."));
                return;
            }
            return;
        }
        C11192d.C11193a c11193a = new C11192d.C11193a();
        c11193a.m69425s(this.f22253n);
        c11193a.m69424t(true);
        C43385ja0.C24930a c24930a = new C43385ja0.C24930a();
        c24930a.m30298e(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        if (z) {
            c24930a.m30298e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.f22240a.m16427H(1)));
        }
        c11193a.m69439e(c24930a.m30300a());
        c11193a.m69441c(new C5127a(c5832a));
        this.f22240a.m16387k0(Collections.singletonList(c11193a.m69436h()));
    }

    /* renamed from: i */
    public void m96176i(C43385ja0.C24930a c24930a) {
        int m96165t;
        if (this.f22246g) {
            m96165t = 1;
        } else {
            m96165t = m96165t();
        }
        c24930a.m30298e(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(this.f22240a.m16426I(m96165t)));
        MeteringRectangle[] meteringRectangleArr = this.f22256q;
        if (meteringRectangleArr.length != 0) {
            c24930a.m30298e(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.f22257r;
        if (meteringRectangleArr2.length != 0) {
            c24930a.m30298e(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.f22258s;
        if (meteringRectangleArr3.length != 0) {
            c24930a.m30298e(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3);
        }
    }

    /* renamed from: j */
    public void m96175j(boolean z, boolean z2) {
        if (!this.f22243d) {
            return;
        }
        C11192d.C11193a c11193a = new C11192d.C11193a();
        c11193a.m69424t(true);
        c11193a.m69425s(this.f22253n);
        C43385ja0.C24930a c24930a = new C43385ja0.C24930a();
        if (z) {
            c24930a.m30298e(CaptureRequest.CONTROL_AF_TRIGGER, 2);
        }
        if (z2) {
            c24930a.m30298e(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
        }
        c11193a.m69439e(c24930a.m30300a());
        this.f22240a.m16387k0(Collections.singletonList(c11193a.m69436h()));
    }

    /* renamed from: k */
    public void m96174k(O80.C5832a<Void> c5832a) {
        m96166s("Cancelled by another cancelFocusAndMetering()");
        m96167r("Cancelled by cancelFocusAndMetering()");
        this.f22260u = c5832a;
        m96169p();
        m96172m();
        if (m96190M()) {
            m96175j(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f22239v;
        this.f22256q = meteringRectangleArr;
        this.f22257r = meteringRectangleArr;
        this.f22258s = meteringRectangleArr;
        this.f22246g = false;
        final long m16381n0 = this.f22240a.m16381n0();
        if (this.f22260u != null) {
            final int m16426I = this.f22240a.m16426I(m96165t());
            C47885r90.InterfaceC27858c interfaceC27858c = new C47885r90.InterfaceC27858c() { // from class: Gv1
                @Override // p000.C47885r90.InterfaceC27858c
                /* renamed from: a */
                public final boolean mo16353a(TotalCaptureResult totalCaptureResult) {
                    boolean m96202A;
                    m96202A = C34377Lv1.this.m96202A(m16426I, m16381n0, totalCaptureResult);
                    return m96202A;
                }
            };
            this.f22255p = interfaceC27858c;
            this.f22240a.m16372v(interfaceC27858c);
        }
    }

    /* renamed from: l */
    public void m96173l() {
        m96174k(null);
    }

    /* renamed from: m */
    public final void m96172m() {
        ScheduledFuture<?> scheduledFuture = this.f22249j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f22249j = null;
        }
    }

    /* renamed from: n */
    public void m96171n(boolean z) {
        m96172m();
        O80.C5832a<C34611Mv1> c5832a = this.f22259t;
        if (c5832a != null) {
            c5832a.m92861c(C34611Mv1.m94578a(z));
            this.f22259t = null;
        }
    }

    /* renamed from: o */
    public final void m96170o() {
        O80.C5832a<Void> c5832a = this.f22260u;
        if (c5832a != null) {
            c5832a.m92861c(null);
            this.f22260u = null;
        }
    }

    /* renamed from: p */
    public final void m96169p() {
        ScheduledFuture<?> scheduledFuture = this.f22248i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f22248i = null;
        }
    }

    /* renamed from: q */
    public final void m96168q(MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, MeteringRectangle[] meteringRectangleArr3, C32271Cv1 c32271Cv1, long j) {
        final long m16381n0;
        this.f22240a.m16401d0(this.f22254o);
        m96169p();
        m96172m();
        this.f22256q = meteringRectangleArr;
        this.f22257r = meteringRectangleArr2;
        this.f22258s = meteringRectangleArr3;
        if (m96190M()) {
            this.f22246g = true;
            this.f22251l = false;
            this.f22252m = false;
            m16381n0 = this.f22240a.m16381n0();
            m96185R(null, true);
        } else {
            this.f22246g = false;
            this.f22251l = true;
            this.f22252m = false;
            m16381n0 = this.f22240a.m16381n0();
        }
        this.f22247h = 0;
        final boolean m96160y = m96160y();
        C47885r90.InterfaceC27858c interfaceC27858c = new C47885r90.InterfaceC27858c() { // from class: Iv1
            @Override // p000.C47885r90.InterfaceC27858c
            /* renamed from: a */
            public final boolean mo16353a(TotalCaptureResult totalCaptureResult) {
                boolean m96201B;
                m96201B = C34377Lv1.this.m96201B(m96160y, m16381n0, totalCaptureResult);
                return m96201B;
            }
        };
        this.f22254o = interfaceC27858c;
        this.f22240a.m16372v(interfaceC27858c);
        final long j2 = this.f22250k + 1;
        this.f22250k = j2;
        Runnable runnable = new Runnable() { // from class: Jv1
            @Override // java.lang.Runnable
            public final void run() {
                C34377Lv1.this.m96199D(j2);
            }
        };
        ScheduledExecutorService scheduledExecutorService = this.f22242c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f22249j = scheduledExecutorService.schedule(runnable, j, timeUnit);
        if (c32271Cv1.m111348e()) {
            this.f22248i = this.f22242c.schedule(new Runnable() { // from class: Kv1
                @Override // java.lang.Runnable
                public final void run() {
                    C34377Lv1.this.m96197F(j2);
                }
            }, c32271Cv1.m111352a(), timeUnit);
        }
    }

    /* renamed from: r */
    public final void m96167r(String str) {
        this.f22240a.m16401d0(this.f22254o);
        O80.C5832a<C34611Mv1> c5832a = this.f22259t;
        if (c5832a != null) {
            c5832a.m92858f(new CameraControl.OperationCanceledException(str));
            this.f22259t = null;
        }
    }

    /* renamed from: s */
    public final void m96166s(String str) {
        this.f22240a.m16401d0(this.f22255p);
        O80.C5832a<Void> c5832a = this.f22260u;
        if (c5832a != null) {
            c5832a.m92858f(new CameraControl.OperationCanceledException(str));
            this.f22260u = null;
        }
    }

    /* renamed from: t */
    public int m96165t() {
        return this.f22253n != 3 ? 4 : 3;
    }

    /* renamed from: u */
    public final Rational m96164u() {
        if (this.f22244e != null) {
            return this.f22244e;
        }
        Rect m16368z = this.f22240a.m16368z();
        return new Rational(m16368z.width(), m16368z.height());
    }

    /* renamed from: x */
    public final List<MeteringRectangle> m96161x(List<RT2> list, int i, Rational rational, Rect rect, int i2) {
        if (!list.isEmpty() && i != 0) {
            ArrayList arrayList = new ArrayList();
            Rational rational2 = new Rational(rect.width(), rect.height());
            for (RT2 rt2 : list) {
                if (arrayList.size() == i) {
                    break;
                } else if (m96159z(rt2)) {
                    MeteringRectangle m96162w = m96162w(rt2, m96163v(rt2, rational2, rational, i2, this.f22245f), rect);
                    if (m96162w.getWidth() != 0 && m96162w.getHeight() != 0) {
                        arrayList.add(m96162w);
                    }
                }
            }
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    /* renamed from: y */
    public final boolean m96160y() {
        return this.f22240a.m16426I(1) == 1;
    }
}

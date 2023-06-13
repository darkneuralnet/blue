package p000;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Looper;
import android.util.Range;
import androidx.camera.core.CameraControl;
import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import p000.C43385ja0;
import p000.C47885r90;
import p000.O80;
/* renamed from: oJ6  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46203oJ6 {

    /* renamed from: a */
    public final C47885r90 f101774a;

    /* renamed from: b */
    public final Executor f101775b;

    /* renamed from: c */
    public final C47982rJ6 f101776c;

    /* renamed from: d */
    public final C49882uX2<InterfaceC47389qJ6> f101777d;

    /* renamed from: e */
    public final InterfaceC26905b f101778e;

    /* renamed from: f */
    public boolean f101779f = false;

    /* renamed from: g */
    public C47885r90.InterfaceC27858c f101780g = new C26904a();

    /* renamed from: oJ6$a */
    /* loaded from: classes.dex */
    public class C26904a implements C47885r90.InterfaceC27858c {
        public C26904a() {
        }

        @Override // p000.C47885r90.InterfaceC27858c
        /* renamed from: a */
        public boolean mo16353a(TotalCaptureResult totalCaptureResult) {
            C46203oJ6.this.f101778e.mo21352a(totalCaptureResult);
            return false;
        }
    }

    /* renamed from: oJ6$b */
    /* loaded from: classes.dex */
    public interface InterfaceC26905b {
        /* renamed from: a */
        void mo21352a(TotalCaptureResult totalCaptureResult);

        /* renamed from: b */
        float mo21351b();

        /* renamed from: c */
        void mo21350c(float f, O80.C5832a<Void> c5832a);

        /* renamed from: d */
        float mo21349d();

        /* renamed from: e */
        void mo21348e(C43385ja0.C24930a c24930a);

        /* renamed from: f */
        void mo21347f();

        /* renamed from: g */
        Rect mo21346g();
    }

    public C46203oJ6(C47885r90 c47885r90, C36761Wa0 c36761Wa0, Executor executor) {
        this.f101774a = c47885r90;
        this.f101775b = executor;
        InterfaceC26905b m21367f = m21367f(c36761Wa0);
        this.f101778e = m21367f;
        C47982rJ6 c47982rJ6 = new C47982rJ6(m21367f.mo21349d(), m21367f.mo21351b());
        this.f101776c = c47982rJ6;
        c47982rJ6.m16058h(1.0f);
        this.f101777d = new C49882uX2<>(AbstractC41598gZ1.m39168e(c47982rJ6));
        c47885r90.m16372v(this.f101780g);
    }

    /* renamed from: f */
    public static InterfaceC26905b m21367f(C36761Wa0 c36761Wa0) {
        if (m21362k(c36761Wa0)) {
            return new C1108Cd(c36761Wa0);
        }
        return new OE0(c36761Wa0);
    }

    /* renamed from: h */
    public static InterfaceC47389qJ6 m21365h(C36761Wa0 c36761Wa0) {
        InterfaceC26905b m21367f = m21367f(c36761Wa0);
        C47982rJ6 c47982rJ6 = new C47982rJ6(m21367f.mo21349d(), m21367f.mo21351b());
        c47982rJ6.m16058h(1.0f);
        return AbstractC41598gZ1.m39168e(c47982rJ6);
    }

    /* renamed from: i */
    public static Range<Float> m21364i(C36761Wa0 c36761Wa0) {
        CameraCharacteristics.Key key;
        try {
            key = CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
            return (Range) c36761Wa0.m78176a(key);
        } catch (AssertionError e) {
            C33928Jx2.m99521m("ZoomControl", "AssertionError, fail to get camera characteristic.", e);
            return null;
        }
    }

    /* renamed from: k */
    public static boolean m21362k(C36761Wa0 c36761Wa0) {
        return Build.VERSION.SDK_INT >= 30 && m21364i(c36761Wa0) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Object m21360m(final InterfaceC47389qJ6 interfaceC47389qJ6, final O80.C5832a c5832a) throws Exception {
        this.f101775b.execute(new Runnable() { // from class: mJ6
            @Override // java.lang.Runnable
            public final void run() {
                C46203oJ6.this.m21361l(c5832a, interfaceC47389qJ6);
            }
        });
        return "setLinearZoom";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object m21358o(final InterfaceC47389qJ6 interfaceC47389qJ6, final O80.C5832a c5832a) throws Exception {
        this.f101775b.execute(new Runnable() { // from class: nJ6
            @Override // java.lang.Runnable
            public final void run() {
                C46203oJ6.this.m21359n(c5832a, interfaceC47389qJ6);
            }
        });
        return "setZoomRatio";
    }

    /* renamed from: e */
    public void m21368e(C43385ja0.C24930a c24930a) {
        this.f101778e.mo21348e(c24930a);
    }

    /* renamed from: g */
    public Rect m21366g() {
        return this.f101778e.mo21346g();
    }

    /* renamed from: j */
    public LiveData<InterfaceC47389qJ6> m21363j() {
        return this.f101777d;
    }

    /* renamed from: p */
    public void m21357p(boolean z) {
        InterfaceC47389qJ6 m39168e;
        if (this.f101779f == z) {
            return;
        }
        this.f101779f = z;
        if (!z) {
            synchronized (this.f101776c) {
                this.f101776c.m16058h(1.0f);
                m39168e = AbstractC41598gZ1.m39168e(this.f101776c);
            }
            m21353t(m39168e);
            this.f101778e.mo21347f();
            this.f101774a.m16381n0();
        }
    }

    /* renamed from: q */
    public ListenableFuture<Void> m21356q(float f) {
        final InterfaceC47389qJ6 m39168e;
        synchronized (this.f101776c) {
            try {
                this.f101776c.m16059g(f);
                m39168e = AbstractC41598gZ1.m39168e(this.f101776c);
            } catch (IllegalArgumentException e) {
                return IA1.m102838f(e);
            }
        }
        m21353t(m39168e);
        return O80.m92864a(new O80.InterfaceC5834c() { // from class: lJ6
            @Override // p000.O80.InterfaceC5834c
            /* renamed from: a */
            public final Object mo3207a(O80.C5832a c5832a) {
                Object m21360m;
                m21360m = C46203oJ6.this.m21360m(m39168e, c5832a);
                return m21360m;
            }
        });
    }

    /* renamed from: r */
    public ListenableFuture<Void> m21355r(float f) {
        final InterfaceC47389qJ6 m39168e;
        synchronized (this.f101776c) {
            try {
                this.f101776c.m16058h(f);
                m39168e = AbstractC41598gZ1.m39168e(this.f101776c);
            } catch (IllegalArgumentException e) {
                return IA1.m102838f(e);
            }
        }
        m21353t(m39168e);
        return O80.m92864a(new O80.InterfaceC5834c() { // from class: kJ6
            @Override // p000.O80.InterfaceC5834c
            /* renamed from: a */
            public final Object mo3207a(O80.C5832a c5832a) {
                Object m21358o;
                m21358o = C46203oJ6.this.m21358o(m39168e, c5832a);
                return m21358o;
            }
        });
    }

    /* renamed from: s */
    public final void m21359n(O80.C5832a<Void> c5832a, InterfaceC47389qJ6 interfaceC47389qJ6) {
        InterfaceC47389qJ6 m39168e;
        if (!this.f101779f) {
            synchronized (this.f101776c) {
                this.f101776c.m16058h(1.0f);
                m39168e = AbstractC41598gZ1.m39168e(this.f101776c);
            }
            m21353t(m39168e);
            c5832a.m92858f(new CameraControl.OperationCanceledException("Camera is not active."));
            return;
        }
        m21353t(interfaceC47389qJ6);
        this.f101778e.mo21350c(interfaceC47389qJ6.mo16062d(), c5832a);
        this.f101774a.m16381n0();
    }

    /* renamed from: t */
    public final void m21353t(InterfaceC47389qJ6 interfaceC47389qJ6) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.f101777d.setValue(interfaceC47389qJ6);
        } else {
            this.f101777d.postValue(interfaceC47389qJ6);
        }
    }
}

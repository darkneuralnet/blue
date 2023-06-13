package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.CameraControl;
import androidx.lifecycle.LiveData;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;
import p000.C47885r90;
import p000.O80;
/* renamed from: U56 */
/* loaded from: classes.dex */
public final class U56 {

    /* renamed from: a */
    public final C47885r90 f36843a;

    /* renamed from: b */
    public final C49882uX2<Integer> f36844b;

    /* renamed from: c */
    public final boolean f36845c;

    /* renamed from: d */
    public final Executor f36846d;

    /* renamed from: e */
    public boolean f36847e;

    /* renamed from: f */
    public O80.C5832a<Void> f36848f;

    /* renamed from: g */
    public boolean f36849g;

    public U56(C47885r90 c47885r90, C36761Wa0 c36761Wa0, Executor executor) {
        this.f36843a = c47885r90;
        this.f36846d = executor;
        Objects.requireNonNull(c36761Wa0);
        this.f36845c = C46491oo1.m20482a(new M90(c36761Wa0));
        this.f36844b = new C49882uX2<>(0);
        c47885r90.m16372v(new C47885r90.InterfaceC27858c() { // from class: S56
            @Override // p000.C47885r90.InterfaceC27858c
            /* renamed from: a */
            public final boolean mo16353a(TotalCaptureResult totalCaptureResult) {
                boolean m81982i;
                m81982i = U56.this.m81982i(totalCaptureResult);
                return m81982i;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ Object m81983h(final boolean z, final O80.C5832a c5832a) throws Exception {
        this.f36846d.execute(new Runnable() { // from class: T56
            @Override // java.lang.Runnable
            public final void run() {
                U56.this.m81984g(c5832a, z);
            }
        });
        return "enableTorch: " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ boolean m81982i(TotalCaptureResult totalCaptureResult) {
        boolean z;
        if (this.f36848f != null) {
            Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
            if (num != null && num.intValue() == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z == this.f36849g) {
                this.f36848f.m92861c(null);
                this.f36848f = null;
            }
        }
        return false;
    }

    /* renamed from: d */
    public ListenableFuture<Void> m81987d(final boolean z) {
        if (!this.f36845c) {
            C33928Jx2.m99533a("TorchControl", "Unable to enableTorch due to there is no flash unit.");
            return IA1.m102838f(new IllegalStateException("No flash unit"));
        }
        m81980k(this.f36844b, Integer.valueOf(z ? 1 : 0));
        return O80.m92864a(new O80.InterfaceC5834c() { // from class: R56
            @Override // p000.O80.InterfaceC5834c
            /* renamed from: a */
            public final Object mo3207a(O80.C5832a c5832a) {
                Object m81983h;
                m81983h = U56.this.m81983h(z, c5832a);
                return m81983h;
            }
        });
    }

    /* renamed from: e */
    public void m81984g(O80.C5832a<Void> c5832a, boolean z) {
        if (!this.f36845c) {
            if (c5832a != null) {
                c5832a.m92858f(new IllegalStateException("No flash unit"));
            }
        } else if (!this.f36847e) {
            m81980k(this.f36844b, 0);
            if (c5832a != null) {
                c5832a.m92858f(new CameraControl.OperationCanceledException("Camera is not active."));
            }
        } else {
            this.f36849g = z;
            this.f36843a.m16369y(z);
            m81980k(this.f36844b, Integer.valueOf(z ? 1 : 0));
            O80.C5832a<Void> c5832a2 = this.f36848f;
            if (c5832a2 != null) {
                c5832a2.m92858f(new CameraControl.OperationCanceledException("There is a new enableTorch being set"));
            }
            this.f36848f = c5832a;
        }
    }

    /* renamed from: f */
    public LiveData<Integer> m81985f() {
        return this.f36844b;
    }

    /* renamed from: j */
    public void m81981j(boolean z) {
        if (this.f36847e == z) {
            return;
        }
        this.f36847e = z;
        if (!z) {
            if (this.f36849g) {
                this.f36849g = false;
                this.f36843a.m16369y(false);
                m81980k(this.f36844b, 0);
            }
            O80.C5832a<Void> c5832a = this.f36848f;
            if (c5832a != null) {
                c5832a.m92858f(new CameraControl.OperationCanceledException("Camera is not active."));
                this.f36848f = null;
            }
        }
    }

    /* renamed from: k */
    public final <T> void m81980k(C49882uX2<T> c49882uX2, T t) {
        if (O36.m92959c()) {
            c49882uX2.setValue(t);
        } else {
            c49882uX2.postValue(t);
        }
    }
}

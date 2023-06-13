package p000;

import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p000.DX5;
/* renamed from: PX5 */
/* loaded from: classes.dex */
public final class PX5 {

    /* renamed from: a */
    public final InterfaceC6403b f28637a;

    /* renamed from: PX5$a */
    /* loaded from: classes.dex */
    public static class C6402a {

        /* renamed from: a */
        public final Executor f28638a;

        /* renamed from: b */
        public final ScheduledExecutorService f28639b;

        /* renamed from: c */
        public final Handler f28640c;

        /* renamed from: d */
        public final C50549vf0 f28641d;

        /* renamed from: e */
        public final C36099Te4 f28642e;

        /* renamed from: f */
        public final C36099Te4 f28643f;

        /* renamed from: g */
        public final boolean f28644g;

        public C6402a(Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler, C50549vf0 c50549vf0, C36099Te4 c36099Te4, C36099Te4 c36099Te42) {
            boolean z;
            this.f28638a = executor;
            this.f28639b = scheduledExecutorService;
            this.f28640c = handler;
            this.f28641d = c50549vf0;
            this.f28642e = c36099Te4;
            this.f28643f = c36099Te42;
            if (!new C35322Pw1(c36099Te4, c36099Te42).m89365b() && !new C48355rw6(c36099Te4).m15012i() && !new C35088Ow1(c36099Te42).m91178d()) {
                z = false;
            } else {
                z = true;
            }
            this.f28644g = z;
        }

        /* renamed from: a */
        public PX5 m90151a() {
            InterfaceC6403b jx5;
            if (this.f28644g) {
                jx5 = new OX5(this.f28642e, this.f28643f, this.f28641d, this.f28638a, this.f28639b, this.f28640c);
            } else {
                jx5 = new JX5(this.f28641d, this.f28638a, this.f28639b, this.f28640c);
            }
            return new PX5(jx5);
        }
    }

    /* renamed from: PX5$b */
    /* loaded from: classes.dex */
    public interface InterfaceC6403b {
        /* renamed from: a */
        Executor mo90150a();

        /* renamed from: b */
        C49529tv5 mo90149b(int i, List<C36053Sz3> list, DX5.AbstractC1519a abstractC1519a);

        /* renamed from: k */
        ListenableFuture<List<Surface>> mo90148k(List<DeferrableSurface> list, long j);

        /* renamed from: l */
        ListenableFuture<Void> mo90147l(CameraDevice cameraDevice, C49529tv5 c49529tv5, List<DeferrableSurface> list);

        boolean stop();
    }

    public PX5(InterfaceC6403b interfaceC6403b) {
        this.f28637a = interfaceC6403b;
    }

    /* renamed from: a */
    public C49529tv5 m90156a(int i, List<C36053Sz3> list, DX5.AbstractC1519a abstractC1519a) {
        return this.f28637a.mo90149b(i, list, abstractC1519a);
    }

    /* renamed from: b */
    public Executor m90155b() {
        return this.f28637a.mo90150a();
    }

    /* renamed from: c */
    public ListenableFuture<Void> m90154c(CameraDevice cameraDevice, C49529tv5 c49529tv5, List<DeferrableSurface> list) {
        return this.f28637a.mo90147l(cameraDevice, c49529tv5, list);
    }

    /* renamed from: d */
    public ListenableFuture<List<Surface>> m90153d(List<DeferrableSurface> list, long j) {
        return this.f28637a.mo90148k(list, j);
    }

    /* renamed from: e */
    public boolean m90152e() {
        return this.f28637a.stop();
    }
}

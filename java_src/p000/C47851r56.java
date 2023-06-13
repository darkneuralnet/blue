package p000;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import p000.InterfaceC37319Yk0;
/* renamed from: r56  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C47851r56 {

    /* renamed from: a */
    public final SY0 f106452a;

    /* renamed from: b */
    public final InterfaceC37319Yk0 f106453b;

    /* renamed from: c */
    public volatile boolean f106454c;

    /* renamed from: d */
    public volatile int f106455d;

    /* renamed from: e */
    public volatile long f106456e;

    /* renamed from: f */
    public volatile boolean f106457f;

    /* renamed from: r56$a */
    /* loaded from: classes6.dex */
    public class C27849a implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a */
        public final /* synthetic */ SY0 f106458a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC37319Yk0 f106459b;

        public C27849a(SY0 sy0, InterfaceC37319Yk0 interfaceC37319Yk0) {
            this.f106458a = sy0;
            this.f106459b = interfaceC37319Yk0;
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z) {
            C47851r56.this.f106454c = z;
            if (z) {
                this.f106458a.m85303c();
            } else if (C47851r56.this.m16494g()) {
                this.f106458a.m85299g(C47851r56.this.f106456e - this.f106459b.currentTimeMillis());
            }
        }
    }

    public C47851r56(Context context, C42172hX0 c42172hX0, @InterfaceC36673Vq2 Executor executor, @InterfaceC8305UW ScheduledExecutorService scheduledExecutorService) {
        this((Context) Preconditions.checkNotNull(context), new SY0((C42172hX0) Preconditions.checkNotNull(c42172hX0), executor, scheduledExecutorService), new InterfaceC37319Yk0.C9955a());
    }

    /* renamed from: d */
    public void m16497d(AbstractC8723Vh abstractC8723Vh) {
        C46907pW0 m19168d;
        if (abstractC8723Vh instanceof C46907pW0) {
            m19168d = (C46907pW0) abstractC8723Vh;
        } else {
            m19168d = C46907pW0.m19168d(abstractC8723Vh.mo19170b());
        }
        this.f106456e = m19168d.m19164h() + ((long) (m19168d.m19166f() * 0.5d)) + 300000;
        if (this.f106456e > m19168d.mo19171a()) {
            this.f106456e = m19168d.mo19171a() - 60000;
        }
        if (m16494g()) {
            this.f106452a.m85299g(this.f106456e - this.f106453b.currentTimeMillis());
        }
    }

    /* renamed from: e */
    public void m16496e(int i) {
        if (this.f106455d == 0 && i > 0) {
            this.f106455d = i;
            if (m16494g()) {
                this.f106452a.m85299g(this.f106456e - this.f106453b.currentTimeMillis());
            }
        } else if (this.f106455d > 0 && i == 0) {
            this.f106452a.m85303c();
        }
        this.f106455d = i;
    }

    /* renamed from: f */
    public void m16495f(boolean z) {
        this.f106457f = z;
    }

    /* renamed from: g */
    public final boolean m16494g() {
        return this.f106457f && !this.f106454c && this.f106455d > 0 && this.f106456e != -1;
    }

    public C47851r56(Context context, SY0 sy0, InterfaceC37319Yk0 interfaceC37319Yk0) {
        this.f106452a = sy0;
        this.f106453b = interfaceC37319Yk0;
        this.f106456e = -1L;
        BackgroundDetector.initialize((Application) context.getApplicationContext());
        BackgroundDetector.getInstance().addListener(new C27849a(sy0, interfaceC37319Yk0));
    }
}

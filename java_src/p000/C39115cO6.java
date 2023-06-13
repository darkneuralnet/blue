package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.Executor;
/* renamed from: cO6  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C39115cO6 {

    /* renamed from: k */
    public static final C42061hK6 f60516k = new C42061hK6("AssetPackManager");

    /* renamed from: a */
    public final HK6 f60517a;

    /* renamed from: b */
    public final InterfaceC46230oM6<InterfaceC40920fP6> f60518b;

    /* renamed from: c */
    public final BK6 f60519c;

    /* renamed from: d */
    public final SO6 f60520d;

    /* renamed from: e */
    public final C46823pM6 f60521e;

    /* renamed from: f */
    public final C51556xL6 f60522f;

    /* renamed from: g */
    public final C44442lL6 f60523g;

    /* renamed from: h */
    public final InterfaceC46230oM6<Executor> f60524h;

    /* renamed from: i */
    public final PJ6 f60525i;

    /* renamed from: j */
    public final Handler f60526j = new Handler(Looper.getMainLooper());

    public C39115cO6(HK6 hk6, InterfaceC46230oM6<InterfaceC40920fP6> interfaceC46230oM6, BK6 bk6, SO6 so6, C46823pM6 c46823pM6, C51556xL6 c51556xL6, C44442lL6 c44442lL6, InterfaceC46230oM6<Executor> interfaceC46230oM62, PJ6 pj6) {
        this.f60517a = hk6;
        this.f60518b = interfaceC46230oM6;
        this.f60519c = bk6;
        this.f60520d = so6;
        this.f60521e = c46823pM6;
        this.f60522f = c51556xL6;
        this.f60523g = c44442lL6;
        this.f60524h = interfaceC46230oM62;
        this.f60525i = pj6;
    }

    /* renamed from: a */
    public final void m61445a(boolean z) {
        boolean m79952e = this.f60519c.m79952e();
        this.f60519c.m79954c(z);
        if (!z || m79952e) {
            return;
        }
        m61440f();
    }

    /* renamed from: b */
    public final /* synthetic */ void m61444b() {
        this.f60517a.m104020I();
        this.f60517a.m104023F();
        this.f60517a.m104019J();
    }

    /* renamed from: c */
    public final /* synthetic */ void m61443c() {
        XY5<List<String>> mo10447d = this.f60518b.m21257a().mo10447d(this.f60517a.m104001q());
        HK6 hk6 = this.f60517a;
        hk6.getClass();
        mo10447d.mo1425c(this.f60524h.m21257a(), BN6.m114057a(hk6));
        mo10447d.mo1426b(this.f60524h.m21257a(), CN6.f4022a);
    }

    /* renamed from: f */
    public final void m61440f() {
        this.f60524h.m21257a().execute(new Runnable(this, null) { // from class: nN6

            /* renamed from: b */
            public final C39115cO6 f99848b;

            /* renamed from: c */
            public final /* synthetic */ int f99849c = 1;

            {
                this.f99848b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (this.f99849c != 0) {
                    this.f99848b.m61443c();
                } else {
                    this.f99848b.m61444b();
                }
            }
        });
    }
}

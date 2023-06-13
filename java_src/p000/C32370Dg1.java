package p000;

import android.os.Looper;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p000.InterfaceC37862aH2;
import p000.InterfaceC52510yx2;
/* renamed from: Dg1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C32370Dg1 {

    /* renamed from: m */
    public static final ExecutorService f6167m = Executors.newCachedThreadPool();

    /* renamed from: e */
    public boolean f6172e;

    /* renamed from: g */
    public boolean f6174g;

    /* renamed from: h */
    public boolean f6175h;

    /* renamed from: j */
    public List<InterfaceC44513lT5> f6177j;

    /* renamed from: k */
    public InterfaceC52510yx2 f6178k;

    /* renamed from: l */
    public InterfaceC37862aH2 f6179l;

    /* renamed from: a */
    public boolean f6168a = true;

    /* renamed from: b */
    public boolean f6169b = true;

    /* renamed from: c */
    public boolean f6170c = true;

    /* renamed from: d */
    public boolean f6171d = true;

    /* renamed from: f */
    public boolean f6173f = true;

    /* renamed from: i */
    public ExecutorService f6176i = f6167m;

    /* renamed from: a */
    public Object m110016a() {
        try {
            return Looper.getMainLooper();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public InterfaceC52510yx2 m110015b() {
        InterfaceC52510yx2 interfaceC52510yx2 = this.f6178k;
        if (interfaceC52510yx2 != null) {
            return interfaceC52510yx2;
        }
        if (InterfaceC52510yx2.C30785a.m2221c() && m110016a() != null) {
            return new InterfaceC52510yx2.C30785a("EventBus");
        }
        return new InterfaceC52510yx2.C30786b();
    }

    /* renamed from: c */
    public InterfaceC37862aH2 m110014c() {
        Object m110016a;
        InterfaceC37862aH2 interfaceC37862aH2 = this.f6179l;
        if (interfaceC37862aH2 != null) {
            return interfaceC37862aH2;
        }
        if (!InterfaceC52510yx2.C30785a.m2221c() || (m110016a = m110016a()) == null) {
            return null;
        }
        return new InterfaceC37862aH2.C10611a((Looper) m110016a);
    }
}

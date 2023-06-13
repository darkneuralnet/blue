package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;
/* renamed from: sT5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C48663sT5 implements InterfaceC53103zx2 {

    /* renamed from: b */
    public final String f108845b;

    /* renamed from: c */
    public volatile InterfaceC53103zx2 f108846c;

    /* renamed from: d */
    public Boolean f108847d;

    /* renamed from: e */
    public Method f108848e;

    /* renamed from: f */
    public C35178Pg1 f108849f;

    /* renamed from: g */
    public Queue<C49849uT5> f108850g;

    /* renamed from: h */
    public final boolean f108851h;

    public C48663sT5(String str, Queue<C49849uT5> queue, boolean z) {
        this.f108845b = str;
        this.f108850g = queue;
        this.f108851h = z;
    }

    /* renamed from: a */
    public InterfaceC53103zx2 m14166a() {
        if (this.f108846c != null) {
            return this.f108846c;
        }
        if (this.f108851h) {
            return C42776iY2.f87462c;
        }
        return m14165b();
    }

    /* renamed from: b */
    public final InterfaceC53103zx2 m14165b() {
        if (this.f108849f == null) {
            this.f108849f = new C35178Pg1(this, this.f108850g);
        }
        return this.f108849f;
    }

    /* renamed from: c */
    public boolean m14164c() {
        Boolean bool = this.f108847d;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f108848e = this.f108846c.getClass().getMethod("log", InterfaceC36268Tx2.class);
            this.f108847d = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f108847d = Boolean.FALSE;
        }
        return this.f108847d.booleanValue();
    }

    /* renamed from: d */
    public boolean m14163d() {
        return this.f108846c instanceof C42776iY2;
    }

    @Override // p000.InterfaceC53103zx2
    public void debug(String str) {
        m14166a().debug(str);
    }

    /* renamed from: e */
    public boolean m14162e() {
        return this.f108846c == null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.f108845b.equals(((C48663sT5) obj).f108845b)) {
            return true;
        }
        return false;
    }

    @Override // p000.InterfaceC53103zx2
    public void error(String str) {
        m14166a().error(str);
    }

    /* renamed from: f */
    public void m14161f(InterfaceC36268Tx2 interfaceC36268Tx2) {
        if (m14164c()) {
            try {
                this.f108848e.invoke(this.f108846c, interfaceC36268Tx2);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    /* renamed from: g */
    public void m14160g(InterfaceC53103zx2 interfaceC53103zx2) {
        this.f108846c = interfaceC53103zx2;
    }

    @Override // p000.InterfaceC53103zx2
    public String getName() {
        return this.f108845b;
    }

    public int hashCode() {
        return this.f108845b.hashCode();
    }

    @Override // p000.InterfaceC53103zx2
    public void info(String str) {
        m14166a().info(str);
    }

    @Override // p000.InterfaceC53103zx2
    public void trace(String str) {
        m14166a().trace(str);
    }

    @Override // p000.InterfaceC53103zx2
    public void warn(String str) {
        m14166a().warn(str);
    }

    @Override // p000.InterfaceC53103zx2
    public void debug(String str, Object obj) {
        m14166a().debug(str, obj);
    }

    @Override // p000.InterfaceC53103zx2
    public void error(String str, Throwable th) {
        m14166a().error(str, th);
    }

    @Override // p000.InterfaceC53103zx2
    public void error(InterfaceC41482gM2 interfaceC41482gM2, String str) {
        m14166a().error(interfaceC41482gM2, str);
    }
}

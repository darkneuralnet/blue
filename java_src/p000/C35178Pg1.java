package p000;

import java.util.Queue;
/* renamed from: Pg1  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C35178Pg1 implements InterfaceC53103zx2 {

    /* renamed from: b */
    public String f28888b;

    /* renamed from: c */
    public C48663sT5 f28889c;

    /* renamed from: d */
    public Queue<C49849uT5> f28890d;

    public C35178Pg1(C48663sT5 c48663sT5, Queue<C49849uT5> queue) {
        this.f28889c = c48663sT5;
        this.f28888b = c48663sT5.getName();
        this.f28890d = queue;
    }

    /* renamed from: a */
    public final void m89942a(EnumC47105pq2 enumC47105pq2, InterfaceC41482gM2 interfaceC41482gM2, String str, Object[] objArr, Throwable th) {
        C49849uT5 c49849uT5 = new C49849uT5();
        c49849uT5.m10234j(System.currentTimeMillis());
        c49849uT5.m10241c(enumC47105pq2);
        c49849uT5.m10240d(this.f28889c);
        c49849uT5.m10239e(this.f28888b);
        c49849uT5.m10238f(interfaceC41482gM2);
        c49849uT5.m10237g(str);
        c49849uT5.m10236h(Thread.currentThread().getName());
        c49849uT5.m10242b(objArr);
        c49849uT5.m10235i(th);
        this.f28890d.add(c49849uT5);
    }

    /* renamed from: b */
    public final void m89941b(EnumC47105pq2 enumC47105pq2, InterfaceC41482gM2 interfaceC41482gM2, String str, Throwable th) {
        m89942a(enumC47105pq2, interfaceC41482gM2, str, null, th);
    }

    /* renamed from: c */
    public final void m89940c(EnumC47105pq2 enumC47105pq2, InterfaceC41482gM2 interfaceC41482gM2, String str, Object obj) {
        m89942a(enumC47105pq2, interfaceC41482gM2, str, new Object[]{obj}, null);
    }

    @Override // p000.InterfaceC53103zx2
    public void debug(String str) {
        m89941b(EnumC47105pq2.DEBUG, null, str, null);
    }

    @Override // p000.InterfaceC53103zx2
    public void error(String str) {
        m89941b(EnumC47105pq2.ERROR, null, str, null);
    }

    @Override // p000.InterfaceC53103zx2
    public String getName() {
        return this.f28888b;
    }

    @Override // p000.InterfaceC53103zx2
    public void info(String str) {
        m89941b(EnumC47105pq2.INFO, null, str, null);
    }

    @Override // p000.InterfaceC53103zx2
    public void trace(String str) {
        m89941b(EnumC47105pq2.TRACE, null, str, null);
    }

    @Override // p000.InterfaceC53103zx2
    public void warn(String str) {
        m89941b(EnumC47105pq2.WARN, null, str, null);
    }

    @Override // p000.InterfaceC53103zx2
    public void debug(String str, Object obj) {
        m89940c(EnumC47105pq2.DEBUG, null, str, obj);
    }

    @Override // p000.InterfaceC53103zx2
    public void error(String str, Throwable th) {
        m89941b(EnumC47105pq2.ERROR, null, str, th);
    }

    @Override // p000.InterfaceC53103zx2
    public void error(InterfaceC41482gM2 interfaceC41482gM2, String str) {
        m89941b(EnumC47105pq2.ERROR, interfaceC41482gM2, str, null);
    }
}

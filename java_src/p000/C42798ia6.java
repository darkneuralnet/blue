package p000;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
/* renamed from: ia6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C42798ia6 implements Z96 {

    /* renamed from: e */
    public static volatile AbstractC43391ja6 f87490e;

    /* renamed from: a */
    public final InterfaceC38734bl0 f87491a;

    /* renamed from: b */
    public final InterfaceC38734bl0 f87492b;

    /* renamed from: c */
    public final InterfaceC51217wm5 f87493c;

    /* renamed from: d */
    public final C52334yf6 f87494d;

    public C42798ia6(InterfaceC38734bl0 interfaceC38734bl0, InterfaceC38734bl0 interfaceC38734bl02, InterfaceC51217wm5 interfaceC51217wm5, C52334yf6 c52334yf6, XC6 xc6) {
        this.f87491a = interfaceC38734bl0;
        this.f87492b = interfaceC38734bl02;
        this.f87493c = interfaceC51217wm5;
        this.f87494d = c52334yf6;
        xc6.m77180c();
    }

    /* renamed from: c */
    public static C42798ia6 m33789c() {
        AbstractC43391ja6 abstractC43391ja6 = f87490e;
        if (abstractC43391ja6 != null) {
            return abstractC43391ja6.mo30270b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: d */
    public static Set<C35142Pc1> m33788d(G01 g01) {
        if (g01 instanceof InterfaceC43396jb1) {
            return Collections.unmodifiableSet(((InterfaceC43396jb1) g01).mo30220a());
        }
        return Collections.singleton(C35142Pc1.m90060b("proto"));
    }

    /* renamed from: f */
    public static void m33786f(Context context) {
        if (f87490e == null) {
            synchronized (C42798ia6.class) {
                if (f87490e == null) {
                    f87490e = C42711iR0.m33932c().mo30269a(context).build();
                }
            }
        }
    }

    @Override // p000.Z96
    /* renamed from: a */
    public void mo33791a(AbstractC32014Bs5 abstractC32014Bs5, InterfaceC44577la6 interfaceC44577la6) {
        this.f87493c.mo1185a(abstractC32014Bs5.mo42425f().m84267f(abstractC32014Bs5.mo42427c().mo2338c()), m33790b(abstractC32014Bs5), interfaceC44577la6);
    }

    /* renamed from: b */
    public final AbstractC33774Jg1 m33790b(AbstractC32014Bs5 abstractC32014Bs5) {
        return AbstractC33774Jg1.m100041a().mo176i(this.f87491a.mo64040a()).mo174k(this.f87492b.mo64040a()).mo175j(abstractC32014Bs5.mo42424g()).mo177h(new C43989kb1(abstractC32014Bs5.mo42428b(), abstractC32014Bs5.m113423d())).mo178g(abstractC32014Bs5.mo42427c().mo2340a()).mo181d();
    }

    /* renamed from: e */
    public C52334yf6 m33787e() {
        return this.f87494d;
    }

    /* renamed from: g */
    public U96 m33785g(G01 g01) {
        return new V96(m33788d(g01), T96.m84269a().mo16800b(g01.getName()).mo16799c(g01.getExtras()).mo16801a(), this);
    }

    @Deprecated
    /* renamed from: h */
    public U96 m33784h(String str) {
        return new V96(m33788d(null), T96.m84269a().mo16800b(str).mo16801a(), this);
    }
}

package p000;

import android.util.Size;
import androidx.camera.core.AbstractC11152d;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.impl.C11192d;
import androidx.camera.core.impl.C11204i;
import androidx.camera.core.impl.C11213q;
import androidx.camera.core.impl.InterfaceC11195e;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import p000.C44621lf0;
/* renamed from: EX1 */
/* loaded from: classes.dex */
public class EX1 {

    /* renamed from: g */
    public static final C39298ci1 f7633g = new C39298ci1();

    /* renamed from: a */
    public final C11204i f7634a;

    /* renamed from: b */
    public final C11192d f7635b;

    /* renamed from: c */
    public final C44621lf0 f7636c;

    /* renamed from: d */
    public final C41979hB5 f7637d;

    /* renamed from: e */
    public final C40160e74 f7638e;

    /* renamed from: f */
    public final C44621lf0.AbstractC25755b f7639f;

    public EX1(C11204i c11204i, Size size, AbstractC52288yb0 abstractC52288yb0) {
        C48449s62 c48449s62;
        O36.m92961a();
        this.f7634a = c11204i;
        this.f7635b = C11192d.C11193a.m69434j(c11204i).m69436h();
        C44621lf0 c44621lf0 = new C44621lf0();
        this.f7636c = c44621lf0;
        C41979hB5 c41979hB5 = new C41979hB5();
        this.f7637d = c41979hB5;
        Executor m69390X = c11204i.m69390X(C31631Ac0.m115447c());
        Objects.requireNonNull(m69390X);
        Executor executor = m69390X;
        if (abstractC52288yb0 != null) {
            c48449s62 = new C48449s62(abstractC52288yb0);
        } else {
            c48449s62 = null;
        }
        C40160e74 c40160e74 = new C40160e74(executor, c48449s62);
        this.f7638e = c40160e74;
        C44621lf0.AbstractC25755b m27031g = C44621lf0.AbstractC25755b.m27031g(size, c11204i.mo69364l());
        this.f7639f = m27031g;
        c40160e74.m43252q(c41979hB5.m36636f(c44621lf0.m27035k(m27031g)));
    }

    /* renamed from: a */
    public void m108867a() {
        O36.m92961a();
        this.f7636c.m27039g();
        this.f7637d.m36638d();
        this.f7638e.m43254o();
    }

    /* renamed from: b */
    public final C41626gc0 m108866b(InterfaceC37499Ze0 interfaceC37499Ze0, JY5 jy5, BY5 by5) {
        ArrayList arrayList = new ArrayList();
        String valueOf = String.valueOf(interfaceC37499Ze0.hashCode());
        List<InterfaceC11195e> mo70909a = interfaceC37499Ze0.mo70909a();
        Objects.requireNonNull(mo70909a);
        for (InterfaceC11195e interfaceC11195e : mo70909a) {
            C11192d.C11193a c11193a = new C11192d.C11193a();
            c11193a.m69425s(this.f7635b.m69445h());
            c11193a.m69439e(this.f7635b.m69448e());
            c11193a.m69443a(jy5.mo20316n());
            c11193a.m69438f(this.f7639f.m27032f());
            if (this.f7639f.mo16813c() == 256) {
                if (f7633g.m61031a()) {
                    c11193a.m69440d(C11192d.f52582i, Integer.valueOf(jy5.mo20318l()));
                }
                c11193a.m69440d(C11192d.f52583j, Integer.valueOf(m108861g(jy5)));
            }
            c11193a.m69439e(interfaceC11195e.mo69423a().m69448e());
            c11193a.m69437g(valueOf, Integer.valueOf(interfaceC11195e.getId()));
            c11193a.m69441c(this.f7639f.m27033a());
            arrayList.add(c11193a.m69436h());
        }
        return new C41626gc0(arrayList, by5);
    }

    /* renamed from: c */
    public final InterfaceC37499Ze0 m108865c() {
        InterfaceC37499Ze0 m69395S = this.f7634a.m69395S(C38081af0.m70910b());
        Objects.requireNonNull(m69395S);
        return m69395S;
    }

    /* renamed from: d */
    public final C40753f74 m108864d(InterfaceC37499Ze0 interfaceC37499Ze0, JY5 jy5, BY5 by5, ListenableFuture<Void> listenableFuture) {
        return new C40753f74(interfaceC37499Ze0, jy5.mo20319k(), jy5.mo20323g(), jy5.mo20318l(), jy5.mo20321i(), jy5.mo20317m(), by5, listenableFuture);
    }

    /* renamed from: e */
    public C48526sE3<C41626gc0, C40753f74> m108863e(JY5 jy5, BY5 by5, ListenableFuture<Void> listenableFuture) {
        O36.m92961a();
        InterfaceC37499Ze0 m108865c = m108865c();
        return new C48526sE3<>(m108866b(m108865c, jy5, by5), m108864d(m108865c, jy5, by5, listenableFuture));
    }

    /* renamed from: f */
    public C11213q.C11215b m108862f(Size size) {
        C11213q.C11215b m69329o = C11213q.C11215b.m69329o(this.f7634a, size);
        m69329o.m69336h(this.f7639f.m27032f());
        return m69329o;
    }

    /* renamed from: g */
    public int m108861g(JY5 jy5) {
        boolean z;
        if (jy5.mo20320j() != null) {
            z = true;
        } else {
            z = false;
        }
        boolean m19869f = C46705p96.m19869f(jy5.mo20323g(), this.f7639f.mo16811e());
        if (z && m19869f) {
            if (jy5.mo20324f() == 0) {
                return 100;
            }
            return 95;
        }
        return jy5.mo20321i();
    }

    /* renamed from: h */
    public int m108860h() {
        O36.m92961a();
        return this.f7636c.m27044b();
    }

    /* renamed from: i */
    public void m108859i(ImageCaptureException imageCaptureException) {
        O36.m92961a();
        this.f7639f.mo16814b().accept(imageCaptureException);
    }

    /* renamed from: j */
    public void m108858j(AbstractC11152d.InterfaceC11153a interfaceC11153a) {
        O36.m92961a();
        this.f7636c.m27036j(interfaceC11153a);
    }

    /* renamed from: k */
    public void m108857k(C40753f74 c40753f74) {
        O36.m92961a();
        this.f7639f.mo16812d().accept(c40753f74);
    }
}

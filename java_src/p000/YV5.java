package p000;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.C11243o;
import androidx.camera.core.ProcessingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
/* renamed from: YV5 */
/* loaded from: classes.dex */
public class YV5 {

    /* renamed from: a */
    public final UV5 f45947a;

    /* renamed from: b */
    public final InterfaceC34196Lb0 f45948b;

    /* renamed from: c */
    public C9795c f45949c;

    /* renamed from: d */
    public AbstractC9794b f45950d;

    /* renamed from: YV5$a */
    /* loaded from: classes.dex */
    public class C9793a implements CA1<PV5> {
        public C9793a() {
        }

        @Override // p000.CA1
        /* renamed from: a */
        public void onSuccess(PV5 pv5) {
            HZ3.m103731g(pv5);
            try {
                YV5.this.f45947a.mo64492a(pv5);
            } catch (ProcessingException e) {
                C33928Jx2.m99530d("SurfaceProcessorNode", "Failed to send SurfaceOutput to SurfaceProcessor.", e);
            }
        }

        @Override // p000.CA1
        public void onFailure(Throwable th) {
            C33928Jx2.m99521m("SurfaceProcessorNode", "Downstream node failed to provide Surface.", th);
        }
    }

    /* renamed from: YV5$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC9794b {
        /* renamed from: c */
        public static AbstractC9794b m74954c(MV5 mv5, List<AbstractC9796d> list) {
            return new C25812lu(mv5, list);
        }

        /* renamed from: a */
        public abstract List<AbstractC9796d> mo26698a();

        /* renamed from: b */
        public abstract MV5 mo26697b();
    }

    /* renamed from: YV5$c */
    /* loaded from: classes.dex */
    public static class C9795c extends HashMap<AbstractC9796d, MV5> {
    }

    /* renamed from: YV5$d */
    /* loaded from: classes.dex */
    public static abstract class AbstractC9796d {
        /* renamed from: h */
        public static AbstractC9796d m74953h(int i, int i2, Rect rect, Size size, int i3, boolean z) {
            return new C26287mu(UUID.randomUUID(), i, i2, rect, size, i3, z);
        }

        /* renamed from: i */
        public static AbstractC9796d m74952i(MV5 mv5) {
            return m74953h(mv5.m95253u(), mv5.m95258p(), mv5.m95260n(), C46705p96.m19870e(mv5.m95260n(), mv5.m95256r()), mv5.m95256r(), mv5.m95257q());
        }

        /* renamed from: a */
        public abstract Rect mo24740a();

        /* renamed from: b */
        public abstract int mo24739b();

        /* renamed from: c */
        public abstract boolean mo24738c();

        /* renamed from: d */
        public abstract int mo24737d();

        /* renamed from: e */
        public abstract Size mo24736e();

        /* renamed from: f */
        public abstract int mo24735f();

        /* renamed from: g */
        public abstract UUID mo24734g();
    }

    public YV5(InterfaceC34196Lb0 interfaceC34196Lb0, UV5 uv5) {
        this.f45948b = interfaceC34196Lb0;
        this.f45947a = uv5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m74964e() {
        C9795c c9795c = this.f45949c;
        if (c9795c != null) {
            for (MV5 mv5 : c9795c.values()) {
                mv5.m95266h();
            }
        }
    }

    /* renamed from: g */
    public static /* synthetic */ void m74962g(Map map, C11243o.AbstractC11251h abstractC11251h) {
        for (Map.Entry entry : map.entrySet()) {
            int mo69084b = abstractC11251h.mo69084b() - ((AbstractC9796d) entry.getKey()).mo24737d();
            if (((AbstractC9796d) entry.getKey()).mo24738c()) {
                mo69084b = -mo69084b;
            }
            ((MV5) entry.getValue()).m95274D(C46705p96.m19856s(mo69084b));
        }
    }

    /* renamed from: d */
    public final void m74963f(MV5 mv5, Map.Entry<AbstractC9796d, MV5> entry) {
        IA1.m102842b(entry.getValue().m95265i(mv5.m95254t().mo31669c(), entry.getKey().mo24739b(), entry.getKey().mo24740a(), entry.getKey().mo24737d(), entry.getKey().mo24738c(), this.f45948b), new C9793a(), C31631Ac0.m115446d());
    }

    /* renamed from: h */
    public void m74961h() {
        this.f45947a.release();
        C31631Ac0.m115446d().execute(new Runnable() { // from class: XV5
            @Override // java.lang.Runnable
            public final void run() {
                YV5.this.m74964e();
            }
        });
    }

    /* renamed from: i */
    public final void m74960i(final MV5 mv5, Map<AbstractC9796d, MV5> map) {
        for (final Map.Entry<AbstractC9796d, MV5> entry : map.entrySet()) {
            m74963f(mv5, entry);
            entry.getValue().m95269e(new Runnable() { // from class: WV5
                @Override // java.lang.Runnable
                public final void run() {
                    YV5.this.m74963f(mv5, entry);
                }
            });
        }
    }

    /* renamed from: j */
    public final void m74959j(MV5 mv5, Map<AbstractC9796d, MV5> map) {
        C11243o m95264j = mv5.m95264j(this.f45948b);
        m74958k(m95264j, map);
        try {
            this.f45947a.mo64491b(m95264j);
        } catch (ProcessingException e) {
            C33928Jx2.m99530d("SurfaceProcessorNode", "Failed to send SurfaceRequest to SurfaceProcessor.", e);
        }
    }

    /* renamed from: k */
    public void m74958k(C11243o c11243o, final Map<AbstractC9796d, MV5> map) {
        c11243o.m69121B(C31631Ac0.m115446d(), new C11243o.InterfaceC11252i() { // from class: VV5
            @Override // androidx.camera.core.C11243o.InterfaceC11252i
            /* renamed from: a */
            public final void mo29414a(C11243o.AbstractC11251h abstractC11251h) {
                YV5.m74962g(map, abstractC11251h);
            }
        });
    }

    /* renamed from: l */
    public C9795c m74957l(AbstractC9794b abstractC9794b) {
        O36.m92961a();
        this.f45950d = abstractC9794b;
        this.f45949c = new C9795c();
        MV5 mo26697b = abstractC9794b.mo26697b();
        for (AbstractC9796d abstractC9796d : abstractC9794b.mo26698a()) {
            this.f45949c.put(abstractC9796d, m74956m(mo26697b, abstractC9796d));
        }
        m74959j(mo26697b, this.f45949c);
        m74960i(mo26697b, this.f45949c);
        return this.f45949c;
    }

    /* renamed from: m */
    public final MV5 m74956m(MV5 mv5, AbstractC9796d abstractC9796d) {
        boolean z;
        Rect mo24740a = abstractC9796d.mo24740a();
        int mo24737d = abstractC9796d.mo24737d();
        boolean mo24738c = abstractC9796d.mo24738c();
        Matrix matrix = new Matrix(mv5.m95255s());
        matrix.postConcat(C46705p96.m19871d(C46705p96.m19859p(mv5.m95254t().mo31669c()), C46705p96.m19859p(abstractC9796d.mo24736e()), mo24737d, mo24738c));
        HZ3.m103737a(C46705p96.m19867h(C46705p96.m19870e(mo24740a, mo24737d), abstractC9796d.mo24736e()));
        BR5 mo31668a = BR5.m114036a(abstractC9796d.mo24736e()).mo31667b(mv5.m95254t().mo31670b()).mo31668a();
        int mo24735f = abstractC9796d.mo24735f();
        int mo24739b = abstractC9796d.mo24739b();
        Rect m19861n = C46705p96.m19861n(abstractC9796d.mo24736e());
        int m95256r = mv5.m95256r() - mo24737d;
        if (mv5.m95257q() != mo24738c) {
            z = true;
        } else {
            z = false;
        }
        return new MV5(mo24735f, mo24739b, mo31668a, matrix, false, m19861n, m95256r, z);
    }
}

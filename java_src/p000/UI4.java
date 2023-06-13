package p000;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p000.InterfaceC32531Dy0;
/* renamed from: UI4 */
/* loaded from: classes5.dex */
public class UI4 implements ComponentCallbacks2, InterfaceC32227Cq2 {

    /* renamed from: m */
    public static final YI4 f37200m = YI4.m75264G0(Bitmap.class).m97564d0();

    /* renamed from: n */
    public static final YI4 f37201n = YI4.m75264G0(C49692uC1.class).m97564d0();

    /* renamed from: o */
    public static final YI4 f37202o = YI4.m75263H0(B41.f1617c).m97546o0(P24.LOW).m97533x0(true);

    /* renamed from: b */
    public final ComponentCallbacks2C17096a f37203b;

    /* renamed from: c */
    public final Context f37204c;

    /* renamed from: d */
    public final InterfaceC51254wq2 f37205d;

    /* renamed from: e */
    public final C45015mJ4 f37206e;

    /* renamed from: f */
    public final XI4 f37207f;

    /* renamed from: g */
    public final TY5 f37208g;

    /* renamed from: h */
    public final Runnable f37209h;

    /* renamed from: i */
    public final InterfaceC32531Dy0 f37210i;

    /* renamed from: j */
    public final CopyOnWriteArrayList<TI4<Object>> f37211j;

    /* renamed from: k */
    public YI4 f37212k;

    /* renamed from: l */
    public boolean f37213l;

    /* renamed from: UI4$a */
    /* loaded from: classes5.dex */
    public class RunnableC8256a implements Runnable {
        public RunnableC8256a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            UI4 ui4 = UI4.this;
            ui4.f37205d.mo6272a(ui4);
        }
    }

    /* renamed from: UI4$b */
    /* loaded from: classes5.dex */
    public class C8257b implements InterfaceC32531Dy0.InterfaceC1677a {

        /* renamed from: a */
        public final C45015mJ4 f37215a;

        public C8257b(C45015mJ4 c45015mJ4) {
            this.f37215a = c45015mJ4;
        }

        @Override // p000.InterfaceC32531Dy0.InterfaceC1677a
        /* renamed from: a */
        public void mo12913a(boolean z) {
            if (z) {
                synchronized (UI4.this) {
                    this.f37215a.m25825e();
                }
            }
        }
    }

    public UI4(ComponentCallbacks2C17096a componentCallbacks2C17096a, InterfaceC51254wq2 interfaceC51254wq2, XI4 xi4, Context context) {
        this(componentCallbacks2C17096a, interfaceC51254wq2, xi4, new C45015mJ4(), componentCallbacks2C17096a.m53151g(), context);
    }

    /* renamed from: a */
    public <ResourceType> C47971rI4<ResourceType> m81663a(Class<ResourceType> cls) {
        return new C47971rI4<>(this.f37203b, this, cls, this.f37204c);
    }

    /* renamed from: b */
    public C47971rI4<Bitmap> m81662b() {
        return m81663a(Bitmap.class).mo16086d(f37200m);
    }

    /* renamed from: c */
    public C47971rI4<Drawable> m81661c() {
        return m81663a(Drawable.class);
    }

    /* renamed from: d */
    public void m81660d(LY5<?> ly5) {
        if (ly5 == null) {
            return;
        }
        m81645s(ly5);
    }

    /* renamed from: e */
    public List<TI4<Object>> m81659e() {
        return this.f37211j;
    }

    /* renamed from: f */
    public synchronized YI4 m81658f() {
        return this.f37212k;
    }

    /* renamed from: g */
    public <T> K96<?, T> m81657g(Class<T> cls) {
        return this.f37203b.m53149i().m53129e(cls);
    }

    /* renamed from: h */
    public C47971rI4<Drawable> m81656h(Uri uri) {
        return m81661c().m16093U0(uri);
    }

    /* renamed from: i */
    public C47971rI4<Drawable> m81655i(File file) {
        return m81661c().m16092V0(file);
    }

    /* renamed from: j */
    public C47971rI4<Drawable> m81654j(Integer num) {
        return m81661c().m16091X0(num);
    }

    /* renamed from: k */
    public C47971rI4<Drawable> m81653k(String str) {
        return m81661c().m16089a1(str);
    }

    /* renamed from: l */
    public synchronized void m81652l() {
        this.f37206e.m25827c();
    }

    /* renamed from: m */
    public synchronized void m81651m() {
        m81652l();
        for (UI4 ui4 : this.f37207f.mo42825a()) {
            ui4.m81652l();
        }
    }

    /* renamed from: n */
    public synchronized void m81650n() {
        this.f37206e.m25826d();
    }

    /* renamed from: o */
    public synchronized void m81649o() {
        this.f37206e.m25824f();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // p000.InterfaceC32227Cq2
    public synchronized void onDestroy() {
        this.f37208g.onDestroy();
        for (LY5<?> ly5 : this.f37208g.m83401b()) {
            m81660d(ly5);
        }
        this.f37208g.m83402a();
        this.f37206e.m25828b();
        this.f37205d.mo6271b(this);
        this.f37205d.mo6271b(this.f37210i);
        C47029pi6.m18904v(this.f37209h);
        this.f37203b.m53139s(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // p000.InterfaceC32227Cq2
    public synchronized void onStart() {
        m81649o();
        this.f37208g.onStart();
    }

    @Override // p000.InterfaceC32227Cq2
    public synchronized void onStop() {
        m81650n();
        this.f37208g.onStop();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (i == 60 && this.f37213l) {
            m81651m();
        }
    }

    /* renamed from: p */
    public synchronized void m81648p(YI4 yi4) {
        this.f37212k = yi4.clone().m97563e();
    }

    /* renamed from: q */
    public synchronized void m81647q(LY5<?> ly5, InterfaceC45599nI4 interfaceC45599nI4) {
        this.f37208g.m83400c(ly5);
        this.f37206e.m25823g(interfaceC45599nI4);
    }

    /* renamed from: r */
    public synchronized boolean m81646r(LY5<?> ly5) {
        InterfaceC45599nI4 request = ly5.getRequest();
        if (request == null) {
            return true;
        }
        if (this.f37206e.m25829a(request)) {
            this.f37208g.m83399d(ly5);
            ly5.setRequest(null);
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final void m81645s(LY5<?> ly5) {
        boolean m81646r = m81646r(ly5);
        InterfaceC45599nI4 request = ly5.getRequest();
        if (!m81646r && !this.f37203b.m53142p(ly5) && request != null) {
            ly5.setRequest(null);
            request.clear();
        }
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f37206e + ", treeNode=" + this.f37207f + "}";
    }

    public UI4(ComponentCallbacks2C17096a componentCallbacks2C17096a, InterfaceC51254wq2 interfaceC51254wq2, XI4 xi4, C45015mJ4 c45015mJ4, InterfaceC32765Ey0 interfaceC32765Ey0, Context context) {
        this.f37208g = new TY5();
        RunnableC8256a runnableC8256a = new RunnableC8256a();
        this.f37209h = runnableC8256a;
        this.f37203b = componentCallbacks2C17096a;
        this.f37205d = interfaceC51254wq2;
        this.f37207f = xi4;
        this.f37206e = c45015mJ4;
        this.f37204c = context;
        InterfaceC32531Dy0 mo95241a = interfaceC32765Ey0.mo95241a(context.getApplicationContext(), new C8257b(c45015mJ4));
        this.f37210i = mo95241a;
        if (C47029pi6.m18909q()) {
            C47029pi6.m18905u(runnableC8256a);
        } else {
            interfaceC51254wq2.mo6272a(this);
        }
        interfaceC51254wq2.mo6272a(mo95241a);
        this.f37211j = new CopyOnWriteArrayList<>(componentCallbacks2C17096a.m53149i().m53131c());
        m81648p(componentCallbacks2C17096a.m53149i().m53130d());
        componentCallbacks2C17096a.m53143o(this);
    }
}

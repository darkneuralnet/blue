package com.google.p034ar.sceneform.rendering;

import android.content.Context;
import android.net.Uri;
import com.google.android.filament.MaterialInstance;
import com.google.p034ar.sceneform.rendering.AbstractC18039d;
import io.github.sceneview.SceneView;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
/* renamed from: com.google.ar.sceneform.rendering.d */
/* loaded from: classes6.dex */
public abstract class AbstractC18039d {

    /* renamed from: k */
    public static final long f73924k = TimeUnit.DAYS.toSeconds(14);

    /* renamed from: a */
    public final InterfaceC18034a f73925a;

    /* renamed from: b */
    public boolean f73926b;

    /* renamed from: c */
    public final ArrayList<MaterialInstance> f73927c;

    /* renamed from: d */
    public final ArrayList<String> f73928d;

    /* renamed from: e */
    public int f73929e;

    /* renamed from: f */
    public boolean f73930f;

    /* renamed from: g */
    public boolean f73931g;

    /* renamed from: h */
    public int f73932h;

    /* renamed from: i */
    public AbstractC45877nm0 f73933i;

    /* renamed from: j */
    public final C32378Dh0 f73934j;

    /* renamed from: com.google.ar.sceneform.rendering.d$a */
    /* loaded from: classes6.dex */
    public static abstract class AbstractC18040a<T extends AbstractC18039d, B extends AbstractC18040a<T, B>> {

        /* renamed from: a */
        public Object f73935a = null;

        /* renamed from: b */
        public Context f73936b = null;

        /* renamed from: c */
        public Uri f73937c = null;

        /* renamed from: d */
        public Callable<InputStream> f73938d = null;

        /* renamed from: e */
        public C18041e f73939e = null;

        /* renamed from: f */
        public boolean f73940f = false;

        /* renamed from: g */
        public boolean f73941g = false;

        /* renamed from: h */
        public boolean f73942h = false;

        /* renamed from: i */
        public Function<String, Uri> f73943i = null;

        /* renamed from: j */
        public byte[] f73944j = null;

        /* renamed from: k */
        public int f73945k = 24;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: n */
        public /* synthetic */ AbstractC18039d m48318n(AbstractC18039d abstractC18039d) {
            return mo48322j().cast(abstractC18039d.mo48245p());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public /* synthetic */ AbstractC18039d m48317o(AbstractC18039d abstractC18039d) {
            return mo48322j().cast(abstractC18039d.mo48245p());
        }

        /* renamed from: h */
        public CompletableFuture<T> m48324h() {
            CompletableFuture<T> completableFuture;
            CompletableFuture<T> m16040c;
            try {
                m48323i();
                Object obj = this.f73935a;
                if (obj != null && (m16040c = mo48321k().m16040c(obj)) != null) {
                    return (CompletableFuture<T>) m16040c.thenApply(new Function() { // from class: mx4
                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            AbstractC18039d m48318n;
                            m48318n = AbstractC18039d.AbstractC18040a.this.m48318n((AbstractC18039d) obj2);
                            return m48318n;
                        }
                    });
                }
                T mo48314r = mo48314r();
                if (this.f73939e != null) {
                    return CompletableFuture.completedFuture(mo48314r);
                }
                if (this.f73938d == null) {
                    CompletableFuture<T> completableFuture2 = new CompletableFuture<>();
                    completableFuture2.completeExceptionally(new AssertionError("Input Stream Creator is null."));
                    String simpleName = mo48322j().getSimpleName();
                    FA1.m107476c(simpleName, completableFuture2, "Unable to load Renderable registryId='" + obj + "'");
                    return completableFuture2;
                }
                if (this.f73941g) {
                    Context context = this.f73936b;
                    if (context != null) {
                        completableFuture = m48316p(context, mo48314r);
                    } else {
                        throw new AssertionError("Gltf Renderable.Builder must have a valid context.");
                    }
                } else if (this.f73940f) {
                    Context context2 = this.f73936b;
                    if (context2 != null) {
                        completableFuture = m48315q(context2, mo48314r, this.f73944j);
                    } else {
                        throw new AssertionError("Gltf Renderable.Builder must have a valid context.");
                    }
                } else {
                    completableFuture = null;
                }
                if (obj != null) {
                    mo48321k().m16038e(obj, completableFuture);
                }
                String simpleName2 = mo48322j().getSimpleName();
                FA1.m107476c(simpleName2, completableFuture, "Unable to load Renderable registryId='" + obj + "'");
                return (CompletableFuture<T>) completableFuture.thenApply(new Function() { // from class: nx4
                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        AbstractC18039d m48317o;
                        m48317o = AbstractC18039d.AbstractC18040a.this.m48317o((AbstractC18039d) obj2);
                        return m48317o;
                    }
                });
            } catch (Throwable th) {
                CompletableFuture<T> completableFuture3 = new CompletableFuture<>();
                completableFuture3.completeExceptionally(th);
                String simpleName3 = mo48322j().getSimpleName();
                FA1.m107476c(simpleName3, completableFuture3, "Unable to load Renderable registryId='" + this.f73935a + "'");
                return completableFuture3;
            }
        }

        /* renamed from: i */
        public void m48323i() {
            C31060zd.m1006c();
            if (m48319m().booleanValue()) {
                return;
            }
            throw new AssertionError("ModelRenderable must have a source.");
        }

        /* renamed from: j */
        public abstract Class<T> mo48322j();

        /* renamed from: k */
        public abstract C48007rM4<T> mo48321k();

        /* renamed from: l */
        public abstract B mo48320l();

        /* renamed from: m */
        public Boolean m48319m() {
            return Boolean.valueOf((this.f73937c == null && this.f73938d == null && this.f73939e == null) ? false : true);
        }

        /* renamed from: p */
        public final CompletableFuture<T> m48316p(Context context, T t) {
            return new C45949nt2(t, context, (Uri) DZ3.m110174c(this.f73937c), this.f73943i).m22245d((Callable) DZ3.m110174c(this.f73938d));
        }

        /* renamed from: q */
        public final CompletableFuture<T> m48315q(Context context, T t, byte[] bArr) {
            return null;
        }

        /* renamed from: r */
        public abstract T mo48314r();

        /* renamed from: s */
        public B m48313s(C18041e c18041e) {
            this.f73939e = c18041e;
            this.f73935a = null;
            this.f73937c = null;
            return mo48320l();
        }
    }

    public AbstractC18039d(AbstractC18040a<? extends AbstractC18039d, ? extends AbstractC18040a<?, ?>> abstractC18040a) {
        this.f73927c = new ArrayList<>();
        this.f73928d = new ArrayList<>();
        this.f73929e = 4;
        this.f73930f = true;
        this.f73931g = true;
        this.f73934j = new C32378Dh0();
        DZ3.m110173d(abstractC18040a, "Parameter \"builder\" was null.");
        if (abstractC18040a.f73941g) {
            this.f73925a = new C18048g();
        } else if (abstractC18040a.f73940f) {
            this.f73925a = m48347b();
        } else {
            this.f73925a = new C18046f();
        }
        if (abstractC18040a.f73939e != null) {
            m48332t(abstractC18040a.f73939e);
        }
        this.f73926b = abstractC18040a.f73942h;
        this.f73932h = abstractC18040a.f73945k;
    }

    /* renamed from: a */
    public C46584ox4 m48348a(InterfaceC46112o96 interfaceC46112o96) {
        return new C46584ox4(interfaceC46112o96, this);
    }

    /* renamed from: b */
    public final InterfaceC18034a m48347b() {
        return null;
    }

    /* renamed from: c */
    public int m48346c() {
        return this.f73932h;
    }

    /* renamed from: d */
    public AbstractC45877nm0 m48345d() {
        return this.f73933i;
    }

    /* renamed from: e */
    public C43270jN2 mo48246e(C43270jN2 c43270jN2) {
        DZ3.m110173d(c43270jN2, "Parameter \"originalMatrix\" was null.");
        return c43270jN2;
    }

    /* renamed from: f */
    public C32378Dh0 m48344f() {
        return this.f73934j;
    }

    /* renamed from: g */
    public MaterialInstance m48343g() {
        return m48342h(0);
    }

    /* renamed from: h */
    public MaterialInstance m48342h(int i) {
        if (i < this.f73927c.size()) {
            return this.f73927c.get(i);
        }
        throw m48334q(i);
    }

    /* renamed from: i */
    public ArrayList<MaterialInstance> m48341i() {
        return this.f73927c;
    }

    /* renamed from: j */
    public ArrayList<String> m48340j() {
        return this.f73928d;
    }

    /* renamed from: k */
    public int m48339k() {
        return this.f73929e;
    }

    /* renamed from: l */
    public InterfaceC18034a m48338l() {
        return this.f73925a;
    }

    /* renamed from: m */
    public int m48337m() {
        return this.f73925a.mo48277j().size();
    }

    /* renamed from: n */
    public boolean m48336n() {
        return this.f73930f;
    }

    /* renamed from: o */
    public boolean m48335o() {
        return this.f73931g;
    }

    /* renamed from: p */
    public abstract AbstractC18039d mo48245p();

    /* renamed from: q */
    public final IllegalArgumentException m48334q(int i) {
        return new IllegalArgumentException("submeshIndex (" + i + ") is out of range. It must be less than the submeshCount (" + m48337m() + ").");
    }

    /* renamed from: r */
    public void mo48244r(SceneView sceneView) {
    }

    /* renamed from: s */
    public void m48333s(boolean z) {
        this.f73930f = z;
        this.f73934j.m110005d();
    }

    /* renamed from: t */
    public void m48332t(C18041e c18041e) {
        DZ3.m110172e(!c18041e.m48304i().isEmpty());
        this.f73934j.m110005d();
        c18041e.m48309d(this.f73925a, this.f73927c, this.f73928d);
        this.f73933i = new C38300b10(this.f73925a.mo48278i(), this.f73925a.mo48274m());
    }

    public AbstractC18039d(AbstractC18039d abstractC18039d) {
        this.f73927c = new ArrayList<>();
        this.f73928d = new ArrayList<>();
        this.f73929e = 4;
        this.f73930f = true;
        this.f73931g = true;
        this.f73934j = new C32378Dh0();
        if (!abstractC18039d.m48344f().m110006c()) {
            this.f73925a = abstractC18039d.f73925a;
            DZ3.m110172e(abstractC18039d.f73928d.size() == abstractC18039d.f73927c.size());
            for (int i = 0; i < abstractC18039d.f73927c.size(); i++) {
                this.f73927c.add(abstractC18039d.f73927c.get(i).getMaterial().createInstance());
                this.f73928d.add(abstractC18039d.f73928d.get(i));
            }
            this.f73929e = abstractC18039d.f73929e;
            this.f73930f = abstractC18039d.f73930f;
            this.f73931g = abstractC18039d.f73931g;
            AbstractC45877nm0 abstractC45877nm0 = abstractC18039d.f73933i;
            if (abstractC45877nm0 != null) {
                this.f73933i = abstractC45877nm0.mo23207a();
            }
            this.f73926b = abstractC18039d.f73926b;
            this.f73932h = abstractC18039d.f73932h;
            this.f73934j.m110005d();
            return;
        }
        throw new AssertionError("Cannot copy uninitialized Renderable.");
    }
}

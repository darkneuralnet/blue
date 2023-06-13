package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.manager.C17140b;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* renamed from: com.bumptech.glide.a */
/* loaded from: classes5.dex */
public class ComponentCallbacks2C17096a implements ComponentCallbacks2 {

    /* renamed from: l */
    public static volatile ComponentCallbacks2C17096a f69080l;

    /* renamed from: m */
    public static volatile boolean f69081m;

    /* renamed from: b */
    public final C32343Dd1 f69082b;

    /* renamed from: c */
    public final InterfaceC20044eU f69083c;

    /* renamed from: d */
    public final OP2 f69084d;

    /* renamed from: e */
    public final C17104c f69085e;

    /* renamed from: f */
    public final InterfaceC28820to f69086f;

    /* renamed from: g */
    public final C17140b f69087g;

    /* renamed from: h */
    public final InterfaceC32765Ey0 f69088h;

    /* renamed from: j */
    public final InterfaceC17097a f69090j;

    /* renamed from: i */
    public final List<UI4> f69089i = new ArrayList();

    /* renamed from: k */
    public PP2 f69091k = PP2.NORMAL;

    /* renamed from: com.bumptech.glide.a$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC17097a {
        YI4 build();
    }

    public ComponentCallbacks2C17096a(Context context, C32343Dd1 c32343Dd1, OP2 op2, InterfaceC20044eU interfaceC20044eU, InterfaceC28820to interfaceC28820to, C17140b c17140b, InterfaceC32765Ey0 interfaceC32765Ey0, int i, InterfaceC17097a interfaceC17097a, Map<Class<?>, K96<?, ?>> map, List<TI4<Object>> list, List<LC1> list2, AbstractC12485bj abstractC12485bj, C17105d c17105d) {
        this.f69082b = c32343Dd1;
        this.f69083c = interfaceC20044eU;
        this.f69086f = interfaceC28820to;
        this.f69084d = op2;
        this.f69087g = c17140b;
        this.f69088h = interfaceC32765Ey0;
        this.f69090j = interfaceC17097a;
        this.f69085e = new C17104c(context, interfaceC28820to, C17107e.m53118d(this, list2, abstractC12485bj), new C52854zY1(), interfaceC17097a, map, list, c32343Dd1, c17105d, i);
    }

    /* renamed from: a */
    public static void m53157a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!f69081m) {
            f69081m = true;
            m53145m(context, generatedAppGlideModule);
            f69081m = false;
            return;
        }
        throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
    }

    /* renamed from: c */
    public static ComponentCallbacks2C17096a m53155c(Context context) {
        if (f69080l == null) {
            GeneratedAppGlideModule m53154d = m53154d(context.getApplicationContext());
            synchronized (ComponentCallbacks2C17096a.class) {
                if (f69080l == null) {
                    m53157a(context, m53154d);
                }
            }
        }
        return f69080l;
    }

    /* renamed from: d */
    public static GeneratedAppGlideModule m53154d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (IllegalAccessException e) {
            m53141q(e);
            return null;
        } catch (InstantiationException e2) {
            m53141q(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            m53141q(e3);
            return null;
        } catch (InvocationTargetException e4) {
            m53141q(e4);
            return null;
        }
    }

    /* renamed from: l */
    public static C17140b m53146l(Context context) {
        C52865zZ3.m1110e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return m53155c(context).m53147k();
    }

    /* renamed from: m */
    public static void m53145m(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        m53144n(context, new C17098b(), generatedAppGlideModule);
    }

    /* renamed from: n */
    public static void m53144n(Context context, C17098b c17098b, GeneratedAppGlideModule generatedAppGlideModule) {
        C17140b.InterfaceC17142b interfaceC17142b;
        Context applicationContext = context.getApplicationContext();
        List<LC1> emptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.m64077c()) {
            emptyList = new QJ2(applicationContext).m88661a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.m53180d().isEmpty()) {
            Set<Class<?>> m53180d = generatedAppGlideModule.m53180d();
            Iterator<LC1> it = emptyList.iterator();
            while (it.hasNext()) {
                LC1 next = it.next();
                if (m53180d.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<LC1> it2 = emptyList.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + it2.next().getClass());
            }
        }
        if (generatedAppGlideModule != null) {
            interfaceC17142b = generatedAppGlideModule.m53179e();
        } else {
            interfaceC17142b = null;
        }
        c17098b.m53134b(interfaceC17142b);
        for (LC1 lc1 : emptyList) {
            lc1.mo25040a(applicationContext, c17098b);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.mo25040a(applicationContext, c17098b);
        }
        ComponentCallbacks2C17096a m53135a = c17098b.m53135a(applicationContext, emptyList, generatedAppGlideModule);
        applicationContext.registerComponentCallbacks(m53135a);
        f69080l = m53135a;
    }

    /* renamed from: q */
    public static void m53141q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* renamed from: t */
    public static UI4 m53138t(Context context) {
        return m53146l(context).m53039l(context);
    }

    /* renamed from: u */
    public static UI4 m53137u(View view) {
        return m53146l(view.getContext()).m53038m(view);
    }

    /* renamed from: v */
    public static UI4 m53136v(FragmentActivity fragmentActivity) {
        return m53146l(fragmentActivity).m53036o(fragmentActivity);
    }

    /* renamed from: b */
    public void m53156b() {
        C47029pi6.m18924b();
        this.f69084d.m92349b();
        this.f69083c.mo16194b();
        this.f69086f.mo11762b();
    }

    /* renamed from: e */
    public InterfaceC28820to m53153e() {
        return this.f69086f;
    }

    /* renamed from: f */
    public InterfaceC20044eU m53152f() {
        return this.f69083c;
    }

    /* renamed from: g */
    public InterfaceC32765Ey0 m53151g() {
        return this.f69088h;
    }

    /* renamed from: h */
    public Context m53150h() {
        return this.f69085e.getBaseContext();
    }

    /* renamed from: i */
    public C17104c m53149i() {
        return this.f69085e;
    }

    /* renamed from: j */
    public Registry m53148j() {
        return this.f69085e.m53125i();
    }

    /* renamed from: k */
    public C17140b m53147k() {
        return this.f69087g;
    }

    /* renamed from: o */
    public void m53143o(UI4 ui4) {
        synchronized (this.f69089i) {
            if (!this.f69089i.contains(ui4)) {
                this.f69089i.add(ui4);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        m53156b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        m53140r(i);
    }

    /* renamed from: p */
    public boolean m53142p(LY5<?> ly5) {
        synchronized (this.f69089i) {
            for (UI4 ui4 : this.f69089i) {
                if (ui4.m81646r(ly5)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: r */
    public void m53140r(int i) {
        C47029pi6.m18924b();
        synchronized (this.f69089i) {
            for (UI4 ui4 : this.f69089i) {
                ui4.onTrimMemory(i);
            }
        }
        this.f69084d.mo3796a(i);
        this.f69083c.mo16195a(i);
        this.f69086f.mo11763a(i);
    }

    /* renamed from: s */
    public void m53139s(UI4 ui4) {
        synchronized (this.f69089i) {
            if (this.f69089i.contains(ui4)) {
                this.f69089i.remove(ui4);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }
}

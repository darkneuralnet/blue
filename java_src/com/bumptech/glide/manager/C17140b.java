package com.bumptech.glide.manager;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.AbstractC11685m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.C17098b;
import com.bumptech.glide.C17105d;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* renamed from: com.bumptech.glide.manager.b */
/* loaded from: classes5.dex */
public class C17140b implements Handler.Callback {

    /* renamed from: m */
    public static final InterfaceC17142b f69190m = new C17141a();

    /* renamed from: b */
    public volatile UI4 f69191b;

    /* renamed from: e */
    public final Handler f69194e;

    /* renamed from: f */
    public final InterfaceC17142b f69195f;

    /* renamed from: g */
    public final C17105d f69196g;

    /* renamed from: k */
    public final InterfaceC35574Qy1 f69200k;

    /* renamed from: l */
    public final C17137a f69201l;

    /* renamed from: c */
    public final Map<FragmentManager, VI4> f69192c = new HashMap();

    /* renamed from: d */
    public final Map<androidx.fragment.app.FragmentManager, C40380eV5> f69193d = new HashMap();

    /* renamed from: h */
    public final C28385so<View, Fragment> f69197h = new C28385so<>();

    /* renamed from: i */
    public final C28385so<View, android.app.Fragment> f69198i = new C28385so<>();

    /* renamed from: j */
    public final Bundle f69199j = new Bundle();

    /* renamed from: com.bumptech.glide.manager.b$a */
    /* loaded from: classes5.dex */
    public class C17141a implements InterfaceC17142b {
        @Override // com.bumptech.glide.manager.C17140b.InterfaceC17142b
        /* renamed from: a */
        public UI4 mo53025a(ComponentCallbacks2C17096a componentCallbacks2C17096a, InterfaceC51254wq2 interfaceC51254wq2, XI4 xi4, Context context) {
            return new UI4(componentCallbacks2C17096a, interfaceC51254wq2, xi4, context);
        }
    }

    /* renamed from: com.bumptech.glide.manager.b$b */
    /* loaded from: classes5.dex */
    public interface InterfaceC17142b {
        /* renamed from: a */
        UI4 mo53025a(ComponentCallbacks2C17096a componentCallbacks2C17096a, InterfaceC51254wq2 interfaceC51254wq2, XI4 xi4, Context context);
    }

    public C17140b(InterfaceC17142b interfaceC17142b, C17105d c17105d) {
        interfaceC17142b = interfaceC17142b == null ? f69190m : interfaceC17142b;
        this.f69195f = interfaceC17142b;
        this.f69196g = c17105d;
        this.f69194e = new Handler(Looper.getMainLooper(), this);
        this.f69201l = new C17137a(interfaceC17142b);
        this.f69200k = m53049b(c17105d);
    }

    @TargetApi(17)
    /* renamed from: a */
    public static void m53050a(Activity activity) {
        if (!activity.isDestroyed()) {
            return;
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    /* renamed from: b */
    public static InterfaceC35574Qy1 m53049b(C17105d c17105d) {
        if (C47959rH1.f106802h && C47959rH1.f106801g) {
            if (c17105d.m53124a(C17098b.C17103e.class)) {
                return new ComponentCallbacks2C38172ao1();
            }
            return new C38765bo1();
        }
        return new M51();
    }

    /* renamed from: c */
    public static Activity m53048c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m53048c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: f */
    public static void m53045f(Collection<Fragment> collection, Map<View, Fragment> map) {
        if (collection == null) {
            return;
        }
        for (Fragment fragment : collection) {
            if (fragment != null && fragment.getView() != null) {
                map.put(fragment.getView(), fragment);
                m53045f(fragment.getChildFragmentManager().m67283z0(), map);
            }
        }
    }

    /* renamed from: u */
    public static boolean m53030u(Context context) {
        Activity m53048c = m53048c(context);
        if (m53048c != null && m53048c.isFinishing()) {
            return false;
        }
        return true;
    }

    @TargetApi(26)
    @Deprecated
    /* renamed from: d */
    public final void m53047d(FragmentManager fragmentManager, C28385so<View, android.app.Fragment> c28385so) {
        List<android.app.Fragment> fragments;
        if (Build.VERSION.SDK_INT >= 26) {
            fragments = fragmentManager.getFragments();
            for (android.app.Fragment fragment : fragments) {
                if (fragment.getView() != null) {
                    c28385so.put(fragment.getView(), fragment);
                    m53047d(fragment.getChildFragmentManager(), c28385so);
                }
            }
            return;
        }
        m53046e(fragmentManager, c28385so);
    }

    @Deprecated
    /* renamed from: e */
    public final void m53046e(FragmentManager fragmentManager, C28385so<View, android.app.Fragment> c28385so) {
        android.app.Fragment fragment;
        int i = 0;
        while (true) {
            int i2 = i + 1;
            this.f69199j.putInt("key", i);
            try {
                fragment = fragmentManager.getFragment(this.f69199j, "key");
            } catch (Exception unused) {
                fragment = null;
            }
            if (fragment == null) {
                return;
            }
            if (fragment.getView() != null) {
                c28385so.put(fragment.getView(), fragment);
                m53047d(fragment.getChildFragmentManager(), c28385so);
            }
            i = i2;
        }
    }

    @Deprecated
    /* renamed from: g */
    public final android.app.Fragment m53044g(View view, Activity activity) {
        this.f69198i.clear();
        m53047d(activity.getFragmentManager(), this.f69198i);
        View findViewById = activity.findViewById(16908290);
        android.app.Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.f69198i.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f69198i.clear();
        return fragment;
    }

    /* renamed from: h */
    public final Fragment m53043h(View view, FragmentActivity fragmentActivity) {
        this.f69197h.clear();
        m53045f(fragmentActivity.getSupportFragmentManager().m67283z0(), this.f69197h);
        View findViewById = fragmentActivity.findViewById(16908290);
        Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = this.f69197h.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f69197h.clear();
        return fragment;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        boolean z;
        FragmentManager fragmentManager;
        FragmentManager fragmentManager2;
        boolean z2 = true;
        boolean z3 = false;
        if (message.arg1 == 1) {
            z = true;
        } else {
            z = false;
        }
        int i = message.what;
        Object obj = null;
        if (i != 1) {
            if (i != 2) {
                z2 = false;
                fragmentManager = null;
            } else {
                androidx.fragment.app.FragmentManager fragmentManager3 = (androidx.fragment.app.FragmentManager) message.obj;
                if (m53026y(fragmentManager3, z)) {
                    obj = this.f69193d.remove(fragmentManager3);
                    fragmentManager2 = fragmentManager3;
                    z3 = true;
                    fragmentManager = fragmentManager2;
                }
                fragmentManager = null;
                z3 = true;
                z2 = false;
            }
        } else {
            FragmentManager fragmentManager4 = (FragmentManager) message.obj;
            if (m53027x(fragmentManager4, z)) {
                obj = this.f69192c.remove(fragmentManager4);
                fragmentManager2 = fragmentManager4;
                z3 = true;
                fragmentManager = fragmentManager2;
            }
            fragmentManager = null;
            z3 = true;
            z2 = false;
        }
        if (Log.isLoggable("RMRetriever", 5) && z2 && obj == null) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + fragmentManager);
        }
        return z3;
    }

    @Deprecated
    /* renamed from: i */
    public final UI4 m53042i(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        VI4 m53033r = m53033r(fragmentManager, fragment);
        UI4 m79994e = m53033r.m79994e();
        if (m79994e == null) {
            m79994e = this.f69195f.mo53025a(ComponentCallbacks2C17096a.m53155c(context), m53033r.m79996c(), m53033r.m79993f(), context);
            if (z) {
                m79994e.onStart();
            }
            m53033r.m79988k(m79994e);
        }
        return m79994e;
    }

    @Deprecated
    /* renamed from: j */
    public UI4 m53041j(Activity activity) {
        if (C47029pi6.m18909q()) {
            return m53039l(activity.getApplicationContext());
        }
        if (activity instanceof FragmentActivity) {
            return m53036o((FragmentActivity) activity);
        }
        m53050a(activity);
        this.f69200k.mo62575a(activity);
        return m53042i(activity, activity.getFragmentManager(), null, m53030u(activity));
    }

    @TargetApi(17)
    @Deprecated
    /* renamed from: k */
    public UI4 m53040k(android.app.Fragment fragment) {
        if (fragment.getActivity() != null) {
            if (!C47029pi6.m18909q()) {
                if (fragment.getActivity() != null) {
                    this.f69200k.mo62575a(fragment.getActivity());
                }
                return m53042i(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
            }
            return m53039l(fragment.getActivity().getApplicationContext());
        }
        throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
    }

    /* renamed from: l */
    public UI4 m53039l(Context context) {
        if (context != null) {
            if (C47029pi6.m18908r() && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return m53036o((FragmentActivity) context);
                }
                if (context instanceof Activity) {
                    return m53041j((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return m53039l(contextWrapper.getBaseContext());
                    }
                }
            }
            return m53035p(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    /* renamed from: m */
    public UI4 m53038m(View view) {
        if (C47029pi6.m18909q()) {
            return m53039l(view.getContext().getApplicationContext());
        }
        C52865zZ3.m1111d(view);
        C52865zZ3.m1110e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity m53048c = m53048c(view.getContext());
        if (m53048c == null) {
            return m53039l(view.getContext().getApplicationContext());
        }
        if (m53048c instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) m53048c;
            Fragment m53043h = m53043h(view, fragmentActivity);
            if (m53043h != null) {
                return m53037n(m53043h);
            }
            return m53036o(fragmentActivity);
        }
        android.app.Fragment m53044g = m53044g(view, m53048c);
        if (m53044g == null) {
            return m53041j(m53048c);
        }
        return m53040k(m53044g);
    }

    /* renamed from: n */
    public UI4 m53037n(Fragment fragment) {
        C52865zZ3.m1110e(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (C47029pi6.m18909q()) {
            return m53039l(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f69200k.mo62575a(fragment.getActivity());
        }
        androidx.fragment.app.FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        if (m53028w()) {
            return this.f69201l.m53052b(context, ComponentCallbacks2C17096a.m53155c(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
        }
        return m53029v(context, childFragmentManager, fragment, fragment.isVisible());
    }

    /* renamed from: o */
    public UI4 m53036o(FragmentActivity fragmentActivity) {
        if (C47029pi6.m18909q()) {
            return m53039l(fragmentActivity.getApplicationContext());
        }
        m53050a(fragmentActivity);
        this.f69200k.mo62575a(fragmentActivity);
        androidx.fragment.app.FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        boolean m53030u = m53030u(fragmentActivity);
        if (m53028w()) {
            Context applicationContext = fragmentActivity.getApplicationContext();
            return this.f69201l.m53052b(applicationContext, ComponentCallbacks2C17096a.m53155c(applicationContext), fragmentActivity.getLifecycle(), fragmentActivity.getSupportFragmentManager(), m53030u);
        }
        return m53029v(fragmentActivity, supportFragmentManager, null, m53030u);
    }

    /* renamed from: p */
    public final UI4 m53035p(Context context) {
        if (this.f69191b == null) {
            synchronized (this) {
                if (this.f69191b == null) {
                    this.f69191b = this.f69195f.mo53025a(ComponentCallbacks2C17096a.m53155c(context.getApplicationContext()), new C22468gm(), new C36528Va1(), context.getApplicationContext());
                }
            }
        }
        return this.f69191b;
    }

    @Deprecated
    /* renamed from: q */
    public VI4 m53034q(Activity activity) {
        return m53033r(activity.getFragmentManager(), null);
    }

    /* renamed from: r */
    public final VI4 m53033r(FragmentManager fragmentManager, android.app.Fragment fragment) {
        VI4 vi4 = this.f69192c.get(fragmentManager);
        if (vi4 == null) {
            VI4 vi42 = (VI4) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
            if (vi42 == null) {
                vi42 = new VI4();
                vi42.m79989j(fragment);
                this.f69192c.put(fragmentManager, vi42);
                fragmentManager.beginTransaction().add(vi42, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.f69194e.obtainMessage(1, fragmentManager).sendToTarget();
            }
            return vi42;
        }
        return vi4;
    }

    /* renamed from: s */
    public C40380eV5 m53032s(androidx.fragment.app.FragmentManager fragmentManager) {
        return m53031t(fragmentManager, null);
    }

    /* renamed from: t */
    public final C40380eV5 m53031t(androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment) {
        C40380eV5 c40380eV5 = this.f69193d.get(fragmentManager);
        if (c40380eV5 == null) {
            C40380eV5 c40380eV52 = (C40380eV5) fragmentManager.m67322m0("com.bumptech.glide.manager");
            if (c40380eV52 == null) {
                c40380eV52 = new C40380eV5();
                c40380eV52.m42830P9(fragment);
                this.f69193d.put(fragmentManager, c40380eV52);
                fragmentManager.m67311q().m67119e(c40380eV52, "com.bumptech.glide.manager").mo67114j();
                this.f69194e.obtainMessage(2, fragmentManager).sendToTarget();
            }
            return c40380eV52;
        }
        return c40380eV5;
    }

    /* renamed from: v */
    public final UI4 m53029v(Context context, androidx.fragment.app.FragmentManager fragmentManager, Fragment fragment, boolean z) {
        C40380eV5 m53031t = m53031t(fragmentManager, fragment);
        UI4 m42837B9 = m53031t.m42837B9();
        if (m42837B9 == null) {
            m42837B9 = this.f69195f.mo53025a(ComponentCallbacks2C17096a.m53155c(context), m53031t.m42826t8(), m53031t.m42836D9(), context);
            if (z) {
                m42837B9.onStart();
            }
            m53031t.m42829S9(m42837B9);
        }
        return m42837B9;
    }

    /* renamed from: w */
    public final boolean m53028w() {
        return this.f69196g.m53124a(C17098b.C17102d.class);
    }

    /* renamed from: x */
    public final boolean m53027x(FragmentManager fragmentManager, boolean z) {
        VI4 vi4 = this.f69192c.get(fragmentManager);
        VI4 vi42 = (VI4) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (vi42 == vi4) {
            return true;
        }
        if (vi42 != null && vi42.m79994e() != null) {
            throw new IllegalStateException("We've added two fragments with requests! Old: " + vi42 + " New: " + vi4);
        } else if (!z && !fragmentManager.isDestroyed()) {
            FragmentTransaction add = fragmentManager.beginTransaction().add(vi4, "com.bumptech.glide.manager");
            if (vi42 != null) {
                add.remove(vi42);
            }
            add.commitAllowingStateLoss();
            this.f69194e.obtainMessage(1, 1, 0, fragmentManager).sendToTarget();
            if (Log.isLoggable("RMRetriever", 3)) {
                Log.d("RMRetriever", "We failed to add our Fragment the first time around, trying again...");
            }
            return false;
        } else {
            if (Log.isLoggable("RMRetriever", 5)) {
                if (fragmentManager.isDestroyed()) {
                    Log.w("RMRetriever", "Parent was destroyed before our Fragment could be added");
                } else {
                    Log.w("RMRetriever", "Tried adding Fragment twice and failed twice, giving up!");
                }
            }
            vi4.m79996c().m108063c();
            return true;
        }
    }

    /* renamed from: y */
    public final boolean m53026y(androidx.fragment.app.FragmentManager fragmentManager, boolean z) {
        C40380eV5 c40380eV5 = this.f69193d.get(fragmentManager);
        C40380eV5 c40380eV52 = (C40380eV5) fragmentManager.m67322m0("com.bumptech.glide.manager");
        if (c40380eV52 == c40380eV5) {
            return true;
        }
        if (c40380eV52 != null && c40380eV52.m42837B9() != null) {
            throw new IllegalStateException("We've added two fragments with requests! Old: " + c40380eV52 + " New: " + c40380eV5);
        } else if (!z && !fragmentManager.m67386M0()) {
            AbstractC11685m m67119e = fragmentManager.m67311q().m67119e(c40380eV5, "com.bumptech.glide.manager");
            if (c40380eV52 != null) {
                m67119e.mo67105s(c40380eV52);
            }
            m67119e.mo67112l();
            this.f69194e.obtainMessage(2, 1, 0, fragmentManager).sendToTarget();
            if (Log.isLoggable("RMRetriever", 3)) {
                Log.d("RMRetriever", "We failed to add our Fragment the first time around, trying again...");
            }
            return false;
        } else {
            if (fragmentManager.m67386M0()) {
                if (Log.isLoggable("RMRetriever", 5)) {
                    Log.w("RMRetriever", "Parent was destroyed before our Fragment could be added, all requests for the destroyed parent are cancelled");
                }
            } else if (Log.isLoggable("RMRetriever", 6)) {
                Log.e("RMRetriever", "ERROR: Tried adding Fragment twice and failed twice, giving up and cancelling all associated requests! This probably means you're starting loads in a unit test with an Activity that you haven't created and never create. If you're using Robolectric, create the Activity as part of your test setup");
            }
            c40380eV5.m42826t8().m108063c();
            return true;
        }
    }
}

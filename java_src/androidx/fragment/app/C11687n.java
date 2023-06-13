package androidx.fragment.app;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.C11729j;
import androidx.lifecycle.C11750q;
import androidx.lifecycle.C11755r;
import androidx.lifecycle.C11759u;
import androidx.lifecycle.InterfaceC11718e;
import androidx.savedstate.C11966a;
/* renamed from: androidx.fragment.app.n */
/* loaded from: classes.dex */
public class C11687n implements InterfaceC11718e, InterfaceC35200Pi5, InterfaceC37154Xr6 {

    /* renamed from: b */
    public final Fragment f54776b;

    /* renamed from: c */
    public final C36920Wr6 f54777c;

    /* renamed from: d */
    public C11759u.InterfaceC11763b f54778d;

    /* renamed from: e */
    public C11729j f54779e = null;

    /* renamed from: f */
    public C34966Oi5 f54780f = null;

    public C11687n(Fragment fragment, C36920Wr6 c36920Wr6) {
        this.f54776b = fragment;
        this.f54777c = c36920Wr6;
    }

    /* renamed from: a */
    public void m67097a(AbstractC11719f.EnumC11720a enumC11720a) {
        this.f54779e.m67001i(enumC11720a);
    }

    /* renamed from: b */
    public void m67096b() {
        if (this.f54779e == null) {
            this.f54779e = new C11729j(this);
            C34966Oi5 m91666a = C34966Oi5.m91666a(this);
            this.f54780f = m91666a;
            m91666a.m91664c();
        }
    }

    /* renamed from: c */
    public boolean m67095c() {
        return this.f54779e != null;
    }

    /* renamed from: d */
    public void m67094d(Bundle bundle) {
        this.f54780f.m91663d(bundle);
    }

    /* renamed from: e */
    public void m67093e(Bundle bundle) {
        this.f54780f.m91662e(bundle);
    }

    /* renamed from: f */
    public void m67092f(AbstractC11719f.EnumC11724b enumC11724b) {
        this.f54779e.m66995o(enumC11724b);
    }

    @Override // androidx.lifecycle.InterfaceC11718e
    public FE0 getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = this.f54776b.requireContext().getApplicationContext();
        while (true) {
            if (applicationContext instanceof ContextWrapper) {
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            } else {
                application = null;
                break;
            }
        }
        C47511qX2 c47511qX2 = new C47511qX2();
        if (application != null) {
            c47511qX2.m17470c(C11759u.C11760a.f54991h, application);
        }
        c47511qX2.m17470c(C11750q.f54966a, this.f54776b);
        c47511qX2.m17470c(C11750q.f54967b, this);
        if (this.f54776b.getArguments() != null) {
            c47511qX2.m17470c(C11750q.f54968c, this.f54776b.getArguments());
        }
        return c47511qX2;
    }

    @Override // androidx.lifecycle.InterfaceC11718e
    public C11759u.InterfaceC11763b getDefaultViewModelProviderFactory() {
        Application application;
        C11759u.InterfaceC11763b defaultViewModelProviderFactory = this.f54776b.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.f54776b.mDefaultFactory)) {
            this.f54778d = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f54778d == null) {
            Context applicationContext = this.f54776b.requireContext().getApplicationContext();
            while (true) {
                if (applicationContext instanceof ContextWrapper) {
                    if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    }
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                } else {
                    application = null;
                    break;
                }
            }
            Fragment fragment = this.f54776b;
            this.f54778d = new C11755r(application, fragment, fragment.getArguments());
        }
        return this.f54778d;
    }

    @Override // p000.LifecycleOwner
    public AbstractC11719f getLifecycle() {
        m67096b();
        return this.f54779e;
    }

    @Override // p000.InterfaceC35200Pi5
    public C11966a getSavedStateRegistry() {
        m67096b();
        return this.f54780f.m91665b();
    }

    @Override // p000.InterfaceC37154Xr6
    public C36920Wr6 getViewModelStore() {
        m67096b();
        return this.f54777c;
    }
}

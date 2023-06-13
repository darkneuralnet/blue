package com.bumptech.glide.manager;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC11719f;
import com.bumptech.glide.ComponentCallbacks2C17096a;
import com.bumptech.glide.manager.C17140b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* renamed from: com.bumptech.glide.manager.a */
/* loaded from: classes5.dex */
public final class C17137a {

    /* renamed from: a */
    public final Map<AbstractC11719f, UI4> f69184a = new HashMap();

    /* renamed from: b */
    public final C17140b.InterfaceC17142b f69185b;

    /* renamed from: com.bumptech.glide.manager.a$a */
    /* loaded from: classes5.dex */
    public class C17138a implements InterfaceC32227Cq2 {

        /* renamed from: b */
        public final /* synthetic */ AbstractC11719f f69186b;

        public C17138a(AbstractC11719f abstractC11719f) {
            this.f69186b = abstractC11719f;
        }

        @Override // p000.InterfaceC32227Cq2
        public void onDestroy() {
            C17137a.this.f69184a.remove(this.f69186b);
        }

        @Override // p000.InterfaceC32227Cq2
        public void onStart() {
        }

        @Override // p000.InterfaceC32227Cq2
        public void onStop() {
        }
    }

    /* renamed from: com.bumptech.glide.manager.a$b */
    /* loaded from: classes5.dex */
    public final class C17139b implements XI4 {

        /* renamed from: a */
        public final FragmentManager f69188a;

        public C17139b(FragmentManager fragmentManager) {
            this.f69188a = fragmentManager;
        }

        @Override // p000.XI4
        /* renamed from: a */
        public Set<UI4> mo42825a() {
            HashSet hashSet = new HashSet();
            m53051b(this.f69188a, hashSet);
            return hashSet;
        }

        /* renamed from: b */
        public final void m53051b(FragmentManager fragmentManager, Set<UI4> set) {
            List<Fragment> m67283z0 = fragmentManager.m67283z0();
            int size = m67283z0.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = m67283z0.get(i);
                m53051b(fragment.getChildFragmentManager(), set);
                UI4 m53053a = C17137a.this.m53053a(fragment.getLifecycle());
                if (m53053a != null) {
                    set.add(m53053a);
                }
            }
        }
    }

    public C17137a(C17140b.InterfaceC17142b interfaceC17142b) {
        this.f69185b = interfaceC17142b;
    }

    /* renamed from: a */
    public UI4 m53053a(AbstractC11719f abstractC11719f) {
        C47029pi6.m18924b();
        return this.f69184a.get(abstractC11719f);
    }

    /* renamed from: b */
    public UI4 m53052b(Context context, ComponentCallbacks2C17096a componentCallbacks2C17096a, AbstractC11719f abstractC11719f, FragmentManager fragmentManager, boolean z) {
        C47029pi6.m18924b();
        UI4 m53053a = m53053a(abstractC11719f);
        if (m53053a == null) {
            LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(abstractC11719f);
            UI4 mo53025a = this.f69185b.mo53025a(componentCallbacks2C17096a, lifecycleLifecycle, new C17139b(fragmentManager), context);
            this.f69184a.put(abstractC11719f, mo53025a);
            lifecycleLifecycle.mo6272a(new C17138a(abstractC11719f));
            if (z) {
                mo53025a.onStart();
            }
            return mo53025a;
        }
        return m53053a;
    }
}

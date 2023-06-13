package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.AbstractC11719f;
import androidx.lifecycle.InterfaceC11728i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: a */
    public Random f51447a = new Random();

    /* renamed from: b */
    public final Map<Integer, String> f51448b = new HashMap();

    /* renamed from: c */
    public final Map<String, Integer> f51449c = new HashMap();

    /* renamed from: d */
    public final Map<String, C10948d> f51450d = new HashMap();

    /* renamed from: e */
    public ArrayList<String> f51451e = new ArrayList<>();

    /* renamed from: f */
    public final transient Map<String, C10947c<?>> f51452f = new HashMap();

    /* renamed from: g */
    public final Map<String, Object> f51453g = new HashMap();

    /* renamed from: h */
    public final Bundle f51454h = new Bundle();

    /* renamed from: androidx.activity.result.ActivityResultRegistry$a */
    /* loaded from: classes.dex */
    public class C10945a extends AbstractC0407B5<I> {

        /* renamed from: a */
        public final /* synthetic */ String f51459a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC29414v5 f51460b;

        public C10945a(String str, AbstractC29414v5 abstractC29414v5) {
            this.f51459a = str;
            this.f51460b = abstractC29414v5;
        }

        @Override // p000.AbstractC0407B5
        /* renamed from: b */
        public void mo67436b(I i, C1727E4 c1727e4) {
            Integer num = ActivityResultRegistry.this.f51449c.get(this.f51459a);
            if (num != null) {
                ActivityResultRegistry.this.f51451e.add(this.f51459a);
                try {
                    ActivityResultRegistry.this.mo70476f(num.intValue(), this.f51460b, i, c1727e4);
                    return;
                } catch (Exception e) {
                    ActivityResultRegistry.this.f51451e.remove(this.f51459a);
                    throw e;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f51460b + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // p000.AbstractC0407B5
        /* renamed from: c */
        public void mo67435c() {
            ActivityResultRegistry.this.m70470l(this.f51459a);
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$b */
    /* loaded from: classes.dex */
    public class C10946b extends AbstractC0407B5<I> {

        /* renamed from: a */
        public final /* synthetic */ String f51462a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC29414v5 f51463b;

        public C10946b(String str, AbstractC29414v5 abstractC29414v5) {
            this.f51462a = str;
            this.f51463b = abstractC29414v5;
        }

        @Override // p000.AbstractC0407B5
        /* renamed from: b */
        public void mo67436b(I i, C1727E4 c1727e4) {
            Integer num = ActivityResultRegistry.this.f51449c.get(this.f51462a);
            if (num != null) {
                ActivityResultRegistry.this.f51451e.add(this.f51462a);
                try {
                    ActivityResultRegistry.this.mo70476f(num.intValue(), this.f51463b, i, c1727e4);
                    return;
                } catch (Exception e) {
                    ActivityResultRegistry.this.f51451e.remove(this.f51462a);
                    throw e;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f51463b + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // p000.AbstractC0407B5
        /* renamed from: c */
        public void mo67435c() {
            ActivityResultRegistry.this.m70470l(this.f51462a);
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$c */
    /* loaded from: classes.dex */
    public static class C10947c<O> {

        /* renamed from: a */
        public final InterfaceC28515t5<O> f51465a;

        /* renamed from: b */
        public final AbstractC29414v5<?, O> f51466b;

        public C10947c(InterfaceC28515t5<O> interfaceC28515t5, AbstractC29414v5<?, O> abstractC29414v5) {
            this.f51465a = interfaceC28515t5;
            this.f51466b = abstractC29414v5;
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$d */
    /* loaded from: classes.dex */
    public static class C10948d {

        /* renamed from: a */
        public final AbstractC11719f f51467a;

        /* renamed from: b */
        public final ArrayList<InterfaceC11728i> f51468b = new ArrayList<>();

        public C10948d(AbstractC11719f abstractC11719f) {
            this.f51467a = abstractC11719f;
        }

        /* renamed from: a */
        public void m70469a(InterfaceC11728i interfaceC11728i) {
            this.f51467a.mo67008a(interfaceC11728i);
            this.f51468b.add(interfaceC11728i);
        }

        /* renamed from: b */
        public void m70468b() {
            Iterator<InterfaceC11728i> it = this.f51468b.iterator();
            while (it.hasNext()) {
                this.f51467a.mo67006d(it.next());
            }
            this.f51468b.clear();
        }
    }

    /* renamed from: a */
    public final void m70481a(int i, String str) {
        this.f51448b.put(Integer.valueOf(i), str);
        this.f51449c.put(str, Integer.valueOf(i));
    }

    /* renamed from: b */
    public final boolean m70480b(int i, int i2, Intent intent) {
        String str = this.f51448b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        m70478d(str, i2, intent, this.f51452f.get(str));
        return true;
    }

    /* renamed from: c */
    public final <O> boolean m70479c(int i, @SuppressLint({"UnknownNullness"}) O o) {
        InterfaceC28515t5<?> interfaceC28515t5;
        String str = this.f51448b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C10947c<?> c10947c = this.f51452f.get(str);
        if (c10947c != null && (interfaceC28515t5 = c10947c.f51465a) != null) {
            if (this.f51451e.remove(str)) {
                interfaceC28515t5.mo1514a(o);
                return true;
            }
            return true;
        }
        this.f51454h.remove(str);
        this.f51453g.put(str, o);
        return true;
    }

    /* renamed from: d */
    public final <O> void m70478d(String str, int i, Intent intent, C10947c<O> c10947c) {
        if (c10947c != null && c10947c.f51465a != null && this.f51451e.contains(str)) {
            c10947c.f51465a.mo1514a(c10947c.f51466b.parseResult(i, intent));
            this.f51451e.remove(str);
            return;
        }
        this.f51453g.remove(str);
        this.f51454h.putParcelable(str, new ActivityResult(i, intent));
    }

    /* renamed from: e */
    public final int m70477e() {
        int nextInt = this.f51447a.nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            if (this.f51448b.containsKey(Integer.valueOf(i))) {
                nextInt = this.f51447a.nextInt(2147418112);
            } else {
                return i;
            }
        }
    }

    /* renamed from: f */
    public abstract <I, O> void mo70476f(int i, AbstractC29414v5<I, O> abstractC29414v5, @SuppressLint({"UnknownNullness"}) I i2, C1727E4 c1727e4);

    /* renamed from: g */
    public final void m70475g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList != null && integerArrayList != null) {
            this.f51451e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            this.f51447a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
            this.f51454h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
            for (int i = 0; i < stringArrayList.size(); i++) {
                String str = stringArrayList.get(i);
                if (this.f51449c.containsKey(str)) {
                    Integer remove = this.f51449c.remove(str);
                    if (!this.f51454h.containsKey(str)) {
                        this.f51448b.remove(remove);
                    }
                }
                m70481a(integerArrayList.get(i).intValue(), stringArrayList.get(i));
            }
        }
    }

    /* renamed from: h */
    public final void m70474h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f51449c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f51449c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f51451e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f51454h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f51447a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: i */
    public final <I, O> AbstractC0407B5<I> m70473i(String str, AbstractC29414v5<I, O> abstractC29414v5, InterfaceC28515t5<O> interfaceC28515t5) {
        m70471k(str);
        this.f51452f.put(str, new C10947c<>(interfaceC28515t5, abstractC29414v5));
        if (this.f51453g.containsKey(str)) {
            Object obj = this.f51453g.get(str);
            this.f51453g.remove(str);
            interfaceC28515t5.mo1514a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f51454h.getParcelable(str);
        if (activityResult != null) {
            this.f51454h.remove(str);
            interfaceC28515t5.mo1514a(abstractC29414v5.parseResult(activityResult.m70485b(), activityResult.m70486a()));
        }
        return new C10946b(str, abstractC29414v5);
    }

    /* renamed from: j */
    public final <I, O> AbstractC0407B5<I> m70472j(final String str, LifecycleOwner lifecycleOwner, final AbstractC29414v5<I, O> abstractC29414v5, final InterfaceC28515t5<O> interfaceC28515t5) {
        AbstractC11719f lifecycle = lifecycleOwner.getLifecycle();
        if (!lifecycle.mo67007b().m67013b(AbstractC11719f.EnumC11724b.STARTED)) {
            m70471k(str);
            C10948d c10948d = this.f51450d.get(str);
            if (c10948d == null) {
                c10948d = new C10948d(lifecycle);
            }
            c10948d.m70469a(new InterfaceC11728i() { // from class: androidx.activity.result.ActivityResultRegistry.1
                @Override // androidx.lifecycle.InterfaceC11728i
                public void onStateChanged(LifecycleOwner lifecycleOwner2, AbstractC11719f.EnumC11720a enumC11720a) {
                    if (AbstractC11719f.EnumC11720a.ON_START.equals(enumC11720a)) {
                        ActivityResultRegistry.this.f51452f.put(str, new C10947c<>(interfaceC28515t5, abstractC29414v5));
                        if (ActivityResultRegistry.this.f51453g.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.f51453g.get(str);
                            ActivityResultRegistry.this.f51453g.remove(str);
                            interfaceC28515t5.mo1514a(obj);
                        }
                        ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.f51454h.getParcelable(str);
                        if (activityResult != null) {
                            ActivityResultRegistry.this.f51454h.remove(str);
                            interfaceC28515t5.mo1514a(abstractC29414v5.parseResult(activityResult.m70485b(), activityResult.m70486a()));
                        }
                    } else if (AbstractC11719f.EnumC11720a.ON_STOP.equals(enumC11720a)) {
                        ActivityResultRegistry.this.f51452f.remove(str);
                    } else if (AbstractC11719f.EnumC11720a.ON_DESTROY.equals(enumC11720a)) {
                        ActivityResultRegistry.this.m70470l(str);
                    }
                }
            });
            this.f51450d.put(str, c10948d);
            return new C10945a(str, abstractC29414v5);
        }
        throw new IllegalStateException("LifecycleOwner " + lifecycleOwner + " is attempting to register while current state is " + lifecycle.mo67007b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    /* renamed from: k */
    public final void m70471k(String str) {
        if (this.f51449c.get(str) != null) {
            return;
        }
        m70481a(m70477e(), str);
    }

    /* renamed from: l */
    public final void m70470l(String str) {
        Integer remove;
        if (!this.f51451e.contains(str) && (remove = this.f51449c.remove(str)) != null) {
            this.f51448b.remove(remove);
        }
        this.f51452f.remove(str);
        if (this.f51453g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f51453g.get(str));
            this.f51453g.remove(str);
        }
        if (this.f51454h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f51454h.getParcelable(str));
            this.f51454h.remove(str);
        }
        C10948d c10948d = this.f51450d.get(str);
        if (c10948d != null) {
            c10948d.m70468b();
            this.f51450d.remove(str);
        }
    }
}

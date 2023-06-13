package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p000.C39858dd0;
/* renamed from: androidx.fragment.app.o */
/* loaded from: classes.dex */
public abstract class AbstractC11688o {

    /* renamed from: a */
    public final ViewGroup f54781a;

    /* renamed from: b */
    public final ArrayList<C11693e> f54782b = new ArrayList<>();

    /* renamed from: c */
    public final ArrayList<C11693e> f54783c = new ArrayList<>();

    /* renamed from: d */
    public boolean f54784d = false;

    /* renamed from: e */
    public boolean f54785e = false;

    /* renamed from: androidx.fragment.app.o$a */
    /* loaded from: classes.dex */
    public class RunnableC11689a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C11692d f54786b;

        public RunnableC11689a(C11692d c11692d) {
            this.f54786b = c11692d;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AbstractC11688o.this.f54782b.contains(this.f54786b)) {
                this.f54786b.m67069e().m67061a(this.f54786b.m67068f().mView);
            }
        }
    }

    /* renamed from: androidx.fragment.app.o$b */
    /* loaded from: classes.dex */
    public class RunnableC11690b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C11692d f54788b;

        public RunnableC11690b(C11692d c11692d) {
            this.f54788b = c11692d;
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC11688o.this.f54782b.remove(this.f54788b);
            AbstractC11688o.this.f54783c.remove(this.f54788b);
        }
    }

    /* renamed from: androidx.fragment.app.o$c */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C11691c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f54790a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f54791b;

        static {
            int[] iArr = new int[C11693e.EnumC11695b.values().length];
            f54791b = iArr;
            try {
                iArr[C11693e.EnumC11695b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54791b[C11693e.EnumC11695b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54791b[C11693e.EnumC11695b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[C11693e.EnumC11696c.values().length];
            f54790a = iArr2;
            try {
                iArr2[C11693e.EnumC11696c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f54790a[C11693e.EnumC11696c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f54790a[C11693e.EnumC11696c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f54790a[C11693e.EnumC11696c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* renamed from: androidx.fragment.app.o$d */
    /* loaded from: classes.dex */
    public static class C11692d extends C11693e {

        /* renamed from: h */
        public final C11680j f54792h;

        public C11692d(C11693e.EnumC11696c enumC11696c, C11693e.EnumC11695b enumC11695b, C11680j c11680j, C39858dd0 c39858dd0) {
            super(enumC11696c, enumC11695b, c11680j.m67165k(), c39858dd0);
            this.f54792h = c11680j;
        }

        @Override // androidx.fragment.app.AbstractC11688o.C11693e
        /* renamed from: c */
        public void mo67071c() {
            super.mo67071c();
            this.f54792h.m67163m();
        }

        @Override // androidx.fragment.app.AbstractC11688o.C11693e
        /* renamed from: l */
        public void mo67062l() {
            if (m67067g() == C11693e.EnumC11695b.ADDING) {
                Fragment m67165k = this.f54792h.m67165k();
                View findFocus = m67165k.mView.findFocus();
                if (findFocus != null) {
                    m67165k.setFocusedView(findFocus);
                    if (FragmentManager.m67384N0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + m67165k);
                    }
                }
                View requireView = m67068f().requireView();
                if (requireView.getParent() == null) {
                    this.f54792h.m67174b();
                    requireView.setAlpha(0.0f);
                }
                if (requireView.getAlpha() == 0.0f && requireView.getVisibility() == 0) {
                    requireView.setVisibility(4);
                }
                requireView.setAlpha(m67165k.getPostOnViewCreatedAlpha());
            } else if (m67067g() == C11693e.EnumC11695b.REMOVING) {
                Fragment m67165k2 = this.f54792h.m67165k();
                View requireView2 = m67165k2.requireView();
                if (FragmentManager.m67384N0(2)) {
                    Log.v("FragmentManager", "Clearing focus " + requireView2.findFocus() + " on view " + requireView2 + " for Fragment " + m67165k2);
                }
                requireView2.clearFocus();
            }
        }
    }

    /* renamed from: androidx.fragment.app.o$e */
    /* loaded from: classes.dex */
    public static class C11693e {

        /* renamed from: a */
        public EnumC11696c f54793a;

        /* renamed from: b */
        public EnumC11695b f54794b;

        /* renamed from: c */
        public final Fragment f54795c;

        /* renamed from: d */
        public final List<Runnable> f54796d = new ArrayList();

        /* renamed from: e */
        public final HashSet<C39858dd0> f54797e = new HashSet<>();

        /* renamed from: f */
        public boolean f54798f = false;

        /* renamed from: g */
        public boolean f54799g = false;

        /* renamed from: androidx.fragment.app.o$e$a */
        /* loaded from: classes.dex */
        public class C11694a implements C39858dd0.InterfaceC19813b {
            public C11694a() {
            }

            @Override // p000.C39858dd0.InterfaceC19813b
            /* renamed from: a */
            public void mo44007a() {
                C11693e.this.m67072b();
            }
        }

        /* renamed from: androidx.fragment.app.o$e$b */
        /* loaded from: classes.dex */
        public enum EnumC11695b {
            NONE,
            ADDING,
            REMOVING
        }

        /* renamed from: androidx.fragment.app.o$e$c */
        /* loaded from: classes.dex */
        public enum EnumC11696c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            /* renamed from: b */
            public static EnumC11696c m67060b(int i) {
                if (i != 0) {
                    if (i != 4) {
                        if (i == 8) {
                            return GONE;
                        }
                        throw new IllegalArgumentException("Unknown visibility " + i);
                    }
                    return INVISIBLE;
                }
                return VISIBLE;
            }

            /* renamed from: c */
            public static EnumC11696c m67059c(View view) {
                if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
                    return INVISIBLE;
                }
                return m67060b(view.getVisibility());
            }

            /* renamed from: a */
            public void m67061a(View view) {
                int i = C11691c.f54790a[ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i == 4) {
                                if (FragmentManager.m67384N0(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                                }
                                view.setVisibility(4);
                                return;
                            }
                            return;
                        }
                        if (FragmentManager.m67384N0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                        }
                        view.setVisibility(8);
                        return;
                    }
                    if (FragmentManager.m67384N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    view.setVisibility(0);
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    if (FragmentManager.m67384N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                    }
                    viewGroup.removeView(view);
                }
            }
        }

        public C11693e(EnumC11696c enumC11696c, EnumC11695b enumC11695b, Fragment fragment, C39858dd0 c39858dd0) {
            this.f54793a = enumC11696c;
            this.f54794b = enumC11695b;
            this.f54795c = fragment;
            c39858dd0.m44011b(new C11694a());
        }

        /* renamed from: a */
        public final void m67073a(Runnable runnable) {
            this.f54796d.add(runnable);
        }

        /* renamed from: b */
        public final void m67072b() {
            if (m67066h()) {
                return;
            }
            this.f54798f = true;
            if (this.f54797e.isEmpty()) {
                mo67071c();
                return;
            }
            Iterator it = new ArrayList(this.f54797e).iterator();
            while (it.hasNext()) {
                ((C39858dd0) it.next()).m44012a();
            }
        }

        /* renamed from: c */
        public void mo67071c() {
            if (this.f54799g) {
                return;
            }
            if (FragmentManager.m67384N0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f54799g = true;
            for (Runnable runnable : this.f54796d) {
                runnable.run();
            }
        }

        /* renamed from: d */
        public final void m67070d(C39858dd0 c39858dd0) {
            if (this.f54797e.remove(c39858dd0) && this.f54797e.isEmpty()) {
                mo67071c();
            }
        }

        /* renamed from: e */
        public EnumC11696c m67069e() {
            return this.f54793a;
        }

        /* renamed from: f */
        public final Fragment m67068f() {
            return this.f54795c;
        }

        /* renamed from: g */
        public EnumC11695b m67067g() {
            return this.f54794b;
        }

        /* renamed from: h */
        public final boolean m67066h() {
            return this.f54798f;
        }

        /* renamed from: i */
        public final boolean m67065i() {
            return this.f54799g;
        }

        /* renamed from: j */
        public final void m67064j(C39858dd0 c39858dd0) {
            mo67062l();
            this.f54797e.add(c39858dd0);
        }

        /* renamed from: k */
        public final void m67063k(EnumC11696c enumC11696c, EnumC11695b enumC11695b) {
            int i = C11691c.f54791b[enumC11695b.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && this.f54793a != EnumC11696c.REMOVED) {
                        if (FragmentManager.m67384N0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f54795c + " mFinalState = " + this.f54793a + " -> " + enumC11696c + ". ");
                        }
                        this.f54793a = enumC11696c;
                        return;
                    }
                    return;
                }
                if (FragmentManager.m67384N0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f54795c + " mFinalState = " + this.f54793a + " -> REMOVED. mLifecycleImpact  = " + this.f54794b + " to REMOVING.");
                }
                this.f54793a = EnumC11696c.REMOVED;
                this.f54794b = EnumC11695b.REMOVING;
            } else if (this.f54793a == EnumC11696c.REMOVED) {
                if (FragmentManager.m67384N0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f54795c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f54794b + " to ADDING.");
                }
                this.f54793a = EnumC11696c.VISIBLE;
                this.f54794b = EnumC11695b.ADDING;
            }
        }

        /* renamed from: l */
        public void mo67062l() {
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f54793a + "} {mLifecycleImpact = " + this.f54794b + "} {mFragment = " + this.f54795c + "}";
        }
    }

    public AbstractC11688o(ViewGroup viewGroup) {
        this.f54781a = viewGroup;
    }

    /* renamed from: n */
    public static AbstractC11688o m67078n(ViewGroup viewGroup, ON5 on5) {
        int i = C41690gi4.special_effects_controller_view_tag;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof AbstractC11688o) {
            return (AbstractC11688o) tag;
        }
        AbstractC11688o mo67278a = on5.mo67278a(viewGroup);
        viewGroup.setTag(i, mo67278a);
        return mo67278a;
    }

    /* renamed from: o */
    public static AbstractC11688o m67077o(ViewGroup viewGroup, FragmentManager fragmentManager) {
        return m67078n(viewGroup, fragmentManager.m67405F0());
    }

    /* renamed from: a */
    public final void m67091a(C11693e.EnumC11696c enumC11696c, C11693e.EnumC11695b enumC11695b, C11680j c11680j) {
        synchronized (this.f54782b) {
            C39858dd0 c39858dd0 = new C39858dd0();
            C11693e m67084h = m67084h(c11680j.m67165k());
            if (m67084h != null) {
                m67084h.m67063k(enumC11696c, enumC11695b);
                return;
            }
            C11692d c11692d = new C11692d(enumC11696c, enumC11695b, c11680j, c39858dd0);
            this.f54782b.add(c11692d);
            c11692d.m67073a(new RunnableC11689a(c11692d));
            c11692d.m67073a(new RunnableC11690b(c11692d));
        }
    }

    /* renamed from: b */
    public void m67090b(C11693e.EnumC11696c enumC11696c, C11680j c11680j) {
        if (FragmentManager.m67384N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + c11680j.m67165k());
        }
        m67091a(enumC11696c, C11693e.EnumC11695b.ADDING, c11680j);
    }

    /* renamed from: c */
    public void m67089c(C11680j c11680j) {
        if (FragmentManager.m67384N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + c11680j.m67165k());
        }
        m67091a(C11693e.EnumC11696c.GONE, C11693e.EnumC11695b.NONE, c11680j);
    }

    /* renamed from: d */
    public void m67088d(C11680j c11680j) {
        if (FragmentManager.m67384N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + c11680j.m67165k());
        }
        m67091a(C11693e.EnumC11696c.REMOVED, C11693e.EnumC11695b.REMOVING, c11680j);
    }

    /* renamed from: e */
    public void m67087e(C11680j c11680j) {
        if (FragmentManager.m67384N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + c11680j.m67165k());
        }
        m67091a(C11693e.EnumC11696c.VISIBLE, C11693e.EnumC11695b.NONE, c11680j);
    }

    /* renamed from: f */
    public abstract void mo67086f(List<C11693e> list, boolean z);

    /* renamed from: g */
    public void m67085g() {
        if (this.f54785e) {
            return;
        }
        if (!C38790bq6.m62506Y(this.f54781a)) {
            m67082j();
            this.f54784d = false;
            return;
        }
        synchronized (this.f54782b) {
            if (!this.f54782b.isEmpty()) {
                ArrayList arrayList = new ArrayList(this.f54783c);
                this.f54783c.clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C11693e c11693e = (C11693e) it.next();
                    if (FragmentManager.m67384N0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + c11693e);
                    }
                    c11693e.m67072b();
                    if (!c11693e.m67065i()) {
                        this.f54783c.add(c11693e);
                    }
                }
                m67075q();
                ArrayList arrayList2 = new ArrayList(this.f54782b);
                this.f54782b.clear();
                this.f54783c.addAll(arrayList2);
                if (FragmentManager.m67384N0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    ((C11693e) it2.next()).mo67062l();
                }
                mo67086f(arrayList2, this.f54784d);
                this.f54784d = false;
                if (FragmentManager.m67384N0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                }
            }
        }
    }

    /* renamed from: h */
    public final C11693e m67084h(Fragment fragment) {
        Iterator<C11693e> it = this.f54782b.iterator();
        while (it.hasNext()) {
            C11693e next = it.next();
            if (next.m67068f().equals(fragment) && !next.m67066h()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: i */
    public final C11693e m67083i(Fragment fragment) {
        Iterator<C11693e> it = this.f54783c.iterator();
        while (it.hasNext()) {
            C11693e next = it.next();
            if (next.m67068f().equals(fragment) && !next.m67066h()) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: j */
    public void m67082j() {
        String str;
        String str2;
        if (FragmentManager.m67384N0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean m62506Y = C38790bq6.m62506Y(this.f54781a);
        synchronized (this.f54782b) {
            m67075q();
            Iterator<C11693e> it = this.f54782b.iterator();
            while (it.hasNext()) {
                it.next().mo67062l();
            }
            Iterator it2 = new ArrayList(this.f54783c).iterator();
            while (it2.hasNext()) {
                C11693e c11693e = (C11693e) it2.next();
                if (FragmentManager.m67384N0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    if (m62506Y) {
                        str2 = "";
                    } else {
                        str2 = "Container " + this.f54781a + " is not attached to window. ";
                    }
                    sb.append(str2);
                    sb.append("Cancelling running operation ");
                    sb.append(c11693e);
                    Log.v("FragmentManager", sb.toString());
                }
                c11693e.m67072b();
            }
            Iterator it3 = new ArrayList(this.f54782b).iterator();
            while (it3.hasNext()) {
                C11693e c11693e2 = (C11693e) it3.next();
                if (FragmentManager.m67384N0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    if (m62506Y) {
                        str = "";
                    } else {
                        str = "Container " + this.f54781a + " is not attached to window. ";
                    }
                    sb2.append(str);
                    sb2.append("Cancelling pending operation ");
                    sb2.append(c11693e2);
                    Log.v("FragmentManager", sb2.toString());
                }
                c11693e2.m67072b();
            }
        }
    }

    /* renamed from: k */
    public void m67081k() {
        if (this.f54785e) {
            if (FragmentManager.m67384N0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
            }
            this.f54785e = false;
            m67085g();
        }
    }

    /* renamed from: l */
    public C11693e.EnumC11695b m67080l(C11680j c11680j) {
        C11693e.EnumC11695b enumC11695b;
        C11693e m67084h = m67084h(c11680j.m67165k());
        if (m67084h != null) {
            enumC11695b = m67084h.m67067g();
        } else {
            enumC11695b = null;
        }
        C11693e m67083i = m67083i(c11680j.m67165k());
        if (m67083i != null && (enumC11695b == null || enumC11695b == C11693e.EnumC11695b.NONE)) {
            return m67083i.m67067g();
        }
        return enumC11695b;
    }

    /* renamed from: m */
    public ViewGroup m67079m() {
        return this.f54781a;
    }

    /* renamed from: p */
    public void m67076p() {
        synchronized (this.f54782b) {
            m67075q();
            this.f54785e = false;
            int size = this.f54782b.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                C11693e c11693e = this.f54782b.get(size);
                C11693e.EnumC11696c m67059c = C11693e.EnumC11696c.m67059c(c11693e.m67068f().mView);
                C11693e.EnumC11696c m67069e = c11693e.m67069e();
                C11693e.EnumC11696c enumC11696c = C11693e.EnumC11696c.VISIBLE;
                if (m67069e == enumC11696c && m67059c != enumC11696c) {
                    this.f54785e = c11693e.m67068f().isPostponed();
                    break;
                }
                size--;
            }
        }
    }

    /* renamed from: q */
    public final void m67075q() {
        Iterator<C11693e> it = this.f54782b.iterator();
        while (it.hasNext()) {
            C11693e next = it.next();
            if (next.m67067g() == C11693e.EnumC11695b.ADDING) {
                next.m67063k(C11693e.EnumC11696c.m67060b(next.m67068f().requireView().getVisibility()), C11693e.EnumC11695b.NONE);
            }
        }
    }

    /* renamed from: r */
    public void m67074r(boolean z) {
        this.f54784d = z;
    }
}

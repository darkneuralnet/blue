package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: androidx.transition.c */
/* loaded from: classes.dex */
public class C12055c {

    /* renamed from: c */
    public static Transition f55985c = new AutoTransition();

    /* renamed from: d */
    public static ThreadLocal<WeakReference<C28385so<ViewGroup, ArrayList<Transition>>>> f55986d = new ThreadLocal<>();

    /* renamed from: e */
    public static ArrayList<ViewGroup> f55987e = new ArrayList<>();

    /* renamed from: a */
    public C28385so<C47068pm5, Transition> f55988a = new C28385so<>();

    /* renamed from: b */
    public C28385so<C47068pm5, C28385so<C47068pm5, Transition>> f55989b = new C28385so<>();

    /* renamed from: androidx.transition.c$a */
    /* loaded from: classes.dex */
    public static class ViewTreeObserver$OnPreDrawListenerC12056a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: b */
        public Transition f55990b;

        /* renamed from: c */
        public ViewGroup f55991c;

        /* renamed from: androidx.transition.c$a$a */
        /* loaded from: classes.dex */
        public class C12057a extends C12054b {

            /* renamed from: a */
            public final /* synthetic */ C28385so f55992a;

            public C12057a(C28385so c28385so) {
                this.f55992a = c28385so;
            }

            @Override // androidx.transition.C12054b, androidx.transition.Transition.InterfaceC12043f
            public void onTransitionEnd(Transition transition) {
                ((ArrayList) this.f55992a.get(ViewTreeObserver$OnPreDrawListenerC12056a.this.f55991c)).remove(transition);
                transition.mo65854h0(this);
            }
        }

        public ViewTreeObserver$OnPreDrawListenerC12056a(Transition transition, ViewGroup viewGroup) {
            this.f55990b = transition;
            this.f55991c = viewGroup;
        }

        /* renamed from: a */
        public final void m65797a() {
            this.f55991c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f55991c.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            m65797a();
            if (!C12055c.f55987e.remove(this.f55991c)) {
                return true;
            }
            C28385so<ViewGroup, ArrayList<Transition>> m65801e = C12055c.m65801e();
            ArrayList<Transition> arrayList = m65801e.get(this.f55991c);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                m65801e.put(this.f55991c, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f55990b);
            this.f55990b.mo65857d(new C12057a(m65801e));
            this.f55990b.m65878o(this.f55991c, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).mo65852k0(this.f55991c);
                }
            }
            this.f55990b.m65883g0(this.f55991c);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            m65797a();
            C12055c.f55987e.remove(this.f55991c);
            ArrayList<Transition> arrayList = C12055c.m65801e().get(this.f55991c);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<Transition> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().mo65852k0(this.f55991c);
                }
            }
            this.f55990b.m65877p(true);
        }
    }

    /* renamed from: a */
    public static void m65805a(ViewGroup viewGroup) {
        m65804b(viewGroup, null);
    }

    /* renamed from: b */
    public static void m65804b(ViewGroup viewGroup, Transition transition) {
        if (!f55987e.contains(viewGroup) && C38790bq6.m62504Z(viewGroup)) {
            f55987e.add(viewGroup);
            if (transition == null) {
                transition = f55985c;
            }
            Transition clone = transition.clone();
            m65798h(viewGroup, clone);
            C47068pm5.m18711f(viewGroup, null);
            m65799g(viewGroup, clone);
        }
    }

    /* renamed from: c */
    public static void m65803c(C47068pm5 c47068pm5, Transition transition) {
        ViewGroup m18713d = c47068pm5.m18713d();
        if (!f55987e.contains(m18713d)) {
            C47068pm5 m18714c = C47068pm5.m18714c(m18713d);
            if (transition == null) {
                if (m18714c != null) {
                    m18714c.m18715b();
                }
                c47068pm5.m18716a();
                return;
            }
            f55987e.add(m18713d);
            Transition clone = transition.clone();
            clone.mo65841w0(m18713d);
            if (m18714c != null && m18714c.m18712e()) {
                clone.mo65849o0(true);
            }
            m65798h(m18713d, clone);
            c47068pm5.m18716a();
            m65799g(m18713d, clone);
        }
    }

    /* renamed from: d */
    public static void m65802d(ViewGroup viewGroup) {
        f55987e.remove(viewGroup);
        ArrayList<Transition> arrayList = m65801e().get(viewGroup);
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                ((Transition) arrayList2.get(size)).mo65839y(viewGroup);
            }
        }
    }

    /* renamed from: e */
    public static C28385so<ViewGroup, ArrayList<Transition>> m65801e() {
        C28385so<ViewGroup, ArrayList<Transition>> c28385so;
        WeakReference<C28385so<ViewGroup, ArrayList<Transition>>> weakReference = f55986d.get();
        if (weakReference != null && (c28385so = weakReference.get()) != null) {
            return c28385so;
        }
        C28385so<ViewGroup, ArrayList<Transition>> c28385so2 = new C28385so<>();
        f55986d.set(new WeakReference<>(c28385so2));
        return c28385so2;
    }

    /* renamed from: f */
    public static void m65800f(C47068pm5 c47068pm5, Transition transition) {
        m65803c(c47068pm5, transition);
    }

    /* renamed from: g */
    public static void m65799g(ViewGroup viewGroup, Transition transition) {
        if (transition != null && viewGroup != null) {
            ViewTreeObserver$OnPreDrawListenerC12056a viewTreeObserver$OnPreDrawListenerC12056a = new ViewTreeObserver$OnPreDrawListenerC12056a(transition, viewGroup);
            viewGroup.addOnAttachStateChangeListener(viewTreeObserver$OnPreDrawListenerC12056a);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC12056a);
        }
    }

    /* renamed from: h */
    public static void m65798h(ViewGroup viewGroup, Transition transition) {
        ArrayList<Transition> arrayList = m65801e().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<Transition> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo65855f0(viewGroup);
            }
        }
        if (transition != null) {
            transition.m65878o(viewGroup, true);
        }
        C47068pm5 m18714c = C47068pm5.m18714c(viewGroup);
        if (m18714c != null) {
            m18714c.m18715b();
        }
    }
}

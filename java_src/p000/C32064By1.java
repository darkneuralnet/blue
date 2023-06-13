package p000;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
/* renamed from: By1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C32064By1 extends AbstractC32298Cy1 {

    /* renamed from: By1$a */
    /* loaded from: classes.dex */
    public class C0780a extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f3128a;

        public C0780a(Rect rect) {
            this.f3128a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f3128a;
        }
    }

    /* renamed from: By1$b */
    /* loaded from: classes.dex */
    public class C0781b implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ View f3130a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f3131b;

        public C0781b(View view, ArrayList arrayList) {
            this.f3130a = view;
            this.f3131b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            C0785f.m113214b(transition, this);
            this.f3130a.setVisibility(8);
            int size = this.f3131b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f3131b.get(i)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            C0785f.m113214b(transition, this);
            C0785f.m113215a(transition, this);
        }
    }

    /* renamed from: By1$c */
    /* loaded from: classes.dex */
    public class C0782c implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ Object f3133a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f3134b;

        /* renamed from: c */
        public final /* synthetic */ Object f3135c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f3136d;

        /* renamed from: e */
        public final /* synthetic */ Object f3137e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f3138f;

        public C0782c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f3133a = obj;
            this.f3134b = arrayList;
            this.f3135c = obj2;
            this.f3136d = arrayList2;
            this.f3137e = obj3;
            this.f3138f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            C0785f.m113214b(transition, this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f3133a;
            if (obj != null) {
                C32064By1.this.m113216w(obj, this.f3134b, null);
            }
            Object obj2 = this.f3135c;
            if (obj2 != null) {
                C32064By1.this.m113216w(obj2, this.f3136d, null);
            }
            Object obj3 = this.f3137e;
            if (obj3 != null) {
                C32064By1.this.m113216w(obj3, this.f3138f, null);
            }
        }
    }

    /* renamed from: By1$d */
    /* loaded from: classes.dex */
    public class C0783d implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ Runnable f3140a;

        public C0783d(Runnable runnable) {
            this.f3140a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f3140a.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: By1$e */
    /* loaded from: classes.dex */
    public class C0784e extends Transition.EpicenterCallback {

        /* renamed from: a */
        public final /* synthetic */ Rect f3142a;

        public C0784e(Rect rect) {
            this.f3142a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f3142a;
            if (rect != null && !rect.isEmpty()) {
                return this.f3142a;
            }
            return null;
        }
    }

    /* renamed from: By1$f */
    /* loaded from: classes.dex */
    public static class C0785f {
        private C0785f() {
        }

        /* renamed from: a */
        public static void m113215a(Transition transition, Transition.TransitionListener transitionListener) {
            transition.addListener(transitionListener);
        }

        /* renamed from: b */
        public static void m113214b(Transition transition, Transition.TransitionListener transitionListener) {
            transition.removeListener(transitionListener);
        }
    }

    /* renamed from: v */
    public static boolean m113217v(Transition transition) {
        if (AbstractC32298Cy1.m111192i(transition.getTargetIds()) && AbstractC32298Cy1.m111192i(transition.getTargetNames()) && AbstractC32298Cy1.m111192i(transition.getTargetTypes())) {
            return false;
        }
        return true;
    }

    @Override // p000.AbstractC32298Cy1
    /* renamed from: a */
    public void mo65822a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // p000.AbstractC32298Cy1
    /* renamed from: b */
    public void mo65821b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo65821b(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
        } else if (!m113217v(transition) && AbstractC32298Cy1.m111192i(transition.getTargets())) {
            int size = arrayList.size();
            while (i < size) {
                transition.addTarget(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // p000.AbstractC32298Cy1
    /* renamed from: c */
    public void mo65820c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // p000.AbstractC32298Cy1
    /* renamed from: e */
    public boolean mo65819e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // p000.AbstractC32298Cy1
    /* renamed from: f */
    public Object mo65818f(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // p000.AbstractC32298Cy1
    /* renamed from: j */
    public Object mo65817j(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            if (transition2 != null) {
                transition = transition2;
            } else {
                transition = null;
            }
        }
        if (transition3 != null) {
            TransitionSet transitionSet = new TransitionSet();
            if (transition != null) {
                transitionSet.addTransition(transition);
            }
            transitionSet.addTransition(transition3);
            return transitionSet;
        }
        return transition;
    }

    @Override // p000.AbstractC32298Cy1
    /* renamed from: k */
    public Object mo65816k(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // p000.AbstractC32298Cy1
    /* renamed from: m */
    public void mo65815m(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C0781b(view, arrayList));
    }

    @Override // p000.AbstractC32298Cy1
    /* renamed from: n */
    public void mo65814n(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C0782c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // p000.AbstractC32298Cy1
    /* renamed from: o */
    public void mo65813o(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C0784e(rect));
        }
    }

    @Override // p000.AbstractC32298Cy1
    /* renamed from: p */
    public void mo65812p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m111193h(view, rect);
            ((Transition) obj).setEpicenterCallback(new C0780a(rect));
        }
    }

    @Override // p000.AbstractC32298Cy1
    /* renamed from: q */
    public void mo111190q(Fragment fragment, Object obj, C39858dd0 c39858dd0, Runnable runnable) {
        ((Transition) obj).addListener(new C0783d(runnable));
    }

    @Override // p000.AbstractC32298Cy1
    /* renamed from: s */
    public void mo65811s(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC32298Cy1.m111195d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo65821b(transitionSet, arrayList);
    }

    @Override // p000.AbstractC32298Cy1
    /* renamed from: t */
    public void mo65810t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            m113216w(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // p000.AbstractC32298Cy1
    /* renamed from: u */
    public Object mo65809u(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: w */
    public void m113216w(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        int size;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                m113216w(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m113217v(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                size = 0;
            } else {
                size = arrayList2.size();
            }
            while (i < size) {
                transition.addTarget(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget(arrayList.get(size2));
            }
        }
    }
}

package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.List;
@SuppressLint({"RestrictedApi"})
/* renamed from: androidx.transition.a */
/* loaded from: classes.dex */
public class C12049a extends AbstractC32298Cy1 {

    /* renamed from: androidx.transition.a$a */
    /* loaded from: classes.dex */
    public class C12050a extends Transition.AbstractC12042e {

        /* renamed from: a */
        public final /* synthetic */ Rect f55971a;

        public C12050a(Rect rect) {
            this.f55971a = rect;
        }

        @Override // androidx.transition.Transition.AbstractC12042e
        /* renamed from: a */
        public Rect mo65806a(Transition transition) {
            return this.f55971a;
        }
    }

    /* renamed from: androidx.transition.a$b */
    /* loaded from: classes.dex */
    public class C12051b implements Transition.InterfaceC12043f {

        /* renamed from: a */
        public final /* synthetic */ View f55973a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f55974b;

        public C12051b(View view, ArrayList arrayList) {
            this.f55973a = view;
            this.f55974b = arrayList;
        }

        @Override // androidx.transition.Transition.InterfaceC12043f
        public void onTransitionCancel(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC12043f
        public void onTransitionEnd(Transition transition) {
            transition.mo65854h0(this);
            this.f55973a.setVisibility(8);
            int size = this.f55974b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f55974b.get(i)).setVisibility(0);
            }
        }

        @Override // androidx.transition.Transition.InterfaceC12043f
        public void onTransitionPause(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC12043f
        public void onTransitionResume(Transition transition) {
        }

        @Override // androidx.transition.Transition.InterfaceC12043f
        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.transition.a$c */
    /* loaded from: classes.dex */
    public class C12052c extends C12054b {

        /* renamed from: a */
        public final /* synthetic */ Object f55976a;

        /* renamed from: b */
        public final /* synthetic */ ArrayList f55977b;

        /* renamed from: c */
        public final /* synthetic */ Object f55978c;

        /* renamed from: d */
        public final /* synthetic */ ArrayList f55979d;

        /* renamed from: e */
        public final /* synthetic */ Object f55980e;

        /* renamed from: f */
        public final /* synthetic */ ArrayList f55981f;

        public C12052c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f55976a = obj;
            this.f55977b = arrayList;
            this.f55978c = obj2;
            this.f55979d = arrayList2;
            this.f55980e = obj3;
            this.f55981f = arrayList3;
        }

        @Override // androidx.transition.C12054b, androidx.transition.Transition.InterfaceC12043f
        public void onTransitionEnd(Transition transition) {
            transition.mo65854h0(this);
        }

        @Override // androidx.transition.C12054b, androidx.transition.Transition.InterfaceC12043f
        public void onTransitionStart(Transition transition) {
            Object obj = this.f55976a;
            if (obj != null) {
                C12049a.this.m65807w(obj, this.f55977b, null);
            }
            Object obj2 = this.f55978c;
            if (obj2 != null) {
                C12049a.this.m65807w(obj2, this.f55979d, null);
            }
            Object obj3 = this.f55980e;
            if (obj3 != null) {
                C12049a.this.m65807w(obj3, this.f55981f, null);
            }
        }
    }

    /* renamed from: androidx.transition.a$d */
    /* loaded from: classes.dex */
    public class C12053d extends Transition.AbstractC12042e {

        /* renamed from: a */
        public final /* synthetic */ Rect f55983a;

        public C12053d(Rect rect) {
            this.f55983a = rect;
        }

        @Override // androidx.transition.Transition.AbstractC12042e
        /* renamed from: a */
        public Rect mo65806a(Transition transition) {
            Rect rect = this.f55983a;
            if (rect != null && !rect.isEmpty()) {
                return this.f55983a;
            }
            return null;
        }
    }

    /* renamed from: v */
    public static boolean m65808v(Transition transition) {
        if (AbstractC32298Cy1.m111192i(transition.m65899N()) && AbstractC32298Cy1.m111192i(transition.m65898O()) && AbstractC32298Cy1.m111192i(transition.m65897P())) {
            return false;
        }
        return true;
    }

    @Override // p000.AbstractC32298Cy1
    /* renamed from: a */
    public void mo65822a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).mo65856e(view);
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
            int m65866H0 = transitionSet.m65866H0();
            while (i < m65866H0) {
                mo65821b(transitionSet.m65867G0(i), arrayList);
                i++;
            }
        } else if (!m65808v(transition) && AbstractC32298Cy1.m111192i(transition.m65896Q())) {
            int size = arrayList.size();
            while (i < size) {
                transition.mo65856e(arrayList.get(i));
                i++;
            }
        }
    }

    @Override // p000.AbstractC32298Cy1
    /* renamed from: c */
    public void mo65820c(ViewGroup viewGroup, Object obj) {
        C12055c.m65804b(viewGroup, (Transition) obj);
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
            transition = new TransitionSet().m65869C0(transition).m65869C0(transition2).m65861M0(1);
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
                transitionSet.m65869C0(transition);
            }
            transitionSet.m65869C0(transition3);
            return transitionSet;
        }
        return transition;
    }

    @Override // p000.AbstractC32298Cy1
    /* renamed from: k */
    public Object mo65816k(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.m65869C0((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.m65869C0((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.m65869C0((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // p000.AbstractC32298Cy1
    /* renamed from: m */
    public void mo65815m(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).mo65857d(new C12051b(view, arrayList));
    }

    @Override // p000.AbstractC32298Cy1
    /* renamed from: n */
    public void mo65814n(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).mo65857d(new C12052c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // p000.AbstractC32298Cy1
    /* renamed from: o */
    public void mo65813o(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).mo65846r0(new C12053d(rect));
        }
    }

    @Override // p000.AbstractC32298Cy1
    /* renamed from: p */
    public void mo65812p(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m111193h(view, rect);
            ((Transition) obj).mo65846r0(new C12050a(rect));
        }
    }

    @Override // p000.AbstractC32298Cy1
    /* renamed from: s */
    public void mo65811s(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> m65896Q = transitionSet.m65896Q();
        m65896Q.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            AbstractC32298Cy1.m111195d(m65896Q, arrayList.get(i));
        }
        m65896Q.add(view);
        arrayList.add(view);
        mo65821b(transitionSet, arrayList);
    }

    @Override // p000.AbstractC32298Cy1
    /* renamed from: t */
    public void mo65810t(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.m65896Q().clear();
            transitionSet.m65896Q().addAll(arrayList2);
            m65807w(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // p000.AbstractC32298Cy1
    /* renamed from: u */
    public Object mo65809u(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.m65869C0((Transition) obj);
        return transitionSet;
    }

    /* renamed from: w */
    public void m65807w(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int size;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int m65866H0 = transitionSet.m65866H0();
            while (i < m65866H0) {
                m65807w(transitionSet.m65867G0(i), arrayList, arrayList2);
                i++;
            }
        } else if (!m65808v(transition)) {
            List<View> m65896Q = transition.m65896Q();
            if (m65896Q.size() == arrayList.size() && m65896Q.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                while (i < size) {
                    transition.mo65856e(arrayList2.get(i));
                    i++;
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    transition.mo65853i0(arrayList.get(size2));
                }
            }
        }
    }
}

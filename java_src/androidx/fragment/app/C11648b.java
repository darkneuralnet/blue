package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.AbstractC11688o;
import androidx.fragment.app.C11669d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000.C39858dd0;
/* renamed from: androidx.fragment.app.b */
/* loaded from: classes.dex */
public class C11648b extends AbstractC11688o {

    /* renamed from: androidx.fragment.app.b$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C11649a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f54650a;

        static {
            int[] iArr = new int[AbstractC11688o.C11693e.EnumC11696c.values().length];
            f54650a = iArr;
            try {
                iArr[AbstractC11688o.C11693e.EnumC11696c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54650a[AbstractC11688o.C11693e.EnumC11696c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54650a[AbstractC11688o.C11693e.EnumC11696c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f54650a[AbstractC11688o.C11693e.EnumC11696c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$b */
    /* loaded from: classes.dex */
    public class RunnableC11650b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ List f54651b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC11688o.C11693e f54652c;

        public RunnableC11650b(List list, AbstractC11688o.C11693e c11693e) {
            this.f54651b = list;
            this.f54652c = c11693e;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f54651b.contains(this.f54652c)) {
                this.f54651b.remove(this.f54652c);
                C11648b.this.m67238s(this.f54652c);
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$c */
    /* loaded from: classes.dex */
    public class C11651c extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ ViewGroup f54654a;

        /* renamed from: b */
        public final /* synthetic */ View f54655b;

        /* renamed from: c */
        public final /* synthetic */ boolean f54656c;

        /* renamed from: d */
        public final /* synthetic */ AbstractC11688o.C11693e f54657d;

        /* renamed from: e */
        public final /* synthetic */ C11660k f54658e;

        public C11651c(ViewGroup viewGroup, View view, boolean z, AbstractC11688o.C11693e c11693e, C11660k c11660k) {
            this.f54654a = viewGroup;
            this.f54655b = view;
            this.f54656c = z;
            this.f54657d = c11693e;
            this.f54658e = c11660k;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f54654a.endViewTransition(this.f54655b);
            if (this.f54656c) {
                this.f54657d.m67069e().m67061a(this.f54655b);
            }
            this.f54658e.m67230a();
            if (FragmentManager.m67384N0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f54657d + " has ended.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$d */
    /* loaded from: classes.dex */
    public class C11652d implements C39858dd0.InterfaceC19813b {

        /* renamed from: a */
        public final /* synthetic */ Animator f54660a;

        /* renamed from: b */
        public final /* synthetic */ AbstractC11688o.C11693e f54661b;

        public C11652d(Animator animator, AbstractC11688o.C11693e c11693e) {
            this.f54660a = animator;
            this.f54661b = c11693e;
        }

        @Override // p000.C39858dd0.InterfaceC19813b
        /* renamed from: a */
        public void mo44007a() {
            this.f54660a.end();
            if (FragmentManager.m67384N0(2)) {
                Log.v("FragmentManager", "Animator from operation " + this.f54661b + " has been canceled.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$e  reason: invalid class name */
    /* loaded from: classes.dex */
    public class animationAnimation$AnimationListenerC11653e implements Animation.AnimationListener {

        /* renamed from: b */
        public final /* synthetic */ AbstractC11688o.C11693e f54663b;

        /* renamed from: c */
        public final /* synthetic */ ViewGroup f54664c;

        /* renamed from: d */
        public final /* synthetic */ View f54665d;

        /* renamed from: e */
        public final /* synthetic */ C11660k f54666e;

        /* renamed from: androidx.fragment.app.b$e$a */
        /* loaded from: classes.dex */
        public class RunnableC11654a implements Runnable {
            public RunnableC11654a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                animationAnimation$AnimationListenerC11653e animationanimation_animationlistenerc11653e = animationAnimation$AnimationListenerC11653e.this;
                animationanimation_animationlistenerc11653e.f54664c.endViewTransition(animationanimation_animationlistenerc11653e.f54665d);
                animationAnimation$AnimationListenerC11653e.this.f54666e.m67230a();
            }
        }

        public animationAnimation$AnimationListenerC11653e(AbstractC11688o.C11693e c11693e, ViewGroup viewGroup, View view, C11660k c11660k) {
            this.f54663b = c11693e;
            this.f54664c = viewGroup;
            this.f54665d = view;
            this.f54666e = c11660k;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f54664c.post(new RunnableC11654a());
            if (FragmentManager.m67384N0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f54663b + " has ended.");
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (FragmentManager.m67384N0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f54663b + " has reached onAnimationStart.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$f */
    /* loaded from: classes.dex */
    public class C11655f implements C39858dd0.InterfaceC19813b {

        /* renamed from: a */
        public final /* synthetic */ View f54669a;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f54670b;

        /* renamed from: c */
        public final /* synthetic */ C11660k f54671c;

        /* renamed from: d */
        public final /* synthetic */ AbstractC11688o.C11693e f54672d;

        public C11655f(View view, ViewGroup viewGroup, C11660k c11660k, AbstractC11688o.C11693e c11693e) {
            this.f54669a = view;
            this.f54670b = viewGroup;
            this.f54671c = c11660k;
            this.f54672d = c11693e;
        }

        @Override // p000.C39858dd0.InterfaceC19813b
        /* renamed from: a */
        public void mo44007a() {
            this.f54669a.clearAnimation();
            this.f54670b.endViewTransition(this.f54669a);
            this.f54671c.m67230a();
            if (FragmentManager.m67384N0(2)) {
                Log.v("FragmentManager", "Animation from operation " + this.f54672d + " has been cancelled.");
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$g */
    /* loaded from: classes.dex */
    public class RunnableC11656g implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ AbstractC11688o.C11693e f54674b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC11688o.C11693e f54675c;

        /* renamed from: d */
        public final /* synthetic */ boolean f54676d;

        /* renamed from: e */
        public final /* synthetic */ C28385so f54677e;

        public RunnableC11656g(AbstractC11688o.C11693e c11693e, AbstractC11688o.C11693e c11693e2, boolean z, C28385so c28385so) {
            this.f54674b = c11693e;
            this.f54675c = c11693e2;
            this.f54676d = z;
            this.f54677e = c28385so;
        }

        @Override // java.lang.Runnable
        public void run() {
            C31830Ay1.m114820a(this.f54674b.m67068f(), this.f54675c.m67068f(), this.f54676d, this.f54677e, false);
        }
    }

    /* renamed from: androidx.fragment.app.b$h */
    /* loaded from: classes.dex */
    public class RunnableC11657h implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ AbstractC32298Cy1 f54679b;

        /* renamed from: c */
        public final /* synthetic */ View f54680c;

        /* renamed from: d */
        public final /* synthetic */ Rect f54681d;

        public RunnableC11657h(AbstractC32298Cy1 abstractC32298Cy1, View view, Rect rect) {
            this.f54679b = abstractC32298Cy1;
            this.f54680c = view;
            this.f54681d = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f54679b.m111193h(this.f54680c, this.f54681d);
        }
    }

    /* renamed from: androidx.fragment.app.b$i */
    /* loaded from: classes.dex */
    public class RunnableC11658i implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ ArrayList f54683b;

        public RunnableC11658i(ArrayList arrayList) {
            this.f54683b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            C31830Ay1.m114816e(this.f54683b, 4);
        }
    }

    /* renamed from: androidx.fragment.app.b$j */
    /* loaded from: classes.dex */
    public class RunnableC11659j implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C11662m f54685b;

        /* renamed from: c */
        public final /* synthetic */ AbstractC11688o.C11693e f54686c;

        public RunnableC11659j(C11662m c11662m, AbstractC11688o.C11693e c11693e) {
            this.f54685b = c11662m;
            this.f54686c = c11693e;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f54685b.m67230a();
            if (FragmentManager.m67384N0(2)) {
                Log.v("FragmentManager", "Transition for operation " + this.f54686c + "has completed");
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$k */
    /* loaded from: classes.dex */
    public static class C11660k extends C11661l {

        /* renamed from: c */
        public boolean f54688c;

        /* renamed from: d */
        public boolean f54689d;

        /* renamed from: e */
        public C11669d.C11670a f54690e;

        public C11660k(AbstractC11688o.C11693e c11693e, C39858dd0 c39858dd0, boolean z) {
            super(c11693e, c39858dd0);
            this.f54689d = false;
            this.f54688c = z;
        }

        /* renamed from: e */
        public C11669d.C11670a m67231e(Context context) {
            boolean z;
            if (this.f54689d) {
                return this.f54690e;
            }
            Fragment m67068f = m67229b().m67068f();
            if (m67229b().m67069e() == AbstractC11688o.C11693e.EnumC11696c.VISIBLE) {
                z = true;
            } else {
                z = false;
            }
            C11669d.C11670a m67218b = C11669d.m67218b(context, m67068f, z, this.f54688c);
            this.f54690e = m67218b;
            this.f54689d = true;
            return m67218b;
        }
    }

    /* renamed from: androidx.fragment.app.b$l */
    /* loaded from: classes.dex */
    public static class C11661l {

        /* renamed from: a */
        public final AbstractC11688o.C11693e f54691a;

        /* renamed from: b */
        public final C39858dd0 f54692b;

        public C11661l(AbstractC11688o.C11693e c11693e, C39858dd0 c39858dd0) {
            this.f54691a = c11693e;
            this.f54692b = c39858dd0;
        }

        /* renamed from: a */
        public void m67230a() {
            this.f54691a.m67070d(this.f54692b);
        }

        /* renamed from: b */
        public AbstractC11688o.C11693e m67229b() {
            return this.f54691a;
        }

        /* renamed from: c */
        public C39858dd0 m67228c() {
            return this.f54692b;
        }

        /* renamed from: d */
        public boolean m67227d() {
            AbstractC11688o.C11693e.EnumC11696c enumC11696c;
            AbstractC11688o.C11693e.EnumC11696c m67059c = AbstractC11688o.C11693e.EnumC11696c.m67059c(this.f54691a.m67068f().mView);
            AbstractC11688o.C11693e.EnumC11696c m67069e = this.f54691a.m67069e();
            if (m67059c != m67069e && (m67059c == (enumC11696c = AbstractC11688o.C11693e.EnumC11696c.VISIBLE) || m67069e == enumC11696c)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.fragment.app.b$m */
    /* loaded from: classes.dex */
    public static class C11662m extends C11661l {

        /* renamed from: c */
        public final Object f54693c;

        /* renamed from: d */
        public final boolean f54694d;

        /* renamed from: e */
        public final Object f54695e;

        public C11662m(AbstractC11688o.C11693e c11693e, C39858dd0 c39858dd0, boolean z, boolean z2) {
            super(c11693e, c39858dd0);
            Object exitTransition;
            Object enterTransition;
            boolean allowEnterTransitionOverlap;
            if (c11693e.m67069e() == AbstractC11688o.C11693e.EnumC11696c.VISIBLE) {
                if (z) {
                    enterTransition = c11693e.m67068f().getReenterTransition();
                } else {
                    enterTransition = c11693e.m67068f().getEnterTransition();
                }
                this.f54693c = enterTransition;
                if (z) {
                    allowEnterTransitionOverlap = c11693e.m67068f().getAllowReturnTransitionOverlap();
                } else {
                    allowEnterTransitionOverlap = c11693e.m67068f().getAllowEnterTransitionOverlap();
                }
                this.f54694d = allowEnterTransitionOverlap;
            } else {
                if (z) {
                    exitTransition = c11693e.m67068f().getReturnTransition();
                } else {
                    exitTransition = c11693e.m67068f().getExitTransition();
                }
                this.f54693c = exitTransition;
                this.f54694d = true;
            }
            if (z2) {
                if (z) {
                    this.f54695e = c11693e.m67068f().getSharedElementReturnTransition();
                    return;
                } else {
                    this.f54695e = c11693e.m67068f().getSharedElementEnterTransition();
                    return;
                }
            }
            this.f54695e = null;
        }

        /* renamed from: e */
        public AbstractC32298Cy1 m67226e() {
            AbstractC32298Cy1 m67225f = m67225f(this.f54693c);
            AbstractC32298Cy1 m67225f2 = m67225f(this.f54695e);
            if (m67225f != null && m67225f2 != null && m67225f != m67225f2) {
                throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + m67229b().m67068f() + " returned Transition " + this.f54693c + " which uses a different Transition  type than its shared element transition " + this.f54695e);
            } else if (m67225f == null) {
                return m67225f2;
            } else {
                return m67225f;
            }
        }

        /* renamed from: f */
        public final AbstractC32298Cy1 m67225f(Object obj) {
            if (obj == null) {
                return null;
            }
            AbstractC32298Cy1 abstractC32298Cy1 = C31830Ay1.f1466a;
            if (abstractC32298Cy1 != null && abstractC32298Cy1.mo65819e(obj)) {
                return abstractC32298Cy1;
            }
            AbstractC32298Cy1 abstractC32298Cy12 = C31830Ay1.f1467b;
            if (abstractC32298Cy12 != null && abstractC32298Cy12.mo65819e(obj)) {
                return abstractC32298Cy12;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + m67229b().m67068f() + " is not a valid framework Transition or AndroidX Transition");
        }

        /* renamed from: g */
        public Object m67224g() {
            return this.f54695e;
        }

        /* renamed from: h */
        public Object m67223h() {
            return this.f54693c;
        }

        /* renamed from: i */
        public boolean m67222i() {
            return this.f54695e != null;
        }

        /* renamed from: j */
        public boolean m67221j() {
            return this.f54694d;
        }
    }

    public C11648b(ViewGroup viewGroup) {
        super(viewGroup);
    }

    @Override // androidx.fragment.app.AbstractC11688o
    /* renamed from: f */
    public void mo67086f(List<AbstractC11688o.C11693e> list, boolean z) {
        AbstractC11688o.C11693e c11693e = null;
        AbstractC11688o.C11693e c11693e2 = null;
        for (AbstractC11688o.C11693e c11693e3 : list) {
            AbstractC11688o.C11693e.EnumC11696c m67059c = AbstractC11688o.C11693e.EnumC11696c.m67059c(c11693e3.m67068f().mView);
            int i = C11649a.f54650a[c11693e3.m67069e().ordinal()];
            if (i != 1 && i != 2 && i != 3) {
                if (i == 4 && m67059c != AbstractC11688o.C11693e.EnumC11696c.VISIBLE) {
                    c11693e2 = c11693e3;
                }
            } else if (m67059c == AbstractC11688o.C11693e.EnumC11696c.VISIBLE && c11693e == null) {
                c11693e = c11693e3;
            }
        }
        if (FragmentManager.m67384N0(2)) {
            Log.v("FragmentManager", "Executing operations from " + c11693e + " to " + c11693e2);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList<AbstractC11688o.C11693e> arrayList3 = new ArrayList(list);
        m67232y(list);
        for (AbstractC11688o.C11693e c11693e4 : list) {
            C39858dd0 c39858dd0 = new C39858dd0();
            c11693e4.m67064j(c39858dd0);
            arrayList.add(new C11660k(c11693e4, c39858dd0, z));
            C39858dd0 c39858dd02 = new C39858dd0();
            c11693e4.m67064j(c39858dd02);
            boolean z2 = false;
            if (z) {
                if (c11693e4 != c11693e) {
                    arrayList2.add(new C11662m(c11693e4, c39858dd02, z, z2));
                    c11693e4.m67073a(new RunnableC11650b(arrayList3, c11693e4));
                }
                z2 = true;
                arrayList2.add(new C11662m(c11693e4, c39858dd02, z, z2));
                c11693e4.m67073a(new RunnableC11650b(arrayList3, c11693e4));
            } else {
                if (c11693e4 != c11693e2) {
                    arrayList2.add(new C11662m(c11693e4, c39858dd02, z, z2));
                    c11693e4.m67073a(new RunnableC11650b(arrayList3, c11693e4));
                }
                z2 = true;
                arrayList2.add(new C11662m(c11693e4, c39858dd02, z, z2));
                c11693e4.m67073a(new RunnableC11650b(arrayList3, c11693e4));
            }
        }
        Map<AbstractC11688o.C11693e, Boolean> m67233x = m67233x(arrayList2, arrayList3, z, c11693e, c11693e2);
        m67234w(arrayList, arrayList3, m67233x.containsValue(Boolean.TRUE), m67233x);
        for (AbstractC11688o.C11693e c11693e5 : arrayList3) {
            m67238s(c11693e5);
        }
        arrayList3.clear();
        if (FragmentManager.m67384N0(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + c11693e + " to " + c11693e2);
        }
    }

    /* renamed from: s */
    public void m67238s(AbstractC11688o.C11693e c11693e) {
        c11693e.m67069e().m67061a(c11693e.m67068f().mView);
    }

    /* renamed from: t */
    public void m67237t(ArrayList<View> arrayList, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (C41189fr6.m40701a(viewGroup)) {
                if (!arrayList.contains(view)) {
                    arrayList.add(viewGroup);
                    return;
                }
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m67237t(arrayList, childAt);
                }
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    /* renamed from: u */
    public void m67236u(Map<String, View> map, View view) {
        String m62530M = C38790bq6.m62530M(view);
        if (m62530M != null) {
            map.put(m62530M, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    m67236u(map, childAt);
                }
            }
        }
    }

    /* renamed from: v */
    public void m67235v(C28385so<String, View> c28385so, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = c28385so.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(C38790bq6.m62530M(it.next().getValue()))) {
                it.remove();
            }
        }
    }

    /* renamed from: w */
    public final void m67234w(List<C11660k> list, List<AbstractC11688o.C11693e> list2, boolean z, Map<AbstractC11688o.C11693e, Boolean> map) {
        int i;
        boolean z2;
        Context context;
        View view;
        int i2;
        boolean z3;
        AbstractC11688o.C11693e c11693e;
        ViewGroup m67079m = m67079m();
        Context context2 = m67079m.getContext();
        ArrayList arrayList = new ArrayList();
        Iterator<C11660k> it = list.iterator();
        boolean z4 = false;
        while (true) {
            i = 2;
            if (!it.hasNext()) {
                break;
            }
            C11660k next = it.next();
            if (next.m67227d()) {
                next.m67230a();
            } else {
                C11669d.C11670a m67231e = next.m67231e(context2);
                if (m67231e == null) {
                    next.m67230a();
                } else {
                    Animator animator = m67231e.f54703b;
                    if (animator == null) {
                        arrayList.add(next);
                    } else {
                        AbstractC11688o.C11693e m67229b = next.m67229b();
                        Fragment m67068f = m67229b.m67068f();
                        if (Boolean.TRUE.equals(map.get(m67229b))) {
                            if (FragmentManager.m67384N0(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + m67068f + " as this Fragment was involved in a Transition.");
                            }
                            next.m67230a();
                        } else {
                            if (m67229b.m67069e() == AbstractC11688o.C11693e.EnumC11696c.GONE) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                list2.remove(m67229b);
                            }
                            View view2 = m67068f.mView;
                            m67079m.startViewTransition(view2);
                            animator.addListener(new C11651c(m67079m, view2, z3, m67229b, next));
                            animator.setTarget(view2);
                            animator.start();
                            if (FragmentManager.m67384N0(2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Animator from operation ");
                                c11693e = m67229b;
                                sb.append(c11693e);
                                sb.append(" has started.");
                                Log.v("FragmentManager", sb.toString());
                            } else {
                                c11693e = m67229b;
                            }
                            next.m67228c().m44011b(new C11652d(animator, c11693e));
                            z4 = true;
                        }
                    }
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C11660k c11660k = (C11660k) it2.next();
            AbstractC11688o.C11693e m67229b2 = c11660k.m67229b();
            Fragment m67068f2 = m67229b2.m67068f();
            if (z) {
                if (FragmentManager.m67384N0(i)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + m67068f2 + " as Animations cannot run alongside Transitions.");
                }
                c11660k.m67230a();
            } else if (z4) {
                if (FragmentManager.m67384N0(i)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + m67068f2 + " as Animations cannot run alongside Animators.");
                }
                c11660k.m67230a();
            } else {
                View view3 = m67068f2.mView;
                Animation animation = (Animation) HZ3.m103731g(((C11669d.C11670a) HZ3.m103731g(c11660k.m67231e(context2))).f54702a);
                if (m67229b2.m67069e() != AbstractC11688o.C11693e.EnumC11696c.REMOVED) {
                    view3.startAnimation(animation);
                    c11660k.m67230a();
                    z2 = z4;
                    context = context2;
                    i2 = i;
                    view = view3;
                } else {
                    m67079m.startViewTransition(view3);
                    C11669d.RunnableC11671b runnableC11671b = new C11669d.RunnableC11671b(animation, m67079m, view3);
                    z2 = z4;
                    context = context2;
                    view = view3;
                    runnableC11671b.setAnimationListener(new animationAnimation$AnimationListenerC11653e(m67229b2, m67079m, view3, c11660k));
                    view.startAnimation(runnableC11671b);
                    i2 = 2;
                    if (FragmentManager.m67384N0(2)) {
                        Log.v("FragmentManager", "Animation from operation " + m67229b2 + " has started.");
                    }
                }
                c11660k.m67228c().m44011b(new C11655f(view, m67079m, c11660k, m67229b2));
                i = i2;
                z4 = z2;
                context2 = context;
            }
        }
    }

    /* renamed from: x */
    public final Map<AbstractC11688o.C11693e, Boolean> m67233x(List<C11662m> list, List<AbstractC11688o.C11693e> list2, boolean z, AbstractC11688o.C11693e c11693e, AbstractC11688o.C11693e c11693e2) {
        String str;
        View next;
        View next2;
        boolean z2;
        String str2;
        boolean z3;
        String str3;
        View view;
        Object obj;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList<View> arrayList2;
        Object obj3;
        AbstractC11688o.C11693e c11693e3;
        View view2;
        C28385so c28385so;
        AbstractC11688o.C11693e c11693e4;
        AbstractC11688o.C11693e c11693e5;
        HashMap hashMap;
        ArrayList<View> arrayList3;
        View view3;
        AbstractC32298Cy1 abstractC32298Cy1;
        ArrayList<View> arrayList4;
        Rect rect;
        AbstractC36046Sy5 enterTransitionCallback;
        AbstractC36046Sy5 exitTransitionCallback;
        ArrayList<String> arrayList5;
        int i;
        View view4;
        View view5;
        String m114819b;
        ArrayList<String> arrayList6;
        boolean z4 = z;
        AbstractC11688o.C11693e c11693e6 = c11693e;
        AbstractC11688o.C11693e c11693e7 = c11693e2;
        HashMap hashMap2 = new HashMap();
        AbstractC32298Cy1 abstractC32298Cy12 = null;
        for (C11662m c11662m : list) {
            if (!c11662m.m67227d()) {
                AbstractC32298Cy1 m67226e = c11662m.m67226e();
                if (abstractC32298Cy12 == null) {
                    abstractC32298Cy12 = m67226e;
                } else if (m67226e != null && abstractC32298Cy12 != m67226e) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + c11662m.m67229b().m67068f() + " returned Transition " + c11662m.m67223h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (abstractC32298Cy12 == null) {
            for (C11662m c11662m2 : list) {
                hashMap2.put(c11662m2.m67229b(), Boolean.FALSE);
                c11662m2.m67230a();
            }
            return hashMap2;
        }
        View view6 = new View(m67079m().getContext());
        Rect rect2 = new Rect();
        ArrayList<View> arrayList7 = new ArrayList<>();
        ArrayList<View> arrayList8 = new ArrayList<>();
        C28385so c28385so2 = new C28385so();
        Iterator<C11662m> it = list.iterator();
        Object obj4 = null;
        View view7 = null;
        boolean z5 = false;
        while (true) {
            str = "FragmentManager";
            if (!it.hasNext()) {
                break;
            }
            C11662m next3 = it.next();
            if (next3.m67222i() && c11693e6 != null && c11693e7 != null) {
                Object mo65809u = abstractC32298Cy12.mo65809u(abstractC32298Cy12.mo65818f(next3.m67224g()));
                ArrayList<String> sharedElementSourceNames = c11693e2.m67068f().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = c11693e.m67068f().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = c11693e.m67068f().getSharedElementTargetNames();
                View view8 = view7;
                HashMap hashMap3 = hashMap2;
                int i2 = 0;
                while (i2 < sharedElementTargetNames.size()) {
                    int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i2));
                    ArrayList<String> arrayList9 = sharedElementTargetNames;
                    if (indexOf != -1) {
                        sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i2));
                    }
                    i2++;
                    sharedElementTargetNames = arrayList9;
                }
                ArrayList<String> sharedElementTargetNames2 = c11693e2.m67068f().getSharedElementTargetNames();
                if (!z4) {
                    enterTransitionCallback = c11693e.m67068f().getExitTransitionCallback();
                    exitTransitionCallback = c11693e2.m67068f().getEnterTransitionCallback();
                } else {
                    enterTransitionCallback = c11693e.m67068f().getEnterTransitionCallback();
                    exitTransitionCallback = c11693e2.m67068f().getExitTransitionCallback();
                }
                int size = sharedElementSourceNames.size();
                View view9 = view6;
                int i3 = 0;
                while (i3 < size) {
                    c28385so2.put(sharedElementSourceNames.get(i3), sharedElementTargetNames2.get(i3));
                    i3++;
                    size = size;
                    rect2 = rect2;
                }
                Rect rect3 = rect2;
                if (FragmentManager.m67384N0(2)) {
                    Log.v("FragmentManager", ">>> entering view names <<<");
                    for (Iterator<String> it2 = sharedElementTargetNames2.iterator(); it2.hasNext(); it2 = it2) {
                        Log.v("FragmentManager", "Name: " + it2.next());
                    }
                    Log.v("FragmentManager", ">>> exiting view names <<<");
                    for (Iterator<String> it3 = sharedElementSourceNames.iterator(); it3.hasNext(); it3 = it3) {
                        Log.v("FragmentManager", "Name: " + it3.next());
                    }
                }
                C28385so<String, View> c28385so3 = new C28385so<>();
                m67236u(c28385so3, c11693e.m67068f().mView);
                c28385so3.m13657q(sharedElementSourceNames);
                if (enterTransitionCallback != null) {
                    if (FragmentManager.m67384N0(2)) {
                        Log.v("FragmentManager", "Executing exit callback for operation " + c11693e6);
                    }
                    enterTransitionCallback.m84517d(sharedElementSourceNames, c28385so3);
                    int size2 = sharedElementSourceNames.size() - 1;
                    while (size2 >= 0) {
                        String str4 = sharedElementSourceNames.get(size2);
                        View view10 = c28385so3.get(str4);
                        if (view10 == null) {
                            c28385so2.remove(str4);
                            arrayList6 = sharedElementSourceNames;
                        } else {
                            arrayList6 = sharedElementSourceNames;
                            if (!str4.equals(C38790bq6.m62530M(view10))) {
                                c28385so2.put(C38790bq6.m62530M(view10), (String) c28385so2.remove(str4));
                            }
                        }
                        size2--;
                        sharedElementSourceNames = arrayList6;
                    }
                    arrayList5 = sharedElementSourceNames;
                } else {
                    arrayList5 = sharedElementSourceNames;
                    c28385so2.m13657q(c28385so3.keySet());
                }
                C28385so<String, View> c28385so4 = new C28385so<>();
                m67236u(c28385so4, c11693e2.m67068f().mView);
                c28385so4.m13657q(sharedElementTargetNames2);
                c28385so4.m13657q(c28385so2.values());
                if (exitTransitionCallback != null) {
                    if (FragmentManager.m67384N0(2)) {
                        Log.v("FragmentManager", "Executing enter callback for operation " + c11693e7);
                    }
                    exitTransitionCallback.m84517d(sharedElementTargetNames2, c28385so4);
                    for (int size3 = sharedElementTargetNames2.size() - 1; size3 >= 0; size3--) {
                        String str5 = sharedElementTargetNames2.get(size3);
                        View view11 = c28385so4.get(str5);
                        if (view11 == null) {
                            String m114819b2 = C31830Ay1.m114819b(c28385so2, str5);
                            if (m114819b2 != null) {
                                c28385so2.remove(m114819b2);
                            }
                        } else if (!str5.equals(C38790bq6.m62530M(view11)) && (m114819b = C31830Ay1.m114819b(c28385so2, str5)) != null) {
                            c28385so2.put(m114819b, C38790bq6.m62530M(view11));
                        }
                    }
                } else {
                    C31830Ay1.m114817d(c28385so2, c28385so4);
                }
                m67235v(c28385so3, c28385so2.keySet());
                m67235v(c28385so4, c28385so2.values());
                if (c28385so2.isEmpty()) {
                    arrayList7.clear();
                    arrayList8.clear();
                    c28385so = c28385so2;
                    arrayList4 = arrayList8;
                    c11693e4 = c11693e6;
                    c11693e5 = c11693e7;
                    arrayList3 = arrayList7;
                    abstractC32298Cy1 = abstractC32298Cy12;
                    view7 = view8;
                    view3 = view9;
                    hashMap = hashMap3;
                    rect = rect3;
                    obj4 = null;
                } else {
                    C31830Ay1.m114820a(c11693e2.m67068f(), c11693e.m67068f(), z4, c28385so3, true);
                    c28385so = c28385so2;
                    ArrayList<View> arrayList10 = arrayList8;
                    ViewTreeObserver$OnPreDrawListenerC32615Eh3.m108576a(m67079m(), new RunnableC11656g(c11693e2, c11693e, z, c28385so4));
                    arrayList7.addAll(c28385so3.values());
                    if (!arrayList5.isEmpty()) {
                        i = 0;
                        View view12 = c28385so3.get(arrayList5.get(0));
                        abstractC32298Cy12.mo65812p(mo65809u, view12);
                        view7 = view12;
                    } else {
                        i = 0;
                        view7 = view8;
                    }
                    arrayList10.addAll(c28385so4.values());
                    if (!sharedElementTargetNames2.isEmpty() && (view5 = c28385so4.get(sharedElementTargetNames2.get(i))) != null) {
                        rect = rect3;
                        ViewTreeObserver$OnPreDrawListenerC32615Eh3.m108576a(m67079m(), new RunnableC11657h(abstractC32298Cy12, view5, rect));
                        view4 = view9;
                        z5 = true;
                    } else {
                        rect = rect3;
                        view4 = view9;
                    }
                    abstractC32298Cy12.mo65811s(mo65809u, view4, arrayList7);
                    arrayList3 = arrayList7;
                    view3 = view4;
                    obj4 = mo65809u;
                    abstractC32298Cy1 = abstractC32298Cy12;
                    abstractC32298Cy12.mo65814n(mo65809u, null, null, null, null, obj4, arrayList10);
                    Boolean bool = Boolean.TRUE;
                    c11693e4 = c11693e;
                    arrayList4 = arrayList10;
                    hashMap = hashMap3;
                    hashMap.put(c11693e4, bool);
                    c11693e5 = c11693e2;
                    hashMap.put(c11693e5, bool);
                }
            } else {
                c28385so = c28385so2;
                c11693e4 = c11693e6;
                c11693e5 = c11693e7;
                hashMap = hashMap2;
                arrayList3 = arrayList7;
                view3 = view6;
                abstractC32298Cy1 = abstractC32298Cy12;
                arrayList4 = arrayList8;
                rect = rect2;
                view7 = view7;
            }
            rect2 = rect;
            arrayList7 = arrayList3;
            view6 = view3;
            arrayList8 = arrayList4;
            abstractC32298Cy12 = abstractC32298Cy1;
            z4 = z;
            c11693e7 = c11693e5;
            hashMap2 = hashMap;
            c11693e6 = c11693e4;
            c28385so2 = c28385so;
        }
        View view13 = view7;
        C28385so c28385so5 = c28385so2;
        AbstractC11688o.C11693e c11693e8 = c11693e6;
        AbstractC11688o.C11693e c11693e9 = c11693e7;
        HashMap hashMap4 = hashMap2;
        Collection<?> collection = arrayList7;
        View view14 = view6;
        AbstractC32298Cy1 abstractC32298Cy13 = abstractC32298Cy12;
        Collection<?> collection2 = arrayList8;
        Rect rect4 = rect2;
        ArrayList arrayList11 = new ArrayList();
        Object obj5 = null;
        Object obj6 = null;
        for (C11662m c11662m3 : list) {
            if (c11662m3.m67227d()) {
                hashMap4.put(c11662m3.m67229b(), Boolean.FALSE);
                c11662m3.m67230a();
            } else {
                Object mo65818f = abstractC32298Cy13.mo65818f(c11662m3.m67223h());
                AbstractC11688o.C11693e m67229b = c11662m3.m67229b();
                if (obj4 != null && (m67229b == c11693e8 || m67229b == c11693e9)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (mo65818f == null) {
                    if (!z3) {
                        hashMap4.put(m67229b, Boolean.FALSE);
                        c11662m3.m67230a();
                    }
                    str3 = str;
                    arrayList = collection;
                    view = view14;
                    arrayList2 = collection2;
                    obj = obj5;
                    view2 = view13;
                } else {
                    str3 = str;
                    ArrayList<View> arrayList12 = new ArrayList<>();
                    Object obj7 = obj5;
                    m67237t(arrayList12, m67229b.m67068f().mView);
                    if (z3) {
                        if (m67229b == c11693e8) {
                            arrayList12.removeAll(collection);
                        } else {
                            arrayList12.removeAll(collection2);
                        }
                    }
                    if (arrayList12.isEmpty()) {
                        abstractC32298Cy13.mo65822a(mo65818f, view14);
                        arrayList = collection;
                        view = view14;
                        arrayList2 = collection2;
                        c11693e3 = m67229b;
                        obj2 = obj6;
                        obj3 = mo65818f;
                        obj = obj7;
                    } else {
                        abstractC32298Cy13.mo65821b(mo65818f, arrayList12);
                        view = view14;
                        obj = obj7;
                        arrayList = collection;
                        obj2 = obj6;
                        arrayList2 = collection2;
                        obj3 = mo65818f;
                        abstractC32298Cy13.mo65814n(mo65818f, mo65818f, arrayList12, null, null, null, null);
                        if (m67229b.m67069e() == AbstractC11688o.C11693e.EnumC11696c.GONE) {
                            c11693e3 = m67229b;
                            list2.remove(c11693e3);
                            ArrayList<View> arrayList13 = new ArrayList<>(arrayList12);
                            arrayList13.remove(c11693e3.m67068f().mView);
                            abstractC32298Cy13.mo65815m(obj3, c11693e3.m67068f().mView, arrayList13);
                            ViewTreeObserver$OnPreDrawListenerC32615Eh3.m108576a(m67079m(), new RunnableC11658i(arrayList12));
                        } else {
                            c11693e3 = m67229b;
                        }
                    }
                    if (c11693e3.m67069e() == AbstractC11688o.C11693e.EnumC11696c.VISIBLE) {
                        arrayList11.addAll(arrayList12);
                        if (z5) {
                            abstractC32298Cy13.mo65813o(obj3, rect4);
                        }
                        view2 = view13;
                    } else {
                        view2 = view13;
                        abstractC32298Cy13.mo65812p(obj3, view2);
                    }
                    hashMap4.put(c11693e3, Boolean.TRUE);
                    if (c11662m3.m67221j()) {
                        obj2 = abstractC32298Cy13.mo65816k(obj2, obj3, null);
                    } else {
                        obj = abstractC32298Cy13.mo65816k(obj, obj3, null);
                    }
                    obj6 = obj2;
                }
                view13 = view2;
                obj5 = obj;
                str = str3;
                view14 = view;
                collection = arrayList;
                collection2 = arrayList2;
            }
        }
        String str6 = str;
        ArrayList<View> arrayList14 = collection;
        ArrayList<View> arrayList15 = collection2;
        Object mo65817j = abstractC32298Cy13.mo65817j(obj6, obj5, obj4);
        if (mo65817j == null) {
            return hashMap4;
        }
        for (C11662m c11662m4 : list) {
            if (!c11662m4.m67227d()) {
                Object m67223h = c11662m4.m67223h();
                AbstractC11688o.C11693e m67229b2 = c11662m4.m67229b();
                if (obj4 != null && (m67229b2 == c11693e8 || m67229b2 == c11693e9)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (m67223h == null && !z2) {
                    str2 = str6;
                } else if (!C38790bq6.m62504Z(m67079m())) {
                    if (FragmentManager.m67384N0(2)) {
                        str2 = str6;
                        Log.v(str2, "SpecialEffectsController: Container " + m67079m() + " has not been laid out. Completing operation " + m67229b2);
                    } else {
                        str2 = str6;
                    }
                    c11662m4.m67230a();
                } else {
                    str2 = str6;
                    abstractC32298Cy13.mo111190q(c11662m4.m67229b().m67068f(), mo65817j, c11662m4.m67228c(), new RunnableC11659j(c11662m4, m67229b2));
                }
                str6 = str2;
            }
        }
        String str7 = str6;
        if (!C38790bq6.m62504Z(m67079m())) {
            return hashMap4;
        }
        C31830Ay1.m114816e(arrayList11, 4);
        ArrayList<String> m111191l = abstractC32298Cy13.m111191l(arrayList15);
        if (FragmentManager.m67384N0(2)) {
            Log.v(str7, ">>>>> Beginning transition <<<<<");
            Log.v(str7, ">>>>> SharedElementFirstOutViews <<<<<");
            Iterator<View> it4 = arrayList14.iterator();
            while (it4.hasNext()) {
                Log.v(str7, "View: " + it4.next() + " Name: " + C38790bq6.m62530M(next2));
            }
            Log.v(str7, ">>>>> SharedElementLastInViews <<<<<");
            Iterator<View> it5 = arrayList15.iterator();
            while (it5.hasNext()) {
                Log.v(str7, "View: " + it5.next() + " Name: " + C38790bq6.m62530M(next));
            }
        }
        abstractC32298Cy13.mo65820c(m67079m(), mo65817j);
        abstractC32298Cy13.m111189r(m67079m(), arrayList14, arrayList15, m111191l, c28385so5);
        C31830Ay1.m114816e(arrayList11, 0);
        abstractC32298Cy13.mo65810t(obj4, arrayList14, arrayList15);
        return hashMap4;
    }

    /* renamed from: y */
    public final void m67232y(List<AbstractC11688o.C11693e> list) {
        Fragment m67068f = list.get(list.size() - 1).m67068f();
        for (AbstractC11688o.C11693e c11693e : list) {
            c11693e.m67068f().mAnimationInfo.f54518c = m67068f.mAnimationInfo.f54518c;
            c11693e.m67068f().mAnimationInfo.f54519d = m67068f.mAnimationInfo.f54519d;
            c11693e.m67068f().mAnimationInfo.f54520e = m67068f.mAnimationInfo.f54520e;
            c11693e.m67068f().mAnimationInfo.f54521f = m67068f.mAnimationInfo.f54521f;
        }
    }
}

package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import kotlin.jvm.internal.LongCompanionObject;
/* loaded from: classes.dex */
public abstract class Transition implements Cloneable {

    /* renamed from: I */
    public static final int[] f55901I = {2, 1, 3, 4};

    /* renamed from: J */
    public static final PathMotion f55902J = new C12038a();

    /* renamed from: K */
    public static ThreadLocal<C28385so<Animator, C12041d>> f55903K = new ThreadLocal<>();

    /* renamed from: E */
    public L96 f55908E;

    /* renamed from: F */
    public AbstractC12042e f55909F;

    /* renamed from: G */
    public C28385so<String, String> f55910G;

    /* renamed from: u */
    public ArrayList<N96> f55931u;

    /* renamed from: v */
    public ArrayList<N96> f55932v;

    /* renamed from: b */
    public String f55912b = getClass().getName();

    /* renamed from: c */
    public long f55913c = -1;

    /* renamed from: d */
    public long f55914d = -1;

    /* renamed from: e */
    public TimeInterpolator f55915e = null;

    /* renamed from: f */
    public ArrayList<Integer> f55916f = new ArrayList<>();

    /* renamed from: g */
    public ArrayList<View> f55917g = new ArrayList<>();

    /* renamed from: h */
    public ArrayList<String> f55918h = null;

    /* renamed from: i */
    public ArrayList<Class<?>> f55919i = null;

    /* renamed from: j */
    public ArrayList<Integer> f55920j = null;

    /* renamed from: k */
    public ArrayList<View> f55921k = null;

    /* renamed from: l */
    public ArrayList<Class<?>> f55922l = null;

    /* renamed from: m */
    public ArrayList<String> f55923m = null;

    /* renamed from: n */
    public ArrayList<Integer> f55924n = null;

    /* renamed from: o */
    public ArrayList<View> f55925o = null;

    /* renamed from: p */
    public ArrayList<Class<?>> f55926p = null;

    /* renamed from: q */
    public O96 f55927q = new O96();

    /* renamed from: r */
    public O96 f55928r = new O96();

    /* renamed from: s */
    public TransitionSet f55929s = null;

    /* renamed from: t */
    public int[] f55930t = f55901I;

    /* renamed from: w */
    public ViewGroup f55933w = null;

    /* renamed from: x */
    public boolean f55934x = false;

    /* renamed from: y */
    public ArrayList<Animator> f55935y = new ArrayList<>();

    /* renamed from: z */
    public int f55936z = 0;

    /* renamed from: A */
    public boolean f55904A = false;

    /* renamed from: B */
    public boolean f55905B = false;

    /* renamed from: C */
    public ArrayList<InterfaceC12043f> f55906C = null;

    /* renamed from: D */
    public ArrayList<Animator> f55907D = new ArrayList<>();

    /* renamed from: H */
    public PathMotion f55911H = f55902J;

    /* renamed from: androidx.transition.Transition$a */
    /* loaded from: classes.dex */
    public static class C12038a extends PathMotion {
        @Override // androidx.transition.PathMotion
        /* renamed from: a */
        public Path mo65872a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: androidx.transition.Transition$b */
    /* loaded from: classes.dex */
    public class C12039b extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ C28385so f55937a;

        public C12039b(C28385so c28385so) {
            this.f55937a = c28385so;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f55937a.remove(animator);
            Transition.this.f55935y.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Transition.this.f55935y.add(animator);
        }
    }

    /* renamed from: androidx.transition.Transition$c */
    /* loaded from: classes.dex */
    public class C12040c extends AnimatorListenerAdapter {
        public C12040c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Transition.this.m65875w();
            animator.removeListener(this);
        }
    }

    /* renamed from: androidx.transition.Transition$d */
    /* loaded from: classes.dex */
    public static class C12041d {

        /* renamed from: a */
        public View f55940a;

        /* renamed from: b */
        public String f55941b;

        /* renamed from: c */
        public N96 f55942c;

        /* renamed from: d */
        public InterfaceC44945mB6 f55943d;

        /* renamed from: e */
        public Transition f55944e;

        public C12041d(View view, String str, Transition transition, InterfaceC44945mB6 interfaceC44945mB6, N96 n96) {
            this.f55940a = view;
            this.f55941b = str;
            this.f55942c = n96;
            this.f55943d = interfaceC44945mB6;
            this.f55944e = transition;
        }
    }

    /* renamed from: androidx.transition.Transition$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC12042e {
        /* renamed from: a */
        public abstract Rect mo65806a(Transition transition);
    }

    /* renamed from: androidx.transition.Transition$f */
    /* loaded from: classes.dex */
    public interface InterfaceC12043f {
        void onTransitionCancel(Transition transition);

        void onTransitionEnd(Transition transition);

        void onTransitionPause(Transition transition);

        void onTransitionResume(Transition transition);

        void onTransitionStart(Transition transition);
    }

    public Transition() {
    }

    /* renamed from: J */
    public static C28385so<Animator, C12041d> m65901J() {
        C28385so<Animator, C12041d> c28385so = f55903K.get();
        if (c28385so == null) {
            C28385so<Animator, C12041d> c28385so2 = new C28385so<>();
            f55903K.set(c28385so2);
            return c28385so2;
        }
        return c28385so;
    }

    /* renamed from: W */
    public static boolean m65894W(int i) {
        return i >= 1 && i <= 4;
    }

    /* renamed from: Y */
    public static boolean m65892Y(N96 n96, N96 n962, String str) {
        Object obj = n96.f24199a.get(str);
        Object obj2 = n962.f24199a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* renamed from: e0 */
    public static int[] m65886e0(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        int[] iArr = new int[stringTokenizer.countTokens()];
        int i = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String trim = stringTokenizer.nextToken().trim();
            if ("id".equalsIgnoreCase(trim)) {
                iArr[i] = 3;
            } else if ("instance".equalsIgnoreCase(trim)) {
                iArr[i] = 1;
            } else if ("name".equalsIgnoreCase(trim)) {
                iArr[i] = 2;
            } else if ("itemId".equalsIgnoreCase(trim)) {
                iArr[i] = 4;
            } else if (trim.isEmpty()) {
                int[] iArr2 = new int[iArr.length - 1];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                i--;
                iArr = iArr2;
            } else {
                throw new InflateException("Unknown match type in matchOrder: '" + trim + "'");
            }
            i++;
        }
        return iArr;
    }

    /* renamed from: g */
    public static void m65884g(O96 o96, View view, N96 n96) {
        o96.f26079a.put(view, n96);
        int id = view.getId();
        if (id >= 0) {
            if (o96.f26080b.indexOfKey(id) >= 0) {
                o96.f26080b.put(id, null);
            } else {
                o96.f26080b.put(id, view);
            }
        }
        String m62530M = C38790bq6.m62530M(view);
        if (m62530M != null) {
            if (o96.f26082d.containsKey(m62530M)) {
                o96.f26082d.put(m62530M, null);
            } else {
                o96.f26082d.put(m62530M, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (o96.f26081c.m20194k(itemIdAtPosition) >= 0) {
                    View m20196h = o96.f26081c.m20196h(itemIdAtPosition);
                    if (m20196h != null) {
                        C38790bq6.m62541G0(m20196h, false);
                        o96.f26081c.m20191n(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                C38790bq6.m62541G0(view, true);
                o96.f26081c.m20191n(itemIdAtPosition, view);
            }
        }
    }

    /* renamed from: h */
    public static boolean m65882h(int[] iArr, int i) {
        int i2 = iArr[i];
        for (int i3 = 0; i3 < i; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: A */
    public Rect m65908A() {
        AbstractC12042e abstractC12042e = this.f55909F;
        if (abstractC12042e == null) {
            return null;
        }
        return abstractC12042e.mo65806a(this);
    }

    /* renamed from: B */
    public AbstractC12042e m65907B() {
        return this.f55909F;
    }

    /* renamed from: C */
    public TimeInterpolator m65906C() {
        return this.f55915e;
    }

    /* renamed from: D */
    public N96 m65905D(View view, boolean z) {
        ArrayList<N96> arrayList;
        ArrayList<N96> arrayList2;
        TransitionSet transitionSet = this.f55929s;
        if (transitionSet != null) {
            return transitionSet.m65905D(view, z);
        }
        if (z) {
            arrayList = this.f55931u;
        } else {
            arrayList = this.f55932v;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                N96 n96 = arrayList.get(i);
                if (n96 == null) {
                    return null;
                }
                if (n96.f24200b == view) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            return null;
        }
        if (z) {
            arrayList2 = this.f55932v;
        } else {
            arrayList2 = this.f55931u;
        }
        return arrayList2.get(i);
    }

    /* renamed from: G */
    public String m65904G() {
        return this.f55912b;
    }

    /* renamed from: H */
    public PathMotion m65903H() {
        return this.f55911H;
    }

    /* renamed from: I */
    public L96 m65902I() {
        return this.f55908E;
    }

    /* renamed from: M */
    public long m65900M() {
        return this.f55913c;
    }

    /* renamed from: N */
    public List<Integer> m65899N() {
        return this.f55916f;
    }

    /* renamed from: O */
    public List<String> m65898O() {
        return this.f55918h;
    }

    /* renamed from: P */
    public List<Class<?>> m65897P() {
        return this.f55919i;
    }

    /* renamed from: Q */
    public List<View> m65896Q() {
        return this.f55917g;
    }

    /* renamed from: S */
    public String[] mo65829S() {
        return null;
    }

    /* renamed from: U */
    public N96 m65895U(View view, boolean z) {
        O96 o96;
        TransitionSet transitionSet = this.f55929s;
        if (transitionSet != null) {
            return transitionSet.m65895U(view, z);
        }
        if (z) {
            o96 = this.f55927q;
        } else {
            o96 = this.f55928r;
        }
        return o96.f26079a.get(view);
    }

    /* renamed from: V */
    public boolean mo65828V(N96 n96, N96 n962) {
        if (n96 == null || n962 == null) {
            return false;
        }
        String[] mo65829S = mo65829S();
        if (mo65829S != null) {
            for (String str : mo65829S) {
                if (!m65892Y(n96, n962, str)) {
                }
            }
            return false;
        }
        for (String str2 : n96.f24199a.keySet()) {
            if (m65892Y(n96, n962, str2)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: X */
    public boolean m65893X(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.f55920j;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.f55921k;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.f55922l;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.f55922l.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f55923m != null && C38790bq6.m62530M(view) != null && this.f55923m.contains(C38790bq6.m62530M(view))) {
            return false;
        }
        if ((this.f55916f.size() == 0 && this.f55917g.size() == 0 && (((arrayList = this.f55919i) == null || arrayList.isEmpty()) && ((arrayList2 = this.f55918h) == null || arrayList2.isEmpty()))) || this.f55916f.contains(Integer.valueOf(id)) || this.f55917g.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f55918h;
        if (arrayList6 != null && arrayList6.contains(C38790bq6.m62530M(view))) {
            return true;
        }
        if (this.f55919i != null) {
            for (int i2 = 0; i2 < this.f55919i.size(); i2++) {
                if (this.f55919i.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: Z */
    public final void m65891Z(C28385so<View, N96> c28385so, C28385so<View, N96> c28385so2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View valueAt = sparseArray.valueAt(i);
            if (valueAt != null && m65893X(valueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && m65893X(view)) {
                N96 n96 = c28385so.get(valueAt);
                N96 n962 = c28385so2.get(view);
                if (n96 != null && n962 != null) {
                    this.f55931u.add(n96);
                    this.f55932v.add(n962);
                    c28385so.remove(valueAt);
                    c28385so2.remove(view);
                }
            }
        }
    }

    /* renamed from: a0 */
    public final void m65890a0(C28385so<View, N96> c28385so, C28385so<View, N96> c28385so2) {
        N96 remove;
        for (int size = c28385so.size() - 1; size >= 0; size--) {
            View m94264i = c28385so.m94264i(size);
            if (m94264i != null && m65893X(m94264i) && (remove = c28385so2.remove(m94264i)) != null && m65893X(remove.f24200b)) {
                this.f55931u.add(c28385so.mo34405k(size));
                this.f55932v.add(remove);
            }
        }
    }

    /* renamed from: b0 */
    public final void m65889b0(C28385so<View, N96> c28385so, C28385so<View, N96> c28385so2, C46602oz2<View> c46602oz2, C46602oz2<View> c46602oz22) {
        View m20196h;
        int size = c46602oz2.size();
        for (int i = 0; i < size; i++) {
            View m20188q = c46602oz2.m20188q(i);
            if (m20188q != null && m65893X(m20188q) && (m20196h = c46602oz22.m20196h(c46602oz2.m20192m(i))) != null && m65893X(m20196h)) {
                N96 n96 = c28385so.get(m20188q);
                N96 n962 = c28385so2.get(m20196h);
                if (n96 != null && n962 != null) {
                    this.f55931u.add(n96);
                    this.f55932v.add(n962);
                    c28385so.remove(m20188q);
                    c28385so2.remove(m20196h);
                }
            }
        }
    }

    /* renamed from: c0 */
    public final void m65888c0(C28385so<View, N96> c28385so, C28385so<View, N96> c28385so2, C28385so<String, View> c28385so3, C28385so<String, View> c28385so4) {
        View view;
        int size = c28385so3.size();
        for (int i = 0; i < size; i++) {
            View m94263m = c28385so3.m94263m(i);
            if (m94263m != null && m65893X(m94263m) && (view = c28385so4.get(c28385so3.m94264i(i))) != null && m65893X(view)) {
                N96 n96 = c28385so.get(m94263m);
                N96 n962 = c28385so2.get(view);
                if (n96 != null && n962 != null) {
                    this.f55931u.add(n96);
                    this.f55932v.add(n962);
                    c28385so.remove(m94263m);
                    c28385so2.remove(view);
                }
            }
        }
    }

    public void cancel() {
        for (int size = this.f55935y.size() - 1; size >= 0; size--) {
            this.f55935y.get(size).cancel();
        }
        ArrayList<InterfaceC12043f> arrayList = this.f55906C;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f55906C.clone();
            int size2 = arrayList2.size();
            for (int i = 0; i < size2; i++) {
                ((InterfaceC12043f) arrayList2.get(i)).onTransitionCancel(this);
            }
        }
    }

    /* renamed from: d */
    public Transition mo65857d(InterfaceC12043f interfaceC12043f) {
        if (this.f55906C == null) {
            this.f55906C = new ArrayList<>();
        }
        this.f55906C.add(interfaceC12043f);
        return this;
    }

    /* renamed from: d0 */
    public final void m65887d0(O96 o96, O96 o962) {
        C28385so<View, N96> c28385so = new C28385so<>(o96.f26079a);
        C28385so<View, N96> c28385so2 = new C28385so<>(o962.f26079a);
        int i = 0;
        while (true) {
            int[] iArr = this.f55930t;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                m65889b0(c28385so, c28385so2, o96.f26081c, o962.f26081c);
                            }
                        } else {
                            m65891Z(c28385so, c28385so2, o96.f26080b, o962.f26080b);
                        }
                    } else {
                        m65888c0(c28385so, c28385so2, o96.f26082d, o962.f26082d);
                    }
                } else {
                    m65890a0(c28385so, c28385so2);
                }
                i++;
            } else {
                m65885f(c28385so, c28385so2);
                return;
            }
        }
    }

    /* renamed from: e */
    public Transition mo65856e(View view) {
        this.f55917g.add(view);
        return this;
    }

    /* renamed from: f */
    public final void m65885f(C28385so<View, N96> c28385so, C28385so<View, N96> c28385so2) {
        for (int i = 0; i < c28385so.size(); i++) {
            N96 m94263m = c28385so.m94263m(i);
            if (m65893X(m94263m.f24200b)) {
                this.f55931u.add(m94263m);
                this.f55932v.add(null);
            }
        }
        for (int i2 = 0; i2 < c28385so2.size(); i2++) {
            N96 m94263m2 = c28385so2.m94263m(i2);
            if (m65893X(m94263m2.f24200b)) {
                this.f55932v.add(m94263m2);
                this.f55931u.add(null);
            }
        }
    }

    /* renamed from: f0 */
    public void mo65855f0(View view) {
        if (!this.f55905B) {
            C28385so<Animator, C12041d> m65901J = m65901J();
            int size = m65901J.size();
            InterfaceC44945mB6 m76168d = C37172Xt6.m76168d(view);
            for (int i = size - 1; i >= 0; i--) {
                C12041d m94263m = m65901J.m94263m(i);
                if (m94263m.f55940a != null && m76168d.equals(m94263m.f55943d)) {
                    C1112Cf.m111927b(m65901J.m94264i(i));
                }
            }
            ArrayList<InterfaceC12043f> arrayList = this.f55906C;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f55906C.clone();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((InterfaceC12043f) arrayList2.get(i2)).onTransitionPause(this);
                }
            }
            this.f55904A = true;
        }
    }

    /* renamed from: g0 */
    public void m65883g0(ViewGroup viewGroup) {
        C12041d c12041d;
        boolean z;
        this.f55931u = new ArrayList<>();
        this.f55932v = new ArrayList<>();
        m65887d0(this.f55927q, this.f55928r);
        C28385so<Animator, C12041d> m65901J = m65901J();
        int size = m65901J.size();
        InterfaceC44945mB6 m76168d = C37172Xt6.m76168d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator m94264i = m65901J.m94264i(i);
            if (m94264i != null && (c12041d = m65901J.get(m94264i)) != null && c12041d.f55940a != null && m76168d.equals(c12041d.f55943d)) {
                N96 n96 = c12041d.f55942c;
                View view = c12041d.f55940a;
                N96 m65895U = m65895U(view, true);
                N96 m65905D = m65905D(view, true);
                if (m65895U == null && m65905D == null) {
                    m65905D = this.f55928r.f26079a.get(view);
                }
                if ((m65895U != null || m65905D != null) && c12041d.f55944e.mo65828V(n96, m65905D)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (!m94264i.isRunning() && !m94264i.isStarted()) {
                        m65901J.remove(m94264i);
                    } else {
                        m94264i.cancel();
                    }
                }
            }
        }
        mo65844t(viewGroup, this.f55927q, this.f55928r, this.f55931u, this.f55932v);
        mo65850n0();
    }

    /* renamed from: h0 */
    public Transition mo65854h0(InterfaceC12043f interfaceC12043f) {
        ArrayList<InterfaceC12043f> arrayList = this.f55906C;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(interfaceC12043f);
        if (this.f55906C.size() == 0) {
            this.f55906C = null;
        }
        return this;
    }

    /* renamed from: i0 */
    public Transition mo65853i0(View view) {
        this.f55917g.remove(view);
        return this;
    }

    /* renamed from: j */
    public void m65881j(Animator animator) {
        if (animator == null) {
            m65875w();
            return;
        }
        if (m65873z() >= 0) {
            animator.setDuration(m65873z());
        }
        if (m65900M() >= 0) {
            animator.setStartDelay(m65900M() + animator.getStartDelay());
        }
        if (m65906C() != null) {
            animator.setInterpolator(m65906C());
        }
        animator.addListener(new C12040c());
        animator.start();
    }

    /* renamed from: k */
    public abstract void mo65827k(N96 n96);

    /* renamed from: k0 */
    public void mo65852k0(View view) {
        if (this.f55904A) {
            if (!this.f55905B) {
                C28385so<Animator, C12041d> m65901J = m65901J();
                int size = m65901J.size();
                InterfaceC44945mB6 m76168d = C37172Xt6.m76168d(view);
                for (int i = size - 1; i >= 0; i--) {
                    C12041d m94263m = m65901J.m94263m(i);
                    if (m94263m.f55940a != null && m76168d.equals(m94263m.f55943d)) {
                        C1112Cf.m111926c(m65901J.m94264i(i));
                    }
                }
                ArrayList<InterfaceC12043f> arrayList = this.f55906C;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f55906C.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((InterfaceC12043f) arrayList2.get(i2)).onTransitionResume(this);
                    }
                }
            }
            this.f55904A = false;
        }
    }

    /* renamed from: l */
    public final void m65880l(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f55920j;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id))) {
            return;
        }
        ArrayList<View> arrayList2 = this.f55921k;
        if (arrayList2 != null && arrayList2.contains(view)) {
            return;
        }
        ArrayList<Class<?>> arrayList3 = this.f55922l;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                if (this.f55922l.get(i).isInstance(view)) {
                    return;
                }
            }
        }
        if (view.getParent() instanceof ViewGroup) {
            N96 n96 = new N96(view);
            if (z) {
                mo65826n(n96);
            } else {
                mo65827k(n96);
            }
            n96.f24201c.add(this);
            mo65851m(n96);
            if (z) {
                m65884g(this.f55927q, view, n96);
            } else {
                m65884g(this.f55928r, view, n96);
            }
        }
        if (view instanceof ViewGroup) {
            ArrayList<Integer> arrayList4 = this.f55924n;
            if (arrayList4 != null && arrayList4.contains(Integer.valueOf(id))) {
                return;
            }
            ArrayList<View> arrayList5 = this.f55925o;
            if (arrayList5 != null && arrayList5.contains(view)) {
                return;
            }
            ArrayList<Class<?>> arrayList6 = this.f55926p;
            if (arrayList6 != null) {
                int size2 = arrayList6.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if (this.f55926p.get(i2).isInstance(view)) {
                        return;
                    }
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                m65880l(viewGroup.getChildAt(i3), z);
            }
        }
    }

    /* renamed from: l0 */
    public final void m65879l0(Animator animator, C28385so<Animator, C12041d> c28385so) {
        if (animator != null) {
            animator.addListener(new C12039b(c28385so));
            m65881j(animator);
        }
    }

    /* renamed from: m */
    public void mo65851m(N96 n96) {
        String[] mo97642b;
        if (this.f55908E == null || n96.f24199a.isEmpty() || (mo97642b = this.f55908E.mo97642b()) == null) {
            return;
        }
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < mo97642b.length) {
                if (!n96.f24199a.containsKey(mo97642b[i])) {
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        if (!z) {
            this.f55908E.mo97643a(n96);
        }
    }

    /* renamed from: n */
    public abstract void mo65826n(N96 n96);

    /* renamed from: n0 */
    public void mo65850n0() {
        m65874y0();
        C28385so<Animator, C12041d> m65901J = m65901J();
        Iterator<Animator> it = this.f55907D.iterator();
        while (it.hasNext()) {
            Animator next = it.next();
            if (m65901J.containsKey(next)) {
                m65874y0();
                m65879l0(next, m65901J);
            }
        }
        this.f55907D.clear();
        m65875w();
    }

    /* renamed from: o */
    public void m65878o(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        C28385so<String, String> c28385so;
        m65877p(z);
        if ((this.f55916f.size() <= 0 && this.f55917g.size() <= 0) || (((arrayList = this.f55918h) != null && !arrayList.isEmpty()) || ((arrayList2 = this.f55919i) != null && !arrayList2.isEmpty()))) {
            m65880l(viewGroup, z);
        } else {
            for (int i = 0; i < this.f55916f.size(); i++) {
                View findViewById = viewGroup.findViewById(this.f55916f.get(i).intValue());
                if (findViewById != null) {
                    N96 n96 = new N96(findViewById);
                    if (z) {
                        mo65826n(n96);
                    } else {
                        mo65827k(n96);
                    }
                    n96.f24201c.add(this);
                    mo65851m(n96);
                    if (z) {
                        m65884g(this.f55927q, findViewById, n96);
                    } else {
                        m65884g(this.f55928r, findViewById, n96);
                    }
                }
            }
            for (int i2 = 0; i2 < this.f55917g.size(); i2++) {
                View view = this.f55917g.get(i2);
                N96 n962 = new N96(view);
                if (z) {
                    mo65826n(n962);
                } else {
                    mo65827k(n962);
                }
                n962.f24201c.add(this);
                mo65851m(n962);
                if (z) {
                    m65884g(this.f55927q, view, n962);
                } else {
                    m65884g(this.f55928r, view, n962);
                }
            }
        }
        if (!z && (c28385so = this.f55910G) != null) {
            int size = c28385so.size();
            ArrayList arrayList3 = new ArrayList(size);
            for (int i3 = 0; i3 < size; i3++) {
                arrayList3.add(this.f55927q.f26082d.remove(this.f55910G.m94264i(i3)));
            }
            for (int i4 = 0; i4 < size; i4++) {
                View view2 = (View) arrayList3.get(i4);
                if (view2 != null) {
                    this.f55927q.f26082d.put(this.f55910G.m94263m(i4), view2);
                }
            }
        }
    }

    /* renamed from: o0 */
    public void mo65849o0(boolean z) {
        this.f55934x = z;
    }

    /* renamed from: p */
    public void m65877p(boolean z) {
        if (z) {
            this.f55927q.f26079a.clear();
            this.f55927q.f26080b.clear();
            this.f55927q.f26081c.m20200d();
            return;
        }
        this.f55928r.f26079a.clear();
        this.f55928r.f26080b.clear();
        this.f55928r.f26081c.m20200d();
    }

    @Override // 
    /* renamed from: q */
    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.f55907D = new ArrayList<>();
            transition.f55927q = new O96();
            transition.f55928r = new O96();
            transition.f55931u = null;
            transition.f55932v = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: q0 */
    public Transition mo65847q0(long j) {
        this.f55914d = j;
        return this;
    }

    /* renamed from: r */
    public Animator mo65825r(ViewGroup viewGroup, N96 n96, N96 n962) {
        return null;
    }

    /* renamed from: r0 */
    public void mo65846r0(AbstractC12042e abstractC12042e) {
        this.f55909F = abstractC12042e;
    }

    /* renamed from: s0 */
    public Transition mo65845s0(TimeInterpolator timeInterpolator) {
        this.f55915e = timeInterpolator;
        return this;
    }

    /* renamed from: t */
    public void mo65844t(ViewGroup viewGroup, O96 o96, O96 o962, ArrayList<N96> arrayList, ArrayList<N96> arrayList2) {
        boolean z;
        Animator mo65825r;
        int i;
        View view;
        Animator animator;
        N96 n96;
        Animator animator2;
        N96 n962;
        C28385so<Animator, C12041d> m65901J = m65901J();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = LongCompanionObject.MAX_VALUE;
        int i2 = 0;
        while (i2 < size) {
            N96 n963 = arrayList.get(i2);
            N96 n964 = arrayList2.get(i2);
            if (n963 != null && !n963.f24201c.contains(this)) {
                n963 = null;
            }
            if (n964 != null && !n964.f24201c.contains(this)) {
                n964 = null;
            }
            if (n963 != null || n964 != null) {
                if (n963 != null && n964 != null && !mo65828V(n963, n964)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && (mo65825r = mo65825r(viewGroup, n963, n964)) != null) {
                    if (n964 != null) {
                        view = n964.f24200b;
                        String[] mo65829S = mo65829S();
                        if (mo65829S != null && mo65829S.length > 0) {
                            n962 = new N96(view);
                            i = size;
                            N96 n965 = o962.f26079a.get(view);
                            if (n965 != null) {
                                int i3 = 0;
                                while (i3 < mo65829S.length) {
                                    Map<String, Object> map = n962.f24199a;
                                    String str = mo65829S[i3];
                                    map.put(str, n965.f24199a.get(str));
                                    i3++;
                                    mo65829S = mo65829S;
                                }
                            }
                            int size2 = m65901J.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 < size2) {
                                    C12041d c12041d = m65901J.get(m65901J.m94264i(i4));
                                    if (c12041d.f55942c != null && c12041d.f55940a == view && c12041d.f55941b.equals(m65904G()) && c12041d.f55942c.equals(n962)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i4++;
                                } else {
                                    animator2 = mo65825r;
                                    break;
                                }
                            }
                        } else {
                            i = size;
                            animator2 = mo65825r;
                            n962 = null;
                        }
                        animator = animator2;
                        n96 = n962;
                    } else {
                        i = size;
                        view = n963.f24200b;
                        animator = mo65825r;
                        n96 = null;
                    }
                    if (animator != null) {
                        L96 l96 = this.f55908E;
                        if (l96 != null) {
                            long mo97641c = l96.mo97641c(viewGroup, this, n963, n964);
                            sparseIntArray.put(this.f55907D.size(), (int) mo97641c);
                            j = Math.min(mo97641c, j);
                        }
                        m65901J.put(animator, new C12041d(view, m65904G(), this, C37172Xt6.m76168d(viewGroup), n96));
                        this.f55907D.add(animator);
                        j = j;
                    }
                    i2++;
                    size = i;
                }
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator3 = this.f55907D.get(sparseIntArray.keyAt(i5));
                animator3.setStartDelay((sparseIntArray.valueAt(i5) - j) + animator3.getStartDelay());
            }
        }
    }

    /* renamed from: t0 */
    public void m65876t0(int... iArr) {
        if (iArr != null && iArr.length != 0) {
            for (int i = 0; i < iArr.length; i++) {
                if (m65894W(iArr[i])) {
                    if (m65882h(iArr, i)) {
                        throw new IllegalArgumentException("matches contains a duplicate value");
                    }
                } else {
                    throw new IllegalArgumentException("matches contains invalid value");
                }
            }
            this.f55930t = (int[]) iArr.clone();
            return;
        }
        this.f55930t = f55901I;
    }

    public String toString() {
        return mo65838z0("");
    }

    /* renamed from: u0 */
    public void mo65843u0(PathMotion pathMotion) {
        if (pathMotion == null) {
            this.f55911H = f55902J;
        } else {
            this.f55911H = pathMotion;
        }
    }

    /* renamed from: v0 */
    public void mo65842v0(L96 l96) {
        this.f55908E = l96;
    }

    /* renamed from: w */
    public void m65875w() {
        int i = this.f55936z - 1;
        this.f55936z = i;
        if (i == 0) {
            ArrayList<InterfaceC12043f> arrayList = this.f55906C;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f55906C.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((InterfaceC12043f) arrayList2.get(i2)).onTransitionEnd(this);
                }
            }
            for (int i3 = 0; i3 < this.f55927q.f26081c.size(); i3++) {
                View m20188q = this.f55927q.f26081c.m20188q(i3);
                if (m20188q != null) {
                    C38790bq6.m62541G0(m20188q, false);
                }
            }
            for (int i4 = 0; i4 < this.f55928r.f26081c.size(); i4++) {
                View m20188q2 = this.f55928r.f26081c.m20188q(i4);
                if (m20188q2 != null) {
                    C38790bq6.m62541G0(m20188q2, false);
                }
            }
            this.f55905B = true;
        }
    }

    /* renamed from: w0 */
    public Transition mo65841w0(ViewGroup viewGroup) {
        this.f55933w = viewGroup;
        return this;
    }

    /* renamed from: x0 */
    public Transition mo65840x0(long j) {
        this.f55913c = j;
        return this;
    }

    /* renamed from: y */
    public void mo65839y(ViewGroup viewGroup) {
        C28385so<Animator, C12041d> m65901J = m65901J();
        int size = m65901J.size();
        if (viewGroup != null && size != 0) {
            InterfaceC44945mB6 m76168d = C37172Xt6.m76168d(viewGroup);
            C28385so c28385so = new C28385so(m65901J);
            m65901J.clear();
            for (int i = size - 1; i >= 0; i--) {
                C12041d c12041d = (C12041d) c28385so.m94263m(i);
                if (c12041d.f55940a != null && m76168d != null && m76168d.equals(c12041d.f55943d)) {
                    ((Animator) c28385so.m94264i(i)).end();
                }
            }
        }
    }

    /* renamed from: y0 */
    public void m65874y0() {
        if (this.f55936z == 0) {
            ArrayList<InterfaceC12043f> arrayList = this.f55906C;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f55906C.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((InterfaceC12043f) arrayList2.get(i)).onTransitionStart(this);
                }
            }
            this.f55905B = false;
        }
        this.f55936z++;
    }

    /* renamed from: z */
    public long m65873z() {
        return this.f55914d;
    }

    /* renamed from: z0 */
    public String mo65838z0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f55914d != -1) {
            str2 = str2 + "dur(" + this.f55914d + ") ";
        }
        if (this.f55913c != -1) {
            str2 = str2 + "dly(" + this.f55913c + ") ";
        }
        if (this.f55915e != null) {
            str2 = str2 + "interp(" + this.f55915e + ") ";
        }
        if (this.f55916f.size() > 0 || this.f55917g.size() > 0) {
            String str3 = str2 + "tgts(";
            if (this.f55916f.size() > 0) {
                for (int i = 0; i < this.f55916f.size(); i++) {
                    if (i > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f55916f.get(i);
                }
            }
            if (this.f55917g.size() > 0) {
                for (int i2 = 0; i2 < this.f55917g.size(); i2++) {
                    if (i2 > 0) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + this.f55917g.get(i2);
                }
            }
            return str3 + ")";
        }
        return str2;
    }

    @SuppressLint({"RestrictedApi"})
    public Transition(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, SS5.f33749c);
        XmlResourceParser xmlResourceParser = (XmlResourceParser) attributeSet;
        long m103669g = C33266Hb6.m103669g(obtainStyledAttributes, xmlResourceParser, "duration", 1, -1);
        if (m103669g >= 0) {
            mo65847q0(m103669g);
        }
        long m103669g2 = C33266Hb6.m103669g(obtainStyledAttributes, xmlResourceParser, "startDelay", 2, -1);
        if (m103669g2 > 0) {
            mo65840x0(m103669g2);
        }
        int m103668h = C33266Hb6.m103668h(obtainStyledAttributes, xmlResourceParser, "interpolator", 0, 0);
        if (m103668h > 0) {
            mo65845s0(AnimationUtils.loadInterpolator(context, m103668h));
        }
        String m103667i = C33266Hb6.m103667i(obtainStyledAttributes, xmlResourceParser, "matchOrder", 3);
        if (m103667i != null) {
            m65876t0(m65886e0(m103667i));
        }
        obtainStyledAttributes.recycle();
    }
}

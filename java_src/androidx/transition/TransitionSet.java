package androidx.transition;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class TransitionSet extends Transition {

    /* renamed from: P */
    public ArrayList<Transition> f55945P;

    /* renamed from: Q */
    public boolean f55946Q;

    /* renamed from: R */
    public int f55947R;

    /* renamed from: S */
    public boolean f55948S;

    /* renamed from: T */
    public int f55949T;

    /* renamed from: androidx.transition.TransitionSet$a */
    /* loaded from: classes.dex */
    public class C12044a extends C12054b {

        /* renamed from: a */
        public final /* synthetic */ Transition f55950a;

        public C12044a(Transition transition) {
            this.f55950a = transition;
        }

        @Override // androidx.transition.C12054b, androidx.transition.Transition.InterfaceC12043f
        public void onTransitionEnd(Transition transition) {
            this.f55950a.mo65850n0();
            transition.mo65854h0(this);
        }
    }

    /* renamed from: androidx.transition.TransitionSet$b */
    /* loaded from: classes.dex */
    public static class C12045b extends C12054b {

        /* renamed from: a */
        public TransitionSet f55952a;

        public C12045b(TransitionSet transitionSet) {
            this.f55952a = transitionSet;
        }

        @Override // androidx.transition.C12054b, androidx.transition.Transition.InterfaceC12043f
        public void onTransitionEnd(Transition transition) {
            TransitionSet transitionSet = this.f55952a;
            int i = transitionSet.f55947R - 1;
            transitionSet.f55947R = i;
            if (i == 0) {
                transitionSet.f55948S = false;
                transitionSet.m65875w();
            }
            transition.mo65854h0(this);
        }

        @Override // androidx.transition.C12054b, androidx.transition.Transition.InterfaceC12043f
        public void onTransitionStart(Transition transition) {
            TransitionSet transitionSet = this.f55952a;
            if (!transitionSet.f55948S) {
                transitionSet.m65874y0();
                this.f55952a.f55948S = true;
            }
        }
    }

    public TransitionSet() {
        this.f55945P = new ArrayList<>();
        this.f55946Q = true;
        this.f55948S = false;
        this.f55949T = 0;
    }

    @Override // androidx.transition.Transition
    /* renamed from: A0 */
    public TransitionSet mo65857d(Transition.InterfaceC12043f interfaceC12043f) {
        return (TransitionSet) super.mo65857d(interfaceC12043f);
    }

    @Override // androidx.transition.Transition
    /* renamed from: B0 */
    public TransitionSet mo65856e(View view) {
        for (int i = 0; i < this.f55945P.size(); i++) {
            this.f55945P.get(i).mo65856e(view);
        }
        return (TransitionSet) super.mo65856e(view);
    }

    /* renamed from: C0 */
    public TransitionSet m65869C0(Transition transition) {
        m65868F0(transition);
        long j = this.f55914d;
        if (j >= 0) {
            transition.mo65847q0(j);
        }
        if ((this.f55949T & 1) != 0) {
            transition.mo65845s0(m65906C());
        }
        if ((this.f55949T & 2) != 0) {
            transition.mo65842v0(m65902I());
        }
        if ((this.f55949T & 4) != 0) {
            transition.mo65843u0(m65903H());
        }
        if ((this.f55949T & 8) != 0) {
            transition.mo65846r0(m65907B());
        }
        return this;
    }

    /* renamed from: F0 */
    public final void m65868F0(Transition transition) {
        this.f55945P.add(transition);
        transition.f55929s = this;
    }

    /* renamed from: G0 */
    public Transition m65867G0(int i) {
        if (i >= 0 && i < this.f55945P.size()) {
            return this.f55945P.get(i);
        }
        return null;
    }

    /* renamed from: H0 */
    public int m65866H0() {
        return this.f55945P.size();
    }

    @Override // androidx.transition.Transition
    /* renamed from: I0 */
    public TransitionSet mo65854h0(Transition.InterfaceC12043f interfaceC12043f) {
        return (TransitionSet) super.mo65854h0(interfaceC12043f);
    }

    @Override // androidx.transition.Transition
    /* renamed from: J0 */
    public TransitionSet mo65853i0(View view) {
        for (int i = 0; i < this.f55945P.size(); i++) {
            this.f55945P.get(i).mo65853i0(view);
        }
        return (TransitionSet) super.mo65853i0(view);
    }

    @Override // androidx.transition.Transition
    /* renamed from: K0 */
    public TransitionSet mo65847q0(long j) {
        ArrayList<Transition> arrayList;
        super.mo65847q0(j);
        if (this.f55914d >= 0 && (arrayList = this.f55945P) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f55945P.get(i).mo65847q0(j);
            }
        }
        return this;
    }

    @Override // androidx.transition.Transition
    /* renamed from: L0 */
    public TransitionSet mo65845s0(TimeInterpolator timeInterpolator) {
        this.f55949T |= 1;
        ArrayList<Transition> arrayList = this.f55945P;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f55945P.get(i).mo65845s0(timeInterpolator);
            }
        }
        return (TransitionSet) super.mo65845s0(timeInterpolator);
    }

    /* renamed from: M0 */
    public TransitionSet m65861M0(int i) {
        if (i != 0) {
            if (i == 1) {
                this.f55946Q = false;
            } else {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
            }
        } else {
            this.f55946Q = true;
        }
        return this;
    }

    @Override // androidx.transition.Transition
    /* renamed from: O0 */
    public TransitionSet mo65841w0(ViewGroup viewGroup) {
        super.mo65841w0(viewGroup);
        int size = this.f55945P.size();
        for (int i = 0; i < size; i++) {
            this.f55945P.get(i).mo65841w0(viewGroup);
        }
        return this;
    }

    @Override // androidx.transition.Transition
    /* renamed from: P0 */
    public TransitionSet mo65840x0(long j) {
        return (TransitionSet) super.mo65840x0(j);
    }

    /* renamed from: Q0 */
    public final void m65858Q0() {
        C12045b c12045b = new C12045b(this);
        Iterator<Transition> it = this.f55945P.iterator();
        while (it.hasNext()) {
            it.next().mo65857d(c12045b);
        }
        this.f55947R = this.f55945P.size();
    }

    @Override // androidx.transition.Transition
    /* renamed from: f0 */
    public void mo65855f0(View view) {
        super.mo65855f0(view);
        int size = this.f55945P.size();
        for (int i = 0; i < size; i++) {
            this.f55945P.get(i).mo65855f0(view);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: k */
    public void mo65827k(N96 n96) {
        if (m65893X(n96.f24200b)) {
            Iterator<Transition> it = this.f55945P.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.m65893X(n96.f24200b)) {
                    next.mo65827k(n96);
                    n96.f24201c.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: k0 */
    public void mo65852k0(View view) {
        super.mo65852k0(view);
        int size = this.f55945P.size();
        for (int i = 0; i < size; i++) {
            this.f55945P.get(i).mo65852k0(view);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: m */
    public void mo65851m(N96 n96) {
        super.mo65851m(n96);
        int size = this.f55945P.size();
        for (int i = 0; i < size; i++) {
            this.f55945P.get(i).mo65851m(n96);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: n */
    public void mo65826n(N96 n96) {
        if (m65893X(n96.f24200b)) {
            Iterator<Transition> it = this.f55945P.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.m65893X(n96.f24200b)) {
                    next.mo65826n(n96);
                    n96.f24201c.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: n0 */
    public void mo65850n0() {
        if (this.f55945P.isEmpty()) {
            m65874y0();
            m65875w();
            return;
        }
        m65858Q0();
        if (!this.f55946Q) {
            for (int i = 1; i < this.f55945P.size(); i++) {
                this.f55945P.get(i - 1).mo65857d(new C12044a(this.f55945P.get(i)));
            }
            Transition transition = this.f55945P.get(0);
            if (transition != null) {
                transition.mo65850n0();
                return;
            }
            return;
        }
        Iterator<Transition> it = this.f55945P.iterator();
        while (it.hasNext()) {
            it.next().mo65850n0();
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: o0 */
    public void mo65849o0(boolean z) {
        super.mo65849o0(z);
        int size = this.f55945P.size();
        for (int i = 0; i < size; i++) {
            this.f55945P.get(i).mo65849o0(z);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: q */
    public Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.f55945P = new ArrayList<>();
        int size = this.f55945P.size();
        for (int i = 0; i < size; i++) {
            transitionSet.m65868F0(this.f55945P.get(i).clone());
        }
        return transitionSet;
    }

    @Override // androidx.transition.Transition
    /* renamed from: r0 */
    public void mo65846r0(Transition.AbstractC12042e abstractC12042e) {
        super.mo65846r0(abstractC12042e);
        this.f55949T |= 8;
        int size = this.f55945P.size();
        for (int i = 0; i < size; i++) {
            this.f55945P.get(i).mo65846r0(abstractC12042e);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: t */
    public void mo65844t(ViewGroup viewGroup, O96 o96, O96 o962, ArrayList<N96> arrayList, ArrayList<N96> arrayList2) {
        long m65900M = m65900M();
        int size = this.f55945P.size();
        for (int i = 0; i < size; i++) {
            Transition transition = this.f55945P.get(i);
            if (m65900M > 0 && (this.f55946Q || i == 0)) {
                long m65900M2 = transition.m65900M();
                if (m65900M2 > 0) {
                    transition.mo65840x0(m65900M2 + m65900M);
                } else {
                    transition.mo65840x0(m65900M);
                }
            }
            transition.mo65844t(viewGroup, o96, o962, arrayList, arrayList2);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: u0 */
    public void mo65843u0(PathMotion pathMotion) {
        super.mo65843u0(pathMotion);
        this.f55949T |= 4;
        if (this.f55945P != null) {
            for (int i = 0; i < this.f55945P.size(); i++) {
                this.f55945P.get(i).mo65843u0(pathMotion);
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: v0 */
    public void mo65842v0(L96 l96) {
        super.mo65842v0(l96);
        this.f55949T |= 2;
        int size = this.f55945P.size();
        for (int i = 0; i < size; i++) {
            this.f55945P.get(i).mo65842v0(l96);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: y */
    public void mo65839y(ViewGroup viewGroup) {
        super.mo65839y(viewGroup);
        int size = this.f55945P.size();
        for (int i = 0; i < size; i++) {
            this.f55945P.get(i).mo65839y(viewGroup);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: z0 */
    public String mo65838z0(String str) {
        String mo65838z0 = super.mo65838z0(str);
        for (int i = 0; i < this.f55945P.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(mo65838z0);
            sb.append("\n");
            sb.append(this.f55945P.get(i).mo65838z0(str + "  "));
            mo65838z0 = sb.toString();
        }
        return mo65838z0;
    }

    @SuppressLint({"RestrictedApi"})
    public TransitionSet(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55945P = new ArrayList<>();
        this.f55946Q = true;
        this.f55948S = false;
        this.f55949T = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, SS5.f33755i);
        m65861M0(C33266Hb6.m103669g(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }
}

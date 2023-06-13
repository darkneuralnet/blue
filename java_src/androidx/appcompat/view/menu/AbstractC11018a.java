package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.InterfaceC11037i;
import androidx.appcompat.view.menu.InterfaceC11039j;
import java.util.ArrayList;
/* renamed from: androidx.appcompat.view.menu.a */
/* loaded from: classes.dex */
public abstract class AbstractC11018a implements InterfaceC11037i {

    /* renamed from: b */
    public Context f51805b;

    /* renamed from: c */
    public Context f51806c;

    /* renamed from: d */
    public C11028e f51807d;

    /* renamed from: e */
    public LayoutInflater f51808e;

    /* renamed from: f */
    public LayoutInflater f51809f;

    /* renamed from: g */
    public InterfaceC11037i.InterfaceC11038a f51810g;

    /* renamed from: h */
    public int f51811h;

    /* renamed from: i */
    public int f51812i;

    /* renamed from: j */
    public InterfaceC11039j f51813j;

    /* renamed from: k */
    public int f51814k;

    public AbstractC11018a(Context context, int i, int i2) {
        this.f51805b = context;
        this.f51808e = LayoutInflater.from(context);
        this.f51811h = i;
        this.f51812i = i2;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: b */
    public void mo49325b(C11028e c11028e, boolean z) {
        InterfaceC11037i.InterfaceC11038a interfaceC11038a = this.f51810g;
        if (interfaceC11038a != null) {
            interfaceC11038a.mo69982b(c11028e, z);
        }
    }

    /* renamed from: c */
    public void m70195c(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f51813j).addView(view, i);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: d */
    public boolean mo12399d(C11028e c11028e, C11032g c11032g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: f */
    public void mo49322f(boolean z) {
        C11032g c11032g;
        ViewGroup viewGroup = (ViewGroup) this.f51813j;
        if (viewGroup == null) {
            return;
        }
        C11028e c11028e = this.f51807d;
        int i = 0;
        if (c11028e != null) {
            c11028e.m70128t();
            ArrayList<C11032g> m70168G = this.f51807d.m70168G();
            int size = m70168G.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                C11032g c11032g2 = m70168G.get(i3);
                if (mo70011t(i2, c11032g2)) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt instanceof InterfaceC11039j.InterfaceC11040a) {
                        c11032g = ((InterfaceC11039j.InterfaceC11040a) childAt).mo49372e();
                    } else {
                        c11032g = null;
                    }
                    View mo70013q = mo70013q(c11032g2, childAt, viewGroup);
                    if (c11032g2 != c11032g) {
                        mo70013q.setPressed(false);
                        mo70013q.jumpDrawablesToCurrentState();
                    }
                    if (mo70013q != childAt) {
                        m70195c(mo70013q, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!mo70014o(viewGroup, i)) {
                i++;
            }
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    public int getId() {
        return this.f51814k;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: h */
    public boolean mo12398h(C11028e c11028e, C11032g c11032g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: i */
    public void mo12397i(Context context, C11028e c11028e) {
        this.f51806c = context;
        this.f51809f = LayoutInflater.from(context);
        this.f51807d = c11028e;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: j */
    public void mo70079j(InterfaceC11037i.InterfaceC11038a interfaceC11038a) {
        this.f51810g = interfaceC11038a;
    }

    /* renamed from: k */
    public abstract void mo70015k(C11032g c11032g, InterfaceC11039j.InterfaceC11040a interfaceC11040a);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.appcompat.view.menu.e] */
    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: m */
    public boolean mo49318m(SubMenuC11044l subMenuC11044l) {
        InterfaceC11037i.InterfaceC11038a interfaceC11038a = this.f51810g;
        SubMenuC11044l subMenuC11044l2 = subMenuC11044l;
        if (interfaceC11038a != null) {
            if (subMenuC11044l == null) {
                subMenuC11044l2 = this.f51807d;
            }
            return interfaceC11038a.mo69981c(subMenuC11044l2);
        }
        return false;
    }

    /* renamed from: n */
    public InterfaceC11039j.InterfaceC11040a m70194n(ViewGroup viewGroup) {
        return (InterfaceC11039j.InterfaceC11040a) this.f51808e.inflate(this.f51812i, viewGroup, false);
    }

    /* renamed from: o */
    public boolean mo70014o(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: p */
    public InterfaceC11037i.InterfaceC11038a m70193p() {
        return this.f51810g;
    }

    /* renamed from: q */
    public View mo70013q(C11032g c11032g, View view, ViewGroup viewGroup) {
        InterfaceC11039j.InterfaceC11040a m70194n;
        if (view instanceof InterfaceC11039j.InterfaceC11040a) {
            m70194n = (InterfaceC11039j.InterfaceC11040a) view;
        } else {
            m70194n = m70194n(viewGroup);
        }
        mo70015k(c11032g, m70194n);
        return (View) m70194n;
    }

    /* renamed from: r */
    public InterfaceC11039j mo70012r(ViewGroup viewGroup) {
        if (this.f51813j == null) {
            InterfaceC11039j interfaceC11039j = (InterfaceC11039j) this.f51808e.inflate(this.f51811h, viewGroup, false);
            this.f51813j = interfaceC11039j;
            interfaceC11039j.mo49346a(this.f51807d);
            mo49322f(true);
        }
        return this.f51813j;
    }

    /* renamed from: s */
    public void m70192s(int i) {
        this.f51814k = i;
    }

    /* renamed from: t */
    public abstract boolean mo70011t(int i, C11032g c11032g);
}

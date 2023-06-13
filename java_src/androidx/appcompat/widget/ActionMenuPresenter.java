package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.AbstractC11018a;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.C11028e;
import androidx.appcompat.view.menu.C11032g;
import androidx.appcompat.view.menu.C11034h;
import androidx.appcompat.view.menu.InterfaceC11037i;
import androidx.appcompat.view.menu.InterfaceC11039j;
import androidx.appcompat.view.menu.SubMenuC11044l;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import p000.AbstractC3314I2;
/* loaded from: classes.dex */
public class ActionMenuPresenter extends AbstractC11018a implements AbstractC3314I2.InterfaceC3315a {

    /* renamed from: A */
    public C11052a f52030A;

    /* renamed from: B */
    public RunnableC11054c f52031B;

    /* renamed from: C */
    public C11053b f52032C;

    /* renamed from: D */
    public final C11058f f52033D;

    /* renamed from: E */
    public int f52034E;

    /* renamed from: l */
    public C11055d f52035l;

    /* renamed from: m */
    public Drawable f52036m;

    /* renamed from: n */
    public boolean f52037n;

    /* renamed from: o */
    public boolean f52038o;

    /* renamed from: p */
    public boolean f52039p;

    /* renamed from: q */
    public int f52040q;

    /* renamed from: r */
    public int f52041r;

    /* renamed from: s */
    public int f52042s;

    /* renamed from: t */
    public boolean f52043t;

    /* renamed from: u */
    public boolean f52044u;

    /* renamed from: v */
    public boolean f52045v;

    /* renamed from: w */
    public boolean f52046w;

    /* renamed from: x */
    public int f52047x;

    /* renamed from: y */
    public final SparseBooleanArray f52048y;

    /* renamed from: z */
    public C11057e f52049z;

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C11051a();

        /* renamed from: b */
        public int f52050b;

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$SavedState$a */
        /* loaded from: classes.dex */
        public class C11051a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f52050b);
        }

        public SavedState(Parcel parcel) {
            this.f52050b = parcel.readInt();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$a */
    /* loaded from: classes.dex */
    public class C11052a extends C11034h {
        public C11052a(Context context, SubMenuC11044l subMenuC11044l, View view) {
            super(context, subMenuC11044l, view, false, C50553vf4.actionOverflowMenuStyle);
            if (!((C11032g) subMenuC11044l.getItem()).m70109l()) {
                View view2 = ActionMenuPresenter.this.f52035l;
                m70090f(view2 == null ? (View) ActionMenuPresenter.this.f51813j : view2);
            }
            m70086j(ActionMenuPresenter.this.f52033D);
        }

        @Override // androidx.appcompat.view.menu.C11034h
        /* renamed from: e */
        public void mo70001e() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f52030A = null;
            actionMenuPresenter.f52034E = 0;
            super.mo70001e();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$b */
    /* loaded from: classes.dex */
    public class C11053b extends ActionMenuItemView.AbstractC11017b {
        public C11053b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.AbstractC11017b
        /* renamed from: a */
        public InterfaceC52642zA5 mo70002a() {
            C11052a c11052a = ActionMenuPresenter.this.f52030A;
            if (c11052a != null) {
                return c11052a.m70092c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$c */
    /* loaded from: classes.dex */
    public class RunnableC11054c implements Runnable {

        /* renamed from: b */
        public C11057e f52053b;

        public RunnableC11054c(C11057e c11057e) {
            this.f52053b = c11057e;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ActionMenuPresenter.this.f51807d != null) {
                ActionMenuPresenter.this.f51807d.m70146d();
            }
            View view = (View) ActionMenuPresenter.this.f51813j;
            if (view != null && view.getWindowToken() != null && this.f52053b.m70083m()) {
                ActionMenuPresenter.this.f52049z = this.f52053b;
            }
            ActionMenuPresenter.this.f52031B = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d */
    /* loaded from: classes.dex */
    public class C11055d extends AppCompatImageView implements ActionMenuView.InterfaceC11059a {

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d$a */
        /* loaded from: classes.dex */
        public class C11056a extends AbstractView$OnTouchListenerC32757Ex1 {

            /* renamed from: k */
            public final /* synthetic */ ActionMenuPresenter f52056k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C11056a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
                this.f52056k = actionMenuPresenter;
            }

            @Override // p000.AbstractView$OnTouchListenerC32757Ex1
            /* renamed from: b */
            public InterfaceC52642zA5 mo69952b() {
                C11057e c11057e = ActionMenuPresenter.this.f52049z;
                if (c11057e == null) {
                    return null;
                }
                return c11057e.m70092c();
            }

            @Override // p000.AbstractView$OnTouchListenerC32757Ex1
            /* renamed from: c */
            public boolean mo69951c() {
                ActionMenuPresenter.this.m70017M();
                return true;
            }

            @Override // p000.AbstractView$OnTouchListenerC32757Ex1
            /* renamed from: d */
            public boolean mo69974d() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f52031B != null) {
                    return false;
                }
                actionMenuPresenter.m70026D();
                return true;
            }
        }

        public C11055d(Context context) {
            super(context, null, C50553vf4.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            E56.m109403a(this, getContentDescription());
            setOnTouchListener(new C11056a(this, ActionMenuPresenter.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC11059a
        /* renamed from: a */
        public boolean mo69984a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.InterfaceC11059a
        /* renamed from: b */
        public boolean mo69983b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.m70017M();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                P61.m90840l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$e */
    /* loaded from: classes.dex */
    public class C11057e extends C11034h {
        public C11057e(Context context, C11028e c11028e, View view, boolean z) {
            super(context, c11028e, view, z, C50553vf4.actionOverflowMenuStyle);
            m70088h(8388613);
            m70086j(ActionMenuPresenter.this.f52033D);
        }

        @Override // androidx.appcompat.view.menu.C11034h
        /* renamed from: e */
        public void mo70001e() {
            if (ActionMenuPresenter.this.f51807d != null) {
                ActionMenuPresenter.this.f51807d.close();
            }
            ActionMenuPresenter.this.f52049z = null;
            super.mo70001e();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$f */
    /* loaded from: classes.dex */
    public class C11058f implements InterfaceC11037i.InterfaceC11038a {
        public C11058f() {
        }

        @Override // androidx.appcompat.view.menu.InterfaceC11037i.InterfaceC11038a
        /* renamed from: b */
        public void mo69982b(C11028e c11028e, boolean z) {
            if (c11028e instanceof SubMenuC11044l) {
                c11028e.mo70078F().m70144e(false);
            }
            InterfaceC11037i.InterfaceC11038a m70193p = ActionMenuPresenter.this.m70193p();
            if (m70193p != null) {
                m70193p.mo69982b(c11028e, z);
            }
        }

        @Override // androidx.appcompat.view.menu.InterfaceC11037i.InterfaceC11038a
        /* renamed from: c */
        public boolean mo69981c(C11028e c11028e) {
            if (c11028e == ActionMenuPresenter.this.f51807d) {
                return false;
            }
            ActionMenuPresenter.this.f52034E = ((SubMenuC11044l) c11028e).getItem().getItemId();
            InterfaceC11037i.InterfaceC11038a m70193p = ActionMenuPresenter.this.m70193p();
            if (m70193p == null) {
                return false;
            }
            return m70193p.mo69981c(c11028e);
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, C32643Ek4.abc_action_menu_layout, C32643Ek4.abc_action_menu_item_layout);
        this.f52048y = new SparseBooleanArray();
        this.f52033D = new C11058f();
    }

    /* renamed from: B */
    public boolean m70028B() {
        return m70026D() | m70025E();
    }

    /* renamed from: C */
    public final View m70027C(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f51813j;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof InterfaceC11039j.InterfaceC11040a) && ((InterfaceC11039j.InterfaceC11040a) childAt).mo49372e() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: D */
    public boolean m70026D() {
        InterfaceC11039j interfaceC11039j;
        RunnableC11054c runnableC11054c = this.f52031B;
        if (runnableC11054c != null && (interfaceC11039j = this.f51813j) != null) {
            ((View) interfaceC11039j).removeCallbacks(runnableC11054c);
            this.f52031B = null;
            return true;
        }
        C11057e c11057e = this.f52049z;
        if (c11057e != null) {
            c11057e.m70093b();
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public boolean m70025E() {
        C11052a c11052a = this.f52030A;
        if (c11052a != null) {
            c11052a.m70093b();
            return true;
        }
        return false;
    }

    /* renamed from: F */
    public boolean m70024F() {
        return this.f52031B != null || m70023G();
    }

    /* renamed from: G */
    public boolean m70023G() {
        C11057e c11057e = this.f52049z;
        return c11057e != null && c11057e.m70091d();
    }

    /* renamed from: H */
    public void m70022H(Configuration configuration) {
        if (!this.f52043t) {
            this.f52042s = C0843C2.m112965b(this.f51806c).m112963d();
        }
        C11028e c11028e = this.f51807d;
        if (c11028e != null) {
            c11028e.mo70165M(true);
        }
    }

    /* renamed from: I */
    public void m70021I(boolean z) {
        this.f52046w = z;
    }

    /* renamed from: J */
    public void m70020J(ActionMenuView actionMenuView) {
        this.f51813j = actionMenuView;
        actionMenuView.mo49346a(this.f51807d);
    }

    /* renamed from: K */
    public void m70019K(Drawable drawable) {
        C11055d c11055d = this.f52035l;
        if (c11055d != null) {
            c11055d.setImageDrawable(drawable);
            return;
        }
        this.f52037n = true;
        this.f52036m = drawable;
    }

    /* renamed from: L */
    public void m70018L(boolean z) {
        this.f52038o = z;
        this.f52039p = true;
    }

    /* renamed from: M */
    public boolean m70017M() {
        C11028e c11028e;
        if (this.f52038o && !m70023G() && (c11028e = this.f51807d) != null && this.f51813j != null && this.f52031B == null && !c11028e.m70172B().isEmpty()) {
            RunnableC11054c runnableC11054c = new RunnableC11054c(new C11057e(this.f51806c, this.f51807d, this.f52035l, true));
            this.f52031B = runnableC11054c;
            ((View) this.f51813j).post(runnableC11054c);
            return true;
        }
        return false;
    }

    @Override // p000.AbstractC3314I2.InterfaceC3315a
    /* renamed from: a */
    public void mo70016a(boolean z) {
        if (z) {
            super.mo49318m(null);
            return;
        }
        C11028e c11028e = this.f51807d;
        if (c11028e != null) {
            c11028e.m70144e(false);
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC11018a, androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: b */
    public void mo49325b(C11028e c11028e, boolean z) {
        m70028B();
        super.mo49325b(c11028e, z);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: e */
    public Parcelable mo49323e() {
        SavedState savedState = new SavedState();
        savedState.f52050b = this.f52034E;
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.AbstractC11018a, androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: f */
    public void mo49322f(boolean z) {
        ArrayList<C11032g> arrayList;
        super.mo49322f(z);
        ((View) this.f51813j).requestLayout();
        C11028e c11028e = this.f51807d;
        boolean z2 = false;
        if (c11028e != null) {
            ArrayList<C11032g> m70127u = c11028e.m70127u();
            int size = m70127u.size();
            for (int i = 0; i < size; i++) {
                AbstractC3314I2 mo44207b = m70127u.get(i).mo44207b();
                if (mo44207b != null) {
                    mo44207b.m103048i(this);
                }
            }
        }
        C11028e c11028e2 = this.f51807d;
        if (c11028e2 != null) {
            arrayList = c11028e2.m70172B();
        } else {
            arrayList = null;
        }
        if (this.f52038o && arrayList != null) {
            int size2 = arrayList.size();
            if (size2 == 1) {
                z2 = !arrayList.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f52035l == null) {
                this.f52035l = new C11055d(this.f51805b);
            }
            ViewGroup viewGroup = (ViewGroup) this.f52035l.getParent();
            if (viewGroup != this.f51813j) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f52035l);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f51813j;
                actionMenuView.addView(this.f52035l, actionMenuView.m69995j());
            }
        } else {
            C11055d c11055d = this.f52035l;
            if (c11055d != null) {
                ViewParent parent = c11055d.getParent();
                InterfaceC11039j interfaceC11039j = this.f51813j;
                if (parent == interfaceC11039j) {
                    ((ViewGroup) interfaceC11039j).removeView(this.f52035l);
                }
            }
        }
        ((ActionMenuView) this.f51813j).setOverflowReserved(this.f52038o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: g */
    public boolean mo49321g() {
        ArrayList<C11032g> arrayList;
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        boolean z2;
        boolean z3;
        ActionMenuPresenter actionMenuPresenter = this;
        C11028e c11028e = actionMenuPresenter.f51807d;
        View view = null;
        ?? r3 = 0;
        if (c11028e != null) {
            arrayList = c11028e.m70168G();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i5 = actionMenuPresenter.f52042s;
        int i6 = actionMenuPresenter.f52041r;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f51813j;
        boolean z4 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < i; i9++) {
            C11032g c11032g = arrayList.get(i9);
            if (c11032g.m70106o()) {
                i7++;
            } else if (c11032g.m70107n()) {
                i8++;
            } else {
                z4 = true;
            }
            if (actionMenuPresenter.f52046w && c11032g.isActionViewExpanded()) {
                i5 = 0;
            }
        }
        if (actionMenuPresenter.f52038o && (z4 || i8 + i7 > i5)) {
            i5--;
        }
        int i10 = i5 - i7;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f52048y;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f52044u) {
            int i11 = actionMenuPresenter.f52047x;
            i3 = i6 / i11;
            i2 = i11 + ((i6 % i11) / i3);
        } else {
            i2 = 0;
            i3 = 0;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < i) {
            C11032g c11032g2 = arrayList.get(i12);
            if (c11032g2.m70106o()) {
                View mo70013q = actionMenuPresenter.mo70013q(c11032g2, view, viewGroup);
                if (actionMenuPresenter.f52044u) {
                    i3 -= ActionMenuView.m69988q(mo70013q, i2, i3, makeMeasureSpec, r3);
                } else {
                    mo70013q.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = mo70013q.getMeasuredWidth();
                i6 -= measuredWidth;
                if (i13 == 0) {
                    i13 = measuredWidth;
                }
                int groupId = c11032g2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                c11032g2.m70100u(true);
                z = r3;
                i4 = i;
            } else if (c11032g2.m70107n()) {
                int groupId2 = c11032g2.getGroupId();
                boolean z5 = sparseBooleanArray.get(groupId2);
                if ((i10 > 0 || z5) && i6 > 0 && (!actionMenuPresenter.f52044u || i3 > 0)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z6 = z2;
                i4 = i;
                if (z2) {
                    View mo70013q2 = actionMenuPresenter.mo70013q(c11032g2, null, viewGroup);
                    if (actionMenuPresenter.f52044u) {
                        int m69988q = ActionMenuView.m69988q(mo70013q2, i2, i3, makeMeasureSpec, 0);
                        i3 -= m69988q;
                        if (m69988q == 0) {
                            z6 = false;
                        }
                    } else {
                        mo70013q2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z7 = z6;
                    int measuredWidth2 = mo70013q2.getMeasuredWidth();
                    i6 -= measuredWidth2;
                    if (i13 == 0) {
                        i13 = measuredWidth2;
                    }
                    if (!actionMenuPresenter.f52044u ? i6 + i13 > 0 : i6 >= 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z2 = z7 & z3;
                }
                if (z2 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z5) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i14 = 0; i14 < i12; i14++) {
                        C11032g c11032g3 = arrayList.get(i14);
                        if (c11032g3.getGroupId() == groupId2) {
                            if (c11032g3.m70109l()) {
                                i10++;
                            }
                            c11032g3.m70100u(false);
                        }
                    }
                }
                if (z2) {
                    i10--;
                }
                c11032g2.m70100u(z2);
                z = false;
            } else {
                z = r3;
                i4 = i;
                c11032g2.m70100u(z);
            }
            i12++;
            r3 = z;
            i = i4;
            view = null;
            actionMenuPresenter = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC11018a, androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: i */
    public void mo12397i(Context context, C11028e c11028e) {
        super.mo12397i(context, c11028e);
        Resources resources = context.getResources();
        C0843C2 m112965b = C0843C2.m112965b(context);
        if (!this.f52039p) {
            this.f52038o = m112965b.m112959h();
        }
        if (!this.f52045v) {
            this.f52040q = m112965b.m112964c();
        }
        if (!this.f52043t) {
            this.f52042s = m112965b.m112963d();
        }
        int i = this.f52040q;
        if (this.f52038o) {
            if (this.f52035l == null) {
                C11055d c11055d = new C11055d(this.f51805b);
                this.f52035l = c11055d;
                if (this.f52037n) {
                    c11055d.setImageDrawable(this.f52036m);
                    this.f52036m = null;
                    this.f52037n = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f52035l.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f52035l.getMeasuredWidth();
        } else {
            this.f52035l = null;
        }
        this.f52041r = i;
        this.f52047x = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.AbstractC11018a
    /* renamed from: k */
    public void mo70015k(C11032g c11032g, InterfaceC11039j.InterfaceC11040a interfaceC11040a) {
        interfaceC11040a.mo49373d(c11032g, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) interfaceC11040a;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f51813j);
        if (this.f52032C == null) {
            this.f52032C = new C11053b();
        }
        actionMenuItemView.setPopupCallback(this.f52032C);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: l */
    public void mo49319l(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof SavedState) && (i = ((SavedState) parcelable).f52050b) > 0 && (findItem = this.f51807d.findItem(i)) != null) {
            mo49318m((SubMenuC11044l) findItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.AbstractC11018a, androidx.appcompat.view.menu.InterfaceC11037i
    /* renamed from: m */
    public boolean mo49318m(SubMenuC11044l subMenuC11044l) {
        boolean z = false;
        if (!subMenuC11044l.hasVisibleItems()) {
            return false;
        }
        SubMenuC11044l subMenuC11044l2 = subMenuC11044l;
        while (subMenuC11044l2.m70071i0() != this.f51807d) {
            subMenuC11044l2 = (SubMenuC11044l) subMenuC11044l2.m70071i0();
        }
        View m70027C = m70027C(subMenuC11044l2.getItem());
        if (m70027C == null) {
            return false;
        }
        this.f52034E = subMenuC11044l.getItem().getItemId();
        int size = subMenuC11044l.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = subMenuC11044l.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        C11052a c11052a = new C11052a(this.f51806c, subMenuC11044l, m70027C);
        this.f52030A = c11052a;
        c11052a.m70089g(z);
        this.f52030A.m70085k();
        super.mo49318m(subMenuC11044l);
        return true;
    }

    @Override // androidx.appcompat.view.menu.AbstractC11018a
    /* renamed from: o */
    public boolean mo70014o(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f52035l) {
            return false;
        }
        return super.mo70014o(viewGroup, i);
    }

    @Override // androidx.appcompat.view.menu.AbstractC11018a
    /* renamed from: q */
    public View mo70013q(C11032g c11032g, View view, ViewGroup viewGroup) {
        int i;
        View actionView = c11032g.getActionView();
        if (actionView == null || c11032g.m70111j()) {
            actionView = super.mo70013q(c11032g, view, viewGroup);
        }
        if (c11032g.isActionViewExpanded()) {
            i = 8;
        } else {
            i = 0;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.AbstractC11018a
    /* renamed from: r */
    public InterfaceC11039j mo70012r(ViewGroup viewGroup) {
        InterfaceC11039j interfaceC11039j = this.f51813j;
        InterfaceC11039j mo70012r = super.mo70012r(viewGroup);
        if (interfaceC11039j != mo70012r) {
            ((ActionMenuView) mo70012r).setPresenter(this);
        }
        return mo70012r;
    }

    @Override // androidx.appcompat.view.menu.AbstractC11018a
    /* renamed from: t */
    public boolean mo70011t(int i, C11032g c11032g) {
        return c11032g.m70109l();
    }
}

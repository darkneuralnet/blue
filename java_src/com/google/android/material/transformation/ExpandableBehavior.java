package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
@Deprecated
/* loaded from: classes6.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: a */
    public int f73667a;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    /* loaded from: classes6.dex */
    public class ViewTreeObserver$OnPreDrawListenerC17951a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b */
        public final /* synthetic */ View f73668b;

        /* renamed from: c */
        public final /* synthetic */ int f73669c;

        /* renamed from: d */
        public final /* synthetic */ InterfaceC44059ki1 f73670d;

        public ViewTreeObserver$OnPreDrawListenerC17951a(View view, int i, InterfaceC44059ki1 interfaceC44059ki1) {
            this.f73668b = view;
            this.f73669c = i;
            this.f73670d = interfaceC44059ki1;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f73668b.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f73667a == this.f73669c) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                InterfaceC44059ki1 interfaceC44059ki1 = this.f73670d;
                expandableBehavior.mo48470d((View) interfaceC44059ki1, this.f73668b, interfaceC44059ki1.mo28583b(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f73667a = 0;
    }

    /* renamed from: b */
    public final boolean m48498b(boolean z) {
        if (z) {
            int i = this.f73667a;
            if (i != 0 && i != 2) {
                return false;
            }
            return true;
        } else if (this.f73667a != 1) {
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: c */
    public InterfaceC44059ki1 m48497c(CoordinatorLayout coordinatorLayout, View view) {
        List<View> dependencies = coordinatorLayout.getDependencies(view);
        int size = dependencies.size();
        for (int i = 0; i < size; i++) {
            View view2 = dependencies.get(i);
            if (layoutDependsOn(coordinatorLayout, view, view2)) {
                return (InterfaceC44059ki1) view2;
            }
        }
        return null;
    }

    /* renamed from: d */
    public abstract boolean mo48470d(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i;
        InterfaceC44059ki1 interfaceC44059ki1 = (InterfaceC44059ki1) view2;
        if (m48498b(interfaceC44059ki1.mo28583b())) {
            if (interfaceC44059ki1.mo28583b()) {
                i = 1;
            } else {
                i = 2;
            }
            this.f73667a = i;
            return mo48470d((View) interfaceC44059ki1, view, interfaceC44059ki1.mo28583b(), true);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        InterfaceC44059ki1 m48497c;
        int i2;
        if (!C38790bq6.m62504Z(view) && (m48497c = m48497c(coordinatorLayout, view)) != null && m48498b(m48497c.mo28583b())) {
            if (m48497c.mo28583b()) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            this.f73667a = i2;
            view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC17951a(view, i2, m48497c));
            return false;
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f73667a = 0;
    }
}

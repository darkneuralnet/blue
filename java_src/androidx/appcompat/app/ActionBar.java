package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p000.AbstractC2614G2;
/* loaded from: classes.dex */
public abstract class ActionBar {

    /* renamed from: androidx.appcompat.app.ActionBar$a */
    /* loaded from: classes.dex */
    public interface InterfaceC10952a {
        /* renamed from: a */
        void m70458a(boolean z);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.ActionBar$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC10953b {
        /* renamed from: a */
        public abstract CharSequence m70457a();

        /* renamed from: b */
        public abstract View m70456b();

        /* renamed from: c */
        public abstract Drawable m70455c();

        /* renamed from: d */
        public abstract CharSequence m70454d();

        /* renamed from: e */
        public abstract void m70453e();
    }

    /* renamed from: A */
    public void mo70246A(Drawable drawable) {
    }

    /* renamed from: B */
    public void mo70245B(boolean z) {
    }

    /* renamed from: C */
    public void mo70244C(boolean z) {
    }

    /* renamed from: D */
    public abstract void mo70243D(int i);

    /* renamed from: E */
    public abstract void mo70242E(CharSequence charSequence);

    /* renamed from: F */
    public void mo70241F(CharSequence charSequence) {
    }

    /* renamed from: G */
    public abstract void mo70240G();

    /* renamed from: H */
    public AbstractC2614G2 mo70239H(AbstractC2614G2.InterfaceC2615a interfaceC2615a) {
        return null;
    }

    /* renamed from: g */
    public boolean mo70252g() {
        return false;
    }

    /* renamed from: h */
    public boolean mo70222h() {
        return false;
    }

    /* renamed from: i */
    public void mo70221i(boolean z) {
    }

    /* renamed from: j */
    public abstract int mo70220j();

    /* renamed from: k */
    public Context mo70219k() {
        return null;
    }

    /* renamed from: l */
    public abstract void mo70218l();

    /* renamed from: m */
    public boolean mo70251m() {
        return false;
    }

    /* renamed from: n */
    public void mo70217n(Configuration configuration) {
    }

    /* renamed from: o */
    public void mo70250o() {
    }

    /* renamed from: p */
    public boolean mo70216p(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: q */
    public boolean mo70249q(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: r */
    public boolean mo70248r() {
        return false;
    }

    /* renamed from: s */
    public abstract void mo70215s(Drawable drawable);

    /* renamed from: t */
    public abstract void mo70214t(View view, LayoutParams layoutParams);

    /* renamed from: u */
    public void mo70213u(boolean z) {
    }

    /* renamed from: v */
    public abstract void mo70212v(boolean z);

    /* renamed from: w */
    public abstract void mo70211w(boolean z);

    /* renamed from: x */
    public abstract void mo70210x(boolean z);

    /* renamed from: y */
    public void mo70209y(int i) {
    }

    /* renamed from: z */
    public void mo70208z(int i) {
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f51478a;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f51478a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C43509jm4.ActionBarLayout);
            this.f51478a = obtainStyledAttributes.getInt(C43509jm4.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f51478a = 8388627;
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2);
            this.f51478a = i3;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f51478a = 0;
            this.f51478a = layoutParams.f51478a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f51478a = 0;
        }
    }
}

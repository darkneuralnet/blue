package p000;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C11028e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p000.AbstractC2614G2;
/* renamed from: qO5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C47433qO5 extends AbstractC2614G2 implements C11028e.InterfaceC11029a {

    /* renamed from: d */
    public Context f105249d;

    /* renamed from: e */
    public ActionBarContextView f105250e;

    /* renamed from: f */
    public AbstractC2614G2.InterfaceC2615a f105251f;

    /* renamed from: g */
    public WeakReference<View> f105252g;

    /* renamed from: h */
    public boolean f105253h;

    /* renamed from: i */
    public boolean f105254i;

    /* renamed from: j */
    public C11028e f105255j;

    public C47433qO5(Context context, ActionBarContextView actionBarContextView, AbstractC2614G2.InterfaceC2615a interfaceC2615a, boolean z) {
        this.f105249d = context;
        this.f105250e = actionBarContextView;
        this.f105251f = interfaceC2615a;
        C11028e m70156W = new C11028e(actionBarContextView.getContext()).m70156W(1);
        this.f105255j = m70156W;
        m70156W.mo70074V(this);
        this.f105254i = z;
    }

    @Override // androidx.appcompat.view.menu.C11028e.InterfaceC11029a
    /* renamed from: a */
    public boolean mo5020a(C11028e c11028e, MenuItem menuItem) {
        return this.f105251f.mo70352a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C11028e.InterfaceC11029a
    /* renamed from: b */
    public void mo5019b(C11028e c11028e) {
        mo17554k();
        this.f105250e.m70057n();
    }

    @Override // p000.AbstractC2614G2
    /* renamed from: c */
    public void mo17560c() {
        if (this.f105253h) {
            return;
        }
        this.f105253h = true;
        this.f105251f.mo70351b(this);
    }

    @Override // p000.AbstractC2614G2
    /* renamed from: d */
    public View mo17559d() {
        WeakReference<View> weakReference = this.f105252g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // p000.AbstractC2614G2
    /* renamed from: e */
    public Menu mo17558e() {
        return this.f105255j;
    }

    @Override // p000.AbstractC2614G2
    /* renamed from: f */
    public MenuInflater mo17557f() {
        return new C39177cV5(this.f105250e.getContext());
    }

    @Override // p000.AbstractC2614G2
    /* renamed from: g */
    public CharSequence mo17556g() {
        return this.f105250e.m70063h();
    }

    @Override // p000.AbstractC2614G2
    /* renamed from: i */
    public CharSequence mo17555i() {
        return this.f105250e.m70062i();
    }

    @Override // p000.AbstractC2614G2
    /* renamed from: k */
    public void mo17554k() {
        this.f105251f.mo70349d(this, this.f105255j);
    }

    @Override // p000.AbstractC2614G2
    /* renamed from: l */
    public boolean mo17553l() {
        return this.f105250e.m70059l();
    }

    @Override // p000.AbstractC2614G2
    /* renamed from: m */
    public void mo17552m(View view) {
        WeakReference<View> weakReference;
        this.f105250e.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference<>(view);
        } else {
            weakReference = null;
        }
        this.f105252g = weakReference;
    }

    @Override // p000.AbstractC2614G2
    /* renamed from: n */
    public void mo17551n(int i) {
        mo17550o(this.f105249d.getString(i));
    }

    @Override // p000.AbstractC2614G2
    /* renamed from: o */
    public void mo17550o(CharSequence charSequence) {
        this.f105250e.setSubtitle(charSequence);
    }

    @Override // p000.AbstractC2614G2
    /* renamed from: q */
    public void mo17549q(int i) {
        mo17548r(this.f105249d.getString(i));
    }

    @Override // p000.AbstractC2614G2
    /* renamed from: r */
    public void mo17548r(CharSequence charSequence) {
        this.f105250e.setTitle(charSequence);
    }

    @Override // p000.AbstractC2614G2
    /* renamed from: s */
    public void mo17547s(boolean z) {
        super.mo17547s(z);
        this.f105250e.setTitleOptional(z);
    }
}

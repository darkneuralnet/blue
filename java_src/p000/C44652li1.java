package p000;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* renamed from: li1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C44652li1 {

    /* renamed from: a */
    public final View f96590a;

    /* renamed from: b */
    public boolean f96591b = false;

    /* renamed from: c */
    public int f96592c = 0;

    public C44652li1(InterfaceC44059ki1 interfaceC44059ki1) {
        this.f96590a = (View) interfaceC44059ki1;
    }

    /* renamed from: a */
    public final void m26940a() {
        ViewParent parent = this.f96590a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).dispatchDependentViewsChanged(this.f96590a);
        }
    }

    /* renamed from: b */
    public int m26939b() {
        return this.f96592c;
    }

    /* renamed from: c */
    public boolean m26938c() {
        return this.f96591b;
    }

    /* renamed from: d */
    public void m26937d(Bundle bundle) {
        this.f96591b = bundle.getBoolean("expanded", false);
        this.f96592c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f96591b) {
            m26940a();
        }
    }

    /* renamed from: e */
    public Bundle m26936e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f96591b);
        bundle.putInt("expandedComponentIdHint", this.f96592c);
        return bundle;
    }

    /* renamed from: f */
    public void m26935f(int i) {
        this.f96592c = i;
    }
}

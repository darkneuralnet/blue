package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* renamed from: q3 */
/* loaded from: classes3.dex */
public final class C27481q3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f104598a;

    /* renamed from: b */
    public final FrameLayout f104599b;

    public C27481q3(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.f104598a = frameLayout;
        this.f104599b = frameLayout2;
    }

    /* renamed from: a */
    public static C27481q3 m18259a(View view) {
        if (view != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            return new C27481q3(frameLayout, frameLayout);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C27481q3 m18257c(LayoutInflater layoutInflater) {
        return m18256d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C27481q3 m18256d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36837Wi4.activity_configurable_tutorials, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m18259a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f104598a;
    }
}

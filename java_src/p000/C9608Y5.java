package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* renamed from: Y5 */
/* loaded from: classes2.dex */
public final class C9608Y5 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f44504a;

    /* renamed from: b */
    public final FrameLayout f44505b;

    public C9608Y5(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.f44504a = frameLayout;
        this.f44505b = frameLayout2;
    }

    /* renamed from: a */
    public static C9608Y5 m75767a(View view) {
        if (view != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            return new C9608Y5(frameLayout, frameLayout);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C9608Y5 m75765c(LayoutInflater layoutInflater) {
        return m75764d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C9608Y5 m75764d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_select_location, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m75767a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f44504a;
    }
}

package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* renamed from: s4 */
/* loaded from: classes3.dex */
public final class C28166s4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final FrameLayout f108193a;

    /* renamed from: b */
    public final FrameLayout f108194b;

    public C28166s4(FrameLayout frameLayout, FrameLayout frameLayout2) {
        this.f108193a = frameLayout;
        this.f108194b = frameLayout2;
    }

    /* renamed from: a */
    public static C28166s4 m14817a(View view) {
        if (view != null) {
            FrameLayout frameLayout = (FrameLayout) view;
            return new C28166s4(frameLayout, frameLayout);
        }
        throw new NullPointerException("rootView");
    }

    /* renamed from: c */
    public static C28166s4 m14815c(LayoutInflater layoutInflater) {
        return m14814d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C28166s4 m14814d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C48815sj4.activity_notification_center, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m14817a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f108193a;
    }
}

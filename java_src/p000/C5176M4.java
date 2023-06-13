package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import co.bird.android.widget.CallToActionLayout;
/* renamed from: M4 */
/* loaded from: classes2.dex */
public final class C5176M4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CallToActionLayout f22560a;

    /* renamed from: b */
    public final TextView f22561b;

    /* renamed from: c */
    public final CallToActionLayout f22562c;

    /* renamed from: d */
    public final ViewStub f22563d;

    public C5176M4(CallToActionLayout callToActionLayout, TextView textView, CallToActionLayout callToActionLayout2, ViewStub viewStub) {
        this.f22560a = callToActionLayout;
        this.f22561b = textView;
        this.f22562c = callToActionLayout2;
        this.f22563d = viewStub;
    }

    /* renamed from: a */
    public static C5176M4 m95888a(View view) {
        int i = C36585Vg4.physicalLockText;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            CallToActionLayout callToActionLayout = (CallToActionLayout) view;
            int i2 = C36585Vg4.stepsViewStub;
            ViewStub viewStub = (ViewStub) C34328Lp6.m96312a(view, i2);
            if (viewStub != null) {
                return new C5176M4(callToActionLayout, textView, callToActionLayout, viewStub);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C5176M4 m95886c(LayoutInflater layoutInflater) {
        return m95885d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C5176M4 m95885d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_physical_lock_unlock, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m95888a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CallToActionLayout getRoot() {
        return this.f22560a;
    }
}

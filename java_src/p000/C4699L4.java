package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import co.bird.android.widget.CallToActionLayout;
/* renamed from: L4 */
/* loaded from: classes2.dex */
public final class C4699L4 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final CallToActionLayout f20663a;

    /* renamed from: b */
    public final ImageView f20664b;

    /* renamed from: c */
    public final CallToActionLayout f20665c;

    /* renamed from: d */
    public final TextView f20666d;

    /* renamed from: e */
    public final ViewStub f20667e;

    public C4699L4(CallToActionLayout callToActionLayout, ImageView imageView, CallToActionLayout callToActionLayout2, TextView textView, ViewStub viewStub) {
        this.f20663a = callToActionLayout;
        this.f20664b = imageView;
        this.f20665c = callToActionLayout2;
        this.f20666d = textView;
        this.f20667e = viewStub;
    }

    /* renamed from: a */
    public static C4699L4 m97883a(View view) {
        int i = C36585Vg4.bikeRackImage;
        ImageView imageView = (ImageView) C34328Lp6.m96312a(view, i);
        if (imageView != null) {
            CallToActionLayout callToActionLayout = (CallToActionLayout) view;
            i = C36585Vg4.physicalLockText;
            TextView textView = (TextView) C34328Lp6.m96312a(view, i);
            if (textView != null) {
                i = C36585Vg4.stepsViewStub;
                ViewStub viewStub = (ViewStub) C34328Lp6.m96312a(view, i);
                if (viewStub != null) {
                    return new C4699L4(callToActionLayout, imageView, callToActionLayout, textView, viewStub);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C4699L4 m97881c(LayoutInflater layoutInflater) {
        return m97880d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C4699L4 m97880d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C39311cj4.activity_physical_lock_lock, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m97883a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public CallToActionLayout getRoot() {
        return this.f20663a;
    }
}

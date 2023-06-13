package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: Fb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32794Fb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f9747a;

    /* renamed from: b */
    public final TextView f9748b;

    public C32794Fb2(TextView textView, TextView textView2) {
        this.f9747a = textView;
        this.f9748b = textView2;
    }

    /* renamed from: a */
    public static C32794Fb2 m106919a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C32794Fb2(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f9747a;
    }
}

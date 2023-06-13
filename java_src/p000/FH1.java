package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: FH1 */
/* loaded from: classes3.dex */
public final class FH1 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f9120a;

    /* renamed from: b */
    public final TextView f9121b;

    public FH1(TextView textView, TextView textView2) {
        this.f9120a = textView;
        this.f9121b = textView2;
    }

    /* renamed from: a */
    public static FH1 m107361a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new FH1(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f9120a;
    }
}

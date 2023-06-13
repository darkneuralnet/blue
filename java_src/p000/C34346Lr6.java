package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: Lr6  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C34346Lr6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f22149a;

    /* renamed from: b */
    public final TextView f22150b;

    public C34346Lr6(TextView textView, TextView textView2) {
        this.f22149a = textView;
        this.f22150b = textView2;
    }

    /* renamed from: a */
    public static C34346Lr6 m96265a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C34346Lr6(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f22149a;
    }
}

package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: Ud2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C36322Ud2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f37695a;

    /* renamed from: b */
    public final TextView f37696b;

    public C36322Ud2(TextView textView, TextView textView2) {
        this.f37695a = textView;
        this.f37696b = textView2;
    }

    /* renamed from: a */
    public static C36322Ud2 m81223a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C36322Ud2(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f37695a;
    }
}

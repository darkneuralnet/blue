package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: Bf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C31894Bf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f2637a;

    /* renamed from: b */
    public final TextView f2638b;

    public C31894Bf2(TextView textView, TextView textView2) {
        this.f2637a = textView;
        this.f2638b = textView2;
    }

    /* renamed from: a */
    public static C31894Bf2 m113732a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C31894Bf2(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f2637a;
    }
}

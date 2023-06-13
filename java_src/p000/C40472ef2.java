package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: ef2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40472ef2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f78670a;

    /* renamed from: b */
    public final TextView f78671b;

    public C40472ef2(TextView textView, TextView textView2) {
        this.f78670a = textView;
        this.f78671b = textView2;
    }

    /* renamed from: a */
    public static C40472ef2 m42649a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C40472ef2(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f78670a;
    }
}

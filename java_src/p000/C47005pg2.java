package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: pg2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47005pg2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f103903a;

    /* renamed from: b */
    public final TextView f103904b;

    public C47005pg2(TextView textView, TextView textView2) {
        this.f103903a = textView;
        this.f103904b = textView2;
    }

    /* renamed from: a */
    public static C47005pg2 m18998a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C47005pg2(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f103903a;
    }
}

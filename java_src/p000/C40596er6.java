package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: er6  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C40596er6 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f79028a;

    /* renamed from: b */
    public final TextView f79029b;

    public C40596er6(TextView textView, TextView textView2) {
        this.f79028a = textView;
        this.f79029b = textView2;
    }

    /* renamed from: a */
    public static C40596er6 m42481a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C40596er6(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f79028a;
    }
}

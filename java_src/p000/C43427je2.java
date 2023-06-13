package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: je2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C43427je2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f93073a;

    /* renamed from: b */
    public final TextView f93074b;

    public C43427je2(TextView textView, TextView textView2) {
        this.f93073a = textView;
        this.f93074b = textView2;
    }

    /* renamed from: a */
    public static C43427je2 m30155a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C43427je2(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f93073a;
    }
}

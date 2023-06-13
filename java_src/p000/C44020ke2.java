package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: ke2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C44020ke2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f94698a;

    /* renamed from: b */
    public final TextView f94699b;

    public C44020ke2(TextView textView, TextView textView2) {
        this.f94698a = textView;
        this.f94699b = textView2;
    }

    /* renamed from: a */
    public static C44020ke2 m28708a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C44020ke2(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f94698a;
    }
}

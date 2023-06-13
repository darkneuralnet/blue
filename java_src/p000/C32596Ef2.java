package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: Ef2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32596Ef2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f7925a;

    /* renamed from: b */
    public final TextView f7926b;

    public C32596Ef2(TextView textView, TextView textView2) {
        this.f7925a = textView;
        this.f7926b = textView2;
    }

    /* renamed from: a */
    public static C32596Ef2 m108595a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C32596Ef2(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f7925a;
    }
}

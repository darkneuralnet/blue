package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: me2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45206me2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f98493a;

    /* renamed from: b */
    public final TextView f98494b;

    public C45206me2(TextView textView, TextView textView2) {
        this.f98493a = textView;
        this.f98494b = textView2;
    }

    /* renamed from: a */
    public static C45206me2 m25242a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C45206me2(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f98493a;
    }
}

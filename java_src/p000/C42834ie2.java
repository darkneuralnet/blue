package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: ie2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C42834ie2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f87624a;

    /* renamed from: b */
    public final TextView f87625b;

    public C42834ie2(TextView textView, TextView textView2) {
        this.f87624a = textView;
        this.f87625b = textView2;
    }

    /* renamed from: a */
    public static C42834ie2 m33647a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C42834ie2(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f87624a;
    }
}

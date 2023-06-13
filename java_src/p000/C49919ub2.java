package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: ub2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C49919ub2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f112657a;

    /* renamed from: b */
    public final TextView f112658b;

    public C49919ub2(TextView textView, TextView textView2) {
        this.f112657a = textView;
        this.f112658b = textView2;
    }

    /* renamed from: a */
    public static C49919ub2 m10002a(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new C49919ub2(textView, textView);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f112657a;
    }
}

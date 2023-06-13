package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: bf2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C38676bf2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f57840a;

    public C38676bf2(TextView textView) {
        this.f57840a = textView;
    }

    /* renamed from: a */
    public static C38676bf2 m64204a(View view) {
        if (view != null) {
            return new C38676bf2((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f57840a;
    }
}

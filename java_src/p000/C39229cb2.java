package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: cb2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39229cb2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f60931a;

    public C39229cb2(TextView textView) {
        this.f60931a = textView;
    }

    /* renamed from: a */
    public static C39229cb2 m61188a(View view) {
        if (view != null) {
            return new C39229cb2((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f60931a;
    }
}

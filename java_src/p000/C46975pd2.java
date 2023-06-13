package p000;

import android.view.View;
import android.widget.TextView;
/* renamed from: pd2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C46975pd2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final TextView f103862a;

    public C46975pd2(TextView textView) {
        this.f103862a = textView;
    }

    /* renamed from: a */
    public static C46975pd2 m19056a(View view) {
        if (view != null) {
            return new C46975pd2((TextView) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public TextView getRoot() {
        return this.f103862a;
    }
}

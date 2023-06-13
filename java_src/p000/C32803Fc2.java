package p000;

import android.view.View;
import co.bird.android.widget.standardcomponents.LabeledDetailItemView;
/* renamed from: Fc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32803Fc2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LabeledDetailItemView f9760a;

    public C32803Fc2(LabeledDetailItemView labeledDetailItemView) {
        this.f9760a = labeledDetailItemView;
    }

    /* renamed from: a */
    public static C32803Fc2 m106908a(View view) {
        if (view != null) {
            return new C32803Fc2((LabeledDetailItemView) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LabeledDetailItemView getRoot() {
        return this.f9760a;
    }
}

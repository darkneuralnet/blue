package p000;

import android.view.View;
import co.bird.android.widget.standardcomponents.LabeledRatingItemView;
/* renamed from: Gc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33037Gc2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final LabeledRatingItemView f12149a;

    public C33037Gc2(LabeledRatingItemView labeledRatingItemView) {
        this.f12149a = labeledRatingItemView;
    }

    /* renamed from: a */
    public static C33037Gc2 m104969a(View view) {
        if (view != null) {
            return new C33037Gc2((LabeledRatingItemView) view);
        }
        throw new NullPointerException("rootView");
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public LabeledRatingItemView getRoot() {
        return this.f12149a;
    }
}

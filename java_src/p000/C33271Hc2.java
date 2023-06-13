package p000;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.chip.ChipGroup;
/* renamed from: Hc2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C33271Hc2 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f13636a;

    /* renamed from: b */
    public final TextView f13637b;

    /* renamed from: c */
    public final ChipGroup f13638c;

    public C33271Hc2(ConstraintLayout constraintLayout, TextView textView, ChipGroup chipGroup) {
        this.f13636a = constraintLayout;
        this.f13637b = textView;
        this.f13638c = chipGroup;
    }

    /* renamed from: a */
    public static C33271Hc2 m103656a(View view) {
        int i = C52955zi4.label;
        TextView textView = (TextView) C34328Lp6.m96312a(view, i);
        if (textView != null) {
            i = C52955zi4.tags;
            ChipGroup chipGroup = (ChipGroup) C34328Lp6.m96312a(view, i);
            if (chipGroup != null) {
                return new C33271Hc2((ConstraintLayout) view, textView, chipGroup);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f13636a;
    }
}

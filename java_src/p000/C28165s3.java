package p000;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import co.bird.android.widget.EditTextBox;
/* renamed from: s3 */
/* loaded from: classes3.dex */
public final class C28165s3 implements InterfaceC34094Kp6 {

    /* renamed from: a */
    public final ConstraintLayout f108173a;

    /* renamed from: b */
    public final Button f108174b;

    /* renamed from: c */
    public final EditTextBox f108175c;

    public C28165s3(ConstraintLayout constraintLayout, Button button, EditTextBox editTextBox) {
        this.f108173a = constraintLayout;
        this.f108174b = button;
        this.f108175c = editTextBox;
    }

    /* renamed from: a */
    public static C28165s3 m14825a(View view) {
        int i = C38115ai4.createBatchButton;
        Button button = (Button) C34328Lp6.m96312a(view, i);
        if (button != null) {
            i = C38115ai4.createBatchEditText;
            EditTextBox editTextBox = (EditTextBox) C34328Lp6.m96312a(view, i);
            if (editTextBox != null) {
                return new C28165s3((ConstraintLayout) view, button, editTextBox);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public static C28165s3 m14823c(LayoutInflater layoutInflater) {
        return m14822d(layoutInflater, null, false);
    }

    /* renamed from: d */
    public static C28165s3 m14822d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C34740Nj4.activity_create_batch, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m14825a(inflate);
    }

    @Override // p000.InterfaceC34094Kp6
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f108173a;
    }
}

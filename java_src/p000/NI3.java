package p000;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.C17930a;
/* renamed from: NI3 */
/* loaded from: classes6.dex */
public class NI3 extends AbstractC36546Vc1 {

    /* renamed from: e */
    public int f24414e;

    /* renamed from: f */
    public EditText f24415f;

    /* renamed from: g */
    public final View.OnClickListener f24416g;

    public NI3(C17930a c17930a, int i) {
        super(c17930a);
        this.f24414e = C52935zg4.design_password_eye;
        this.f24416g = new View.OnClickListener() { // from class: MI3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NI3.this.m94073y(view);
            }
        };
        if (i != 0) {
            this.f24414e = i;
        }
    }

    /* renamed from: x */
    public static boolean m94074x(EditText editText) {
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public /* synthetic */ void m94073y(View view) {
        EditText editText = this.f24415f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (m94075w()) {
            this.f24415f.setTransformationMethod(null);
        } else {
            this.f24415f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            this.f24415f.setSelection(selectionEnd);
        }
        m79662r();
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: b */
    public void mo79663b(CharSequence charSequence, int i, int i2, int i3) {
        m79662r();
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: c */
    public int mo43212c() {
        return C40534el4.password_toggle_content_description;
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: d */
    public int mo43211d() {
        return this.f24414e;
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: f */
    public View.OnClickListener mo43209f() {
        return this.f24416g;
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: l */
    public boolean mo43204l() {
        return true;
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: m */
    public boolean mo43203m() {
        return !m94075w();
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: n */
    public void mo43202n(EditText editText) {
        this.f24415f = editText;
        m79662r();
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: s */
    public void mo25864s() {
        if (m94074x(this.f24415f)) {
            this.f24415f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // p000.AbstractC36546Vc1
    /* renamed from: u */
    public void mo43198u() {
        EditText editText = this.f24415f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* renamed from: w */
    public final boolean m94075w() {
        EditText editText = this.f24415f;
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            return true;
        }
        return false;
    }
}

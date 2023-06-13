package p000;

import android.os.IBinder;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.facebook.share.internal.C17296a;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\f\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0003¨\u0006\u0006"}, m28432d2 = {"Landroid/widget/EditText;", "", C17296a.f69688o, "Lcom/google/android/material/textfield/TextInputEditText;", "Lcom/google/android/material/textfield/TextInputLayout;", "b", "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: R91 */
/* loaded from: classes3.dex */
public final class R91 {
    /* renamed from: a */
    public static final void m87234a(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        editText.clearFocus();
        IBinder windowToken = editText.getWindowToken();
        if (windowToken != null) {
            Object systemService = editText.getContext().getApplicationContext().getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(windowToken, 0);
        }
    }

    /* renamed from: b */
    public static final TextInputLayout m87233b(TextInputEditText textInputEditText) {
        Intrinsics.checkNotNullParameter(textInputEditText, "<this>");
        for (ViewParent parent = textInputEditText.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }
}

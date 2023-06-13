package p000;

import android.widget.EditText;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u001a\f\u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u0001¨\u0006\u0004"}, m28432d2 = {"Landroid/widget/EditText;", "", C17296a.f69688o, "b", "app_birdRelease"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: kx5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C44213kx5 {
    /* renamed from: a */
    public static final String m28093a(EditText editText) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        return m28092b(editText.getText().toString());
    }

    /* renamed from: b */
    public static final String m28092b(String str) {
        boolean z;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return str;
    }
}

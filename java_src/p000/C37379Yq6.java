package p000;

import android.view.View;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a&\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¨\u0006\b"}, m28432d2 = {"Landroid/view/View;", "", "resId", "Lkotlin/Function1;", "", "", "setTextFunction", C17296a.f69688o, "reword_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: Yq6  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37379Yq6 {
    /* renamed from: a */
    public static final void m74095a(View view, int i, Function1<? super CharSequence, Unit> setTextFunction) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(setTextFunction, "setTextFunction");
        CharSequence text = view.getResources().getText(i);
        Intrinsics.checkNotNullExpressionValue(text, "resources.getText(resId)");
        setTextFunction.invoke(text);
    }
}

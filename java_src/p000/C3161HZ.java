package p000;

import android.view.View;
import com.facebook.share.internal.C17296a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001a\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002\u001a\n\u0010\u0006\u001a\u00020\u0003*\u00020\u0005¨\u0006\u0007"}, m28432d2 = {"Landroid/view/View;", "V", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "", "b", "", C17296a.f69688o, "widget_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: HZ */
/* loaded from: classes4.dex */
public final class C3161HZ {
    /* renamed from: a */
    public static final boolean m103747a(int i) {
        boolean contains;
        contains = ArraysKt___ArraysKt.contains(C2889GZ.f12078a.m105006a(), Integer.valueOf(i));
        return contains;
    }

    /* renamed from: b */
    public static final <V extends View> boolean m103746b(BottomSheetBehavior<V> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "<this>");
        return m103747a(bottomSheetBehavior.m50128L());
    }
}

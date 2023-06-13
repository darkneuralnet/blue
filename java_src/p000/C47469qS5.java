package p000;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p003ui.platform.C11411h;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C45690nS5;
@Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0005"}, m28432d2 = {"LnS5;", "string", "", C17296a.f69688o, "(ILEt0;I)Ljava/lang/String;", "material_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStrings.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material/Strings_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,38:1\n76#2:39\n76#2:40\n*S KotlinDebug\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material/Strings_androidKt\n*L\n26#1:39\n27#1:40\n*E\n"})
/* renamed from: qS5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47469qS5 {
    /* renamed from: a */
    public static final String m17501a(int i, InterfaceC32720Et0 interfaceC32720Et0, int i2) {
        String str;
        interfaceC32720Et0.mo89638F(-726638443);
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(-726638443, i2, -1, "androidx.compose.material.getString (Strings.android.kt:24)");
        }
        interfaceC32720Et0.mo89572c(C11411h.m68325f());
        Resources resources = ((Context) interfaceC32720Et0.mo89572c(C11411h.m68324g())).getResources();
        C45690nS5.C26520a c26520a = C45690nS5.f99991a;
        if (C45690nS5.m23665i(i, c26520a.m23660e())) {
            str = resources.getString(C43499jl4.navigation_menu);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.navigation_menu)");
        } else if (C45690nS5.m23665i(i, c26520a.m23664a())) {
            str = resources.getString(C43499jl4.close_drawer);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.close_drawer)");
        } else if (C45690nS5.m23665i(i, c26520a.m23663b())) {
            str = resources.getString(C43499jl4.close_sheet);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.close_sheet)");
        } else if (C45690nS5.m23665i(i, c26520a.m23662c())) {
            str = resources.getString(C43499jl4.default_error_message);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.st…ng.default_error_message)");
        } else if (C45690nS5.m23665i(i, c26520a.m23661d())) {
            str = resources.getString(C43499jl4.dropdown_menu);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.dropdown_menu)");
        } else if (C45690nS5.m23665i(i, c26520a.m23658g())) {
            str = resources.getString(C43499jl4.range_start);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.range_start)");
        } else if (C45690nS5.m23665i(i, c26520a.m23659f())) {
            str = resources.getString(C43499jl4.range_end);
            Intrinsics.checkNotNullExpressionValue(str, "resources.getString(R.string.range_end)");
        } else {
            str = "";
        }
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        interfaceC32720Et0.mo89605Q();
        return str;
    }
}

package p000;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p003ui.platform.C11411h;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Landroid/content/res/Resources;", C17296a.f69688o, "(LEt0;I)Landroid/content/res/Resources;", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Resources.android.kt\nandroidx/compose/ui/res/Resources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,34:1\n76#2:35\n76#2:36\n*S KotlinDebug\n*F\n+ 1 Resources.android.kt\nandroidx/compose/ui/res/Resources_androidKt\n*L\n32#1:35\n33#1:36\n*E\n"})
/* renamed from: DM4 */
/* loaded from: classes.dex */
public final class DM4 {
    /* renamed from: a */
    public static final Resources m110565a(InterfaceC32720Et0 interfaceC32720Et0, int i) {
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1554054999, i, -1, "androidx.compose.ui.res.resources (Resources.android.kt:30)");
        }
        interfaceC32720Et0.mo89572c(C11411h.m68325f());
        Resources resources = ((Context) interfaceC32720Et0.mo89572c(C11411h.m68324g())).getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "LocalContext.current.resources");
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        return resources;
    }
}

package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\u000b\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a5\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m28432d2 = {"", "id", "", "c", "(ILEt0;I)Ljava/lang/String;", "", "", "formatArgs", DateTokenConverter.CONVERTER_KEY, "(I[Ljava/lang/Object;LEt0;I)Ljava/lang/String;", "count", C17296a.f69688o, "(IILEt0;I)Ljava/lang/String;", "b", "(II[Ljava/lang/Object;LEt0;I)Ljava/lang/String;", "ui_release"}, m28431k = 2, m28430mv = {1, 8, 0})
/* renamed from: fS5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40946fS5 {
    /* renamed from: a */
    public static final String m41312a(int i, int i2, InterfaceC32720Et0 interfaceC32720Et0, int i3) {
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1784741530, i3, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:73)");
        }
        String quantityString = DM4.m110565a(interfaceC32720Et0, 0).getQuantityString(i, i2);
        Intrinsics.checkNotNullExpressionValue(quantityString, "resources.getQuantityString(id, count)");
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        return quantityString;
    }

    /* renamed from: b */
    public static final String m41311b(int i, int i2, Object[] formatArgs, InterfaceC32720Et0 interfaceC32720Et0, int i3) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(523207213, i3, -1, "androidx.compose.ui.res.pluralStringResource (StringResources.android.kt:88)");
        }
        String quantityString = DM4.m110565a(interfaceC32720Et0, 0).getQuantityString(i, i2, Arrays.copyOf(formatArgs, formatArgs.length));
        Intrinsics.checkNotNullExpressionValue(quantityString, "resources.getQuantityStr…g(id, count, *formatArgs)");
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        return quantityString;
    }

    /* renamed from: c */
    public static final String m41310c(int i, InterfaceC32720Et0 interfaceC32720Et0, int i2) {
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(1223887937, i2, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:32)");
        }
        String string = DM4.m110565a(interfaceC32720Et0, 0).getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(id)");
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        return string;
    }

    /* renamed from: d */
    public static final String m41309d(int i, Object[] formatArgs, InterfaceC32720Et0 interfaceC32720Et0, int i2) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87816Z(2071230100, i2, -1, "androidx.compose.ui.res.stringResource (StringResources.android.kt:46)");
        }
        String string = DM4.m110565a(interfaceC32720Et0, 0).getString(i, Arrays.copyOf(formatArgs, formatArgs.length));
        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(id, *formatArgs)");
        if (C35528Qt0.m87827O()) {
            C35528Qt0.m87817Y();
        }
        return string;
    }
}

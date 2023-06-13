package p000;

import android.content.Context;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.zip.GZIPOutputStream;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p053io.ByteStreamsKt;
import kotlin.p053io.CloseableKt;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00010\u0000\u001a\f\u0010\u0004\u001a\u0004\u0018\u00010\u0002*\u00020\u0001\u001a\f\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\u00020\u0001\u001a\u001a\u0010\n\u001a\u00020\b*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¨\u0006\u000b"}, m28432d2 = {"", "Landroid/net/Uri;", "", C17296a.f69688o, "b", "c", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljava/io/File;", "target", DateTokenConverter.CONVERTER_KEY, "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUri+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Uri+.kt\nco/bird/android/library/extension/Uri_Kt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,31:1\n766#2:32\n857#2,2:33\n1549#2:35\n1620#2,3:36\n*S KotlinDebug\n*F\n+ 1 Uri+.kt\nco/bird/android/library/extension/Uri_Kt\n*L\n9#1:32\n9#1:33,2\n10#1:35\n10#1:36,3\n*E\n"})
/* renamed from: If6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C33536If6 {
    /* renamed from: a */
    public static final List<String> m101827a(List<? extends Uri> list) {
        int collectionSizeOrDefault;
        boolean contains$default;
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList<Uri> arrayList = new ArrayList();
        for (Object obj : list) {
            String scheme = ((Uri) obj).getScheme();
            boolean z = false;
            if (scheme != null) {
                Intrinsics.checkNotNullExpressionValue(scheme, "scheme");
                contains$default = StringsKt__StringsKt.contains$default((CharSequence) scheme, (CharSequence) "http", false, 2, (Object) null);
                if (contains$default) {
                    z = true;
                }
            }
            if (z) {
                arrayList.add(obj);
            }
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        for (Uri uri : arrayList) {
            arrayList2.add(uri.toString());
        }
        return arrayList2;
    }

    /* renamed from: b */
    public static final String m101826b(Uri uri) {
        Object firstOrNull;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments != null) {
            firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) pathSegments);
            String str = (String) firstOrNull;
            if (str != null) {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                return lowerCase;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static final String m101825c(Uri uri) {
        Object orNull;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments != null) {
            orNull = CollectionsKt___CollectionsKt.getOrNull(pathSegments, 1);
            String str = (String) orNull;
            if (str != null) {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                return lowerCase;
            }
        }
        return null;
    }

    /* renamed from: d */
    public static final File m101824d(Uri uri, Context context, File target) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(target, "target");
        target.delete();
        target.createNewFile();
        InputStream openInputStream = context.getContentResolver().openInputStream(uri);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new FileOutputStream(target));
        if (openInputStream != null) {
            try {
                ByteStreamsKt.copyTo$default(openInputStream, gZIPOutputStream, 0, 2, null);
            } finally {
            }
        }
        CloseableKt.closeFinally(gZIPOutputStream, null);
        if (openInputStream != null) {
            openInputStream.close();
        }
        return target;
    }
}

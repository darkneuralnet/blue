package p000;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u000b"}, m28432d2 = {"Lwv2;", "", "Luv2;", "localeList", C17296a.f69688o, "LQd;", "textPaint", "", "b", "<init>", "()V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLocaleExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocaleExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/LocaleListHelperMethods\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,50:1\n1549#2:51\n1620#2,3:52\n1549#2:57\n1620#2,3:58\n37#3,2:55\n37#3,2:61\n*S KotlinDebug\n*F\n+ 1 LocaleExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/LocaleListHelperMethods\n*L\n40#1:51\n40#1:52,3\n47#1:57\n47#1:58,3\n40#1:55,2\n47#1:61,2\n*E\n"})
/* renamed from: wv2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51304wv2 {

    /* renamed from: a */
    public static final C51304wv2 f116826a = new C51304wv2();

    private C51304wv2() {
    }

    /* renamed from: a */
    public final Object m6103a(C50119uv2 localeList) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(localeList, "localeList");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(localeList, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<C47748qv2> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(C49526tv2.m11220a(it.next()));
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    /* renamed from: b */
    public final void m6102b(C6816Qd textPaint, C50119uv2 localeList) {
        int collectionSizeOrDefault;
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        Intrinsics.checkNotNullParameter(localeList, "localeList");
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(localeList, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<C47748qv2> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(C49526tv2.m11220a(it.next()));
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        textPaint.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}

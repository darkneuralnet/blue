package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0013"}, m28432d2 = {"LJt4;", "", "", "raw", "e", "c", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Pair;", "b", C17296a.f69688o, "", "Ljava/util/List;", "getINVENTORY_PART_SCAN_QUANTITY", "()Ljava/util/List;", "INVENTORY_PART_SCAN_QUANTITY", "getINVENTORY_PART_SCAN_SKU", "INVENTORY_PART_SCAN_SKU", "<init>", "()V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRegex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Regex.kt\nco/bird/android/core/base/Regex\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1603#2,9:68\n1855#2:77\n1856#2:79\n1612#2:80\n1603#2,9:81\n1855#2:90\n1856#2:92\n1612#2:93\n1#3:78\n1#3:91\n*S KotlinDebug\n*F\n+ 1 Regex.kt\nco/bird/android/core/base/Regex\n*L\n51#1:68,9\n51#1:77\n51#1:79\n51#1:80\n56#1:81,9\n56#1:90\n56#1:92\n56#1:93\n51#1:78\n56#1:91\n*E\n"})
/* renamed from: Jt4  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C33894Jt4 {

    /* renamed from: a */
    public static final C33894Jt4 f18402a = new C33894Jt4();

    /* renamed from: b */
    public static final List<String> f18403b;

    /* renamed from: c */
    public static final List<String> f18404c;

    static {
        List<String> listOf;
        List<String> listOf2;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"\\bbin quantity:(.*)", "\"\\bbin_quantity\" : (.[0-9]*)", "\\bpackage qty.:(.*)", "([0-9]*)  \\bSKU"});
        f18403b = listOf;
        listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"\\bsku:(.*)", "\"\\bsku\" : \"(.*)\"", "sku:(.*)", "\\bSKU (.*)"});
        f18404c = listOf2;
    }

    private C33894Jt4() {
    }

    /* renamed from: a */
    public final String m99601a(String raw) {
        List<String> list;
        Object lastOrNull;
        Intrinsics.checkNotNullParameter(raw, "raw");
        MatchResult matchEntire = new Regex("(^(http://|https://)?|https?://)(container-order|r).bird.co/(.*)", RegexOption.IGNORE_CASE).matchEntire(raw);
        if (matchEntire != null) {
            list = matchEntire.getGroupValues();
        } else {
            list = null;
        }
        if (list != null) {
            lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) list);
            return (String) lastOrNull;
        }
        return null;
    }

    /* renamed from: b */
    public final Pair<String, String> m99600b(String raw) {
        String str;
        Object firstOrNull;
        String str2;
        Object firstOrNull2;
        CharSequence trim;
        String str3;
        List<String> groupValues;
        Object lastOrNull;
        CharSequence trim2;
        List<String> groupValues2;
        Object lastOrNull2;
        Intrinsics.checkNotNullParameter(raw, "raw");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = f18403b.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            MatchResult find$default = Regex.find$default(new Regex((String) it.next(), RegexOption.IGNORE_CASE), raw, 0, 2, null);
            if (find$default != null && (groupValues2 = find$default.getGroupValues()) != null) {
                lastOrNull2 = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) groupValues2);
                str = (String) lastOrNull2;
            }
            if (str != null) {
                arrayList.add(str);
            }
        }
        firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) arrayList);
        String str4 = (String) firstOrNull;
        if (str4 != null) {
            trim2 = StringsKt__StringsKt.trim((CharSequence) str4);
            str2 = trim2.toString();
        } else {
            str2 = null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (String str5 : f18404c) {
            MatchResult find$default2 = Regex.find$default(new Regex(str5, RegexOption.IGNORE_CASE), raw, 0, 2, null);
            if (find$default2 != null && (groupValues = find$default2.getGroupValues()) != null) {
                lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) groupValues);
                str3 = (String) lastOrNull;
            } else {
                str3 = null;
            }
            if (str3 != null) {
                arrayList2.add(str3);
            }
        }
        firstOrNull2 = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) arrayList2);
        String str6 = (String) firstOrNull2;
        if (str6 != null) {
            trim = StringsKt__StringsKt.trim((CharSequence) str6);
            str = trim.toString();
        }
        return new Pair<>(str, str2);
    }

    /* renamed from: c */
    public final String m99599c(String raw) {
        List<String> groupValues;
        Object orNull;
        Intrinsics.checkNotNullParameter(raw, "raw");
        MatchResult matchEntire = new Regex("(.*?://)?(.*?/)?(.*)", RegexOption.IGNORE_CASE).matchEntire(raw);
        if (matchEntire != null && (groupValues = matchEntire.getGroupValues()) != null) {
            orNull = CollectionsKt___CollectionsKt.getOrNull(groupValues, 3);
            return (String) orNull;
        }
        return null;
    }

    /* renamed from: d */
    public final String m99598d(String raw) {
        List<String> list;
        Object lastOrNull;
        String takeLast;
        Intrinsics.checkNotNullParameter(raw, "raw");
        MatchResult matchEntire = new Regex("(^(http://|https://)?|https?://)(scan|r).bird.co/(.*)", RegexOption.IGNORE_CASE).matchEntire(raw);
        if (matchEntire != null) {
            list = matchEntire.getGroupValues();
        } else {
            list = null;
        }
        if (list != null) {
            lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) list);
            String str = (String) lastOrNull;
            if (str == null) {
                return null;
            }
            takeLast = StringsKt___StringsKt.takeLast(str, 36);
            return takeLast;
        }
        return null;
    }

    /* renamed from: e */
    public final String m99597e(String raw) {
        List<String> groupValues;
        Object orNull;
        Intrinsics.checkNotNullParameter(raw, "raw");
        MatchResult matchEntire = new Regex("(^(http://|https://)?|https?://)(ride|r).bird.co/(.*)", RegexOption.IGNORE_CASE).matchEntire(raw);
        if (matchEntire != null && (groupValues = matchEntire.getGroupValues()) != null) {
            orNull = CollectionsKt___CollectionsKt.getOrNull(groupValues, 4);
            return (String) orNull;
        }
        return null;
    }
}

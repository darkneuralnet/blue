package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.core.JsonPointer;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;
import p000.AbstractC51188wj6;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002R\u001c\u0010\f\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0015\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\r8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\n\u0010\u0019¨\u0006\u001d"}, m28432d2 = {"LjN5;", "", "", "socialSecurityNumber", "LYk1;", "c", "inputString", C17296a.f69688o, "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "b", "Ljava/util/regex/Pattern;", "CPF_PATTERN", "", "", "Ljava/util/List;", "CPF_MASK_GROUPING", "", DateTokenConverter.CONVERTER_KEY, "CPF_MASK_SEPARATORS", "e", "CNPJ_PATTERN", "f", "CNPJ_MASK_GROUPING", "g", "()Ljava/util/List;", "CNPJ_MASK_SEPARATORS", "<init>", "()V", "card_release"}, m28431k = 1, m28430mv = {1, 5, 1})
/* renamed from: jN5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C43273jN5 {

    /* renamed from: a */
    public static final C43273jN5 f92614a = new C43273jN5();

    /* renamed from: b */
    public static final Pattern f92615b = Pattern.compile("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");

    /* renamed from: c */
    public static final List<Integer> f92616c;

    /* renamed from: d */
    public static final List<Character> f92617d;

    /* renamed from: e */
    public static final Pattern f92618e;

    /* renamed from: f */
    public static final List<Integer> f92619f;

    /* renamed from: g */
    public static final List<Character> f92620g;

    static {
        List<Integer> listOf;
        List<Character> listOf2;
        List<Integer> listOf3;
        List<Character> listOf4;
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{3, 3, 3, 2});
        f92616c = listOf;
        Character valueOf = Character.valueOf(CoreConstants.DOT);
        Character valueOf2 = Character.valueOf(CoreConstants.DASH_CHAR);
        listOf2 = CollectionsKt__CollectionsKt.listOf((Object[]) new Character[]{valueOf, valueOf, valueOf2});
        f92617d = listOf2;
        f92618e = Pattern.compile("\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}");
        listOf3 = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{2, 3, 3, 4, 2});
        f92619f = listOf3;
        listOf4 = CollectionsKt__CollectionsKt.listOf((Object[]) new Character[]{valueOf, valueOf, Character.valueOf(JsonPointer.SEPARATOR), valueOf2});
        f92620g = listOf4;
    }

    private C43273jN5() {
    }

    /* renamed from: a */
    public final String m30747a(String inputString) {
        Pair m28425to;
        int lastIndex;
        boolean z;
        String take;
        Intrinsics.checkNotNullParameter(inputString, "inputString");
        StringBuilder sb = new StringBuilder();
        int length = inputString.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = inputString.charAt(i2);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "filterTo(StringBuilder(), predicate).toString()");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb3 = new StringBuilder();
        if (sb2.length() <= 11) {
            m28425to = TuplesKt.m28425to(f92616c, f92617d);
        } else {
            m28425to = TuplesKt.m28425to(f92619f, f92620g);
        }
        List list = (List) m28425to.component1();
        List list2 = (List) m28425to.component2();
        int size = list.size() - 1;
        if (size >= 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                if (sb2.length() >= ((Number) list.get(i3)).intValue()) {
                    take = StringsKt___StringsKt.take(sb2, ((Number) list.get(i3)).intValue());
                    arrayList.add(take);
                    sb2 = sb2.substring(((Number) list.get(i3)).intValue());
                    Intrinsics.checkNotNullExpressionValue(sb2, "(this as java.lang.String).substring(startIndex)");
                } else {
                    if (sb2.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(sb2);
                        break;
                    }
                }
                if (i4 > size) {
                    break;
                }
                i3 = i4;
            }
        }
        for (Object obj : arrayList) {
            int i5 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            sb3.append((String) obj);
            lastIndex = CollectionsKt__CollectionsKt.getLastIndex(arrayList);
            if (i != lastIndex) {
                sb3.append(((Character) list2.get(i)).charValue());
            }
            i = i5;
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "resultBuilder.toString()");
        return sb4;
    }

    /* renamed from: b */
    public final List<Character> m30746b() {
        return f92620g;
    }

    /* renamed from: c */
    public final C37320Yk1<String> m30745c(String socialSecurityNumber) {
        AbstractC51188wj6 c29948a;
        Intrinsics.checkNotNullParameter(socialSecurityNumber, "socialSecurityNumber");
        StringBuilder sb = new StringBuilder();
        int length = socialSecurityNumber.length();
        for (int i = 0; i < length; i++) {
            char charAt = socialSecurityNumber.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "filterTo(StringBuilder(), predicate).toString()");
        int length2 = sb2.length();
        if (length2 == 11 && f92615b.matcher(socialSecurityNumber).matches()) {
            c29948a = AbstractC51188wj6.C29949b.f116411a;
        } else if (length2 == 14 && f92618e.matcher(socialSecurityNumber).matches()) {
            c29948a = AbstractC51188wj6.C29949b.f116411a;
        } else {
            c29948a = new AbstractC51188wj6.C29948a(C37557Zk4.checkout_social_security_number_not_valid);
        }
        StringBuilder sb3 = new StringBuilder();
        int length3 = socialSecurityNumber.length();
        for (int i2 = 0; i2 < length3; i2++) {
            char charAt2 = socialSecurityNumber.charAt(i2);
            if (Character.isDigit(charAt2)) {
                sb3.append(charAt2);
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "filterTo(StringBuilder(), predicate).toString()");
        return new C37320Yk1<>(sb4, c29948a);
    }
}

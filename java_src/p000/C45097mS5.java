package p000;

import android.annotation.SuppressLint;
import android.text.SpannableString;
import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import android.util.Base64;
import android.webkit.URLUtil;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.services.p026s3.internal.Constants;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u000b\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\u0006\u001a\u00020\u0005*\u00020\u0000\u001a\f\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u00020\u0000\u001a\n\u0010\b\u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010\t\u001a\u00020\u0000*\u00020\u0000\u001a\u0010\u0010\n\u001a\u0004\u0018\u00010\u0000*\u0004\u0018\u00010\u0000H\u0007\u001a\u001e\u0010\u0010\u001a\u00020\u000f*\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u000e\u001a\u00020\r\u001a\u001a\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0001\u001a\n\u0010\u0014\u001a\u00020\u0000*\u00020\u0000\u001a\u0014\u0010\u0018\u001a\u00020\u0017*\u00020\u00002\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u001a\n\u0010\u0019\u001a\u00020\u0000*\u00020\u0000\u001a\u0014\u0010\u001a\u001a\u00020\u0000*\u00020\u00172\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u001a\n\u0010\u001b\u001a\u00020\u0000*\u00020\u0000\u001a\u0014\u0010\u001d\u001a\u00020\u0001*\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u0001\u001a\u0014\u0010\u001f\u001a\u00020\u0017*\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u0001\u001a\n\u0010 \u001a\u00020\u0000*\u00020\u0000\u001a\n\u0010!\u001a\u00020\u0000*\u00020\u0000¨\u0006\""}, m28432d2 = {"", "", "h", "i", "l", "Ljava/util/Currency;", "o", "p", "q", "s", "r", "", Entry.TYPE_TEXT, "Landroid/text/style/CharacterStyle;", "spanType", "Landroid/text/SpannableString;", "n", "prefix", "ignoreCase", "k", C17296a.f69688o, "", "flags", "", "b", "c", DateTokenConverter.CONVERTER_KEY, "m", "expectAllNumeric", "g", "ignoreLastCharIfOddLength", "f", "e", "j", "extension_release"}, m28431k = 2, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nString+.kt\nKotlin\n*S Kotlin\n*F\n+ 1 String+.kt\nco/bird/android/library/extension/String_Kt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,286:1\n1174#2,2:287\n1113#2,3:294\n1559#3:289\n1590#3,4:290\n*S KotlinDebug\n*F\n+ 1 String+.kt\nco/bird/android/library/extension/String_Kt\n*L\n114#1:287,2\n189#1:294,3\n182#1:289\n182#1:290,4\n*E\n"})
/* renamed from: mS5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C45097mS5 {

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mS5$a */
    /* loaded from: classes3.dex */
    public static final class C26099a extends Lambda implements Function1<String, CharSequence> {

        /* renamed from: g */
        public static final C26099a f98042g = new C26099a();

        public C26099a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(String it) {
            String capitalize;
            Intrinsics.checkNotNullParameter(it, "it");
            capitalize = StringsKt__StringsJVMKt.capitalize(it);
            return capitalize;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: mS5$b */
    /* loaded from: classes3.dex */
    public static final class C26100b extends Lambda implements Function1<String, Boolean> {

        /* renamed from: g */
        public static final C26100b f98043g = new C26100b();

        public C26100b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.length() > 0);
        }
    }

    /* renamed from: a */
    public static final String m25605a(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] base64DecodeToByteArray$default = base64DecodeToByteArray$default(str, 0, 1, null);
        Charset forName = Charset.forName(Constants.DEFAULT_ENCODING);
        Intrinsics.checkNotNullExpressionValue(forName, "forName(\"UTF-8\")");
        return new String(base64DecodeToByteArray$default, forName);
    }

    /* renamed from: b */
    public static final byte[] m25604b(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] decode = Base64.decode(str, i);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(this, flags)");
        return decode;
    }

    public static /* synthetic */ byte[] base64DecodeToByteArray$default(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 11;
        }
        return m25604b(str, i);
    }

    public static /* synthetic */ String base64Encode$default(byte[] bArr, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 11;
        }
        return m25602d(bArr, i);
    }

    /* renamed from: c */
    public static final String m25603c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Charset forName = Charset.forName(Constants.DEFAULT_ENCODING);
        Intrinsics.checkNotNullExpressionValue(forName, "forName(\"UTF-8\")");
        byte[] bytes = str.getBytes(forName);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return base64Encode$default(bytes, 0, 1, null);
    }

    /* renamed from: d */
    public static final String m25602d(byte[] bArr, int i) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        byte[] encoded = Base64.encode(bArr, i);
        Intrinsics.checkNotNullExpressionValue(encoded, "encoded");
        Charset forName = Charset.forName(Constants.DEFAULT_ENCODING);
        Intrinsics.checkNotNullExpressionValue(forName, "forName(\"UTF-8\")");
        return new String(encoded, forName);
    }

    /* renamed from: e */
    public static final String m25601e(String str) {
        List split$default;
        String joinToString$default;
        Intrinsics.checkNotNullParameter(str, "<this>");
        String lowerCase = str.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        split$default = StringsKt__StringsKt.split$default((CharSequence) lowerCase, new String[]{"_", " "}, false, 0, 6, (Object) null);
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(split$default, " ", null, null, 0, null, C26099a.f98042g, 30, null);
        return joinToString$default;
    }

    /* renamed from: f */
    public static final byte[] m25600f(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!z && str.length() % 2 == 1) {
            throw new NumberFormatException("Invalid string length to parse to hex: " + str.length());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            bArr[i] = (byte) ((C38111ai0.m70832a(str.charAt(i2)) << 4) | C38111ai0.m70832a(str.charAt(i3)));
            i++;
            i2 = i3 + 1;
        }
        return bArr;
    }

    /* renamed from: g */
    public static final boolean m25599g(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        int i = 0;
        boolean z2 = false;
        for (int length = str.length() - 1; -1 < length; length--) {
            int charAt = str.charAt(length) - '0';
            if (charAt >= 0 && charAt <= 9) {
                if (z2 && (charAt = charAt * 2) > 9) {
                    charAt -= 9;
                }
                i += charAt;
                z2 = !z2;
            } else if (z) {
                return false;
            }
        }
        if (i % 10 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public static final boolean m25598h(String str) {
        boolean z;
        List split$default;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            split$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"@"}, false, 0, 6, (Object) null);
            if (split$default.size() == 2) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ byte[] hexToByteArray$default(String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m25600f(str, z);
    }

    /* renamed from: i */
    public static final boolean m25597i(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return URLUtil.isValidUrl(str);
    }

    public static /* synthetic */ boolean isLuhnChecksumValid$default(String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return m25599g(str, z);
    }

    /* renamed from: j */
    public static final String m25596j(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            Intrinsics.checkNotNullExpressionValue(messageDigest, "getInstance(\"MD5\")");
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            messageDigest.update(bytes);
            byte[] digest = messageDigest.digest();
            Intrinsics.checkNotNullExpressionValue(digest, "digest.digest()");
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & UByte.MAX_VALUE);
                while (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "hexString.toString()");
            return sb2;
        } catch (NoSuchAlgorithmException e) {
            C41318g46.m40158f(e, "Failed to convert string to md5 hash, device does not support algorithm", new Object[0]);
            return "";
        }
    }

    /* renamed from: k */
    public static final String m25595k(String str, CharSequence prefix, boolean z) {
        boolean startsWith;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        startsWith = StringsKt__StringsKt.startsWith(str, prefix, z);
        if (startsWith) {
            String substring = str.substring(prefix.length());
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        return str;
    }

    /* renamed from: l */
    public static final String m25594l(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return YK3.f44996a.m75244b().replace(str, "");
    }

    /* renamed from: m */
    public static final String m25593m(String str) {
        List split$default;
        int collectionSizeOrDefault;
        String joinToString$default;
        Intrinsics.checkNotNullParameter(str, "<this>");
        String lowerCase = str.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        split$default = StringsKt__StringsKt.split$default((CharSequence) lowerCase, new String[]{"_"}, false, 0, 6, (Object) null);
        List list = split$default;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            String str2 = (String) obj;
            if (i > 0) {
                str2 = StringsKt__StringsJVMKt.capitalize(str2);
            }
            arrayList.add(str2);
            i = i2;
        }
        joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, "", null, null, 0, null, null, 62, null);
        return joinToString$default;
    }

    /* renamed from: n */
    public static final SpannableString m25592n(CharSequence charSequence, String str, CharacterStyle spanType) {
        SpannableString spannableString;
        int indexOf$default;
        int indexOf$default2;
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(spanType, "spanType");
        if (charSequence instanceof SpannableString) {
            spannableString = (SpannableString) charSequence;
        } else {
            spannableString = new SpannableString(charSequence);
        }
        if (str == null) {
            str = "";
        }
        String str2 = str;
        indexOf$default = StringsKt__StringsKt.indexOf$default(charSequence, str2, 0, false, 6, (Object) null);
        indexOf$default2 = StringsKt__StringsKt.indexOf$default(charSequence, str2, 0, false, 6, (Object) null);
        spannableString.setSpan(spanType, indexOf$default, indexOf$default2 + str.length(), 33);
        return spannableString;
    }

    /* renamed from: o */
    public static final Currency m25591o(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String upperCase = str.toUpperCase(US);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        Currency currency = Currency.getInstance(upperCase);
        Intrinsics.checkNotNullExpressionValue(currency, "getInstance(this.toUpperCase(Locale.US))");
        return currency;
    }

    /* renamed from: p */
    public static final Currency m25590p(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return m25591o(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: q */
    public static final String m25589q(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((Intrinsics.compare((int) charAt, 31) > 0 || charAt == '\t') && Intrinsics.compare((int) charAt, 127) < 0) {
                sb.append(charAt);
            } else {
                sb.append('?');
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "strBuilder.toString()");
        return sb2;
    }

    @SuppressLint({"DefaultLocale"})
    /* renamed from: r */
    public static final String m25588r(String str) {
        String replace;
        String capitalize;
        if (str != null && (replace = YK3.f44996a.m75245a().replace(str, " ")) != null) {
            capitalize = StringsKt__StringsJVMKt.capitalize(replace);
            return capitalize;
        }
        return null;
    }

    /* renamed from: s */
    public static final String m25587s(String str) {
        Sequence asSequence;
        Sequence filter;
        String joinToString$default;
        Intrinsics.checkNotNullParameter(str, "<this>");
        asSequence = CollectionsKt___CollectionsKt.asSequence(new Regex("(?=[A-Z])").split(str, 0));
        filter = SequencesKt___SequencesKt.filter(asSequence, C26100b.f98043g);
        joinToString$default = SequencesKt___SequencesKt.joinToString$default(filter, "_", null, null, 0, null, null, 62, null);
        String lowerCase = joinToString$default.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    public static /* synthetic */ SpannableString span$default(CharSequence charSequence, String str, CharacterStyle characterStyle, int i, Object obj) {
        if ((i & 2) != 0) {
            characterStyle = new StyleSpan(1);
        }
        return m25592n(charSequence, str, characterStyle);
    }
}

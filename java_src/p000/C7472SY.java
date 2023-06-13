package p000;

import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\"\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, m28432d2 = {"LOY;", "", "contentType", C17296a.f69688o, "Lkotlin/text/Regex;", "Lkotlin/text/Regex;", "TEXT_CONTENT_TYPE", "fuel"}, m28431k = 2, m28430mv = {1, 4, 0})
/* renamed from: SY */
/* loaded from: classes5.dex */
public final class C7472SY {

    /* renamed from: a */
    public static final Regex f33860a = new Regex("^(?:text/.*|application/(?:csv|javascript|json|typescript|xml|x-yaml|x-www-form-urlencoded|vnd\\.coffeescript)|.*\\+(?:xml|json))");

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
        r11 = kotlin.text.StringsKt__StringsKt.substringAfter$default(r0, "CHARSET=", (java.lang.String) null, 2, (java.lang.Object) null);
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String m85306a(InterfaceC6029OY representationOfBytes, String str) {
        boolean z;
        long j;
        String str2;
        List split$default;
        int collectionSizeOrDefault;
        Charset charset;
        Object obj;
        String str3;
        CharSequence trim;
        Intrinsics.checkNotNullParameter(representationOfBytes, "$this$representationOfBytes");
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            str = "(unknown)";
        }
        if (f33860a.containsMatchIn(str)) {
            Regex regex = new Regex("^CHARSET=.*");
            if (str != null) {
                String upperCase = str.toUpperCase();
                Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase()");
                split$default = StringsKt__StringsKt.split$default((CharSequence) upperCase, new char[]{';'}, false, 0, 6, (Object) null);
                List<String> list = split$default;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (String str4 : list) {
                    if (str4 != null) {
                        trim = StringsKt__StringsKt.trim((CharSequence) str4);
                        arrayList.add(trim.toString());
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                }
                try {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (regex.matches((String) obj)) {
                                break;
                            }
                        } else {
                            obj = null;
                            break;
                        }
                    }
                    String str5 = (String) obj;
                    if (str5 == null || str3 == null) {
                        str3 = "";
                    }
                    charset = Charset.forName(str3);
                    Intrinsics.checkNotNullExpressionValue(charset, "Charset.forName(paramete…gAfter(\"CHARSET=\") ?: \"\")");
                } catch (IllegalCharsetNameException unused) {
                    charset = Charsets.US_ASCII;
                }
                return new String(representationOfBytes.mo12266e(), charset);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        Long mo12269a = representationOfBytes.mo12269a();
        if (mo12269a != null) {
            j = mo12269a.longValue();
        } else {
            j = -1;
        }
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return "(empty)";
        }
        if (i < 0) {
            str2 = "unknown number of bytes";
        } else {
            str2 = j + " bytes";
        }
        return CoreConstants.LEFT_PARENTHESIS_CHAR + str2 + " of " + str + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}

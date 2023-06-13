package p000;

import com.facebook.share.internal.C17296a;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\b\u0006\u001a2\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u001e\b\u0002\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00000\u0003j\u0002`\u0004\u001a8\u0010\t\u001a\u00020\u0000*\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u001e\b\u0002\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00000\u0003j\u0002`\u0004\"*\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00000\u0003j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n*0\b\u0002\u0010\f\"\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00000\u00032\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00000\u0003¨\u0006\r"}, m28432d2 = {"Ljava/io/InputStream;", "", "encoding", "Lkotlin/Function2;", "Lcom/github/kittinunf/fuel/util/DecodeFallbackCallback;", "unsupported", "b", "", "encodings", C17296a.f69688o, "Lkotlin/jvm/functions/Function2;", "UNSUPPORTED_DECODE_ENCODING", "DecodeFallbackCallback", "fuel"}, m28431k = 2, m28430mv = {1, 4, 0})
/* renamed from: tV0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C49269tV0 {

    /* renamed from: a */
    public static final Function2<InputStream, String, InputStream> f110544a = C28723a.f110545g;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Ljava/io/InputStream;", "<anonymous parameter 0>", "", "encoding", "", C17296a.f69688o, "(Ljava/io/InputStream;Ljava/lang/String;)Ljava/lang/Void;"}, m28431k = 3, m28430mv = {1, 4, 0})
    /* renamed from: tV0$a */
    /* loaded from: classes5.dex */
    public static final class C28723a extends Lambda implements Function2 {

        /* renamed from: g */
        public static final C28723a f110545g = new C28723a();

        public C28723a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Void invoke(InputStream inputStream, String encoding) {
            Intrinsics.checkNotNullParameter(inputStream, "<anonymous parameter 0>");
            Intrinsics.checkNotNullParameter(encoding, "encoding");
            throw new UnsupportedOperationException("Decoding " + encoding + " is not supported. Expected one of gzip, deflate, identity.");
        }
    }

    /* renamed from: a */
    public static final InputStream m12286a(InputStream decode, Iterable<String> encodings, Function2<? super InputStream, ? super String, ? extends InputStream> unsupported) {
        Intrinsics.checkNotNullParameter(decode, "$this$decode");
        Intrinsics.checkNotNullParameter(encodings, "encodings");
        Intrinsics.checkNotNullParameter(unsupported, "unsupported");
        for (String str : encodings) {
            decode = m12285b(decode, str, unsupported);
        }
        return decode;
    }

    /* renamed from: b */
    public static final InputStream m12285b(InputStream decode, String encoding, Function2<? super InputStream, ? super String, ? extends InputStream> unsupported) {
        CharSequence trim;
        InputStream gZIPInputStream;
        Intrinsics.checkNotNullParameter(decode, "$this$decode");
        Intrinsics.checkNotNullParameter(encoding, "encoding");
        Intrinsics.checkNotNullParameter(unsupported, "unsupported");
        trim = StringsKt__StringsKt.trim((CharSequence) encoding);
        String obj = trim.toString();
        if (obj != null) {
            String lowerCase = obj.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            int hashCode = lowerCase.hashCode();
            if (hashCode != -135761730) {
                if (hashCode != 0) {
                    if (hashCode != 3189082) {
                        if (hashCode != 757417932) {
                            if (hashCode == 1545112619 && lowerCase.equals("deflate")) {
                                gZIPInputStream = new InflaterInputStream(decode);
                                return gZIPInputStream;
                            }
                        } else if (lowerCase.equals("chunked")) {
                            return decode;
                        }
                    } else if (lowerCase.equals("gzip")) {
                        gZIPInputStream = new GZIPInputStream(decode);
                        return gZIPInputStream;
                    }
                } else if (lowerCase.equals("")) {
                    return decode;
                }
            } else if (lowerCase.equals("identity")) {
                return decode;
            }
            return unsupported.invoke(decode, encoding);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: c */
    public static /* synthetic */ InputStream m12284c(InputStream inputStream, Iterable iterable, Function2 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = f110544a;
        }
        return m12286a(inputStream, iterable, function2);
    }

    /* renamed from: d */
    public static /* synthetic */ InputStream m12283d(InputStream inputStream, String str, Function2 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            function2 = f110544a;
        }
        return m12285b(inputStream, str, function2);
    }
}

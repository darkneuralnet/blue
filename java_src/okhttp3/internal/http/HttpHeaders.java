package okhttp3.internal.http;

import com.stripe.android.financialconnections.p041ui.FinancialConnectionsSheetNativeActivity;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p053io.encoding.Base64;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;
import p000.M70;
@Metadata(m28433d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\n\u001a\u00020\t*\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\u0006H\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u001a\u0010\u0016\u001a\u00020\t*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0000\u001a\n\u0010\u0018\u001a\u00020\u000b*\u00020\u0017\u001a\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0017H\u0007\"\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\"\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, m28432d2 = {"Lokhttp3/Headers;", "", "headerName", "", "Lokhttp3/Challenge;", "parseChallenges", "Li30;", "", FinancialConnectionsSheetNativeActivity.EXTRA_RESULT, "", "readChallengeHeader", "", "skipCommasAndWhitespace", "", "prefix", "startsWith", "readQuotedString", "readToken", "Lokhttp3/CookieJar;", "Lokhttp3/HttpUrl;", "url", "headers", "receiveHeaders", "Lokhttp3/Response;", "promisesBody", "response", "hasBody", "LM70;", "QUOTED_STRING_DELIMITERS", "LM70;", "TOKEN_DELIMITERS", "okhttp"}, m28431k = 2, m28430mv = {1, 6, 0})
@JvmName(name = "HttpHeaders")
/* loaded from: classes8.dex */
public final class HttpHeaders {
    private static final M70 QUOTED_STRING_DELIMITERS;
    private static final M70 TOKEN_DELIMITERS;

    static {
        M70.C5195a c5195a = M70.f22644e;
        QUOTED_STRING_DELIMITERS = c5195a.m95794d("\"\\");
        TOKEN_DELIMITERS = c5195a.m95794d("\t ,=");
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "No longer supported", replaceWith = @ReplaceWith(expression = "response.promisesBody()", imports = {}))
    public static final boolean hasBody(Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return promisesBody(response);
    }

    public static final List<Challenge> parseChallenges(Headers headers, String headerName) {
        boolean equals;
        Intrinsics.checkNotNullParameter(headers, "<this>");
        Intrinsics.checkNotNullParameter(headerName, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            equals = StringsKt__StringsJVMKt.equals(headerName, headers.name(i), true);
            if (equals) {
                try {
                    readChallengeHeader(new C42488i30().mo24530a2(headers.value(i)), arrayList);
                } catch (EOFException e) {
                    Platform.Companion.get().log("Unable to parse challenge", 5, e);
                }
            }
            i = i2;
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        boolean equals;
        Intrinsics.checkNotNullParameter(response, "<this>");
        if (Intrinsics.areEqual(response.request().method(), "HEAD")) {
            return false;
        }
        int code = response.code();
        if (((code >= 100 && code < 200) || code == 204 || code == 304) && Util.headersContentLength(response) == -1) {
            equals = StringsKt__StringsJVMKt.equals("chunked", Response.header$default(response, "Transfer-Encoding", null, 2, null), true);
            if (!equals) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0079, code lost:
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0079, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void readChallengeHeader(C42488i30 c42488i30, List<Challenge> list) throws EOFException {
        String readToken;
        Map emptyMap;
        int skipAll;
        String readToken2;
        String repeat;
        while (true) {
            String str = null;
            while (true) {
                if (str == null) {
                    skipCommasAndWhitespace(c42488i30);
                    str = readToken(c42488i30);
                    if (str == null) {
                        return;
                    }
                }
                boolean skipCommasAndWhitespace = skipCommasAndWhitespace(c42488i30);
                readToken = readToken(c42488i30);
                if (readToken == null) {
                    if (!c42488i30.mo21945O2()) {
                        return;
                    }
                    emptyMap = MapsKt__MapsKt.emptyMap();
                    list.add(new Challenge(str, emptyMap));
                    return;
                }
                skipAll = Util.skipAll(c42488i30, Base64.padSymbol);
                boolean skipCommasAndWhitespace2 = skipCommasAndWhitespace(c42488i30);
                if (skipCommasAndWhitespace || (!skipCommasAndWhitespace2 && !c42488i30.mo21945O2())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int skipAll2 = skipAll + Util.skipAll(c42488i30, Base64.padSymbol);
                    while (true) {
                        if (readToken == null) {
                            readToken = readToken(c42488i30);
                            if (skipCommasAndWhitespace(c42488i30)) {
                                break;
                            }
                            skipAll2 = Util.skipAll(c42488i30, Base64.padSymbol);
                        }
                        if (skipAll2 == 0) {
                            break;
                        } else if (skipAll2 > 1 || skipCommasAndWhitespace(c42488i30)) {
                            return;
                        } else {
                            if (startsWith(c42488i30, (byte) 34)) {
                                readToken2 = readQuotedString(c42488i30);
                            } else {
                                readToken2 = readToken(c42488i30);
                            }
                            if (readToken2 == null || ((String) linkedHashMap.put(readToken, readToken2)) != null) {
                                return;
                            }
                            if (!skipCommasAndWhitespace(c42488i30) && !c42488i30.mo21945O2()) {
                                return;
                            }
                            readToken = null;
                        }
                    }
                    list.add(new Challenge(str, linkedHashMap));
                    str = readToken;
                }
            }
            repeat = StringsKt__StringsJVMKt.repeat("=", skipAll);
            Map singletonMap = Collections.singletonMap(null, Intrinsics.stringPlus(readToken, repeat));
            Intrinsics.checkNotNullExpressionValue(singletonMap, "singletonMap<String, Str…ek + \"=\".repeat(eqCount))");
            list.add(new Challenge(str, singletonMap));
        }
    }

    private static final String readQuotedString(C42488i30 c42488i30) throws EOFException {
        boolean z;
        if (c42488i30.readByte() == 34) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C42488i30 c42488i302 = new C42488i30();
            while (true) {
                long mo21929x1 = c42488i30.mo21929x1(QUOTED_STRING_DELIMITERS);
                if (mo21929x1 == -1) {
                    return null;
                }
                if (c42488i30.m34547p(mo21929x1) == 34) {
                    c42488i302.write(c42488i30, mo21929x1);
                    c42488i30.readByte();
                    return c42488i302.mo21932r1();
                } else if (c42488i30.size() == mo21929x1 + 1) {
                    return null;
                } else {
                    c42488i302.write(c42488i30, mo21929x1);
                    c42488i30.readByte();
                    c42488i302.write(c42488i30, 1L);
                }
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private static final String readToken(C42488i30 c42488i30) {
        long mo21929x1 = c42488i30.mo21929x1(TOKEN_DELIMITERS);
        if (mo21929x1 == -1) {
            mo21929x1 = c42488i30.size();
        }
        if (mo21929x1 != 0) {
            return c42488i30.m34573G(mo21929x1);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl url, Headers headers) {
        Intrinsics.checkNotNullParameter(cookieJar, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> parseAll = Cookie.Companion.parseAll(url, headers);
        if (parseAll.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(url, parseAll);
    }

    private static final boolean skipCommasAndWhitespace(C42488i30 c42488i30) {
        boolean z = false;
        while (!c42488i30.mo21945O2()) {
            byte m34547p = c42488i30.m34547p(0L);
            boolean z2 = true;
            if (m34547p == 44) {
                c42488i30.readByte();
                z = true;
            } else {
                if (m34547p != 32 && m34547p != 9) {
                    z2 = false;
                }
                if (!z2) {
                    break;
                }
                c42488i30.readByte();
            }
        }
        return z;
    }

    private static final boolean startsWith(C42488i30 c42488i30, byte b) {
        return !c42488i30.mo21945O2() && c42488i30.m34547p(0L) == b;
    }
}

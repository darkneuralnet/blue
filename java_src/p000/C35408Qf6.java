package p000;

import android.net.Uri;
import com.facebook.share.internal.C17296a;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Charsets;
import p000.C32992Fx2;
import p000.C47054pl1;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u001c\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0013"}, m28432d2 = {"LQf6;", "", "Lpl1;", "b", "Landroid/net/Uri;", "uri", "c", "fromUri", "toUri", "", C17296a.f69688o, "", "Ljava/lang/String;", "tag", "redirectContentTag", "Lpl1;", "urlRedirectFileLruCache", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: Qf6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35408Qf6 {

    /* renamed from: a */
    public static final String f30710a;

    /* renamed from: b */
    public static final String f30711b;

    /* renamed from: c */
    public static C47054pl1 f30712c;

    /* renamed from: d */
    public static final C35408Qf6 f30713d = new C35408Qf6();

    static {
        String simpleName = Reflection.getOrCreateKotlinClass(C35408Qf6.class).getSimpleName();
        if (simpleName == null) {
            simpleName = "UrlRedirectCache";
        }
        f30710a = simpleName;
        f30711b = simpleName + "_Redirect";
    }

    private C35408Qf6() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m88270a(Uri uri, Uri uri2) {
        String uri3;
        Charset charset;
        if (uri != null && uri2 != null) {
            OutputStream outputStream = null;
            try {
                try {
                    C47054pl1 m88269b = m88269b();
                    String uri4 = uri.toString();
                    Intrinsics.checkNotNullExpressionValue(uri4, "fromUri.toString()");
                    outputStream = m88269b.m18814l(uri4, f30711b);
                    uri3 = uri2.toString();
                    Intrinsics.checkNotNullExpressionValue(uri3, "toUri.toString()");
                    charset = Charsets.UTF_8;
                } catch (IOException e) {
                    C32992Fx2.C2516a c2516a = C32992Fx2.f10539f;
                    EnumC36034Sx2 enumC36034Sx2 = EnumC36034Sx2.CACHE;
                    String str = f30710a;
                    c2516a.m106216a(enumC36034Sx2, 4, str, "IOException when accessing cache: " + e.getMessage());
                }
                if (uri3 != null) {
                    byte[] bytes = uri3.getBytes(charset);
                    Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                    outputStream.write(bytes);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } finally {
                C52364yi6.m2839g(null);
            }
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final synchronized C47054pl1 m88269b() throws IOException {
        C47054pl1 c47054pl1;
        synchronized (C35408Qf6.class) {
            c47054pl1 = f30712c;
            if (c47054pl1 == null) {
                c47054pl1 = new C47054pl1(f30710a, new C47054pl1.C27376e());
            }
            f30712c = c47054pl1;
        }
        return c47054pl1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3, r10) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
        r5 = r6;
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
        p000.C32992Fx2.f10539f.m106216a(p000.EnumC36034Sx2.CACHE, 6, p000.C35408Qf6.f30710a, "A loop detected in UrlRedirectCache");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
        p000.C52364yi6.m2839g(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
        return null;
     */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00b7: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]), block:B:43:0x00b7 */
    @JvmStatic
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Uri m88268c(Uri uri) {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        InputStreamReader inputStreamReader3;
        InputStreamReader inputStreamReader4 = null;
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "uri.toString()");
        HashSet hashSet = new HashSet();
        hashSet.add(uri2);
        try {
            try {
                C47054pl1 m88269b = m88269b();
                InputStream m18818h = m88269b.m18818h(uri2, f30711b);
                inputStreamReader = null;
                boolean z = false;
                while (true) {
                    if (m18818h == null) {
                        break;
                    }
                    try {
                        inputStreamReader3 = new InputStreamReader(m18818h);
                    } catch (IOException e) {
                        e = e;
                    }
                    try {
                        char[] cArr = new char[128];
                        StringBuilder sb = new StringBuilder();
                        for (int read = inputStreamReader3.read(cArr, 0, 128); read > 0; read = inputStreamReader3.read(cArr, 0, 128)) {
                            sb.append(cArr, 0, read);
                        }
                        C52364yi6.m2839g(inputStreamReader3);
                        String sb2 = sb.toString();
                        Intrinsics.checkNotNullExpressionValue(sb2, "urlBuilder.toString()");
                        if (hashSet.contains(sb2)) {
                            break;
                        }
                        hashSet.add(sb2);
                        inputStreamReader = inputStreamReader3;
                        z = true;
                        m18818h = m88269b.m18818h(sb2, f30711b);
                        uri2 = sb2;
                    } catch (IOException e2) {
                        e = e2;
                        inputStreamReader = inputStreamReader3;
                        C32992Fx2.f10539f.m106216a(EnumC36034Sx2.CACHE, 4, f30710a, "IOException when accessing cache: " + e.getMessage());
                        C52364yi6.m2839g(inputStreamReader);
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        inputStreamReader4 = inputStreamReader3;
                        C52364yi6.m2839g(inputStreamReader4);
                        throw th;
                    }
                }
                if (z) {
                    Uri parse = Uri.parse(uri2);
                    C52364yi6.m2839g(inputStreamReader);
                    return parse;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStreamReader4 = inputStreamReader2;
            }
        } catch (IOException e3) {
            e = e3;
            inputStreamReader = null;
        } catch (Throwable th3) {
            th = th3;
        }
        C52364yi6.m2839g(inputStreamReader);
        return null;
    }
}

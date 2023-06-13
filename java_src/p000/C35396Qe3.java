package p000;

import com.facebook.share.internal.C17296a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0004*\u00020\u0003\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0006\u001a\n\u0010\b\u001a\u00020\u0004*\u00020\u0006\u001a\u0016\u0010\f\u001a\u00020\u0001*\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007\u001a\n\u0010\r\u001a\u00020\u0001*\u00020\t\u001a\n\u0010\u000e\u001a\u00020\u0004*\u00020\t\"\u001c\u0010\u0013\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\"\u001c\u0010\u0018\u001a\u00020\n*\u00060\u0014j\u0002`\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m28432d2 = {"Ljava/io/OutputStream;", "LwB5;", "f", "Ljava/io/InputStream;", "LAN5;", "j", "Ljava/net/Socket;", "g", "k", "Ljava/io/File;", "", "append", "e", "b", "i", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", C17296a.f69688o, "Ljava/util/logging/Logger;", "logger", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "c", "(Ljava/lang/AssertionError;)Z", "isAndroidGetsocknameError", "okio"}, m28431k = 5, m28430mv = {1, 6, 0}, m28427xs = "okio/Okio")
/* renamed from: Qe3 */
/* loaded from: classes8.dex */
public final /* synthetic */ class C35396Qe3 {

    /* renamed from: a */
    public static final Logger f30684a = Logger.getLogger("okio.Okio");

    /* renamed from: b */
    public static final InterfaceC50872wB5 m88285b(File file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return C34928Oe3.m91755h(new FileOutputStream(file, true));
    }

    /* renamed from: c */
    public static final boolean m88284c(AssertionError assertionError) {
        boolean z;
        Intrinsics.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        if (message != null) {
            z = StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "getsockname failed", false, 2, (Object) null);
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    @JvmOverloads
    /* renamed from: d */
    public static final InterfaceC50872wB5 m88283d(File file) throws FileNotFoundException {
        InterfaceC50872wB5 m88279h;
        Intrinsics.checkNotNullParameter(file, "<this>");
        m88279h = m88279h(file, false, 1, null);
        return m88279h;
    }

    @JvmOverloads
    /* renamed from: e */
    public static final InterfaceC50872wB5 m88282e(File file, boolean z) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return C34928Oe3.m91755h(new FileOutputStream(file, z));
    }

    /* renamed from: f */
    public static final InterfaceC50872wB5 m88281f(OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return new C41968hA3(outputStream, new J46());
    }

    /* renamed from: g */
    public static final InterfaceC50872wB5 m88280g(Socket socket) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        C44459lN5 c44459lN5 = new C44459lN5(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream()");
        return c44459lN5.sink(new C41968hA3(outputStream, c44459lN5));
    }

    /* renamed from: h */
    public static /* synthetic */ InterfaceC50872wB5 m88279h(File file, boolean z, int i, Object obj) throws FileNotFoundException {
        if ((i & 1) != 0) {
            z = false;
        }
        return C34928Oe3.m91756g(file, z);
    }

    /* renamed from: i */
    public static final AN5 m88278i(File file) throws FileNotFoundException {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new C47827r32(new FileInputStream(file), J46.NONE);
    }

    /* renamed from: j */
    public static final AN5 m88277j(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new C47827r32(inputStream, new J46());
    }

    /* renamed from: k */
    public static final AN5 m88276k(Socket socket) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        C44459lN5 c44459lN5 = new C44459lN5(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream()");
        return c44459lN5.source(new C47827r32(inputStream, c44459lN5));
    }
}

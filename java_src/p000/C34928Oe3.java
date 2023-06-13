package p000;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
@Metadata(m28433d1 = {"Qe3", "Re3"}, m28432d2 = {}, m28431k = 4, m28430mv = {1, 6, 0})
/* renamed from: Oe3  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C34928Oe3 {
    /* renamed from: a */
    public static final InterfaceC50872wB5 m91762a(File file) throws FileNotFoundException {
        return C35396Qe3.m88285b(file);
    }

    @JvmName(name = "blackhole")
    /* renamed from: b */
    public static final InterfaceC50872wB5 m91761b() {
        return C35630Re3.m86503a();
    }

    /* renamed from: c */
    public static final InterfaceC45453n30 m91760c(InterfaceC50872wB5 interfaceC50872wB5) {
        return C35630Re3.m86502b(interfaceC50872wB5);
    }

    /* renamed from: d */
    public static final InterfaceC46046o30 m91759d(AN5 an5) {
        return C35630Re3.m86501c(an5);
    }

    /* renamed from: e */
    public static final boolean m91758e(AssertionError assertionError) {
        return C35396Qe3.m88284c(assertionError);
    }

    @JvmOverloads
    /* renamed from: f */
    public static final InterfaceC50872wB5 m91757f(File file) throws FileNotFoundException {
        return C35396Qe3.m88283d(file);
    }

    @JvmOverloads
    /* renamed from: g */
    public static final InterfaceC50872wB5 m91756g(File file, boolean z) throws FileNotFoundException {
        return C35396Qe3.m88282e(file, z);
    }

    /* renamed from: h */
    public static final InterfaceC50872wB5 m91755h(OutputStream outputStream) {
        return C35396Qe3.m88281f(outputStream);
    }

    /* renamed from: i */
    public static final InterfaceC50872wB5 m91754i(Socket socket) throws IOException {
        return C35396Qe3.m88280g(socket);
    }

    /* renamed from: k */
    public static final AN5 m91752k(File file) throws FileNotFoundException {
        return C35396Qe3.m88278i(file);
    }

    /* renamed from: l */
    public static final AN5 m91751l(InputStream inputStream) {
        return C35396Qe3.m88277j(inputStream);
    }

    /* renamed from: m */
    public static final AN5 m91750m(Socket socket) throws IOException {
        return C35396Qe3.m88276k(socket);
    }
}

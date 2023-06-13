package p000;

import android.net.Uri;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* renamed from: pb8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C46961pb8 implements InterfaceC34483Mg8 {

    /* renamed from: a */
    public final C48157rc8 f103845a;

    public C46961pb8(C48157rc8 c48157rc8) {
        this.f103845a = c48157rc8;
    }

    @Override // p000.InterfaceC34483Mg8
    /* renamed from: a */
    public final OutputStream mo19076a(Uri uri) throws IOException {
        File m64283a = C38642bb8.m64283a(uri);
        C46628p19.m20140a(m64283a);
        return new C32818Fd8(new FileOutputStream(m64283a), m64283a);
    }

    @Override // p000.InterfaceC34483Mg8
    /* renamed from: b */
    public final void mo19075b(Uri uri) throws IOException {
        File m64283a = C38642bb8.m64283a(uri);
        if (!m64283a.isDirectory()) {
            if (!m64283a.delete()) {
                if (!m64283a.exists()) {
                    throw new FileNotFoundException(String.format("%s does not exist", uri));
                }
                throw new IOException(String.format("%s could not be deleted", uri));
            }
            return;
        }
        throw new FileNotFoundException(String.format("%s is a directory", uri));
    }

    @Override // p000.InterfaceC34483Mg8
    /* renamed from: c */
    public final File mo19074c(Uri uri) throws IOException {
        return C38642bb8.m64283a(uri);
    }

    @Override // p000.InterfaceC34483Mg8
    /* renamed from: d */
    public final InputStream mo19073d(Uri uri) throws IOException {
        return C48759sd8.m13918a(C38642bb8.m64283a(uri));
    }

    @Override // p000.InterfaceC34483Mg8
    /* renamed from: e */
    public final boolean mo19072e(Uri uri) throws IOException {
        return C38642bb8.m64283a(uri).exists();
    }

    @Override // p000.InterfaceC34483Mg8
    /* renamed from: f */
    public final void mo19071f(Uri uri, Uri uri2) throws IOException {
        File m64283a = C38642bb8.m64283a(uri);
        File m64283a2 = C38642bb8.m64283a(uri2);
        C46628p19.m20140a(m64283a2);
        if (m64283a.renameTo(m64283a2)) {
            return;
        }
        throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
    }

    @Override // p000.InterfaceC34483Mg8
    /* renamed from: x */
    public final String mo19070x() {
        return "file";
    }

    public C46961pb8() {
        this.f103845a = new C48157rc8();
    }
}

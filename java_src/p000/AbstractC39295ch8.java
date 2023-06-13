package p000;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* renamed from: ch8  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC39295ch8 implements InterfaceC34483Mg8 {
    @Override // p000.InterfaceC34483Mg8
    /* renamed from: a */
    public final OutputStream mo19076a(Uri uri) throws IOException {
        return mo61040h().mo19076a(mo61041g(uri));
    }

    @Override // p000.InterfaceC34483Mg8
    /* renamed from: b */
    public final void mo19075b(Uri uri) throws IOException {
        mo61040h().mo19075b(mo61041g(uri));
    }

    @Override // p000.InterfaceC34483Mg8
    /* renamed from: c */
    public /* synthetic */ File mo19074c(Uri uri) {
        throw null;
    }

    @Override // p000.InterfaceC34483Mg8
    /* renamed from: d */
    public InputStream mo19073d(Uri uri) throws IOException {
        throw null;
    }

    @Override // p000.InterfaceC34483Mg8
    /* renamed from: e */
    public boolean mo19072e(Uri uri) throws IOException {
        throw null;
    }

    @Override // p000.InterfaceC34483Mg8
    /* renamed from: f */
    public final void mo19071f(Uri uri, Uri uri2) throws IOException {
        mo61040h().mo19071f(mo61041g(uri), mo61041g(uri2));
    }

    /* renamed from: g */
    public Uri mo61041g(Uri uri) throws IOException {
        throw null;
    }

    /* renamed from: h */
    public abstract InterfaceC34483Mg8 mo61040h();
}

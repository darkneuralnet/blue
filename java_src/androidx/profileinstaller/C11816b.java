package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.C11816b;
import androidx.profileinstaller.C11817c;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
/* renamed from: androidx.profileinstaller.b */
/* loaded from: classes.dex */
public class C11816b {

    /* renamed from: a */
    public final AssetManager f55123a;

    /* renamed from: b */
    public final Executor f55124b;

    /* renamed from: c */
    public final C11817c.InterfaceC11820c f55125c;

    /* renamed from: e */
    public final File f55127e;

    /* renamed from: f */
    public final String f55128f;

    /* renamed from: g */
    public final String f55129g;

    /* renamed from: h */
    public final String f55130h;

    /* renamed from: j */
    public C38321b31[] f55132j;

    /* renamed from: k */
    public byte[] f55133k;

    /* renamed from: i */
    public boolean f55131i = false;

    /* renamed from: d */
    public final byte[] f55126d = m66810d();

    public C11816b(AssetManager assetManager, Executor executor, C11817c.InterfaceC11820c interfaceC11820c, String str, String str2, String str3, File file) {
        this.f55123a = assetManager;
        this.f55124b = executor;
        this.f55125c = interfaceC11820c;
        this.f55128f = str;
        this.f55129g = str2;
        this.f55130h = str3;
        this.f55127e = file;
    }

    /* renamed from: d */
    public static byte[] m66810d() {
        int i = Build.VERSION.SDK_INT;
        if (i > 34) {
            return null;
        }
        switch (i) {
            case 24:
            case 25:
                return F74.f8772e;
            case 26:
                return F74.f8771d;
            case 27:
                return F74.f8770c;
            case 28:
            case 29:
            case 30:
                return F74.f8769b;
            case 31:
            case 32:
            case 33:
            case 34:
                return F74.f8768a;
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m66807g(int i, Object obj) {
        this.f55125c.mo66787a(i, obj);
    }

    /* renamed from: k */
    public static boolean m66803k() {
        int i = Build.VERSION.SDK_INT;
        if (i > 34) {
            return false;
        }
        if (i != 24 && i != 25) {
            switch (i) {
                case 31:
                case 32:
                case 33:
                case 34:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final C11816b m66812b(C38321b31[] c38321b31Arr, byte[] bArr) {
        InputStream m66806h;
        try {
            m66806h = m66806h(this.f55123a, this.f55130h);
        } catch (FileNotFoundException e) {
            this.f55125c.mo66787a(9, e);
        } catch (IOException e2) {
            this.f55125c.mo66787a(7, e2);
        } catch (IllegalStateException e3) {
            this.f55132j = null;
            this.f55125c.mo66787a(8, e3);
        }
        if (m66806h != null) {
            try {
                this.f55132j = C74.m112845q(m66806h, C74.m112847o(m66806h, C74.f3414b), bArr, c38321b31Arr);
                m66806h.close();
                return this;
            } catch (Throwable th) {
                try {
                    m66806h.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (m66806h != null) {
            m66806h.close();
        }
        return null;
    }

    /* renamed from: c */
    public final void m66811c() {
        if (this.f55131i) {
            return;
        }
        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
    }

    /* renamed from: e */
    public boolean m66809e() {
        if (this.f55126d == null) {
            m66802l(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (this.f55127e.exists()) {
            if (!this.f55127e.canWrite()) {
                m66802l(4, null);
                return false;
            }
        } else {
            try {
                this.f55127e.createNewFile();
            } catch (IOException unused) {
                m66802l(4, null);
                return false;
            }
        }
        this.f55131i = true;
        return true;
    }

    /* renamed from: f */
    public final InputStream m66808f(AssetManager assetManager) {
        try {
            return m66806h(assetManager, this.f55129g);
        } catch (FileNotFoundException e) {
            this.f55125c.mo66787a(6, e);
            return null;
        } catch (IOException e2) {
            this.f55125c.mo66787a(7, e2);
            return null;
        }
    }

    /* renamed from: h */
    public final InputStream m66806h(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f55125c.mo66786b(5, null);
            }
            return null;
        }
    }

    /* renamed from: i */
    public C11816b m66805i() {
        C11816b m66812b;
        m66811c();
        if (this.f55126d == null) {
            return this;
        }
        InputStream m66808f = m66808f(this.f55123a);
        if (m66808f != null) {
            this.f55132j = m66804j(m66808f);
        }
        C38321b31[] c38321b31Arr = this.f55132j;
        if (c38321b31Arr != null && m66803k() && (m66812b = m66812b(c38321b31Arr, this.f55126d)) != null) {
            return m66812b;
        }
        return this;
    }

    /* renamed from: j */
    public final C38321b31[] m66804j(InputStream inputStream) {
        try {
        } catch (IOException e) {
            this.f55125c.mo66787a(7, e);
        }
        try {
            try {
                C38321b31[] m112839w = C74.m112839w(inputStream, C74.m112847o(inputStream, C74.f3413a), this.f55128f);
                try {
                    inputStream.close();
                    return m112839w;
                } catch (IOException e2) {
                    this.f55125c.mo66787a(7, e2);
                    return m112839w;
                }
            } catch (Throwable th) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                    this.f55125c.mo66787a(7, e3);
                }
                throw th;
            }
        } catch (IOException e4) {
            this.f55125c.mo66787a(7, e4);
            inputStream.close();
            return null;
        } catch (IllegalStateException e5) {
            this.f55125c.mo66787a(8, e5);
            inputStream.close();
            return null;
        }
    }

    /* renamed from: l */
    public final void m66802l(final int i, final Object obj) {
        this.f55124b.execute(new Runnable() { // from class: O21
            @Override // java.lang.Runnable
            public final void run() {
                C11816b.this.m66807g(i, obj);
            }
        });
    }

    /* renamed from: m */
    public C11816b m66801m() {
        ByteArrayOutputStream byteArrayOutputStream;
        C38321b31[] c38321b31Arr = this.f55132j;
        byte[] bArr = this.f55126d;
        if (c38321b31Arr != null && bArr != null) {
            m66811c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    C74.m112872E(byteArrayOutputStream, bArr);
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                this.f55125c.mo66787a(7, e);
            } catch (IllegalStateException e2) {
                this.f55125c.mo66787a(8, e2);
            }
            if (!C74.m112875B(byteArrayOutputStream, bArr, c38321b31Arr)) {
                this.f55125c.mo66787a(5, null);
                this.f55132j = null;
                byteArrayOutputStream.close();
                return this;
            }
            this.f55133k = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.f55132j = null;
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [b31[], byte[]] */
    /* renamed from: n */
    public boolean m66800n() {
        byte[] bArr = this.f55133k;
        if (bArr == null) {
            return false;
        }
        m66811c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f55127e);
                    C35376Qc1.m88348l(byteArrayInputStream, fileOutputStream);
                    m66802l(1, null);
                    fileOutputStream.close();
                    byteArrayInputStream.close();
                    return true;
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException e) {
                m66802l(6, e);
                return false;
            } catch (IOException e2) {
                m66802l(7, e2);
                return false;
            }
        } finally {
            this.f55133k = null;
            this.f55132j = null;
        }
    }
}

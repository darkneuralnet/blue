package androidx.camera.core;

import android.content.ContentValues;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import androidx.camera.core.C11164h;
import androidx.camera.core.RunnableC11230j;
import androidx.camera.core.internal.utils.ImageUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* renamed from: androidx.camera.core.j */
/* loaded from: classes.dex */
public final class RunnableC11230j implements Runnable {

    /* renamed from: b */
    public final InterfaceC11183i f52701b;

    /* renamed from: c */
    public final int f52702c;

    /* renamed from: d */
    public final int f52703d;

    /* renamed from: e */
    public final C11164h.C11180n f52704e;

    /* renamed from: f */
    public final Executor f52705f;

    /* renamed from: g */
    public final InterfaceC11232b f52706g;

    /* renamed from: h */
    public final Executor f52707h;

    /* renamed from: androidx.camera.core.j$a */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C11231a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f52708a;

        static {
            int[] iArr = new int[ImageUtil.CodecFailedException.EnumC11229a.values().length];
            f52708a = iArr;
            try {
                iArr[ImageUtil.CodecFailedException.EnumC11229a.ENCODE_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f52708a[ImageUtil.CodecFailedException.EnumC11229a.DECODE_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f52708a[ImageUtil.CodecFailedException.EnumC11229a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: androidx.camera.core.j$b */
    /* loaded from: classes.dex */
    public interface InterfaceC11232b {
        /* renamed from: a */
        void mo69191a(C11164h.C11182o c11182o);

        /* renamed from: b */
        void mo69190b(EnumC11233c enumC11233c, String str, Throwable th);
    }

    /* renamed from: androidx.camera.core.j$c */
    /* loaded from: classes.dex */
    public enum EnumC11233c {
        FILE_IO_FAILED,
        ENCODE_FAILED,
        CROP_FAILED,
        UNKNOWN
    }

    public RunnableC11230j(InterfaceC11183i interfaceC11183i, C11164h.C11180n c11180n, int i, int i2, Executor executor, Executor executor2, InterfaceC11232b interfaceC11232b) {
        this.f52701b = interfaceC11183i;
        this.f52704e = c11180n;
        this.f52702c = i;
        this.f52703d = i2;
        this.f52706g = interfaceC11232b;
        this.f52705f = executor;
        this.f52707h = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ void m69199k(EnumC11233c enumC11233c, String str, Throwable th) {
        this.f52706g.mo69190b(enumC11233c, str, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public /* synthetic */ void m69198l(Uri uri) {
        this.f52706g.mo69191a(new C11164h.C11182o(uri));
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a8  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m69197m(File file) {
        Uri uri;
        EnumC11233c enumC11233c;
        String str;
        ContentValues contentValues;
        HZ3.m103731g(file);
        Throwable e = null;
        try {
            try {
                if (m69201i()) {
                    if (this.f52704e.m69488b() != null) {
                        contentValues = new ContentValues(this.f52704e.m69488b());
                    } else {
                        contentValues = new ContentValues();
                    }
                    m69193q(contentValues, 1);
                    uri = this.f52704e.m69489a().insert(this.f52704e.m69484f(), contentValues);
                    try {
                        if (uri == null) {
                            enumC11233c = EnumC11233c.FILE_IO_FAILED;
                            str = "Failed to insert URI.";
                        } else {
                            if (!m69204f(file, uri)) {
                                enumC11233c = EnumC11233c.FILE_IO_FAILED;
                                str = "Failed to save to URI.";
                            } else {
                                enumC11233c = null;
                                str = null;
                            }
                            m69192r(uri);
                        }
                    } catch (IOException e2) {
                        e = e2;
                        enumC11233c = EnumC11233c.FILE_IO_FAILED;
                        str = "Failed to write destination file.";
                        if (enumC11233c == null) {
                        }
                    } catch (IllegalArgumentException e3) {
                        e = e3;
                        enumC11233c = EnumC11233c.FILE_IO_FAILED;
                        str = "Failed to write destination file.";
                        if (enumC11233c == null) {
                        }
                    } catch (SecurityException e4) {
                        e = e4;
                        enumC11233c = EnumC11233c.FILE_IO_FAILED;
                        str = "Failed to write destination file.";
                        if (enumC11233c == null) {
                        }
                    }
                } else {
                    if (m69200j()) {
                        m69205e(file, this.f52704e.m69485e());
                    } else if (m69202h()) {
                        File m69487c = this.f52704e.m69487c();
                        if (m69487c.exists()) {
                            m69487c.delete();
                        }
                        if (!file.renameTo(m69487c)) {
                            enumC11233c = EnumC11233c.FILE_IO_FAILED;
                            str = "Failed to rename file.";
                        } else {
                            enumC11233c = null;
                            str = null;
                        }
                        uri = Uri.fromFile(m69487c);
                    }
                    uri = null;
                    enumC11233c = null;
                    str = null;
                }
            } finally {
                file.delete();
            }
        } catch (IOException | IllegalArgumentException | SecurityException e5) {
            uri = null;
            e = e5;
        }
        if (enumC11233c == null) {
            m69196n(enumC11233c, str, e);
        } else {
            m69195o(uri);
        }
    }

    /* renamed from: e */
    public final void m69205e(File file, OutputStream outputStream) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    outputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return;
                }
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: f */
    public final boolean m69204f(File file, Uri uri) throws IOException {
        OutputStream openOutputStream = this.f52704e.m69489a().openOutputStream(uri);
        if (openOutputStream == null) {
            if (openOutputStream != null) {
                openOutputStream.close();
                return false;
            }
            return false;
        }
        try {
            m69205e(file, openOutputStream);
            openOutputStream.close();
            return true;
        } catch (Throwable th) {
            try {
                openOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: g */
    public final byte[] m69203g(InterfaceC11183i interfaceC11183i, int i) throws ImageUtil.CodecFailedException {
        boolean m69215o = ImageUtil.m69215o(interfaceC11183i);
        int format = interfaceC11183i.getFormat();
        if (format == 256) {
            if (!m69215o) {
                return ImageUtil.m69219k(interfaceC11183i);
            }
            return ImageUtil.m69218l(interfaceC11183i, interfaceC11183i.getCropRect(), i);
        }
        Rect rect = null;
        if (format == 35) {
            if (m69215o) {
                rect = interfaceC11183i.getCropRect();
            }
            return ImageUtil.m69213q(interfaceC11183i, rect, i, 0);
        }
        C33928Jx2.m99522l("ImageSaver", "Unrecognized image format: " + format);
        return null;
    }

    /* renamed from: h */
    public final boolean m69202h() {
        return this.f52704e.m69487c() != null;
    }

    /* renamed from: i */
    public final boolean m69201i() {
        if (this.f52704e.m69484f() != null && this.f52704e.m69489a() != null && this.f52704e.m69488b() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m69200j() {
        return this.f52704e.m69485e() != null;
    }

    /* renamed from: n */
    public final void m69196n(final EnumC11233c enumC11233c, final String str, final Throwable th) {
        try {
            this.f52705f.execute(new Runnable() { // from class: UX1
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC11230j.this.m69199k(enumC11233c, str, th);
                }
            });
        } catch (RejectedExecutionException unused) {
            C33928Jx2.m99531c("ImageSaver", "Application executor rejected executing OnImageSavedCallback.onError callback. Skipping.");
        }
    }

    /* renamed from: o */
    public final void m69195o(final Uri uri) {
        try {
            this.f52705f.execute(new Runnable() { // from class: TX1
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC11230j.this.m69198l(uri);
                }
            });
        } catch (RejectedExecutionException unused) {
            C33928Jx2.m99531c("ImageSaver", "Application executor rejected executing OnImageSavedCallback.onImageSaved callback. Skipping.");
        }
    }

    /* renamed from: p */
    public final File m69194p() {
        File createTempFile;
        EnumC11233c enumC11233c;
        String str;
        ImageUtil.CodecFailedException codecFailedException;
        try {
            if (m69202h()) {
                createTempFile = new File(this.f52704e.m69487c().getParent(), "CameraX" + UUID.randomUUID().toString() + ".tmp");
            } else {
                createTempFile = File.createTempFile("CameraX", ".tmp");
            }
            try {
                InterfaceC11183i interfaceC11183i = this.f52701b;
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                    fileOutputStream.write(m69203g(this.f52701b, this.f52703d));
                    C36357Uh1 m81171h = C36357Uh1.m81171h(createTempFile);
                    C36357Uh1.m81169j(this.f52701b).m81172g(m81171h);
                    if (!new C39298ci1().m61030b(this.f52701b)) {
                        m81171h.m81153z(this.f52702c);
                    }
                    C11164h.C11177k m69486d = this.f52704e.m69486d();
                    if (m69486d.m69493b()) {
                        m81171h.m81167l();
                    }
                    if (m69486d.m69491d()) {
                        m81171h.m81166m();
                    }
                    if (m69486d.m69494a() != null) {
                        m81171h.m81177b(this.f52704e.m69486d().m69494a());
                    }
                    m81171h.m81179A();
                    fileOutputStream.close();
                    if (interfaceC11183i != null) {
                        interfaceC11183i.close();
                    }
                    codecFailedException = null;
                    enumC11233c = null;
                    str = null;
                } catch (Throwable th) {
                    if (interfaceC11183i != null) {
                        try {
                            interfaceC11183i.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (ImageUtil.CodecFailedException e) {
                int i = C11231a.f52708a[e.m69211a().ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        enumC11233c = EnumC11233c.UNKNOWN;
                        str = "Failed to transcode mImage";
                        codecFailedException = e;
                    } else {
                        enumC11233c = EnumC11233c.CROP_FAILED;
                        str = "Failed to crop mImage";
                        codecFailedException = e;
                    }
                } else {
                    enumC11233c = EnumC11233c.ENCODE_FAILED;
                    str = "Failed to encode mImage";
                    codecFailedException = e;
                }
            } catch (IOException e2) {
                e = e2;
                enumC11233c = EnumC11233c.FILE_IO_FAILED;
                str = "Failed to write temp file";
                codecFailedException = e;
            } catch (IllegalArgumentException e3) {
                e = e3;
                enumC11233c = EnumC11233c.FILE_IO_FAILED;
                str = "Failed to write temp file";
                codecFailedException = e;
            } catch (OutOfMemoryError e4) {
                enumC11233c = EnumC11233c.UNKNOWN;
                str = "Processing failed due to low memory.";
                codecFailedException = e4;
            }
            if (enumC11233c != null) {
                m69196n(enumC11233c, str, codecFailedException);
                createTempFile.delete();
                return null;
            }
            return createTempFile;
        } catch (IOException e5) {
            m69196n(EnumC11233c.FILE_IO_FAILED, "Failed to create temp file", e5);
            return null;
        }
    }

    /* renamed from: q */
    public final void m69193q(ContentValues contentValues, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("is_pending", Integer.valueOf(i));
        }
    }

    /* renamed from: r */
    public final void m69192r(Uri uri) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentValues contentValues = new ContentValues();
            m69193q(contentValues, 0);
            this.f52704e.m69489a().update(uri, contentValues, null, null);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        final File m69194p = m69194p();
        if (m69194p != null) {
            this.f52707h.execute(new Runnable() { // from class: SX1
                @Override // java.lang.Runnable
                public final void run() {
                    RunnableC11230j.this.m69197m(m69194p);
                }
            });
        }
    }
}

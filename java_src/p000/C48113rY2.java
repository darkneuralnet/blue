package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.amazonaws.services.p026s3.internal.Constants;
import com.facebook.C17216a;
import com.facebook.FacebookContentProvider;
import com.facebook.FacebookException;
import com.facebook.share.internal.C17296a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b%\u0010&J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007J\u0018\u0010\u000e\u001a\u00020\r2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0007J\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0007J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0007J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0011H\u0007J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0015H\u0007J$\u0010\u0019\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0018\u001a\u00020\u0015H\u0007J\b\u0010\u001a\u001a\u00020\rH\u0007J\u0018\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0011H\u0002J \u0010 \u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0011H\u0002R\u0014\u0010\"\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010#¨\u0006'"}, m28432d2 = {"LrY2;", "", "Ljava/util/UUID;", "callId", "Landroid/graphics/Bitmap;", "attachmentBitmap", "LrY2$a;", "c", "Landroid/net/Uri;", "attachmentUri", DateTokenConverter.CONVERTER_KEY, "", "attachments", "", C17296a.f69688o, "", "attachmentName", "Ljava/io/File;", "i", "g", "e", "", "create", "h", "createDirs", "f", "b", "bitmap", "outputFile", "j", "imageUri", "isContentUri", "k", "Ljava/lang/String;", "TAG", "Ljava/io/File;", "attachmentsDirectory", "<init>", "()V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
/* renamed from: rY2  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C48113rY2 {

    /* renamed from: a */
    public static final String f107263a;

    /* renamed from: b */
    public static File f107264b;

    /* renamed from: c */
    public static final C48113rY2 f107265c = new C48113rY2();

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0019\u001a\u00020\u0015\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010!\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0014\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u0017\u0010\u0019\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0011\u0010\u0018R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\n\u0010\u001cR\u0019\u0010!\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b\u0016\u0010 ¨\u0006$"}, m28432d2 = {"LrY2$a;", "", "", C17296a.f69688o, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "attachmentUrl", "attachmentName", "", "c", "Z", "g", "()Z", "setContentUri", "(Z)V", "isContentUri", DateTokenConverter.CONVERTER_KEY, "f", "setShouldCreateFile", "shouldCreateFile", "Ljava/util/UUID;", "e", "Ljava/util/UUID;", "()Ljava/util/UUID;", "callId", "Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "bitmap", "Landroid/net/Uri;", "Landroid/net/Uri;", "()Landroid/net/Uri;", "originalUri", "<init>", "(Ljava/util/UUID;Landroid/graphics/Bitmap;Landroid/net/Uri;)V", "facebook-core_release"}, m28431k = 1, m28430mv = {1, 4, 0})
    /* renamed from: rY2$a */
    /* loaded from: classes5.dex */
    public static final class C27946a {

        /* renamed from: a */
        public final String f107266a;

        /* renamed from: b */
        public final String f107267b;

        /* renamed from: c */
        public boolean f107268c;

        /* renamed from: d */
        public boolean f107269d;

        /* renamed from: e */
        public final UUID f107270e;

        /* renamed from: f */
        public final Bitmap f107271f;

        /* renamed from: g */
        public final Uri f107272g;

        /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
            if (r7 == false) goto L9;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public C27946a(UUID callId, Bitmap bitmap, Uri uri) {
            String m52870a;
            boolean equals;
            boolean equals2;
            boolean startsWith$default;
            Intrinsics.checkNotNullParameter(callId, "callId");
            this.f107270e = callId;
            this.f107271f = bitmap;
            this.f107272g = uri;
            boolean z = true;
            if (uri != null) {
                String scheme = uri.getScheme();
                equals = StringsKt__StringsJVMKt.equals("content", scheme, true);
                if (equals) {
                    this.f107268c = true;
                    String authority = uri.getAuthority();
                    if (authority != null) {
                        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(authority, "media", false, 2, null);
                    }
                    z = false;
                    this.f107269d = z;
                } else {
                    equals2 = StringsKt__StringsJVMKt.equals("file", uri.getScheme(), true);
                    if (equals2) {
                        this.f107269d = true;
                    } else if (!C52364yi6.m2858T(uri)) {
                        throw new FacebookException("Unsupported scheme for media Uri : " + scheme);
                    }
                }
            } else if (bitmap != null) {
                this.f107269d = true;
            } else {
                throw new FacebookException("Cannot share media without a bitmap or Uri set");
            }
            String uuid = this.f107269d ? UUID.randomUUID().toString() : null;
            this.f107267b = uuid;
            if (!this.f107269d) {
                m52870a = String.valueOf(uri);
            } else {
                m52870a = FacebookContentProvider.f69353c.m52870a(C17216a.m52740f(), callId, uuid);
            }
            this.f107266a = m52870a;
        }

        /* renamed from: a */
        public final String m15777a() {
            return this.f107267b;
        }

        /* renamed from: b */
        public final String m15776b() {
            return this.f107266a;
        }

        /* renamed from: c */
        public final Bitmap m15775c() {
            return this.f107271f;
        }

        /* renamed from: d */
        public final UUID m15774d() {
            return this.f107270e;
        }

        /* renamed from: e */
        public final Uri m15773e() {
            return this.f107272g;
        }

        /* renamed from: f */
        public final boolean m15772f() {
            return this.f107269d;
        }

        /* renamed from: g */
        public final boolean m15771g() {
            return this.f107268c;
        }
    }

    static {
        String name = C48113rY2.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "NativeAppCallAttachmentStore::class.java.name");
        f107263a = name;
    }

    private C48113rY2() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m15788a(Collection<C27946a> collection) throws FacebookException {
        File m15783f;
        if (collection != null && !collection.isEmpty()) {
            if (f107264b == null) {
                m15787b();
            }
            m15784e();
            ArrayList<File> arrayList = new ArrayList();
            try {
                for (C27946a c27946a : collection) {
                    if (c27946a.m15772f() && (m15783f = m15783f(c27946a.m15774d(), c27946a.m15777a(), true)) != null) {
                        arrayList.add(m15783f);
                        if (c27946a.m15775c() != null) {
                            f107265c.m15779j(c27946a.m15775c(), m15783f);
                        } else if (c27946a.m15773e() != null) {
                            f107265c.m15778k(c27946a.m15773e(), c27946a.m15771g(), m15783f);
                        }
                    }
                }
            } catch (IOException e) {
                String str = f107263a;
                Log.e(str, "Got unexpected exception:" + e);
                for (File file : arrayList) {
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                    }
                }
                throw new FacebookException(e);
            }
        }
    }

    @JvmStatic
    /* renamed from: b */
    public static final void m15787b() {
        C52364yi6.m2827m(m15782g());
    }

    @JvmStatic
    /* renamed from: c */
    public static final C27946a m15786c(UUID callId, Bitmap attachmentBitmap) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(attachmentBitmap, "attachmentBitmap");
        return new C27946a(callId, attachmentBitmap, null);
    }

    @JvmStatic
    /* renamed from: d */
    public static final C27946a m15785d(UUID callId, Uri attachmentUri) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        Intrinsics.checkNotNullParameter(attachmentUri, "attachmentUri");
        return new C27946a(callId, null, attachmentUri);
    }

    @JvmStatic
    /* renamed from: e */
    public static final File m15784e() {
        File m15782g = m15782g();
        if (m15782g != null) {
            m15782g.mkdirs();
        }
        return m15782g;
    }

    @JvmStatic
    /* renamed from: f */
    public static final File m15783f(UUID callId, String str, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(callId, "callId");
        File m15781h = m15781h(callId, z);
        if (m15781h == null) {
            return null;
        }
        try {
            return new File(m15781h, URLEncoder.encode(str, Constants.DEFAULT_ENCODING));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    @JvmStatic
    /* renamed from: g */
    public static final synchronized File m15782g() {
        File file;
        synchronized (C48113rY2.class) {
            if (f107264b == null) {
                Context m52741e = C17216a.m52741e();
                Intrinsics.checkNotNullExpressionValue(m52741e, "FacebookSdk.getApplicationContext()");
                f107264b = new File(m52741e.getCacheDir(), "com.facebook.NativeAppCallAttachmentStore.files");
            }
            file = f107264b;
        }
        return file;
    }

    @JvmStatic
    /* renamed from: h */
    public static final File m15781h(UUID callId, boolean z) {
        Intrinsics.checkNotNullParameter(callId, "callId");
        if (f107264b == null) {
            return null;
        }
        File file = new File(f107264b, callId.toString());
        if (z && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @JvmStatic
    /* renamed from: i */
    public static final File m15780i(UUID uuid, String str) throws FileNotFoundException {
        if (!C52364yi6.m2860R(str) && uuid != null) {
            try {
                return m15783f(uuid, str, false);
            } catch (IOException unused) {
                throw new FileNotFoundException();
            }
        }
        throw new FileNotFoundException();
    }

    /* renamed from: j */
    public final void m15779j(Bitmap bitmap, File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
        } finally {
            C52364yi6.m2839g(fileOutputStream);
        }
    }

    /* renamed from: k */
    public final void m15778k(Uri uri, boolean z, File file) throws IOException {
        InputStream openInputStream;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            if (!z) {
                openInputStream = new FileInputStream(uri.getPath());
            } else {
                Context m52741e = C17216a.m52741e();
                Intrinsics.checkNotNullExpressionValue(m52741e, "FacebookSdk.getApplicationContext()");
                openInputStream = m52741e.getContentResolver().openInputStream(uri);
            }
            C52364yi6.m2829l(openInputStream, fileOutputStream);
        } finally {
            C52364yi6.m2839g(fileOutputStream);
        }
    }
}

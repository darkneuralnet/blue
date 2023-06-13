package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.nio.ByteBuffer;
/* renamed from: g32  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C41304g32 implements NE2 {

    /* renamed from: a */
    public volatile Bitmap f81455a;

    /* renamed from: b */
    public volatile ByteBuffer f81456b;

    /* renamed from: c */
    public volatile DC7 f81457c;

    /* renamed from: d */
    public final int f81458d;

    /* renamed from: e */
    public final int f81459e;

    /* renamed from: f */
    public final int f81460f;

    /* renamed from: g */
    public final int f81461g;

    /* renamed from: h */
    public final Matrix f81462h;

    public C41304g32(Bitmap bitmap, int i) {
        this.f81455a = (Bitmap) Preconditions.checkNotNull(bitmap);
        this.f81458d = bitmap.getWidth();
        this.f81459e = bitmap.getHeight();
        m40236m(i);
        this.f81460f = i;
        this.f81461g = -1;
        this.f81462h = null;
    }

    /* renamed from: a */
    public static C41304g32 m40248a(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C41304g32 c41304g32 = new C41304g32(byteBuffer, i, i2, i3, i4);
        m40234o(i4, 3, elapsedRealtime, i2, i, byteBuffer.limit(), i3);
        return c41304g32;
    }

    /* renamed from: b */
    public static C41304g32 m40247b(Context context, Uri uri) throws IOException {
        Preconditions.checkNotNull(context, "Please provide a valid Context");
        Preconditions.checkNotNull(uri, "Please provide a valid imageUri");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap m14052f = C48704sY1.m14056b().m14052f(context.getContentResolver(), uri);
        C41304g32 c41304g32 = new C41304g32(m14052f, 0);
        m40234o(-1, 4, elapsedRealtime, m14052f.getHeight(), m14052f.getWidth(), m14052f.getAllocationByteCount(), 0);
        return c41304g32;
    }

    /* renamed from: c */
    public static C41304g32 m40246c(Image image, int i) {
        return m40235n(image, i, null);
    }

    /* renamed from: m */
    public static int m40236m(int i) {
        boolean z = true;
        if (i != 0 && i != 90 && i != 180) {
            if (i == 270) {
                i = 270;
            } else {
                z = false;
            }
        }
        Preconditions.checkArgument(z, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
        return i;
    }

    /* renamed from: n */
    public static C41304g32 m40235n(Image image, int i, Matrix matrix) {
        C41304g32 c41304g32;
        int limit;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Preconditions.checkNotNull(image, "Please provide a valid image");
        m40236m(i);
        boolean z = true;
        if (image.getFormat() != 256 && image.getFormat() != 35) {
            z = false;
        }
        Preconditions.checkArgument(z, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            limit = image.getPlanes()[0].getBuffer().limit();
            c41304g32 = new C41304g32(C46917pX1.m19142g().m19145d(image, i), 0);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            c41304g32 = new C41304g32(image, image.getWidth(), image.getHeight(), i, matrix);
            limit = (image.getPlanes()[0].getBuffer().limit() * 3) / 2;
        }
        int i2 = limit;
        C41304g32 c41304g322 = c41304g32;
        m40234o(image.getFormat(), 5, elapsedRealtime, image.getHeight(), image.getWidth(), i2, i);
        return c41304g322;
    }

    /* renamed from: o */
    public static void m40234o(int i, int i2, long j, int i3, int i4, int i5, int i6) {
        H39.m104456a(C46648p39.m20003b("vision-common"), i, i2, j, i3, i4, i5, i6);
    }

    @KeepForSdk
    /* renamed from: d */
    public Bitmap m40245d() {
        return this.f81455a;
    }

    @KeepForSdk
    /* renamed from: e */
    public ByteBuffer m40244e() {
        return this.f81456b;
    }

    @KeepForSdk
    /* renamed from: f */
    public Matrix m40243f() {
        return this.f81462h;
    }

    @KeepForSdk
    /* renamed from: g */
    public int m40242g() {
        return this.f81461g;
    }

    @KeepForSdk
    /* renamed from: h */
    public int m40241h() {
        return this.f81459e;
    }

    @KeepForSdk
    /* renamed from: i */
    public Image m40240i() {
        if (this.f81457c == null) {
            return null;
        }
        return this.f81457c.m110686a();
    }

    @KeepForSdk
    /* renamed from: j */
    public Image.Plane[] m40239j() {
        if (this.f81457c == null) {
            return null;
        }
        return this.f81457c.m110685b();
    }

    @KeepForSdk
    /* renamed from: k */
    public int m40238k() {
        return this.f81460f;
    }

    @KeepForSdk
    /* renamed from: l */
    public int m40237l() {
        return this.f81458d;
    }

    public C41304g32(Image image, int i, int i2, int i3, Matrix matrix) {
        Preconditions.checkNotNull(image);
        this.f81457c = new DC7(image);
        this.f81458d = i;
        this.f81459e = i2;
        m40236m(i3);
        this.f81460f = i3;
        this.f81461g = 35;
        this.f81462h = matrix;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C41304g32(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        boolean z;
        if (i4 != 842094169) {
            if (i4 != 17) {
                z = false;
                Preconditions.checkArgument(z);
                this.f81456b = (ByteBuffer) Preconditions.checkNotNull(byteBuffer);
                Preconditions.checkArgument(byteBuffer.limit() > i * i2, "Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.");
                byteBuffer.rewind();
                this.f81458d = i;
                this.f81459e = i2;
                m40236m(i3);
                this.f81460f = i3;
                this.f81461g = i4;
                this.f81462h = null;
            }
            i4 = 17;
        }
        z = true;
        Preconditions.checkArgument(z);
        this.f81456b = (ByteBuffer) Preconditions.checkNotNull(byteBuffer);
        Preconditions.checkArgument(byteBuffer.limit() > i * i2, "Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.");
        byteBuffer.rewind();
        this.f81458d = i;
        this.f81459e = i2;
        m40236m(i3);
        this.f81460f = i3;
        this.f81461g = i4;
        this.f81462h = null;
    }
}

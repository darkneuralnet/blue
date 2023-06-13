package p000;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p000.C43035iy3;
/* renamed from: cp6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C39391cp6<T> implements InterfaceC38502bM4<T, Bitmap> {

    /* renamed from: d */
    public static final C43035iy3<Long> f75670d = C43035iy3.m31553a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new C19606a());

    /* renamed from: e */
    public static final C43035iy3<Integer> f75671e = C43035iy3.m31553a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new C19607b());

    /* renamed from: f */
    public static final C19611e f75672f = new C19611e();

    /* renamed from: g */
    public static final List<String> f75673g = Collections.unmodifiableList(Arrays.asList("TP1A", "TD1A.220804.031"));

    /* renamed from: a */
    public final InterfaceC19612f<T> f75674a;

    /* renamed from: b */
    public final InterfaceC20044eU f75675b;

    /* renamed from: c */
    public final C19611e f75676c;

    /* renamed from: cp6$a */
    /* loaded from: classes5.dex */
    public class C19606a implements C43035iy3.InterfaceC24655b<Long> {

        /* renamed from: a */
        public final ByteBuffer f75677a = ByteBuffer.allocate(8);

        @Override // p000.C43035iy3.InterfaceC24655b
        /* renamed from: b */
        public void mo31546a(byte[] bArr, Long l, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f75677a) {
                this.f75677a.position(0);
                messageDigest.update(this.f75677a.putLong(l.longValue()).array());
            }
        }
    }

    /* renamed from: cp6$b */
    /* loaded from: classes5.dex */
    public class C19607b implements C43035iy3.InterfaceC24655b<Integer> {

        /* renamed from: a */
        public final ByteBuffer f75678a = ByteBuffer.allocate(4);

        @Override // p000.C43035iy3.InterfaceC24655b
        /* renamed from: b */
        public void mo31546a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f75678a) {
                this.f75678a.position(0);
                messageDigest.update(this.f75678a.putInt(num.intValue()).array());
            }
        }
    }

    /* renamed from: cp6$c */
    /* loaded from: classes5.dex */
    public static final class C19608c implements InterfaceC19612f<AssetFileDescriptor> {
        private C19608c() {
        }

        @Override // p000.C39391cp6.InterfaceC19612f
        /* renamed from: b */
        public void mo45054a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        public /* synthetic */ C19608c(C19606a c19606a) {
            this();
        }
    }

    /* renamed from: cp6$d */
    /* loaded from: classes5.dex */
    public static final class C19609d implements InterfaceC19612f<ByteBuffer> {

        /* renamed from: cp6$d$a */
        /* loaded from: classes5.dex */
        public class C19610a extends MediaDataSource {

            /* renamed from: b */
            public final /* synthetic */ ByteBuffer f75679b;

            public C19610a(ByteBuffer byteBuffer) {
                this.f75679b = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f75679b.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j, byte[] bArr, int i, int i2) {
                if (j >= this.f75679b.limit()) {
                    return -1;
                }
                this.f75679b.position((int) j);
                int min = Math.min(i2, this.f75679b.remaining());
                this.f75679b.get(bArr, i, min);
                return min;
            }
        }

        @Override // p000.C39391cp6.InterfaceC19612f
        /* renamed from: b */
        public void mo45054a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new C19610a(byteBuffer));
        }
    }

    /* renamed from: cp6$e */
    /* loaded from: classes5.dex */
    public static class C19611e {
        /* renamed from: a */
        public MediaMetadataRetriever m45055a() {
            return new MediaMetadataRetriever();
        }
    }

    /* renamed from: cp6$f */
    /* loaded from: classes5.dex */
    public interface InterfaceC19612f<T> {
        /* renamed from: a */
        void mo45054a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* renamed from: cp6$g */
    /* loaded from: classes5.dex */
    public static final class C19613g implements InterfaceC19612f<ParcelFileDescriptor> {
        @Override // p000.C39391cp6.InterfaceC19612f
        /* renamed from: b */
        public void mo45054a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* renamed from: cp6$h */
    /* loaded from: classes5.dex */
    public static final class C19614h extends RuntimeException {
        private static final long serialVersionUID = -2556382523004027815L;

        public C19614h() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }

    public C39391cp6(InterfaceC20044eU interfaceC20044eU, InterfaceC19612f<T> interfaceC19612f) {
        this(interfaceC20044eU, interfaceC19612f, f75672f);
    }

    /* renamed from: c */
    public static InterfaceC38502bM4<AssetFileDescriptor, Bitmap> m45069c(InterfaceC20044eU interfaceC20044eU) {
        return new C39391cp6(interfaceC20044eU, new C19608c(null));
    }

    /* renamed from: d */
    public static InterfaceC38502bM4<ByteBuffer, Bitmap> m45068d(InterfaceC20044eU interfaceC20044eU) {
        return new C39391cp6(interfaceC20044eU, new C19609d());
    }

    /* renamed from: e */
    public static Bitmap m45067e(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        if (!m45062j()) {
            return bitmap;
        }
        boolean z = false;
        try {
            if (m45063i(mediaMetadataRetriever)) {
                if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                    z = true;
                }
            }
        } catch (NumberFormatException unused) {
            if (Log.isLoggable("VideoDecoder", 3)) {
                Log.d("VideoDecoder", "Exception trying to extract HDR transfer function or rotation");
            }
        }
        if (!z) {
            return bitmap;
        }
        if (Log.isLoggable("VideoDecoder", 3)) {
            Log.d("VideoDecoder", "Applying HDR 180 deg thumbnail correction");
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    /* renamed from: f */
    public static Bitmap m45066f(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, AbstractC38944c61 abstractC38944c61) {
        Bitmap bitmap;
        if (Build.VERSION.SDK_INT >= 27 && i2 != Integer.MIN_VALUE && i3 != Integer.MIN_VALUE && abstractC38944c61 != AbstractC38944c61.f60118f) {
            bitmap = m45064h(mediaMetadataRetriever, j, i, i2, i3, abstractC38944c61);
        } else {
            bitmap = null;
        }
        if (bitmap == null) {
            bitmap = m45065g(mediaMetadataRetriever, j, i);
        }
        Bitmap m45067e = m45067e(mediaMetadataRetriever, bitmap);
        if (m45067e != null) {
            return m45067e;
        }
        throw new C19614h();
    }

    /* renamed from: g */
    public static Bitmap m45065g(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    @TargetApi(27)
    /* renamed from: h */
    public static Bitmap m45064h(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, AbstractC38944c61 abstractC38944c61) {
        Bitmap scaledFrameAtTime;
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                parseInt2 = parseInt;
                parseInt = parseInt2;
            }
            float mo61934b = abstractC38944c61.mo61934b(parseInt, parseInt2, i2, i3);
            scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(parseInt * mo61934b), Math.round(mo61934b * parseInt2));
            return scaledFrameAtTime;
        } catch (Throwable th) {
            if (Log.isLoggable("VideoDecoder", 3)) {
                Log.d("VideoDecoder", "Exception trying to decode a scaled frame on oreo+, falling back to a fullsize frame", th);
                return null;
            }
            return null;
        }
    }

    /* renamed from: i */
    public static boolean m45063i(MediaMetadataRetriever mediaMetadataRetriever) throws NumberFormatException {
        String extractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int parseInt = Integer.parseInt(extractMetadata);
        int parseInt2 = Integer.parseInt(extractMetadata2);
        if ((parseInt == 7 || parseInt == 6) && parseInt2 == 6) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static boolean m45062j() {
        if (Build.MODEL.startsWith("Pixel") && Build.VERSION.SDK_INT == 33) {
            return m45061k();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i < 33) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m45061k() {
        for (String str : f75673g) {
            if (Build.ID.startsWith(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l */
    public static InterfaceC38502bM4<ParcelFileDescriptor, Bitmap> m45060l(InterfaceC20044eU interfaceC20044eU) {
        return new C39391cp6(interfaceC20044eU, new C19613g());
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: a */
    public boolean mo1782a(T t, C48964sy3 c48964sy3) {
        return true;
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: b */
    public VL4<Bitmap> mo1781b(T t, int i, int i2, C48964sy3 c48964sy3) throws IOException {
        long longValue = ((Long) c48964sy3.m13300c(f75670d)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: " + longValue);
        }
        Integer num = (Integer) c48964sy3.m13300c(f75671e);
        if (num == null) {
            num = 2;
        }
        AbstractC38944c61 abstractC38944c61 = (AbstractC38944c61) c48964sy3.m13300c(AbstractC38944c61.f60120h);
        if (abstractC38944c61 == null) {
            abstractC38944c61 = AbstractC38944c61.f60119g;
        }
        AbstractC38944c61 abstractC38944c612 = abstractC38944c61;
        MediaMetadataRetriever m45055a = this.f75676c.m45055a();
        try {
            this.f75674a.mo45054a(m45055a, t);
            return C20872gU.m39360f(m45066f(m45055a, longValue, num.intValue(), i, i2, abstractC38944c612), this.f75675b);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                m45055a.close();
            } else {
                m45055a.release();
            }
        }
    }

    public C39391cp6(InterfaceC20044eU interfaceC20044eU, InterfaceC19612f<T> interfaceC19612f, C19611e c19611e) {
        this.f75675b = interfaceC20044eU;
        this.f75674a = interfaceC19612f;
        this.f75676c = c19611e;
    }
}

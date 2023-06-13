package com.stripe.android.uicore.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.F41;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B!\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002J\f\u0010\u000b\u001a\u00020\u0002*\u00020\u0002H\u0002J,\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000eR\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0002H\u0002J\u0016\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\fJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001a\u001a\u00020\u0002J\u000e\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0002J\u0006\u0010\u001f\u001a\u00020\tR\u0016\u0010 \u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!¨\u0006("}, m28432d2 = {"Lcom/stripe/android/uicore/image/ImageLruDiskCache;", "", "", "url", "Landroid/graphics/Bitmap$CompressFormat;", "compressFormatFromUrl", "", "quality", "s", "", "debug", "toKey", "Landroid/graphics/Bitmap;", "bitmap", "LF41$c;", "LF41;", "editor", "compressFormat", "compressQuality", "", "writeBitmapToFile", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "uniqueName", "Ljava/io/File;", "getDiskCacheDir", "key", MessageExtension.FIELD_DATA, "put", "getBitmap", "containsKey", "clearCache", "diskLruCache", "LF41;", "cacheFolder", "", "maxSizeBytes", "<init>", "(Landroid/content/Context;Ljava/lang/String;J)V", "Companion", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nImageLruDiskCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageLruDiskCache.kt\ncom/stripe/android/uicore/image/ImageLruDiskCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1#2:190\n*E\n"})
/* loaded from: classes7.dex */
public final class ImageLruDiskCache {
    @Deprecated
    private static final int APP_VERSION = 1;
    @Deprecated
    private static final int IO_BUFFER_SIZE = 8192;
    @Deprecated
    private static final int JPEG_COMPRESS_QUALITY = 80;
    @Deprecated
    private static final int PNG_COMPRESS_QUALITY = 100;
    @Deprecated
    private static final String TAG = "stripe_image_disk_cache";
    @Deprecated
    private static final int VALUE_COUNT = 1;
    @Deprecated
    private static final int WEBP_COMPRESS_QUALITY = 80;
    private F41 diskLruCache;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28433d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m28432d2 = {"Lcom/stripe/android/uicore/image/ImageLruDiskCache$Companion;", "", "()V", "APP_VERSION", "", "IO_BUFFER_SIZE", "JPEG_COMPRESS_QUALITY", "PNG_COMPRESS_QUALITY", "TAG", "", "VALUE_COUNT", "WEBP_COMPRESS_QUALITY", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            try {
                iArr[Bitmap.CompressFormat.JPEG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.CompressFormat.PNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Bitmap.CompressFormat.WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ImageLruDiskCache(Context context, String cacheFolder, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cacheFolder, "cacheFolder");
        try {
            F41 m107844x = F41.m107844x(getDiskCacheDir(context, cacheFolder), 1, 1, j);
            Intrinsics.checkNotNullExpressionValue(m107844x, "open(\n                /*…axSizeBytes\n            )");
            this.diskLruCache = m107844x;
        } catch (IOException e) {
            Log.e(TAG, "error opening cache", e);
        }
    }

    private final Bitmap.CompressFormat compressFormatFromUrl(String str) {
        Bitmap.CompressFormat compressFormat;
        ImageType fromUrl = ImageType.Companion.fromUrl(str);
        if (fromUrl != null && (compressFormat = fromUrl.getCompressFormat()) != null) {
            return compressFormat;
        }
        throw new IllegalArgumentException("Unexpected image format: " + str);
    }

    private final void debug(String str) {
    }

    private final File getDiskCacheDir(Context context, String str) {
        String path = context.getCacheDir().getPath();
        Intrinsics.checkNotNullExpressionValue(path, "context.cacheDir.path");
        String str2 = File.separator;
        return new File(path + str2 + str);
    }

    private final int quality(Bitmap.CompressFormat compressFormat) {
        int i = WhenMappings.$EnumSwitchMapping$0[compressFormat.ordinal()];
        if (i == 1) {
            return 80;
        }
        if (i != 2) {
            if (i == 3) {
                return 80;
            }
            throw new IllegalArgumentException("Unexpected compress format: " + compressFormat);
        }
        return 100;
    }

    private final String toKey(String str) {
        return String.valueOf(str.hashCode());
    }

    private final boolean writeBitmapToFile(Bitmap bitmap, F41.C2129c c2129c, Bitmap.CompressFormat compressFormat, int i) throws IOException, FileNotFoundException {
        BufferedOutputStream bufferedOutputStream = null;
        try {
            BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(c2129c.m107835f(0), 8192);
            try {
                boolean compress = bitmap.compress(compressFormat, i, bufferedOutputStream2);
                bufferedOutputStream2.close();
                return compress;
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = bufferedOutputStream2;
                if (bufferedOutputStream != null) {
                    bufferedOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void clearCache() {
        debug("disk cache CLEARED");
        try {
            F41 f41 = this.diskLruCache;
            if (f41 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                f41 = null;
            }
            f41.m107851p();
        } catch (IOException e) {
            Log.e(TAG, "error clearing cache", e);
        }
    }

    public final boolean containsKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        boolean z = false;
        try {
            F41 f41 = this.diskLruCache;
            if (f41 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                f41 = null;
            }
            F41.C2132e m107847t = f41.m107847t(toKey(key));
            if (m107847t != null) {
                z = true;
            }
            if (m107847t != null) {
                m107847t.close();
            }
        } catch (IOException e) {
            Log.e(TAG, "error reading from cache", e);
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap getBitmap(String key) {
        F41.C2132e c2132e;
        String str;
        F41.C2132e m107847t;
        Intrinsics.checkNotNullParameter(key, "key");
        String key2 = toKey(key);
        F41.C2132e c2132e2 = null;
        r1 = null;
        Bitmap bitmap = null;
        try {
            F41 f41 = this.diskLruCache;
            if (f41 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                f41 = null;
            }
            m107847t = f41.m107847t(key2);
        } catch (IOException e) {
            e = e;
            c2132e = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
        } catch (IOException e2) {
            c2132e = m107847t;
            e = e2;
            try {
                Log.e(TAG, "error getting bitmap from cache", e);
                if (c2132e != null) {
                    c2132e.close();
                }
                if (bitmap != null) {
                }
                debug(str);
                return bitmap;
            } catch (Throwable th2) {
                th = th2;
                c2132e2 = c2132e;
                if (c2132e2 != null) {
                    c2132e2.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            c2132e2 = m107847t;
            if (c2132e2 != null) {
            }
            throw th;
        }
        if (m107847t == null) {
            debug("image not in cache: " + key2);
            return null;
        }
        InputStream m107820a = m107847t.m107820a(0);
        Intrinsics.checkNotNullExpressionValue(m107820a, "snapshot.getInputStream(0)");
        bitmap = BitmapFactory.decodeStream(new BufferedInputStream(m107820a, 8192));
        m107847t.close();
        if (bitmap != null) {
            str = "image not in cache: " + key2;
        } else {
            str = "image read from disk " + key2;
        }
        debug(str);
        return bitmap;
    }

    public final void put(String key, Bitmap data) {
        F41.C2129c c2129c;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(data, "data");
        String key2 = toKey(key);
        if (containsKey(key)) {
            debug("Image already cached");
            return;
        }
        Unit unit = null;
        try {
            F41 f41 = this.diskLruCache;
            if (f41 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                f41 = null;
            }
            c2129c = f41.m107849r(key2);
            if (c2129c == null) {
                return;
            }
            try {
                Bitmap.CompressFormat compressFormatFromUrl = compressFormatFromUrl(key);
                if (writeBitmapToFile(data, c2129c, compressFormatFromUrl, quality(compressFormatFromUrl))) {
                    F41 f412 = this.diskLruCache;
                    if (f412 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                        f412 = null;
                    }
                    f412.flush();
                    c2129c.m107836e();
                    debug("image put on disk cache " + key2);
                    return;
                }
                c2129c.m107840a();
                Log.e(TAG, "ERROR on: image put on disk cache " + key2);
            } catch (IOException unused) {
                Log.e(TAG, "ERROR on: image put on disk cache " + key2);
                try {
                    Result.Companion companion = Result.Companion;
                    if (c2129c != null) {
                        c2129c.m107840a();
                        unit = Unit.INSTANCE;
                    }
                    Result.m116783constructorimpl(unit);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    Result.m116783constructorimpl(ResultKt.createFailure(th));
                }
            }
        } catch (IOException unused2) {
            c2129c = null;
        }
    }

    public /* synthetic */ ImageLruDiskCache(Context context, String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i & 4) != 0 ? SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE : j);
    }
}

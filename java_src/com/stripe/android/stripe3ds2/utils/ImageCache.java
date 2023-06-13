package com.stripe.android.stripe3ds2.utils;

import android.graphics.Bitmap;
import android.util.LruCache;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0001\nJ\b\u0010\u0002\u001a\u00020\u0003H&J\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦\u0002J\u0019\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H¦\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/utils/ImageCache;", "", "clear", "", "get", "Landroid/graphics/Bitmap;", "key", "", "set", "bitmap", "Default", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface ImageCache {

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0013\u0010\u0010\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0011\u001a\u00020\bH\u0096\u0002J\u0019\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\tH\u0096\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R(\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/utils/ImageCache$Default;", "Lcom/stripe/android/stripe3ds2/utils/ImageCache;", "()V", "KB", "", "MAX_SIZE", "cache", "Landroid/util/LruCache;", "", "Landroid/graphics/Bitmap;", "getCache$3ds2sdk_release$annotations", "getCache$3ds2sdk_release", "()Landroid/util/LruCache;", "cacheSize", "clear", "", "get", "key", "set", "bitmap", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class Default implements ImageCache {
        public static final Default INSTANCE = new Default();

        /* renamed from: KB */
        private static final int f75442KB = 1024;
        private static final int MAX_SIZE = 10240;
        private static final LruCache<String, Bitmap> cache;
        private static final int cacheSize;

        static {
            final int min = Math.min((int) ((Runtime.getRuntime().maxMemory() / 1024) / 8), (int) MAX_SIZE);
            cacheSize = min;
            cache = new LruCache<String, Bitmap>(min) { // from class: com.stripe.android.stripe3ds2.utils.ImageCache$Default$cache$1
                @Override // android.util.LruCache
                public int sizeOf(String key, Bitmap bitmap) {
                    Intrinsics.checkNotNullParameter(key, "key");
                    Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                    return bitmap.getByteCount() / 1024;
                }
            };
        }

        private Default() {
        }

        public static /* synthetic */ void getCache$3ds2sdk_release$annotations() {
        }

        @Override // com.stripe.android.stripe3ds2.utils.ImageCache
        public void clear() {
            cache.evictAll();
        }

        @Override // com.stripe.android.stripe3ds2.utils.ImageCache
        public Bitmap get(String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return cache.get(key);
        }

        public final LruCache<String, Bitmap> getCache$3ds2sdk_release() {
            return cache;
        }

        @Override // com.stripe.android.stripe3ds2.utils.ImageCache
        public void set(String key, Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            cache.put(key, bitmap);
        }
    }

    void clear();

    Bitmap get(String str);

    void set(String str, Bitmap bitmap);
}

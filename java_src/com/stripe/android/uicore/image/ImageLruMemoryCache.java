package com.stripe.android.uicore.image;

import android.graphics.Bitmap;
import android.util.LruCache;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000fJ\f\u0010\u0014\u001a\u00020\u0011*\u00020\u0011H\u0002R\u0016\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\n\n\u0002\u0010\t\u0012\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/uicore/image/ImageLruMemoryCache;", "", "maxSize", "", "(I)V", "lruCache", "com/stripe/android/uicore/image/ImageLruMemoryCache$lruCache$1", "getLruCache$annotations", "()V", "Lcom/stripe/android/uicore/image/ImageLruMemoryCache$lruCache$1;", "getMaxSize", "()I", "clear", "", "getBitmap", "Landroid/graphics/Bitmap;", "key", "", "put", "bitmap", "toKey", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ImageLruMemoryCache {
    public static final int $stable = 0;
    private final ImageLruMemoryCache$lruCache$1 lruCache;
    private final int maxSize;

    public ImageLruMemoryCache() {
        this(0, 1, null);
    }

    private static /* synthetic */ void getLruCache$annotations() {
    }

    private final String toKey(String str) {
        return String.valueOf(str.hashCode());
    }

    public final void clear() {
        synchronized (this) {
            evictAll();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final Bitmap getBitmap(String key) {
        Bitmap bitmap;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this) {
            bitmap = get(toKey(key));
        }
        return bitmap;
    }

    public final int getMaxSize() {
        return this.maxSize;
    }

    public final void put(String key, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        synchronized (this) {
            if (get(toKey(key)) == null) {
                put(toKey(key), bitmap);
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.stripe.android.uicore.image.ImageLruMemoryCache$lruCache$1] */
    public ImageLruMemoryCache(final int i) {
        this.maxSize = i;
        this.lruCache = new LruCache<String, Bitmap>(i) { // from class: com.stripe.android.uicore.image.ImageLruMemoryCache$lruCache$1
            @Override // android.util.LruCache
            public int sizeOf(String key, Bitmap bitmap) {
                Intrinsics.checkNotNullParameter(key, "key");
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                return bitmap.getByteCount() / 1024;
            }
        };
    }

    public /* synthetic */ ImageLruMemoryCache(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? ((int) (Runtime.getRuntime().maxMemory() / 1024)) / 8 : i);
    }
}

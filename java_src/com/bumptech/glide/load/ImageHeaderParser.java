package com.bumptech.glide.load;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* loaded from: classes5.dex */
public interface ImageHeaderParser {

    /* loaded from: classes5.dex */
    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        UNKNOWN(false);
        

        /* renamed from: b */
        public final boolean f69149b;

        ImageType(boolean z) {
            this.f69149b = z;
        }

        public boolean hasAlpha() {
            return this.f69149b;
        }

        public boolean isWebp() {
            int i = C17115a.f69150a[ordinal()];
            return i == 1 || i == 2 || i == 3;
        }
    }

    /* renamed from: com.bumptech.glide.load.ImageHeaderParser$a */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C17115a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f69150a;

        static {
            int[] iArr = new int[ImageType.values().length];
            f69150a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69150a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f69150a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: a */
    int mo53074a(InputStream inputStream, InterfaceC28820to interfaceC28820to) throws IOException;

    /* renamed from: b */
    ImageType mo53073b(InputStream inputStream) throws IOException;

    /* renamed from: c */
    ImageType mo53072c(ByteBuffer byteBuffer) throws IOException;

    /* renamed from: d */
    int mo53071d(ByteBuffer byteBuffer, InterfaceC28820to interfaceC28820to) throws IOException;
}

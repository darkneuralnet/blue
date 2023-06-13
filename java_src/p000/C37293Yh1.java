package p000;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* renamed from: Yh1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C37293Yh1 implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: a */
    public int mo53074a(InputStream inputStream, InterfaceC28820to interfaceC28820to) throws IOException {
        int m76651i = new C37059Xh1(inputStream).m76651i("Orientation", 1);
        if (m76651i == 0) {
            return -1;
        }
        return m76651i;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: b */
    public ImageHeaderParser.ImageType mo53073b(InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: c */
    public ImageHeaderParser.ImageType mo53072c(ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    /* renamed from: d */
    public int mo53071d(ByteBuffer byteBuffer, InterfaceC28820to interfaceC28820to) throws IOException {
        return mo53074a(E70.m109376g(byteBuffer), interfaceC28820to);
    }
}

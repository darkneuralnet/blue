package p000;

import android.util.Log;
import com.bumptech.glide.load.C17116a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
/* renamed from: tR5  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C49238tR5 implements InterfaceC38502bM4<InputStream, C49692uC1> {

    /* renamed from: a */
    public final List<ImageHeaderParser> f110480a;

    /* renamed from: b */
    public final InterfaceC38502bM4<ByteBuffer, C49692uC1> f110481b;

    /* renamed from: c */
    public final InterfaceC28820to f110482c;

    public C49238tR5(List<ImageHeaderParser> list, InterfaceC38502bM4<ByteBuffer, C49692uC1> interfaceC38502bM4, InterfaceC28820to interfaceC28820to) {
        this.f110480a = list;
        this.f110481b = interfaceC38502bM4;
        this.f110482c = interfaceC28820to;
    }

    /* renamed from: e */
    public static byte[] m12375e(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
                return null;
            }
            return null;
        }
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: c */
    public VL4<C49692uC1> mo1781b(InputStream inputStream, int i, int i2, C48964sy3 c48964sy3) throws IOException {
        byte[] m12375e = m12375e(inputStream);
        if (m12375e == null) {
            return null;
        }
        return this.f110481b.mo1781b(ByteBuffer.wrap(m12375e), i, i2, c48964sy3);
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: d */
    public boolean mo1782a(InputStream inputStream, C48964sy3 c48964sy3) throws IOException {
        if (!((Boolean) c48964sy3.m13300c(EC1.f7092b)).booleanValue() && C17116a.m53102f(this.f110480a, inputStream, this.f110482c) == ImageHeaderParser.ImageType.GIF) {
            return true;
        }
        return false;
    }
}

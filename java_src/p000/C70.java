package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.C17116a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import p000.InterfaceC49099tC1;
/* renamed from: C70 */
/* loaded from: classes5.dex */
public class C70 implements InterfaceC38502bM4<ByteBuffer, C49692uC1> {

    /* renamed from: f */
    public static final C0859a f3398f = new C0859a();

    /* renamed from: g */
    public static final C0860b f3399g = new C0860b();

    /* renamed from: a */
    public final Context f3400a;

    /* renamed from: b */
    public final List<ImageHeaderParser> f3401b;

    /* renamed from: c */
    public final C0860b f3402c;

    /* renamed from: d */
    public final C0859a f3403d;

    /* renamed from: e */
    public final C48506sC1 f3404e;

    /* renamed from: C70$a */
    /* loaded from: classes5.dex */
    public static class C0859a {
        /* renamed from: a */
        public InterfaceC49099tC1 m112884a(InterfaceC49099tC1.InterfaceC28552a interfaceC28552a, CC1 cc1, ByteBuffer byteBuffer, int i) {
            return new C49211tO5(interfaceC28552a, cc1, byteBuffer, i);
        }
    }

    /* renamed from: C70$b */
    /* loaded from: classes5.dex */
    public static class C0860b {

        /* renamed from: a */
        public final Queue<DC1> f3405a = C47029pi6.m18920f(0);

        /* renamed from: a */
        public synchronized DC1 m112883a(ByteBuffer byteBuffer) {
            DC1 poll;
            poll = this.f3405a.poll();
            if (poll == null) {
                poll = new DC1();
            }
            return poll.m110696p(byteBuffer);
        }

        /* renamed from: b */
        public synchronized void m112882b(DC1 dc1) {
            dc1.m110711a();
            this.f3405a.offer(dc1);
        }
    }

    public C70(Context context, List<ImageHeaderParser> list, InterfaceC20044eU interfaceC20044eU, InterfaceC28820to interfaceC28820to) {
        this(context, list, interfaceC20044eU, interfaceC28820to, f3399g, f3398f);
    }

    /* renamed from: e */
    public static int m112886e(CC1 cc1, int i, int i2) {
        int highestOneBit;
        int min = Math.min(cc1.m112659a() / i2, cc1.m112656d() / i);
        if (min == 0) {
            highestOneBit = 0;
        } else {
            highestOneBit = Integer.highestOneBit(min);
        }
        int max = Math.max(1, highestOneBit);
        if (Log.isLoggable("BufferGifDecoder", 2) && max > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + max + ", target dimens: [" + i + "x" + i2 + "], actual dimens: [" + cc1.m112656d() + "x" + cc1.m112659a() + "]");
        }
        return max;
    }

    /* renamed from: c */
    public final C51470xC1 m112888c(ByteBuffer byteBuffer, int i, int i2, DC1 dc1, C48964sy3 c48964sy3) {
        Bitmap.Config config;
        long m11168b = C49546tx2.m11168b();
        try {
            CC1 m110709c = dc1.m110709c();
            if (m110709c.m112658b() > 0 && m110709c.m112657c() == 0) {
                if (c48964sy3.m13300c(EC1.f7091a) == EnumC45712nV0.PREFER_RGB_565) {
                    config = Bitmap.Config.RGB_565;
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                InterfaceC49099tC1 m112884a = this.f3403d.m112884a(this.f3404e, m110709c, byteBuffer, m112886e(m110709c, i, i2));
                m112884a.mo12434a(config);
                m112884a.mo12429f();
                Bitmap mo12430e = m112884a.mo12430e();
                if (mo12430e == null) {
                    return null;
                }
                C51470xC1 c51470xC1 = new C51470xC1(new C49692uC1(this.f3400a, m112884a, C42245he6.m36117c(), i, i2, mo12430e));
                if (Log.isLoggable("BufferGifDecoder", 2)) {
                    Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C49546tx2.m11169a(m11168b));
                }
                return c51470xC1;
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C49546tx2.m11169a(m11168b));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + C49546tx2.m11169a(m11168b));
            }
        }
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: d */
    public C51470xC1 mo1781b(ByteBuffer byteBuffer, int i, int i2, C48964sy3 c48964sy3) {
        DC1 m112883a = this.f3402c.m112883a(byteBuffer);
        try {
            return m112888c(byteBuffer, i, i2, m112883a, c48964sy3);
        } finally {
            this.f3402c.m112882b(m112883a);
        }
    }

    @Override // p000.InterfaceC38502bM4
    /* renamed from: f */
    public boolean mo1782a(ByteBuffer byteBuffer, C48964sy3 c48964sy3) throws IOException {
        if (!((Boolean) c48964sy3.m13300c(EC1.f7092b)).booleanValue() && C17116a.m53101g(this.f3401b, byteBuffer) == ImageHeaderParser.ImageType.GIF) {
            return true;
        }
        return false;
    }

    public C70(Context context, List<ImageHeaderParser> list, InterfaceC20044eU interfaceC20044eU, InterfaceC28820to interfaceC28820to, C0860b c0860b, C0859a c0859a) {
        this.f3400a = context.getApplicationContext();
        this.f3401b = list;
        this.f3403d = c0859a;
        this.f3404e = new C48506sC1(interfaceC20044eU, interfaceC28820to);
        this.f3402c = c0860b;
    }
}

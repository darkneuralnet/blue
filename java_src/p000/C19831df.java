package p000;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.C17116a;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
/* renamed from: df */
/* loaded from: classes5.dex */
public final class C19831df {

    /* renamed from: a */
    public final List<ImageHeaderParser> f76995a;

    /* renamed from: b */
    public final InterfaceC28820to f76996b;

    /* renamed from: df$a */
    /* loaded from: classes5.dex */
    public static final class C19832a implements VL4<Drawable> {

        /* renamed from: b */
        public final AnimatedImageDrawable f76997b;

        public C19832a(AnimatedImageDrawable animatedImageDrawable) {
            this.f76997b = animatedImageDrawable;
        }

        @Override // p000.VL4
        /* renamed from: a */
        public int mo5713a() {
            int intrinsicWidth;
            int intrinsicHeight;
            intrinsicWidth = this.f76997b.getIntrinsicWidth();
            intrinsicHeight = this.f76997b.getIntrinsicHeight();
            return intrinsicWidth * intrinsicHeight * C47029pi6.m18917i(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // p000.VL4
        /* renamed from: b */
        public void mo5712b() {
            this.f76997b.stop();
            this.f76997b.clearAnimationCallbacks();
        }

        @Override // p000.VL4
        /* renamed from: c */
        public AnimatedImageDrawable get() {
            return this.f76997b;
        }

        @Override // p000.VL4
        /* renamed from: d */
        public Class<Drawable> mo5710d() {
            return Drawable.class;
        }
    }

    /* renamed from: df$b */
    /* loaded from: classes5.dex */
    public static final class C19833b implements InterfaceC38502bM4<ByteBuffer, Drawable> {

        /* renamed from: a */
        public final C19831df f76998a;

        public C19833b(C19831df c19831df) {
            this.f76998a = c19831df;
        }

        @Override // p000.InterfaceC38502bM4
        /* renamed from: c */
        public VL4<Drawable> mo1781b(ByteBuffer byteBuffer, int i, int i2, C48964sy3 c48964sy3) throws IOException {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(byteBuffer);
            return this.f76998a.m43945b(createSource, i, i2, c48964sy3);
        }

        @Override // p000.InterfaceC38502bM4
        /* renamed from: d */
        public boolean mo1782a(ByteBuffer byteBuffer, C48964sy3 c48964sy3) throws IOException {
            return this.f76998a.m43943d(byteBuffer);
        }
    }

    /* renamed from: df$c */
    /* loaded from: classes5.dex */
    public static final class C19834c implements InterfaceC38502bM4<InputStream, Drawable> {

        /* renamed from: a */
        public final C19831df f76999a;

        public C19834c(C19831df c19831df) {
            this.f76999a = c19831df;
        }

        @Override // p000.InterfaceC38502bM4
        /* renamed from: c */
        public VL4<Drawable> mo1781b(InputStream inputStream, int i, int i2, C48964sy3 c48964sy3) throws IOException {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(E70.m109381b(inputStream));
            return this.f76999a.m43945b(createSource, i, i2, c48964sy3);
        }

        @Override // p000.InterfaceC38502bM4
        /* renamed from: d */
        public boolean mo1782a(InputStream inputStream, C48964sy3 c48964sy3) throws IOException {
            return this.f76999a.m43944c(inputStream);
        }
    }

    public C19831df(List<ImageHeaderParser> list, InterfaceC28820to interfaceC28820to) {
        this.f76995a = list;
        this.f76996b = interfaceC28820to;
    }

    /* renamed from: a */
    public static InterfaceC38502bM4<ByteBuffer, Drawable> m43946a(List<ImageHeaderParser> list, InterfaceC28820to interfaceC28820to) {
        return new C19833b(new C19831df(list, interfaceC28820to));
    }

    /* renamed from: f */
    public static InterfaceC38502bM4<InputStream, Drawable> m43941f(List<ImageHeaderParser> list, InterfaceC28820to interfaceC28820to) {
        return new C19834c(new C19831df(list, interfaceC28820to));
    }

    /* renamed from: b */
    public VL4<Drawable> m43945b(ImageDecoder.Source source, int i, int i2, C48964sy3 c48964sy3) throws IOException {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new C44553lY0(i, i2, c48964sy3));
        if (C9435Xe.m76746a(decodeDrawable)) {
            return new C19832a(C9866Ye.m74664a(decodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated webp, failing: " + decodeDrawable);
    }

    /* renamed from: c */
    public boolean m43944c(InputStream inputStream) throws IOException {
        return m43942e(C17116a.m53102f(this.f76995a, inputStream, this.f76996b));
    }

    /* renamed from: d */
    public boolean m43943d(ByteBuffer byteBuffer) throws IOException {
        return m43942e(C17116a.m53101g(this.f76995a, byteBuffer));
    }

    /* renamed from: e */
    public final boolean m43942e(ImageHeaderParser.ImageType imageType) {
        return imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP;
    }
}

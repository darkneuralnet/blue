package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.C17116a;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C17131c;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
/* renamed from: JX1 */
/* loaded from: classes5.dex */
public interface JX1 {

    /* renamed from: JX1$a */
    /* loaded from: classes5.dex */
    public static final class C4133a implements JX1 {

        /* renamed from: a */
        public final ByteBuffer f17722a;

        /* renamed from: b */
        public final List<ImageHeaderParser> f17723b;

        /* renamed from: c */
        public final InterfaceC28820to f17724c;

        public C4133a(ByteBuffer byteBuffer, List<ImageHeaderParser> list, InterfaceC28820to interfaceC28820to) {
            this.f17722a = byteBuffer;
            this.f17723b = list;
            this.f17724c = interfaceC28820to;
        }

        @Override // p000.JX1
        /* renamed from: a */
        public void mo100306a() {
        }

        @Override // p000.JX1
        /* renamed from: b */
        public int mo100305b() throws IOException {
            return C17116a.m53105c(this.f17723b, E70.m109379d(this.f17722a), this.f17724c);
        }

        @Override // p000.JX1
        /* renamed from: c */
        public Bitmap mo100304c(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(m100307e(), null, options);
        }

        @Override // p000.JX1
        /* renamed from: d */
        public ImageHeaderParser.ImageType mo100303d() throws IOException {
            return C17116a.m53101g(this.f17723b, E70.m109379d(this.f17722a));
        }

        /* renamed from: e */
        public final InputStream m100307e() {
            return E70.m109376g(E70.m109379d(this.f17722a));
        }
    }

    /* renamed from: JX1$b */
    /* loaded from: classes5.dex */
    public static final class C4134b implements JX1 {

        /* renamed from: a */
        public final C17131c f17725a;

        /* renamed from: b */
        public final InterfaceC28820to f17726b;

        /* renamed from: c */
        public final List<ImageHeaderParser> f17727c;

        public C4134b(InputStream inputStream, List<ImageHeaderParser> list, InterfaceC28820to interfaceC28820to) {
            this.f17726b = (InterfaceC28820to) C52865zZ3.m1111d(interfaceC28820to);
            this.f17727c = (List) C52865zZ3.m1111d(list);
            this.f17725a = new C17131c(inputStream, interfaceC28820to);
        }

        @Override // p000.JX1
        /* renamed from: a */
        public void mo100306a() {
            this.f17725a.m53091b();
        }

        @Override // p000.JX1
        /* renamed from: b */
        public int mo100305b() throws IOException {
            return C17116a.m53106b(this.f17727c, this.f17725a.mo53092a(), this.f17726b);
        }

        @Override // p000.JX1
        /* renamed from: c */
        public Bitmap mo100304c(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f17725a.mo53092a(), null, options);
        }

        @Override // p000.JX1
        /* renamed from: d */
        public ImageHeaderParser.ImageType mo100303d() throws IOException {
            return C17116a.m53102f(this.f17727c, this.f17725a.mo53092a(), this.f17726b);
        }
    }

    /* renamed from: JX1$c */
    /* loaded from: classes5.dex */
    public static final class C4135c implements JX1 {

        /* renamed from: a */
        public final InterfaceC28820to f17728a;

        /* renamed from: b */
        public final List<ImageHeaderParser> f17729b;

        /* renamed from: c */
        public final ParcelFileDescriptorRewinder f17730c;

        public C4135c(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, InterfaceC28820to interfaceC28820to) {
            this.f17728a = (InterfaceC28820to) C52865zZ3.m1111d(interfaceC28820to);
            this.f17729b = (List) C52865zZ3.m1111d(list);
            this.f17730c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // p000.JX1
        /* renamed from: a */
        public void mo100306a() {
        }

        @Override // p000.JX1
        /* renamed from: b */
        public int mo100305b() throws IOException {
            return C17116a.m53107a(this.f17729b, this.f17730c, this.f17728a);
        }

        @Override // p000.JX1
        /* renamed from: c */
        public Bitmap mo100304c(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f17730c.mo53092a().getFileDescriptor(), null, options);
        }

        @Override // p000.JX1
        /* renamed from: d */
        public ImageHeaderParser.ImageType mo100303d() throws IOException {
            return C17116a.m53103e(this.f17729b, this.f17730c, this.f17728a);
        }
    }

    /* renamed from: a */
    void mo100306a();

    /* renamed from: b */
    int mo100305b() throws IOException;

    /* renamed from: c */
    Bitmap mo100304c(BitmapFactory.Options options) throws IOException;

    /* renamed from: d */
    ImageHeaderParser.ImageType mo100303d() throws IOException;
}

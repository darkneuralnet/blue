package com.bumptech.glide.load;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
/* renamed from: com.bumptech.glide.load.a */
/* loaded from: classes5.dex */
public final class C17116a {

    /* renamed from: com.bumptech.glide.load.a$a */
    /* loaded from: classes5.dex */
    public class C17117a implements InterfaceC17124h {

        /* renamed from: a */
        public final /* synthetic */ InputStream f69151a;

        public C17117a(InputStream inputStream) {
            this.f69151a = inputStream;
        }

        @Override // com.bumptech.glide.load.C17116a.InterfaceC17124h
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo53098a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo53073b(this.f69151a);
            } finally {
                this.f69151a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$b */
    /* loaded from: classes5.dex */
    public class C17118b implements InterfaceC17124h {

        /* renamed from: a */
        public final /* synthetic */ ByteBuffer f69152a;

        public C17118b(ByteBuffer byteBuffer) {
            this.f69152a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.C17116a.InterfaceC17124h
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo53098a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo53072c(this.f69152a);
            } finally {
                E70.m109379d(this.f69152a);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$c */
    /* loaded from: classes5.dex */
    public class C17119c implements InterfaceC17124h {

        /* renamed from: a */
        public final /* synthetic */ ParcelFileDescriptorRewinder f69153a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC28820to f69154b;

        public C17119c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC28820to interfaceC28820to) {
            this.f69153a = parcelFileDescriptorRewinder;
            this.f69154b = interfaceC28820to;
        }

        @Override // com.bumptech.glide.load.C17116a.InterfaceC17124h
        /* renamed from: a */
        public ImageHeaderParser.ImageType mo53098a(ImageHeaderParser imageHeaderParser) throws IOException {
            C38818bt4 c38818bt4 = null;
            try {
                C38818bt4 c38818bt42 = new C38818bt4(new FileInputStream(this.f69153a.mo53092a().getFileDescriptor()), this.f69154b);
                try {
                    ImageHeaderParser.ImageType mo53073b = imageHeaderParser.mo53073b(c38818bt42);
                    c38818bt42.release();
                    this.f69153a.mo53092a();
                    return mo53073b;
                } catch (Throwable th) {
                    th = th;
                    c38818bt4 = c38818bt42;
                    if (c38818bt4 != null) {
                        c38818bt4.release();
                    }
                    this.f69153a.mo53092a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$d */
    /* loaded from: classes5.dex */
    public class C17120d implements InterfaceC17123g {

        /* renamed from: a */
        public final /* synthetic */ ByteBuffer f69155a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC28820to f69156b;

        public C17120d(ByteBuffer byteBuffer, InterfaceC28820to interfaceC28820to) {
            this.f69155a = byteBuffer;
            this.f69156b = interfaceC28820to;
        }

        @Override // com.bumptech.glide.load.C17116a.InterfaceC17123g
        /* renamed from: a */
        public int mo53099a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo53071d(this.f69155a, this.f69156b);
            } finally {
                E70.m109379d(this.f69155a);
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$e */
    /* loaded from: classes5.dex */
    public class C17121e implements InterfaceC17123g {

        /* renamed from: a */
        public final /* synthetic */ InputStream f69157a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC28820to f69158b;

        public C17121e(InputStream inputStream, InterfaceC28820to interfaceC28820to) {
            this.f69157a = inputStream;
            this.f69158b = interfaceC28820to;
        }

        @Override // com.bumptech.glide.load.C17116a.InterfaceC17123g
        /* renamed from: a */
        public int mo53099a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.mo53074a(this.f69157a, this.f69158b);
            } finally {
                this.f69157a.reset();
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$f */
    /* loaded from: classes5.dex */
    public class C17122f implements InterfaceC17123g {

        /* renamed from: a */
        public final /* synthetic */ ParcelFileDescriptorRewinder f69159a;

        /* renamed from: b */
        public final /* synthetic */ InterfaceC28820to f69160b;

        public C17122f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC28820to interfaceC28820to) {
            this.f69159a = parcelFileDescriptorRewinder;
            this.f69160b = interfaceC28820to;
        }

        @Override // com.bumptech.glide.load.C17116a.InterfaceC17123g
        /* renamed from: a */
        public int mo53099a(ImageHeaderParser imageHeaderParser) throws IOException {
            C38818bt4 c38818bt4 = null;
            try {
                C38818bt4 c38818bt42 = new C38818bt4(new FileInputStream(this.f69159a.mo53092a().getFileDescriptor()), this.f69160b);
                try {
                    int mo53074a = imageHeaderParser.mo53074a(c38818bt42, this.f69160b);
                    c38818bt42.release();
                    this.f69159a.mo53092a();
                    return mo53074a;
                } catch (Throwable th) {
                    th = th;
                    c38818bt4 = c38818bt42;
                    if (c38818bt4 != null) {
                        c38818bt4.release();
                    }
                    this.f69159a.mo53092a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* renamed from: com.bumptech.glide.load.a$g */
    /* loaded from: classes5.dex */
    public interface InterfaceC17123g {
        /* renamed from: a */
        int mo53099a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* renamed from: com.bumptech.glide.load.a$h */
    /* loaded from: classes5.dex */
    public interface InterfaceC17124h {
        /* renamed from: a */
        ImageHeaderParser.ImageType mo53098a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    private C17116a() {
    }

    /* renamed from: a */
    public static int m53107a(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC28820to interfaceC28820to) throws IOException {
        return m53104d(list, new C17122f(parcelFileDescriptorRewinder, interfaceC28820to));
    }

    /* renamed from: b */
    public static int m53106b(List<ImageHeaderParser> list, InputStream inputStream, InterfaceC28820to interfaceC28820to) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C38818bt4(inputStream, interfaceC28820to);
        }
        inputStream.mark(5242880);
        return m53104d(list, new C17121e(inputStream, interfaceC28820to));
    }

    /* renamed from: c */
    public static int m53105c(List<ImageHeaderParser> list, ByteBuffer byteBuffer, InterfaceC28820to interfaceC28820to) throws IOException {
        if (byteBuffer == null) {
            return -1;
        }
        return m53104d(list, new C17120d(byteBuffer, interfaceC28820to));
    }

    /* renamed from: d */
    public static int m53104d(List<ImageHeaderParser> list, InterfaceC17123g interfaceC17123g) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int mo53099a = interfaceC17123g.mo53099a(list.get(i));
            if (mo53099a != -1) {
                return mo53099a;
            }
        }
        return -1;
    }

    /* renamed from: e */
    public static ImageHeaderParser.ImageType m53103e(List<ImageHeaderParser> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, InterfaceC28820to interfaceC28820to) throws IOException {
        return m53100h(list, new C17119c(parcelFileDescriptorRewinder, interfaceC28820to));
    }

    /* renamed from: f */
    public static ImageHeaderParser.ImageType m53102f(List<ImageHeaderParser> list, InputStream inputStream, InterfaceC28820to interfaceC28820to) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new C38818bt4(inputStream, interfaceC28820to);
        }
        inputStream.mark(5242880);
        return m53100h(list, new C17117a(inputStream));
    }

    /* renamed from: g */
    public static ImageHeaderParser.ImageType m53101g(List<ImageHeaderParser> list, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return m53100h(list, new C17118b(byteBuffer));
    }

    /* renamed from: h */
    public static ImageHeaderParser.ImageType m53100h(List<ImageHeaderParser> list, InterfaceC17124h interfaceC17124h) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType mo53098a = interfaceC17124h.mo53098a(list.get(i));
            if (mo53098a != ImageHeaderParser.ImageType.UNKNOWN) {
                return mo53098a;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}

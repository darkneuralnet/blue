package p000;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import p000.IS0;
import p000.WU2;
/* renamed from: ml1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C45275ml1<Data> implements WU2<File, Data> {

    /* renamed from: a */
    public final InterfaceC26190d<Data> f98667a;

    /* renamed from: ml1$a */
    /* loaded from: classes5.dex */
    public static class C26186a<Data> implements XU2<File, Data> {

        /* renamed from: a */
        public final InterfaceC26190d<Data> f98668a;

        public C26186a(InterfaceC26190d<Data> interfaceC26190d) {
            this.f98668a = interfaceC26190d;
        }

        @Override // p000.XU2
        /* renamed from: b */
        public final WU2<File, Data> mo19945b(QW2 qw2) {
            return new C45275ml1(this.f98668a);
        }
    }

    /* renamed from: ml1$b */
    /* loaded from: classes5.dex */
    public static class C26187b extends C26186a<ParcelFileDescriptor> {

        /* renamed from: ml1$b$a */
        /* loaded from: classes5.dex */
        public class C26188a implements InterfaceC26190d<ParcelFileDescriptor> {
            @Override // p000.C45275ml1.InterfaceC26190d
            /* renamed from: a */
            public Class<ParcelFileDescriptor> mo25108a() {
                return ParcelFileDescriptor.class;
            }

            @Override // p000.C45275ml1.InterfaceC26190d
            /* renamed from: d */
            public void mo25107b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // p000.C45275ml1.InterfaceC26190d
            /* renamed from: e */
            public ParcelFileDescriptor mo25106c(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public C26187b() {
            super(new C26188a());
        }
    }

    /* renamed from: ml1$c */
    /* loaded from: classes5.dex */
    public static final class C26189c<Data> implements IS0<Data> {

        /* renamed from: b */
        public final File f98669b;

        /* renamed from: c */
        public final InterfaceC26190d<Data> f98670c;

        /* renamed from: d */
        public Data f98671d;

        public C26189c(File file, InterfaceC26190d<Data> interfaceC26190d) {
            this.f98669b = file;
            this.f98670c = interfaceC26190d;
        }

        @Override // p000.IS0
        /* renamed from: a */
        public Class<Data> mo6834a() {
            return this.f98670c.mo25108a();
        }

        @Override // p000.IS0
        /* renamed from: b */
        public ZS0 mo19947b() {
            return ZS0.LOCAL;
        }

        @Override // p000.IS0
        public void cancel() {
        }

        @Override // p000.IS0
        public void cleanup() {
            Data data = this.f98671d;
            if (data != null) {
                try {
                    this.f98670c.mo25107b(data);
                } catch (IOException unused) {
                }
            }
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, Data] */
        @Override // p000.IS0
        /* renamed from: e */
        public void mo19946e(P24 p24, IS0.InterfaceC3534a<? super Data> interfaceC3534a) {
            try {
                Data mo25106c = this.f98670c.mo25106c(this.f98669b);
                this.f98671d = mo25106c;
                interfaceC3534a.mo77098c(mo25106c);
            } catch (FileNotFoundException e) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e);
                }
                interfaceC3534a.mo77097d(e);
            }
        }
    }

    /* renamed from: ml1$d */
    /* loaded from: classes5.dex */
    public interface InterfaceC26190d<Data> {
        /* renamed from: a */
        Class<Data> mo25108a();

        /* renamed from: b */
        void mo25107b(Data data) throws IOException;

        /* renamed from: c */
        Data mo25106c(File file) throws FileNotFoundException;
    }

    /* renamed from: ml1$e */
    /* loaded from: classes5.dex */
    public static class C26191e extends C26186a<InputStream> {

        /* renamed from: ml1$e$a */
        /* loaded from: classes5.dex */
        public class C26192a implements InterfaceC26190d<InputStream> {
            @Override // p000.C45275ml1.InterfaceC26190d
            /* renamed from: a */
            public Class<InputStream> mo25108a() {
                return InputStream.class;
            }

            @Override // p000.C45275ml1.InterfaceC26190d
            /* renamed from: d */
            public void mo25107b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // p000.C45275ml1.InterfaceC26190d
            /* renamed from: e */
            public InputStream mo25106c(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public C26191e() {
            super(new C26192a());
        }
    }

    public C45275ml1(InterfaceC26190d<Data> interfaceC26190d) {
        this.f98667a = interfaceC26190d;
    }

    @Override // p000.WU2
    /* renamed from: c */
    public WU2.C9060a<Data> mo19951b(File file, int i, int i2, C48964sy3 c48964sy3) {
        return new WU2.C9060a<>(new C35387Qd3(file), new C26189c(file, this.f98667a));
    }

    @Override // p000.WU2
    /* renamed from: d */
    public boolean mo19952a(File file) {
        return true;
    }
}

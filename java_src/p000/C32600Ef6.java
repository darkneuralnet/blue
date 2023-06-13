package p000;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p000.WU2;
/* renamed from: Ef6  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C32600Ef6<Data> implements WU2<Uri, Data> {

    /* renamed from: b */
    public static final Set<String> f7928b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* renamed from: a */
    public final InterfaceC1924c<Data> f7929a;

    /* renamed from: Ef6$a */
    /* loaded from: classes5.dex */
    public static final class C1922a implements XU2<Uri, AssetFileDescriptor>, InterfaceC1924c<AssetFileDescriptor> {

        /* renamed from: a */
        public final ContentResolver f7930a;

        public C1922a(ContentResolver contentResolver) {
            this.f7930a = contentResolver;
        }

        @Override // p000.C32600Ef6.InterfaceC1924c
        /* renamed from: a */
        public IS0<AssetFileDescriptor> mo108590a(Uri uri) {
            return new C6492Po(this.f7930a, uri);
        }

        @Override // p000.XU2
        /* renamed from: b */
        public WU2<Uri, AssetFileDescriptor> mo19945b(QW2 qw2) {
            return new C32600Ef6(this);
        }
    }

    /* renamed from: Ef6$b */
    /* loaded from: classes5.dex */
    public static class C1923b implements XU2<Uri, ParcelFileDescriptor>, InterfaceC1924c<ParcelFileDescriptor> {

        /* renamed from: a */
        public final ContentResolver f7931a;

        public C1923b(ContentResolver contentResolver) {
            this.f7931a = contentResolver;
        }

        @Override // p000.C32600Ef6.InterfaceC1924c
        /* renamed from: a */
        public IS0<ParcelFileDescriptor> mo108590a(Uri uri) {
            return new C42903il1(this.f7931a, uri);
        }

        @Override // p000.XU2
        /* renamed from: b */
        public WU2<Uri, ParcelFileDescriptor> mo19945b(QW2 qw2) {
            return new C32600Ef6(this);
        }
    }

    /* renamed from: Ef6$c */
    /* loaded from: classes5.dex */
    public interface InterfaceC1924c<Data> {
        /* renamed from: a */
        IS0<Data> mo108590a(Uri uri);
    }

    /* renamed from: Ef6$d */
    /* loaded from: classes5.dex */
    public static class C1925d implements XU2<Uri, InputStream>, InterfaceC1924c<InputStream> {

        /* renamed from: a */
        public final ContentResolver f7932a;

        public C1925d(ContentResolver contentResolver) {
            this.f7932a = contentResolver;
        }

        @Override // p000.C32600Ef6.InterfaceC1924c
        /* renamed from: a */
        public IS0<InputStream> mo108590a(Uri uri) {
            return new C51016wR5(this.f7932a, uri);
        }

        @Override // p000.XU2
        /* renamed from: b */
        public WU2<Uri, InputStream> mo19945b(QW2 qw2) {
            return new C32600Ef6(this);
        }
    }

    public C32600Ef6(InterfaceC1924c<Data> interfaceC1924c) {
        this.f7929a = interfaceC1924c;
    }

    @Override // p000.WU2
    /* renamed from: c */
    public WU2.C9060a<Data> mo19951b(Uri uri, int i, int i2, C48964sy3 c48964sy3) {
        return new WU2.C9060a<>(new C35387Qd3(uri), this.f7929a.mo108590a(uri));
    }

    @Override // p000.WU2
    /* renamed from: d */
    public boolean mo19952a(Uri uri) {
        return f7928b.contains(uri.getScheme());
    }
}

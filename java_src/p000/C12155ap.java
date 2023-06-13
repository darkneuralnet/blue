package p000;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.InputStream;
import p000.WU2;
/* renamed from: ap */
/* loaded from: classes5.dex */
public class C12155ap<Data> implements WU2<Uri, Data> {

    /* renamed from: c */
    public static final int f56341c = 22;

    /* renamed from: a */
    public final AssetManager f56342a;

    /* renamed from: b */
    public final InterfaceC12156a<Data> f56343b;

    /* renamed from: ap$a */
    /* loaded from: classes5.dex */
    public interface InterfaceC12156a<Data> {
        /* renamed from: a */
        IS0<Data> mo65449a(AssetManager assetManager, String str);
    }

    /* renamed from: ap$b */
    /* loaded from: classes5.dex */
    public static class C12157b implements XU2<Uri, AssetFileDescriptor>, InterfaceC12156a<AssetFileDescriptor> {

        /* renamed from: a */
        public final AssetManager f56344a;

        public C12157b(AssetManager assetManager) {
            this.f56344a = assetManager;
        }

        @Override // p000.C12155ap.InterfaceC12156a
        /* renamed from: a */
        public IS0<AssetFileDescriptor> mo65449a(AssetManager assetManager, String str) {
            return new C42310hl1(assetManager, str);
        }

        @Override // p000.XU2
        /* renamed from: b */
        public WU2<Uri, AssetFileDescriptor> mo19945b(QW2 qw2) {
            return new C12155ap(this.f56344a, this);
        }
    }

    /* renamed from: ap$c */
    /* loaded from: classes5.dex */
    public static class C12158c implements XU2<Uri, InputStream>, InterfaceC12156a<InputStream> {

        /* renamed from: a */
        public final AssetManager f56345a;

        public C12158c(AssetManager assetManager) {
            this.f56345a = assetManager;
        }

        @Override // p000.C12155ap.InterfaceC12156a
        /* renamed from: a */
        public IS0<InputStream> mo65449a(AssetManager assetManager, String str) {
            return new C45088mR5(assetManager, str);
        }

        @Override // p000.XU2
        /* renamed from: b */
        public WU2<Uri, InputStream> mo19945b(QW2 qw2) {
            return new C12155ap(this.f56345a, this);
        }
    }

    public C12155ap(AssetManager assetManager, InterfaceC12156a<Data> interfaceC12156a) {
        this.f56342a = assetManager;
        this.f56343b = interfaceC12156a;
    }

    @Override // p000.WU2
    /* renamed from: c */
    public WU2.C9060a<Data> mo19951b(Uri uri, int i, int i2, C48964sy3 c48964sy3) {
        return new WU2.C9060a<>(new C35387Qd3(uri), this.f56343b.mo65449a(this.f56342a, uri.toString().substring(f56341c)));
    }

    @Override // p000.WU2
    /* renamed from: d */
    public boolean mo19952a(Uri uri) {
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }
}

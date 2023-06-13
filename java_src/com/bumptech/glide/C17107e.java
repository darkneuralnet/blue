package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.C17098b;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.C17131c;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.List;
import p000.B70;
import p000.C12155ap;
import p000.C32600Ef6;
import p000.C34472Mf6;
import p000.C35642Rf6;
import p000.C39765dT0;
import p000.C39874de6;
import p000.C43856kM4;
import p000.C43992kb4;
import p000.C45275ml1;
import p000.C46679p70;
import p000.CN1;
import p000.D70;
import p000.GP2;
import p000.HP2;
import p000.LP2;
import p000.MC1;
import p000.YR5;
/* renamed from: com.bumptech.glide.e */
/* loaded from: classes5.dex */
public final class C17107e {

    /* renamed from: com.bumptech.glide.e$a */
    /* loaded from: classes5.dex */
    public class C17108a implements MC1.InterfaceC5218b<Registry> {

        /* renamed from: a */
        public boolean f69123a;

        /* renamed from: b */
        public final /* synthetic */ ComponentCallbacks2C17096a f69124b;

        /* renamed from: c */
        public final /* synthetic */ List f69125c;

        /* renamed from: d */
        public final /* synthetic */ AbstractC12485bj f69126d;

        public C17108a(ComponentCallbacks2C17096a componentCallbacks2C17096a, List list, AbstractC12485bj abstractC12485bj) {
            this.f69124b = componentCallbacks2C17096a;
            this.f69125c = list;
            this.f69126d = abstractC12485bj;
        }

        @Override // p000.MC1.InterfaceC5218b
        /* renamed from: a */
        public Registry get() {
            if (!this.f69123a) {
                this.f69123a = true;
                C37763a66.m71893a("Glide registry");
                try {
                    return C17107e.m53121a(this.f69124b, this.f69125c, this.f69126d);
                } finally {
                    C37763a66.m71892b();
                }
            }
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
    }

    private C17107e() {
    }

    /* renamed from: a */
    public static Registry m53121a(ComponentCallbacks2C17096a componentCallbacks2C17096a, List<LC1> list, AbstractC12485bj abstractC12485bj) {
        InterfaceC20044eU m53152f = componentCallbacks2C17096a.m53152f();
        InterfaceC28820to m53153e = componentCallbacks2C17096a.m53153e();
        Context applicationContext = componentCallbacks2C17096a.m53149i().getApplicationContext();
        C17105d m53127g = componentCallbacks2C17096a.m53149i().m53127g();
        Registry registry = new Registry();
        m53120b(applicationContext, registry, m53152f, m53153e, m53127g);
        m53119c(applicationContext, componentCallbacks2C17096a, registry, list, abstractC12485bj);
        return registry;
    }

    /* renamed from: b */
    public static void m53120b(Context context, Registry registry, InterfaceC20044eU interfaceC20044eU, InterfaceC28820to interfaceC28820to, C17105d c17105d) {
        InterfaceC38502bM4 c50828w70;
        InterfaceC38502bM4 c45681nR5;
        Registry registry2;
        Object obj;
        registry.m53161r(new DefaultImageHeaderParser());
        int i = Build.VERSION.SDK_INT;
        if (i >= 27) {
            registry.m53161r(new C37293Yh1());
        }
        Resources resources = context.getResources();
        List<ImageHeaderParser> m53172g = registry.m53172g();
        C70 c70 = new C70(context, m53172g, interfaceC20044eU, interfaceC28820to);
        InterfaceC38502bM4<ParcelFileDescriptor, Bitmap> m45060l = C39391cp6.m45060l(interfaceC20044eU);
        C42519i61 c42519i61 = new C42519i61(registry.m53172g(), resources.getDisplayMetrics(), interfaceC20044eU, interfaceC28820to);
        if (i >= 28 && c17105d.m53124a(C17098b.C17100b.class)) {
            c45681nR5 = new C47234q32();
            c50828w70 = new C52014y70();
        } else {
            c50828w70 = new C50828w70(c42519i61);
            c45681nR5 = new C45681nR5(c42519i61, interfaceC28820to);
        }
        if (i >= 28) {
            registry.m53174e("Animation", InputStream.class, Drawable.class, C19831df.m43941f(m53172g, interfaceC28820to));
            registry.m53174e("Animation", ByteBuffer.class, Drawable.class, C19831df.m43946a(m53172g, interfaceC28820to));
        }
        C39706dM4 c39706dM4 = new C39706dM4(context);
        C43856kM4.C25150c c25150c = new C43856kM4.C25150c(resources);
        C43856kM4.C25151d c25151d = new C43856kM4.C25151d(resources);
        C43856kM4.C25149b c25149b = new C43856kM4.C25149b(resources);
        C43856kM4.C25148a c25148a = new C43856kM4.C25148a(resources);
        C8655VT c8655vt = new C8655VT(interfaceC28820to);
        C4928LT c4928lt = new C4928LT();
        C50284vC1 c50284vC1 = new C50284vC1();
        ContentResolver contentResolver = context.getContentResolver();
        registry.m53178a(ByteBuffer.class, new A70()).m53178a(InputStream.class, new C48645sR5(interfaceC28820to)).m53174e("Bitmap", ByteBuffer.class, Bitmap.class, c50828w70).m53174e("Bitmap", InputStream.class, Bitmap.class, c45681nR5);
        if (ParcelFileDescriptorRewinder.m53097b()) {
            registry.m53174e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new OE3(c42519i61));
        }
        registry.m53174e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, m45060l).m53174e("Bitmap", AssetFileDescriptor.class, Bitmap.class, C39391cp6.m45069c(interfaceC20044eU)).m53176c(Bitmap.class, Bitmap.class, C39874de6.C19829a.m43952a()).m53174e("Bitmap", Bitmap.class, Bitmap.class, new C36092Td6()).m53177b(Bitmap.class, c8655vt).m53174e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new C7175RT(resources, c50828w70)).m53174e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new C7175RT(resources, c45681nR5)).m53174e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new C7175RT(resources, m45060l)).m53177b(BitmapDrawable.class, new C7458ST(interfaceC20044eU, c8655vt)).m53174e("Animation", InputStream.class, C49692uC1.class, new C49238tR5(m53172g, c70, interfaceC28820to)).m53174e("Animation", ByteBuffer.class, C49692uC1.class, c70).m53177b(C49692uC1.class, new C50877wC1()).m53176c(InterfaceC49099tC1.class, InterfaceC49099tC1.class, C39874de6.C19829a.m43952a()).m53174e("Bitmap", InterfaceC49099tC1.class, Bitmap.class, new BC1(interfaceC20044eU)).m53175d(Uri.class, Drawable.class, c39706dM4).m53175d(Uri.class, Bitmap.class, new WL4(c39706dM4, interfaceC20044eU)).m53160s(new D70.C1395a()).m53176c(File.class, ByteBuffer.class, new B70.C0528b()).m53176c(File.class, InputStream.class, new C45275ml1.C26191e()).m53175d(File.class, File.class, new C41717gl1()).m53176c(File.class, ParcelFileDescriptor.class, new C45275ml1.C26187b()).m53176c(File.class, File.class, C39874de6.C19829a.m43952a()).m53160s(new C17131c.C17132a(interfaceC28820to));
        if (ParcelFileDescriptorRewinder.m53097b()) {
            registry2 = registry;
            obj = AssetFileDescriptor.class;
            registry2.m53160s(new ParcelFileDescriptorRewinder.C17125a());
        } else {
            registry2 = registry;
            obj = AssetFileDescriptor.class;
        }
        Class cls = Integer.TYPE;
        registry2.m53176c(cls, InputStream.class, c25150c).m53176c(cls, ParcelFileDescriptor.class, c25149b).m53176c(Integer.class, InputStream.class, c25150c).m53176c(Integer.class, ParcelFileDescriptor.class, c25149b).m53176c(Integer.class, Uri.class, c25151d).m53176c(cls, obj, c25148a).m53176c(Integer.class, obj, c25148a).m53176c(cls, Uri.class, c25151d).m53176c(String.class, InputStream.class, new C39765dT0.C19774c()).m53176c(Uri.class, InputStream.class, new C39765dT0.C19774c()).m53176c(String.class, InputStream.class, new YR5.C9778c()).m53176c(String.class, ParcelFileDescriptor.class, new YR5.C9777b()).m53176c(String.class, obj, new YR5.C9776a()).m53176c(Uri.class, InputStream.class, new C12155ap.C12158c(context.getAssets())).m53176c(Uri.class, obj, new C12155ap.C12157b(context.getAssets())).m53176c(Uri.class, InputStream.class, new HP2.C3139a(context)).m53176c(Uri.class, InputStream.class, new LP2.C4908a(context));
        if (i >= 29) {
            registry2.m53176c(Uri.class, InputStream.class, new C43992kb4.C25190c(context));
            registry2.m53176c(Uri.class, ParcelFileDescriptor.class, new C43992kb4.C25189b(context));
        }
        registry2.m53176c(Uri.class, InputStream.class, new C32600Ef6.C1925d(contentResolver)).m53176c(Uri.class, ParcelFileDescriptor.class, new C32600Ef6.C1923b(contentResolver)).m53176c(Uri.class, obj, new C32600Ef6.C1922a(contentResolver)).m53176c(Uri.class, InputStream.class, new C35642Rf6.C7238a()).m53176c(URL.class, InputStream.class, new C34472Mf6.C5340a()).m53176c(Uri.class, File.class, new GP2.C2842a(context)).m53176c(OC1.class, InputStream.class, new CN1.C1019a()).m53176c(byte[].class, ByteBuffer.class, new C46679p70.C27146a()).m53176c(byte[].class, InputStream.class, new C46679p70.C27150d()).m53176c(Uri.class, Uri.class, C39874de6.C19829a.m43952a()).m53176c(Drawable.class, Drawable.class, C39874de6.C19829a.m43952a()).m53175d(Drawable.class, Drawable.class, new C39263ce6()).m53159t(Bitmap.class, BitmapDrawable.class, new C7852TT(resources)).m53159t(Bitmap.class, byte[].class, c4928lt).m53159t(Drawable.class, byte[].class, new O61(interfaceC20044eU, c4928lt, c50284vC1)).m53159t(C49692uC1.class, byte[].class, c50284vC1);
        InterfaceC38502bM4<ByteBuffer, Bitmap> m45068d = C39391cp6.m45068d(interfaceC20044eU);
        registry2.m53175d(ByteBuffer.class, Bitmap.class, m45068d);
        registry2.m53175d(ByteBuffer.class, BitmapDrawable.class, new C7175RT(resources, m45068d));
    }

    /* renamed from: c */
    public static void m53119c(Context context, ComponentCallbacks2C17096a componentCallbacks2C17096a, Registry registry, List<LC1> list, AbstractC12485bj abstractC12485bj) {
        for (LC1 lc1 : list) {
            try {
                lc1.mo16929b(context, componentCallbacks2C17096a, registry);
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + lc1.getClass().getName(), e);
            }
        }
        if (abstractC12485bj != null) {
            abstractC12485bj.mo16929b(context, componentCallbacks2C17096a, registry);
        }
    }

    /* renamed from: d */
    public static MC1.InterfaceC5218b<Registry> m53118d(ComponentCallbacks2C17096a componentCallbacks2C17096a, List<LC1> list, AbstractC12485bj abstractC12485bj) {
        return new C17108a(componentCallbacks2C17096a, list, abstractC12485bj);
    }
}

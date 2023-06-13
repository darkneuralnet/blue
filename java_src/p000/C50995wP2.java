package p000;

import android.app.DownloadManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.widget.ImageView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.BitmapTarget;
import co.bird.android.model.persistence.nestedstructures.AssetMedia;
import com.bumptech.glide.load.engine.GlideException;
import com.facebook.share.internal.C17296a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.core.networking.RequestHeadersFactory;
import io.reactivex.AbstractC23461c;
import io.reactivex.InterfaceC23470e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.ResponseBody;
import p000.C50995wP2;
@Metadata(m28433d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB)\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$¢\u0006\u0004\b,\u0010-J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016JC\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000e\u001a\u00028\u00002\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00170(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006."}, m28432d2 = {"LwP2;", "LsP2;", "Lco/bird/android/model/persistence/nestedstructures/AssetMedia;", "media", "Landroid/widget/ImageView;", "view", "", "width", "height", "Lio/reactivex/c;", C17296a.f69688o, "K", "LMT;", "bitmapCache", "cacheKey", "LTI4;", "Landroid/graphics/Bitmap;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "b", "(Lco/bird/android/model/persistence/nestedstructures/AssetMedia;LMT;Ljava/lang/Object;LTI4;)V", "Lokhttp3/ResponseBody;", "responseBody", "", "fileName", "f", "LUI4;", "LUI4;", "glide", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "Landroid/app/DownloadManager;", "c", "Landroid/app/DownloadManager;", "downloadManager", "La61;", DateTokenConverter.CONVERTER_KEY, "La61;", "downloadClient", "", "e", "Ljava/util/Set;", "loadingMedia", "<init>", "(LUI4;Landroid/os/Handler;Landroid/app/DownloadManager;La61;)V", "media_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMediaManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MediaManagerImpl.kt\nco/bird/android/manager/media/MediaManagerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n1#2:191\n*E\n"})
/* renamed from: wP2  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50995wP2 implements InterfaceC48624sP2 {

    /* renamed from: a */
    public final UI4 f115899a;

    /* renamed from: b */
    public final Handler f115900b;

    /* renamed from: c */
    public final DownloadManager f115901c;

    /* renamed from: d */
    public final InterfaceC37758a61 f115902d;

    /* renamed from: e */
    public final Set<String> f115903e;

    @Metadata(m28433d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u0004B%\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0006\u0010\u0015\u001a\u00028\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b \u0010!J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00032\u0010\u0010\u0007\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0003\u0018\u00010\u0006H\u0016J\u0012\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0012\u0010\u000e\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0016R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u001f\u001a\u00020\u00038\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u0013\u0010\u001e¨\u0006\""}, m28432d2 = {"LwP2$a;", "K", "LVA5;", "Landroid/graphics/Bitmap;", "Lco/bird/android/model/BitmapTarget;", "resource", "LG96;", "transition", "", DateTokenConverter.CONVERTER_KEY, "Landroid/graphics/drawable/Drawable;", "placeholder", "onLoadCleared", "errorDrawable", "onLoadFailed", "LMT;", "e", "LMT;", "cache", "f", "Ljava/lang/Object;", "cacheKey", "", "g", "Ljava/lang/String;", "mediaId", "h", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;)V", "bitmap", "<init>", "(LwP2;LMT;Ljava/lang/Object;Ljava/lang/String;)V", "media_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: wP2$a */
    /* loaded from: classes4.dex */
    public final class C29870a<K> extends VA5<Bitmap> implements BitmapTarget {

        /* renamed from: e */
        public final InterfaceC5295MT<K> f115904e;

        /* renamed from: f */
        public final K f115905f;

        /* renamed from: g */
        public final String f115906g;

        /* renamed from: h */
        public Bitmap f115907h;

        /* renamed from: i */
        public final /* synthetic */ C50995wP2 f115908i;

        public C29870a(C50995wP2 c50995wP2, InterfaceC5295MT<K> cache, K k, String mediaId) {
            Intrinsics.checkNotNullParameter(cache, "cache");
            Intrinsics.checkNotNullParameter(mediaId, "mediaId");
            this.f115908i = c50995wP2;
            this.f115904e = cache;
            this.f115905f = k;
            this.f115906g = mediaId;
        }

        /* renamed from: e */
        public static final void m6884e(C50995wP2 this$0, C29870a this$1) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            this$0.f115899a.m81660d(this$1);
        }

        @Override // p000.LY5
        /* renamed from: d */
        public void onResourceReady(Bitmap resource, G96<? super Bitmap> g96) {
            Intrinsics.checkNotNullParameter(resource, "resource");
            InterfaceC5295MT<K> interfaceC5295MT = this.f115904e;
            final C50995wP2 c50995wP2 = this.f115908i;
            synchronized (interfaceC5295MT) {
                c50995wP2.f115903e.remove(this.f115906g);
                if (this.f115904e.contains(this.f115905f)) {
                    c50995wP2.f115900b.post(new Runnable() { // from class: vP2
                        @Override // java.lang.Runnable
                        public final void run() {
                            C50995wP2.C29870a.m6884e(C50995wP2.this, this);
                        }
                    });
                } else {
                    m6883f(resource);
                    this.f115904e.mo4700b(this.f115905f, this);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }

        /* renamed from: f */
        public void m6883f(Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "<set-?>");
            this.f115907h = bitmap;
        }

        @Override // co.bird.android.model.BitmapTarget
        public Bitmap getBitmap() {
            Bitmap bitmap = this.f115907h;
            if (bitmap != null) {
                return bitmap;
            }
            Intrinsics.throwUninitializedPropertyAccessException("bitmap");
            return null;
        }

        @Override // p000.AbstractC28661tE, p000.LY5
        public void onLoadCleared(Drawable drawable) {
            InterfaceC5295MT<K> interfaceC5295MT = this.f115904e;
            C50995wP2 c50995wP2 = this.f115908i;
            synchronized (interfaceC5295MT) {
                c50995wP2.f115903e.remove(this.f115906g);
            }
        }

        @Override // p000.AbstractC28661tE, p000.LY5
        public void onLoadFailed(Drawable drawable) {
            InterfaceC5295MT<K> interfaceC5295MT = this.f115904e;
            C50995wP2 c50995wP2 = this.f115908i;
            synchronized (interfaceC5295MT) {
                c50995wP2.f115903e.remove(this.f115906g);
            }
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/e;", "emitter", "", "b", "(Lio/reactivex/e;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: wP2$b */
    /* loaded from: classes4.dex */
    public static final class C29871b extends Lambda implements Function1<InterfaceC23470e, Unit> {

        /* renamed from: h */
        public final /* synthetic */ AssetMedia f115910h;

        /* renamed from: i */
        public final /* synthetic */ int f115911i;

        /* renamed from: j */
        public final /* synthetic */ int f115912j;

        /* renamed from: k */
        public final /* synthetic */ ImageView f115913k;

        @Metadata(m28433d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J4\u0010\u000b\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J>\u0010\u000f\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u0010"}, m28432d2 = {"wP2$b$a", "LTI4;", "Landroid/graphics/drawable/Drawable;", "Lcom/bumptech/glide/load/engine/GlideException;", "e", "", RequestHeadersFactory.MODEL, "LLY5;", "target", "", "isFirstResource", C17296a.f69688o, "resource", "LZS0;", "dataSource", "b", "media_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: wP2$b$a */
        /* loaded from: classes4.dex */
        public static final class C29872a implements TI4<Drawable> {

            /* renamed from: b */
            public final /* synthetic */ InterfaceC23470e f115914b;

            /* renamed from: c */
            public final /* synthetic */ AssetMedia f115915c;

            public C29872a(InterfaceC23470e interfaceC23470e, AssetMedia assetMedia) {
                this.f115914b = interfaceC23470e;
                this.f115915c = assetMedia;
            }

            @Override // p000.TI4
            /* renamed from: a */
            public boolean mo6879a(GlideException glideException, Object obj, LY5<Drawable> ly5, boolean z) {
                InterfaceC23470e interfaceC23470e = this.f115914b;
                Throwable th = glideException;
                if (glideException == null) {
                    th = new C48032rP2(this.f115915c.getMediaUrl());
                }
                interfaceC23470e.onError(th);
                return false;
            }

            @Override // p000.TI4
            /* renamed from: b */
            public boolean onResourceReady(Drawable drawable, Object obj, LY5<Drawable> ly5, ZS0 zs0, boolean z) {
                this.f115914b.onComplete();
                return false;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29871b(AssetMedia assetMedia, int i, int i2, ImageView imageView) {
            super(1);
            this.f115910h = assetMedia;
            this.f115911i = i;
            this.f115912j = i2;
            this.f115913k = imageView;
        }

        /* renamed from: c */
        public static final void m6880c(C50995wP2 this$0, C29872a listener, AssetMedia media, int i, int i2, ImageView view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(listener, "$listener");
            Intrinsics.checkNotNullParameter(media, "$media");
            Intrinsics.checkNotNullParameter(view, "$view");
            C47971rI4<Drawable> m16089a1 = this$0.f115899a.m81661c().mo16086d(YI4.m75263H0(B41.f1615a)).m16094T0(listener).m16089a1(media.getMediaUrl());
            Intrinsics.checkNotNullExpressionValue(m16089a1, "glide\n          .asDrawa…    .load(media.mediaUrl)");
            if (i > 0 && i2 > 0) {
                m16089a1 = m16089a1.mo16086d(YI4.m75262I0(i, i2));
            }
            m16089a1.m16096R0(view);
        }

        /* renamed from: b */
        public final void m6881b(InterfaceC23470e emitter) {
            Intrinsics.checkNotNullParameter(emitter, "emitter");
            final C29872a c29872a = new C29872a(emitter, this.f115910h);
            Handler handler = C50995wP2.this.f115900b;
            final C50995wP2 c50995wP2 = C50995wP2.this;
            final AssetMedia assetMedia = this.f115910h;
            final int i = this.f115911i;
            final int i2 = this.f115912j;
            final ImageView imageView = this.f115913k;
            handler.post(new Runnable() { // from class: xP2
                @Override // java.lang.Runnable
                public final void run() {
                    C50995wP2.C29871b.m6880c(C50995wP2.this, c29872a, assetMedia, i, i2, imageView);
                }
            });
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC23470e interfaceC23470e) {
            m6881b(interfaceC23470e);
            return Unit.INSTANCE;
        }
    }

    public C50995wP2(UI4 glide, Handler handler, DownloadManager downloadManager, InterfaceC37758a61 downloadClient) {
        Intrinsics.checkNotNullParameter(glide, "glide");
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(downloadManager, "downloadManager");
        Intrinsics.checkNotNullParameter(downloadClient, "downloadClient");
        this.f115899a = glide;
        this.f115900b = handler;
        this.f115901c = downloadManager;
        this.f115902d = downloadClient;
        this.f115903e = new LinkedHashSet();
    }

    /* renamed from: e */
    public static final void m6889e(C50995wP2 this$0, AssetMedia media, InterfaceC5295MT bitmapCache, Object obj, TI4 ti4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(media, "$media");
        Intrinsics.checkNotNullParameter(bitmapCache, "$bitmapCache");
        C47971rI4<Bitmap> mo16086d = this$0.f115899a.m81662b().mo16086d(YI4.m75263H0(B41.f1615a));
        if (ti4 != null) {
            mo16086d.m16107F0(ti4);
        }
        mo16086d.m16089a1(media.getMediaUrl()).m16099O0(new C29870a(this$0, bitmapCache, obj, media.getMediaId()));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040 A[Catch: all -> 0x002a, LOOP:0: B:6:0x001f->B:21:0x0040, LOOP_END, TryCatch #2 {all -> 0x002a, blocks: (B:7:0x0021, B:21:0x0040, B:22:0x0073, B:13:0x0030), top: B:41:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073 A[EDGE_INSN: B:43:0x0073->B:22:0x0073 ?: BREAK  , SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit m6887g(String fileName, ResponseBody responseBody) {
        FileOutputStream fileOutputStream;
        Integer valueOf;
        boolean z;
        Intrinsics.checkNotNullParameter(fileName, "$fileName");
        Intrinsics.checkNotNullParameter(responseBody, "$responseBody");
        InputStream inputStream = null;
        try {
            File file = new File(fileName);
            byte[] bArr = new byte[4096];
            InputStream byteStream = responseBody.byteStream();
            try {
                fileOutputStream = new FileOutputStream(file);
                int i = 0;
                while (true) {
                    if (byteStream != null) {
                        try {
                            valueOf = Integer.valueOf(byteStream.read(bArr));
                        } catch (Throwable th) {
                            th = th;
                            inputStream = byteStream;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            throw th;
                        }
                    } else {
                        valueOf = null;
                    }
                    if (valueOf != null && valueOf.intValue() == -1) {
                        z = false;
                        if (z) {
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            break;
                        }
                        int intValue = valueOf.intValue();
                        fileOutputStream.write(bArr, 0, intValue);
                        i += intValue;
                        C41318g46.m40160d("downloaded " + i + " of " + responseBody.contentLength() + " bytes", new Object[0]);
                        valueOf.intValue();
                    }
                    z = true;
                    if (z) {
                    }
                    if (valueOf != null) {
                    }
                }
                fileOutputStream.flush();
                if (byteStream != null) {
                    byteStream.close();
                }
                fileOutputStream.close();
                return Unit.INSTANCE;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    @Override // p000.InterfaceC48624sP2
    /* renamed from: a */
    public AbstractC23461c mo6893a(AssetMedia media, ImageView view, int i, int i2) {
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(view, "view");
        return C45832nh5.m23311e(new C29871b(media, i, i2, view));
    }

    @Override // p000.InterfaceC48624sP2
    /* renamed from: b */
    public synchronized <K> void mo6892b(final AssetMedia media, final InterfaceC5295MT<K> bitmapCache, final K k, final TI4<Bitmap> ti4) {
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(bitmapCache, "bitmapCache");
        if (!this.f115903e.contains(media.getMediaId()) && !bitmapCache.contains(k) && this.f115900b.post(new Runnable() { // from class: uP2
            @Override // java.lang.Runnable
            public final void run() {
                C50995wP2.m6889e(C50995wP2.this, media, bitmapCache, k, ti4);
            }
        })) {
            this.f115903e.add(media.getMediaId());
        }
    }

    /* renamed from: f */
    public final AbstractC23461c m6888f(final ResponseBody responseBody, final String str) {
        AbstractC23461c m33078H = AbstractC23461c.m33078H(new Callable() { // from class: tP2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Unit m6887g;
                m6887g = C50995wP2.m6887g(str, responseBody);
                return m6887g;
            }
        });
        Intrinsics.checkNotNullExpressionValue(m33078H, "fromCallable {\n    var i…Stream?.close()\n    }\n  }");
        return m33078H;
    }
}

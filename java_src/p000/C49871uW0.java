package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Bundle;
import android.util.LruCache;
import android.widget.ImageView;
import bo.app.C12692h;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.R$string;
import com.appboy.models.cards.Card;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import java.io.File;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 82\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b6\u00107J2\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J2\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J.\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J,\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J$\u0010\u0019\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007J&\u0010\u001c\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001d\u001a\u00020\u0006H\u0007J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001d\u001a\u00020\u0006H\u0007J\u0012\u0010 \u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001d\u001a\u00020\u0006H\u0007J \u0010#\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u0016H\u0007J*\u0010$\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002J \u0010&\u001a\n %*\u0004\u0018\u00010\u00130\u00132\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0013H\u0002J\u0010\u0010'\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J*\u0010(\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010*R#\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130,8G¢\u0006\f\n\u0004\b\u0015\u0010-\u001a\u0004\b.\u0010/R$\u00105\u001a\u00020\u00162\u0006\u00101\u001a\u00020\u00168G@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0018\u00102\u001a\u0004\b3\u00104R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00102¨\u00069"}, m28432d2 = {"LuW0;", "LeO1;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/appboy/models/cards/Card;", "card", "", "imageUrl", "Landroid/widget/ImageView;", "imageView", "Lw20;", "viewBounds", "", "c", "LwO1;", "inAppMessage", C17296a.f69688o, "Landroid/os/Bundle;", "extras", "Landroid/graphics/Bitmap;", "e", "b", "", "isOffline", DateTokenConverter.CONVERTER_KEY, "n", "Landroid/net/Uri;", "imageUri", "j", "key", "k", "m", "l", "bitmap", "skipDiskCache", "r", "t", "kotlin.jvm.PlatformType", "s", "p", "u", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "diskCacheLock", "Landroid/util/LruCache;", "Landroid/util/LruCache;", "o", "()Landroid/util/LruCache;", "memoryCache", "<set-?>", "Z", "q", "()Z", "isDiskCacheStarting", "<init>", "(Landroid/content/Context;)V", "f", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: uW0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C49871uW0 implements InterfaceC40313eO1 {

    /* renamed from: f */
    public static final C29209b f112498f = new C29209b(null);

    /* renamed from: g */
    public static final String f112499g = C43664k20.m29433n(C49871uW0.class);

    /* renamed from: a */
    public final ReentrantLock f112500a;

    /* renamed from: b */
    public final LruCache<String, Bitmap> f112501b;

    /* renamed from: c */
    public C12692h f112502c;

    /* renamed from: d */
    public boolean f112503d;

    /* renamed from: e */
    public boolean f112504e;

    @Metadata(m28433d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0014¨\u0006\b"}, m28432d2 = {"uW0$a", "Landroid/util/LruCache;", "", "Landroid/graphics/Bitmap;", "key", Entry.TYPE_IMAGE, "", C17296a.f69688o, "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: uW0$a */
    /* loaded from: classes2.dex */
    public static final class C29208a extends LruCache<String, Bitmap> {

        /* renamed from: a */
        public final /* synthetic */ int f112505a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29208a(int i) {
            super(i);
            this.f112505a = i;
        }

        @Override // android.util.LruCache
        /* renamed from: a */
        public int sizeOf(String key, Bitmap image) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(image, "image");
            return image.getByteCount();
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087T¢\u0006\f\n\u0004\b\b\u0010\t\u0012\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\t¨\u0006\u0011"}, m28432d2 = {"LuW0$b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "uniqueName", "Ljava/io/File;", C17296a.f69688o, "BRAZE_LRU_CACHE_FOLDER", "Ljava/lang/String;", "getBRAZE_LRU_CACHE_FOLDER$annotations", "()V", "", "DISK_CACHE_SIZE", "I", "TAG", "<init>", "android-sdk-base_release"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: uW0$b */
    /* loaded from: classes2.dex */
    public static final class C29209b {
        public /* synthetic */ C29209b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        /* renamed from: a */
        public final File m10177a(Context context, String uniqueName) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(uniqueName, "uniqueName");
            return new File(context.getCacheDir().getPath() + ((Object) File.separator) + uniqueName);
        }

        private C29209b() {
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: uW0$c */
    /* loaded from: classes2.dex */
    public static final class C29210c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f112506g;

        /* renamed from: h */
        public final /* synthetic */ C49871uW0 f112507h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29210c(String str, C49871uW0 c49871uW0) {
            super(0);
            this.f112506g = str;
            this.f112507h = c49871uW0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Got bitmap from mem cache for key " + this.f112506g + "\nMemory cache stats: " + this.f112507h.m10185o();
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: uW0$d */
    /* loaded from: classes2.dex */
    public static final class C29211d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f112508g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29211d(String str) {
            super(0);
            this.f112508g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Got bitmap from disk cache for key ", this.f112508g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: uW0$e */
    /* loaded from: classes2.dex */
    public static final class C29212e extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f112509g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29212e(String str) {
            super(0);
            this.f112509g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("No cache hit for bitmap: ", this.f112509g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: uW0$f */
    /* loaded from: classes2.dex */
    public static final class C29213f extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f112510g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29213f(String str) {
            super(0);
            this.f112510g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Disk cache still starting. Cannot retrieve key from disk cache: ", this.f112510g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: uW0$g */
    /* loaded from: classes2.dex */
    public static final class C29214g extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f112511g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29214g(String str) {
            super(0);
            this.f112511g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Getting bitmap from disk cache for key: ", this.f112511g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: uW0$h */
    /* loaded from: classes2.dex */
    public static final class C29215h extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C29215h f112512g = new C29215h();

        public C29215h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Cannot retrieve bitmap with blank image url";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: uW0$i */
    /* loaded from: classes2.dex */
    public static final class C29216i extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C29216i f112513g = new C29216i();

        public C29216i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Cache is currently in offline mode. Not downloading bitmap.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: uW0$j */
    /* loaded from: classes2.dex */
    public static final class C29217j extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f112514g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29217j(String str) {
            super(0);
            this.f112514g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to get bitmap from url. Url: ", this.f112514g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "com.braze.images.DefaultBrazeImageLoader$initDiskCacheTask$1", m28418f = "DefaultBrazeImageLoader.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: uW0$k */
    /* loaded from: classes2.dex */
    public static final class C29218k extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f112515h;

        /* renamed from: i */
        public final /* synthetic */ Context f112516i;

        /* renamed from: j */
        public final /* synthetic */ C49871uW0 f112517j;

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: uW0$k$a */
        /* loaded from: classes2.dex */
        public static final class C29219a extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C29219a f112518g = new C29219a();

            public C29219a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Initializing disk cache";
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: uW0$k$b */
        /* loaded from: classes2.dex */
        public static final class C29220b extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C29220b f112519g = new C29220b();

            public C29220b() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Disk cache initialized";
            }
        }

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: uW0$k$c */
        /* loaded from: classes2.dex */
        public static final class C29221c extends Lambda implements Function0<String> {

            /* renamed from: g */
            public static final C29221c f112520g = new C29221c();

            public C29221c() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return "Caught exception creating new disk cache. Unable to create new disk cache";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29218k(Context context, C49871uW0 c49871uW0, Continuation<? super C29218k> continuation) {
            super(2, continuation);
            this.f112516i = context;
            this.f112517j = c49871uW0;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C29218k) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C29218k(this.f112516i, this.f112517j, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f112515h == 0) {
                ResultKt.throwOnFailure(obj);
                File m10177a = C49871uW0.f112498f.m10177a(this.f112516i, "appboy.imageloader.lru.cache");
                ReentrantLock reentrantLock = this.f112517j.f112500a;
                C49871uW0 c49871uW0 = this.f112517j;
                reentrantLock.lock();
                try {
                    try {
                        C43664k20 c43664k20 = C43664k20.f93782a;
                        C43664k20.m29441f(c43664k20, C49871uW0.f112499g, null, null, false, C29219a.f112518g, 14, null);
                        c49871uW0.f112502c = new C12692h(m10177a, 1, 1, 52428800L);
                        C43664k20.m29441f(c43664k20, C49871uW0.f112499g, null, null, false, C29220b.f112519g, 14, null);
                        c49871uW0.f112503d = false;
                    } catch (Exception e) {
                        C43664k20.m29441f(C43664k20.f93782a, C49871uW0.f112499g, C43664k20.EnumC25082a.E, e, false, C29221c.f112520g, 8, null);
                    }
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: uW0$l */
    /* loaded from: classes2.dex */
    public static final class C29222l extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f112521g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29222l(String str) {
            super(0);
            this.f112521g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Adding bitmap to mem cache for key ", this.f112521g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: uW0$m */
    /* loaded from: classes2.dex */
    public static final class C29223m extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f112522g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29223m(String str) {
            super(0);
            this.f112522g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Skipping disk cache for key: ", this.f112522g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: uW0$n */
    /* loaded from: classes2.dex */
    public static final class C29224n extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f112523g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29224n(String str) {
            super(0);
            this.f112523g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Adding bitmap to disk cache for key ", this.f112523g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: uW0$o */
    /* loaded from: classes2.dex */
    public static final class C29225o extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C29225o f112524g = new C29225o();

        public C29225o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Cannot retrieve bitmap with a blank image url";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: uW0$p */
    /* loaded from: classes2.dex */
    public static final class C29226p extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f112525g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29226p(String str) {
            super(0);
            this.f112525g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Failed to render url into view. Url: ", this.f112525g);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
    @DebugMetadata(m28419c = "com.braze.images.DefaultBrazeImageLoader$renderUrlIntoViewTask$1", m28418f = "DefaultBrazeImageLoader.kt", m28417i = {}, m28416l = {249}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
    /* renamed from: uW0$q */
    /* loaded from: classes2.dex */
    public static final class C29227q extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

        /* renamed from: h */
        public int f112526h;

        /* renamed from: j */
        public final /* synthetic */ Context f112528j;

        /* renamed from: k */
        public final /* synthetic */ String f112529k;

        /* renamed from: l */
        public final /* synthetic */ EnumC50778w20 f112530l;

        /* renamed from: m */
        public final /* synthetic */ ImageView f112531m;

        @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
        /* renamed from: uW0$q$a */
        /* loaded from: classes2.dex */
        public static final class C29228a extends Lambda implements Function0<String> {

            /* renamed from: g */
            public final /* synthetic */ String f112532g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29228a(String str) {
                super(0);
                this.f112532g = str;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a */
            public final String invoke() {
                return Intrinsics.stringPlus("Failed to retrieve bitmap from url: ", this.f112532g);
            }
        }

        @Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "", "<anonymous>"}, m28431k = 3, m28430mv = {1, 6, 0})
        @DebugMetadata(m28419c = "com.braze.images.DefaultBrazeImageLoader$renderUrlIntoViewTask$1$2", m28418f = "DefaultBrazeImageLoader.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
        /* renamed from: uW0$q$b */
        /* loaded from: classes2.dex */
        public static final class C29229b extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {

            /* renamed from: h */
            public int f112533h;

            /* renamed from: i */
            public final /* synthetic */ String f112534i;

            /* renamed from: j */
            public final /* synthetic */ ImageView f112535j;

            /* renamed from: k */
            public final /* synthetic */ Bitmap f112536k;

            /* renamed from: l */
            public final /* synthetic */ EnumC50778w20 f112537l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C29229b(String str, ImageView imageView, Bitmap bitmap, EnumC50778w20 enumC50778w20, Continuation<? super C29229b> continuation) {
                super(2, continuation);
                this.f112534i = str;
                this.f112535j = imageView;
                this.f112536k = bitmap;
                this.f112537l = enumC50778w20;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a */
            public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
                return ((C29229b) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C29229b(this.f112534i, this.f112535j, this.f112536k, this.f112537l, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f112533h == 0) {
                    ResultKt.throwOnFailure(obj);
                    String str = this.f112534i;
                    Object tag = this.f112535j.getTag(R$string.com_braze_image_lru_cache_image_url_key);
                    if (tag != null) {
                        if (Intrinsics.areEqual(str, (String) tag)) {
                            this.f112535j.setImageBitmap(this.f112536k);
                            if (this.f112537l == EnumC50778w20.BASE_CARD_VIEW) {
                                C40106e20.m43378n(this.f112536k, this.f112535j);
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29227q(Context context, String str, EnumC50778w20 enumC50778w20, ImageView imageView, Continuation<? super C29227q> continuation) {
            super(2, continuation);
            this.f112528j = context;
            this.f112529k = str;
            this.f112530l = enumC50778w20;
            this.f112531m = imageView;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a */
        public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
            return ((C29227q) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C29227q(this.f112528j, this.f112529k, this.f112530l, this.f112531m, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended;
            coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f112526h;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TrafficStats.setThreadStatsTag(1337);
                Bitmap m10186n = C49871uW0.this.m10186n(this.f112528j, this.f112529k, this.f112530l);
                if (m10186n == null) {
                    C43664k20.m29441f(C43664k20.f93782a, C49871uW0.f112499g, null, null, false, new C29228a(this.f112529k), 14, null);
                } else {
                    AbstractC46765pG2 m84376c = T41.m84376c();
                    C29229b c29229b = new C29229b(this.f112529k, this.f112531m, m10186n, this.f112530l, null);
                    this.f112526h = 1;
                    if (X30.m77504g(m84376c, c29229b, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: uW0$r */
    /* loaded from: classes2.dex */
    public static final class C29230r extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ boolean f112538g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29230r(boolean z) {
            super(0);
            this.f112538g = z;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("DefaultBrazeImageLoader outbound network requests are now ", this.f112538g ? "disabled" : "enabled");
        }
    }

    public C49871uW0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f112500a = new ReentrantLock();
        this.f112503d = true;
        this.f112501b = new C29208a(C40106e20.m43383i());
        m10184p(context);
    }

    @Override // p000.InterfaceC40313eO1
    /* renamed from: a */
    public void mo10199a(Context context, InterfaceC50985wO1 inAppMessage, String imageUrl, ImageView imageView, EnumC50778w20 enumC50778w20) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        m10180t(context, imageUrl, imageView, enumC50778w20);
    }

    @Override // p000.InterfaceC40313eO1
    /* renamed from: b */
    public Bitmap mo10198b(Context context, InterfaceC50985wO1 inAppMessage, String imageUrl, EnumC50778w20 enumC50778w20) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return m10186n(context, imageUrl, enumC50778w20);
    }

    @Override // p000.InterfaceC40313eO1
    /* renamed from: c */
    public void mo10197c(Context context, Card card, String imageUrl, ImageView imageView, EnumC50778w20 enumC50778w20) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        m10180t(context, imageUrl, imageView, enumC50778w20);
    }

    @Override // p000.InterfaceC40313eO1
    /* renamed from: d */
    public void mo10196d(boolean z) {
        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.I, null, false, new C29230r(z), 6, null);
        this.f112504e = z;
    }

    @Override // p000.InterfaceC40313eO1
    /* renamed from: e */
    public Bitmap mo10195e(Context context, Bundle bundle, String imageUrl, EnumC50778w20 enumC50778w20) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return m10186n(context, imageUrl, enumC50778w20);
    }

    /* renamed from: j */
    public final Bitmap m10190j(Context context, Uri imageUri, EnumC50778w20 enumC50778w20) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        if (enumC50778w20 == null) {
            enumC50778w20 = EnumC50778w20.NO_BOUNDS;
        }
        return C40106e20.m43389c(context, imageUri, enumC50778w20);
    }

    /* renamed from: k */
    public final Bitmap m10189k(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        Bitmap bitmap = this.f112501b.get(key);
        if (bitmap == null) {
            Bitmap m10188l = m10188l(key);
            if (m10188l == null) {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C29212e(key), 7, null);
                return null;
            }
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C29211d(key), 6, null);
            m10181s(key, m10188l);
            return m10188l;
        }
        C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C29210c(key, this), 6, null);
        return bitmap;
    }

    /* renamed from: l */
    public final Bitmap m10188l(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ReentrantLock reentrantLock = this.f112500a;
        reentrantLock.lock();
        try {
            C12692h c12692h = null;
            if (m10183q()) {
                C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C29213f(key), 6, null);
            } else {
                C12692h c12692h2 = this.f112502c;
                if (c12692h2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                    c12692h2 = null;
                }
                if (c12692h2.m63660a(key)) {
                    C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.V, null, false, new C29214g(key), 6, null);
                    C12692h c12692h3 = this.f112502c;
                    if (c12692h3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                    } else {
                        c12692h = c12692h3;
                    }
                    return c12692h.m63658b(key);
                }
            }
            Unit unit = Unit.INSTANCE;
            return null;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: m */
    public final Bitmap m10187m(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f112501b.get(key);
    }

    /* renamed from: n */
    public final Bitmap m10186n(Context context, String imageUrl, EnumC50778w20 enumC50778w20) {
        boolean isBlank;
        Bitmap m10189k;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        isBlank = StringsKt__StringsJVMKt.isBlank(imageUrl);
        if (isBlank) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C29215h.f112512g, 7, null);
            return null;
        }
        try {
            m10189k = m10189k(imageUrl);
        } catch (Throwable th) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, th, false, new C29217j(imageUrl), 4, null);
        }
        if (m10189k == null) {
            if (this.f112504e) {
                C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C29216i.f112513g, 7, null);
            } else {
                Uri imageUri = Uri.parse(imageUrl);
                Intrinsics.checkNotNullExpressionValue(imageUri, "imageUri");
                Bitmap m10190j = m10190j(context, imageUri, enumC50778w20);
                if (m10190j != null) {
                    m10182r(imageUrl, m10190j, C38903c20.m62017e(imageUri));
                    return m10190j;
                }
            }
            return null;
        }
        return m10189k;
    }

    /* renamed from: o */
    public final LruCache<String, Bitmap> m10185o() {
        return this.f112501b;
    }

    /* renamed from: p */
    public final void m10184p(Context context) {
        Z30.m73800d(Z10.f47750b, null, null, new C29218k(context, this, null), 3, null);
    }

    /* renamed from: q */
    public final boolean m10183q() {
        return this.f112503d;
    }

    /* renamed from: r */
    public final void m10182r(String key, Bitmap bitmap, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        if (m10187m(key) == null) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C29222l(key), 7, null);
            this.f112501b.put(key, bitmap);
        }
        if (z) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C29223m(key), 7, null);
            return;
        }
        ReentrantLock reentrantLock = this.f112500a;
        reentrantLock.lock();
        try {
            if (!m10183q()) {
                C12692h c12692h = this.f112502c;
                C12692h c12692h2 = null;
                if (c12692h == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                    c12692h = null;
                }
                if (!c12692h.m63660a(key)) {
                    C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, new C29224n(key), 7, null);
                    C12692h c12692h3 = this.f112502c;
                    if (c12692h3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("diskLruCache");
                    } else {
                        c12692h2 = c12692h3;
                    }
                    c12692h2.m63659a(key, bitmap);
                }
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: s */
    public final Bitmap m10181s(String str, Bitmap bitmap) {
        return this.f112501b.put(str, bitmap);
    }

    /* renamed from: t */
    public final void m10180t(Context context, String str, ImageView imageView, EnumC50778w20 enumC50778w20) {
        boolean isBlank;
        isBlank = StringsKt__StringsJVMKt.isBlank(str);
        if (isBlank) {
            C43664k20.m29442e(C43664k20.f93782a, this, null, null, false, C29225o.f112524g, 7, null);
            return;
        }
        try {
            m10179u(context, imageView, enumC50778w20, str);
        } catch (Throwable th) {
            C43664k20.m29442e(C43664k20.f93782a, this, C43664k20.EnumC25082a.E, th, false, new C29226p(str), 4, null);
        }
    }

    /* renamed from: u */
    public final void m10179u(Context context, ImageView imageView, EnumC50778w20 enumC50778w20, String str) {
        imageView.setTag(R$string.com_braze_image_lru_cache_image_url_key, str);
        Z30.m73800d(Z10.f47750b, null, null, new C29227q(context, str, enumC50778w20, imageView, null), 3, null);
    }
}

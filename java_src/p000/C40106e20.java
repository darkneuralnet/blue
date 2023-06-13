package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.ImageView;
import bo.app.C12986o6;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.appboy.Appboy;
import com.facebook.share.internal.C17296a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p000.C43664k20;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u0016\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002\u001a\u0018\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n\u001a\u0014\u0010\u000e\u001a\u00020\f*\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b\u001a\u0006\u0010\u000f\u001a\u00020\u0002\u001a\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0007\u001a \u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0007\u001a\"\u0010\u001c\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u001a \u0010\u001d\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002\u001a\"\u0010\u001e\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0002\u001a,\u0010 \u001a\u0004\u0018\u00010\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001f\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0002\u001a\u0010\u0010\"\u001a\u00020!2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a$\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020#2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u001a\u001c\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020#2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\"\u0014\u0010(\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010'¨\u0006)"}, m28432d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "h", "e", "dpi", "dp", "k", "Landroid/graphics/Bitmap;", "bitmap", "Landroid/widget/ImageView;", "imageView", "", "n", "o", "i", "Ljava/io/InputStream;", "inputStream", "Landroid/graphics/BitmapFactory$Options;", DateTokenConverter.CONVERTER_KEY, "options", "destinationWidth", "destinationHeight", C17296a.f69688o, "Landroid/net/Uri;", "uri", "Lw20;", "viewBounds", "c", "j", "l", "imageMetadata", "b", "Landroid/util/DisplayMetrics;", "m", "Lkotlin/Pair;", "f", "g", "", "Ljava/lang/String;", "TAG", "android-sdk-base_release"}, m28431k = 2, m28430mv = {1, 6, 0})
/* renamed from: e20  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C40106e20 {

    /* renamed from: a */
    public static final String f77561a = C43664k20.f93782a.m29432o("BrazeImageUtils");

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: e20$a */
    /* loaded from: classes2.dex */
    public static final class C19928a extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C19928a f77562g = new C19928a();

        public C19928a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Not sampling on 0 destination width or height";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: e20$b */
    /* loaded from: classes2.dex */
    public static final class C19929b extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ BitmapFactory.Options f77563g;

        /* renamed from: h */
        public final /* synthetic */ int f77564h;

        /* renamed from: i */
        public final /* synthetic */ int f77565i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19929b(BitmapFactory.Options options, int i, int i2) {
            super(0);
            this.f77563g = options;
            this.f77564h = i;
            this.f77565i = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Calculating sample size for source image bounds: (width " + this.f77563g.outWidth + " height " + this.f77563g.outHeight + ") and destination image bounds: (width " + this.f77564h + " height " + this.f77565i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: e20$c */
    /* loaded from: classes2.dex */
    public static final class C19930c extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Ref.IntRef f77566g;

        /* renamed from: h */
        public final /* synthetic */ int f77567h;

        /* renamed from: i */
        public final /* synthetic */ int f77568i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19930c(Ref.IntRef intRef, int i, int i2) {
            super(0);
            this.f77566g = intRef;
            this.f77567h = i;
            this.f77568i = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Using image sample size of " + this.f77566g.element + ". Image will be scaled to width: " + (this.f77567h / this.f77566g.element) + " and height: " + (this.f77568i / this.f77566g.element);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: e20$d */
    /* loaded from: classes2.dex */
    public static final class C19931d extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Uri f77569g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19931d(Uri uri) {
            super(0);
            this.f77569g = uri;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Uri with unknown scheme received. Not getting image. Uri: ", this.f77569g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: e20$e */
    /* loaded from: classes2.dex */
    public static final class C19932e extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Uri f77570g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19932e(Uri uri) {
            super(0);
            this.f77570g = uri;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Local bitmap path is null. URI: ", this.f77570g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: e20$f */
    /* loaded from: classes2.dex */
    public static final class C19933f extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Uri f77571g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19933f(Uri uri) {
            super(0);
            this.f77571g = uri;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Local bitmap file does not exist. URI: ", this.f77571g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: e20$g */
    /* loaded from: classes2.dex */
    public static final class C19934g extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ File f77572g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19934g(File file) {
            super(0);
            this.f77572g = file;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Retrieving image from local path: ", this.f77572g.getAbsolutePath());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: e20$h */
    /* loaded from: classes2.dex */
    public static final class C19935h extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C19935h f77573g = new C19935h();

        public C19935h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Destination bounds unset. Loading entire bitmap into memory.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: e20$i */
    /* loaded from: classes2.dex */
    public static final class C19936i extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ int f77574g;

        /* renamed from: h */
        public final /* synthetic */ int f77575h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19936i(int i, int i2) {
            super(0);
            this.f77574g = i;
            this.f77575h = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Sampling bitmap with destination image bounds: (height " + this.f77574g + " width " + this.f77575h + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: e20$j */
    /* loaded from: classes2.dex */
    public static final class C19937j extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Uri f77576g;

        /* renamed from: h */
        public final /* synthetic */ BitmapFactory.Options f77577h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19937j(Uri uri, BitmapFactory.Options options) {
            super(0);
            this.f77576g = uri;
            this.f77577h = options;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "The bitmap metadata with image uri " + this.f77576g + " had bounds: (height " + this.f77577h.outHeight + " width " + this.f77577h.outWidth + "). Returning a bitmap with no sampling.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: e20$k */
    /* loaded from: classes2.dex */
    public static final class C19938k extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C19938k f77578g = new C19938k();

        public C19938k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Decoding sampled bitmap";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: e20$l */
    /* loaded from: classes2.dex */
    public static final class C19939l extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ Exception f77579g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19939l(Exception exc) {
            super(0);
            this.f77579g = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Exception occurred when attempting to retrieve local bitmap. ", this.f77579g.getMessage());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: e20$m */
    /* loaded from: classes2.dex */
    public static final class C19940m extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C19940m f77580g = new C19940m();

        public C19940m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "IOException during closing of bitmap metadata image stream.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: e20$n */
    /* loaded from: classes2.dex */
    public static final class C19941n extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f77581g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19941n(String str) {
            super(0);
            this.f77581g = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("SDK is in offline mode, not downloading remote bitmap with uri: ", this.f77581g);
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: e20$o */
    /* loaded from: classes2.dex */
    public static final class C19942o extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ int f77582g;

        /* renamed from: h */
        public final /* synthetic */ URL f77583h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19942o(int i, URL url) {
            super(0);
            this.f77582g = i;
            this.f77583h = url;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "HTTP response code was " + this.f77582g + ". Bitmap with url " + this.f77583h + " could not be downloaded.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: e20$p */
    /* loaded from: classes2.dex */
    public static final class C19943p extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ int f77584g;

        /* renamed from: h */
        public final /* synthetic */ int f77585h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19943p(int i, int i2) {
            super(0);
            this.f77584g = i;
            this.f77585h = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Sampling bitmap with destination image bounds: (height " + this.f77584g + " width " + this.f77585h + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: e20$q */
    /* loaded from: classes2.dex */
    public static final class C19944q extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ URL f77586g;

        /* renamed from: h */
        public final /* synthetic */ BitmapFactory.Options f77587h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19944q(URL url, BitmapFactory.Options options) {
            super(0);
            this.f77586g = url;
            this.f77587h = options;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "The bitmap metadata with image url " + this.f77586g + " had bounds: (height " + this.f77587h.outHeight + " width " + this.f77587h.outWidth + "). Returning a bitmap with no sampling.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: e20$r */
    /* loaded from: classes2.dex */
    public static final class C19945r extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ String f77588g;

        /* renamed from: h */
        public final /* synthetic */ Exception f77589h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19945r(String str, Exception exc) {
            super(0);
            this.f77588g = str;
            this.f77589h = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Exception in image bitmap download for Uri: " + this.f77588g + ' ' + ((Object) this.f77589h.getMessage());
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: e20$s */
    /* loaded from: classes2.dex */
    public static final class C19946s extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C19946s f77590g = new C19946s();

        public C19946s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "IOException during closing of bitmap metadata download stream.";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: e20$t */
    /* loaded from: classes2.dex */
    public static final class C19947t extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C19947t f77591g = new C19947t();

        public C19947t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Neither source bitmap nor ImageView may be null. Not resizing ImageView";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: e20$u */
    /* loaded from: classes2.dex */
    public static final class C19948u extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C19948u f77592g = new C19948u();

        public C19948u() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "Bitmap dimensions cannot be 0. Not resizing ImageView";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: e20$v */
    /* loaded from: classes2.dex */
    public static final class C19949v extends Lambda implements Function0<String> {

        /* renamed from: g */
        public static final C19949v f77593g = new C19949v();

        public C19949v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return "ImageView dimensions cannot be 0. Not resizing ImageView";
        }
    }

    @Metadata(m28434bv = {}, m28433d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"", C17296a.f69688o, "()Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 6, 0})
    /* renamed from: e20$w */
    /* loaded from: classes2.dex */
    public static final class C19950w extends Lambda implements Function0<String> {

        /* renamed from: g */
        public final /* synthetic */ float f77594g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C19950w(float f) {
            super(0);
            this.f77594g = f;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final String invoke() {
            return Intrinsics.stringPlus("Resizing ImageView to aspect ratio: ", Float.valueOf(this.f77594g));
        }
    }

    /* renamed from: a */
    public static final int m43391a(BitmapFactory.Options options, int i, int i2) {
        Intrinsics.checkNotNullParameter(options, "options");
        if (i2 != 0 && i != 0) {
            int i3 = options.outHeight;
            int i4 = options.outWidth;
            C43664k20.m29441f(C43664k20.f93782a, f77561a, null, null, false, new C19929b(options, i, i2), 14, null);
            Ref.IntRef intRef = new Ref.IntRef();
            intRef.element = 1;
            if (i3 > i2 || i4 > i) {
                int i5 = i3 / 2;
                int i6 = i4 / 2;
                while (true) {
                    int i7 = intRef.element;
                    if (i5 / i7 < i2 || i6 / i7 < i) {
                        break;
                    }
                    intRef.element = i7 * 2;
                }
            }
            C43664k20.m29441f(C43664k20.f93782a, f77561a, null, null, false, new C19930c(intRef, i4, i3), 14, null);
            return intRef.element;
        }
        C43664k20.m29441f(C43664k20.f93782a, f77561a, null, null, false, C19928a.f77562g, 14, null);
        return 1;
    }

    /* renamed from: b */
    public static final Bitmap m43390b(InputStream inputStream, BitmapFactory.Options options, int i, int i2) {
        options.inSampleSize = m43391a(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    /* renamed from: c */
    public static final Bitmap m43389c(Context context, Uri uri, EnumC50778w20 viewBounds) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(viewBounds, "viewBounds");
        Pair<Integer, Integer> m43386f = m43386f(context, viewBounds);
        int intValue = m43386f.component1().intValue();
        int intValue2 = m43386f.component2().intValue();
        if (C38903c20.m62017e(uri)) {
            return m43382j(uri, intValue2, intValue);
        }
        if (C38903c20.m62016f(uri)) {
            return m43380l(uri, intValue2, intValue);
        }
        C43664k20.m29441f(C43664k20.f93782a, f77561a, C43664k20.EnumC25082a.W, null, false, new C19931d(uri), 12, null);
        return null;
    }

    /* renamed from: d */
    public static final BitmapFactory.Options m43388d(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, null, options);
        return options;
    }

    /* renamed from: e */
    public static final int m43387e(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getConfiguration().densityDpi;
    }

    /* renamed from: f */
    public static final Pair<Integer, Integer> m43386f(Context context, EnumC50778w20 enumC50778w20) {
        Pair<Integer, Integer> m43385g = m43385g(context);
        int intValue = m43385g.component1().intValue();
        int intValue2 = m43385g.component2().intValue();
        if (EnumC50778w20.NO_BOUNDS == enumC50778w20) {
            return new Pair<>(Integer.valueOf(intValue), Integer.valueOf(intValue2));
        }
        int m43387e = m43387e(context);
        return new Pair<>(Integer.valueOf(Math.min(intValue, m43381k(m43387e, enumC50778w20.m7548b()))), Integer.valueOf(Math.min(intValue2, m43381k(m43387e, enumC50778w20.m7547c()))));
    }

    /* renamed from: g */
    public static final Pair<Integer, Integer> m43385g(Context context) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        Object systemService = context.getSystemService("window");
        if (systemService != null) {
            WindowManager windowManager = (WindowManager) systemService;
            if (Build.VERSION.SDK_INT >= 30) {
                currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                bounds = currentWindowMetrics.getBounds();
                Intrinsics.checkNotNullExpressionValue(bounds, "windowManager.currentWindowMetrics.bounds");
                return new Pair<>(Integer.valueOf(bounds.height()), Integer.valueOf(bounds.width()));
            }
            DisplayMetrics m43379m = m43379m(context);
            return new Pair<>(Integer.valueOf(m43379m.heightPixels), Integer.valueOf(m43379m.widthPixels));
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    /* renamed from: h */
    public static final int m43384h(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return m43385g(context).getSecond().intValue();
    }

    /* renamed from: i */
    public static final int m43383i() {
        return Math.max(1024, Math.min((int) Math.min(Runtime.getRuntime().maxMemory() / 8, 2147483647L), 33554432));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:26|27|(5:32|33|34|35|36)|40|33|34|35|36) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d9, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00da, code lost:
        p000.C43664k20.m29441f(p000.C43664k20.f93782a, p000.C40106e20.f77561a, p000.C43664k20.EnumC25082a.E, r0, false, p000.C40106e20.C19940m.f77580g, 8, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e A[Catch: all -> 0x0117, Exception -> 0x0119, TryCatch #9 {Exception -> 0x0119, all -> 0x0117, blocks: (B:3:0x000c, B:5:0x0012, B:11:0x001e, B:13:0x0031, B:15:0x003c, B:17:0x004f, B:21:0x006f, B:47:0x0103), top: B:81:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031 A[Catch: all -> 0x0117, Exception -> 0x0119, TryCatch #9 {Exception -> 0x0119, all -> 0x0117, blocks: (B:3:0x000c, B:5:0x0012, B:11:0x001e, B:13:0x0031, B:15:0x003c, B:17:0x004f, B:21:0x006f, B:47:0x0103), top: B:81:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0151 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Bitmap m43382j(Uri uri, int i, int i2) {
        Exception exc;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        Throwable th;
        boolean z;
        BitmapFactory.Options m43388d;
        FileInputStream fileInputStream3;
        Bitmap decodeFile;
        Intrinsics.checkNotNullParameter(uri, "uri");
        FileInputStream fileInputStream4 = null;
        try {
            String path = uri.getPath();
            if (path != null && path.length() != 0) {
                z = false;
                if (!z) {
                    C43664k20.m29441f(C43664k20.f93782a, f77561a, null, null, false, new C19932e(uri), 14, null);
                    return null;
                }
                File file = new File(path);
                if (!file.exists()) {
                    C43664k20.m29441f(C43664k20.f93782a, f77561a, null, null, false, new C19933f(uri), 14, null);
                    return null;
                }
                C43664k20 c43664k20 = C43664k20.f93782a;
                String str = f77561a;
                C43664k20.m29441f(c43664k20, str, C43664k20.EnumC25082a.I, null, false, new C19934g(file), 12, null);
                if (i > 0 && i2 > 0) {
                    fileInputStream2 = new FileInputStream(file);
                    try {
                        C43664k20.m29441f(c43664k20, str, null, null, false, new C19936i(i2, i), 14, null);
                        m43388d = m43388d(fileInputStream2);
                        fileInputStream2.close();
                        fileInputStream3 = new FileInputStream(file);
                    } catch (Exception e) {
                        fileInputStream = fileInputStream2;
                        exc = e;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    try {
                        if (m43388d.outHeight != 0 && m43388d.outWidth != 0) {
                            C43664k20.m29441f(c43664k20, str, null, null, false, C19938k.f77578g, 14, null);
                            decodeFile = m43390b(fileInputStream3, m43388d, i, i2);
                            Bitmap bitmap = decodeFile;
                            fileInputStream3.close();
                            return bitmap;
                        }
                        C43664k20.m29441f(c43664k20, str, C43664k20.EnumC25082a.W, null, false, new C19937j(uri, m43388d), 12, null);
                        decodeFile = BitmapFactory.decodeFile(file.getAbsolutePath());
                        Bitmap bitmap2 = decodeFile;
                        fileInputStream3.close();
                        return bitmap2;
                    } catch (Exception e2) {
                        exc = e2;
                        fileInputStream = fileInputStream3;
                        try {
                            C43664k20.m29441f(C43664k20.f93782a, f77561a, C43664k20.EnumC25082a.E, exc, false, new C19939l(exc), 8, null);
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e3) {
                                    C43664k20.m29441f(C43664k20.f93782a, f77561a, C43664k20.EnumC25082a.E, e3, false, C19940m.f77580g, 8, null);
                                }
                            }
                            return null;
                        } catch (Throwable th3) {
                            th = th3;
                            fileInputStream4 = fileInputStream;
                            th = th;
                            fileInputStream2 = fileInputStream4;
                            if (fileInputStream2 != null) {
                                try {
                                    fileInputStream2.close();
                                } catch (IOException e4) {
                                    C43664k20.m29441f(C43664k20.f93782a, f77561a, C43664k20.EnumC25082a.E, e4, false, C19940m.f77580g, 8, null);
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        fileInputStream2 = fileInputStream3;
                        if (fileInputStream2 != null) {
                        }
                        throw th;
                    }
                }
                C43664k20.m29441f(c43664k20, str, null, null, false, C19935h.f77573g, 14, null);
                return BitmapFactory.decodeFile(file.getAbsolutePath());
            }
            z = true;
            if (!z) {
            }
        } catch (Exception e5) {
            exc = e5;
            fileInputStream = null;
        } catch (Throwable th5) {
            th = th5;
            th = th;
            fileInputStream2 = fileInputStream4;
            if (fileInputStream2 != null) {
            }
            throw th;
        }
    }

    /* renamed from: k */
    public static final int m43381k(int i, int i2) {
        return Math.abs((i * i2) / SyslogConstants.LOG_LOCAL4);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0121 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Bitmap m43380l(Uri uri, int i, int i2) {
        Throwable th;
        InputStream inputStream;
        HttpURLConnection httpURLConnection;
        Exception exc;
        Bitmap decodeStream;
        TrafficStats.setThreadStatsTag(1337);
        String uri2 = uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri2, "uri.toString()");
        HttpURLConnection httpURLConnection2 = null;
        try {
            if (Appboy.getOutboundNetworkRequestsOffline()) {
                C43664k20.m29441f(C43664k20.f93782a, f77561a, C43664k20.EnumC25082a.I, null, false, new C19941n(uri2), 12, null);
                return null;
            }
            try {
                URL url = new URL(uri2);
                C12986o6 c12986o6 = C12986o6.f59033a;
                httpURLConnection = c12986o6.m63194a(url);
                try {
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        C43664k20.m29441f(C43664k20.f93782a, f77561a, C43664k20.EnumC25082a.W, null, false, new C19942o(responseCode, url), 12, null);
                        httpURLConnection.disconnect();
                        return null;
                    }
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        if (i != 0 && i2 != 0) {
                            C43664k20 c43664k20 = C43664k20.f93782a;
                            String str = f77561a;
                            C43664k20.m29441f(c43664k20, str, null, null, false, new C19943p(i2, i), 14, null);
                            BitmapFactory.Options m43388d = m43388d(inputStream);
                            httpURLConnection.disconnect();
                            httpURLConnection = c12986o6.m63194a(url);
                            inputStream = httpURLConnection.getInputStream();
                            if (m43388d.outHeight != 0 && m43388d.outWidth != 0) {
                                decodeStream = m43390b(inputStream, m43388d, i, i2);
                            }
                            C43664k20.m29441f(c43664k20, str, C43664k20.EnumC25082a.W, null, false, new C19944q(url, m43388d), 12, null);
                            decodeStream = BitmapFactory.decodeStream(inputStream);
                        } else {
                            decodeStream = BitmapFactory.decodeStream(inputStream);
                        }
                        Bitmap bitmap = decodeStream;
                        httpURLConnection.disconnect();
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e) {
                                C43664k20.m29441f(C43664k20.f93782a, f77561a, C43664k20.EnumC25082a.E, e, false, C19946s.f77590g, 8, null);
                            }
                        }
                        return bitmap;
                    } catch (Exception e2) {
                        exc = e2;
                        C43664k20.m29441f(C43664k20.f93782a, f77561a, C43664k20.EnumC25082a.E, exc, false, new C19945r(uri2, exc), 8, null);
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e3) {
                                C43664k20.m29441f(C43664k20.f93782a, f77561a, C43664k20.EnumC25082a.E, e3, false, C19946s.f77590g, 8, null);
                            }
                        }
                        return null;
                    }
                } catch (Exception e4) {
                    exc = e4;
                    inputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = null;
                    httpURLConnection2 = httpURLConnection;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e5) {
                            C43664k20.m29441f(C43664k20.f93782a, f77561a, C43664k20.EnumC25082a.E, e5, false, C19946s.f77590g, 8, null);
                        }
                    }
                    throw th;
                }
            } catch (Exception e6) {
                exc = e6;
                httpURLConnection = null;
                inputStream = null;
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
                if (httpURLConnection2 != null) {
                }
                if (inputStream != null) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* renamed from: m */
    public static final DisplayMetrics m43379m(Context context) {
        Object systemService = context.getSystemService("window");
        if (systemService != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    /* renamed from: n */
    public static final void m43378n(Bitmap bitmap, ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        m43377o(imageView, bitmap);
    }

    /* renamed from: o */
    public static final void m43377o(ImageView imageView, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (bitmap == null) {
            C43664k20.m29441f(C43664k20.f93782a, f77561a, C43664k20.EnumC25082a.W, null, false, C19947t.f77591g, 12, null);
        } else if (bitmap.getWidth() != 0 && bitmap.getHeight() != 0) {
            if (imageView.getWidth() != 0 && imageView.getHeight() != 0) {
                float width = bitmap.getWidth() / bitmap.getHeight();
                C43664k20.m29441f(C43664k20.f93782a, f77561a, null, null, false, new C19950w(width), 14, null);
                imageView.getLayoutParams().height = (int) (imageView.getWidth() / width);
                return;
            }
            C43664k20.m29441f(C43664k20.f93782a, f77561a, C43664k20.EnumC25082a.W, null, false, C19949v.f77593g, 12, null);
        } else {
            C43664k20.m29441f(C43664k20.f93782a, f77561a, C43664k20.EnumC25082a.W, null, false, C19948u.f77592g, 12, null);
        }
    }
}

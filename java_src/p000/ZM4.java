package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.content.res.loader.ResourcesLoader;
import android.graphics.Movie;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import java.io.InputStream;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010a\u001a\u00020\u0001\u0012\u0006\u0010h\u001a\u00020g\u0012\u0006\u0010j\u001a\u00020i¢\u0006\u0004\bk\u0010lJ$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0006H\u0016J+\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00062\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0016J7\u0010\u0013\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0016\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\n\"\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\n2\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\n2\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\b\u001a\u00020\u0006H\u0017J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010!\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\"\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J \u0010%\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0006H\u0016J\u0010\u0010'\u001a\u00020&2\u0006\u0010\b\u001a\u00020\u0006H\u0017J\u001e\u0010'\u001a\u00020&2\u0006\u0010\b\u001a\u00020\u00062\f\u0010)\u001a\b\u0018\u00010(R\u00020\u0001H\u0017J\u001a\u0010+\u001a\u0004\u0018\u00010&2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006H\u0017J(\u0010+\u001a\u0004\u0018\u00010&2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\f\u0010)\u001a\b\u0018\u00010(R\u00020\u0001H\u0017J\u0010\u0010-\u001a\u00020,2\u0006\u0010\b\u001a\u00020\u0006H\u0017J\u0010\u0010.\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0017J\u001e\u0010.\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\f\u0010)\u001a\b\u0018\u00010(R\u00020\u0001H\u0017J\u0010\u00100\u001a\u00020/2\u0006\u0010\b\u001a\u00020\u0006H\u0017J\u001e\u00100\u001a\u00020/2\u0006\u0010\b\u001a\u00020\u00062\f\u0010)\u001a\b\u0018\u00010(R\u00020\u0001H\u0017J\u0010\u00102\u001a\u0002012\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u00103\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u00104\u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\u0006H\u0017J\u0010\u00106\u001a\u0002052\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u00107\u001a\u0002052\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u00108\u001a\u0002052\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010:\u001a\u0002092\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u001a\u0010:\u001a\u0002092\u0006\u0010\b\u001a\u00020\u00062\b\u0010<\u001a\u0004\u0018\u00010;H\u0016J\u0010\u0010>\u001a\u00020=2\u0006\u0010\b\u001a\u00020\u0006H\u0016J\"\u0010B\u001a\u00020A2\u0006\u0010\b\u001a\u00020\u00062\b\u0010?\u001a\u0004\u0018\u00010;2\u0006\u0010@\u001a\u000201H\u0016J$\u0010B\u001a\u00020A2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010?\u001a\u0004\u0018\u00010;2\u0006\u0010@\u001a\u000201H\u0016J*\u0010C\u001a\u00020A2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u00062\b\u0010?\u001a\u0004\u0018\u00010;2\u0006\u0010@\u001a\u000201H\u0016J\u001c\u0010G\u001a\u00020\u001d2\b\u0010E\u001a\u0004\u0018\u00010D2\b\u0010F\u001a\u0004\u0018\u00010\u001bH\u0016J\u001c\u0010L\u001a\u00020A2\b\u0010I\u001a\u0004\u0018\u00010H2\b\u0010K\u001a\u0004\u0018\u00010JH\u0017J\b\u0010M\u001a\u00020JH\u0016J\b\u0010N\u001a\u00020HH\u0016J\u0010\u0010P\u001a\u00020\u00022\u0006\u0010O\u001a\u00020\u0006H\u0016J\u0010\u0010Q\u001a\u00020\u00022\u0006\u0010O\u001a\u00020\u0006H\u0016J\u0010\u0010R\u001a\u00020\u00022\u0006\u0010O\u001a\u00020\u0006H\u0016J\u0010\u0010S\u001a\u00020\u00022\u0006\u0010O\u001a\u00020\u0006H\u0016J\u001c\u0010W\u001a\u00020A2\b\u0010T\u001a\u0004\u0018\u0001052\b\u0010V\u001a\u0004\u0018\u00010UH\u0016J&\u0010Y\u001a\u00020A2\b\u0010X\u001a\u0004\u0018\u00010\u00022\b\u0010F\u001a\u0004\u0018\u00010D2\b\u0010V\u001a\u0004\u0018\u00010UH\u0016J'\u0010\\\u001a\u00020A2\u0016\u0010[\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010Z0\n\"\u0004\u0018\u00010ZH\u0017¢\u0006\u0004\b\\\u0010]J'\u0010^\u001a\u00020A2\u0016\u0010[\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010Z0\n\"\u0004\u0018\u00010ZH\u0017¢\u0006\u0004\b^\u0010]R\u0014\u0010a\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u001b\u0010f\u001a\u00020b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\bc\u0010e¨\u0006m"}, m28432d2 = {"LZM4;", "Landroid/content/res/Resources;", "", "name", "defType", "defPackage", "", "getIdentifier", "id", "getString", "", "", "formatArgs", "(I[Ljava/lang/Object;)Ljava/lang/String;", "", "getText", "def", "quantity", "getQuantityText", "getQuantityString", "(II[Ljava/lang/Object;)Ljava/lang/String;", "getStringArray", "(I)[Ljava/lang/String;", "getTextArray", "(I)[Ljava/lang/CharSequence;", "Landroid/graphics/Typeface;", "getFont", "", "getIntArray", "Landroid/content/res/TypedArray;", "obtainTypedArray", "", "getDimension", "getDimensionPixelOffset", "getDimensionPixelSize", "base", "pbase", "getFraction", "Landroid/graphics/drawable/Drawable;", "getDrawable", "Landroid/content/res/Resources$Theme;", "theme", "density", "getDrawableForDensity", "Landroid/graphics/Movie;", "getMovie", "getColor", "Landroid/content/res/ColorStateList;", "getColorStateList", "", "getBoolean", "getInteger", "getFloat", "Landroid/content/res/XmlResourceParser;", "getLayout", "getAnimation", "getXml", "Ljava/io/InputStream;", "openRawResource", "Landroid/util/TypedValue;", "value", "Landroid/content/res/AssetFileDescriptor;", "openRawResourceFd", "outValue", "resolveRefs", "", "getValue", "getValueForDensity", "Landroid/util/AttributeSet;", "set", "attrs", "obtainAttributes", "Landroid/content/res/Configuration;", "config", "Landroid/util/DisplayMetrics;", "metrics", "updateConfiguration", "getDisplayMetrics", "getConfiguration", "resid", "getResourceName", "getResourcePackageName", "getResourceTypeName", "getResourceEntryName", "parser", "Landroid/os/Bundle;", "outBundle", "parseBundleExtras", "tagName", "parseBundleExtra", "Landroid/content/res/loader/ResourcesLoader;", "loaders", "addLoaders", "([Landroid/content/res/loader/ResourcesLoader;)V", "removeLoaders", C17296a.f69688o, "Landroid/content/res/Resources;", "baseResources", "LyM4;", "b", "Lkotlin/Lazy;", "()LyM4;", "resourcesDelegate", "LbS5;", "stringRepository", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/res/Resources;LbS5;Landroid/content/Context;)V", "restring_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: ZM4 */
/* loaded from: classes7.dex */
public final class ZM4 extends Resources {

    /* renamed from: a */
    public final Resources f48392a;

    /* renamed from: b */
    public final Lazy f48393b;

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"LyM4;", "b", "()LyM4;"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: ZM4$a */
    /* loaded from: classes7.dex */
    public static final class C10243a extends Lambda implements Function0<C52156yM4> {

        /* renamed from: g */
        public final /* synthetic */ Context f48394g;

        /* renamed from: h */
        public final /* synthetic */ ZM4 f48395h;

        /* renamed from: i */
        public final /* synthetic */ InterfaceC38557bS5 f48396i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10243a(Context context, ZM4 zm4, InterfaceC38557bS5 interfaceC38557bS5) {
            super(0);
            this.f48394g = context;
            this.f48395h = zm4;
            this.f48396i = interfaceC38557bS5;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final C52156yM4 invoke() {
            Context applicationContext = this.f48394g.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
            return new C52156yM4(applicationContext, this.f48395h.f48392a, this.f48396i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZM4(Resources baseResources, InterfaceC38557bS5 stringRepository, Context context) {
        super(baseResources.getAssets(), baseResources.getDisplayMetrics(), baseResources.getConfiguration());
        Lazy lazy;
        Intrinsics.checkNotNullParameter(baseResources, "baseResources");
        Intrinsics.checkNotNullParameter(stringRepository, "stringRepository");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f48392a = baseResources;
        lazy = LazyKt__LazyJVMKt.lazy(new C10243a(context, this, stringRepository));
        this.f48393b = lazy;
    }

    @Override // android.content.res.Resources
    public void addLoaders(ResourcesLoader... loaders) {
        Intrinsics.checkNotNullParameter(loaders, "loaders");
        this.f48392a.addLoaders((ResourcesLoader[]) Arrays.copyOf(loaders, loaders.length));
    }

    /* renamed from: b */
    public final C52156yM4 m73237b() {
        return (C52156yM4) this.f48393b.getValue();
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i) {
        XmlResourceParser animation = this.f48392a.getAnimation(i);
        Intrinsics.checkNotNullExpressionValue(animation, "baseResources.getAnimation(id)");
        return animation;
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i) {
        return this.f48392a.getBoolean(i);
    }

    @Override // android.content.res.Resources
    @Deprecated(message = "Deprecated in Java")
    public int getColor(int i) {
        return this.f48392a.getColor(i);
    }

    @Override // android.content.res.Resources
    @Deprecated(message = "Deprecated in Java")
    @SuppressLint({"UseCompatLoadingForColorStateLists"})
    public ColorStateList getColorStateList(int i) {
        ColorStateList colorStateList = this.f48392a.getColorStateList(i);
        Intrinsics.checkNotNullExpressionValue(colorStateList, "baseResources.getColorStateList(id)");
        return colorStateList;
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        Configuration configuration = this.f48392a.getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "baseResources.configuration");
        return configuration;
    }

    @Override // android.content.res.Resources
    public float getDimension(int i) {
        return this.f48392a.getDimension(i);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i) {
        return this.f48392a.getDimensionPixelOffset(i);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i) {
        return this.f48392a.getDimensionPixelSize(i);
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        DisplayMetrics displayMetrics = this.f48392a.getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "baseResources.displayMetrics");
        return displayMetrics;
    }

    @Override // android.content.res.Resources
    @Deprecated(message = "Deprecated in Java")
    @SuppressLint({"UseCompatLoadingForDrawables"})
    public Drawable getDrawable(int i) {
        Drawable drawable = this.f48392a.getDrawable(i);
        Intrinsics.checkNotNullExpressionValue(drawable, "baseResources.getDrawable(id)");
        return drawable;
    }

    @Override // android.content.res.Resources
    @Deprecated(message = "Deprecated in Java")
    public Drawable getDrawableForDensity(int i, int i2) {
        return this.f48392a.getDrawableForDensity(i, i2);
    }

    @Override // android.content.res.Resources
    public float getFloat(int i) {
        float f;
        f = this.f48392a.getFloat(i);
        return f;
    }

    @Override // android.content.res.Resources
    public Typeface getFont(int i) {
        Typeface font;
        font = this.f48392a.getFont(i);
        Intrinsics.checkNotNullExpressionValue(font, "baseResources.getFont(id)");
        return font;
    }

    @Override // android.content.res.Resources
    public float getFraction(int i, int i2, int i3) {
        return this.f48392a.getFraction(i, i2, i3);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String name, String str, String str2) {
        Intrinsics.checkNotNullParameter(name, "name");
        return m73237b().m3572a(name, str, str2);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i) {
        int[] intArray = this.f48392a.getIntArray(i);
        Intrinsics.checkNotNullExpressionValue(intArray, "baseResources.getIntArray(id)");
        return intArray;
    }

    @Override // android.content.res.Resources
    public int getInteger(int i) {
        return this.f48392a.getInteger(i);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i) {
        XmlResourceParser layout = this.f48392a.getLayout(i);
        Intrinsics.checkNotNullExpressionValue(layout, "baseResources.getLayout(id)");
        return layout;
    }

    @Override // android.content.res.Resources
    @Deprecated(message = "Deprecated in Java")
    public Movie getMovie(int i) {
        Movie movie = this.f48392a.getMovie(i);
        Intrinsics.checkNotNullExpressionValue(movie, "baseResources.getMovie(id)");
        return movie;
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i, int i2) {
        return m73237b().m3570c(i, i2);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i, int i2) {
        return m73237b().m3567f(i, i2);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i) {
        String resourceEntryName = this.f48392a.getResourceEntryName(i);
        Intrinsics.checkNotNullExpressionValue(resourceEntryName, "baseResources.getResourceEntryName(resid)");
        return resourceEntryName;
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i) {
        String resourceName = this.f48392a.getResourceName(i);
        Intrinsics.checkNotNullExpressionValue(resourceName, "baseResources.getResourceName(resid)");
        return resourceName;
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i) {
        String resourcePackageName = this.f48392a.getResourcePackageName(i);
        Intrinsics.checkNotNullExpressionValue(resourcePackageName, "baseResources.getResourcePackageName(resid)");
        return resourcePackageName;
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i) {
        String resourceTypeName = this.f48392a.getResourceTypeName(i);
        Intrinsics.checkNotNullExpressionValue(resourceTypeName, "baseResources.getResourceTypeName(resid)");
        return resourceTypeName;
    }

    @Override // android.content.res.Resources
    public String getString(int i) {
        return m73237b().m3566g(i);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i) {
        return m73237b().m3564i(i);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i) {
        return m73237b().m3561l(i);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i) {
        return m73237b().m3559n(i);
    }

    @Override // android.content.res.Resources
    public void getValue(int i, TypedValue typedValue, boolean z) {
        this.f48392a.getValue(i, typedValue, z);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) {
        this.f48392a.getValueForDensity(i, i2, typedValue, z);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i) {
        XmlResourceParser xml = this.f48392a.getXml(i);
        Intrinsics.checkNotNullExpressionValue(xml, "baseResources.getXml(id)");
        return xml;
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        TypedArray obtainAttributes = this.f48392a.obtainAttributes(attributeSet, iArr);
        Intrinsics.checkNotNullExpressionValue(obtainAttributes, "baseResources.obtainAttributes(set, attrs)");
        return obtainAttributes;
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i) {
        TypedArray obtainTypedArray = this.f48392a.obtainTypedArray(i);
        Intrinsics.checkNotNullExpressionValue(obtainTypedArray, "baseResources.obtainTypedArray(id)");
        return obtainTypedArray;
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i) {
        InputStream openRawResource = this.f48392a.openRawResource(i);
        Intrinsics.checkNotNullExpressionValue(openRawResource, "baseResources.openRawResource(id)");
        return openRawResource;
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i) {
        AssetFileDescriptor openRawResourceFd = this.f48392a.openRawResourceFd(i);
        Intrinsics.checkNotNullExpressionValue(openRawResourceFd, "baseResources.openRawResourceFd(id)");
        return openRawResourceFd;
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.f48392a.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.f48392a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void removeLoaders(ResourcesLoader... loaders) {
        Intrinsics.checkNotNullParameter(loaders, "loaders");
        this.f48392a.removeLoaders((ResourcesLoader[]) Arrays.copyOf(loaders, loaders.length));
    }

    @Override // android.content.res.Resources
    @Deprecated(message = "Deprecated in Java")
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        Resources resources = this.f48392a;
        if (resources == null) {
            super.updateConfiguration(configuration, displayMetrics);
        } else {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    public int getColor(int i, Resources.Theme theme) {
        return this.f48392a.getColor(i, theme);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i, Resources.Theme theme) {
        ColorStateList colorStateList = this.f48392a.getColorStateList(i, theme);
        Intrinsics.checkNotNullExpressionValue(colorStateList, "baseResources.getColorStateList(id, theme)");
        return colorStateList;
    }

    @Override // android.content.res.Resources
    @SuppressLint({"UseCompatLoadingForDrawables"})
    public Drawable getDrawable(int i, Resources.Theme theme) {
        Drawable drawable = this.f48392a.getDrawable(i, theme);
        Intrinsics.checkNotNullExpressionValue(drawable, "baseResources.getDrawable(id, theme)");
        return drawable;
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return this.f48392a.getDrawableForDensity(i, i2, theme);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i, int i2, Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        return m73237b().m3569d(i, i2, Arrays.copyOf(formatArgs, formatArgs.length));
    }

    @Override // android.content.res.Resources
    public String getString(int i, Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        return m73237b().m3565h(i, Arrays.copyOf(formatArgs, formatArgs.length));
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i, CharSequence def) {
        Intrinsics.checkNotNullParameter(def, "def");
        return m73237b().m3560m(i, def);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z) {
        this.f48392a.getValue(str, typedValue, z);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i, TypedValue typedValue) {
        InputStream openRawResource = this.f48392a.openRawResource(i, typedValue);
        Intrinsics.checkNotNullExpressionValue(openRawResource, "baseResources.openRawResource(id, value)");
        return openRawResource;
    }
}

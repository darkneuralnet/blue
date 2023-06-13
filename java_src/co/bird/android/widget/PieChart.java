package co.bird.android.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.widget.PieChart;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinVersion;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
@Metadata(m28433d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u0097\u00012\u00020\u0001:\u0005\u0098\u0001\"4,B\u0015\b\u0016\u0012\b\u0010\u0091\u0001\u001a\u00030\u0090\u0001¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001B\u001d\b\u0016\u0012\b\u0010\u0091\u0001\u001a\u00030\u0090\u0001\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0006\b\u0092\u0001\u0010\u0094\u0001B&\b\u0016\u0012\b\u0010\u0091\u0001\u001a\u00030\u0090\u0001\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0007\u0010\u0095\u0001\u001a\u00020\u001f¢\u0006\u0006\b\u0092\u0001\u0010\u0096\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J4\u0010\u000e\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bH\u0002J4\u0010\u000f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bH\u0002J4\u0010\u0010\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bH\u0002J6\u0010\u0013\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u0002H\u0002J*\u0010\u0016\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\tH\u0002J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J0\u0010\u001e\u001a\u00020\u00042\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t0\u001a2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t0\u001aH\u0002J\u001e\u0010\"\u001a\u00020\u0004*\u00020\f2\u0006\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u0002H\u0002J\f\u0010#\u001a\u00020\u0002*\u00020\tH\u0002J\u0018\u0010&\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001fH\u0014J\u0012\u0010'\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J&\u0010,\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020*R.\u00103\u001a\u0004\u0018\u00010\u001b2\b\u0010-\u001a\u0004\u0018\u00010\u001b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R*\u0010:\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R*\u0010=\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b,\u00105\u001a\u0004\b;\u00107\"\u0004\b<\u00109R6\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR*\u0010F\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u00105\u001a\u0004\bD\u00107\"\u0004\bE\u00109R*\u0010\u0012\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u00105\u001a\u0004\bG\u00107\"\u0004\bH\u00109R*\u0010O\u001a\u00020I2\u0006\u0010-\u001a\u00020I8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR*\u0010R\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u00105\u001a\u0004\bP\u00107\"\u0004\bQ\u00109R*\u0010U\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u00105\u001a\u0004\bS\u00107\"\u0004\bT\u00109R*\u0010X\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u00105\u001a\u0004\bV\u00107\"\u0004\bW\u00109R*\u0010[\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u00105\u001a\u0004\bY\u00107\"\u0004\bZ\u00109R*\u0010_\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u00105\u001a\u0004\b]\u00107\"\u0004\b^\u00109R$\u0010e\u001a\u00020`2\u0006\u0010-\u001a\u00020`8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\ba\u0010b\"\u0004\bc\u0010dR#\u0010k\u001a\n g*\u0004\u0018\u00010f0f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\b\\\u0010jR\u001b\u0010n\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bl\u0010i\u001a\u0004\ba\u0010mR\u0014\u0010r\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010t\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010sR\u0014\u0010v\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010sR\u0014\u0010x\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010sR\u0014\u0010y\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010sR\u0014\u0010z\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010sR\u0014\u0010|\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010sR\u0014\u0010~\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010sR\u0015\u0010\u0080\u0001\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010sR\u001c\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0015\u0010\u0085\u0001\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bp\u00107R'\u0010\u0088\u0001\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0086\u0001\u00107\"\u0005\b\u0087\u0001\u00109R&\u0010\u008a\u0001\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\r\u001a\u0004\bl\u00107\"\u0005\b\u0089\u0001\u00109R'\u0010\u008d\u0001\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u008b\u0001\u00107\"\u0005\b\u008c\u0001\u00109R&\u0010\u008f\u0001\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028F@FX\u0086\u000e¢\u0006\r\u001a\u0004\bh\u00107\"\u0005\b\u008e\u0001\u00109¨\u0006\u0099\u0001"}, m28432d2 = {"Lco/bird/android/widget/PieChart;", "Landroid/view/View;", "", "strokeWidth", "", "v", "Landroid/graphics/Canvas;", "canvas", "", "Lco/bird/android/widget/PieChart$b;", MessageExtension.FIELD_DATA, "Lkotlin/Function1;", "Landroid/graphics/Paint;", "setupPaint", "i", "h", "k", "datum", "startDegrees", "g", "degrees", "l", "j", "Landroid/util/AttributeSet;", "attrs", "r", "", "", "currentData", "newData", "u", "", "shadowColor", "alpha", "b", "f", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "onDraw", "", "duration", "Landroid/view/animation/Interpolator;", "interpolator", DateTokenConverter.CONVERTER_KEY, "value", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "title", "c", "F", "getMaxTitleSize", "()F", "setMaxTitleSize", "(F)V", "maxTitleSize", "getMinTitleSize", "setMinTitleSize", "minTitleSize", "e", "Ljava/util/List;", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getMaxStrokeRatio", "setMaxStrokeRatio", "maxStrokeRatio", "getStartDegrees", "setStartDegrees", "Lco/bird/android/widget/PieChart$c;", "Lco/bird/android/widget/PieChart$c;", "getDirection", "()Lco/bird/android/widget/PieChart$c;", "setDirection", "(Lco/bird/android/widget/PieChart$c;)V", "direction", "getLabelPointerSize", "setLabelPointerSize", "labelPointerSize", "getLabelReservedSpacing", "setLabelReservedSpacing", "labelReservedSpacing", "getLabelPadding", "setLabelPadding", "labelPadding", "getLabelCornerRadius", "setLabelCornerRadius", "labelCornerRadius", "m", "getLabelDistance", "setLabelDistance", "labelDistance", "Lco/bird/android/widget/PieChart$d;", "n", "Lco/bird/android/widget/PieChart$d;", "setLabelLocation", "(Lco/bird/android/widget/PieChart$d;)V", "labelLocation", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "o", "Lkotlin/Lazy;", "()Landroid/graphics/Bitmap;", "chartBitmap", "p", "()Landroid/graphics/Canvas;", "chartCanvas", "Landroid/graphics/RectF;", "q", "Landroid/graphics/RectF;", "chartRect", "Landroid/graphics/Paint;", "titlePaint", "s", "chartPaint", "t", "shadowPaint", "deletePaint", "pointerOutlinePaint", "w", "pointerCenterPaint", "x", "labelTextPaint", "y", "labelBackgroundPaint", "Landroid/animation/ValueAnimator;", "z", "Landroid/animation/ValueAnimator;", "animator", "maxStrokeWidth", "getArcGapSize", "setArcGapSize", "arcGapSize", "setLabelPointerStrokeWidth", "labelPointerStrokeWidth", "getLabelTextSize", "setLabelTextSize", "labelTextSize", "setLabelAlpha", "labelAlpha", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "A", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPieChart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PieChart.kt\nco/bird/android/widget/PieChart\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,599:1\n1549#2:600\n1620#2,3:601\n1549#2:604\n1620#2,3:605\n1855#2,2:608\n1855#2,2:610\n1855#2,2:612\n1855#2:614\n1856#2:616\n1855#2,2:617\n1#3:615\n125#4:619\n152#4,3:620\n*S KotlinDebug\n*F\n+ 1 PieChart.kt\nco/bird/android/widget/PieChart\n*L\n319#1:600\n319#1:601,3\n320#1:604\n320#1:605,3\n379#1:608,2\n387#1:610,2\n397#1:612,2\n547#1:614\n547#1:616\n551#1:617,2\n330#1:619\n330#1:620,3\n*E\n"})
/* loaded from: classes4.dex */
public final class PieChart extends View {

    /* renamed from: A */
    public static final C16550a f67460A = new C16550a(null);

    /* renamed from: b */
    public String f67461b;

    /* renamed from: c */
    public float f67462c;

    /* renamed from: d */
    public float f67463d;

    /* renamed from: e */
    public List<C16551b> f67464e;

    /* renamed from: f */
    public float f67465f;

    /* renamed from: g */
    public float f67466g;

    /* renamed from: h */
    public EnumC16552c f67467h;

    /* renamed from: i */
    public float f67468i;

    /* renamed from: j */
    public float f67469j;

    /* renamed from: k */
    public float f67470k;

    /* renamed from: l */
    public float f67471l;

    /* renamed from: m */
    public float f67472m;

    /* renamed from: n */
    public EnumC16553d f67473n;

    /* renamed from: o */
    public final Lazy f67474o;

    /* renamed from: p */
    public final Lazy f67475p;

    /* renamed from: q */
    public final RectF f67476q;

    /* renamed from: r */
    public final Paint f67477r;

    /* renamed from: s */
    public final Paint f67478s;

    /* renamed from: t */
    public final Paint f67479t;

    /* renamed from: u */
    public final Paint f67480u;

    /* renamed from: v */
    public final Paint f67481v;

    /* renamed from: w */
    public final Paint f67482w;

    /* renamed from: x */
    public final Paint f67483x;

    /* renamed from: y */
    public final Paint f67484y;

    /* renamed from: z */
    public ValueAnimator f67485z;

    @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0007R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0007R\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0007R\u0014\u0010\u001a\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0010R\u0014\u0010\u001b\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0010¨\u0006\u001e"}, m28432d2 = {"Lco/bird/android/widget/PieChart$a;", "", "", "CHART_SHADOW_COLOR", "Ljava/lang/String;", "", "DEFAULT_ARC_GAP_WIDTH_DP", "F", "DEFAULT_LABEL_CORNER_RADIUS_DP", "DEFAULT_LABEL_DISTANCE_DP", "DEFAULT_LABEL_PADDING_DP", "DEFAULT_LABEL_RESERVED_SPACING_DP", "DEFAULT_LABEL_TEXT_SIZE_SP", "DEFAULT_MAX_RADIUS_RATIO", "", "DEFAULT_MAX_TITLE_SIZE_SP", "I", "DEFAULT_MIN_TITLE_SIZE_SP", "DEFAULT_POINTER_SIZE_DP", "DEFAULT_POINTER_STROKE_WIDTH_DP", "DEFAULT_SIZE_DP", "DEFAULT_START_ANGLE", "LABEL_SHADOW_COLOR", "SHADOW_DY_DP", "SHADOW_RADIUS_DP", "TITLE_LETTER_SPACING", "TITLE_PADDING_DP", "TITLE_SIZE_GRANULARITY_SP", "<init>", "()V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.PieChart$a */
    /* loaded from: classes4.dex */
    public static final class C16550a {
        public /* synthetic */ C16550a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C16550a() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/widget/PieChart$c;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.PieChart$c */
    /* loaded from: classes4.dex */
    public enum EnumC16552c {
        CLOCKWISE,
        COUNTER_CLOCKWISE
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m28432d2 = {"Lco/bird/android/widget/PieChart$d;", "", "<init>", "(Ljava/lang/String;I)V", "b", "c", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.PieChart$d */
    /* loaded from: classes4.dex */
    public enum EnumC16553d {
        OUTSIDE,
        INSIDE
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "b", "()Landroid/graphics/Bitmap;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.PieChart$e */
    /* loaded from: classes4.dex */
    public static final class C16554e extends Lambda implements Function0<Bitmap> {
        public C16554e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Bitmap invoke() {
            return Bitmap.createBitmap(PieChart.this.getMeasuredWidth(), PieChart.this.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        }
    }

    @Metadata(m28433d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m28432d2 = {"Landroid/graphics/Canvas;", "b", "()Landroid/graphics/Canvas;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.PieChart$f */
    /* loaded from: classes4.dex */
    public static final class C16555f extends Lambda implements Function0<Canvas> {
        public C16555f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Canvas invoke() {
            return new Canvas(PieChart.this.m54490m());
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/widget/PieChart$b;", "datum", "Landroid/graphics/Paint;", C17296a.f69688o, "(Lco/bird/android/widget/PieChart$b;)Landroid/graphics/Paint;"}, m28431k = 3, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPieChart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PieChart.kt\nco/bird/android/widget/PieChart$onDraw$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,599:1\n1#2:600\n*E\n"})
    /* renamed from: co.bird.android.widget.PieChart$g */
    /* loaded from: classes4.dex */
    public static final class C16556g extends Lambda implements Function1<C16551b, Paint> {

        /* renamed from: h */
        public final /* synthetic */ float f67501h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16556g(float f) {
            super(1);
            this.f67501h = f;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Paint invoke(C16551b datum) {
            Intrinsics.checkNotNullParameter(datum, "datum");
            Paint paint = PieChart.this.f67479t;
            paint.setStrokeWidth(this.f67501h * datum.m54475f());
            return paint;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/widget/PieChart$b;", "datum", "Landroid/graphics/Paint;", C17296a.f69688o, "(Lco/bird/android/widget/PieChart$b;)Landroid/graphics/Paint;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.PieChart$h */
    /* loaded from: classes4.dex */
    public static final class C16557h extends Lambda implements Function1<C16551b, Paint> {

        /* renamed from: h */
        public final /* synthetic */ float f67503h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16557h(float f) {
            super(1);
            this.f67503h = f;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final Paint invoke(C16551b datum) {
            Intrinsics.checkNotNullParameter(datum, "datum");
            Paint paint = PieChart.this.f67478s;
            paint.setStrokeWidth(this.f67503h * datum.m54475f());
            paint.setColor(datum.m54479b());
            return paint;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PieChart(Context context) {
        super(context);
        List<C16551b> emptyList;
        Lazy lazy;
        Lazy lazy2;
        Intrinsics.checkNotNullParameter(context, "context");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.f67462c = C49347td3.m11999d(28, context2);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        this.f67463d = C49347td3.m11999d(20, context3);
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f67464e = emptyList;
        this.f67465f = 0.7f;
        this.f67466g = 270.0f;
        this.f67467h = EnumC16552c.CLOCKWISE;
        Float valueOf = Float.valueOf(16.0f);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        this.f67468i = C49347td3.m12002a(valueOf, context4);
        Float valueOf2 = Float.valueOf(45.0f);
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "context");
        this.f67469j = C49347td3.m12002a(valueOf2, context5);
        Float valueOf3 = Float.valueOf(6.0f);
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "context");
        this.f67470k = C49347td3.m12002a(valueOf3, context6);
        Float valueOf4 = Float.valueOf(5.0f);
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "context");
        this.f67471l = C49347td3.m12002a(valueOf4, context7);
        Float valueOf5 = Float.valueOf(15.0f);
        Context context8 = getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "context");
        this.f67472m = C49347td3.m12002a(valueOf5, context8);
        this.f67473n = EnumC16553d.OUTSIDE;
        lazy = LazyKt__LazyJVMKt.lazy(new C16554e());
        this.f67474o = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C16555f());
        this.f67475p = lazy2;
        this.f67476q = new RectF();
        Paint paint = new Paint(1);
        Context context9 = getContext();
        int i = C32364Df4.birdNewRoad;
        paint.setColor(NA0.m94301c(context9, i));
        paint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        paint.setLetterSpacing(0.03f);
        this.f67477r = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        this.f67478s = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(0);
        paint3.setStyle(Paint.Style.STROKE);
        m54500c(this, paint3, Color.parseColor("#1A000000"), 0.0f, 2, null);
        this.f67479t = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint4.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        Float valueOf6 = Float.valueOf(3.0f);
        Context context10 = getContext();
        Intrinsics.checkNotNullExpressionValue(context10, "context");
        paint4.setStrokeWidth(C49347td3.m12002a(valueOf6, context10));
        this.f67480u = paint4;
        Paint paint5 = new Paint(1);
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setColor(-1);
        Float valueOf7 = Float.valueOf(2.4f);
        Context context11 = getContext();
        Intrinsics.checkNotNullExpressionValue(context11, "context");
        paint5.setStrokeWidth(C49347td3.m12002a(valueOf7, context11));
        m54500c(this, paint5, Color.parseColor("#40000000"), 0.0f, 2, null);
        this.f67481v = paint5;
        Paint paint6 = new Paint(1);
        paint6.setStrokeWidth(this.f67468i - m54487p());
        this.f67482w = paint6;
        Paint paint7 = new Paint(1);
        paint7.setColor(NA0.m94301c(getContext(), C32364Df4.white));
        Float valueOf8 = Float.valueOf(14.0f);
        Context context12 = getContext();
        Intrinsics.checkNotNullExpressionValue(context12, "context");
        paint7.setTextSize(C49347td3.m11999d(valueOf8, context12));
        this.f67483x = paint7;
        Paint paint8 = new Paint(1);
        paint8.setColor(NA0.m94301c(getContext(), i));
        m54500c(this, paint8, Color.parseColor("#40000000"), 0.0f, 2, null);
        this.f67484y = paint8;
    }

    public static /* synthetic */ void animateData$default(PieChart pieChart, List list, long j, Interpolator interpolator, int i, Object obj) {
        if ((i & 4) != 0) {
            interpolator = new LinearInterpolator();
        }
        pieChart.m54499d(list, j, interpolator);
    }

    /* renamed from: c */
    public static /* synthetic */ void m54500c(PieChart pieChart, Paint paint, int i, float f, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = 1.0f;
        }
        pieChart.m54501b(paint, i, f);
    }

    /* renamed from: e */
    public static final void m54498e(Map newDataMap, PieChart this$0, Map currentDataMap, ValueAnimator anim) {
        float f;
        float coerceIn;
        Intrinsics.checkNotNullParameter(newDataMap, "$newDataMap");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(currentDataMap, "$currentDataMap");
        Intrinsics.checkNotNullParameter(anim, "anim");
        ArrayList arrayList = new ArrayList(newDataMap.size());
        float f2 = 360.0f;
        for (Map.Entry entry : newDataMap.entrySet()) {
            String str = (String) entry.getKey();
            C16551b c16551b = (C16551b) entry.getValue();
            Object animatedValue = anim.getAnimatedValue();
            Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            C16551b c16551b2 = (C16551b) currentDataMap.get(str);
            float f3 = 0.0f;
            if (c16551b2 != null) {
                f = c16551b2.m54478c();
            } else {
                f = 0.0f;
            }
            coerceIn = RangesKt___RangesKt.coerceIn(f + ((c16551b.m54478c() - f) * floatValue), 0.0f, f2);
            f2 -= coerceIn;
            C16551b c16551b3 = (C16551b) currentDataMap.get(str);
            if (c16551b3 != null) {
                f3 = c16551b3.m54475f();
            }
            arrayList.add(C16551b.copy$default(c16551b, null, 0, coerceIn, 0, f3 + ((c16551b.m54475f() - f3) * floatValue), null, 43, null));
        }
        this$0.setData(arrayList);
    }

    /* renamed from: s */
    public static final int m54484s(int i) {
        return View.MeasureSpec.getMode(i);
    }

    /* renamed from: t */
    public static final int m54483t(int i) {
        return View.MeasureSpec.getSize(i);
    }

    /* renamed from: b */
    public final void m54501b(Paint paint, int i, float f) {
        boolean z;
        if (f == 1.0f) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = Color.argb((int) Math.rint(f * Color.alpha(i)), Color.red(i), Color.green(i), Color.blue(i));
        }
        Float valueOf = Float.valueOf(6.0f);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        float m12002a = C49347td3.m12002a(valueOf, context);
        Float valueOf2 = Float.valueOf(4.0f);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        paint.setShadowLayer(m12002a, 0.0f, C49347td3.m12002a(valueOf2, context2), i);
    }

    /* renamed from: d */
    public final void m54499d(List<C16551b> data, long j, Interpolator interpolator) {
        int collectionSizeOrDefault;
        Map map;
        final Map<String, C16551b> mutableMap;
        int collectionSizeOrDefault2;
        Map map2;
        final Map<String, C16551b> mutableMap2;
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        ValueAnimator valueAnimator = this.f67485z;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        List<C16551b> list = this.f67464e;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        for (C16551b c16551b : list) {
            arrayList.add(TuplesKt.m28425to(c16551b.m54477d(), c16551b));
        }
        map = MapsKt__MapsKt.toMap(arrayList);
        mutableMap = MapsKt__MapsKt.toMutableMap(map);
        List<C16551b> list2 = data;
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault2);
        for (C16551b c16551b2 : list2) {
            arrayList2.add(TuplesKt.m28425to(c16551b2.m54477d(), c16551b2));
        }
        map2 = MapsKt__MapsKt.toMap(arrayList2);
        mutableMap2 = MapsKt__MapsKt.toMutableMap(map2);
        m54482u(mutableMap, mutableMap2);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(j);
        ofFloat.setInterpolator(interpolator);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: oT3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                PieChart.m54498e(mutableMap2, this, mutableMap, valueAnimator2);
            }
        });
        ofFloat.start();
        this.f67485z = ofFloat;
    }

    /* renamed from: f */
    public final float m54497f(C16551b c16551b) {
        if (this.f67467h == EnumC16552c.CLOCKWISE) {
            return c16551b.m54478c();
        }
        return -c16551b.m54478c();
    }

    /* renamed from: g */
    public final void m54496g(Canvas canvas, C16551b c16551b, float f, Function1<? super C16551b, ? extends Paint> function1) {
        Paint invoke = function1.invoke(c16551b);
        m54481v(invoke.getStrokeWidth());
        if (canvas != null) {
            canvas.drawArc(this.f67476q, f, m54497f(c16551b), false, invoke);
        }
    }

    /* renamed from: h */
    public final void m54495h(Canvas canvas, List<C16551b> list, Function1<? super C16551b, ? extends Paint> function1) {
        float f = this.f67466g;
        for (C16551b c16551b : list) {
            m54496g(canvas, c16551b, f, function1);
            m54491l(canvas, f);
            m54491l(canvas, m54497f(c16551b) + f);
            f += m54497f(c16551b);
        }
    }

    /* renamed from: i */
    public final void m54494i(Canvas canvas, List<C16551b> list, Function1<? super C16551b, ? extends Paint> function1) {
        float f = this.f67466g;
        for (C16551b c16551b : list) {
            m54496g(canvas, c16551b, f, function1);
            f += m54497f(c16551b);
        }
    }

    /* renamed from: j */
    public final void m54493j(Canvas canvas, float f, float f2, C16551b c16551b) {
        float f3;
        float f4;
        int coerceIn;
        m54481v(f2);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float f5 = 2;
        float width = (this.f67476q.width() / f5) + (f2 / f5);
        double radians = Math.toRadians(f + (m54497f(c16551b) / f5));
        float cos = measuredWidth + (((float) Math.cos(radians)) * width);
        float sin = measuredHeight + (((float) Math.sin(radians)) * width);
        float m54487p = (this.f67468i / f5) - (m54487p() / f5);
        if (canvas != null) {
            f3 = sin;
            f4 = cos;
            canvas.drawArc(cos - m54487p, sin - m54487p, cos + m54487p, sin + m54487p, 0.0f, 360.0f, false, this.f67481v);
        } else {
            f3 = sin;
            f4 = cos;
        }
        Paint paint = this.f67482w;
        paint.setColor(c16551b.m54479b());
        coerceIn = RangesKt___RangesKt.coerceIn((int) (((float) KotlinVersion.MAX_COMPONENT_VALUE) * m54488o()), 0, (int) KotlinVersion.MAX_COMPONENT_VALUE);
        paint.setAlpha(coerceIn);
        if (canvas != null) {
            canvas.drawCircle(f4, f3, (this.f67468i / f5) - m54487p(), this.f67482w);
        }
        float measureText = this.f67483x.measureText(c16551b.m54476e());
        float textSize = this.f67483x.getTextSize() + (this.f67470k * f5);
        float f6 = ((this.f67470k * f5) + measureText) / f5;
        float f7 = width + this.f67472m + f6;
        float cos2 = measuredWidth + (((float) Math.cos(radians)) * f7);
        float sin2 = measuredHeight + (f7 * ((float) Math.sin(radians)));
        if (canvas != null) {
            float f8 = textSize / f5;
            float f9 = this.f67471l;
            canvas.drawRoundRect(cos2 - f6, sin2 - f8, cos2 + f6, sin2 + f8, f9, f9, this.f67484y);
        }
        String m54476e = c16551b.m54476e();
        if (m54476e != null && canvas != null) {
            canvas.drawText(m54476e, cos2 - (measureText / f5), sin2 + (this.f67483x.getTextSize() / 3), this.f67483x);
        }
    }

    /* renamed from: k */
    public final void m54492k(Canvas canvas, List<C16551b> list, Function1<? super C16551b, ? extends Paint> function1) {
        boolean z;
        boolean isBlank;
        float f = this.f67466g;
        for (C16551b c16551b : list) {
            String m54476e = c16551b.m54476e();
            if (m54476e != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(m54476e);
                if (!isBlank) {
                    z = false;
                    if (!z && this.f67473n == EnumC16553d.OUTSIDE) {
                        m54493j(canvas, f, function1.invoke(c16551b).getStrokeWidth(), c16551b);
                    }
                    f += m54497f(c16551b);
                }
            }
            z = true;
            if (!z) {
                m54493j(canvas, f, function1.invoke(c16551b).getStrokeWidth(), c16551b);
            }
            f += m54497f(c16551b);
        }
    }

    /* renamed from: l */
    public final void m54491l(Canvas canvas, float f) {
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float min = Math.min(getMeasuredWidth(), getMeasuredHeight()) / 2.0f;
        double radians = Math.toRadians(f);
        float cos = measuredWidth + (((float) Math.cos(radians)) * min);
        float sin = measuredHeight + (min * ((float) Math.sin(radians)));
        if (canvas != null) {
            canvas.drawLine(measuredWidth, measuredHeight, cos, sin, this.f67480u);
        }
    }

    /* renamed from: m */
    public final Bitmap m54490m() {
        return (Bitmap) this.f67474o.getValue();
    }

    /* renamed from: n */
    public final Canvas m54489n() {
        return (Canvas) this.f67475p.getValue();
    }

    /* renamed from: o */
    public final float m54488o() {
        return this.f67484y.getAlpha() / 255.0f;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        boolean isBlank;
        if (getMeasuredWidth() != 0 && getMeasuredHeight() != 0) {
            float m54486q = m54486q();
            boolean z = false;
            m54490m().eraseColor(0);
            m54494i(canvas, this.f67464e, new C16556g(m54486q));
            C16557h c16557h = new C16557h(m54486q);
            m54495h(m54489n(), this.f67464e, c16557h);
            if (canvas != null) {
                canvas.drawBitmap(m54490m(), 0.0f, 0.0f, (Paint) null);
            }
            m54492k(canvas, this.f67464e, c16557h);
            String str = this.f67461b;
            if (str != null) {
                isBlank = StringsKt__StringsJVMKt.isBlank(str);
                if (!isBlank) {
                    z = true;
                }
            }
            if (z) {
                float width = this.f67476q.width() - this.f67478s.getStrokeWidth();
                float f = 2;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                float m12002a = width - (C49347td3.m12002a(5, context) * f);
                this.f67477r.setTextSize(this.f67462c / getScaleX());
                while (this.f67477r.measureText(str) > m12002a && this.f67477r.getTextSize() > this.f67463d / getScaleX()) {
                    Paint paint = this.f67477r;
                    paint.setTextSize(paint.getTextSize() - (f / getScaleX()));
                }
                this.f67477r.setTextSize(Math.max(this.f67463d / getScaleX(), this.f67477r.getTextSize()));
                float measureText = this.f67477r.measureText(str);
                RectF rectF = this.f67476q;
                float width2 = rectF.left + (rectF.width() / f);
                RectF rectF2 = this.f67476q;
                float height = rectF2.top + (rectF2.height() / f);
                if (canvas != null) {
                    canvas.drawText(str, width2 - (measureText / f), height + (this.f67477r.getTextSize() / 3), this.f67477r);
                }
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        ViewGroup viewGroup;
        if (m54484s(i) == 1073741824 && m54484s(i2) == 1073741824) {
            super.onMeasure(i, i2);
        } else if (m54484s(i) == 0 && m54484s(i2) == 0) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            setMeasuredDimension((int) C49347td3.m12002a(180, context), (int) C49347td3.m12002a(180, context2));
        } else if (m54484s(i) == 1073741824) {
            setMeasuredDimension(m54483t(i), m54483t(i));
        } else if (m54484s(i2) == 1073741824) {
            setMeasuredDimension(m54483t(i2), m54483t(i2));
        } else {
            int min = Math.min(m54483t(i), m54483t(i2));
            setMeasuredDimension(min, min);
        }
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
        }
    }

    /* renamed from: p */
    public final float m54487p() {
        return this.f67481v.getStrokeWidth();
    }

    /* renamed from: q */
    public final float m54486q() {
        return ((Math.min(getMeasuredWidth(), getMeasuredHeight()) / 2.0f) - this.f67469j) * this.f67465f;
    }

    /* renamed from: r */
    public final void m54485r(AttributeSet attributeSet) {
        float coerceIn;
        float coerceIn2;
        List<C16551b> listOf;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C34290Ll4.PieChart);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "context.obtainStyledAttr…rs, R.styleable.PieChart)");
        setTitle(obtainStyledAttributes.getString(C34290Ll4.PieChart_android_title));
        int i = C34290Ll4.PieChart_maxTitleSize;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        setMaxTitleSize(obtainStyledAttributes.getDimensionPixelSize(i, (int) C49347td3.m11999d(28, context)));
        int i2 = C34290Ll4.PieChart_minTitleSize;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        setMinTitleSize(obtainStyledAttributes.getDimensionPixelSize(i2, (int) C49347td3.m11999d(20, context2)));
        coerceIn = RangesKt___RangesKt.coerceIn(obtainStyledAttributes.getFloat(C34290Ll4.PieChart_maxStrokeRatio, 0.7f), 0.0f, 1.0f);
        setMaxStrokeRatio(coerceIn);
        coerceIn2 = RangesKt___RangesKt.coerceIn(obtainStyledAttributes.getInt(C34290Ll4.PieChart_startDegrees, 270), 0.0f, 360.0f);
        setStartDegrees(coerceIn2);
        setDirection(EnumC16552c.values()[obtainStyledAttributes.getInt(C34290Ll4.PieChart_fillDirection, 0)]);
        int i3 = C34290Ll4.PieChart_arcGapSize;
        Float valueOf = Float.valueOf(3.0f);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        setArcGapSize(obtainStyledAttributes.getDimensionPixelSize(i3, (int) C49347td3.m12002a(valueOf, context3)));
        if (obtainStyledAttributes.getBoolean(C34290Ll4.PieChart_showLabels, true)) {
            int i4 = C34290Ll4.PieChart_labelPointerSize;
            Float valueOf2 = Float.valueOf(16.0f);
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "context");
            setLabelPointerSize(obtainStyledAttributes.getDimensionPixelSize(i4, (int) C49347td3.m12002a(valueOf2, context4)));
            int i5 = C34290Ll4.PieChart_labelPointerStrokeWidth;
            Float valueOf3 = Float.valueOf(2.4f);
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "context");
            setLabelPointerStrokeWidth(obtainStyledAttributes.getDimensionPixelSize(i5, (int) C49347td3.m12002a(valueOf3, context5)));
            int i6 = C34290Ll4.PieChart_labelReservedSpacing;
            Float valueOf4 = Float.valueOf(45.0f);
            Context context6 = getContext();
            Intrinsics.checkNotNullExpressionValue(context6, "context");
            setLabelReservedSpacing(obtainStyledAttributes.getDimensionPixelSize(i6, (int) C49347td3.m12002a(valueOf4, context6)));
            int i7 = C34290Ll4.PieChart_labelPadding;
            Float valueOf5 = Float.valueOf(6.0f);
            Context context7 = getContext();
            Intrinsics.checkNotNullExpressionValue(context7, "context");
            setLabelPadding(obtainStyledAttributes.getDimensionPixelSize(i7, (int) C49347td3.m12002a(valueOf5, context7)));
            int i8 = C34290Ll4.PieChart_labelTextSize;
            Float valueOf6 = Float.valueOf(14.0f);
            Context context8 = getContext();
            Intrinsics.checkNotNullExpressionValue(context8, "context");
            setLabelTextSize(obtainStyledAttributes.getDimensionPixelSize(i8, (int) C49347td3.m11999d(valueOf6, context8)));
            int i9 = C34290Ll4.PieChart_labelCornerRadius;
            Float valueOf7 = Float.valueOf(5.0f);
            Context context9 = getContext();
            Intrinsics.checkNotNullExpressionValue(context9, "context");
            setLabelCornerRadius(obtainStyledAttributes.getDimensionPixelSize(i9, (int) C49347td3.m12002a(valueOf7, context9)));
            int i10 = C34290Ll4.PieChart_labelDistance;
            Float valueOf8 = Float.valueOf(15.0f);
            Context context10 = getContext();
            Intrinsics.checkNotNullExpressionValue(context10, "context");
            setLabelDistance(obtainStyledAttributes.getDimensionPixelSize(i10, (int) C49347td3.m12002a(valueOf8, context10)));
        } else {
            setLabelPointerSize(0.0f);
            setLabelPointerStrokeWidth(0.0f);
            setLabelReservedSpacing(0.0f);
            setLabelPadding(0.0f);
            setLabelTextSize(0.0f);
            setLabelDistance(0.0f);
        }
        obtainStyledAttributes.recycle();
        if (isInEditMode()) {
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new C16551b[]{new C16551b("0", 0, 270.0f, Color.parseColor("#78C887"), 1.0f, "75"), new C16551b("1", 1, 18.0f, Color.parseColor("#FC8D8D"), 0.7f, "5"), new C16551b("2", 2, 72.0f, Color.parseColor("#F4B02B"), 0.8f, "20")});
            setData(listOf);
        }
    }

    public final void setArcGapSize(float f) {
        this.f67480u.setStrokeWidth(f);
        invalidate();
    }

    public final void setData(List<C16551b> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67464e = value;
        invalidate();
    }

    public final void setDirection(EnumC16552c value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f67467h = value;
        invalidate();
    }

    public final void setLabelAlpha(float f) {
        int coerceIn;
        coerceIn = RangesKt___RangesKt.coerceIn((int) (((float) KotlinVersion.MAX_COMPONENT_VALUE) * f), 0, (int) KotlinVersion.MAX_COMPONENT_VALUE);
        Paint paint = this.f67484y;
        paint.setAlpha(coerceIn);
        m54501b(paint, Color.parseColor("#40000000"), f);
        Paint paint2 = this.f67483x;
        paint2.setAlpha(coerceIn);
        m54501b(paint2, Color.parseColor("#40000000"), f);
        Paint paint3 = this.f67481v;
        paint3.setAlpha(coerceIn);
        m54501b(paint3, Color.parseColor("#40000000"), f);
        invalidate();
    }

    public final void setLabelCornerRadius(float f) {
        this.f67471l = f;
        invalidate();
    }

    public final void setLabelDistance(float f) {
        this.f67472m = f;
        invalidate();
    }

    public final void setLabelPadding(float f) {
        this.f67470k = f;
        invalidate();
    }

    public final void setLabelPointerSize(float f) {
        this.f67468i = f;
        invalidate();
    }

    public final void setLabelPointerStrokeWidth(float f) {
        this.f67481v.setStrokeWidth(f);
        invalidate();
    }

    public final void setLabelReservedSpacing(float f) {
        this.f67469j = f;
        invalidate();
    }

    public final void setLabelTextSize(float f) {
        this.f67483x.setTextSize(f);
        invalidate();
    }

    public final void setMaxStrokeRatio(float f) {
        this.f67465f = f;
        invalidate();
    }

    public final void setMaxTitleSize(float f) {
        this.f67462c = f;
        invalidate();
    }

    public final void setMinTitleSize(float f) {
        this.f67463d = f;
        invalidate();
    }

    public final void setStartDegrees(float f) {
        this.f67466g = f;
        invalidate();
    }

    public final void setTitle(String str) {
        this.f67461b = str;
        invalidate();
    }

    /* renamed from: u */
    public final void m54482u(Map<String, C16551b> map, Map<String, C16551b> map2) {
        Set<String> minus;
        Set<String> minus2;
        C16551b copy$default;
        C16551b copy$default2;
        minus = SetsKt___SetsKt.minus((Set) map.keySet(), (Iterable) map2.keySet());
        minus2 = SetsKt___SetsKt.minus((Set) map2.keySet(), (Iterable) map.keySet());
        for (String str : minus) {
            C16551b c16551b = map.get(str);
            if (c16551b != null && (copy$default2 = C16551b.copy$default(c16551b, null, 0, 0.0f, 0, 0.0f, null, 27, null)) != null) {
                map2.put(str, copy$default2);
            }
        }
        for (String str2 : minus2) {
            C16551b c16551b2 = map2.get(str2);
            if (c16551b2 != null && (copy$default = C16551b.copy$default(c16551b2, null, 0, 0.0f, 0, 0.0f, null, 59, null)) != null) {
                map.put(str2, copy$default);
            }
        }
    }

    /* renamed from: v */
    public final void m54481v(float f) {
        float f2;
        float f3;
        float f4 = 0.0f;
        if (this.f67473n == EnumC16553d.OUTSIDE) {
            f2 = this.f67469j;
        } else {
            f2 = 0.0f;
        }
        if (getMeasuredWidth() > getMeasuredHeight()) {
            f3 = (getMeasuredWidth() - getMeasuredHeight()) / 2.0f;
        } else {
            f3 = 0.0f;
        }
        if (getMeasuredHeight() > getMeasuredWidth()) {
            f4 = (getMeasuredHeight() - getMeasuredWidth()) / 2.0f;
        }
        float min = Math.min(getMeasuredWidth(), getMeasuredHeight());
        float m54486q = m54486q() - (f / 2.0f);
        this.f67476q.set(f3 + m54486q + f2, f4 + m54486q + f2, ((f3 + min) - m54486q) - f2, ((f4 + min) - m54486q) - f2);
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJG\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\u001aR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013¨\u0006\u001f"}, m28432d2 = {"Lco/bird/android/widget/PieChart$b;", "", "", "id", "", "order", "", "fillDegrees", "fillColor", "maxRadiusRatio", "label", C17296a.f69688o, "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/String;", DateTokenConverter.CONVERTER_KEY, "()Ljava/lang/String;", "b", "I", "getOrder", "()I", "c", "F", "()F", "e", "f", "<init>", "(Ljava/lang/String;IFIFLjava/lang/String;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.widget.PieChart$b */
    /* loaded from: classes4.dex */
    public static final class C16551b {

        /* renamed from: a */
        public final String f67486a;

        /* renamed from: b */
        public final int f67487b;

        /* renamed from: c */
        public final float f67488c;

        /* renamed from: d */
        public final int f67489d;

        /* renamed from: e */
        public final float f67490e;

        /* renamed from: f */
        public final String f67491f;

        public C16551b(String id, int i, float f, int i2, float f2, String str) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.f67486a = id;
            this.f67487b = i;
            this.f67488c = f;
            this.f67489d = i2;
            this.f67490e = f2;
            this.f67491f = str;
        }

        public static /* synthetic */ C16551b copy$default(C16551b c16551b, String str, int i, float f, int i2, float f2, String str2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = c16551b.f67486a;
            }
            if ((i3 & 2) != 0) {
                i = c16551b.f67487b;
            }
            int i4 = i;
            if ((i3 & 4) != 0) {
                f = c16551b.f67488c;
            }
            float f3 = f;
            if ((i3 & 8) != 0) {
                i2 = c16551b.f67489d;
            }
            int i5 = i2;
            if ((i3 & 16) != 0) {
                f2 = c16551b.f67490e;
            }
            float f4 = f2;
            if ((i3 & 32) != 0) {
                str2 = c16551b.f67491f;
            }
            return c16551b.m54480a(str, i4, f3, i5, f4, str2);
        }

        /* renamed from: a */
        public final C16551b m54480a(String id, int i, float f, int i2, float f2, String str) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new C16551b(id, i, f, i2, f2, str);
        }

        /* renamed from: b */
        public final int m54479b() {
            return this.f67489d;
        }

        /* renamed from: c */
        public final float m54478c() {
            return this.f67488c;
        }

        /* renamed from: d */
        public final String m54477d() {
            return this.f67486a;
        }

        /* renamed from: e */
        public final String m54476e() {
            return this.f67491f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C16551b) {
                C16551b c16551b = (C16551b) obj;
                return Intrinsics.areEqual(this.f67486a, c16551b.f67486a) && this.f67487b == c16551b.f67487b && Float.compare(this.f67488c, c16551b.f67488c) == 0 && this.f67489d == c16551b.f67489d && Float.compare(this.f67490e, c16551b.f67490e) == 0 && Intrinsics.areEqual(this.f67491f, c16551b.f67491f);
            }
            return false;
        }

        /* renamed from: f */
        public final float m54475f() {
            return this.f67490e;
        }

        public int hashCode() {
            int hashCode = ((((((((this.f67486a.hashCode() * 31) + Integer.hashCode(this.f67487b)) * 31) + Float.hashCode(this.f67488c)) * 31) + Integer.hashCode(this.f67489d)) * 31) + Float.hashCode(this.f67490e)) * 31;
            String str = this.f67491f;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.f67486a;
            int i = this.f67487b;
            float f = this.f67488c;
            int i2 = this.f67489d;
            float f2 = this.f67490e;
            String str2 = this.f67491f;
            return "PieChartData(id=" + str + ", order=" + i + ", fillDegrees=" + f + ", fillColor=" + i2 + ", maxRadiusRatio=" + f2 + ", label=" + str2 + ")";
        }

        public /* synthetic */ C16551b(String str, int i, float f, int i2, float f2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, f, i2, f2, (i3 & 32) != 0 ? null : str2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PieChart(Context context, AttributeSet attrs) {
        super(context, attrs);
        List<C16551b> emptyList;
        Lazy lazy;
        Lazy lazy2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.f67462c = C49347td3.m11999d(28, context2);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        this.f67463d = C49347td3.m11999d(20, context3);
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f67464e = emptyList;
        this.f67465f = 0.7f;
        this.f67466g = 270.0f;
        this.f67467h = EnumC16552c.CLOCKWISE;
        Float valueOf = Float.valueOf(16.0f);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        this.f67468i = C49347td3.m12002a(valueOf, context4);
        Float valueOf2 = Float.valueOf(45.0f);
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "context");
        this.f67469j = C49347td3.m12002a(valueOf2, context5);
        Float valueOf3 = Float.valueOf(6.0f);
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "context");
        this.f67470k = C49347td3.m12002a(valueOf3, context6);
        Float valueOf4 = Float.valueOf(5.0f);
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "context");
        this.f67471l = C49347td3.m12002a(valueOf4, context7);
        Float valueOf5 = Float.valueOf(15.0f);
        Context context8 = getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "context");
        this.f67472m = C49347td3.m12002a(valueOf5, context8);
        this.f67473n = EnumC16553d.OUTSIDE;
        lazy = LazyKt__LazyJVMKt.lazy(new C16554e());
        this.f67474o = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C16555f());
        this.f67475p = lazy2;
        this.f67476q = new RectF();
        Paint paint = new Paint(1);
        Context context9 = getContext();
        int i = C32364Df4.birdNewRoad;
        paint.setColor(NA0.m94301c(context9, i));
        paint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        paint.setLetterSpacing(0.03f);
        this.f67477r = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        this.f67478s = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(0);
        paint3.setStyle(Paint.Style.STROKE);
        m54500c(this, paint3, Color.parseColor("#1A000000"), 0.0f, 2, null);
        this.f67479t = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint4.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        Float valueOf6 = Float.valueOf(3.0f);
        Context context10 = getContext();
        Intrinsics.checkNotNullExpressionValue(context10, "context");
        paint4.setStrokeWidth(C49347td3.m12002a(valueOf6, context10));
        this.f67480u = paint4;
        Paint paint5 = new Paint(1);
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setColor(-1);
        Float valueOf7 = Float.valueOf(2.4f);
        Context context11 = getContext();
        Intrinsics.checkNotNullExpressionValue(context11, "context");
        paint5.setStrokeWidth(C49347td3.m12002a(valueOf7, context11));
        m54500c(this, paint5, Color.parseColor("#40000000"), 0.0f, 2, null);
        this.f67481v = paint5;
        Paint paint6 = new Paint(1);
        paint6.setStrokeWidth(this.f67468i - m54487p());
        this.f67482w = paint6;
        Paint paint7 = new Paint(1);
        paint7.setColor(NA0.m94301c(getContext(), C32364Df4.white));
        Float valueOf8 = Float.valueOf(14.0f);
        Context context12 = getContext();
        Intrinsics.checkNotNullExpressionValue(context12, "context");
        paint7.setTextSize(C49347td3.m11999d(valueOf8, context12));
        this.f67483x = paint7;
        Paint paint8 = new Paint(1);
        paint8.setColor(NA0.m94301c(getContext(), i));
        m54500c(this, paint8, Color.parseColor("#40000000"), 0.0f, 2, null);
        this.f67484y = paint8;
        m54485r(attrs);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PieChart(Context context, AttributeSet attrs, int i) {
        super(context, attrs, i);
        List<C16551b> emptyList;
        Lazy lazy;
        Lazy lazy2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        this.f67462c = C49347td3.m11999d(28, context2);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "context");
        this.f67463d = C49347td3.m11999d(20, context3);
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f67464e = emptyList;
        this.f67465f = 0.7f;
        this.f67466g = 270.0f;
        this.f67467h = EnumC16552c.CLOCKWISE;
        Float valueOf = Float.valueOf(16.0f);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "context");
        this.f67468i = C49347td3.m12002a(valueOf, context4);
        Float valueOf2 = Float.valueOf(45.0f);
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "context");
        this.f67469j = C49347td3.m12002a(valueOf2, context5);
        Float valueOf3 = Float.valueOf(6.0f);
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "context");
        this.f67470k = C49347td3.m12002a(valueOf3, context6);
        Float valueOf4 = Float.valueOf(5.0f);
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "context");
        this.f67471l = C49347td3.m12002a(valueOf4, context7);
        Float valueOf5 = Float.valueOf(15.0f);
        Context context8 = getContext();
        Intrinsics.checkNotNullExpressionValue(context8, "context");
        this.f67472m = C49347td3.m12002a(valueOf5, context8);
        this.f67473n = EnumC16553d.OUTSIDE;
        lazy = LazyKt__LazyJVMKt.lazy(new C16554e());
        this.f67474o = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C16555f());
        this.f67475p = lazy2;
        this.f67476q = new RectF();
        Paint paint = new Paint(1);
        Context context9 = getContext();
        int i2 = C32364Df4.birdNewRoad;
        paint.setColor(NA0.m94301c(context9, i2));
        paint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        paint.setLetterSpacing(0.03f);
        this.f67477r = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        this.f67478s = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(0);
        paint3.setStyle(Paint.Style.STROKE);
        m54500c(this, paint3, Color.parseColor("#1A000000"), 0.0f, 2, null);
        this.f67479t = paint3;
        Paint paint4 = new Paint(1);
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint4.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
        Float valueOf6 = Float.valueOf(3.0f);
        Context context10 = getContext();
        Intrinsics.checkNotNullExpressionValue(context10, "context");
        paint4.setStrokeWidth(C49347td3.m12002a(valueOf6, context10));
        this.f67480u = paint4;
        Paint paint5 = new Paint(1);
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setColor(-1);
        Float valueOf7 = Float.valueOf(2.4f);
        Context context11 = getContext();
        Intrinsics.checkNotNullExpressionValue(context11, "context");
        paint5.setStrokeWidth(C49347td3.m12002a(valueOf7, context11));
        m54500c(this, paint5, Color.parseColor("#40000000"), 0.0f, 2, null);
        this.f67481v = paint5;
        Paint paint6 = new Paint(1);
        paint6.setStrokeWidth(this.f67468i - m54487p());
        this.f67482w = paint6;
        Paint paint7 = new Paint(1);
        paint7.setColor(NA0.m94301c(getContext(), C32364Df4.white));
        Float valueOf8 = Float.valueOf(14.0f);
        Context context12 = getContext();
        Intrinsics.checkNotNullExpressionValue(context12, "context");
        paint7.setTextSize(C49347td3.m11999d(valueOf8, context12));
        this.f67483x = paint7;
        Paint paint8 = new Paint(1);
        paint8.setColor(NA0.m94301c(getContext(), i2));
        m54500c(this, paint8, Color.parseColor("#40000000"), 0.0f, 2, null);
        this.f67484y = paint8;
        m54485r(attrs);
    }
}

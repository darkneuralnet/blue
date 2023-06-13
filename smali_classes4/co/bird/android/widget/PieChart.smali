.class public final Lco/bird/android/widget/PieChart;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/widget/PieChart$a;,
        Lco/bird/android/widget/PieChart$b;,
        Lco/bird/android/widget/PieChart$c;,
        Lco/bird/android/widget/PieChart$d;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0008\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001e\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u0000 \u0097\u00012\u00020\u0001:\u0005\u0098\u0001\"4,B\u0015\u0008\u0016\u0012\u0008\u0010\u0091\u0001\u001a\u00030\u0090\u0001\u00a2\u0006\u0006\u0008\u0092\u0001\u0010\u0093\u0001B\u001d\u0008\u0016\u0012\u0008\u0010\u0091\u0001\u001a\u00030\u0090\u0001\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0006\u0008\u0092\u0001\u0010\u0094\u0001B&\u0008\u0016\u0012\u0008\u0010\u0091\u0001\u001a\u00030\u0090\u0001\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0007\u0010\u0095\u0001\u001a\u00020\u001f\u00a2\u0006\u0006\u0008\u0092\u0001\u0010\u0096\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J4\u0010\u000e\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000c0\u000bH\u0002J4\u0010\u000f\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000c0\u000bH\u0002J4\u0010\u0010\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000c0\u000bH\u0002J6\u0010\u0013\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00022\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000c0\u000bH\u0002J\u001a\u0010\u0015\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u0002H\u0002J*\u0010\u0016\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\tH\u0002J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J0\u0010\u001e\u001a\u00020\u00042\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t0\u001a2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\t0\u001aH\u0002J\u001e\u0010\"\u001a\u00020\u0004*\u00020\u000c2\u0006\u0010 \u001a\u00020\u001f2\u0008\u0008\u0002\u0010!\u001a\u00020\u0002H\u0002J\u000c\u0010#\u001a\u00020\u0002*\u00020\tH\u0002J\u0018\u0010&\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\u001fH\u0014J\u0012\u0010\'\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J&\u0010,\u001a\u00020\u00042\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u0006\u0010)\u001a\u00020(2\u0008\u0008\u0002\u0010+\u001a\u00020*R.\u00103\u001a\u0004\u0018\u00010\u001b2\u0008\u0010-\u001a\u0004\u0018\u00010\u001b8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\"\u0010.\u001a\u0004\u0008/\u00100\"\u0004\u00081\u00102R*\u0010:\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00084\u00105\u001a\u0004\u00086\u00107\"\u0004\u00088\u00109R*\u0010=\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008,\u00105\u001a\u0004\u0008;\u00107\"\u0004\u0008<\u00109R6\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u000c\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008>\u0010?\u001a\u0004\u0008@\u0010A\"\u0004\u0008B\u0010CR*\u0010F\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008#\u00105\u001a\u0004\u0008D\u00107\"\u0004\u0008E\u00109R*\u0010\u0012\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0013\u00105\u001a\u0004\u0008G\u00107\"\u0004\u0008H\u00109R*\u0010O\u001a\u00020I2\u0006\u0010-\u001a\u00020I8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010J\u001a\u0004\u0008K\u0010L\"\u0004\u0008M\u0010NR*\u0010R\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000e\u00105\u001a\u0004\u0008P\u00107\"\u0004\u0008Q\u00109R*\u0010U\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0016\u00105\u001a\u0004\u0008S\u00107\"\u0004\u0008T\u00109R*\u0010X\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0010\u00105\u001a\u0004\u0008V\u00107\"\u0004\u0008W\u00109R*\u0010[\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u00105\u001a\u0004\u0008Y\u00107\"\u0004\u0008Z\u00109R*\u0010_\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\\\u00105\u001a\u0004\u0008]\u00107\"\u0004\u0008^\u00109R$\u0010e\u001a\u00020`2\u0006\u0010-\u001a\u00020`8\u0002@BX\u0082\u000e\u00a2\u0006\u000c\n\u0004\u0008a\u0010b\"\u0004\u0008c\u0010dR#\u0010k\u001a\n g*\u0004\u0018\u00010f0f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008h\u0010i\u001a\u0004\u0008\\\u0010jR\u001b\u0010n\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008l\u0010i\u001a\u0004\u0008a\u0010mR\u0014\u0010r\u001a\u00020o8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008p\u0010qR\u0014\u0010t\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010sR\u0014\u0010v\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008u\u0010sR\u0014\u0010x\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008w\u0010sR\u0014\u0010y\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010sR\u0014\u0010z\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010sR\u0014\u0010|\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008{\u0010sR\u0014\u0010~\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008}\u0010sR\u0015\u0010\u0080\u0001\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u007f\u0010sR\u001c\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0082\u0001\u0010\u0083\u0001R\u0015\u0010\u0085\u0001\u001a\u00020\u00028BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008p\u00107R\'\u0010\u0088\u0001\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\u0008\u0086\u0001\u00107\"\u0005\u0008\u0087\u0001\u00109R&\u0010\u008a\u0001\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028F@FX\u0086\u000e\u00a2\u0006\r\u001a\u0004\u0008l\u00107\"\u0005\u0008\u0089\u0001\u00109R\'\u0010\u008d\u0001\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\u0008\u008b\u0001\u00107\"\u0005\u0008\u008c\u0001\u00109R&\u0010\u008f\u0001\u001a\u00020\u00022\u0006\u0010-\u001a\u00020\u00028F@FX\u0086\u000e\u00a2\u0006\r\u001a\u0004\u0008h\u00107\"\u0005\u0008\u008e\u0001\u00109\u00a8\u0006\u0099\u0001"
    }
    d2 = {
        "Lco/bird/android/widget/PieChart;",
        "Landroid/view/View;",
        "",
        "strokeWidth",
        "",
        "v",
        "Landroid/graphics/Canvas;",
        "canvas",
        "",
        "Lco/bird/android/widget/PieChart$b;",
        "data",
        "Lkotlin/Function1;",
        "Landroid/graphics/Paint;",
        "setupPaint",
        "i",
        "h",
        "k",
        "datum",
        "startDegrees",
        "g",
        "degrees",
        "l",
        "j",
        "Landroid/util/AttributeSet;",
        "attrs",
        "r",
        "",
        "",
        "currentData",
        "newData",
        "u",
        "",
        "shadowColor",
        "alpha",
        "b",
        "f",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "onMeasure",
        "onDraw",
        "",
        "duration",
        "Landroid/view/animation/Interpolator;",
        "interpolator",
        "d",
        "value",
        "Ljava/lang/String;",
        "getTitle",
        "()Ljava/lang/String;",
        "setTitle",
        "(Ljava/lang/String;)V",
        "title",
        "c",
        "F",
        "getMaxTitleSize",
        "()F",
        "setMaxTitleSize",
        "(F)V",
        "maxTitleSize",
        "getMinTitleSize",
        "setMinTitleSize",
        "minTitleSize",
        "e",
        "Ljava/util/List;",
        "getData",
        "()Ljava/util/List;",
        "setData",
        "(Ljava/util/List;)V",
        "getMaxStrokeRatio",
        "setMaxStrokeRatio",
        "maxStrokeRatio",
        "getStartDegrees",
        "setStartDegrees",
        "Lco/bird/android/widget/PieChart$c;",
        "Lco/bird/android/widget/PieChart$c;",
        "getDirection",
        "()Lco/bird/android/widget/PieChart$c;",
        "setDirection",
        "(Lco/bird/android/widget/PieChart$c;)V",
        "direction",
        "getLabelPointerSize",
        "setLabelPointerSize",
        "labelPointerSize",
        "getLabelReservedSpacing",
        "setLabelReservedSpacing",
        "labelReservedSpacing",
        "getLabelPadding",
        "setLabelPadding",
        "labelPadding",
        "getLabelCornerRadius",
        "setLabelCornerRadius",
        "labelCornerRadius",
        "m",
        "getLabelDistance",
        "setLabelDistance",
        "labelDistance",
        "Lco/bird/android/widget/PieChart$d;",
        "n",
        "Lco/bird/android/widget/PieChart$d;",
        "setLabelLocation",
        "(Lco/bird/android/widget/PieChart$d;)V",
        "labelLocation",
        "Landroid/graphics/Bitmap;",
        "kotlin.jvm.PlatformType",
        "o",
        "Lkotlin/Lazy;",
        "()Landroid/graphics/Bitmap;",
        "chartBitmap",
        "p",
        "()Landroid/graphics/Canvas;",
        "chartCanvas",
        "Landroid/graphics/RectF;",
        "q",
        "Landroid/graphics/RectF;",
        "chartRect",
        "Landroid/graphics/Paint;",
        "titlePaint",
        "s",
        "chartPaint",
        "t",
        "shadowPaint",
        "deletePaint",
        "pointerOutlinePaint",
        "w",
        "pointerCenterPaint",
        "x",
        "labelTextPaint",
        "y",
        "labelBackgroundPaint",
        "Landroid/animation/ValueAnimator;",
        "z",
        "Landroid/animation/ValueAnimator;",
        "animator",
        "maxStrokeWidth",
        "getArcGapSize",
        "setArcGapSize",
        "arcGapSize",
        "setLabelPointerStrokeWidth",
        "labelPointerStrokeWidth",
        "getLabelTextSize",
        "setLabelTextSize",
        "labelTextSize",
        "setLabelAlpha",
        "labelAlpha",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "defStyleAttr",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "A",
        "a",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPieChart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PieChart.kt\nco/bird/android/widget/PieChart\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,599:1\n1549#2:600\n1620#2,3:601\n1549#2:604\n1620#2,3:605\n1855#2,2:608\n1855#2,2:610\n1855#2,2:612\n1855#2:614\n1856#2:616\n1855#2,2:617\n1#3:615\n125#4:619\n152#4,3:620\n*S KotlinDebug\n*F\n+ 1 PieChart.kt\nco/bird/android/widget/PieChart\n*L\n319#1:600\n319#1:601,3\n320#1:604\n320#1:605,3\n379#1:608,2\n387#1:610,2\n397#1:612,2\n547#1:614\n547#1:616\n551#1:617,2\n330#1:619\n330#1:620,3\n*E\n"
    }
.end annotation


# static fields
.field public static final A:Lco/bird/android/widget/PieChart$a;


# instance fields
.field public b:Ljava/lang/String;

.field public c:F

.field public d:F

.field public e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/widget/PieChart$b;",
            ">;"
        }
    .end annotation
.end field

.field public f:F

.field public g:F

.field public h:Lco/bird/android/widget/PieChart$c;

.field public i:F

.field public j:F

.field public k:F

.field public l:F

.field public m:F

.field public n:Lco/bird/android/widget/PieChart$d;

.field public final o:Lkotlin/Lazy;

.field public final p:Lkotlin/Lazy;

.field public final q:Landroid/graphics/RectF;

.field public final r:Landroid/graphics/Paint;

.field public final s:Landroid/graphics/Paint;

.field public final t:Landroid/graphics/Paint;

.field public final u:Landroid/graphics/Paint;

.field public final v:Landroid/graphics/Paint;

.field public final w:Landroid/graphics/Paint;

.field public final x:Landroid/graphics/Paint;

.field public final y:Landroid/graphics/Paint;

.field public z:Landroid/animation/ValueAnimator;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/widget/PieChart$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/widget/PieChart$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/widget/PieChart;->A:Lco/bird/android/widget/PieChart$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 10

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/16 p1, 0x1c

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v1}, Ltd3;->d(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p1

    iput p1, p0, Lco/bird/android/widget/PieChart;->c:F

    const/16 p1, 0x14

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v1}, Ltd3;->d(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p1

    iput p1, p0, Lco/bird/android/widget/PieChart;->d:F

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->e:Ljava/util/List;

    const p1, 0x3f333333    # 0.7f

    iput p1, p0, Lco/bird/android/widget/PieChart;->f:F

    const/high16 p1, 0x43870000    # 270.0f

    iput p1, p0, Lco/bird/android/widget/PieChart;->g:F

    sget-object p1, Lco/bird/android/widget/PieChart$c;->b:Lco/bird/android/widget/PieChart$c;

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->h:Lco/bird/android/widget/PieChart$c;

    const/high16 p1, 0x41800000    # 16.0f

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v1}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p1

    iput p1, p0, Lco/bird/android/widget/PieChart;->i:F

    const/high16 p1, 0x42340000    # 45.0f

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v1}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p1

    iput p1, p0, Lco/bird/android/widget/PieChart;->j:F

    const/high16 p1, 0x40c00000    # 6.0f

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v1}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p1

    iput p1, p0, Lco/bird/android/widget/PieChart;->k:F

    const/high16 p1, 0x40a00000    # 5.0f

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v1}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p1

    iput p1, p0, Lco/bird/android/widget/PieChart;->l:F

    const/high16 p1, 0x41700000    # 15.0f

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v1}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p1

    iput p1, p0, Lco/bird/android/widget/PieChart;->m:F

    sget-object p1, Lco/bird/android/widget/PieChart$d;->b:Lco/bird/android/widget/PieChart$d;

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->n:Lco/bird/android/widget/PieChart$d;

    new-instance p1, Lco/bird/android/widget/PieChart$e;

    invoke-direct {p1, p0}, Lco/bird/android/widget/PieChart$e;-><init>(Lco/bird/android/widget/PieChart;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->o:Lkotlin/Lazy;

    new-instance p1, Lco/bird/android/widget/PieChart$f;

    invoke-direct {p1, p0}, Lco/bird/android/widget/PieChart$f;-><init>(Lco/bird/android/widget/PieChart;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->p:Lkotlin/Lazy;

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->q:Landroid/graphics/RectF;

    new-instance p1, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {p1, v1}, Landroid/graphics/Paint;-><init>(I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, LDf4;->birdNewRoad:I

    invoke-static {v2, v3}, LNA0;->c(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v2, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-static {v2, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    const v2, 0x3cf5c28f    # 0.03f

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->r:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v1}, Landroid/graphics/Paint;-><init>(I)V

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->s:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v1}, Landroid/graphics/Paint;-><init>(I)V

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const-string v2, "#1A000000"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x0

    move-object v4, p0

    move-object v5, p1

    invoke-static/range {v4 .. v9}, Lco/bird/android/widget/PieChart;->c(Lco/bird/android/widget/PieChart;Landroid/graphics/Paint;IFILjava/lang/Object;)V

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->t:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v1}, Landroid/graphics/Paint;-><init>(I)V

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance v2, Landroid/graphics/PorterDuffXfermode;

    sget-object v4, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v2, v4}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    const/16 v2, 0xff

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    const/high16 v2, 0x40400000    # 3.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v4}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v2

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->u:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v1}, Landroid/graphics/Paint;-><init>(I)V

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/4 v2, -0x1

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setColor(I)V

    const v2, 0x4019999a    # 2.4f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v4}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v2

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    const-string v2, "#40000000"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    move-object v4, p0

    move-object v5, p1

    invoke-static/range {v4 .. v9}, Lco/bird/android/widget/PieChart;->c(Lco/bird/android/widget/PieChart;Landroid/graphics/Paint;IFILjava/lang/Object;)V

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->v:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v1}, Landroid/graphics/Paint;-><init>(I)V

    iget v4, p0, Lco/bird/android/widget/PieChart;->i:F

    invoke-virtual {p0}, Lco/bird/android/widget/PieChart;->p()F

    move-result v5

    sub-float/2addr v4, v5

    invoke-virtual {p1, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->w:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v1}, Landroid/graphics/Paint;-><init>(I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    sget v5, LDf4;->white:I

    invoke-static {v4, v5}, LNA0;->c(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {p1, v4}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 v4, 0x41600000    # 14.0f

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v5}, Ltd3;->d(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->x:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v1}, Landroid/graphics/Paint;-><init>(I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v3}, LNA0;->c(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    move-object v4, p0

    move-object v5, p1

    invoke-static/range {v4 .. v9}, Lco/bird/android/widget/PieChart;->c(Lco/bird/android/widget/PieChart;Landroid/graphics/Paint;IFILjava/lang/Object;)V

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->y:Landroid/graphics/Paint;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 10

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "attrs"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 p1, 0x1c

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v1}, Ltd3;->d(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p1

    iput p1, p0, Lco/bird/android/widget/PieChart;->c:F

    const/16 p1, 0x14

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v1}, Ltd3;->d(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p1

    iput p1, p0, Lco/bird/android/widget/PieChart;->d:F

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->e:Ljava/util/List;

    const p1, 0x3f333333    # 0.7f

    iput p1, p0, Lco/bird/android/widget/PieChart;->f:F

    const/high16 p1, 0x43870000    # 270.0f

    iput p1, p0, Lco/bird/android/widget/PieChart;->g:F

    sget-object p1, Lco/bird/android/widget/PieChart$c;->b:Lco/bird/android/widget/PieChart$c;

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->h:Lco/bird/android/widget/PieChart$c;

    const/high16 p1, 0x41800000    # 16.0f

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v1}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p1

    iput p1, p0, Lco/bird/android/widget/PieChart;->i:F

    const/high16 p1, 0x42340000    # 45.0f

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v1}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p1

    iput p1, p0, Lco/bird/android/widget/PieChart;->j:F

    const/high16 p1, 0x40c00000    # 6.0f

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v1}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p1

    iput p1, p0, Lco/bird/android/widget/PieChart;->k:F

    const/high16 p1, 0x40a00000    # 5.0f

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v1}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p1

    iput p1, p0, Lco/bird/android/widget/PieChart;->l:F

    const/high16 p1, 0x41700000    # 15.0f

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v1}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p1

    iput p1, p0, Lco/bird/android/widget/PieChart;->m:F

    sget-object p1, Lco/bird/android/widget/PieChart$d;->b:Lco/bird/android/widget/PieChart$d;

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->n:Lco/bird/android/widget/PieChart$d;

    new-instance p1, Lco/bird/android/widget/PieChart$e;

    invoke-direct {p1, p0}, Lco/bird/android/widget/PieChart$e;-><init>(Lco/bird/android/widget/PieChart;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->o:Lkotlin/Lazy;

    new-instance p1, Lco/bird/android/widget/PieChart$f;

    invoke-direct {p1, p0}, Lco/bird/android/widget/PieChart$f;-><init>(Lco/bird/android/widget/PieChart;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->p:Lkotlin/Lazy;

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->q:Landroid/graphics/RectF;

    new-instance p1, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {p1, v1}, Landroid/graphics/Paint;-><init>(I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, LDf4;->birdNewRoad:I

    invoke-static {v2, v3}, LNA0;->c(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v2, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-static {v2, v1}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v2

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    const v2, 0x3cf5c28f    # 0.03f

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->r:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v1}, Landroid/graphics/Paint;-><init>(I)V

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->s:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v1}, Landroid/graphics/Paint;-><init>(I)V

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const-string v2, "#1A000000"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/4 v9, 0x0

    move-object v4, p0

    move-object v5, p1

    invoke-static/range {v4 .. v9}, Lco/bird/android/widget/PieChart;->c(Lco/bird/android/widget/PieChart;Landroid/graphics/Paint;IFILjava/lang/Object;)V

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->t:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v1}, Landroid/graphics/Paint;-><init>(I)V

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance v2, Landroid/graphics/PorterDuffXfermode;

    sget-object v4, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v2, v4}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    const/16 v2, 0xff

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    const/high16 v2, 0x40400000    # 3.0f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v4}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v2

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->u:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v1}, Landroid/graphics/Paint;-><init>(I)V

    sget-object v2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/4 v2, -0x1

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setColor(I)V

    const v2, 0x4019999a    # 2.4f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v4}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v2

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    const-string v2, "#40000000"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    move-object v4, p0

    move-object v5, p1

    invoke-static/range {v4 .. v9}, Lco/bird/android/widget/PieChart;->c(Lco/bird/android/widget/PieChart;Landroid/graphics/Paint;IFILjava/lang/Object;)V

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->v:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v1}, Landroid/graphics/Paint;-><init>(I)V

    iget v4, p0, Lco/bird/android/widget/PieChart;->i:F

    invoke-virtual {p0}, Lco/bird/android/widget/PieChart;->p()F

    move-result v5

    sub-float/2addr v4, v5

    invoke-virtual {p1, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->w:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v1}, Landroid/graphics/Paint;-><init>(I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    sget v5, LDf4;->white:I

    invoke-static {v4, v5}, LNA0;->c(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {p1, v4}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 v4, 0x41600000    # 14.0f

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v5}, Ltd3;->d(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->x:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v1}, Landroid/graphics/Paint;-><init>(I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v3}, LNA0;->c(Landroid/content/Context;I)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v6

    move-object v4, p0

    move-object v5, p1

    invoke-static/range {v4 .. v9}, Lco/bird/android/widget/PieChart;->c(Lco/bird/android/widget/PieChart;Landroid/graphics/Paint;IFILjava/lang/Object;)V

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->y:Landroid/graphics/Paint;

    invoke-virtual {p0, p2}, Lco/bird/android/widget/PieChart;->r(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 9

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "attrs"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p1, 0x1c

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p3}, Ltd3;->d(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p1

    iput p1, p0, Lco/bird/android/widget/PieChart;->c:F

    const/16 p1, 0x14

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p3}, Ltd3;->d(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p1

    iput p1, p0, Lco/bird/android/widget/PieChart;->d:F

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->e:Ljava/util/List;

    const p1, 0x3f333333    # 0.7f

    iput p1, p0, Lco/bird/android/widget/PieChart;->f:F

    const/high16 p1, 0x43870000    # 270.0f

    iput p1, p0, Lco/bird/android/widget/PieChart;->g:F

    sget-object p1, Lco/bird/android/widget/PieChart$c;->b:Lco/bird/android/widget/PieChart$c;

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->h:Lco/bird/android/widget/PieChart$c;

    const/high16 p1, 0x41800000    # 16.0f

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p3}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p1

    iput p1, p0, Lco/bird/android/widget/PieChart;->i:F

    const/high16 p1, 0x42340000    # 45.0f

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p3}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p1

    iput p1, p0, Lco/bird/android/widget/PieChart;->j:F

    const/high16 p1, 0x40c00000    # 6.0f

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p3}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p1

    iput p1, p0, Lco/bird/android/widget/PieChart;->k:F

    const/high16 p1, 0x40a00000    # 5.0f

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p3}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p1

    iput p1, p0, Lco/bird/android/widget/PieChart;->l:F

    const/high16 p1, 0x41700000    # 15.0f

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p3}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p1

    iput p1, p0, Lco/bird/android/widget/PieChart;->m:F

    sget-object p1, Lco/bird/android/widget/PieChart$d;->b:Lco/bird/android/widget/PieChart$d;

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->n:Lco/bird/android/widget/PieChart$d;

    new-instance p1, Lco/bird/android/widget/PieChart$e;

    invoke-direct {p1, p0}, Lco/bird/android/widget/PieChart$e;-><init>(Lco/bird/android/widget/PieChart;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->o:Lkotlin/Lazy;

    new-instance p1, Lco/bird/android/widget/PieChart$f;

    invoke-direct {p1, p0}, Lco/bird/android/widget/PieChart$f;-><init>(Lco/bird/android/widget/PieChart;)V

    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object p1

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->p:Lkotlin/Lazy;

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->q:Landroid/graphics/RectF;

    new-instance p1, Landroid/graphics/Paint;

    const/4 p3, 0x1

    invoke-direct {p1, p3}, Landroid/graphics/Paint;-><init>(I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, LDf4;->birdNewRoad:I

    invoke-static {v1, v2}, LNA0;->c(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v1, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    invoke-static {v1, p3}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;I)Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    const v1, 0x3cf5c28f    # 0.03f

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->r:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, p3}, Landroid/graphics/Paint;-><init>(I)V

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->s:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, p3}, Landroid/graphics/Paint;-><init>(I)V

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const-string v1, "#1A000000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v8, 0x0

    move-object v3, p0

    move-object v4, p1

    invoke-static/range {v3 .. v8}, Lco/bird/android/widget/PieChart;->c(Lco/bird/android/widget/PieChart;Landroid/graphics/Paint;IFILjava/lang/Object;)V

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->t:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, p3}, Landroid/graphics/Paint;-><init>(I)V

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance v1, Landroid/graphics/PorterDuffXfermode;

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v1, v3}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    const/16 v1, 0xff

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setAlpha(I)V

    const/high16 v1, 0x40400000    # 3.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v3}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v1

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->u:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, p3}, Landroid/graphics/Paint;-><init>(I)V

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/4 v1, -0x1

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    const v1, 0x4019999a    # 2.4f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v3}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v1

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    const-string v1, "#40000000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    move-object v3, p0

    move-object v4, p1

    invoke-static/range {v3 .. v8}, Lco/bird/android/widget/PieChart;->c(Lco/bird/android/widget/PieChart;Landroid/graphics/Paint;IFILjava/lang/Object;)V

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->v:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, p3}, Landroid/graphics/Paint;-><init>(I)V

    iget v3, p0, Lco/bird/android/widget/PieChart;->i:F

    invoke-virtual {p0}, Lco/bird/android/widget/PieChart;->p()F

    move-result v4

    sub-float/2addr v3, v4

    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->w:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, p3}, Landroid/graphics/Paint;-><init>(I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, LDf4;->white:I

    invoke-static {v3, v4}, LNA0;->c(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {p1, v3}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 v3, 0x41600000    # 14.0f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v4}, Ltd3;->d(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->x:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, p3}, Landroid/graphics/Paint;-><init>(I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, v2}, LNA0;->c(Landroid/content/Context;I)I

    move-result p3

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v5

    move-object v3, p0

    move-object v4, p1

    invoke-static/range {v3 .. v8}, Lco/bird/android/widget/PieChart;->c(Lco/bird/android/widget/PieChart;Landroid/graphics/Paint;IFILjava/lang/Object;)V

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->y:Landroid/graphics/Paint;

    invoke-virtual {p0, p2}, Lco/bird/android/widget/PieChart;->r(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static synthetic a(Ljava/util/Map;Lco/bird/android/widget/PieChart;Ljava/util/Map;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lco/bird/android/widget/PieChart;->e(Ljava/util/Map;Lco/bird/android/widget/PieChart;Ljava/util/Map;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static final synthetic access$getChartBitmap(Lco/bird/android/widget/PieChart;)Landroid/graphics/Bitmap;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/widget/PieChart;->m()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getChartPaint$p(Lco/bird/android/widget/PieChart;)Landroid/graphics/Paint;
    .locals 0

    iget-object p0, p0, Lco/bird/android/widget/PieChart;->s:Landroid/graphics/Paint;

    return-object p0
.end method

.method public static final synthetic access$getShadowPaint$p(Lco/bird/android/widget/PieChart;)Landroid/graphics/Paint;
    .locals 0

    iget-object p0, p0, Lco/bird/android/widget/PieChart;->t:Landroid/graphics/Paint;

    return-object p0
.end method

.method public static synthetic animateData$default(Lco/bird/android/widget/PieChart;Ljava/util/List;JLandroid/view/animation/Interpolator;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    new-instance p4, Landroid/view/animation/LinearInterpolator;

    invoke-direct {p4}, Landroid/view/animation/LinearInterpolator;-><init>()V

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/android/widget/PieChart;->d(Ljava/util/List;JLandroid/view/animation/Interpolator;)V

    return-void
.end method

.method public static synthetic c(Lco/bird/android/widget/PieChart;Landroid/graphics/Paint;IFILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/high16 p3, 0x3f800000    # 1.0f

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/widget/PieChart;->b(Landroid/graphics/Paint;IF)V

    return-void
.end method

.method public static final e(Ljava/util/Map;Lco/bird/android/widget/PieChart;Ljava/util/Map;Landroid/animation/ValueAnimator;)V
    .locals 17

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "$newDataMap"

    move-object/from16 v3, p0

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "this$0"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "$currentDataMap"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "anim"

    move-object/from16 v4, p3

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-interface/range {p0 .. p0}, Ljava/util/Map;->size()I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface/range {p0 .. p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/high16 v5, 0x43b40000    # 360.0f

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/Map$Entry;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-interface {v6}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Lco/bird/android/widget/PieChart$b;

    invoke-virtual/range {p3 .. p3}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object v6

    const-string v9, "null cannot be cast to non-null type kotlin.Float"

    invoke-static {v6, v9}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v6, Ljava/lang/Float;

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lco/bird/android/widget/PieChart$b;

    const/4 v10, 0x0

    if-eqz v9, :cond_0

    invoke-virtual {v9}, Lco/bird/android/widget/PieChart$b;->c()F

    move-result v9

    goto :goto_1

    :cond_0
    move v9, v10

    :goto_1
    invoke-virtual {v8}, Lco/bird/android/widget/PieChart$b;->c()F

    move-result v11

    sub-float/2addr v11, v9

    mul-float/2addr v11, v6

    add-float/2addr v9, v11

    invoke-static {v9, v10, v5}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v11

    sub-float/2addr v5, v11

    invoke-interface {v1, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lco/bird/android/widget/PieChart$b;

    if-eqz v7, :cond_1

    invoke-virtual {v7}, Lco/bird/android/widget/PieChart$b;->f()F

    move-result v10

    :cond_1
    invoke-virtual {v8}, Lco/bird/android/widget/PieChart$b;->f()F

    move-result v7

    sub-float/2addr v7, v10

    mul-float/2addr v7, v6

    add-float v13, v10, v7

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x2b

    const/16 v16, 0x0

    invoke-static/range {v8 .. v16}, Lco/bird/android/widget/PieChart$b;->copy$default(Lco/bird/android/widget/PieChart$b;Ljava/lang/String;IFIFLjava/lang/String;ILjava/lang/Object;)Lco/bird/android/widget/PieChart$b;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v0, v2}, Lco/bird/android/widget/PieChart;->setData(Ljava/util/List;)V

    return-void
.end method

.method public static final s(I)I
    .locals 0

    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p0

    return p0
.end method

.method public static final t(I)I
    .locals 0

    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final b(Landroid/graphics/Paint;IF)V
    .locals 3

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float v0, p3, v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p2}, Landroid/graphics/Color;->red(I)I

    move-result v0

    invoke-static {p2}, Landroid/graphics/Color;->green(I)I

    move-result v1

    invoke-static {p2}, Landroid/graphics/Color;->blue(I)I

    move-result v2

    invoke-static {p2}, Landroid/graphics/Color;->alpha(I)I

    move-result p2

    int-to-float p2, p2

    mul-float/2addr p3, p2

    float-to-double p2, p3

    invoke-static {p2, p3}, Ljava/lang/Math;->rint(D)D

    move-result-wide p2

    double-to-float p2, p2

    float-to-int p2, p2

    invoke-static {p2, v0, v1, v2}, Landroid/graphics/Color;->argb(IIII)I

    move-result p2

    :goto_1
    const/high16 p3, 0x40c00000    # 6.0f

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v0}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p3

    const/high16 v0, 0x40800000    # 4.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v2}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p1, p3, v1, v0, p2}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    return-void
.end method

.method public final d(Ljava/util/List;JLandroid/view/animation/Interpolator;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/widget/PieChart$b;",
            ">;J",
            "Landroid/view/animation/Interpolator;",
            ")V"
        }
    .end annotation

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "interpolator"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/widget/PieChart;->z:Landroid/animation/ValueAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->cancel()V

    :cond_0
    iget-object v0, p0, Lco/bird/android/widget/PieChart;->e:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/widget/PieChart$b;

    invoke-virtual {v3}, Lco/bird/android/widget/PieChart$b;->d()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/MapsKt;->toMutableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/widget/PieChart$b;

    invoke-virtual {v2}, Lco/bird/android/widget/PieChart$b;->d()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-static {v1}, Lkotlin/collections/MapsKt;->toMap(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    invoke-static {p1}, Lkotlin/collections/MapsKt;->toMutableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lco/bird/android/widget/PieChart;->u(Ljava/util/Map;Ljava/util/Map;)V

    const/4 v1, 0x2

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    invoke-static {v1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object v1

    invoke-virtual {v1, p2, p3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    check-cast p4, Landroid/animation/TimeInterpolator;

    invoke-virtual {v1, p4}, Landroid/animation/ValueAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    new-instance p2, LoT3;

    invoke-direct {p2, p1, p0, v0}, LoT3;-><init>(Ljava/util/Map;Lco/bird/android/widget/PieChart;Ljava/util/Map;)V

    invoke-virtual {v1, p2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    iput-object v1, p0, Lco/bird/android/widget/PieChart;->z:Landroid/animation/ValueAnimator;

    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public final f(Lco/bird/android/widget/PieChart$b;)F
    .locals 2

    iget-object v0, p0, Lco/bird/android/widget/PieChart;->h:Lco/bird/android/widget/PieChart$c;

    sget-object v1, Lco/bird/android/widget/PieChart$c;->b:Lco/bird/android/widget/PieChart$c;

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lco/bird/android/widget/PieChart$b;->c()F

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lco/bird/android/widget/PieChart$b;->c()F

    move-result p1

    neg-float p1, p1

    :goto_0
    return p1
.end method

.method public final g(Landroid/graphics/Canvas;Lco/bird/android/widget/PieChart$b;FLkotlin/jvm/functions/Function1;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Lco/bird/android/widget/PieChart$b;",
            "F",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lco/bird/android/widget/PieChart$b;",
            "+",
            "Landroid/graphics/Paint;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p4, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    move-object v5, p4

    check-cast v5, Landroid/graphics/Paint;

    invoke-virtual {v5}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result p4

    invoke-virtual {p0, p4}, Lco/bird/android/widget/PieChart;->v(F)V

    if-eqz p1, :cond_0

    iget-object v1, p0, Lco/bird/android/widget/PieChart;->q:Landroid/graphics/RectF;

    invoke-virtual {p0, p2}, Lco/bird/android/widget/PieChart;->f(Lco/bird/android/widget/PieChart$b;)F

    move-result v3

    const/4 v4, 0x0

    move-object v0, p1

    move v2, p3

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method public final h(Landroid/graphics/Canvas;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Ljava/util/List<",
            "Lco/bird/android/widget/PieChart$b;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lco/bird/android/widget/PieChart$b;",
            "+",
            "Landroid/graphics/Paint;",
            ">;)V"
        }
    .end annotation

    iget v0, p0, Lco/bird/android/widget/PieChart;->g:F

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/widget/PieChart$b;

    invoke-virtual {p0, p1, v1, v0, p3}, Lco/bird/android/widget/PieChart;->g(Landroid/graphics/Canvas;Lco/bird/android/widget/PieChart$b;FLkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, p1, v0}, Lco/bird/android/widget/PieChart;->l(Landroid/graphics/Canvas;F)V

    invoke-virtual {p0, v1}, Lco/bird/android/widget/PieChart;->f(Lco/bird/android/widget/PieChart$b;)F

    move-result v2

    add-float/2addr v2, v0

    invoke-virtual {p0, p1, v2}, Lco/bird/android/widget/PieChart;->l(Landroid/graphics/Canvas;F)V

    invoke-virtual {p0, v1}, Lco/bird/android/widget/PieChart;->f(Lco/bird/android/widget/PieChart$b;)F

    move-result v1

    add-float/2addr v0, v1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final i(Landroid/graphics/Canvas;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Ljava/util/List<",
            "Lco/bird/android/widget/PieChart$b;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lco/bird/android/widget/PieChart$b;",
            "+",
            "Landroid/graphics/Paint;",
            ">;)V"
        }
    .end annotation

    iget v0, p0, Lco/bird/android/widget/PieChart;->g:F

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/widget/PieChart$b;

    invoke-virtual {p0, p1, v1, v0, p3}, Lco/bird/android/widget/PieChart;->g(Landroid/graphics/Canvas;Lco/bird/android/widget/PieChart$b;FLkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1}, Lco/bird/android/widget/PieChart;->f(Lco/bird/android/widget/PieChart$b;)F

    move-result v1

    add-float/2addr v0, v1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final j(Landroid/graphics/Canvas;FFLco/bird/android/widget/PieChart$b;)V
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    move/from16 v1, p3

    invoke-virtual {v0, v1}, Lco/bird/android/widget/PieChart;->v(F)V

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float v11, v2, v3

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    int-to-float v2, v2

    div-float v12, v2, v3

    move-object/from16 v13, p4

    invoke-virtual {v0, v13}, Lco/bird/android/widget/PieChart;->f(Lco/bird/android/widget/PieChart$b;)F

    move-result v2

    const/4 v3, 0x2

    int-to-float v14, v3

    div-float/2addr v2, v14

    add-float v2, p2, v2

    iget-object v3, v0, Lco/bird/android/widget/PieChart;->q:Landroid/graphics/RectF;

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v3

    div-float/2addr v3, v14

    div-float/2addr v1, v14

    add-float v15, v3, v1

    float-to-double v1, v2

    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->cos(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v1, v15

    add-float v9, v11, v1

    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float v1, v1

    mul-float/2addr v1, v15

    add-float v8, v12, v1

    iget v1, v0, Lco/bird/android/widget/PieChart;->i:F

    div-float/2addr v1, v14

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/widget/PieChart;->p()F

    move-result v2

    div-float/2addr v2, v14

    sub-float/2addr v1, v2

    if-eqz v10, :cond_0

    sub-float v2, v9, v1

    sub-float v3, v8, v1

    add-float v4, v9, v1

    add-float v5, v8, v1

    const/4 v6, 0x0

    const/high16 v7, 0x43b40000    # 360.0f

    const/16 v18, 0x0

    iget-object v1, v0, Lco/bird/android/widget/PieChart;->v:Landroid/graphics/Paint;

    move-object/from16 v19, v1

    move-object/from16 v1, p1

    move/from16 v20, v8

    move/from16 v8, v18

    move v13, v9

    move-object/from16 v9, v19

    invoke-virtual/range {v1 .. v9}, Landroid/graphics/Canvas;->drawArc(FFFFFFZLandroid/graphics/Paint;)V

    goto :goto_0

    :cond_0
    move/from16 v20, v8

    move v13, v9

    :goto_0
    iget-object v1, v0, Lco/bird/android/widget/PieChart;->w:Landroid/graphics/Paint;

    invoke-virtual/range {p4 .. p4}, Lco/bird/android/widget/PieChart$b;->b()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    const/16 v2, 0xff

    int-to-float v3, v2

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/widget/PieChart;->o()F

    move-result v4

    mul-float/2addr v3, v4

    float-to-int v3, v3

    const/4 v4, 0x0

    invoke-static {v3, v4, v2}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    if-eqz v10, :cond_1

    iget v1, v0, Lco/bird/android/widget/PieChart;->i:F

    div-float/2addr v1, v14

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/widget/PieChart;->p()F

    move-result v2

    sub-float/2addr v1, v2

    iget-object v2, v0, Lco/bird/android/widget/PieChart;->w:Landroid/graphics/Paint;

    move/from16 v3, v20

    invoke-virtual {v10, v13, v3, v1, v2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    :cond_1
    iget-object v1, v0, Lco/bird/android/widget/PieChart;->x:Landroid/graphics/Paint;

    invoke-virtual/range {p4 .. p4}, Lco/bird/android/widget/PieChart$b;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v9

    iget v1, v0, Lco/bird/android/widget/PieChart;->k:F

    mul-float/2addr v1, v14

    add-float/2addr v1, v9

    iget-object v2, v0, Lco/bird/android/widget/PieChart;->x:Landroid/graphics/Paint;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getTextSize()F

    move-result v2

    iget v3, v0, Lco/bird/android/widget/PieChart;->k:F

    mul-float/2addr v3, v14

    add-float/2addr v2, v3

    iget v3, v0, Lco/bird/android/widget/PieChart;->m:F

    add-float/2addr v15, v3

    div-float/2addr v1, v14

    add-float/2addr v15, v1

    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->cos(D)D

    move-result-wide v3

    double-to-float v3, v3

    mul-float/2addr v3, v15

    add-float/2addr v11, v3

    invoke-static/range {v16 .. v17}, Ljava/lang/Math;->sin(D)D

    move-result-wide v3

    double-to-float v3, v3

    mul-float/2addr v15, v3

    add-float/2addr v12, v15

    if-eqz v10, :cond_2

    sub-float v3, v11, v1

    div-float/2addr v2, v14

    sub-float v4, v12, v2

    add-float v5, v11, v1

    add-float v6, v12, v2

    iget v7, v0, Lco/bird/android/widget/PieChart;->l:F

    iget-object v8, v0, Lco/bird/android/widget/PieChart;->y:Landroid/graphics/Paint;

    move-object/from16 v1, p1

    move v2, v3

    move v3, v4

    move v4, v5

    move v5, v6

    move v6, v7

    invoke-virtual/range {v1 .. v8}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    :cond_2
    invoke-virtual/range {p4 .. p4}, Lco/bird/android/widget/PieChart$b;->e()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    if-eqz v10, :cond_3

    div-float/2addr v9, v14

    sub-float/2addr v11, v9

    iget-object v2, v0, Lco/bird/android/widget/PieChart;->x:Landroid/graphics/Paint;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getTextSize()F

    move-result v2

    const/4 v3, 0x3

    int-to-float v3, v3

    div-float/2addr v2, v3

    add-float/2addr v12, v2

    iget-object v2, v0, Lco/bird/android/widget/PieChart;->x:Landroid/graphics/Paint;

    invoke-virtual {v10, v1, v11, v12, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_3
    return-void
.end method

.method public final k(Landroid/graphics/Canvas;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Canvas;",
            "Ljava/util/List<",
            "Lco/bird/android/widget/PieChart$b;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lco/bird/android/widget/PieChart$b;",
            "+",
            "Landroid/graphics/Paint;",
            ">;)V"
        }
    .end annotation

    iget v0, p0, Lco/bird/android/widget/PieChart;->g:F

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/widget/PieChart$b;

    invoke-virtual {v1}, Lco/bird/android/widget/PieChart$b;->e()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v2}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v2, 0x1

    :goto_2
    if-nez v2, :cond_2

    iget-object v2, p0, Lco/bird/android/widget/PieChart;->n:Lco/bird/android/widget/PieChart$d;

    sget-object v3, Lco/bird/android/widget/PieChart$d;->b:Lco/bird/android/widget/PieChart$d;

    if-ne v2, v3, :cond_2

    invoke-interface {p3, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Paint;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v2

    invoke-virtual {p0, p1, v0, v2, v1}, Lco/bird/android/widget/PieChart;->j(Landroid/graphics/Canvas;FFLco/bird/android/widget/PieChart$b;)V

    :cond_2
    invoke-virtual {p0, v1}, Lco/bird/android/widget/PieChart;->f(Lco/bird/android/widget/PieChart$b;)F

    move-result v1

    add-float/2addr v0, v1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final l(Landroid/graphics/Canvas;F)V
    .locals 8

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float v3, v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    int-to-float v0, v0

    div-float v4, v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v1

    float-to-double v1, p2

    invoke-static {v1, v2}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Math;->cos(D)D

    move-result-wide v5

    double-to-float p2, v5

    mul-float/2addr p2, v0

    add-float v5, v3, p2

    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    move-result-wide v1

    double-to-float p2, v1

    mul-float/2addr v0, p2

    add-float v6, v4, v0

    if-eqz p1, :cond_0

    iget-object v7, p0, Lco/bird/android/widget/PieChart;->u:Landroid/graphics/Paint;

    move-object v2, p1

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_0
    return-void
.end method

.method public final m()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/PieChart;->o:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final n()Landroid/graphics/Canvas;
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/PieChart;->p:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Canvas;

    return-object v0
.end method

.method public final o()F
    .locals 2

    iget-object v0, p0, Lco/bird/android/widget/PieChart;->y:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x437f0000    # 255.0f

    div-float/2addr v0, v1

    return v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_1

    :cond_0
    invoke-virtual {p0}, Lco/bird/android/widget/PieChart;->q()F

    move-result v0

    invoke-virtual {p0}, Lco/bird/android/widget/PieChart;->m()Landroid/graphics/Bitmap;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/graphics/Bitmap;->eraseColor(I)V

    iget-object v1, p0, Lco/bird/android/widget/PieChart;->e:Ljava/util/List;

    new-instance v3, Lco/bird/android/widget/PieChart$g;

    invoke-direct {v3, p0, v0}, Lco/bird/android/widget/PieChart$g;-><init>(Lco/bird/android/widget/PieChart;F)V

    invoke-virtual {p0, p1, v1, v3}, Lco/bird/android/widget/PieChart;->i(Landroid/graphics/Canvas;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lco/bird/android/widget/PieChart$h;

    invoke-direct {v1, p0, v0}, Lco/bird/android/widget/PieChart$h;-><init>(Lco/bird/android/widget/PieChart;F)V

    invoke-virtual {p0}, Lco/bird/android/widget/PieChart;->n()Landroid/graphics/Canvas;

    move-result-object v0

    iget-object v3, p0, Lco/bird/android/widget/PieChart;->e:Ljava/util/List;

    invoke-virtual {p0, v0, v3, v1}, Lco/bird/android/widget/PieChart;->h(Landroid/graphics/Canvas;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lco/bird/android/widget/PieChart;->m()Landroid/graphics/Bitmap;

    move-result-object v0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {p1, v0, v4, v4, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :cond_1
    iget-object v0, p0, Lco/bird/android/widget/PieChart;->e:Ljava/util/List;

    invoke-virtual {p0, p1, v0, v1}, Lco/bird/android/widget/PieChart;->k(Landroid/graphics/Canvas;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, p0, Lco/bird/android/widget/PieChart;->b:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v3, 0x1

    xor-int/2addr v1, v3

    if-ne v1, v3, :cond_2

    move v2, v3

    :cond_2
    if-eqz v2, :cond_4

    iget-object v1, p0, Lco/bird/android/widget/PieChart;->q:Landroid/graphics/RectF;

    invoke-virtual {v1}, Landroid/graphics/RectF;->width()F

    move-result v1

    iget-object v2, p0, Lco/bird/android/widget/PieChart;->s:Landroid/graphics/Paint;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v2

    sub-float/2addr v1, v2

    const/4 v2, 0x2

    int-to-float v2, v2

    const/4 v3, 0x5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const-string v5, "context"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v4}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v3

    mul-float/2addr v3, v2

    sub-float/2addr v1, v3

    iget-object v3, p0, Lco/bird/android/widget/PieChart;->r:Landroid/graphics/Paint;

    iget v4, p0, Lco/bird/android/widget/PieChart;->c:F

    invoke-virtual {p0}, Landroid/view/View;->getScaleX()F

    move-result v5

    div-float/2addr v4, v5

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    :goto_0
    iget-object v3, p0, Lco/bird/android/widget/PieChart;->r:Landroid/graphics/Paint;

    invoke-virtual {v3, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v3

    cmpl-float v3, v3, v1

    if-lez v3, :cond_3

    iget-object v3, p0, Lco/bird/android/widget/PieChart;->r:Landroid/graphics/Paint;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getTextSize()F

    move-result v3

    iget v4, p0, Lco/bird/android/widget/PieChart;->d:F

    invoke-virtual {p0}, Landroid/view/View;->getScaleX()F

    move-result v5

    div-float/2addr v4, v5

    cmpl-float v3, v3, v4

    if-lez v3, :cond_3

    iget-object v3, p0, Lco/bird/android/widget/PieChart;->r:Landroid/graphics/Paint;

    invoke-virtual {v3}, Landroid/graphics/Paint;->getTextSize()F

    move-result v4

    invoke-virtual {p0}, Landroid/view/View;->getScaleX()F

    move-result v5

    div-float v5, v2, v5

    sub-float/2addr v4, v5

    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setTextSize(F)V

    goto :goto_0

    :cond_3
    iget-object v1, p0, Lco/bird/android/widget/PieChart;->r:Landroid/graphics/Paint;

    iget v3, p0, Lco/bird/android/widget/PieChart;->d:F

    invoke-virtual {p0}, Landroid/view/View;->getScaleX()F

    move-result v4

    div-float/2addr v3, v4

    iget-object v4, p0, Lco/bird/android/widget/PieChart;->r:Landroid/graphics/Paint;

    invoke-virtual {v4}, Landroid/graphics/Paint;->getTextSize()F

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    move-result v3

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    iget-object v1, p0, Lco/bird/android/widget/PieChart;->r:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v1

    iget-object v3, p0, Lco/bird/android/widget/PieChart;->q:Landroid/graphics/RectF;

    iget v4, v3, Landroid/graphics/RectF;->left:F

    invoke-virtual {v3}, Landroid/graphics/RectF;->width()F

    move-result v3

    div-float/2addr v3, v2

    add-float/2addr v4, v3

    iget-object v3, p0, Lco/bird/android/widget/PieChart;->q:Landroid/graphics/RectF;

    iget v5, v3, Landroid/graphics/RectF;->top:F

    invoke-virtual {v3}, Landroid/graphics/RectF;->height()F

    move-result v3

    div-float/2addr v3, v2

    add-float/2addr v5, v3

    if-eqz p1, :cond_4

    div-float/2addr v1, v2

    sub-float/2addr v4, v1

    iget-object v1, p0, Lco/bird/android/widget/PieChart;->r:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v1

    const/4 v2, 0x3

    int-to-float v2, v2

    div-float/2addr v1, v2

    add-float/2addr v5, v1

    iget-object v1, p0, Lco/bird/android/widget/PieChart;->r:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v4, v5, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public onMeasure(II)V
    .locals 2

    invoke-static {p1}, Lco/bird/android/widget/PieChart;->s(I)I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_0

    invoke-static {p2}, Lco/bird/android/widget/PieChart;->s(I)I

    move-result v0

    if-ne v0, v1, :cond_0

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lco/bird/android/widget/PieChart;->s(I)I

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p2}, Lco/bird/android/widget/PieChart;->s(I)I

    move-result v0

    if-nez v0, :cond_1

    const/16 p1, 0xb4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "context"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p2

    float-to-int p2, p2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p1

    float-to-int p1, p1

    invoke-virtual {p0, p2, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lco/bird/android/widget/PieChart;->s(I)I

    move-result v0

    if-ne v0, v1, :cond_2

    invoke-static {p1}, Lco/bird/android/widget/PieChart;->t(I)I

    move-result p2

    invoke-static {p1}, Lco/bird/android/widget/PieChart;->t(I)I

    move-result p1

    invoke-virtual {p0, p2, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    goto :goto_0

    :cond_2
    invoke-static {p2}, Lco/bird/android/widget/PieChart;->s(I)I

    move-result v0

    if-ne v0, v1, :cond_3

    invoke-static {p2}, Lco/bird/android/widget/PieChart;->t(I)I

    move-result p1

    invoke-static {p2}, Lco/bird/android/widget/PieChart;->t(I)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lco/bird/android/widget/PieChart;->t(I)I

    move-result p1

    invoke-static {p2}, Lco/bird/android/widget/PieChart;->t(I)I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p2, p1, Landroid/view/ViewGroup;

    if-eqz p2, :cond_4

    check-cast p1, Landroid/view/ViewGroup;

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    :goto_1
    if-nez p1, :cond_5

    goto :goto_2

    :cond_5
    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    :goto_2
    return-void
.end method

.method public final p()F
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/PieChart;->v:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    return v0
.end method

.method public final q()F
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget v1, p0, Lco/bird/android/widget/PieChart;->j:F

    sub-float/2addr v0, v1

    iget v1, p0, Lco/bird/android/widget/PieChart;->f:F

    mul-float/2addr v0, v1

    return v0
.end method

.method public final r(Landroid/util/AttributeSet;)V
    .locals 21

    move-object/from16 v0, p0

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, LLl4;->PieChart:[I

    move-object/from16 v3, p1

    invoke-virtual {v1, v3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v1

    const-string v2, "context.obtainStyledAttr\u2026rs, R.styleable.PieChart)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, LLl4;->PieChart_android_title:I

    invoke-virtual {v1, v2}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lco/bird/android/widget/PieChart;->setTitle(Ljava/lang/String;)V

    sget v2, LLl4;->PieChart_maxTitleSize:I

    const/16 v3, 0x1c

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const-string v5, "context"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v4}, Ltd3;->d(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Lco/bird/android/widget/PieChart;->setMaxTitleSize(F)V

    sget v2, LLl4;->PieChart_minTitleSize:I

    const/16 v3, 0x14

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v4}, Ltd3;->d(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Lco/bird/android/widget/PieChart;->setMinTitleSize(F)V

    sget v2, LLl4;->PieChart_maxStrokeRatio:I

    const v3, 0x3f333333    # 0.7f

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v2

    const/high16 v3, 0x3f800000    # 1.0f

    const/4 v4, 0x0

    invoke-static {v2, v4, v3}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v2

    invoke-virtual {v0, v2}, Lco/bird/android/widget/PieChart;->setMaxStrokeRatio(F)V

    sget v2, LLl4;->PieChart_startDegrees:I

    const/16 v3, 0x10e

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    int-to-float v2, v2

    const/high16 v3, 0x43b40000    # 360.0f

    invoke-static {v2, v4, v3}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result v2

    invoke-virtual {v0, v2}, Lco/bird/android/widget/PieChart;->setStartDegrees(F)V

    invoke-static {}, Lco/bird/android/widget/PieChart$c;->values()[Lco/bird/android/widget/PieChart$c;

    move-result-object v2

    sget v3, LLl4;->PieChart_fillDirection:I

    const/4 v6, 0x0

    invoke-virtual {v1, v3, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    aget-object v2, v2, v3

    invoke-virtual {v0, v2}, Lco/bird/android/widget/PieChart;->setDirection(Lco/bird/android/widget/PieChart$c;)V

    sget v2, LLl4;->PieChart_arcGapSize:I

    const/high16 v3, 0x40400000    # 3.0f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v3, v7}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v3

    float-to-int v3, v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Lco/bird/android/widget/PieChart;->setArcGapSize(F)V

    sget v2, LLl4;->PieChart_showLabels:I

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    if-eqz v2, :cond_0

    sget v2, LLl4;->PieChart_labelPointerSize:I

    const/high16 v4, 0x41800000    # 16.0f

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v7}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Lco/bird/android/widget/PieChart;->setLabelPointerSize(F)V

    sget v2, LLl4;->PieChart_labelPointerStrokeWidth:I

    const v4, 0x4019999a    # 2.4f

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v7}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Lco/bird/android/widget/PieChart;->setLabelPointerStrokeWidth(F)V

    sget v2, LLl4;->PieChart_labelReservedSpacing:I

    const/high16 v4, 0x42340000    # 45.0f

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v7}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Lco/bird/android/widget/PieChart;->setLabelReservedSpacing(F)V

    sget v2, LLl4;->PieChart_labelPadding:I

    const/high16 v4, 0x40c00000    # 6.0f

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v7}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Lco/bird/android/widget/PieChart;->setLabelPadding(F)V

    sget v2, LLl4;->PieChart_labelTextSize:I

    const/high16 v4, 0x41600000    # 14.0f

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v7}, Ltd3;->d(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Lco/bird/android/widget/PieChart;->setLabelTextSize(F)V

    sget v2, LLl4;->PieChart_labelCornerRadius:I

    const/high16 v4, 0x40a00000    # 5.0f

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v7}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Lco/bird/android/widget/PieChart;->setLabelCornerRadius(F)V

    sget v2, LLl4;->PieChart_labelDistance:I

    const/high16 v4, 0x41700000    # 15.0f

    invoke-static {v4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v7}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v1, v2, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {v0, v2}, Lco/bird/android/widget/PieChart;->setLabelDistance(F)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v4}, Lco/bird/android/widget/PieChart;->setLabelPointerSize(F)V

    invoke-virtual {v0, v4}, Lco/bird/android/widget/PieChart;->setLabelPointerStrokeWidth(F)V

    invoke-virtual {v0, v4}, Lco/bird/android/widget/PieChart;->setLabelReservedSpacing(F)V

    invoke-virtual {v0, v4}, Lco/bird/android/widget/PieChart;->setLabelPadding(F)V

    invoke-virtual {v0, v4}, Lco/bird/android/widget/PieChart;->setLabelTextSize(F)V

    invoke-virtual {v0, v4}, Lco/bird/android/widget/PieChart;->setLabelDistance(F)V

    :goto_0
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->isInEditMode()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x3

    new-array v1, v1, [Lco/bird/android/widget/PieChart$b;

    new-instance v2, Lco/bird/android/widget/PieChart$b;

    const-string v8, "0"

    const/4 v9, 0x0

    const/high16 v10, 0x43870000    # 270.0f

    const-string v4, "#78C887"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v11

    const/high16 v12, 0x3f800000    # 1.0f

    const-string v13, "75"

    move-object v7, v2

    invoke-direct/range {v7 .. v13}, Lco/bird/android/widget/PieChart$b;-><init>(Ljava/lang/String;IFIFLjava/lang/String;)V

    aput-object v2, v1, v6

    new-instance v2, Lco/bird/android/widget/PieChart$b;

    const-string v15, "1"

    const/16 v16, 0x1

    const/high16 v17, 0x41900000    # 18.0f

    const-string v4, "#FC8D8D"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v18

    const v19, 0x3f333333    # 0.7f

    const-string v20, "5"

    move-object v14, v2

    invoke-direct/range {v14 .. v20}, Lco/bird/android/widget/PieChart$b;-><init>(Ljava/lang/String;IFIFLjava/lang/String;)V

    aput-object v2, v1, v3

    new-instance v2, Lco/bird/android/widget/PieChart$b;

    const-string v5, "2"

    const/4 v6, 0x2

    const/high16 v7, 0x42900000    # 72.0f

    const-string v3, "#F4B02B"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    const v9, 0x3f4ccccd    # 0.8f

    const-string v10, "20"

    move-object v4, v2

    invoke-direct/range {v4 .. v10}, Lco/bird/android/widget/PieChart$b;-><init>(Ljava/lang/String;IFIFLjava/lang/String;)V

    const/4 v3, 0x2

    aput-object v2, v1, v3

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lco/bird/android/widget/PieChart;->setData(Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method public final setArcGapSize(F)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/PieChart;->u:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setData(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/widget/PieChart$b;",
            ">;)V"
        }
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->e:Ljava/util/List;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setDirection(Lco/bird/android/widget/PieChart$c;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->h:Lco/bird/android/widget/PieChart$c;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setLabelAlpha(F)V
    .locals 4

    const/16 v0, 0xff

    int-to-float v1, v0

    mul-float/2addr v1, p1

    float-to-int v1, v1

    const/4 v2, 0x0

    invoke-static {v1, v2, v0}, Lkotlin/ranges/RangesKt;->coerceIn(III)I

    move-result v0

    iget-object v1, p0, Lco/bird/android/widget/PieChart;->y:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    const-string v2, "#40000000"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {p0, v1, v3, p1}, Lco/bird/android/widget/PieChart;->b(Landroid/graphics/Paint;IF)V

    iget-object v1, p0, Lco/bird/android/widget/PieChart;->x:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {p0, v1, v3, p1}, Lco/bird/android/widget/PieChart;->b(Landroid/graphics/Paint;IF)V

    iget-object v1, p0, Lco/bird/android/widget/PieChart;->v:Landroid/graphics/Paint;

    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setAlpha(I)V

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p0, v1, v0, p1}, Lco/bird/android/widget/PieChart;->b(Landroid/graphics/Paint;IF)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setLabelCornerRadius(F)V
    .locals 0

    iput p1, p0, Lco/bird/android/widget/PieChart;->l:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setLabelDistance(F)V
    .locals 0

    iput p1, p0, Lco/bird/android/widget/PieChart;->m:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setLabelPadding(F)V
    .locals 0

    iput p1, p0, Lco/bird/android/widget/PieChart;->k:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setLabelPointerSize(F)V
    .locals 0

    iput p1, p0, Lco/bird/android/widget/PieChart;->i:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setLabelPointerStrokeWidth(F)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/PieChart;->v:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setLabelReservedSpacing(F)V
    .locals 0

    iput p1, p0, Lco/bird/android/widget/PieChart;->j:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setLabelTextSize(F)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/PieChart;->x:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setMaxStrokeRatio(F)V
    .locals 0

    iput p1, p0, Lco/bird/android/widget/PieChart;->f:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setMaxTitleSize(F)V
    .locals 0

    iput p1, p0, Lco/bird/android/widget/PieChart;->c:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setMinTitleSize(F)V
    .locals 0

    iput p1, p0, Lco/bird/android/widget/PieChart;->d:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setStartDegrees(F)V
    .locals 0

    iput p1, p0, Lco/bird/android/widget/PieChart;->g:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setTitle(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/widget/PieChart;->b:Ljava/lang/String;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final u(Ljava/util/Map;Ljava/util/Map;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lco/bird/android/widget/PieChart$b;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lco/bird/android/widget/PieChart$b;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/collections/SetsKt;->minus(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/collections/SetsKt;->minus(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lco/bird/android/widget/PieChart$b;

    if-eqz v4, :cond_0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x1b

    const/4 v12, 0x0

    invoke-static/range {v4 .. v12}, Lco/bird/android/widget/PieChart$b;->copy$default(Lco/bird/android/widget/PieChart$b;Ljava/lang/String;IFIFLjava/lang/String;ILjava/lang/Object;)Lco/bird/android/widget/PieChart$b;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-interface {p2, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lco/bird/android/widget/PieChart$b;

    if-eqz v3, :cond_2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/16 v10, 0x3b

    const/4 v11, 0x0

    invoke-static/range {v3 .. v11}, Lco/bird/android/widget/PieChart$b;->copy$default(Lco/bird/android/widget/PieChart$b;Ljava/lang/String;IFIFLjava/lang/String;ILjava/lang/Object;)Lco/bird/android/widget/PieChart$b;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-interface {p1, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    return-void
.end method

.method public final v(F)V
    .locals 7

    iget-object v0, p0, Lco/bird/android/widget/PieChart;->n:Lco/bird/android/widget/PieChart$d;

    sget-object v1, Lco/bird/android/widget/PieChart$d;->b:Lco/bird/android/widget/PieChart$d;

    const/4 v2, 0x0

    if-ne v0, v1, :cond_0

    iget v0, p0, Lco/bird/android/widget/PieChart;->j:F

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    const/high16 v4, 0x40000000    # 2.0f

    if-le v1, v3, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    sub-int/2addr v1, v3

    int-to-float v1, v1

    div-float/2addr v1, v4

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    if-le v3, v5, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    sub-int/2addr v2, v3

    int-to-float v2, v2

    div-float/2addr v2, v4

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    invoke-static {v3, v5}, Ljava/lang/Math;->min(II)I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {p0}, Lco/bird/android/widget/PieChart;->q()F

    move-result v5

    div-float/2addr p1, v4

    sub-float/2addr v5, p1

    iget-object p1, p0, Lco/bird/android/widget/PieChart;->q:Landroid/graphics/RectF;

    add-float v4, v1, v5

    add-float/2addr v4, v0

    add-float v6, v2, v5

    add-float/2addr v6, v0

    add-float/2addr v1, v3

    sub-float/2addr v1, v5

    sub-float/2addr v1, v0

    add-float/2addr v2, v3

    sub-float/2addr v2, v5

    sub-float/2addr v2, v0

    invoke-virtual {p1, v4, v6, v1, v2}, Landroid/graphics/RectF;->set(FFFF)V

    return-void
.end method

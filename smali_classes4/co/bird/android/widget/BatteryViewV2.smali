.class public final Lco/bird/android/widget/BatteryViewV2;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/widget/BatteryViewV2$a;,
        Lco/bird/android/widget/BatteryViewV2$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0018\u0000 U2\u00020\u0001:\u0002\u000b\nB\u0011\u0008\u0016\u0012\u0006\u0010O\u001a\u00020N\u00a2\u0006\u0004\u0008P\u0010QB\u0019\u0008\u0016\u0012\u0006\u0010O\u001a\u00020N\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008P\u0010RB!\u0008\u0016\u0012\u0006\u0010O\u001a\u00020N\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010S\u001a\u00020\u0002\u00a2\u0006\u0004\u0008P\u0010TJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0012\u0010\t\u001a\u00020\u00052\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0014J\u0012\u0010\n\u001a\u00020\u00052\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u0010\u000b\u001a\u00020\u00052\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0002J\u0008\u0010\u000c\u001a\u00020\u0002H\u0002J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0002R*\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\"\u0004\u0008\u0015\u0010\u0016R*\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0018\u0010\u0012\u001a\u0004\u0008\u0019\u0010\u0014\"\u0004\u0008\u001a\u0010\u0016R.\u0010#\u001a\u0004\u0018\u00010\u001c2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u001c8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 \"\u0004\u0008!\u0010\"R*\u0010*\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020$8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010%\u001a\u0004\u0008&\u0010\'\"\u0004\u0008(\u0010)R#\u0010/\u001a\n ,*\u0004\u0018\u00010+0+8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010-\u001a\u0004\u0008\u0018\u0010.R\u001b\u00102\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00080\u0010-\u001a\u0004\u0008\u001d\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00084\u00105R\u0014\u00109\u001a\u0002078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u00108R\u0014\u0010;\u001a\u0002078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u00108R\u0014\u0010=\u001a\u0002038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u00105R\u0014\u0010?\u001a\u0002078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u00108R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008A\u0010BR\u0011\u0010F\u001a\u00020D8F\u00a2\u0006\u0006\u001a\u0004\u00080\u0010ER$\u0010H\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u00084\u0010\u0014\"\u0004\u0008G\u0010\u0016R$\u0010M\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00028F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008I\u0010J\"\u0004\u0008K\u0010L\u00a8\u0006V"
    }
    d2 = {
        "Lco/bird/android/widget/BatteryViewV2;",
        "Landroid/view/View;",
        "",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "",
        "onMeasure",
        "Landroid/graphics/Canvas;",
        "canvas",
        "onDraw",
        "b",
        "a",
        "e",
        "Landroid/util/AttributeSet;",
        "attrs",
        "i",
        "",
        "value",
        "F",
        "getBatteryPadding",
        "()F",
        "setBatteryPadding",
        "(F)V",
        "batteryPadding",
        "c",
        "f",
        "setBatteryLevel",
        "batteryLevel",
        "Landroid/content/res/ColorStateList;",
        "d",
        "Landroid/content/res/ColorStateList;",
        "getBatteryColorStateList",
        "()Landroid/content/res/ColorStateList;",
        "setBatteryColorStateList",
        "(Landroid/content/res/ColorStateList;)V",
        "batteryColorStateList",
        "",
        "Z",
        "getUseGradient",
        "()Z",
        "setUseGradient",
        "(Z)V",
        "useGradient",
        "Landroid/graphics/Bitmap;",
        "kotlin.jvm.PlatformType",
        "Lkotlin/Lazy;",
        "()Landroid/graphics/Bitmap;",
        "batteryBitmap",
        "g",
        "()Landroid/graphics/Canvas;",
        "batteryCanvas",
        "Landroid/graphics/Path;",
        "h",
        "Landroid/graphics/Path;",
        "batteryPath",
        "Landroid/graphics/Paint;",
        "Landroid/graphics/Paint;",
        "batteryPaint",
        "j",
        "erasePaint",
        "k",
        "outlinePath",
        "l",
        "outlinePaint",
        "Landroid/animation/ArgbEvaluator;",
        "m",
        "Landroid/animation/ArgbEvaluator;",
        "colorEvaluator",
        "Lco/bird/android/widget/BatteryViewV2$a;",
        "()Lco/bird/android/widget/BatteryViewV2$a;",
        "batteryState",
        "setOutlineStrokeWidth",
        "outlineStrokeWidth",
        "getOutlineStrokeColor",
        "()I",
        "setOutlineStrokeColor",
        "(I)V",
        "outlineStrokeColor",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "defStyleAttr",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "n",
        "widget_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final n:Lco/bird/android/widget/BatteryViewV2$b;

.field public static final o:Landroid/content/res/ColorStateList;


# instance fields
.field public b:F

.field public c:F

.field public d:Landroid/content/res/ColorStateList;

.field public e:Z

.field public final f:Lkotlin/Lazy;

.field public final g:Lkotlin/Lazy;

.field public final h:Landroid/graphics/Path;

.field public final i:Landroid/graphics/Paint;

.field public final j:Landroid/graphics/Paint;

.field public final k:Landroid/graphics/Path;

.field public final l:Landroid/graphics/Paint;

.field public final m:Landroid/animation/ArgbEvaluator;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v0, Lco/bird/android/widget/BatteryViewV2$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/widget/BatteryViewV2$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/widget/BatteryViewV2;->n:Lco/bird/android/widget/BatteryViewV2$b;

    new-instance v0, Landroid/content/res/ColorStateList;

    const/4 v1, 0x3

    new-array v2, v1, [[I

    const/4 v3, 0x1

    new-array v4, v3, [I

    sget v5, Lsf4;->state_low_battery:I

    const/4 v6, 0x0

    aput v5, v4, v6

    aput-object v4, v2, v6

    new-array v4, v3, [I

    sget v5, Lsf4;->state_medium_battery:I

    aput v5, v4, v6

    aput-object v4, v2, v3

    new-array v4, v3, [I

    sget v5, Lsf4;->state_high_battery:I

    aput v5, v4, v6

    const/4 v5, 0x2

    aput-object v4, v2, v5

    new-array v1, v1, [I

    const-string v4, "#FA5050"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    aput v4, v1, v6

    const-string v4, "#F4B02B"

    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v4

    aput v4, v1, v3

    const-string v3, "#30AA46"

    invoke-static {v3}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v3

    aput v3, v1, v5

    invoke-direct {v0, v2, v1}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    sput-object v0, Lco/bird/android/widget/BatteryViewV2;->o:Landroid/content/res/ColorStateList;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v2

    iput v2, p0, Lco/bird/android/widget/BatteryViewV2;->b:F

    sget-object v2, Lco/bird/android/widget/BatteryViewV2;->o:Landroid/content/res/ColorStateList;

    iput-object v2, p0, Lco/bird/android/widget/BatteryViewV2;->d:Landroid/content/res/ColorStateList;

    new-instance v2, Lco/bird/android/widget/BatteryViewV2$c;

    invoke-direct {v2, p0}, Lco/bird/android/widget/BatteryViewV2$c;-><init>(Lco/bird/android/widget/BatteryViewV2;)V

    invoke-static {v2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v2

    iput-object v2, p0, Lco/bird/android/widget/BatteryViewV2;->f:Lkotlin/Lazy;

    new-instance v2, Lco/bird/android/widget/BatteryViewV2$d;

    invoke-direct {v2, p0}, Lco/bird/android/widget/BatteryViewV2$d;-><init>(Lco/bird/android/widget/BatteryViewV2;)V

    invoke-static {v2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v2

    iput-object v2, p0, Lco/bird/android/widget/BatteryViewV2;->g:Lkotlin/Lazy;

    new-instance v2, Landroid/graphics/Path;

    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    iput-object v2, p0, Lco/bird/android/widget/BatteryViewV2;->h:Landroid/graphics/Path;

    new-instance v2, Landroid/graphics/Paint;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Landroid/graphics/Paint;-><init>(I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    sget v5, LDf4;->birdGreen:I

    invoke-static {v4, v5}, LNA0;->c(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v4, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v4}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v4

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iput-object v2, p0, Lco/bird/android/widget/BatteryViewV2;->i:Landroid/graphics/Paint;

    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2, v3}, Landroid/graphics/Paint;-><init>(I)V

    sget-object v4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance v4, Landroid/graphics/PorterDuffXfermode;

    sget-object v5, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v4, v5}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    const/16 v4, 0xff

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setAlpha(I)V

    int-to-float p1, p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v4}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v1

    mul-float/2addr p1, v1

    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iput-object v2, p0, Lco/bird/android/widget/BatteryViewV2;->j:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lco/bird/android/widget/BatteryViewV2;->k:Landroid/graphics/Path;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v3}, Landroid/graphics/Paint;-><init>(I)V

    const/4 v1, -0x1

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iput-object p1, p0, Lco/bird/android/widget/BatteryViewV2;->l:Landroid/graphics/Paint;

    new-instance p1, Landroid/animation/ArgbEvaluator;

    invoke-direct {p1}, Landroid/animation/ArgbEvaluator;-><init>()V

    iput-object p1, p0, Lco/bird/android/widget/BatteryViewV2;->m:Landroid/animation/ArgbEvaluator;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 6

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "attrs"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v2

    iput v2, p0, Lco/bird/android/widget/BatteryViewV2;->b:F

    sget-object v2, Lco/bird/android/widget/BatteryViewV2;->o:Landroid/content/res/ColorStateList;

    iput-object v2, p0, Lco/bird/android/widget/BatteryViewV2;->d:Landroid/content/res/ColorStateList;

    new-instance v2, Lco/bird/android/widget/BatteryViewV2$c;

    invoke-direct {v2, p0}, Lco/bird/android/widget/BatteryViewV2$c;-><init>(Lco/bird/android/widget/BatteryViewV2;)V

    invoke-static {v2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v2

    iput-object v2, p0, Lco/bird/android/widget/BatteryViewV2;->f:Lkotlin/Lazy;

    new-instance v2, Lco/bird/android/widget/BatteryViewV2$d;

    invoke-direct {v2, p0}, Lco/bird/android/widget/BatteryViewV2$d;-><init>(Lco/bird/android/widget/BatteryViewV2;)V

    invoke-static {v2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v2

    iput-object v2, p0, Lco/bird/android/widget/BatteryViewV2;->g:Lkotlin/Lazy;

    new-instance v2, Landroid/graphics/Path;

    invoke-direct {v2}, Landroid/graphics/Path;-><init>()V

    iput-object v2, p0, Lco/bird/android/widget/BatteryViewV2;->h:Landroid/graphics/Path;

    new-instance v2, Landroid/graphics/Paint;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Landroid/graphics/Paint;-><init>(I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    sget v5, LDf4;->birdGreen:I

    invoke-static {v4, v5}, LNA0;->c(Landroid/content/Context;I)I

    move-result v4

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v4, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v4}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v4

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iput-object v2, p0, Lco/bird/android/widget/BatteryViewV2;->i:Landroid/graphics/Paint;

    new-instance v2, Landroid/graphics/Paint;

    invoke-direct {v2, v3}, Landroid/graphics/Paint;-><init>(I)V

    sget-object v4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance v4, Landroid/graphics/PorterDuffXfermode;

    sget-object v5, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v4, v5}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    const/16 v4, 0xff

    invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setAlpha(I)V

    int-to-float p1, p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v4}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v1

    mul-float/2addr p1, v1

    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iput-object v2, p0, Lco/bird/android/widget/BatteryViewV2;->j:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lco/bird/android/widget/BatteryViewV2;->k:Landroid/graphics/Path;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v3}, Landroid/graphics/Paint;-><init>(I)V

    const/4 v1, -0x1

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iput-object p1, p0, Lco/bird/android/widget/BatteryViewV2;->l:Landroid/graphics/Paint;

    new-instance p1, Landroid/animation/ArgbEvaluator;

    invoke-direct {p1}, Landroid/animation/ArgbEvaluator;-><init>()V

    iput-object p1, p0, Lco/bird/android/widget/BatteryViewV2;->m:Landroid/animation/ArgbEvaluator;

    invoke-virtual {p0, p2}, Lco/bird/android/widget/BatteryViewV2;->i(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "attrs"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v1}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v1

    iput v1, p0, Lco/bird/android/widget/BatteryViewV2;->b:F

    sget-object v1, Lco/bird/android/widget/BatteryViewV2;->o:Landroid/content/res/ColorStateList;

    iput-object v1, p0, Lco/bird/android/widget/BatteryViewV2;->d:Landroid/content/res/ColorStateList;

    new-instance v1, Lco/bird/android/widget/BatteryViewV2$c;

    invoke-direct {v1, p0}, Lco/bird/android/widget/BatteryViewV2$c;-><init>(Lco/bird/android/widget/BatteryViewV2;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, p0, Lco/bird/android/widget/BatteryViewV2;->f:Lkotlin/Lazy;

    new-instance v1, Lco/bird/android/widget/BatteryViewV2$d;

    invoke-direct {v1, p0}, Lco/bird/android/widget/BatteryViewV2$d;-><init>(Lco/bird/android/widget/BatteryViewV2;)V

    invoke-static {v1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    move-result-object v1

    iput-object v1, p0, Lco/bird/android/widget/BatteryViewV2;->g:Lkotlin/Lazy;

    new-instance v1, Landroid/graphics/Path;

    invoke-direct {v1}, Landroid/graphics/Path;-><init>()V

    iput-object v1, p0, Lco/bird/android/widget/BatteryViewV2;->h:Landroid/graphics/Path;

    new-instance v1, Landroid/graphics/Paint;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(I)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, LDf4;->birdGreen:I

    invoke-static {v3, v4}, LNA0;->c(Landroid/content/Context;I)I

    move-result v3

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    sget-object v3, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v3}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v3

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iput-object v1, p0, Lco/bird/android/widget/BatteryViewV2;->i:Landroid/graphics/Paint;

    new-instance v1, Landroid/graphics/Paint;

    invoke-direct {v1, v2}, Landroid/graphics/Paint;-><init>(I)V

    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    new-instance v3, Landroid/graphics/PorterDuffXfermode;

    sget-object v4, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-direct {v3, v4}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;

    const/16 v3, 0xff

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setAlpha(I)V

    int-to-float p1, p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v3}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p3

    mul-float/2addr p1, p3

    invoke-virtual {v1, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iput-object v1, p0, Lco/bird/android/widget/BatteryViewV2;->j:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lco/bird/android/widget/BatteryViewV2;->k:Landroid/graphics/Path;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, v2}, Landroid/graphics/Paint;-><init>(I)V

    const/4 p3, -0x1

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    sget-object p3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/high16 p3, 0x3f000000    # 0.5f

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v1}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p3

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iput-object p1, p0, Lco/bird/android/widget/BatteryViewV2;->l:Landroid/graphics/Paint;

    new-instance p1, Landroid/animation/ArgbEvaluator;

    invoke-direct {p1}, Landroid/animation/ArgbEvaluator;-><init>()V

    iput-object p1, p0, Lco/bird/android/widget/BatteryViewV2;->m:Landroid/animation/ArgbEvaluator;

    invoke-virtual {p0, p2}, Lco/bird/android/widget/BatteryViewV2;->i(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static final synthetic access$getBatteryBitmap(Lco/bird/android/widget/BatteryViewV2;)Landroid/graphics/Bitmap;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/widget/BatteryViewV2;->c()Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static final j(I)I
    .locals 0

    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p0

    return p0
.end method

.method public static final k(I)I
    .locals 0

    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final a(Landroid/graphics/Canvas;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/widget/BatteryViewV2;->c()Landroid/graphics/Bitmap;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/graphics/Bitmap;->eraseColor(I)V

    iget-object v2, v0, Lco/bird/android/widget/BatteryViewV2;->h:Landroid/graphics/Path;

    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    iget v2, v0, Lco/bird/android/widget/BatteryViewV2;->c:F

    const/4 v4, 0x0

    cmpg-float v2, v2, v4

    if-nez v2, :cond_0

    const/4 v3, 0x1

    :cond_0
    if-eqz v3, :cond_1

    return-void

    :cond_1
    iget-object v2, v0, Lco/bird/android/widget/BatteryViewV2;->i:Landroid/graphics/Paint;

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/widget/BatteryViewV2;->e()I

    move-result v3

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    iget v2, v0, Lco/bird/android/widget/BatteryViewV2;->b:F

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/widget/BatteryViewV2;->h()F

    move-result v3

    add-float/2addr v2, v3

    iget v3, v0, Lco/bird/android/widget/BatteryViewV2;->b:F

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/widget/BatteryViewV2;->h()F

    move-result v5

    add-float/2addr v3, v5

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v5

    int-to-float v5, v5

    iget v6, v0, Lco/bird/android/widget/BatteryViewV2;->b:F

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/widget/BatteryViewV2;->h()F

    move-result v7

    add-float/2addr v6, v7

    sub-float/2addr v5, v6

    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    int-to-float v6, v6

    iget v7, v0, Lco/bird/android/widget/BatteryViewV2;->b:F

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/widget/BatteryViewV2;->h()F

    move-result v8

    add-float/2addr v7, v8

    sub-float/2addr v6, v7

    sub-float v7, v5, v3

    iget-object v8, v0, Lco/bird/android/widget/BatteryViewV2;->h:Landroid/graphics/Path;

    invoke-virtual {v8, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    float-to-double v8, v7

    const-wide/high16 v10, 0x4024000000000000L    # 10.0

    invoke-static {v10, v11}, Ljava/lang/Math;->toRadians(D)D

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Math;->sin(D)D

    move-result-wide v10

    mul-double/2addr v8, v10

    double-to-float v8, v8

    sub-float/2addr v6, v2

    iget v9, v0, Lco/bird/android/widget/BatteryViewV2;->c:F

    mul-float/2addr v6, v9

    add-float/2addr v6, v2

    const/high16 v9, 0x3f000000    # 0.5f

    mul-float/2addr v9, v8

    add-float/2addr v6, v9

    const/high16 v9, 0x3d800000    # 0.0625f

    mul-float/2addr v9, v7

    sub-float v10, v6, v9

    iget-object v11, v0, Lco/bird/android/widget/BatteryViewV2;->h:Landroid/graphics/Path;

    invoke-virtual {v11, v10, v3}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v11, v0, Lco/bird/android/widget/BatteryViewV2;->h:Landroid/graphics/Path;

    const v12, 0x3d4ccccd    # 0.05f

    mul-float/2addr v12, v7

    add-float/2addr v12, v10

    const v10, 0x3c83126f    # 0.016f

    mul-float/2addr v10, v7

    add-float v13, v3, v10

    add-float v14, v3, v9

    const v9, 0x3b83126f    # 0.004f

    mul-float/2addr v9, v7

    sub-float v15, v6, v9

    const v9, 0x3da3d70a    # 0.08f

    mul-float/2addr v9, v7

    add-float v16, v3, v9

    move-object v10, v11

    move v11, v12

    move v12, v13

    move v13, v6

    invoke-virtual/range {v10 .. v16}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    sub-float v9, v6, v8

    iget-object v10, v0, Lco/bird/android/widget/BatteryViewV2;->h:Landroid/graphics/Path;

    const v11, 0x3f666666    # 0.9f

    mul-float v12, v8, v11

    sub-float/2addr v6, v12

    mul-float/2addr v11, v7

    add-float/2addr v11, v3

    invoke-virtual {v10, v6, v11}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v6, v0, Lco/bird/android/widget/BatteryViewV2;->h:Landroid/graphics/Path;

    const v10, 0x3cf5c28f    # 0.03f

    mul-float/2addr v10, v8

    add-float/2addr v10, v9

    const v11, 0x3f733333    # 0.95f

    mul-float/2addr v11, v7

    add-float/2addr v11, v3

    const v12, 0x3c23d70a    # 0.01f

    mul-float/2addr v12, v8

    add-float/2addr v12, v9

    const v13, 0x3f7fbe77    # 0.999f

    mul-float/2addr v7, v13

    add-float v13, v3, v7

    const/high16 v7, 0x3e800000    # 0.25f

    mul-float/2addr v8, v7

    sub-float v14, v9, v8

    move-object v7, v6

    move v8, v10

    move v9, v11

    move v10, v12

    move v11, v13

    move v12, v14

    move v13, v5

    invoke-virtual/range {v7 .. v13}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    iget-object v6, v0, Lco/bird/android/widget/BatteryViewV2;->h:Landroid/graphics/Path;

    invoke-virtual {v6, v2, v5}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v5, v0, Lco/bird/android/widget/BatteryViewV2;->h:Landroid/graphics/Path;

    invoke-virtual {v5, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/widget/BatteryViewV2;->d()Landroid/graphics/Canvas;

    move-result-object v2

    iget-object v3, v0, Lco/bird/android/widget/BatteryViewV2;->h:Landroid/graphics/Path;

    iget-object v5, v0, Lco/bird/android/widget/BatteryViewV2;->i:Landroid/graphics/Paint;

    invoke-virtual {v2, v3, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/widget/BatteryViewV2;->d()Landroid/graphics/Canvas;

    move-result-object v2

    iget-object v3, v0, Lco/bird/android/widget/BatteryViewV2;->k:Landroid/graphics/Path;

    invoke-virtual {v2, v3}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/widget/BatteryViewV2;->d()Landroid/graphics/Canvas;

    move-result-object v2

    iget-object v3, v0, Lco/bird/android/widget/BatteryViewV2;->k:Landroid/graphics/Path;

    iget-object v5, v0, Lco/bird/android/widget/BatteryViewV2;->j:Landroid/graphics/Paint;

    invoke-virtual {v2, v3, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    if-eqz v1, :cond_2

    invoke-virtual/range {p0 .. p0}, Lco/bird/android/widget/BatteryViewV2;->c()Landroid/graphics/Bitmap;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v4, v4, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :cond_2
    return-void
.end method

.method public final b(Landroid/graphics/Canvas;)V
    .locals 12

    iget-object v0, p0, Lco/bird/android/widget/BatteryViewV2;->k:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lco/bird/android/widget/BatteryViewV2;->h()F

    move-result v0

    const/4 v1, 0x2

    int-to-float v1, v1

    div-float/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    int-to-float v2, v2

    sub-float v9, v2, v0

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    int-to-float v2, v2

    sub-float v10, v2, v0

    sub-float v11, v10, v0

    div-float v1, v11, v1

    iget-object v2, p0, Lco/bird/android/widget/BatteryViewV2;->k:Landroid/graphics/Path;

    add-float v5, v0, v11

    const/high16 v7, 0x42b40000    # 90.0f

    const/high16 v8, 0x43340000    # 180.0f

    move v3, v0

    move v4, v0

    move v6, v10

    invoke-virtual/range {v2 .. v8}, Landroid/graphics/Path;->addArc(FFFFFF)V

    iget-object v2, p0, Lco/bird/android/widget/BatteryViewV2;->k:Landroid/graphics/Path;

    sub-float v3, v9, v1

    invoke-virtual {v2, v3, v0}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v2, p0, Lco/bird/android/widget/BatteryViewV2;->k:Landroid/graphics/Path;

    sub-float v3, v9, v11

    const/high16 v7, 0x43870000    # 270.0f

    move v5, v9

    invoke-virtual/range {v2 .. v8}, Landroid/graphics/Path;->addArc(FFFFFF)V

    iget-object v2, p0, Lco/bird/android/widget/BatteryViewV2;->k:Landroid/graphics/Path;

    add-float/2addr v0, v1

    invoke-virtual {v2, v0, v10}, Landroid/graphics/Path;->lineTo(FF)V

    :cond_0
    if-eqz p1, :cond_1

    iget-object v0, p0, Lco/bird/android/widget/BatteryViewV2;->k:Landroid/graphics/Path;

    iget-object v1, p0, Lco/bird/android/widget/BatteryViewV2;->l:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    :cond_1
    return-void
.end method

.method public final c()Landroid/graphics/Bitmap;
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/BatteryViewV2;->f:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final d()Landroid/graphics/Canvas;
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/BatteryViewV2;->g:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/graphics/Canvas;

    return-object v0
.end method

.method public final e()I
    .locals 9

    iget-object v0, p0, Lco/bird/android/widget/BatteryViewV2;->d:Landroid/content/res/ColorStateList;

    if-nez v0, :cond_0

    sget-object v0, Lco/bird/android/widget/BatteryViewV2;->o:Landroid/content/res/ColorStateList;

    :cond_0
    iget-boolean v1, p0, Lco/bird/android/widget/BatteryViewV2;->e:Z

    const-string v2, "context"

    if-eqz v1, :cond_6

    iget v1, p0, Lco/bird/android/widget/BatteryViewV2;->c:F

    const v3, 0x3e4ccccd    # 0.2f

    cmpg-float v4, v1, v3

    if-gtz v4, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lco/bird/android/widget/BatteryViewV2$a;->b:Lco/bird/android/widget/BatteryViewV2$a;

    invoke-static {v0, v1, v2}, Lco/bird/android/widget/b;->access$batteryStateColor(Landroid/content/res/ColorStateList;Landroid/content/Context;Lco/bird/android/widget/BatteryViewV2$a;)I

    move-result v0

    goto/16 :goto_2

    :cond_1
    cmpg-float v4, v3, v1

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-gtz v4, :cond_2

    const v4, 0x3f19999a    # 0.6f

    cmpg-float v4, v1, v4

    if-gtz v4, :cond_2

    move v4, v5

    goto :goto_0

    :cond_2
    move v4, v6

    :goto_0
    if-eqz v4, :cond_5

    const/4 v4, 0x2

    int-to-float v4, v4

    const v7, 0x3eccccce    # 0.40000004f

    div-float/2addr v7, v4

    add-float v4, v7, v3

    cmpg-float v8, v3, v1

    if-gtz v8, :cond_3

    cmpg-float v8, v1, v4

    if-gtz v8, :cond_3

    goto :goto_1

    :cond_3
    move v5, v6

    :goto_1
    const-string v6, "null cannot be cast to non-null type kotlin.Int"

    if-eqz v5, :cond_4

    sub-float/2addr v1, v3

    div-float/2addr v1, v7

    iget-object v3, p0, Lco/bird/android/widget/BatteryViewV2;->m:Landroid/animation/ArgbEvaluator;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lco/bird/android/widget/BatteryViewV2$a;->b:Lco/bird/android/widget/BatteryViewV2$a;

    invoke-static {v0, v4, v5}, Lco/bird/android/widget/b;->access$batteryStateColor(Landroid/content/res/ColorStateList;Landroid/content/Context;Lco/bird/android/widget/BatteryViewV2$a;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lco/bird/android/widget/BatteryViewV2$a;->c:Lco/bird/android/widget/BatteryViewV2$a;

    invoke-static {v0, v5, v2}, Lco/bird/android/widget/b;->access$batteryStateColor(Landroid/content/res/ColorStateList;Landroid/content/Context;Lco/bird/android/widget/BatteryViewV2$a;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v1, v4, v0}, Landroid/animation/ArgbEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_2

    :cond_4
    sub-float/2addr v1, v4

    div-float/2addr v1, v7

    iget-object v3, p0, Lco/bird/android/widget/BatteryViewV2;->m:Landroid/animation/ArgbEvaluator;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lco/bird/android/widget/BatteryViewV2$a;->c:Lco/bird/android/widget/BatteryViewV2$a;

    invoke-static {v0, v4, v5}, Lco/bird/android/widget/b;->access$batteryStateColor(Landroid/content/res/ColorStateList;Landroid/content/Context;Lco/bird/android/widget/BatteryViewV2$a;)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lco/bird/android/widget/BatteryViewV2$a;->d:Lco/bird/android/widget/BatteryViewV2$a;

    invoke-static {v0, v5, v2}, Lco/bird/android/widget/b;->access$batteryStateColor(Landroid/content/res/ColorStateList;Landroid/content/Context;Lco/bird/android/widget/BatteryViewV2$a;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v3, v1, v4, v0}, Landroid/animation/ArgbEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_2

    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lco/bird/android/widget/BatteryViewV2$a;->d:Lco/bird/android/widget/BatteryViewV2$a;

    invoke-static {v0, v1, v2}, Lco/bird/android/widget/b;->access$batteryStateColor(Landroid/content/res/ColorStateList;Landroid/content/Context;Lco/bird/android/widget/BatteryViewV2$a;)I

    move-result v0

    goto :goto_2

    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/android/widget/BatteryViewV2;->g()Lco/bird/android/widget/BatteryViewV2$a;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lco/bird/android/widget/b;->access$batteryStateColor(Landroid/content/res/ColorStateList;Landroid/content/Context;Lco/bird/android/widget/BatteryViewV2$a;)I

    move-result v0

    :goto_2
    return v0
.end method

.method public final f()F
    .locals 1

    iget v0, p0, Lco/bird/android/widget/BatteryViewV2;->c:F

    return v0
.end method

.method public final g()Lco/bird/android/widget/BatteryViewV2$a;
    .locals 3

    iget v0, p0, Lco/bird/android/widget/BatteryViewV2;->c:F

    const v1, 0x3e4ccccd    # 0.2f

    cmpg-float v2, v0, v1

    if-gtz v2, :cond_0

    sget-object v0, Lco/bird/android/widget/BatteryViewV2$a;->b:Lco/bird/android/widget/BatteryViewV2$a;

    goto :goto_0

    :cond_0
    cmpg-float v1, v1, v0

    const/4 v2, 0x0

    if-gtz v1, :cond_1

    const v1, 0x3f19999a    # 0.6f

    cmpg-float v0, v0, v1

    if-gtz v0, :cond_1

    const/4 v2, 0x1

    :cond_1
    if-eqz v2, :cond_2

    sget-object v0, Lco/bird/android/widget/BatteryViewV2$a;->c:Lco/bird/android/widget/BatteryViewV2$a;

    goto :goto_0

    :cond_2
    sget-object v0, Lco/bird/android/widget/BatteryViewV2$a;->d:Lco/bird/android/widget/BatteryViewV2$a;

    :goto_0
    return-object v0
.end method

.method public final h()F
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/BatteryViewV2;->l:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    return v0
.end method

.method public final i(Landroid/util/AttributeSet;)V
    .locals 4

    const-string v0, "context"

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget-object v2, LLl4;->BatteryViewV2:[I

    invoke-virtual {v1, p1, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string v1, "context.obtainStyledAttr\u2026.styleable.BatteryViewV2)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    sget v1, LLl4;->BatteryViewV2_battery_level:I

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F

    move-result v1

    invoke-virtual {p0, v1}, Lco/bird/android/widget/BatteryViewV2;->setBatteryLevel(F)V

    sget v1, LLl4;->BatteryViewV2_batteryPadding:I

    const/4 v2, 0x2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v3}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {p0, v1}, Lco/bird/android/widget/BatteryViewV2;->setBatteryPadding(F)V

    sget v1, LLl4;->BatteryViewV2_batteryColorStateList:I

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    if-nez v1, :cond_0

    sget-object v1, Lco/bird/android/widget/BatteryViewV2;->o:Landroid/content/res/ColorStateList;

    :cond_0
    invoke-virtual {p0, v1}, Lco/bird/android/widget/BatteryViewV2;->setBatteryColorStateList(Landroid/content/res/ColorStateList;)V

    sget v1, LLl4;->BatteryViewV2_useGradient:I

    const/4 v2, 0x1

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    invoke-virtual {p0, v1}, Lco/bird/android/widget/BatteryViewV2;->setUseGradient(Z)V

    sget v1, LLl4;->BatteryViewV2_outlineStrokeWidth:I

    const/high16 v2, 0x3f000000    # 0.5f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v3}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p1, v1, v0}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    int-to-float v0, v0

    invoke-virtual {p0, v0}, Lco/bird/android/widget/BatteryViewV2;->setOutlineStrokeWidth(F)V

    sget v0, LLl4;->BatteryViewV2_outlineStrokeColor:I

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lco/bird/android/widget/BatteryViewV2;->setOutlineStrokeColor(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void

    :catchall_0
    move-exception v0

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    throw v0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/widget/BatteryViewV2;->b(Landroid/graphics/Canvas;)V

    invoke-virtual {p0, p1}, Lco/bird/android/widget/BatteryViewV2;->a(Landroid/graphics/Canvas;)V

    return-void
.end method

.method public onMeasure(II)V
    .locals 5

    invoke-static {p1}, Lco/bird/android/widget/BatteryViewV2;->j(I)I

    move-result v0

    const/high16 v1, 0x40000000    # 2.0f

    if-ne v0, v1, :cond_0

    invoke-static {p2}, Lco/bird/android/widget/BatteryViewV2;->j(I)I

    move-result v0

    if-ne v0, v1, :cond_0

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    goto/16 :goto_0

    :cond_0
    invoke-static {p1}, Lco/bird/android/widget/BatteryViewV2;->j(I)I

    move-result v0

    const-string v2, "context"

    const/16 v3, 0x28

    const/16 v4, 0x10

    if-nez v0, :cond_1

    invoke-static {p2}, Lco/bird/android/widget/BatteryViewV2;->j(I)I

    move-result v0

    if-nez v0, :cond_1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p1

    float-to-int p1, p1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p2

    float-to-int p2, p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lco/bird/android/widget/BatteryViewV2;->j(I)I

    move-result v0

    if-ne v0, v1, :cond_2

    invoke-static {p1}, Lco/bird/android/widget/BatteryViewV2;->k(I)I

    move-result p2

    invoke-static {p1}, Lco/bird/android/widget/BatteryViewV2;->k(I)I

    move-result p1

    mul-int/2addr p1, v4

    div-int/2addr p1, v3

    invoke-virtual {p0, p2, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    goto :goto_0

    :cond_2
    invoke-static {p2}, Lco/bird/android/widget/BatteryViewV2;->j(I)I

    move-result p1

    if-ne p1, v1, :cond_3

    invoke-static {p2}, Lco/bird/android/widget/BatteryViewV2;->k(I)I

    move-result p1

    mul-int/2addr p1, v3

    div-int/2addr p1, v4

    invoke-static {p2}, Lco/bird/android/widget/BatteryViewV2;->k(I)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    goto :goto_0

    :cond_3
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p1

    float-to-int p1, p1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p2

    float-to-int p2, p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    :goto_0
    iget-object p1, p0, Lco/bird/android/widget/BatteryViewV2;->k:Landroid/graphics/Path;

    invoke-virtual {p1}, Landroid/graphics/Path;->reset()V

    return-void
.end method

.method public final setBatteryColorStateList(Landroid/content/res/ColorStateList;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/widget/BatteryViewV2;->d:Landroid/content/res/ColorStateList;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setBatteryLevel(F)V
    .locals 2

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {p1, v0, v1}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    move-result p1

    iput p1, p0, Lco/bird/android/widget/BatteryViewV2;->c:F

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setBatteryPadding(F)V
    .locals 2

    iput p1, p0, Lco/bird/android/widget/BatteryViewV2;->b:F

    iget-object v0, p0, Lco/bird/android/widget/BatteryViewV2;->j:Landroid/graphics/Paint;

    const/4 v1, 0x2

    int-to-float v1, v1

    mul-float/2addr v1, p1

    invoke-virtual {p0}, Lco/bird/android/widget/BatteryViewV2;->h()F

    move-result p1

    add-float/2addr v1, p1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setOutlineStrokeColor(I)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/BatteryViewV2;->l:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setOutlineStrokeWidth(F)V
    .locals 3

    iget-object v0, p0, Lco/bird/android/widget/BatteryViewV2;->l:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, Lco/bird/android/widget/BatteryViewV2;->j:Landroid/graphics/Paint;

    const/4 v1, 0x2

    int-to-float v1, v1

    iget v2, p0, Lco/bird/android/widget/BatteryViewV2;->b:F

    mul-float/2addr v1, v2

    add-float/2addr p1, v1

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setUseGradient(Z)V
    .locals 0

    iput-boolean p1, p0, Lco/bird/android/widget/BatteryViewV2;->e:Z

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

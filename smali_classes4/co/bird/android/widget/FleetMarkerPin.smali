.class public final Lco/bird/android/widget/FleetMarkerPin;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/widget/FleetMarkerPin$a;,
        Lco/bird/android/widget/FleetMarkerPin$b;,
        Lco/bird/android/widget/FleetMarkerPin$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u0000 +2\u00020\u0001:\u0002\u000f\u0011B\u0011\u0008\u0016\u0012\u0006\u0010:\u001a\u000209\u00a2\u0006\u0004\u0008;\u0010<B\u0019\u0008\u0016\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008;\u0010=B!\u0008\u0016\u0012\u0006\u0010:\u001a\u000209\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010>\u001a\u00020\u0002\u00a2\u0006\u0004\u0008;\u0010?J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0012\u0010\t\u001a\u00020\u00052\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0014J\u0008\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u000c\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0002J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0002J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0002J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0002J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0002R*\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\"\u0004\u0008\u001a\u0010\u001bR*\u0010#\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u001d8\u0006@FX\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\u001e\u001a\u0004\u0008\u001f\u0010 \"\u0004\u0008!\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010%R\u0014\u0010\'\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010%R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010)R$\u0010/\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008+\u0010,\"\u0004\u0008-\u0010.R$\u00102\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00028F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u00080\u0010,\"\u0004\u00081\u0010.R$\u00108\u001a\u0002032\u0006\u0010\u0016\u001a\u0002038F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u00084\u00105\"\u0004\u00086\u00107\u00a8\u0006@"
    }
    d2 = {
        "Lco/bird/android/widget/FleetMarkerPin;",
        "Landroid/view/View;",
        "",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "",
        "onMeasure",
        "Landroid/graphics/Canvas;",
        "canvas",
        "onDraw",
        "Landroid/view/ViewOutlineProvider;",
        "getOutlineProvider",
        "d",
        "c",
        "e",
        "a",
        "f",
        "b",
        "Landroid/util/AttributeSet;",
        "attrs",
        "h",
        "Lco/bird/android/widget/FleetMarkerPin$b;",
        "value",
        "Lco/bird/android/widget/FleetMarkerPin$b;",
        "getPinStyle",
        "()Lco/bird/android/widget/FleetMarkerPin$b;",
        "setPinStyle",
        "(Lco/bird/android/widget/FleetMarkerPin$b;)V",
        "pinStyle",
        "Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;",
        "Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;",
        "getPinShape",
        "()Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;",
        "setPinShape",
        "(Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;)V",
        "pinShape",
        "Landroid/graphics/Paint;",
        "Landroid/graphics/Paint;",
        "outlinePaint",
        "innerPaint",
        "Landroid/graphics/Path;",
        "Landroid/graphics/Path;",
        "path",
        "g",
        "()I",
        "setColor",
        "(I)V",
        "color",
        "getOutlineColor",
        "setOutlineColor",
        "outlineColor",
        "",
        "getOutlineWidth",
        "()F",
        "setOutlineWidth",
        "(F)V",
        "outlineWidth",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "defStyleAttr",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
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
        "SMAP\nFleetMarkerPin.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FleetMarkerPin.kt\nco/bird/android/widget/FleetMarkerPin\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,381:1\n1#2:382\n*E\n"
    }
.end annotation


# static fields
.field public static final g:Lco/bird/android/widget/FleetMarkerPin$a;


# instance fields
.field public b:Lco/bird/android/widget/FleetMarkerPin$b;

.field public c:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

.field public final d:Landroid/graphics/Paint;

.field public final e:Landroid/graphics/Paint;

.field public final f:Landroid/graphics/Path;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/widget/FleetMarkerPin$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/widget/FleetMarkerPin$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/widget/FleetMarkerPin;->g:Lco/bird/android/widget/FleetMarkerPin$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    sget-object p1, Lco/bird/android/widget/FleetMarkerPin$b;->b:Lco/bird/android/widget/FleetMarkerPin$b;

    iput-object p1, p0, Lco/bird/android/widget/FleetMarkerPin;->b:Lco/bird/android/widget/FleetMarkerPin$b;

    sget-object p1, Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;->CIRCLE:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    iput-object p1, p0, Lco/bird/android/widget/FleetMarkerPin;->c:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setFlags(I)V

    iput-object p1, p0, Lco/bird/android/widget/FleetMarkerPin;->d:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setFlags(I)V

    const/high16 v1, 0x40200000    # 2.5f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v1

    const/high16 v2, 0x3fc00000    # 1.5f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v3}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v0

    const-string v2, "#80000000"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {p1, v1, v3, v0, v2}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    iput-object p1, p0, Lco/bird/android/widget/FleetMarkerPin;->e:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lco/bird/android/widget/FleetMarkerPin;->f:Landroid/graphics/Path;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "attrs"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    sget-object p1, Lco/bird/android/widget/FleetMarkerPin$b;->b:Lco/bird/android/widget/FleetMarkerPin$b;

    iput-object p1, p0, Lco/bird/android/widget/FleetMarkerPin;->b:Lco/bird/android/widget/FleetMarkerPin$b;

    sget-object p1, Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;->CIRCLE:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    iput-object p1, p0, Lco/bird/android/widget/FleetMarkerPin;->c:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    sget-object v1, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setFlags(I)V

    iput-object p1, p0, Lco/bird/android/widget/FleetMarkerPin;->d:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    sget-object v2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setFlags(I)V

    const/high16 v1, 0x40200000    # 2.5f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v1

    const/high16 v2, 0x3fc00000    # 1.5f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v3}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v0

    const-string v2, "#80000000"

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v2

    const/4 v3, 0x0

    invoke-virtual {p1, v1, v3, v0, v2}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    iput-object p1, p0, Lco/bird/android/widget/FleetMarkerPin;->e:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lco/bird/android/widget/FleetMarkerPin;->f:Landroid/graphics/Path;

    invoke-virtual {p0, p2}, Lco/bird/android/widget/FleetMarkerPin;->h(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "attrs"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    sget-object p1, Lco/bird/android/widget/FleetMarkerPin$b;->b:Lco/bird/android/widget/FleetMarkerPin$b;

    iput-object p1, p0, Lco/bird/android/widget/FleetMarkerPin;->b:Lco/bird/android/widget/FleetMarkerPin$b;

    sget-object p1, Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;->CIRCLE:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    iput-object p1, p0, Lco/bird/android/widget/FleetMarkerPin;->c:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    sget-object p3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    const/4 p3, 0x1

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setFlags(I)V

    iput-object p1, p0, Lco/bird/android/widget/FleetMarkerPin;->d:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    sget-object v1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setFlags(I)V

    const/high16 p3, 0x40200000    # 2.5f

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v1}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p3

    const/high16 v1, 0x3fc00000    # 1.5f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v0

    const-string v1, "#80000000"

    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {p1, p3, v2, v0, v1}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    iput-object p1, p0, Lco/bird/android/widget/FleetMarkerPin;->e:Landroid/graphics/Paint;

    new-instance p1, Landroid/graphics/Path;

    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    iput-object p1, p0, Lco/bird/android/widget/FleetMarkerPin;->f:Landroid/graphics/Path;

    invoke-virtual {p0, p2}, Lco/bird/android/widget/FleetMarkerPin;->h(Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static final synthetic access$getPath$p(Lco/bird/android/widget/FleetMarkerPin;)Landroid/graphics/Path;
    .locals 0

    iget-object p0, p0, Lco/bird/android/widget/FleetMarkerPin;->f:Landroid/graphics/Path;

    return-object p0
.end method

.method public static final i(I)I
    .locals 0

    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result p0

    return p0
.end method

.method public static final j(I)I
    .locals 0

    invoke-static {p0}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result p0

    return p0
.end method


# virtual methods
.method public final a(Landroid/graphics/Canvas;)V
    .locals 9

    iget-object v0, p0, Lco/bird/android/widget/FleetMarkerPin;->d:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    const/4 v1, 0x2

    int-to-float v1, v1

    div-float/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v1, v0

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v2

    int-to-float v2, v2

    sub-float v8, v2, v0

    iget-object v7, p0, Lco/bird/android/widget/FleetMarkerPin;->e:Landroid/graphics/Paint;

    move-object v2, p1

    move v3, v0

    move v4, v0

    move v5, v1

    move v6, v8

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawOval(FFFFLandroid/graphics/Paint;)V

    iget-object v7, p0, Lco/bird/android/widget/FleetMarkerPin;->d:Landroid/graphics/Paint;

    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawOval(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final b(Landroid/graphics/Canvas;)V
    .locals 10

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v1, v0

    const/4 v2, 0x2

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v3, v0

    div-float v2, v3, v2

    add-float v9, v1, v0

    add-float/2addr v0, v2

    iget-object v8, p0, Lco/bird/android/widget/FleetMarkerPin;->e:Landroid/graphics/Paint;

    move-object v3, p1

    move v4, v1

    move v5, v2

    move v6, v9

    move v7, v0

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawOval(FFFFLandroid/graphics/Paint;)V

    iget-object v8, p0, Lco/bird/android/widget/FleetMarkerPin;->d:Landroid/graphics/Paint;

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawOval(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final c(Landroid/graphics/Canvas;)V
    .locals 10

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x3f000000    # 0.5f

    mul-float/2addr v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v1

    int-to-float v1, v1

    sub-float/2addr v1, v0

    const/4 v2, 0x2

    int-to-float v2, v2

    div-float/2addr v1, v2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    int-to-float v3, v3

    sub-float/2addr v3, v0

    div-float v2, v3, v2

    add-float v9, v1, v0

    add-float/2addr v0, v2

    iget-object v8, p0, Lco/bird/android/widget/FleetMarkerPin;->e:Landroid/graphics/Paint;

    move-object v3, p1

    move v4, v1

    move v5, v2

    move v6, v9

    move v7, v0

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    iget-object v8, p0, Lco/bird/android/widget/FleetMarkerPin;->d:Landroid/graphics/Paint;

    invoke-virtual/range {v3 .. v8}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public final d(Landroid/graphics/Canvas;)V
    .locals 13

    iget-object v0, p0, Lco/bird/android/widget/FleetMarkerPin;->f:Landroid/graphics/Path;

    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    iget-object v1, p0, Lco/bird/android/widget/FleetMarkerPin;->d:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v1

    const/4 v2, 0x2

    int-to-float v3, v2

    div-float/2addr v1, v3

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    int-to-float v4, v4

    const/high16 v5, 0x40000000    # 2.0f

    div-float/2addr v4, v5

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v6

    int-to-float v6, v6

    sub-float/2addr v6, v1

    invoke-virtual {v0, v4, v6}, Landroid/graphics/Path;->moveTo(FF)V

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v7

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    sub-int/2addr v7, v8

    int-to-float v7, v7

    div-float/2addr v7, v5

    add-float v8, v4, v7

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    int-to-float v9, v9

    div-float/2addr v9, v5

    float-to-double v9, v9

    int-to-double v11, v2

    invoke-static {v9, v10, v11, v12}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v9

    double-to-float v2, v9

    float-to-double v9, v7

    invoke-static {v9, v10, v11, v12}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v9

    double-to-float v9, v9

    sub-float/2addr v2, v9

    float-to-double v9, v2

    invoke-static {v9, v10}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v9

    double-to-float v2, v9

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    int-to-float v9, v9

    div-float/2addr v9, v5

    add-float/2addr v9, v2

    invoke-virtual {v0, v8, v9}, Landroid/graphics/Path;->lineTo(FF)V

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v2, v1

    add-float v5, v9, v1

    invoke-virtual {v0, v2, v5}, Landroid/graphics/Path;->lineTo(FF)V

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    int-to-float v2, v2

    sub-float/2addr v2, v1

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Landroid/graphics/Path;->lineTo(FF)V

    invoke-virtual {v0, v2, v5}, Landroid/graphics/Path;->lineTo(FF)V

    mul-float/2addr v7, v3

    sub-float/2addr v8, v7

    invoke-virtual {v0, v8, v9}, Landroid/graphics/Path;->lineTo(FF)V

    invoke-virtual {v0, v4, v6}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v0, p0, Lco/bird/android/widget/FleetMarkerPin;->f:Landroid/graphics/Path;

    iget-object v1, p0, Lco/bird/android/widget/FleetMarkerPin;->e:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    iget-object v0, p0, Lco/bird/android/widget/FleetMarkerPin;->f:Landroid/graphics/Path;

    iget-object v1, p0, Lco/bird/android/widget/FleetMarkerPin;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final e(Landroid/graphics/Canvas;)V
    .locals 13

    iget-object v8, p0, Lco/bird/android/widget/FleetMarkerPin;->f:Landroid/graphics/Path;

    invoke-virtual {v8}, Landroid/graphics/Path;->reset()V

    iget-object v0, p0, Lco/bird/android/widget/FleetMarkerPin;->d:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    const/4 v1, 0x2

    int-to-float v2, v1

    div-float v3, v0, v2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    int-to-float v0, v0

    const/high16 v4, 0x40000000    # 2.0f

    div-float v9, v0, v4

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    int-to-float v0, v0

    sub-float v10, v0, v3

    invoke-virtual {v8, v9, v10}, Landroid/graphics/Path;->moveTo(FF)V

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v5

    sub-int/2addr v0, v5

    int-to-float v0, v0

    div-float/2addr v0, v4

    add-float v5, v9, v0

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    int-to-float v6, v6

    div-float/2addr v6, v4

    float-to-double v6, v6

    int-to-double v11, v1

    invoke-static {v6, v7, v11, v12}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    double-to-float v1, v6

    float-to-double v6, v0

    invoke-static {v6, v7, v11, v12}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    double-to-float v6, v6

    sub-float/2addr v1, v6

    float-to-double v6, v1

    invoke-static {v6, v7}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v6

    double-to-float v1, v6

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v6

    int-to-float v6, v6

    div-float/2addr v6, v4

    add-float/2addr v6, v1

    invoke-virtual {v8, v5, v6}, Landroid/graphics/Path;->lineTo(FF)V

    div-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->atan(D)D

    move-result-wide v0

    double-to-float v0, v0

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->toDegrees(D)D

    move-result-wide v0

    double-to-float v0, v0

    const/high16 v1, 0x42b40000    # 90.0f

    sub-float v5, v1, v0

    const/high16 v1, 0x43b40000    # 360.0f

    mul-float/2addr v2, v0

    sub-float/2addr v1, v2

    neg-float v6, v1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    int-to-float v0, v0

    sub-float v4, v0, v3

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    int-to-float v0, v0

    sub-float v7, v0, v3

    const/4 v11, 0x0

    move-object v0, v8

    move v1, v3

    move v2, v3

    move v3, v4

    move v4, v7

    move v7, v11

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Path;->arcTo(FFFFFFZ)V

    invoke-virtual {v8, v9, v10}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v0, p0, Lco/bird/android/widget/FleetMarkerPin;->f:Landroid/graphics/Path;

    iget-object v1, p0, Lco/bird/android/widget/FleetMarkerPin;->e:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    iget-object v0, p0, Lco/bird/android/widget/FleetMarkerPin;->f:Landroid/graphics/Path;

    iget-object v1, p0, Lco/bird/android/widget/FleetMarkerPin;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final f(Landroid/graphics/Canvas;)V
    .locals 14

    iget-object v8, p0, Lco/bird/android/widget/FleetMarkerPin;->f:Landroid/graphics/Path;

    invoke-virtual {v8}, Landroid/graphics/Path;->reset()V

    iget-object v0, p0, Lco/bird/android/widget/FleetMarkerPin;->d:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getStrokeWidth()F

    move-result v0

    const/4 v1, 0x2

    int-to-float v1, v1

    div-float v2, v0, v1

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    int-to-float v0, v0

    sub-float/2addr v0, v2

    const/high16 v3, 0x40000000    # 2.0f

    div-float/2addr v0, v3

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    int-to-float v4, v4

    div-float v9, v4, v3

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    int-to-float v3, v3

    sub-float v10, v3, v2

    invoke-virtual {v8, v9, v10}, Landroid/graphics/Path;->moveTo(FF)V

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v3

    mul-int/lit8 v3, v3, 0x7

    int-to-float v3, v3

    const/high16 v4, 0x41100000    # 9.0f

    div-float v11, v3, v4

    float-to-double v3, v0

    const/high16 v5, 0x41700000    # 15.0f

    invoke-static {v5}, Ljp1;->access$getRadians(F)D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Math;->cos(D)D

    move-result-wide v6

    mul-double/2addr v6, v3

    double-to-float v6, v6

    add-float/2addr v6, v0

    invoke-static {v5}, Ljp1;->access$getRadians(F)D

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Math;->sin(D)D

    move-result-wide v12

    mul-double/2addr v3, v12

    double-to-float v3, v3

    add-float/2addr v0, v3

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v3

    mul-int/lit8 v3, v3, 0x7

    int-to-float v3, v3

    const/high16 v12, 0x41000000    # 8.0f

    div-float/2addr v3, v12

    invoke-virtual {v8, v3, v11, v6, v0}, Landroid/graphics/Path;->quadTo(FFFF)V

    const/high16 v0, 0x43340000    # 180.0f

    mul-float/2addr v5, v1

    add-float/2addr v5, v0

    neg-float v6, v5

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    int-to-float v0, v0

    sub-float v3, v0, v2

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v1, v2

    sub-float v4, v0, v1

    const/4 v7, 0x0

    const/high16 v5, 0x41700000    # 15.0f

    move-object v0, v8

    move v1, v2

    invoke-virtual/range {v0 .. v7}, Landroid/graphics/Path;->arcTo(FFFFFFZ)V

    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    int-to-float v0, v0

    div-float/2addr v0, v12

    invoke-virtual {v8, v0, v11, v9, v10}, Landroid/graphics/Path;->quadTo(FFFF)V

    iget-object v0, p0, Lco/bird/android/widget/FleetMarkerPin;->f:Landroid/graphics/Path;

    iget-object v1, p0, Lco/bird/android/widget/FleetMarkerPin;->e:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    iget-object v0, p0, Lco/bird/android/widget/FleetMarkerPin;->f:Landroid/graphics/Path;

    iget-object v1, p0, Lco/bird/android/widget/FleetMarkerPin;->d:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    return-void
.end method

.method public final g()I
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/FleetMarkerPin;->e:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    move-result v0

    return v0
.end method

.method public getOutlineProvider()Landroid/view/ViewOutlineProvider;
    .locals 1

    new-instance v0, Lco/bird/android/widget/FleetMarkerPin$d;

    invoke-direct {v0, p0}, Lco/bird/android/widget/FleetMarkerPin$d;-><init>(Lco/bird/android/widget/FleetMarkerPin;)V

    return-object v0
.end method

.method public final h(Landroid/util/AttributeSet;)V
    .locals 5

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, LLl4;->FleetMarkerPin:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string v0, "context.obtainStyledAttr\u2026styleable.FleetMarkerPin)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Lco/bird/android/widget/FleetMarkerPin;->d:Landroid/graphics/Paint;

    sget v1, LLl4;->FleetMarkerPin_outlineStrokeWidth:I

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "context"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2, v3}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result v2

    float-to-int v2, v2

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    iget-object v0, p0, Lco/bird/android/widget/FleetMarkerPin;->d:Landroid/graphics/Paint;

    sget v1, LLl4;->FleetMarkerPin_outlineColor:I

    const/4 v2, -0x1

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v0, p0, Lco/bird/android/widget/FleetMarkerPin;->e:Landroid/graphics/Paint;

    sget v1, LLl4;->FleetMarkerPin_android_color:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-static {}, Lco/bird/android/widget/FleetMarkerPin$b;->values()[Lco/bird/android/widget/FleetMarkerPin$b;

    move-result-object v0

    sget v1, LLl4;->FleetMarkerPin_pinStyle:I

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lco/bird/android/widget/FleetMarkerPin;->setPinStyle(Lco/bird/android/widget/FleetMarkerPin$b;)V

    invoke-static {}, Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;->values()[Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    move-result-object v0

    sget v1, LLl4;->FleetMarkerPin_pinShape:I

    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    aget-object v0, v0, v1

    invoke-virtual {p0, v0}, Lco/bird/android/widget/FleetMarkerPin;->setPinShape(Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;)V
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
    .locals 6

    iget-object v0, p0, Lco/bird/android/widget/FleetMarkerPin;->b:Lco/bird/android/widget/FleetMarkerPin$b;

    sget-object v1, Lco/bird/android/widget/FleetMarkerPin$c;->$EnumSwitchMapping$1:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x4

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eq v0, v4, :cond_4

    if-eq v0, v3, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/widget/FleetMarkerPin;->c:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    sget-object v3, Lco/bird/android/widget/FleetMarkerPin$c;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v3, v0

    if-eq v0, v4, :cond_3

    if-eq v0, v2, :cond_2

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_9

    invoke-virtual {p0, p1}, Lco/bird/android/widget/FleetMarkerPin;->c(Landroid/graphics/Canvas;)V

    goto :goto_0

    :cond_2
    if-eqz p1, :cond_9

    invoke-virtual {p0, p1}, Lco/bird/android/widget/FleetMarkerPin;->b(Landroid/graphics/Canvas;)V

    goto :goto_0

    :cond_3
    if-eqz p1, :cond_9

    invoke-virtual {p0, p1}, Lco/bird/android/widget/FleetMarkerPin;->b(Landroid/graphics/Canvas;)V

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lco/bird/android/widget/FleetMarkerPin;->c:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    sget-object v5, Lco/bird/android/widget/FleetMarkerPin$c;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v5, v0

    if-eq v0, v4, :cond_8

    if-eq v0, v3, :cond_7

    if-eq v0, v2, :cond_6

    if-eq v0, v1, :cond_5

    goto :goto_0

    :cond_5
    if-eqz p1, :cond_9

    invoke-virtual {p0, p1}, Lco/bird/android/widget/FleetMarkerPin;->d(Landroid/graphics/Canvas;)V

    goto :goto_0

    :cond_6
    if-eqz p1, :cond_9

    invoke-virtual {p0, p1}, Lco/bird/android/widget/FleetMarkerPin;->e(Landroid/graphics/Canvas;)V

    goto :goto_0

    :cond_7
    if-eqz p1, :cond_9

    invoke-virtual {p0, p1}, Lco/bird/android/widget/FleetMarkerPin;->a(Landroid/graphics/Canvas;)V

    goto :goto_0

    :cond_8
    if-eqz p1, :cond_9

    invoke-virtual {p0, p1}, Lco/bird/android/widget/FleetMarkerPin;->f(Landroid/graphics/Canvas;)V

    :cond_9
    :goto_0
    return-void
.end method

.method public onMeasure(II)V
    .locals 4

    iget-object v0, p0, Lco/bird/android/widget/FleetMarkerPin;->c:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    sget-object v1, Lco/bird/android/widget/FleetMarkerPin$c;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    const/16 v2, 0x28

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    const/16 v0, 0x2e

    goto :goto_0

    :cond_0
    move v0, v2

    goto :goto_0

    :cond_1
    const/16 v0, 0x31

    :goto_0
    invoke-static {p1}, Lco/bird/android/widget/FleetMarkerPin;->i(I)I

    move-result v1

    const/high16 v3, 0x40000000    # 2.0f

    if-ne v1, v3, :cond_2

    invoke-static {p2}, Lco/bird/android/widget/FleetMarkerPin;->i(I)I

    move-result v1

    if-ne v1, v3, :cond_2

    invoke-super {p0, p1, p2}, Landroid/view/View;->onMeasure(II)V

    goto/16 :goto_1

    :cond_2
    invoke-static {p1}, Lco/bird/android/widget/FleetMarkerPin;->i(I)I

    move-result v1

    if-nez v1, :cond_3

    invoke-static {p2}, Lco/bird/android/widget/FleetMarkerPin;->i(I)I

    move-result v1

    if-nez v1, :cond_3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p2

    const-string v1, "context"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p1

    float-to-int p1, p1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Ltd3;->a(Ljava/lang/Number;Landroid/content/Context;)F

    move-result p2

    float-to-int p2, p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lco/bird/android/widget/FleetMarkerPin;->i(I)I

    move-result v1

    if-ne v1, v3, :cond_4

    int-to-float p2, v0

    int-to-float v0, v2

    div-float/2addr p2, v0

    invoke-static {p1}, Lco/bird/android/widget/FleetMarkerPin;->j(I)I

    move-result v0

    invoke-static {p1}, Lco/bird/android/widget/FleetMarkerPin;->j(I)I

    move-result p1

    int-to-float p1, p1

    mul-float/2addr p1, p2

    float-to-int p1, p1

    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lco/bird/android/widget/FleetMarkerPin;->i(I)I

    move-result v1

    if-ne v1, v3, :cond_5

    int-to-float p1, v2

    int-to-float v0, v0

    div-float/2addr p1, v0

    invoke-static {p2}, Lco/bird/android/widget/FleetMarkerPin;->j(I)I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p1

    float-to-int p1, v0

    invoke-static {p2}, Lco/bird/android/widget/FleetMarkerPin;->j(I)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    goto :goto_1

    :cond_5
    invoke-static {p1}, Lco/bird/android/widget/FleetMarkerPin;->j(I)I

    move-result v1

    invoke-static {p2}, Lco/bird/android/widget/FleetMarkerPin;->j(I)I

    move-result v3

    if-ge v1, v3, :cond_6

    int-to-float p2, v0

    int-to-float v0, v2

    div-float/2addr p2, v0

    invoke-static {p1}, Lco/bird/android/widget/FleetMarkerPin;->j(I)I

    move-result v0

    invoke-static {p1}, Lco/bird/android/widget/FleetMarkerPin;->j(I)I

    move-result p1

    int-to-float p1, p1

    mul-float/2addr p1, p2

    float-to-int p1, p1

    invoke-virtual {p0, v0, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    goto :goto_1

    :cond_6
    int-to-float p1, v2

    int-to-float v0, v0

    div-float/2addr p1, v0

    invoke-static {p2}, Lco/bird/android/widget/FleetMarkerPin;->j(I)I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p1

    float-to-int p1, v0

    invoke-static {p2}, Lco/bird/android/widget/FleetMarkerPin;->j(I)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    instance-of p2, p1, Landroid/view/ViewGroup;

    if-eqz p2, :cond_7

    check-cast p1, Landroid/view/ViewGroup;

    goto :goto_2

    :cond_7
    const/4 p1, 0x0

    :goto_2
    if-nez p1, :cond_8

    goto :goto_3

    :cond_8
    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    :goto_3
    return-void
.end method

.method public final setColor(I)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/FleetMarkerPin;->e:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setOutlineColor(I)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/FleetMarkerPin;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setOutlineWidth(F)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/FleetMarkerPin;->d:Landroid/graphics/Paint;

    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

.method public final setPinShape(Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/widget/FleetMarkerPin;->c:Lco/bird/android/model/persistence/nestedstructures/FleetMarkerPinShape;

    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public final setPinStyle(Lco/bird/android/widget/FleetMarkerPin$b;)V
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/widget/FleetMarkerPin;->b:Lco/bird/android/widget/FleetMarkerPin$b;

    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    return-void
.end method

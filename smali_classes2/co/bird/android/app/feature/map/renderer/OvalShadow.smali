.class public final Lco/bird/android/app/feature/map/renderer/OvalShadow;
.super Landroid/graphics/drawable/shapes/OvalShape;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u000c2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0016J\u0018\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0006H\u0014J\u0010\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u0003H\u0002R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"
    }
    d2 = {
        "Lco/bird/android/app/feature/map/renderer/OvalShadow;",
        "Landroid/graphics/drawable/shapes/OvalShape;",
        "width",
        "",
        "height",
        "shadowRadius",
        "",
        "shadowColor",
        "shadowPaint",
        "Landroid/graphics/Paint;",
        "(IIFILandroid/graphics/Paint;)V",
        "draw",
        "",
        "canvas",
        "Landroid/graphics/Canvas;",
        "paint",
        "onResize",
        "updateRadialGradient",
        "diameter",
        "co.bird.android.feature.map"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final height:I

.field private final shadowColor:I

.field private final shadowPaint:Landroid/graphics/Paint;

.field private final shadowRadius:F

.field private final width:I


# direct methods
.method public constructor <init>(IIFILandroid/graphics/Paint;)V
    .locals 1

    const-string v0, "shadowPaint"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Landroid/graphics/drawable/shapes/OvalShape;-><init>()V

    iput p1, p0, Lco/bird/android/app/feature/map/renderer/OvalShadow;->width:I

    iput p2, p0, Lco/bird/android/app/feature/map/renderer/OvalShadow;->height:I

    iput p3, p0, Lco/bird/android/app/feature/map/renderer/OvalShadow;->shadowRadius:F

    iput p4, p0, Lco/bird/android/app/feature/map/renderer/OvalShadow;->shadowColor:I

    iput-object p5, p0, Lco/bird/android/app/feature/map/renderer/OvalShadow;->shadowPaint:Landroid/graphics/Paint;

    invoke-virtual {p0}, Landroid/graphics/drawable/shapes/RectShape;->rect()Landroid/graphics/RectF;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    move-result p1

    float-to-int p1, p1

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/OvalShadow;->updateRadialGradient(I)V

    return-void
.end method

.method public synthetic constructor <init>(IIFILandroid/graphics/Paint;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    new-instance p5, Landroid/graphics/Paint;

    invoke-direct {p5}, Landroid/graphics/Paint;-><init>()V

    :cond_0
    move-object v5, p5

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lco/bird/android/app/feature/map/renderer/OvalShadow;-><init>(IIFILandroid/graphics/Paint;)V

    return-void
.end method

.method private final updateRadialGradient(I)V
    .locals 9

    iget-object v0, p0, Lco/bird/android/app/feature/map/renderer/OvalShadow;->shadowPaint:Landroid/graphics/Paint;

    new-instance v8, Landroid/graphics/RadialGradient;

    int-to-float p1, p1

    const/high16 v1, 0x40000000    # 2.0f

    div-float v3, p1, v1

    iget v4, p0, Lco/bird/android/app/feature/map/renderer/OvalShadow;->shadowRadius:F

    const/4 p1, 0x2

    new-array v5, p1, [I

    iget p1, p0, Lco/bird/android/app/feature/map/renderer/OvalShadow;->shadowColor:I

    const/4 v1, 0x0

    aput p1, v5, v1

    const/4 p1, 0x1

    aput v1, v5, p1

    const/4 v6, 0x0

    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    move-object v1, v8

    move v2, v3

    invoke-direct/range {v1 .. v7}, Landroid/graphics/RadialGradient;-><init>(FFF[I[FLandroid/graphics/Shader$TileMode;)V

    invoke-virtual {v0, v8}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    return-void
.end method


# virtual methods
.method public draw(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V
    .locals 3

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paint"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lco/bird/android/app/feature/map/renderer/OvalShadow;->width:I

    int-to-float v0, v0

    const/high16 v1, 0x40000000    # 2.0f

    div-float/2addr v0, v1

    iget v2, p0, Lco/bird/android/app/feature/map/renderer/OvalShadow;->height:I

    int-to-float v2, v2

    div-float/2addr v2, v1

    iget-object v1, p0, Lco/bird/android/app/feature/map/renderer/OvalShadow;->shadowPaint:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v2, v0, v1}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    iget v1, p0, Lco/bird/android/app/feature/map/renderer/OvalShadow;->shadowRadius:F

    sub-float v1, v0, v1

    invoke-virtual {p1, v0, v2, v1, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    return-void
.end method

.method public onResize(FF)V
    .locals 0

    invoke-super {p0, p1, p2}, Landroid/graphics/drawable/shapes/Shape;->onResize(FF)V

    float-to-int p1, p1

    invoke-direct {p0, p1}, Lco/bird/android/app/feature/map/renderer/OvalShadow;->updateRadialGradient(I)V

    return-void
.end method

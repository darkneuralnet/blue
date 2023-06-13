.class public final Lco/bird/android/widget/scan/a;
.super Lco/bird/android/widget/scan/GraphicOverlay$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/widget/scan/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0005B+\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u001a\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u001e"
    }
    d2 = {
        "Lco/bird/android/widget/scan/a;",
        "Lco/bird/android/widget/scan/GraphicOverlay$a;",
        "Landroid/graphics/Canvas;",
        "canvas",
        "",
        "a",
        "Landroid/graphics/Rect;",
        "b",
        "Landroid/graphics/Rect;",
        "rect",
        "",
        "c",
        "I",
        "strokeColor",
        "",
        "d",
        "F",
        "getWidth",
        "()F",
        "width",
        "Landroid/graphics/Paint;",
        "e",
        "Landroid/graphics/Paint;",
        "rectPaint",
        "Lco/bird/android/widget/scan/GraphicOverlay;",
        "overlay",
        "strokeWidth",
        "<init>",
        "(Lco/bird/android/widget/scan/GraphicOverlay;Landroid/graphics/Rect;IF)V",
        "f",
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
        "SMAP\nBoundingBoxGraphic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoundingBoxGraphic.kt\nco/bird/android/widget/scan/BoundingBoxGraphic\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,57:1\n1#2:58\n*E\n"
    }
.end annotation


# static fields
.field public static final f:Lco/bird/android/widget/scan/a$a;


# instance fields
.field public final b:Landroid/graphics/Rect;

.field public final c:I

.field public final d:F

.field public final e:Landroid/graphics/Paint;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lco/bird/android/widget/scan/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lco/bird/android/widget/scan/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lco/bird/android/widget/scan/a;->f:Lco/bird/android/widget/scan/a$a;

    return-void
.end method

.method public constructor <init>(Lco/bird/android/widget/scan/GraphicOverlay;Landroid/graphics/Rect;IF)V
    .locals 1

    const-string v0, "overlay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lco/bird/android/widget/scan/GraphicOverlay$a;-><init>(Lco/bird/android/widget/scan/GraphicOverlay;)V

    iput-object p2, p0, Lco/bird/android/widget/scan/a;->b:Landroid/graphics/Rect;

    iput p3, p0, Lco/bird/android/widget/scan/a;->c:I

    iput p4, p0, Lco/bird/android/widget/scan/a;->d:F

    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    invoke-virtual {p1, p4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    const/16 p2, 0x8c

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAlpha(I)V

    invoke-virtual {p0}, Lco/bird/android/widget/scan/GraphicOverlay$a;->b()V

    iput-object p1, p0, Lco/bird/android/widget/scan/a;->e:Landroid/graphics/Paint;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/widget/scan/GraphicOverlay;Landroid/graphics/Rect;IFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    const/high16 p4, 0x40000000    # 2.0f

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/android/widget/scan/a;-><init>(Lco/bird/android/widget/scan/GraphicOverlay;Landroid/graphics/Rect;IF)V

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Canvas;)V
    .locals 2

    const-string v0, "BoundingBoxGraphic"

    const-string v1, "on draw bounding box graphic"

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lco/bird/android/widget/scan/a;->b:Landroid/graphics/Rect;

    if-eqz v0, :cond_1

    if-eqz p1, :cond_0

    iget-object v1, p0, Lco/bird/android/widget/scan/a;->e:Landroid/graphics/Paint;

    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/Rect;Landroid/graphics/Paint;)V

    :cond_0
    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Attempting to draw a null box."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

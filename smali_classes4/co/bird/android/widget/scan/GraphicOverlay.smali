.class public final Lco/bird/android/widget/scan/GraphicOverlay;
.super Landroid/view/View;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/widget/scan/GraphicOverlay$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0007\n\u0002\u0010#\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001:\u0001\u0006B\u001b\u0012\u0008\u0010!\u001a\u0004\u0018\u00010 \u0012\u0008\u0010#\u001a\u0004\u0018\u00010\"\u00a2\u0006\u0004\u0008$\u0010%J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000cH\u0014R\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0010R\u0016\u0010\u0008\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0013R\u0016\u0010\u001a\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u0016R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0013R\u001a\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001e\u00a8\u0006&"
    }
    d2 = {
        "Lco/bird/android/widget/scan/GraphicOverlay;",
        "Landroid/view/View;",
        "",
        "b",
        "Lco/bird/android/widget/scan/GraphicOverlay$a;",
        "graphic",
        "a",
        "",
        "previewWidth",
        "previewHeight",
        "facing",
        "setCameraInfo",
        "Landroid/graphics/Canvas;",
        "canvas",
        "onDraw",
        "",
        "Ljava/lang/Object;",
        "lock",
        "c",
        "I",
        "",
        "d",
        "F",
        "widthScaleFactor",
        "e",
        "f",
        "heightScaleFactor",
        "g",
        "",
        "h",
        "Ljava/util/Set;",
        "graphics",
        "Landroid/content/Context;",
        "context",
        "Landroid/util/AttributeSet;",
        "attrs",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
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
        "SMAP\nGraphicOverlay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicOverlay.kt\nco/bird/android/widget/scan/GraphicOverlay\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,177:1\n1#2:178\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Ljava/lang/Object;

.field public c:I

.field public d:F

.field public e:I

.field public f:F

.field public g:I

.field public final h:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lco/bird/android/widget/scan/GraphicOverlay$a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/widget/scan/GraphicOverlay;->b:Ljava/lang/Object;

    const/high16 p1, 0x3f800000    # 1.0f

    iput p1, p0, Lco/bird/android/widget/scan/GraphicOverlay;->d:F

    iput p1, p0, Lco/bird/android/widget/scan/GraphicOverlay;->f:F

    const/4 p1, 0x1

    iput p1, p0, Lco/bird/android/widget/scan/GraphicOverlay;->g:I

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Lco/bird/android/widget/scan/GraphicOverlay;->h:Ljava/util/Set;

    return-void
.end method

.method public static final synthetic access$getFacing$p(Lco/bird/android/widget/scan/GraphicOverlay;)I
    .locals 0

    iget p0, p0, Lco/bird/android/widget/scan/GraphicOverlay;->g:I

    return p0
.end method

.method public static final synthetic access$getHeightScaleFactor$p(Lco/bird/android/widget/scan/GraphicOverlay;)F
    .locals 0

    iget p0, p0, Lco/bird/android/widget/scan/GraphicOverlay;->f:F

    return p0
.end method

.method public static final synthetic access$getWidthScaleFactor$p(Lco/bird/android/widget/scan/GraphicOverlay;)F
    .locals 0

    iget p0, p0, Lco/bird/android/widget/scan/GraphicOverlay;->d:F

    return p0
.end method


# virtual methods
.method public final a(Lco/bird/android/widget/scan/GraphicOverlay$a;)V
    .locals 2

    const-string v0, "graphic"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/widget/scan/GraphicOverlay;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lco/bird/android/widget/scan/GraphicOverlay;->h:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lco/bird/android/widget/scan/GraphicOverlay;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lco/bird/android/widget/scan/GraphicOverlay;->h:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->clear()V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    const-string v0, "canvas"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lco/bird/android/widget/scan/GraphicOverlay;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lco/bird/android/widget/scan/GraphicOverlay;->c:I

    if-eqz v1, :cond_0

    iget v1, p0, Lco/bird/android/widget/scan/GraphicOverlay;->e:I

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lco/bird/android/widget/scan/GraphicOverlay;->c:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    iput v1, p0, Lco/bird/android/widget/scan/GraphicOverlay;->d:F

    invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I

    move-result v1

    int-to-float v1, v1

    iget v2, p0, Lco/bird/android/widget/scan/GraphicOverlay;->e:I

    int-to-float v2, v2

    div-float/2addr v1, v2

    iput v1, p0, Lco/bird/android/widget/scan/GraphicOverlay;->f:F

    :cond_0
    iget-object v1, p0, Lco/bird/android/widget/scan/GraphicOverlay;->h:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/widget/scan/GraphicOverlay$a;

    invoke-virtual {v2, p1}, Lco/bird/android/widget/scan/GraphicOverlay$a;->a(Landroid/graphics/Canvas;)V

    goto :goto_0

    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final setCameraInfo(III)V
    .locals 1

    iget-object v0, p0, Lco/bird/android/widget/scan/GraphicOverlay;->b:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iput p1, p0, Lco/bird/android/widget/scan/GraphicOverlay;->c:I

    iput p2, p0, Lco/bird/android/widget/scan/GraphicOverlay;->e:I

    iput p3, p0, Lco/bird/android/widget/scan/GraphicOverlay;->g:I

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

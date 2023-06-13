.class public final LHb0$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LHb0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u0007\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u00a2\u0006\u0004\u0008#\u0010$B\t\u0008\u0016\u00a2\u0006\u0004\u0008#\u0010%B\u0019\u0008\u0016\u0012\u0006\u0010\'\u001a\u00020&\u0012\u0006\u0010(\u001a\u00020\u0004\u00a2\u0006\u0004\u0008#\u0010)J\t\u0010\u0003\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u0005\u001a\u00020\u0004H\u00d6\u0001J\u0013\u0010\u0008\u001a\u00020\u00072\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\"\u0010\u0014\u001a\u00020\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010\u000b\u001a\u0004\u0008\u0012\u0010\r\"\u0004\u0008\u0013\u0010\u000fR\"\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u001c8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u001dR\u0011\u0010\u001f\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\rR\u0011\u0010 \u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0018R\u0011\u0010\"\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\u0008!\u0010\u0018\u00a8\u0006*"
    }
    d2 = {
        "LHb0$c;",
        "",
        "",
        "toString",
        "",
        "hashCode",
        "other",
        "",
        "equals",
        "Lcom/google/android/filament/utils/Float2;",
        "a",
        "Lcom/google/android/filament/utils/Float2;",
        "getPt0",
        "()Lcom/google/android/filament/utils/Float2;",
        "setPt0",
        "(Lcom/google/android/filament/utils/Float2;)V",
        "pt0",
        "b",
        "getPt1",
        "setPt1",
        "pt1",
        "c",
        "I",
        "getCount",
        "()I",
        "setCount",
        "(I)V",
        "count",
        "",
        "()F",
        "separation",
        "midpoint",
        "x",
        "d",
        "y",
        "<init>",
        "(Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;I)V",
        "()V",
        "Landroid/view/MotionEvent;",
        "me",
        "height",
        "(Landroid/view/MotionEvent;I)V",
        "sceneview_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public a:Lcom/google/android/filament/utils/Float2;

.field public b:Lcom/google/android/filament/utils/Float2;

.field public c:I


# direct methods
.method public constructor <init>()V
    .locals 3

    new-instance v0, Lcom/google/android/filament/utils/Float2;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/filament/utils/Float2;-><init>(F)V

    new-instance v2, Lcom/google/android/filament/utils/Float2;

    invoke-direct {v2, v1}, Lcom/google/android/filament/utils/Float2;-><init>(F)V

    const/4 v1, 0x0

    invoke-direct {p0, v0, v2, v1}, LHb0$c;-><init>(Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;I)V

    return-void
.end method

.method public constructor <init>(Landroid/view/MotionEvent;I)V
    .locals 5

    const-string v0, "me"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LHb0$c;-><init>()V

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    const/4 v1, 0x1

    if-lt v0, v1, :cond_0

    new-instance v0, Lcom/google/android/filament/utils/Float2;

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getX(I)F

    move-result v3

    int-to-float v4, p2

    invoke-virtual {p1, v2}, Landroid/view/MotionEvent;->getY(I)F

    move-result v2

    sub-float/2addr v4, v2

    invoke-direct {v0, v3, v4}, Lcom/google/android/filament/utils/Float2;-><init>(FF)V

    iput-object v0, p0, LHb0$c;->a:Lcom/google/android/filament/utils/Float2;

    iput-object v0, p0, LHb0$c;->b:Lcom/google/android/filament/utils/Float2;

    iget v0, p0, LHb0$c;->c:I

    add-int/2addr v0, v1

    iput v0, p0, LHb0$c;->c:I

    :cond_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    const/4 v2, 0x2

    if-lt v0, v2, :cond_1

    new-instance v0, Lcom/google/android/filament/utils/Float2;

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v2

    int-to-float p2, p2

    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    move-result p1

    sub-float/2addr p2, p1

    invoke-direct {v0, v2, p2}, Lcom/google/android/filament/utils/Float2;-><init>(FF)V

    iput-object v0, p0, LHb0$c;->b:Lcom/google/android/filament/utils/Float2;

    iget p1, p0, LHb0$c;->c:I

    add-int/2addr p1, v1

    iput p1, p0, LHb0$c;->c:I

    :cond_1
    return-void
.end method

.method public constructor <init>(Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;I)V
    .locals 1

    const-string v0, "pt0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pt1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHb0$c;->a:Lcom/google/android/filament/utils/Float2;

    iput-object p2, p0, LHb0$c;->b:Lcom/google/android/filament/utils/Float2;

    iput p3, p0, LHb0$c;->c:I

    return-void
.end method


# virtual methods
.method public final a()Lcom/google/android/filament/utils/Float2;
    .locals 6

    iget-object v0, p0, LHb0$c;->a:Lcom/google/android/filament/utils/Float2;

    iget-object v1, p0, LHb0$c;->b:Lcom/google/android/filament/utils/Float2;

    new-instance v2, Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v3

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v4

    const/high16 v5, 0x3f000000    # 0.5f

    mul-float/2addr v3, v5

    mul-float/2addr v4, v5

    add-float/2addr v3, v4

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result v0

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result v1

    mul-float/2addr v0, v5

    mul-float/2addr v1, v5

    add-float/2addr v0, v1

    invoke-direct {v2, v3, v0}, Lcom/google/android/filament/utils/Float2;-><init>(FF)V

    return-object v2
.end method

.method public final b()F
    .locals 5

    iget-object v0, p0, LHb0$c;->a:Lcom/google/android/filament/utils/Float2;

    iget-object v1, p0, LHb0$c;->b:Lcom/google/android/filament/utils/Float2;

    new-instance v2, Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v3

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v4

    sub-float/2addr v3, v4

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result v0

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result v1

    sub-float/2addr v0, v1

    invoke-direct {v2, v3, v0}, Lcom/google/android/filament/utils/Float2;-><init>(FF)V

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v0

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v1

    mul-float/2addr v0, v1

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result v1

    invoke-virtual {v2}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result v2

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    float-to-double v0, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    return v0
.end method

.method public final c()I
    .locals 1

    invoke-virtual {p0}, LHb0$c;->a()Lcom/google/android/filament/utils/Float2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v0

    float-to-int v0, v0

    return v0
.end method

.method public final d()I
    .locals 1

    invoke-virtual {p0}, LHb0$c;->a()Lcom/google/android/filament/utils/Float2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result v0

    float-to-int v0, v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LHb0$c;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LHb0$c;

    iget-object v1, p0, LHb0$c;->a:Lcom/google/android/filament/utils/Float2;

    iget-object v3, p1, LHb0$c;->a:Lcom/google/android/filament/utils/Float2;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LHb0$c;->b:Lcom/google/android/filament/utils/Float2;

    iget-object v3, p1, LHb0$c;->b:Lcom/google/android/filament/utils/Float2;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, LHb0$c;->c:I

    iget p1, p1, LHb0$c;->c:I

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LHb0$c;->a:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float2;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LHb0$c;->b:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, LHb0$c;->c:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TouchPair(pt0="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LHb0$c;->a:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pt1="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LHb0$c;->b:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", count="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, LHb0$c;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class final Lcom/google/android/filament/utils/GestureDetector$TouchPair;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/filament/utils/GestureDetector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "TouchPair"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0007\n\u0002\u0008\u000b\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0082\u0008\u0018\u00002\u00020\u0001B\u0007\u0008\u0016\u00a2\u0006\u0002\u0010\u0002B\u0017\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007B\u001d\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u000cJ\t\u0010!\u001a\u00020\tH\u00c6\u0003J\t\u0010\"\u001a\u00020\tH\u00c6\u0003J\t\u0010#\u001a\u00020\u0006H\u00c6\u0003J\'\u0010$\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010%\u001a\u00020&2\u0008\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020\u0006H\u00d6\u0001J\t\u0010)\u001a\u00020*H\u00d6\u0001R\u001a\u0010\u000b\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0008\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0014\u0010\u0013\"\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0017\u0010\u0013\"\u0004\u0008\u0018\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u001a8F\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u000eR\u0011\u0010\u001f\u001a\u00020\u00068F\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010\u000e\u00a8\u0006+"
    }
    d2 = {
        "Lcom/google/android/filament/utils/GestureDetector$TouchPair;",
        "",
        "()V",
        "me",
        "Landroid/view/MotionEvent;",
        "height",
        "",
        "(Landroid/view/MotionEvent;I)V",
        "pt0",
        "Lcom/google/android/filament/utils/Float2;",
        "pt1",
        "count",
        "(Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;I)V",
        "getCount",
        "()I",
        "setCount",
        "(I)V",
        "midpoint",
        "getMidpoint",
        "()Lcom/google/android/filament/utils/Float2;",
        "getPt0",
        "setPt0",
        "(Lcom/google/android/filament/utils/Float2;)V",
        "getPt1",
        "setPt1",
        "separation",
        "",
        "getSeparation",
        "()F",
        "x",
        "getX",
        "y",
        "getY",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
        "filament-utils-android_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GestureDetector.kt\ncom/google/android/filament/utils/GestureDetector$TouchPair\n+ 2 Vector.kt\ncom/google/android/filament/utils/VectorKt\n+ 3 Vector.kt\ncom/google/android/filament/utils/Float2\n+ 4 Scalar.kt\ncom/google/android/filament/utils/ScalarKt\n*L\n1#1,155:1\n572#2:156\n570#2:158\n601#2,2:159\n603#2:162\n129#3:157\n35#4:161\n*S KotlinDebug\n*F\n+ 1 GestureDetector.kt\ncom/google/android/filament/utils/GestureDetector$TouchPair\n*L\n44#1:156\n44#1:158\n45#1:159,2\n45#1:162\n44#1:157\n45#1:161\n*E\n"
    }
.end annotation


# instance fields
.field private count:I

.field private pt0:Lcom/google/android/filament/utils/Float2;

.field private pt1:Lcom/google/android/filament/utils/Float2;


# direct methods
.method public constructor <init>()V
    .locals 3

    new-instance v0, Lcom/google/android/filament/utils/Float2;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/filament/utils/Float2;-><init>(F)V

    new-instance v2, Lcom/google/android/filament/utils/Float2;

    invoke-direct {v2, v1}, Lcom/google/android/filament/utils/Float2;-><init>(F)V

    const/4 v1, 0x0

    invoke-direct {p0, v0, v2, v1}, Lcom/google/android/filament/utils/GestureDetector$TouchPair;-><init>(Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;I)V

    return-void
.end method

.method public constructor <init>(Landroid/view/MotionEvent;I)V
    .locals 5

    const-string v0, "me"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/google/android/filament/utils/GestureDetector$TouchPair;-><init>()V

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

    iput-object v0, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->pt0:Lcom/google/android/filament/utils/Float2;

    iput-object v0, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->pt1:Lcom/google/android/filament/utils/Float2;

    iget v0, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->count:I

    add-int/2addr v0, v1

    iput v0, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->count:I

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

    iput-object v0, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->pt1:Lcom/google/android/filament/utils/Float2;

    iget p1, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->count:I

    add-int/2addr p1, v1

    iput p1, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->count:I

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

    iput-object p1, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->pt0:Lcom/google/android/filament/utils/Float2;

    iput-object p2, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->pt1:Lcom/google/android/filament/utils/Float2;

    iput p3, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->count:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/google/android/filament/utils/GestureDetector$TouchPair;Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;IILjava/lang/Object;)Lcom/google/android/filament/utils/GestureDetector$TouchPair;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->pt0:Lcom/google/android/filament/utils/Float2;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->pt1:Lcom/google/android/filament/utils/Float2;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget p3, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->count:I

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->copy(Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;I)Lcom/google/android/filament/utils/GestureDetector$TouchPair;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/google/android/filament/utils/Float2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->pt0:Lcom/google/android/filament/utils/Float2;

    return-object v0
.end method

.method public final component2()Lcom/google/android/filament/utils/Float2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->pt1:Lcom/google/android/filament/utils/Float2;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->count:I

    return v0
.end method

.method public final copy(Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;I)Lcom/google/android/filament/utils/GestureDetector$TouchPair;
    .locals 1

    const-string v0, "pt0"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pt1"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;

    invoke-direct {v0, p1, p2, p3}, Lcom/google/android/filament/utils/GestureDetector$TouchPair;-><init>(Lcom/google/android/filament/utils/Float2;Lcom/google/android/filament/utils/Float2;I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/google/android/filament/utils/GestureDetector$TouchPair;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/google/android/filament/utils/GestureDetector$TouchPair;

    iget-object v1, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->pt0:Lcom/google/android/filament/utils/Float2;

    iget-object v3, p1, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->pt0:Lcom/google/android/filament/utils/Float2;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->pt1:Lcom/google/android/filament/utils/Float2;

    iget-object v3, p1, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->pt1:Lcom/google/android/filament/utils/Float2;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->count:I

    iget p1, p1, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->count:I

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getCount()I
    .locals 1

    iget v0, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->count:I

    return v0
.end method

.method public final getMidpoint()Lcom/google/android/filament/utils/Float2;
    .locals 6

    iget-object v0, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->pt0:Lcom/google/android/filament/utils/Float2;

    iget-object v1, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->pt1:Lcom/google/android/filament/utils/Float2;

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

.method public final getPt0()Lcom/google/android/filament/utils/Float2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->pt0:Lcom/google/android/filament/utils/Float2;

    return-object v0
.end method

.method public final getPt1()Lcom/google/android/filament/utils/Float2;
    .locals 1

    iget-object v0, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->pt1:Lcom/google/android/filament/utils/Float2;

    return-object v0
.end method

.method public final getSeparation()F
    .locals 5

    iget-object v0, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->pt0:Lcom/google/android/filament/utils/Float2;

    iget-object v1, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->pt1:Lcom/google/android/filament/utils/Float2;

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

.method public final getX()I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->getMidpoint()Lcom/google/android/filament/utils/Float2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float2;->getX()F

    move-result v0

    float-to-int v0, v0

    return v0
.end method

.method public final getY()I
    .locals 1

    invoke-virtual {p0}, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->getMidpoint()Lcom/google/android/filament/utils/Float2;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float2;->getY()F

    move-result v0

    float-to-int v0, v0

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->pt0:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v0}, Lcom/google/android/filament/utils/Float2;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->pt1:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v1}, Lcom/google/android/filament/utils/Float2;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->count:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public final setCount(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->count:I

    return-void
.end method

.method public final setPt0(Lcom/google/android/filament/utils/Float2;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->pt0:Lcom/google/android/filament/utils/Float2;

    return-void
.end method

.method public final setPt1(Lcom/google/android/filament/utils/Float2;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->pt1:Lcom/google/android/filament/utils/Float2;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "TouchPair(pt0="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->pt0:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pt1="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->pt1:Lcom/google/android/filament/utils/Float2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", count="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/google/android/filament/utils/GestureDetector$TouchPair;->count:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

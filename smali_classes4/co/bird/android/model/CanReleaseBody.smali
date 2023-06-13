.class public final Lco/bird/android/model/CanReleaseBody;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u000e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0005H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\t\u00a8\u0006\u0017"
    }
    d2 = {
        "Lco/bird/android/model/CanReleaseBody;",
        "",
        "canRelease",
        "",
        "distance",
        "",
        "accuracy",
        "(ZFF)V",
        "getAccuracy",
        "()F",
        "getCanRelease",
        "()Z",
        "getDistance",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "model_release"
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
.field private final accuracy:F

.field private final canRelease:Z

.field private final distance:F


# direct methods
.method public constructor <init>(ZFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lco/bird/android/model/CanReleaseBody;->canRelease:Z

    iput p2, p0, Lco/bird/android/model/CanReleaseBody;->distance:F

    iput p3, p0, Lco/bird/android/model/CanReleaseBody;->accuracy:F

    return-void
.end method

.method public synthetic constructor <init>(ZFFILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/model/CanReleaseBody;-><init>(ZFF)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/CanReleaseBody;ZFFILjava/lang/Object;)Lco/bird/android/model/CanReleaseBody;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-boolean p1, p0, Lco/bird/android/model/CanReleaseBody;->canRelease:Z

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Lco/bird/android/model/CanReleaseBody;->distance:F

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget p3, p0, Lco/bird/android/model/CanReleaseBody;->accuracy:F

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/model/CanReleaseBody;->copy(ZFF)Lco/bird/android/model/CanReleaseBody;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/CanReleaseBody;->canRelease:Z

    return v0
.end method

.method public final component2()F
    .locals 1

    iget v0, p0, Lco/bird/android/model/CanReleaseBody;->distance:F

    return v0
.end method

.method public final component3()F
    .locals 1

    iget v0, p0, Lco/bird/android/model/CanReleaseBody;->accuracy:F

    return v0
.end method

.method public final copy(ZFF)Lco/bird/android/model/CanReleaseBody;
    .locals 1

    new-instance v0, Lco/bird/android/model/CanReleaseBody;

    invoke-direct {v0, p1, p2, p3}, Lco/bird/android/model/CanReleaseBody;-><init>(ZFF)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/CanReleaseBody;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/CanReleaseBody;

    iget-boolean v1, p0, Lco/bird/android/model/CanReleaseBody;->canRelease:Z

    iget-boolean v3, p1, Lco/bird/android/model/CanReleaseBody;->canRelease:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lco/bird/android/model/CanReleaseBody;->distance:F

    iget v3, p1, Lco/bird/android/model/CanReleaseBody;->distance:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lco/bird/android/model/CanReleaseBody;->accuracy:F

    iget p1, p1, Lco/bird/android/model/CanReleaseBody;->accuracy:F

    invoke-static {v1, p1}, Ljava/lang/Float;->compare(FF)I

    move-result p1

    if-eqz p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getAccuracy()F
    .locals 1

    iget v0, p0, Lco/bird/android/model/CanReleaseBody;->accuracy:F

    return v0
.end method

.method public final getCanRelease()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/CanReleaseBody;->canRelease:Z

    return v0
.end method

.method public final getDistance()F
    .locals 1

    iget v0, p0, Lco/bird/android/model/CanReleaseBody;->distance:F

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lco/bird/android/model/CanReleaseBody;->canRelease:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/CanReleaseBody;->distance:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/CanReleaseBody;->accuracy:F

    invoke-static {v1}, Ljava/lang/Float;->hashCode(F)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-boolean v0, p0, Lco/bird/android/model/CanReleaseBody;->canRelease:Z

    iget v1, p0, Lco/bird/android/model/CanReleaseBody;->distance:F

    iget v2, p0, Lco/bird/android/model/CanReleaseBody;->accuracy:F

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "CanReleaseBody(canRelease="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", distance="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ", accuracy="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

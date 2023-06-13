.class public final Lco/bird/android/model/HardCountStatus;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000f\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B-\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0011\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\t\u00a8\u0006\u0018"
    }
    d2 = {
        "Lco/bird/android/model/HardCountStatus;",
        "",
        "totalFailedScans",
        "",
        "totalSuccessScans",
        "userFailedScans",
        "userSuccessScans",
        "(IIII)V",
        "getTotalFailedScans",
        "()I",
        "getTotalSuccessScans",
        "getUserFailedScans",
        "getUserSuccessScans",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
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
.field private final totalFailedScans:I

.field private final totalSuccessScans:I

.field private final userFailedScans:I

.field private final userSuccessScans:I


# direct methods
.method public constructor <init>()V
    .locals 7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/16 v5, 0xf

    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lco/bird/android/model/HardCountStatus;-><init>(IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(IIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lco/bird/android/model/HardCountStatus;->totalFailedScans:I

    iput p2, p0, Lco/bird/android/model/HardCountStatus;->totalSuccessScans:I

    iput p3, p0, Lco/bird/android/model/HardCountStatus;->userFailedScans:I

    iput p4, p0, Lco/bird/android/model/HardCountStatus;->userSuccessScans:I

    return-void
.end method

.method public synthetic constructor <init>(IIIIILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    move p4, v0

    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Lco/bird/android/model/HardCountStatus;-><init>(IIII)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/HardCountStatus;IIIIILjava/lang/Object;)Lco/bird/android/model/HardCountStatus;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget p1, p0, Lco/bird/android/model/HardCountStatus;->totalFailedScans:I

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget p2, p0, Lco/bird/android/model/HardCountStatus;->totalSuccessScans:I

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget p3, p0, Lco/bird/android/model/HardCountStatus;->userFailedScans:I

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget p4, p0, Lco/bird/android/model/HardCountStatus;->userSuccessScans:I

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/android/model/HardCountStatus;->copy(IIII)Lco/bird/android/model/HardCountStatus;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/HardCountStatus;->totalFailedScans:I

    return v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/HardCountStatus;->totalSuccessScans:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/HardCountStatus;->userFailedScans:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/HardCountStatus;->userSuccessScans:I

    return v0
.end method

.method public final copy(IIII)Lco/bird/android/model/HardCountStatus;
    .locals 1

    new-instance v0, Lco/bird/android/model/HardCountStatus;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/bird/android/model/HardCountStatus;-><init>(IIII)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/HardCountStatus;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/HardCountStatus;

    iget v1, p0, Lco/bird/android/model/HardCountStatus;->totalFailedScans:I

    iget v3, p1, Lco/bird/android/model/HardCountStatus;->totalFailedScans:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lco/bird/android/model/HardCountStatus;->totalSuccessScans:I

    iget v3, p1, Lco/bird/android/model/HardCountStatus;->totalSuccessScans:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lco/bird/android/model/HardCountStatus;->userFailedScans:I

    iget v3, p1, Lco/bird/android/model/HardCountStatus;->userFailedScans:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lco/bird/android/model/HardCountStatus;->userSuccessScans:I

    iget p1, p1, Lco/bird/android/model/HardCountStatus;->userSuccessScans:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getTotalFailedScans()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/HardCountStatus;->totalFailedScans:I

    return v0
.end method

.method public final getTotalSuccessScans()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/HardCountStatus;->totalSuccessScans:I

    return v0
.end method

.method public final getUserFailedScans()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/HardCountStatus;->userFailedScans:I

    return v0
.end method

.method public final getUserSuccessScans()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/HardCountStatus;->userSuccessScans:I

    return v0
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lco/bird/android/model/HardCountStatus;->totalFailedScans:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/HardCountStatus;->totalSuccessScans:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/HardCountStatus;->userFailedScans:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/HardCountStatus;->userSuccessScans:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lco/bird/android/model/HardCountStatus;->totalFailedScans:I

    iget v1, p0, Lco/bird/android/model/HardCountStatus;->totalSuccessScans:I

    iget v2, p0, Lco/bird/android/model/HardCountStatus;->userFailedScans:I

    iget v3, p0, Lco/bird/android/model/HardCountStatus;->userSuccessScans:I

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "HardCountStatus(totalFailedScans="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", totalSuccessScans="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", userFailedScans="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", userSuccessScans="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

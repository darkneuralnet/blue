.class public final Lco/bird/android/model/ScanlessRideItem;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u000b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00042\u0008\u0008\u0002\u0010\n\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\r\u001a\u00020\u000cH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001e"
    }
    d2 = {
        "Lco/bird/android/model/ScanlessRideItem;",
        "",
        "Lco/bird/android/model/wire/WireBird;",
        "component1",
        "LTk5;",
        "component2",
        "",
        "component3",
        "bird",
        "scanResult",
        "score",
        "copy",
        "",
        "toString",
        "",
        "hashCode",
        "other",
        "",
        "equals",
        "Lco/bird/android/model/wire/WireBird;",
        "getBird",
        "()Lco/bird/android/model/wire/WireBird;",
        "LTk5;",
        "getScanResult",
        "()LTk5;",
        "D",
        "getScore",
        "()D",
        "<init>",
        "(Lco/bird/android/model/wire/WireBird;LTk5;D)V",
        "model_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final bird:Lco/bird/android/model/wire/WireBird;

.field private final scanResult:LTk5;

.field private final score:D


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WireBird;LTk5;D)V
    .locals 1

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scanResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/ScanlessRideItem;->bird:Lco/bird/android/model/wire/WireBird;

    iput-object p2, p0, Lco/bird/android/model/ScanlessRideItem;->scanResult:LTk5;

    iput-wide p3, p0, Lco/bird/android/model/ScanlessRideItem;->score:D

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/ScanlessRideItem;Lco/bird/android/model/wire/WireBird;LTk5;DILjava/lang/Object;)Lco/bird/android/model/ScanlessRideItem;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lco/bird/android/model/ScanlessRideItem;->bird:Lco/bird/android/model/wire/WireBird;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lco/bird/android/model/ScanlessRideItem;->scanResult:LTk5;

    :cond_1
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_2

    iget-wide p3, p0, Lco/bird/android/model/ScanlessRideItem;->score:D

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/android/model/ScanlessRideItem;->copy(Lco/bird/android/model/wire/WireBird;LTk5;D)Lco/bird/android/model/ScanlessRideItem;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/wire/WireBird;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ScanlessRideItem;->bird:Lco/bird/android/model/wire/WireBird;

    return-object v0
.end method

.method public final component2()LTk5;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ScanlessRideItem;->scanResult:LTk5;

    return-object v0
.end method

.method public final component3()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/ScanlessRideItem;->score:D

    return-wide v0
.end method

.method public final copy(Lco/bird/android/model/wire/WireBird;LTk5;D)Lco/bird/android/model/ScanlessRideItem;
    .locals 1

    const-string v0, "bird"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scanResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/ScanlessRideItem;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/bird/android/model/ScanlessRideItem;-><init>(Lco/bird/android/model/wire/WireBird;LTk5;D)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/ScanlessRideItem;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/ScanlessRideItem;

    iget-object v1, p0, Lco/bird/android/model/ScanlessRideItem;->bird:Lco/bird/android/model/wire/WireBird;

    iget-object v3, p1, Lco/bird/android/model/ScanlessRideItem;->bird:Lco/bird/android/model/wire/WireBird;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/ScanlessRideItem;->scanResult:LTk5;

    iget-object v3, p1, Lco/bird/android/model/ScanlessRideItem;->scanResult:LTk5;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lco/bird/android/model/ScanlessRideItem;->score:D

    iget-wide v5, p1, Lco/bird/android/model/ScanlessRideItem;->score:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result p1

    if-eqz p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getBird()Lco/bird/android/model/wire/WireBird;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ScanlessRideItem;->bird:Lco/bird/android/model/wire/WireBird;

    return-object v0
.end method

.method public final getScanResult()LTk5;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/ScanlessRideItem;->scanResult:LTk5;

    return-object v0
.end method

.method public final getScore()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/ScanlessRideItem;->score:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/ScanlessRideItem;->bird:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/ScanlessRideItem;->scanResult:LTk5;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/android/model/ScanlessRideItem;->score:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lco/bird/android/model/ScanlessRideItem;->bird:Lco/bird/android/model/wire/WireBird;

    iget-object v1, p0, Lco/bird/android/model/ScanlessRideItem;->scanResult:LTk5;

    iget-wide v2, p0, Lco/bird/android/model/ScanlessRideItem;->score:D

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ScanlessRideItem(bird="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", scanResult="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", score="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

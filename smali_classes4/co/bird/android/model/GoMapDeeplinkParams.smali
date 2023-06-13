.class public final Lco/bird/android/model/GoMapDeeplinkParams;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/model/GoDeepLinkParams;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B-\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J>\u0010\u0016\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0008H\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u000f\u00a8\u0006\u001f"
    }
    d2 = {
        "Lco/bird/android/model/GoMapDeeplinkParams;",
        "Lco/bird/android/model/GoDeepLinkParams;",
        "latitude",
        "",
        "longitude",
        "bird",
        "Lco/bird/android/model/wire/WireBird;",
        "birdId",
        "",
        "(Ljava/lang/Double;Ljava/lang/Double;Lco/bird/android/model/wire/WireBird;Ljava/lang/String;)V",
        "getBird",
        "()Lco/bird/android/model/wire/WireBird;",
        "getBirdId",
        "()Ljava/lang/String;",
        "getLatitude",
        "()Ljava/lang/Double;",
        "Ljava/lang/Double;",
        "getLongitude",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "(Ljava/lang/Double;Ljava/lang/Double;Lco/bird/android/model/wire/WireBird;Ljava/lang/String;)Lco/bird/android/model/GoMapDeeplinkParams;",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
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
.field private final bird:Lco/bird/android/model/wire/WireBird;

.field private final birdId:Ljava/lang/String;

.field private final latitude:Ljava/lang/Double;

.field private final longitude:Ljava/lang/Double;


# direct methods
.method public constructor <init>(Ljava/lang/Double;Ljava/lang/Double;Lco/bird/android/model/wire/WireBird;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/GoMapDeeplinkParams;->latitude:Ljava/lang/Double;

    iput-object p2, p0, Lco/bird/android/model/GoMapDeeplinkParams;->longitude:Ljava/lang/Double;

    iput-object p3, p0, Lco/bird/android/model/GoMapDeeplinkParams;->bird:Lco/bird/android/model/wire/WireBird;

    iput-object p4, p0, Lco/bird/android/model/GoMapDeeplinkParams;->birdId:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/GoMapDeeplinkParams;Ljava/lang/Double;Ljava/lang/Double;Lco/bird/android/model/wire/WireBird;Ljava/lang/String;ILjava/lang/Object;)Lco/bird/android/model/GoMapDeeplinkParams;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lco/bird/android/model/GoMapDeeplinkParams;->latitude:Ljava/lang/Double;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lco/bird/android/model/GoMapDeeplinkParams;->longitude:Ljava/lang/Double;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lco/bird/android/model/GoMapDeeplinkParams;->bird:Lco/bird/android/model/wire/WireBird;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lco/bird/android/model/GoMapDeeplinkParams;->birdId:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lco/bird/android/model/GoMapDeeplinkParams;->copy(Ljava/lang/Double;Ljava/lang/Double;Lco/bird/android/model/wire/WireBird;Ljava/lang/String;)Lco/bird/android/model/GoMapDeeplinkParams;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/GoMapDeeplinkParams;->latitude:Ljava/lang/Double;

    return-object v0
.end method

.method public final component2()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/GoMapDeeplinkParams;->longitude:Ljava/lang/Double;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/wire/WireBird;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/GoMapDeeplinkParams;->bird:Lco/bird/android/model/wire/WireBird;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/GoMapDeeplinkParams;->birdId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/Double;Ljava/lang/Double;Lco/bird/android/model/wire/WireBird;Ljava/lang/String;)Lco/bird/android/model/GoMapDeeplinkParams;
    .locals 1

    new-instance v0, Lco/bird/android/model/GoMapDeeplinkParams;

    invoke-direct {v0, p1, p2, p3, p4}, Lco/bird/android/model/GoMapDeeplinkParams;-><init>(Ljava/lang/Double;Ljava/lang/Double;Lco/bird/android/model/wire/WireBird;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/GoMapDeeplinkParams;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/GoMapDeeplinkParams;

    iget-object v1, p0, Lco/bird/android/model/GoMapDeeplinkParams;->latitude:Ljava/lang/Double;

    iget-object v3, p1, Lco/bird/android/model/GoMapDeeplinkParams;->latitude:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/GoMapDeeplinkParams;->longitude:Ljava/lang/Double;

    iget-object v3, p1, Lco/bird/android/model/GoMapDeeplinkParams;->longitude:Ljava/lang/Double;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/GoMapDeeplinkParams;->bird:Lco/bird/android/model/wire/WireBird;

    iget-object v3, p1, Lco/bird/android/model/GoMapDeeplinkParams;->bird:Lco/bird/android/model/wire/WireBird;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/GoMapDeeplinkParams;->birdId:Ljava/lang/String;

    iget-object p1, p1, Lco/bird/android/model/GoMapDeeplinkParams;->birdId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getBird()Lco/bird/android/model/wire/WireBird;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/GoMapDeeplinkParams;->bird:Lco/bird/android/model/wire/WireBird;

    return-object v0
.end method

.method public final getBirdId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/GoMapDeeplinkParams;->birdId:Ljava/lang/String;

    return-object v0
.end method

.method public final getLatitude()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/GoMapDeeplinkParams;->latitude:Ljava/lang/Double;

    return-object v0
.end method

.method public final getLongitude()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/GoMapDeeplinkParams;->longitude:Ljava/lang/Double;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/GoMapDeeplinkParams;->latitude:Ljava/lang/Double;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/GoMapDeeplinkParams;->longitude:Ljava/lang/Double;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/GoMapDeeplinkParams;->bird:Lco/bird/android/model/wire/WireBird;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lco/bird/android/model/wire/WireBird;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/GoMapDeeplinkParams;->birdId:Ljava/lang/String;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lco/bird/android/model/GoMapDeeplinkParams;->latitude:Ljava/lang/Double;

    iget-object v1, p0, Lco/bird/android/model/GoMapDeeplinkParams;->longitude:Ljava/lang/Double;

    iget-object v2, p0, Lco/bird/android/model/GoMapDeeplinkParams;->bird:Lco/bird/android/model/wire/WireBird;

    iget-object v3, p0, Lco/bird/android/model/GoMapDeeplinkParams;->birdId:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "GoMapDeeplinkParams(latitude="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", longitude="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", bird="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", birdId="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

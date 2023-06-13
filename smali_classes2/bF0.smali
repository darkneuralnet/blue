.class public final LbF0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0086\u0008\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008$\u0010%J\u0008\u0010\u0003\u001a\u00020\u0002H\u0016JF\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000cH\u00c6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\t\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u0018\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008\u001c\u0010!R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\"\u001a\u0004\u0008\u001f\u0010#\u00a8\u0006&"
    }
    d2 = {
        "LbF0;",
        "",
        "",
        "toString",
        "LmG3;",
        "parkingNestState",
        "Lco/bird/android/model/ParkingNest;",
        "parkingNest",
        "",
        "distanceFromNest",
        "Lco/bird/android/model/wire/WireLocation;",
        "parkingLocation",
        "Lco/bird/android/model/ParkingLocationSource;",
        "parkingLocationSource",
        "a",
        "(LmG3;Lco/bird/android/model/ParkingNest;Ljava/lang/Float;Lco/bird/android/model/wire/WireLocation;Lco/bird/android/model/ParkingLocationSource;)LbF0;",
        "",
        "hashCode",
        "other",
        "",
        "equals",
        "LmG3;",
        "f",
        "()LmG3;",
        "b",
        "Lco/bird/android/model/ParkingNest;",
        "e",
        "()Lco/bird/android/model/ParkingNest;",
        "c",
        "Ljava/lang/Float;",
        "()Ljava/lang/Float;",
        "d",
        "Lco/bird/android/model/wire/WireLocation;",
        "()Lco/bird/android/model/wire/WireLocation;",
        "Lco/bird/android/model/ParkingLocationSource;",
        "()Lco/bird/android/model/ParkingLocationSource;",
        "<init>",
        "(LmG3;Lco/bird/android/model/ParkingNest;Ljava/lang/Float;Lco/bird/android/model/wire/WireLocation;Lco/bird/android/model/ParkingLocationSource;)V",
        "core-interface_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:LmG3;

.field public final b:Lco/bird/android/model/ParkingNest;

.field public final c:Ljava/lang/Float;

.field public final d:Lco/bird/android/model/wire/WireLocation;

.field public final e:Lco/bird/android/model/ParkingLocationSource;


# direct methods
.method public constructor <init>(LmG3;Lco/bird/android/model/ParkingNest;Ljava/lang/Float;Lco/bird/android/model/wire/WireLocation;Lco/bird/android/model/ParkingLocationSource;)V
    .locals 1

    const-string v0, "parkingNestState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parkingLocation"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parkingLocationSource"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LbF0;->a:LmG3;

    iput-object p2, p0, LbF0;->b:Lco/bird/android/model/ParkingNest;

    iput-object p3, p0, LbF0;->c:Ljava/lang/Float;

    iput-object p4, p0, LbF0;->d:Lco/bird/android/model/wire/WireLocation;

    iput-object p5, p0, LbF0;->e:Lco/bird/android/model/ParkingLocationSource;

    return-void
.end method

.method public static synthetic copy$default(LbF0;LmG3;Lco/bird/android/model/ParkingNest;Ljava/lang/Float;Lco/bird/android/model/wire/WireLocation;Lco/bird/android/model/ParkingLocationSource;ILjava/lang/Object;)LbF0;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, LbF0;->a:LmG3;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, LbF0;->b:Lco/bird/android/model/ParkingNest;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, LbF0;->c:Ljava/lang/Float;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, LbF0;->d:Lco/bird/android/model/wire/WireLocation;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, LbF0;->e:Lco/bird/android/model/ParkingLocationSource;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, LbF0;->a(LmG3;Lco/bird/android/model/ParkingNest;Ljava/lang/Float;Lco/bird/android/model/wire/WireLocation;Lco/bird/android/model/ParkingLocationSource;)LbF0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(LmG3;Lco/bird/android/model/ParkingNest;Ljava/lang/Float;Lco/bird/android/model/wire/WireLocation;Lco/bird/android/model/ParkingLocationSource;)LbF0;
    .locals 7

    const-string v0, "parkingNestState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parkingLocation"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parkingLocationSource"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LbF0;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, LbF0;-><init>(LmG3;Lco/bird/android/model/ParkingNest;Ljava/lang/Float;Lco/bird/android/model/wire/WireLocation;Lco/bird/android/model/ParkingLocationSource;)V

    return-object v0
.end method

.method public final b()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, LbF0;->c:Ljava/lang/Float;

    return-object v0
.end method

.method public final c()Lco/bird/android/model/wire/WireLocation;
    .locals 1

    iget-object v0, p0, LbF0;->d:Lco/bird/android/model/wire/WireLocation;

    return-object v0
.end method

.method public final d()Lco/bird/android/model/ParkingLocationSource;
    .locals 1

    iget-object v0, p0, LbF0;->e:Lco/bird/android/model/ParkingLocationSource;

    return-object v0
.end method

.method public final e()Lco/bird/android/model/ParkingNest;
    .locals 1

    iget-object v0, p0, LbF0;->b:Lco/bird/android/model/ParkingNest;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LbF0;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LbF0;

    iget-object v1, p0, LbF0;->a:LmG3;

    iget-object v3, p1, LbF0;->a:LmG3;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LbF0;->b:Lco/bird/android/model/ParkingNest;

    iget-object v3, p1, LbF0;->b:Lco/bird/android/model/ParkingNest;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LbF0;->c:Ljava/lang/Float;

    iget-object v3, p1, LbF0;->c:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LbF0;->d:Lco/bird/android/model/wire/WireLocation;

    iget-object v3, p1, LbF0;->d:Lco/bird/android/model/wire/WireLocation;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, LbF0;->e:Lco/bird/android/model/ParkingLocationSource;

    iget-object p1, p1, LbF0;->e:Lco/bird/android/model/ParkingLocationSource;

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final f()LmG3;
    .locals 1

    iget-object v0, p0, LbF0;->a:LmG3;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LbF0;->a:LmG3;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LbF0;->b:Lco/bird/android/model/ParkingNest;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lco/bird/android/model/ParkingNest;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LbF0;->c:Ljava/lang/Float;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LbF0;->d:Lco/bird/android/model/wire/WireLocation;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireLocation;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LbF0;->e:Lco/bird/android/model/ParkingLocationSource;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, LbF0;->a:LmG3;

    iget-object v1, p0, LbF0;->b:Lco/bird/android/model/ParkingNest;

    iget-object v2, p0, LbF0;->c:Ljava/lang/Float;

    iget-object v3, p0, LbF0;->d:Lco/bird/android/model/wire/WireLocation;

    iget-object v4, p0, LbF0;->e:Lco/bird/android/model/ParkingLocationSource;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "CurrentParkingNest(parkingNestState="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", parkingNest="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", distanceFromNest="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", locationUsedToCompute="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", parkingLocationSource="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final LtH2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0012\u0008\u0086\u0008\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0006\u0010\u0003\u001a\u00020\u0002J3\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u00c6\u0001J\t\u0010\r\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\n2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0018\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u001c\u001a\u0004\u0008\u001b\u0010\u001d\u00a8\u0006 "
    }
    d2 = {
        "LtH2;",
        "",
        "",
        "e",
        "Lco/bird/android/model/RideState;",
        "rideState",
        "LFH3;",
        "parkingStatus",
        "Lco/bird/android/model/wire/WireUserGuest;",
        "userGuest",
        "",
        "isSelected",
        "a",
        "toString",
        "",
        "hashCode",
        "other",
        "equals",
        "Lco/bird/android/model/RideState;",
        "b",
        "()Lco/bird/android/model/RideState;",
        "LFH3;",
        "getParkingStatus",
        "()LFH3;",
        "c",
        "Lco/bird/android/model/wire/WireUserGuest;",
        "()Lco/bird/android/model/wire/WireUserGuest;",
        "d",
        "Z",
        "()Z",
        "<init>",
        "(Lco/bird/android/model/RideState;LFH3;Lco/bird/android/model/wire/WireUserGuest;Z)V",
        "co.bird.android.feature.rider.bottomsheets"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lco/bird/android/model/RideState;

.field public final b:LFH3;

.field public final c:Lco/bird/android/model/wire/WireUserGuest;

.field public final d:Z


# direct methods
.method public constructor <init>(Lco/bird/android/model/RideState;LFH3;Lco/bird/android/model/wire/WireUserGuest;Z)V
    .locals 1

    const-string v0, "rideState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parkingStatus"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LtH2;->a:Lco/bird/android/model/RideState;

    iput-object p2, p0, LtH2;->b:LFH3;

    iput-object p3, p0, LtH2;->c:Lco/bird/android/model/wire/WireUserGuest;

    iput-boolean p4, p0, LtH2;->d:Z

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/RideState;LFH3;Lco/bird/android/model/wire/WireUserGuest;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_0

    const/4 p3, 0x0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    const/4 p4, 0x0

    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, LtH2;-><init>(Lco/bird/android/model/RideState;LFH3;Lco/bird/android/model/wire/WireUserGuest;Z)V

    return-void
.end method

.method public static synthetic copy$default(LtH2;Lco/bird/android/model/RideState;LFH3;Lco/bird/android/model/wire/WireUserGuest;ZILjava/lang/Object;)LtH2;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, LtH2;->a:Lco/bird/android/model/RideState;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, LtH2;->b:LFH3;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, LtH2;->c:Lco/bird/android/model/wire/WireUserGuest;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-boolean p4, p0, LtH2;->d:Z

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, LtH2;->a(Lco/bird/android/model/RideState;LFH3;Lco/bird/android/model/wire/WireUserGuest;Z)LtH2;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lco/bird/android/model/RideState;LFH3;Lco/bird/android/model/wire/WireUserGuest;Z)LtH2;
    .locals 1

    const-string v0, "rideState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "parkingStatus"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LtH2;

    invoke-direct {v0, p1, p2, p3, p4}, LtH2;-><init>(Lco/bird/android/model/RideState;LFH3;Lco/bird/android/model/wire/WireUserGuest;Z)V

    return-object v0
.end method

.method public final b()Lco/bird/android/model/RideState;
    .locals 1

    iget-object v0, p0, LtH2;->a:Lco/bird/android/model/RideState;

    return-object v0
.end method

.method public final c()Lco/bird/android/model/wire/WireUserGuest;
    .locals 1

    iget-object v0, p0, LtH2;->c:Lco/bird/android/model/wire/WireUserGuest;

    return-object v0
.end method

.method public final d()Z
    .locals 1

    iget-boolean v0, p0, LtH2;->d:Z

    return v0
.end method

.method public final e()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, LtH2;->a:Lco/bird/android/model/RideState;

    invoke-virtual {v0}, Lco/bird/android/model/RideState;->toLoggableString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, LtH2;->b:LFH3;

    iget-object v2, p0, LtH2;->c:Lco/bird/android/model/wire/WireUserGuest;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireUserGuest;->getId()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    :cond_0
    const-string v2, ""

    :cond_1
    iget-boolean v3, p0, LtH2;->d:Z

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "[rideState: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n\tparkingStatus: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "\n\tuserGuest: "

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\nt\tselected:"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LtH2;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LtH2;

    iget-object v1, p0, LtH2;->a:Lco/bird/android/model/RideState;

    iget-object v3, p1, LtH2;->a:Lco/bird/android/model/RideState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LtH2;->b:LFH3;

    iget-object v3, p1, LtH2;->b:LFH3;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LtH2;->c:Lco/bird/android/model/wire/WireUserGuest;

    iget-object v3, p1, LtH2;->c:Lco/bird/android/model/wire/WireUserGuest;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, LtH2;->d:Z

    iget-boolean p1, p1, LtH2;->d:Z

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LtH2;->a:Lco/bird/android/model/RideState;

    invoke-virtual {v0}, Lco/bird/android/model/RideState;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LtH2;->b:LFH3;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LtH2;->c:Lco/bird/android/model/wire/WireUserGuest;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lco/bird/android/model/wire/WireUserGuest;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, LtH2;->d:Z

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    :cond_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, LtH2;->a:Lco/bird/android/model/RideState;

    iget-object v1, p0, LtH2;->b:LFH3;

    iget-object v2, p0, LtH2;->c:Lco/bird/android/model/wire/WireUserGuest;

    iget-boolean v3, p0, LtH2;->d:Z

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "ManageGroupRidesEntry(rideState="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", parkingStatus="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", userGuest="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isSelected="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

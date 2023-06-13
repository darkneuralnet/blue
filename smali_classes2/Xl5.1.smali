.class public final LXl5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0086\u0008\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ)\u0010\u0008\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\t\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001b"
    }
    d2 = {
        "LXl5;",
        "",
        "Lco/bird/android/model/wire/WirePhysicalLock;",
        "lock",
        "LUR4;",
        "onScanAction",
        "Lco/bird/android/model/RideState;",
        "rideState",
        "a",
        "",
        "toString",
        "",
        "hashCode",
        "other",
        "",
        "equals",
        "Lco/bird/android/model/wire/WirePhysicalLock;",
        "b",
        "()Lco/bird/android/model/wire/WirePhysicalLock;",
        "LUR4;",
        "c",
        "()LUR4;",
        "Lco/bird/android/model/RideState;",
        "d",
        "()Lco/bird/android/model/RideState;",
        "<init>",
        "(Lco/bird/android/model/wire/WirePhysicalLock;LUR4;Lco/bird/android/model/RideState;)V",
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
.field public final a:Lco/bird/android/model/wire/WirePhysicalLock;

.field public final b:LUR4;

.field public final c:Lco/bird/android/model/RideState;


# direct methods
.method public constructor <init>(Lco/bird/android/model/wire/WirePhysicalLock;LUR4;Lco/bird/android/model/RideState;)V
    .locals 1

    const-string v0, "lock"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onScanAction"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXl5;->a:Lco/bird/android/model/wire/WirePhysicalLock;

    iput-object p2, p0, LXl5;->b:LUR4;

    iput-object p3, p0, LXl5;->c:Lco/bird/android/model/RideState;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/wire/WirePhysicalLock;LUR4;Lco/bird/android/model/RideState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    sget-object p2, LUR4;->b:LUR4;

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    :cond_1
    invoke-direct {p0, p1, p2, p3}, LXl5;-><init>(Lco/bird/android/model/wire/WirePhysicalLock;LUR4;Lco/bird/android/model/RideState;)V

    return-void
.end method

.method public static synthetic copy$default(LXl5;Lco/bird/android/model/wire/WirePhysicalLock;LUR4;Lco/bird/android/model/RideState;ILjava/lang/Object;)LXl5;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, LXl5;->a:Lco/bird/android/model/wire/WirePhysicalLock;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, LXl5;->b:LUR4;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, LXl5;->c:Lco/bird/android/model/RideState;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, LXl5;->a(Lco/bird/android/model/wire/WirePhysicalLock;LUR4;Lco/bird/android/model/RideState;)LXl5;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WirePhysicalLock;LUR4;Lco/bird/android/model/RideState;)LXl5;
    .locals 1

    const-string v0, "lock"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onScanAction"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LXl5;

    invoke-direct {v0, p1, p2, p3}, LXl5;-><init>(Lco/bird/android/model/wire/WirePhysicalLock;LUR4;Lco/bird/android/model/RideState;)V

    return-object v0
.end method

.method public final b()Lco/bird/android/model/wire/WirePhysicalLock;
    .locals 1

    iget-object v0, p0, LXl5;->a:Lco/bird/android/model/wire/WirePhysicalLock;

    return-object v0
.end method

.method public final c()LUR4;
    .locals 1

    iget-object v0, p0, LXl5;->b:LUR4;

    return-object v0
.end method

.method public final d()Lco/bird/android/model/RideState;
    .locals 1

    iget-object v0, p0, LXl5;->c:Lco/bird/android/model/RideState;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LXl5;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LXl5;

    iget-object v1, p0, LXl5;->a:Lco/bird/android/model/wire/WirePhysicalLock;

    iget-object v3, p1, LXl5;->a:Lco/bird/android/model/wire/WirePhysicalLock;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LXl5;->b:LUR4;

    iget-object v3, p1, LXl5;->b:LUR4;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LXl5;->c:Lco/bird/android/model/RideState;

    iget-object p1, p1, LXl5;->c:Lco/bird/android/model/RideState;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LXl5;->a:Lco/bird/android/model/wire/WirePhysicalLock;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WirePhysicalLock;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LXl5;->b:LUR4;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LXl5;->c:Lco/bird/android/model/RideState;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lco/bird/android/model/RideState;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, LXl5;->a:Lco/bird/android/model/wire/WirePhysicalLock;

    iget-object v1, p0, LXl5;->b:LUR4;

    iget-object v2, p0, LXl5;->c:Lco/bird/android/model/RideState;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "ScannableRideLock(lock="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", onScanAction="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", rideState="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

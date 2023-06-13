.class public final Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0086\u0008\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008 \u0010!JC\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\t\u0010\r\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u001a\u001a\u0004\u0008\u0016\u0010\u001bR\u001d\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001c\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u0017\u001a\u0004\u0008\u001f\u0010\u0019\u00a8\u0006\""
    }
    d2 = {
        "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;",
        "",
        "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;",
        "type",
        "",
        "birdId",
        "Lco/bird/android/model/wire/WireBird;",
        "bird",
        "",
        "Lco/bird/android/model/wire/WirePhysicalLock;",
        "physicalLocks",
        "rideId",
        "a",
        "toString",
        "",
        "hashCode",
        "other",
        "",
        "equals",
        "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;",
        "f",
        "()Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;",
        "b",
        "Ljava/lang/String;",
        "c",
        "()Ljava/lang/String;",
        "Lco/bird/android/model/wire/WireBird;",
        "()Lco/bird/android/model/wire/WireBird;",
        "d",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "e",
        "<init>",
        "(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;Ljava/lang/String;Lco/bird/android/model/wire/WireBird;Ljava/util/List;Ljava/lang/String;)V",
        "impl_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;

.field public final b:Ljava/lang/String;

.field public final c:Lco/bird/android/model/wire/WireBird;

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WirePhysicalLock;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;Ljava/lang/String;Lco/bird/android/model/wire/WireBird;Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/WireBird;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WirePhysicalLock;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "birdId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bird"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "physicalLocks"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->a:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;

    iput-object p2, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->b:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->c:Lco/bird/android/model/wire/WireBird;

    iput-object p4, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->d:Ljava/util/List;

    iput-object p5, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->e:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;Ljava/lang/String;Lco/bird/android/model/wire/WireBird;Ljava/util/List;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v5, p5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;-><init>(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;Ljava/lang/String;Lco/bird/android/model/wire/WireBird;Ljava/util/List;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;Ljava/lang/String;Lco/bird/android/model/wire/WireBird;Ljava/util/List;Ljava/lang/String;ILjava/lang/Object;)Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->a:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->b:Ljava/lang/String;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->c:Lco/bird/android/model/wire/WireBird;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->d:Ljava/util/List;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->e:Ljava/lang/String;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->a(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;Ljava/lang/String;Lco/bird/android/model/wire/WireBird;Ljava/util/List;Ljava/lang/String;)Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;Ljava/lang/String;Lco/bird/android/model/wire/WireBird;Ljava/util/List;Ljava/lang/String;)Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;",
            "Ljava/lang/String;",
            "Lco/bird/android/model/wire/WireBird;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WirePhysicalLock;",
            ">;",
            "Ljava/lang/String;",
            ")",
            "Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;"
        }
    .end annotation

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "birdId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bird"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "physicalLocks"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;-><init>(Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;Ljava/lang/String;Lco/bird/android/model/wire/WireBird;Ljava/util/List;Ljava/lang/String;)V

    return-object v0
.end method

.method public final b()Lco/bird/android/model/wire/WireBird;
    .locals 1

    iget-object v0, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->c:Lco/bird/android/model/wire/WireBird;

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->b:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WirePhysicalLock;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->d:Ljava/util/List;

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->e:Ljava/lang/String;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;

    iget-object v1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->a:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;

    iget-object v3, p1, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->a:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->b:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->b:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->c:Lco/bird/android/model/wire/WireBird;

    iget-object v3, p1, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->c:Lco/bird/android/model/wire/WireBird;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->d:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->d:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->e:Ljava/lang/String;

    iget-object p1, p1, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->e:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final f()Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;
    .locals 1

    iget-object v0, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->a:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->a:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->c:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBird;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->d:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->e:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->a:Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$c;

    iget-object v1, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->b:Ljava/lang/String;

    iget-object v2, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->c:Lco/bird/android/model/wire/WireBird;

    iget-object v3, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->d:Ljava/util/List;

    iget-object v4, p0, Lco/bird/android/smartlock/impl/SmartLockGlobalBluetoothScanner$d;->e:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "SmartLockScannableBird(type="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", birdId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", bird="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", physicalLocks="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", rideId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final LH35;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u0003\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0015\u0010\u0004\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001J\t\u0010\u0006\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0008\u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010\u000b\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR$\u0010\u0016\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R$\u0010\u001c\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\u0018\u001a\u0004\u0008\u0010\u0010\u0019\"\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001f"
    }
    d2 = {
        "LH35;",
        "",
        "Lco/bird/android/model/wire/WireRideDetail;",
        "rideDetail",
        "a",
        "",
        "toString",
        "",
        "hashCode",
        "other",
        "",
        "equals",
        "Lco/bird/android/model/wire/WireRideDetail;",
        "d",
        "()Lco/bird/android/model/wire/WireRideDetail;",
        "",
        "b",
        "Ljava/lang/Throwable;",
        "c",
        "()Ljava/lang/Throwable;",
        "f",
        "(Ljava/lang/Throwable;)V",
        "error",
        "LNy;",
        "LNy;",
        "()LNy;",
        "e",
        "(LNy;)V",
        "alert",
        "<init>",
        "(Lco/bird/android/model/wire/WireRideDetail;)V",
        "ride-end-summary_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lco/bird/android/model/wire/WireRideDetail;

.field public b:Ljava/lang/Throwable;

.field public c:LNy;


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, LH35;-><init>(Lco/bird/android/model/wire/WireRideDetail;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/wire/WireRideDetail;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LH35;->a:Lco/bird/android/model/wire/WireRideDetail;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/wire/WireRideDetail;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1}, LH35;-><init>(Lco/bird/android/model/wire/WireRideDetail;)V

    return-void
.end method

.method public static synthetic copy$default(LH35;Lco/bird/android/model/wire/WireRideDetail;ILjava/lang/Object;)LH35;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, LH35;->a:Lco/bird/android/model/wire/WireRideDetail;

    :cond_0
    invoke-virtual {p0, p1}, LH35;->a(Lco/bird/android/model/wire/WireRideDetail;)LH35;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Lco/bird/android/model/wire/WireRideDetail;)LH35;
    .locals 1

    new-instance v0, LH35;

    invoke-direct {v0, p1}, LH35;-><init>(Lco/bird/android/model/wire/WireRideDetail;)V

    return-object v0
.end method

.method public final b()LNy;
    .locals 1

    iget-object v0, p0, LH35;->c:LNy;

    return-object v0
.end method

.method public final c()Ljava/lang/Throwable;
    .locals 1

    iget-object v0, p0, LH35;->b:Ljava/lang/Throwable;

    return-object v0
.end method

.method public final d()Lco/bird/android/model/wire/WireRideDetail;
    .locals 1

    iget-object v0, p0, LH35;->a:Lco/bird/android/model/wire/WireRideDetail;

    return-object v0
.end method

.method public final e(LNy;)V
    .locals 0

    iput-object p1, p0, LH35;->c:LNy;

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LH35;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LH35;

    iget-object v1, p0, LH35;->a:Lco/bird/android/model/wire/WireRideDetail;

    iget-object p1, p1, LH35;->a:Lco/bird/android/model/wire/WireRideDetail;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final f(Ljava/lang/Throwable;)V
    .locals 0

    iput-object p1, p0, LH35;->b:Ljava/lang/Throwable;

    return-void
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LH35;->a:Lco/bird/android/model/wire/WireRideDetail;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lco/bird/android/model/wire/WireRideDetail;->hashCode()I

    move-result v0

    :goto_0
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, LH35;->a:Lco/bird/android/model/wire/WireRideDetail;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "RideReportState(rideDetail="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

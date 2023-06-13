.class public final Lys;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lys$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0016\u0008\u0082\u0008\u0018\u0000 \"2\u00020\u0001:\u0001\u0003B-\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0006\u0012\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008 \u0010!J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0017\u0010\u0014\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u001d\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u001c\u001a\u0004\u0008\u001d\u0010\u001e\u00a8\u0006#"
    }
    d2 = {
        "Lys;",
        "",
        "Lco/bird/android/model/Balance;",
        "a",
        "Lco/bird/android/model/wire/configs/RideConfig;",
        "b",
        "",
        "c",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/api/response/ReloadConfigResponse;",
        "d",
        "",
        "toString",
        "",
        "hashCode",
        "other",
        "equals",
        "Lco/bird/android/model/Balance;",
        "getBalance",
        "()Lco/bird/android/model/Balance;",
        "balance",
        "Lco/bird/android/model/wire/configs/RideConfig;",
        "getRideConfig",
        "()Lco/bird/android/model/wire/configs/RideConfig;",
        "rideConfig",
        "Z",
        "isAutoPayV2",
        "()Z",
        "Lco/bird/android/buava/Optional;",
        "getReloadConfig",
        "()Lco/bird/android/buava/Optional;",
        "reloadConfig",
        "<init>",
        "(Lco/bird/android/model/Balance;Lco/bird/android/model/wire/configs/RideConfig;ZLco/bird/android/buava/Optional;)V",
        "e",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final e:Lys$a;


# instance fields
.field public final a:Lco/bird/android/model/Balance;

.field public final b:Lco/bird/android/model/wire/configs/RideConfig;

.field public final c:Z

.field public final d:Lco/bird/android/buava/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/api/response/ReloadConfigResponse;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lys$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lys$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lys;->e:Lys$a;

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/Balance;Lco/bird/android/model/wire/configs/RideConfig;ZLco/bird/android/buava/Optional;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Balance;",
            "Lco/bird/android/model/wire/configs/RideConfig;",
            "Z",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/api/response/ReloadConfigResponse;",
            ">;)V"
        }
    .end annotation

    const-string v0, "balance"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rideConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reloadConfig"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lys;->a:Lco/bird/android/model/Balance;

    iput-object p2, p0, Lys;->b:Lco/bird/android/model/wire/configs/RideConfig;

    iput-boolean p3, p0, Lys;->c:Z

    iput-object p4, p0, Lys;->d:Lco/bird/android/buava/Optional;

    return-void
.end method


# virtual methods
.method public final a()Lco/bird/android/model/Balance;
    .locals 1

    iget-object v0, p0, Lys;->a:Lco/bird/android/model/Balance;

    return-object v0
.end method

.method public final b()Lco/bird/android/model/wire/configs/RideConfig;
    .locals 1

    iget-object v0, p0, Lys;->b:Lco/bird/android/model/wire/configs/RideConfig;

    return-object v0
.end method

.method public final c()Z
    .locals 1

    iget-boolean v0, p0, Lys;->c:Z

    return v0
.end method

.method public final d()Lco/bird/android/buava/Optional;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/api/response/ReloadConfigResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lys;->d:Lco/bird/android/buava/Optional;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lys;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lys;

    iget-object v1, p0, Lys;->a:Lco/bird/android/model/Balance;

    iget-object v3, p1, Lys;->a:Lco/bird/android/model/Balance;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lys;->b:Lco/bird/android/model/wire/configs/RideConfig;

    iget-object v3, p1, Lys;->b:Lco/bird/android/model/wire/configs/RideConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lys;->c:Z

    iget-boolean v3, p1, Lys;->c:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lys;->d:Lco/bird/android/buava/Optional;

    iget-object p1, p1, Lys;->d:Lco/bird/android/buava/Optional;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lys;->a:Lco/bird/android/model/Balance;

    invoke-virtual {v0}, Lco/bird/android/model/Balance;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lys;->b:Lco/bird/android/model/wire/configs/RideConfig;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/RideConfig;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lys;->c:Z

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lys;->d:Lco/bird/android/buava/Optional;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lys;->a:Lco/bird/android/model/Balance;

    iget-object v1, p0, Lys;->b:Lco/bird/android/model/wire/configs/RideConfig;

    iget-boolean v2, p0, Lys;->c:Z

    iget-object v3, p0, Lys;->d:Lco/bird/android/buava/Optional;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "AutoReloadConfig(balance="

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", rideConfig="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isAutoPayV2="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", reloadConfig="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

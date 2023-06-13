.class public final Lco/bird/android/model/wire/configs/BaseRentalConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u000f\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B#\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0014\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00082\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\r\u00a8\u0006\u001b"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/BaseRentalConfig;",
        "",
        "dropOffConfig",
        "Lco/bird/android/model/wire/configs/RentalConfig;",
        "pickUpConfig",
        "onDemandConfig",
        "(Lco/bird/android/model/wire/configs/RentalConfig;Lco/bird/android/model/wire/configs/RentalConfig;Lco/bird/android/model/wire/configs/RentalConfig;)V",
        "atLeastOneEnabled",
        "",
        "getAtLeastOneEnabled",
        "()Z",
        "config",
        "getConfig",
        "()Lco/bird/android/model/wire/configs/RentalConfig;",
        "getDropOffConfig",
        "getOnDemandConfig",
        "getPickUpConfig",
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
        "model-wire_release"
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
.field private final dropOffConfig:Lco/bird/android/model/wire/configs/RentalConfig;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "drop_off"
    .end annotation

    .annotation runtime Lft5;
        value = "drop_off"
    .end annotation
.end field

.field private final onDemandConfig:Lco/bird/android/model/wire/configs/RentalConfig;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "on_demand"
    .end annotation

    .annotation runtime Lft5;
        value = "on_demand"
    .end annotation
.end field

.field private final pickUpConfig:Lco/bird/android/model/wire/configs/RentalConfig;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "pick_up"
    .end annotation

    .annotation runtime Lft5;
        value = "pick_up"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x7

    const/4 v5, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lco/bird/android/model/wire/configs/BaseRentalConfig;-><init>(Lco/bird/android/model/wire/configs/RentalConfig;Lco/bird/android/model/wire/configs/RentalConfig;Lco/bird/android/model/wire/configs/RentalConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/wire/configs/RentalConfig;Lco/bird/android/model/wire/configs/RentalConfig;Lco/bird/android/model/wire/configs/RentalConfig;)V
    .locals 1

    const-string v0, "dropOffConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pickUpConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDemandConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/wire/configs/BaseRentalConfig;->dropOffConfig:Lco/bird/android/model/wire/configs/RentalConfig;

    iput-object p2, p0, Lco/bird/android/model/wire/configs/BaseRentalConfig;->pickUpConfig:Lco/bird/android/model/wire/configs/RentalConfig;

    iput-object p3, p0, Lco/bird/android/model/wire/configs/BaseRentalConfig;->onDemandConfig:Lco/bird/android/model/wire/configs/RentalConfig;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/wire/configs/RentalConfig;Lco/bird/android/model/wire/configs/RentalConfig;Lco/bird/android/model/wire/configs/RentalConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    new-instance p1, Lco/bird/android/model/wire/configs/RentalConfig;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x3f

    const/4 v8, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v8}, Lco/bird/android/model/wire/configs/RentalConfig;-><init>(ZZLco/bird/android/model/wire/configs/RentalSupportConfig;Lco/bird/android/model/wire/configs/RentalContentConfig;Lco/bird/android/model/wire/configs/OnDemandPillConfig;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    new-instance p2, Lco/bird/android/model/wire/configs/RentalConfig;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x3f

    const/4 v8, 0x0

    move-object v0, p2

    invoke-direct/range {v0 .. v8}, Lco/bird/android/model/wire/configs/RentalConfig;-><init>(ZZLco/bird/android/model/wire/configs/RentalSupportConfig;Lco/bird/android/model/wire/configs/RentalContentConfig;Lco/bird/android/model/wire/configs/OnDemandPillConfig;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    new-instance p3, Lco/bird/android/model/wire/configs/RentalConfig;

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x3f

    const/4 v8, 0x0

    move-object v0, p3

    invoke-direct/range {v0 .. v8}, Lco/bird/android/model/wire/configs/RentalConfig;-><init>(ZZLco/bird/android/model/wire/configs/RentalSupportConfig;Lco/bird/android/model/wire/configs/RentalContentConfig;Lco/bird/android/model/wire/configs/OnDemandPillConfig;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/model/wire/configs/BaseRentalConfig;-><init>(Lco/bird/android/model/wire/configs/RentalConfig;Lco/bird/android/model/wire/configs/RentalConfig;Lco/bird/android/model/wire/configs/RentalConfig;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/configs/BaseRentalConfig;Lco/bird/android/model/wire/configs/RentalConfig;Lco/bird/android/model/wire/configs/RentalConfig;Lco/bird/android/model/wire/configs/RentalConfig;ILjava/lang/Object;)Lco/bird/android/model/wire/configs/BaseRentalConfig;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lco/bird/android/model/wire/configs/BaseRentalConfig;->dropOffConfig:Lco/bird/android/model/wire/configs/RentalConfig;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lco/bird/android/model/wire/configs/BaseRentalConfig;->pickUpConfig:Lco/bird/android/model/wire/configs/RentalConfig;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lco/bird/android/model/wire/configs/BaseRentalConfig;->onDemandConfig:Lco/bird/android/model/wire/configs/RentalConfig;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/model/wire/configs/BaseRentalConfig;->copy(Lco/bird/android/model/wire/configs/RentalConfig;Lco/bird/android/model/wire/configs/RentalConfig;Lco/bird/android/model/wire/configs/RentalConfig;)Lco/bird/android/model/wire/configs/BaseRentalConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/wire/configs/RentalConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/BaseRentalConfig;->dropOffConfig:Lco/bird/android/model/wire/configs/RentalConfig;

    return-object v0
.end method

.method public final component2()Lco/bird/android/model/wire/configs/RentalConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/BaseRentalConfig;->pickUpConfig:Lco/bird/android/model/wire/configs/RentalConfig;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/wire/configs/RentalConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/BaseRentalConfig;->onDemandConfig:Lco/bird/android/model/wire/configs/RentalConfig;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/wire/configs/RentalConfig;Lco/bird/android/model/wire/configs/RentalConfig;Lco/bird/android/model/wire/configs/RentalConfig;)Lco/bird/android/model/wire/configs/BaseRentalConfig;
    .locals 1

    const-string v0, "dropOffConfig"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "pickUpConfig"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDemandConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/configs/BaseRentalConfig;

    invoke-direct {v0, p1, p2, p3}, Lco/bird/android/model/wire/configs/BaseRentalConfig;-><init>(Lco/bird/android/model/wire/configs/RentalConfig;Lco/bird/android/model/wire/configs/RentalConfig;Lco/bird/android/model/wire/configs/RentalConfig;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/configs/BaseRentalConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/configs/BaseRentalConfig;

    iget-object v1, p0, Lco/bird/android/model/wire/configs/BaseRentalConfig;->dropOffConfig:Lco/bird/android/model/wire/configs/RentalConfig;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/BaseRentalConfig;->dropOffConfig:Lco/bird/android/model/wire/configs/RentalConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/wire/configs/BaseRentalConfig;->pickUpConfig:Lco/bird/android/model/wire/configs/RentalConfig;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/BaseRentalConfig;->pickUpConfig:Lco/bird/android/model/wire/configs/RentalConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/wire/configs/BaseRentalConfig;->onDemandConfig:Lco/bird/android/model/wire/configs/RentalConfig;

    iget-object p1, p1, Lco/bird/android/model/wire/configs/BaseRentalConfig;->onDemandConfig:Lco/bird/android/model/wire/configs/RentalConfig;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getAtLeastOneEnabled()Z
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/BaseRentalConfig;->dropOffConfig:Lco/bird/android/model/wire/configs/RentalConfig;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RentalConfig;->getEnabled()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lco/bird/android/model/wire/configs/BaseRentalConfig;->pickUpConfig:Lco/bird/android/model/wire/configs/RentalConfig;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RentalConfig;->getEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    iget-object v0, p0, Lco/bird/android/model/wire/configs/BaseRentalConfig;->onDemandConfig:Lco/bird/android/model/wire/configs/RentalConfig;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RentalConfig;->getEnabled()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final getConfig()Lco/bird/android/model/wire/configs/RentalConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/BaseRentalConfig;->pickUpConfig:Lco/bird/android/model/wire/configs/RentalConfig;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RentalConfig;->getEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lco/bird/android/model/wire/configs/BaseRentalConfig;->pickUpConfig:Lco/bird/android/model/wire/configs/RentalConfig;

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/android/model/wire/configs/BaseRentalConfig;->dropOffConfig:Lco/bird/android/model/wire/configs/RentalConfig;

    :goto_0
    return-object v0
.end method

.method public final getDropOffConfig()Lco/bird/android/model/wire/configs/RentalConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/BaseRentalConfig;->dropOffConfig:Lco/bird/android/model/wire/configs/RentalConfig;

    return-object v0
.end method

.method public final getOnDemandConfig()Lco/bird/android/model/wire/configs/RentalConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/BaseRentalConfig;->onDemandConfig:Lco/bird/android/model/wire/configs/RentalConfig;

    return-object v0
.end method

.method public final getPickUpConfig()Lco/bird/android/model/wire/configs/RentalConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/BaseRentalConfig;->pickUpConfig:Lco/bird/android/model/wire/configs/RentalConfig;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/wire/configs/BaseRentalConfig;->dropOffConfig:Lco/bird/android/model/wire/configs/RentalConfig;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RentalConfig;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/BaseRentalConfig;->pickUpConfig:Lco/bird/android/model/wire/configs/RentalConfig;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/RentalConfig;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/BaseRentalConfig;->onDemandConfig:Lco/bird/android/model/wire/configs/RentalConfig;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/RentalConfig;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lco/bird/android/model/wire/configs/BaseRentalConfig;->dropOffConfig:Lco/bird/android/model/wire/configs/RentalConfig;

    iget-object v1, p0, Lco/bird/android/model/wire/configs/BaseRentalConfig;->pickUpConfig:Lco/bird/android/model/wire/configs/RentalConfig;

    iget-object v2, p0, Lco/bird/android/model/wire/configs/BaseRentalConfig;->onDemandConfig:Lco/bird/android/model/wire/configs/RentalConfig;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "BaseRentalConfig(dropOffConfig="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", pickUpConfig="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", onDemandConfig="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

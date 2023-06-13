.class public final Lco/bird/android/model/wire/configs/RiderProfileConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0015\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001BC\u0012\u0014\u0008\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000bJ\u0015\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0008H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003JG\u0010\u0019\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u0008H\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\"\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000fR\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u001f"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/RiderProfileConfig;",
        "",
        "enableBeginnerModeByModel",
        "",
        "Lco/bird/android/model/constant/BirdModel;",
        "",
        "enableBeginnerModeOnboarding",
        "riderMapToggleMaxRides",
        "",
        "enableToggleInRide",
        "enableToggleOutOfRide",
        "(Ljava/util/Map;ZIZZ)V",
        "getEnableBeginnerModeByModel",
        "()Ljava/util/Map;",
        "getEnableBeginnerModeOnboarding",
        "()Z",
        "getEnableToggleInRide",
        "getEnableToggleOutOfRide",
        "getRiderMapToggleMaxRides",
        "()I",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "other",
        "hashCode",
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
.field private final enableBeginnerModeByModel:Ljava/util/Map;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_beginner_mode_by_model"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lco/bird/android/model/constant/BirdModel;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "enable_beginner_mode_by_model"
    .end annotation
.end field

.field private final enableBeginnerModeOnboarding:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_beginner_mode_onboarding"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_beginner_mode_onboarding"
    .end annotation
.end field

.field private final enableToggleInRide:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_toggle_in_ride"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_toggle_in_ride"
    .end annotation
.end field

.field private final enableToggleOutOfRide:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_toggle_out_of_ride"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_toggle_out_of_ride"
    .end annotation
.end field

.field private final riderMapToggleMaxRides:I
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "rider_map_toggle_max_rides"
    .end annotation

    .annotation runtime Lft5;
        value = "rider_map_toggle_max_rides"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 8

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x1f

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lco/bird/android/model/wire/configs/RiderProfileConfig;-><init>(Ljava/util/Map;ZIZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Map;ZIZZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lco/bird/android/model/constant/BirdModel;",
            "Ljava/lang/Boolean;",
            ">;ZIZZ)V"
        }
    .end annotation

    const-string v0, "enableBeginnerModeByModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableBeginnerModeByModel:Ljava/util/Map;

    iput-boolean p2, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableBeginnerModeOnboarding:Z

    iput p3, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->riderMapToggleMaxRides:I

    iput-boolean p4, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableToggleInRide:Z

    iput-boolean p5, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableToggleOutOfRide:Z

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Map;ZIZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object p1

    :cond_0
    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_1

    move p7, v0

    goto :goto_0

    :cond_1
    move p7, p2

    :goto_0
    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    const/4 p3, 0x3

    :cond_2
    move v1, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    move v2, v0

    goto :goto_1

    :cond_3
    move v2, p4

    :goto_1
    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    goto :goto_2

    :cond_4
    move v0, p5

    :goto_2
    move-object p2, p0

    move-object p3, p1

    move p4, p7

    move p5, v1

    move p6, v2

    move p7, v0

    invoke-direct/range {p2 .. p7}, Lco/bird/android/model/wire/configs/RiderProfileConfig;-><init>(Ljava/util/Map;ZIZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/configs/RiderProfileConfig;Ljava/util/Map;ZIZZILjava/lang/Object;)Lco/bird/android/model/wire/configs/RiderProfileConfig;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableBeginnerModeByModel:Ljava/util/Map;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-boolean p2, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableBeginnerModeOnboarding:Z

    :cond_1
    move p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget p3, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->riderMapToggleMaxRides:I

    :cond_2
    move v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-boolean p4, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableToggleInRide:Z

    :cond_3
    move v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-boolean p5, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableToggleOutOfRide:Z

    :cond_4
    move v2, p5

    move-object p2, p0

    move-object p3, p1

    move p4, p7

    move p5, v0

    move p6, v1

    move p7, v2

    invoke-virtual/range {p2 .. p7}, Lco/bird/android/model/wire/configs/RiderProfileConfig;->copy(Ljava/util/Map;ZIZZ)Lco/bird/android/model/wire/configs/RiderProfileConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lco/bird/android/model/constant/BirdModel;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableBeginnerModeByModel:Ljava/util/Map;

    return-object v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableBeginnerModeOnboarding:Z

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->riderMapToggleMaxRides:I

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableToggleInRide:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableToggleOutOfRide:Z

    return v0
.end method

.method public final copy(Ljava/util/Map;ZIZZ)Lco/bird/android/model/wire/configs/RiderProfileConfig;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lco/bird/android/model/constant/BirdModel;",
            "Ljava/lang/Boolean;",
            ">;ZIZZ)",
            "Lco/bird/android/model/wire/configs/RiderProfileConfig;"
        }
    .end annotation

    const-string v0, "enableBeginnerModeByModel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/configs/RiderProfileConfig;

    move-object v1, v0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lco/bird/android/model/wire/configs/RiderProfileConfig;-><init>(Ljava/util/Map;ZIZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/configs/RiderProfileConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/configs/RiderProfileConfig;

    iget-object v1, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableBeginnerModeByModel:Ljava/util/Map;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableBeginnerModeByModel:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableBeginnerModeOnboarding:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableBeginnerModeOnboarding:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->riderMapToggleMaxRides:I

    iget v3, p1, Lco/bird/android/model/wire/configs/RiderProfileConfig;->riderMapToggleMaxRides:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableToggleInRide:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableToggleInRide:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableToggleOutOfRide:Z

    iget-boolean p1, p1, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableToggleOutOfRide:Z

    if-eq v1, p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getEnableBeginnerModeByModel()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lco/bird/android/model/constant/BirdModel;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableBeginnerModeByModel:Ljava/util/Map;

    return-object v0
.end method

.method public final getEnableBeginnerModeOnboarding()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableBeginnerModeOnboarding:Z

    return v0
.end method

.method public final getEnableToggleInRide()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableToggleInRide:Z

    return v0
.end method

.method public final getEnableToggleOutOfRide()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableToggleOutOfRide:Z

    return v0
.end method

.method public final getRiderMapToggleMaxRides()I
    .locals 1

    iget v0, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->riderMapToggleMaxRides:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableBeginnerModeByModel:Ljava/util/Map;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableBeginnerModeOnboarding:Z

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    move v1, v2

    :cond_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->riderMapToggleMaxRides:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableToggleInRide:Z

    if-eqz v1, :cond_1

    move v1, v2

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableToggleOutOfRide:Z

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_2
    move v2, v1

    :goto_0
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableBeginnerModeByModel:Ljava/util/Map;

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableBeginnerModeOnboarding:Z

    iget v2, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->riderMapToggleMaxRides:I

    iget-boolean v3, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableToggleInRide:Z

    iget-boolean v4, p0, Lco/bird/android/model/wire/configs/RiderProfileConfig;->enableToggleOutOfRide:Z

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "RiderProfileConfig(enableBeginnerModeByModel="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", enableBeginnerModeOnboarding="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", riderMapToggleMaxRides="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", enableToggleInRide="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", enableToggleOutOfRide="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final Lco/bird/android/model/wire/configs/EndRideRatingConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000e\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B#\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u000e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u0008\u00a8\u0006\u0015"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/EndRideRatingConfig;",
        "",
        "enableEndRideRatingIssuesV2",
        "",
        "enableEndRideRatingIssuesV2Grouped",
        "enableEndRideRatingIssuesV2Tabbed",
        "(ZZZ)V",
        "getEnableEndRideRatingIssuesV2",
        "()Z",
        "getEnableEndRideRatingIssuesV2Grouped",
        "getEnableEndRideRatingIssuesV2Tabbed",
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
.field private final enableEndRideRatingIssuesV2:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_end_ride_rating_issues_v2"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_end_ride_rating_issues_v2"
    .end annotation
.end field

.field private final enableEndRideRatingIssuesV2Grouped:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_end_ride_rating_issues_v2_grouped"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_end_ride_rating_issues_v2_grouped"
    .end annotation
.end field

.field private final enableEndRideRatingIssuesV2Tabbed:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enable_end_ride_rating_issues_v2_tabbed"
    .end annotation

    .annotation runtime Lft5;
        value = "enable_end_ride_rating_issues_v2_tabbed"
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

    invoke-direct/range {v0 .. v5}, Lco/bird/android/model/wire/configs/EndRideRatingConfig;-><init>(ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lco/bird/android/model/wire/configs/EndRideRatingConfig;->enableEndRideRatingIssuesV2:Z

    iput-boolean p2, p0, Lco/bird/android/model/wire/configs/EndRideRatingConfig;->enableEndRideRatingIssuesV2Grouped:Z

    iput-boolean p3, p0, Lco/bird/android/model/wire/configs/EndRideRatingConfig;->enableEndRideRatingIssuesV2Tabbed:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move p3, v0

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/model/wire/configs/EndRideRatingConfig;-><init>(ZZZ)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/configs/EndRideRatingConfig;ZZZILjava/lang/Object;)Lco/bird/android/model/wire/configs/EndRideRatingConfig;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-boolean p1, p0, Lco/bird/android/model/wire/configs/EndRideRatingConfig;->enableEndRideRatingIssuesV2:Z

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-boolean p2, p0, Lco/bird/android/model/wire/configs/EndRideRatingConfig;->enableEndRideRatingIssuesV2Grouped:Z

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-boolean p3, p0, Lco/bird/android/model/wire/configs/EndRideRatingConfig;->enableEndRideRatingIssuesV2Tabbed:Z

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/model/wire/configs/EndRideRatingConfig;->copy(ZZZ)Lco/bird/android/model/wire/configs/EndRideRatingConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/EndRideRatingConfig;->enableEndRideRatingIssuesV2:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/EndRideRatingConfig;->enableEndRideRatingIssuesV2Grouped:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/EndRideRatingConfig;->enableEndRideRatingIssuesV2Tabbed:Z

    return v0
.end method

.method public final copy(ZZZ)Lco/bird/android/model/wire/configs/EndRideRatingConfig;
    .locals 1

    new-instance v0, Lco/bird/android/model/wire/configs/EndRideRatingConfig;

    invoke-direct {v0, p1, p2, p3}, Lco/bird/android/model/wire/configs/EndRideRatingConfig;-><init>(ZZZ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/configs/EndRideRatingConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/configs/EndRideRatingConfig;

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/EndRideRatingConfig;->enableEndRideRatingIssuesV2:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/EndRideRatingConfig;->enableEndRideRatingIssuesV2:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/EndRideRatingConfig;->enableEndRideRatingIssuesV2Grouped:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/EndRideRatingConfig;->enableEndRideRatingIssuesV2Grouped:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/EndRideRatingConfig;->enableEndRideRatingIssuesV2Tabbed:Z

    iget-boolean p1, p1, Lco/bird/android/model/wire/configs/EndRideRatingConfig;->enableEndRideRatingIssuesV2Tabbed:Z

    if-eq v1, p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getEnableEndRideRatingIssuesV2()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/EndRideRatingConfig;->enableEndRideRatingIssuesV2:Z

    return v0
.end method

.method public final getEnableEndRideRatingIssuesV2Grouped()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/EndRideRatingConfig;->enableEndRideRatingIssuesV2Grouped:Z

    return v0
.end method

.method public final getEnableEndRideRatingIssuesV2Tabbed()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/EndRideRatingConfig;->enableEndRideRatingIssuesV2Tabbed:Z

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/EndRideRatingConfig;->enableEndRideRatingIssuesV2:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/EndRideRatingConfig;->enableEndRideRatingIssuesV2Grouped:Z

    if-eqz v2, :cond_1

    move v2, v1

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/EndRideRatingConfig;->enableEndRideRatingIssuesV2Tabbed:Z

    if-eqz v2, :cond_2

    goto :goto_0

    :cond_2
    move v1, v2

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/EndRideRatingConfig;->enableEndRideRatingIssuesV2:Z

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/EndRideRatingConfig;->enableEndRideRatingIssuesV2Grouped:Z

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/EndRideRatingConfig;->enableEndRideRatingIssuesV2Tabbed:Z

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "EndRideRatingConfig(enableEndRideRatingIssuesV2="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", enableEndRideRatingIssuesV2Grouped="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", enableEndRideRatingIssuesV2Tabbed="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final Lco/bird/api/response/WireBirdActionPairResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B/\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0008\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ8\u0010\u0014\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\u0008\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0008H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001c"
    }
    d2 = {
        "Lco/bird/api/response/WireBirdActionPairResponse;",
        "",
        "bird",
        "Lco/bird/android/model/wire/WireBird;",
        "requiredPartKinds",
        "",
        "Lco/bird/android/model/constant/PartKind;",
        "timeRemainingSeconds",
        "",
        "(Lco/bird/android/model/wire/WireBird;Ljava/util/List;Ljava/lang/Integer;)V",
        "getBird",
        "()Lco/bird/android/model/wire/WireBird;",
        "getRequiredPartKinds",
        "()Ljava/util/List;",
        "getTimeRemainingSeconds",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "component1",
        "component2",
        "component3",
        "copy",
        "(Lco/bird/android/model/wire/WireBird;Ljava/util/List;Ljava/lang/Integer;)Lco/bird/api/response/WireBirdActionPairResponse;",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
        "co.bird.android.api"
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
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "bird"
    .end annotation

    .annotation runtime Lft5;
        value = "bird"
    .end annotation
.end field

.field private final requiredPartKinds:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "required_part_kinds"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/PartKind;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "required_part_kinds"
    .end annotation
.end field

.field private final timeRemainingSeconds:Ljava/lang/Integer;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "time_remaining_seconds"
    .end annotation

    .annotation runtime Lft5;
        value = "time_remaining_seconds"
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

    invoke-direct/range {v0 .. v5}, Lco/bird/api/response/WireBirdActionPairResponse;-><init>(Lco/bird/android/model/wire/WireBird;Ljava/util/List;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/wire/WireBird;Ljava/util/List;Ljava/lang/Integer;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireBird;",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/constant/PartKind;",
            ">;",
            "Ljava/lang/Integer;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/response/WireBirdActionPairResponse;->bird:Lco/bird/android/model/wire/WireBird;

    iput-object p2, p0, Lco/bird/api/response/WireBirdActionPairResponse;->requiredPartKinds:Ljava/util/List;

    iput-object p3, p0, Lco/bird/api/response/WireBirdActionPairResponse;->timeRemainingSeconds:Ljava/lang/Integer;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/wire/WireBird;Ljava/util/List;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lco/bird/api/response/WireBirdActionPairResponse;-><init>(Lco/bird/android/model/wire/WireBird;Ljava/util/List;Ljava/lang/Integer;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/response/WireBirdActionPairResponse;Lco/bird/android/model/wire/WireBird;Ljava/util/List;Ljava/lang/Integer;ILjava/lang/Object;)Lco/bird/api/response/WireBirdActionPairResponse;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lco/bird/api/response/WireBirdActionPairResponse;->bird:Lco/bird/android/model/wire/WireBird;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lco/bird/api/response/WireBirdActionPairResponse;->requiredPartKinds:Ljava/util/List;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lco/bird/api/response/WireBirdActionPairResponse;->timeRemainingSeconds:Ljava/lang/Integer;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/api/response/WireBirdActionPairResponse;->copy(Lco/bird/android/model/wire/WireBird;Ljava/util/List;Ljava/lang/Integer;)Lco/bird/api/response/WireBirdActionPairResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/wire/WireBird;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireBirdActionPairResponse;->bird:Lco/bird/android/model/wire/WireBird;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/PartKind;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/response/WireBirdActionPairResponse;->requiredPartKinds:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireBirdActionPairResponse;->timeRemainingSeconds:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/wire/WireBird;Ljava/util/List;Ljava/lang/Integer;)Lco/bird/api/response/WireBirdActionPairResponse;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireBird;",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/constant/PartKind;",
            ">;",
            "Ljava/lang/Integer;",
            ")",
            "Lco/bird/api/response/WireBirdActionPairResponse;"
        }
    .end annotation

    new-instance v0, Lco/bird/api/response/WireBirdActionPairResponse;

    invoke-direct {v0, p1, p2, p3}, Lco/bird/api/response/WireBirdActionPairResponse;-><init>(Lco/bird/android/model/wire/WireBird;Ljava/util/List;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/response/WireBirdActionPairResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/response/WireBirdActionPairResponse;

    iget-object v1, p0, Lco/bird/api/response/WireBirdActionPairResponse;->bird:Lco/bird/android/model/wire/WireBird;

    iget-object v3, p1, Lco/bird/api/response/WireBirdActionPairResponse;->bird:Lco/bird/android/model/wire/WireBird;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/response/WireBirdActionPairResponse;->requiredPartKinds:Ljava/util/List;

    iget-object v3, p1, Lco/bird/api/response/WireBirdActionPairResponse;->requiredPartKinds:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/api/response/WireBirdActionPairResponse;->timeRemainingSeconds:Ljava/lang/Integer;

    iget-object p1, p1, Lco/bird/api/response/WireBirdActionPairResponse;->timeRemainingSeconds:Ljava/lang/Integer;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getBird()Lco/bird/android/model/wire/WireBird;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireBirdActionPairResponse;->bird:Lco/bird/android/model/wire/WireBird;

    return-object v0
.end method

.method public final getRequiredPartKinds()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/constant/PartKind;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/response/WireBirdActionPairResponse;->requiredPartKinds:Ljava/util/List;

    return-object v0
.end method

.method public final getTimeRemainingSeconds()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireBirdActionPairResponse;->timeRemainingSeconds:Ljava/lang/Integer;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/api/response/WireBirdActionPairResponse;->bird:Lco/bird/android/model/wire/WireBird;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/WireBirdActionPairResponse;->requiredPartKinds:Ljava/util/List;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/WireBirdActionPairResponse;->timeRemainingSeconds:Ljava/lang/Integer;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lco/bird/api/response/WireBirdActionPairResponse;->bird:Lco/bird/android/model/wire/WireBird;

    iget-object v1, p0, Lco/bird/api/response/WireBirdActionPairResponse;->requiredPartKinds:Ljava/util/List;

    iget-object v2, p0, Lco/bird/api/response/WireBirdActionPairResponse;->timeRemainingSeconds:Ljava/lang/Integer;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "WireBirdActionPairResponse(bird="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", requiredPartKinds="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", timeRemainingSeconds="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

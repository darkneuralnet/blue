.class public final Lco/bird/android/model/wire/WireFleetStatusContent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B-\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u001c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001b"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireFleetStatusContent;",
        "",
        "chart",
        "Lco/bird/android/model/wire/WireFleetStatusChart;",
        "states",
        "",
        "Lco/bird/android/model/wire/WireFleetState;",
        "rating",
        "Lco/bird/android/model/wire/WireFleetRating;",
        "(Lco/bird/android/model/wire/WireFleetStatusChart;Ljava/util/List;Lco/bird/android/model/wire/WireFleetRating;)V",
        "getChart",
        "()Lco/bird/android/model/wire/WireFleetStatusChart;",
        "getRating",
        "()Lco/bird/android/model/wire/WireFleetRating;",
        "getStates",
        "()Ljava/util/List;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
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
.field private final chart:Lco/bird/android/model/wire/WireFleetStatusChart;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "chart"
    .end annotation

    .annotation runtime Lft5;
        value = "chart"
    .end annotation
.end field

.field private final rating:Lco/bird/android/model/wire/WireFleetRating;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "rating"
    .end annotation

    .annotation runtime Lft5;
        value = "rating"
    .end annotation
.end field

.field private final states:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "states"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireFleetState;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "states"
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

    invoke-direct/range {v0 .. v5}, Lco/bird/android/model/wire/WireFleetStatusContent;-><init>(Lco/bird/android/model/wire/WireFleetStatusChart;Ljava/util/List;Lco/bird/android/model/wire/WireFleetRating;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lco/bird/android/model/wire/WireFleetStatusChart;Ljava/util/List;Lco/bird/android/model/wire/WireFleetRating;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireFleetStatusChart;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireFleetState;",
            ">;",
            "Lco/bird/android/model/wire/WireFleetRating;",
            ")V"
        }
    .end annotation

    const-string v0, "states"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/wire/WireFleetStatusContent;->chart:Lco/bird/android/model/wire/WireFleetStatusChart;

    iput-object p2, p0, Lco/bird/android/model/wire/WireFleetStatusContent;->states:Ljava/util/List;

    iput-object p3, p0, Lco/bird/android/model/wire/WireFleetStatusContent;->rating:Lco/bird/android/model/wire/WireFleetRating;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/android/model/wire/WireFleetStatusChart;Ljava/util/List;Lco/bird/android/model/wire/WireFleetRating;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p2

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lco/bird/android/model/wire/WireFleetStatusContent;-><init>(Lco/bird/android/model/wire/WireFleetStatusChart;Ljava/util/List;Lco/bird/android/model/wire/WireFleetRating;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/WireFleetStatusContent;Lco/bird/android/model/wire/WireFleetStatusChart;Ljava/util/List;Lco/bird/android/model/wire/WireFleetRating;ILjava/lang/Object;)Lco/bird/android/model/wire/WireFleetStatusContent;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lco/bird/android/model/wire/WireFleetStatusContent;->chart:Lco/bird/android/model/wire/WireFleetStatusChart;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lco/bird/android/model/wire/WireFleetStatusContent;->states:Ljava/util/List;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lco/bird/android/model/wire/WireFleetStatusContent;->rating:Lco/bird/android/model/wire/WireFleetRating;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/android/model/wire/WireFleetStatusContent;->copy(Lco/bird/android/model/wire/WireFleetStatusChart;Ljava/util/List;Lco/bird/android/model/wire/WireFleetRating;)Lco/bird/android/model/wire/WireFleetStatusContent;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/model/wire/WireFleetStatusChart;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFleetStatusContent;->chart:Lco/bird/android/model/wire/WireFleetStatusChart;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireFleetState;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireFleetStatusContent;->states:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lco/bird/android/model/wire/WireFleetRating;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFleetStatusContent;->rating:Lco/bird/android/model/wire/WireFleetRating;

    return-object v0
.end method

.method public final copy(Lco/bird/android/model/wire/WireFleetStatusChart;Ljava/util/List;Lco/bird/android/model/wire/WireFleetRating;)Lco/bird/android/model/wire/WireFleetStatusContent;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireFleetStatusChart;",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireFleetState;",
            ">;",
            "Lco/bird/android/model/wire/WireFleetRating;",
            ")",
            "Lco/bird/android/model/wire/WireFleetStatusContent;"
        }
    .end annotation

    const-string v0, "states"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/wire/WireFleetStatusContent;

    invoke-direct {v0, p1, p2, p3}, Lco/bird/android/model/wire/WireFleetStatusContent;-><init>(Lco/bird/android/model/wire/WireFleetStatusChart;Ljava/util/List;Lco/bird/android/model/wire/WireFleetRating;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/WireFleetStatusContent;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/WireFleetStatusContent;

    iget-object v1, p0, Lco/bird/android/model/wire/WireFleetStatusContent;->chart:Lco/bird/android/model/wire/WireFleetStatusChart;

    iget-object v3, p1, Lco/bird/android/model/wire/WireFleetStatusContent;->chart:Lco/bird/android/model/wire/WireFleetStatusChart;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/wire/WireFleetStatusContent;->states:Ljava/util/List;

    iget-object v3, p1, Lco/bird/android/model/wire/WireFleetStatusContent;->states:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/wire/WireFleetStatusContent;->rating:Lco/bird/android/model/wire/WireFleetRating;

    iget-object p1, p1, Lco/bird/android/model/wire/WireFleetStatusContent;->rating:Lco/bird/android/model/wire/WireFleetRating;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getChart()Lco/bird/android/model/wire/WireFleetStatusChart;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFleetStatusContent;->chart:Lco/bird/android/model/wire/WireFleetStatusChart;

    return-object v0
.end method

.method public final getRating()Lco/bird/android/model/wire/WireFleetRating;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/WireFleetStatusContent;->rating:Lco/bird/android/model/wire/WireFleetRating;

    return-object v0
.end method

.method public final getStates()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/android/model/wire/WireFleetState;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/wire/WireFleetStatusContent;->states:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/android/model/wire/WireFleetStatusContent;->chart:Lco/bird/android/model/wire/WireFleetStatusChart;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lco/bird/android/model/wire/WireFleetStatusChart;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/WireFleetStatusContent;->states:Ljava/util/List;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/WireFleetStatusContent;->rating:Lco/bird/android/model/wire/WireFleetRating;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lco/bird/android/model/wire/WireFleetRating;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lco/bird/android/model/wire/WireFleetStatusContent;->chart:Lco/bird/android/model/wire/WireFleetStatusChart;

    iget-object v1, p0, Lco/bird/android/model/wire/WireFleetStatusContent;->states:Ljava/util/List;

    iget-object v2, p0, Lco/bird/android/model/wire/WireFleetStatusContent;->rating:Lco/bird/android/model/wire/WireFleetRating;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "WireFleetStatusContent(chart="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", states="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", rating="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

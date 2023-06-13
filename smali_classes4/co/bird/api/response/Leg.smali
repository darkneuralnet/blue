.class public final Lco/bird/api/response/Leg;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B-\u0012\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u001c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001b"
    }
    d2 = {
        "Lco/bird/api/response/Leg;",
        "",
        "steps",
        "",
        "Lco/bird/api/response/Step;",
        "distance",
        "Lco/bird/api/response/Distance;",
        "duration",
        "Lco/bird/api/response/Duration;",
        "(Ljava/util/List;Lco/bird/api/response/Distance;Lco/bird/api/response/Duration;)V",
        "getDistance",
        "()Lco/bird/api/response/Distance;",
        "getDuration",
        "()Lco/bird/api/response/Duration;",
        "getSteps",
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
.field private final distance:Lco/bird/api/response/Distance;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "distance"
    .end annotation

    .annotation runtime Lft5;
        value = "distance"
    .end annotation
.end field

.field private final duration:Lco/bird/api/response/Duration;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "duration"
    .end annotation

    .annotation runtime Lft5;
        value = "duration"
    .end annotation
.end field

.field private final steps:Ljava/util/List;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "steps"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lco/bird/api/response/Step;",
            ">;"
        }
    .end annotation

    .annotation runtime Lft5;
        value = "steps"
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

    invoke-direct/range {v0 .. v5}, Lco/bird/api/response/Leg;-><init>(Ljava/util/List;Lco/bird/api/response/Distance;Lco/bird/api/response/Duration;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lco/bird/api/response/Distance;Lco/bird/api/response/Duration;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/api/response/Step;",
            ">;",
            "Lco/bird/api/response/Distance;",
            "Lco/bird/api/response/Duration;",
            ")V"
        }
    .end annotation

    const-string v0, "steps"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/response/Leg;->steps:Ljava/util/List;

    iput-object p2, p0, Lco/bird/api/response/Leg;->distance:Lco/bird/api/response/Distance;

    iput-object p3, p0, Lco/bird/api/response/Leg;->duration:Lco/bird/api/response/Duration;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lco/bird/api/response/Distance;Lco/bird/api/response/Duration;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    :cond_0
    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lco/bird/api/response/Leg;-><init>(Ljava/util/List;Lco/bird/api/response/Distance;Lco/bird/api/response/Duration;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/response/Leg;Ljava/util/List;Lco/bird/api/response/Distance;Lco/bird/api/response/Duration;ILjava/lang/Object;)Lco/bird/api/response/Leg;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lco/bird/api/response/Leg;->steps:Ljava/util/List;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lco/bird/api/response/Leg;->distance:Lco/bird/api/response/Distance;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lco/bird/api/response/Leg;->duration:Lco/bird/api/response/Duration;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/api/response/Leg;->copy(Ljava/util/List;Lco/bird/api/response/Distance;Lco/bird/api/response/Duration;)Lco/bird/api/response/Leg;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/api/response/Step;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/response/Leg;->steps:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Lco/bird/api/response/Distance;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/Leg;->distance:Lco/bird/api/response/Distance;

    return-object v0
.end method

.method public final component3()Lco/bird/api/response/Duration;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/Leg;->duration:Lco/bird/api/response/Duration;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Lco/bird/api/response/Distance;Lco/bird/api/response/Duration;)Lco/bird/api/response/Leg;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/api/response/Step;",
            ">;",
            "Lco/bird/api/response/Distance;",
            "Lco/bird/api/response/Duration;",
            ")",
            "Lco/bird/api/response/Leg;"
        }
    .end annotation

    const-string v0, "steps"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/api/response/Leg;

    invoke-direct {v0, p1, p2, p3}, Lco/bird/api/response/Leg;-><init>(Ljava/util/List;Lco/bird/api/response/Distance;Lco/bird/api/response/Duration;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/response/Leg;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/response/Leg;

    iget-object v1, p0, Lco/bird/api/response/Leg;->steps:Ljava/util/List;

    iget-object v3, p1, Lco/bird/api/response/Leg;->steps:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/response/Leg;->distance:Lco/bird/api/response/Distance;

    iget-object v3, p1, Lco/bird/api/response/Leg;->distance:Lco/bird/api/response/Distance;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/api/response/Leg;->duration:Lco/bird/api/response/Duration;

    iget-object p1, p1, Lco/bird/api/response/Leg;->duration:Lco/bird/api/response/Duration;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getDistance()Lco/bird/api/response/Distance;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/Leg;->distance:Lco/bird/api/response/Distance;

    return-object v0
.end method

.method public final getDuration()Lco/bird/api/response/Duration;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/Leg;->duration:Lco/bird/api/response/Duration;

    return-object v0
.end method

.method public final getSteps()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lco/bird/api/response/Step;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/response/Leg;->steps:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/api/response/Leg;->steps:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/response/Leg;->distance:Lco/bird/api/response/Distance;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lco/bird/api/response/Distance;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/response/Leg;->duration:Lco/bird/api/response/Duration;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lco/bird/api/response/Duration;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lco/bird/api/response/Leg;->steps:Ljava/util/List;

    iget-object v1, p0, Lco/bird/api/response/Leg;->distance:Lco/bird/api/response/Distance;

    iget-object v2, p0, Lco/bird/api/response/Leg;->duration:Lco/bird/api/response/Duration;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Leg(steps="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", distance="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", duration="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

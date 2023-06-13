.class public final Lco/bird/android/model/DemandAreaAnalyticsInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B!\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J)\u0010\r\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0017\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\t\u00a8\u0006\u0014"
    }
    d2 = {
        "Lco/bird/android/model/DemandAreaAnalyticsInfo;",
        "",
        "demandLevel",
        "Lco/bird/android/buava/Optional;",
        "",
        "distanceToNearestDemandArea",
        "",
        "(Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;)V",
        "getDemandLevel",
        "()Lco/bird/android/buava/Optional;",
        "getDistanceToNearestDemandArea",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
        "model_release"
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
.field private final demandLevel:Lco/bird/android/buava/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final distanceToNearestDemandArea:Lco/bird/android/buava/Optional;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/Integer;",
            ">;",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    const-string v0, "demandLevel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "distanceToNearestDemandArea"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/model/DemandAreaAnalyticsInfo;->demandLevel:Lco/bird/android/buava/Optional;

    iput-object p2, p0, Lco/bird/android/model/DemandAreaAnalyticsInfo;->distanceToNearestDemandArea:Lco/bird/android/buava/Optional;

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/DemandAreaAnalyticsInfo;Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;ILjava/lang/Object;)Lco/bird/android/model/DemandAreaAnalyticsInfo;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lco/bird/android/model/DemandAreaAnalyticsInfo;->demandLevel:Lco/bird/android/buava/Optional;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lco/bird/android/model/DemandAreaAnalyticsInfo;->distanceToNearestDemandArea:Lco/bird/android/buava/Optional;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lco/bird/android/model/DemandAreaAnalyticsInfo;->copy(Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;)Lco/bird/android/model/DemandAreaAnalyticsInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/android/buava/Optional;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/DemandAreaAnalyticsInfo;->demandLevel:Lco/bird/android/buava/Optional;

    return-object v0
.end method

.method public final component2()Lco/bird/android/buava/Optional;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/DemandAreaAnalyticsInfo;->distanceToNearestDemandArea:Lco/bird/android/buava/Optional;

    return-object v0
.end method

.method public final copy(Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;)Lco/bird/android/model/DemandAreaAnalyticsInfo;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/Integer;",
            ">;",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/Float;",
            ">;)",
            "Lco/bird/android/model/DemandAreaAnalyticsInfo;"
        }
    .end annotation

    const-string v0, "demandLevel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "distanceToNearestDemandArea"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/android/model/DemandAreaAnalyticsInfo;

    invoke-direct {v0, p1, p2}, Lco/bird/android/model/DemandAreaAnalyticsInfo;-><init>(Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/DemandAreaAnalyticsInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/DemandAreaAnalyticsInfo;

    iget-object v1, p0, Lco/bird/android/model/DemandAreaAnalyticsInfo;->demandLevel:Lco/bird/android/buava/Optional;

    iget-object v3, p1, Lco/bird/android/model/DemandAreaAnalyticsInfo;->demandLevel:Lco/bird/android/buava/Optional;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/android/model/DemandAreaAnalyticsInfo;->distanceToNearestDemandArea:Lco/bird/android/buava/Optional;

    iget-object p1, p1, Lco/bird/android/model/DemandAreaAnalyticsInfo;->distanceToNearestDemandArea:Lco/bird/android/buava/Optional;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getDemandLevel()Lco/bird/android/buava/Optional;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/DemandAreaAnalyticsInfo;->demandLevel:Lco/bird/android/buava/Optional;

    return-object v0
.end method

.method public final getDistanceToNearestDemandArea()Lco/bird/android/buava/Optional;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lco/bird/android/buava/Optional<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/model/DemandAreaAnalyticsInfo;->distanceToNearestDemandArea:Lco/bird/android/buava/Optional;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/android/model/DemandAreaAnalyticsInfo;->demandLevel:Lco/bird/android/buava/Optional;

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/DemandAreaAnalyticsInfo;->distanceToNearestDemandArea:Lco/bird/android/buava/Optional;

    invoke-virtual {v1}, Lco/bird/android/buava/Optional;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lco/bird/android/model/DemandAreaAnalyticsInfo;->demandLevel:Lco/bird/android/buava/Optional;

    iget-object v1, p0, Lco/bird/android/model/DemandAreaAnalyticsInfo;->distanceToNearestDemandArea:Lco/bird/android/buava/Optional;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "DemandAreaAnalyticsInfo(demandLevel="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", distanceToNearestDemandArea="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

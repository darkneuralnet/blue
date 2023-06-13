.class public final Lco/bird/api/response/EligibilityResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B)\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J2\u0010\u0011\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00032\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\u0008\u0008\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000c\u00a8\u0006\u0019"
    }
    d2 = {
        "Lco/bird/api/response/EligibilityResponse;",
        "",
        "eligible",
        "",
        "releaseOnTimePercent",
        "Lco/bird/api/response/Counts;",
        "releaseNumber",
        "(Ljava/lang/Boolean;Lco/bird/api/response/Counts;Lco/bird/api/response/Counts;)V",
        "getEligible",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getReleaseNumber",
        "()Lco/bird/api/response/Counts;",
        "getReleaseOnTimePercent",
        "component1",
        "component2",
        "component3",
        "copy",
        "(Ljava/lang/Boolean;Lco/bird/api/response/Counts;Lco/bird/api/response/Counts;)Lco/bird/api/response/EligibilityResponse;",
        "equals",
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
.field private final eligible:Ljava/lang/Boolean;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "eligible"
    .end annotation

    .annotation runtime Lft5;
        value = "eligible"
    .end annotation
.end field

.field private final releaseNumber:Lco/bird/api/response/Counts;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "release_number"
    .end annotation

    .annotation runtime Lft5;
        value = "release_number"
    .end annotation
.end field

.field private final releaseOnTimePercent:Lco/bird/api/response/Counts;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "release_on_time_percent"
    .end annotation

    .annotation runtime Lft5;
        value = "release_on_time_percent"
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

    invoke-direct/range {v0 .. v5}, Lco/bird/api/response/EligibilityResponse;-><init>(Ljava/lang/Boolean;Lco/bird/api/response/Counts;Lco/bird/api/response/Counts;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Boolean;Lco/bird/api/response/Counts;Lco/bird/api/response/Counts;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/response/EligibilityResponse;->eligible:Ljava/lang/Boolean;

    iput-object p2, p0, Lco/bird/api/response/EligibilityResponse;->releaseOnTimePercent:Lco/bird/api/response/Counts;

    iput-object p3, p0, Lco/bird/api/response/EligibilityResponse;->releaseNumber:Lco/bird/api/response/Counts;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Boolean;Lco/bird/api/response/Counts;Lco/bird/api/response/Counts;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
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
    invoke-direct {p0, p1, p2, p3}, Lco/bird/api/response/EligibilityResponse;-><init>(Ljava/lang/Boolean;Lco/bird/api/response/Counts;Lco/bird/api/response/Counts;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/response/EligibilityResponse;Ljava/lang/Boolean;Lco/bird/api/response/Counts;Lco/bird/api/response/Counts;ILjava/lang/Object;)Lco/bird/api/response/EligibilityResponse;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lco/bird/api/response/EligibilityResponse;->eligible:Ljava/lang/Boolean;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lco/bird/api/response/EligibilityResponse;->releaseOnTimePercent:Lco/bird/api/response/Counts;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lco/bird/api/response/EligibilityResponse;->releaseNumber:Lco/bird/api/response/Counts;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/api/response/EligibilityResponse;->copy(Ljava/lang/Boolean;Lco/bird/api/response/Counts;Lco/bird/api/response/Counts;)Lco/bird/api/response/EligibilityResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/EligibilityResponse;->eligible:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component2()Lco/bird/api/response/Counts;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/EligibilityResponse;->releaseOnTimePercent:Lco/bird/api/response/Counts;

    return-object v0
.end method

.method public final component3()Lco/bird/api/response/Counts;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/EligibilityResponse;->releaseNumber:Lco/bird/api/response/Counts;

    return-object v0
.end method

.method public final copy(Ljava/lang/Boolean;Lco/bird/api/response/Counts;Lco/bird/api/response/Counts;)Lco/bird/api/response/EligibilityResponse;
    .locals 1

    new-instance v0, Lco/bird/api/response/EligibilityResponse;

    invoke-direct {v0, p1, p2, p3}, Lco/bird/api/response/EligibilityResponse;-><init>(Ljava/lang/Boolean;Lco/bird/api/response/Counts;Lco/bird/api/response/Counts;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/response/EligibilityResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/response/EligibilityResponse;

    iget-object v1, p0, Lco/bird/api/response/EligibilityResponse;->eligible:Ljava/lang/Boolean;

    iget-object v3, p1, Lco/bird/api/response/EligibilityResponse;->eligible:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/response/EligibilityResponse;->releaseOnTimePercent:Lco/bird/api/response/Counts;

    iget-object v3, p1, Lco/bird/api/response/EligibilityResponse;->releaseOnTimePercent:Lco/bird/api/response/Counts;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/api/response/EligibilityResponse;->releaseNumber:Lco/bird/api/response/Counts;

    iget-object p1, p1, Lco/bird/api/response/EligibilityResponse;->releaseNumber:Lco/bird/api/response/Counts;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getEligible()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/EligibilityResponse;->eligible:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getReleaseNumber()Lco/bird/api/response/Counts;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/EligibilityResponse;->releaseNumber:Lco/bird/api/response/Counts;

    return-object v0
.end method

.method public final getReleaseOnTimePercent()Lco/bird/api/response/Counts;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/EligibilityResponse;->releaseOnTimePercent:Lco/bird/api/response/Counts;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/api/response/EligibilityResponse;->eligible:Ljava/lang/Boolean;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/EligibilityResponse;->releaseOnTimePercent:Lco/bird/api/response/Counts;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lco/bird/api/response/Counts;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/api/response/EligibilityResponse;->releaseNumber:Lco/bird/api/response/Counts;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lco/bird/api/response/Counts;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lco/bird/api/response/EligibilityResponse;->eligible:Ljava/lang/Boolean;

    iget-object v1, p0, Lco/bird/api/response/EligibilityResponse;->releaseOnTimePercent:Lco/bird/api/response/Counts;

    iget-object v2, p0, Lco/bird/api/response/EligibilityResponse;->releaseNumber:Lco/bird/api/response/Counts;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "EligibilityResponse(eligible="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", releaseOnTimePercent="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", releaseNumber="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

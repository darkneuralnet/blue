.class public final Lco/bird/api/response/WireLocalizationOtaPullResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\'\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J+\u0010\u0010\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\t\u00a8\u0006\u0018"
    }
    d2 = {
        "Lco/bird/api/response/WireLocalizationOtaPullResponse;",
        "",
        "response",
        "Lco/bird/api/response/WireLocalizationOtaPullTranslations;",
        "responseTime",
        "Lorg/joda/time/DateTime;",
        "latestLastModifiedTime",
        "(Lco/bird/api/response/WireLocalizationOtaPullTranslations;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V",
        "getLatestLastModifiedTime",
        "()Lorg/joda/time/DateTime;",
        "getResponse",
        "()Lco/bird/api/response/WireLocalizationOtaPullTranslations;",
        "getResponseTime",
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
.field private final latestLastModifiedTime:Lorg/joda/time/DateTime;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "latest_last_modified_time"
    .end annotation

    .annotation runtime Lft5;
        value = "latest_last_modified_time"
    .end annotation
.end field

.field private final response:Lco/bird/api/response/WireLocalizationOtaPullTranslations;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "response"
    .end annotation

    .annotation runtime Lft5;
        value = "response"
    .end annotation
.end field

.field private final responseTime:Lorg/joda/time/DateTime;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "response_time"
    .end annotation

    .annotation runtime Lft5;
        value = "response_time"
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

    invoke-direct/range {v0 .. v5}, Lco/bird/api/response/WireLocalizationOtaPullResponse;-><init>(Lco/bird/api/response/WireLocalizationOtaPullTranslations;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lco/bird/api/response/WireLocalizationOtaPullTranslations;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V
    .locals 1

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/response/WireLocalizationOtaPullResponse;->response:Lco/bird/api/response/WireLocalizationOtaPullTranslations;

    iput-object p2, p0, Lco/bird/api/response/WireLocalizationOtaPullResponse;->responseTime:Lorg/joda/time/DateTime;

    iput-object p3, p0, Lco/bird/api/response/WireLocalizationOtaPullResponse;->latestLastModifiedTime:Lorg/joda/time/DateTime;

    return-void
.end method

.method public synthetic constructor <init>(Lco/bird/api/response/WireLocalizationOtaPullTranslations;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    new-instance p1, Lco/bird/api/response/WireLocalizationOtaPullTranslations;

    const/4 p5, 0x1

    invoke-direct {p1, v0, p5, v0}, Lco/bird/api/response/WireLocalizationOtaPullTranslations;-><init>(Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lco/bird/api/response/WireLocalizationOtaPullResponse;-><init>(Lco/bird/api/response/WireLocalizationOtaPullTranslations;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/response/WireLocalizationOtaPullResponse;Lco/bird/api/response/WireLocalizationOtaPullTranslations;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;ILjava/lang/Object;)Lco/bird/api/response/WireLocalizationOtaPullResponse;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lco/bird/api/response/WireLocalizationOtaPullResponse;->response:Lco/bird/api/response/WireLocalizationOtaPullTranslations;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lco/bird/api/response/WireLocalizationOtaPullResponse;->responseTime:Lorg/joda/time/DateTime;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lco/bird/api/response/WireLocalizationOtaPullResponse;->latestLastModifiedTime:Lorg/joda/time/DateTime;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lco/bird/api/response/WireLocalizationOtaPullResponse;->copy(Lco/bird/api/response/WireLocalizationOtaPullTranslations;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lco/bird/api/response/WireLocalizationOtaPullResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lco/bird/api/response/WireLocalizationOtaPullTranslations;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireLocalizationOtaPullResponse;->response:Lco/bird/api/response/WireLocalizationOtaPullTranslations;

    return-object v0
.end method

.method public final component2()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireLocalizationOtaPullResponse;->responseTime:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final component3()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireLocalizationOtaPullResponse;->latestLastModifiedTime:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final copy(Lco/bird/api/response/WireLocalizationOtaPullTranslations;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)Lco/bird/api/response/WireLocalizationOtaPullResponse;
    .locals 1

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/api/response/WireLocalizationOtaPullResponse;

    invoke-direct {v0, p1, p2, p3}, Lco/bird/api/response/WireLocalizationOtaPullResponse;-><init>(Lco/bird/api/response/WireLocalizationOtaPullTranslations;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/response/WireLocalizationOtaPullResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/response/WireLocalizationOtaPullResponse;

    iget-object v1, p0, Lco/bird/api/response/WireLocalizationOtaPullResponse;->response:Lco/bird/api/response/WireLocalizationOtaPullTranslations;

    iget-object v3, p1, Lco/bird/api/response/WireLocalizationOtaPullResponse;->response:Lco/bird/api/response/WireLocalizationOtaPullTranslations;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/response/WireLocalizationOtaPullResponse;->responseTime:Lorg/joda/time/DateTime;

    iget-object v3, p1, Lco/bird/api/response/WireLocalizationOtaPullResponse;->responseTime:Lorg/joda/time/DateTime;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/api/response/WireLocalizationOtaPullResponse;->latestLastModifiedTime:Lorg/joda/time/DateTime;

    iget-object p1, p1, Lco/bird/api/response/WireLocalizationOtaPullResponse;->latestLastModifiedTime:Lorg/joda/time/DateTime;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getLatestLastModifiedTime()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireLocalizationOtaPullResponse;->latestLastModifiedTime:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public final getResponse()Lco/bird/api/response/WireLocalizationOtaPullTranslations;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireLocalizationOtaPullResponse;->response:Lco/bird/api/response/WireLocalizationOtaPullTranslations;

    return-object v0
.end method

.method public final getResponseTime()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/WireLocalizationOtaPullResponse;->responseTime:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lco/bird/api/response/WireLocalizationOtaPullResponse;->response:Lco/bird/api/response/WireLocalizationOtaPullTranslations;

    invoke-virtual {v0}, Lco/bird/api/response/WireLocalizationOtaPullTranslations;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/response/WireLocalizationOtaPullResponse;->responseTime:Lorg/joda/time/DateTime;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/response/WireLocalizationOtaPullResponse;->latestLastModifiedTime:Lorg/joda/time/DateTime;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lorg/joda/time/base/AbstractInstant;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lco/bird/api/response/WireLocalizationOtaPullResponse;->response:Lco/bird/api/response/WireLocalizationOtaPullTranslations;

    iget-object v1, p0, Lco/bird/api/response/WireLocalizationOtaPullResponse;->responseTime:Lorg/joda/time/DateTime;

    iget-object v2, p0, Lco/bird/api/response/WireLocalizationOtaPullResponse;->latestLastModifiedTime:Lorg/joda/time/DateTime;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "WireLocalizationOtaPullResponse(response="

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", responseTime="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", latestLastModifiedTime="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

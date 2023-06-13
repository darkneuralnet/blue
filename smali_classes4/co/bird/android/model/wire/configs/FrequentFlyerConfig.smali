.class public final Lco/bird/android/model/wire/configs/FrequentFlyerConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0011\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B1\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J5\u0010\u0015\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0007H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0018\u0010\u0008\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\r\u00a8\u0006\u001b"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/FrequentFlyerConfig;",
        "",
        "enabled",
        "",
        "mapPillDisplayTime",
        "",
        "faqZendeskArticleId",
        "",
        "termsZendeskArticleId",
        "(ZDLjava/lang/String;Ljava/lang/String;)V",
        "getEnabled",
        "()Z",
        "getFaqZendeskArticleId",
        "()Ljava/lang/String;",
        "getMapPillDisplayTime",
        "()D",
        "getTermsZendeskArticleId",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final enabled:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "enabled"
    .end annotation

    .annotation runtime Lft5;
        value = "enabled"
    .end annotation
.end field

.field private final faqZendeskArticleId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "faq_zendesk_article_id"
    .end annotation

    .annotation runtime Lft5;
        value = "faq_zendesk_article_id"
    .end annotation
.end field

.field private final mapPillDisplayTime:D
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "map_pill_display_time"
    .end annotation

    .annotation runtime Lft5;
        value = "map_pill_display_time"
    .end annotation
.end field

.field private final termsZendeskArticleId:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "terms_zendesk_article_id"
    .end annotation

    .annotation runtime Lft5;
        value = "terms_zendesk_article_id"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 8

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0xf

    const/4 v7, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v7}, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;-><init>(ZDLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZDLjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->enabled:Z

    iput-wide p2, p0, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->mapPillDisplayTime:D

    iput-object p4, p0, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->faqZendeskArticleId:Ljava/lang/String;

    iput-object p5, p0, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->termsZendeskArticleId:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(ZDLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    const-wide/high16 p2, 0x4024000000000000L    # 10.0

    :cond_1
    move-wide v0, p2

    and-int/lit8 p2, p6, 0x4

    const/4 p3, 0x0

    if-eqz p2, :cond_2

    move-object p7, p3

    goto :goto_0

    :cond_2
    move-object p7, p4

    :goto_0
    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    move-object v2, p3

    goto :goto_1

    :cond_3
    move-object v2, p5

    :goto_1
    move-object p2, p0

    move p3, p1

    move-wide p4, v0

    move-object p6, p7

    move-object p7, v2

    invoke-direct/range {p2 .. p7}, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;-><init>(ZDLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/configs/FrequentFlyerConfig;ZDLjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lco/bird/android/model/wire/configs/FrequentFlyerConfig;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-boolean p1, p0, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->enabled:Z

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-wide p2, p0, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->mapPillDisplayTime:D

    :cond_1
    move-wide v0, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p4, p0, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->faqZendeskArticleId:Ljava/lang/String;

    :cond_2
    move-object p7, p4

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p5, p0, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->termsZendeskArticleId:Ljava/lang/String;

    :cond_3
    move-object v2, p5

    move-object p2, p0

    move p3, p1

    move-wide p4, v0

    move-object p6, p7

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->copy(ZDLjava/lang/String;Ljava/lang/String;)Lco/bird/android/model/wire/configs/FrequentFlyerConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->enabled:Z

    return v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->mapPillDisplayTime:D

    return-wide v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->faqZendeskArticleId:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->termsZendeskArticleId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ZDLjava/lang/String;Ljava/lang/String;)Lco/bird/android/model/wire/configs/FrequentFlyerConfig;
    .locals 7

    new-instance v6, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;

    move-object v0, v6

    move v1, p1

    move-wide v2, p2

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;-><init>(ZDLjava/lang/String;Ljava/lang/String;)V

    return-object v6
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->enabled:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->enabled:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->mapPillDisplayTime:D

    iget-wide v5, p1, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->mapPillDisplayTime:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->faqZendeskArticleId:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->faqZendeskArticleId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->termsZendeskArticleId:Ljava/lang/String;

    iget-object p1, p1, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->termsZendeskArticleId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->enabled:Z

    return v0
.end method

.method public final getFaqZendeskArticleId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->faqZendeskArticleId:Ljava/lang/String;

    return-object v0
.end method

.method public final getMapPillDisplayTime()D
    .locals 2

    iget-wide v0, p0, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->mapPillDisplayTime:D

    return-wide v0
.end method

.method public final getTermsZendeskArticleId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->termsZendeskArticleId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->enabled:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->mapPillDisplayTime:D

    invoke-static {v1, v2}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->faqZendeskArticleId:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->termsZendeskArticleId:Ljava/lang/String;

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->enabled:Z

    iget-wide v1, p0, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->mapPillDisplayTime:D

    iget-object v3, p0, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->faqZendeskArticleId:Ljava/lang/String;

    iget-object v4, p0, Lco/bird/android/model/wire/configs/FrequentFlyerConfig;->termsZendeskArticleId:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "FrequentFlyerConfig(enabled="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", mapPillDisplayTime="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", faqZendeskArticleId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", termsZendeskArticleId="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

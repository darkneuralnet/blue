.class public final Lco/bird/android/model/wire/configs/WebHelpCenterConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0016\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001BG\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003JK\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0006H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000cR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000cR\u0018\u0010\u0008\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000e\u00a8\u0006\u001f"
    }
    d2 = {
        "Lco/bird/android/model/wire/configs/WebHelpCenterConfig;",
        "",
        "enabled",
        "",
        "launchInExternalBrowser",
        "riderHelpCenterUrl",
        "",
        "flyerHelpCenterUrl",
        "operatorHelpCenterUrl",
        "genericHelpUrls",
        "(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V",
        "getEnabled",
        "()Z",
        "getFlyerHelpCenterUrl",
        "()Ljava/lang/String;",
        "getGenericHelpUrls",
        "getLaunchInExternalBrowser",
        "getOperatorHelpCenterUrl",
        "getRiderHelpCenterUrl",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
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

.field private final flyerHelpCenterUrl:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "flyer_help_center_url"
    .end annotation

    .annotation runtime Lft5;
        value = "flyer_help_center_url"
    .end annotation
.end field

.field private final genericHelpUrls:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "generic_help_urls"
    .end annotation

    .annotation runtime Lft5;
        value = "generic_help_urls"
    .end annotation
.end field

.field private final launchInExternalBrowser:Z
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "launch_in_external_browser"
    .end annotation

    .annotation runtime Lft5;
        value = "launch_in_external_browser"
    .end annotation
.end field

.field private final operatorHelpCenterUrl:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "operator_help_center_url"
    .end annotation

    .annotation runtime Lft5;
        value = "operator_help_center_url"
    .end annotation
.end field

.field private final riderHelpCenterUrl:Ljava/lang/String;
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
        value = "rider_help_center_url"
    .end annotation

    .annotation runtime Lft5;
        value = "rider_help_center_url"
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 9

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x3f

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;-><init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->enabled:Z

    iput-boolean p2, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->launchInExternalBrowser:Z

    iput-object p3, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->riderHelpCenterUrl:Ljava/lang/String;

    iput-object p4, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->flyerHelpCenterUrl:Ljava/lang/String;

    iput-object p5, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->operatorHelpCenterUrl:Ljava/lang/String;

    iput-boolean p6, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->genericHelpUrls:Z

    return-void
.end method

.method public synthetic constructor <init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 5

    and-int/lit8 p8, p7, 0x1

    const/4 v0, 0x0

    if-eqz p8, :cond_0

    move p8, v0

    goto :goto_0

    :cond_0
    move p8, p1

    :goto_0
    and-int/lit8 p1, p7, 0x2

    if-eqz p1, :cond_1

    move v1, v0

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 p1, p7, 0x4

    const/4 p2, 0x0

    if-eqz p1, :cond_2

    move-object v2, p2

    goto :goto_2

    :cond_2
    move-object v2, p3

    :goto_2
    and-int/lit8 p1, p7, 0x8

    if-eqz p1, :cond_3

    move-object v3, p2

    goto :goto_3

    :cond_3
    move-object v3, p4

    :goto_3
    and-int/lit8 p1, p7, 0x10

    if-eqz p1, :cond_4

    move-object v4, p2

    goto :goto_4

    :cond_4
    move-object v4, p5

    :goto_4
    and-int/lit8 p1, p7, 0x20

    if-eqz p1, :cond_5

    move p7, v0

    goto :goto_5

    :cond_5
    move p7, p6

    :goto_5
    move-object p1, p0

    move p2, p8

    move p3, v1

    move-object p4, v2

    move-object p5, v3

    move-object p6, v4

    invoke-direct/range {p1 .. p7}, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;-><init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/android/model/wire/configs/WebHelpCenterConfig;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Lco/bird/android/model/wire/configs/WebHelpCenterConfig;
    .locals 4

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-boolean p1, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->enabled:Z

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-boolean p2, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->launchInExternalBrowser:Z

    :cond_1
    move p8, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->riderHelpCenterUrl:Ljava/lang/String;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p7, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->flyerHelpCenterUrl:Ljava/lang/String;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p7, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->operatorHelpCenterUrl:Ljava/lang/String;

    :cond_4
    move-object v2, p5

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_5

    iget-boolean p6, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->genericHelpUrls:Z

    :cond_5
    move v3, p6

    move-object p2, p0

    move p3, p1

    move p4, p8

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    move p8, v3

    invoke-virtual/range {p2 .. p8}, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->copy(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lco/bird/android/model/wire/configs/WebHelpCenterConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->enabled:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->launchInExternalBrowser:Z

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->riderHelpCenterUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->flyerHelpCenterUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->operatorHelpCenterUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->genericHelpUrls:Z

    return v0
.end method

.method public final copy(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lco/bird/android/model/wire/configs/WebHelpCenterConfig;
    .locals 8

    new-instance v7, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;

    move-object v0, v7

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;-><init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v7
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->enabled:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->enabled:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->launchInExternalBrowser:Z

    iget-boolean v3, p1, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->launchInExternalBrowser:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->riderHelpCenterUrl:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->riderHelpCenterUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->flyerHelpCenterUrl:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->flyerHelpCenterUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->operatorHelpCenterUrl:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->operatorHelpCenterUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->genericHelpUrls:Z

    iget-boolean p1, p1, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->genericHelpUrls:Z

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->enabled:Z

    return v0
.end method

.method public final getFlyerHelpCenterUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->flyerHelpCenterUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getGenericHelpUrls()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->genericHelpUrls:Z

    return v0
.end method

.method public final getLaunchInExternalBrowser()Z
    .locals 1

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->launchInExternalBrowser:Z

    return v0
.end method

.method public final getOperatorHelpCenterUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->operatorHelpCenterUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getRiderHelpCenterUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->riderHelpCenterUrl:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->enabled:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move v0, v1

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->launchInExternalBrowser:Z

    if-eqz v2, :cond_1

    move v2, v1

    :cond_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->riderHelpCenterUrl:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->flyerHelpCenterUrl:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_1

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->operatorHelpCenterUrl:Ljava/lang/String;

    if-nez v2, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v2, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->genericHelpUrls:Z

    if-eqz v2, :cond_5

    goto :goto_3

    :cond_5
    move v1, v2

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-boolean v0, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->enabled:Z

    iget-boolean v1, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->launchInExternalBrowser:Z

    iget-object v2, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->riderHelpCenterUrl:Ljava/lang/String;

    iget-object v3, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->flyerHelpCenterUrl:Ljava/lang/String;

    iget-object v4, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->operatorHelpCenterUrl:Ljava/lang/String;

    iget-boolean v5, p0, Lco/bird/android/model/wire/configs/WebHelpCenterConfig;->genericHelpUrls:Z

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "WebHelpCenterConfig(enabled="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", launchInExternalBrowser="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", riderHelpCenterUrl="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", flyerHelpCenterUrl="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", operatorHelpCenterUrl="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", genericHelpUrls="

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

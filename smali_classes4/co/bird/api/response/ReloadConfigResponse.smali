.class public final Lco/bird/api/response/ReloadConfigResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\tH\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J=\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001J\t\u0010 \u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0011\u00a8\u0006!"
    }
    d2 = {
        "Lco/bird/api/response/ReloadConfigResponse;",
        "",
        "currency",
        "",
        "preload",
        "Lco/bird/api/response/PreloadConfig;",
        "autoReload",
        "Lco/bird/api/response/AutoReloadConfig;",
        "autoReloadFromPreload",
        "Lco/bird/api/response/AutoReloadFromPreloadConfig;",
        "reloadTermsArticle",
        "(Ljava/lang/String;Lco/bird/api/response/PreloadConfig;Lco/bird/api/response/AutoReloadConfig;Lco/bird/api/response/AutoReloadFromPreloadConfig;Ljava/lang/String;)V",
        "getAutoReload",
        "()Lco/bird/api/response/AutoReloadConfig;",
        "getAutoReloadFromPreload",
        "()Lco/bird/api/response/AutoReloadFromPreloadConfig;",
        "getCurrency",
        "()Ljava/lang/String;",
        "getPreload",
        "()Lco/bird/api/response/PreloadConfig;",
        "getReloadTermsArticle",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
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
.field private final autoReload:Lco/bird/api/response/AutoReloadConfig;

.field private final autoReloadFromPreload:Lco/bird/api/response/AutoReloadFromPreloadConfig;

.field private final currency:Ljava/lang/String;

.field private final preload:Lco/bird/api/response/PreloadConfig;

.field private final reloadTermsArticle:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lco/bird/api/response/PreloadConfig;Lco/bird/api/response/AutoReloadConfig;Lco/bird/api/response/AutoReloadFromPreloadConfig;Ljava/lang/String;)V
    .locals 1

    const-string v0, "currency"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autoReload"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autoReloadFromPreload"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/api/response/ReloadConfigResponse;->currency:Ljava/lang/String;

    iput-object p2, p0, Lco/bird/api/response/ReloadConfigResponse;->preload:Lco/bird/api/response/PreloadConfig;

    iput-object p3, p0, Lco/bird/api/response/ReloadConfigResponse;->autoReload:Lco/bird/api/response/AutoReloadConfig;

    iput-object p4, p0, Lco/bird/api/response/ReloadConfigResponse;->autoReloadFromPreload:Lco/bird/api/response/AutoReloadFromPreloadConfig;

    iput-object p5, p0, Lco/bird/api/response/ReloadConfigResponse;->reloadTermsArticle:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lco/bird/api/response/ReloadConfigResponse;Ljava/lang/String;Lco/bird/api/response/PreloadConfig;Lco/bird/api/response/AutoReloadConfig;Lco/bird/api/response/AutoReloadFromPreloadConfig;Ljava/lang/String;ILjava/lang/Object;)Lco/bird/api/response/ReloadConfigResponse;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lco/bird/api/response/ReloadConfigResponse;->currency:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lco/bird/api/response/ReloadConfigResponse;->preload:Lco/bird/api/response/PreloadConfig;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, Lco/bird/api/response/ReloadConfigResponse;->autoReload:Lco/bird/api/response/AutoReloadConfig;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, Lco/bird/api/response/ReloadConfigResponse;->autoReloadFromPreload:Lco/bird/api/response/AutoReloadFromPreloadConfig;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, Lco/bird/api/response/ReloadConfigResponse;->reloadTermsArticle:Ljava/lang/String;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, Lco/bird/api/response/ReloadConfigResponse;->copy(Ljava/lang/String;Lco/bird/api/response/PreloadConfig;Lco/bird/api/response/AutoReloadConfig;Lco/bird/api/response/AutoReloadFromPreloadConfig;Ljava/lang/String;)Lco/bird/api/response/ReloadConfigResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/ReloadConfigResponse;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lco/bird/api/response/PreloadConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/ReloadConfigResponse;->preload:Lco/bird/api/response/PreloadConfig;

    return-object v0
.end method

.method public final component3()Lco/bird/api/response/AutoReloadConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/ReloadConfigResponse;->autoReload:Lco/bird/api/response/AutoReloadConfig;

    return-object v0
.end method

.method public final component4()Lco/bird/api/response/AutoReloadFromPreloadConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/ReloadConfigResponse;->autoReloadFromPreload:Lco/bird/api/response/AutoReloadFromPreloadConfig;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/ReloadConfigResponse;->reloadTermsArticle:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lco/bird/api/response/PreloadConfig;Lco/bird/api/response/AutoReloadConfig;Lco/bird/api/response/AutoReloadFromPreloadConfig;Ljava/lang/String;)Lco/bird/api/response/ReloadConfigResponse;
    .locals 7

    const-string v0, "currency"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "preload"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autoReload"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autoReloadFromPreload"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lco/bird/api/response/ReloadConfigResponse;

    move-object v1, v0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lco/bird/api/response/ReloadConfigResponse;-><init>(Ljava/lang/String;Lco/bird/api/response/PreloadConfig;Lco/bird/api/response/AutoReloadConfig;Lco/bird/api/response/AutoReloadFromPreloadConfig;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lco/bird/api/response/ReloadConfigResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lco/bird/api/response/ReloadConfigResponse;

    iget-object v1, p0, Lco/bird/api/response/ReloadConfigResponse;->currency:Ljava/lang/String;

    iget-object v3, p1, Lco/bird/api/response/ReloadConfigResponse;->currency:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lco/bird/api/response/ReloadConfigResponse;->preload:Lco/bird/api/response/PreloadConfig;

    iget-object v3, p1, Lco/bird/api/response/ReloadConfigResponse;->preload:Lco/bird/api/response/PreloadConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lco/bird/api/response/ReloadConfigResponse;->autoReload:Lco/bird/api/response/AutoReloadConfig;

    iget-object v3, p1, Lco/bird/api/response/ReloadConfigResponse;->autoReload:Lco/bird/api/response/AutoReloadConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lco/bird/api/response/ReloadConfigResponse;->autoReloadFromPreload:Lco/bird/api/response/AutoReloadFromPreloadConfig;

    iget-object v3, p1, Lco/bird/api/response/ReloadConfigResponse;->autoReloadFromPreload:Lco/bird/api/response/AutoReloadFromPreloadConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lco/bird/api/response/ReloadConfigResponse;->reloadTermsArticle:Ljava/lang/String;

    iget-object p1, p1, Lco/bird/api/response/ReloadConfigResponse;->reloadTermsArticle:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAutoReload()Lco/bird/api/response/AutoReloadConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/ReloadConfigResponse;->autoReload:Lco/bird/api/response/AutoReloadConfig;

    return-object v0
.end method

.method public final getAutoReloadFromPreload()Lco/bird/api/response/AutoReloadFromPreloadConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/ReloadConfigResponse;->autoReloadFromPreload:Lco/bird/api/response/AutoReloadFromPreloadConfig;

    return-object v0
.end method

.method public final getCurrency()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/ReloadConfigResponse;->currency:Ljava/lang/String;

    return-object v0
.end method

.method public final getPreload()Lco/bird/api/response/PreloadConfig;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/ReloadConfigResponse;->preload:Lco/bird/api/response/PreloadConfig;

    return-object v0
.end method

.method public final getReloadTermsArticle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lco/bird/api/response/ReloadConfigResponse;->reloadTermsArticle:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lco/bird/api/response/ReloadConfigResponse;->currency:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/response/ReloadConfigResponse;->preload:Lco/bird/api/response/PreloadConfig;

    invoke-virtual {v1}, Lco/bird/api/response/PreloadConfig;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/response/ReloadConfigResponse;->autoReload:Lco/bird/api/response/AutoReloadConfig;

    invoke-virtual {v1}, Lco/bird/api/response/AutoReloadConfig;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/response/ReloadConfigResponse;->autoReloadFromPreload:Lco/bird/api/response/AutoReloadFromPreloadConfig;

    invoke-virtual {v1}, Lco/bird/api/response/AutoReloadFromPreloadConfig;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lco/bird/api/response/ReloadConfigResponse;->reloadTermsArticle:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lco/bird/api/response/ReloadConfigResponse;->currency:Ljava/lang/String;

    iget-object v1, p0, Lco/bird/api/response/ReloadConfigResponse;->preload:Lco/bird/api/response/PreloadConfig;

    iget-object v2, p0, Lco/bird/api/response/ReloadConfigResponse;->autoReload:Lco/bird/api/response/AutoReloadConfig;

    iget-object v3, p0, Lco/bird/api/response/ReloadConfigResponse;->autoReloadFromPreload:Lco/bird/api/response/AutoReloadFromPreloadConfig;

    iget-object v4, p0, Lco/bird/api/response/ReloadConfigResponse;->reloadTermsArticle:Ljava/lang/String;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "ReloadConfigResponse(currency="

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", preload="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", autoReload="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", autoReloadFromPreload="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", reloadTermsArticle="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.class public final LoN3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0000\u00a8\u0006\u0004"
    }
    d2 = {
        "Lco/bird/api/response/ReloadConfigResponse;",
        "",
        "a",
        "b",
        "core-interface_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public static final a(Lco/bird/api/response/ReloadConfigResponse;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/api/response/ReloadConfigResponse;->getAutoReload()Lco/bird/api/response/AutoReloadConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/api/response/AutoReloadConfig;->getCurrentOption()Lco/bird/api/response/ReloadOption;

    move-result-object v0

    const/4 v1, 0x1

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lco/bird/api/response/ReloadConfigResponse;->getAutoReload()Lco/bird/api/response/AutoReloadConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/api/response/AutoReloadConfig;->getOptions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    xor-int/2addr v0, v1

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lco/bird/api/response/ReloadConfigResponse;->getAutoReload()Lco/bird/api/response/AutoReloadConfig;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/api/response/AutoReloadConfig;->getEnabled()Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public static final b(Lco/bird/api/response/ReloadConfigResponse;)Z
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lco/bird/api/response/ReloadConfigResponse;->getAutoReload()Lco/bird/api/response/AutoReloadConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/api/response/AutoReloadConfig;->getEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lco/bird/api/response/ReloadConfigResponse;->getAutoReload()Lco/bird/api/response/AutoReloadConfig;

    move-result-object p0

    invoke-virtual {p0}, Lco/bird/api/response/AutoReloadConfig;->getCurrentOption()Lco/bird/api/response/ReloadOption;

    move-result-object p0

    const-wide/16 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lco/bird/api/response/ReloadOption;->getAmount()J

    move-result-wide v2

    goto :goto_0

    :cond_0
    move-wide v2, v0

    :goto_0
    cmp-long p0, v2, v0

    if-lez p0, :cond_1

    const/4 p0, 0x1

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    :goto_1
    return p0
.end method

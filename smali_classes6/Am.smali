.class public final LAm;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0010\"(\u0010\u0007\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0003\u0010\u0004\"\u0004\u0008\u0005\u0010\u0006\"(\u0010\n\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u0008\u0010\u0004\"\u0004\u0008\t\u0010\u0006\"(\u0010\r\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000b\u0010\u0004\"\u0004\u0008\u000c\u0010\u0006\"(\u0010\u0010\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00018F@FX\u0086\u000e\u00a2\u0006\u000c\u001a\u0004\u0008\u000e\u0010\u0004\"\u0004\u0008\u000f\u0010\u0006\u00a8\u0006\u0011"
    }
    d2 = {
        "Lcom/google/ar/core/Config;",
        "",
        "value",
        "d",
        "(Lcom/google/ar/core/Config;)Z",
        "setPlaneFindingEnabled",
        "(Lcom/google/ar/core/Config;Z)V",
        "planeFindingEnabled",
        "c",
        "g",
        "instantPlacementEnabled",
        "a",
        "e",
        "cloudAnchorEnabled",
        "b",
        "f",
        "geospatialEnabled",
        "arsceneview_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# direct methods
.method public static final a(Lcom/google/ar/core/Config;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/ar/core/Config;->getCloudAnchorMode()Lcom/google/ar/core/Config$CloudAnchorMode;

    move-result-object p0

    sget-object v0, Lcom/google/ar/core/Config$CloudAnchorMode;->DISABLED:Lcom/google/ar/core/Config$CloudAnchorMode;

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final b(Lcom/google/ar/core/Config;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/ar/core/Config;->getGeospatialMode()Lcom/google/ar/core/Config$GeospatialMode;

    move-result-object p0

    sget-object v0, Lcom/google/ar/core/Config$GeospatialMode;->DISABLED:Lcom/google/ar/core/Config$GeospatialMode;

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final c(Lcom/google/ar/core/Config;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/ar/core/Config;->getInstantPlacementMode()Lcom/google/ar/core/Config$InstantPlacementMode;

    move-result-object p0

    sget-object v0, Lcom/google/ar/core/Config$InstantPlacementMode;->DISABLED:Lcom/google/ar/core/Config$InstantPlacementMode;

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final d(Lcom/google/ar/core/Config;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/google/ar/core/Config;->getPlaneFindingMode()Lcom/google/ar/core/Config$PlaneFindingMode;

    move-result-object p0

    sget-object v0, Lcom/google/ar/core/Config$PlaneFindingMode;->DISABLED:Lcom/google/ar/core/Config$PlaneFindingMode;

    if-eq p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final e(Lcom/google/ar/core/Config;Z)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    sget-object p1, Lcom/google/ar/core/Config$CloudAnchorMode;->ENABLED:Lcom/google/ar/core/Config$CloudAnchorMode;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/google/ar/core/Config$CloudAnchorMode;->DISABLED:Lcom/google/ar/core/Config$CloudAnchorMode;

    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/ar/core/Config;->setCloudAnchorMode(Lcom/google/ar/core/Config$CloudAnchorMode;)Lcom/google/ar/core/Config;

    return-void
.end method

.method public static final f(Lcom/google/ar/core/Config;Z)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    sget-object p1, Lcom/google/ar/core/Config$GeospatialMode;->ENABLED:Lcom/google/ar/core/Config$GeospatialMode;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/google/ar/core/Config$GeospatialMode;->DISABLED:Lcom/google/ar/core/Config$GeospatialMode;

    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/ar/core/Config;->setGeospatialMode(Lcom/google/ar/core/Config$GeospatialMode;)Lcom/google/ar/core/Config;

    return-void
.end method

.method public static final g(Lcom/google/ar/core/Config;Z)V
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    sget-object p1, Lcom/google/ar/core/Config$InstantPlacementMode;->LOCAL_Y_UP:Lcom/google/ar/core/Config$InstantPlacementMode;

    goto :goto_0

    :cond_0
    sget-object p1, Lcom/google/ar/core/Config$InstantPlacementMode;->DISABLED:Lcom/google/ar/core/Config$InstantPlacementMode;

    :goto_0
    invoke-virtual {p0, p1}, Lcom/google/ar/core/Config;->setInstantPlacementMode(Lcom/google/ar/core/Config$InstantPlacementMode;)Lcom/google/ar/core/Config;

    return-void
.end method

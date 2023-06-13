.class public final Lfv6$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfv6;->M()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/wire/WireLocation;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/wire/WireLocation;",
        "kotlin.jvm.PlatformType",
        "optionalNestLocation",
        "",
        "a",
        "(Lco/bird/android/buava/Optional;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lfv6;


# direct methods
.method public constructor <init>(Lfv6;)V
    .locals 0

    iput-object p1, p0, Lfv6$i;->g:Lfv6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/buava/Optional;)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/wire/WireLocation;",
            ">;)V"
        }
    .end annotation

    move-object/from16 v0, p0

    iget-object v1, v0, Lfv6$i;->g:Lfv6;

    invoke-static {v1}, Lfv6;->access$getCurrentNestAnchorRelay$p(Lfv6;)La94;

    move-result-object v1

    sget-object v2, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual/range {p1 .. p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/WireLocation;

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    iget-object v5, v0, Lfv6$i;->g:Lfv6;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "attempting to set nest anchor from loc="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    new-array v7, v7, [Ljava/lang/Object;

    invoke-static {v6, v7}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v5}, Lfv6;->access$isGeospatialModeAvailableAtCurrentLocation$p(Lfv6;)Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-static {v5}, Lfv6;->access$getUi$p(Lfv6;)Lrv6;

    move-result-object v5

    invoke-virtual {v5}, Lrv6;->Tl()Lco/bird/android/feature/ar/view/VpsView;

    move-result-object v5

    invoke-virtual {v5}, Lco/bird/android/feature/ar/view/VpsView;->T0()LZ84;

    move-result-object v5

    invoke-virtual {v5}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/buava/Optional;

    invoke-virtual {v5}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/google/ar/core/Earth;

    if-eqz v6, :cond_1

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireLocation;->getLatitude()D

    move-result-wide v7

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireLocation;->getLongitude()D

    move-result-wide v9

    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    const/high16 v13, 0x3f800000    # 1.0f

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-virtual/range {v6 .. v16}, Lcom/google/ar/core/Earth;->resolveAnchorOnTerrain(DDDFFFF)Lcom/google/ar/core/Anchor;

    move-result-object v3

    goto :goto_0

    :cond_0
    invoke-static {v5}, Lfv6;->access$getUi$p(Lfv6;)Lrv6;

    move-result-object v5

    invoke-virtual {v5}, Lrv6;->Tl()Lco/bird/android/feature/ar/view/VpsView;

    move-result-object v5

    invoke-virtual {v5}, Lco/bird/android/feature/ar/view/VpsView;->T0()LZ84;

    move-result-object v5

    invoke-virtual {v5}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lco/bird/android/buava/Optional;

    invoke-virtual {v5}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/google/ar/core/Earth;

    if-eqz v6, :cond_1

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireLocation;->getLatitude()D

    move-result-wide v7

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireLocation;->getLongitude()D

    move-result-wide v9

    invoke-virtual {v6}, Lcom/google/ar/core/Earth;->getCameraGeospatialPose()Lcom/google/ar/core/GeospatialPose;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/ar/core/GeospatialPose;->getAltitude()D

    move-result-wide v3

    const-wide/high16 v11, 0x3fe0000000000000L    # 0.5

    add-double/2addr v11, v3

    const/high16 v13, 0x3f800000    # 1.0f

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-virtual/range {v6 .. v16}, Lcom/google/ar/core/Earth;->createAnchor(DDDFFFF)Lcom/google/ar/core/Anchor;

    move-result-object v3

    :goto_0
    move-object v4, v3

    :cond_1
    invoke-virtual {v2, v4}, Lco/bird/android/buava/Optional$a;->b(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v2

    invoke-virtual {v1, v2}, La94;->accept(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {p0, p1}, Lfv6$i;->a(Lco/bird/android/buava/Optional;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

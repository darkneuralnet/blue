.class public final Lco/bird/android/manager/helmet/HelmetSelfieManagerImpl$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/helmet/HelmetSelfieManagerImpl;->d(Lco/bird/android/model/wire/WireBird;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/DetectHelmetSelfieResponse;",
        "LEL1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/DetectHelmetSelfieResponse;",
        "response",
        "LEL1;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/api/response/DetectHelmetSelfieResponse;)LEL1;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:F

.field public final synthetic h:Lco/bird/android/model/wire/WireBird;

.field public final synthetic i:Lco/bird/android/manager/helmet/HelmetSelfieManagerImpl;


# direct methods
.method public constructor <init>(FLco/bird/android/model/wire/WireBird;Lco/bird/android/manager/helmet/HelmetSelfieManagerImpl;)V
    .locals 0

    iput p1, p0, Lco/bird/android/manager/helmet/HelmetSelfieManagerImpl$b;->g:F

    iput-object p2, p0, Lco/bird/android/manager/helmet/HelmetSelfieManagerImpl$b;->h:Lco/bird/android/model/wire/WireBird;

    iput-object p3, p0, Lco/bird/android/manager/helmet/HelmetSelfieManagerImpl$b;->i:Lco/bird/android/manager/helmet/HelmetSelfieManagerImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/DetectHelmetSelfieResponse;)LEL1;
    .locals 12

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/api/response/DetectHelmetSelfieResponse;->getFinalConfidence()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lco/bird/api/response/DetectHelmetSelfieResponse;->getHeadCoverOnHeadConfidence()Ljava/lang/Double;

    move-result-object v0

    const-wide/high16 v1, -0x4010000000000000L    # -1.0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    goto :goto_0

    :cond_1
    move-wide v3, v1

    :goto_0
    invoke-virtual {p1}, Lco/bird/api/response/DetectHelmetSelfieResponse;->getHeadCoverConfidence()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    :cond_2
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(DD)D

    move-result-wide v0

    :goto_1
    iget v2, p0, Lco/bird/android/manager/helmet/HelmetSelfieManagerImpl$b;->g:F

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "received helmet selfie detection response "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " with minConfidence set to "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    invoke-static {v2, v4}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    new-instance v2, LEL1;

    invoke-virtual {p1}, Lco/bird/api/response/DetectHelmetSelfieResponse;->getHeadCoverOnHeadConfidence()Ljava/lang/Double;

    move-result-object v6

    invoke-virtual {p1}, Lco/bird/api/response/DetectHelmetSelfieResponse;->getHeadConfidence()Ljava/lang/Double;

    move-result-object v7

    invoke-virtual {p1}, Lco/bird/api/response/DetectHelmetSelfieResponse;->getHeadCoverConfidence()Ljava/lang/Double;

    move-result-object v8

    invoke-virtual {p1}, Lco/bird/api/response/DetectHelmetSelfieResponse;->getFaceConfidence()Ljava/lang/Double;

    move-result-object v9

    iget v4, p0, Lco/bird/android/manager/helmet/HelmetSelfieManagerImpl$b;->g:F

    float-to-double v4, v4

    cmpl-double v0, v0, v4

    if-ltz v0, :cond_3

    const/4 v0, 0x1

    move v10, v0

    goto :goto_2

    :cond_3
    move v10, v3

    :goto_2
    invoke-virtual {p1}, Lco/bird/api/response/DetectHelmetSelfieResponse;->getCouponAmount()Ljava/lang/Integer;

    move-result-object v11

    move-object v5, v2

    invoke-direct/range {v5 .. v11}, LEL1;-><init>(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;ZLjava/lang/Integer;)V

    iget-object p1, p0, Lco/bird/android/manager/helmet/HelmetSelfieManagerImpl$b;->h:Lco/bird/android/model/wire/WireBird;

    iget-object v0, p0, Lco/bird/android/manager/helmet/HelmetSelfieManagerImpl$b;->i:Lco/bird/android/manager/helmet/HelmetSelfieManagerImpl;

    invoke-virtual {v2}, LEL1;->g()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "setting helmet selfie detected for birdId: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-static {v1, v3}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v0}, Lco/bird/android/manager/helmet/HelmetSelfieManagerImpl;->access$getCurrentBirdToImageCache$p(Lco/bird/android/manager/helmet/HelmetSelfieManagerImpl;)Landroid/util/LruCache;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object p1

    const-string v1, "detected"

    invoke-virtual {v0, p1, v1}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    return-object v2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/DetectHelmetSelfieResponse;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/helmet/HelmetSelfieManagerImpl$b;->a(Lco/bird/api/response/DetectHelmetSelfieResponse;)LEL1;

    move-result-object p1

    return-object p1
.end method

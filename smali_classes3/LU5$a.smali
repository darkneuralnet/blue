.class public final LLU5$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLU5;->M(Lio/reactivex/Observable;)Lio/reactivex/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Triple<",
        "+",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "+",
        "Landroid/location/Location;",
        "+",
        "Lco/bird/api/response/OperatorMapNestResponse;",
        ">;",
        "LBj6;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Triple;",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "Landroid/location/Location;",
        "Lco/bird/api/response/OperatorMapNestResponse;",
        "<name for destructuring parameter 0>",
        "LBj6;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lkotlin/Triple;)LBj6;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSuggestNestPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuggestNestPresenter.kt\nco/bird/android/feature/suggestanest/SuggestNestPresenter$computeValidNestLocation$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,252:1\n1747#2,3:253\n1747#2,3:256\n*S KotlinDebug\n*F\n+ 1 SuggestNestPresenter.kt\nco/bird/android/feature/suggestanest/SuggestNestPresenter$computeValidNestLocation$1\n*L\n232#1:253,3\n233#1:256,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LLU5;


# direct methods
.method public constructor <init>(LLU5;)V
    .locals 0

    iput-object p1, p0, LLU5$a;->g:LLU5;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Triple;)LBj6;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "Lcom/google/android/gms/maps/model/LatLng;",
            "+",
            "Landroid/location/Location;",
            "Lco/bird/api/response/OperatorMapNestResponse;",
            ">;)",
            "LBj6;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/location/Location;

    invoke-virtual {p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/api/response/OperatorMapNestResponse;

    invoke-static {v0}, Lcm2;->e(Lcom/google/android/gms/maps/model/LatLng;)Landroid/location/Location;

    move-result-object v10

    iget-object v2, p0, LLU5$a;->g:LLU5;

    invoke-static {v2}, LLU5;->access$getReactiveConfig$p(LLU5;)LTq4;

    move-result-object v2

    invoke-virtual {v2}, LTq4;->f8()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/configs/Config;

    iget-object v2, p0, LLU5$a;->g:LLU5;

    invoke-static {v2}, LLU5;->access$getReactiveConfig$p(LLU5;)LTq4;

    move-result-object v2

    invoke-virtual {v2}, LTq4;->f8()LZ84;

    move-result-object v2

    invoke-virtual {v2}, LZ84;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/Config;->getOperatorConfig()Lco/bird/android/model/wire/configs/OperatorConfig;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/OperatorConfig;->getFeatures()Lco/bird/android/model/wire/configs/OperatorFeatureConfig;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/OperatorFeatureConfig;->getNestSuggestion()Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/configs/OperatorNestSuggestionConfig;->getMaxNestDistanceFromUserMeters()D

    move-result-wide v2

    invoke-static {v1}, Lcm2;->d(Landroid/location/Location;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v1

    invoke-static {v1, v0}, LRN5;->c(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)D

    move-result-wide v4

    cmpl-double v1, v4, v2

    if-lez v1, :cond_0

    sget-object p1, LBj6;->c:LBj6;

    goto/16 :goto_4

    :cond_0
    invoke-virtual {p1}, Lco/bird/api/response/OperatorMapNestResponse;->getAreas()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    instance-of v2, v1, Ljava/util/Collection;

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eqz v2, :cond_2

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    move v1, v12

    goto :goto_0

    :cond_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/wire/WireArea;

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireArea;->getRegion()Lco/bird/android/model/Polygon;

    move-result-object v2

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x4

    const/4 v9, 0x0

    move-object v3, v10

    invoke-static/range {v2 .. v9}, LJX3;->contains$default(Lco/bird/android/model/Polygon;Landroid/location/Location;DDILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    move v1, v11

    :goto_0
    if-nez v1, :cond_9

    invoke-virtual {p1}, Lco/bird/api/response/OperatorMapNestResponse;->getNests()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of v1, p1, Ljava/util/Collection;

    if-eqz v1, :cond_5

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    :cond_4
    move v11, v12

    goto :goto_2

    :cond_5
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WireNestArea;

    new-instance v2, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireNestArea;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v3

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireLocation;->getLatitude()D

    move-result-wide v3

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireNestArea;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v5

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireLocation;->getLongitude()D

    move-result-wide v5

    invoke-direct {v2, v3, v4, v5, v6}, Lcom/google/android/gms/maps/model/LatLng;-><init>(DD)V

    invoke-static {v0, v2}, LRN5;->c(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)D

    move-result-wide v2

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireNestArea;->getRadius()D

    move-result-wide v4

    cmpg-double v1, v2, v4

    if-gez v1, :cond_7

    move v1, v11

    goto :goto_1

    :cond_7
    move v1, v12

    :goto_1
    if-eqz v1, :cond_6

    :goto_2
    if-eqz v11, :cond_8

    goto :goto_3

    :cond_8
    sget-object p1, LBj6;->b:LBj6;

    goto :goto_4

    :cond_9
    :goto_3
    sget-object p1, LBj6;->d:LBj6;

    :goto_4
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, LLU5$a;->a(Lkotlin/Triple;)LBj6;

    move-result-object p1

    return-object p1
.end method

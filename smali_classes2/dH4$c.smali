.class public final LdH4$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LdH4;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/google/android/gms/maps/model/PolygonOptions;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lcom/google/android/gms/maps/model/PolygonOptions;",
        "kotlin.jvm.PlatformType",
        "polygon",
        "",
        "a",
        "(Lcom/google/android/gms/maps/model/PolygonOptions;)V"
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
        "SMAP\nReportMultipleBirdsFraudPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportMultipleBirdsFraudPresenter.kt\nco/bird/android/app/feature/charger/presenter/ReportMultipleBirdsFraudPresenterImpl$onCreate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,185:1\n1549#2:186\n1620#2,3:187\n*S KotlinDebug\n*F\n+ 1 ReportMultipleBirdsFraudPresenter.kt\nco/bird/android/app/feature/charger/presenter/ReportMultipleBirdsFraudPresenterImpl$onCreate$1\n*L\n80#1:186\n80#1:187,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LdH4;


# direct methods
.method public constructor <init>(LdH4;)V
    .locals 0

    iput-object p1, p0, LdH4$c;->g:LdH4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/maps/model/PolygonOptions;)V
    .locals 7

    iget-object v0, p0, LdH4$c;->g:LdH4;

    invoke-static {v0}, LdH4;->access$getSelectedBirds$p(LdH4;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->clear()V

    iget-object v0, p0, LdH4$c;->g:LdH4;

    invoke-static {v0}, LdH4;->access$getBirds$p(LdH4;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    iget-object v1, p0, LdH4$c;->g:LdH4;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v3}, Lco/bird/android/model/wire/WireBird;->getLocation()Lco/bird/android/model/wire/WireLocation;

    move-result-object v4

    invoke-static {v4}, Lco/bird/android/app/feature/map/GoogleMap_Kt;->toLatLng(Lco/bird/android/model/wire/WireLocation;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v4

    invoke-virtual {p1}, Lcom/google/android/gms/maps/model/PolygonOptions;->K()Ljava/util/List;

    move-result-object v5

    const/4 v6, 0x1

    invoke-static {v4, v5, v6}, LBX3;->b(Lcom/google/android/gms/maps/model/LatLng;Ljava/util/List;Z)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-static {v1}, LdH4;->access$getSelectedBirds$p(LdH4;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_0
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/android/gms/maps/model/PolygonOptions;

    invoke-virtual {p0, p1}, LdH4$c;->a(Lcom/google/android/gms/maps/model/PolygonOptions;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

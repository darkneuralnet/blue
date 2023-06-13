.class public final LOm3$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/app/feature/map/modelmanager/Filter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LOm3;-><init>(Li66;LTq4;LOh;Lco/bird/android/app/feature/map/cluster/birdmarker/BirdMarkerClusterManagerFactory;Lco/bird/android/app/feature/map/cluster/bountymarker/BountyMarkerClusterManagerFactory;Lco/bird/android/app/feature/map/cluster/nestmarker/NestMarkerClusterManagerFactory;Lco/bird/android/app/feature/map/cluster/warehousemarker/WarehouseMarkerClusterManagerFactory;Lco/bird/android/app/feature/map/cluster/zonemarker/ZoneMarkerClusterManagerFactory;Lco/bird/android/core/mvp/BaseActivity;Lcom/google/android/gms/maps/model/CameraPosition;LcD1;Lco/bird/android/app/feature/map/ui/ReactiveMapEvent;Lcom/google/android/gms/maps/MapView;Landroid/view/View;ZLBK2;ZLdr4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lco/bird/android/app/feature/map/modelmanager/Filter<",
        "Lco/bird/android/model/ParkingNest;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0008*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001J\u001c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00032\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0003H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\nR?\u0010\u0016\u001a\u001f\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\u000c\u0008\r\u0012\u0008\u0008\u000e\u0012\u0004\u0008\u0008(\u000b\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000c8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Om3$f",
        "Lco/bird/android/app/feature/map/modelmanager/Filter;",
        "Lco/bird/android/model/ParkingNest;",
        "",
        "models",
        "apply",
        "",
        "a",
        "Ljava/lang/String;",
        "getId",
        "()Ljava/lang/String;",
        "id",
        "Lkotlin/Function1;",
        "Lkotlin/ParameterName;",
        "name",
        "",
        "b",
        "Lkotlin/jvm/functions/Function1;",
        "getSetDirty",
        "()Lkotlin/jvm/functions/Function1;",
        "setSetDirty",
        "(Lkotlin/jvm/functions/Function1;)V",
        "setDirty",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public b:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "hide-all"

    iput-object v0, p0, LOm3$f;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public apply(Ljava/util/List;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lco/bird/android/model/ParkingNest;",
            ">;)",
            "Ljava/util/List<",
            "Lco/bird/android/model/ParkingNest;",
            ">;"
        }
    .end annotation

    const-string v0, "models"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LOm3$f;->a:Ljava/lang/String;

    return-object v0
.end method

.method public getSetDirty()Lkotlin/jvm/functions/Function1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LOm3$f;->b:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public setSetDirty(Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, LOm3$f;->b:Lkotlin/jvm/functions/Function1;

    return-void
.end method

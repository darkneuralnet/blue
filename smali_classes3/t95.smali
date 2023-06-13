.class public final synthetic Lt95;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;

.field public final synthetic c:Lcom/google/android/gms/maps/model/LatLngBounds;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;Lcom/google/android/gms/maps/model/LatLngBounds;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt95;->b:Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;

    iput-object p2, p0, Lt95;->c:Lcom/google/android/gms/maps/model/LatLngBounds;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lt95;->b:Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;

    iget-object v1, p0, Lt95;->c:Lcom/google/android/gms/maps/model/LatLngBounds;

    invoke-static {v0, v1}, Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;->d(Lco/bird/android/feature/rider/impl/RiderMapDataManagerImpl;Lcom/google/android/gms/maps/model/LatLngBounds;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

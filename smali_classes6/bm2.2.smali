.class public Lbm2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lcom/google/android/gms/maps/model/LatLng;

.field public b:Lcom/google/android/gms/maps/model/LatLng;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/maps/model/LatLng;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbm2;->a:Lcom/google/android/gms/maps/model/LatLng;

    iput-object p2, p0, Lbm2;->b:Lcom/google/android/gms/maps/model/LatLng;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    iget-object v0, p0, Lbm2;->a:Lcom/google/android/gms/maps/model/LatLng;

    return-object v0
.end method

.method public b()Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    iget-object v0, p0, Lbm2;->b:Lcom/google/android/gms/maps/model/LatLng;

    return-object v0
.end method

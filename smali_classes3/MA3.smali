.class public final synthetic LMA3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LUg3;


# instance fields
.field public final synthetic b:LHA3$f;

.field public final synthetic c:Lcom/google/android/gms/maps/model/LatLng;


# direct methods
.method public synthetic constructor <init>(LHA3$f;Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMA3;->b:LHA3$f;

    iput-object p2, p0, LMA3;->c:Lcom/google/android/gms/maps/model/LatLng;

    return-void
.end method


# virtual methods
.method public final onMapReady(LcD1;)V
    .locals 2

    iget-object v0, p0, LMA3;->b:LHA3$f;

    iget-object v1, p0, LMA3;->c:Lcom/google/android/gms/maps/model/LatLng;

    invoke-static {v0, v1, p1}, LHA3$f;->a(LHA3$f;Lcom/google/android/gms/maps/model/LatLng;LcD1;)V

    return-void
.end method

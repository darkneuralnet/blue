.class public LVO4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lcom/google/android/gms/maps/model/LatLng;

.field public b:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/maps/model/LatLng;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, LVO4;->b:Ljava/lang/Integer;

    iput-object p1, p0, LVO4;->a:Lcom/google/android/gms/maps/model/LatLng;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Integer;)LVO4;
    .locals 0

    iput-object p1, p0, LVO4;->b:Ljava/lang/Integer;

    return-object p0
.end method

.method public b()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, LVO4;->b:Ljava/lang/Integer;

    return-object v0
.end method

.method public c()Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    iget-object v0, p0, LVO4;->a:Lcom/google/android/gms/maps/model/LatLng;

    return-object v0
.end method

.class public final Lco/bird/android/feature/ar/resolution/VpsResolveActivity$i;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/ar/resolution/VpsResolveActivity;->h0(LZv6;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Lcom/google/android/gms/maps/model/LatLng;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lcom/google/android/gms/maps/model/LatLng;",
        "b",
        "()Lcom/google/android/gms/maps/model/LatLng;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LZv6;


# direct methods
.method public constructor <init>(LZv6;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$i;->g:LZv6;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()Lcom/google/android/gms/maps/model/LatLng;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$i;->g:LZv6;

    check-cast v0, LEU0;

    invoke-virtual {v0}, LEU0;->b()Landroid/location/Location;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcm2;->d(Landroid/location/Location;)Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/ar/resolution/VpsResolveActivity$i;->b()Lcom/google/android/gms/maps/model/LatLng;

    move-result-object v0

    return-object v0
.end method

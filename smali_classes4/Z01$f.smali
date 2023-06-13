.class public final LZ01$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LZ01;->d(Ljava/lang/String;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/google/android/gms/maps/model/LatLng;",
        "Lio/reactivex/K<",
        "+",
        "Landroid/location/Address;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lcom/google/android/gms/maps/model/LatLng;",
        "latLng",
        "Lio/reactivex/K;",
        "Landroid/location/Address;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lcom/google/android/gms/maps/model/LatLng;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LZ01;


# direct methods
.method public constructor <init>(LZ01;)V
    .locals 0

    iput-object p1, p0, LZ01$f;->g:LZ01;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Landroid/location/Address;
    .locals 0

    invoke-static {p0, p1}, LZ01$f;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Landroid/location/Address;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Landroid/location/Address;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/location/Address;

    return-object p0
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/maps/model/LatLng;)Lio/reactivex/K;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/maps/model/LatLng;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Landroid/location/Address;",
            ">;"
        }
    .end annotation

    const-string v0, "latLng"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LZ01$f;->g:LZ01;

    invoke-static {v0}, LZ01;->access$getLocationManager$p(LZ01;)Ldr4;

    move-result-object v0

    iget-wide v1, p1, Lcom/google/android/gms/maps/model/LatLng;->b:D

    iget-wide v3, p1, Lcom/google/android/gms/maps/model/LatLng;->c:D

    invoke-interface {v0, v1, v2, v3, v4}, Ldr4;->z(DD)Lio/reactivex/Observable;

    move-result-object p1

    sget-object v0, LZ01$f$a;->g:LZ01$f$a;

    new-instance v1, La11;

    invoke-direct {v1, v0}, La11;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->map(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/Observable;->firstOrError()Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/google/android/gms/maps/model/LatLng;

    invoke-virtual {p0, p1}, LZ01$f;->b(Lcom/google/android/gms/maps/model/LatLng;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method

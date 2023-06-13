.class public final LGM$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGM$a;->invoke(Lkotlin/Pair;)Lio/reactivex/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/BleScannedVehicle;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/api/request/BluetoothTrackBody;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/BleScannedVehicle;",
        "vehicle",
        "Lio/reactivex/K;",
        "Lco/bird/api/request/BluetoothTrackBody;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/BleScannedVehicle;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LGM;

.field public final synthetic h:Lco/bird/android/model/wire/WireBird;

.field public final synthetic i:Landroid/location/Location;


# direct methods
.method public constructor <init>(LGM;Lco/bird/android/model/wire/WireBird;Landroid/location/Location;)V
    .locals 0

    iput-object p1, p0, LGM$a$a;->g:LGM;

    iput-object p2, p0, LGM$a$a;->h:Lco/bird/android/model/wire/WireBird;

    iput-object p3, p0, LGM$a$a;->i:Landroid/location/Location;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/BleScannedVehicle;)Lio/reactivex/K;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/BleScannedVehicle;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/api/request/BluetoothTrackBody;",
            ">;"
        }
    .end annotation

    const-string v0, "vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LGM$a$a;->g:LGM;

    iget-object v1, p0, LGM$a$a;->h:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBird;->getSerialNumber()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Lco/bird/android/model/BleScannedVehicle;->getBattery()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p1}, Lco/bird/android/model/BleScannedVehicle;->getDistance()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iget-object v3, p0, LGM$a$a;->i:Landroid/location/Location;

    const-string v4, "location"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2, p1, v3}, LGM;->U0(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/location/Location;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/BleScannedVehicle;

    invoke-virtual {p0, p1}, LGM$a$a;->a(Lco/bird/android/model/BleScannedVehicle;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method

.class public final Lco/bird/android/manager/bluetooth/internal/d$o;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/bluetooth/internal/d;->v0(Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothGatt;ILio/reactivex/H;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Lkotlin/Unit;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic g:Lio/reactivex/H;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/H<",
            "Lco/bird/android/model/Vehicle;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:Lco/bird/android/model/Vehicle;


# direct methods
.method public constructor <init>(Lio/reactivex/H;Lco/bird/android/model/Vehicle;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/H<",
            "Lco/bird/android/model/Vehicle;",
            ">;",
            "Lco/bird/android/model/Vehicle;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lco/bird/android/manager/bluetooth/internal/d$o;->g:Lio/reactivex/H;

    iput-object p2, p0, Lco/bird/android/manager/bluetooth/internal/d$o;->h:Lco/bird/android/model/Vehicle;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/bluetooth/internal/d$o;->invoke(Lkotlin/Unit;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Unit;)V
    .locals 22

    move-object/from16 v0, p0

    iget-object v1, v0, Lco/bird/android/manager/bluetooth/internal/d$o;->g:Lio/reactivex/H;

    iget-object v2, v0, Lco/bird/android/manager/bluetooth/internal/d$o;->h:Lco/bird/android/model/Vehicle;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const v20, 0x1ff7f

    const/16 v21, 0x0

    invoke-static/range {v2 .. v21}, Lco/bird/android/model/Vehicle;->copy$default(Lco/bird/android/model/Vehicle;Landroid/bluetooth/BluetoothDevice;Lco/bird/android/model/wire/WireBird;IIZLco/bird/android/model/constant/EnergyMode;ZZLne5;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/android/model/persistence/VehicleVersion;ILjava/lang/Object;)Lco/bird/android/model/Vehicle;

    move-result-object v2

    invoke-interface {v1, v2}, Lio/reactivex/H;->onSuccess(Ljava/lang/Object;)V

    return-void
.end method

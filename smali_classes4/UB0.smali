.class public final LUB0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LTB0;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J,\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0007H\u0016R\u0014\u0010\u000f\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0012"
    }
    d2 = {
        "LUB0;",
        "LTB0;",
        "",
        "",
        "vehicleIds",
        "Lco/bird/android/model/constant/VehicleInventoryAction;",
        "action",
        "",
        "validateOnly",
        "Lio/reactivex/F;",
        "Lco/bird/api/response/VehicleInventoryScanResponse;",
        "t0",
        "LWB0;",
        "a",
        "LWB0;",
        "coreInventoryRepo",
        "<init>",
        "(LWB0;)V",
        "co.bird.android.manager.core-inventory"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:LWB0;


# direct methods
.method public constructor <init>(LWB0;)V
    .locals 1

    const-string v0, "coreInventoryRepo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUB0;->a:LWB0;

    return-void
.end method


# virtual methods
.method public t0(Ljava/util/List;Lco/bird/android/model/constant/VehicleInventoryAction;Z)Lio/reactivex/F;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lco/bird/android/model/constant/VehicleInventoryAction;",
            "Z)",
            "Lio/reactivex/F<",
            "Lco/bird/api/response/VehicleInventoryScanResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "vehicleIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "action"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LUB0;->a:LWB0;

    invoke-interface {v0, p1, p2, p3}, LWB0;->t0(Ljava/util/List;Lco/bird/android/model/constant/VehicleInventoryAction;Z)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

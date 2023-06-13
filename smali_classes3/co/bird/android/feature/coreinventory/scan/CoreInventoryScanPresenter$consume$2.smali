.class final Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;->J(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanRenderer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "Ljava/util/List<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/wire/WireVehicleInventoryScan;",
        "+",
        "Ljava/lang/Boolean;",
        ">;>;+",
        "Lco/bird/android/model/constant/VehicleInventoryAction;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0087\u0001\u0010\u0002\u001a\u0082\u0001\u00124\u00122\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003 \u0007*\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0008 \u0007*@\u00124\u00122\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003 \u0007*\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0018\u00010\u00040\u0004\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00030\u0003H\n\u00a2\u0006\u0002\u0008\t"
    }
    d2 = {
        "<anonymous>",
        "",
        "<name for destructuring parameter 0>",
        "Lkotlin/Pair;",
        "",
        "Lco/bird/android/model/wire/WireVehicleInventoryScan;",
        "",
        "kotlin.jvm.PlatformType",
        "Lco/bird/android/model/constant/VehicleInventoryAction;",
        "invoke"
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
.field public final synthetic g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$2;->g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$2;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "+",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/wire/WireVehicleInventoryScan;",
            "Ljava/lang/Boolean;",
            ">;>;+",
            "Lco/bird/android/model/constant/VehicleInventoryAction;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/constant/VehicleInventoryAction;

    iget-object v1, p0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$2;->g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter;

    new-instance v2, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$2$1;

    invoke-direct {v2, p1, v0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$2$1;-><init>(Lco/bird/android/model/constant/VehicleInventoryAction;Ljava/util/List;)V

    invoke-virtual {v1, v2}, Lf1;->i(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

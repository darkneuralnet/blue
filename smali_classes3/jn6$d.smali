.class public final Ljn6$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljn6;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/VehiclePricingDetails;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/VehiclePricingDetails;",
        "kotlin.jvm.PlatformType",
        "details",
        "",
        "a",
        "(Lco/bird/android/model/VehiclePricingDetails;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Ljn6;


# direct methods
.method public constructor <init>(Ljn6;)V
    .locals 0

    iput-object p1, p0, Ljn6$d;->g:Ljn6;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/VehiclePricingDetails;)V
    .locals 2

    invoke-virtual {p1}, Lco/bird/android/model/VehiclePricingDetails;->getEmptyState()Lco/bird/android/model/VehiclePricingDetailsEmptyState;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Ljn6$d;->g:Ljn6;

    invoke-static {v1}, Ljn6;->access$getUi$p(Ljn6;)Lmn6;

    move-result-object v1

    invoke-interface {v1, v0}, Lmn6;->Tc(Lco/bird/android/model/VehiclePricingDetailsEmptyState;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, Ljn6$d;->g:Ljn6;

    invoke-static {v0}, Ljn6;->access$getUi$p(Ljn6;)Lmn6;

    move-result-object v0

    invoke-virtual {p1}, Lco/bird/android/model/VehiclePricingDetails;->getVehiclePrices()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0, p1}, Lmn6;->Kf(Ljava/util/List;)V

    :cond_1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/VehiclePricingDetails;

    invoke-virtual {p0, p1}, Ljn6$d;->a(Lco/bird/android/model/VehiclePricingDetails;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

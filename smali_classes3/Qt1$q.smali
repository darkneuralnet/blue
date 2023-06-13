.class public final LQt1$q;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LQt1;->onResume()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/FlightSheetButton;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/FlightSheetButton;",
        "button",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/FlightSheetButton;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LQt1;


# direct methods
.method public constructor <init>(LQt1;)V
    .locals 0

    iput-object p1, p0, LQt1$q;->g:LQt1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/FlightSheetButton;)Lio/reactivex/h;
    .locals 2

    const-string v0, "button"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lco/bird/android/model/MarkMissingButton;

    if-eqz v0, :cond_0

    iget-object v0, p0, LQt1$q;->g:LQt1;

    check-cast p1, Lco/bird/android/model/MarkMissingButton;

    invoke-virtual {p1}, Lco/bird/android/model/MarkMissingButton;->getBird()Lco/bird/android/model/persistence/Bird;

    move-result-object p1

    invoke-static {p1}, LBT;->f(Lco/bird/android/model/persistence/Bird;)Lco/bird/android/model/wire/WireBird;

    move-result-object p1

    iget-object v1, p0, LQt1$q;->g:LQt1;

    invoke-static {v1}, LQt1;->access$getReactiveConfig$p(LQt1;)LTq4;

    move-result-object v1

    invoke-virtual {v1}, LTq4;->f8()LZ84;

    move-result-object v1

    invoke-virtual {v1}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/Config;->getOperatorConfig()Lco/bird/android/model/wire/configs/OperatorConfig;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/OperatorConfig;->getFeatures()Lco/bird/android/model/wire/configs/OperatorFeatureConfig;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/OperatorFeatureConfig;->getSweepBirds()Lco/bird/android/model/wire/configs/OperatorSweepBirdsConfig;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/android/model/wire/configs/OperatorSweepBirdsConfig;->getEnabled()Z

    move-result v1

    invoke-static {v0, p1, v1}, LQt1;->access$markMissing(LQt1;Lco/bird/android/model/wire/WireBird;Z)Lio/reactivex/c;

    move-result-object p1

    goto/16 :goto_0

    :cond_0
    instance-of v0, p1, Lco/bird/android/model/MarkDamaged;

    if-eqz v0, :cond_1

    iget-object v0, p0, LQt1$q;->g:LQt1;

    check-cast p1, Lco/bird/android/model/MarkDamaged;

    invoke-virtual {p1}, Lco/bird/android/model/MarkDamaged;->getBird()Lco/bird/android/model/persistence/Bird;

    move-result-object p1

    invoke-static {v0, p1}, LQt1;->access$toggleDamaged(LQt1;Lco/bird/android/model/persistence/Bird;)Lio/reactivex/c;

    move-result-object p1

    goto/16 :goto_0

    :cond_1
    instance-of v0, p1, Lco/bird/android/model/InspectionButton;

    if-eqz v0, :cond_3

    iget-object v0, p0, LQt1$q;->g:LQt1;

    invoke-static {v0}, LQt1;->access$getReactiveConfig$p(LQt1;)LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getOperatorConfig()Lco/bird/android/model/wire/configs/OperatorConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorConfig;->getFeatures()Lco/bird/android/model/wire/configs/OperatorFeatureConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorFeatureConfig;->getRepair()Lco/bird/android/model/wire/configs/OperatorRepairConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->getEnableRepairV3()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, LQt1$q;->g:LQt1;

    check-cast p1, Lco/bird/android/model/InspectionButton;

    invoke-virtual {p1}, Lco/bird/android/model/InspectionButton;->getBird()Lco/bird/android/model/persistence/Bird;

    move-result-object p1

    invoke-static {v0, p1}, LQt1;->access$navigateToInspection(LQt1;Lco/bird/android/model/persistence/Bird;)Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_2
    iget-object p1, p0, LQt1$q;->g:LQt1;

    invoke-static {p1}, LQt1;->access$getUi$p(LQt1;)LWs1;

    move-result-object p1

    invoke-interface {p1}, LWs1;->Qh()Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_3
    instance-of v0, p1, Lco/bird/android/model/QuickCaptureButton;

    if-eqz v0, :cond_5

    check-cast p1, Lco/bird/android/model/QuickCaptureButton;

    invoke-virtual {p1}, Lco/bird/android/model/QuickCaptureButton;->getState()Lco/bird/android/model/constant/QuickCaptureState;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/QuickCaptureState;->READY:Lco/bird/android/model/constant/QuickCaptureState;

    if-ne v0, v1, :cond_4

    iget-object v0, p0, LQt1$q;->g:LQt1;

    invoke-virtual {p1}, Lco/bird/android/model/QuickCaptureButton;->getBird()Lco/bird/android/model/persistence/Bird;

    move-result-object p1

    invoke-static {v0, p1}, LQt1;->access$initiateQuickCapture(LQt1;Lco/bird/android/model/persistence/Bird;)Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_4
    iget-object v0, p0, LQt1$q;->g:LQt1;

    invoke-virtual {p1}, Lco/bird/android/model/QuickCaptureButton;->getBird()Lco/bird/android/model/persistence/Bird;

    move-result-object p1

    invoke-static {v0, p1}, LQt1;->access$cancelQuickCapture(LQt1;Lco/bird/android/model/persistence/Bird;)Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_5
    instance-of v0, p1, Lco/bird/android/model/MarkForInspectionButton;

    if-eqz v0, :cond_6

    iget-object v0, p0, LQt1$q;->g:LQt1;

    check-cast p1, Lco/bird/android/model/MarkForInspectionButton;

    invoke-virtual {p1}, Lco/bird/android/model/MarkForInspectionButton;->getBird()Lco/bird/android/model/persistence/Bird;

    move-result-object p1

    invoke-static {v0, p1}, LQt1;->access$markForInspection(LQt1;Lco/bird/android/model/persistence/Bird;)Lio/reactivex/c;

    move-result-object p1

    goto :goto_0

    :cond_6
    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/FlightSheetButton;

    invoke-virtual {p0, p1}, LQt1$q;->a(Lco/bird/android/model/FlightSheetButton;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method

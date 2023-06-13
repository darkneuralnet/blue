.class public final LwF4$g;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LwF4;->x(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/RepairFlow;",
        "Lio/reactivex/u<",
        "+",
        "Lkotlin/Unit;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/RepairFlow;",
        "repairFlow",
        "Lio/reactivex/u;",
        "",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/android/model/RepairFlow;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LwF4;


# direct methods
.method public constructor <init>(LwF4;)V
    .locals 0

    iput-object p1, p0, LwF4$g;->g:LwF4;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, LwF4$g;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/u;

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/android/model/RepairFlow;)Lio/reactivex/u;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/RepairFlow;",
            ")",
            "Lio/reactivex/u<",
            "+",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    const-string v0, "repairFlow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LwF4$g;->g:LwF4;

    invoke-static {v0}, LwF4;->access$getReactiveConfig$p(LwF4;)LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getOperatorConfig()Lco/bird/android/model/wire/configs/OperatorConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorConfig;->getFeatures()Lco/bird/android/model/wire/configs/OperatorFeatureConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorFeatureConfig;->getRepair()Lco/bird/android/model/wire/configs/OperatorRepairConfig;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/OperatorRepairConfig;->getRequireVehicleScanConfirmationForRepair()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LwF4$g;->g:LwF4;

    invoke-static {v0}, LwF4;->access$getPermissionManager$p(LwF4;)LDQ3;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/Permission;->CAMERA:Lco/bird/android/model/constant/Permission;

    invoke-virtual {v0, v1}, LDQ3;->l(Lco/bird/android/model/constant/Permission;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LwF4$g$a;

    iget-object v2, p0, LwF4$g;->g:LwF4;

    invoke-direct {v1, v2, p1}, LwF4$g$a;-><init>(LwF4;Lco/bird/android/model/RepairFlow;)V

    new-instance p1, LxF4;

    invoke-direct {p1, v1}, LxF4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->C(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lio/reactivex/p;->G(Ljava/lang/Object;)Lio/reactivex/p;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/RepairFlow;

    invoke-virtual {p0, p1}, LwF4$g;->b(Lco/bird/android/model/RepairFlow;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method

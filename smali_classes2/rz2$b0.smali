.class public final Lrz2$b0;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrz2;-><init>(Lgl;LTq4;Llg6;LCx4;LmA2;LcA2;Lco/bird/android/app/feature/map/ui/LocationSelectionUiImplFactory;LHA2;LUA2;LhB2;LRz2;LBC2;LtC2;LAz2;LiV3;Lxy4;Lfy4;LVf3;LBf3;Ltg3;LqB2;LHg3;Lcom/uber/autodispose/ScopeProvider;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "<anonymous>",
        "",
        "invoke",
        "()Ljava/lang/Boolean;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLongTermRentalSetupCheckoutCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongTermRentalSetupCheckoutCoordinator.kt\nco/bird/android/app/feature/longterm/LongTermRentalSetupCheckoutCoordinator$pickupNode$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,471:1\n1#2:472\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lrz2;


# direct methods
.method public constructor <init>(Lrz2;)V
    .locals 0

    iput-object p1, p0, Lrz2$b0;->g:Lrz2;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Boolean;
    .locals 3

    iget-object v0, p0, Lrz2$b0;->g:Lrz2;

    invoke-static {v0}, Lrz2;->access$getModel$p(Lrz2;)LQA2;

    move-result-object v0

    invoke-virtual {v0}, LQA2;->o()LAG;

    move-result-object v0

    invoke-virtual {v0}, LAG;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/buava/Optional;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Lrz2$b0;->g:Lrz2;

    invoke-static {v0}, Lrz2;->access$getModel$p(Lrz2;)LQA2;

    move-result-object v0

    invoke-virtual {v0}, LQA2;->r()Lco/bird/android/model/RentalPlan;

    move-result-object v0

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lco/bird/android/model/RentalPlan;->getDeliveryWindows()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-le v0, v2, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    if-eqz v0, :cond_2

    move v1, v2

    :cond_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lrz2$b0;->invoke()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

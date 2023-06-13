.class public final Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;->k0(Lg12;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/DialogResponse;",
        "Lio/reactivex/u<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Ljava/lang/String;",
        "+",
        "Ljava/lang/Boolean;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0010\u0007\u001aZ\u0012&\u0008\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003 \u0006*,\u0012&\u0008\u0001\u0012\"\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005 \u0006*\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lco/bird/android/model/DialogResponse;",
        "response",
        "Lio/reactivex/u;",
        "Lkotlin/Pair;",
        "",
        "",
        "kotlin.jvm.PlatformType",
        "d",
        "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lam5;

.field public final synthetic h:Lg12;

.field public final synthetic i:Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;


# direct methods
.method public constructor <init>(Lam5;Lg12;Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$b;->g:Lam5;

    iput-object p2, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$b;->h:Lg12;

    iput-object p3, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$b;->i:Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$b;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$b;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$b;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lkotlin/Pair;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/Pair;

    return-object p0
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/u;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/u;

    return-object p0
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final d(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/DialogResponse;",
            ")",
            "Lio/reactivex/u<",
            "+",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;>;"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$b;->g:Lam5;

    invoke-virtual {v0}, Lam5;->c()Lco/bird/android/model/wire/WireSkuScanItem;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireSkuScanItem;->getScanIdentifier()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    if-nez v0, :cond_0

    move-object v0, v1

    :cond_0
    iget-object v2, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$b;->h:Lg12;

    invoke-virtual {v2}, Lg12;->v()Lco/bird/android/model/wire/WireSkuOrder;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireSkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/wire/WireTransferOrderLineItem;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getTransferOrder()Lco/bird/android/model/wire/WireTransferOrder;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireTransferOrder;->getDemandSource()Lco/bird/android/model/constant/TransferOrderDemandSource;

    move-result-object v2

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    sget-object v3, Lco/bird/android/model/constant/TransferOrderDemandSource;->FM_DROP_OFF:Lco/bird/android/model/constant/TransferOrderDemandSource;

    if-ne v2, v3, :cond_6

    sget-object v3, Lco/bird/android/model/DialogResponse;->OK:Lco/bird/android/model/DialogResponse;

    if-ne p1, v3, :cond_6

    iget-object p1, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$b;->i:Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;

    invoke-virtual {p1}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v2

    new-instance v3, LEt5;

    iget-object p1, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$b;->h:Lg12;

    invoke-virtual {p1}, Lg12;->v()Lco/bird/android/model/wire/WireSkuOrder;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/wire/WireTransferOrderLineItem;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getTransferOrder()Lco/bird/android/model/wire/WireTransferOrder;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireTransferOrder;->getDestinationWarehouse()Lco/bird/android/model/wire/WireWarehouse;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireWarehouse;->getName()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_3

    :cond_2
    move-object p1, v1

    :cond_3
    iget-object v4, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$b;->h:Lg12;

    invoke-virtual {v4}, Lg12;->v()Lco/bird/android/model/wire/WireSkuOrder;

    move-result-object v4

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireSkuOrder;->getTransferOrderLineItem()Lco/bird/android/model/wire/WireTransferOrderLineItem;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireTransferOrderLineItem;->getDestinationFleet()Lco/bird/android/model/wire/WireFleet;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Lco/bird/android/model/wire/WireFleet;->getName()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_4

    goto :goto_1

    :cond_4
    move-object v1, v4

    :cond_5
    :goto_1
    invoke-direct {v3, p1, v1}, LEt5;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, LH31$a;->birdDialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    sget-object v1, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$b$a;->g:Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$b$a;

    new-instance v2, Lq02;

    invoke-direct {v2, v1}, Lq02;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2}, Lio/reactivex/F;->z(Lio/reactivex/functions/q;)Lio/reactivex/p;

    move-result-object p1

    new-instance v1, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$b$b;

    iget-object v2, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$b;->g:Lam5;

    invoke-direct {v1, v0, v2}, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$b$b;-><init>(Ljava/lang/String;Lam5;)V

    new-instance v0, Lr02;

    invoke-direct {v0, v1}, Lr02;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v0}, Lio/reactivex/p;->H(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object p1

    goto :goto_3

    :cond_6
    sget-object v3, Lco/bird/android/model/constant/TransferOrderDemandSource;->FM_PICK_UP:Lco/bird/android/model/constant/TransferOrderDemandSource;

    if-ne v2, v3, :cond_8

    sget-object v2, Lco/bird/android/model/DialogResponse;->CANCEL:Lco/bird/android/model/DialogResponse;

    if-ne p1, v2, :cond_8

    iget-object p1, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$b;->i:Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity;

    invoke-virtual {p1}, Lco/bird/android/vehiclescanner/common/mrp/BaseVehicleScanActivity;->w1()LRk5;

    move-result-object v2

    new-instance v3, Ldt3;

    iget-object p1, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$b;->g:Lam5;

    invoke-virtual {p1}, Lam5;->c()Lco/bird/android/model/wire/WireSkuScanItem;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSkuScanItem;->getItemDisplayName()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_7

    goto :goto_2

    :cond_7
    move-object v1, p1

    :goto_2
    invoke-direct {v3, v1}, Ldt3;-><init>(Ljava/lang/String;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, LH31$a;->birdDialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    sget-object v0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$b$c;->g:Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$b$c;

    new-instance v1, Ls02;

    invoke-direct {v1, v0}, Ls02;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->C(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object p1

    goto :goto_3

    :cond_8
    sget-object v1, Lco/bird/android/model/DialogResponse;->OK:Lco/bird/android/model/DialogResponse;

    if-ne p1, v1, :cond_9

    iget-object p1, p0, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$b;->g:Lam5;

    invoke-virtual {p1}, Lam5;->b()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-static {p1}, Lio/reactivex/p;->G(Ljava/lang/Object;)Lio/reactivex/p;

    move-result-object p1

    goto :goto_3

    :cond_9
    invoke-static {}, Lio/reactivex/p;->u()Lio/reactivex/p;

    move-result-object p1

    :goto_3
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/DialogResponse;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/transferorder/scanner/inbound/InboundScanActivity$b;->d(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method

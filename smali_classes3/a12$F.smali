.class public final La12$F;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La12;->q0(Lio/reactivex/Observable;ZLkotlin/jvm/functions/Function5;)Lio/reactivex/disposables/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Triple<",
        "+",
        "Lkotlin/Pair<",
        "+",
        "Lco/bird/android/model/wire/WireSkuScanItem;",
        "+",
        "Lco/bird/android/model/wire/WireSkuOrder;",
        ">;+",
        "Ljava/util/List<",
        "+",
        "LPC5;",
        ">;+",
        "Lco/bird/api/response/TransferOrderVehicleViewResponse;",
        ">;",
        "Lg12;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\n\u001a\n \u0006*\u0004\u0018\u00010\t0\t2@\u0010\u0008\u001a<\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0005 \u0006*\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00040\u0004\u0012\u000c\u0012\n \u0006*\u0004\u0018\u00010\u00070\u00070\u0000H\n\u00a2\u0006\u0004\u0008\n\u0010\u000b"
    }
    d2 = {
        "Lkotlin/Triple;",
        "Lkotlin/Pair;",
        "Lco/bird/android/model/wire/WireSkuScanItem;",
        "Lco/bird/android/model/wire/WireSkuOrder;",
        "",
        "LPC5;",
        "kotlin.jvm.PlatformType",
        "Lco/bird/api/response/TransferOrderVehicleViewResponse;",
        "<name for destructuring parameter 0>",
        "Lg12;",
        "a",
        "(Lkotlin/Triple;)Lg12;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nInboundScanPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InboundScanPresenter.kt\nco/bird/android/feature/transferorder/scanner/inbound/InboundScanPresenter$processScanItem$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,396:1\n1#2:397\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lkotlin/jvm/functions/Function5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function5<",
            "Lco/bird/android/model/wire/WireSkuScanItem;",
            "Lco/bird/android/model/wire/WireSkuOrder;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "LPC5;",
            ">;",
            "Lco/bird/api/response/TransferOrderVehicleViewResponse;",
            "Lg12;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:La12;

.field public final synthetic i:Z


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function5;La12;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function5<",
            "-",
            "Lco/bird/android/model/wire/WireSkuScanItem;",
            "-",
            "Lco/bird/android/model/wire/WireSkuOrder;",
            "-",
            "Ljava/lang/String;",
            "-",
            "Ljava/util/List<",
            "LPC5;",
            ">;-",
            "Lco/bird/api/response/TransferOrderVehicleViewResponse;",
            "Lg12;",
            ">;",
            "La12;",
            "Z)V"
        }
    .end annotation

    iput-object p1, p0, La12$F;->g:Lkotlin/jvm/functions/Function5;

    iput-object p2, p0, La12$F;->h:La12;

    iput-boolean p3, p0, La12$F;->i:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Triple;)Lg12;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Triple<",
            "Lkotlin/Pair<",
            "Lco/bird/android/model/wire/WireSkuScanItem;",
            "Lco/bird/android/model/wire/WireSkuOrder;",
            ">;+",
            "Ljava/util/List<",
            "LPC5;",
            ">;",
            "Lco/bird/api/response/TransferOrderVehicleViewResponse;",
            ">;)",
            "Lg12;"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "<name for destructuring parameter 0>"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lkotlin/Triple;->component1()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlin/Pair;

    invoke-virtual/range {p1 .. p1}, Lkotlin/Triple;->component2()Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Ljava/util/List;

    invoke-virtual/range {p1 .. p1}, Lkotlin/Triple;->component3()Ljava/lang/Object;

    move-result-object v2

    move-object v9, v2

    check-cast v9, Lco/bird/api/response/TransferOrderVehicleViewResponse;

    invoke-virtual {v1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lco/bird/android/model/wire/WireSkuScanItem;

    invoke-virtual {v1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lco/bird/android/model/wire/WireSkuOrder;

    invoke-virtual {v5}, Lco/bird/android/model/wire/WireSkuScanItem;->getErrorCode()Ljava/lang/String;

    move-result-object v7

    const-string v1, "acceptanceOptions"

    if-eqz v7, :cond_0

    iget-object v4, v0, La12$F;->g:Lkotlin/jvm/functions/Function5;

    const-string v2, "scannedItems"

    invoke-static {v8, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface/range {v4 .. v9}, Lkotlin/jvm/functions/Function5;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg12;

    goto :goto_0

    :cond_0
    iget-object v2, v0, La12$F;->h:La12;

    invoke-virtual {v2}, Lf1;->k()Ljava/lang/Object;

    move-result-object v2

    move-object v10, v2

    check-cast v10, Lg12;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x7ff

    const/16 v23, 0x0

    invoke-static/range {v10 .. v23}, Lg12;->copy$default(Lg12;Lco/bird/android/model/wire/WireSkuOrder;Ljava/util/List;ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lco/bird/android/model/constant/PartKind;Ljava/lang/String;ILjava/lang/Object;)Lg12;

    move-result-object v2

    iget-boolean v3, v0, La12$F;->i:Z

    new-instance v4, Lam5;

    invoke-static {v9, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v4, v5, v3, v9}, Lam5;-><init>(Lco/bird/android/model/wire/WireSkuScanItem;ZLco/bird/api/response/TransferOrderVehicleViewResponse;)V

    invoke-virtual {v2, v4}, Lg12;->B(Lam5;)V

    move-object v1, v2

    :goto_0
    return-object v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Triple;

    invoke-virtual {p0, p1}, La12$F;->a(Lkotlin/Triple;)Lg12;

    move-result-object p1

    return-object p1
.end method

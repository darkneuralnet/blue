.class public final LSM3$k;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSM3;->o0()Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/request/BirdCustomer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/request/BirdCustomer;",
        "kotlin.jvm.PlatformType",
        "response",
        "",
        "a",
        "(Lco/bird/api/request/BirdCustomer;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LSM3;


# direct methods
.method public constructor <init>(LSM3;)V
    .locals 0

    iput-object p1, p0, LSM3$k;->g:LSM3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/request/BirdCustomer;)V
    .locals 20

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lco/bird/api/request/BirdCustomer;->getEmail()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, v0, LSM3$k;->g:LSM3;

    const/4 v2, 0x0

    invoke-static {v1, v2}, LSM3;->access$setDefaultStripePaymentMethodId$p(LSM3;Ljava/lang/String;)V

    iget-object v1, v0, LSM3$k;->g:LSM3;

    invoke-static {v1}, LSM3;->access$getMutableDefaultBirdPayment$p(LSM3;)La94;

    move-result-object v1

    sget-object v2, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual/range {p1 .. p1}, Lco/bird/api/request/BirdCustomer;->getEmail()Ljava/lang/String;

    move-result-object v13

    sget-object v7, Lco/bird/android/model/constant/PaymentGatewayKind;->BRAINTREE:Lco/bird/android/model/constant/PaymentGatewayKind;

    sget-object v15, Lco/bird/android/model/constant/PaymentMethod;->PAYPAL:Lco/bird/android/model/constant/PaymentMethod;

    new-instance v14, Lco/bird/android/model/BirdPayment;

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x5f7

    const/16 v18, 0x0

    move-object v3, v14

    move-object/from16 v19, v14

    move-object/from16 v14, v16

    move/from16 v16, v17

    move-object/from16 v17, v18

    invoke-direct/range {v3 .. v17}, Lco/bird/android/model/BirdPayment;-><init>(Ljava/lang/String;Ljava/lang/String;ZLco/bird/android/model/constant/PaymentGatewayKind;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Card;Lcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/Integer;Lco/bird/android/model/constant/PaymentMethod;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v19

    invoke-virtual {v2, v3}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object v2

    invoke-virtual {v1, v2}, La94;->accept(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    iget-object v1, v0, LSM3$k;->g:LSM3;

    invoke-static {v1}, LSM3;->access$getMutableDefaultBirdPayment$p(LSM3;)La94;

    move-result-object v1

    sget-object v2, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {v2}, Lco/bird/android/buava/Optional$a;->a()Lco/bird/android/buava/Optional;

    move-result-object v2

    invoke-virtual {v1, v2}, La94;->accept(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/request/BirdCustomer;

    invoke-virtual {p0, p1}, LSM3$k;->a(Lco/bird/api/request/BirdCustomer;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

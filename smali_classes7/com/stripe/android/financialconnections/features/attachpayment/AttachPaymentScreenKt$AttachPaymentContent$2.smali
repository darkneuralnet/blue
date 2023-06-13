.class final Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentContent$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt;->AttachPaymentContent(Ldp;Ldp;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LPD3;",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $attachPayment:Ldp;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldp<",
            "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onCloseFromErrorClick:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onEnterDetailsManually:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onSelectAnotherBank:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $payload:Ldp;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldp<",
            "Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState$Payload;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ldp;Ldp;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState$Payload;",
            ">;",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;I)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentContent$2;->$payload:Ldp;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentContent$2;->$attachPayment:Ldp;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentContent$2;->$onSelectAnotherBank:Lkotlin/jvm/functions/Function0;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentContent$2;->$onEnterDetailsManually:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentContent$2;->$onCloseFromErrorClick:Lkotlin/jvm/functions/Function1;

    iput p6, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentContent$2;->$$dirty:I

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LPD3;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentContent$2;->invoke(LPD3;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LPD3;LEt0;I)V
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x51

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    invoke-interface {p2}, LEt0;->b()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LEt0;->k()V

    goto/16 :goto_7

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.stripe.android.financialconnections.features.attachpayment.AttachPaymentContent.<anonymous> (AttachPaymentScreen.kt:59)"

    const v1, 0x34e29a56

    invoke-static {v1, p3, p1, v0}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentContent$2;->$payload:Ldp;

    sget-object p3, LMd6;->e:LMd6;

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    const/4 v0, 0x1

    if-eqz p3, :cond_3

    move p3, v0

    goto :goto_1

    :cond_3
    instance-of p3, p1, LAt2;

    :goto_1
    if-eqz p3, :cond_4

    const p1, -0x7d6a43d0

    invoke-interface {p2, p1}, LEt0;->F(I)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x7

    move-object v3, p2

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt;->LoadingContent(LgV2;Ljava/lang/String;Ljava/lang/String;LEt0;II)V

    invoke-interface {p2}, LEt0;->Q()V

    goto/16 :goto_6

    :cond_4
    instance-of p3, p1, LwT5;

    if-eqz p3, :cond_a

    const p1, -0x7d6a43a5

    invoke-interface {p2, p1}, LEt0;->F(I)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentContent$2;->$attachPayment:Ldp;

    instance-of p3, p1, LAt2;

    if-eqz p3, :cond_5

    move p3, v0

    goto :goto_2

    :cond_5
    instance-of p3, p1, LMd6;

    :goto_2
    if-eqz p3, :cond_6

    move p3, v0

    goto :goto_3

    :cond_6
    instance-of p3, p1, LwT5;

    :goto_3
    if-eqz p3, :cond_8

    const p1, -0x7d6a4332

    invoke-interface {p2, p1}, LEt0;->F(I)V

    const/4 v1, 0x0

    sget p1, Lcom/stripe/android/financialconnections/R$plurals;->stripe_attachlinkedpaymentaccount_title:I

    iget-object p3, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentContent$2;->$payload:Ldp;

    check-cast p3, LwT5;

    invoke-virtual {p3}, LwT5;->a()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState$Payload;

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState$Payload;->getAccountsCount()I

    move-result p3

    const/4 v2, 0x0

    invoke-static {p1, p3, p2, v2}, LfS5;->a(IILEt0;I)Ljava/lang/String;

    move-result-object p1

    iget-object p3, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentContent$2;->$payload:Ldp;

    check-cast p3, LwT5;

    invoke-virtual {p3}, LwT5;->a()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState$Payload;

    invoke-virtual {p3}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState$Payload;->getBusinessName()Ljava/lang/String;

    move-result-object p3

    if-nez p3, :cond_7

    sget p3, Lcom/stripe/android/financialconnections/R$plurals;->stripe_attachlinkedpaymentaccount_desc:I

    iget-object v0, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentContent$2;->$payload:Ldp;

    check-cast v0, LwT5;

    invoke-virtual {v0}, LwT5;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState$Payload;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState$Payload;->getAccountsCount()I

    move-result v0

    invoke-static {p3, v0, p2, v2}, LfS5;->a(IILEt0;I)Ljava/lang/String;

    move-result-object p3

    goto :goto_4

    :cond_7
    sget v3, Lcom/stripe/android/financialconnections/R$plurals;->stripe_attachlinkedpaymentaccount_desc:I

    iget-object v4, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentContent$2;->$payload:Ldp;

    check-cast v4, LwT5;

    invoke-virtual {v4}, LwT5;->a()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState$Payload;

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentState$Payload;->getAccountsCount()I

    move-result v4

    new-array v0, v0, [Ljava/lang/Object;

    aput-object p3, v0, v2

    const/16 p3, 0x200

    invoke-static {v3, v4, v0, p2, p3}, LfS5;->b(II[Ljava/lang/Object;LEt0;I)Ljava/lang/String;

    move-result-object p3

    :goto_4
    move-object v3, p3

    const/4 v5, 0x0

    const/4 v6, 0x1

    move-object v2, p1

    move-object v4, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt;->LoadingContent(LgV2;Ljava/lang/String;Ljava/lang/String;LEt0;II)V

    invoke-interface {p2}, LEt0;->Q()V

    goto :goto_5

    :cond_8
    instance-of p1, p1, LCj1;

    if-eqz p1, :cond_9

    const p1, -0x7d6a3fd4

    invoke-interface {p2, p1}, LEt0;->F(I)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentContent$2;->$attachPayment:Ldp;

    check-cast p1, LCj1;

    invoke-virtual {p1}, LCj1;->b()Ljava/lang/Throwable;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentContent$2;->$onSelectAnotherBank:Lkotlin/jvm/functions/Function0;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentContent$2;->$onEnterDetailsManually:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentContent$2;->$onCloseFromErrorClick:Lkotlin/jvm/functions/Function1;

    iget p1, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentContent$2;->$$dirty:I

    shr-int/lit8 p3, p1, 0x3

    and-int/lit8 p3, p3, 0x70

    or-int/lit8 p3, p3, 0x8

    shr-int/lit8 v4, p1, 0x3

    and-int/lit16 v4, v4, 0x380

    or-int/2addr p3, v4

    shr-int/lit8 p1, p1, 0x6

    and-int/lit16 p1, p1, 0x1c00

    or-int v5, p3, p1

    move-object v4, p2

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt;->access$ErrorContent(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V

    invoke-interface {p2}, LEt0;->Q()V

    goto :goto_5

    :cond_9
    const p1, -0x7d6a3eb0

    invoke-interface {p2, p1}, LEt0;->F(I)V

    invoke-interface {p2}, LEt0;->Q()V

    :goto_5
    invoke-interface {p2}, LEt0;->Q()V

    goto :goto_6

    :cond_a
    instance-of p1, p1, LCj1;

    if-eqz p1, :cond_b

    const p1, -0x7d6a3e97

    invoke-interface {p2, p1}, LEt0;->F(I)V

    iget-object p1, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentContent$2;->$payload:Ldp;

    check-cast p1, LCj1;

    invoke-virtual {p1}, LCj1;->b()Ljava/lang/Throwable;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentContent$2;->$onSelectAnotherBank:Lkotlin/jvm/functions/Function0;

    iget-object v2, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentContent$2;->$onEnterDetailsManually:Lkotlin/jvm/functions/Function0;

    iget-object v3, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentContent$2;->$onCloseFromErrorClick:Lkotlin/jvm/functions/Function1;

    iget p1, p0, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt$AttachPaymentContent$2;->$$dirty:I

    shr-int/lit8 p3, p1, 0x3

    and-int/lit8 p3, p3, 0x70

    or-int/lit8 p3, p3, 0x8

    shr-int/lit8 v4, p1, 0x3

    and-int/lit16 v4, v4, 0x380

    or-int/2addr p3, v4

    shr-int/lit8 p1, p1, 0x6

    and-int/lit16 p1, p1, 0x1c00

    or-int v5, p3, p1

    move-object v4, p2

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/attachpayment/AttachPaymentScreenKt;->access$ErrorContent(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V

    invoke-interface {p2}, LEt0;->Q()V

    goto :goto_6

    :cond_b
    const p1, -0x7d6a3d91

    invoke-interface {p2, p1}, LEt0;->F(I)V

    invoke-interface {p2}, LEt0;->Q()V

    :goto_6
    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_c

    invoke-static {}, LQt0;->Y()V

    :cond_c
    :goto_7
    return-void
.end method

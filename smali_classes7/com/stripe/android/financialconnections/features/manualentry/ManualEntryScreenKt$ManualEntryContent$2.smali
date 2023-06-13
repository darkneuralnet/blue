.class final Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt;->ManualEntryContent(Lkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;ZLdp;Ldp;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V
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

.field final synthetic $account:Lkotlin/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $accountConfirm:Lkotlin/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $isValidForm:Z

.field final synthetic $linkPaymentAccountStatus:Ldp;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldp<",
            "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onAccountConfirmEntered:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onAccountEntered:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onRoutingEntered:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onSubmit:Lkotlin/jvm/functions/Function0;
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
            "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $routing:Lkotlin/Pair;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $scrollState:LXp5;


# direct methods
.method public constructor <init>(Ldp;LXp5;Ldp;Lkotlin/Pair;Lkotlin/jvm/functions/Function1;Lkotlin/Pair;Lkotlin/jvm/functions/Function1;Lkotlin/Pair;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function0;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;",
            ">;",
            "LXp5;",
            "Ldp<",
            "Lcom/stripe/android/financialconnections/model/LinkAccountSessionPaymentAccount;",
            ">;",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;I)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2;->$payload:Ldp;

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2;->$scrollState:LXp5;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2;->$linkPaymentAccountStatus:Ldp;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2;->$routing:Lkotlin/Pair;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2;->$onRoutingEntered:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2;->$account:Lkotlin/Pair;

    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2;->$onAccountEntered:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2;->$accountConfirm:Lkotlin/Pair;

    iput-object p9, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2;->$onAccountConfirmEntered:Lkotlin/jvm/functions/Function1;

    iput-boolean p10, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2;->$isValidForm:Z

    iput-object p11, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2;->$onSubmit:Lkotlin/jvm/functions/Function0;

    iput p12, p0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2;->$$dirty:I

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

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2;->invoke(LPD3;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LPD3;LEt0;I)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v15, p2

    move/from16 v1, p3

    const-string v2, "it"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, v1, 0x51

    const/16 v3, 0x10

    if-ne v2, v3, :cond_1

    invoke-interface/range {p2 .. p2}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p2 .. p2}, LEt0;->k()V

    goto/16 :goto_4

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.financialconnections.features.manualentry.ManualEntryContent.<anonymous> (ManualEntryScreen.kt:101)"

    const v4, -0x2dbf13fd

    invoke-static {v4, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object v1, v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2;->$payload:Ldp;

    instance-of v2, v1, LAt2;

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    move v2, v3

    goto :goto_1

    :cond_3
    sget-object v2, LMd6;->e:LMd6;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    :goto_1
    if-eqz v2, :cond_4

    const v1, -0x7c48faec

    invoke-interface {v15, v1}, LEt0;->F(I)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x7

    move-object/from16 v4, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt;->LoadingContent(LgV2;Ljava/lang/String;Ljava/lang/String;LEt0;II)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    goto/16 :goto_3

    :cond_4
    instance-of v2, v1, LCj1;

    if-eqz v2, :cond_5

    const v1, -0x7c48fac4

    invoke-interface {v15, v1}, LEt0;->F(I)V

    iget-object v1, v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2;->$payload:Ldp;

    check-cast v1, LCj1;

    invoke-virtual {v1}, LCj1;->b()Ljava/lang/Throwable;

    move-result-object v1

    sget-object v2, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2$1;

    sget-object v3, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2$2;->INSTANCE:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2$2;

    sget-object v4, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2$3;->INSTANCE:Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2$3;

    const/16 v6, 0xdb8

    move-object/from16 v5, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/features/partnerauth/PartnerAuthScreenKt;->ErrorContent(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;LEt0;I)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    goto/16 :goto_3

    :cond_5
    instance-of v1, v1, LwT5;

    if-eqz v1, :cond_8

    const v1, -0x7c48f9e4

    invoke-interface {v15, v1}, LEt0;->F(I)V

    iget-object v1, v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2;->$payload:Ldp;

    check-cast v1, LwT5;

    invoke-virtual {v1}, LwT5;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;->getCustomManualEntry()Z

    move-result v1

    if-ne v1, v3, :cond_6

    const v1, -0x7c48f9a7

    invoke-interface {v15, v1}, LEt0;->F(I)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x7

    move-object/from16 v4, p2

    invoke-static/range {v1 .. v6}, Lcom/stripe/android/financialconnections/features/common/LoadingContentKt;->LoadingContent(LgV2;Ljava/lang/String;Ljava/lang/String;LEt0;II)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    goto :goto_2

    :cond_6
    if-nez v1, :cond_7

    const v1, -0x7c48f97d

    invoke-interface {v15, v1}, LEt0;->F(I)V

    iget-object v1, v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2;->$payload:Ldp;

    check-cast v1, LwT5;

    invoke-virtual {v1}, LwT5;->a()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;

    iget-object v1, v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2;->$scrollState:LXp5;

    iget-object v3, v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2;->$linkPaymentAccountStatus:Ldp;

    iget-object v4, v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2;->$routing:Lkotlin/Pair;

    iget-object v5, v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2;->$onRoutingEntered:Lkotlin/jvm/functions/Function1;

    iget-object v6, v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2;->$account:Lkotlin/Pair;

    iget-object v7, v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2;->$onAccountEntered:Lkotlin/jvm/functions/Function1;

    iget-object v8, v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2;->$accountConfirm:Lkotlin/Pair;

    iget-object v9, v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2;->$onAccountConfirmEntered:Lkotlin/jvm/functions/Function1;

    iget-boolean v10, v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2;->$isValidForm:Z

    iget-object v11, v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2;->$onSubmit:Lkotlin/jvm/functions/Function0;

    iget v12, v0, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt$ManualEntryContent$2;->$$dirty:I

    shl-int/lit8 v13, v12, 0x9

    and-int/lit16 v13, v13, 0x1c00

    or-int/lit16 v13, v13, 0x200

    shr-int/lit8 v14, v12, 0x6

    const v16, 0xe000

    and-int v14, v14, v16

    or-int/2addr v13, v14

    shl-int/lit8 v14, v12, 0xc

    const/high16 v16, 0x70000

    and-int v14, v14, v16

    or-int/2addr v13, v14

    shr-int/lit8 v14, v12, 0x3

    const/high16 v16, 0x380000

    and-int v14, v14, v16

    or-int/2addr v13, v14

    shl-int/lit8 v14, v12, 0xf

    const/high16 v16, 0x1c00000

    and-int v14, v14, v16

    or-int/2addr v13, v14

    const/high16 v14, 0xe000000

    and-int/2addr v14, v12

    or-int/2addr v13, v14

    shl-int/lit8 v14, v12, 0x12

    const/high16 v16, 0x70000000

    and-int v14, v14, v16

    or-int/2addr v13, v14

    shr-int/lit8 v12, v12, 0x1b

    and-int/lit8 v14, v12, 0xe

    move-object/from16 v12, p2

    invoke-static/range {v1 .. v14}, Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryScreenKt;->access$ManualEntryLoaded(LXp5;Lcom/stripe/android/financialconnections/features/manualentry/ManualEntryState$Payload;Ldp;Lkotlin/Pair;Lkotlin/jvm/functions/Function1;Lkotlin/Pair;Lkotlin/jvm/functions/Function1;Lkotlin/Pair;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function0;LEt0;II)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    goto :goto_2

    :cond_7
    const v1, -0x7c48f717

    invoke-interface {v15, v1}, LEt0;->F(I)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    :goto_2
    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    goto :goto_3

    :cond_8
    const v1, -0x7c48f70d

    invoke-interface {v15, v1}, LEt0;->F(I)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    :goto_3
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {}, LQt0;->Y()V

    :cond_9
    :goto_4
    return-void
.end method

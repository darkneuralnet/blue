.class public final Lcom/stripe/android/financialconnections/features/common/ErrorContentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a+\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u001d\u0010\t\u001a\u00020\u00032\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0007H\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u001a3\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00072\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0007H\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a3\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u00102\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00072\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0007H\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a3\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u00132\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00072\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0007H\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001aA\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u00162\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00072\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00072\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0007H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u001a3\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u000c\u001a\u00020\u001a2\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00072\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0007H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u001a{\u0010\'\u001a\u00020\u00032\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0014\u0008\u0002\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f2\u0006\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u001d2\u001c\u0008\u0002\u0010%\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0007\u0018\u00010\u001f2\u001c\u0008\u0002\u0010&\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00030\u0007\u0018\u00010\u001fH\u0001\u00a2\u0006\u0004\u0008\'\u0010(\u001a-\u0010*\u001a\u00020\u00032\u0008\u0010)\u001a\u0004\u0018\u00010\u001d2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001fH\u0003\u00a2\u0006\u0004\u0008*\u0010+\u001a\u000f\u0010,\u001a\u00020\u0003H\u0001\u00a2\u0006\u0004\u0008,\u0010-\u001a\u000f\u0010.\u001a\u00020\u0003H\u0001\u00a2\u0006\u0004\u0008.\u0010-\u001a\u000f\u0010/\u001a\u00020\u0003H\u0001\u00a2\u0006\u0004\u0008/\u0010-\u001a\u0017\u00102\u001a\u00020\u00032\u0006\u00101\u001a\u000200H\u0001\u00a2\u0006\u0004\u00082\u00103\u00a8\u00064"
    }
    d2 = {
        "",
        "error",
        "Lkotlin/Function1;",
        "",
        "onCloseFromErrorClick",
        "UnclassifiedErrorContent",
        "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;LEt0;I)V",
        "Lkotlin/Function0;",
        "onSelectAnotherBank",
        "InstitutionUnknownErrorContent",
        "(Lkotlin/jvm/functions/Function0;LEt0;I)V",
        "Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;",
        "exception",
        "onEnterDetailsManually",
        "InstitutionUnplannedDowntimeErrorContent",
        "(Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V",
        "Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;",
        "InstitutionPlannedDowntimeErrorContent",
        "(Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V",
        "Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;",
        "NoSupportedPaymentMethodTypeAccountsErrorContent",
        "(Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V",
        "Lcom/stripe/android/financialconnections/exception/AccountLoadError;",
        "onTryAgain",
        "NoAccountsAvailableErrorContent",
        "(Lcom/stripe/android/financialconnections/exception/AccountLoadError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V",
        "Lcom/stripe/android/financialconnections/exception/AccountNumberRetrievalError;",
        "AccountNumberRetrievalErrorContent",
        "(Lcom/stripe/android/financialconnections/exception/AccountNumberRetrievalError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V",
        "",
        "iconUrl",
        "Lkotlin/Pair;",
        "LnE3;",
        "Lhy5;",
        "badge",
        "title",
        "content",
        "primaryCta",
        "secondaryCta",
        "ErrorContent",
        "(Ljava/lang/String;Lkotlin/Pair;Ljava/lang/String;Ljava/lang/String;Lkotlin/Pair;Lkotlin/Pair;LEt0;II)V",
        "institutionIconUrl",
        "BadgedInstitutionImage",
        "(Ljava/lang/String;Lkotlin/Pair;LEt0;I)V",
        "UnclassifiedErrorContentPreview",
        "(LEt0;I)V",
        "InstitutionPlannedDowntimeErrorContentPreview",
        "NoAccountsAvailableErrorContentPreview",
        "LgV2;",
        "modifier",
        "InstitutionPlaceholder",
        "(LgV2;LEt0;I)V",
        "financial-connections_release"
    }
    k = 0x2
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nErrorContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErrorContent.kt\ncom/stripe/android/financialconnections/features/common/ErrorContentKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n*L\n1#1,439:1\n1057#2,6:440\n1057#2,6:446\n1057#2,6:452\n1057#2,6:458\n1#3:464\n154#4:465\n154#4:466\n154#4:467\n154#4:468\n154#4:535\n154#4:536\n154#4:542\n154#4:548\n154#4:582\n154#4:583\n154#4:585\n154#4:586\n74#5,6:469\n80#5:501\n74#5,6:502\n80#5:534\n84#5:541\n84#5:547\n75#6:475\n76#6,11:477\n75#6:508\n76#6,11:510\n89#6:540\n89#6:546\n75#6:555\n76#6,11:557\n89#6:590\n76#7:476\n76#7:509\n76#7:556\n76#7:584\n460#8,13:488\n460#8,13:521\n473#8,3:537\n473#8,3:543\n460#8,13:568\n473#8,3:587\n67#9,6:549\n73#9:581\n77#9:591\n*S KotlinDebug\n*F\n+ 1 ErrorContent.kt\ncom/stripe/android/financialconnections/features/common/ErrorContentKt\n*L\n114#1:440,6\n115#1:446,6\n183#1:452,6\n205#1:458,6\n273#1:465\n274#1:466\n275#1:467\n276#1:468\n286#1:535\n291#1:536\n307#1:542\n328#1:548\n331#1:582\n333#1:583\n347#1:585\n351#1:586\n270#1:469,6\n270#1:501\n280#1:502,6\n280#1:534\n280#1:541\n270#1:547\n270#1:475\n270#1:477,11\n280#1:508\n280#1:510,11\n280#1:540\n270#1:546\n326#1:555\n326#1:557,11\n326#1:590\n270#1:476\n280#1:509\n326#1:556\n336#1:584\n270#1:488,13\n280#1:521,13\n280#1:537,3\n270#1:543,3\n326#1:568,13\n326#1:587,3\n326#1:549,6\n326#1:581\n326#1:591\n*E\n"
    }
.end annotation


# direct methods
.method public static final AccountNumberRetrievalErrorContent(Lcom/stripe/android/financialconnections/exception/AccountNumberRetrievalError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/exception/AccountNumberRetrievalError;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    const-string v0, "exception"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSelectAnotherBank"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEnterDetailsManually"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x66377711

    invoke-interface {p3, v0}, LEt0;->u(I)LEt0;

    move-result-object p3

    and-int/lit8 v1, p4, 0xe

    if-nez v1, :cond_1

    invoke-interface {p3, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit8 v2, p4, 0x70

    if-nez v2, :cond_3

    invoke-interface {p3, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, p4, 0x380

    if-nez v2, :cond_5

    invoke-interface {p3, p2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v1, v1, 0x2db

    const/16 v2, 0x92

    if-ne v1, v2, :cond_7

    invoke-interface {p3}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p3}, LEt0;->k()V

    goto :goto_7

    :cond_7
    :goto_4
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_8

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.common.AccountNumberRetrievalErrorContent (ErrorContent.kt:225)"

    invoke-static {v0, p4, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_8
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/exception/AccountNumberRetrievalError;->getInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->getIcon()Lcom/stripe/android/financialconnections/model/Image;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/Image;->getDefault()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_a

    :cond_9
    const-string v0, ""

    :cond_a
    move-object v1, v0

    const/4 v2, 0x0

    sget v0, Lcom/stripe/android/financialconnections/R$string;->stripe_attachlinkedpaymentaccount_error_title:I

    const/4 v3, 0x0

    invoke-static {v0, p3, v3}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/exception/AccountNumberRetrievalError;->getAllowManualEntry()Z

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_b

    sget v4, Lcom/stripe/android/financialconnections/R$string;->stripe_attachlinkedpaymentaccount_error_desc_manual_entry:I

    goto :goto_5

    :cond_b
    if-nez v4, :cond_f

    sget v4, Lcom/stripe/android/financialconnections/R$string;->stripe_attachlinkedpaymentaccount_error_desc:I

    :goto_5
    invoke-static {v4, p3, v3}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lkotlin/Pair;

    sget v6, Lcom/stripe/android/financialconnections/R$string;->stripe_error_cta_select_another_bank:I

    invoke-static {v6, p3, v3}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v5, v6, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/exception/AccountNumberRetrievalError;->getAllowManualEntry()Z

    move-result v6

    if-eqz v6, :cond_c

    new-instance v6, Lkotlin/Pair;

    sget v7, Lcom/stripe/android/financialconnections/R$string;->stripe_error_cta_manual_entry:I

    invoke-static {v7, p3, v3}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v6, v3, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_6

    :cond_c
    const/4 v3, 0x0

    move-object v6, v3

    :goto_6
    const/4 v8, 0x0

    const/4 v9, 0x2

    move-object v3, v0

    move-object v7, p3

    invoke-static/range {v1 .. v9}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt;->ErrorContent(Ljava/lang/String;Lkotlin/Pair;Ljava/lang/String;Ljava/lang/String;Lkotlin/Pair;Lkotlin/Pair;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {}, LQt0;->Y()V

    :cond_d
    :goto_7
    invoke-interface {p3}, LEt0;->w()LWm5;

    move-result-object p3

    if-nez p3, :cond_e

    goto :goto_8

    :cond_e
    new-instance v0, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$AccountNumberRetrievalErrorContent$1;

    invoke-direct {v0, p0, p1, p2, p4}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$AccountNumberRetrievalErrorContent$1;-><init>(Lcom/stripe/android/financialconnections/exception/AccountNumberRetrievalError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {p3, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_8
    return-void

    :cond_f
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final BadgedInstitutionImage(Ljava/lang/String;Lkotlin/Pair;LEt0;I)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/Pair<",
            "+",
            "LnE3;",
            "+",
            "Lhy5;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p3

    const v2, 0x1f4b8859

    move-object/from16 v3, p2

    invoke-interface {v3, v2}, LEt0;->u(I)LEt0;

    move-result-object v15

    invoke-static {}, LQt0;->O()Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, -0x1

    const-string v4, "com.stripe.android.financialconnections.features.common.BadgedInstitutionImage (ErrorContent.kt:321)"

    invoke-static {v2, v1, v3, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    sget-object v2, LgV2;->b0:LgV2$a;

    const/16 v3, 0x28

    int-to-float v3, v3

    invoke-static {v3}, Lk61;->g(F)F

    move-result v3

    invoke-static {v2, v3}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v3

    const v4, 0x2bb5b5d7

    invoke-interface {v15, v4}, LEt0;->F(I)V

    sget-object v16, LK9;->a:LK9$a;

    invoke-virtual/range {v16 .. v16}, LK9$a;->n()LK9;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v4, v5, v15, v5}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v4

    const v6, -0x4ee9b9da

    invoke-interface {v15, v6}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v6

    invoke-interface {v15, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v7

    invoke-interface {v15, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v8

    invoke-interface {v15, v8}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, LJq6;

    sget-object v9, LBt0;->M:LBt0$a;

    invoke-virtual {v9}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v10

    invoke-static {v3}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v3

    invoke-interface {v15}, LEt0;->v()Llm;

    move-result-object v11

    instance-of v11, v11, Llm;

    if-nez v11, :cond_1

    invoke-static {}, Lyt0;->c()V

    :cond_1
    invoke-interface {v15}, LEt0;->h()V

    invoke-interface {v15}, LEt0;->t()Z

    move-result v11

    if-eqz v11, :cond_2

    invoke-interface {v15, v10}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_0

    :cond_2
    invoke-interface {v15}, LEt0;->e()V

    :goto_0
    invoke-interface {v15}, LEt0;->L()V

    invoke-static {v15}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v10

    invoke-virtual {v9}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v11

    invoke-static {v10, v4, v11}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v9}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v10, v6, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v9}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v10, v7, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v9}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v10, v8, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v15}, LEt0;->q()V

    invoke-static {v15}, LMB5;->b(LEt0;)LEt0;

    move-result-object v4

    invoke-static {v4}, LMB5;->a(LEt0;)LMB5;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3, v4, v15, v5}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v3, 0x7ab4aae9

    invoke-interface {v15, v3}, LEt0;->F(I)V

    const v3, -0x7f65a980

    invoke-interface {v15, v3}, LEt0;->F(I)V

    sget-object v14, Lf10;->a:Lf10;

    const v3, 0x582f3d93

    invoke-interface {v15, v3}, LEt0;->F(I)V

    const/16 v3, 0x24

    int-to-float v3, v3

    invoke-static {v3}, Lk61;->g(F)F

    move-result v3

    invoke-static {v2, v3}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v3

    invoke-virtual/range {v16 .. v16}, LK9$a;->d()LK9;

    move-result-object v4

    invoke-interface {v14, v3, v4}, Le10;->c(LgV2;LK9;)LgV2;

    move-result-object v3

    const/4 v13, 0x6

    int-to-float v4, v13

    invoke-static {v4}, Lk61;->g(F)F

    move-result v4

    invoke-static {v4}, Lcc5;->d(F)Lbc5;

    move-result-object v4

    invoke-static {v3, v4}, LQk0;->a(LgV2;Lhy5;)LgV2;

    move-result-object v6

    if-nez v0, :cond_3

    const-string v3, ""

    goto :goto_1

    :cond_3
    move-object v3, v0

    :goto_1
    invoke-static {}, Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivityKt;->getLocalImageLoader()LU94;

    move-result-object v4

    invoke-interface {v15, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/stripe/android/uicore/image/StripeImageLoader;

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    new-instance v10, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$BadgedInstitutionImage$1$1;

    invoke-direct {v10, v6}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$BadgedInstitutionImage$1$1;-><init>(LgV2;)V

    const v11, -0x4e22b828

    const/4 v12, 0x1

    invoke-static {v15, v11, v12, v10}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v10

    const/4 v11, 0x0

    sget v17, Lcom/stripe/android/uicore/image/StripeImageLoader;->$stable:I

    shl-int/lit8 v17, v17, 0x3

    const v18, 0xc00180

    or-int v17, v17, v18

    const/16 v18, 0x170

    move-object v12, v15

    move/from16 v13, v17

    move-object v0, v14

    move/from16 v14, v18

    invoke-static/range {v3 .. v14}, Lcom/stripe/android/uicore/image/StripeImageKt;->StripeImage(Ljava/lang/String;Lcom/stripe/android/uicore/image/StripeImageLoader;Ljava/lang/String;LgV2;LBA0;Lsm0;LnE3;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;LEt0;II)V

    invoke-virtual/range {p1 .. p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LnE3;

    sget-object v4, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    const/4 v5, 0x6

    invoke-virtual {v4, v15, v5}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextCritical-0d7_KjU()J

    move-result-wide v6

    invoke-virtual/range {v16 .. v16}, LK9$a;->m()LK9;

    move-result-object v8

    invoke-interface {v0, v2, v8}, Le10;->c(LgV2;LK9;)LgV2;

    move-result-object v0

    const/16 v2, 0xc

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v0, v2}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lhy5;

    invoke-static {v0, v2}, LQk0;->a(LgV2;Lhy5;)LgV2;

    move-result-object v8

    invoke-virtual {v4, v15, v5}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getColors(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsColors;->getTextWhite-0d7_KjU()J

    move-result-wide v9

    const/4 v12, 0x2

    const/4 v13, 0x0

    invoke-static/range {v8 .. v13}, Lbw;->d(LgV2;JLhy5;ILjava/lang/Object;)LgV2;

    move-result-object v0

    const/4 v2, 0x1

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    invoke-static {v0, v2}, LND3;->i(LgV2;F)LgV2;

    move-result-object v5

    const-string v4, ""

    const/16 v9, 0x38

    const/4 v10, 0x0

    move-object v8, v15

    invoke-static/range {v3 .. v10}, LDP1;->b(LnE3;Ljava/lang/String;LgV2;JLEt0;II)V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->f()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-interface {v15}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    invoke-interface {v15}, LEt0;->w()LWm5;

    move-result-object v0

    if-nez v0, :cond_5

    goto :goto_2

    :cond_5
    new-instance v2, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$BadgedInstitutionImage$2;

    move-object/from16 v3, p0

    move-object/from16 v4, p1

    invoke-direct {v2, v3, v4, v1}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$BadgedInstitutionImage$2;-><init>(Ljava/lang/String;Lkotlin/Pair;I)V

    invoke-interface {v0, v2}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final ErrorContent(Ljava/lang/String;Lkotlin/Pair;Ljava/lang/String;Ljava/lang/String;Lkotlin/Pair;Lkotlin/Pair;LEt0;II)V
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/Pair<",
            "+",
            "LnE3;",
            "+",
            "Lhy5;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "+",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;>;",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "+",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;>;",
            "LEt0;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move-object/from16 v2, p3

    move/from16 v15, p7

    const-string v3, "title"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "content"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v3, 0x40393f46

    move-object/from16 v4, p6

    invoke-interface {v4, v3}, LEt0;->u(I)LEt0;

    move-result-object v14

    and-int/lit8 v4, p8, 0x1

    const/4 v5, 0x2

    if-eqz v4, :cond_0

    or-int/lit8 v4, v15, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v15, 0xe

    if-nez v4, :cond_2

    invoke-interface {v14, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    move v4, v5

    :goto_0
    or-int/2addr v4, v15

    goto :goto_1

    :cond_2
    move v4, v15

    :goto_1
    and-int/lit8 v6, p8, 0x2

    if-eqz v6, :cond_3

    or-int/lit8 v4, v4, 0x10

    :cond_3
    and-int/lit8 v7, p8, 0x4

    if-eqz v7, :cond_4

    or-int/lit16 v4, v4, 0x180

    goto :goto_3

    :cond_4
    and-int/lit16 v7, v15, 0x380

    if-nez v7, :cond_6

    invoke-interface {v14, v0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x100

    goto :goto_2

    :cond_5
    const/16 v7, 0x80

    :goto_2
    or-int/2addr v4, v7

    :cond_6
    :goto_3
    and-int/lit8 v7, p8, 0x8

    if-eqz v7, :cond_7

    or-int/lit16 v4, v4, 0xc00

    goto :goto_5

    :cond_7
    and-int/lit16 v7, v15, 0x1c00

    if-nez v7, :cond_9

    invoke-interface {v14, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x800

    goto :goto_4

    :cond_8
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v4, v7

    :cond_9
    :goto_5
    and-int/lit8 v7, p8, 0x10

    if-eqz v7, :cond_a

    or-int/lit16 v4, v4, 0x6000

    goto :goto_7

    :cond_a
    const v8, 0xe000

    and-int/2addr v8, v15

    if-nez v8, :cond_c

    move-object/from16 v8, p4

    invoke-interface {v14, v8}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    const/16 v9, 0x4000

    goto :goto_6

    :cond_b
    const/16 v9, 0x2000

    :goto_6
    or-int/2addr v4, v9

    goto :goto_8

    :cond_c
    :goto_7
    move-object/from16 v8, p4

    :goto_8
    and-int/lit8 v9, p8, 0x20

    if-eqz v9, :cond_d

    const/high16 v10, 0x30000

    or-int/2addr v4, v10

    goto :goto_a

    :cond_d
    const/high16 v10, 0x70000

    and-int/2addr v10, v15

    if-nez v10, :cond_f

    move-object/from16 v10, p5

    invoke-interface {v14, v10}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_e

    const/high16 v11, 0x20000

    goto :goto_9

    :cond_e
    const/high16 v11, 0x10000

    :goto_9
    or-int/2addr v4, v11

    goto :goto_b

    :cond_f
    :goto_a
    move-object/from16 v10, p5

    :goto_b
    if-ne v6, v5, :cond_11

    const v5, 0x5b6db

    and-int/2addr v5, v4

    const v11, 0x12492

    if-ne v5, v11, :cond_11

    invoke-interface {v14}, LEt0;->b()Z

    move-result v5

    if-nez v5, :cond_10

    goto :goto_c

    :cond_10
    invoke-interface {v14}, LEt0;->k()V

    move-object/from16 v2, p1

    move-object v5, v8

    move-object v6, v10

    move-object v0, v14

    goto/16 :goto_15

    :cond_11
    :goto_c
    invoke-interface {v14}, LEt0;->J()V

    and-int/lit8 v5, v15, 0x1

    const/4 v13, 0x0

    const/4 v11, 0x0

    if-eqz v5, :cond_14

    invoke-interface {v14}, LEt0;->l()Z

    move-result v5

    if-eqz v5, :cond_12

    goto :goto_e

    :cond_12
    invoke-interface {v14}, LEt0;->k()V

    if-eqz v6, :cond_13

    and-int/lit8 v4, v4, -0x71

    :cond_13
    move-object/from16 v12, p1

    :goto_d
    move-object/from16 v26, v8

    move-object/from16 v27, v10

    move v10, v4

    goto :goto_10

    :cond_14
    :goto_e
    if-eqz v6, :cond_15

    new-instance v5, Lkotlin/Pair;

    sget v6, Lcom/stripe/android/financialconnections/R$drawable;->stripe_ic_warning_circle:I

    invoke-static {v6, v14, v11}, LpE3;->d(ILEt0;I)LnE3;

    move-result-object v6

    invoke-static {}, Lcc5;->e()Lbc5;

    move-result-object v12

    invoke-direct {v5, v6, v12}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    and-int/lit8 v4, v4, -0x71

    goto :goto_f

    :cond_15
    move-object/from16 v5, p1

    :goto_f
    if-eqz v7, :cond_16

    move-object v8, v13

    :cond_16
    if-eqz v9, :cond_17

    move v10, v4

    move-object v12, v5

    move-object/from16 v26, v8

    move-object/from16 v27, v13

    goto :goto_10

    :cond_17
    move-object v12, v5

    goto :goto_d

    :goto_10
    invoke-interface {v14}, LEt0;->B()V

    invoke-static {}, LQt0;->O()Z

    move-result v4

    if-eqz v4, :cond_18

    const/4 v4, -0x1

    const-string v5, "com.stripe.android.financialconnections.features.common.ErrorContent (ErrorContent.kt:257)"

    invoke-static {v3, v10, v4, v5}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_18
    const/4 v9, 0x1

    invoke-static {v11, v14, v11, v9}, LUp5;->a(ILEt0;II)LXp5;

    move-result-object v17

    sget-object v8, LgV2;->b0:LgV2$a;

    const/16 v3, 0x8

    int-to-float v7, v3

    invoke-static {v7}, Lk61;->g(F)F

    move-result v3

    const/16 v4, 0x18

    int-to-float v4, v4

    invoke-static {v4}, Lk61;->g(F)F

    move-result v5

    invoke-static {v4}, Lk61;->g(F)F

    move-result v6

    invoke-static {v4}, Lk61;->g(F)F

    move-result v4

    invoke-static {v8, v5, v3, v6, v4}, LND3;->l(LgV2;FFFF)LgV2;

    move-result-object v3

    const/4 v6, 0x0

    invoke-static {v3, v6, v9, v13}, LBB5;->l(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v3

    const v5, -0x1cd0f17e

    invoke-interface {v14, v5}, LEt0;->F(I)V

    sget-object v23, Llo;->a:Llo;

    invoke-virtual/range {v23 .. v23}, Llo;->g()Llo$l;

    move-result-object v4

    sget-object v24, LK9;->a:LK9$a;

    invoke-virtual/range {v24 .. v24}, LK9$a;->j()LK9$b;

    move-result-object v5

    invoke-static {v4, v5, v14, v11}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v4

    const v5, -0x4ee9b9da

    invoke-interface {v14, v5}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v5

    invoke-interface {v14, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v6

    invoke-interface {v14, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v9

    invoke-interface {v14, v9}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, LJq6;

    sget-object v25, LBt0;->M:LBt0$a;

    invoke-virtual/range {v25 .. v25}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v13

    invoke-static {v3}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v3

    invoke-interface {v14}, LEt0;->v()Llm;

    move-result-object v11

    instance-of v11, v11, Llm;

    if-nez v11, :cond_19

    invoke-static {}, Lyt0;->c()V

    :cond_19
    invoke-interface {v14}, LEt0;->h()V

    invoke-interface {v14}, LEt0;->t()Z

    move-result v11

    if-eqz v11, :cond_1a

    invoke-interface {v14, v13}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_11

    :cond_1a
    invoke-interface {v14}, LEt0;->e()V

    :goto_11
    invoke-interface {v14}, LEt0;->L()V

    invoke-static {v14}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v11

    invoke-virtual/range {v25 .. v25}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v13

    invoke-static {v11, v4, v13}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v25 .. v25}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v11, v5, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v25 .. v25}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v11, v6, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v25 .. v25}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v11, v9, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v14}, LEt0;->q()V

    invoke-static {v14}, LMB5;->b(LEt0;)LEt0;

    move-result-object v4

    invoke-static {v4}, LMB5;->a(LEt0;)LMB5;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-interface {v3, v4, v14, v6}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v9, 0x7ab4aae9

    invoke-interface {v14, v9}, LEt0;->F(I)V

    const v11, -0x455f09d5

    invoke-interface {v14, v11}, LEt0;->F(I)V

    sget-object v3, LQm0;->a:LQm0;

    const v4, -0x4cfa9770

    invoke-interface {v14, v4}, LEt0;->F(I)V

    const/high16 v5, 0x3f800000    # 1.0f

    const/4 v6, 0x0

    const/4 v13, 0x2

    const/16 v16, 0x0

    move-object v4, v8

    const v9, -0x1cd0f17e

    const v11, -0x4ee9b9da

    move/from16 v31, v7

    move v7, v13

    move-object v13, v8

    move-object/from16 v8, v16

    invoke-static/range {v3 .. v8}, LPm0;->b(LPm0;LgV2;FZILjava/lang/Object;)LgV2;

    move-result-object v16

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0xe

    const/16 v22, 0x0

    invoke-static/range {v16 .. v22}, LUp5;->d(LgV2;LXp5;ZLcu1;ZILjava/lang/Object;)LgV2;

    move-result-object v3

    invoke-interface {v14, v9}, LEt0;->F(I)V

    invoke-virtual/range {v23 .. v23}, Llo;->g()Llo$l;

    move-result-object v4

    invoke-virtual/range {v24 .. v24}, LK9$a;->j()LK9$b;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v4, v5, v14, v6}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v4

    invoke-interface {v14, v11}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v5

    invoke-interface {v14, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v6

    invoke-interface {v14, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v7

    invoke-interface {v14, v7}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, LJq6;

    invoke-virtual/range {v25 .. v25}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v8

    invoke-static {v3}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v3

    invoke-interface {v14}, LEt0;->v()Llm;

    move-result-object v9

    instance-of v9, v9, Llm;

    if-nez v9, :cond_1b

    invoke-static {}, Lyt0;->c()V

    :cond_1b
    invoke-interface {v14}, LEt0;->h()V

    invoke-interface {v14}, LEt0;->t()Z

    move-result v9

    if-eqz v9, :cond_1c

    invoke-interface {v14, v8}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_12

    :cond_1c
    invoke-interface {v14}, LEt0;->e()V

    :goto_12
    invoke-interface {v14}, LEt0;->L()V

    invoke-static {v14}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v8

    invoke-virtual/range {v25 .. v25}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    invoke-static {v8, v4, v9}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v25 .. v25}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v8, v5, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v25 .. v25}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v8, v6, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual/range {v25 .. v25}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v4

    invoke-static {v8, v7, v4}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {v14}, LEt0;->q()V

    invoke-static {v14}, LMB5;->b(LEt0;)LEt0;

    move-result-object v4

    invoke-static {v4}, LMB5;->a(LEt0;)LMB5;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v3, v4, v14, v5}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const v3, 0x7ab4aae9

    invoke-interface {v14, v3}, LEt0;->F(I)V

    const v3, -0x455f09d5

    invoke-interface {v14, v3}, LEt0;->F(I)V

    const v3, -0x2ec99f26

    invoke-interface {v14, v3}, LEt0;->F(I)V

    and-int/lit8 v3, v10, 0xe

    or-int/lit8 v3, v3, 0x40

    invoke-static {v1, v12, v14, v3}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt;->BadgedInstitutionImage(Ljava/lang/String;Lkotlin/Pair;LEt0;I)V

    const/16 v3, 0x10

    int-to-float v11, v3

    invoke-static {v11}, Lk61;->g(F)F

    move-result v3

    invoke-static {v13, v3}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v3

    const/4 v9, 0x6

    invoke-static {v3, v14, v9}, LDN5;->a(LgV2;LEt0;I)V

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/16 v16, 0x0

    move v3, v9

    move-object/from16 v9, v16

    move/from16 v29, v10

    move-object/from16 v10, v16

    const-wide/16 v16, 0x0

    move/from16 v32, v11

    move-object/from16 v30, v12

    move-wide/from16 v11, v16

    const/16 v16, 0x0

    move-object/from16 v33, v13

    move-object/from16 v13, v16

    move-object v4, v14

    move-object/from16 v14, v16

    const-wide/16 v16, 0x0

    move-wide/from16 v15, v16

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    sget-object v5, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->INSTANCE:Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;

    invoke-virtual {v5, v4, v3}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getSubtitle()LG26;

    move-result-object v21

    shr-int/lit8 v22, v29, 0x6

    and-int/lit8 v23, v22, 0xe

    const/16 v24, 0x0

    const/16 v25, 0x7ffe

    move-object/from16 v2, p2

    move-object/from16 v22, v4

    move v1, v3

    move-object v0, v4

    move-object/from16 v28, v5

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    invoke-static/range {v2 .. v25}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-static/range {v32 .. v32}, Lk61;->g(F)F

    move-result v2

    move-object/from16 v15, v33

    invoke-static {v15, v2}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v2

    invoke-static {v2, v0, v1}, LDN5;->a(LgV2;LEt0;I)V

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v16, 0x0

    move-object v2, v15

    move-wide/from16 v15, v16

    const/16 v17, 0x0

    move-object/from16 v3, v28

    invoke-virtual {v3, v0, v1}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTheme;->getTypography(LEt0;I)Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;

    move-result-object v3

    invoke-virtual {v3}, Lcom/stripe/android/financialconnections/ui/theme/FinancialConnectionsTypography;->getBody()LG26;

    move-result-object v21

    shr-int/lit8 v3, v29, 0x9

    and-int/lit8 v23, v3, 0xe

    move-object v3, v2

    move-object/from16 v2, p3

    move-object/from16 v22, v0

    move-object v1, v3

    const/4 v3, 0x0

    invoke-static/range {v2 .. v25}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->f()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->Q()V

    const v2, 0x59262bf2

    invoke-interface {v0, v2}, LEt0;->F(I)V

    if-nez v27, :cond_1d

    const/4 v3, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    goto :goto_13

    :cond_1d
    invoke-virtual/range {v27 .. v27}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual/range {v27 .. v27}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lkotlin/jvm/functions/Function0;

    sget-object v6, Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type$Secondary;->INSTANCE:Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type$Secondary;

    const/4 v3, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x1

    invoke-static {v1, v3, v15, v14}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v5

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    new-instance v10, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$ErrorContent$1$2$1;

    invoke-direct {v10, v2}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$ErrorContent$1$2$1;-><init>(Ljava/lang/String;)V

    const v2, -0x6c4c5ec2

    invoke-static {v0, v2, v15, v10}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v10

    const v12, 0x1801b0

    const/16 v13, 0x38

    move-object v11, v0

    invoke-static/range {v4 .. v13}, Lcom/stripe/android/financialconnections/ui/components/ButtonKt;->FinancialConnectionsButton(Lkotlin/jvm/functions/Function0;LgV2;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;ZZLkotlin/jvm/functions/Function3;LEt0;II)V

    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_13
    invoke-interface {v0}, LEt0;->Q()V

    const v2, 0x59262d32

    invoke-interface {v0, v2}, LEt0;->F(I)V

    if-eqz v26, :cond_1e

    if-eqz v27, :cond_1e

    invoke-static/range {v31 .. v31}, Lk61;->g(F)F

    move-result v2

    invoke-static {v1, v2}, LBB5;->w(LgV2;F)LgV2;

    move-result-object v2

    const/4 v4, 0x6

    invoke-static {v2, v0, v4}, LDN5;->a(LgV2;LEt0;I)V

    :cond_1e
    invoke-interface {v0}, LEt0;->Q()V

    if-nez v26, :cond_1f

    goto :goto_14

    :cond_1f
    invoke-virtual/range {v26 .. v26}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual/range {v26 .. v26}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lkotlin/jvm/functions/Function0;

    sget-object v6, Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type$Primary;->INSTANCE:Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type$Primary;

    invoke-static {v1, v3, v15, v14}, LBB5;->n(LgV2;FILjava/lang/Object;)LgV2;

    move-result-object v5

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    new-instance v1, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$ErrorContent$1$3$1;

    invoke-direct {v1, v2}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$ErrorContent$1$3$1;-><init>(Ljava/lang/String;)V

    const v2, -0x6963499

    invoke-static {v0, v2, v15, v1}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v10

    const v12, 0x1801b0

    const/16 v13, 0x38

    move-object v11, v0

    invoke-static/range {v4 .. v13}, Lcom/stripe/android/financialconnections/ui/components/ButtonKt;->FinancialConnectionsButton(Lkotlin/jvm/functions/Function0;LgV2;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;ZZLkotlin/jvm/functions/Function3;LEt0;II)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_14
    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->f()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-interface {v0}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_20

    invoke-static {}, LQt0;->Y()V

    :cond_20
    move-object/from16 v5, v26

    move-object/from16 v6, v27

    move-object/from16 v2, v30

    :goto_15
    invoke-interface {v0}, LEt0;->w()LWm5;

    move-result-object v9

    if-nez v9, :cond_21

    goto :goto_16

    :cond_21
    new-instance v10, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$ErrorContent$2;

    move-object v0, v10

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$ErrorContent$2;-><init>(Ljava/lang/String;Lkotlin/Pair;Ljava/lang/String;Ljava/lang/String;Lkotlin/Pair;Lkotlin/Pair;II)V

    invoke-interface {v9, v10}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_16
    return-void
.end method

.method public static final InstitutionPlaceholder(LgV2;LEt0;I)V
    .locals 11

    const-string v0, "modifier"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x36afa7d0    # -853379.0f

    invoke-interface {p1, v0}, LEt0;->u(I)LEt0;

    move-result-object p1

    and-int/lit8 v1, p2, 0xe

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p1, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p2

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 v3, v1, 0xb

    if-ne v3, v2, :cond_3

    invoke-interface {p1}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.financialconnections.features.common.InstitutionPlaceholder (ErrorContent.kt:430)"

    invoke-static {v0, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    sget v0, Lcom/stripe/android/financialconnections/R$drawable;->stripe_ic_brandicon_institution:I

    const/4 v2, 0x0

    invoke-static {v0, p1, v2}, LpE3;->d(ILEt0;I)LnE3;

    move-result-object v0

    sget-object v2, LBA0;->a:LBA0$a;

    invoke-virtual {v2}, LBA0$a;->a()LBA0;

    move-result-object v5

    const-string v2, "Bank icon placeholder"

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    shl-int/lit8 v1, v1, 0x6

    and-int/lit16 v1, v1, 0x380

    or-int/lit16 v9, v1, 0x6038

    const/16 v10, 0x68

    move-object v1, v0

    move-object v3, p0

    move-object v8, p1

    invoke-static/range {v1 .. v10}, LxX1;->a(LnE3;Ljava/lang/String;LgV2;LK9;LBA0;FLsm0;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    :goto_3
    invoke-interface {p1}, LEt0;->w()LWm5;

    move-result-object p1

    if-nez p1, :cond_6

    goto :goto_4

    :cond_6
    new-instance v0, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$InstitutionPlaceholder$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$InstitutionPlaceholder$1;-><init>(LgV2;I)V

    invoke-interface {p1, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_4
    return-void
.end method

.method public static final InstitutionPlannedDowntimeErrorContent(Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    const-string v0, "exception"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSelectAnotherBank"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEnterDetailsManually"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x714f431

    invoke-interface {p3, v0}, LEt0;->u(I)LEt0;

    move-result-object p3

    and-int/lit8 v1, p4, 0xe

    if-nez v1, :cond_1

    invoke-interface {p3, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit8 v2, p4, 0x70

    if-nez v2, :cond_3

    invoke-interface {p3, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, p4, 0x380

    if-nez v2, :cond_5

    invoke-interface {p3, p2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v1, v1, 0x2db

    const/16 v2, 0x92

    if-ne v1, v2, :cond_7

    invoke-interface {p3}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p3}, LEt0;->k()V

    goto/16 :goto_6

    :cond_7
    :goto_4
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_8

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.common.InstitutionPlannedDowntimeErrorContent (ErrorContent.kt:108)"

    invoke-static {v0, p4, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_8
    invoke-interface {p3}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v2

    if-ne v0, v2, :cond_9

    new-instance v0, Ljava/util/Locale;

    sget-object v2, Lqv2;->b:Lqv2$a;

    invoke-virtual {v2}, Lqv2$a;->a()Lqv2;

    move-result-object v2

    invoke-virtual {v2}, Lqv2;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/util/Locale;-><init>(Ljava/lang/String;)V

    invoke-interface {p3, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_9
    check-cast v0, Ljava/util/Locale;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;->getBackUpAt()J

    move-result-wide v2

    invoke-interface {p3, v2, v3}, LEt0;->s(J)Z

    move-result v2

    invoke-interface {p3}, LEt0;->G()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_a

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v3, v1, :cond_b

    :cond_a
    new-instance v1, Ljava/text/SimpleDateFormat;

    const-string v2, "dd/MM/yyyy HH:mm"

    invoke-direct {v1, v2, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;->getBackUpAt()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p3, v3}, LEt0;->z(Ljava/lang/Object;)V

    :cond_b
    check-cast v3, Ljava/lang/String;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;->getInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->getIcon()Lcom/stripe/android/financialconnections/model/Image;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/Image;->getDefault()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_d

    :cond_c
    const-string v0, ""

    :cond_d
    move-object v1, v0

    const/4 v2, 0x0

    sget v0, Lcom/stripe/android/financialconnections/R$string;->stripe_error_planned_downtime_title:I

    const/4 v4, 0x1

    new-array v5, v4, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;->getInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v6

    invoke-virtual {v6}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->getName()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    aput-object v6, v5, v7

    const/16 v6, 0x40

    invoke-static {v0, v5, p3, v6}, LfS5;->d(I[Ljava/lang/Object;LEt0;I)Ljava/lang/String;

    move-result-object v0

    sget v5, Lcom/stripe/android/financialconnections/R$string;->stripe_error_planned_downtime_desc:I

    new-array v4, v4, [Ljava/lang/Object;

    const-string v8, "readableDate"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    aput-object v3, v4, v7

    invoke-static {v5, v4, p3, v6}, LfS5;->d(I[Ljava/lang/Object;LEt0;I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lkotlin/Pair;

    sget v3, Lcom/stripe/android/financialconnections/R$string;->stripe_error_cta_select_another_bank:I

    invoke-static {v3, p3, v7}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v5, v3, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;->getAllowManualEntry()Z

    move-result v3

    if-eqz v3, :cond_e

    new-instance v3, Lkotlin/Pair;

    sget v6, Lcom/stripe/android/financialconnections/R$string;->stripe_error_cta_manual_entry:I

    invoke-static {v6, p3, v7}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v3, v6, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_5

    :cond_e
    const/4 v3, 0x0

    :goto_5
    move-object v6, v3

    const/4 v8, 0x0

    const/4 v9, 0x2

    move-object v3, v0

    move-object v7, p3

    invoke-static/range {v1 .. v9}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt;->ErrorContent(Ljava/lang/String;Lkotlin/Pair;Ljava/lang/String;Ljava/lang/String;Lkotlin/Pair;Lkotlin/Pair;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-static {}, LQt0;->Y()V

    :cond_f
    :goto_6
    invoke-interface {p3}, LEt0;->w()LWm5;

    move-result-object p3

    if-nez p3, :cond_10

    goto :goto_7

    :cond_10
    new-instance v0, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$InstitutionPlannedDowntimeErrorContent$1;

    invoke-direct {v0, p0, p1, p2, p4}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$InstitutionPlannedDowntimeErrorContent$1;-><init>(Lcom/stripe/android/financialconnections/exception/InstitutionPlannedDowntimeError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {p3, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_7
    return-void
.end method

.method public static final InstitutionPlannedDowntimeErrorContentPreview(LEt0;I)V
    .locals 4

    const v0, 0x571134d4

    invoke-interface {p0, v0}, LEt0;->u(I)LEt0;

    move-result-object p0

    if-nez p1, :cond_1

    invoke-interface {p0}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LEt0;->k()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.common.InstitutionPlannedDowntimeErrorContentPreview (ErrorContent.kt:369)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ErrorContentKt;->INSTANCE:Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ErrorContentKt;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ErrorContentKt;->getLambda-6$financial_connections_release()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    const/16 v1, 0x30

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v3, v0, p0, v1, v2}, Lcom/stripe/android/financialconnections/ui/CompositionLocalKt;->FinancialConnectionsPreview(ZLkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    invoke-interface {p0}, LEt0;->w()LWm5;

    move-result-object p0

    if-nez p0, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$InstitutionPlannedDowntimeErrorContentPreview$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$InstitutionPlannedDowntimeErrorContentPreview$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final InstitutionUnknownErrorContent(Lkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    const-string v0, "onSelectAnotherBank"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x1ed8a05b

    invoke-interface {p1, v0}, LEt0;->u(I)LEt0;

    move-result-object p1

    and-int/lit8 v1, p2, 0xe

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p1, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p2

    goto :goto_1

    :cond_1
    move v1, p2

    :goto_1
    and-int/lit8 v1, v1, 0xb

    if-ne v1, v2, :cond_3

    invoke-interface {p1}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface {p1}, LEt0;->k()V

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.common.InstitutionUnknownErrorContent (ErrorContent.kt:65)"

    invoke-static {v0, p2, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    const/4 v1, 0x0

    const/4 v2, 0x0

    sget v0, Lcom/stripe/android/financialconnections/R$string;->stripe_error_generic_title:I

    const/4 v3, 0x0

    invoke-static {v0, p1, v3}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v0

    sget v4, Lcom/stripe/android/financialconnections/R$string;->stripe_error_unplanned_downtime_desc:I

    invoke-static {v4, p1, v3}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Lkotlin/Pair;

    sget v6, Lcom/stripe/android/financialconnections/R$string;->stripe_error_cta_select_another_bank:I

    invoke-static {v6, p1, v3}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v5, v3, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v6, 0x0

    const/4 v8, 0x6

    const/16 v9, 0x22

    move-object v3, v0

    move-object v7, p1

    invoke-static/range {v1 .. v9}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt;->ErrorContent(Ljava/lang/String;Lkotlin/Pair;Ljava/lang/String;Ljava/lang/String;Lkotlin/Pair;Lkotlin/Pair;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    :goto_3
    invoke-interface {p1}, LEt0;->w()LWm5;

    move-result-object p1

    if-nez p1, :cond_6

    goto :goto_4

    :cond_6
    new-instance v0, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$InstitutionUnknownErrorContent$1;

    invoke-direct {v0, p0, p2}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$InstitutionUnknownErrorContent$1;-><init>(Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {p1, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_4
    return-void
.end method

.method public static final InstitutionUnplannedDowntimeErrorContent(Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    const-string v0, "exception"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSelectAnotherBank"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEnterDetailsManually"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x5c383c51

    invoke-interface {p3, v0}, LEt0;->u(I)LEt0;

    move-result-object p3

    and-int/lit8 v1, p4, 0xe

    if-nez v1, :cond_1

    invoke-interface {p3, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit8 v2, p4, 0x70

    if-nez v2, :cond_3

    invoke-interface {p3, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, p4, 0x380

    if-nez v2, :cond_5

    invoke-interface {p3, p2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v1, v1, 0x2db

    const/16 v2, 0x92

    if-ne v1, v2, :cond_7

    invoke-interface {p3}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p3}, LEt0;->k()V

    goto :goto_6

    :cond_7
    :goto_4
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_8

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.common.InstitutionUnplannedDowntimeErrorContent (ErrorContent.kt:80)"

    invoke-static {v0, p4, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_8
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;->getInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->getIcon()Lcom/stripe/android/financialconnections/model/Image;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/Image;->getDefault()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_a

    :cond_9
    const-string v0, ""

    :cond_a
    move-object v1, v0

    const/4 v2, 0x0

    sget v0, Lcom/stripe/android/financialconnections/R$string;->stripe_error_unplanned_downtime_title:I

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;->getInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v4

    invoke-virtual {v4}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->getName()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    const/16 v4, 0x40

    invoke-static {v0, v3, p3, v4}, LfS5;->d(I[Ljava/lang/Object;LEt0;I)Ljava/lang/String;

    move-result-object v3

    sget v0, Lcom/stripe/android/financialconnections/R$string;->stripe_error_unplanned_downtime_desc:I

    invoke-static {v0, p3, v5}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v4

    new-instance v0, Lkotlin/Pair;

    sget v6, Lcom/stripe/android/financialconnections/R$string;->stripe_error_cta_select_another_bank:I

    invoke-static {v6, p3, v5}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v0, v6, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;->getAllowManualEntry()Z

    move-result v6

    if-eqz v6, :cond_b

    new-instance v6, Lkotlin/Pair;

    sget v7, Lcom/stripe/android/financialconnections/R$string;->stripe_error_cta_manual_entry:I

    invoke-static {v7, p3, v5}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v6, v5, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_5

    :cond_b
    const/4 v5, 0x0

    move-object v6, v5

    :goto_5
    const/4 v8, 0x0

    const/4 v9, 0x2

    move-object v5, v0

    move-object v7, p3

    invoke-static/range {v1 .. v9}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt;->ErrorContent(Ljava/lang/String;Lkotlin/Pair;Ljava/lang/String;Ljava/lang/String;Lkotlin/Pair;Lkotlin/Pair;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, LQt0;->Y()V

    :cond_c
    :goto_6
    invoke-interface {p3}, LEt0;->w()LWm5;

    move-result-object p3

    if-nez p3, :cond_d

    goto :goto_7

    :cond_d
    new-instance v0, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$InstitutionUnplannedDowntimeErrorContent$1;

    invoke-direct {v0, p0, p1, p2, p4}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$InstitutionUnplannedDowntimeErrorContent$1;-><init>(Lcom/stripe/android/financialconnections/exception/InstitutionUnplannedDowntimeError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {p3, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_7
    return-void
.end method

.method public static final NoAccountsAvailableErrorContent(Lcom/stripe/android/financialconnections/exception/AccountLoadError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/exception/AccountLoadError;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    const-string v0, "exception"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSelectAnotherBank"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEnterDetailsManually"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTryAgain"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, -0x9b201ea

    move-object/from16 v6, p4

    invoke-interface {v6, v0}, LEt0;->u(I)LEt0;

    move-result-object v15

    and-int/lit8 v6, v5, 0xe

    if-nez v6, :cond_1

    invoke-interface {v15, v1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v5

    goto :goto_1

    :cond_1
    move v6, v5

    :goto_1
    and-int/lit8 v7, v5, 0x70

    if-nez v7, :cond_3

    invoke-interface {v15, v2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_3
    and-int/lit16 v7, v5, 0x380

    if-nez v7, :cond_5

    invoke-interface {v15, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v6, v7

    :cond_5
    and-int/lit16 v7, v5, 0x1c00

    if-nez v7, :cond_7

    invoke-interface {v15, v4}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_4

    :cond_6
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v6, v7

    :cond_7
    and-int/lit16 v6, v6, 0x16db

    const/16 v7, 0x492

    if-ne v6, v7, :cond_9

    invoke-interface {v15}, LEt0;->b()Z

    move-result v6

    if-nez v6, :cond_8

    goto :goto_5

    :cond_8
    invoke-interface {v15}, LEt0;->k()V

    goto/16 :goto_a

    :cond_9
    :goto_5
    invoke-static {}, LQt0;->O()Z

    move-result v6

    if-eqz v6, :cond_a

    const/4 v6, -0x1

    const-string v7, "com.stripe.android.financialconnections.features.common.NoAccountsAvailableErrorContent (ErrorContent.kt:175)"

    invoke-static {v0, v5, v6, v7}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_a
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/exception/AccountLoadError;->getAllowManualEntry()Z

    move-result v0

    invoke-interface {v15, v0}, LEt0;->o(Z)Z

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/exception/AccountLoadError;->getCanRetry()Z

    move-result v6

    invoke-interface {v15, v6}, LEt0;->o(Z)Z

    move-result v6

    or-int/2addr v0, v6

    invoke-interface {v15}, LEt0;->G()Ljava/lang/Object;

    move-result-object v6

    const/4 v7, 0x0

    if-nez v0, :cond_b

    sget-object v0, LEt0;->a:LEt0$a;

    invoke-virtual {v0}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v0

    if-ne v6, v0, :cond_e

    :cond_b
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/exception/AccountLoadError;->getCanRetry()Z

    move-result v0

    if-eqz v0, :cond_c

    new-instance v0, Lkotlin/Pair;

    sget v6, Lcom/stripe/android/financialconnections/R$string;->stripe_error_cta_retry:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v6, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    sget v8, Lcom/stripe/android/financialconnections/R$string;->stripe_error_cta_select_another_bank:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    invoke-direct {v0, v6, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_6
    move-object v6, v0

    goto :goto_7

    :cond_c
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/exception/AccountLoadError;->getAllowManualEntry()Z

    move-result v0

    if-eqz v0, :cond_d

    new-instance v0, Lkotlin/Pair;

    sget v6, Lcom/stripe/android/financialconnections/R$string;->stripe_error_cta_manual_entry:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v6, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    sget v8, Lcom/stripe/android/financialconnections/R$string;->stripe_error_cta_select_another_bank:I

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v8, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v8

    invoke-direct {v0, v6, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_6

    :cond_d
    new-instance v0, Lkotlin/Pair;

    sget v6, Lcom/stripe/android/financialconnections/R$string;->stripe_error_cta_select_another_bank:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v6, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    invoke-direct {v0, v6, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_6

    :goto_7
    invoke-interface {v15, v6}, LEt0;->z(Ljava/lang/Object;)V

    :cond_e
    check-cast v6, Lkotlin/Pair;

    invoke-virtual {v6}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkotlin/Pair;

    invoke-virtual {v6}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lkotlin/Pair;

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/exception/AccountLoadError;->getAllowManualEntry()Z

    move-result v8

    invoke-interface {v15, v8}, LEt0;->o(Z)Z

    move-result v8

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/exception/AccountLoadError;->getCanRetry()Z

    move-result v9

    invoke-interface {v15, v9}, LEt0;->o(Z)Z

    move-result v9

    or-int/2addr v8, v9

    invoke-interface {v15}, LEt0;->G()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_f

    sget-object v8, LEt0;->a:LEt0$a;

    invoke-virtual {v8}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v8

    if-ne v9, v8, :cond_12

    :cond_f
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/exception/AccountLoadError;->getCanRetry()Z

    move-result v8

    if-eqz v8, :cond_10

    sget v8, Lcom/stripe/android/financialconnections/R$string;->stripe_accounts_error_desc_retry:I

    goto :goto_8

    :cond_10
    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/exception/AccountLoadError;->getAllowManualEntry()Z

    move-result v8

    if-eqz v8, :cond_11

    sget v8, Lcom/stripe/android/financialconnections/R$string;->stripe_accounts_error_desc_manualentry:I

    goto :goto_8

    :cond_11
    sget v8, Lcom/stripe/android/financialconnections/R$string;->stripe_accounts_error_desc_no_retry:I

    :goto_8
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v15, v9}, LEt0;->z(Ljava/lang/Object;)V

    :cond_12
    check-cast v9, Ljava/lang/Number;

    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/exception/AccountLoadError;->getInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v9

    invoke-virtual {v9}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->getIcon()Lcom/stripe/android/financialconnections/model/Image;

    move-result-object v9

    if-eqz v9, :cond_13

    invoke-virtual {v9}, Lcom/stripe/android/financialconnections/model/Image;->getDefault()Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_14

    :cond_13
    const-string v9, ""

    :cond_14
    const/4 v10, 0x0

    sget v11, Lcom/stripe/android/financialconnections/R$string;->stripe_account_picker_error_no_account_available_title:I

    const/4 v12, 0x1

    new-array v12, v12, [Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, Lcom/stripe/android/financialconnections/exception/AccountLoadError;->getInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v13

    invoke-virtual {v13}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->getName()Ljava/lang/String;

    move-result-object v13

    const/4 v14, 0x0

    aput-object v13, v12, v14

    const/16 v13, 0x40

    invoke-static {v11, v12, v15, v13}, LfS5;->d(I[Ljava/lang/Object;LEt0;I)Ljava/lang/String;

    move-result-object v11

    invoke-static {v8, v15, v14}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    invoke-static {v8, v15, v14}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v8, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v0

    if-eqz v6, :cond_15

    invoke-virtual {v6}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v7

    invoke-static {v7, v15, v14}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v7, v6}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v6

    move-object v13, v6

    goto :goto_9

    :cond_15
    move-object v13, v7

    :goto_9
    const/4 v14, 0x0

    const/16 v16, 0x2

    move-object v6, v9

    move-object v7, v10

    move-object v8, v11

    move-object v9, v12

    move-object v10, v0

    move-object v11, v13

    move-object v12, v15

    move v13, v14

    move/from16 v14, v16

    invoke-static/range {v6 .. v14}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt;->ErrorContent(Ljava/lang/String;Lkotlin/Pair;Ljava/lang/String;Ljava/lang/String;Lkotlin/Pair;Lkotlin/Pair;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_16

    invoke-static {}, LQt0;->Y()V

    :cond_16
    :goto_a
    invoke-interface {v15}, LEt0;->w()LWm5;

    move-result-object v6

    if-nez v6, :cond_17

    goto :goto_b

    :cond_17
    new-instance v7, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$NoAccountsAvailableErrorContent$3;

    move-object v0, v7

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$NoAccountsAvailableErrorContent$3;-><init>(Lcom/stripe/android/financialconnections/exception/AccountLoadError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {v6, v7}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_b
    return-void
.end method

.method public static final NoAccountsAvailableErrorContentPreview(LEt0;I)V
    .locals 4

    const v0, -0x1a11e941

    invoke-interface {p0, v0}, LEt0;->u(I)LEt0;

    move-result-object p0

    if-nez p1, :cond_1

    invoke-interface {p0}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LEt0;->k()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.common.NoAccountsAvailableErrorContentPreview (ErrorContent.kt:400)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ErrorContentKt;->INSTANCE:Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ErrorContentKt;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ErrorContentKt;->getLambda-9$financial_connections_release()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    const/16 v1, 0x30

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v3, v0, p0, v1, v2}, Lcom/stripe/android/financialconnections/ui/CompositionLocalKt;->FinancialConnectionsPreview(ZLkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    invoke-interface {p0}, LEt0;->w()LWm5;

    move-result-object p0

    if-nez p0, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$NoAccountsAvailableErrorContentPreview$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$NoAccountsAvailableErrorContentPreview$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final NoSupportedPaymentMethodTypeAccountsErrorContent(Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    const-string v0, "exception"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSelectAnotherBank"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEnterDetailsManually"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x1c75fb2f

    invoke-interface {p3, v0}, LEt0;->u(I)LEt0;

    move-result-object p3

    and-int/lit8 v1, p4, 0xe

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-interface {p3, p0}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, p4

    goto :goto_1

    :cond_1
    move v1, p4

    :goto_1
    and-int/lit8 v3, p4, 0x70

    if-nez v3, :cond_3

    invoke-interface {p3, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    and-int/lit16 v3, p4, 0x380

    if-nez v3, :cond_5

    invoke-interface {p3, p2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v1, v3

    :cond_5
    and-int/lit16 v1, v1, 0x2db

    const/16 v3, 0x92

    if-ne v1, v3, :cond_7

    invoke-interface {p3}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_4

    :cond_6
    invoke-interface {p3}, LEt0;->k()V

    goto/16 :goto_6

    :cond_7
    :goto_4
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_8

    const/4 v1, -0x1

    const-string v3, "com.stripe.android.financialconnections.features.common.NoSupportedPaymentMethodTypeAccountsErrorContent (ErrorContent.kt:143)"

    invoke-static {v0, p4, v1, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_8
    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;->getInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->getIcon()Lcom/stripe/android/financialconnections/model/Image;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/model/Image;->getDefault()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_a

    :cond_9
    const-string v0, ""

    :cond_a
    move-object v1, v0

    const/4 v0, 0x0

    sget v3, Lcom/stripe/android/financialconnections/R$string;->stripe_account_picker_error_no_payment_method_title:I

    const/4 v4, 0x0

    invoke-static {v3, p3, v4}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v3

    sget v5, Lcom/stripe/android/financialconnections/R$string;->stripe_account_picker_error_no_payment_method_desc:I

    const/4 v6, 0x3

    new-array v6, v6, [Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;->getAccountsCount()I

    move-result v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v4

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;->getInstitution()Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    move-result-object v7

    invoke-virtual {v7}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;->getName()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x1

    aput-object v7, v6, v8

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;->getMerchantName()Ljava/lang/String;

    move-result-object v7

    aput-object v7, v6, v2

    const/16 v2, 0x40

    invoke-static {v5, v6, p3, v2}, LfS5;->d(I[Ljava/lang/Object;LEt0;I)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lkotlin/Pair;

    sget v2, Lcom/stripe/android/financialconnections/R$string;->stripe_error_cta_select_another_bank:I

    invoke-static {v2, p3, v4}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v6, v2, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;->getAllowManualEntry()Z

    move-result v2

    if-eqz v2, :cond_b

    new-instance v2, Lkotlin/Pair;

    sget v7, Lcom/stripe/android/financialconnections/R$string;->stripe_error_cta_manual_entry:I

    invoke-static {v7, p3, v4}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v4, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_5

    :cond_b
    const/4 v2, 0x0

    :goto_5
    move-object v7, v2

    const/4 v8, 0x0

    const/4 v9, 0x2

    move-object v2, v0

    move-object v4, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, p3

    invoke-static/range {v1 .. v9}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt;->ErrorContent(Ljava/lang/String;Lkotlin/Pair;Ljava/lang/String;Ljava/lang/String;Lkotlin/Pair;Lkotlin/Pair;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-static {}, LQt0;->Y()V

    :cond_c
    :goto_6
    invoke-interface {p3}, LEt0;->w()LWm5;

    move-result-object p3

    if-nez p3, :cond_d

    goto :goto_7

    :cond_d
    new-instance v0, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$NoSupportedPaymentMethodTypeAccountsErrorContent$1;

    invoke-direct {v0, p0, p1, p2, p4}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$NoSupportedPaymentMethodTypeAccountsErrorContent$1;-><init>(Lcom/stripe/android/financialconnections/exception/AccountNoneEligibleForPaymentMethodError;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    invoke-interface {p3, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_7
    return-void
.end method

.method public static final UnclassifiedErrorContent(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;LEt0;I)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Throwable;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    const-string v0, "error"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onCloseFromErrorClick"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x471fbeca

    invoke-interface {p2, v0}, LEt0;->u(I)LEt0;

    move-result-object p2

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.common.UnclassifiedErrorContent (ErrorContent.kt:50)"

    invoke-static {v0, p3, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x0

    sget v0, Lcom/stripe/android/financialconnections/R$string;->stripe_error_generic_title:I

    const/4 v3, 0x0

    invoke-static {v0, p2, v3}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v0

    sget v4, Lcom/stripe/android/financialconnections/R$string;->stripe_error_generic_desc:I

    invoke-static {v4, p2, v3}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v4

    sget v5, Lcom/stripe/android/financialconnections/R$string;->stripe_error_cta_close:I

    invoke-static {v5, p2, v3}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$UnclassifiedErrorContent$1;

    invoke-direct {v5, p1, p0}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$UnclassifiedErrorContent$1;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V

    invoke-static {v3, v5}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v8, 0x6

    const/16 v9, 0x22

    move-object v3, v0

    move-object v7, p2

    invoke-static/range {v1 .. v9}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt;->ErrorContent(Ljava/lang/String;Lkotlin/Pair;Ljava/lang/String;Ljava/lang/String;Lkotlin/Pair;Lkotlin/Pair;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, LQt0;->Y()V

    :cond_1
    invoke-interface {p2}, LEt0;->w()LWm5;

    move-result-object p2

    if-nez p2, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$UnclassifiedErrorContent$2;

    invoke-direct {v0, p0, p1, p3}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$UnclassifiedErrorContent$2;-><init>(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;I)V

    invoke-interface {p2, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_0
    return-void
.end method

.method public static final UnclassifiedErrorContentPreview(LEt0;I)V
    .locals 4

    const v0, -0x4431edfb

    invoke-interface {p0, v0}, LEt0;->u(I)LEt0;

    move-result-object p0

    if-nez p1, :cond_1

    invoke-interface {p0}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p0}, LEt0;->k()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v2, "com.stripe.android.financialconnections.features.common.UnclassifiedErrorContentPreview (ErrorContent.kt:357)"

    invoke-static {v0, p1, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v0, Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ErrorContentKt;->INSTANCE:Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ErrorContentKt;

    invoke-virtual {v0}, Lcom/stripe/android/financialconnections/features/common/ComposableSingletons$ErrorContentKt;->getLambda-3$financial_connections_release()Lkotlin/jvm/functions/Function2;

    move-result-object v0

    const/16 v1, 0x30

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-static {v3, v0, p0, v1, v2}, Lcom/stripe/android/financialconnections/ui/CompositionLocalKt;->FinancialConnectionsPreview(ZLkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    invoke-interface {p0}, LEt0;->w()LWm5;

    move-result-object p0

    if-nez p0, :cond_4

    goto :goto_2

    :cond_4
    new-instance v0, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$UnclassifiedErrorContentPreview$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt$UnclassifiedErrorContentPreview$1;-><init>(I)V

    invoke-interface {p0, v0}, LWm5;->a(Lkotlin/jvm/functions/Function2;)V

    :goto_2
    return-void
.end method

.method public static final synthetic access$BadgedInstitutionImage(Ljava/lang/String;Lkotlin/Pair;LEt0;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/common/ErrorContentKt;->BadgedInstitutionImage(Ljava/lang/String;Lkotlin/Pair;LEt0;I)V

    return-void
.end method

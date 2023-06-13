.class final Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt;->SuccessContent(Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V
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

.field final synthetic $$dirty1:I

.field final synthetic $accessibleDataModel:Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;

.field final synthetic $accounts:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $businessName:Ljava/lang/String;

.field final synthetic $disconnectUrl:Ljava/lang/String;

.field final synthetic $institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

.field final synthetic $loading:Z

.field final synthetic $onDisconnectLinkClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onDoneClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onLearnMoreAboutDataAccessClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onLinkAnotherAccountClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $scrollState:LXp5;

.field final synthetic $showLinkAnotherAccount:Z

.field final synthetic $skipSuccessPane:Z


# direct methods
.method public constructor <init>(ZLXp5;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "LXp5;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/model/PartnerAccount;",
            ">;",
            "Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;",
            "Ljava/lang/String;",
            "Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;",
            "ZZ",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;II)V"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;->$skipSuccessPane:Z

    iput-object p2, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;->$scrollState:LXp5;

    iput-object p3, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;->$businessName:Ljava/lang/String;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;->$accounts:Ljava/util/List;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;->$accessibleDataModel:Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;

    iput-object p6, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;->$disconnectUrl:Ljava/lang/String;

    iput-object p7, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;->$institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    iput-boolean p8, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;->$loading:Z

    iput-boolean p9, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;->$showLinkAnotherAccount:Z

    iput-object p10, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;->$onLearnMoreAboutDataAccessClick:Lkotlin/jvm/functions/Function0;

    iput-object p11, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;->$onDisconnectLinkClick:Lkotlin/jvm/functions/Function0;

    iput-object p12, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;->$onLinkAnotherAccountClick:Lkotlin/jvm/functions/Function0;

    iput-object p13, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;->$onDoneClick:Lkotlin/jvm/functions/Function0;

    iput p14, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;->$$dirty:I

    iput p15, p0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;->$$dirty1:I

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

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;->invoke(LPD3;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LPD3;LEt0;I)V
    .locals 18

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

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.financialconnections.features.success.SuccessContent.<anonymous> (SuccessScreen.kt:94)"

    const v4, -0x279b0662

    invoke-static {v4, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-boolean v1, v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;->$skipSuccessPane:Z

    if-eqz v1, :cond_3

    const v1, -0x3faea1d1

    invoke-interface {v15, v1}, LEt0;->F(I)V

    const/4 v1, 0x0

    invoke-static {v15, v1}, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt;->access$SuccessLoading(LEt0;I)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    goto :goto_1

    :cond_3
    const v1, -0x3faea1a3

    invoke-interface {v15, v1}, LEt0;->F(I)V

    iget-object v1, v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;->$scrollState:LXp5;

    iget-object v2, v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;->$businessName:Ljava/lang/String;

    iget-object v3, v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;->$accounts:Ljava/util/List;

    iget-object v4, v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;->$accessibleDataModel:Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;

    iget-object v5, v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;->$disconnectUrl:Ljava/lang/String;

    iget-object v6, v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;->$institution:Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    iget-boolean v7, v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;->$loading:Z

    iget-boolean v8, v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;->$showLinkAnotherAccount:Z

    iget-object v9, v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;->$onLearnMoreAboutDataAccessClick:Lkotlin/jvm/functions/Function0;

    iget-object v10, v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;->$onDisconnectLinkClick:Lkotlin/jvm/functions/Function0;

    iget-object v11, v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;->$onLinkAnotherAccountClick:Lkotlin/jvm/functions/Function0;

    iget-object v12, v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;->$onDoneClick:Lkotlin/jvm/functions/Function0;

    iget v13, v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;->$$dirty:I

    shr-int/lit8 v14, v13, 0x9

    and-int/lit8 v14, v14, 0x70

    or-int/lit16 v14, v14, 0x1200

    const v16, 0xe000

    shl-int/lit8 v17, v13, 0x9

    and-int v16, v17, v16

    or-int v14, v14, v16

    shl-int/lit8 v16, v13, 0x6

    const/high16 v17, 0x70000

    and-int v16, v16, v17

    or-int v14, v14, v16

    shl-int/lit8 v16, v13, 0x3

    const/high16 v17, 0x380000

    and-int v16, v16, v17

    or-int v14, v14, v16

    const/high16 v16, 0x1c00000

    shr-int/lit8 v17, v13, 0x6

    and-int v16, v17, v16

    or-int v14, v14, v16

    iget v15, v0, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt$SuccessContent$2;->$$dirty1:I

    shl-int/lit8 v16, v15, 0x18

    const/high16 v17, 0xe000000

    and-int v16, v16, v17

    or-int v14, v14, v16

    const/high16 v16, 0x70000000

    shl-int/lit8 v15, v15, 0x18

    and-int v15, v15, v16

    or-int/2addr v14, v15

    shr-int/lit8 v15, v13, 0x18

    and-int/lit8 v15, v15, 0xe

    shr-int/lit8 v13, v13, 0x12

    and-int/lit8 v13, v13, 0x70

    or-int/2addr v15, v13

    move-object/from16 v13, p2

    invoke-static/range {v1 .. v15}, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt;->access$SuccessLoaded(LXp5;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V

    invoke-interface/range {p2 .. p2}, LEt0;->Q()V

    :goto_1
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    :goto_2
    return-void
.end method

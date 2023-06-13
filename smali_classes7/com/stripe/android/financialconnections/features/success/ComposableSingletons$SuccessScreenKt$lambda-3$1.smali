.class final Lcom/stripe/android/financialconnections/features/success/ComposableSingletons$SuccessScreenKt$lambda-3$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/features/success/ComposableSingletons$SuccessScreenKt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "invoke",
        "(LEt0;I)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final INSTANCE:Lcom/stripe/android/financialconnections/features/success/ComposableSingletons$SuccessScreenKt$lambda-3$1;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/financialconnections/features/success/ComposableSingletons$SuccessScreenKt$lambda-3$1;

    invoke-direct {v0}, Lcom/stripe/android/financialconnections/features/success/ComposableSingletons$SuccessScreenKt$lambda-3$1;-><init>()V

    sput-object v0, Lcom/stripe/android/financialconnections/features/success/ComposableSingletons$SuccessScreenKt$lambda-3$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/success/ComposableSingletons$SuccessScreenKt$lambda-3$1;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEt0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/features/success/ComposableSingletons$SuccessScreenKt$lambda-3$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 72

    move/from16 v0, p2

    and-int/lit8 v1, v0, 0xb

    const/4 v2, 0x2

    if-ne v1, v2, :cond_1

    invoke-interface/range {p1 .. p1}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LEt0;->k()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v1, -0x1

    const-string v3, "com.stripe.android.financialconnections.features.success.ComposableSingletons$SuccessScreenKt.lambda-3.<anonymous> (SuccessScreen.kt:270)"

    const v4, 0x49a38a3f

    invoke-static {v4, v0, v1, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    new-instance v0, Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;

    const-string v6, "My business"

    const/4 v1, 0x4

    new-array v1, v1, [Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->PAYMENT_METHOD:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    const/4 v4, 0x0

    aput-object v3, v1, v4

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->BALANCES:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    const/4 v11, 0x1

    aput-object v3, v1, v11

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->OWNERSHIP:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    aput-object v3, v1, v2

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->TRANSACTIONS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    const/4 v12, 0x3

    aput-object v3, v1, v12

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    const/4 v8, 0x1

    const/4 v9, 0x0

    const-string v10, ""

    move-object v5, v0

    invoke-direct/range {v5 .. v10}, Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;-><init>(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;)V

    const-string v6, ""

    new-array v1, v12, [Lcom/stripe/android/financialconnections/model/PartnerAccount;

    sget-object v14, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->CASH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    move-object/from16 v54, v14

    move-object/from16 v34, v14

    sget-object v17, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->SAVINGS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v18

    new-instance v3, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    move-object v12, v3

    const-string v13, "Authorization"

    const-string v15, "id2"

    const-string v16, "Account 2 - no acct numbers"

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    sget-object v24, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    move-object/from16 v64, v24

    move-object/from16 v44, v24

    const-string v25, ""

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const v30, 0x1e7c0

    const/16 v31, 0x0

    invoke-direct/range {v12 .. v31}, Lcom/stripe/android/financialconnections/model/PartnerAccount;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v3, v1, v4

    sget-object v37, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->CREDIT_CARD:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v38

    new-instance v3, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    move-object/from16 v32, v3

    const-string v33, "Authorization"

    const-string v35, "id3"

    const-string v36, "Account 3"

    const/16 v39, 0x0

    const/16 v40, 0x0

    const-string v41, "1234"

    const/16 v42, 0x0

    const/16 v43, 0x0

    const-string v45, ""

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const v50, 0x1e6c0

    const/16 v51, 0x0

    invoke-direct/range {v32 .. v51}, Lcom/stripe/android/financialconnections/model/PartnerAccount;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v3, v1, v11

    sget-object v57, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->CHECKING:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v58

    new-instance v3, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    move-object/from16 v52, v3

    const-string v53, "Authorization"

    const-string v55, "id4"

    const-string v56, "Account 4"

    const/16 v59, 0x0

    const/16 v60, 0x0

    const-string v61, "1234"

    const/16 v62, 0x0

    const/16 v63, 0x0

    const-string v65, ""

    const/16 v66, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    const/16 v69, 0x0

    const v70, 0x1e6c0

    const/16 v71, 0x0

    invoke-direct/range {v52 .. v71}, Lcom/stripe/android/financialconnections/model/PartnerAccount;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    aput-object v3, v1, v2

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    new-instance v1, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;

    const/4 v9, 0x1

    const-string v10, "id"

    const/4 v11, 0x0

    const-string v12, "name"

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-string v16, "url"

    move-object v8, v1

    invoke-direct/range {v8 .. v16}, Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;-><init>(ZLjava/lang/String;ZLjava/lang/String;Lcom/stripe/android/financialconnections/model/Image;Lcom/stripe/android/financialconnections/model/Image;Ljava/lang/Integer;Ljava/lang/String;)V

    const-string v9, "Random business"

    const/4 v10, 0x0

    sget-object v12, Lcom/stripe/android/financialconnections/features/success/ComposableSingletons$SuccessScreenKt$lambda-3$1$1;->INSTANCE:Lcom/stripe/android/financialconnections/features/success/ComposableSingletons$SuccessScreenKt$lambda-3$1$1;

    sget-object v13, Lcom/stripe/android/financialconnections/features/success/ComposableSingletons$SuccessScreenKt$lambda-3$1$2;->INSTANCE:Lcom/stripe/android/financialconnections/features/success/ComposableSingletons$SuccessScreenKt$lambda-3$1$2;

    const/4 v14, 0x1

    sget-object v15, Lcom/stripe/android/financialconnections/features/success/ComposableSingletons$SuccessScreenKt$lambda-3$1$3;->INSTANCE:Lcom/stripe/android/financialconnections/features/success/ComposableSingletons$SuccessScreenKt$lambda-3$1$3;

    sget-object v16, Lcom/stripe/android/financialconnections/features/success/ComposableSingletons$SuccessScreenKt$lambda-3$1$4;->INSTANCE:Lcom/stripe/android/financialconnections/features/success/ComposableSingletons$SuccessScreenKt$lambda-3$1$4;

    sget-object v17, Lcom/stripe/android/financialconnections/features/success/ComposableSingletons$SuccessScreenKt$lambda-3$1$5;->INSTANCE:Lcom/stripe/android/financialconnections/features/success/ComposableSingletons$SuccessScreenKt$lambda-3$1$5;

    const v19, 0x36db6238

    const/16 v20, 0x1b6

    move-object/from16 v18, p1

    invoke-static/range {v5 .. v20}, Lcom/stripe/android/financialconnections/features/success/SuccessScreenKt;->access$SuccessContent(Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/financialconnections/model/FinancialConnectionsInstitution;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    return-void
.end method

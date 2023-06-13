.class public final Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerStates$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerStates;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0008\u0010\u0003\u001a\u00020\u0004H\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0002J\u0006\u0010\n\u001a\u00020\u0006J\u0006\u0010\u000b\u001a\u00020\u0006\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerStates$Companion;",
        "",
        "()V",
        "accessibleCallout",
        "Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;",
        "multiSelect",
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;",
        "partnerAccountList",
        "",
        "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;",
        "singleSelect",
        "singleSelectWithConfirm",
        "financial-connections_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerStates$Companion;-><init>()V

    return-void
.end method

.method private final accessibleCallout()Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;
    .locals 7

    new-instance v6, Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;

    const-string v1, "My business"

    const/4 v0, 0x4

    new-array v0, v0, [Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    const/4 v2, 0x0

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->PAYMENT_METHOD:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    aput-object v3, v0, v2

    const/4 v2, 0x1

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->BALANCES:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    aput-object v3, v0, v2

    const/4 v2, 0x2

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->OWNERSHIP:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    aput-object v3, v0, v2

    const/4 v2, 0x3

    sget-object v3, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;->TRANSACTIONS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Permissions;

    aput-object v3, v0, v2

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, ""

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;-><init>(Ljava/lang/String;Ljava/util/List;ZZLjava/lang/String;)V

    return-object v6
.end method

.method private final partnerAccountList()Ljava/util/List;
    .locals 103
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x5

    new-array v0, v0, [Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;

    new-instance v1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;

    sget-object v4, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;->CASH:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;

    move-object/from16 v84, v4

    move-object/from16 v64, v4

    move-object/from16 v44, v4

    move-object/from16 v24, v4

    sget-object v7, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->CHECKING:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    move-object/from16 v87, v7

    move-object/from16 v67, v7

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v8

    new-instance v15, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    move-object v2, v15

    const-string v3, "Authorization"

    const-string v5, "id1"

    const-string v6, "With balance"

    const/16 v9, 0x3e8

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    move-object/from16 v29, v9

    const-string v10, "$"

    const-string v11, "1234"

    const/4 v12, 0x0

    const/4 v13, 0x0

    sget-object v14, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    move-object/from16 v94, v14

    move-object/from16 v34, v14

    const-string v16, ""

    move-object/from16 v102, v15

    move-object/from16 v15, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const v20, 0x1e600

    const/16 v21, 0x0

    invoke-direct/range {v2 .. v21}, Lcom/stripe/android/financialconnections/model/PartnerAccount;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v2, 0x0

    const-string v3, "$1,000"

    move-object/from16 v4, v102

    invoke-direct {v1, v4, v2, v3}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;-><init>(Lcom/stripe/android/financialconnections/model/PartnerAccount;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v4, 0x0

    aput-object v1, v0, v4

    new-instance v1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;

    sget-object v27, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->SAVINGS:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v28

    new-instance v4, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    move-object/from16 v22, v4

    const-string v23, "Authorization"

    const-string v25, "id2"

    const-string v26, "With balance disabled"

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const-string v35, ""

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const v40, 0x1e780

    const/16 v41, 0x0

    invoke-direct/range {v22 .. v41}, Lcom/stripe/android/financialconnections/model/PartnerAccount;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v1, v4, v2, v3}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;-><init>(Lcom/stripe/android/financialconnections/model/PartnerAccount;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x1

    aput-object v1, v0, v3

    new-instance v1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;

    sget-object v47, Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;->CREDIT_CARD:Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v48

    new-instance v3, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    move-object/from16 v42, v3

    const-string v43, "Authorization"

    const-string v45, "id3"

    const-string v46, "No balance"

    const/16 v49, 0x0

    const/16 v50, 0x0

    const-string v51, "1234"

    const/16 v52, 0x0

    const/16 v53, 0x0

    sget-object v54, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    move-object/from16 v74, v54

    const-string v55, "Cannot be selected"

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const v60, 0x1e6c0

    const/16 v61, 0x0

    invoke-direct/range {v42 .. v61}, Lcom/stripe/android/financialconnections/model/PartnerAccount;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v1, v3, v2, v2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;-><init>(Lcom/stripe/android/financialconnections/model/PartnerAccount;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x2

    aput-object v1, v0, v3

    new-instance v1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v68

    new-instance v3, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    move-object/from16 v62, v3

    const-string v63, "Authorization"

    const-string v65, "id4"

    const-string v66, "No balance disabled"

    const/16 v69, 0x0

    const/16 v70, 0x0

    const-string v71, "1234"

    const/16 v72, 0x0

    const/16 v73, 0x0

    const-string v75, "Cannot be selected"

    const/16 v76, 0x0

    const/16 v77, 0x0

    const/16 v78, 0x0

    const/16 v79, 0x0

    const v80, 0x1e6c0

    const/16 v81, 0x0

    invoke-direct/range {v62 .. v81}, Lcom/stripe/android/financialconnections/model/PartnerAccount;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v1, v3, v2, v2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;-><init>(Lcom/stripe/android/financialconnections/model/PartnerAccount;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x3

    aput-object v1, v0, v3

    new-instance v1, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v88

    new-instance v3, Lcom/stripe/android/financialconnections/model/PartnerAccount;

    move-object/from16 v82, v3

    const-string v83, "Authorization"

    const-string v85, "id5"

    const-string v86, "Very long institution that is already linked"

    const/16 v89, 0x0

    const/16 v90, 0x0

    const-string v91, "1234"

    const/16 v92, 0x0

    const/16 v93, 0x0

    const/16 v95, 0x0

    const/16 v96, 0x0

    const-string v97, "linkedAccountId"

    const/16 v98, 0x0

    const/16 v99, 0x0

    const v100, 0x1b6c0

    const/16 v101, 0x0

    invoke-direct/range {v82 .. v101}, Lcom/stripe/android/financialconnections/model/PartnerAccount;-><init>(Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Category;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Subcategory;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/financialconnections/model/FinancialConnectionsAccount$Status;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v1, v3, v2, v2}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$PartnerAccountUI;-><init>(Lcom/stripe/android/financialconnections/model/PartnerAccount;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x4

    aput-object v1, v0, v2

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final multiSelect()Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;
    .locals 18

    new-instance v7, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    new-instance v1, LwT5;

    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;

    const/4 v9, 0x0

    invoke-direct/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerStates$Companion;->partnerAccountList()Ljava/util/List;

    move-result-object v10

    sget-object v11, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;->CHECKBOXES:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;

    invoke-direct/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerStates$Companion;->accessibleCallout()Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;

    move-result-object v12

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-string v15, "Random business"

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v8, v0

    invoke-direct/range {v8 .. v17}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;-><init>(ZLjava/util/List;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;ZZLjava/lang/String;ZZ)V

    invoke-direct {v1, v0}, LwT5;-><init>(Ljava/lang/Object;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v0, "id1"

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;-><init>(Ldp;ZLdp;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7
.end method

.method public final singleSelect()Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;
    .locals 18

    new-instance v7, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    new-instance v1, LwT5;

    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;

    const/4 v9, 0x0

    invoke-direct/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerStates$Companion;->partnerAccountList()Ljava/util/List;

    move-result-object v10

    sget-object v11, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;->RADIO:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;

    invoke-direct/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerStates$Companion;->accessibleCallout()Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;

    move-result-object v12

    const/4 v13, 0x1

    const/4 v14, 0x0

    const-string v15, "Random business"

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v8, v0

    invoke-direct/range {v8 .. v17}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;-><init>(ZLjava/util/List;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;ZZLjava/lang/String;ZZ)V

    invoke-direct {v1, v0}, LwT5;-><init>(Ljava/lang/Object;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v0, "id1"

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;-><init>(Ldp;ZLdp;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7
.end method

.method public final singleSelectWithConfirm()Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;
    .locals 18

    new-instance v7, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;

    new-instance v1, LwT5;

    new-instance v0, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;

    const/4 v9, 0x0

    invoke-direct/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerStates$Companion;->partnerAccountList()Ljava/util/List;

    move-result-object v10

    sget-object v11, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;->RADIO:Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;

    invoke-direct/range {p0 .. p0}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerStates$Companion;->accessibleCallout()Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;

    move-result-object v12

    const/4 v13, 0x1

    const/4 v14, 0x0

    const-string v15, "Random business"

    const/16 v16, 0x0

    const/16 v17, 0x1

    move-object v8, v0

    invoke-direct/range {v8 .. v17}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$Payload;-><init>(ZLjava/util/List;Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState$SelectionMode;Lcom/stripe/android/financialconnections/features/common/AccessibleDataCalloutModel;ZZLjava/lang/String;ZZ)V

    invoke-direct {v1, v0}, LwT5;-><init>(Ljava/lang/Object;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-string v0, "id1"

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lcom/stripe/android/financialconnections/features/accountpicker/AccountPickerState;-><init>(Ldp;ZLdp;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v7
.end method

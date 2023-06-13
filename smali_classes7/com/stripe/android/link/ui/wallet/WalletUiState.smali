.class public final Lcom/stripe/android/link/ui/wallet/WalletUiState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0080\u0008\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\n\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0010\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0002\u0010\u0014J\u000f\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000f\u00102\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u00104\u001a\u00020\nH\u00c6\u0003J\t\u00105\u001a\u00020\nH\u00c6\u0003J\t\u00106\u001a\u00020\nH\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\t\u00108\u001a\u00020\u0010H\u00c6\u0003J\t\u00109\u001a\u00020\u0010H\u00c6\u0003J\u008b\u0001\u0010:\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001J\u0013\u0010;\u001a\u00020\n2\u0008\u0010<\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0018\u0010=\u001a\u0004\u0018\u00010\u00072\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0002J\t\u0010>\u001a\u00020?H\u00d6\u0001J\u0006\u0010@\u001a\u00020\u0000J\t\u0010A\u001a\u00020\u0004H\u00d6\u0001J\u000e\u0010B\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020EJ\u0018\u0010F\u001a\u00020\u00002\u0006\u0010G\u001a\u00020H2\u0008\u0010I\u001a\u0004\u0018\u00010\u0004J\u000e\u0010J\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\u0007R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0018R\u0011\u0010\u000c\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u001cR\u0017\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0011\u0010!\u001a\u00020\"8F\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010$R\u0013\u0010%\u001a\u0004\u0018\u00010&8F\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010(R\u0013\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010*R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010,R\u0018\u0010-\u001a\u00020\n*\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008-\u0010.\u00a8\u0006L"
    }
    d2 = {
        "Lcom/stripe/android/link/ui/wallet/WalletUiState;",
        "",
        "supportedTypes",
        "",
        "",
        "paymentDetailsList",
        "",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
        "selectedItem",
        "isExpanded",
        "",
        "isProcessing",
        "hasCompleted",
        "errorMessage",
        "Lcom/stripe/android/link/ui/ErrorMessage;",
        "expiryDateInput",
        "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "cvcInput",
        "alertMessage",
        "paymentMethodIdBeingUpdated",
        "(Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZZZLcom/stripe/android/link/ui/ErrorMessage;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/ErrorMessage;Ljava/lang/String;)V",
        "getAlertMessage",
        "()Lcom/stripe/android/link/ui/ErrorMessage;",
        "getCvcInput",
        "()Lcom/stripe/android/uicore/forms/FormFieldEntry;",
        "getErrorMessage",
        "getExpiryDateInput",
        "getHasCompleted",
        "()Z",
        "getPaymentDetailsList",
        "()Ljava/util/List;",
        "getPaymentMethodIdBeingUpdated",
        "()Ljava/lang/String;",
        "primaryButtonState",
        "Lcom/stripe/android/link/ui/PrimaryButtonState;",
        "getPrimaryButtonState",
        "()Lcom/stripe/android/link/ui/PrimaryButtonState;",
        "selectedCard",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$Card;",
        "getSelectedCard",
        "()Lcom/stripe/android/model/ConsumerPaymentDetails$Card;",
        "getSelectedItem",
        "()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
        "getSupportedTypes",
        "()Ljava/util/Set;",
        "isValid",
        "(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)Z",
        "component1",
        "component10",
        "component11",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
        "other",
        "getDefaultItemSelection",
        "hashCode",
        "",
        "setProcessing",
        "toString",
        "updateWithError",
        "updateWithPaymentResult",
        "paymentResult",
        "Lcom/stripe/android/payments/paymentlauncher/PaymentResult;",
        "updateWithResponse",
        "response",
        "Lcom/stripe/android/model/ConsumerPaymentDetails;",
        "initialSelectedItemId",
        "updateWithSetDefaultResult",
        "updatedPaymentMethod",
        "link_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWalletUiState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletUiState.kt\ncom/stripe/android/link/ui/wallet/WalletUiState\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n288#2,2:132\n1549#2:134\n1620#2,3:135\n288#2,2:138\n766#2:140\n857#2,2:141\n288#2,2:143\n*S KotlinDebug\n*F\n+ 1 WalletUiState.kt\ncom/stripe/android/link/ui/wallet/WalletUiState\n*L\n59#1:132,2\n75#1:134\n75#1:135,3\n86#1:138,2\n124#1:140\n124#1:141,2\n125#1:143,2\n*E\n"
    }
.end annotation


# instance fields
.field private final alertMessage:Lcom/stripe/android/link/ui/ErrorMessage;

.field private final cvcInput:Lcom/stripe/android/uicore/forms/FormFieldEntry;

.field private final errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

.field private final expiryDateInput:Lcom/stripe/android/uicore/forms/FormFieldEntry;

.field private final hasCompleted:Z

.field private final isExpanded:Z

.field private final isProcessing:Z

.field private final paymentDetailsList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentMethodIdBeingUpdated:Ljava/lang/String;

.field private final selectedItem:Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

.field private final supportedTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZZZLcom/stripe/android/link/ui/ErrorMessage;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/ErrorMessage;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            ">;",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "ZZZ",
            "Lcom/stripe/android/link/ui/ErrorMessage;",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            "Lcom/stripe/android/link/ui/ErrorMessage;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "supportedTypes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentDetailsList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expiryDateInput"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cvcInput"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->supportedTypes:Ljava/util/Set;

    iput-object p2, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->paymentDetailsList:Ljava/util/List;

    iput-object p3, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->selectedItem:Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    iput-boolean p4, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->isExpanded:Z

    iput-boolean p5, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->isProcessing:Z

    iput-boolean p6, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->hasCompleted:Z

    iput-object p7, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    iput-object p8, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->expiryDateInput:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    iput-object p9, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->cvcInput:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    iput-object p10, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->alertMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    iput-object p11, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->paymentMethodIdBeingUpdated:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZZZLcom/stripe/android/link/ui/ErrorMessage;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/ErrorMessage;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    move-object v2, v3

    goto :goto_1

    :cond_1
    move-object v2, p3

    :goto_1
    and-int/lit8 v4, v0, 0x8

    const/4 v5, 0x0

    if-eqz v4, :cond_2

    move v4, v5

    goto :goto_2

    :cond_2
    move/from16 v4, p4

    :goto_2
    and-int/lit8 v6, v0, 0x10

    if-eqz v6, :cond_3

    move v6, v5

    goto :goto_3

    :cond_3
    move/from16 v6, p5

    :goto_3
    and-int/lit8 v7, v0, 0x20

    if-eqz v7, :cond_4

    move v7, v5

    goto :goto_4

    :cond_4
    move/from16 v7, p6

    :goto_4
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_5

    move-object v8, v3

    goto :goto_5

    :cond_5
    move-object/from16 v8, p7

    :goto_5
    and-int/lit16 v9, v0, 0x80

    const/4 v10, 0x2

    if-eqz v9, :cond_6

    new-instance v9, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-direct {v9, v3, v5, v10, v3}, Lcom/stripe/android/uicore/forms/FormFieldEntry;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_6

    :cond_6
    move-object/from16 v9, p8

    :goto_6
    and-int/lit16 v11, v0, 0x100

    if-eqz v11, :cond_7

    new-instance v11, Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-direct {v11, v3, v5, v10, v3}, Lcom/stripe/android/uicore/forms/FormFieldEntry;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_7

    :cond_7
    move-object/from16 v11, p9

    :goto_7
    and-int/lit16 v5, v0, 0x200

    if-eqz v5, :cond_8

    move-object v5, v3

    goto :goto_8

    :cond_8
    move-object/from16 v5, p10

    :goto_8
    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_9

    goto :goto_9

    :cond_9
    move-object/from16 v3, p11

    :goto_9
    move-object p2, p0

    move-object p3, p1

    move-object/from16 p4, v1

    move-object/from16 p5, v2

    move/from16 p6, v4

    move/from16 p7, v6

    move/from16 p8, v7

    move-object/from16 p9, v8

    move-object/from16 p10, v9

    move-object/from16 p11, v11

    move-object/from16 p12, v5

    move-object/from16 p13, v3

    invoke-direct/range {p2 .. p13}, Lcom/stripe/android/link/ui/wallet/WalletUiState;-><init>(Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZZZLcom/stripe/android/link/ui/ErrorMessage;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/ErrorMessage;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZZZLcom/stripe/android/link/ui/ErrorMessage;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/ErrorMessage;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/WalletUiState;
    .locals 12

    move-object v0, p0

    move/from16 v1, p12

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->supportedTypes:Ljava/util/Set;

    goto :goto_0

    :cond_0
    move-object v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->paymentDetailsList:Ljava/util/List;

    goto :goto_1

    :cond_1
    move-object v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->selectedItem:Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    goto :goto_2

    :cond_2
    move-object v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-boolean v5, v0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->isExpanded:Z

    goto :goto_3

    :cond_3
    move/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-boolean v6, v0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->isProcessing:Z

    goto :goto_4

    :cond_4
    move/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-boolean v7, v0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->hasCompleted:Z

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->expiryDateInput:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->cvcInput:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->alertMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v1, v1, 0x400

    if-eqz v1, :cond_a

    iget-object v1, v0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->paymentMethodIdBeingUpdated:Ljava/lang/String;

    goto :goto_a

    :cond_a
    move-object/from16 v1, p11

    :goto_a
    move-object p1, v2

    move-object p2, v3

    move-object p3, v4

    move/from16 p4, v5

    move/from16 p5, v6

    move/from16 p6, v7

    move-object/from16 p7, v8

    move-object/from16 p8, v9

    move-object/from16 p9, v10

    move-object/from16 p10, v11

    move-object/from16 p11, v1

    invoke-virtual/range {p0 .. p11}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->copy(Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZZZLcom/stripe/android/link/ui/ErrorMessage;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/ErrorMessage;Ljava/lang/String;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v0

    return-object v0
.end method

.method private final getDefaultItemSelection(Ljava/util/List;)Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            ">;)",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    iget-object v3, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->supportedTypes:Ljava/util/Set;

    invoke-virtual {v2}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getType()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    invoke-virtual {v2}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->isDefault()Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_3
    const/4 v1, 0x0

    :goto_1
    check-cast v1, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    if-nez v1, :cond_4

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    :cond_4
    return-object v1
.end method

.method private final isValid(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)Z
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->supportedTypes:Ljava/util/Set;

    invoke-virtual {p1}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getType()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method


# virtual methods
.method public final component1()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->supportedTypes:Ljava/util/Set;

    return-object v0
.end method

.method public final component10()Lcom/stripe/android/link/ui/ErrorMessage;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->alertMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    return-object v0
.end method

.method public final component11()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->paymentMethodIdBeingUpdated:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->paymentDetailsList:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->selectedItem:Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    return-object v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->isExpanded:Z

    return v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->isProcessing:Z

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->hasCompleted:Z

    return v0
.end method

.method public final component7()Lcom/stripe/android/link/ui/ErrorMessage;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    return-object v0
.end method

.method public final component8()Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->expiryDateInput:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    return-object v0
.end method

.method public final component9()Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->cvcInput:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    return-object v0
.end method

.method public final copy(Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZZZLcom/stripe/android/link/ui/ErrorMessage;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/ErrorMessage;Ljava/lang/String;)Lcom/stripe/android/link/ui/wallet/WalletUiState;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            ">;",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "ZZZ",
            "Lcom/stripe/android/link/ui/ErrorMessage;",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            "Lcom/stripe/android/uicore/forms/FormFieldEntry;",
            "Lcom/stripe/android/link/ui/ErrorMessage;",
            "Ljava/lang/String;",
            ")",
            "Lcom/stripe/android/link/ui/wallet/WalletUiState;"
        }
    .end annotation

    const-string v0, "supportedTypes"

    move-object v2, p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentDetailsList"

    move-object v3, p2

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expiryDateInput"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cvcInput"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-object v1, v0

    move-object/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    invoke-direct/range {v1 .. v12}, Lcom/stripe/android/link/ui/wallet/WalletUiState;-><init>(Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZZZLcom/stripe/android/link/ui/ErrorMessage;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/ErrorMessage;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/stripe/android/link/ui/wallet/WalletUiState;

    iget-object v1, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->supportedTypes:Ljava/util/Set;

    iget-object v3, p1, Lcom/stripe/android/link/ui/wallet/WalletUiState;->supportedTypes:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->paymentDetailsList:Ljava/util/List;

    iget-object v3, p1, Lcom/stripe/android/link/ui/wallet/WalletUiState;->paymentDetailsList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->selectedItem:Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    iget-object v3, p1, Lcom/stripe/android/link/ui/wallet/WalletUiState;->selectedItem:Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->isExpanded:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/ui/wallet/WalletUiState;->isExpanded:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->isProcessing:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/ui/wallet/WalletUiState;->isProcessing:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->hasCompleted:Z

    iget-boolean v3, p1, Lcom/stripe/android/link/ui/wallet/WalletUiState;->hasCompleted:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    iget-object v3, p1, Lcom/stripe/android/link/ui/wallet/WalletUiState;->errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->expiryDateInput:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    iget-object v3, p1, Lcom/stripe/android/link/ui/wallet/WalletUiState;->expiryDateInput:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->cvcInput:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    iget-object v3, p1, Lcom/stripe/android/link/ui/wallet/WalletUiState;->cvcInput:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->alertMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    iget-object v3, p1, Lcom/stripe/android/link/ui/wallet/WalletUiState;->alertMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->paymentMethodIdBeingUpdated:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/link/ui/wallet/WalletUiState;->paymentMethodIdBeingUpdated:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    return v2

    :cond_c
    return v0
.end method

.method public final getAlertMessage()Lcom/stripe/android/link/ui/ErrorMessage;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->alertMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    return-object v0
.end method

.method public final getCvcInput()Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->cvcInput:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    return-object v0
.end method

.method public final getErrorMessage()Lcom/stripe/android/link/ui/ErrorMessage;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    return-object v0
.end method

.method public final getExpiryDateInput()Lcom/stripe/android/uicore/forms/FormFieldEntry;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->expiryDateInput:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    return-object v0
.end method

.method public final getHasCompleted()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->hasCompleted:Z

    return v0
.end method

.method public final getPaymentDetailsList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->paymentDetailsList:Ljava/util/List;

    return-object v0
.end method

.method public final getPaymentMethodIdBeingUpdated()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->paymentMethodIdBeingUpdated:Ljava/lang/String;

    return-object v0
.end method

.method public final getPrimaryButtonState()Lcom/stripe/android/link/ui/PrimaryButtonState;
    .locals 7

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->selectedItem:Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    instance-of v1, v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->isExpired()Z

    move-result v2

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->getCvcCheck()Lcom/stripe/android/model/CvcCheck;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/stripe/android/model/CvcCheck;->getRequiresRecollection()Z

    move-result v0

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    iget-object v3, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->expiryDateInput:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-virtual {v3}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->isComplete()Z

    move-result v3

    const/4 v4, 0x1

    if-eqz v3, :cond_4

    iget-object v3, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->cvcInput:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-virtual {v3}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->isComplete()Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_3

    :cond_3
    move v3, v1

    goto :goto_4

    :cond_4
    :goto_3
    move v3, v4

    :goto_4
    iget-object v5, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->cvcInput:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-virtual {v5}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->isComplete()Z

    move-result v5

    xor-int/2addr v5, v4

    iget-object v6, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->selectedItem:Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    if-eqz v6, :cond_5

    invoke-direct {p0, v6}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->isValid(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)Z

    move-result v6

    goto :goto_5

    :cond_5
    move v6, v1

    :goto_5
    if-eqz v6, :cond_7

    if-eqz v2, :cond_6

    if-nez v3, :cond_7

    :cond_6
    if-eqz v0, :cond_8

    if-eqz v5, :cond_8

    :cond_7
    move v1, v4

    :cond_8
    iget-boolean v0, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->hasCompleted:Z

    if-eqz v0, :cond_9

    sget-object v0, Lcom/stripe/android/link/ui/PrimaryButtonState;->Completed:Lcom/stripe/android/link/ui/PrimaryButtonState;

    goto :goto_6

    :cond_9
    iget-boolean v0, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->isProcessing:Z

    if-eqz v0, :cond_a

    sget-object v0, Lcom/stripe/android/link/ui/PrimaryButtonState;->Processing:Lcom/stripe/android/link/ui/PrimaryButtonState;

    goto :goto_6

    :cond_a
    if-eqz v1, :cond_b

    sget-object v0, Lcom/stripe/android/link/ui/PrimaryButtonState;->Disabled:Lcom/stripe/android/link/ui/PrimaryButtonState;

    goto :goto_6

    :cond_b
    sget-object v0, Lcom/stripe/android/link/ui/PrimaryButtonState;->Enabled:Lcom/stripe/android/link/ui/PrimaryButtonState;

    :goto_6
    return-object v0
.end method

.method public final getSelectedCard()Lcom/stripe/android/model/ConsumerPaymentDetails$Card;
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->selectedItem:Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    instance-of v1, v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public final getSelectedItem()Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->selectedItem:Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    return-object v0
.end method

.method public final getSupportedTypes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->supportedTypes:Ljava/util/Set;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->supportedTypes:Ljava/util/Set;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->paymentDetailsList:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->selectedItem:Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->isExpanded:Z

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    move v1, v3

    :cond_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->isProcessing:Z

    if-eqz v1, :cond_2

    move v1, v3

    :cond_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->hasCompleted:Z

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    move v3, v1

    :goto_1
    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_2

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->expiryDateInput:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->cvcInput:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    invoke-virtual {v1}, Lcom/stripe/android/uicore/forms/FormFieldEntry;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->alertMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_3

    :cond_5
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->paymentMethodIdBeingUpdated:Ljava/lang/String;

    if-nez v1, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    return v0
.end method

.method public final isExpanded()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->isExpanded:Z

    return v0
.end method

.method public final isProcessing()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->isProcessing:Z

    return v0
.end method

.method public final setProcessing()Lcom/stripe/android/link/ui/wallet/WalletUiState;
    .locals 14

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x7af

    const/4 v13, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v13}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->copy$default(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZZZLcom/stripe/android/link/ui/ErrorMessage;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/ErrorMessage;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->supportedTypes:Ljava/util/Set;

    iget-object v1, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->paymentDetailsList:Ljava/util/List;

    iget-object v2, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->selectedItem:Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    iget-boolean v3, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->isExpanded:Z

    iget-boolean v4, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->isProcessing:Z

    iget-boolean v5, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->hasCompleted:Z

    iget-object v6, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    iget-object v7, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->expiryDateInput:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    iget-object v8, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->cvcInput:Lcom/stripe/android/uicore/forms/FormFieldEntry;

    iget-object v9, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->alertMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    iget-object v10, p0, Lcom/stripe/android/link/ui/wallet/WalletUiState;->paymentMethodIdBeingUpdated:Ljava/lang/String;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    const-string v12, "WalletUiState(supportedTypes="

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", paymentDetailsList="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", selectedItem="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isExpanded="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", isProcessing="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", hasCompleted="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v5}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", errorMessage="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", expiryDateInput="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", cvcInput="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", alertMessage="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", paymentMethodIdBeingUpdated="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final updateWithError(Lcom/stripe/android/link/ui/ErrorMessage;)Lcom/stripe/android/link/ui/wallet/WalletUiState;
    .locals 15

    const-string v0, "errorMessage"

    move-object/from16 v8, p1

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0x7af

    const/4 v14, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v14}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->copy$default(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZZZLcom/stripe/android/link/ui/ErrorMessage;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/ErrorMessage;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v0

    return-object v0
.end method

.method public final updateWithPaymentResult(Lcom/stripe/android/payments/paymentlauncher/PaymentResult;)Lcom/stripe/android/link/ui/wallet/WalletUiState;
    .locals 16

    move-object/from16 v0, p1

    const-string v1, "paymentResult"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v8, v0, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Completed;

    instance-of v1, v0, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/stripe/android/payments/paymentlauncher/PaymentResult$Failed;->getThrowable()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/stripe/android/link/ui/ErrorMessageKt;->getErrorMessage(Ljava/lang/Throwable;)Lcom/stripe/android/link/ui/ErrorMessage;

    move-result-object v0

    move-object v9, v0

    goto :goto_1

    :cond_1
    move-object v9, v2

    :goto_1
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v14, 0x78f

    const/4 v15, 0x0

    move-object/from16 v2, p0

    invoke-static/range {v2 .. v15}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->copy$default(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZZZLcom/stripe/android/link/ui/ErrorMessage;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/ErrorMessage;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v0

    return-object v0
.end method

.method public final updateWithResponse(Lcom/stripe/android/model/ConsumerPaymentDetails;Ljava/lang/String;)Lcom/stripe/android/link/ui/wallet/WalletUiState;
    .locals 16

    move-object/from16 v14, p0

    const-string v0, "response"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-nez p2, :cond_1

    iget-object v2, v14, Lcom/stripe/android/link/ui/wallet/WalletUiState;->selectedItem:Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v0

    goto :goto_0

    :cond_1
    move-object/from16 v2, p2

    :goto_0
    if-eqz v2, :cond_4

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/model/ConsumerPaymentDetails;->getPaymentDetails()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    invoke-virtual {v5}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    move-object v0, v4

    :cond_3
    check-cast v0, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    if-nez v0, :cond_5

    :cond_4
    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/model/ConsumerPaymentDetails;->getPaymentDetails()Ljava/util/List;

    move-result-object v0

    invoke-direct {v14, v0}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->getDefaultItemSelection(Ljava/util/List;)Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    move-result-object v0

    :cond_5
    move-object v3, v0

    if-eqz v3, :cond_6

    invoke-direct {v14, v3}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->isValid(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)Z

    move-result v0

    goto :goto_1

    :cond_6
    const/4 v0, 0x0

    :goto_1
    const/4 v2, 0x0

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/model/ConsumerPaymentDetails;->getPaymentDetails()Ljava/util/List;

    move-result-object v4

    if-eqz v0, :cond_7

    iget-boolean v0, v14, Lcom/stripe/android/link/ui/wallet/WalletUiState;->isExpanded:Z

    goto :goto_2

    :cond_7
    const/4 v0, 0x1

    :goto_2
    move v5, v0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/16 v13, 0x7e1

    const/4 v15, 0x0

    move-object/from16 v0, p0

    move-object v1, v2

    move-object v2, v4

    move v4, v5

    move v5, v6

    move v6, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v10

    move-object v10, v11

    move-object v11, v12

    move v12, v13

    move-object v13, v15

    invoke-static/range {v0 .. v13}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->copy$default(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZZZLcom/stripe/android/link/ui/ErrorMessage;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/ErrorMessage;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v0

    return-object v0
.end method

.method public final updateWithSetDefaultResult(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)Lcom/stripe/android/link/ui/wallet/WalletUiState;
    .locals 26

    move-object/from16 v14, p0

    const-string v0, "updatedPaymentMethod"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v14, Lcom/stripe/android/link/ui/wallet/WalletUiState;->paymentDetailsList:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    invoke-virtual {v3}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move-object v3, v1

    goto :goto_1

    :cond_0
    instance-of v4, v3, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;

    if-eqz v4, :cond_1

    move-object v5, v3

    check-cast v5, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x1d

    const/4 v12, 0x0

    invoke-static/range {v5 .. v12}, Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;->copy$default(Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/model/ConsumerPaymentDetails$BankAccount;

    move-result-object v3

    goto :goto_1

    :cond_1
    instance-of v4, v3, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    if-eqz v4, :cond_2

    move-object v15, v3

    check-cast v15, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0xfd

    const/16 v25, 0x0

    invoke-static/range {v15 .. v25}, Lcom/stripe/android/model/ConsumerPaymentDetails$Card;->copy$default(Lcom/stripe/android/model/ConsumerPaymentDetails$Card;Ljava/lang/String;ZIILcom/stripe/android/model/CardBrand;Ljava/lang/String;Lcom/stripe/android/model/CvcCheck;Lcom/stripe/android/model/ConsumerPaymentDetails$BillingAddress;ILjava/lang/Object;)Lcom/stripe/android/model/ConsumerPaymentDetails$Card;

    move-result-object v3

    :goto_1
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_3
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    invoke-virtual {v4}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v4

    iget-object v5, v14, Lcom/stripe/android/link/ui/wallet/WalletUiState;->selectedItem:Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    if-eqz v5, :cond_5

    invoke-virtual {v5}, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->getId()Ljava/lang/String;

    move-result-object v3

    :cond_5
    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    move-object v3, v1

    :cond_6
    check-cast v3, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    const/4 v1, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x3f9

    const/4 v13, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v13}, Lcom/stripe/android/link/ui/wallet/WalletUiState;->copy$default(Lcom/stripe/android/link/ui/wallet/WalletUiState;Ljava/util/Set;Ljava/util/List;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;ZZZLcom/stripe/android/link/ui/ErrorMessage;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/uicore/forms/FormFieldEntry;Lcom/stripe/android/link/ui/ErrorMessage;Ljava/lang/String;ILjava/lang/Object;)Lcom/stripe/android/link/ui/wallet/WalletUiState;

    move-result-object v0

    return-object v0
.end method

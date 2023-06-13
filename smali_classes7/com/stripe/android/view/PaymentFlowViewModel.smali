.class public final Lcom/stripe/android/view/PaymentFlowViewModel;
.super LOr6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/PaymentFlowViewModel$Companion;,
        Lcom/stripe/android/view/PaymentFlowViewModel$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0012\n\u0002\u0010\u0008\n\u0002\u0008\u000b\u0008\u0000\u0018\u0000 B2\u00020\u0001:\u0002BCB\u001f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\u0008@\u0010AJ&\u0010\t\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J>\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u000e0\u00050\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR(\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#\"\u0004\u0008$\u0010%R\"\u0010\'\u001a\u00020&8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*\"\u0004\u0008+\u0010,R$\u0010-\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008-\u0010.\u001a\u0004\u0008/\u00100\"\u0004\u00081\u00102R$\u00103\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u00083\u00104\u001a\u0004\u00085\u00106\"\u0004\u00087\u00108R\"\u0010:\u001a\u0002098\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008:\u0010;\u001a\u0004\u0008<\u0010=\"\u0004\u0008>\u0010?\u0082\u0002\u0004\n\u0002\u0008\u0019\u00a8\u0006D"
    }
    d2 = {
        "Lcom/stripe/android/view/PaymentFlowViewModel;",
        "LOr6;",
        "Lcom/stripe/android/model/ShippingInformation;",
        "shippingInformation",
        "Landroidx/lifecycle/LiveData;",
        "Lkotlin/Result;",
        "Lcom/stripe/android/model/Customer;",
        "saveCustomerShippingInformation$payments_core_release",
        "(Lcom/stripe/android/model/ShippingInformation;)Landroidx/lifecycle/LiveData;",
        "saveCustomerShippingInformation",
        "Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;",
        "shippingInfoValidator",
        "Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;",
        "shippingMethodsFactory",
        "",
        "Lcom/stripe/android/model/ShippingMethod;",
        "validateShippingInformation$payments_core_release",
        "(Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;Lcom/stripe/android/model/ShippingInformation;)Landroidx/lifecycle/LiveData;",
        "validateShippingInformation",
        "Lcom/stripe/android/CustomerSession;",
        "customerSession",
        "Lcom/stripe/android/CustomerSession;",
        "Lcom/stripe/android/PaymentSessionData;",
        "paymentSessionData",
        "Lcom/stripe/android/PaymentSessionData;",
        "getPaymentSessionData$payments_core_release",
        "()Lcom/stripe/android/PaymentSessionData;",
        "setPaymentSessionData$payments_core_release",
        "(Lcom/stripe/android/PaymentSessionData;)V",
        "Lkotlin/coroutines/CoroutineContext;",
        "workContext",
        "Lkotlin/coroutines/CoroutineContext;",
        "shippingMethods",
        "Ljava/util/List;",
        "getShippingMethods$payments_core_release",
        "()Ljava/util/List;",
        "setShippingMethods$payments_core_release",
        "(Ljava/util/List;)V",
        "",
        "isShippingInfoSubmitted",
        "Z",
        "isShippingInfoSubmitted$payments_core_release",
        "()Z",
        "setShippingInfoSubmitted$payments_core_release",
        "(Z)V",
        "selectedShippingMethod",
        "Lcom/stripe/android/model/ShippingMethod;",
        "getSelectedShippingMethod$payments_core_release",
        "()Lcom/stripe/android/model/ShippingMethod;",
        "setSelectedShippingMethod$payments_core_release",
        "(Lcom/stripe/android/model/ShippingMethod;)V",
        "submittedShippingInfo",
        "Lcom/stripe/android/model/ShippingInformation;",
        "getSubmittedShippingInfo$payments_core_release",
        "()Lcom/stripe/android/model/ShippingInformation;",
        "setSubmittedShippingInfo$payments_core_release",
        "(Lcom/stripe/android/model/ShippingInformation;)V",
        "",
        "currentPage",
        "I",
        "getCurrentPage$payments_core_release",
        "()I",
        "setCurrentPage$payments_core_release",
        "(I)V",
        "<init>",
        "(Lcom/stripe/android/CustomerSession;Lcom/stripe/android/PaymentSessionData;Lkotlin/coroutines/CoroutineContext;)V",
        "Companion",
        "Factory",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final Companion:Lcom/stripe/android/view/PaymentFlowViewModel$Companion;

.field private static final PRODUCT_USAGE:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final SHIPPING_INFO_PRODUCT_TOKEN:Ljava/lang/String; = "ShippingInfoScreen"


# instance fields
.field private currentPage:I

.field private final customerSession:Lcom/stripe/android/CustomerSession;

.field private isShippingInfoSubmitted:Z

.field private paymentSessionData:Lcom/stripe/android/PaymentSessionData;

.field private selectedShippingMethod:Lcom/stripe/android/model/ShippingMethod;

.field private shippingMethods:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/stripe/android/model/ShippingMethod;",
            ">;"
        }
    .end annotation
.end field

.field private submittedShippingInfo:Lcom/stripe/android/model/ShippingInformation;

.field private final workContext:Lkotlin/coroutines/CoroutineContext;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/stripe/android/view/PaymentFlowViewModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/stripe/android/view/PaymentFlowViewModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/stripe/android/view/PaymentFlowViewModel;->Companion:Lcom/stripe/android/view/PaymentFlowViewModel$Companion;

    const-string v0, "PaymentFlowActivity"

    const-string v1, "ShippingInfoScreen"

    const-string v2, "PaymentSession"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/SetsKt;->setOf([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lcom/stripe/android/view/PaymentFlowViewModel;->PRODUCT_USAGE:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Lcom/stripe/android/CustomerSession;Lcom/stripe/android/PaymentSessionData;Lkotlin/coroutines/CoroutineContext;)V
    .locals 1

    const-string v0, "customerSession"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentSessionData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workContext"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, LOr6;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/view/PaymentFlowViewModel;->customerSession:Lcom/stripe/android/CustomerSession;

    iput-object p2, p0, Lcom/stripe/android/view/PaymentFlowViewModel;->paymentSessionData:Lcom/stripe/android/PaymentSessionData;

    iput-object p3, p0, Lcom/stripe/android/view/PaymentFlowViewModel;->workContext:Lkotlin/coroutines/CoroutineContext;

    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/view/PaymentFlowViewModel;->shippingMethods:Ljava/util/List;

    return-void
.end method

.method public static final synthetic access$getPRODUCT_USAGE$cp()Ljava/util/Set;
    .locals 1

    sget-object v0, Lcom/stripe/android/view/PaymentFlowViewModel;->PRODUCT_USAGE:Ljava/util/Set;

    return-object v0
.end method

.method public static final synthetic access$getWorkContext$p(Lcom/stripe/android/view/PaymentFlowViewModel;)Lkotlin/coroutines/CoroutineContext;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/view/PaymentFlowViewModel;->workContext:Lkotlin/coroutines/CoroutineContext;

    return-object p0
.end method


# virtual methods
.method public final getCurrentPage$payments_core_release()I
    .locals 1

    iget v0, p0, Lcom/stripe/android/view/PaymentFlowViewModel;->currentPage:I

    return v0
.end method

.method public final getPaymentSessionData$payments_core_release()Lcom/stripe/android/PaymentSessionData;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowViewModel;->paymentSessionData:Lcom/stripe/android/PaymentSessionData;

    return-object v0
.end method

.method public final getSelectedShippingMethod$payments_core_release()Lcom/stripe/android/model/ShippingMethod;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowViewModel;->selectedShippingMethod:Lcom/stripe/android/model/ShippingMethod;

    return-object v0
.end method

.method public final getShippingMethods$payments_core_release()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/ShippingMethod;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowViewModel;->shippingMethods:Ljava/util/List;

    return-object v0
.end method

.method public final getSubmittedShippingInfo$payments_core_release()Lcom/stripe/android/model/ShippingInformation;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/PaymentFlowViewModel;->submittedShippingInfo:Lcom/stripe/android/model/ShippingInformation;

    return-object v0
.end method

.method public final isShippingInfoSubmitted$payments_core_release()Z
    .locals 1

    iget-boolean v0, p0, Lcom/stripe/android/view/PaymentFlowViewModel;->isShippingInfoSubmitted:Z

    return v0
.end method

.method public final synthetic saveCustomerShippingInformation$payments_core_release(Lcom/stripe/android/model/ShippingInformation;)Landroidx/lifecycle/LiveData;
    .locals 4

    const-string v0, "shippingInformation"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/view/PaymentFlowViewModel;->submittedShippingInfo:Lcom/stripe/android/model/ShippingInformation;

    new-instance v0, LuX2;

    invoke-direct {v0}, LuX2;-><init>()V

    iget-object v1, p0, Lcom/stripe/android/view/PaymentFlowViewModel;->customerSession:Lcom/stripe/android/CustomerSession;

    sget-object v2, Lcom/stripe/android/view/PaymentFlowViewModel;->PRODUCT_USAGE:Ljava/util/Set;

    new-instance v3, Lcom/stripe/android/view/PaymentFlowViewModel$saveCustomerShippingInformation$1;

    invoke-direct {v3, p0, v0}, Lcom/stripe/android/view/PaymentFlowViewModel$saveCustomerShippingInformation$1;-><init>(Lcom/stripe/android/view/PaymentFlowViewModel;LuX2;)V

    invoke-virtual {v1, p1, v2, v3}, Lcom/stripe/android/CustomerSession;->setCustomerShippingInformation$payments_core_release(Lcom/stripe/android/model/ShippingInformation;Ljava/util/Set;Lcom/stripe/android/CustomerSession$CustomerRetrievalListener;)V

    return-object v0
.end method

.method public final setCurrentPage$payments_core_release(I)V
    .locals 0

    iput p1, p0, Lcom/stripe/android/view/PaymentFlowViewModel;->currentPage:I

    return-void
.end method

.method public final setPaymentSessionData$payments_core_release(Lcom/stripe/android/PaymentSessionData;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/view/PaymentFlowViewModel;->paymentSessionData:Lcom/stripe/android/PaymentSessionData;

    return-void
.end method

.method public final setSelectedShippingMethod$payments_core_release(Lcom/stripe/android/model/ShippingMethod;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/PaymentFlowViewModel;->selectedShippingMethod:Lcom/stripe/android/model/ShippingMethod;

    return-void
.end method

.method public final setShippingInfoSubmitted$payments_core_release(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/stripe/android/view/PaymentFlowViewModel;->isShippingInfoSubmitted:Z

    return-void
.end method

.method public final setShippingMethods$payments_core_release(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/ShippingMethod;",
            ">;)V"
        }
    .end annotation

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/stripe/android/view/PaymentFlowViewModel;->shippingMethods:Ljava/util/List;

    return-void
.end method

.method public final setSubmittedShippingInfo$payments_core_release(Lcom/stripe/android/model/ShippingInformation;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/PaymentFlowViewModel;->submittedShippingInfo:Lcom/stripe/android/model/ShippingInformation;

    return-void
.end method

.method public final synthetic validateShippingInformation$payments_core_release(Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;Lcom/stripe/android/model/ShippingInformation;)Landroidx/lifecycle/LiveData;
    .locals 10

    const-string v0, "shippingInfoValidator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "shippingInformation"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    const-wide/16 v2, 0x0

    new-instance v0, Lcom/stripe/android/view/PaymentFlowViewModel$validateShippingInformation$1;

    const/4 v9, 0x0

    move-object v4, v0

    move-object v5, p0

    move-object v6, p1

    move-object v7, p3

    move-object v8, p2

    invoke-direct/range {v4 .. v9}, Lcom/stripe/android/view/PaymentFlowViewModel$validateShippingInformation$1;-><init>(Lcom/stripe/android/view/PaymentFlowViewModel;Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;Lcom/stripe/android/model/ShippingInformation;Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;Lkotlin/coroutines/Continuation;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LWC0;->b(Lkotlin/coroutines/CoroutineContext;JLkotlin/jvm/functions/Function2;ILjava/lang/Object;)Landroidx/lifecycle/LiveData;

    move-result-object p1

    return-object p1
.end method

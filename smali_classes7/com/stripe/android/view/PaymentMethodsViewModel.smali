.class public final Lcom/stripe/android/view/PaymentMethodsViewModel;
.super Lie;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/PaymentMethodsViewModel$Factory;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001:\u00017B4\u0012\u0006\u00104\u001a\u000203\u0012\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u000f\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u00f8\u0001\u0000\u00a2\u0006\u0004\u00085\u00106J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0005\u001a\u00020\u0004H\u0002J\u0017\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\nJ$\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00100\u000f0\u000eH\u0000\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R#\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u000f8\u0002X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u001c\u0010\"\u001a\n !*\u0004\u0018\u00010 0 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R \u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u00060\'8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008(\u0010)\u001a\u0004\u0008*\u0010+R\"\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060,8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008-\u0010.\u001a\u0004\u0008/\u00100R \u00101\u001a\u0008\u0012\u0004\u0012\u00020\u001d0,8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u00081\u0010.\u001a\u0004\u00082\u00100\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u00068"
    }
    d2 = {
        "Lcom/stripe/android/view/PaymentMethodsViewModel;",
        "Lie;",
        "Lcom/stripe/android/model/PaymentMethod;",
        "paymentMethod",
        "",
        "stringRes",
        "",
        "createSnackbarText",
        "",
        "onPaymentMethodAdded$payments_core_release",
        "(Lcom/stripe/android/model/PaymentMethod;)V",
        "onPaymentMethodAdded",
        "onPaymentMethodRemoved$payments_core_release",
        "onPaymentMethodRemoved",
        "Landroidx/lifecycle/LiveData;",
        "Lkotlin/Result;",
        "",
        "getPaymentMethods$payments_core_release",
        "()Landroidx/lifecycle/LiveData;",
        "getPaymentMethods",
        "Lcom/stripe/android/CustomerSession;",
        "customerSession",
        "Ljava/lang/Object;",
        "selectedPaymentMethodId",
        "Ljava/lang/String;",
        "getSelectedPaymentMethodId$payments_core_release",
        "()Ljava/lang/String;",
        "setSelectedPaymentMethodId$payments_core_release",
        "(Ljava/lang/String;)V",
        "",
        "startedFromPaymentSession",
        "Z",
        "Landroid/content/res/Resources;",
        "kotlin.jvm.PlatformType",
        "resources",
        "Landroid/content/res/Resources;",
        "Lcom/stripe/android/view/CardDisplayTextFactory;",
        "cardDisplayTextFactory",
        "Lcom/stripe/android/view/CardDisplayTextFactory;",
        "",
        "productUsage",
        "Ljava/util/Set;",
        "getProductUsage$payments_core_release",
        "()Ljava/util/Set;",
        "LuX2;",
        "snackbarData",
        "LuX2;",
        "getSnackbarData$payments_core_release",
        "()LuX2;",
        "progressData",
        "getProgressData$payments_core_release",
        "Landroid/app/Application;",
        "application",
        "<init>",
        "(Landroid/app/Application;Ljava/lang/Object;Ljava/lang/String;Z)V",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nPaymentMethodsViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodsViewModel.kt\ncom/stripe/android/view/PaymentMethodsViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n1#2:120\n*E\n"
    }
.end annotation


# instance fields
.field private final cardDisplayTextFactory:Lcom/stripe/android/view/CardDisplayTextFactory;

.field private final customerSession:Ljava/lang/Object;

.field private final productUsage:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final progressData:LuX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LuX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final resources:Landroid/content/res/Resources;

.field private selectedPaymentMethodId:Ljava/lang/String;

.field private final snackbarData:LuX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LuX2<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final startedFromPaymentSession:Z


# direct methods
.method public constructor <init>(Landroid/app/Application;Ljava/lang/Object;Ljava/lang/String;Z)V
    .locals 1

    const-string v0, "application"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lie;-><init>(Landroid/app/Application;)V

    iput-object p2, p0, Lcom/stripe/android/view/PaymentMethodsViewModel;->customerSession:Ljava/lang/Object;

    iput-object p3, p0, Lcom/stripe/android/view/PaymentMethodsViewModel;->selectedPaymentMethodId:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/stripe/android/view/PaymentMethodsViewModel;->startedFromPaymentSession:Z

    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    iput-object p2, p0, Lcom/stripe/android/view/PaymentMethodsViewModel;->resources:Landroid/content/res/Resources;

    new-instance p2, Lcom/stripe/android/view/CardDisplayTextFactory;

    invoke-direct {p2, p1}, Lcom/stripe/android/view/CardDisplayTextFactory;-><init>(Landroid/content/Context;)V

    iput-object p2, p0, Lcom/stripe/android/view/PaymentMethodsViewModel;->cardDisplayTextFactory:Lcom/stripe/android/view/CardDisplayTextFactory;

    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/String;

    if-eqz p4, :cond_0

    const-string p2, "PaymentSession"

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    const/4 p3, 0x0

    aput-object p2, p1, p3

    const/4 p2, 0x1

    const-string p3, "PaymentMethodsActivity"

    aput-object p3, p1, p2

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->listOfNotNull([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lcom/stripe/android/view/PaymentMethodsViewModel;->productUsage:Ljava/util/Set;

    new-instance p1, LuX2;

    invoke-direct {p1}, LuX2;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/view/PaymentMethodsViewModel;->snackbarData:LuX2;

    new-instance p1, LuX2;

    invoke-direct {p1}, LuX2;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/view/PaymentMethodsViewModel;->progressData:LuX2;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/Application;Ljava/lang/Object;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/stripe/android/view/PaymentMethodsViewModel;-><init>(Landroid/app/Application;Ljava/lang/Object;Ljava/lang/String;Z)V

    return-void
.end method

.method private final createSnackbarText(Lcom/stripe/android/model/PaymentMethod;I)Ljava/lang/String;
    .locals 3

    iget-object p1, p1, Lcom/stripe/android/model/PaymentMethod;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsViewModel;->resources:Landroid/content/res/Resources;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    iget-object v2, p0, Lcom/stripe/android/view/PaymentMethodsViewModel;->cardDisplayTextFactory:Lcom/stripe/android/view/CardDisplayTextFactory;

    invoke-virtual {v2, p1}, Lcom/stripe/android/view/CardDisplayTextFactory;->createUnstyled$payments_core_release(Lcom/stripe/android/model/PaymentMethod$Card;)Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {v0, p2, v1}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method


# virtual methods
.method public final synthetic getPaymentMethods$payments_core_release()Landroidx/lifecycle/LiveData;
    .locals 12

    new-instance v0, LuX2;

    invoke-direct {v0}, LuX2;-><init>()V

    iget-object v1, p0, Lcom/stripe/android/view/PaymentMethodsViewModel;->progressData:LuX2;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, LuX2;->setValue(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/stripe/android/view/PaymentMethodsViewModel;->customerSession:Ljava/lang/Object;

    invoke-static {v1}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    if-nez v2, :cond_0

    move-object v3, v1

    check-cast v3, Lcom/stripe/android/CustomerSession;

    sget-object v4, Lcom/stripe/android/model/PaymentMethod$Type;->Card:Lcom/stripe/android/model/PaymentMethod$Type;

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    iget-object v8, p0, Lcom/stripe/android/view/PaymentMethodsViewModel;->productUsage:Ljava/util/Set;

    new-instance v9, Lcom/stripe/android/view/PaymentMethodsViewModel$getPaymentMethods$1$1;

    invoke-direct {v9, v0, p0}, Lcom/stripe/android/view/PaymentMethodsViewModel$getPaymentMethods$1$1;-><init>(LuX2;Lcom/stripe/android/view/PaymentMethodsViewModel;)V

    const/16 v10, 0xe

    const/4 v11, 0x0

    invoke-static/range {v3 .. v11}, Lcom/stripe/android/CustomerSession;->getPaymentMethods$payments_core_release$default(Lcom/stripe/android/CustomerSession;Lcom/stripe/android/model/PaymentMethod$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/CustomerSession$PaymentMethodsRetrievalListener;ILjava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/Result;->box-impl(Ljava/lang/Object;)Lkotlin/Result;

    move-result-object v1

    invoke-virtual {v0, v1}, LuX2;->setValue(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/stripe/android/view/PaymentMethodsViewModel;->progressData:LuX2;

    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2}, LuX2;->setValue(Ljava/lang/Object;)V

    :goto_0
    return-object v0
.end method

.method public final getProductUsage$payments_core_release()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsViewModel;->productUsage:Ljava/util/Set;

    return-object v0
.end method

.method public final getProgressData$payments_core_release()LuX2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LuX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsViewModel;->progressData:LuX2;

    return-object v0
.end method

.method public final getSelectedPaymentMethodId$payments_core_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsViewModel;->selectedPaymentMethodId:Ljava/lang/String;

    return-object v0
.end method

.method public final getSnackbarData$payments_core_release()LuX2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LuX2<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsViewModel;->snackbarData:LuX2;

    return-object v0
.end method

.method public final onPaymentMethodAdded$payments_core_release(Lcom/stripe/android/model/PaymentMethod;)V
    .locals 1

    const-string v0, "paymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lcom/stripe/android/R$string;->added:I

    invoke-direct {p0, p1, v0}, Lcom/stripe/android/view/PaymentMethodsViewModel;->createSnackbarText(Lcom/stripe/android/model/PaymentMethod;I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsViewModel;->snackbarData:LuX2;

    invoke-virtual {v0, p1}, LuX2;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/view/PaymentMethodsViewModel;->snackbarData:LuX2;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LuX2;->setValue(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final onPaymentMethodRemoved$payments_core_release(Lcom/stripe/android/model/PaymentMethod;)V
    .locals 1

    const-string v0, "paymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lcom/stripe/android/R$string;->removed:I

    invoke-direct {p0, p1, v0}, Lcom/stripe/android/view/PaymentMethodsViewModel;->createSnackbarText(Lcom/stripe/android/model/PaymentMethod;I)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/stripe/android/view/PaymentMethodsViewModel;->snackbarData:LuX2;

    invoke-virtual {v0, p1}, LuX2;->setValue(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/stripe/android/view/PaymentMethodsViewModel;->snackbarData:LuX2;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, LuX2;->setValue(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final setSelectedPaymentMethodId$payments_core_release(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/PaymentMethodsViewModel;->selectedPaymentMethodId:Ljava/lang/String;

    return-void
.end method

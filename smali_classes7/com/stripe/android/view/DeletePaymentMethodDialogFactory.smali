.class public final Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/stripe/android/view/DeletePaymentMethodDialogFactory$PaymentMethodDeleteListener;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001:\u0001 BT\u0008\u0000\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u001b\u00f8\u0001\u0000\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R#\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u0082\u0002\u000f\n\u0002\u0008\u0019\n\u0005\u0008\u00a1\u001e0\u0001\n\u0002\u0008!\u00a8\u0006!"
    }
    d2 = {
        "Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;",
        "",
        "Lcom/stripe/android/model/PaymentMethod;",
        "paymentMethod",
        "Landroidx/appcompat/app/b;",
        "create",
        "",
        "onDeletedPaymentMethod$payments_core_release",
        "(Lcom/stripe/android/model/PaymentMethod;)V",
        "onDeletedPaymentMethod",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Context;",
        "Lcom/stripe/android/view/PaymentMethodsAdapter;",
        "adapter",
        "Lcom/stripe/android/view/PaymentMethodsAdapter;",
        "Lcom/stripe/android/view/CardDisplayTextFactory;",
        "cardDisplayTextFactory",
        "Lcom/stripe/android/view/CardDisplayTextFactory;",
        "Lkotlin/Result;",
        "Lcom/stripe/android/CustomerSession;",
        "customerSession",
        "Ljava/lang/Object;",
        "",
        "",
        "productUsage",
        "Ljava/util/Set;",
        "Lkotlin/Function1;",
        "onDeletedPaymentMethodCallback",
        "Lkotlin/jvm/functions/Function1;",
        "<init>",
        "(Landroid/content/Context;Lcom/stripe/android/view/PaymentMethodsAdapter;Lcom/stripe/android/view/CardDisplayTextFactory;Ljava/lang/Object;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)V",
        "PaymentMethodDeleteListener",
        "payments-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final adapter:Lcom/stripe/android/view/PaymentMethodsAdapter;

.field private final cardDisplayTextFactory:Lcom/stripe/android/view/CardDisplayTextFactory;

.field private final context:Landroid/content/Context;

.field private final customerSession:Ljava/lang/Object;

.field private final onDeletedPaymentMethodCallback:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final productUsage:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/stripe/android/view/PaymentMethodsAdapter;Lcom/stripe/android/view/CardDisplayTextFactory;Ljava/lang/Object;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/stripe/android/view/PaymentMethodsAdapter;",
            "Lcom/stripe/android/view/CardDisplayTextFactory;",
            "Ljava/lang/Object;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cardDisplayTextFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "productUsage"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDeletedPaymentMethodCallback"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;->context:Landroid/content/Context;

    iput-object p2, p0, Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;->adapter:Lcom/stripe/android/view/PaymentMethodsAdapter;

    iput-object p3, p0, Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;->cardDisplayTextFactory:Lcom/stripe/android/view/CardDisplayTextFactory;

    iput-object p4, p0, Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;->customerSession:Ljava/lang/Object;

    iput-object p5, p0, Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;->productUsage:Ljava/util/Set;

    iput-object p6, p0, Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;->onDeletedPaymentMethodCallback:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public static synthetic a(Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;Lcom/stripe/android/model/PaymentMethod;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;->create$lambda$2(Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;Lcom/stripe/android/model/PaymentMethod;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic b(Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;Lcom/stripe/android/model/PaymentMethod;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;->create$lambda$1(Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;Lcom/stripe/android/model/PaymentMethod;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method public static synthetic c(Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;Lcom/stripe/android/model/PaymentMethod;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;->create$lambda$3(Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;Lcom/stripe/android/model/PaymentMethod;Landroid/content/DialogInterface;)V

    return-void
.end method

.method private static final create$lambda$1(Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;Lcom/stripe/android/model/PaymentMethod;Landroid/content/DialogInterface;I)V
    .locals 0

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$paymentMethod"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;->onDeletedPaymentMethod$payments_core_release(Lcom/stripe/android/model/PaymentMethod;)V

    return-void
.end method

.method private static final create$lambda$2(Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;Lcom/stripe/android/model/PaymentMethod;Landroid/content/DialogInterface;I)V
    .locals 0

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$paymentMethod"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;->adapter:Lcom/stripe/android/view/PaymentMethodsAdapter;

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter;->resetPaymentMethod$payments_core_release(Lcom/stripe/android/model/PaymentMethod;)V

    return-void
.end method

.method private static final create$lambda$3(Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;Lcom/stripe/android/model/PaymentMethod;Landroid/content/DialogInterface;)V
    .locals 0

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "$paymentMethod"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;->adapter:Lcom/stripe/android/view/PaymentMethodsAdapter;

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter;->resetPaymentMethod$payments_core_release(Lcom/stripe/android/model/PaymentMethod;)V

    return-void
.end method


# virtual methods
.method public final synthetic create(Lcom/stripe/android/model/PaymentMethod;)Landroidx/appcompat/app/b;
    .locals 4

    const-string v0, "paymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lcom/stripe/android/model/PaymentMethod;->card:Lcom/stripe/android/model/PaymentMethod$Card;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;->cardDisplayTextFactory:Lcom/stripe/android/view/CardDisplayTextFactory;

    invoke-virtual {v1, v0}, Lcom/stripe/android/view/CardDisplayTextFactory;->createUnstyled$payments_core_release(Lcom/stripe/android/model/PaymentMethod$Card;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-instance v1, Landroidx/appcompat/app/b$a;

    iget-object v2, p0, Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;->context:Landroid/content/Context;

    sget v3, Lcom/stripe/android/R$style;->AlertDialogStyle:I

    invoke-direct {v1, v2, v3}, Landroidx/appcompat/app/b$a;-><init>(Landroid/content/Context;I)V

    sget v2, Lcom/stripe/android/R$string;->delete_payment_method_prompt_title:I

    invoke-virtual {v1, v2}, Landroidx/appcompat/app/b$a;->p(I)Landroidx/appcompat/app/b$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroidx/appcompat/app/b$a;->h(Ljava/lang/CharSequence;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    new-instance v1, LVZ0;

    invoke-direct {v1, p0, p1}, LVZ0;-><init>(Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;Lcom/stripe/android/model/PaymentMethod;)V

    const v2, 0x104000a

    invoke-virtual {v0, v2, v1}, Landroidx/appcompat/app/b$a;->m(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    new-instance v1, LWZ0;

    invoke-direct {v1, p0, p1}, LWZ0;-><init>(Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;Lcom/stripe/android/model/PaymentMethod;)V

    const/high16 v2, 0x1040000

    invoke-virtual {v0, v2, v1}, Landroidx/appcompat/app/b$a;->i(ILandroid/content/DialogInterface$OnClickListener;)Landroidx/appcompat/app/b$a;

    move-result-object v0

    new-instance v1, LXZ0;

    invoke-direct {v1, p0, p1}, LXZ0;-><init>(Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;Lcom/stripe/android/model/PaymentMethod;)V

    invoke-virtual {v0, v1}, Landroidx/appcompat/app/b$a;->k(Landroid/content/DialogInterface$OnCancelListener;)Landroidx/appcompat/app/b$a;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/appcompat/app/b$a;->a()Landroidx/appcompat/app/b;

    move-result-object p1

    const-string v0, "Builder(context, R.style\u2026  }\n            .create()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final synthetic onDeletedPaymentMethod$payments_core_release(Lcom/stripe/android/model/PaymentMethod;)V
    .locals 4

    const-string v0, "paymentMethod"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;->adapter:Lcom/stripe/android/view/PaymentMethodsAdapter;

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/PaymentMethodsAdapter;->deletePaymentMethod$payments_core_release(Lcom/stripe/android/model/PaymentMethod;)V

    iget-object v0, p1, Lcom/stripe/android/model/PaymentMethod;->id:Ljava/lang/String;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;->customerSession:Ljava/lang/Object;

    invoke-static {v1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x0

    :cond_0
    check-cast v1, Lcom/stripe/android/CustomerSession;

    if-eqz v1, :cond_1

    iget-object v2, p0, Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;->productUsage:Ljava/util/Set;

    new-instance v3, Lcom/stripe/android/view/DeletePaymentMethodDialogFactory$PaymentMethodDeleteListener;

    invoke-direct {v3}, Lcom/stripe/android/view/DeletePaymentMethodDialogFactory$PaymentMethodDeleteListener;-><init>()V

    invoke-virtual {v1, v0, v2, v3}, Lcom/stripe/android/CustomerSession;->detachPaymentMethod$payments_core_release(Ljava/lang/String;Ljava/util/Set;Lcom/stripe/android/CustomerSession$PaymentMethodRetrievalListener;)V

    :cond_1
    iget-object v0, p0, Lcom/stripe/android/view/DeletePaymentMethodDialogFactory;->onDeletedPaymentMethodCallback:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

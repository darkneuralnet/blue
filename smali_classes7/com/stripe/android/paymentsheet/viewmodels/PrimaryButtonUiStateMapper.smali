.class public final Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0007\u0012\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0007\u0012\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007\u0012\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0007\u0012\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0007\u0012\u000c\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0008\u0010\u0006\u001a\u00020\u0004H\u0002J\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0007J\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u0007R\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\rR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0016R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u0016R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u0016R\u001a\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006\""
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;",
        "",
        "Lcom/stripe/android/ui/core/Amount;",
        "amount",
        "",
        "buyButtonLabel",
        "continueButtonLabel",
        "LEu1;",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
        "forCompleteFlow",
        "forCustomFlow",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Context;",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
        "config",
        "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
        "",
        "isProcessingPayment",
        "Z",
        "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;",
        "currentScreenFlow",
        "LEu1;",
        "buttonsEnabledFlow",
        "amountFlow",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "selectionFlow",
        "customPrimaryButtonUiStateFlow",
        "Lkotlin/Function0;",
        "",
        "onClick",
        "Lkotlin/jvm/functions/Function0;",
        "<init>",
        "(Landroid/content/Context;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLEu1;LEu1;LEu1;LEu1;LEu1;Lkotlin/jvm/functions/Function0;)V",
        "paymentsheet_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field private final amountFlow:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Lcom/stripe/android/ui/core/Amount;",
            ">;"
        }
    .end annotation
.end field

.field private final buttonsEnabledFlow:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final config:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

.field private final context:Landroid/content/Context;

.field private final currentScreenFlow:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;",
            ">;"
        }
    .end annotation
.end field

.field private final customPrimaryButtonUiStateFlow:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
            ">;"
        }
    .end annotation
.end field

.field private final isProcessingPayment:Z

.field private final onClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field private final selectionFlow:LEu1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEu1<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;ZLEu1;LEu1;LEu1;LEu1;LEu1;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;",
            "Z",
            "LEu1<",
            "+",
            "Lcom/stripe/android/paymentsheet/navigation/PaymentSheetScreen;",
            ">;",
            "LEu1<",
            "Ljava/lang/Boolean;",
            ">;",
            "LEu1<",
            "Lcom/stripe/android/ui/core/Amount;",
            ">;",
            "LEu1<",
            "+",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            ">;",
            "LEu1<",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentScreenFlow"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttonsEnabledFlow"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "amountFlow"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectionFlow"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customPrimaryButtonUiStateFlow"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->context:Landroid/content/Context;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->config:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    iput-boolean p3, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->isProcessingPayment:Z

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->currentScreenFlow:LEu1;

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->buttonsEnabledFlow:LEu1;

    iput-object p6, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->amountFlow:LEu1;

    iput-object p7, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->selectionFlow:LEu1;

    iput-object p8, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->customPrimaryButtonUiStateFlow:LEu1;

    iput-object p9, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->onClick:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public static final synthetic access$buyButtonLabel(Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;Lcom/stripe/android/ui/core/Amount;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->buyButtonLabel(Lcom/stripe/android/ui/core/Amount;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$continueButtonLabel(Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->continueButtonLabel()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getOnClick$p(Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;)Lkotlin/jvm/functions/Function0;
    .locals 0

    iget-object p0, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->onClick:Lkotlin/jvm/functions/Function0;

    return-object p0
.end method

.method private final buyButtonLabel(Lcom/stripe/android/ui/core/Amount;)Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->config:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getPrimaryButtonLabel()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->config:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    invoke-virtual {p1}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getPrimaryButtonLabel()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    iget-boolean v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->isProcessingPayment:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->context:Landroid/content/Context;

    sget v1, Lcom/stripe/android/paymentsheet/R$string;->stripe_paymentsheet_pay_button_label:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "context.getString(R.stri\u2026ntsheet_pay_button_label)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_2

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const-string v2, "context.resources"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lcom/stripe/android/ui/core/Amount;->buildPayButtonLabel(Landroid/content/res/Resources;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    :cond_2
    move-object p1, v0

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->context:Landroid/content/Context;

    sget v0, Lcom/stripe/android/paymentsheet/R$string;->stripe_setup_button_label:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "{\n            context.ge\u2026p_button_label)\n        }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_4
    :goto_1
    return-object p1
.end method

.method private final continueButtonLabel()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->config:Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentSheet$Configuration;->getPrimaryButtonLabel()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->context:Landroid/content/Context;

    sget v1, Lcom/stripe/android/paymentsheet/R$string;->stripe_continue_button_label:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "context.getString(R.stri\u2026pe_continue_button_label)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    return-object v0
.end method


# virtual methods
.method public final forCompleteFlow()LEu1;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->currentScreenFlow:LEu1;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->buttonsEnabledFlow:LEu1;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->amountFlow:LEu1;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->selectionFlow:LEu1;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->customPrimaryButtonUiStateFlow:LEu1;

    new-instance v5, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$forCompleteFlow$1;

    const/4 v6, 0x0

    invoke-direct {v5, p0, v6}, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$forCompleteFlow$1;-><init>(Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;Lkotlin/coroutines/Continuation;)V

    invoke-static/range {v0 .. v5}, LVu1;->k(LEu1;LEu1;LEu1;LEu1;LEu1;Lkotlin/jvm/functions/Function6;)LEu1;

    move-result-object v0

    return-object v0
.end method

.method public final forCustomFlow()LEu1;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->currentScreenFlow:LEu1;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->buttonsEnabledFlow:LEu1;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->selectionFlow:LEu1;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;->customPrimaryButtonUiStateFlow:LEu1;

    new-instance v4, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$forCustomFlow$1;

    const/4 v5, 0x0

    invoke-direct {v4, p0, v5}, Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper$forCustomFlow$1;-><init>(Lcom/stripe/android/paymentsheet/viewmodels/PrimaryButtonUiStateMapper;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v1, v2, v3, v4}, LVu1;->l(LEu1;LEu1;LEu1;LEu1;Lkotlin/jvm/functions/Function5;)LEu1;

    move-result-object v0

    return-object v0
.end method

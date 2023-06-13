.class public final Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B\u007f\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0012\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0012\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0012\u0012\u000e\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0012\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0012\u0012\u001a\u0010\u0017\u001a\u0016\u0012\u000c\u0012\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0006\u0010\u0019\u001a\u00020\t\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJG\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0010H\u0086\u0002R\"\u0010\u0004\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0013R\u001a\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0013R\u001c\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0013R\u001c\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u0013R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0013R(\u0010\u0017\u001a\u0016\u0012\u000c\u0012\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;",
        "",
        "",
        "Lcom/stripe/android/model/PaymentMethod;",
        "paymentMethods",
        "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
        "currentSelection",
        "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
        "initialSelection",
        "",
        "isLinkEnabled",
        "Lcom/stripe/android/paymentsheet/state/GooglePayState;",
        "googlePayState",
        "Lcom/stripe/android/paymentsheet/PaymentOptionsState;",
        "createPaymentOptionsState",
        "(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/model/SavedSelection;Ljava/lang/Boolean;Lcom/stripe/android/paymentsheet/state/GooglePayState;)Lcom/stripe/android/paymentsheet/PaymentOptionsState;",
        "LEu1;",
        "invoke",
        "LtP5;",
        "LtP5;",
        "Lkotlin/Function1;",
        "",
        "Lcom/stripe/android/model/PaymentMethodCode;",
        "nameProvider",
        "Lkotlin/jvm/functions/Function1;",
        "isNotPaymentFlow",
        "Z",
        "<init>",
        "(LtP5;LtP5;LtP5;LtP5;LtP5;Lkotlin/jvm/functions/Function1;Z)V",
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
.field private final currentSelection:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            ">;"
        }
    .end annotation
.end field

.field private final googlePayState:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Lcom/stripe/android/paymentsheet/state/GooglePayState;",
            ">;"
        }
    .end annotation
.end field

.field private final initialSelection:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
            ">;"
        }
    .end annotation
.end field

.field private final isLinkEnabled:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private final isNotPaymentFlow:Z

.field private final nameProvider:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final paymentMethods:LtP5;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LtP5<",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LtP5;LtP5;LtP5;LtP5;LtP5;Lkotlin/jvm/functions/Function1;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LtP5<",
            "+",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;>;",
            "LtP5<",
            "+",
            "Lcom/stripe/android/paymentsheet/state/GooglePayState;",
            ">;",
            "LtP5<",
            "Ljava/lang/Boolean;",
            ">;",
            "LtP5<",
            "+",
            "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
            ">;",
            "LtP5<",
            "+",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "paymentMethods"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "googlePayState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "isLinkEnabled"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialSelection"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentSelection"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameProvider"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;->paymentMethods:LtP5;

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;->googlePayState:LtP5;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;->isLinkEnabled:LtP5;

    iput-object p4, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;->initialSelection:LtP5;

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;->currentSelection:LtP5;

    iput-object p6, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;->nameProvider:Lkotlin/jvm/functions/Function1;

    iput-boolean p7, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;->isNotPaymentFlow:Z

    return-void
.end method

.method public static final synthetic access$createPaymentOptionsState(Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/model/SavedSelection;Ljava/lang/Boolean;Lcom/stripe/android/paymentsheet/state/GooglePayState;)Lcom/stripe/android/paymentsheet/PaymentOptionsState;
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;->createPaymentOptionsState(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/model/SavedSelection;Ljava/lang/Boolean;Lcom/stripe/android/paymentsheet/state/GooglePayState;)Lcom/stripe/android/paymentsheet/PaymentOptionsState;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$invoke$lambda$0(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/model/SavedSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;->invoke$lambda$0(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/model/SavedSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$invoke$lambda$1(Ljava/lang/Boolean;Lcom/stripe/android/paymentsheet/state/GooglePayState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;->invoke$lambda$1(Ljava/lang/Boolean;Lcom/stripe/android/paymentsheet/state/GooglePayState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final createPaymentOptionsState(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/model/SavedSelection;Ljava/lang/Boolean;Lcom/stripe/android/paymentsheet/state/GooglePayState;)Lcom/stripe/android/paymentsheet/PaymentOptionsState;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/stripe/android/model/PaymentMethod;",
            ">;",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Lcom/stripe/android/paymentsheet/model/SavedSelection;",
            "Ljava/lang/Boolean;",
            "Lcom/stripe/android/paymentsheet/state/GooglePayState;",
            ")",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsState;"
        }
    .end annotation

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    if-nez p3, :cond_1

    return-object v0

    :cond_1
    if-nez p4, :cond_2

    return-object v0

    :cond_2
    sget-object v1, Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactory;->INSTANCE:Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactory;

    instance-of p5, p5, Lcom/stripe/android/paymentsheet/state/GooglePayState$Available;

    const/4 v0, 0x1

    const/4 v2, 0x0

    if-eqz p5, :cond_3

    iget-boolean p5, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;->isNotPaymentFlow:Z

    if-eqz p5, :cond_3

    move v3, v0

    goto :goto_0

    :cond_3
    move v3, v2

    :goto_0
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p4

    if-eqz p4, :cond_4

    iget-boolean p4, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;->isNotPaymentFlow:Z

    if-eqz p4, :cond_4

    move v4, v0

    goto :goto_1

    :cond_4
    move v4, v2

    :goto_1
    iget-object v7, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;->nameProvider:Lkotlin/jvm/functions/Function1;

    move-object v2, p1

    move-object v5, p3

    move-object v6, p2

    invoke-virtual/range {v1 .. v7}, Lcom/stripe/android/paymentsheet/PaymentOptionsStateFactory;->create(Ljava/util/List;ZZLcom/stripe/android/paymentsheet/model/SavedSelection;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lkotlin/jvm/functions/Function1;)Lcom/stripe/android/paymentsheet/PaymentOptionsState;

    move-result-object p1

    return-object p1
.end method

.method private static final synthetic invoke$lambda$0(Ljava/util/List;Lcom/stripe/android/paymentsheet/model/PaymentSelection;Lcom/stripe/android/paymentsheet/model/SavedSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    new-instance p3, Lkotlin/Triple;

    invoke-direct {p3, p0, p1, p2}, Lkotlin/Triple;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p3
.end method

.method private static final synthetic invoke$lambda$1(Ljava/lang/Boolean;Lcom/stripe/android/paymentsheet/state/GooglePayState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    new-instance p2, Lkotlin/Pair;

    invoke-direct {p2, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2
.end method


# virtual methods
.method public final invoke()LEu1;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LEu1<",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsState;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;->paymentMethods:LtP5;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;->currentSelection:LtP5;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;->initialSelection:LtP5;

    sget-object v3, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper$invoke$2;->INSTANCE:Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper$invoke$2;

    invoke-static {v0, v1, v2, v3}, LVu1;->m(LEu1;LEu1;LEu1;Lkotlin/jvm/functions/Function4;)LEu1;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;->isLinkEnabled:LtP5;

    iget-object v2, p0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;->googlePayState:LtP5;

    sget-object v3, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper$invoke$4;->INSTANCE:Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper$invoke$4;

    invoke-static {v1, v2, v3}, LVu1;->n(LEu1;LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper$invoke$5;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper$invoke$5;-><init>(Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v1, v2}, LVu1;->n(LEu1;LEu1;Lkotlin/jvm/functions/Function3;)LEu1;

    move-result-object v0

    return-object v0
.end method

.class final synthetic Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper$invoke$4;
.super Lkotlin/jvm/internal/AdaptedFunctionReference;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;
.implements Lkotlin/coroutines/jvm/internal/SuspendFunction;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;->invoke()LEu1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1001
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/AdaptedFunctionReference;",
        "Lkotlin/jvm/functions/Function3<",
        "Ljava/lang/Boolean;",
        "Lcom/stripe/android/paymentsheet/state/GooglePayState;",
        "Lkotlin/coroutines/Continuation<",
        "-",
        "Lkotlin/Pair<",
        "+",
        "Ljava/lang/Boolean;",
        "+",
        "Lcom/stripe/android/paymentsheet/state/GooglePayState;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;",
        "Lkotlin/coroutines/jvm/internal/SuspendFunction;"
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


# static fields
.field public static final INSTANCE:Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper$invoke$4;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper$invoke$4;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper$invoke$4;-><init>()V

    sput-object v0, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper$invoke$4;->INSTANCE:Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper$invoke$4;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    const/4 v1, 0x3

    const-class v2, Lkotlin/Pair;

    const-string v3, "<init>"

    const-string v4, "<init>(Ljava/lang/Object;Ljava/lang/Object;)V"

    const/4 v5, 0x4

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/AdaptedFunctionReference;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Boolean;Lcom/stripe/android/paymentsheet/state/GooglePayState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Boolean;",
            "Lcom/stripe/android/paymentsheet/state/GooglePayState;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "+",
            "Lcom/stripe/android/paymentsheet/state/GooglePayState;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p1, p2, p3}, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper;->access$invoke$lambda$1(Ljava/lang/Boolean;Lcom/stripe/android/paymentsheet/state/GooglePayState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    check-cast p2, Lcom/stripe/android/paymentsheet/state/GooglePayState;

    check-cast p3, Lkotlin/coroutines/Continuation;

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/viewmodels/PaymentOptionsStateMapper$invoke$4;->invoke(Ljava/lang/Boolean;Lcom/stripe/android/paymentsheet/state/GooglePayState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

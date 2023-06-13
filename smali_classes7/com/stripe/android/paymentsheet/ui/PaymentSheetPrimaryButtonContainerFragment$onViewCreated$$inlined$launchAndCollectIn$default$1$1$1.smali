.class public final Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment$onViewCreated$$inlined$launchAndCollectIn$default$1$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LGu1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment$onViewCreated$$inlined$launchAndCollectIn$default$1$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LGu1<",
        "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u0002\"\u0004\u0008\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\u008a@\u00a8\u0006\u0003"
    }
    d2 = {
        "T",
        "it",
        "",
        "com/stripe/android/paymentsheet/utils/UiUtilsKt$launchAndCollectIn$1$1$1",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nUiUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UiUtils.kt\ncom/stripe/android/paymentsheet/utils/UiUtilsKt$launchAndCollectIn$1$1$1\n+ 2 PrimaryButtonContainerFragment.kt\ncom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment\n*L\n1#1,27:1\n70#2,2:28\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment$onViewCreated$$inlined$launchAndCollectIn$default$1$1$1;->this$0:Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    check-cast p1, Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment$onViewCreated$$inlined$launchAndCollectIn$default$1$1$1;->this$0:Lcom/stripe/android/paymentsheet/ui/PaymentSheetPrimaryButtonContainerFragment;

    invoke-virtual {p2}, Lcom/stripe/android/paymentsheet/ui/BasePrimaryButtonContainerFragment;->getViewBinding()Lcom/stripe/android/paymentsheet/databinding/FragmentPrimaryButtonContainerBinding;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object p2, p2, Lcom/stripe/android/paymentsheet/databinding/FragmentPrimaryButtonContainerBinding;->primaryButton:Lcom/stripe/android/paymentsheet/ui/PrimaryButton;

    if-eqz p2, :cond_1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonContainerFragmentKt;->convert(Lcom/stripe/android/paymentsheet/model/PaymentSheetViewState;)Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {p2, p1}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton;->updateState(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;)V

    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

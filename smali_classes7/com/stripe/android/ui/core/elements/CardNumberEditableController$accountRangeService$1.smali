.class public final Lcom/stripe/android/ui/core/elements/CardNumberEditableController$accountRangeService$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/ui/core/elements/CardNumberEditableController;-><init>(Lcom/stripe/android/ui/core/elements/CardNumberConfig;Lcom/stripe/android/cards/CardAccountRangeRepository;Lkotlin/coroutines/CoroutineContext;Lcom/stripe/android/cards/StaticCardAccountRanges;Ljava/lang/String;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016\u00a8\u0006\u0006"
    }
    d2 = {
        "com/stripe/android/ui/core/elements/CardNumberEditableController$accountRangeService$1",
        "Lcom/stripe/android/cards/CardAccountRangeService$AccountRangeResultListener;",
        "onAccountRangeResult",
        "",
        "newAccountRange",
        "Lcom/stripe/android/model/AccountRange;",
        "payments-ui-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/ui/core/elements/CardNumberEditableController;


# direct methods
.method public constructor <init>(Lcom/stripe/android/ui/core/elements/CardNumberEditableController;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$accountRangeService$1;->this$0:Lcom/stripe/android/ui/core/elements/CardNumberEditableController;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAccountRangeResult(Lcom/stripe/android/model/AccountRange;)V
    .locals 2

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/stripe/android/model/AccountRange;->getPanLength()I

    move-result p1

    iget-object v0, p0, Lcom/stripe/android/ui/core/elements/CardNumberEditableController$accountRangeService$1;->this$0:Lcom/stripe/android/ui/core/elements/CardNumberEditableController;

    invoke-virtual {v0}, Lcom/stripe/android/ui/core/elements/CardNumberEditableController;->getVisualTransformation()LEu6;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.stripe.android.ui.core.elements.CardNumberVisualTransformation"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformation;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/stripe/android/ui/core/elements/CardNumberVisualTransformation;->setBinBasedMaxPan$payments_ui_core_release(Ljava/lang/Integer;)V

    :cond_0
    return-void
.end method

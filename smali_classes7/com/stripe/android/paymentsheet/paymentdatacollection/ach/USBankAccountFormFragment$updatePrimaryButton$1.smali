.class final Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$updatePrimaryButton$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->updatePrimaryButton(Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZZ)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n\u00a2\u0006\u0002\u0008\u0003"
    }
    d2 = {
        "<anonymous>",
        "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;",
        "it",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $enabled:Z

.field final synthetic $onClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $shouldShowProcessingWhenClicked:Z

.field final synthetic $text:Ljava/lang/String;

.field final synthetic this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;ZLkotlin/jvm/functions/Function0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;",
            "Z",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$updatePrimaryButton$1;->$text:Ljava/lang/String;

    iput-boolean p2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$updatePrimaryButton$1;->$enabled:Z

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$updatePrimaryButton$1;->this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;

    iput-boolean p4, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$updatePrimaryButton$1;->$shouldShowProcessingWhenClicked:Z

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$updatePrimaryButton$1;->$onClick:Lkotlin/jvm/functions/Function0;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;)Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;
    .locals 5

    new-instance p1, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$updatePrimaryButton$1;->$text:Ljava/lang/String;

    new-instance v1, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$updatePrimaryButton$1$1;

    iget-boolean v2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$updatePrimaryButton$1;->$shouldShowProcessingWhenClicked:Z

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$updatePrimaryButton$1;->this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;

    iget-object v4, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$updatePrimaryButton$1;->$onClick:Lkotlin/jvm/functions/Function0;

    invoke-direct {v1, v2, v3, v4}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$updatePrimaryButton$1$1;-><init>(ZLcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;Lkotlin/jvm/functions/Function0;)V

    iget-boolean v2, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$updatePrimaryButton$1;->$enabled:Z

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$updatePrimaryButton$1;->this$0:Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;

    invoke-static {v3}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;->access$getCompletePayment(Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment;)Z

    move-result v3

    invoke-direct {p1, v0, v1, v2, v3}, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZZ)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/paymentdatacollection/ach/USBankAccountFormFragment$updatePrimaryButton$1;->invoke(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;)Lcom/stripe/android/paymentsheet/ui/PrimaryButton$UIState;

    move-result-object p1

    return-object p1
.end method

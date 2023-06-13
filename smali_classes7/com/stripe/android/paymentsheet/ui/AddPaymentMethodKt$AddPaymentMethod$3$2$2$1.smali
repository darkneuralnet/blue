.class final Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2$2$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2;->invoke(LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;",
        "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
        "Lkotlin/Unit;",
        ">;"
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


# instance fields
.field final synthetic $linkSignupState$delegate:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LEX2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "Lcom/stripe/android/link/ui/inline/InlineSignupViewState;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2$2$1;->$linkSignupState$delegate:LEX2;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;

    check-cast p2, Lcom/stripe/android/link/ui/inline/InlineSignupViewState;

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2$2$1;->invoke(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/link/ui/inline/InlineSignupViewState;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/stripe/android/link/LinkPaymentLauncher$Configuration;Lcom/stripe/android/link/ui/inline/InlineSignupViewState;)V
    .locals 1

    const-string v0, "<anonymous parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "inlineSignupViewState"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt$AddPaymentMethod$3$2$2$1;->$linkSignupState$delegate:LEX2;

    invoke-static {p1, p2}, Lcom/stripe/android/paymentsheet/ui/AddPaymentMethodKt;->access$AddPaymentMethod$lambda$14(LEX2;Lcom/stripe/android/link/ui/inline/InlineSignupViewState;)V

    return-void
.end method

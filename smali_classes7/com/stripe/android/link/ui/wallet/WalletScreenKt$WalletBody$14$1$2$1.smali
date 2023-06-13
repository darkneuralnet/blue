.class final Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14;->invoke(LPm0;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
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
.field final synthetic $$dirty1:I

.field final synthetic $itemBeingRemoved$delegate:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onEditPaymentMethod:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onSetDefault:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $showBottomSheetContent:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LPm0;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LEX2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LPm0;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/Unit;",
            ">;I",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            "Lkotlin/Unit;",
            ">;",
            "LEX2<",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1;->$showBottomSheetContent:Lkotlin/jvm/functions/Function1;

    iput p2, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1;->$$dirty1:I

    iput-object p3, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1;->$onEditPaymentMethod:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1;->$onSetDefault:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1;->$itemBeingRemoved$delegate:LEX2;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    invoke-virtual {p0, p1}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1;->invoke(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)V
    .locals 9

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1;->$showBottomSheetContent:Lkotlin/jvm/functions/Function1;

    new-instance v8, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1;

    iget v4, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1;->$$dirty1:I

    iget-object v5, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1;->$onEditPaymentMethod:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1;->$onSetDefault:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1;->$itemBeingRemoved$delegate:LEX2;

    move-object v1, v8

    move-object v2, p1

    move-object v3, v0

    invoke-direct/range {v1 .. v7}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1;-><init>(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LEX2;)V

    const p1, 0x4cac214f    # 9.0245752E7f

    const/4 v1, 0x1

    invoke-static {p1, v1, v8}, Ljt0;->c(IZLjava/lang/Object;)Lht0;

    move-result-object p1

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

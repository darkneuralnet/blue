.class final Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1;->invoke(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "LPm0;",
        "LEt0;",
        "Ljava/lang/Integer;",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nWalletScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletScreen.kt\ncom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,545:1\n36#2:546\n1057#3,6:547\n*S KotlinDebug\n*F\n+ 1 WalletScreen.kt\ncom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1\n*L\n274#1:546\n274#1:547,6\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty1:I

.field final synthetic $it:Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

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
.method public constructor <init>(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;LEX2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;",
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

    iput-object p1, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1;->$it:Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    iput-object p2, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1;->$showBottomSheetContent:Lkotlin/jvm/functions/Function1;

    iput p3, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1;->$$dirty1:I

    iput-object p4, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1;->$onEditPaymentMethod:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1;->$onSetDefault:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1;->$itemBeingRemoved$delegate:LEX2;

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LPm0;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1;->invoke(LPm0;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LPm0;LEt0;I)V
    .locals 9

    const-string v0, "$this$invoke"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x51

    const/16 v0, 0x10

    if-ne p1, v0, :cond_1

    invoke-interface {p2}, LEt0;->b()Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LEt0;->k()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.stripe.android.link.ui.wallet.WalletBody.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (WalletScreen.kt:258)"

    const v1, 0x4cac214f    # 9.0245752E7f

    invoke-static {v1, p3, p1, v0}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object v2, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1;->$it:Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    new-instance v3, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1$1;

    iget-object p1, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1;->$showBottomSheetContent:Lkotlin/jvm/functions/Function1;

    iget-object p3, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1;->$onEditPaymentMethod:Lkotlin/jvm/functions/Function1;

    invoke-direct {v3, p1, p3, v2}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1$1;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)V

    new-instance v4, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1$2;

    iget-object p1, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1;->$showBottomSheetContent:Lkotlin/jvm/functions/Function1;

    iget-object p3, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1;->$onSetDefault:Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1;->$it:Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    invoke-direct {v4, p1, p3, v0}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1$2;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;)V

    new-instance v5, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1$3;

    iget-object p1, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1;->$showBottomSheetContent:Lkotlin/jvm/functions/Function1;

    iget-object p3, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1;->$it:Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;

    iget-object v0, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1;->$itemBeingRemoved$delegate:LEX2;

    invoke-direct {v5, p1, p3, v0}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1$3;-><init>(Lkotlin/jvm/functions/Function1;Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;LEX2;)V

    iget-object p1, p0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1;->$showBottomSheetContent:Lkotlin/jvm/functions/Function1;

    const p3, 0x44faf204

    invoke-interface {p2, p3}, LEt0;->F(I)V

    invoke-interface {p2, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result p3

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_3

    sget-object p3, LEt0;->a:LEt0$a;

    invoke-virtual {p3}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object p3

    if-ne v0, p3, :cond_4

    :cond_3
    new-instance v0, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1$4$1;

    invoke-direct {v0, p1}, Lcom/stripe/android/link/ui/wallet/WalletScreenKt$WalletBody$14$1$2$1$1$4$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p2, v0}, LEt0;->z(Ljava/lang/Object;)V

    :cond_4
    invoke-interface {p2}, LEt0;->Q()V

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function0;

    sget v8, Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;->$stable:I

    move-object v7, p2

    invoke-static/range {v2 .. v8}, Lcom/stripe/android/link/ui/wallet/WalletPaymentMethodMenuKt;->WalletPaymentMethodMenu(Lcom/stripe/android/model/ConsumerPaymentDetails$PaymentDetails;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    :goto_1
    return-void
.end method

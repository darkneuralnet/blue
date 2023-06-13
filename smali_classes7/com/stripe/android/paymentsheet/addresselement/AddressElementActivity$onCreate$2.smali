.class final Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function2<",
        "LEt0;",
        "Ljava/lang/Integer;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\u000b\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "invoke",
        "(LEt0;I)V",
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
        "SMAP\nAddressElementActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddressElementActivity.kt\ncom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,163:1\n474#2,4:164\n478#2,2:172\n482#2:178\n25#3:168\n36#3:179\n1057#4,3:169\n1060#4,3:175\n1057#4,6:180\n474#5:174\n*S KotlinDebug\n*F\n+ 1 AddressElementActivity.kt\ncom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2\n*L\n81#1:164,4\n81#1:172,2\n81#1:178\n81#1:168\n83#1:179\n81#1:169,3\n81#1:175,3\n83#1:180,6\n81#1:174\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEt0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 11

    and-int/lit8 v0, p2, 0xb

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LEt0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LEt0;->k()V

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "com.stripe.android.paymentsheet.addresselement.AddressElementActivity.onCreate.<anonymous> (AddressElementActivity.kt:67)"

    const v2, 0x7468f458

    invoke-static {v2, p2, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v3, LHU2;->b:LHU2;

    const/4 v4, 0x0

    const/4 v5, 0x1

    new-instance v6, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2$modalBottomSheetState$1;

    iget-object p2, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;

    invoke-direct {v6, p2}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2$modalBottomSheetState$1;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)V

    const/16 v8, 0x186

    const/4 v9, 0x2

    move-object v7, p1

    invoke-static/range {v3 .. v9}, LFU2;->p(LHU2;Llf;ZLkotlin/jvm/functions/Function1;LEt0;II)LGU2;

    move-result-object p2

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;

    const/4 v1, 0x0

    new-array v1, v1, [Ld13;

    const/16 v2, 0x8

    invoke-static {v1, p1, v2}, LQY2;->a([Ld13;LEt0;I)LOY2;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->access$setNavController$p(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;LOY2;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;

    invoke-static {v0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->access$getViewModel(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;->getNavigator()Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;

    move-result-object v0

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;

    invoke-static {v1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->access$getNavController$p(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)LOY2;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_3

    const-string v1, "navController"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v2

    :cond_3
    invoke-virtual {v0, v1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;->setNavigationController(LOY2;)V

    const v0, 0x2e20b340

    invoke-interface {p1, v0}, LEt0;->F(I)V

    const v0, -0x1d58f75c

    invoke-interface {p1, v0}, LEt0;->F(I)V

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v3

    if-ne v0, v3, :cond_4

    sget-object v0, Lkotlin/coroutines/EmptyCoroutineContext;->INSTANCE:Lkotlin/coroutines/EmptyCoroutineContext;

    invoke-static {v0, p1}, LY91;->j(Lkotlin/coroutines/CoroutineContext;LEt0;)LZC0;

    move-result-object v0

    new-instance v3, Liu0;

    invoke-direct {v3, v0}, Liu0;-><init>(LZC0;)V

    invoke-interface {p1, v3}, LEt0;->z(Ljava/lang/Object;)V

    move-object v0, v3

    :cond_4
    invoke-interface {p1}, LEt0;->Q()V

    check-cast v0, Liu0;

    invoke-virtual {v0}, Liu0;->a()LZC0;

    move-result-object v0

    invoke-interface {p1}, LEt0;->Q()V

    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    const v4, 0x44faf204

    invoke-interface {p1, v4}, LEt0;->F(I)V

    invoke-interface {p1, p2}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v4

    invoke-interface {p1}, LEt0;->G()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_5

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v5, v1, :cond_6

    :cond_5
    new-instance v5, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2$1$1;

    invoke-direct {v5, p2, v2}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2$1$1;-><init>(LGU2;Lkotlin/coroutines/Continuation;)V

    invoke-interface {p1, v5}, LEt0;->z(Ljava/lang/Object;)V

    :cond_6
    invoke-interface {p1}, LEt0;->Q()V

    check-cast v5, Lkotlin/jvm/functions/Function2;

    const/16 v1, 0x46

    invoke-static {v3, v5, p1, v1}, LY91;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    new-instance v4, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2$2;

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;

    invoke-direct {v4, p2, v5, v2}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2$2;-><init>(LGU2;Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;Lkotlin/coroutines/Continuation;)V

    invoke-static {v3, v4, p1, v1}, LY91;->f(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;LEt0;I)V

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;

    invoke-static {v1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;->access$getViewModel(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementViewModel;->getNavigator()Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;

    move-result-object v1

    new-instance v2, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2$3;

    iget-object v3, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;

    invoke-direct {v2, v3, v0, p2}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2$3;-><init>(Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;LZC0;LGU2;)V

    invoke-virtual {v1, v2}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementNavigator;->setOnDismiss(Lkotlin/jvm/functions/Function1;)V

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    new-instance v0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2$4;

    iget-object v1, p0, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2;->this$0:Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;

    invoke-direct {v0, p2, v1}, Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity$onCreate$2$4;-><init>(LGU2;Lcom/stripe/android/paymentsheet/addresselement/AddressElementActivity;)V

    const p2, 0x3e42f806

    const/4 v1, 0x1

    invoke-static {p1, p2, v1, v0}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v7

    const/16 v9, 0xc00

    const/4 v10, 0x7

    move-object v8, p1

    invoke-static/range {v4 .. v10}, Lcom/stripe/android/uicore/StripeThemeKt;->StripeTheme(Lcom/stripe/android/uicore/StripeColors;Lcom/stripe/android/uicore/StripeShapes;Lcom/stripe/android/uicore/StripeTypography;Lkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    :goto_1
    return-void
.end method

.class final Lcom/stripe/android/view/CardInputWidget$initView$12;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/view/CardInputWidget;->initView(Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lcom/stripe/android/model/CardBrand;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0002\u0008\u0004"
    }
    d2 = {
        "<anonymous>",
        "",
        "brand",
        "Lcom/stripe/android/model/CardBrand;",
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
.field final synthetic this$0:Lcom/stripe/android/view/CardInputWidget;


# direct methods
.method public constructor <init>(Lcom/stripe/android/view/CardInputWidget;)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/view/CardInputWidget$initView$12;->this$0:Lcom/stripe/android/view/CardInputWidget;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/stripe/android/model/CardBrand;

    invoke-virtual {p0, p1}, Lcom/stripe/android/view/CardInputWidget$initView$12;->invoke(Lcom/stripe/android/model/CardBrand;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lcom/stripe/android/model/CardBrand;)V
    .locals 1

    const-string v0, "brand"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/view/CardInputWidget$initView$12;->this$0:Lcom/stripe/android/view/CardInputWidget;

    invoke-virtual {v0}, Lcom/stripe/android/view/CardInputWidget;->getCardBrandView$payments_core_release()Lcom/stripe/android/view/CardBrandView;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/stripe/android/view/CardBrandView;->setBrand(Lcom/stripe/android/model/CardBrand;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget$initView$12;->this$0:Lcom/stripe/android/view/CardInputWidget;

    invoke-virtual {p1}, Lcom/stripe/android/view/CardInputWidget;->getCardNumberEditText$payments_core_release()Lcom/stripe/android/view/CardNumberEditText;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/view/CardNumberEditText;->getPanLength$payments_core_release()I

    move-result v0

    invoke-virtual {p1, v0}, Lcom/stripe/android/view/CardInputWidget;->createHiddenCardText$payments_core_release(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/stripe/android/view/CardInputWidget;->access$setHiddenCardText$p(Lcom/stripe/android/view/CardInputWidget;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/stripe/android/view/CardInputWidget$initView$12;->this$0:Lcom/stripe/android/view/CardInputWidget;

    invoke-static {p1}, Lcom/stripe/android/view/CardInputWidget;->access$updateCvc(Lcom/stripe/android/view/CardInputWidget;)V

    return-void
.end method

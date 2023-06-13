.class final Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5;->invoke(Lh10;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lyo2;",
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
        "SMAP\nPaymentOptionsUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentOptionsUI.kt\ncom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,269:1\n136#2,12:270\n*S KotlinDebug\n*F\n+ 1 PaymentOptionsUI.kt\ncom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1\n*L\n72#1:270,12\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $isEditing:Z

.field final synthetic $isProcessing:Z

.field final synthetic $onAddCardPressed:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onItemRemoved:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onItemSelected:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $state:Lcom/stripe/android/paymentsheet/PaymentOptionsState;

.field final synthetic $width:F


# direct methods
.method public constructor <init>(Lcom/stripe/android/paymentsheet/PaymentOptionsState;ZZFLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/paymentsheet/PaymentOptionsState;",
            "ZZF",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/paymentsheet/model/PaymentSelection;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lcom/stripe/android/model/PaymentMethod;",
            "Lkotlin/Unit;",
            ">;I)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1;->$state:Lcom/stripe/android/paymentsheet/PaymentOptionsState;

    iput-boolean p2, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1;->$isProcessing:Z

    iput-boolean p3, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1;->$isEditing:Z

    iput p4, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1;->$width:F

    iput-object p5, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1;->$onAddCardPressed:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1;->$onItemSelected:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1;->$onItemRemoved:Lkotlin/jvm/functions/Function1;

    iput p8, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1;->$$dirty:I

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lyo2;

    invoke-virtual {p0, p1}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1;->invoke(Lyo2;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lyo2;)V
    .locals 13

    const-string v0, "$this$LazyRow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1;->$state:Lcom/stripe/android/paymentsheet/PaymentOptionsState;

    invoke-virtual {v0}, Lcom/stripe/android/paymentsheet/PaymentOptionsState;->getItems()Ljava/util/List;

    move-result-object v2

    iget-boolean v3, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1;->$isProcessing:Z

    iget-boolean v4, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1;->$isEditing:Z

    iget-object v5, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1;->$state:Lcom/stripe/android/paymentsheet/PaymentOptionsState;

    iget v6, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1;->$width:F

    iget-object v7, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1;->$onAddCardPressed:Lkotlin/jvm/functions/Function0;

    iget-object v8, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1;->$onItemSelected:Lkotlin/jvm/functions/Function1;

    iget-object v9, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1;->$onItemRemoved:Lkotlin/jvm/functions/Function1;

    iget v10, p0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1;->$$dirty:I

    sget-object v0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1$invoke$$inlined$items$default$1;->INSTANCE:Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1$invoke$$inlined$items$default$1;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v11

    new-instance v12, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1$invoke$$inlined$items$default$3;

    invoke-direct {v12, v0, v2}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1$invoke$$inlined$items$default$3;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1$invoke$$inlined$items$default$4;

    move-object v1, v0

    invoke-direct/range {v1 .. v10}, Lcom/stripe/android/paymentsheet/ui/PaymentOptionsUIKt$PaymentOptions$5$1$invoke$$inlined$items$default$4;-><init>(Ljava/util/List;ZZLcom/stripe/android/paymentsheet/PaymentOptionsState;FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    const v1, -0x25b7f321

    const/4 v2, 0x1

    invoke-static {v1, v2, v0}, Ljt0;->c(IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p1, v11, v1, v12, v0}, Lyo2;->c(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V

    return-void
.end method

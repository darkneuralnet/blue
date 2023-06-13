.class final Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/PaymentOptionUiKt;->PaymentOptionUi-VPtddqc(FZZZILgV2;Lpm0;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;LEt0;III)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Le10;",
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
        "SMAP\nPaymentOptionUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentOptionUi.kt\ncom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,258:1\n36#2:259\n1057#3,6:260\n154#4:266\n154#4:267\n*S KotlinDebug\n*F\n+ 1 PaymentOptionUi.kt\ncom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$1\n*L\n76#1:259\n76#1:260,6\n77#1:266\n83#1:267\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty1:I

.field final synthetic $isEditing:Z

.field final synthetic $isSelected:Z

.field final synthetic $onRemoveAccessibilityDescription:Ljava/lang/String;

.field final synthetic $openRemoveDialog:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ZLjava/lang/String;LEX2;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            "LEX2<",
            "Ljava/lang/Boolean;",
            ">;IZ)V"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$1;->$isEditing:Z

    iput-object p2, p0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$1;->$onRemoveAccessibilityDescription:Ljava/lang/String;

    iput-object p3, p0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$1;->$openRemoveDialog:LEX2;

    iput p4, p0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$1;->$$dirty1:I

    iput-boolean p5, p0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$1;->$isSelected:Z

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Le10;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$1;->invoke(Le10;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Le10;LEt0;I)V
    .locals 6

    const-string v0, "$this$BadgedBox"

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

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, -0x1

    const-string v0, "com.stripe.android.paymentsheet.PaymentOptionUi.<anonymous> (PaymentOptionUi.kt:71)"

    const v1, -0x185c7388

    invoke-static {v1, p3, p1, v0}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    const p1, 0x6684c255

    invoke-interface {p2, p1}, LEt0;->F(I)V

    iget-boolean p1, p0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$1;->$isEditing:Z

    const/4 p3, 0x6

    if-eqz p1, :cond_5

    iget-object v0, p0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$1;->$onRemoveAccessibilityDescription:Ljava/lang/String;

    iget-object p1, p0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$1;->$openRemoveDialog:LEX2;

    const v1, 0x44faf204

    invoke-interface {p2, v1}, LEt0;->F(I)V

    invoke-interface {p2, p1}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    invoke-interface {p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_3

    sget-object v1, LEt0;->a:LEt0$a;

    invoke-virtual {v1}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v1

    if-ne v2, v1, :cond_4

    :cond_3
    new-instance v2, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$1$1$1;

    invoke-direct {v2, p1}, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$1$1$1;-><init>(LEX2;)V

    invoke-interface {p2, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_4
    invoke-interface {p2}, LEt0;->Q()V

    move-object v1, v2

    check-cast v1, Lkotlin/jvm/functions/Function0;

    sget-object p1, LgV2;->b0:LgV2$a;

    const/16 v2, -0xe

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v2

    const/4 v3, 0x1

    int-to-float v3, v3

    invoke-static {v3}, Lk61;->g(F)F

    move-result v3

    invoke-static {p1, v2, v3}, LFe3;->b(LgV2;FF)LgV2;

    move-result-object v2

    iget p1, p0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$1;->$$dirty1:I

    shr-int/2addr p1, p3

    and-int/lit8 p1, p1, 0xe

    or-int/lit16 v4, p1, 0x180

    const/4 v5, 0x0

    move-object v3, p2

    invoke-static/range {v0 .. v5}, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt;->access$RemoveBadge(Ljava/lang/String;Lkotlin/jvm/functions/Function0;LgV2;LEt0;II)V

    :cond_5
    invoke-interface {p2}, LEt0;->Q()V

    iget-boolean p1, p0, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt$PaymentOptionUi$1;->$isSelected:Z

    if-eqz p1, :cond_6

    sget-object p1, LgV2;->b0:LgV2$a;

    const/16 v0, -0x12

    int-to-float v0, v0

    invoke-static {v0}, Lk61;->g(F)F

    move-result v0

    const/16 v1, 0x3a

    int-to-float v1, v1

    invoke-static {v1}, Lk61;->g(F)F

    move-result v1

    invoke-static {p1, v0, v1}, LFe3;->b(LgV2;FF)LgV2;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p1, p2, p3, v0}, Lcom/stripe/android/paymentsheet/PaymentOptionUiKt;->access$SelectedBadge(LgV2;LEt0;II)V

    :cond_6
    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    :goto_1
    return-void
.end method

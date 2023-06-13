.class final Lcom/stripe/android/paymentsheet/ui/PrimaryButtonKt$LabelUI$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/paymentsheet/ui/PrimaryButtonKt;->LabelUI(Ljava/lang/String;LEt0;I)V
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
        "SMAP\nPrimaryButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimaryButton.kt\ncom/stripe/android/paymentsheet/ui/PrimaryButtonKt$LabelUI$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,254:1\n154#2:255\n*S KotlinDebug\n*F\n+ 1 PrimaryButton.kt\ncom/stripe/android/paymentsheet/ui/PrimaryButtonKt$LabelUI$1\n*L\n250#1:255\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $label:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonKt$LabelUI$1;->$label:Ljava/lang/String;

    iput p2, p0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonKt$LabelUI$1;->$$dirty:I

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonKt$LabelUI$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 28

    move-object/from16 v0, p0

    move/from16 v1, p2

    and-int/lit8 v2, v1, 0xb

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-interface/range {p1 .. p1}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface/range {p1 .. p1}, LEt0;->k()V

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.paymentsheet.ui.LabelUI.<anonymous> (PrimaryButton.kt:243)"

    const v4, 0x31e53ef

    invoke-static {v4, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, Lr06;->b:Lr06$a;

    invoke-virtual {v1}, Lr06$a;->a()I

    move-result v1

    sget-object v2, Lcom/stripe/android/uicore/StripeTheme;->INSTANCE:Lcom/stripe/android/uicore/StripeTheme;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/StripeTheme;->getPrimaryButtonStyle()Lcom/stripe/android/uicore/PrimaryButtonStyle;

    move-result-object v2

    sget v3, Lcom/stripe/android/uicore/PrimaryButtonStyle;->$stable:I

    move-object/from16 v15, p1

    invoke-static {v2, v15, v3}, Lcom/stripe/android/uicore/StripeThemeKt;->getComposeTextStyle(Lcom/stripe/android/uicore/PrimaryButtonStyle;LEt0;I)LG26;

    move-result-object v23

    sget-object v2, LgV2;->b0:LgV2$a;

    const/4 v3, 0x4

    int-to-float v3, v3

    invoke-static {v3}, Lk61;->g(F)F

    move-result v4

    invoke-static {v3}, Lk61;->g(F)F

    move-result v5

    invoke-static {v3}, Lk61;->g(F)F

    move-result v3

    const/4 v6, 0x5

    int-to-float v6, v6

    invoke-static {v6}, Lk61;->g(F)F

    move-result v6

    invoke-static {v2, v4, v3, v5, v6}, LND3;->l(LgV2;FFFF)LgV2;

    move-result-object v5

    iget-object v4, v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonKt$LabelUI$1;->$label:Ljava/lang/String;

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v2, 0x0

    move-object v15, v2

    invoke-static {v1}, Lr06;->g(I)Lr06;

    move-result-object v16

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    iget v1, v0, Lcom/stripe/android/paymentsheet/ui/PrimaryButtonKt$LabelUI$1;->$$dirty:I

    and-int/lit8 v25, v1, 0xe

    const/16 v26, 0x0

    const/16 v27, 0x7dfc

    move-object/from16 v24, p1

    invoke-static/range {v4 .. v27}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    return-void
.end method

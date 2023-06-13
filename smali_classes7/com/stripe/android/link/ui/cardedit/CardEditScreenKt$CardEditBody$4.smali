.class final Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt;->CardEditBody(ZZZZLcom/stripe/android/link/ui/ErrorMessage;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;LEt0;I)V
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
        "SMAP\nCardEditScreen.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardEditScreen.kt\ncom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,193:1\n154#2:194\n*S KotlinDebug\n*F\n+ 1 CardEditScreen.kt\ncom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4\n*L\n132#1:194\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

.field final synthetic $formContent:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "LPm0;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $isDefault:Z

.field final synthetic $isProcessing:Z

.field final synthetic $onCancelClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onPrimaryButtonClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $onSetAsDefaultClick:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $primaryButtonEnabled:Z

.field final synthetic $setAsDefaultChecked:Z


# direct methods
.method public constructor <init>(Lcom/stripe/android/link/ui/ErrorMessage;ZZLkotlin/jvm/functions/Function0;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;ZZLkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/link/ui/ErrorMessage;",
            "ZZ",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;I",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LPm0;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;ZZ",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Boolean;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4;->$errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    iput-boolean p2, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4;->$isProcessing:Z

    iput-boolean p3, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4;->$primaryButtonEnabled:Z

    iput-object p4, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4;->$onPrimaryButtonClick:Lkotlin/jvm/functions/Function0;

    iput p5, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4;->$$dirty:I

    iput-object p6, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4;->$onCancelClick:Lkotlin/jvm/functions/Function0;

    iput-object p7, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4;->$formContent:Lkotlin/jvm/functions/Function3;

    iput-boolean p8, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4;->$setAsDefaultChecked:Z

    iput-boolean p9, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4;->$isDefault:Z

    iput-object p10, p0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4;->$onSetAsDefaultClick:Lkotlin/jvm/functions/Function1;

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

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4;->invoke(LPm0;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LPm0;LEt0;I)V
    .locals 35

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    move-object/from16 v9, p2

    const-string v1, "$this$ScrollableTopLevelColumn"

    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p3, 0xe

    const/4 v2, 0x4

    if-nez v1, :cond_1

    invoke-interface {v9, v10}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p3, v1

    move v8, v1

    goto :goto_1

    :cond_1
    move/from16 v8, p3

    :goto_1
    and-int/lit8 v1, v8, 0x5b

    const/16 v3, 0x12

    if-ne v1, v3, :cond_3

    invoke-interface/range {p2 .. p2}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LEt0;->k()V

    goto/16 :goto_5

    :cond_3
    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, -0x1

    const-string v3, "com.stripe.android.link.ui.cardedit.CardEditBody.<anonymous> (CardEditScreen.kt:127)"

    const v4, 0x7cae5327

    invoke-static {v4, v8, v1, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    sget v7, Lcom/stripe/android/link/R$string;->wallet_update_card:I

    const/4 v6, 0x0

    invoke-static {v7, v9, v6}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v11

    sget-object v12, LgV2;->b0:LgV2$a;

    const/4 v13, 0x0

    int-to-float v1, v2

    invoke-static {v1}, Lk61;->g(F)F

    move-result v14

    const/4 v15, 0x0

    const/16 v1, 0x20

    int-to-float v1, v1

    invoke-static {v1}, Lk61;->g(F)F

    move-result v16

    const/16 v17, 0x5

    const/16 v18, 0x0

    invoke-static/range {v12 .. v18}, LND3;->m(LgV2;FFFFILjava/lang/Object;)LgV2;

    move-result-object v12

    sget-object v1, Lr06;->b:Lr06$a;

    invoke-virtual {v1}, Lr06$a;->a()I

    move-result v1

    sget-object v2, LTM2;->a:LTM2;

    sget v3, LTM2;->b:I

    invoke-virtual {v2, v9, v3}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v4

    invoke-virtual {v4}, LGc6;->g()LG26;

    move-result-object v30

    invoke-virtual {v2, v9, v3}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v2

    invoke-virtual {v2}, LMm0;->g()J

    move-result-wide v13

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    invoke-static {v1}, Lr06;->g(I)Lr06;

    move-result-object v23

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v32, 0x30

    const/16 v33, 0x0

    const/16 v34, 0x7df8

    move-object/from16 v31, p2

    invoke-static/range {v11 .. v34}, Lc26;->e(Ljava/lang/String;LgV2;JJLEw1;LJw1;Lkw1;JLR06;Lr06;JIZILkotlin/jvm/functions/Function1;LG26;LEt0;III)V

    new-instance v11, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4$1;

    iget-object v2, v0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4;->$formContent:Lkotlin/jvm/functions/Function3;

    iget v5, v0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4;->$$dirty:I

    iget-boolean v12, v0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4;->$setAsDefaultChecked:Z

    iget-boolean v13, v0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4;->$isDefault:Z

    iget-boolean v14, v0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4;->$isProcessing:Z

    iget-object v15, v0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4;->$onSetAsDefaultClick:Lkotlin/jvm/functions/Function1;

    move-object v1, v11

    move-object/from16 v3, p1

    move v4, v8

    move v6, v12

    move v12, v7

    move v7, v13

    move v13, v8

    move v8, v14

    move-object v14, v9

    move-object v9, v15

    invoke-direct/range {v1 .. v9}, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4$1;-><init>(Lkotlin/jvm/functions/Function3;LPm0;IIZZZLkotlin/jvm/functions/Function1;)V

    const v1, -0x1c35d105

    const/4 v15, 0x1

    invoke-static {v14, v1, v15, v11}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v1

    const/4 v2, 0x6

    invoke-static {v1, v14, v2}, Lcom/stripe/android/link/theme/ColorKt;->StripeThemeForLink(Lkotlin/jvm/functions/Function2;LEt0;I)V

    iget-object v1, v0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4;->$errorMessage:Lcom/stripe/android/link/ui/ErrorMessage;

    if-eqz v1, :cond_5

    move v2, v15

    goto :goto_3

    :cond_5
    const/4 v2, 0x0

    :goto_3
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    new-instance v7, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4$2;

    invoke-direct {v7, v1}, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4$2;-><init>(Lcom/stripe/android/link/ui/ErrorMessage;)V

    const v1, -0x4be60201

    invoke-static {v14, v1, v15, v7}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v7

    const/high16 v1, 0x180000

    and-int/lit8 v8, v13, 0xe

    or-int v9, v8, v1

    const/16 v11, 0x1e

    move-object/from16 v1, p1

    move-object/from16 v8, p2

    move v10, v11

    invoke-static/range {v1 .. v10}, LSe;->b(LPm0;ZLgV2;LZe1;Lgi1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;LEt0;II)V

    const/4 v9, 0x0

    invoke-static {v12, v14, v9}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v1

    iget-boolean v2, v0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4;->$isProcessing:Z

    if-eqz v2, :cond_6

    sget-object v2, Lcom/stripe/android/link/ui/PrimaryButtonState;->Processing:Lcom/stripe/android/link/ui/PrimaryButtonState;

    goto :goto_4

    :cond_6
    iget-boolean v2, v0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4;->$primaryButtonEnabled:Z

    if-eqz v2, :cond_7

    sget-object v2, Lcom/stripe/android/link/ui/PrimaryButtonState;->Enabled:Lcom/stripe/android/link/ui/PrimaryButtonState;

    goto :goto_4

    :cond_7
    sget-object v2, Lcom/stripe/android/link/ui/PrimaryButtonState;->Disabled:Lcom/stripe/android/link/ui/PrimaryButtonState;

    :goto_4
    iget-object v3, v0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4;->$onPrimaryButtonClick:Lkotlin/jvm/functions/Function0;

    const/4 v4, 0x0

    const/4 v5, 0x0

    iget v6, v0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4;->$$dirty:I

    shr-int/lit8 v6, v6, 0xc

    and-int/lit16 v7, v6, 0x380

    const/16 v8, 0x18

    move-object/from16 v6, p2

    invoke-static/range {v1 .. v8}, Lcom/stripe/android/link/ui/PrimaryButtonKt;->PrimaryButton(Ljava/lang/String;Lcom/stripe/android/link/ui/PrimaryButtonState;Lkotlin/jvm/functions/Function0;Ljava/lang/Integer;Ljava/lang/Integer;LEt0;II)V

    iget-boolean v1, v0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4;->$isProcessing:Z

    xor-int/2addr v1, v15

    sget v2, Lcom/stripe/android/link/R$string;->cancel:I

    invoke-static {v2, v14, v9}, LfS5;->c(ILEt0;I)Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4;->$onCancelClick:Lkotlin/jvm/functions/Function0;

    iget v4, v0, Lcom/stripe/android/link/ui/cardedit/CardEditScreenKt$CardEditBody$4;->$$dirty:I

    shr-int/lit8 v4, v4, 0xf

    and-int/lit16 v4, v4, 0x380

    invoke-static {v1, v2, v3, v14, v4}, Lcom/stripe/android/link/ui/PrimaryButtonKt;->SecondaryButton(ZLjava/lang/String;Lkotlin/jvm/functions/Function0;LEt0;I)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_8

    invoke-static {}, LQt0;->Y()V

    :cond_8
    :goto_5
    return-void
.end method

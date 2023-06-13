.class final Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$4;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/uicore/elements/OTPElementUIKt;->OTPInputBox(Ljava/lang/String;ZLcom/stripe/android/uicore/elements/OTPElement;ILBv1;LgV2;ZLcom/stripe/android/uicore/elements/OTPElementColors;LEt0;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function3<",
        "Lkotlin/jvm/functions/Function2<",
        "-",
        "LEt0;",
        "-",
        "Ljava/lang/Integer;",
        "+",
        "Lkotlin/Unit;",
        ">;",
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
        "SMAP\nOTPElementUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OTPElementUI.kt\ncom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$4\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,257:1\n1057#2,6:258\n*S KotlinDebug\n*F\n+ 1 OTPElementUI.kt\ncom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$4\n*L\n234#1:258,6\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $colors:Lcom/stripe/android/uicore/elements/OTPElementColors;

.field final synthetic $enabled:Z

.field final synthetic $isSelected:Z

.field final synthetic $value:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/stripe/android/uicore/elements/OTPElementColors;Ljava/lang/String;ZIZ)V
    .locals 0

    iput-object p1, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$4;->$colors:Lcom/stripe/android/uicore/elements/OTPElementColors;

    iput-object p2, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$4;->$value:Ljava/lang/String;

    iput-boolean p3, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$4;->$enabled:Z

    iput p4, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$4;->$$dirty:I

    iput-boolean p5, p0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$4;->$isSelected:Z

    const/4 p1, 0x3

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/jvm/functions/Function2;

    check-cast p2, LEt0;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    invoke-virtual {p0, p1, p2, p3}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$4;->invoke(Lkotlin/jvm/functions/Function2;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/jvm/functions/Function2;LEt0;I)V
    .locals 58
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "LEt0;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    move-object/from16 v6, p2

    const-string v1, "innerTextField"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p3, 0xe

    if-nez v1, :cond_1

    invoke-interface {v6, v3}, LEt0;->n(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p3, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p3

    :goto_1
    and-int/lit8 v2, v1, 0x5b

    const/16 v4, 0x12

    if-ne v2, v4, :cond_3

    invoke-interface/range {p2 .. p2}, LEt0;->b()Z

    move-result v2

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LEt0;->k()V

    goto/16 :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_4

    const/4 v2, -0x1

    const-string v4, "com.stripe.android.uicore.elements.OTPInputBox.<anonymous> (OTPElementUI.kt:219)"

    const v5, -0x528ebf8f

    invoke-static {v5, v1, v2, v4}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    sget-object v56, Lg16;->a:Lg16;

    sget-object v2, LEu6;->a:LEu6$a;

    invoke-virtual {v2}, LEu6$a;->a()LEu6;

    move-result-object v57

    invoke-interface/range {p2 .. p2}, LEt0;->G()Ljava/lang/Object;

    move-result-object v2

    sget-object v4, LEt0;->a:LEt0$a;

    invoke-virtual {v4}, LEt0$a;->a()Ljava/lang/Object;

    move-result-object v4

    if-ne v2, v4, :cond_5

    invoke-static {}, Lf62;->a()LrX2;

    move-result-object v2

    invoke-interface {v6, v2}, LEt0;->z(Ljava/lang/Object;)V

    :cond_5
    move-object v7, v2

    check-cast v7, LrX2;

    sget-object v2, LTM2;->a:LTM2;

    sget v4, LTM2;->b:I

    invoke-static {v2, v6, v4}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v5

    invoke-virtual {v5}, Lcom/stripe/android/uicore/StripeColors;->getOnComponent-0d7_KjU()J

    move-result-wide v9

    sget-object v5, Lpm0;->b:Lpm0$a;

    invoke-virtual {v5}, Lpm0$a;->f()J

    move-result-wide v13

    invoke-static {v2, v6, v4}, Lcom/stripe/android/uicore/StripeThemeKt;->getStripeColors(LTM2;LEt0;I)Lcom/stripe/android/uicore/StripeColors;

    move-result-object v2

    invoke-virtual {v2}, Lcom/stripe/android/uicore/StripeColors;->getTextCursor-0d7_KjU()J

    move-result-wide v15

    invoke-virtual {v5}, Lpm0$a;->f()J

    move-result-wide v19

    invoke-virtual {v5}, Lpm0$a;->f()J

    move-result-wide v23

    invoke-virtual {v5}, Lpm0$a;->f()J

    move-result-wide v21

    iget-object v2, v0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$4;->$colors:Lcom/stripe/android/uicore/elements/OTPElementColors;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/OTPElementColors;->getPlaceholder-0d7_KjU()J

    move-result-wide v47

    iget-object v2, v0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$4;->$colors:Lcom/stripe/android/uicore/elements/OTPElementColors;

    invoke-virtual {v2}, Lcom/stripe/android/uicore/elements/OTPElementColors;->getPlaceholder-0d7_KjU()J

    move-result-wide v49

    const-wide/16 v11, 0x0

    const-wide/16 v17, 0x0

    const-wide/16 v25, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    const-wide/16 v31, 0x0

    const-wide/16 v33, 0x0

    const-wide/16 v35, 0x0

    const-wide/16 v37, 0x0

    const-wide/16 v39, 0x0

    const-wide/16 v41, 0x0

    const-wide/16 v43, 0x0

    const-wide/16 v45, 0x0

    const v52, 0xdb0180

    const/16 v53, 0x0

    const/16 v54, 0x30

    const v55, 0x7ff12

    move-object/from16 v8, v56

    move-object/from16 v51, p2

    invoke-virtual/range {v8 .. v55}, Lg16;->l(JJJJJJJJJJJJJJJJJJJJJLEt0;IIII)Ld16;

    move-result-object v13

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v15, 0x3

    invoke-static {v4, v4, v15, v2}, LND3;->c(FFILjava/lang/Object;)LPD3;

    move-result-object v14

    iget-object v2, v0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$4;->$value:Ljava/lang/String;

    iget-boolean v4, v0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$4;->$enabled:Z

    const/4 v5, 0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    new-instance v10, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$4$2;

    iget-boolean v11, v0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$4;->$isSelected:Z

    invoke-direct {v10, v11}, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$4$2;-><init>(Z)V

    const v11, -0x4b480dcc

    const/4 v12, 0x1

    invoke-static {v6, v11, v12, v10}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v10

    const/4 v11, 0x0

    const/4 v12, 0x0

    iget v5, v0, Lcom/stripe/android/uicore/elements/OTPElementUIKt$OTPInputBox$4;->$$dirty:I

    and-int/lit8 v16, v5, 0xe

    const v17, 0x6036c00

    or-int v16, v16, v17

    shl-int/2addr v1, v15

    and-int/lit8 v1, v1, 0x70

    or-int v1, v16, v1

    shr-int/lit8 v5, v5, 0xc

    and-int/lit16 v5, v5, 0x380

    or-int v16, v1, v5

    const/16 v17, 0xd80

    const/16 v18, 0x6c0

    move-object/from16 v1, v56

    move-object/from16 v3, p1

    move-object/from16 v6, v57

    move-object/from16 v15, p2

    const/4 v5, 0x1

    invoke-virtual/range {v1 .. v18}, Lg16;->c(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLEu6;Le62;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Ld16;LPD3;LEt0;III)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
    :goto_3
    return-void
.end method

.class final Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3;->invoke(LEt0;I)V
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
        "SMAP\nLinkButtonView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkButtonView.kt\ncom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,166:1\n154#2:167\n*S KotlinDebug\n*F\n+ 1 LinkButtonView.kt\ncom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3$1\n*L\n80#1:167\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $email:Ljava/lang/String;

.field final synthetic $enabled:Z

.field final synthetic $modifier:LgV2;

.field final synthetic $onClick:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function0;LgV2;ZILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            "ZI",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3$1;->$onClick:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3$1;->$modifier:LgV2;

    iput-boolean p3, p0, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3$1;->$enabled:Z

    iput p4, p0, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3$1;->$$dirty:I

    iput-object p5, p0, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3$1;->$email:Ljava/lang/String;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v13, p1

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

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "com.stripe.android.link.ui.LinkButton.<anonymous>.<anonymous> (LinkButtonView.kt:72)"

    const v4, -0x2a28e4f4

    invoke-static {v4, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object v14, v0, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3$1;->$onClick:Lkotlin/jvm/functions/Function0;

    iget-object v1, v0, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3$1;->$modifier:LgV2;

    invoke-static {}, Lcom/stripe/android/link/ui/LinkButtonViewKt;->access$getLinkButtonShape$p()Lbc5;

    move-result-object v2

    invoke-static {v1, v2}, LQk0;->a(LgV2;Lhy5;)LgV2;

    move-result-object v1

    const-string v2, "LinkButtonTestTag"

    invoke-static {v1, v2}, Lo06;->a(LgV2;Ljava/lang/String;)LgV2;

    move-result-object v15

    iget-boolean v12, v0, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3$1;->$enabled:Z

    const/16 v16, 0x0

    sget-object v10, Li70;->a:Li70;

    const/4 v1, 0x0

    int-to-float v1, v1

    invoke-static {v1}, Lk61;->g(F)F

    move-result v2

    invoke-static {v1}, Lk61;->g(F)F

    move-result v3

    invoke-static {v1}, Lk61;->g(F)F

    move-result v4

    invoke-static {v1}, Lk61;->g(F)F

    move-result v5

    invoke-static {v1}, Lk61;->g(F)F

    move-result v6

    sget v11, Li70;->l:I

    shl-int/lit8 v1, v11, 0xf

    or-int/lit16 v8, v1, 0x6db6

    const/4 v9, 0x0

    move-object v1, v10

    move-object/from16 v7, p1

    invoke-virtual/range {v1 .. v9}, Li70;->b(FFFFFLEt0;II)Lj70;

    move-result-object v17

    invoke-static {}, Lcom/stripe/android/link/ui/LinkButtonViewKt;->access$getLinkButtonShape$p()Lbc5;

    move-result-object v18

    const/16 v19, 0x0

    sget-object v1, LTM2;->a:LTM2;

    sget v2, LTM2;->b:I

    invoke-virtual {v1, v13, v2}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v3

    invoke-virtual {v3}, LMm0;->j()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    invoke-virtual {v1, v13, v2}, LTM2;->a(LEt0;I)LMm0;

    move-result-object v1

    invoke-virtual {v1}, LMm0;->j()J

    move-result-wide v7

    const-wide/16 v20, 0x0

    shl-int/lit8 v11, v11, 0xc

    const/16 v22, 0xa

    move-object v1, v10

    move-wide v2, v3

    move-wide v4, v5

    move-wide v6, v7

    move-wide/from16 v8, v20

    move-object/from16 v10, p1

    move/from16 v20, v12

    move/from16 v12, v22

    invoke-virtual/range {v1 .. v12}, Li70;->a(JJJJLEt0;II)Lh70;

    move-result-object v8

    invoke-static {}, Lcom/stripe/android/link/ui/LinkButtonViewKt;->access$getLinkButtonHorizontalPadding$p()F

    move-result v1

    invoke-static {}, Lcom/stripe/android/link/ui/LinkButtonViewKt;->access$getLinkButtonVerticalPadding$p()F

    move-result v2

    invoke-static {}, Lcom/stripe/android/link/ui/LinkButtonViewKt;->access$getLinkButtonHorizontalPadding$p()F

    move-result v3

    invoke-static {}, Lcom/stripe/android/link/ui/LinkButtonViewKt;->access$getLinkButtonVerticalPadding$p()F

    move-result v4

    invoke-static {v1, v2, v3, v4}, LND3;->d(FFFF)LPD3;

    move-result-object v9

    new-instance v1, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3$1$1;

    iget-object v2, v0, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3$1;->$email:Ljava/lang/String;

    invoke-direct {v1, v2}, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3$1$1;-><init>(Ljava/lang/String;)V

    const v2, -0x40aa2104

    const/4 v3, 0x1

    invoke-static {v13, v2, v3, v1}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v10

    iget v1, v0, Lcom/stripe/android/link/ui/LinkButtonViewKt$LinkButton$3$1;->$$dirty:I

    shr-int/lit8 v2, v1, 0x6

    and-int/lit8 v2, v2, 0xe

    const/high16 v3, 0x36030000

    or-int/2addr v2, v3

    shl-int/lit8 v1, v1, 0x3

    and-int/lit16 v1, v1, 0x380

    or-int v12, v2, v1

    const/16 v21, 0x48

    move-object v1, v14

    move-object v2, v15

    move/from16 v3, v20

    move-object/from16 v4, v16

    move-object/from16 v5, v17

    move-object/from16 v6, v18

    move-object/from16 v7, v19

    move-object/from16 v11, p1

    move/from16 v13, v21

    invoke-static/range {v1 .. v13}, Lk70;->a(Lkotlin/jvm/functions/Function0;LgV2;ZLrX2;Lj70;Lhy5;LeZ;Lh70;LPD3;Lkotlin/jvm/functions/Function3;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    return-void
.end method

.class final Lcom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/stripe/android/financialconnections/ui/components/ButtonKt;->FinancialConnectionsButton(Lkotlin/jvm/functions/Function0;LgV2;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;ZZLkotlin/jvm/functions/Function3;LEt0;II)V
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
        "SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\ncom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,241:1\n154#2:242\n154#2:243\n154#2:244\n154#2:245\n154#2:246\n*S KotlinDebug\n*F\n+ 1 Button.kt\ncom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1\n*L\n57#1:242\n58#1:243\n59#1:244\n60#1:245\n61#1:246\n*E\n"
    }
.end annotation


# instance fields
.field final synthetic $$dirty:I

.field final synthetic $content:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "LZc5;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic $enabled:Z

.field final synthetic $loading:Z

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

.field final synthetic $size:Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;

.field final synthetic $type:Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;


# direct methods
.method public constructor <init>(Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;ILcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;Lkotlin/jvm/functions/Function0;LgV2;ZZLkotlin/jvm/functions/Function3;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;",
            "I",
            "Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            "ZZ",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LZc5;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1;->$size:Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;

    iput p2, p0, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1;->$$dirty:I

    iput-object p3, p0, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1;->$type:Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;

    iput-object p4, p0, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1;->$onClick:Lkotlin/jvm/functions/Function0;

    iput-object p5, p0, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1;->$modifier:LgV2;

    iput-boolean p6, p0, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1;->$enabled:Z

    iput-boolean p7, p0, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1;->$loading:Z

    iput-object p8, p0, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1;->$content:Lkotlin/jvm/functions/Function3;

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

    invoke-virtual {p0, p1, p2}, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 15

    move-object v0, p0

    move-object/from16 v11, p1

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

    const-string v3, "com.stripe.android.financialconnections.ui.components.FinancialConnectionsButton.<anonymous> (Button.kt:51)"

    const v4, 0x3363a3d8

    invoke-static {v4, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, Li70;->a:Li70;

    const/4 v2, 0x0

    int-to-float v2, v2

    invoke-static {v2}, Lk61;->g(F)F

    move-result v3

    invoke-static {v2}, Lk61;->g(F)F

    move-result v4

    invoke-static {v2}, Lk61;->g(F)F

    move-result v5

    invoke-static {v2}, Lk61;->g(F)F

    move-result v6

    invoke-static {v2}, Lk61;->g(F)F

    move-result v7

    sget v2, Li70;->l:I

    shl-int/lit8 v2, v2, 0xf

    or-int/lit16 v8, v2, 0x6db6

    const/4 v9, 0x0

    move v2, v3

    move v3, v4

    move v4, v5

    move v5, v6

    move v6, v7

    move-object/from16 v7, p1

    invoke-virtual/range {v1 .. v9}, Li70;->b(FFFFFLEt0;II)Lj70;

    move-result-object v5

    iget-object v1, v0, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1;->$size:Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;

    invoke-virtual {v1}, Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;->getRadius-D9Ej5fM()F

    move-result v1

    invoke-static {v1}, Lcc5;->d(F)Lbc5;

    move-result-object v6

    iget-object v1, v0, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1;->$size:Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;

    iget v2, v0, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1;->$$dirty:I

    shr-int/lit8 v2, v2, 0x9

    and-int/lit8 v2, v2, 0xe

    invoke-virtual {v1, v11, v2}, Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Size;->paddingValues(LEt0;I)LPD3;

    move-result-object v9

    iget-object v1, v0, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1;->$type:Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;

    iget v2, v0, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1;->$$dirty:I

    shr-int/lit8 v2, v2, 0x6

    and-int/lit8 v2, v2, 0xe

    invoke-virtual {v1, v11, v2}, Lcom/stripe/android/financialconnections/ui/components/FinancialConnectionsButton$Type;->buttonColors(LEt0;I)Lh70;

    move-result-object v8

    iget-object v1, v0, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1;->$onClick:Lkotlin/jvm/functions/Function0;

    iget-object v2, v0, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1;->$modifier:LgV2;

    iget-boolean v3, v0, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1;->$enabled:Z

    const/4 v4, 0x0

    const/4 v7, 0x0

    new-instance v10, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1$1;

    iget-boolean v12, v0, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1;->$loading:Z

    iget-object v13, v0, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1;->$content:Lkotlin/jvm/functions/Function3;

    iget v14, v0, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1;->$$dirty:I

    invoke-direct {v10, v12, v13, v14}, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1$1;-><init>(ZLkotlin/jvm/functions/Function3;I)V

    const v12, 0x7d5bb3c8

    const/4 v13, 0x1

    invoke-static {v11, v12, v13, v10}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v10

    iget v12, v0, Lcom/stripe/android/financialconnections/ui/components/ButtonKt$FinancialConnectionsButton$1;->$$dirty:I

    and-int/lit8 v13, v12, 0xe

    const/high16 v14, 0x30000000

    or-int/2addr v13, v14

    and-int/lit8 v14, v12, 0x70

    or-int/2addr v13, v14

    shr-int/lit8 v12, v12, 0x6

    and-int/lit16 v12, v12, 0x380

    or-int/2addr v12, v13

    const/16 v13, 0x48

    move-object/from16 v11, p1

    invoke-static/range {v1 .. v13}, Lk70;->a(Lkotlin/jvm/functions/Function0;LgV2;ZLrX2;Lj70;Lhy5;LeZ;Lh70;LPD3;Lkotlin/jvm/functions/Function3;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    return-void
.end method

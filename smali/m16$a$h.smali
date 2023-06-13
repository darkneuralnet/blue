.class public final Lm16$a$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm16$a;->a(FJJFLEt0;I)V
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
        "SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3$drawBorder$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,374:1\n67#2,6:375\n73#2:407\n77#2:412\n75#3:381\n76#3,11:383\n89#3:411\n76#4:382\n460#5,13:394\n473#5,3:408\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3$drawBorder$1\n*L\n193#1:375,6\n193#1:407\n193#1:412\n193#1:381\n193#1:383,11\n193#1:411\n193#1:382\n193#1:394,13\n193#1:408,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LEX2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LEX2<",
            "LxB5;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic h:LPD3;

.field public final synthetic i:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic j:I


# direct methods
.method public constructor <init>(LEX2;LPD3;Lkotlin/jvm/functions/Function2;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LEX2<",
            "LxB5;",
            ">;",
            "LPD3;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;I)V"
        }
    .end annotation

    iput-object p1, p0, Lm16$a$h;->g:LEX2;

    iput-object p2, p0, Lm16$a$h;->h:LPD3;

    iput-object p3, p0, Lm16$a$h;->i:Lkotlin/jvm/functions/Function2;

    iput p4, p0, Lm16$a$h;->j:I

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

    invoke-virtual {p0, p1, p2}, Lm16$a$h;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 9

    and-int/lit8 v0, p2, 0xb

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    invoke-interface {p1}, LEt0;->b()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, LEt0;->k()V

    goto/16 :goto_3

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:191)"

    const v2, 0x8568183

    invoke-static {v2, p2, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, LgV2;->b0:LgV2$a;

    const-string v0, "border"

    invoke-static {p2, v0}, Landroidx/compose/ui/layout/a;->b(LgV2;Ljava/lang/Object;)LgV2;

    move-result-object p2

    iget-object v0, p0, Lm16$a$h;->g:LEX2;

    invoke-interface {v0}, LEX2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LxB5;

    invoke-virtual {v0}, LxB5;->n()J

    move-result-wide v0

    iget-object v2, p0, Lm16$a$h;->h:LPD3;

    invoke-static {p2, v0, v1, v2}, LPz3;->j(LgV2;JLPD3;)LgV2;

    move-result-object p2

    iget-object v0, p0, Lm16$a$h;->i:Lkotlin/jvm/functions/Function2;

    iget v1, p0, Lm16$a$h;->j:I

    const v2, 0x2bb5b5d7

    invoke-interface {p1, v2}, LEt0;->F(I)V

    sget-object v2, LK9;->a:LK9$a;

    invoke-virtual {v2}, LK9$a;->n()LK9;

    move-result-object v2

    const/16 v3, 0x30

    const/4 v4, 0x1

    invoke-static {v2, v4, p1, v3}, Ld10;->h(LK9;ZLEt0;I)LxO2;

    move-result-object v2

    const v3, -0x4ee9b9da

    invoke-interface {p1, v3}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v3

    invoke-interface {p1, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v4

    invoke-interface {p1, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v5

    invoke-interface {p1, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LJq6;

    sget-object v6, LBt0;->M:LBt0$a;

    invoke-virtual {v6}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v7

    invoke-static {p2}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object p2

    invoke-interface {p1}, LEt0;->v()Llm;

    move-result-object v8

    instance-of v8, v8, Llm;

    if-nez v8, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface {p1}, LEt0;->h()V

    invoke-interface {p1}, LEt0;->t()Z

    move-result v8

    if-eqz v8, :cond_4

    invoke-interface {p1, v7}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_4
    invoke-interface {p1}, LEt0;->e()V

    :goto_1
    invoke-interface {p1}, LEt0;->L()V

    invoke-static {p1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v7

    invoke-virtual {v6}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v8

    invoke-static {v7, v2, v8}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v7, v3, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v7, v4, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v6}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v7, v5, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {p1}, LEt0;->q()V

    invoke-static {p1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v2

    invoke-static {v2}, LMB5;->a(LEt0;)LMB5;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p2, v2, p1, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const p2, 0x7ab4aae9

    invoke-interface {p1, p2}, LEt0;->F(I)V

    sget-object p2, Lf10;->a:Lf10;

    const p2, 0x6309a505

    invoke-interface {p1, p2}, LEt0;->F(I)V

    if-nez v0, :cond_5

    goto :goto_2

    :cond_5
    shr-int/lit8 p2, v1, 0xc

    and-int/lit8 p2, p2, 0xe

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {v0, p1, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    invoke-interface {p1}, LEt0;->Q()V

    invoke-interface {p1}, LEt0;->Q()V

    invoke-interface {p1}, LEt0;->f()V

    invoke-interface {p1}, LEt0;->Q()V

    invoke-interface {p1}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {}, LQt0;->Y()V

    :cond_6
    :goto_3
    return-void
.end method

.class public final LrQ2$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LrQ2;->a(LKX2;LEX2;LgV2;Lkotlin/jvm/functions/Function3;LEt0;II)V
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
        "SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/compose/material/MenuKt$DropdownMenuContent$2\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,298:1\n74#2,6:299\n80#2:331\n84#2:336\n75#3:305\n76#3,11:307\n89#3:335\n76#4:306\n460#5,13:318\n473#5,3:332\n*S KotlinDebug\n*F\n+ 1 Menu.kt\nandroidx/compose/material/MenuKt$DropdownMenuContent$2\n*L\n125#1:299,6\n125#1:331\n125#1:336\n125#1:305\n125#1:307,11\n125#1:335\n125#1:306\n125#1:318,13\n125#1:332,3\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LgV2;

.field public final synthetic h:Lkotlin/jvm/functions/Function3;
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

.field public final synthetic i:I


# direct methods
.method public constructor <init>(LgV2;Lkotlin/jvm/functions/Function3;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgV2;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LPm0;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;I)V"
        }
    .end annotation

    iput-object p1, p0, LrQ2$b;->g:LgV2;

    iput-object p2, p0, LrQ2$b;->h:Lkotlin/jvm/functions/Function3;

    iput p3, p0, LrQ2$b;->i:I

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

    invoke-virtual {p0, p1, p2}, LrQ2$b;->invoke(LEt0;I)V

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

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v1, "androidx.compose.material.DropdownMenuContent.<anonymous> (Menu.kt:123)"

    const v2, -0xe73c6b6

    invoke-static {v2, p2, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    iget-object p2, p0, LrQ2$b;->g:LgV2;

    invoke-static {}, LrQ2;->g()F

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p2, v2, v0, v3, v1}, LND3;->k(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object p2

    sget-object v0, Lb72;->c:Lb72;

    invoke-static {p2, v0}, LW62;->a(LgV2;Lb72;)LgV2;

    move-result-object v4

    const/4 p2, 0x0

    invoke-static {p2, p1, p2, v3}, LUp5;->a(ILEt0;II)LXp5;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/16 v9, 0xe

    const/4 v10, 0x0

    invoke-static/range {v4 .. v10}, LUp5;->d(LgV2;LXp5;ZLcu1;ZILjava/lang/Object;)LgV2;

    move-result-object p2

    iget-object v0, p0, LrQ2$b;->h:Lkotlin/jvm/functions/Function3;

    iget v1, p0, LrQ2$b;->i:I

    and-int/lit16 v1, v1, 0x1c00

    const v2, -0x1cd0f17e

    invoke-interface {p1, v2}, LEt0;->F(I)V

    sget-object v2, Llo;->a:Llo;

    invoke-virtual {v2}, Llo;->g()Llo$l;

    move-result-object v2

    sget-object v3, LK9;->a:LK9$a;

    invoke-virtual {v3}, LK9$a;->j()LK9$b;

    move-result-object v3

    shr-int/lit8 v4, v1, 0x3

    and-int/lit8 v5, v4, 0xe

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v4, v5

    invoke-static {v2, v3, p1, v4}, LOm0;->a(Llo$l;LK9$b;LEt0;I)LxO2;

    move-result-object v2

    shl-int/lit8 v3, v1, 0x3

    and-int/lit8 v3, v3, 0x70

    const v4, -0x4ee9b9da

    invoke-interface {p1, v4}, LEt0;->F(I)V

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v4

    invoke-interface {p1, v4}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v5

    invoke-interface {p1, v5}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v6

    invoke-interface {p1, v6}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LJq6;

    sget-object v7, LBt0;->M:LBt0$a;

    invoke-virtual {v7}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v8

    invoke-static {p2}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object p2

    shl-int/lit8 v3, v3, 0x9

    and-int/lit16 v3, v3, 0x1c00

    or-int/lit8 v3, v3, 0x6

    invoke-interface {p1}, LEt0;->v()Llm;

    move-result-object v9

    instance-of v9, v9, Llm;

    if-nez v9, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface {p1}, LEt0;->h()V

    invoke-interface {p1}, LEt0;->t()Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface {p1, v8}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_4
    invoke-interface {p1}, LEt0;->e()V

    :goto_1
    invoke-interface {p1}, LEt0;->L()V

    invoke-static {p1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v8

    invoke-virtual {v7}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v9

    invoke-static {v8, v2, v9}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v7}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v8, v4, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v7}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v8, v5, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v7}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object v2

    invoke-static {v8, v6, v2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-interface {p1}, LEt0;->q()V

    invoke-static {p1}, LMB5;->b(LEt0;)LEt0;

    move-result-object v2

    invoke-static {v2}, LMB5;->a(LEt0;)LMB5;

    move-result-object v2

    shr-int/lit8 v3, v3, 0x3

    and-int/lit8 v3, v3, 0x70

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p2, v2, p1, v3}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const p2, 0x7ab4aae9

    invoke-interface {p1, p2}, LEt0;->F(I)V

    sget-object p2, LQm0;->a:LQm0;

    shr-int/lit8 v1, v1, 0x6

    and-int/lit8 v1, v1, 0x70

    or-int/lit8 v1, v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, p2, p1, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, LEt0;->Q()V

    invoke-interface {p1}, LEt0;->f()V

    invoke-interface {p1}, LEt0;->Q()V

    invoke-interface {p1}, LEt0;->Q()V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    :goto_2
    return-void
.end method

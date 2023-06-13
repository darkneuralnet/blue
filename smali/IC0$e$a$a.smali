.class public final LIC0$e$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIC0$e$a;->invoke(LEt0;I)V
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
        "SMAP\nCoreTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$5$1$1\n+ 2 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,1087:1\n71#2,4:1088\n75#2,11:1093\n88#2:1118\n76#3:1092\n456#4,14:1104\n*S KotlinDebug\n*F\n+ 1 CoreTextField.kt\nandroidx/compose/foundation/text/CoreTextFieldKt$CoreTextField$5$1$1\n*L\n591#1:1088,4\n591#1:1093,11\n591#1:1118\n591#1:1092\n591#1:1104,14\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lx16;

.field public final synthetic h:LC16;

.field public final synthetic i:Z

.field public final synthetic j:Z

.field public final synthetic k:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Li26;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic l:LF16;

.field public final synthetic m:LHe3;

.field public final synthetic n:Lg01;

.field public final synthetic o:I


# direct methods
.method public constructor <init>(Lx16;LC16;ZZLkotlin/jvm/functions/Function1;LF16;LHe3;Lg01;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx16;",
            "LC16;",
            "ZZ",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Li26;",
            "Lkotlin/Unit;",
            ">;",
            "LF16;",
            "LHe3;",
            "Lg01;",
            "I)V"
        }
    .end annotation

    iput-object p1, p0, LIC0$e$a$a;->g:Lx16;

    iput-object p2, p0, LIC0$e$a$a;->h:LC16;

    iput-boolean p3, p0, LIC0$e$a$a;->i:Z

    iput-boolean p4, p0, LIC0$e$a$a;->j:Z

    iput-object p5, p0, LIC0$e$a$a;->k:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, LIC0$e$a$a;->l:LF16;

    iput-object p7, p0, LIC0$e$a$a;->m:LHe3;

    iput-object p8, p0, LIC0$e$a$a;->n:Lg01;

    iput p9, p0, LIC0$e$a$a;->o:I

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

    invoke-virtual {p0, p1, p2}, LIC0$e$a$a;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 10

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

    const-string v1, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous>.<anonymous> (CoreTextField.kt:589)"

    const v2, -0x15a57eaf

    invoke-static {v2, p2, v0, v1}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    new-instance p2, LIC0$e$a$a$a;

    iget-object v4, p0, LIC0$e$a$a;->h:LC16;

    iget-object v5, p0, LIC0$e$a$a;->k:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, LIC0$e$a$a;->l:LF16;

    iget-object v7, p0, LIC0$e$a$a;->m:LHe3;

    iget-object v8, p0, LIC0$e$a$a;->n:Lg01;

    iget v9, p0, LIC0$e$a$a;->o:I

    move-object v3, p2

    invoke-direct/range {v3 .. v9}, LIC0$e$a$a$a;-><init>(LC16;Lkotlin/jvm/functions/Function1;LF16;LHe3;Lg01;I)V

    const v0, -0x4ee9b9da

    invoke-interface {p1, v0}, LEt0;->F(I)V

    sget-object v0, LgV2;->b0:LgV2$a;

    invoke-static {}, Lhu0;->g()LU94;

    move-result-object v1

    invoke-interface {p1, v1}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg01;

    invoke-static {}, Lhu0;->l()LU94;

    move-result-object v2

    invoke-interface {p1, v2}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lpm2;

    invoke-static {}, Lhu0;->q()LU94;

    move-result-object v3

    invoke-interface {p1, v3}, LEt0;->c(Lfu0;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LJq6;

    sget-object v4, LBt0;->M:LBt0$a;

    invoke-virtual {v4}, LBt0$a;->a()Lkotlin/jvm/functions/Function0;

    move-result-object v5

    invoke-static {v0}, LAm2;->a(LgV2;)Lkotlin/jvm/functions/Function3;

    move-result-object v0

    invoke-interface {p1}, LEt0;->v()Llm;

    move-result-object v6

    instance-of v6, v6, Llm;

    if-nez v6, :cond_3

    invoke-static {}, Lyt0;->c()V

    :cond_3
    invoke-interface {p1}, LEt0;->h()V

    invoke-interface {p1}, LEt0;->t()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {p1, v5}, LEt0;->M(Lkotlin/jvm/functions/Function0;)V

    goto :goto_1

    :cond_4
    invoke-interface {p1}, LEt0;->e()V

    :goto_1
    invoke-static {p1}, Lbf6;->a(LEt0;)LEt0;

    move-result-object v5

    invoke-virtual {v4}, LBt0$a;->d()Lkotlin/jvm/functions/Function2;

    move-result-object v6

    invoke-static {v5, p2, v6}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v4}, LBt0$a;->b()Lkotlin/jvm/functions/Function2;

    move-result-object p2

    invoke-static {v5, v1, p2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v4}, LBt0$a;->c()Lkotlin/jvm/functions/Function2;

    move-result-object p2

    invoke-static {v5, v2, p2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v4}, LBt0$a;->f()Lkotlin/jvm/functions/Function2;

    move-result-object p2

    invoke-static {v5, v3, p2}, Lbf6;->b(LEt0;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    invoke-static {p1}, LMB5;->b(LEt0;)LEt0;

    move-result-object p2

    invoke-static {p2}, LMB5;->a(LEt0;)LMB5;

    move-result-object p2

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, p2, p1, v2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const p2, 0x7ab4aae9

    invoke-interface {p1, p2}, LEt0;->F(I)V

    invoke-interface {p1}, LEt0;->Q()V

    invoke-interface {p1}, LEt0;->f()V

    invoke-interface {p1}, LEt0;->Q()V

    iget-object p2, p0, LIC0$e$a$a;->g:Lx16;

    iget-object v0, p0, LIC0$e$a$a;->h:LC16;

    invoke-virtual {v0}, LC16;->c()LME1;

    move-result-object v0

    sget-object v2, LME1;->c:LME1;

    if-ne v0, v2, :cond_5

    iget-object v0, p0, LIC0$e$a$a;->h:LC16;

    invoke-virtual {v0}, LC16;->f()Lnm2;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p0, LIC0$e$a$a;->h:LC16;

    invoke-virtual {v0}, LC16;->f()Lnm2;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-interface {v0}, Lnm2;->F()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-boolean v0, p0, LIC0$e$a$a;->i:Z

    if-eqz v0, :cond_5

    const/4 v1, 0x1

    :cond_5
    const/16 v0, 0x8

    invoke-static {p2, v1, p1, v0}, LIC0;->f(Lx16;ZLEt0;I)V

    iget-object p2, p0, LIC0$e$a$a;->h:LC16;

    invoke-virtual {p2}, LC16;->c()LME1;

    move-result-object p2

    sget-object v1, LME1;->d:LME1;

    if-ne p2, v1, :cond_6

    iget-boolean p2, p0, LIC0$e$a$a;->j:Z

    if-nez p2, :cond_6

    iget-boolean p2, p0, LIC0$e$a$a;->i:Z

    if-eqz p2, :cond_6

    iget-object p2, p0, LIC0$e$a$a;->g:Lx16;

    invoke-static {p2, p1, v0}, LIC0;->d(Lx16;LEt0;I)V

    :cond_6
    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-static {}, LQt0;->Y()V

    :cond_7
    :goto_2
    return-void
.end method

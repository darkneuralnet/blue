.class public final LIC0$e$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIC0$e;->invoke(LEt0;I)V
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


# instance fields
.field public final synthetic g:LC16;

.field public final synthetic h:LG26;

.field public final synthetic i:I

.field public final synthetic j:I

.field public final synthetic k:Lv16;

.field public final synthetic l:LF16;

.field public final synthetic m:LEu6;

.field public final synthetic n:LgV2;

.field public final synthetic o:LgV2;

.field public final synthetic p:LgV2;

.field public final synthetic q:LgV2;

.field public final synthetic r:LE20;

.field public final synthetic s:Lx16;

.field public final synthetic t:Z

.field public final synthetic u:Z

.field public final synthetic v:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Li26;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic w:LHe3;

.field public final synthetic x:Lg01;


# direct methods
.method public constructor <init>(LC16;LG26;IILv16;LF16;LEu6;LgV2;LgV2;LgV2;LgV2;LE20;Lx16;ZZLkotlin/jvm/functions/Function1;LHe3;Lg01;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LC16;",
            "LG26;",
            "II",
            "Lv16;",
            "LF16;",
            "LEu6;",
            "LgV2;",
            "LgV2;",
            "LgV2;",
            "LgV2;",
            "LE20;",
            "Lx16;",
            "ZZ",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Li26;",
            "Lkotlin/Unit;",
            ">;",
            "LHe3;",
            "Lg01;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    move-object v1, p1

    iput-object v1, v0, LIC0$e$a;->g:LC16;

    move-object v1, p2

    iput-object v1, v0, LIC0$e$a;->h:LG26;

    move v1, p3

    iput v1, v0, LIC0$e$a;->i:I

    move v1, p4

    iput v1, v0, LIC0$e$a;->j:I

    move-object v1, p5

    iput-object v1, v0, LIC0$e$a;->k:Lv16;

    move-object v1, p6

    iput-object v1, v0, LIC0$e$a;->l:LF16;

    move-object v1, p7

    iput-object v1, v0, LIC0$e$a;->m:LEu6;

    move-object v1, p8

    iput-object v1, v0, LIC0$e$a;->n:LgV2;

    move-object v1, p9

    iput-object v1, v0, LIC0$e$a;->o:LgV2;

    move-object v1, p10

    iput-object v1, v0, LIC0$e$a;->p:LgV2;

    move-object v1, p11

    iput-object v1, v0, LIC0$e$a;->q:LgV2;

    move-object v1, p12

    iput-object v1, v0, LIC0$e$a;->r:LE20;

    move-object v1, p13

    iput-object v1, v0, LIC0$e$a;->s:Lx16;

    move/from16 v1, p14

    iput-boolean v1, v0, LIC0$e$a;->t:Z

    move/from16 v1, p15

    iput-boolean v1, v0, LIC0$e$a;->u:Z

    move-object/from16 v1, p16

    iput-object v1, v0, LIC0$e$a;->v:Lkotlin/jvm/functions/Function1;

    move-object/from16 v1, p17

    iput-object v1, v0, LIC0$e$a;->w:LHe3;

    move-object/from16 v1, p18

    iput-object v1, v0, LIC0$e$a;->x:Lg01;

    const/4 v1, 0x2

    invoke-direct {p0, v1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LEt0;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, LIC0$e$a;->invoke(LEt0;I)V

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

    goto/16 :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_2

    const/4 v0, -0x1

    const-string v2, "androidx.compose.foundation.text.CoreTextField.<anonymous>.<anonymous> (CoreTextField.kt:564)"

    const v3, 0x7925855b

    invoke-static {v3, p2, v0, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object p2, LgV2;->b0:LgV2$a;

    iget-object v0, p0, LIC0$e$a;->g:LC16;

    invoke-virtual {v0}, LC16;->h()F

    move-result v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p2, v0, v2, v1, v3}, LBB5;->q(LgV2;FFILjava/lang/Object;)LgV2;

    move-result-object p2

    iget-object v0, p0, LIC0$e$a;->h:LG26;

    iget v1, p0, LIC0$e$a;->i:I

    iget v2, p0, LIC0$e$a;->j:I

    invoke-static {p2, v0, v1, v2}, LEI1;->a(LgV2;LG26;II)LgV2;

    move-result-object p2

    iget-object v0, p0, LIC0$e$a;->k:Lv16;

    iget-object v1, p0, LIC0$e$a;->l:LF16;

    iget-object v2, p0, LIC0$e$a;->m:LEu6;

    new-instance v3, LIC0$e$a$b;

    iget-object v4, p0, LIC0$e$a;->g:LC16;

    invoke-direct {v3, v4}, LIC0$e$a$b;-><init>(LC16;)V

    invoke-static {p2, v0, v1, v2, v3}, Lu16;->c(LgV2;Lv16;LF16;LEu6;Lkotlin/jvm/functions/Function0;)LgV2;

    move-result-object p2

    iget-object v0, p0, LIC0$e$a;->n:LgV2;

    invoke-interface {p2, v0}, LgV2;->t0(LgV2;)LgV2;

    move-result-object p2

    iget-object v0, p0, LIC0$e$a;->o:LgV2;

    invoke-interface {p2, v0}, LgV2;->t0(LgV2;)LgV2;

    move-result-object p2

    iget-object v0, p0, LIC0$e$a;->h:LG26;

    invoke-static {p2, v0}, LB16;->a(LgV2;LG26;)LgV2;

    move-result-object p2

    iget-object v0, p0, LIC0$e$a;->p:LgV2;

    invoke-interface {p2, v0}, LgV2;->t0(LgV2;)LgV2;

    move-result-object p2

    iget-object v0, p0, LIC0$e$a;->q:LgV2;

    invoke-interface {p2, v0}, LgV2;->t0(LgV2;)LgV2;

    move-result-object p2

    iget-object v0, p0, LIC0$e$a;->r:LE20;

    invoke-static {p2, v0}, LG20;->b(LgV2;LE20;)LgV2;

    move-result-object p2

    new-instance v10, LIC0$e$a$a;

    iget-object v1, p0, LIC0$e$a;->s:Lx16;

    iget-object v2, p0, LIC0$e$a;->g:LC16;

    iget-boolean v3, p0, LIC0$e$a;->t:Z

    iget-boolean v4, p0, LIC0$e$a;->u:Z

    iget-object v5, p0, LIC0$e$a;->v:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, LIC0$e$a;->l:LF16;

    iget-object v7, p0, LIC0$e$a;->w:LHe3;

    iget-object v8, p0, LIC0$e$a;->x:Lg01;

    iget v9, p0, LIC0$e$a;->j:I

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, LIC0$e$a$a;-><init>(Lx16;LC16;ZZLkotlin/jvm/functions/Function1;LF16;LHe3;Lg01;I)V

    const v0, -0x15a57eaf

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v10}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v0

    const/16 v1, 0x30

    const/4 v2, 0x0

    invoke-static {p2, v0, p1, v1, v2}, LQA5;->a(LgV2;Lkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    return-void
.end method

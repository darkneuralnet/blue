.class public final LPz3$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPz3;->a(LF16;Lkotlin/jvm/functions/Function1;LgV2;ZZLG26;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLEu6;Lbl2;LZk2;ZIILrX2;Lhy5;Ld16;LEt0;III)V
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


# instance fields
.field public final synthetic g:LF16;

.field public final synthetic h:Z

.field public final synthetic i:Z

.field public final synthetic j:LEu6;

.field public final synthetic k:LrX2;

.field public final synthetic l:Z

.field public final synthetic m:Lkotlin/jvm/functions/Function2;
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

.field public final synthetic n:Lkotlin/jvm/functions/Function2;
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

.field public final synthetic o:Lkotlin/jvm/functions/Function2;
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

.field public final synthetic p:Lkotlin/jvm/functions/Function2;
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

.field public final synthetic q:Ld16;

.field public final synthetic r:I

.field public final synthetic s:I

.field public final synthetic t:Lhy5;


# direct methods
.method public constructor <init>(LF16;ZZLEu6;LrX2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Ld16;IILhy5;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LF16;",
            "ZZ",
            "LEu6;",
            "LrX2;",
            "Z",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Ld16;",
            "II",
            "Lhy5;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LPz3$d;->g:LF16;

    iput-boolean p2, p0, LPz3$d;->h:Z

    iput-boolean p3, p0, LPz3$d;->i:Z

    iput-object p4, p0, LPz3$d;->j:LEu6;

    iput-object p5, p0, LPz3$d;->k:LrX2;

    iput-boolean p6, p0, LPz3$d;->l:Z

    iput-object p7, p0, LPz3$d;->m:Lkotlin/jvm/functions/Function2;

    iput-object p8, p0, LPz3$d;->n:Lkotlin/jvm/functions/Function2;

    iput-object p9, p0, LPz3$d;->o:Lkotlin/jvm/functions/Function2;

    iput-object p10, p0, LPz3$d;->p:Lkotlin/jvm/functions/Function2;

    iput-object p11, p0, LPz3$d;->q:Ld16;

    iput p12, p0, LPz3$d;->r:I

    iput p13, p0, LPz3$d;->s:I

    iput-object p14, p0, LPz3$d;->t:Lhy5;

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

    invoke-virtual {p0, p1, p2, p3}, LPz3$d;->invoke(Lkotlin/jvm/functions/Function2;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/jvm/functions/Function2;LEt0;I)V
    .locals 28
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

    move-object/from16 v15, p2

    const-string v1, "innerTextField"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p3, 0xe

    if-nez v1, :cond_1

    invoke-interface {v15, v3}, LEt0;->I(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p3, v1

    move v14, v1

    goto :goto_1

    :cond_1
    move/from16 v14, p3

    :goto_1
    and-int/lit8 v1, v14, 0x5b

    const/16 v2, 0x12

    if-ne v1, v2, :cond_3

    invoke-interface/range {p2 .. p2}, LEt0;->b()Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-interface/range {p2 .. p2}, LEt0;->k()V

    goto/16 :goto_3

    :cond_3
    :goto_2
    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, -0x1

    const-string v2, "androidx.compose.material.OutlinedTextField.<anonymous> (OutlinedTextField.kt:391)"

    const v4, -0x3bb21dc7

    invoke-static {v4, v14, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    sget-object v1, Lg16;->a:Lg16;

    iget-object v2, v0, LPz3$d;->g:LF16;

    invoke-virtual {v2}, LF16;->h()Ljava/lang/String;

    move-result-object v2

    iget-boolean v13, v0, LPz3$d;->h:Z

    move v4, v13

    iget-boolean v5, v0, LPz3$d;->i:Z

    iget-object v6, v0, LPz3$d;->j:LEu6;

    iget-object v12, v0, LPz3$d;->k:LrX2;

    move-object v7, v12

    iget-boolean v11, v0, LPz3$d;->l:Z

    move v8, v11

    iget-object v9, v0, LPz3$d;->m:Lkotlin/jvm/functions/Function2;

    iget-object v10, v0, LPz3$d;->n:Lkotlin/jvm/functions/Function2;

    iget-object v3, v0, LPz3$d;->o:Lkotlin/jvm/functions/Function2;

    move/from16 v18, v11

    move-object v11, v3

    iget-object v3, v0, LPz3$d;->p:Lkotlin/jvm/functions/Function2;

    move-object/from16 v19, v12

    move-object v12, v3

    iget-object v3, v0, LPz3$d;->q:Ld16;

    move/from16 v17, v13

    move-object v13, v3

    const/16 v16, 0x0

    move/from16 v24, v14

    move-object/from16 v14, v16

    new-instance v14, LPz3$d$a;

    move-object/from16 v25, v1

    iget-object v1, v0, LPz3$d;->t:Lhy5;

    move-object/from16 v26, v2

    iget v2, v0, LPz3$d;->r:I

    move/from16 v27, v4

    iget v4, v0, LPz3$d;->s:I

    move-object/from16 v16, v14

    move-object/from16 v20, v3

    move-object/from16 v21, v1

    move/from16 v22, v2

    move/from16 v23, v4

    invoke-direct/range {v16 .. v23}, LPz3$d$a;-><init>(ZZLrX2;Ld16;Lhy5;II)V

    const v1, -0x2ceb317e

    const/4 v2, 0x1

    invoke-static {v15, v1, v2, v14}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v1

    move-object v15, v1

    shl-int/lit8 v1, v24, 0x3

    and-int/lit8 v1, v1, 0x70

    iget v2, v0, LPz3$d;->r:I

    shr-int/lit8 v3, v2, 0x3

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v1, v3

    iget v3, v0, LPz3$d;->s:I

    shr-int/lit8 v4, v3, 0x3

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v1, v4

    shl-int/lit8 v4, v3, 0x9

    const v14, 0xe000

    and-int/2addr v4, v14

    or-int/2addr v1, v4

    shr-int/lit8 v4, v3, 0x6

    const/high16 v14, 0x70000

    and-int/2addr v4, v14

    or-int/2addr v1, v4

    shl-int/lit8 v4, v3, 0x12

    const/high16 v14, 0x380000

    and-int/2addr v4, v14

    or-int/2addr v1, v4

    shl-int/lit8 v4, v2, 0x3

    const/high16 v14, 0x1c00000

    and-int/2addr v4, v14

    or-int/2addr v1, v4

    shl-int/lit8 v4, v2, 0x3

    const/high16 v14, 0xe000000

    and-int/2addr v4, v14

    or-int/2addr v1, v4

    shl-int/lit8 v4, v2, 0x3

    const/high16 v14, 0x70000000

    and-int/2addr v4, v14

    or-int v17, v1, v4

    shr-int/lit8 v1, v2, 0x1b

    and-int/lit8 v1, v1, 0xe

    or-int/lit16 v1, v1, 0x6c00

    shr-int/lit8 v2, v3, 0x18

    and-int/lit8 v2, v2, 0x70

    or-int v18, v1, v2

    const/16 v19, 0x1000

    move-object/from16 v3, p1

    move-object/from16 v16, p2

    move-object/from16 v1, v25

    move-object/from16 v2, v26

    move/from16 v4, v27

    const/4 v14, 0x0

    invoke-virtual/range {v1 .. v19}, Lg16;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLEu6;Le62;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Ld16;LPD3;Lkotlin/jvm/functions/Function2;LEt0;III)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    :goto_3
    return-void
.end method

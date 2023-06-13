.class public final Lq16$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq16;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;LgV2;ZZLG26;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLEu6;Lbl2;LZk2;ZIILrX2;Lhy5;Ld16;LEt0;III)V
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
.field public final synthetic g:Ljava/lang/String;

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


# direct methods
.method public constructor <init>(Ljava/lang/String;ZZLEu6;LrX2;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Ld16;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
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
            "II)V"
        }
    .end annotation

    iput-object p1, p0, Lq16$a;->g:Ljava/lang/String;

    iput-boolean p2, p0, Lq16$a;->h:Z

    iput-boolean p3, p0, Lq16$a;->i:Z

    iput-object p4, p0, Lq16$a;->j:LEu6;

    iput-object p5, p0, Lq16$a;->k:LrX2;

    iput-boolean p6, p0, Lq16$a;->l:Z

    iput-object p7, p0, Lq16$a;->m:Lkotlin/jvm/functions/Function2;

    iput-object p8, p0, Lq16$a;->n:Lkotlin/jvm/functions/Function2;

    iput-object p9, p0, Lq16$a;->o:Lkotlin/jvm/functions/Function2;

    iput-object p10, p0, Lq16$a;->p:Lkotlin/jvm/functions/Function2;

    iput-object p11, p0, Lq16$a;->q:Ld16;

    iput p12, p0, Lq16$a;->r:I

    iput p13, p0, Lq16$a;->s:I

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

    invoke-virtual {p0, p1, p2, p3}, Lq16$a;->invoke(Lkotlin/jvm/functions/Function2;LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/jvm/functions/Function2;LEt0;I)V
    .locals 19
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

    const-string v1, "innerTextField"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p3, 0xe

    move-object/from16 v15, p2

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

    const-string v2, "androidx.compose.material.TextField.<anonymous> (TextField.kt:209)"

    const v4, 0x3affac62

    invoke-static {v4, v14, v1, v2}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_4
    sget-object v1, Lg16;->a:Lg16;

    iget-object v2, v0, Lq16$a;->g:Ljava/lang/String;

    iget-boolean v4, v0, Lq16$a;->h:Z

    iget-boolean v5, v0, Lq16$a;->i:Z

    iget-object v6, v0, Lq16$a;->j:LEu6;

    iget-object v7, v0, Lq16$a;->k:LrX2;

    iget-boolean v8, v0, Lq16$a;->l:Z

    iget-object v9, v0, Lq16$a;->m:Lkotlin/jvm/functions/Function2;

    iget-object v10, v0, Lq16$a;->n:Lkotlin/jvm/functions/Function2;

    iget-object v11, v0, Lq16$a;->o:Lkotlin/jvm/functions/Function2;

    iget-object v12, v0, Lq16$a;->p:Lkotlin/jvm/functions/Function2;

    iget-object v13, v0, Lq16$a;->q:Ld16;

    const/16 v16, 0x0

    move/from16 v17, v14

    move-object/from16 v14, v16

    iget v14, v0, Lq16$a;->r:I

    and-int/lit8 v16, v14, 0xe

    shl-int/lit8 v17, v17, 0x3

    and-int/lit8 v17, v17, 0x70

    or-int v16, v16, v17

    shr-int/lit8 v3, v14, 0x3

    and-int/lit16 v3, v3, 0x380

    or-int v3, v16, v3

    iget v15, v0, Lq16$a;->s:I

    shr-int/lit8 v0, v15, 0x3

    and-int/lit16 v0, v0, 0x1c00

    or-int/2addr v0, v3

    shl-int/lit8 v3, v15, 0x9

    const v16, 0xe000

    and-int v3, v3, v16

    or-int/2addr v0, v3

    shr-int/lit8 v3, v15, 0x6

    const/high16 v16, 0x70000

    and-int v3, v3, v16

    or-int/2addr v0, v3

    shl-int/lit8 v3, v15, 0x12

    const/high16 v16, 0x380000

    and-int v3, v3, v16

    or-int/2addr v0, v3

    shl-int/lit8 v3, v14, 0x3

    const/high16 v16, 0x1c00000

    and-int v3, v3, v16

    or-int/2addr v0, v3

    shl-int/lit8 v3, v14, 0x3

    const/high16 v16, 0xe000000

    and-int v3, v3, v16

    or-int/2addr v0, v3

    shl-int/lit8 v3, v14, 0x3

    const/high16 v16, 0x70000000

    and-int v3, v3, v16

    or-int v16, v0, v3

    shr-int/lit8 v0, v14, 0x1b

    and-int/lit8 v0, v0, 0xe

    or-int/lit16 v0, v0, 0xc00

    shr-int/lit8 v3, v15, 0x18

    and-int/lit8 v3, v3, 0x70

    or-int v17, v0, v3

    const/16 v18, 0x1000

    move-object/from16 v3, p1

    move-object/from16 v15, p2

    const/4 v14, 0x0

    invoke-virtual/range {v1 .. v18}, Lg16;->c(Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZZLEu6;Le62;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Ld16;LPD3;LEt0;III)V

    invoke-static {}, LQt0;->O()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-static {}, LQt0;->Y()V

    :cond_5
    :goto_3
    return-void
.end method

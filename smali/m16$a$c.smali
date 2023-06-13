.class public final Lm16$a$c;
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


# instance fields
.field public final synthetic g:F

.field public final synthetic h:J

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

.field public final synthetic k:Z

.field public final synthetic l:J


# direct methods
.method public constructor <init>(FJLkotlin/jvm/functions/Function2;IZJ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FJ",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;IZJ)V"
        }
    .end annotation

    iput p1, p0, Lm16$a$c;->g:F

    iput-wide p2, p0, Lm16$a$c;->h:J

    iput-object p4, p0, Lm16$a$c;->i:Lkotlin/jvm/functions/Function2;

    iput p5, p0, Lm16$a$c;->j:I

    iput-boolean p6, p0, Lm16$a$c;->k:Z

    iput-wide p7, p0, Lm16$a$c;->l:J

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

    invoke-virtual {p0, p1, p2}, Lm16$a$c;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 37

    move-object/from16 v0, p0

    move-object/from16 v6, p1

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

    goto/16 :goto_2

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material.CommonDecorationBox.<anonymous>.<anonymous>.<anonymous> (TextFieldImpl.kt:121)"

    const v4, 0x15a0dc9e

    invoke-static {v4, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v1, LTM2;->a:LTM2;

    const/4 v2, 0x6

    invoke-virtual {v1, v6, v2}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v3

    invoke-virtual {v3}, LGc6;->k()LG26;

    move-result-object v3

    invoke-virtual {v1, v6, v2}, LTM2;->c(LEt0;I)LGc6;

    move-result-object v1

    invoke-virtual {v1}, LGc6;->f()LG26;

    move-result-object v1

    iget v4, v0, Lm16$a$c;->g:F

    invoke-static {v3, v1, v4}, LH26;->c(LG26;LG26;F)LG26;

    move-result-object v7

    iget-boolean v1, v0, Lm16$a$c;->k:Z

    iget-wide v8, v0, Lm16$a$c;->l:J

    if-eqz v1, :cond_3

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const-wide/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const v35, 0x3ffffe

    const/16 v36, 0x0

    invoke-static/range {v7 .. v36}, LG26;->c(LG26;JJLJw1;LEw1;LFw1;Lkw1;Ljava/lang/String;JLHE;LL16;Luv2;JLR06;LPx5;Lr06;LW06;JLN16;LlW3;Lor2;Lfr2;LUN1;ILjava/lang/Object;)LG26;

    move-result-object v1

    move-object v3, v1

    goto :goto_1

    :cond_3
    move-object v3, v7

    :goto_1
    iget-wide v4, v0, Lm16$a$c;->h:J

    const/4 v7, 0x0

    iget-object v8, v0, Lm16$a$c;->i:Lkotlin/jvm/functions/Function2;

    iget v1, v0, Lm16$a$c;->j:I

    shr-int/2addr v1, v2

    and-int/lit8 v1, v1, 0xe

    or-int/lit16 v9, v1, 0x180

    const/4 v10, 0x0

    move-wide v1, v4

    move-object v4, v7

    move-object v5, v8

    move-object/from16 v6, p1

    move v7, v9

    move v8, v10

    invoke-static/range {v1 .. v8}, Lm16;->b(JLG26;Ljava/lang/Float;Lkotlin/jvm/functions/Function2;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {}, LQt0;->Y()V

    :cond_4
    :goto_2
    return-void
.end method

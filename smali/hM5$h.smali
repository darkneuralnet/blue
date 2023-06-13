.class public final LhM5$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LhM5;->d(LcM5;LgV2;ZLhy5;JJJFLEt0;II)V
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
.field public final synthetic g:J

.field public final synthetic h:I

.field public final synthetic i:LcM5;

.field public final synthetic j:Ljava/lang/String;


# direct methods
.method public constructor <init>(JILcM5;Ljava/lang/String;)V
    .locals 0

    iput-wide p1, p0, LhM5$h;->g:J

    iput p3, p0, LhM5$h;->h:I

    iput-object p4, p0, LhM5$h;->i:LcM5;

    iput-object p5, p0, LhM5$h;->j:Ljava/lang/String;

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

    invoke-virtual {p0, p1, p2}, LhM5$h;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 28

    move-object/from16 v0, p0

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

    goto :goto_1

    :cond_1
    :goto_0
    invoke-static {}, LQt0;->O()Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v2, -0x1

    const-string v3, "androidx.compose.material.Snackbar.<anonymous> (Snackbar.kt:163)"

    const v4, 0x6de142b0

    invoke-static {v4, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v5, Li70;->a:Li70;

    const-wide/16 v6, 0x0

    iget-wide v8, v0, LhM5$h;->g:J

    const-wide/16 v10, 0x0

    iget v1, v0, LhM5$h;->h:I

    shr-int/lit8 v1, v1, 0xf

    and-int/lit8 v1, v1, 0x70

    or-int/lit16 v13, v1, 0xc00

    const/4 v14, 0x5

    move-object/from16 v12, p1

    invoke-virtual/range {v5 .. v14}, Li70;->g(JJJLEt0;II)Lh70;

    move-result-object v22

    new-instance v15, LhM5$h$a;

    iget-object v1, v0, LhM5$h;->i:LcM5;

    invoke-direct {v15, v1}, LhM5$h$a;-><init>(LcM5;)V

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    new-instance v1, LhM5$h$b;

    iget-object v2, v0, LhM5$h;->j:Ljava/lang/String;

    invoke-direct {v1, v2}, LhM5$h$b;-><init>(Ljava/lang/String;)V

    const v2, -0x3761b3ed

    const/4 v3, 0x1

    move-object/from16 v4, p1

    invoke-static {v4, v2, v3, v1}, Ljt0;->b(LEt0;IZLjava/lang/Object;)Lht0;

    move-result-object v24

    const/high16 v26, 0x30000000

    const/16 v27, 0x17e

    move-object/from16 v25, p1

    invoke-static/range {v15 .. v27}, Lk70;->c(Lkotlin/jvm/functions/Function0;LgV2;ZLrX2;Lj70;Lhy5;LeZ;Lh70;LPD3;Lkotlin/jvm/functions/Function3;LEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    return-void
.end method

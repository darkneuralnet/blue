.class public final LPz3$d$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LPz3$d;->invoke(Lkotlin/jvm/functions/Function2;LEt0;I)V
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
.field public final synthetic g:Z

.field public final synthetic h:Z

.field public final synthetic i:LrX2;

.field public final synthetic j:Ld16;

.field public final synthetic k:Lhy5;

.field public final synthetic l:I

.field public final synthetic m:I


# direct methods
.method public constructor <init>(ZZLrX2;Ld16;Lhy5;II)V
    .locals 0

    iput-boolean p1, p0, LPz3$d$a;->g:Z

    iput-boolean p2, p0, LPz3$d$a;->h:Z

    iput-object p3, p0, LPz3$d$a;->i:LrX2;

    iput-object p4, p0, LPz3$d$a;->j:Ld16;

    iput-object p5, p0, LPz3$d$a;->k:Lhy5;

    iput p6, p0, LPz3$d$a;->l:I

    iput p7, p0, LPz3$d$a;->m:I

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

    invoke-virtual {p0, p1, p2}, LPz3$d$a;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 16

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

    const-string v3, "androidx.compose.material.OutlinedTextField.<anonymous>.<anonymous> (OutlinedTextField.kt:405)"

    const v4, -0x2ceb317e

    invoke-static {v4, v1, v2, v3}, LQt0;->Z(IIILjava/lang/String;)V

    :cond_2
    sget-object v5, Lg16;->a:Lg16;

    iget-boolean v6, v0, LPz3$d$a;->g:Z

    iget-boolean v7, v0, LPz3$d$a;->h:Z

    iget-object v8, v0, LPz3$d$a;->i:LrX2;

    iget-object v9, v0, LPz3$d$a;->j:Ld16;

    iget-object v10, v0, LPz3$d$a;->k:Lhy5;

    const/4 v11, 0x0

    const/4 v12, 0x0

    iget v1, v0, LPz3$d$a;->l:I

    shr-int/lit8 v1, v1, 0x9

    and-int/lit8 v1, v1, 0xe

    const/high16 v2, 0xc00000

    or-int/2addr v1, v2

    iget v2, v0, LPz3$d$a;->m:I

    shl-int/lit8 v3, v2, 0x3

    and-int/lit8 v3, v3, 0x70

    or-int/2addr v1, v3

    shr-int/lit8 v3, v2, 0xf

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v1, v3

    shr-int/lit8 v3, v2, 0x12

    and-int/lit16 v3, v3, 0x1c00

    or-int/2addr v1, v3

    shr-int/lit8 v2, v2, 0xc

    const v3, 0xe000

    and-int/2addr v2, v3

    or-int v14, v1, v2

    const/16 v15, 0x60

    move-object/from16 v13, p1

    invoke-virtual/range {v5 .. v15}, Lg16;->a(ZZLe62;Ld16;Lhy5;FFLEt0;II)V

    invoke-static {}, LQt0;->O()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {}, LQt0;->Y()V

    :cond_3
    :goto_1
    return-void
.end method

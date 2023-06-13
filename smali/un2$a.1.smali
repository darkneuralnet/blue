.class public final Lun2$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lun2;->a(LgV2;LGn2;Lkotlin/jvm/functions/Function2;LPD3;ZZLcu1;ZLlo$l;Llo$d;Lkotlin/jvm/functions/Function1;LEt0;III)V
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
.field public final synthetic g:LgV2;

.field public final synthetic h:LGn2;

.field public final synthetic i:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "Lg01;",
            "Lkz0;",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic j:LPD3;

.field public final synthetic k:Z

.field public final synthetic l:Z

.field public final synthetic m:Lcu1;

.field public final synthetic n:Z

.field public final synthetic o:Llo$l;

.field public final synthetic p:Llo$d;

.field public final synthetic q:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "LBn2;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic r:I

.field public final synthetic s:I

.field public final synthetic t:I


# direct methods
.method public constructor <init>(LgV2;LGn2;Lkotlin/jvm/functions/Function2;LPD3;ZZLcu1;ZLlo$l;Llo$d;Lkotlin/jvm/functions/Function1;III)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgV2;",
            "LGn2;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Lg01;",
            "-",
            "Lkz0;",
            "+",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;>;",
            "LPD3;",
            "ZZ",
            "Lcu1;",
            "Z",
            "Llo$l;",
            "Llo$d;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "LBn2;",
            "Lkotlin/Unit;",
            ">;III)V"
        }
    .end annotation

    iput-object p1, p0, Lun2$a;->g:LgV2;

    iput-object p2, p0, Lun2$a;->h:LGn2;

    iput-object p3, p0, Lun2$a;->i:Lkotlin/jvm/functions/Function2;

    iput-object p4, p0, Lun2$a;->j:LPD3;

    iput-boolean p5, p0, Lun2$a;->k:Z

    iput-boolean p6, p0, Lun2$a;->l:Z

    iput-object p7, p0, Lun2$a;->m:Lcu1;

    iput-boolean p8, p0, Lun2$a;->n:Z

    iput-object p9, p0, Lun2$a;->o:Llo$l;

    iput-object p10, p0, Lun2$a;->p:Llo$d;

    iput-object p11, p0, Lun2$a;->q:Lkotlin/jvm/functions/Function1;

    iput p12, p0, Lun2$a;->r:I

    iput p13, p0, Lun2$a;->s:I

    iput p14, p0, Lun2$a;->t:I

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

    invoke-virtual {p0, p1, p2}, Lun2$a;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, Lun2$a;->g:LgV2;

    iget-object v2, v0, Lun2$a;->h:LGn2;

    iget-object v3, v0, Lun2$a;->i:Lkotlin/jvm/functions/Function2;

    iget-object v4, v0, Lun2$a;->j:LPD3;

    iget-boolean v5, v0, Lun2$a;->k:Z

    iget-boolean v6, v0, Lun2$a;->l:Z

    iget-object v7, v0, Lun2$a;->m:Lcu1;

    iget-boolean v8, v0, Lun2$a;->n:Z

    iget-object v9, v0, Lun2$a;->o:Llo$l;

    iget-object v10, v0, Lun2$a;->p:Llo$d;

    iget-object v11, v0, Lun2$a;->q:Lkotlin/jvm/functions/Function1;

    iget v12, v0, Lun2$a;->r:I

    or-int/lit8 v12, v12, 0x1

    invoke-static {v12}, Lps4;->a(I)I

    move-result v13

    iget v12, v0, Lun2$a;->s:I

    invoke-static {v12}, Lps4;->a(I)I

    move-result v14

    iget v15, v0, Lun2$a;->t:I

    move-object/from16 v12, p1

    invoke-static/range {v1 .. v15}, Lun2;->a(LgV2;LGn2;Lkotlin/jvm/functions/Function2;LPD3;ZZLcu1;ZLlo$l;Llo$d;Lkotlin/jvm/functions/Function1;LEt0;III)V

    return-void
.end method

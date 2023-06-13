.class public final LFU2$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LFU2;->c(Lkotlin/jvm/functions/Function3;LgV2;LGU2;Lhy5;FJJJLkotlin/jvm/functions/Function2;LEt0;II)V
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
.field public final synthetic g:Lkotlin/jvm/functions/Function3;
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

.field public final synthetic h:LgV2;

.field public final synthetic i:LGU2;

.field public final synthetic j:Lhy5;

.field public final synthetic k:F

.field public final synthetic l:J

.field public final synthetic m:J

.field public final synthetic n:J

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

.field public final synthetic p:I

.field public final synthetic q:I


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function3;LgV2;LGU2;Lhy5;FJJJLkotlin/jvm/functions/Function2;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LPm0;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "LgV2;",
            "LGU2;",
            "Lhy5;",
            "FJJJ",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;II)V"
        }
    .end annotation

    iput-object p1, p0, LFU2$d;->g:Lkotlin/jvm/functions/Function3;

    iput-object p2, p0, LFU2$d;->h:LgV2;

    iput-object p3, p0, LFU2$d;->i:LGU2;

    iput-object p4, p0, LFU2$d;->j:Lhy5;

    iput p5, p0, LFU2$d;->k:F

    iput-wide p6, p0, LFU2$d;->l:J

    iput-wide p8, p0, LFU2$d;->m:J

    iput-wide p10, p0, LFU2$d;->n:J

    iput-object p12, p0, LFU2$d;->o:Lkotlin/jvm/functions/Function2;

    iput p13, p0, LFU2$d;->p:I

    iput p14, p0, LFU2$d;->q:I

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

    invoke-virtual {p0, p1, p2}, LFU2$d;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 16

    move-object/from16 v0, p0

    iget-object v1, v0, LFU2$d;->g:Lkotlin/jvm/functions/Function3;

    iget-object v2, v0, LFU2$d;->h:LgV2;

    iget-object v3, v0, LFU2$d;->i:LGU2;

    iget-object v4, v0, LFU2$d;->j:Lhy5;

    iget v5, v0, LFU2$d;->k:F

    iget-wide v6, v0, LFU2$d;->l:J

    iget-wide v8, v0, LFU2$d;->m:J

    iget-wide v10, v0, LFU2$d;->n:J

    iget-object v12, v0, LFU2$d;->o:Lkotlin/jvm/functions/Function2;

    iget v13, v0, LFU2$d;->p:I

    or-int/lit8 v13, v13, 0x1

    invoke-static {v13}, Lps4;->a(I)I

    move-result v14

    iget v15, v0, LFU2$d;->q:I

    move-object/from16 v13, p1

    invoke-static/range {v1 .. v15}, LFU2;->c(Lkotlin/jvm/functions/Function3;LgV2;LGU2;Lhy5;FJJJLkotlin/jvm/functions/Function2;LEt0;II)V

    return-void
.end method

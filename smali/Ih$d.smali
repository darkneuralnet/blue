.class public final LIh$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LIh;->c(Lkotlin/jvm/functions/Function2;LgV2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJFLEt0;II)V
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
.field public final synthetic g:Lkotlin/jvm/functions/Function2;
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

.field public final synthetic h:LgV2;

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

.field public final synthetic j:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "LZc5;",
            "LEt0;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic k:J

.field public final synthetic l:J

.field public final synthetic m:F

.field public final synthetic n:I

.field public final synthetic o:I


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function2;LgV2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJFII)V
    .locals 0
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
            "LgV2;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "LZc5;",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;JJFII)V"
        }
    .end annotation

    iput-object p1, p0, LIh$d;->g:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, LIh$d;->h:LgV2;

    iput-object p3, p0, LIh$d;->i:Lkotlin/jvm/functions/Function2;

    iput-object p4, p0, LIh$d;->j:Lkotlin/jvm/functions/Function3;

    iput-wide p5, p0, LIh$d;->k:J

    iput-wide p7, p0, LIh$d;->l:J

    iput p9, p0, LIh$d;->m:F

    iput p10, p0, LIh$d;->n:I

    iput p11, p0, LIh$d;->o:I

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

    invoke-virtual {p0, p1, p2}, LIh$d;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 12

    iget-object v0, p0, LIh$d;->g:Lkotlin/jvm/functions/Function2;

    iget-object v1, p0, LIh$d;->h:LgV2;

    iget-object v2, p0, LIh$d;->i:Lkotlin/jvm/functions/Function2;

    iget-object v3, p0, LIh$d;->j:Lkotlin/jvm/functions/Function3;

    iget-wide v4, p0, LIh$d;->k:J

    iget-wide v6, p0, LIh$d;->l:J

    iget v8, p0, LIh$d;->m:F

    iget p2, p0, LIh$d;->n:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lps4;->a(I)I

    move-result v10

    iget v11, p0, LIh$d;->o:I

    move-object v9, p1

    invoke-static/range {v0 .. v11}, LIh;->c(Lkotlin/jvm/functions/Function2;LgV2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJFLEt0;II)V

    return-void
.end method

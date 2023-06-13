.class public final LhM5$e;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LhM5;->c(LgV2;Lkotlin/jvm/functions/Function2;ZLhy5;JJFLkotlin/jvm/functions/Function2;LEt0;II)V
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

.field public final synthetic h:Lkotlin/jvm/functions/Function2;
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

.field public final synthetic i:Z

.field public final synthetic j:Lhy5;

.field public final synthetic k:J

.field public final synthetic l:J

.field public final synthetic m:F

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

.field public final synthetic o:I

.field public final synthetic p:I


# direct methods
.method public constructor <init>(LgV2;Lkotlin/jvm/functions/Function2;ZLhy5;JJFLkotlin/jvm/functions/Function2;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LgV2;",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;Z",
            "Lhy5;",
            "JJF",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "LEt0;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;II)V"
        }
    .end annotation

    iput-object p1, p0, LhM5$e;->g:LgV2;

    iput-object p2, p0, LhM5$e;->h:Lkotlin/jvm/functions/Function2;

    iput-boolean p3, p0, LhM5$e;->i:Z

    iput-object p4, p0, LhM5$e;->j:Lhy5;

    iput-wide p5, p0, LhM5$e;->k:J

    iput-wide p7, p0, LhM5$e;->l:J

    iput p9, p0, LhM5$e;->m:F

    iput-object p10, p0, LhM5$e;->n:Lkotlin/jvm/functions/Function2;

    iput p11, p0, LhM5$e;->o:I

    iput p12, p0, LhM5$e;->p:I

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

    invoke-virtual {p0, p1, p2}, LhM5$e;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 13

    iget-object v0, p0, LhM5$e;->g:LgV2;

    iget-object v1, p0, LhM5$e;->h:Lkotlin/jvm/functions/Function2;

    iget-boolean v2, p0, LhM5$e;->i:Z

    iget-object v3, p0, LhM5$e;->j:Lhy5;

    iget-wide v4, p0, LhM5$e;->k:J

    iget-wide v6, p0, LhM5$e;->l:J

    iget v8, p0, LhM5$e;->m:F

    iget-object v9, p0, LhM5$e;->n:Lkotlin/jvm/functions/Function2;

    iget p2, p0, LhM5$e;->o:I

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lps4;->a(I)I

    move-result v11

    iget v12, p0, LhM5$e;->p:I

    move-object v10, p1

    invoke-static/range {v0 .. v12}, LhM5;->c(LgV2;Lkotlin/jvm/functions/Function2;ZLhy5;JJFLkotlin/jvm/functions/Function2;LEt0;II)V

    return-void
.end method

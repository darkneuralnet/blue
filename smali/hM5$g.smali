.class public final LhM5$g;
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
.field public final synthetic g:LcM5;

.field public final synthetic h:LgV2;

.field public final synthetic i:Z

.field public final synthetic j:Lhy5;

.field public final synthetic k:J

.field public final synthetic l:J

.field public final synthetic m:J

.field public final synthetic n:F

.field public final synthetic o:I

.field public final synthetic p:I


# direct methods
.method public constructor <init>(LcM5;LgV2;ZLhy5;JJJFII)V
    .locals 0

    iput-object p1, p0, LhM5$g;->g:LcM5;

    iput-object p2, p0, LhM5$g;->h:LgV2;

    iput-boolean p3, p0, LhM5$g;->i:Z

    iput-object p4, p0, LhM5$g;->j:Lhy5;

    iput-wide p5, p0, LhM5$g;->k:J

    iput-wide p7, p0, LhM5$g;->l:J

    iput-wide p9, p0, LhM5$g;->m:J

    iput p11, p0, LhM5$g;->n:F

    iput p12, p0, LhM5$g;->o:I

    iput p13, p0, LhM5$g;->p:I

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

    invoke-virtual {p0, p1, p2}, LhM5$g;->invoke(LEt0;I)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(LEt0;I)V
    .locals 15

    move-object v0, p0

    iget-object v1, v0, LhM5$g;->g:LcM5;

    iget-object v2, v0, LhM5$g;->h:LgV2;

    iget-boolean v3, v0, LhM5$g;->i:Z

    iget-object v4, v0, LhM5$g;->j:Lhy5;

    iget-wide v5, v0, LhM5$g;->k:J

    iget-wide v7, v0, LhM5$g;->l:J

    iget-wide v9, v0, LhM5$g;->m:J

    iget v11, v0, LhM5$g;->n:F

    iget v12, v0, LhM5$g;->o:I

    or-int/lit8 v12, v12, 0x1

    invoke-static {v12}, Lps4;->a(I)I

    move-result v13

    iget v14, v0, LhM5$g;->p:I

    move-object/from16 v12, p1

    invoke-static/range {v1 .. v14}, LhM5;->d(LcM5;LgV2;ZLhy5;JJJFLEt0;II)V

    return-void
.end method

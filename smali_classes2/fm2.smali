.class public Lfm2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfm2$a;,
        Lfm2$b;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LzA0;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LrD2;

.field public final c:Ljava/lang/String;

.field public final d:J

.field public final e:Lfm2$a;

.field public final f:J

.field public final g:Ljava/lang/String;

.field public final h:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "LpM2;",
            ">;"
        }
    .end annotation
.end field

.field public final i:LEe;

.field public final j:I

.field public final k:I

.field public final l:I

.field public final m:F

.field public final n:F

.field public final o:F

.field public final p:F

.field public final q:LBe;

.field public final r:LCe;

.field public final s:Lqe;

.field public final t:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lfl2<",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation
.end field

.field public final u:Lfm2$b;

.field public final v:Z

.field public final w:LMY;

.field public final x:LU71;


# direct methods
.method public constructor <init>(Ljava/util/List;LrD2;Ljava/lang/String;JLfm2$a;JLjava/lang/String;Ljava/util/List;LEe;IIIFFFFLBe;LCe;Ljava/util/List;Lfm2$b;Lqe;ZLMY;LU71;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LzA0;",
            ">;",
            "LrD2;",
            "Ljava/lang/String;",
            "J",
            "Lfm2$a;",
            "J",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "LpM2;",
            ">;",
            "LEe;",
            "IIIFFFF",
            "LBe;",
            "LCe;",
            "Ljava/util/List<",
            "Lfl2<",
            "Ljava/lang/Float;",
            ">;>;",
            "Lfm2$b;",
            "Lqe;",
            "Z",
            "LMY;",
            "LU71;",
            ")V"
        }
    .end annotation

    move-object v0, p0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    iput-object v1, v0, Lfm2;->a:Ljava/util/List;

    move-object v1, p2

    iput-object v1, v0, Lfm2;->b:LrD2;

    move-object v1, p3

    iput-object v1, v0, Lfm2;->c:Ljava/lang/String;

    move-wide v1, p4

    iput-wide v1, v0, Lfm2;->d:J

    move-object v1, p6

    iput-object v1, v0, Lfm2;->e:Lfm2$a;

    move-wide v1, p7

    iput-wide v1, v0, Lfm2;->f:J

    move-object v1, p9

    iput-object v1, v0, Lfm2;->g:Ljava/lang/String;

    move-object v1, p10

    iput-object v1, v0, Lfm2;->h:Ljava/util/List;

    move-object v1, p11

    iput-object v1, v0, Lfm2;->i:LEe;

    move v1, p12

    iput v1, v0, Lfm2;->j:I

    move/from16 v1, p13

    iput v1, v0, Lfm2;->k:I

    move/from16 v1, p14

    iput v1, v0, Lfm2;->l:I

    move/from16 v1, p15

    iput v1, v0, Lfm2;->m:F

    move/from16 v1, p16

    iput v1, v0, Lfm2;->n:F

    move/from16 v1, p17

    iput v1, v0, Lfm2;->o:F

    move/from16 v1, p18

    iput v1, v0, Lfm2;->p:F

    move-object/from16 v1, p19

    iput-object v1, v0, Lfm2;->q:LBe;

    move-object/from16 v1, p20

    iput-object v1, v0, Lfm2;->r:LCe;

    move-object/from16 v1, p21

    iput-object v1, v0, Lfm2;->t:Ljava/util/List;

    move-object/from16 v1, p22

    iput-object v1, v0, Lfm2;->u:Lfm2$b;

    move-object/from16 v1, p23

    iput-object v1, v0, Lfm2;->s:Lqe;

    move/from16 v1, p24

    iput-boolean v1, v0, Lfm2;->v:Z

    move-object/from16 v1, p25

    iput-object v1, v0, Lfm2;->w:LMY;

    move-object/from16 v1, p26

    iput-object v1, v0, Lfm2;->x:LU71;

    return-void
.end method


# virtual methods
.method public a()LMY;
    .locals 1

    iget-object v0, p0, Lfm2;->w:LMY;

    return-object v0
.end method

.method public b()LrD2;
    .locals 1

    iget-object v0, p0, Lfm2;->b:LrD2;

    return-object v0
.end method

.method public c()LU71;
    .locals 1

    iget-object v0, p0, Lfm2;->x:LU71;

    return-object v0
.end method

.method public d()J
    .locals 2

    iget-wide v0, p0, Lfm2;->d:J

    return-wide v0
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lfl2<",
            "Ljava/lang/Float;",
            ">;>;"
        }
    .end annotation

    iget-object v0, p0, Lfm2;->t:Ljava/util/List;

    return-object v0
.end method

.method public f()Lfm2$a;
    .locals 1

    iget-object v0, p0, Lfm2;->e:Lfm2$a;

    return-object v0
.end method

.method public g()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LpM2;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lfm2;->h:Ljava/util/List;

    return-object v0
.end method

.method public h()Lfm2$b;
    .locals 1

    iget-object v0, p0, Lfm2;->u:Lfm2$b;

    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lfm2;->c:Ljava/lang/String;

    return-object v0
.end method

.method public j()J
    .locals 2

    iget-wide v0, p0, Lfm2;->f:J

    return-wide v0
.end method

.method public k()F
    .locals 1

    iget v0, p0, Lfm2;->p:F

    return v0
.end method

.method public l()F
    .locals 1

    iget v0, p0, Lfm2;->o:F

    return v0
.end method

.method public m()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lfm2;->g:Ljava/lang/String;

    return-object v0
.end method

.method public n()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "LzA0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lfm2;->a:Ljava/util/List;

    return-object v0
.end method

.method public o()I
    .locals 1

    iget v0, p0, Lfm2;->l:I

    return v0
.end method

.method public p()I
    .locals 1

    iget v0, p0, Lfm2;->k:I

    return v0
.end method

.method public q()I
    .locals 1

    iget v0, p0, Lfm2;->j:I

    return v0
.end method

.method public r()F
    .locals 2

    iget v0, p0, Lfm2;->n:F

    iget-object v1, p0, Lfm2;->b:LrD2;

    invoke-virtual {v1}, LrD2;->e()F

    move-result v1

    div-float/2addr v0, v1

    return v0
.end method

.method public s()LBe;
    .locals 1

    iget-object v0, p0, Lfm2;->q:LBe;

    return-object v0
.end method

.method public t()LCe;
    .locals 1

    iget-object v0, p0, Lfm2;->r:LCe;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, ""

    invoke-virtual {p0, v0}, Lfm2;->y(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Lqe;
    .locals 1

    iget-object v0, p0, Lfm2;->s:Lqe;

    return-object v0
.end method

.method public v()F
    .locals 1

    iget v0, p0, Lfm2;->m:F

    return v0
.end method

.method public w()LEe;
    .locals 1

    iget-object v0, p0, Lfm2;->i:LEe;

    return-object v0
.end method

.method public x()Z
    .locals 1

    iget-boolean v0, p0, Lfm2;->v:Z

    return v0
.end method

.method public y(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lfm2;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\n"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lfm2;->b:LrD2;

    invoke-virtual {p0}, Lfm2;->j()J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, LrD2;->t(J)Lfm2;

    move-result-object v2

    if-eqz v2, :cond_1

    const-string v3, "\t\tParents: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lfm2;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lfm2;->b:LrD2;

    invoke-virtual {v2}, Lfm2;->j()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, LrD2;->t(J)Lfm2;

    move-result-object v2

    :goto_0
    if-eqz v2, :cond_0

    const-string v3, "->"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Lfm2;->i()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lfm2;->b:LrD2;

    invoke-virtual {v2}, Lfm2;->j()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, LrD2;->t(J)Lfm2;

    move-result-object v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {p0}, Lfm2;->g()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\tMasks: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lfm2;->g()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    invoke-virtual {p0}, Lfm2;->q()I

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {p0}, Lfm2;->p()I

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\tBackground: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    invoke-virtual {p0}, Lfm2;->q()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x0

    aput-object v4, v3, v5

    invoke-virtual {p0}, Lfm2;->p()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x1

    aput-object v4, v3, v5

    invoke-virtual {p0}, Lfm2;->o()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v5, 0x2

    aput-object v4, v3, v5

    const-string v4, "%dx%d %X\n"

    invoke-static {v2, v4, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_3
    iget-object v2, p0, Lfm2;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\tShapes:\n"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Lfm2;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\t\t"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

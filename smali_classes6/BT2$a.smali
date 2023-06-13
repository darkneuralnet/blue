.class public final LBT2$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LBT2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:J

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:LBT2$c;

.field public e:LBT2$d;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/String;

.field public h:I

.field public i:I

.field public j:Ljava/lang/String;

.field public k:J

.field public l:LBT2$b;

.field public m:Ljava/lang/String;

.field public n:J

.field public o:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, LBT2$a;->a:J

    const-string v2, ""

    iput-object v2, p0, LBT2$a;->b:Ljava/lang/String;

    iput-object v2, p0, LBT2$a;->c:Ljava/lang/String;

    sget-object v3, LBT2$c;->c:LBT2$c;

    iput-object v3, p0, LBT2$a;->d:LBT2$c;

    sget-object v3, LBT2$d;->c:LBT2$d;

    iput-object v3, p0, LBT2$a;->e:LBT2$d;

    iput-object v2, p0, LBT2$a;->f:Ljava/lang/String;

    iput-object v2, p0, LBT2$a;->g:Ljava/lang/String;

    const/4 v3, 0x0

    iput v3, p0, LBT2$a;->h:I

    iput v3, p0, LBT2$a;->i:I

    iput-object v2, p0, LBT2$a;->j:Ljava/lang/String;

    iput-wide v0, p0, LBT2$a;->k:J

    sget-object v3, LBT2$b;->c:LBT2$b;

    iput-object v3, p0, LBT2$a;->l:LBT2$b;

    iput-object v2, p0, LBT2$a;->m:Ljava/lang/String;

    iput-wide v0, p0, LBT2$a;->n:J

    iput-object v2, p0, LBT2$a;->o:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a()LBT2;
    .locals 24

    move-object/from16 v0, p0

    new-instance v20, LBT2;

    move-object/from16 v1, v20

    iget-wide v2, v0, LBT2$a;->a:J

    iget-object v4, v0, LBT2$a;->b:Ljava/lang/String;

    iget-object v5, v0, LBT2$a;->c:Ljava/lang/String;

    iget-object v6, v0, LBT2$a;->d:LBT2$c;

    iget-object v7, v0, LBT2$a;->e:LBT2$d;

    iget-object v8, v0, LBT2$a;->f:Ljava/lang/String;

    iget-object v9, v0, LBT2$a;->g:Ljava/lang/String;

    iget v10, v0, LBT2$a;->h:I

    iget v11, v0, LBT2$a;->i:I

    iget-object v12, v0, LBT2$a;->j:Ljava/lang/String;

    iget-wide v13, v0, LBT2$a;->k:J

    iget-object v15, v0, LBT2$a;->l:LBT2$b;

    move-object/from16 v21, v1

    iget-object v1, v0, LBT2$a;->m:Ljava/lang/String;

    move-object/from16 v16, v1

    move-wide/from16 v22, v2

    iget-wide v1, v0, LBT2$a;->n:J

    move-wide/from16 v17, v1

    iget-object v1, v0, LBT2$a;->o:Ljava/lang/String;

    move-object/from16 v19, v1

    move-object/from16 v1, v21

    move-wide/from16 v2, v22

    invoke-direct/range {v1 .. v19}, LBT2;-><init>(JLjava/lang/String;Ljava/lang/String;LBT2$c;LBT2$d;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;JLBT2$b;Ljava/lang/String;JLjava/lang/String;)V

    return-object v20
.end method

.method public b(Ljava/lang/String;)LBT2$a;
    .locals 0

    iput-object p1, p0, LBT2$a;->m:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/lang/String;)LBT2$a;
    .locals 0

    iput-object p1, p0, LBT2$a;->g:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/String;)LBT2$a;
    .locals 0

    iput-object p1, p0, LBT2$a;->o:Ljava/lang/String;

    return-object p0
.end method

.method public e(LBT2$b;)LBT2$a;
    .locals 0

    iput-object p1, p0, LBT2$a;->l:LBT2$b;

    return-object p0
.end method

.method public f(Ljava/lang/String;)LBT2$a;
    .locals 0

    iput-object p1, p0, LBT2$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public g(Ljava/lang/String;)LBT2$a;
    .locals 0

    iput-object p1, p0, LBT2$a;->b:Ljava/lang/String;

    return-object p0
.end method

.method public h(LBT2$c;)LBT2$a;
    .locals 0

    iput-object p1, p0, LBT2$a;->d:LBT2$c;

    return-object p0
.end method

.method public i(Ljava/lang/String;)LBT2$a;
    .locals 0

    iput-object p1, p0, LBT2$a;->f:Ljava/lang/String;

    return-object p0
.end method

.method public j(J)LBT2$a;
    .locals 0

    iput-wide p1, p0, LBT2$a;->a:J

    return-object p0
.end method

.method public k(LBT2$d;)LBT2$a;
    .locals 0

    iput-object p1, p0, LBT2$a;->e:LBT2$d;

    return-object p0
.end method

.method public l(Ljava/lang/String;)LBT2$a;
    .locals 0

    iput-object p1, p0, LBT2$a;->j:Ljava/lang/String;

    return-object p0
.end method

.method public m(I)LBT2$a;
    .locals 0

    iput p1, p0, LBT2$a;->i:I

    return-object p0
.end method

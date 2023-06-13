.class public final Lcl1;
.super Lbl1;
.source "SourceFile"


# instance fields
.field public final c:LzX5;

.field public final d:I

.field public final e:I

.field public final f:I

.field public g:I

.field public h:I

.field public i:LIf;

.field public j:LIf;

.field public k:LIf;

.field public l:LIf;

.field public m:Ltp;


# direct methods
.method public constructor <init>(LzX5;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    const/high16 v0, 0x90000

    invoke-direct {p0, v0}, Lbl1;-><init>(I)V

    iput-object p1, p0, Lcl1;->c:LzX5;

    iput p2, p0, Lcl1;->d:I

    invoke-virtual {p1, p3}, LzX5;->D(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Lcl1;->e:I

    invoke-virtual {p1, p4}, LzX5;->D(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Lcl1;->f:I

    if-eqz p5, :cond_0

    invoke-virtual {p1, p5}, LzX5;->D(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Lcl1;->g:I

    :cond_0
    if-eqz p6, :cond_1

    invoke-virtual {p1, p6}, LzX5;->d(Ljava/lang/Object;)LvX5;

    move-result-object p1

    iget p1, p1, LvX5;->a:I

    iput p1, p0, Lcl1;->h:I

    :cond_1
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Z)LHf;
    .locals 1

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcl1;->c:LzX5;

    iget-object v0, p0, Lcl1;->i:LIf;

    invoke-static {p2, p1, v0}, LIf;->j(LzX5;Ljava/lang/String;LIf;)LIf;

    move-result-object p1

    iput-object p1, p0, Lcl1;->i:LIf;

    return-object p1

    :cond_0
    iget-object p2, p0, Lcl1;->c:LzX5;

    iget-object v0, p0, Lcl1;->j:LIf;

    invoke-static {p2, p1, v0}, LIf;->j(LzX5;Ljava/lang/String;LIf;)LIf;

    move-result-object p1

    iput-object p1, p0, Lcl1;->j:LIf;

    return-object p1
.end method

.method public b(Ltp;)V
    .locals 1

    iget-object v0, p0, Lcl1;->m:Ltp;

    iput-object v0, p1, Ltp;->c:Ltp;

    iput-object p1, p0, Lcl1;->m:Ltp;

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public d(ILDb6;Ljava/lang/String;Z)LHf;
    .locals 1

    if-eqz p4, :cond_0

    iget-object p4, p0, Lcl1;->c:LzX5;

    iget-object v0, p0, Lcl1;->k:LIf;

    invoke-static {p4, p1, p2, p3, v0}, LIf;->i(LzX5;ILDb6;Ljava/lang/String;LIf;)LIf;

    move-result-object p1

    iput-object p1, p0, Lcl1;->k:LIf;

    return-object p1

    :cond_0
    iget-object p4, p0, Lcl1;->c:LzX5;

    iget-object v0, p0, Lcl1;->l:LIf;

    invoke-static {p4, p1, p2, p3, v0}, LIf;->i(LzX5;ILDb6;Ljava/lang/String;LIf;)LIf;

    move-result-object p1

    iput-object p1, p0, Lcl1;->l:LIf;

    return-object p1
.end method

.method public final e(Ltp$a;)V
    .locals 1

    iget-object v0, p0, Lcl1;->m:Ltp;

    invoke-virtual {p1, v0}, Ltp$a;->b(Ltp;)V

    return-void
.end method

.method public f()I
    .locals 5

    iget v0, p0, Lcl1;->h:I

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcl1;->c:LzX5;

    const-string v1, "ConstantValue"

    invoke-virtual {v0, v1}, LzX5;->D(Ljava/lang/String;)I

    const/16 v0, 0x10

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    :goto_0
    iget-object v1, p0, Lcl1;->c:LzX5;

    iget v2, p0, Lcl1;->d:I

    iget v3, p0, Lcl1;->g:I

    invoke-static {v1, v2, v3}, Ltp;->b(LzX5;II)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcl1;->i:LIf;

    iget-object v2, p0, Lcl1;->j:LIf;

    iget-object v3, p0, Lcl1;->k:LIf;

    iget-object v4, p0, Lcl1;->l:LIf;

    invoke-static {v1, v2, v3, v4}, LIf;->f(LIf;LIf;LIf;LIf;)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcl1;->m:Ltp;

    if-eqz v1, :cond_1

    iget-object v2, p0, Lcl1;->c:LzX5;

    invoke-virtual {v1, v2}, Ltp;->a(LzX5;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_1
    return v0
.end method

.method public g(LO70;)V
    .locals 9

    iget-object v0, p0, Lcl1;->c:LzX5;

    invoke-virtual {v0}, LzX5;->R()I

    move-result v0

    const/16 v1, 0x31

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ge v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    if-eqz v0, :cond_1

    const/16 v1, 0x1000

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    iget v4, p0, Lcl1;->d:I

    not-int v1, v1

    and-int/2addr v1, v4

    invoke-virtual {p1, v1}, LO70;->k(I)LO70;

    move-result-object v1

    iget v4, p0, Lcl1;->e:I

    invoke-virtual {v1, v4}, LO70;->k(I)LO70;

    move-result-object v1

    iget v4, p0, Lcl1;->f:I

    invoke-virtual {v1, v4}, LO70;->k(I)LO70;

    iget v1, p0, Lcl1;->h:I

    if-eqz v1, :cond_2

    move v2, v3

    :cond_2
    iget v1, p0, Lcl1;->d:I

    and-int/lit16 v3, v1, 0x1000

    if-eqz v3, :cond_3

    if-eqz v0, :cond_3

    add-int/lit8 v2, v2, 0x1

    :cond_3
    iget v0, p0, Lcl1;->g:I

    if-eqz v0, :cond_4

    add-int/lit8 v2, v2, 0x1

    :cond_4
    const/high16 v0, 0x20000

    and-int/2addr v0, v1

    if-eqz v0, :cond_5

    add-int/lit8 v2, v2, 0x1

    :cond_5
    iget-object v0, p0, Lcl1;->i:LIf;

    if-eqz v0, :cond_6

    add-int/lit8 v2, v2, 0x1

    :cond_6
    iget-object v0, p0, Lcl1;->j:LIf;

    if-eqz v0, :cond_7

    add-int/lit8 v2, v2, 0x1

    :cond_7
    iget-object v0, p0, Lcl1;->k:LIf;

    if-eqz v0, :cond_8

    add-int/lit8 v2, v2, 0x1

    :cond_8
    iget-object v0, p0, Lcl1;->l:LIf;

    if-eqz v0, :cond_9

    add-int/lit8 v2, v2, 0x1

    :cond_9
    iget-object v0, p0, Lcl1;->m:Ltp;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ltp;->d()I

    move-result v0

    add-int/2addr v2, v0

    :cond_a
    invoke-virtual {p1, v2}, LO70;->k(I)LO70;

    iget v0, p0, Lcl1;->h:I

    if-eqz v0, :cond_b

    iget-object v0, p0, Lcl1;->c:LzX5;

    const-string v1, "ConstantValue"

    invoke-virtual {v0, v1}, LzX5;->D(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, LO70;->k(I)LO70;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, LO70;->i(I)LO70;

    move-result-object v0

    iget v1, p0, Lcl1;->h:I

    invoke-virtual {v0, v1}, LO70;->k(I)LO70;

    :cond_b
    iget-object v0, p0, Lcl1;->c:LzX5;

    iget v1, p0, Lcl1;->d:I

    iget v2, p0, Lcl1;->g:I

    invoke-static {v0, v1, v2, p1}, Ltp;->f(LzX5;IILO70;)V

    iget-object v3, p0, Lcl1;->c:LzX5;

    iget-object v4, p0, Lcl1;->i:LIf;

    iget-object v5, p0, Lcl1;->j:LIf;

    iget-object v6, p0, Lcl1;->k:LIf;

    iget-object v7, p0, Lcl1;->l:LIf;

    move-object v8, p1

    invoke-static/range {v3 .. v8}, LIf;->l(LzX5;LIf;LIf;LIf;LIf;LO70;)V

    iget-object v0, p0, Lcl1;->m:Ltp;

    if-eqz v0, :cond_c

    iget-object v1, p0, Lcl1;->c:LzX5;

    invoke-virtual {v0, v1, p1}, Ltp;->g(LzX5;LO70;)V

    :cond_c
    return-void
.end method

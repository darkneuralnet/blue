.class public final Lts4;
.super Lss4;
.source "SourceFile"


# instance fields
.field public final c:LzX5;

.field public final d:I

.field public final e:I

.field public f:I

.field public g:LIf;

.field public h:LIf;

.field public i:LIf;

.field public j:LIf;

.field public k:Ltp;


# direct methods
.method public constructor <init>(LzX5;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/high16 v0, 0x90000

    invoke-direct {p0, v0}, Lss4;-><init>(I)V

    iput-object p1, p0, Lts4;->c:LzX5;

    invoke-virtual {p1, p2}, LzX5;->D(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Lts4;->d:I

    invoke-virtual {p1, p3}, LzX5;->D(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, Lts4;->e:I

    if-eqz p4, :cond_0

    invoke-virtual {p1, p4}, LzX5;->D(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lts4;->f:I

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Z)LHf;
    .locals 1

    if-eqz p2, :cond_0

    iget-object p2, p0, Lts4;->c:LzX5;

    iget-object v0, p0, Lts4;->g:LIf;

    invoke-static {p2, p1, v0}, LIf;->j(LzX5;Ljava/lang/String;LIf;)LIf;

    move-result-object p1

    iput-object p1, p0, Lts4;->g:LIf;

    return-object p1

    :cond_0
    iget-object p2, p0, Lts4;->c:LzX5;

    iget-object v0, p0, Lts4;->h:LIf;

    invoke-static {p2, p1, v0}, LIf;->j(LzX5;Ljava/lang/String;LIf;)LIf;

    move-result-object p1

    iput-object p1, p0, Lts4;->h:LIf;

    return-object p1
.end method

.method public b(Ltp;)V
    .locals 1

    iget-object v0, p0, Lts4;->k:Ltp;

    iput-object v0, p1, Ltp;->c:Ltp;

    iput-object p1, p0, Lts4;->k:Ltp;

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public d(ILDb6;Ljava/lang/String;Z)LHf;
    .locals 1

    if-eqz p4, :cond_0

    iget-object p4, p0, Lts4;->c:LzX5;

    iget-object v0, p0, Lts4;->i:LIf;

    invoke-static {p4, p1, p2, p3, v0}, LIf;->i(LzX5;ILDb6;Ljava/lang/String;LIf;)LIf;

    move-result-object p1

    iput-object p1, p0, Lts4;->i:LIf;

    return-object p1

    :cond_0
    iget-object p4, p0, Lts4;->c:LzX5;

    iget-object v0, p0, Lts4;->j:LIf;

    invoke-static {p4, p1, p2, p3, v0}, LIf;->i(LzX5;ILDb6;Ljava/lang/String;LIf;)LIf;

    move-result-object p1

    iput-object p1, p0, Lts4;->j:LIf;

    return-object p1
.end method

.method public final e(Ltp$a;)V
    .locals 1

    iget-object v0, p0, Lts4;->k:Ltp;

    invoke-virtual {p1, v0}, Ltp$a;->b(Ltp;)V

    return-void
.end method

.method public f()I
    .locals 5

    iget-object v0, p0, Lts4;->c:LzX5;

    const/4 v1, 0x0

    iget v2, p0, Lts4;->f:I

    invoke-static {v0, v1, v2}, Ltp;->b(LzX5;II)I

    move-result v0

    add-int/lit8 v0, v0, 0x6

    iget-object v1, p0, Lts4;->g:LIf;

    iget-object v2, p0, Lts4;->h:LIf;

    iget-object v3, p0, Lts4;->i:LIf;

    iget-object v4, p0, Lts4;->j:LIf;

    invoke-static {v1, v2, v3, v4}, LIf;->f(LIf;LIf;LIf;LIf;)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lts4;->k:Ltp;

    if-eqz v1, :cond_0

    iget-object v2, p0, Lts4;->c:LzX5;

    invoke-virtual {v1, v2}, Ltp;->a(LzX5;)I

    move-result v1

    add-int/2addr v0, v1

    :cond_0
    return v0
.end method

.method public g(LO70;)V
    .locals 9

    iget v0, p0, Lts4;->d:I

    invoke-virtual {p1, v0}, LO70;->k(I)LO70;

    move-result-object v0

    iget v1, p0, Lts4;->e:I

    invoke-virtual {v0, v1}, LO70;->k(I)LO70;

    iget v0, p0, Lts4;->f:I

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget-object v2, p0, Lts4;->g:LIf;

    if-eqz v2, :cond_1

    add-int/lit8 v0, v0, 0x1

    :cond_1
    iget-object v2, p0, Lts4;->h:LIf;

    if-eqz v2, :cond_2

    add-int/lit8 v0, v0, 0x1

    :cond_2
    iget-object v2, p0, Lts4;->i:LIf;

    if-eqz v2, :cond_3

    add-int/lit8 v0, v0, 0x1

    :cond_3
    iget-object v2, p0, Lts4;->j:LIf;

    if-eqz v2, :cond_4

    add-int/lit8 v0, v0, 0x1

    :cond_4
    iget-object v2, p0, Lts4;->k:Ltp;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Ltp;->d()I

    move-result v2

    add-int/2addr v0, v2

    :cond_5
    invoke-virtual {p1, v0}, LO70;->k(I)LO70;

    iget-object v0, p0, Lts4;->c:LzX5;

    iget v2, p0, Lts4;->f:I

    invoke-static {v0, v1, v2, p1}, Ltp;->f(LzX5;IILO70;)V

    iget-object v3, p0, Lts4;->c:LzX5;

    iget-object v4, p0, Lts4;->g:LIf;

    iget-object v5, p0, Lts4;->h:LIf;

    iget-object v6, p0, Lts4;->i:LIf;

    iget-object v7, p0, Lts4;->j:LIf;

    move-object v8, p1

    invoke-static/range {v3 .. v8}, LIf;->l(LzX5;LIf;LIf;LIf;LIf;LO70;)V

    iget-object v0, p0, Lts4;->k:Ltp;

    if-eqz v0, :cond_6

    iget-object v1, p0, Lts4;->c:LzX5;

    invoke-virtual {v0, v1, p1}, Ltp;->g(LzX5;LO70;)V

    :cond_6
    return-void
.end method

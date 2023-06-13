.class public LOj0;
.super LNj0;
.source "SourceFile"


# instance fields
.field public A:I

.field public B:LO70;

.field public C:I

.field public D:LO70;

.field public E:Lts4;

.field public F:Lts4;

.field public G:Ltp;

.field public H:I

.field public c:I

.field public final d:LzX5;

.field public e:I

.field public f:I

.field public g:I

.field public h:I

.field public i:[I

.field public j:Lcl1;

.field public k:Lcl1;

.field public l:LZT2;

.field public m:LZT2;

.field public n:I

.field public o:LO70;

.field public p:I

.field public q:I

.field public r:I

.field public s:I

.field public t:LO70;

.field public u:LIf;

.field public v:LIf;

.field public w:LIf;

.field public x:LIf;

.field public y:LuV2;

.field public z:I


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1}, LOj0;-><init>(LKj0;I)V

    return-void
.end method

.method public constructor <init>(LKj0;I)V
    .locals 1

    const/high16 v0, 0x90000

    invoke-direct {p0, v0}, LNj0;-><init>(I)V

    if-nez p1, :cond_0

    new-instance p1, LzX5;

    invoke-direct {p1, p0}, LzX5;-><init>(LOj0;)V

    goto :goto_0

    :cond_0
    new-instance v0, LzX5;

    invoke-direct {v0, p0, p1}, LzX5;-><init>(LOj0;LKj0;)V

    move-object p1, v0

    :goto_0
    iput-object p1, p0, LOj0;->d:LzX5;

    and-int/lit8 p1, p2, 0x2

    if-eqz p1, :cond_1

    const/4 p1, 0x4

    iput p1, p0, LOj0;->H:I

    goto :goto_1

    :cond_1
    const/4 p1, 0x1

    and-int/2addr p2, p1

    if-eqz p2, :cond_2

    iput p1, p0, LOj0;->H:I

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    iput p1, p0, LOj0;->H:I

    :goto_1
    return-void
.end method


# virtual methods
.method public final a(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 1

    iput p1, p0, LOj0;->c:I

    iput p2, p0, LOj0;->e:I

    iget-object p2, p0, LOj0;->d:LzX5;

    const v0, 0xffff

    and-int/2addr p1, v0

    invoke-virtual {p2, p1, p3}, LzX5;->f0(ILjava/lang/String;)I

    move-result p2

    iput p2, p0, LOj0;->f:I

    if-eqz p4, :cond_0

    iget-object p2, p0, LOj0;->d:LzX5;

    invoke-virtual {p2, p4}, LzX5;->D(Ljava/lang/String;)I

    move-result p2

    iput p2, p0, LOj0;->r:I

    :cond_0
    const/4 p2, 0x0

    if-nez p5, :cond_1

    move p3, p2

    goto :goto_0

    :cond_1
    iget-object p3, p0, LOj0;->d:LzX5;

    invoke-virtual {p3, p5}, LzX5;->e(Ljava/lang/String;)LvX5;

    move-result-object p3

    iget p3, p3, LvX5;->a:I

    :goto_0
    iput p3, p0, LOj0;->g:I

    if-eqz p6, :cond_2

    array-length p3, p6

    if-lez p3, :cond_2

    array-length p3, p6

    iput p3, p0, LOj0;->h:I

    new-array p3, p3, [I

    iput-object p3, p0, LOj0;->i:[I

    :goto_1
    iget p3, p0, LOj0;->h:I

    if-ge p2, p3, :cond_2

    iget-object p3, p0, LOj0;->i:[I

    iget-object p4, p0, LOj0;->d:LzX5;

    aget-object p5, p6, p2

    invoke-virtual {p4, p5}, LzX5;->e(Ljava/lang/String;)LvX5;

    move-result-object p4

    iget p4, p4, LvX5;->a:I

    aput p4, p3, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_2
    iget p2, p0, LOj0;->H:I

    const/4 p3, 0x1

    if-ne p2, p3, :cond_3

    const/16 p2, 0x33

    if-lt p1, p2, :cond_3

    const/4 p1, 0x2

    iput p1, p0, LOj0;->H:I

    :cond_3
    return-void
.end method

.method public final b(Ljava/lang/String;Z)LHf;
    .locals 1

    if-eqz p2, :cond_0

    iget-object p2, p0, LOj0;->d:LzX5;

    iget-object v0, p0, LOj0;->u:LIf;

    invoke-static {p2, p1, v0}, LIf;->j(LzX5;Ljava/lang/String;LIf;)LIf;

    move-result-object p1

    iput-object p1, p0, LOj0;->u:LIf;

    return-object p1

    :cond_0
    iget-object p2, p0, LOj0;->d:LzX5;

    iget-object v0, p0, LOj0;->v:LIf;

    invoke-static {p2, p1, v0}, LIf;->j(LzX5;Ljava/lang/String;LIf;)LIf;

    move-result-object p1

    iput-object p1, p0, LOj0;->v:LIf;

    return-object p1
.end method

.method public final c(Ltp;)V
    .locals 1

    iget-object v0, p0, LOj0;->G:Ltp;

    iput-object v0, p1, Ltp;->c:Ltp;

    iput-object p1, p0, LOj0;->G:Ltp;

    return-void
.end method

.method public final d()V
    .locals 0

    return-void
.end method

.method public final e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lbl1;
    .locals 8

    new-instance v7, Lcl1;

    iget-object v1, p0, LOj0;->d:LzX5;

    move-object v0, v7

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v6}, Lcl1;-><init>(LzX5;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    iget-object p1, p0, LOj0;->j:Lcl1;

    if-nez p1, :cond_0

    iput-object v7, p0, LOj0;->j:Lcl1;

    goto :goto_0

    :cond_0
    iget-object p1, p0, LOj0;->k:Lcl1;

    iput-object v7, p1, Lbl1;->b:Lbl1;

    :goto_0
    iput-object v7, p0, LOj0;->k:Lcl1;

    return-object v7
.end method

.method public final f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 3

    iget-object v0, p0, LOj0;->o:LO70;

    if-nez v0, :cond_0

    new-instance v0, LO70;

    invoke-direct {v0}, LO70;-><init>()V

    iput-object v0, p0, LOj0;->o:LO70;

    :cond_0
    iget-object v0, p0, LOj0;->d:LzX5;

    invoke-virtual {v0, p1}, LzX5;->e(Ljava/lang/String;)LvX5;

    move-result-object p1

    iget v0, p1, LvX5;->g:I

    if-nez v0, :cond_3

    iget v0, p0, LOj0;->n:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LOj0;->n:I

    iget-object v0, p0, LOj0;->o:LO70;

    iget v1, p1, LvX5;->a:I

    invoke-virtual {v0, v1}, LO70;->k(I)LO70;

    iget-object v0, p0, LOj0;->o:LO70;

    const/4 v1, 0x0

    if-nez p2, :cond_1

    move p2, v1

    goto :goto_0

    :cond_1
    iget-object v2, p0, LOj0;->d:LzX5;

    invoke-virtual {v2, p2}, LzX5;->e(Ljava/lang/String;)LvX5;

    move-result-object p2

    iget p2, p2, LvX5;->a:I

    :goto_0
    invoke-virtual {v0, p2}, LO70;->k(I)LO70;

    iget-object p2, p0, LOj0;->o:LO70;

    if-nez p3, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, LOj0;->d:LzX5;

    invoke-virtual {v0, p3}, LzX5;->D(Ljava/lang/String;)I

    move-result v1

    :goto_1
    invoke-virtual {p2, v1}, LO70;->k(I)LO70;

    iget-object p2, p0, LOj0;->o:LO70;

    invoke-virtual {p2, p4}, LO70;->k(I)LO70;

    iget p2, p0, LOj0;->n:I

    iput p2, p1, LvX5;->g:I

    :cond_3
    return-void
.end method

.method public final g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)LYT2;
    .locals 9

    new-instance v8, LZT2;

    iget-object v1, p0, LOj0;->d:LzX5;

    iget v7, p0, LOj0;->H:I

    move-object v0, v8

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v7}, LZT2;-><init>(LzX5;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;I)V

    iget-object p1, p0, LOj0;->l:LZT2;

    if-nez p1, :cond_0

    iput-object v8, p0, LOj0;->l:LZT2;

    goto :goto_0

    :cond_0
    iget-object p1, p0, LOj0;->m:LZT2;

    iput-object v8, p1, LYT2;->b:LYT2;

    :goto_0
    iput-object v8, p0, LOj0;->m:LZT2;

    return-object v8
.end method

.method public final h(Ljava/lang/String;ILjava/lang/String;)LtV2;
    .locals 3

    new-instance v0, LuV2;

    iget-object v1, p0, LOj0;->d:LzX5;

    invoke-virtual {v1, p1}, LzX5;->y(Ljava/lang/String;)LvX5;

    move-result-object p1

    iget p1, p1, LvX5;->a:I

    if-nez p3, :cond_0

    const/4 p3, 0x0

    goto :goto_0

    :cond_0
    iget-object v2, p0, LOj0;->d:LzX5;

    invoke-virtual {v2, p3}, LzX5;->D(Ljava/lang/String;)I

    move-result p3

    :goto_0
    invoke-direct {v0, v1, p1, p2, p3}, LuV2;-><init>(LzX5;III)V

    iput-object v0, p0, LOj0;->y:LuV2;

    return-object v0
.end method

.method public final i(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, LOj0;->d:LzX5;

    invoke-virtual {v0, p1}, LzX5;->e(Ljava/lang/String;)LvX5;

    move-result-object p1

    iget p1, p1, LvX5;->a:I

    iput p1, p0, LOj0;->z:I

    return-void
.end method

.method public final j(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, LOj0;->B:LO70;

    if-nez v0, :cond_0

    new-instance v0, LO70;

    invoke-direct {v0}, LO70;-><init>()V

    iput-object v0, p0, LOj0;->B:LO70;

    :cond_0
    iget v0, p0, LOj0;->A:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LOj0;->A:I

    iget-object v0, p0, LOj0;->B:LO70;

    iget-object v1, p0, LOj0;->d:LzX5;

    invoke-virtual {v1, p1}, LzX5;->e(Ljava/lang/String;)LvX5;

    move-result-object p1

    iget p1, p1, LvX5;->a:I

    invoke-virtual {v0, p1}, LO70;->k(I)LO70;

    return-void
.end method

.method public final k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, LOj0;->d:LzX5;

    invoke-virtual {v0, p1}, LzX5;->e(Ljava/lang/String;)LvX5;

    move-result-object p1

    iget p1, p1, LvX5;->a:I

    iput p1, p0, LOj0;->p:I

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    iget-object p1, p0, LOj0;->d:LzX5;

    invoke-virtual {p1, p2, p3}, LzX5;->z(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    iput p1, p0, LOj0;->q:I

    :cond_0
    return-void
.end method

.method public final l(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, LOj0;->D:LO70;

    if-nez v0, :cond_0

    new-instance v0, LO70;

    invoke-direct {v0}, LO70;-><init>()V

    iput-object v0, p0, LOj0;->D:LO70;

    :cond_0
    iget v0, p0, LOj0;->C:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LOj0;->C:I

    iget-object v0, p0, LOj0;->D:LO70;

    iget-object v1, p0, LOj0;->d:LzX5;

    invoke-virtual {v1, p1}, LzX5;->e(Ljava/lang/String;)LvX5;

    move-result-object p1

    iget p1, p1, LvX5;->a:I

    invoke-virtual {v0, p1}, LO70;->k(I)LO70;

    return-void
.end method

.method public final m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lss4;
    .locals 2

    new-instance v0, Lts4;

    iget-object v1, p0, LOj0;->d:LzX5;

    invoke-direct {v0, v1, p1, p2, p3}, Lts4;-><init>(LzX5;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, LOj0;->E:Lts4;

    if-nez p1, :cond_0

    iput-object v0, p0, LOj0;->E:Lts4;

    goto :goto_0

    :cond_0
    iget-object p1, p0, LOj0;->F:Lts4;

    iput-object v0, p1, Lss4;->b:Lss4;

    :goto_0
    iput-object v0, p0, LOj0;->F:Lts4;

    return-object v0
.end method

.method public final n(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    if-eqz p1, :cond_0

    iget-object v0, p0, LOj0;->d:LzX5;

    invoke-virtual {v0, p1}, LzX5;->D(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, LOj0;->s:I

    :cond_0
    if-eqz p2, :cond_1

    new-instance p1, LO70;

    invoke-direct {p1}, LO70;-><init>()V

    const/4 v0, 0x0

    const v1, 0x7fffffff

    invoke-virtual {p1, p2, v0, v1}, LO70;->a(Ljava/lang/String;II)LO70;

    move-result-object p1

    iput-object p1, p0, LOj0;->t:LO70;

    :cond_1
    return-void
.end method

.method public final o(ILDb6;Ljava/lang/String;Z)LHf;
    .locals 1

    if-eqz p4, :cond_0

    iget-object p4, p0, LOj0;->d:LzX5;

    iget-object v0, p0, LOj0;->w:LIf;

    invoke-static {p4, p1, p2, p3, v0}, LIf;->i(LzX5;ILDb6;Ljava/lang/String;LIf;)LIf;

    move-result-object p1

    iput-object p1, p0, LOj0;->w:LIf;

    return-object p1

    :cond_0
    iget-object p4, p0, LOj0;->d:LzX5;

    iget-object v0, p0, LOj0;->x:LIf;

    invoke-static {p4, p1, p2, p3, v0}, LIf;->i(LzX5;ILDb6;Ljava/lang/String;LIf;)LIf;

    move-result-object p1

    iput-object p1, p0, LOj0;->x:LIf;

    return-object p1
.end method

.method public final p()[Ltp;
    .locals 2

    new-instance v0, Ltp$a;

    invoke-direct {v0}, Ltp$a;-><init>()V

    iget-object v1, p0, LOj0;->G:Ltp;

    invoke-virtual {v0, v1}, Ltp$a;->b(Ltp;)V

    iget-object v1, p0, LOj0;->j:Lcl1;

    :goto_0
    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Lcl1;->e(Ltp$a;)V

    iget-object v1, v1, Lbl1;->b:Lbl1;

    check-cast v1, Lcl1;

    goto :goto_0

    :cond_0
    iget-object v1, p0, LOj0;->l:LZT2;

    :goto_1
    if-eqz v1, :cond_1

    invoke-virtual {v1, v0}, LZT2;->H(Ltp$a;)V

    iget-object v1, v1, LYT2;->b:LYT2;

    check-cast v1, LZT2;

    goto :goto_1

    :cond_1
    iget-object v1, p0, LOj0;->E:Lts4;

    :goto_2
    if-eqz v1, :cond_2

    invoke-virtual {v1, v0}, Lts4;->e(Ltp$a;)V

    iget-object v1, v1, Lss4;->b:Lss4;

    check-cast v1, Lts4;

    goto :goto_2

    :cond_2
    invoke-virtual {v0}, Ltp$a;->d()[Ltp;

    move-result-object v0

    return-object v0
.end method

.method public q()Ljava/lang/ClassLoader;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    return-object v0
.end method

.method public r(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    invoke-virtual {p0}, LOj0;->q()Ljava/lang/ClassLoader;

    move-result-object v0

    const/16 v1, 0x2e

    const/16 v2, 0x2f

    :try_start_0
    invoke-virtual {p1, v2, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v3, v4, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-virtual {p2, v2, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v4, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    invoke-virtual {v3, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-object p2

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Class;->isInterface()Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {v0}, Ljava/lang/Class;->isInterface()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_0
    const-string p1, "java/lang/Object"

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/lang/TypeNotPresentException;

    invoke-direct {v0, p2, p1}, Ljava/lang/TypeNotPresentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p2

    new-instance v0, Ljava/lang/TypeNotPresentException;

    invoke-direct {v0, p1, p2}, Ljava/lang/TypeNotPresentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final s([BZ)[B
    .locals 3

    invoke-virtual {p0}, LOj0;->p()[Ltp;

    move-result-object v0

    const/4 v1, 0x0

    iput-object v1, p0, LOj0;->j:Lcl1;

    iput-object v1, p0, LOj0;->k:Lcl1;

    iput-object v1, p0, LOj0;->l:LZT2;

    iput-object v1, p0, LOj0;->m:LZT2;

    iput-object v1, p0, LOj0;->u:LIf;

    iput-object v1, p0, LOj0;->v:LIf;

    iput-object v1, p0, LOj0;->w:LIf;

    iput-object v1, p0, LOj0;->x:LIf;

    iput-object v1, p0, LOj0;->y:LuV2;

    const/4 v2, 0x0

    iput v2, p0, LOj0;->z:I

    iput v2, p0, LOj0;->A:I

    iput-object v1, p0, LOj0;->B:LO70;

    iput v2, p0, LOj0;->C:I

    iput-object v1, p0, LOj0;->D:LO70;

    iput-object v1, p0, LOj0;->E:Lts4;

    iput-object v1, p0, LOj0;->F:Lts4;

    iput-object v1, p0, LOj0;->G:Ltp;

    if-eqz p2, :cond_0

    const/4 v1, 0x3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    iput v1, p0, LOj0;->H:I

    new-instance v1, LKj0;

    invoke-direct {v1, p1, v2, v2}, LKj0;-><init>([BIZ)V

    if-eqz p2, :cond_1

    const/16 v2, 0x8

    :cond_1
    or-int/lit16 p1, v2, 0x100

    invoke-virtual {v1, p0, v0, p1}, LKj0;->a(LNj0;[Ltp;I)V

    invoke-virtual {p0}, LOj0;->t()[B

    move-result-object p1

    return-object p1
.end method

.method public t()[B
    .locals 28

    move-object/from16 v0, p0

    iget v1, v0, LOj0;->h:I

    const/4 v2, 0x2

    mul-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x18

    iget-object v3, v0, LOj0;->j:Lcl1;

    const/4 v5, 0x0

    :goto_0
    if-eqz v3, :cond_0

    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v3}, Lcl1;->f()I

    move-result v6

    add-int/2addr v1, v6

    iget-object v3, v3, Lbl1;->b:Lbl1;

    check-cast v3, Lcl1;

    goto :goto_0

    :cond_0
    iget-object v3, v0, LOj0;->l:LZT2;

    const/4 v6, 0x0

    :goto_1
    if-eqz v3, :cond_1

    add-int/lit8 v6, v6, 0x1

    invoke-virtual {v3}, LZT2;->K()I

    move-result v7

    add-int/2addr v1, v7

    iget-object v3, v3, LYT2;->b:LYT2;

    check-cast v3, LZT2;

    goto :goto_1

    :cond_1
    iget-object v3, v0, LOj0;->o:LO70;

    const-string v7, "InnerClasses"

    if-eqz v3, :cond_2

    iget v3, v3, LO70;->b:I

    add-int/lit8 v3, v3, 0x8

    add-int/2addr v1, v3

    iget-object v3, v0, LOj0;->d:LzX5;

    invoke-virtual {v3, v7}, LzX5;->D(Ljava/lang/String;)I

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    iget v8, v0, LOj0;->p:I

    const-string v9, "EnclosingMethod"

    if-eqz v8, :cond_3

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v1, v1, 0xa

    iget-object v8, v0, LOj0;->d:LzX5;

    invoke-virtual {v8, v9}, LzX5;->D(Ljava/lang/String;)I

    :cond_3
    iget v8, v0, LOj0;->e:I

    const/16 v10, 0x1000

    and-int/2addr v8, v10

    const-string v11, "Synthetic"

    const/16 v12, 0x31

    const v13, 0xffff

    if-eqz v8, :cond_4

    iget v8, v0, LOj0;->c:I

    and-int/2addr v8, v13

    if-ge v8, v12, :cond_4

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v1, v1, 0x6

    iget-object v8, v0, LOj0;->d:LzX5;

    invoke-virtual {v8, v11}, LzX5;->D(Ljava/lang/String;)I

    :cond_4
    iget v8, v0, LOj0;->r:I

    const-string v14, "Signature"

    if-eqz v8, :cond_5

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v1, v1, 0x8

    iget-object v8, v0, LOj0;->d:LzX5;

    invoke-virtual {v8, v14}, LzX5;->D(Ljava/lang/String;)I

    :cond_5
    iget v8, v0, LOj0;->s:I

    const-string v15, "SourceFile"

    if-eqz v8, :cond_6

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v1, v1, 0x8

    iget-object v8, v0, LOj0;->d:LzX5;

    invoke-virtual {v8, v15}, LzX5;->D(Ljava/lang/String;)I

    :cond_6
    iget-object v8, v0, LOj0;->t:LO70;

    const-string v10, "SourceDebugExtension"

    if-eqz v8, :cond_7

    add-int/lit8 v3, v3, 0x1

    iget v8, v8, LO70;->b:I

    add-int/lit8 v8, v8, 0x6

    add-int/2addr v1, v8

    iget-object v8, v0, LOj0;->d:LzX5;

    invoke-virtual {v8, v10}, LzX5;->D(Ljava/lang/String;)I

    :cond_7
    iget v8, v0, LOj0;->e:I

    const/high16 v16, 0x20000

    and-int v8, v8, v16

    const-string v4, "Deprecated"

    if-eqz v8, :cond_8

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v1, v1, 0x6

    iget-object v8, v0, LOj0;->d:LzX5;

    invoke-virtual {v8, v4}, LzX5;->D(Ljava/lang/String;)I

    :cond_8
    iget-object v8, v0, LOj0;->u:LIf;

    if-eqz v8, :cond_9

    add-int/lit8 v3, v3, 0x1

    const-string v2, "RuntimeVisibleAnnotations"

    invoke-virtual {v8, v2}, LIf;->g(Ljava/lang/String;)I

    move-result v2

    add-int/2addr v1, v2

    :cond_9
    iget-object v2, v0, LOj0;->v:LIf;

    if-eqz v2, :cond_a

    add-int/lit8 v3, v3, 0x1

    const-string v8, "RuntimeInvisibleAnnotations"

    invoke-virtual {v2, v8}, LIf;->g(Ljava/lang/String;)I

    move-result v2

    add-int/2addr v1, v2

    :cond_a
    iget-object v2, v0, LOj0;->w:LIf;

    if-eqz v2, :cond_b

    add-int/lit8 v3, v3, 0x1

    const-string v8, "RuntimeVisibleTypeAnnotations"

    invoke-virtual {v2, v8}, LIf;->g(Ljava/lang/String;)I

    move-result v2

    add-int/2addr v1, v2

    :cond_b
    iget-object v2, v0, LOj0;->x:LIf;

    if-eqz v2, :cond_c

    add-int/lit8 v3, v3, 0x1

    const-string v8, "RuntimeInvisibleTypeAnnotations"

    invoke-virtual {v2, v8}, LIf;->g(Ljava/lang/String;)I

    move-result v2

    add-int/2addr v1, v2

    :cond_c
    iget-object v2, v0, LOj0;->d:LzX5;

    invoke-virtual {v2}, LzX5;->L()I

    move-result v2

    if-lez v2, :cond_d

    add-int/lit8 v3, v3, 0x1

    iget-object v2, v0, LOj0;->d:LzX5;

    invoke-virtual {v2}, LzX5;->L()I

    move-result v2

    add-int/2addr v1, v2

    :cond_d
    iget-object v2, v0, LOj0;->y:LuV2;

    if-eqz v2, :cond_e

    invoke-virtual {v2}, LuV2;->j()I

    move-result v2

    add-int/2addr v3, v2

    iget-object v2, v0, LOj0;->y:LuV2;

    invoke-virtual {v2}, LuV2;->i()I

    move-result v2

    add-int/2addr v1, v2

    :cond_e
    iget v2, v0, LOj0;->z:I

    const-string v8, "NestHost"

    if-eqz v2, :cond_f

    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v1, v1, 0x8

    iget-object v2, v0, LOj0;->d:LzX5;

    invoke-virtual {v2, v8}, LzX5;->D(Ljava/lang/String;)I

    :cond_f
    iget-object v2, v0, LOj0;->B:LO70;

    const-string v12, "NestMembers"

    if-eqz v2, :cond_10

    add-int/lit8 v3, v3, 0x1

    iget v2, v2, LO70;->b:I

    add-int/lit8 v2, v2, 0x8

    add-int/2addr v1, v2

    iget-object v2, v0, LOj0;->d:LzX5;

    invoke-virtual {v2, v12}, LzX5;->D(Ljava/lang/String;)I

    :cond_10
    iget-object v2, v0, LOj0;->D:LO70;

    const-string v13, "PermittedSubclasses"

    if-eqz v2, :cond_11

    add-int/lit8 v3, v3, 0x1

    iget v2, v2, LO70;->b:I

    add-int/lit8 v2, v2, 0x8

    add-int/2addr v1, v2

    iget-object v2, v0, LOj0;->d:LzX5;

    invoke-virtual {v2, v13}, LzX5;->D(Ljava/lang/String;)I

    :cond_11
    iget v2, v0, LOj0;->e:I

    const/high16 v17, 0x10000

    and-int v2, v2, v17

    move-object/from16 v18, v13

    const-string v13, "Record"

    if-nez v2, :cond_13

    iget-object v2, v0, LOj0;->E:Lts4;

    if-eqz v2, :cond_12

    goto :goto_3

    :cond_12
    const/16 v19, 0x0

    const/16 v20, 0x0

    goto :goto_5

    :cond_13
    :goto_3
    iget-object v2, v0, LOj0;->E:Lts4;

    const/16 v19, 0x0

    const/16 v20, 0x0

    :goto_4
    if-eqz v2, :cond_14

    add-int/lit8 v20, v20, 0x1

    invoke-virtual {v2}, Lts4;->f()I

    move-result v21

    add-int v19, v19, v21

    iget-object v2, v2, Lss4;->b:Lss4;

    check-cast v2, Lts4;

    goto :goto_4

    :cond_14
    add-int/lit8 v3, v3, 0x1

    add-int/lit8 v2, v19, 0x8

    add-int/2addr v1, v2

    iget-object v2, v0, LOj0;->d:LzX5;

    invoke-virtual {v2, v13}, LzX5;->D(Ljava/lang/String;)I

    :goto_5
    iget-object v2, v0, LOj0;->G:Ltp;

    if-eqz v2, :cond_15

    invoke-virtual {v2}, Ltp;->d()I

    move-result v2

    add-int/2addr v3, v2

    iget-object v2, v0, LOj0;->G:Ltp;

    move/from16 v21, v3

    iget-object v3, v0, LOj0;->d:LzX5;

    invoke-virtual {v2, v3}, Ltp;->a(LzX5;)I

    move-result v2

    add-int/2addr v1, v2

    move/from16 v3, v21

    :cond_15
    iget-object v2, v0, LOj0;->d:LzX5;

    invoke-virtual {v2}, LzX5;->Q()I

    move-result v2

    add-int/2addr v1, v2

    iget-object v2, v0, LOj0;->d:LzX5;

    invoke-virtual {v2}, LzX5;->P()I

    move-result v2

    move-object/from16 v21, v13

    const v13, 0xffff

    if-gt v2, v13, :cond_29

    new-instance v2, LO70;

    invoke-direct {v2, v1}, LO70;-><init>(I)V

    const v1, -0x35014542    # -8346975.0f

    invoke-virtual {v2, v1}, LO70;->i(I)LO70;

    move-result-object v1

    iget v13, v0, LOj0;->c:I

    invoke-virtual {v1, v13}, LO70;->i(I)LO70;

    iget-object v1, v0, LOj0;->d:LzX5;

    invoke-virtual {v1, v2}, LzX5;->e0(LO70;)V

    iget v1, v0, LOj0;->c:I

    const v13, 0xffff

    and-int/2addr v1, v13

    const/16 v13, 0x31

    if-ge v1, v13, :cond_16

    const/16 v1, 0x1000

    goto :goto_6

    :cond_16
    const/4 v1, 0x0

    :goto_6
    iget v13, v0, LOj0;->e:I

    not-int v1, v1

    and-int/2addr v1, v13

    invoke-virtual {v2, v1}, LO70;->k(I)LO70;

    move-result-object v1

    iget v13, v0, LOj0;->f:I

    invoke-virtual {v1, v13}, LO70;->k(I)LO70;

    move-result-object v1

    iget v13, v0, LOj0;->g:I

    invoke-virtual {v1, v13}, LO70;->k(I)LO70;

    iget v1, v0, LOj0;->h:I

    invoke-virtual {v2, v1}, LO70;->k(I)LO70;

    const/4 v1, 0x0

    :goto_7
    iget v13, v0, LOj0;->h:I

    if-ge v1, v13, :cond_17

    iget-object v13, v0, LOj0;->i:[I

    aget v13, v13, v1

    invoke-virtual {v2, v13}, LO70;->k(I)LO70;

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_17
    invoke-virtual {v2, v5}, LO70;->k(I)LO70;

    iget-object v1, v0, LOj0;->j:Lcl1;

    :goto_8
    if-eqz v1, :cond_18

    invoke-virtual {v1, v2}, Lcl1;->g(LO70;)V

    iget-object v1, v1, Lbl1;->b:Lbl1;

    check-cast v1, Lcl1;

    goto :goto_8

    :cond_18
    invoke-virtual {v2, v6}, LO70;->k(I)LO70;

    iget-object v1, v0, LOj0;->l:LZT2;

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_9
    if-eqz v1, :cond_19

    invoke-virtual {v1}, LZT2;->N()Z

    move-result v13

    or-int/2addr v5, v13

    invoke-virtual {v1}, LZT2;->M()Z

    move-result v13

    or-int/2addr v6, v13

    invoke-virtual {v1, v2}, LZT2;->R(LO70;)V

    iget-object v1, v1, LYT2;->b:LYT2;

    check-cast v1, LZT2;

    goto :goto_9

    :cond_19
    invoke-virtual {v2, v3}, LO70;->k(I)LO70;

    iget-object v1, v0, LOj0;->o:LO70;

    if-eqz v1, :cond_1a

    iget-object v1, v0, LOj0;->d:LzX5;

    invoke-virtual {v1, v7}, LzX5;->D(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v2, v1}, LO70;->k(I)LO70;

    move-result-object v1

    iget-object v3, v0, LOj0;->o:LO70;

    iget v3, v3, LO70;->b:I

    const/4 v7, 0x2

    add-int/2addr v3, v7

    invoke-virtual {v1, v3}, LO70;->i(I)LO70;

    move-result-object v1

    iget v3, v0, LOj0;->n:I

    invoke-virtual {v1, v3}, LO70;->k(I)LO70;

    move-result-object v1

    iget-object v3, v0, LOj0;->o:LO70;

    iget-object v7, v3, LO70;->a:[B

    iget v3, v3, LO70;->b:I

    const/4 v13, 0x0

    invoke-virtual {v1, v7, v13, v3}, LO70;->h([BII)LO70;

    :cond_1a
    iget v1, v0, LOj0;->p:I

    if-eqz v1, :cond_1b

    iget-object v1, v0, LOj0;->d:LzX5;

    invoke-virtual {v1, v9}, LzX5;->D(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v2, v1}, LO70;->k(I)LO70;

    move-result-object v1

    const/4 v3, 0x4

    invoke-virtual {v1, v3}, LO70;->i(I)LO70;

    move-result-object v1

    iget v3, v0, LOj0;->p:I

    invoke-virtual {v1, v3}, LO70;->k(I)LO70;

    move-result-object v1

    iget v3, v0, LOj0;->q:I

    invoke-virtual {v1, v3}, LO70;->k(I)LO70;

    :cond_1b
    iget v1, v0, LOj0;->e:I

    const/16 v3, 0x1000

    and-int/2addr v1, v3

    if-eqz v1, :cond_1c

    iget v1, v0, LOj0;->c:I

    const v3, 0xffff

    and-int/2addr v1, v3

    const/16 v3, 0x31

    if-ge v1, v3, :cond_1c

    iget-object v1, v0, LOj0;->d:LzX5;

    invoke-virtual {v1, v11}, LzX5;->D(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v2, v1}, LO70;->k(I)LO70;

    move-result-object v1

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, LO70;->i(I)LO70;

    :cond_1c
    iget v1, v0, LOj0;->r:I

    if-eqz v1, :cond_1d

    iget-object v1, v0, LOj0;->d:LzX5;

    invoke-virtual {v1, v14}, LzX5;->D(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v2, v1}, LO70;->k(I)LO70;

    move-result-object v1

    const/4 v3, 0x2

    invoke-virtual {v1, v3}, LO70;->i(I)LO70;

    move-result-object v1

    iget v7, v0, LOj0;->r:I

    invoke-virtual {v1, v7}, LO70;->k(I)LO70;

    goto :goto_a

    :cond_1d
    const/4 v3, 0x2

    :goto_a
    iget v1, v0, LOj0;->s:I

    if-eqz v1, :cond_1e

    iget-object v1, v0, LOj0;->d:LzX5;

    invoke-virtual {v1, v15}, LzX5;->D(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v2, v1}, LO70;->k(I)LO70;

    move-result-object v1

    invoke-virtual {v1, v3}, LO70;->i(I)LO70;

    move-result-object v1

    iget v3, v0, LOj0;->s:I

    invoke-virtual {v1, v3}, LO70;->k(I)LO70;

    :cond_1e
    iget-object v1, v0, LOj0;->t:LO70;

    if-eqz v1, :cond_1f

    iget v1, v1, LO70;->b:I

    iget-object v3, v0, LOj0;->d:LzX5;

    invoke-virtual {v3, v10}, LzX5;->D(Ljava/lang/String;)I

    move-result v3

    invoke-virtual {v2, v3}, LO70;->k(I)LO70;

    move-result-object v3

    invoke-virtual {v3, v1}, LO70;->i(I)LO70;

    move-result-object v3

    iget-object v7, v0, LOj0;->t:LO70;

    iget-object v7, v7, LO70;->a:[B

    const/4 v9, 0x0

    invoke-virtual {v3, v7, v9, v1}, LO70;->h([BII)LO70;

    goto :goto_b

    :cond_1f
    const/4 v9, 0x0

    :goto_b
    iget v1, v0, LOj0;->e:I

    and-int v1, v1, v16

    if-eqz v1, :cond_20

    iget-object v1, v0, LOj0;->d:LzX5;

    invoke-virtual {v1, v4}, LzX5;->D(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v2, v1}, LO70;->k(I)LO70;

    move-result-object v1

    invoke-virtual {v1, v9}, LO70;->i(I)LO70;

    :cond_20
    iget-object v1, v0, LOj0;->d:LzX5;

    iget-object v3, v0, LOj0;->u:LIf;

    iget-object v4, v0, LOj0;->v:LIf;

    iget-object v7, v0, LOj0;->w:LIf;

    iget-object v9, v0, LOj0;->x:LIf;

    move-object/from16 v22, v1

    move-object/from16 v23, v3

    move-object/from16 v24, v4

    move-object/from16 v25, v7

    move-object/from16 v26, v9

    move-object/from16 v27, v2

    invoke-static/range {v22 .. v27}, LIf;->l(LzX5;LIf;LIf;LIf;LIf;LO70;)V

    iget-object v1, v0, LOj0;->d:LzX5;

    invoke-virtual {v1, v2}, LzX5;->d0(LO70;)V

    iget-object v1, v0, LOj0;->y:LuV2;

    if-eqz v1, :cond_21

    invoke-virtual {v1, v2}, LuV2;->k(LO70;)V

    :cond_21
    iget v1, v0, LOj0;->z:I

    if-eqz v1, :cond_22

    iget-object v1, v0, LOj0;->d:LzX5;

    invoke-virtual {v1, v8}, LzX5;->D(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v2, v1}, LO70;->k(I)LO70;

    move-result-object v1

    const/4 v3, 0x2

    invoke-virtual {v1, v3}, LO70;->i(I)LO70;

    move-result-object v1

    iget v3, v0, LOj0;->z:I

    invoke-virtual {v1, v3}, LO70;->k(I)LO70;

    :cond_22
    iget-object v1, v0, LOj0;->B:LO70;

    if-eqz v1, :cond_23

    iget-object v1, v0, LOj0;->d:LzX5;

    invoke-virtual {v1, v12}, LzX5;->D(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v2, v1}, LO70;->k(I)LO70;

    move-result-object v1

    iget-object v3, v0, LOj0;->B:LO70;

    iget v3, v3, LO70;->b:I

    const/4 v4, 0x2

    add-int/2addr v3, v4

    invoke-virtual {v1, v3}, LO70;->i(I)LO70;

    move-result-object v1

    iget v3, v0, LOj0;->A:I

    invoke-virtual {v1, v3}, LO70;->k(I)LO70;

    move-result-object v1

    iget-object v3, v0, LOj0;->B:LO70;

    iget-object v4, v3, LO70;->a:[B

    iget v3, v3, LO70;->b:I

    const/4 v7, 0x0

    invoke-virtual {v1, v4, v7, v3}, LO70;->h([BII)LO70;

    :cond_23
    iget-object v1, v0, LOj0;->D:LO70;

    if-eqz v1, :cond_24

    iget-object v1, v0, LOj0;->d:LzX5;

    move-object/from16 v3, v18

    invoke-virtual {v1, v3}, LzX5;->D(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v2, v1}, LO70;->k(I)LO70;

    move-result-object v1

    iget-object v3, v0, LOj0;->D:LO70;

    iget v3, v3, LO70;->b:I

    const/4 v4, 0x2

    add-int/2addr v3, v4

    invoke-virtual {v1, v3}, LO70;->i(I)LO70;

    move-result-object v1

    iget v3, v0, LOj0;->C:I

    invoke-virtual {v1, v3}, LO70;->k(I)LO70;

    move-result-object v1

    iget-object v3, v0, LOj0;->D:LO70;

    iget-object v4, v3, LO70;->a:[B

    iget v3, v3, LO70;->b:I

    const/4 v7, 0x0

    invoke-virtual {v1, v4, v7, v3}, LO70;->h([BII)LO70;

    :cond_24
    iget v1, v0, LOj0;->e:I

    and-int v1, v1, v17

    if-nez v1, :cond_25

    iget-object v1, v0, LOj0;->E:Lts4;

    if-eqz v1, :cond_26

    :cond_25
    iget-object v1, v0, LOj0;->d:LzX5;

    move-object/from16 v3, v21

    invoke-virtual {v1, v3}, LzX5;->D(Ljava/lang/String;)I

    move-result v1

    invoke-virtual {v2, v1}, LO70;->k(I)LO70;

    move-result-object v1

    const/4 v3, 0x2

    add-int/lit8 v3, v19, 0x2

    invoke-virtual {v1, v3}, LO70;->i(I)LO70;

    move-result-object v1

    move/from16 v3, v20

    invoke-virtual {v1, v3}, LO70;->k(I)LO70;

    iget-object v1, v0, LOj0;->E:Lts4;

    :goto_c
    if-eqz v1, :cond_26

    invoke-virtual {v1, v2}, Lts4;->g(LO70;)V

    iget-object v1, v1, Lss4;->b:Lss4;

    check-cast v1, Lts4;

    goto :goto_c

    :cond_26
    iget-object v1, v0, LOj0;->G:Ltp;

    if-eqz v1, :cond_27

    iget-object v3, v0, LOj0;->d:LzX5;

    invoke-virtual {v1, v3, v2}, Ltp;->g(LzX5;LO70;)V

    :cond_27
    if-eqz v6, :cond_28

    iget-object v1, v2, LO70;->a:[B

    invoke-virtual {v0, v1, v5}, LOj0;->s([BZ)[B

    move-result-object v1

    return-object v1

    :cond_28
    iget-object v1, v2, LO70;->a:[B

    return-object v1

    :cond_29
    new-instance v1, Lcom/nimbusds/jose/shaded/ow2asm/ClassTooLargeException;

    iget-object v3, v0, LOj0;->d:LzX5;

    invoke-virtual {v3}, LzX5;->O()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v3, v2}, Lcom/nimbusds/jose/shaded/ow2asm/ClassTooLargeException;-><init>(Ljava/lang/String;I)V

    throw v1
.end method

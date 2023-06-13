.class public Lja4$h;
.super Lja4$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lja4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "h"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lja4$g;-><init>(Lja4$a;)V

    return-void
.end method

.method public synthetic constructor <init>(Lja4$a;)V
    .locals 0

    invoke-direct {p0}, Lja4$h;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LcT5;Ljava/lang/Object;)Lcp;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, LcT5;->j()LG9;

    move-result-object p2

    invoke-virtual {p2}, LG9;->s()LE;

    move-result-object p2

    invoke-static {p2}, LFH6;->o(Ljava/lang/Object;)LFH6;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, LFH6;->s()LG9;

    move-result-object v0

    invoke-virtual {v0}, LG9;->j()LN;

    move-result-object v0

    invoke-virtual {p1}, LcT5;->u()LS;

    move-result-object p1

    invoke-static {p1}, LUH6;->j(Ljava/lang/Object;)LUH6;

    move-result-object p1

    new-instance v1, LVH6$b;

    new-instance v2, LRH6;

    invoke-virtual {p2}, LFH6;->j()I

    move-result p2

    invoke-static {v0}, LHi6;->b(LN;)LP31;

    move-result-object v0

    invoke-direct {v2, p2, v0}, LRH6;-><init>(ILP31;)V

    invoke-direct {v1, v2}, LVH6$b;-><init>(LRH6;)V

    invoke-virtual {p1}, LUH6;->o()[B

    move-result-object p2

    invoke-virtual {v1, p2}, LVH6$b;->g([B)LVH6$b;

    move-result-object p2

    invoke-virtual {p1}, LUH6;->s()[B

    move-result-object p1

    invoke-virtual {p2, p1}, LVH6$b;->h([B)LVH6$b;

    move-result-object p1

    :goto_0
    invoke-virtual {p1}, LVH6$b;->e()LVH6;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, LcT5;->u()LS;

    move-result-object p1

    invoke-static {p1}, LO;->A(Ljava/lang/Object;)LO;

    move-result-object p1

    invoke-virtual {p1}, LO;->C()[B

    move-result-object p1

    new-instance p2, LVH6$b;

    const/4 v0, 0x0

    invoke-static {p1, v0}, LDD3;->a([BI)I

    move-result v0

    invoke-static {v0}, LRH6;->k(I)LRH6;

    move-result-object v0

    invoke-direct {p2, v0}, LVH6$b;-><init>(LRH6;)V

    invoke-virtual {p2, p1}, LVH6$b;->f([B)LVH6$b;

    move-result-object p1

    goto :goto_0
.end method

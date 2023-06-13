.class public LkM5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[LWB1;

.field public b:D

.field public c:Lqp0;


# direct methods
.method public constructor <init>(LWB1;LWB1;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x2

    new-array v0, v0, [LWB1;

    iput-object v0, p0, LkM5;->a:[LWB1;

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    aput-object p2, v0, p1

    invoke-virtual {p0}, LkM5;->a()V

    return-void
.end method

.method public static c(LWB1;LWB1;I)LWB1;
    .locals 1

    new-instance v0, LkM5;

    invoke-direct {v0, p0, p1}, LkM5;-><init>(LWB1;LWB1;)V

    invoke-virtual {v0, p2}, LkM5;->b(I)LWB1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-object v0, p0, LkM5;->a:[LWB1;

    const/4 v1, 0x0

    aget-object v1, v0, v1

    const/4 v2, 0x1

    aget-object v0, v0, v2

    invoke-static {v1, v0}, LfC1;->b(LWB1;LWB1;)D

    move-result-wide v0

    iput-wide v0, p0, LkM5;->b:D

    return-void
.end method

.method public b(I)LWB1;
    .locals 3

    iget-object v0, p0, LkM5;->a:[LWB1;

    invoke-virtual {p0, v0}, LkM5;->f([LWB1;)[LWB1;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v1, v0, v1

    const/4 v2, 0x1

    aget-object v0, v0, v2

    invoke-static {v1, v0, p1}, LwA3;->v(LWB1;LWB1;I)LWB1;

    move-result-object p1

    invoke-virtual {p0, p1}, LkM5;->d(LWB1;)LWB1;

    move-result-object p1

    return-object p1
.end method

.method public final d(LWB1;)LWB1;
    .locals 1

    iget-object v0, p0, LkM5;->c:Lqp0;

    invoke-virtual {v0, p1}, Lqp0;->b(LWB1;)V

    return-object p1
.end method

.method public final e([LWB1;)[LWB1;
    .locals 5

    new-instance v0, Lqp0;

    invoke-direct {v0}, Lqp0;-><init>()V

    iput-object v0, p0, LkM5;->c:Lqp0;

    const/4 v1, 0x0

    aget-object v2, p1, v1

    invoke-virtual {v0, v2}, Lqp0;->a(LWB1;)V

    iget-object v0, p0, LkM5;->c:Lqp0;

    const/4 v2, 0x1

    aget-object v3, p1, v2

    invoke-virtual {v0, v3}, Lqp0;->a(LWB1;)V

    const/4 v0, 0x2

    new-array v0, v0, [LWB1;

    iget-object v3, p0, LkM5;->c:Lqp0;

    aget-object v4, p1, v1

    invoke-virtual {v4}, LWB1;->m()LWB1;

    move-result-object v4

    invoke-virtual {v3, v4}, Lqp0;->c(LWB1;)LWB1;

    move-result-object v3

    aput-object v3, v0, v1

    iget-object v1, p0, LkM5;->c:Lqp0;

    aget-object p1, p1, v2

    invoke-virtual {p1}, LWB1;->m()LWB1;

    move-result-object p1

    invoke-virtual {v1, p1}, Lqp0;->c(LWB1;)LWB1;

    move-result-object p1

    aput-object p1, v0, v2

    return-object v0
.end method

.method public final f([LWB1;)[LWB1;
    .locals 3

    invoke-virtual {p0, p1}, LkM5;->e([LWB1;)[LWB1;

    move-result-object p1

    const/4 v0, 0x0

    aget-object v0, p1, v0

    const/4 v1, 0x1

    aget-object p1, p1, v1

    iget-wide v1, p0, LkM5;->b:D

    invoke-static {v0, p1, v1, v2}, LfC1;->e(LWB1;LWB1;D)[LWB1;

    move-result-object p1

    return-object p1
.end method

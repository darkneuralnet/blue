.class public Lia6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZ96;


# static fields
.field public static volatile e:Lja6;


# instance fields
.field public final a:Lbl0;

.field public final b:Lbl0;

.field public final c:Lwm5;

.field public final d:Lyf6;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Lbl0;Lbl0;Lwm5;Lyf6;LXC6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lia6;->a:Lbl0;

    iput-object p2, p0, Lia6;->b:Lbl0;

    iput-object p3, p0, Lia6;->c:Lwm5;

    iput-object p4, p0, Lia6;->d:Lyf6;

    invoke-virtual {p5}, LXC6;->c()V

    return-void
.end method

.method public static c()Lia6;
    .locals 2

    sget-object v0, Lia6;->e:Lja6;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lja6;->b()Lia6;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Not initialized!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static d(LG01;)Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LG01;",
            ")",
            "Ljava/util/Set<",
            "LPc1;",
            ">;"
        }
    .end annotation

    instance-of v0, p0, Ljb1;

    if-eqz v0, :cond_0

    check-cast p0, Ljb1;

    invoke-interface {p0}, Ljb1;->a()Ljava/util/Set;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "proto"

    invoke-static {p0}, LPc1;->b(Ljava/lang/String;)LPc1;

    move-result-object p0

    invoke-static {p0}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static f(Landroid/content/Context;)V
    .locals 2

    sget-object v0, Lia6;->e:Lja6;

    if-nez v0, :cond_1

    const-class v0, Lia6;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lia6;->e:Lja6;

    if-nez v1, :cond_0

    invoke-static {}, LiR0;->c()Lja6$a;

    move-result-object v1

    invoke-interface {v1, p0}, Lja6$a;->a(Landroid/content/Context;)Lja6$a;

    move-result-object p0

    invoke-interface {p0}, Lja6$a;->build()Lja6;

    move-result-object p0

    sput-object p0, Lia6;->e:Lja6;

    :cond_0
    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p0

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public a(LBs5;Lla6;)V
    .locals 3

    iget-object v0, p0, Lia6;->c:Lwm5;

    invoke-virtual {p1}, LBs5;->f()LT96;

    move-result-object v1

    invoke-virtual {p1}, LBs5;->c()Lyg1;

    move-result-object v2

    invoke-virtual {v2}, Lyg1;->c()LN24;

    move-result-object v2

    invoke-virtual {v1, v2}, LT96;->f(LN24;)LT96;

    move-result-object v1

    invoke-virtual {p0, p1}, Lia6;->b(LBs5;)LJg1;

    move-result-object p1

    invoke-interface {v0, v1, p1, p2}, Lwm5;->a(LT96;LJg1;Lla6;)V

    return-void
.end method

.method public final b(LBs5;)LJg1;
    .locals 4

    invoke-static {}, LJg1;->a()LJg1$a;

    move-result-object v0

    iget-object v1, p0, Lia6;->a:Lbl0;

    invoke-interface {v1}, Lbl0;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LJg1$a;->i(J)LJg1$a;

    move-result-object v0

    iget-object v1, p0, Lia6;->b:Lbl0;

    invoke-interface {v1}, Lbl0;->a()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, LJg1$a;->k(J)LJg1$a;

    move-result-object v0

    invoke-virtual {p1}, LBs5;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, LJg1$a;->j(Ljava/lang/String;)LJg1$a;

    move-result-object v0

    new-instance v1, Lkb1;

    invoke-virtual {p1}, LBs5;->b()LPc1;

    move-result-object v2

    invoke-virtual {p1}, LBs5;->d()[B

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lkb1;-><init>(LPc1;[B)V

    invoke-virtual {v0, v1}, LJg1$a;->h(Lkb1;)LJg1$a;

    move-result-object v0

    invoke-virtual {p1}, LBs5;->c()Lyg1;

    move-result-object p1

    invoke-virtual {p1}, Lyg1;->a()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, LJg1$a;->g(Ljava/lang/Integer;)LJg1$a;

    move-result-object p1

    invoke-virtual {p1}, LJg1$a;->d()LJg1;

    move-result-object p1

    return-object p1
.end method

.method public e()Lyf6;
    .locals 1

    iget-object v0, p0, Lia6;->d:Lyf6;

    return-object v0
.end method

.method public g(LG01;)LU96;
    .locals 4

    new-instance v0, LV96;

    invoke-static {p1}, Lia6;->d(LG01;)Ljava/util/Set;

    move-result-object v1

    invoke-static {}, LT96;->a()LT96$a;

    move-result-object v2

    invoke-interface {p1}, LG01;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, LT96$a;->b(Ljava/lang/String;)LT96$a;

    move-result-object v2

    invoke-interface {p1}, LG01;->getExtras()[B

    move-result-object p1

    invoke-virtual {v2, p1}, LT96$a;->c([B)LT96$a;

    move-result-object p1

    invoke-virtual {p1}, LT96$a;->a()LT96;

    move-result-object p1

    invoke-direct {v0, v1, p1, p0}, LV96;-><init>(Ljava/util/Set;LT96;LZ96;)V

    return-object v0
.end method

.method public h(Ljava/lang/String;)LU96;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    new-instance v0, LV96;

    const/4 v1, 0x0

    invoke-static {v1}, Lia6;->d(LG01;)Ljava/util/Set;

    move-result-object v1

    invoke-static {}, LT96;->a()LT96$a;

    move-result-object v2

    invoke-virtual {v2, p1}, LT96$a;->b(Ljava/lang/String;)LT96$a;

    move-result-object p1

    invoke-virtual {p1}, LT96$a;->a()LT96;

    move-result-object p1

    invoke-direct {v0, v1, p1, p0}, LV96;-><init>(Ljava/util/Set;LT96;LZ96;)V

    return-object v0
.end method

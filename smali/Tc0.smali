.class public abstract LTc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:Lai3;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lai3;

    invoke-direct {v0}, Lai3;-><init>()V

    iput-object v0, p0, LTc0;->b:Lai3;

    return-void
.end method

.method public static b(Ljava/util/UUID;LaD6;)LTc0;
    .locals 1

    new-instance v0, LTc0$a;

    invoke-direct {v0, p1, p0}, LTc0$a;-><init>(LaD6;Ljava/util/UUID;)V

    return-object v0
.end method

.method public static c(Ljava/lang/String;LaD6;Z)LTc0;
    .locals 1

    new-instance v0, LTc0$b;

    invoke-direct {v0, p1, p0, p2}, LTc0$b;-><init>(LaD6;Ljava/lang/String;Z)V

    return-object v0
.end method


# virtual methods
.method public a(LaD6;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, LaD6;->u()Landroidx/work/impl/WorkDatabase;

    move-result-object v0

    invoke-virtual {p0, v0, p2}, LTc0;->e(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)V

    invoke-virtual {p1}, LaD6;->r()Li74;

    move-result-object v0

    invoke-virtual {v0, p2}, Li74;->r(Ljava/lang/String;)Z

    invoke-virtual {p1}, LaD6;->s()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxm5;

    invoke-interface {v0, p2}, Lxm5;->e(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public d()LXh3;
    .locals 1

    iget-object v0, p0, LTc0;->b:Lai3;

    return-object v0
.end method

.method public final e(Landroidx/work/impl/WorkDatabase;Ljava/lang/String;)V
    .locals 4

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->I()LIG6;

    move-result-object v0

    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->D()Lm01;

    move-result-object p1

    new-instance v1, Ljava/util/LinkedList;

    invoke-direct {v1}, Ljava/util/LinkedList;-><init>()V

    invoke-virtual {v1, p2}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_1

    invoke-virtual {v1}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-interface {v0, p2}, LIG6;->b(Ljava/lang/String;)LUC6$a;

    move-result-object v2

    sget-object v3, LUC6$a;->d:LUC6$a;

    if-eq v2, v3, :cond_0

    sget-object v3, LUC6$a;->e:LUC6$a;

    if-eq v2, v3, :cond_0

    sget-object v2, LUC6$a;->g:LUC6$a;

    invoke-interface {v0, v2, p2}, LIG6;->j(LUC6$a;Ljava/lang/String;)I

    :cond_0
    invoke-interface {p1, p2}, Lm01;->a(Ljava/lang/String;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {v1, p2}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_1
    return-void
.end method

.method public f(LaD6;)V
    .locals 2

    invoke-virtual {p1}, LaD6;->n()Landroidx/work/a;

    move-result-object v0

    invoke-virtual {p1}, LaD6;->u()Landroidx/work/impl/WorkDatabase;

    move-result-object v1

    invoke-virtual {p1}, LaD6;->s()Ljava/util/List;

    move-result-object p1

    invoke-static {v0, v1, p1}, LEm5;->b(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    return-void
.end method

.method public abstract g()V
.end method

.method public run()V
    .locals 3

    :try_start_0
    invoke-virtual {p0}, LTc0;->g()V

    iget-object v0, p0, LTc0;->b:Lai3;

    sget-object v1, LXh3;->a:LXh3$b$c;

    invoke-virtual {v0, v1}, Lai3;->a(LXh3$b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    iget-object v1, p0, LTc0;->b:Lai3;

    new-instance v2, LXh3$b$a;

    invoke-direct {v2, v0}, LXh3$b$a;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v1, v2}, Lai3;->a(LXh3$b;)V

    :goto_0
    return-void
.end method

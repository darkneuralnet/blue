.class public LEm5;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "Schedulers"

    invoke-static {v0}, LBx2;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, LEm5;->a:Ljava/lang/String;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;LaD6;)Lxm5;
    .locals 2

    new-instance v0, LgY5;

    invoke-direct {v0, p0, p1}, LgY5;-><init>(Landroid/content/Context;LaD6;)V

    const-class p1, Landroidx/work/impl/background/systemjob/SystemJobService;

    const/4 v1, 0x1

    invoke-static {p0, p1, v1}, LKD3;->a(Landroid/content/Context;Ljava/lang/Class;Z)V

    invoke-static {}, LBx2;->e()LBx2;

    move-result-object p0

    sget-object p1, LEm5;->a:Ljava/lang/String;

    const-string v1, "Created SystemJobScheduler and enabled SystemJobService"

    invoke-virtual {p0, p1, v1}, LBx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static b(Landroidx/work/a;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/work/a;",
            "Landroidx/work/impl/WorkDatabase;",
            "Ljava/util/List<",
            "Lxm5;",
            ">;)V"
        }
    .end annotation

    if-eqz p2, :cond_6

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p1}, Landroidx/work/impl/WorkDatabase;->I()LIG6;

    move-result-object v0

    invoke-virtual {p1}, LEb5;->c()V

    :try_start_0
    invoke-virtual {p0}, Landroidx/work/a;->h()I

    move-result p0

    invoke-interface {v0, p0}, LIG6;->q(I)Ljava/util/List;

    move-result-object p0

    const/16 v1, 0xc8

    invoke-interface {v0, v1}, LIG6;->e(I)Ljava/util/List;

    move-result-object v1

    if-eqz p0, :cond_1

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-lez v2, :cond_1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LHG6;

    iget-object v5, v5, LHG6;->a:Ljava/lang/String;

    invoke-interface {v0, v5, v2, v3}, LIG6;->o(Ljava/lang/String;J)I

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, LEb5;->A()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1}, LEb5;->g()V

    if-eqz p0, :cond_3

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    if-lez p1, :cond_3

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    new-array p1, p1, [LHG6;

    invoke-interface {p0, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [LHG6;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxm5;

    invoke-interface {v0}, Lxm5;->c()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0, p0}, Lxm5;->b([LHG6;)V

    goto :goto_1

    :cond_3
    if-eqz v1, :cond_5

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p0

    if-lez p0, :cond_5

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p0

    new-array p0, p0, [LHG6;

    invoke-interface {v1, p0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [LHG6;

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lxm5;

    invoke-interface {p2}, Lxm5;->c()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-interface {p2, p0}, Lxm5;->b([LHG6;)V

    goto :goto_2

    :cond_5
    return-void

    :catchall_0
    move-exception p0

    invoke-virtual {p1}, LEb5;->g()V

    throw p0

    :cond_6
    :goto_3
    return-void
.end method

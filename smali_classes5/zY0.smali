.class public LzY0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwm5;


# static fields
.field public static final f:Ljava/util/logging/Logger;


# instance fields
.field public final a:LFG6;

.field public final b:Ljava/util/concurrent/Executor;

.field public final c:LVv;

.field public final d:LQg1;

.field public final e:LBX5;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lia6;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, LzY0;->f:Ljava/util/logging/Logger;

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/Executor;LVv;LFG6;LQg1;LBX5;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LzY0;->b:Ljava/util/concurrent/Executor;

    iput-object p2, p0, LzY0;->c:LVv;

    iput-object p3, p0, LzY0;->a:LFG6;

    iput-object p4, p0, LzY0;->d:LQg1;

    iput-object p5, p0, LzY0;->e:LBX5;

    return-void
.end method

.method public static synthetic b(LzY0;LT96;Lla6;LJg1;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, LzY0;->e(LT96;Lla6;LJg1;)V

    return-void
.end method

.method public static synthetic c(LzY0;LT96;LJg1;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, LzY0;->d(LT96;LJg1;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private synthetic d(LT96;LJg1;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LzY0;->d:LQg1;

    invoke-interface {v0, p1, p2}, LQg1;->p1(LT96;LJg1;)LkR3;

    iget-object p2, p0, LzY0;->a:LFG6;

    const/4 v0, 0x1

    invoke-interface {p2, p1, v0}, LFG6;->a(LT96;I)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private synthetic e(LT96;Lla6;LJg1;)V
    .locals 2

    :try_start_0
    iget-object v0, p0, LzY0;->c:LVv;

    invoke-virtual {p1}, LT96;->b()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, LVv;->get(Ljava/lang/String;)LS96;

    move-result-object v0

    if-nez v0, :cond_0

    const-string p3, "Transport backend \'%s\' is not registered"

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p1}, LT96;->b()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    aput-object p1, v0, v1

    invoke-static {p3, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    sget-object p3, LzY0;->f:Ljava/util/logging/Logger;

    invoke-virtual {p3, p1}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    new-instance p3, Ljava/lang/IllegalArgumentException;

    invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-interface {p2, p3}, Lla6;->a(Ljava/lang/Exception;)V

    return-void

    :cond_0
    invoke-interface {v0, p3}, LS96;->b(LJg1;)LJg1;

    move-result-object p3

    iget-object v0, p0, LzY0;->e:LBX5;

    new-instance v1, LxY0;

    invoke-direct {v1, p0, p1, p3}, LxY0;-><init>(LzY0;LT96;LJg1;)V

    invoke-interface {v0, v1}, LBX5;->c(LBX5$a;)Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lla6;->a(Ljava/lang/Exception;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    sget-object p3, LzY0;->f:Ljava/util/logging/Logger;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error scheduling event "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    invoke-interface {p2, p1}, Lla6;->a(Ljava/lang/Exception;)V

    :goto_0
    return-void
.end method


# virtual methods
.method public a(LT96;LJg1;Lla6;)V
    .locals 2

    iget-object v0, p0, LzY0;->b:Ljava/util/concurrent/Executor;

    new-instance v1, LwY0;

    invoke-direct {v1, p0, p1, p3, p2}, LwY0;-><init>(LzY0;LT96;Lla6;LJg1;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method

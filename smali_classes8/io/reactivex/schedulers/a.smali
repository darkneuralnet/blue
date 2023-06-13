.class public final Lio/reactivex/schedulers/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/reactivex/schedulers/a$b;,
        Lio/reactivex/schedulers/a$h;,
        Lio/reactivex/schedulers/a$f;,
        Lio/reactivex/schedulers/a$c;,
        Lio/reactivex/schedulers/a$e;,
        Lio/reactivex/schedulers/a$d;,
        Lio/reactivex/schedulers/a$a;,
        Lio/reactivex/schedulers/a$g;
    }
.end annotation


# static fields
.field public static final a:Lio/reactivex/E;

.field public static final b:Lio/reactivex/E;

.field public static final c:Lio/reactivex/E;

.field public static final d:Lio/reactivex/E;

.field public static final e:Lio/reactivex/E;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/reactivex/schedulers/a$h;

    invoke-direct {v0}, Lio/reactivex/schedulers/a$h;-><init>()V

    invoke-static {v0}, Lio/reactivex/plugins/a;->i(Ljava/util/concurrent/Callable;)Lio/reactivex/E;

    move-result-object v0

    sput-object v0, Lio/reactivex/schedulers/a;->a:Lio/reactivex/E;

    new-instance v0, Lio/reactivex/schedulers/a$b;

    invoke-direct {v0}, Lio/reactivex/schedulers/a$b;-><init>()V

    invoke-static {v0}, Lio/reactivex/plugins/a;->f(Ljava/util/concurrent/Callable;)Lio/reactivex/E;

    move-result-object v0

    sput-object v0, Lio/reactivex/schedulers/a;->b:Lio/reactivex/E;

    new-instance v0, Lio/reactivex/schedulers/a$c;

    invoke-direct {v0}, Lio/reactivex/schedulers/a$c;-><init>()V

    invoke-static {v0}, Lio/reactivex/plugins/a;->g(Ljava/util/concurrent/Callable;)Lio/reactivex/E;

    move-result-object v0

    sput-object v0, Lio/reactivex/schedulers/a;->c:Lio/reactivex/E;

    invoke-static {}, Lio/reactivex/internal/schedulers/p;->g()Lio/reactivex/internal/schedulers/p;

    move-result-object v0

    sput-object v0, Lio/reactivex/schedulers/a;->d:Lio/reactivex/E;

    new-instance v0, Lio/reactivex/schedulers/a$f;

    invoke-direct {v0}, Lio/reactivex/schedulers/a$f;-><init>()V

    invoke-static {v0}, Lio/reactivex/plugins/a;->h(Ljava/util/concurrent/Callable;)Lio/reactivex/E;

    move-result-object v0

    sput-object v0, Lio/reactivex/schedulers/a;->e:Lio/reactivex/E;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "No instances!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static a()Lio/reactivex/E;
    .locals 1

    sget-object v0, Lio/reactivex/schedulers/a;->b:Lio/reactivex/E;

    invoke-static {v0}, Lio/reactivex/plugins/a;->t(Lio/reactivex/E;)Lio/reactivex/E;

    move-result-object v0

    return-object v0
.end method

.method public static b(Ljava/util/concurrent/Executor;)Lio/reactivex/E;
    .locals 2

    new-instance v0, Lio/reactivex/internal/schedulers/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/reactivex/internal/schedulers/d;-><init>(Ljava/util/concurrent/Executor;Z)V

    return-object v0
.end method

.method public static c()Lio/reactivex/E;
    .locals 1

    sget-object v0, Lio/reactivex/schedulers/a;->c:Lio/reactivex/E;

    invoke-static {v0}, Lio/reactivex/plugins/a;->v(Lio/reactivex/E;)Lio/reactivex/E;

    move-result-object v0

    return-object v0
.end method

.method public static d()Lio/reactivex/E;
    .locals 1

    sget-object v0, Lio/reactivex/schedulers/a;->a:Lio/reactivex/E;

    invoke-static {v0}, Lio/reactivex/plugins/a;->x(Lio/reactivex/E;)Lio/reactivex/E;

    move-result-object v0

    return-object v0
.end method

.method public static e()Lio/reactivex/E;
    .locals 1

    sget-object v0, Lio/reactivex/schedulers/a;->d:Lio/reactivex/E;

    return-object v0
.end method

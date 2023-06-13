.class public final LSN4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSN4$g;,
        LSN4$f;
    }
.end annotation


# static fields
.field public static a:Lio/reactivex/functions/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/functions/c<",
            "Ljava/lang/Throwable;",
            "Ljava/lang/Long;",
            "LSN4$g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LSN4$d;

    invoke-direct {v0}, LSN4$d;-><init>()V

    sput-object v0, LSN4;->a:Lio/reactivex/functions/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lio/reactivex/E;)Lio/reactivex/functions/o;
    .locals 0

    invoke-static {p0}, LSN4;->h(Lio/reactivex/E;)Lio/reactivex/functions/o;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lio/reactivex/functions/g;)Lio/reactivex/functions/g;
    .locals 0

    invoke-static {p0}, LSN4;->e(Lio/reactivex/functions/g;)Lio/reactivex/functions/g;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Lio/reactivex/functions/c;
    .locals 1

    sget-object v0, LSN4;->a:Lio/reactivex/functions/c;

    return-object v0
.end method

.method public static synthetic d(Lio/reactivex/k;Lio/reactivex/E;Lio/reactivex/functions/g;Ljava/util/List;Ljava/util/List;Lio/reactivex/functions/q;)Lio/reactivex/functions/o;
    .locals 0

    invoke-static/range {p0 .. p5}, LSN4;->k(Lio/reactivex/k;Lio/reactivex/E;Lio/reactivex/functions/g;Ljava/util/List;Ljava/util/List;Lio/reactivex/functions/q;)Lio/reactivex/functions/o;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lio/reactivex/functions/g;)Lio/reactivex/functions/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/g<",
            "-",
            "LSN4$g;",
            ">;)",
            "Lio/reactivex/functions/g<",
            "LSN4$g;",
            ">;"
        }
    .end annotation

    new-instance v0, LSN4$b;

    invoke-direct {v0, p0}, LSN4$b;-><init>(Lio/reactivex/functions/g;)V

    return-object v0
.end method

.method public static f(Ljava/util/List;Ljava/util/List;Lio/reactivex/functions/q;)Lio/reactivex/functions/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Throwable;",
            ">;>;",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Throwable;",
            ">;>;",
            "Lio/reactivex/functions/q<",
            "-",
            "Ljava/lang/Throwable;",
            ">;)",
            "Lio/reactivex/functions/o<",
            "LSN4$g;",
            "Lio/reactivex/k<",
            "LSN4$g;",
            ">;>;"
        }
    .end annotation

    new-instance v0, LSN4$c;

    invoke-direct {v0, p2, p1, p0}, LSN4$c;-><init>(Lio/reactivex/functions/q;Ljava/util/List;Ljava/util/List;)V

    return-object v0
.end method

.method public static g(Lio/reactivex/k;Lio/reactivex/E;Lio/reactivex/functions/g;Lio/reactivex/functions/o;)Lio/reactivex/functions/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/k<",
            "Ljava/lang/Long;",
            ">;",
            "Lio/reactivex/E;",
            "Lio/reactivex/functions/g<",
            "-",
            "LSN4$g;",
            ">;",
            "Lio/reactivex/functions/o<",
            "LSN4$g;",
            "Lio/reactivex/k<",
            "LSN4$g;",
            ">;>;)",
            "Lio/reactivex/functions/o<",
            "Lio/reactivex/k<",
            "+",
            "Ljava/lang/Throwable;",
            ">;",
            "Lio/reactivex/k<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    new-instance v0, LSN4$a;

    invoke-direct {v0, p0, p3, p2, p1}, LSN4$a;-><init>(Lio/reactivex/k;Lio/reactivex/functions/o;Lio/reactivex/functions/g;Lio/reactivex/E;)V

    return-object v0
.end method

.method public static h(Lio/reactivex/E;)Lio/reactivex/functions/o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/E;",
            ")",
            "Lio/reactivex/functions/o<",
            "LSN4$g;",
            "Lio/reactivex/k<",
            "LSN4$g;",
            ">;>;"
        }
    .end annotation

    new-instance v0, LSN4$e;

    invoke-direct {v0, p0}, LSN4$e;-><init>(Lio/reactivex/E;)V

    return-object v0
.end method

.method public static i(JLjava/util/concurrent/TimeUnit;)LSN4$f;
    .locals 2

    new-instance v0, LSN4$f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LSN4$f;-><init>(LSN4$a;)V

    invoke-virtual {v0, p0, p1, p2}, LSN4$f;->d(JLjava/util/concurrent/TimeUnit;)LSN4$f;

    move-result-object p0

    return-object p0
.end method

.method public static varargs j([Ljava/lang/Class;)LSN4$f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)",
            "LSN4$f;"
        }
    .end annotation

    new-instance v0, LSN4$f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LSN4$f;-><init>(LSN4$a;)V

    invoke-virtual {v0, p0}, LSN4$f;->f([Ljava/lang/Class;)LSN4$f;

    move-result-object p0

    return-object p0
.end method

.method public static k(Lio/reactivex/k;Lio/reactivex/E;Lio/reactivex/functions/g;Ljava/util/List;Ljava/util/List;Lio/reactivex/functions/q;)Lio/reactivex/functions/o;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/k<",
            "Ljava/lang/Long;",
            ">;",
            "Lio/reactivex/E;",
            "Lio/reactivex/functions/g<",
            "-",
            "LSN4$g;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Throwable;",
            ">;>;",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Throwable;",
            ">;>;",
            "Lio/reactivex/functions/q<",
            "-",
            "Ljava/lang/Throwable;",
            ">;)",
            "Lio/reactivex/functions/o<",
            "Lio/reactivex/k<",
            "+",
            "Ljava/lang/Throwable;",
            ">;",
            "Lio/reactivex/k<",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    invoke-static {p3, p4, p5}, LSN4;->f(Ljava/util/List;Ljava/util/List;Lio/reactivex/functions/q;)Lio/reactivex/functions/o;

    move-result-object p3

    invoke-static {p0, p1, p2, p3}, LSN4;->g(Lio/reactivex/k;Lio/reactivex/E;Lio/reactivex/functions/g;Lio/reactivex/functions/o;)Lio/reactivex/functions/o;

    move-result-object p0

    return-object p0
.end method

.method public static l(Lio/reactivex/functions/q;)LSN4$f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/functions/q<",
            "Ljava/lang/Throwable;",
            ">;)",
            "LSN4$f;"
        }
    .end annotation

    new-instance v0, LSN4$f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LSN4$f;-><init>(LSN4$a;)V

    invoke-virtual {v0, p0}, LSN4$f;->h(Lio/reactivex/functions/q;)LSN4$f;

    move-result-object p0

    return-object p0
.end method

.method public static varargs m([Ljava/lang/Class;)LSN4$f;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "+",
            "Ljava/lang/Throwable;",
            ">;)",
            "LSN4$f;"
        }
    .end annotation

    new-instance v0, LSN4$f;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LSN4$f;-><init>(LSN4$a;)V

    invoke-virtual {v0, p0}, LSN4$f;->i([Ljava/lang/Class;)LSN4$f;

    move-result-object p0

    return-object p0
.end method

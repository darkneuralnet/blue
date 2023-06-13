.class public LRe5;
.super Ly80$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LRe5$d;,
        LRe5$b;,
        LRe5$e;,
        LRe5$c;,
        LRe5$a;
    }
.end annotation


# instance fields
.field public final a:LQe5;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ly80$a;-><init>()V

    invoke-static {}, Lio/reactivex/schedulers/a;->c()Lio/reactivex/E;

    move-result-object v0

    invoke-static {v0}, LQe5;->d(Lio/reactivex/E;)LQe5;

    move-result-object v0

    iput-object v0, p0, LRe5;->a:LQe5;

    return-void
.end method

.method public static c(Ljava/lang/reflect/Type;)Ljava/lang/Class;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    invoke-static {p0}, LSi6;->b(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic d(LMN4;Ljava/lang/Throwable;Lokhttp3/Request;)Lco/bird/api/error/RetrofitException;
    .locals 0

    invoke-static {p0, p1, p2}, LRe5;->e(LMN4;Ljava/lang/Throwable;Lokhttp3/Request;)Lco/bird/api/error/RetrofitException;

    move-result-object p0

    return-object p0
.end method

.method public static e(LMN4;Ljava/lang/Throwable;Lokhttp3/Request;)Lco/bird/api/error/RetrofitException;
    .locals 1

    instance-of v0, p1, Lretrofit2/HttpException;

    if-eqz v0, :cond_0

    check-cast p1, Lretrofit2/HttpException;

    invoke-virtual {p1}, Lretrofit2/HttpException;->c()LHM4;

    move-result-object p1

    invoke-virtual {p1}, LHM4;->h()Lokhttp3/Response;

    move-result-object p2

    invoke-virtual {p2}, Lokhttp3/Response;->request()Lokhttp3/Request;

    move-result-object p2

    invoke-virtual {p2}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object p2

    invoke-virtual {p2}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1, p0}, Lco/bird/api/error/RetrofitException;->e(Ljava/lang/String;LHM4;LMN4;)Lco/bird/api/error/RetrofitException;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of p0, p1, Ljava/io/IOException;

    if-eqz p0, :cond_1

    check-cast p1, Ljava/io/IOException;

    invoke-static {p1}, Lco/bird/api/error/RetrofitException;->f(Ljava/io/IOException;)Lco/bird/api/error/RetrofitException;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {p1, p2}, Lco/bird/api/error/RetrofitException;->g(Ljava/lang/Throwable;Lokhttp3/Request;)Lco/bird/api/error/RetrofitException;

    move-result-object p0

    return-object p0
.end method

.method public static f()Ly80$a;
    .locals 1

    new-instance v0, LRe5;

    invoke-direct {v0}, LRe5;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;LMN4;)Ly80;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            "LMN4;",
            ")",
            "Ly80<",
            "**>;"
        }
    .end annotation

    invoke-static {p1}, LRe5;->c(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v0

    const-class v1, Lio/reactivex/Observable;

    if-ne v0, v1, :cond_0

    new-instance v0, LRe5$d;

    iget-object v1, p0, LRe5;->a:LQe5;

    invoke-virtual {v1, p1, p2, p3}, LQe5;->a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;LMN4;)Ly80;

    move-result-object p1

    invoke-direct {v0, p3, p1}, LRe5$d;-><init>(LMN4;Ly80;)V

    return-object v0

    :cond_0
    const-class v1, Lio/reactivex/k;

    if-ne v0, v1, :cond_1

    new-instance v0, LRe5$b;

    iget-object v1, p0, LRe5;->a:LQe5;

    invoke-virtual {v1, p1, p2, p3}, LQe5;->a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;LMN4;)Ly80;

    move-result-object p1

    invoke-direct {v0, p3, p1}, LRe5$b;-><init>(LMN4;Ly80;)V

    return-object v0

    :cond_1
    const-class v1, Lio/reactivex/F;

    if-ne v0, v1, :cond_2

    new-instance v0, LRe5$e;

    iget-object v1, p0, LRe5;->a:LQe5;

    invoke-virtual {v1, p1, p2, p3}, LQe5;->a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;LMN4;)Ly80;

    move-result-object p1

    invoke-direct {v0, p3, p1}, LRe5$e;-><init>(LMN4;Ly80;)V

    return-object v0

    :cond_2
    const-class v1, Lio/reactivex/p;

    if-ne v0, v1, :cond_3

    new-instance v0, LRe5$c;

    iget-object v1, p0, LRe5;->a:LQe5;

    invoke-virtual {v1, p1, p2, p3}, LQe5;->a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;LMN4;)Ly80;

    move-result-object p1

    invoke-direct {v0, p3, p1}, LRe5$c;-><init>(LMN4;Ly80;)V

    return-object v0

    :cond_3
    const-class v1, Lio/reactivex/c;

    if-ne v0, v1, :cond_4

    new-instance v0, LRe5$a;

    iget-object v1, p0, LRe5;->a:LQe5;

    invoke-virtual {v1, p1, p2, p3}, LQe5;->a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;LMN4;)Ly80;

    move-result-object p1

    invoke-direct {v0, p3, p1}, LRe5$a;-><init>(LMN4;Ly80;)V

    return-object v0

    :cond_4
    const/4 p1, 0x0

    return-object p1
.end method

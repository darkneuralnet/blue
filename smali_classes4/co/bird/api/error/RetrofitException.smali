.class public Lco/bird/api/error/RetrofitException;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/api/error/RetrofitException$a;
    }
.end annotation


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:LHM4;

.field public final d:Lco/bird/api/error/RetrofitException$a;

.field public final e:LMN4;

.field public final f:Lwi2;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;LHM4;Lco/bird/api/error/RetrofitException$a;Ljava/lang/Throwable;LMN4;Lwi2;)V
    .locals 0

    invoke-direct {p0, p1, p5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-object p2, p0, Lco/bird/api/error/RetrofitException;->b:Ljava/lang/String;

    iput-object p3, p0, Lco/bird/api/error/RetrofitException;->c:LHM4;

    iput-object p4, p0, Lco/bird/api/error/RetrofitException;->d:Lco/bird/api/error/RetrofitException$a;

    iput-object p6, p0, Lco/bird/api/error/RetrofitException;->e:LMN4;

    iput-object p7, p0, Lco/bird/api/error/RetrofitException;->f:Lwi2;

    return-void
.end method

.method public static d(LHM4;Lwi2;)Lco/bird/api/error/RetrofitException;
    .locals 10

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LHM4;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LHM4;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v0, Lco/bird/api/error/RetrofitException;

    invoke-virtual {p0}, LHM4;->h()Lokhttp3/Response;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/Response;->request()Lokhttp3/Request;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    move-result-object v4

    sget-object v6, Lco/bird/api/error/RetrofitException$a;->c:Lco/bird/api/error/RetrofitException$a;

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v2, v0

    move-object v5, p0

    move-object v9, p1

    invoke-direct/range {v2 .. v9}, Lco/bird/api/error/RetrofitException;-><init>(Ljava/lang/String;Ljava/lang/String;LHM4;Lco/bird/api/error/RetrofitException$a;Ljava/lang/Throwable;LMN4;Lwi2;)V

    return-object v0
.end method

.method public static e(Ljava/lang/String;LHM4;LMN4;)Lco/bird/api/error/RetrofitException;
    .locals 10

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, LHM4;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, LHM4;->g()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v0, Lco/bird/api/error/RetrofitException;

    sget-object v6, Lco/bird/api/error/RetrofitException$a;->c:Lco/bird/api/error/RetrofitException$a;

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object v2, v0

    move-object v4, p0

    move-object v5, p1

    move-object v8, p2

    invoke-direct/range {v2 .. v9}, Lco/bird/api/error/RetrofitException;-><init>(Ljava/lang/String;Ljava/lang/String;LHM4;Lco/bird/api/error/RetrofitException$a;Ljava/lang/Throwable;LMN4;Lwi2;)V

    return-object v0
.end method

.method public static f(Ljava/io/IOException;)Lco/bird/api/error/RetrofitException;
    .locals 9

    new-instance v8, Lco/bird/api/error/RetrofitException;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x0

    sget-object v4, Lco/bird/api/error/RetrofitException$a;->b:Lco/bird/api/error/RetrofitException$a;

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, v8

    move-object v5, p0

    invoke-direct/range {v0 .. v7}, Lco/bird/api/error/RetrofitException;-><init>(Ljava/lang/String;Ljava/lang/String;LHM4;Lco/bird/api/error/RetrofitException$a;Ljava/lang/Throwable;LMN4;Lwi2;)V

    return-object v8
.end method

.method public static g(Ljava/lang/Throwable;Lokhttp3/Request;)Lco/bird/api/error/RetrofitException;
    .locals 9

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error handling request for \'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    move-result-object p1

    invoke-virtual {p1}, Lokhttp3/HttpUrl;->encodedPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\' with message: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-instance p1, Lco/bird/api/error/RetrofitException;

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget-object v5, Lco/bird/api/error/RetrofitException$a;->d:Lco/bird/api/error/RetrofitException$a;

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v1, p1

    move-object v6, p0

    invoke-direct/range {v1 .. v8}, Lco/bird/api/error/RetrofitException;-><init>(Ljava/lang/String;Ljava/lang/String;LHM4;Lco/bird/api/error/RetrofitException$a;Ljava/lang/Throwable;LMN4;Lwi2;)V

    return-object p1
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, Lco/bird/api/error/RetrofitException;->c:LHM4;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, LHM4;->e()Lokhttp3/ResponseBody;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lco/bird/api/error/RetrofitException;->e:LMN4;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/annotation/Annotation;

    invoke-virtual {v0, p1, v1}, LMN4;->i(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)LsB0;

    move-result-object p1

    iget-object v0, p0, Lco/bird/api/error/RetrofitException;->c:LHM4;

    invoke-virtual {v0}, LHM4;->e()Lokhttp3/ResponseBody;

    move-result-object v0

    invoke-interface {p1, v0}, LsB0;->convert(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    iget-object v0, p0, Lco/bird/api/error/RetrofitException;->f:Lwi2;

    if-eqz v0, :cond_2

    iget-object v1, p0, Lco/bird/api/error/RetrofitException;->c:LHM4;

    invoke-virtual {v1}, LHM4;->e()Lokhttp3/ResponseBody;

    move-result-object v1

    invoke-virtual {v1}, Lokhttp3/ResponseBody;->string()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lwi2;->f(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    return-object v1
.end method

.method public b()Lco/bird/api/error/RetrofitException$a;
    .locals 1

    iget-object v0, p0, Lco/bird/api/error/RetrofitException;->d:Lco/bird/api/error/RetrofitException$a;

    return-object v0
.end method

.method public c()LHM4;
    .locals 1

    iget-object v0, p0, Lco/bird/api/error/RetrofitException;->c:LHM4;

    return-object v0
.end method

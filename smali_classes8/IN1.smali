.class public abstract LIN1;
.super LZt5;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LIN1$a;,
        LIN1$c;,
        LIN1$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ResponseT:",
        "Ljava/lang/Object;",
        "ReturnT:",
        "Ljava/lang/Object;",
        ">",
        "LZt5<",
        "TReturnT;>;"
    }
.end annotation


# instance fields
.field public final a:LKI4;

.field public final b:Lokhttp3/Call$Factory;

.field public final c:LsB0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LsB0<",
            "Lokhttp3/ResponseBody;",
            "TResponseT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LKI4;Lokhttp3/Call$Factory;LsB0;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LKI4;",
            "Lokhttp3/Call$Factory;",
            "LsB0<",
            "Lokhttp3/ResponseBody;",
            "TResponseT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, LZt5;-><init>()V

    iput-object p1, p0, LIN1;->a:LKI4;

    iput-object p2, p0, LIN1;->b:Lokhttp3/Call$Factory;

    iput-object p3, p0, LIN1;->c:LsB0;

    return-void
.end method

.method public static d(LMN4;Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ly80;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResponseT:",
            "Ljava/lang/Object;",
            "ReturnT:",
            "Ljava/lang/Object;",
            ">(",
            "LMN4;",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/reflect/Type;",
            "[",
            "Ljava/lang/annotation/Annotation;",
            ")",
            "Ly80<",
            "TResponseT;TReturnT;>;"
        }
    .end annotation

    :try_start_0
    invoke-virtual {p0, p2, p3}, LMN4;->a(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ly80;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const/4 p3, 0x1

    new-array p3, p3, [Ljava/lang/Object;

    const/4 v0, 0x0

    aput-object p2, p3, v0

    const-string p2, "Unable to create call adapter for %s"

    invoke-static {p1, p0, p2, p3}, LKi6;->n(Ljava/lang/reflect/Method;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method

.method public static e(LMN4;Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;)LsB0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResponseT:",
            "Ljava/lang/Object;",
            ">(",
            "LMN4;",
            "Ljava/lang/reflect/Method;",
            "Ljava/lang/reflect/Type;",
            ")",
            "LsB0<",
            "Lokhttp3/ResponseBody;",
            "TResponseT;>;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v0

    :try_start_0
    invoke-virtual {p0, p2, v0}, LMN4;->i(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)LsB0;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    const-string p2, "Unable to create converter for %s"

    invoke-static {p1, p0, p2, v0}, LKi6;->n(Ljava/lang/reflect/Method;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method

.method public static f(LMN4;Ljava/lang/reflect/Method;LKI4;)LIN1;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<ResponseT:",
            "Ljava/lang/Object;",
            "ReturnT:",
            "Ljava/lang/Object;",
            ">(",
            "LMN4;",
            "Ljava/lang/reflect/Method;",
            "LKI4;",
            ")",
            "LIN1<",
            "TResponseT;TReturnT;>;"
        }
    .end annotation

    iget-boolean v0, p2, LKI4;->k:Z

    const/4 v6, 0x0

    invoke-virtual {p1}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    move-result-object v1

    const-class v2, LHM4;

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericParameterTypes()[Ljava/lang/reflect/Type;

    move-result-object v4

    array-length v5, v4

    const/4 v7, 0x1

    sub-int/2addr v5, v7

    aget-object v4, v4, v5

    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v3, v4}, LKi6;->f(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v4

    invoke-static {v4}, LKi6;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object v5

    if-ne v5, v2, :cond_0

    instance-of v5, v4, Ljava/lang/reflect/ParameterizedType;

    if-eqz v5, :cond_0

    check-cast v4, Ljava/lang/reflect/ParameterizedType;

    invoke-static {v3, v4}, LKi6;->g(ILjava/lang/reflect/ParameterizedType;)Ljava/lang/reflect/Type;

    move-result-object v4

    move v5, v7

    goto :goto_0

    :cond_0
    move v5, v3

    :goto_0
    new-instance v8, LKi6$b;

    new-array v7, v7, [Ljava/lang/reflect/Type;

    aput-object v4, v7, v3

    const/4 v4, 0x0

    const-class v9, Lx80;

    invoke-direct {v8, v4, v9, v7}, LKi6$b;-><init>(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)V

    invoke-static {v1}, LLB5;->a([Ljava/lang/annotation/Annotation;)[Ljava/lang/annotation/Annotation;

    move-result-object v1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getGenericReturnType()Ljava/lang/reflect/Type;

    move-result-object v8

    move v5, v3

    :goto_1
    invoke-static {p0, p1, v8, v1}, LIN1;->d(LMN4;Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ly80;

    move-result-object v7

    invoke-interface {v7}, Ly80;->a()Ljava/lang/reflect/Type;

    move-result-object v1

    const-class v4, Lokhttp3/Response;

    if-eq v1, v4, :cond_7

    if-eq v1, v2, :cond_6

    iget-object v2, p2, LKI4;->c:Ljava/lang/String;

    const-string v4, "HEAD"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const-class v2, Ljava/lang/Void;

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    const-string p0, "HEAD method must use Void as response type."

    new-array p2, v3, [Ljava/lang/Object;

    invoke-static {p1, p0, p2}, LKi6;->m(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_3
    :goto_2
    invoke-static {p0, p1, v1}, LIN1;->e(LMN4;Ljava/lang/reflect/Method;Ljava/lang/reflect/Type;)LsB0;

    move-result-object v4

    iget-object v3, p0, LMN4;->b:Lokhttp3/Call$Factory;

    if-nez v0, :cond_4

    new-instance p0, LIN1$a;

    invoke-direct {p0, p2, v3, v4, v7}, LIN1$a;-><init>(LKI4;Lokhttp3/Call$Factory;LsB0;Ly80;)V

    return-object p0

    :cond_4
    if-eqz v5, :cond_5

    new-instance p0, LIN1$c;

    invoke-direct {p0, p2, v3, v4, v7}, LIN1$c;-><init>(LKI4;Lokhttp3/Call$Factory;LsB0;Ly80;)V

    return-object p0

    :cond_5
    new-instance p0, LIN1$b;

    move-object v1, p0

    move-object v2, p2

    move-object v5, v7

    invoke-direct/range {v1 .. v6}, LIN1$b;-><init>(LKI4;Lokhttp3/Call$Factory;LsB0;Ly80;Z)V

    return-object p0

    :cond_6
    const-string p0, "Response must include generic type (e.g., Response<String>)"

    new-array p2, v3, [Ljava/lang/Object;

    invoke-static {p1, p0, p2}, LKi6;->m(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0

    :cond_7
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "\'"

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v1}, LKi6;->h(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "\' is not a valid response body type. Did you mean ResponseBody?"

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-array p2, v3, [Ljava/lang/Object;

    invoke-static {p1, p0, p2}, LKi6;->m(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public final a([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Object;",
            ")TReturnT;"
        }
    .end annotation

    new-instance v0, LLe3;

    iget-object v1, p0, LIN1;->a:LKI4;

    iget-object v2, p0, LIN1;->b:Lokhttp3/Call$Factory;

    iget-object v3, p0, LIN1;->c:LsB0;

    invoke-direct {v0, v1, p1, v2, v3}, LLe3;-><init>(LKI4;[Ljava/lang/Object;Lokhttp3/Call$Factory;LsB0;)V

    invoke-virtual {p0, v0, p1}, LIN1;->c(Lx80;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract c(Lx80;[Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx80<",
            "TResponseT;>;[",
            "Ljava/lang/Object;",
            ")TReturnT;"
        }
    .end annotation
.end method

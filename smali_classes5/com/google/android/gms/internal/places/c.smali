.class public abstract Lcom/google/android/gms/internal/places/c;
.super Lcom/google/android/gms/internal/places/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/places/c$c;,
        Lcom/google/android/gms/internal/places/c$e;,
        Lcom/google/android/gms/internal/places/c$b;,
        Lcom/google/android/gms/internal/places/c$a;,
        Lcom/google/android/gms/internal/places/c$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lcom/google/android/gms/internal/places/c<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lcom/google/android/gms/internal/places/c$a<",
        "TMessageType;TBuilderType;>;>",
        "Lcom/google/android/gms/internal/places/k<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# static fields
.field private static zzij:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Object;",
            "Lcom/google/android/gms/internal/places/c<",
            "**>;>;"
        }
    .end annotation
.end field


# instance fields
.field protected zzih:Lu38;

.field private zzii:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/places/c;->zzij:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/places/k;-><init>()V

    invoke-static {}, Lu38;->i()Lu38;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/places/c;->zzih:Lu38;

    const/4 v0, -0x1

    iput v0, p0, Lcom/google/android/gms/internal/places/c;->zzii:I

    return-void
.end method

.method public static i(Lcom/google/android/gms/internal/places/c;[B)Lcom/google/android/gms/internal/places/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/android/gms/internal/places/c<",
            "TT;*>;>(TT;[B)TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/places/zzbk;
        }
    .end annotation

    array-length v0, p1

    invoke-static {}, Lcom/google/android/gms/internal/places/a;->b()Lcom/google/android/gms/internal/places/a;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {p0, p1, v2, v0, v1}, Lcom/google/android/gms/internal/places/c;->j(Lcom/google/android/gms/internal/places/c;[BIILcom/google/android/gms/internal/places/a;)Lcom/google/android/gms/internal/places/c;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/places/c;->isInitialized()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/places/zzdp;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/places/zzdp;-><init>(LzT7;)V

    new-instance v0, Lcom/google/android/gms/internal/places/zzbk;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/places/zzbk;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/places/zzbk;->g(LzT7;)Lcom/google/android/gms/internal/places/zzbk;

    move-result-object p0

    throw p0

    :cond_1
    :goto_0
    return-object p0
.end method

.method public static j(Lcom/google/android/gms/internal/places/c;[BIILcom/google/android/gms/internal/places/a;)Lcom/google/android/gms/internal/places/c;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/android/gms/internal/places/c<",
            "TT;*>;>(TT;[BII",
            "Lcom/google/android/gms/internal/places/a;",
            ")TT;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/places/zzbk;
        }
    .end annotation

    sget p2, Lcom/google/android/gms/internal/places/c$d;->d:I

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0, v0}, Lcom/google/android/gms/internal/places/c;->k(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/places/c;

    :try_start_0
    invoke-static {}, LsW7;->a()LsW7;

    move-result-object p2

    invoke-virtual {p2, p0}, LsW7;->c(Ljava/lang/Object;)LLY7;

    move-result-object v0

    const/4 v3, 0x0

    new-instance v5, Ltl9;

    invoke-direct {v5, p4}, Ltl9;-><init>(Lcom/google/android/gms/internal/places/a;)V

    move-object v1, p0

    move-object v2, p1

    move v4, p3

    invoke-interface/range {v0 .. v5}, LLY7;->c(Ljava/lang/Object;[BIILtl9;)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/places/c;->c()V

    iget p1, p0, Lcom/google/android/gms/internal/places/k;->zzdt:I

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-static {}, Lcom/google/android/gms/internal/places/zzbk;->a()Lcom/google/android/gms/internal/places/zzbk;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/places/zzbk;->g(LzT7;)Lcom/google/android/gms/internal/places/zzbk;

    move-result-object p0

    throw p0

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Lcom/google/android/gms/internal/places/zzbk;

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/places/zzbk;

    throw p0

    :cond_1
    new-instance p2, Lcom/google/android/gms/internal/places/zzbk;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/places/zzbk;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/places/zzbk;->g(LzT7;)Lcom/google/android/gms/internal/places/zzbk;

    move-result-object p0

    throw p0
.end method

.method public static varargs l(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    :try_start_0
    invoke-virtual {p0, p1, p2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    instance-of p1, p0, Ljava/lang/RuntimeException;

    if-nez p1, :cond_1

    instance-of p1, p0, Ljava/lang/Error;

    if-eqz p1, :cond_0

    check-cast p0, Ljava/lang/Error;

    throw p0

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Unexpected exception thrown by generated accessor method."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1

    :cond_1
    check-cast p0, Ljava/lang/RuntimeException;

    throw p0

    :catch_1
    move-exception p0

    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "Couldn\'t use Java reflection to implement protocol message reflection."

    invoke-direct {p1, p2, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static m(LzT7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    new-instance v0, LTW7;

    invoke-direct {v0, p0, p1, p2}, LTW7;-><init>(LzT7;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public static n(Ljava/lang/Class;Lcom/google/android/gms/internal/places/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/android/gms/internal/places/c<",
            "**>;>(",
            "Ljava/lang/Class<",
            "TT;>;TT;)V"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/places/c;->zzij:Ljava/util/Map;

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final o(Lcom/google/android/gms/internal/places/c;Z)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/android/gms/internal/places/c<",
            "TT;*>;>(TT;Z)Z"
        }
    .end annotation

    sget v0, Lcom/google/android/gms/internal/places/c$d;->a:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/places/c;->k(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Byte;

    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return v2

    :cond_0
    if-nez v0, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    invoke-static {}, LsW7;->a()LsW7;

    move-result-object v0

    invoke-virtual {v0, p0}, LsW7;->c(Ljava/lang/Object;)LLY7;

    move-result-object v0

    invoke-interface {v0, p0}, LLY7;->f(Ljava/lang/Object;)Z

    move-result v0

    if-eqz p1, :cond_3

    sget p1, Lcom/google/android/gms/internal/places/c$d;->b:I

    if-eqz v0, :cond_2

    move-object v2, p0

    goto :goto_0

    :cond_2
    move-object v2, v1

    :goto_0
    invoke-virtual {p0, p1, v2, v1}, Lcom/google/android/gms/internal/places/c;->k(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return v0
.end method

.method public static p()LsJ7;
    .locals 1

    invoke-static {}, LbG7;->c()LbG7;

    move-result-object v0

    return-object v0
.end method

.method public static q()LBI7;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">()",
            "LBI7<",
            "TE;>;"
        }
    .end annotation

    invoke-static {}, LhX7;->b()LhX7;

    move-result-object v0

    return-object v0
.end method

.method public static r(Ljava/lang/Class;)Lcom/google/android/gms/internal/places/c;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lcom/google/android/gms/internal/places/c<",
            "**>;>(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    sget-object v0, Lcom/google/android/gms/internal/places/c;->zzij:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/places/c;

    if-nez v0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v0, v2, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    sget-object v0, Lcom/google/android/gms/internal/places/c;->zzij:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/places/c;

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Class initialization cannot fail."

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    :goto_0
    if-nez v0, :cond_2

    invoke-static {p0}, Lt58;->x(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/places/c;

    sget v1, Lcom/google/android/gms/internal/places/c$d;->f:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, Lcom/google/android/gms/internal/places/c;->k(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/places/c;

    if-eqz v0, :cond_1

    sget-object v1, Lcom/google/android/gms/internal/places/c;->zzij:Ljava/util/Map;

    invoke-interface {v1, p0, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0

    :cond_2
    :goto_1
    return-object v0
.end method


# virtual methods
.method final a(I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/places/c;->zzii:I

    return-void
.end method

.method public final b()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/places/c;->zzii:I

    return v0
.end method

.method public final c()V
    .locals 1

    invoke-static {}, LsW7;->a()LsW7;

    move-result-object v0

    invoke-virtual {v0, p0}, LsW7;->c(Ljava/lang/Object;)LLY7;

    move-result-object v0

    invoke-interface {v0, p0}, LLY7;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public final synthetic d()LzT7;
    .locals 2

    sget v0, Lcom/google/android/gms/internal/places/c$d;->f:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/places/c;->k(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/places/c;

    return-object v0
.end method

.method public final synthetic e()LlT7;
    .locals 2

    sget v0, Lcom/google/android/gms/internal/places/c$d;->e:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/places/c;->k(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/places/c$a;

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/places/c$a;->l(Lcom/google/android/gms/internal/places/c;)Lcom/google/android/gms/internal/places/c$a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    sget v0, Lcom/google/android/gms/internal/places/c$d;->f:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/places/c;->k(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/places/c;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    invoke-static {}, LsW7;->a()LsW7;

    move-result-object v0

    invoke-virtual {v0, p0}, LsW7;->c(Ljava/lang/Object;)LLY7;

    move-result-object v0

    check-cast p1, Lcom/google/android/gms/internal/places/c;

    invoke-interface {v0, p0, p1}, LLY7;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic f()LlT7;
    .locals 2

    sget v0, Lcom/google/android/gms/internal/places/c$d;->e:I

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lcom/google/android/gms/internal/places/c;->k(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/places/c$a;

    return-object v0
.end method

.method public final g()I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/places/c;->zzii:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-static {}, LsW7;->a()LsW7;

    move-result-object v0

    invoke-virtual {v0, p0}, LsW7;->c(Ljava/lang/Object;)LLY7;

    move-result-object v0

    invoke-interface {v0, p0}, LLY7;->h(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/places/c;->zzii:I

    :cond_0
    iget v0, p0, Lcom/google/android/gms/internal/places/c;->zzii:I

    return v0
.end method

.method public final h(Lcom/google/android/gms/internal/places/zzaj;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {}, LsW7;->a()LsW7;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, LsW7;->b(Ljava/lang/Class;)LLY7;

    move-result-object v0

    invoke-static {p1}, Lrq7;->f(Lcom/google/android/gms/internal/places/zzaj;)Lrq7;

    move-result-object p1

    invoke-interface {v0, p0, p1}, LLY7;->g(Ljava/lang/Object;Lja8;)V

    return-void
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/places/k;->zzdt:I

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-static {}, LsW7;->a()LsW7;

    move-result-object v0

    invoke-virtual {v0, p0}, LsW7;->c(Ljava/lang/Object;)LLY7;

    move-result-object v0

    invoke-interface {v0, p0}, LLY7;->e(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lcom/google/android/gms/internal/places/k;->zzdt:I

    return v0
.end method

.method public final isInitialized()Z
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/places/c;->o(Lcom/google/android/gms/internal/places/c;Z)Z

    move-result v0

    return v0
.end method

.method public abstract k(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/places/d;->a(LzT7;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

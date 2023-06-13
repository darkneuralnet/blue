.class public abstract Lfb7;
.super Lea7;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Lfb7<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lab7<",
        "TMessageType;TBuilderType;>;>",
        "Lea7<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# static fields
.field private static final zbb:Ljava/util/Map;


# instance fields
.field protected zbc:LCc7;

.field private zbd:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Lfb7;->zbb:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lea7;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lfb7;->zbd:I

    invoke-static {}, LCc7;->c()LCc7;

    move-result-object v0

    iput-object v0, p0, Lfb7;->zbc:LCc7;

    return-void
.end method

.method public static A()Llb7;
    .locals 1

    invoke-static {}, Lgb7;->c()Lgb7;

    move-result-object v0

    return-object v0
.end method

.method public static B()Lnb7;
    .locals 1

    invoke-static {}, LHb7;->c()LHb7;

    move-result-object v0

    return-object v0
.end method

.method public static C()Lob7;
    .locals 1

    invoke-static {}, Lgc7;->b()Lgc7;

    move-result-object v0

    return-object v0
.end method

.method public static varargs D(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
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

.method public static c(LTb7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lhc7;

    invoke-direct {v0, p0, p1, p2}, Lhc7;-><init>(LTb7;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public static l(Ljava/lang/Class;Lfb7;)V
    .locals 1

    invoke-virtual {p1}, Lfb7;->k()V

    sget-object v0, Lfb7;->zbb:Ljava/util/Map;

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static final n(Lfb7;Z)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lfb7;->p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Byte;

    invoke-virtual {v2}, Ljava/lang/Byte;->byteValue()B

    move-result v2

    if-ne v2, v0, :cond_0

    return v0

    :cond_0
    if-nez v2, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_1
    invoke-static {}, Lfc7;->a()Lfc7;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Lfc7;->b(Ljava/lang/Class;)Lic7;

    move-result-object v2

    invoke-interface {v2, p0}, Lic7;->e(Ljava/lang/Object;)Z

    move-result v2

    if-eqz p1, :cond_3

    if-eq v0, v2, :cond_2

    move-object p1, v1

    goto :goto_0

    :cond_2
    move-object p1, p0

    :goto_0
    const/4 v0, 0x2

    invoke-virtual {p0, v0, p1, v1}, Lfb7;->p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return v2
.end method

.method public static r(Lfb7;[BIILOa7;)Lfb7;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuw;
        }
    .end annotation

    invoke-virtual {p0}, Lfb7;->x()Lfb7;

    move-result-object p0

    :try_start_0
    invoke-static {}, Lfc7;->a()Lfc7;

    move-result-object p2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2, v0}, Lfc7;->b(Ljava/lang/Class;)Lic7;

    move-result-object p2

    const/4 v3, 0x0

    new-instance v5, Lla7;

    invoke-direct {v5, p4}, Lla7;-><init>(LOa7;)V

    move-object v0, p2

    move-object v1, p0

    move-object v2, p1

    move v4, p3

    invoke-interface/range {v0 .. v5}, Lic7;->d(Ljava/lang/Object;[BIILla7;)V

    invoke-interface {p2, p0}, Lic7;->f(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuw; {:try_start_0 .. :try_end_0} :catch_3
    .catch Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbwz; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuw;->g()Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuw;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuw;->f(LTb7;)Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuw;

    throw p1

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuw;

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuw;

    throw p0

    :cond_0
    new-instance p2, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuw;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuw;-><init>(Ljava/io/IOException;)V

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuw;->f(LTb7;)Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuw;

    throw p2

    :catch_2
    move-exception p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbwz;->a()Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuw;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuw;->f(LTb7;)Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuw;

    throw p1

    :catch_3
    move-exception p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuw;->f(LTb7;)Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuw;

    throw p1
.end method

.method public static v(LTb7;Ljava/lang/Object;LTb7;Lib7;ILRc7;Ljava/lang/Class;)Leb7;
    .locals 6

    new-instance p3, Leb7;

    new-instance p4, Ldb7;

    const/4 v1, 0x0

    const v2, 0x1ea8e13

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p4

    move-object v3, p5

    invoke-direct/range {v0 .. v5}, Ldb7;-><init>(Lib7;ILRc7;ZZ)V

    move-object v0, p3

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p4

    move-object v5, p6

    invoke-direct/range {v0 .. v5}, Leb7;-><init>(LTb7;Ljava/lang/Object;LTb7;Ldb7;Ljava/lang/Class;)V

    return-object p3
.end method

.method public static w(Ljava/lang/Class;)Lfb7;
    .locals 4

    sget-object v0, Lfb7;->zbb:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfb7;

    if-nez v1, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    const/4 v3, 0x1

    invoke-static {v1, v3, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfb7;

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Class initialization cannot fail."

    invoke-direct {v0, v1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    :goto_0
    if-nez v1, :cond_2

    invoke-static {p0}, LLc7;->j(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfb7;

    const/4 v2, 0x6

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v3}, Lfb7;->p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lfb7;

    if-eqz v1, :cond_1

    invoke-interface {v0, p0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-direct {p0}, Ljava/lang/IllegalStateException;-><init>()V

    throw p0

    :cond_2
    :goto_1
    return-object v1
.end method

.method public static y(Lfb7;[BLOa7;)Lfb7;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuw;
        }
    .end annotation

    array-length v0, p1

    const/4 v1, 0x0

    invoke-static {p0, p1, v1, v0, p2}, Lfb7;->r(Lfb7;[BIILOa7;)Lfb7;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lfb7;->e()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbwz;

    invoke-direct {p1, p0}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbwz;-><init>(LTb7;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbwz;->a()Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuw;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuw;->f(LTb7;)Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbuw;

    throw p1

    :cond_1
    :goto_0
    return-object p0
.end method

.method public static z()Lkb7;
    .locals 1

    invoke-static {}, LXa7;->b()LXa7;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(Lic7;)I
    .locals 3

    invoke-virtual {p0}, Lfb7;->o()Z

    move-result v0

    const-string v1, "serialized size must be non-negative, was "

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Lfb7;->q(Lic7;)I

    move-result p1

    if-ltz p1, :cond_0

    return p1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v0, p0, Lfb7;->zbd:I

    const v2, 0x7fffffff

    and-int/2addr v0, v2

    if-eq v0, v2, :cond_2

    return v0

    :cond_2
    invoke-virtual {p0, p1}, Lfb7;->q(Lic7;)I

    move-result p1

    if-ltz p1, :cond_3

    iget v0, p0, Lfb7;->zbd:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    or-int/2addr v0, p1

    iput v0, p0, Lfb7;->zbd:I

    return p1

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final d()I
    .locals 4

    invoke-virtual {p0}, Lfb7;->o()Z

    move-result v0

    const-string v1, "serialized size must be non-negative, was "

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0, v2}, Lfb7;->q(Lic7;)I

    move-result v0

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1
    iget v0, p0, Lfb7;->zbd:I

    const v3, 0x7fffffff

    and-int/2addr v0, v3

    if-eq v0, v3, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0, v2}, Lfb7;->q(Lic7;)I

    move-result v0

    if-ltz v0, :cond_3

    iget v1, p0, Lfb7;->zbd:I

    const/high16 v2, -0x80000000

    and-int/2addr v1, v2

    or-int/2addr v1, v0

    iput v1, p0, Lfb7;->zbd:I

    :goto_0
    return v0

    :cond_3
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public final e()Z
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lfb7;->n(Lfb7;Z)Z

    move-result v0

    return v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_2

    return v0

    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-static {}, Lfc7;->a()Lfc7;

    move-result-object v1

    invoke-virtual {v1, v0}, Lfc7;->b(Ljava/lang/Class;)Lic7;

    move-result-object v0

    check-cast p1, Lfb7;

    invoke-interface {v0, p0, p1}, Lic7;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final synthetic f()LSb7;
    .locals 2

    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lfb7;->p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lab7;

    return-object v0
.end method

.method public final synthetic g()LSb7;
    .locals 2

    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lfb7;->p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lab7;

    invoke-virtual {v0, p0}, Lab7;->n(Lfb7;)Lab7;

    return-object v0
.end method

.method public final synthetic h()LTb7;
    .locals 2

    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lfb7;->p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfb7;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    invoke-virtual {p0}, Lfb7;->o()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Lea7;->zba:I

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lfb7;->t()I

    move-result v0

    iput v0, p0, Lea7;->zba:I

    :cond_0
    return v0

    :cond_1
    invoke-virtual {p0}, Lfb7;->t()I

    move-result v0

    return v0
.end method

.method public final i()V
    .locals 2

    invoke-static {}, Lfc7;->a()Lfc7;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lfc7;->b(Ljava/lang/Class;)Lic7;

    move-result-object v0

    invoke-interface {v0, p0}, Lic7;->f(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lfb7;->k()V

    return-void
.end method

.method public final j(LJa7;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {}, Lfc7;->a()Lfc7;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lfc7;->b(Ljava/lang/Class;)Lic7;

    move-result-object v0

    invoke-static {p1}, LKa7;->M(LJa7;)LKa7;

    move-result-object p1

    invoke-interface {v0, p0, p1}, Lic7;->g(Ljava/lang/Object;LTc7;)V

    return-void
.end method

.method public final k()V
    .locals 2

    iget v0, p0, Lfb7;->zbd:I

    const v1, 0x7fffffff

    and-int/2addr v0, v1

    iput v0, p0, Lfb7;->zbd:I

    return-void
.end method

.method public final m(I)V
    .locals 1

    iget p1, p0, Lfb7;->zbd:I

    const/high16 v0, -0x80000000

    and-int/2addr p1, v0

    const v0, 0x7fffffff

    or-int/2addr p1, v0

    iput p1, p0, Lfb7;->zbd:I

    return-void
.end method

.method public final o()Z
    .locals 2

    iget v0, p0, Lfb7;->zbd:I

    const/high16 v1, -0x80000000

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public abstract p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final q(Lic7;)I
    .locals 1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-static {}, Lfc7;->a()Lfc7;

    move-result-object v0

    invoke-virtual {v0, p1}, Lfc7;->b(Ljava/lang/Class;)Lic7;

    move-result-object p1

    invoke-interface {p1, p0}, Lic7;->a(Ljava/lang/Object;)I

    move-result p1

    return p1

    :cond_0
    invoke-interface {p1, p0}, Lic7;->a(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final t()I
    .locals 2

    invoke-static {}, Lfc7;->a()Lfc7;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lfc7;->b(Ljava/lang/Class;)Lic7;

    move-result-object v0

    invoke-interface {v0, p0}, Lic7;->h(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, LVb7;->a(LTb7;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Lab7;
    .locals 2

    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lfb7;->p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lab7;

    return-object v0
.end method

.method public final x()Lfb7;
    .locals 2

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Lfb7;->p(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfb7;

    return-object v0
.end method

.class public abstract Leu7;
.super Lys7;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "Leu7<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "LZt7<",
        "TMessageType;TBuilderType;>;>",
        "Lys7<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# static fields
.field private static final zzb:Ljava/util/Map;


# instance fields
.field protected zzc:Ltw7;

.field protected zzd:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    sput-object v0, Leu7;->zzb:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lys7;-><init>()V

    invoke-static {}, Ltw7;->c()Ltw7;

    move-result-object v0

    iput-object v0, p0, Leu7;->zzc:Ltw7;

    const/4 v0, -0x1

    iput v0, p0, Leu7;->zzd:I

    return-void
.end method

.method public static final A(Leu7;Z)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Leu7;->B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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
    invoke-static {}, LFv7;->a()LFv7;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, LFv7;->b(Ljava/lang/Class;)LNv7;

    move-result-object v2

    invoke-interface {v2, p0}, LNv7;->d(Ljava/lang/Object;)Z

    move-result v2

    if-eqz p1, :cond_3

    if-eq v0, v2, :cond_2

    move-object p1, v1

    goto :goto_0

    :cond_2
    move-object p1, p0

    :goto_0
    const/4 v0, 0x2

    invoke-virtual {p0, v0, p1, v1}, Leu7;->B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return v2
.end method

.method public static C(Leu7;)Leu7;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;
        }
    .end annotation

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Leu7;->n()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzatc;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzatc;-><init>(Lfv7;)V

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->h(Lfv7;)Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    throw v1

    :cond_1
    :goto_0
    return-object p0
.end method

.method public static j(Ljava/lang/Class;)Leu7;
    .locals 4

    sget-object v0, Leu7;->zzb:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leu7;

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

    check-cast v1, Leu7;

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

    invoke-static {p0}, LCw7;->j(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leu7;

    const/4 v2, 0x6

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3, v3}, Leu7;->B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leu7;

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

.method public static l(Leu7;Ljava/io/InputStream;Lzt7;)Leu7;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;
        }
    .end annotation

    sget v0, Lot7;->d:I

    const/4 v0, 0x0

    if-nez p1, :cond_0

    sget-object p1, Lou7;->d:[B

    array-length v1, p1

    const/4 v1, 0x0

    invoke-static {p1, v1, v1, v1}, Lot7;->g([BIIZ)Lot7;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance v1, Lnt7;

    const/16 v2, 0x1000

    invoke-direct {v1, p1, v2, v0}, Lnt7;-><init>(Ljava/io/InputStream;ILlt7;)V

    move-object p1, v1

    :goto_0
    const/4 v1, 0x4

    invoke-virtual {p0, v1, v0, v0}, Leu7;->B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Leu7;

    :try_start_0
    invoke-static {}, LFv7;->a()LFv7;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, LFv7;->b(Ljava/lang/Class;)LNv7;

    move-result-object v0

    invoke-static {p1}, Lpt7;->O(Lot7;)Lpt7;

    move-result-object p1

    invoke-interface {v0, p0, p1, p2}, LNv7;->h(Ljava/lang/Object;LIv7;Lzt7;)V

    invoke-interface {v0, p0}, LNv7;->zzf(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {p0}, Leu7;->C(Leu7;)Leu7;

    return-object p0

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    instance-of p1, p1, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    throw p0

    :cond_1
    throw p0

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    throw p0

    :cond_2
    new-instance p2, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;-><init>(Ljava/io/IOException;)V

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->h(Lfv7;)Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    throw p2

    :catch_2
    move-exception p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->l()Z

    move-result p2

    if-eqz p2, :cond_3

    new-instance p2, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;-><init>(Ljava/io/IOException;)V

    move-object p1, p2

    :cond_3
    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->h(Lfv7;)Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    throw p1
.end method

.method public static m(Leu7;[BLzt7;)Leu7;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;
        }
    .end annotation

    array-length v0, p1

    const/4 v1, 0x0

    invoke-static {p0, p1, v1, v0, p2}, Leu7;->o(Leu7;[BIILzt7;)Leu7;

    move-result-object p0

    invoke-static {p0}, Leu7;->C(Leu7;)Leu7;

    return-object p0
.end method

.method public static o(Leu7;[BIILzt7;)Leu7;
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;
        }
    .end annotation

    const/4 p2, 0x4

    const/4 v0, 0x0

    invoke-virtual {p0, p2, v0, v0}, Leu7;->B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Leu7;

    :try_start_0
    invoke-static {}, LFv7;->a()LFv7;

    move-result-object p2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p2, v0}, LFv7;->b(Ljava/lang/Class;)LNv7;

    move-result-object p2

    new-instance v5, LFs7;

    invoke-direct {v5, p4}, LFs7;-><init>(Lzt7;)V

    const/4 v3, 0x0

    move-object v0, p2

    move-object v1, p0

    move-object v2, p1

    move v4, p3

    invoke-interface/range {v0 .. v5}, LNv7;->e(Ljava/lang/Object;[BIILFs7;)V

    invoke-interface {p2, p0}, LNv7;->zzf(Ljava/lang/Object;)V

    iget p1, p0, Lys7;->zza:I

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1
    :try_end_0
    .catch Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-static {}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->j()Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->h(Lfv7;)Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    throw p1

    :catch_1
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p2

    instance-of p2, p2, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    if-eqz p2, :cond_1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    throw p0

    :cond_1
    new-instance p2, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;-><init>(Ljava/io/IOException;)V

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->h(Lfv7;)Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    throw p2

    :catch_2
    move-exception p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->l()Z

    move-result p2

    if-eqz p2, :cond_2

    new-instance p2, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    invoke-direct {p2, p1}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;-><init>(Ljava/io/IOException;)V

    move-object p1, p2

    :cond_2
    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;->h(Lfv7;)Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;

    throw p1
.end method

.method public static p()Lju7;
    .locals 1

    invoke-static {}, LWt7;->b()LWt7;

    move-result-object v0

    return-object v0
.end method

.method public static q()Lku7;
    .locals 1

    invoke-static {}, Lfu7;->c()Lfu7;

    move-result-object v0

    return-object v0
.end method

.method public static r()Lmu7;
    .locals 1

    invoke-static {}, LTu7;->c()LTu7;

    move-result-object v0

    return-object v0
.end method

.method public static s()Lnu7;
    .locals 1

    invoke-static {}, LGv7;->b()LGv7;

    move-result-object v0

    return-object v0
.end method

.method public static t(Lnu7;)Lnu7;
    .locals 1

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0xa

    goto :goto_0

    :cond_0
    add-int/2addr v0, v0

    :goto_0
    invoke-interface {p0, v0}, Lnu7;->d(I)Lnu7;

    move-result-object p0

    return-object p0
.end method

.method public static varargs u(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
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

.method public static v(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    new-instance v0, LHv7;

    invoke-direct {v0, p0, p1, p2}, LHv7;-><init>(Lfv7;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v0
.end method

.method public static x(Ljava/lang/Class;Leu7;)V
    .locals 1

    sget-object v0, Leu7;->zzb:Ljava/util/Map;

    invoke-interface {v0, p0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public abstract B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method final b()I
    .locals 1

    iget v0, p0, Leu7;->zzd:I

    return v0
.end method

.method public final d(I)V
    .locals 0

    iput p1, p0, Leu7;->zzd:I

    return-void
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
    invoke-static {}, LFv7;->a()LFv7;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, LFv7;->b(Ljava/lang/Class;)LNv7;

    move-result-object v0

    check-cast p1, Leu7;

    invoke-interface {v0, p0, p1}, LNv7;->g(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final f()LZt7;
    .locals 2

    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Leu7;->B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZt7;

    return-object v0
.end method

.method public final h()LZt7;
    .locals 2

    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Leu7;->B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZt7;

    invoke-virtual {v0, p0}, LZt7;->j(Leu7;)LZt7;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Lys7;->zza:I

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-static {}, LFv7;->a()LFv7;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, LFv7;->b(Ljava/lang/Class;)LNv7;

    move-result-object v0

    invoke-interface {v0, p0}, LNv7;->zzb(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Lys7;->zza:I

    return v0
.end method

.method public final synthetic k()Lev7;
    .locals 2

    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Leu7;->B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZt7;

    return-object v0
.end method

.method public final n()Z
    .locals 1

    const/4 v0, 0x1

    invoke-static {p0, v0}, Leu7;->A(Leu7;Z)Z

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lhv7;->a(Lfv7;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final w()I
    .locals 2

    iget v0, p0, Leu7;->zzd:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-static {}, LFv7;->a()LFv7;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, LFv7;->b(Ljava/lang/Class;)LNv7;

    move-result-object v0

    invoke-interface {v0, p0}, LNv7;->zza(Ljava/lang/Object;)I

    move-result v0

    iput v0, p0, Leu7;->zzd:I

    :cond_0
    return v0
.end method

.method public final y(Lut7;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {}, LFv7;->a()LFv7;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, LFv7;->b(Ljava/lang/Class;)LNv7;

    move-result-object v0

    invoke-static {p1}, Lvt7;->L(Lut7;)Lvt7;

    move-result-object p1

    invoke-interface {v0, p0, p1}, LNv7;->f(Ljava/lang/Object;LKw7;)V

    return-void
.end method

.method public final synthetic z()Lev7;
    .locals 2

    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Leu7;->B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZt7;

    invoke-virtual {v0, p0}, LZt7;->j(Leu7;)LZt7;

    return-object v0
.end method

.method public final synthetic zzw()Lfv7;
    .locals 2

    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1, v1}, Leu7;->B(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leu7;

    return-object v0
.end method

.class public final LgO8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LfV8;


# static fields
.field public static final b:LwQ8;


# instance fields
.field public final a:LwQ8;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LUN8;

    invoke-direct {v0}, LUN8;-><init>()V

    sput-object v0, LgO8;->b:LwQ8;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    new-instance v0, LNO8;

    const/4 v1, 0x2

    new-array v1, v1, [LwQ8;

    const/4 v2, 0x0

    invoke-static {}, LOH8;->a()LOH8;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-static {}, LgO8;->a()LwQ8;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-direct {v0, v1}, LNO8;-><init>([LwQ8;)V

    invoke-direct {p0, v0}, LgO8;-><init>(LwQ8;)V

    return-void
.end method

.method public constructor <init>(LwQ8;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "messageInfoFactory"

    invoke-static {p1, v0}, LyI8;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LwQ8;

    iput-object p1, p0, LgO8;->a:LwQ8;

    return-void
.end method

.method public static a()LwQ8;
    .locals 4

    :try_start_0
    const-string v0, "com.google.protobuf.DescriptorMessageInfoFactory"

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v1, "getInstance"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LwQ8;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    sget-object v0, LgO8;->b:LwQ8;

    return-object v0
.end method

.method public static b(LPP8;)Z
    .locals 1

    invoke-interface {p0}, LPP8;->zza()I

    move-result p0

    sget v0, LpT8;->a:I

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final zza(Ljava/lang/Class;)LzU8;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "LzU8<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, LUU8;->m(Ljava/lang/Class;)V

    iget-object v0, p0, LgO8;->a:LwQ8;

    invoke-interface {v0, p1}, LwQ8;->zzb(Ljava/lang/Class;)LPP8;

    move-result-object v2

    invoke-interface {v2}, LPP8;->zzb()Z

    move-result v0

    const-class v1, Lcom/google/android/gms/internal/vision/G;

    if-eqz v0, :cond_1

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, LUU8;->B()LfY8;

    move-result-object p1

    invoke-static {}, LQE8;->a()LvE8;

    move-result-object v0

    invoke-interface {v2}, LPP8;->zzc()LlQ8;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/vision/J;->g(LfY8;LvE8;LlQ8;)Lcom/google/android/gms/internal/vision/J;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, LUU8;->h()LfY8;

    move-result-object p1

    invoke-static {}, LQE8;->b()LvE8;

    move-result-object v0

    invoke-interface {v2}, LPP8;->zzc()LlQ8;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/vision/J;->g(LfY8;LvE8;LlQ8;)Lcom/google/android/gms/internal/vision/J;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v2}, LgO8;->b(LPP8;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, LnS8;->b()LRR8;

    move-result-object v3

    invoke-static {}, LUL8;->d()LUL8;

    move-result-object v4

    invoke-static {}, LUU8;->B()LfY8;

    move-result-object v5

    invoke-static {}, LQE8;->a()LvE8;

    move-result-object v6

    invoke-static {}, LaQ8;->b()LEP8;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/vision/H;->m(Ljava/lang/Class;LPP8;LRR8;LUL8;LfY8;LvE8;LEP8;)Lcom/google/android/gms/internal/vision/H;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-static {}, LnS8;->b()LRR8;

    move-result-object v3

    invoke-static {}, LUL8;->d()LUL8;

    move-result-object v4

    invoke-static {}, LUU8;->B()LfY8;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {}, LaQ8;->b()LEP8;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/vision/H;->m(Ljava/lang/Class;LPP8;LRR8;LUL8;LfY8;LvE8;LEP8;)Lcom/google/android/gms/internal/vision/H;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {v2}, LgO8;->b(LPP8;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, LnS8;->a()LRR8;

    move-result-object v3

    invoke-static {}, LUL8;->b()LUL8;

    move-result-object v4

    invoke-static {}, LUU8;->h()LfY8;

    move-result-object v5

    invoke-static {}, LQE8;->b()LvE8;

    move-result-object v6

    invoke-static {}, LaQ8;->a()LEP8;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/vision/H;->m(Ljava/lang/Class;LPP8;LRR8;LUL8;LfY8;LvE8;LEP8;)Lcom/google/android/gms/internal/vision/H;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {}, LnS8;->a()LRR8;

    move-result-object v3

    invoke-static {}, LUL8;->b()LUL8;

    move-result-object v4

    invoke-static {}, LUU8;->v()LfY8;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {}, LaQ8;->a()LEP8;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/vision/H;->m(Ljava/lang/Class;LPP8;LRR8;LUL8;LfY8;LvE8;LEP8;)Lcom/google/android/gms/internal/vision/H;

    move-result-object p1

    return-object p1
.end method

.class public final LFZ7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN88;


# static fields
.field public static final b:Lt28;


# instance fields
.field public final a:Lt28;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LTZ7;

    invoke-direct {v0}, LTZ7;-><init>()V

    sput-object v0, LFZ7;->b:Lt28;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    new-instance v0, Li08;

    const/4 v1, 0x2

    new-array v1, v1, [Lt28;

    const/4 v2, 0x0

    invoke-static {}, LgS7;->a()LgS7;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-static {}, LFZ7;->c()Lt28;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-direct {v0, v1}, Li08;-><init>([Lt28;)V

    invoke-direct {p0, v0}, LFZ7;-><init>(Lt28;)V

    return-void
.end method

.method public constructor <init>(Lt28;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "messageInfoFactory"

    invoke-static {p1, v0}, LaT7;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt28;

    iput-object p1, p0, LFZ7;->a:Lt28;

    return-void
.end method

.method public static b(Le28;)Z
    .locals 1

    invoke-interface {p0}, Le28;->a()I

    move-result p0

    sget v0, Lcom/google/android/gms/internal/clearcut/c$e;->i:I

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static c()Lt28;
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

    check-cast v0, Lt28;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    sget-object v0, LFZ7;->b:Lt28;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)Lx88;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lx88<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lc98;->I(Ljava/lang/Class;)V

    iget-object v0, p0, LFZ7;->a:Lt28;

    invoke-interface {v0, p1}, Lt28;->zzb(Ljava/lang/Class;)Le28;

    move-result-object v2

    invoke-interface {v2}, Le28;->b()Z

    move-result v0

    const-class v1, Lcom/google/android/gms/internal/clearcut/c;

    if-eqz v0, :cond_1

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lc98;->B()LEd8;

    move-result-object p1

    invoke-static {}, LEO7;->b()LLN7;

    move-result-object v0

    invoke-interface {v2}, Le28;->c()LH28;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/clearcut/f;->i(LEd8;LLN7;LH28;)Lcom/google/android/gms/internal/clearcut/f;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lc98;->z()LEd8;

    move-result-object p1

    invoke-static {}, LEO7;->c()LLN7;

    move-result-object v0

    invoke-interface {v2}, Le28;->c()LH28;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/clearcut/f;->i(LEd8;LLN7;LH28;)Lcom/google/android/gms/internal/clearcut/f;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v2}, LFZ7;->b(Le28;)Z

    move-result v0

    invoke-static {}, Lx58;->b()LT48;

    move-result-object v3

    invoke-static {}, LlX7;->d()LlX7;

    move-result-object v4

    invoke-static {}, Lc98;->B()LEd8;

    move-result-object v5

    if-eqz v0, :cond_2

    invoke-static {}, LEO7;->b()LLN7;

    move-result-object v6

    invoke-static {}, LQ18;->b()Lo18;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/clearcut/e;->r(Ljava/lang/Class;Le28;LT48;LlX7;LEd8;LLN7;Lo18;)Lcom/google/android/gms/internal/clearcut/e;

    move-result-object p1

    return-object p1

    :cond_2
    const/4 v6, 0x0

    invoke-static {}, LQ18;->b()Lo18;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/clearcut/e;->r(Ljava/lang/Class;Le28;LT48;LlX7;LEd8;LLN7;Lo18;)Lcom/google/android/gms/internal/clearcut/e;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {v2}, LFZ7;->b(Le28;)Z

    move-result v0

    invoke-static {}, Lx58;->a()LT48;

    move-result-object v3

    invoke-static {}, LlX7;->c()LlX7;

    move-result-object v4

    if-eqz v0, :cond_4

    invoke-static {}, Lc98;->z()LEd8;

    move-result-object v5

    invoke-static {}, LEO7;->c()LLN7;

    move-result-object v6

    invoke-static {}, LQ18;->a()Lo18;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/clearcut/e;->r(Ljava/lang/Class;Le28;LT48;LlX7;LEd8;LLN7;Lo18;)Lcom/google/android/gms/internal/clearcut/e;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {}, Lc98;->A()LEd8;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {}, LQ18;->a()Lo18;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/clearcut/e;->r(Ljava/lang/Class;Le28;LT48;LlX7;LEd8;LLN7;Lo18;)Lcom/google/android/gms/internal/clearcut/e;

    move-result-object p1

    return-object p1
.end method

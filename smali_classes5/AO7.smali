.class public final LAO7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LwX7;


# static fields
.field public static final b:LGS7;


# instance fields
.field public final a:LGS7;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LCQ7;

    invoke-direct {v0}, LCQ7;-><init>()V

    sput-object v0, LAO7;->b:LGS7;

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    new-instance v0, LdP7;

    const/4 v1, 0x2

    new-array v1, v1, [LGS7;

    const/4 v2, 0x0

    invoke-static {}, LSC7;->a()LSC7;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-static {}, LAO7;->c()LGS7;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-direct {v0, v1}, LdP7;-><init>([LGS7;)V

    invoke-direct {p0, v0}, LAO7;-><init>(LGS7;)V

    return-void
.end method

.method public constructor <init>(LGS7;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "messageInfoFactory"

    invoke-static {p1, v0}, LlF7;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LGS7;

    iput-object p1, p0, LAO7;->a:LGS7;

    return-void
.end method

.method public static b(LWS7;)Z
    .locals 1

    invoke-interface {p0}, LWS7;->a()I

    move-result p0

    sget v0, Lcom/google/android/gms/internal/places/c$d;->i:I

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static c()LGS7;
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

    check-cast v0, LGS7;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    sget-object v0, LAO7;->b:LGS7;

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)LLY7;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "LLY7<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, LoZ7;->E(Ljava/lang/Class;)V

    iget-object v0, p0, LAO7;->a:LGS7;

    invoke-interface {v0, p1}, LGS7;->zzc(Ljava/lang/Class;)LWS7;

    move-result-object v2

    invoke-interface {v2}, LWS7;->b()Z

    move-result v0

    const-class v1, Lcom/google/android/gms/internal/places/c;

    if-eqz v0, :cond_1

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, LoZ7;->r()LI38;

    move-result-object p1

    invoke-static {}, Llv7;->b()Ltu7;

    move-result-object v0

    invoke-interface {v2}, LWS7;->c()LzT7;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/places/f;->i(LI38;Ltu7;LzT7;)Lcom/google/android/gms/internal/places/f;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, LoZ7;->l()LI38;

    move-result-object p1

    invoke-static {}, Llv7;->c()Ltu7;

    move-result-object v0

    invoke-interface {v2}, LWS7;->c()LzT7;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lcom/google/android/gms/internal/places/f;->i(LI38;Ltu7;LzT7;)Lcom/google/android/gms/internal/places/f;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v2}, LAO7;->b(LWS7;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, LeW7;->b()LCV7;

    move-result-object v3

    invoke-static {}, LHN7;->d()LHN7;

    move-result-object v4

    invoke-static {}, LoZ7;->r()LI38;

    move-result-object v5

    invoke-static {}, Llv7;->b()Ltu7;

    move-result-object v6

    invoke-static {}, LcS7;->b()LxR7;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/places/e;->t(Ljava/lang/Class;LWS7;LCV7;LHN7;LI38;Ltu7;LxR7;)Lcom/google/android/gms/internal/places/e;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-static {}, LeW7;->b()LCV7;

    move-result-object v3

    invoke-static {}, LHN7;->d()LHN7;

    move-result-object v4

    invoke-static {}, LoZ7;->r()LI38;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {}, LcS7;->b()LxR7;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/places/e;->t(Ljava/lang/Class;LWS7;LCV7;LHN7;LI38;Ltu7;LxR7;)Lcom/google/android/gms/internal/places/e;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {v2}, LAO7;->b(LWS7;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, LeW7;->a()LCV7;

    move-result-object v3

    invoke-static {}, LHN7;->c()LHN7;

    move-result-object v4

    invoke-static {}, LoZ7;->l()LI38;

    move-result-object v5

    invoke-static {}, Llv7;->c()Ltu7;

    move-result-object v6

    invoke-static {}, LcS7;->a()LxR7;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/places/e;->t(Ljava/lang/Class;LWS7;LCV7;LHN7;LI38;Ltu7;LxR7;)Lcom/google/android/gms/internal/places/e;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {}, LeW7;->a()LCV7;

    move-result-object v3

    invoke-static {}, LHN7;->c()LHN7;

    move-result-object v4

    invoke-static {}, LoZ7;->q()LI38;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {}, LcS7;->a()LxR7;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/google/android/gms/internal/places/e;->t(Ljava/lang/Class;LWS7;LCV7;LHN7;LI38;Ltu7;LxR7;)Lcom/google/android/gms/internal/places/e;

    move-result-object p1

    return-object p1
.end method

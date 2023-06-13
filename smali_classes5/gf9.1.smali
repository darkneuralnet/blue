.class public final Lgf9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LMi9;


# static fields
.field public static final b:Lag9;


# instance fields
.field public final a:Lag9;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LQe9;

    invoke-direct {v0}, LQe9;-><init>()V

    sput-object v0, Lgf9;->b:Lag9;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    new-instance v0, LYe9;

    const/4 v1, 0x2

    new-array v1, v1, [Lag9;

    invoke-static {}, Lya9;->a()Lya9;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    :try_start_0
    const-string v2, "com.google.protobuf.DescriptorMessageInfoFactory"

    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    const-string v4, "getInstance"

    new-array v5, v3, [Ljava/lang/Class;

    invoke-virtual {v2, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v2, v4, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lag9;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v2, Lgf9;->b:Lag9;

    :goto_0
    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-direct {v0, v1}, LYe9;-><init>([Lag9;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "messageInfoFactory"

    invoke-static {v0, v1}, Lkc9;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object v0, p0, Lgf9;->a:Lag9;

    return-void
.end method

.method public static a(LTf9;)Z
    .locals 1

    invoke-interface {p0}, LTf9;->zzc()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final zza(Ljava/lang/Class;)LEi9;
    .locals 8

    invoke-static {p1}, LTi9;->g(Ljava/lang/Class;)V

    iget-object v0, p0, Lgf9;->a:Lag9;

    invoke-interface {v0, p1}, Lag9;->zzb(Ljava/lang/Class;)LTf9;

    move-result-object v2

    invoke-interface {v2}, LTf9;->zzb()Z

    move-result v0

    const-class v1, Lub9;

    if-eqz v0, :cond_1

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, LTi9;->b()LMk9;

    move-result-object p1

    invoke-static {}, LP99;->b()LU89;

    move-result-object v0

    invoke-interface {v2}, LTf9;->zza()Lpg9;

    move-result-object v1

    invoke-static {p1, v0, v1}, LTg9;->f(LMk9;LU89;Lpg9;)LTg9;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, LTi9;->b0()LMk9;

    move-result-object p1

    invoke-static {}, LP99;->a()LU89;

    move-result-object v0

    invoke-interface {v2}, LTf9;->zza()Lpg9;

    move-result-object v1

    invoke-static {p1, v0, v1}, LTg9;->f(LMk9;LU89;Lpg9;)LTg9;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v2}, Lgf9;->a(LTf9;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lrh9;->b()Ljh9;

    move-result-object v3

    invoke-static {}, LCe9;->d()LCe9;

    move-result-object v4

    invoke-static {}, LTi9;->b()LMk9;

    move-result-object v5

    invoke-static {}, LP99;->b()LU89;

    move-result-object v6

    invoke-static {}, LMf9;->b()LEf9;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LLg9;->B(Ljava/lang/Class;LTf9;Ljh9;LCe9;LMk9;LU89;LEf9;)LLg9;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-static {}, Lrh9;->b()Ljh9;

    move-result-object v3

    invoke-static {}, LCe9;->d()LCe9;

    move-result-object v4

    invoke-static {}, LTi9;->b()LMk9;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {}, LMf9;->b()LEf9;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LLg9;->B(Ljava/lang/Class;LTf9;Ljh9;LCe9;LMk9;LU89;LEf9;)LLg9;

    move-result-object p1

    goto :goto_0

    :cond_3
    invoke-static {v2}, Lgf9;->a(LTf9;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lrh9;->a()Ljh9;

    move-result-object v3

    invoke-static {}, LCe9;->c()LCe9;

    move-result-object v4

    invoke-static {}, LTi9;->b0()LMk9;

    move-result-object v5

    invoke-static {}, LP99;->a()LU89;

    move-result-object v6

    invoke-static {}, LMf9;->a()LEf9;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LLg9;->B(Ljava/lang/Class;LTf9;Ljh9;LCe9;LMk9;LU89;LEf9;)LLg9;

    move-result-object p1

    goto :goto_0

    :cond_4
    invoke-static {}, Lrh9;->a()Ljh9;

    move-result-object v3

    invoke-static {}, LCe9;->c()LCe9;

    move-result-object v4

    invoke-static {}, LTi9;->a()LMk9;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {}, LMf9;->a()LEf9;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LLg9;->B(Ljava/lang/Class;LTf9;Ljh9;LCe9;LMk9;LU89;LEf9;)LLg9;

    move-result-object p1

    :goto_0
    return-object p1
.end method

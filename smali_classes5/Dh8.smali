.class public final LDh8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzn8;


# static fields
.field public static final b:Ljj8;


# instance fields
.field public final a:Ljj8;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LZg8;

    invoke-direct {v0}, LZg8;-><init>()V

    sput-object v0, LDh8;->b:Ljj8;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    new-instance v0, Lph8;

    const/4 v1, 0x2

    new-array v1, v1, [Ljj8;

    invoke-static {}, LZa8;->a()LZa8;

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

    check-cast v2, Ljj8;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v2, LDh8;->b:Ljj8;

    :goto_0
    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-direct {v0, v1}, Lph8;-><init>([Ljj8;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "messageInfoFactory"

    invoke-static {v0, v1}, Lfd8;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object v0, p0, LDh8;->a:Ljj8;

    return-void
.end method

.method public static a(LWi8;)Z
    .locals 1

    invoke-interface {p0}, LWi8;->zzc()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final zza(Ljava/lang/Class;)Lnn8;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lnn8<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, LLn8;->g(Ljava/lang/Class;)V

    iget-object v0, p0, LDh8;->a:Ljj8;

    invoke-interface {v0, p1}, Ljj8;->zzb(Ljava/lang/Class;)LWi8;

    move-result-object v2

    invoke-interface {v2}, LWi8;->zzb()Z

    move-result v0

    const-class v1, LPb8;

    if-eqz v0, :cond_1

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, LLn8;->c()LDq8;

    move-result-object p1

    invoke-static {}, LQ98;->b()Ll98;

    move-result-object v0

    invoke-interface {v2}, LWi8;->zza()LKj8;

    move-result-object v1

    invoke-static {p1, v0, v1}, LLk8;->a(LDq8;Ll98;LKj8;)LLk8;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, LLn8;->a()LDq8;

    move-result-object p1

    invoke-static {}, LQ98;->a()Ll98;

    move-result-object v0

    invoke-interface {v2}, LWi8;->zza()LKj8;

    move-result-object v1

    invoke-static {p1, v0, v1}, LLk8;->a(LDq8;Ll98;LKj8;)LLk8;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v2}, LDh8;->a(LWi8;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lll8;->b()LYk8;

    move-result-object v3

    invoke-static {}, Lug8;->d()Lug8;

    move-result-object v4

    invoke-static {}, LLn8;->c()LDq8;

    move-result-object v5

    invoke-static {}, LQ98;->b()Ll98;

    move-result-object v6

    invoke-static {}, LHi8;->b()Lui8;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lyk8;->r(Ljava/lang/Class;LWi8;LYk8;Lug8;LDq8;Ll98;Lui8;)Lyk8;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-static {}, Lll8;->b()LYk8;

    move-result-object v3

    invoke-static {}, Lug8;->d()Lug8;

    move-result-object v4

    invoke-static {}, LLn8;->c()LDq8;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {}, LHi8;->b()Lui8;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lyk8;->r(Ljava/lang/Class;LWi8;LYk8;Lug8;LDq8;Ll98;Lui8;)Lyk8;

    move-result-object p1

    goto :goto_0

    :cond_3
    invoke-static {v2}, LDh8;->a(LWi8;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Lll8;->a()LYk8;

    move-result-object v3

    invoke-static {}, Lug8;->c()Lug8;

    move-result-object v4

    invoke-static {}, LLn8;->a()LDq8;

    move-result-object v5

    invoke-static {}, LQ98;->a()Ll98;

    move-result-object v6

    invoke-static {}, LHi8;->a()Lui8;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lyk8;->r(Ljava/lang/Class;LWi8;LYk8;Lug8;LDq8;Ll98;Lui8;)Lyk8;

    move-result-object p1

    goto :goto_0

    :cond_4
    invoke-static {}, Lll8;->a()LYk8;

    move-result-object v3

    invoke-static {}, Lug8;->c()Lug8;

    move-result-object v4

    invoke-static {}, LLn8;->b()LDq8;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {}, LHi8;->a()Lui8;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lyk8;->r(Ljava/lang/Class;LWi8;LYk8;Lug8;LDq8;Ll98;Lui8;)Lyk8;

    move-result-object p1

    :goto_0
    return-object p1
.end method

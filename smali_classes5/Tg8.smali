.class public final LTg8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LPo8;


# static fields
.field public static final b:LBi8;


# instance fields
.field public final a:LBi8;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Log8;

    invoke-direct {v0}, Log8;-><init>()V

    sput-object v0, LTg8;->b:LBi8;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    new-instance v0, LEg8;

    const/4 v1, 0x2

    new-array v1, v1, [LBi8;

    invoke-static {}, LW48;->a()LW48;

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

    check-cast v2, LBi8;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v2, LTg8;->b:LBi8;

    :goto_0
    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-direct {v0, v1}, LEg8;-><init>([LBi8;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v1, LFa8;->a:Ljava/nio/charset/Charset;

    iput-object v0, p0, LTg8;->a:LBi8;

    return-void
.end method

.method public static a(Loi8;)Z
    .locals 1

    invoke-interface {p0}, Loi8;->zzc()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final zza(Ljava/lang/Class;)LDo8;
    .locals 8

    invoke-static {p1}, Lcp8;->e(Ljava/lang/Class;)V

    iget-object v0, p0, LTg8;->a:LBi8;

    invoke-interface {v0, p1}, LBi8;->zzb(Ljava/lang/Class;)Loi8;

    move-result-object v2

    invoke-interface {v2}, Loi8;->zzb()Z

    move-result v0

    const-class v1, LV78;

    if-eqz v0, :cond_1

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lcp8;->a()LFs8;

    move-result-object p1

    invoke-static {}, Lz38;->b()LW28;

    move-result-object v0

    invoke-interface {v2}, Loi8;->zza()Ldj8;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lfk8;->f(LFs8;LW28;Ldj8;)Lfk8;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lcp8;->X()LFs8;

    move-result-object p1

    invoke-static {}, Lz38;->a()LW28;

    move-result-object v0

    invoke-interface {v2}, Loi8;->zza()Ldj8;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lfk8;->f(LFs8;LW28;Ldj8;)Lfk8;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v2}, LTg8;->a(Loi8;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, LRk8;->b()LFk8;

    move-result-object v3

    invoke-static {}, LJf8;->d()LJf8;

    move-result-object v4

    invoke-static {}, Lcp8;->a()LFs8;

    move-result-object v5

    invoke-static {}, Lz38;->b()LW28;

    move-result-object v6

    invoke-static {}, LZh8;->b()LMh8;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LSj8;->D(Ljava/lang/Class;Loi8;LFk8;LJf8;LFs8;LW28;LMh8;)LSj8;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-static {}, LRk8;->b()LFk8;

    move-result-object v3

    invoke-static {}, LJf8;->d()LJf8;

    move-result-object v4

    invoke-static {}, Lcp8;->a()LFs8;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {}, LZh8;->b()LMh8;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LSj8;->D(Ljava/lang/Class;Loi8;LFk8;LJf8;LFs8;LW28;LMh8;)LSj8;

    move-result-object p1

    goto :goto_0

    :cond_3
    invoke-static {v2}, LTg8;->a(Loi8;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, LRk8;->a()LFk8;

    move-result-object v3

    invoke-static {}, LJf8;->c()LJf8;

    move-result-object v4

    invoke-static {}, Lcp8;->X()LFs8;

    move-result-object v5

    invoke-static {}, Lz38;->a()LW28;

    move-result-object v6

    invoke-static {}, LZh8;->a()LMh8;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LSj8;->D(Ljava/lang/Class;Loi8;LFk8;LJf8;LFs8;LW28;LMh8;)LSj8;

    move-result-object p1

    goto :goto_0

    :cond_4
    invoke-static {}, LRk8;->a()LFk8;

    move-result-object v3

    invoke-static {}, LJf8;->c()LJf8;

    move-result-object v4

    invoke-static {}, Lcp8;->Y()LFs8;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {}, LZh8;->a()LMh8;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LSj8;->D(Ljava/lang/Class;Loi8;LFk8;LJf8;LFs8;LW28;LMh8;)LSj8;

    move-result-object p1

    :goto_0
    return-object p1
.end method

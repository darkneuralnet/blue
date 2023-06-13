.class public final LWu7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LOv7;


# static fields
.field public static final b:Ldv7;


# instance fields
.field public final a:Ldv7;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LUu7;

    invoke-direct {v0}, LUu7;-><init>()V

    sput-object v0, LWu7;->b:Ldv7;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    new-instance v0, LVu7;

    const/4 v1, 0x2

    new-array v1, v1, [Ldv7;

    invoke-static {}, LYt7;->a()LYt7;

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

    check-cast v2, Ldv7;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v2, LWu7;->b:Ldv7;

    :goto_0
    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-direct {v0, v1}, LVu7;-><init>([Ldv7;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "messageInfoFactory"

    invoke-static {v0, v1}, Lou7;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object v0, p0, LWu7;->a:Ldv7;

    return-void
.end method

.method public static a(Lcv7;)Z
    .locals 1

    invoke-interface {p0}, Lcv7;->zzc()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final zza(Ljava/lang/Class;)LNv7;
    .locals 8

    invoke-static {p1}, LPv7;->g(Ljava/lang/Class;)V

    iget-object v0, p0, LWu7;->a:Ldv7;

    invoke-interface {v0, p1}, Ldv7;->zzb(Ljava/lang/Class;)Lcv7;

    move-result-object v2

    invoke-interface {v2}, Lcv7;->zzb()Z

    move-result v0

    const-class v1, Leu7;

    if-eqz v0, :cond_1

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, LPv7;->b()Lsw7;

    move-result-object p1

    invoke-static {}, LCt7;->b()LAt7;

    move-result-object v0

    invoke-interface {v2}, Lcv7;->zza()Lfv7;

    move-result-object v1

    invoke-static {p1, v0, v1}, Ljv7;->b(Lsw7;LAt7;Lfv7;)Ljv7;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, LPv7;->b0()Lsw7;

    move-result-object p1

    invoke-static {}, LCt7;->a()LAt7;

    move-result-object v0

    invoke-interface {v2}, Lcv7;->zza()Lfv7;

    move-result-object v1

    invoke-static {p1, v0, v1}, Ljv7;->b(Lsw7;LAt7;Lfv7;)Ljv7;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v2}, LWu7;->a(Lcv7;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, LDv7;->b()LCv7;

    move-result-object v3

    invoke-static {}, LSu7;->e()LSu7;

    move-result-object v4

    invoke-static {}, LPv7;->b()Lsw7;

    move-result-object v5

    invoke-static {}, LCt7;->b()LAt7;

    move-result-object v6

    invoke-static {}, Lbv7;->b()Lav7;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Liv7;->H(Ljava/lang/Class;Lcv7;LCv7;LSu7;Lsw7;LAt7;Lav7;)Liv7;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-static {}, LDv7;->b()LCv7;

    move-result-object v3

    invoke-static {}, LSu7;->e()LSu7;

    move-result-object v4

    invoke-static {}, LPv7;->b()Lsw7;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {}, Lbv7;->b()Lav7;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Liv7;->H(Ljava/lang/Class;Lcv7;LCv7;LSu7;Lsw7;LAt7;Lav7;)Liv7;

    move-result-object p1

    goto :goto_0

    :cond_3
    invoke-static {v2}, LWu7;->a(Lcv7;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, LDv7;->a()LCv7;

    move-result-object v3

    invoke-static {}, LSu7;->d()LSu7;

    move-result-object v4

    invoke-static {}, LPv7;->b0()Lsw7;

    move-result-object v5

    invoke-static {}, LCt7;->a()LAt7;

    move-result-object v6

    invoke-static {}, Lbv7;->a()Lav7;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Liv7;->H(Ljava/lang/Class;Lcv7;LCv7;LSu7;Lsw7;LAt7;Lav7;)Liv7;

    move-result-object p1

    goto :goto_0

    :cond_4
    invoke-static {}, LDv7;->a()LCv7;

    move-result-object v3

    invoke-static {}, LSu7;->d()LSu7;

    move-result-object v4

    invoke-static {}, LPv7;->a()Lsw7;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {}, Lbv7;->a()Lav7;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Liv7;->H(Ljava/lang/Class;Lcv7;LCv7;LSu7;Lsw7;LAt7;Lav7;)Liv7;

    move-result-object p1

    :goto_0
    return-object p1
.end method

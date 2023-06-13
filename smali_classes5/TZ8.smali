.class public final LTZ8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LO39;


# static fields
.field public static final b:LY09;


# instance fields
.field public final a:LY09;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LSY8;

    invoke-direct {v0}, LSY8;-><init>()V

    sput-object v0, LTZ8;->b:LY09;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    new-instance v0, LcZ8;

    const/4 v1, 0x2

    new-array v1, v1, [LY09;

    invoke-static {}, LJS8;->a()LJS8;

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

    check-cast v2, LY09;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v2, LTZ8;->b:LY09;

    :goto_0
    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-direct {v0, v1}, LcZ8;-><init>([LY09;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v1, LXV8;->a:Ljava/nio/charset/Charset;

    iput-object v0, p0, LTZ8;->a:LY09;

    return-void
.end method

.method public static a(LO09;)Z
    .locals 1

    invoke-interface {p0}, LO09;->zzc()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final zza(Ljava/lang/Class;)LF39;
    .locals 8

    invoke-static {p1}, LX39;->d(Ljava/lang/Class;)V

    iget-object v0, p0, LTZ8;->a:LY09;

    invoke-interface {v0, p1}, LY09;->zzb(Ljava/lang/Class;)LO09;

    move-result-object v2

    invoke-interface {v2}, LO09;->zzb()Z

    move-result v0

    const-class v1, LpU8;

    if-eqz v0, :cond_1

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, LX39;->a()LQ69;

    move-result-object p1

    invoke-static {}, LxR8;->b()LdR8;

    move-result-object v0

    invoke-interface {v2}, LO09;->zza()Lr19;

    move-result-object v1

    invoke-static {p1, v0, v1}, Le29;->f(LQ69;LdR8;Lr19;)Le29;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, LX39;->W()LQ69;

    move-result-object p1

    invoke-static {}, LxR8;->a()LdR8;

    move-result-object v0

    invoke-interface {v2}, LO09;->zza()Lr19;

    move-result-object v1

    invoke-static {p1, v0, v1}, Le29;->f(LQ69;LdR8;Lr19;)Le29;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v2}, LTZ8;->a(LO09;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Ly29;->b()Lo29;

    move-result-object v3

    invoke-static {}, LyY8;->d()LyY8;

    move-result-object v4

    invoke-static {}, LX39;->a()LQ69;

    move-result-object v5

    invoke-static {}, LxR8;->b()LdR8;

    move-result-object v6

    invoke-static {}, LF09;->b()Lv09;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LU19;->D(Ljava/lang/Class;LO09;Lo29;LyY8;LQ69;LdR8;Lv09;)LU19;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-static {}, Ly29;->b()Lo29;

    move-result-object v3

    invoke-static {}, LyY8;->d()LyY8;

    move-result-object v4

    invoke-static {}, LX39;->a()LQ69;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {}, LF09;->b()Lv09;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LU19;->D(Ljava/lang/Class;LO09;Lo29;LyY8;LQ69;LdR8;Lv09;)LU19;

    move-result-object p1

    goto :goto_0

    :cond_3
    invoke-static {v2}, LTZ8;->a(LO09;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Ly29;->a()Lo29;

    move-result-object v3

    invoke-static {}, LyY8;->c()LyY8;

    move-result-object v4

    invoke-static {}, LX39;->W()LQ69;

    move-result-object v5

    invoke-static {}, LxR8;->a()LdR8;

    move-result-object v6

    invoke-static {}, LF09;->a()Lv09;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LU19;->D(Ljava/lang/Class;LO09;Lo29;LyY8;LQ69;LdR8;Lv09;)LU19;

    move-result-object p1

    goto :goto_0

    :cond_4
    invoke-static {}, Ly29;->a()Lo29;

    move-result-object v3

    invoke-static {}, LyY8;->c()LyY8;

    move-result-object v4

    invoke-static {}, LX39;->X()LQ69;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {}, LF09;->a()Lv09;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LU19;->D(Ljava/lang/Class;LO09;Lo29;LyY8;LQ69;LdR8;Lv09;)LU19;

    move-result-object p1

    :goto_0
    return-object p1
.end method

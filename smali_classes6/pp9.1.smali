.class public final Lpp9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ler9;


# static fields
.field public static final b:LIp9;


# instance fields
.field public final a:LIp9;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lip9;

    invoke-direct {v0}, Lip9;-><init>()V

    sput-object v0, Lpp9;->b:LIp9;

    return-void
.end method

.method public constructor <init>()V
    .locals 6

    new-instance v0, Lmp9;

    const/4 v1, 0x2

    new-array v1, v1, [LIp9;

    invoke-static {}, LVl9;->a()LVl9;

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

    check-cast v2, LIp9;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    sget-object v2, Lpp9;->b:LIp9;

    :goto_0
    const/4 v3, 0x1

    aput-object v2, v1, v3

    invoke-direct {v0, v1}, Lmp9;-><init>([LIp9;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "messageInfoFactory"

    invoke-static {v0, v1}, LFn9;->f(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object v0, p0, Lpp9;->a:LIp9;

    return-void
.end method

.method public static a(LFp9;)Z
    .locals 1

    invoke-interface {p0}, LFp9;->zzc()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    return v0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final zza(Ljava/lang/Class;)Lbr9;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lbr9<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lhr9;->g(Ljava/lang/Class;)V

    iget-object v0, p0, Lpp9;->a:LIp9;

    invoke-interface {v0, p1}, LIp9;->zzb(Ljava/lang/Class;)LFp9;

    move-result-object v2

    invoke-interface {v2}, LFp9;->zzb()Z

    move-result v0

    const-class v1, LEm9;

    if-eqz v0, :cond_1

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lhr9;->b()LNr9;

    move-result-object p1

    invoke-static {}, LJk9;->b()Lyk9;

    move-result-object v0

    invoke-interface {v2}, LFp9;->zza()LNp9;

    move-result-object v1

    invoke-static {p1, v0, v1}, LYp9;->f(LNr9;Lyk9;LNp9;)LYp9;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lhr9;->b0()LNr9;

    move-result-object p1

    invoke-static {}, LJk9;->a()Lyk9;

    move-result-object v0

    invoke-interface {v2}, LFp9;->zza()LNp9;

    move-result-object v1

    invoke-static {p1, v0, v1}, LYp9;->f(LNr9;Lyk9;LNp9;)LYp9;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {v2}, Lpp9;->a(LFp9;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Leq9;->b()Lbq9;

    move-result-object v3

    invoke-static {}, Lbp9;->e()Lbp9;

    move-result-object v4

    invoke-static {}, Lhr9;->b()LNr9;

    move-result-object v5

    invoke-static {}, LJk9;->b()Lyk9;

    move-result-object v6

    invoke-static {}, LDp9;->b()LAp9;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LVp9;->t(Ljava/lang/Class;LFp9;Lbq9;Lbp9;LNr9;Lyk9;LAp9;)LVp9;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-static {}, Leq9;->b()Lbq9;

    move-result-object v3

    invoke-static {}, Lbp9;->e()Lbp9;

    move-result-object v4

    invoke-static {}, Lhr9;->b()LNr9;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {}, LDp9;->b()LAp9;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LVp9;->t(Ljava/lang/Class;LFp9;Lbq9;Lbp9;LNr9;Lyk9;LAp9;)LVp9;

    move-result-object p1

    goto :goto_0

    :cond_3
    invoke-static {v2}, Lpp9;->a(LFp9;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {}, Leq9;->a()Lbq9;

    move-result-object v3

    invoke-static {}, Lbp9;->d()Lbp9;

    move-result-object v4

    invoke-static {}, Lhr9;->b0()LNr9;

    move-result-object v5

    invoke-static {}, LJk9;->a()Lyk9;

    move-result-object v6

    invoke-static {}, LDp9;->a()LAp9;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LVp9;->t(Ljava/lang/Class;LFp9;Lbq9;Lbp9;LNr9;Lyk9;LAp9;)LVp9;

    move-result-object p1

    goto :goto_0

    :cond_4
    invoke-static {}, Leq9;->a()Lbq9;

    move-result-object v3

    invoke-static {}, Lbp9;->d()Lbp9;

    move-result-object v4

    invoke-static {}, Lhr9;->a()LNr9;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {}, LDp9;->a()LAp9;

    move-result-object v7

    move-object v1, p1

    invoke-static/range {v1 .. v7}, LVp9;->t(Ljava/lang/Class;LFp9;Lbq9;Lbp9;LNr9;Lyk9;LAp9;)LVp9;

    move-result-object p1

    :goto_0
    return-object p1
.end method

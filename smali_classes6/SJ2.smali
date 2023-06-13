.class public final LSJ2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKm5;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LSJ2$b;
    }
.end annotation


# static fields
.field public static final b:LsT2;


# instance fields
.field public final a:LsT2;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LSJ2$a;

    invoke-direct {v0}, LSJ2$a;-><init>()V

    sput-object v0, LSJ2;->b:LsT2;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-static {}, LSJ2;->b()LsT2;

    move-result-object v0

    invoke-direct {p0, v0}, LSJ2;-><init>(LsT2;)V

    return-void
.end method

.method public constructor <init>(LsT2;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "messageInfoFactory"

    invoke-static {p1, v0}, Lcom/google/protobuf/t;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LsT2;

    iput-object p1, p0, LSJ2;->a:LsT2;

    return-void
.end method

.method public static b()LsT2;
    .locals 4

    new-instance v0, LSJ2$b;

    const/4 v1, 0x2

    new-array v1, v1, [LsT2;

    const/4 v2, 0x0

    invoke-static {}, Lcom/google/protobuf/q;->c()Lcom/google/protobuf/q;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-static {}, LSJ2;->c()LsT2;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-direct {v0, v1}, LSJ2$b;-><init>([LsT2;)V

    return-object v0
.end method

.method public static c()LsT2;
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

    check-cast v0, LsT2;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    sget-object v0, LSJ2;->b:LsT2;

    return-object v0
.end method

.method public static d(LqT2;)Z
    .locals 1

    invoke-interface {p0}, LqT2;->c()LI94;

    move-result-object p0

    sget-object v0, LI94;->b:LI94;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static e(Ljava/lang/Class;LqT2;)LJm5;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "LqT2;",
            ")",
            "LJm5<",
            "TT;>;"
        }
    .end annotation

    const-class v0, Lcom/google/protobuf/r;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, LSJ2;->d(LqT2;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lb83;->b()LY73;

    move-result-object v3

    invoke-static {}, Lcom/google/protobuf/x;->b()Lcom/google/protobuf/x;

    move-result-object v4

    invoke-static {}, Lcom/google/protobuf/J;->M()Lcom/google/protobuf/L;

    move-result-object v5

    invoke-static {}, LHi1;->b()Lcom/google/protobuf/l;

    move-result-object v6

    invoke-static {}, LrK2;->b()Lcom/google/protobuf/B;

    move-result-object v7

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Lcom/google/protobuf/F;->R(Ljava/lang/Class;LqT2;LY73;Lcom/google/protobuf/x;Lcom/google/protobuf/L;Lcom/google/protobuf/l;Lcom/google/protobuf/B;)Lcom/google/protobuf/F;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {}, Lb83;->b()LY73;

    move-result-object v2

    invoke-static {}, Lcom/google/protobuf/x;->b()Lcom/google/protobuf/x;

    move-result-object v3

    invoke-static {}, Lcom/google/protobuf/J;->M()Lcom/google/protobuf/L;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {}, LrK2;->b()Lcom/google/protobuf/B;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v6}, Lcom/google/protobuf/F;->R(Ljava/lang/Class;LqT2;LY73;Lcom/google/protobuf/x;Lcom/google/protobuf/L;Lcom/google/protobuf/l;Lcom/google/protobuf/B;)Lcom/google/protobuf/F;

    move-result-object p0

    :goto_0
    return-object p0

    :cond_1
    invoke-static {p1}, LSJ2;->d(LqT2;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lb83;->a()LY73;

    move-result-object v3

    invoke-static {}, Lcom/google/protobuf/x;->a()Lcom/google/protobuf/x;

    move-result-object v4

    invoke-static {}, Lcom/google/protobuf/J;->H()Lcom/google/protobuf/L;

    move-result-object v5

    invoke-static {}, LHi1;->a()Lcom/google/protobuf/l;

    move-result-object v6

    invoke-static {}, LrK2;->a()Lcom/google/protobuf/B;

    move-result-object v7

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Lcom/google/protobuf/F;->R(Ljava/lang/Class;LqT2;LY73;Lcom/google/protobuf/x;Lcom/google/protobuf/L;Lcom/google/protobuf/l;Lcom/google/protobuf/B;)Lcom/google/protobuf/F;

    move-result-object p0

    goto :goto_1

    :cond_2
    invoke-static {}, Lb83;->a()LY73;

    move-result-object v2

    invoke-static {}, Lcom/google/protobuf/x;->a()Lcom/google/protobuf/x;

    move-result-object v3

    invoke-static {}, Lcom/google/protobuf/J;->I()Lcom/google/protobuf/L;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {}, LrK2;->a()Lcom/google/protobuf/B;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v6}, Lcom/google/protobuf/F;->R(Ljava/lang/Class;LqT2;LY73;Lcom/google/protobuf/x;Lcom/google/protobuf/L;Lcom/google/protobuf/l;Lcom/google/protobuf/B;)Lcom/google/protobuf/F;

    move-result-object p0

    :goto_1
    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Class;)LJm5;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "LJm5<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/protobuf/J;->J(Ljava/lang/Class;)V

    iget-object v0, p0, LSJ2;->a:LsT2;

    invoke-interface {v0, p1}, LsT2;->a(Ljava/lang/Class;)LqT2;

    move-result-object v0

    invoke-interface {v0}, LqT2;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    const-class v1, Lcom/google/protobuf/r;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/google/protobuf/J;->M()Lcom/google/protobuf/L;

    move-result-object p1

    invoke-static {}, LHi1;->b()Lcom/google/protobuf/l;

    move-result-object v1

    invoke-interface {v0}, LqT2;->b()Lcom/google/protobuf/D;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lcom/google/protobuf/G;->l(Lcom/google/protobuf/L;Lcom/google/protobuf/l;Lcom/google/protobuf/D;)Lcom/google/protobuf/G;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lcom/google/protobuf/J;->H()Lcom/google/protobuf/L;

    move-result-object p1

    invoke-static {}, LHi1;->a()Lcom/google/protobuf/l;

    move-result-object v1

    invoke-interface {v0}, LqT2;->b()Lcom/google/protobuf/D;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lcom/google/protobuf/G;->l(Lcom/google/protobuf/L;Lcom/google/protobuf/l;Lcom/google/protobuf/D;)Lcom/google/protobuf/G;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {p1, v0}, LSJ2;->e(Ljava/lang/Class;LqT2;)LJm5;

    move-result-object p1

    return-object p1
.end method

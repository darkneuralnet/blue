.class public final LRJ2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LLm5;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LRJ2$b;
    }
.end annotation


# static fields
.field public static final b:LtT2;


# instance fields
.field public final a:LtT2;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LRJ2$a;

    invoke-direct {v0}, LRJ2$a;-><init>()V

    sput-object v0, LRJ2;->b:LtT2;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-static {}, LRJ2;->b()LtT2;

    move-result-object v0

    invoke-direct {p0, v0}, LRJ2;-><init>(LtT2;)V

    return-void
.end method

.method public constructor <init>(LtT2;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "messageInfoFactory"

    invoke-static {p1, v0}, Lcom/google/crypto/tink/shaded/protobuf/v;->b(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LtT2;

    iput-object p1, p0, LRJ2;->a:LtT2;

    return-void
.end method

.method public static b()LtT2;
    .locals 4

    new-instance v0, LRJ2$b;

    const/4 v1, 0x2

    new-array v1, v1, [LtT2;

    const/4 v2, 0x0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/s;->c()Lcom/google/crypto/tink/shaded/protobuf/s;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-static {}, LRJ2;->c()LtT2;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-direct {v0, v1}, LRJ2$b;-><init>([LtT2;)V

    return-object v0
.end method

.method public static c()LtT2;
    .locals 4

    :try_start_0
    const-string v0, "com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory"

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

    check-cast v0, LtT2;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    sget-object v0, LRJ2;->b:LtT2;

    return-object v0
.end method

.method public static d(LrT2;)Z
    .locals 1

    invoke-interface {p0}, LrT2;->c()LJ94;

    move-result-object p0

    sget-object v0, LJ94;->b:LJ94;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static e(Ljava/lang/Class;LrT2;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "LrT2;",
            ")",
            "Lcom/google/crypto/tink/shaded/protobuf/M<",
            "TT;>;"
        }
    .end annotation

    const-class v0, Lcom/google/crypto/tink/shaded/protobuf/t;

    invoke-virtual {v0, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, LRJ2;->d(LrT2;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lc83;->b()LZ73;

    move-result-object v3

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/z;->b()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object v4

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/N;->M()Lcom/google/crypto/tink/shaded/protobuf/P;

    move-result-object v5

    invoke-static {}, LIi1;->b()Lcom/google/crypto/tink/shaded/protobuf/n;

    move-result-object v6

    invoke-static {}, LsK2;->b()Lcom/google/crypto/tink/shaded/protobuf/D;

    move-result-object v7

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Lcom/google/crypto/tink/shaded/protobuf/H;->Q(Ljava/lang/Class;LrT2;LZ73;Lcom/google/crypto/tink/shaded/protobuf/z;Lcom/google/crypto/tink/shaded/protobuf/P;Lcom/google/crypto/tink/shaded/protobuf/n;Lcom/google/crypto/tink/shaded/protobuf/D;)Lcom/google/crypto/tink/shaded/protobuf/H;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-static {}, Lc83;->b()LZ73;

    move-result-object v2

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/z;->b()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object v3

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/N;->M()Lcom/google/crypto/tink/shaded/protobuf/P;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {}, LsK2;->b()Lcom/google/crypto/tink/shaded/protobuf/D;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v6}, Lcom/google/crypto/tink/shaded/protobuf/H;->Q(Ljava/lang/Class;LrT2;LZ73;Lcom/google/crypto/tink/shaded/protobuf/z;Lcom/google/crypto/tink/shaded/protobuf/P;Lcom/google/crypto/tink/shaded/protobuf/n;Lcom/google/crypto/tink/shaded/protobuf/D;)Lcom/google/crypto/tink/shaded/protobuf/H;

    move-result-object p0

    :goto_0
    return-object p0

    :cond_1
    invoke-static {p1}, LRJ2;->d(LrT2;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lc83;->a()LZ73;

    move-result-object v3

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object v4

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/N;->H()Lcom/google/crypto/tink/shaded/protobuf/P;

    move-result-object v5

    invoke-static {}, LIi1;->a()Lcom/google/crypto/tink/shaded/protobuf/n;

    move-result-object v6

    invoke-static {}, LsK2;->a()Lcom/google/crypto/tink/shaded/protobuf/D;

    move-result-object v7

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Lcom/google/crypto/tink/shaded/protobuf/H;->Q(Ljava/lang/Class;LrT2;LZ73;Lcom/google/crypto/tink/shaded/protobuf/z;Lcom/google/crypto/tink/shaded/protobuf/P;Lcom/google/crypto/tink/shaded/protobuf/n;Lcom/google/crypto/tink/shaded/protobuf/D;)Lcom/google/crypto/tink/shaded/protobuf/H;

    move-result-object p0

    goto :goto_1

    :cond_2
    invoke-static {}, Lc83;->a()LZ73;

    move-result-object v2

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/z;->a()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object v3

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/N;->I()Lcom/google/crypto/tink/shaded/protobuf/P;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {}, LsK2;->a()Lcom/google/crypto/tink/shaded/protobuf/D;

    move-result-object v6

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v6}, Lcom/google/crypto/tink/shaded/protobuf/H;->Q(Ljava/lang/Class;LrT2;LZ73;Lcom/google/crypto/tink/shaded/protobuf/z;Lcom/google/crypto/tink/shaded/protobuf/P;Lcom/google/crypto/tink/shaded/protobuf/n;Lcom/google/crypto/tink/shaded/protobuf/D;)Lcom/google/crypto/tink/shaded/protobuf/H;

    move-result-object p0

    :goto_1
    return-object p0
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lcom/google/crypto/tink/shaded/protobuf/M;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/google/crypto/tink/shaded/protobuf/M<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/N;->J(Ljava/lang/Class;)V

    iget-object v0, p0, LRJ2;->a:LtT2;

    invoke-interface {v0, p1}, LtT2;->a(Ljava/lang/Class;)LrT2;

    move-result-object v0

    invoke-interface {v0}, LrT2;->a()Z

    move-result v1

    if-eqz v1, :cond_1

    const-class v1, Lcom/google/crypto/tink/shaded/protobuf/t;

    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/N;->M()Lcom/google/crypto/tink/shaded/protobuf/P;

    move-result-object p1

    invoke-static {}, LIi1;->b()Lcom/google/crypto/tink/shaded/protobuf/n;

    move-result-object v1

    invoke-interface {v0}, LrT2;->b()Lcom/google/crypto/tink/shaded/protobuf/F;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/I;->m(Lcom/google/crypto/tink/shaded/protobuf/P;Lcom/google/crypto/tink/shaded/protobuf/n;Lcom/google/crypto/tink/shaded/protobuf/F;)Lcom/google/crypto/tink/shaded/protobuf/I;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/N;->H()Lcom/google/crypto/tink/shaded/protobuf/P;

    move-result-object p1

    invoke-static {}, LIi1;->a()Lcom/google/crypto/tink/shaded/protobuf/n;

    move-result-object v1

    invoke-interface {v0}, LrT2;->b()Lcom/google/crypto/tink/shaded/protobuf/F;

    move-result-object v0

    invoke-static {p1, v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/I;->m(Lcom/google/crypto/tink/shaded/protobuf/P;Lcom/google/crypto/tink/shaded/protobuf/n;Lcom/google/crypto/tink/shaded/protobuf/F;)Lcom/google/crypto/tink/shaded/protobuf/I;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {p1, v0}, LRJ2;->e(Ljava/lang/Class;LrT2;)Lcom/google/crypto/tink/shaded/protobuf/M;

    move-result-object p1

    return-object p1
.end method

.class public final LV96;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LU96;


# instance fields
.field public final a:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "LPc1;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LT96;

.field public final c:LZ96;


# direct methods
.method public constructor <init>(Ljava/util/Set;LT96;LZ96;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "LPc1;",
            ">;",
            "LT96;",
            "LZ96;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LV96;->a:Ljava/util/Set;

    iput-object p2, p0, LV96;->b:LT96;

    iput-object p3, p0, LV96;->c:LZ96;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/Class;LPc1;LC96;)LR96;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;",
            "LPc1;",
            "LC96<",
            "TT;[B>;)",
            "LR96<",
            "TT;>;"
        }
    .end annotation

    iget-object p2, p0, LV96;->a:Ljava/util/Set;

    invoke-interface {p2, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, LX96;

    iget-object v1, p0, LV96;->b:LT96;

    iget-object v5, p0, LV96;->c:LZ96;

    move-object v0, p2

    move-object v2, p1

    move-object v3, p3

    move-object v4, p4

    invoke-direct/range {v0 .. v5}, LX96;-><init>(LT96;Ljava/lang/String;LPc1;LC96;LZ96;)V

    return-object p2

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const/4 p2, 0x2

    new-array p2, p2, [Ljava/lang/Object;

    const/4 p4, 0x0

    aput-object p3, p2, p4

    const/4 p3, 0x1

    iget-object p4, p0, LV96;->a:Ljava/util/Set;

    aput-object p4, p2, p3

    const-string p3, "%s is not supported byt this factory. Supported encodings are: %s."

    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(Ljava/lang/String;Ljava/lang/Class;LC96;)LR96;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;",
            "LC96<",
            "TT;[B>;)",
            "LR96<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "proto"

    invoke-static {v0}, LPc1;->b(Ljava/lang/String;)LPc1;

    move-result-object v0

    invoke-virtual {p0, p1, p2, v0, p3}, LV96;->a(Ljava/lang/String;Ljava/lang/Class;LPc1;LC96;)LR96;

    move-result-object p1

    return-object p1
.end method

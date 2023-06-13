.class public abstract LPF;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/util/List;)LPF;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lqx2;",
            ">;)",
            "LPF;"
        }
    .end annotation

    new-instance v0, Lkt;

    invoke-direct {v0, p0}, Lkt;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static b()LHS0;
    .locals 2

    new-instance v0, Lqi2;

    invoke-direct {v0}, Lqi2;-><init>()V

    sget-object v1, LFq;->a:LFx0;

    invoke-virtual {v0, v1}, Lqi2;->j(LFx0;)Lqi2;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lqi2;->k(Z)Lqi2;

    move-result-object v0

    invoke-virtual {v0}, Lqi2;->i()LHS0;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public abstract c()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lqx2;",
            ">;"
        }
    .end annotation
.end method

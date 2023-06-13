.class public final Ldr8;
.super LDq8;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LDq8<",
        "LPq8;",
        "LPq8;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LDq8;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LPb8;

    iget-object p1, p1, LPb8;->zzc:LPq8;

    return-object p1
.end method

.method public final bridge synthetic b(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, LPq8;->a()LPq8;

    move-result-object v0

    check-cast p2, LPq8;

    invoke-virtual {p2, v0}, LPq8;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    check-cast p1, LPq8;

    invoke-static {p1, p2}, LPq8;->b(LPq8;LPq8;)LPq8;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic c()Ljava/lang/Object;
    .locals 1

    invoke-static {}, LPq8;->c()LPq8;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic d(Ljava/lang/Object;IJ)V
    .locals 0

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    check-cast p1, LPq8;

    shl-int/lit8 p2, p2, 0x3

    invoke-virtual {p1, p2, p3}, LPq8;->f(ILjava/lang/Object;)V

    return-void
.end method

.method public final e(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LPb8;

    iget-object p1, p1, LPb8;->zzc:LPq8;

    invoke-virtual {p1}, LPq8;->d()V

    return-void
.end method

.method public final bridge synthetic f(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, LPq8;

    check-cast p1, LPb8;

    iput-object p2, p1, LPb8;->zzc:LPq8;

    return-void
.end method

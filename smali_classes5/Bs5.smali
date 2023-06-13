.class public abstract LBs5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LBs5$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()LBs5$a;
    .locals 1

    new-instance v0, Leu$b;

    invoke-direct {v0}, Leu$b;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract b()LPc1;
.end method

.method public abstract c()Lyg1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lyg1<",
            "*>;"
        }
    .end annotation
.end method

.method public d()[B
    .locals 2

    invoke-virtual {p0}, LBs5;->e()LC96;

    move-result-object v0

    invoke-virtual {p0}, LBs5;->c()Lyg1;

    move-result-object v1

    invoke-virtual {v1}, Lyg1;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, LC96;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [B

    return-object v0
.end method

.method public abstract e()LC96;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LC96<",
            "*[B>;"
        }
    .end annotation
.end method

.method public abstract f()LT96;
.end method

.method public abstract g()Ljava/lang/String;
.end method

.class public final LIr9;
.super Lbm9;
.source "SourceFile"

# interfaces
.implements LPp9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lbm9<",
        "LKr9;",
        "LIr9;",
        ">;",
        "LPp9;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LKr9;->A()LKr9;

    move-result-object v0

    invoke-direct {p0, v0}, Lbm9;-><init>(LEm9;)V

    return-void
.end method

.method public synthetic constructor <init>(LGr9;)V
    .locals 0

    invoke-static {}, LKr9;->A()LKr9;

    move-result-object p1

    invoke-direct {p0, p1}, Lbm9;-><init>(LEm9;)V

    return-void
.end method


# virtual methods
.method public final A(J)LIr9;
    .locals 1

    iget-boolean v0, p0, Lbm9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lbm9;->w()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbm9;->d:Z

    :cond_0
    iget-object v0, p0, Lbm9;->c:LEm9;

    check-cast v0, LKr9;

    invoke-static {v0, p1, p2}, LKr9;->C(LKr9;J)V

    return-object p0
.end method

.method public final y(I)LIr9;
    .locals 1

    iget-boolean v0, p0, Lbm9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lbm9;->w()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbm9;->d:Z

    :cond_0
    iget-object v0, p0, Lbm9;->c:LEm9;

    check-cast v0, LKr9;

    invoke-static {v0, p1}, LKr9;->D(LKr9;I)V

    return-object p0
.end method

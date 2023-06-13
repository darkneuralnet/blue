.class public final Lb28;
.super Lbm9;
.source "SourceFile"

# interfaces
.implements LPp9;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lbm9<",
        "Lq28;",
        "Lb28;",
        ">;",
        "LPp9;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lq28;->x()Lq28;

    move-result-object v0

    invoke-direct {p0, v0}, Lbm9;-><init>(LEm9;)V

    return-void
.end method

.method public synthetic constructor <init>(Lu08;)V
    .locals 0

    invoke-static {}, Lq28;->x()Lq28;

    move-result-object p1

    invoke-direct {p0, p1}, Lbm9;-><init>(LEm9;)V

    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/Iterable;)Lb28;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "LAu9;",
            ">;)",
            "Lb28;"
        }
    .end annotation

    iget-boolean v0, p0, Lbm9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lbm9;->w()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbm9;->d:Z

    :cond_0
    iget-object v0, p0, Lbm9;->c:LEm9;

    check-cast v0, Lq28;

    invoke-static {v0, p1}, Lq28;->G(Lq28;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public final B(LKr9;)Lb28;
    .locals 1

    iget-boolean v0, p0, Lbm9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lbm9;->w()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbm9;->d:Z

    :cond_0
    iget-object v0, p0, Lbm9;->c:LEm9;

    check-cast v0, Lq28;

    invoke-static {v0, p1}, Lq28;->J(Lq28;LKr9;)V

    return-object p0
.end method

.method public final C(Ljava/lang/String;)Lb28;
    .locals 1

    iget-boolean v0, p0, Lbm9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lbm9;->w()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbm9;->d:Z

    :cond_0
    iget-object v0, p0, Lbm9;->c:LEm9;

    check-cast v0, Lq28;

    invoke-static {v0, p1}, Lq28;->I(Lq28;Ljava/lang/String;)V

    return-object p0
.end method

.method public final D(Lsu9;)Lb28;
    .locals 1

    iget-boolean v0, p0, Lbm9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lbm9;->w()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbm9;->d:Z

    :cond_0
    iget-object v0, p0, Lbm9;->c:LEm9;

    check-cast v0, Lq28;

    invoke-static {v0, p1}, Lq28;->H(Lq28;Lsu9;)V

    return-object p0
.end method

.method public final y(Ljava/lang/Iterable;)Lb28;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "Ljava/lang/String;",
            ">;)",
            "Lb28;"
        }
    .end annotation

    iget-boolean v0, p0, Lbm9;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lbm9;->w()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lbm9;->d:Z

    :cond_0
    iget-object v0, p0, Lbm9;->c:LEm9;

    check-cast v0, Lq28;

    invoke-static {v0, p1}, Lq28;->F(Lq28;Ljava/lang/Iterable;)V

    return-object p0
.end method

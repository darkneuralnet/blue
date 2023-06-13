.class public final Lbj8;
.super LUS8;
.source "SourceFile"

# interfaces
.implements LA19;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lpj8;->D()Lpj8;

    move-result-object v0

    invoke-direct {p0, v0}, LUS8;-><init>(LpU8;)V

    return-void
.end method

.method public synthetic constructor <init>(LXh8;)V
    .locals 0

    invoke-static {}, Lpj8;->D()Lpj8;

    move-result-object p1

    invoke-direct {p0, p1}, LUS8;-><init>(LpU8;)V

    return-void
.end method


# virtual methods
.method public final A(Z)Lbj8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, Lpj8;

    invoke-static {v0, p1}, Lpj8;->J(Lpj8;Z)V

    return-object p0
.end method

.method public final B(LNo8;)Lbj8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, Lpj8;

    invoke-static {v0, p1}, Lpj8;->I(Lpj8;LNo8;)V

    return-object p0
.end method

.method public final y(I)Lbj8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, Lpj8;

    invoke-static {v0, p1}, Lpj8;->G(Lpj8;I)V

    return-object p0
.end method

.method public final z(LBo8;)Lbj8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, Lpj8;

    invoke-virtual {p1}, LUS8;->q()LpU8;

    move-result-object p1

    check-cast p1, LNo8;

    invoke-static {v0, p1}, Lpj8;->H(Lpj8;LNo8;)V

    return-object p0
.end method

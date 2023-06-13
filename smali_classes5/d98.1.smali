.class public final Ld98;
.super LUS8;
.source "SourceFile"

# interfaces
.implements LA19;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lt98;->E()Lt98;

    move-result-object v0

    invoke-direct {p0, v0}, LUS8;-><init>(LpU8;)V

    return-void
.end method

.method public synthetic constructor <init>(LO88;)V
    .locals 0

    invoke-static {}, Lt98;->E()Lt98;

    move-result-object p1

    invoke-direct {p0, p1}, LUS8;-><init>(LpU8;)V

    return-void
.end method


# virtual methods
.method public final A(ILI98;)Ld98;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, Lt98;

    invoke-virtual {p2}, LUS8;->q()LpU8;

    move-result-object p2

    check-cast p2, LY98;

    invoke-static {v0, p1, p2}, Lt98;->K(Lt98;ILY98;)V

    return-object p0
.end method

.method public final B(ILgc8;)Ld98;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, Lt98;

    invoke-virtual {p2}, LUS8;->q()LpU8;

    move-result-object p2

    check-cast p2, Lvc8;

    invoke-static {v0, p1, p2}, Lt98;->J(Lt98;ILvc8;)V

    return-object p0
.end method

.method public final C(I)LY98;
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, Lt98;

    invoke-virtual {v0, p1}, Lt98;->F(I)LY98;

    move-result-object p1

    return-object p1
.end method

.method public final D(I)Lvc8;
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, Lt98;

    invoke-virtual {v0, p1}, Lt98;->G(I)Lvc8;

    move-result-object p1

    return-object p1
.end method

.method public final y()I
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, Lt98;

    invoke-virtual {v0}, Lt98;->C()I

    move-result v0

    return v0
.end method

.method public final z()I
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, Lt98;

    invoke-virtual {v0}, Lt98;->D()I

    move-result v0

    return v0
.end method

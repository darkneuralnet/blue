.class public final Ldk8;
.super LUS8;
.source "SourceFile"

# interfaces
.implements LA19;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lpk8;->G()Lpk8;

    move-result-object v0

    invoke-direct {p0, v0}, LUS8;-><init>(LpU8;)V

    return-void
.end method

.method public synthetic constructor <init>(LXh8;)V
    .locals 0

    invoke-static {}, Lpk8;->G()Lpk8;

    move-result-object p1

    invoke-direct {p0, p1}, LUS8;-><init>(LpU8;)V

    return-void
.end method


# virtual methods
.method public final A()J
    .locals 2

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, Lpk8;

    invoke-virtual {v0}, Lpk8;->E()J

    move-result-wide v0

    return-wide v0
.end method

.method public final B(Ljava/lang/Iterable;)Ldk8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, Lpk8;

    invoke-static {v0, p1}, Lpk8;->N(Lpk8;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public final C(Ldl8;)Ldk8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, Lpk8;

    invoke-virtual {p1}, LUS8;->q()LpU8;

    move-result-object p1

    check-cast p1, Lpl8;

    invoke-static {v0, p1}, Lpk8;->M(Lpk8;Lpl8;)V

    return-object p0
.end method

.method public final D(Lpl8;)Ldk8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, Lpk8;

    invoke-static {v0, p1}, Lpk8;->M(Lpk8;Lpl8;)V

    return-object p0
.end method

.method public final G()Ldk8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, Lpk8;

    invoke-static {v0}, Lpk8;->O(Lpk8;)V

    return-object p0
.end method

.method public final H(I)Ldk8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, Lpk8;

    invoke-static {v0, p1}, Lpk8;->P(Lpk8;I)V

    return-object p0
.end method

.method public final I(Ljava/lang/String;)Ldk8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, Lpk8;

    invoke-static {v0, p1}, Lpk8;->Q(Lpk8;Ljava/lang/String;)V

    return-object p0
.end method

.method public final J(ILdl8;)Ldk8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, Lpk8;

    invoke-virtual {p2}, LUS8;->q()LpU8;

    move-result-object p2

    check-cast p2, Lpl8;

    invoke-static {v0, p1, p2}, Lpk8;->K(Lpk8;ILpl8;)V

    return-object p0
.end method

.method public final M(ILpl8;)Ldk8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, Lpk8;

    invoke-static {v0, p1, p2}, Lpk8;->K(Lpk8;ILpl8;)V

    return-object p0
.end method

.method public final N(J)Ldk8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, Lpk8;

    invoke-static {v0, p1, p2}, Lpk8;->S(Lpk8;J)V

    return-object p0
.end method

.method public final O(J)Ldk8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, Lpk8;

    invoke-static {v0, p1, p2}, Lpk8;->R(Lpk8;J)V

    return-object p0
.end method

.method public final P(I)Lpl8;
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, Lpk8;

    invoke-virtual {v0, p1}, Lpk8;->H(I)Lpl8;

    move-result-object p1

    return-object p1
.end method

.method public final Q()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, Lpk8;

    invoke-virtual {v0}, Lpk8;->I()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final S()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, Lpk8;

    invoke-virtual {v0}, Lpk8;->J()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final U()Z
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, Lpk8;

    invoke-virtual {v0}, Lpk8;->V()Z

    move-result v0

    return v0
.end method

.method public final y()I
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, Lpk8;

    invoke-virtual {v0}, Lpk8;->C()I

    move-result v0

    return v0
.end method

.method public final z()J
    .locals 2

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, Lpk8;

    invoke-virtual {v0}, Lpk8;->D()J

    move-result-wide v0

    return-wide v0
.end method

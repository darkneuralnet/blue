.class public final Lqn8;
.super LUS8;
.source "SourceFile"

# interfaces
.implements LA19;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LCn8;->T1()LCn8;

    move-result-object v0

    invoke-direct {p0, v0}, LUS8;-><init>(LpU8;)V

    return-void
.end method

.method public synthetic constructor <init>(LXh8;)V
    .locals 0

    invoke-static {}, LCn8;->T1()LCn8;

    move-result-object p1

    invoke-direct {p0, p1}, LUS8;-><init>(LpU8;)V

    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/String;)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1}, LCn8;->V(LCn8;Ljava/lang/String;)V

    return-object p0
.end method

.method public final A0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-virtual {v0}, LCn8;->J()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final B(Ljava/lang/String;)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1}, LCn8;->e0(LCn8;Ljava/lang/String;)V

    return-object p0
.end method

.method public final B0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-virtual {v0}, LCn8;->Q()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final C(Ljava/lang/String;)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1}, LCn8;->m0(LCn8;Ljava/lang/String;)V

    return-object p0
.end method

.method public final C0()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-virtual {v0}, LCn8;->R()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final D(Ljava/lang/String;)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1}, LCn8;->d0(LCn8;Ljava/lang/String;)V

    return-object p0
.end method

.method public final F0()I
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-virtual {v0}, LCn8;->E1()I

    move-result v0

    return v0
.end method

.method public final G(Ljava/lang/String;)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1}, LCn8;->f0(LCn8;Ljava/lang/String;)V

    return-object p0
.end method

.method public final G0()J
    .locals 2

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-virtual {v0}, LCn8;->I1()J

    move-result-wide v0

    return-wide v0
.end method

.method public final H(I)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1}, LCn8;->x0(LCn8;I)V

    return-object p0
.end method

.method public final H0()J
    .locals 2

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-virtual {v0}, LCn8;->M1()J

    move-result-wide v0

    return-wide v0
.end method

.method public final I(I)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1}, LCn8;->p0(LCn8;I)V

    return-object p0
.end method

.method public final I0(I)Lpk8;
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-virtual {v0, p1}, LCn8;->Q1(I)Lpk8;

    move-result-object p1

    return-object p1
.end method

.method public final J(J)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1, p2}, LCn8;->a0(LCn8;J)V

    return-object p0
.end method

.method public final J0(Ljava/lang/Iterable;)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1}, LCn8;->u0(LCn8;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public final K0(Ljava/lang/Iterable;)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1}, LCn8;->D0(LCn8;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public final L0(Ljava/lang/Iterable;)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1}, LCn8;->X(LCn8;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public final M(J)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1, p2}, LCn8;->A0(LCn8;J)V

    return-object p0
.end method

.method public final M0(Ljava/lang/Iterable;)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1}, LCn8;->G0(LCn8;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public final N(Ljava/lang/String;)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1}, LCn8;->b0(LCn8;Ljava/lang/String;)V

    return-object p0
.end method

.method public final O(J)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1, p2}, LCn8;->o0(LCn8;J)V

    return-object p0
.end method

.method public final O0(Ljava/lang/Iterable;)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1}, LCn8;->N0(LCn8;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public final P(Ljava/lang/String;)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1}, LCn8;->Z0(LCn8;Ljava/lang/String;)V

    return-object p0
.end method

.method public final P0(Ldk8;)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-virtual {p1}, LUS8;->q()LpU8;

    move-result-object p1

    check-cast p1, Lpk8;

    invoke-static {v0, p1}, LCn8;->Y(LCn8;Lpk8;)V

    return-object p0
.end method

.method public final Q(Ljava/lang/String;)Lqn8;
    .locals 0

    invoke-virtual {p0}, LUS8;->t()V

    iget-object p1, p0, LUS8;->c:LpU8;

    check-cast p1, LCn8;

    sget p1, LCn8;->zza:I

    const/4 p1, 0x0

    throw p1
.end method

.method public final Q0(Lyp8;)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-virtual {p1}, LUS8;->q()LpU8;

    move-result-object p1

    check-cast p1, LKp8;

    invoke-static {v0, p1}, LCn8;->M0(LCn8;LKp8;)V

    return-object p0
.end method

.method public final R0(LKp8;)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1}, LCn8;->M0(LCn8;LKp8;)V

    return-object p0
.end method

.method public final S(J)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1, p2}, LCn8;->Z(LCn8;J)V

    return-object p0
.end method

.method public final S0()Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0}, LCn8;->n0(LCn8;)V

    return-object p0
.end method

.method public final T0()Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0}, LCn8;->v0(LCn8;)V

    return-object p0
.end method

.method public final U(J)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1, p2}, LCn8;->R0(LCn8;J)V

    return-object p0
.end method

.method public final U0()Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0}, LCn8;->a1(LCn8;)V

    return-object p0
.end method

.method public final V(Ljava/lang/String;)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1}, LCn8;->I0(LCn8;Ljava/lang/String;)V

    return-object p0
.end method

.method public final V0()Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0}, LCn8;->S(LCn8;)V

    return-object p0
.end method

.method public final W(ILdk8;)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-virtual {p2}, LUS8;->q()LpU8;

    move-result-object p2

    check-cast p2, Lpk8;

    invoke-static {v0, p1, p2}, LCn8;->U(LCn8;ILpk8;)V

    return-object p0
.end method

.method public final X(Ljava/lang/String;)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1}, LCn8;->w0(LCn8;Ljava/lang/String;)V

    return-object p0
.end method

.method public final X0()Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0}, LCn8;->H0(LCn8;)V

    return-object p0
.end method

.method public final Y(Ljava/lang/String;)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1}, LCn8;->s0(LCn8;Ljava/lang/String;)V

    return-object p0
.end method

.method public final Z(J)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1, p2}, LCn8;->g0(LCn8;J)V

    return-object p0
.end method

.method public final Z0()Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0}, LCn8;->r0(LCn8;)V

    return-object p0
.end method

.method public final a0(Ljava/lang/String;)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1}, LCn8;->q0(LCn8;Ljava/lang/String;)V

    return-object p0
.end method

.method public final a1()Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0}, LCn8;->l0(LCn8;)V

    return-object p0
.end method

.method public final b0(Z)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1}, LCn8;->k0(LCn8;Z)V

    return-object p0
.end method

.method public final b1()Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0}, LCn8;->Y0(LCn8;)V

    return-object p0
.end method

.method public final c0(Ljava/lang/String;)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1}, LCn8;->X0(LCn8;Ljava/lang/String;)V

    return-object p0
.end method

.method public final c1()Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0}, LCn8;->V0(LCn8;)V

    return-object p0
.end method

.method public final d0(Ljava/lang/String;)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object p1, p0, LUS8;->c:LpU8;

    check-cast p1, LCn8;

    const-string v0, "android"

    invoke-static {p1, v0}, LCn8;->W0(LCn8;Ljava/lang/String;)V

    return-object p0
.end method

.method public final d1()Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0}, LCn8;->T0(LCn8;)V

    return-object p0
.end method

.method public final e0()I
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-virtual {v0}, LCn8;->A1()I

    move-result v0

    return v0
.end method

.method public final e1()Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0}, LCn8;->j0(LCn8;)V

    return-object p0
.end method

.method public final f0(LQn8;)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-virtual {p1}, LUS8;->q()LpU8;

    move-result-object p1

    check-cast p1, Lpo8;

    invoke-static {v0, p1}, LCn8;->W(LCn8;Lpo8;)V

    return-object p0
.end method

.method public final f1()Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0}, LCn8;->F0(LCn8;)V

    return-object p0
.end method

.method public final g0(J)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1, p2}, LCn8;->U0(LCn8;J)V

    return-object p0
.end method

.method public final g1()Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0}, LCn8;->z0(LCn8;)V

    return-object p0
.end method

.method public final h0(J)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1, p2}, LCn8;->S0(LCn8;J)V

    return-object p0
.end method

.method public final i0(I)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object p1, p0, LUS8;->c:LpU8;

    check-cast p1, LCn8;

    const/4 v0, 0x1

    invoke-static {p1, v0}, LCn8;->y0(LCn8;I)V

    return-object p0
.end method

.method public final k0(Ljava/lang/String;)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1}, LCn8;->i0(LCn8;Ljava/lang/String;)V

    return-object p0
.end method

.method public final l0(I)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1}, LCn8;->T(LCn8;I)V

    return-object p0
.end method

.method public final n0(Z)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1}, LCn8;->t0(LCn8;Z)V

    return-object p0
.end method

.method public final o0(Ljava/lang/String;)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1}, LCn8;->E0(LCn8;Ljava/lang/String;)V

    return-object p0
.end method

.method public final q0(J)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1, p2}, LCn8;->Q0(LCn8;J)V

    return-object p0
.end method

.method public final r0(J)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1, p2}, LCn8;->J0(LCn8;J)V

    return-object p0
.end method

.method public final s0(I)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1}, LCn8;->c1(LCn8;I)V

    return-object p0
.end method

.method public final t0(J)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1, p2}, LCn8;->P0(LCn8;J)V

    return-object p0
.end method

.method public final u0(J)Lqn8;
    .locals 2

    invoke-virtual {p0}, LUS8;->t()V

    iget-object p1, p0, LUS8;->c:LpU8;

    check-cast p1, LCn8;

    const-wide/32 v0, 0x12cc8

    invoke-static {p1, v0, v1}, LCn8;->h0(LCn8;J)V

    return-object p0
.end method

.method public final v0(ILKp8;)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1, p2}, LCn8;->L0(LCn8;ILKp8;)V

    return-object p0
.end method

.method public final w0(Ljava/lang/String;)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1}, LCn8;->b1(LCn8;Ljava/lang/String;)V

    return-object p0
.end method

.method public final x0(I)LKp8;
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-virtual {v0, p1}, LCn8;->U1(I)LKp8;

    move-result-object p1

    return-object p1
.end method

.method public final y(I)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1}, LCn8;->K0(LCn8;I)V

    return-object p0
.end method

.method public final y0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-virtual {v0}, LCn8;->W1()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final z(I)Lqn8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-static {v0, p1}, LCn8;->O0(LCn8;I)V

    return-object p0
.end method

.method public final z0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCn8;

    invoke-virtual {v0}, LCn8;->H()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

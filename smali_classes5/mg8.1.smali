.class public final Lmg8;
.super LUS8;
.source "SourceFile"

# interfaces
.implements LA19;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LCg8;->G()LCg8;

    move-result-object v0

    invoke-direct {p0, v0}, LUS8;-><init>(LpU8;)V

    return-void
.end method

.method public synthetic constructor <init>(LWd8;)V
    .locals 0

    invoke-static {}, LCg8;->G()LCg8;

    move-result-object p1

    invoke-direct {p0, p1}, LUS8;-><init>(LpU8;)V

    return-void
.end method


# virtual methods
.method public final A()Lmg8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCg8;

    invoke-static {v0}, LCg8;->S(LCg8;)V

    return-object p0
.end method

.method public final B(ILHf8;)Lmg8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCg8;

    invoke-virtual {p2}, LUS8;->q()LpU8;

    move-result-object p2

    check-cast p2, LXf8;

    invoke-static {v0, p1, p2}, LCg8;->R(LCg8;ILXf8;)V

    return-object p0
.end method

.method public final C()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCg8;

    invoke-virtual {v0}, LCg8;->M()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final D()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCg8;

    invoke-virtual {v0}, LCg8;->N()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final G()Ljava/util/List;
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCg8;

    invoke-virtual {v0}, LCg8;->O()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final y()I
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCg8;

    invoke-virtual {v0}, LCg8;->C()I

    move-result v0

    return v0
.end method

.method public final z(I)LXf8;
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LCg8;

    invoke-virtual {v0, p1}, LCg8;->E(I)LXf8;

    move-result-object p1

    return-object p1
.end method

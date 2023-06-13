.class public final LI98;
.super LUS8;
.source "SourceFile"

# interfaces
.implements LA19;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LY98;->E()LY98;

    move-result-object v0

    invoke-direct {p0, v0}, LUS8;-><init>(LpU8;)V

    return-void
.end method

.method public synthetic constructor <init>(LO88;)V
    .locals 0

    invoke-static {}, LY98;->E()LY98;

    move-result-object p1

    invoke-direct {p0, p1}, LUS8;-><init>(LpU8;)V

    return-void
.end method


# virtual methods
.method public final A(ILDa8;)LI98;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LY98;

    invoke-static {v0, p1, p2}, LY98;->K(LY98;ILDa8;)V

    return-object p0
.end method

.method public final B(I)LDa8;
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LY98;

    invoke-virtual {v0, p1}, LY98;->F(I)LDa8;

    move-result-object p1

    return-object p1
.end method

.method public final C()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LY98;

    invoke-virtual {v0}, LY98;->H()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final y()I
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LY98;

    invoke-virtual {v0}, LY98;->B()I

    move-result v0

    return v0
.end method

.method public final z(Ljava/lang/String;)LI98;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LY98;

    invoke-static {v0, p1}, LY98;->J(LY98;Ljava/lang/String;)V

    return-object p0
.end method

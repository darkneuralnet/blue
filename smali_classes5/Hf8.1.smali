.class public final LHf8;
.super LUS8;
.source "SourceFile"

# interfaces
.implements LA19;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LXf8;->C()LXf8;

    move-result-object v0

    invoke-direct {p0, v0}, LUS8;-><init>(LpU8;)V

    return-void
.end method

.method public synthetic constructor <init>(LWd8;)V
    .locals 0

    invoke-static {}, LXf8;->C()LXf8;

    move-result-object p1

    invoke-direct {p0, p1}, LUS8;-><init>(LpU8;)V

    return-void
.end method


# virtual methods
.method public final A()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LXf8;

    invoke-virtual {v0}, LXf8;->D()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final B()Z
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LXf8;

    invoke-virtual {v0}, LXf8;->F()Z

    move-result v0

    return v0
.end method

.method public final C()Z
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LXf8;

    invoke-virtual {v0}, LXf8;->G()Z

    move-result v0

    return v0
.end method

.method public final D()Z
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LXf8;

    invoke-virtual {v0}, LXf8;->H()Z

    move-result v0

    return v0
.end method

.method public final G()Z
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LXf8;

    invoke-virtual {v0}, LXf8;->I()Z

    move-result v0

    return v0
.end method

.method public final H()Z
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LXf8;

    invoke-virtual {v0}, LXf8;->J()Z

    move-result v0

    return v0
.end method

.method public final y()I
    .locals 1

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LXf8;

    invoke-virtual {v0}, LXf8;->B()I

    move-result v0

    return v0
.end method

.method public final z(Ljava/lang/String;)LHf8;
    .locals 1

    invoke-virtual {p0}, LUS8;->t()V

    iget-object v0, p0, LUS8;->c:LpU8;

    check-cast v0, LXf8;

    invoke-static {v0, p1}, LXf8;->E(LXf8;Ljava/lang/String;)V

    return-object p0
.end method

.class public final LQJ7;
.super LZt7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LRJ7;->F()LRJ7;

    move-result-object v0

    invoke-direct {p0, v0}, LZt7;-><init>(Leu7;)V

    return-void
.end method

.method public synthetic constructor <init>(LPJ7;)V
    .locals 0

    invoke-static {}, LRJ7;->F()LRJ7;

    move-result-object p1

    invoke-direct {p0, p1}, LZt7;-><init>(Leu7;)V

    return-void
.end method


# virtual methods
.method public final p(LOJ7;)LQJ7;
    .locals 1

    iget-boolean v0, p0, LZt7;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LZt7;->d:Z

    :cond_0
    iget-object v0, p0, LZt7;->c:Leu7;

    check-cast v0, LRJ7;

    invoke-static {v0, p1}, LRJ7;->J(LRJ7;LOJ7;)V

    return-object p0
.end method

.method public final q(LUJ7;)LQJ7;
    .locals 1

    iget-boolean v0, p0, LZt7;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LZt7;->d:Z

    :cond_0
    iget-object v0, p0, LZt7;->c:Leu7;

    check-cast v0, LRJ7;

    invoke-static {v0, p1}, LRJ7;->I(LRJ7;LUJ7;)V

    return-object p0
.end method

.method public final r(Ljava/lang/String;)LQJ7;
    .locals 1

    iget-boolean v0, p0, LZt7;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LZt7;->d:Z

    :cond_0
    iget-object v0, p0, LZt7;->c:Leu7;

    check-cast v0, LRJ7;

    invoke-static {v0, p1}, LRJ7;->K(LRJ7;Ljava/lang/String;)V

    return-object p0
.end method

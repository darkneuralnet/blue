.class public final LIm9;
.super Lau7;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LOm9;->F()LOm9;

    move-result-object v0

    invoke-direct {p0, v0}, Lau7;-><init>(Lbu7;)V

    return-void
.end method

.method public synthetic constructor <init>(LT39;)V
    .locals 0

    invoke-static {}, LOm9;->F()LOm9;

    move-result-object p1

    invoke-direct {p0, p1}, Lau7;-><init>(Lbu7;)V

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Iterable;)LIm9;
    .locals 1

    iget-boolean v0, p0, LZt7;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LZt7;->d:Z

    :cond_0
    iget-object v0, p0, LZt7;->c:Leu7;

    check-cast v0, LOm9;

    invoke-static {v0, p1}, LOm9;->I(LOm9;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public final r(LPu9;)LIm9;
    .locals 1

    iget-boolean v0, p0, LZt7;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LZt7;->d:Z

    :cond_0
    iget-object v0, p0, LZt7;->c:Leu7;

    check-cast v0, LOm9;

    invoke-virtual {p1}, LZt7;->l()Leu7;

    move-result-object p1

    check-cast p1, LRu9;

    invoke-static {v0, p1}, LOm9;->H(LOm9;LRu9;)V

    return-object p0
.end method

.method public final t(I)LIm9;
    .locals 1

    iget-boolean v0, p0, LZt7;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LZt7;->d:Z

    :cond_0
    iget-object v0, p0, LZt7;->c:Leu7;

    check-cast v0, LOm9;

    invoke-static {v0, p1}, LOm9;->J(LOm9;I)V

    return-object p0
.end method

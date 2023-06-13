.class public final LDF7;
.super Lau7;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LJF7;->F()LJF7;

    move-result-object v0

    invoke-direct {p0, v0}, Lau7;-><init>(Lbu7;)V

    return-void
.end method

.method public synthetic constructor <init>(LCF7;)V
    .locals 0

    invoke-static {}, LJF7;->F()LJF7;

    move-result-object p1

    invoke-direct {p0, p1}, Lau7;-><init>(Lbu7;)V

    return-void
.end method


# virtual methods
.method public final A(Ljava/lang/String;)LDF7;
    .locals 1

    iget-boolean p1, p0, LZt7;->d:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 p1, 0x0

    iput-boolean p1, p0, LZt7;->d:Z

    :cond_0
    iget-object p1, p0, LZt7;->c:Leu7;

    check-cast p1, LJF7;

    const-string v0, "MobileSSDTfLiteClient"

    invoke-static {p1, v0}, LJF7;->G(LJF7;Ljava/lang/String;)V

    return-object p0
.end method

.method public final q(Z)LDF7;
    .locals 1

    iget-boolean p1, p0, LZt7;->d:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 p1, 0x0

    iput-boolean p1, p0, LZt7;->d:Z

    :cond_0
    iget-object p1, p0, LZt7;->c:Leu7;

    check-cast p1, LJF7;

    const/4 v0, 0x1

    invoke-static {p1, v0}, LJF7;->H(LJF7;Z)V

    return-object p0
.end method

.method public final r(LNw7;)LDF7;
    .locals 1

    iget-boolean v0, p0, LZt7;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LZt7;->d:Z

    :cond_0
    iget-object v0, p0, LZt7;->c:Leu7;

    check-cast v0, LJF7;

    invoke-static {v0, p1}, LJF7;->J(LJF7;LNw7;)V

    return-object p0
.end method

.method public final t(LFF7;)LDF7;
    .locals 1

    iget-boolean v0, p0, LZt7;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, LZt7;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, LZt7;->d:Z

    :cond_0
    iget-object v0, p0, LZt7;->c:Leu7;

    check-cast v0, LJF7;

    invoke-static {v0, p1}, LJF7;->I(LJF7;LFF7;)V

    return-object p0
.end method

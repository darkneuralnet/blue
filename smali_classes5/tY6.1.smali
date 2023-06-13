.class public final LtY6;
.super Lab7;
.source "SourceFile"

# interfaces
.implements LUb7;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LzY6;->F()LzY6;

    move-result-object v0

    invoke-direct {p0, v0}, Lab7;-><init>(Lfb7;)V

    return-void
.end method

.method public synthetic constructor <init>(LrY6;)V
    .locals 0

    invoke-static {}, LzY6;->F()LzY6;

    move-result-object p1

    invoke-direct {p0, p1}, Lab7;-><init>(Lfb7;)V

    return-void
.end method


# virtual methods
.method public final A(Z)LtY6;
    .locals 1

    invoke-virtual {p0}, Lab7;->q()V

    iget-object p1, p0, Lab7;->c:Lfb7;

    check-cast p1, LzY6;

    const/4 v0, 0x1

    invoke-static {p1, v0}, LzY6;->I(LzY6;Z)V

    return-object p0
.end method

.method public final t(Ljava/lang/String;)LtY6;
    .locals 1

    invoke-virtual {p0}, Lab7;->q()V

    iget-object v0, p0, Lab7;->c:Lfb7;

    check-cast v0, LzY6;

    invoke-static {v0, p1}, LzY6;->H(LzY6;Ljava/lang/String;)V

    return-object p0
.end method

.method public final w(Z)LtY6;
    .locals 1

    invoke-virtual {p0}, Lab7;->q()V

    iget-object p1, p0, Lab7;->c:Lfb7;

    check-cast p1, LzY6;

    const/4 v0, 0x1

    invoke-static {p1, v0}, LzY6;->K(LzY6;Z)V

    return-object p0
.end method

.method public final y(Lq87;)LtY6;
    .locals 1

    invoke-virtual {p0}, Lab7;->q()V

    iget-object v0, p0, Lab7;->c:Lfb7;

    check-cast v0, LzY6;

    invoke-virtual {p1}, Lab7;->o()Lfb7;

    move-result-object p1

    check-cast p1, Lr87;

    invoke-static {v0, p1}, LzY6;->J(LzY6;Lr87;)V

    return-object p0
.end method

.method public final z(Ljava/lang/String;)LtY6;
    .locals 1

    invoke-virtual {p0}, Lab7;->q()V

    iget-object v0, p0, Lab7;->c:Lfb7;

    check-cast v0, LzY6;

    invoke-static {v0, p1}, LzY6;->G(LzY6;Ljava/lang/String;)V

    return-object p0
.end method

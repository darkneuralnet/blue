.class public final LQ07;
.super Lbb7;
.source "SourceFile"


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, LW07;->G()LW07;

    move-result-object v0

    invoke-direct {p0, v0}, Lbb7;-><init>(Lcb7;)V

    return-void
.end method

.method public synthetic constructor <init>(LO07;)V
    .locals 0

    invoke-static {}, LW07;->G()LW07;

    move-result-object p1

    invoke-direct {p0, p1}, Lbb7;-><init>(Lcb7;)V

    return-void
.end method


# virtual methods
.method public final w(LM47;)LQ07;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-virtual {p0}, Lab7;->q()V

    iget-object v0, p0, Lab7;->c:Lfb7;

    check-cast v0, LW07;

    invoke-virtual {p1}, Lab7;->o()Lfb7;

    move-result-object p1

    check-cast p1, LP47;

    invoke-static {v0, p1}, LW07;->I(LW07;LP47;)V

    return-object p0
.end method

.method public final y(LtY6;)LQ07;
    .locals 1

    invoke-virtual {p0}, Lab7;->q()V

    iget-object v0, p0, Lab7;->c:Lfb7;

    check-cast v0, LW07;

    invoke-virtual {p1}, Lab7;->o()Lfb7;

    move-result-object p1

    check-cast p1, LzY6;

    invoke-static {v0, p1}, LW07;->H(LW07;LzY6;)V

    return-object p0
.end method

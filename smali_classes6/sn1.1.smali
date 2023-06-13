.class public final Lsn1;
.super LmQ3;
.source "SourceFile"


# instance fields
.field public final a:LgB1;


# direct methods
.method public constructor <init>(LgB1;)V
    .locals 0

    invoke-direct {p0}, LmQ3;-><init>()V

    iput-object p1, p0, Lsn1;->a:LgB1;

    return-void
.end method


# virtual methods
.method public c()Z
    .locals 1

    iget-object v0, p0, Lsn1;->a:LgB1;

    invoke-virtual {v0}, LgB1;->h0()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lsn1;->a:LgB1;

    invoke-virtual {v0}, LgB1;->d0()I

    move-result v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Lsn1;->a:LgB1;

    invoke-virtual {v0}, LgB1;->c0()I

    move-result v0

    if-gtz v0, :cond_0

    iget-object v0, p0, Lsn1;->a:LgB1;

    invoke-virtual {v0}, LgB1;->g0()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lsn1;->a:LgB1;

    invoke-virtual {v0}, LgB1;->f0()LeB1;

    move-result-object v0

    invoke-virtual {v0}, LeB1;->Y()Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

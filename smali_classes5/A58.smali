.class public LA58;
.super Lk58;
.source "SourceFile"

# interfaces
.implements Lrj8;


# direct methods
.method public constructor <init>(LQ58;)V
    .locals 0

    invoke-direct {p0, p1}, Lk58;-><init>(LV78;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a()Ldj8;
    .locals 1

    invoke-virtual {p0}, LA58;->o()LQ58;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic k()LV78;
    .locals 1

    invoke-virtual {p0}, LA58;->o()LQ58;

    move-result-object v0

    return-object v0
.end method

.method public final n()V
    .locals 2

    invoke-super {p0}, Lk58;->n()V

    iget-object v0, p0, Lk58;->c:LV78;

    check-cast v0, LQ58;

    iget-object v0, v0, LQ58;->zza:Ld48;

    invoke-static {}, Ld48;->d()Ld48;

    move-result-object v1

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lk58;->c:LV78;

    check-cast v0, LQ58;

    iget-object v1, v0, LQ58;->zza:Ld48;

    invoke-virtual {v1}, Ld48;->c()Ld48;

    move-result-object v1

    iput-object v1, v0, LQ58;->zza:Ld48;

    :cond_0
    return-void
.end method

.method public final o()LQ58;
    .locals 1

    iget-object v0, p0, Lk58;->c:LV78;

    check-cast v0, LQ58;

    invoke-virtual {v0}, LV78;->D()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lk58;->c:LV78;

    check-cast v0, LQ58;

    return-object v0

    :cond_0
    iget-object v0, p0, Lk58;->c:LV78;

    check-cast v0, LQ58;

    iget-object v0, v0, LQ58;->zza:Ld48;

    invoke-virtual {v0}, Ld48;->g()V

    invoke-super {p0}, Lk58;->k()LV78;

    move-result-object v0

    check-cast v0, LQ58;

    return-object v0
.end method

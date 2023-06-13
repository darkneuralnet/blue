.class public Lau7;
.super LZt7;
.source "SourceFile"

# interfaces
.implements Lgv7;


# direct methods
.method public constructor <init>(Lbu7;)V
    .locals 0

    invoke-direct {p0, p1}, LZt7;-><init>(Leu7;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic m()Leu7;
    .locals 1

    invoke-virtual {p0}, Lau7;->p()Lbu7;

    move-result-object v0

    return-object v0
.end method

.method public final o()V
    .locals 2

    invoke-super {p0}, LZt7;->o()V

    iget-object v0, p0, LZt7;->c:Leu7;

    check-cast v0, Lbu7;

    iget-object v1, v0, Lbu7;->zzb:LEt7;

    invoke-virtual {v1}, LEt7;->e()LEt7;

    move-result-object v1

    iput-object v1, v0, Lbu7;->zzb:LEt7;

    return-void
.end method

.method public final p()Lbu7;
    .locals 1

    iget-boolean v0, p0, LZt7;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LZt7;->c:Leu7;

    check-cast v0, Lbu7;

    return-object v0

    :cond_0
    iget-object v0, p0, LZt7;->c:Leu7;

    check-cast v0, Lbu7;

    iget-object v0, v0, Lbu7;->zzb:LEt7;

    invoke-virtual {v0}, LEt7;->i()V

    invoke-super {p0}, LZt7;->m()Leu7;

    move-result-object v0

    check-cast v0, Lbu7;

    return-object v0
.end method

.method public final bridge synthetic zzv()Lfv7;
    .locals 1

    invoke-virtual {p0}, Lau7;->p()Lbu7;

    move-result-object v0

    return-object v0
.end method

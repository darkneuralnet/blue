.class public LMa9;
.super LFa9;
.source "SourceFile"

# interfaces
.implements Lwg9;


# direct methods
.method public constructor <init>(LTa9;)V
    .locals 0

    invoke-direct {p0, p1}, LFa9;-><init>(Lub9;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic n()Lub9;
    .locals 1

    invoke-virtual {p0}, LMa9;->p()LTa9;

    move-result-object v0

    return-object v0
.end method

.method public final o()V
    .locals 2

    invoke-super {p0}, LFa9;->o()V

    iget-object v0, p0, LFa9;->c:Lub9;

    check-cast v0, LTa9;

    iget-object v1, v0, LTa9;->zzb:Lda9;

    invoke-virtual {v1}, Lda9;->c()Lda9;

    move-result-object v1

    iput-object v1, v0, LTa9;->zzb:Lda9;

    return-void
.end method

.method public final p()LTa9;
    .locals 1

    iget-boolean v0, p0, LFa9;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, LFa9;->c:Lub9;

    check-cast v0, LTa9;

    return-object v0

    :cond_0
    iget-object v0, p0, LFa9;->c:Lub9;

    check-cast v0, LTa9;

    iget-object v0, v0, LTa9;->zzb:Lda9;

    invoke-virtual {v0}, Lda9;->h()V

    invoke-super {p0}, LFa9;->n()Lub9;

    move-result-object v0

    check-cast v0, LTa9;

    return-object v0
.end method

.method public final bridge synthetic zzs()Lpg9;
    .locals 1

    invoke-virtual {p0}, LMa9;->p()LTa9;

    move-result-object v0

    return-object v0
.end method

.class public abstract LTa9;
.super Lub9;
.source "SourceFile"

# interfaces
.implements Lwg9;


# instance fields
.field protected zzb:Lda9;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lub9;-><init>()V

    invoke-static {}, Lda9;->d()Lda9;

    move-result-object v0

    iput-object v0, p0, LTa9;->zzb:Lda9;

    return-void
.end method


# virtual methods
.method public final u()Lda9;
    .locals 1

    iget-object v0, p0, LTa9;->zzb:Lda9;

    invoke-virtual {v0}, Lda9;->k()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LTa9;->zzb:Lda9;

    invoke-virtual {v0}, Lda9;->c()Lda9;

    move-result-object v0

    iput-object v0, p0, LTa9;->zzb:Lda9;

    :cond_0
    iget-object v0, p0, LTa9;->zzb:Lda9;

    return-object v0
.end method

.method public final v(Lx89;)Ljava/lang/Object;
    .locals 6

    check-cast p1, Lhb9;

    iget-object v0, p1, Lhb9;->a:Lpg9;

    const/4 v1, 0x6

    const/4 v2, 0x0

    invoke-virtual {p0, v1, v2, v2}, Lub9;->n(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lub9;

    if-ne v0, v1, :cond_4

    iget-object v0, p0, LTa9;->zzb:Lda9;

    iget-object v1, p1, Lhb9;->d:Lab9;

    invoke-virtual {v0, v1}, Lda9;->e(LW99;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object p1, p1, Lhb9;->b:Ljava/lang/Object;

    return-object p1

    :cond_0
    iget-object v1, p1, Lhb9;->d:Lab9;

    iget-object v1, v1, Lab9;->d:Lfn9;

    invoke-virtual {v1}, Lfn9;->a()Lln9;

    move-result-object v1

    sget-object v3, Lln9;->j:Lln9;

    if-ne v1, v3, :cond_3

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    iget-object v4, p1, Lhb9;->d:Lab9;

    iget-object v4, v4, Lab9;->d:Lfn9;

    invoke-virtual {v4}, Lfn9;->a()Lln9;

    move-result-object v4

    sget-object v5, Lln9;->j:Lln9;

    if-eq v4, v5, :cond_1

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object p1, p1, Lhb9;->d:Lab9;

    iget-object p1, p1, Lab9;->b:LPb9;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    throw v2

    :cond_2
    move-object v0, v1

    :cond_3
    return-object v0

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.class public final LCp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LZU5;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LZU5<",
        "LBp;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LFp;

.field public final b:Llc1$a;


# direct methods
.method public constructor <init>(LFp;Llc1$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LCp;->a:LFp;

    iput-object p2, p0, LCp;->b:Llc1$a;

    return-void
.end method


# virtual methods
.method public a()LBp;
    .locals 8

    iget-object v0, p0, LCp;->a:LFp;

    invoke-static {v0}, Lxp;->e(LFp;)I

    move-result v0

    iget-object v1, p0, LCp;->a:LFp;

    invoke-static {v1}, Lxp;->f(LFp;)I

    move-result v1

    iget-object v2, p0, LCp;->a:LFp;

    invoke-virtual {v2}, LFp;->c()I

    move-result v2

    iget-object v3, p0, LCp;->a:LFp;

    invoke-virtual {v3}, LFp;->d()Landroid/util/Range;

    move-result-object v3

    iget-object v4, p0, LCp;->b:Llc1$a;

    invoke-virtual {v4}, Llc1$a;->c()I

    move-result v4

    const/4 v5, -0x1

    const-string v6, "AudioSrcAdPrflRslvr"

    if-ne v2, v5, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Resolved AUDIO channel count from AudioProfile: "

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, v2}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    move v2, v4

    goto :goto_0

    :cond_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Media spec AUDIO channel count overrides AudioProfile [AudioProfile channel count: "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, ", Resolved Channel Count: "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "]"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v6, v4}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iget-object v4, p0, LCp;->b:Llc1$a;

    invoke-virtual {v4}, Llc1$a;->g()I

    move-result v4

    invoke-static {v3, v2, v1, v4}, Lxp;->g(Landroid/util/Range;III)I

    move-result v3

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Using resolved AUDIO sample rate or nearest supported from AudioProfile: "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, "Hz. [AudioProfile sample rate: "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, "Hz]"

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v6, v4}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, LBp;->a()LBp$a;

    move-result-object v4

    invoke-virtual {v4, v0}, LBp$a;->d(I)LBp$a;

    move-result-object v0

    invoke-virtual {v0, v1}, LBp$a;->c(I)LBp$a;

    move-result-object v0

    invoke-virtual {v0, v2}, LBp$a;->e(I)LBp$a;

    move-result-object v0

    invoke-virtual {v0, v3}, LBp$a;->f(I)LBp$a;

    move-result-object v0

    invoke-virtual {v0}, LBp$a;->b()LBp;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LCp;->a()LBp;

    move-result-object v0

    return-object v0
.end method

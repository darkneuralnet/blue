.class public final LDp;
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


# direct methods
.method public constructor <init>(LFp;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDp;->a:LFp;

    return-void
.end method


# virtual methods
.method public a()LBp;
    .locals 8

    iget-object v0, p0, LDp;->a:LFp;

    invoke-static {v0}, Lxp;->e(LFp;)I

    move-result v0

    iget-object v1, p0, LDp;->a:LFp;

    invoke-static {v1}, Lxp;->f(LFp;)I

    move-result v1

    iget-object v2, p0, LDp;->a:LFp;

    invoke-virtual {v2}, LFp;->c()I

    move-result v2

    const/4 v3, -0x1

    const-string v4, "DefAudioResolver"

    if-ne v2, v3, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Using fallback AUDIO channel count: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    move v2, v3

    goto :goto_0

    :cond_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Using supplied AUDIO channel count: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    iget-object v3, p0, LDp;->a:LFp;

    invoke-virtual {v3}, LFp;->d()Landroid/util/Range;

    move-result-object v3

    sget-object v5, LFp;->b:Landroid/util/Range;

    invoke-virtual {v5, v3}, Landroid/util/Range;->equals(Ljava/lang/Object;)Z

    move-result v5

    const-string v6, "Hz"

    if-eqz v5, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Using fallback AUDIO sample rate: "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v5, 0xac44

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static {v3, v2, v1, v5}, Lxp;->g(Landroid/util/Range;III)I

    move-result v5

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Using AUDIO sample rate resolved from AudioSpec: "

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v4, v3}, LJx2;->a(Ljava/lang/String;Ljava/lang/String;)V

    :goto_1
    invoke-static {}, LBp;->a()LBp$a;

    move-result-object v3

    invoke-virtual {v3, v0}, LBp$a;->d(I)LBp$a;

    move-result-object v0

    invoke-virtual {v0, v1}, LBp$a;->c(I)LBp$a;

    move-result-object v0

    invoke-virtual {v0, v2}, LBp$a;->e(I)LBp$a;

    move-result-object v0

    invoke-virtual {v0, v5}, LBp$a;->f(I)LBp$a;

    move-result-object v0

    invoke-virtual {v0}, LBp$a;->b()LBp;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LDp;->a()LBp;

    move-result-object v0

    return-object v0
.end method

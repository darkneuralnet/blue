.class public final LZx8;
.super Lv39;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lv39<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public i:Lxy8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lxy8<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final j:I


# direct methods
.method public synthetic constructor <init>(Lxy8;ILCx8;)V
    .locals 0

    invoke-direct {p0}, Lv39;-><init>()V

    iput-object p1, p0, LZx8;->i:Lxy8;

    iput p2, p0, LZx8;->j:I

    return-void
.end method


# virtual methods
.method public final e()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, LZx8;->i:Lxy8;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-static {v0}, Lxy8;->a(Lxy8;)LOx8;

    move-result-object v0

    invoke-static {v0}, LOx8;->a(LOx8;)Lc69;

    move-result-object v0

    if-nez v0, :cond_1

    return-object v1

    :cond_1
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0xb

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "callable=["

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "]"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, LZx8;->i:Lxy8;

    invoke-static {v2}, Lxy8;->e(Lxy8;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lly8;

    if-eqz v2, :cond_2

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0xa

    add-int/2addr v3, v4

    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", trial=["

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    return-object v1
.end method

.method public final f()V
    .locals 5

    iget-object v0, p0, LZx8;->i:Lxy8;

    const/4 v1, 0x0

    iput-object v1, p0, LZx8;->i:Lxy8;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {v0}, Lxy8;->g(Lxy8;)Z

    move-result v2

    if-eqz v2, :cond_2

    :cond_1
    invoke-static {v0}, Lxy8;->e(Lxy8;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lly8;

    if-eqz v2, :cond_2

    invoke-static {v2}, Lly8;->D(Lly8;)I

    move-result v3

    iget v4, p0, LZx8;->j:I

    if-gt v3, v4, :cond_2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Lv39;->cancel(Z)Z

    invoke-static {v0}, Lxy8;->e(Lxy8;)Ljava/util/concurrent/atomic/AtomicReference;

    move-result-object v3

    invoke-static {v3, v2, v1}, Li24;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_2
    return-void
.end method

.method public final g(LMb9;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LMb9<",
            "+TT;>;)Z"
        }
    .end annotation

    invoke-super {p0, p1}, Lv39;->g(LMb9;)Z

    move-result p1

    return p1
.end method

.class public Lnb8;
.super LZ18;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<MessageType:",
        "LPb8<",
        "TMessageType;TBuilderType;>;BuilderType:",
        "Lnb8<",
        "TMessageType;TBuilderType;>;>",
        "LZ18<",
        "TMessageType;TBuilderType;>;"
    }
.end annotation


# instance fields
.field public final b:LPb8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TMessageType;"
        }
    .end annotation
.end field

.field public c:LPb8;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TMessageType;"
        }
    .end annotation
.end field

.field public d:Z


# direct methods
.method public constructor <init>(LPb8;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)V"
        }
    .end annotation

    invoke-direct {p0}, LZ18;-><init>()V

    iput-object p1, p0, Lnb8;->b:LPb8;

    const/4 v0, 0x4

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, v1}, LPb8;->h(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LPb8;

    iput-object p1, p0, Lnb8;->c:LPb8;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lnb8;->d:Z

    return-void
.end method

.method public static final k(LPb8;LPb8;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;TMessageType;)V"
        }
    .end annotation

    invoke-static {}, LMl8;->a()LMl8;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, LMl8;->b(Ljava/lang/Class;)Lnn8;

    move-result-object v0

    invoke-interface {v0, p0, p1}, Lnn8;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    invoke-virtual {p0}, Lnb8;->f()Lnb8;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic d()LZ18;
    .locals 1

    invoke-virtual {p0}, Lnb8;->f()Lnb8;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic e(Ln28;)LZ18;
    .locals 0

    check-cast p1, LPb8;

    invoke-virtual {p0, p1}, Lnb8;->g(LPb8;)Lnb8;

    return-object p0
.end method

.method public final f()Lnb8;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TBuilderType;"
        }
    .end annotation

    iget-object v0, p0, Lnb8;->b:LPb8;

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, LPb8;->h(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnb8;

    invoke-virtual {p0}, Lnb8;->h()LPb8;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnb8;->g(LPb8;)Lnb8;

    return-object v0
.end method

.method public final g(LPb8;)Lnb8;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TMessageType;)TBuilderType;"
        }
    .end annotation

    iget-boolean v0, p0, Lnb8;->d:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lnb8;->j()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lnb8;->d:Z

    :cond_0
    iget-object v0, p0, Lnb8;->c:LPb8;

    invoke-static {v0, p1}, Lnb8;->k(LPb8;LPb8;)V

    return-object p0
.end method

.method public h()LPb8;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TMessageType;"
        }
    .end annotation

    iget-boolean v0, p0, Lnb8;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lnb8;->c:LPb8;

    return-object v0

    :cond_0
    iget-object v0, p0, Lnb8;->c:LPb8;

    invoke-static {}, LMl8;->a()LMl8;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, LMl8;->b(Ljava/lang/Class;)Lnn8;

    move-result-object v1

    invoke-interface {v1, v0}, Lnn8;->b(Ljava/lang/Object;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lnb8;->d:Z

    iget-object v0, p0, Lnb8;->c:LPb8;

    return-object v0
.end method

.method public j()V
    .locals 3

    iget-object v0, p0, Lnb8;->c:LPb8;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2, v2}, LPb8;->h(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LPb8;

    iget-object v1, p0, Lnb8;->c:LPb8;

    invoke-static {v0, v1}, Lnb8;->k(LPb8;LPb8;)V

    iput-object v0, p0, Lnb8;->c:LPb8;

    return-void
.end method

.method public bridge synthetic zzg()LKj8;
    .locals 1

    invoke-virtual {p0}, Lnb8;->h()LPb8;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzh()LKj8;
    .locals 1

    iget-object v0, p0, Lnb8;->b:LPb8;

    return-object v0
.end method

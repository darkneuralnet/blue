.class public Lyh5;
.super LlI6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LlI6<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public a:Z

.field public final b:LlI6;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LlI6<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LlI6;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LlI6<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, LlI6;-><init>()V

    iput-object p1, p0, Lyh5;->b:LlI6;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lyh5;->a:Z

    return-void
.end method

.method public static a(LlI6;)Lyh5;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LlI6<",
            "TT;>;)",
            "Lyh5<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lyh5;

    invoke-direct {v0, p0}, Lyh5;-><init>(LlI6;)V

    return-object v0
.end method


# virtual methods
.method public cancel()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lyh5;->a:Z

    return-void
.end method

.method public onError(Lsg1;)V
    .locals 1

    iget-boolean v0, p0, Lyh5;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lyh5;->b:LlI6;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LlI6;->onError(Lsg1;)V

    goto :goto_0

    :cond_0
    const-string v0, "SafeZendeskCallback"

    invoke-static {v0, p1}, LIx2;->c(Ljava/lang/String;Lsg1;)V

    :goto_0
    return-void
.end method

.method public onSuccess(Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-boolean v0, p0, Lyh5;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lyh5;->b:LlI6;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LlI6;->onSuccess(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    const-string v0, "SafeZendeskCallback"

    const-string v1, "Operation was a success but callback is null or was cancelled"

    invoke-static {v0, v1, p1}, LIx2;->l(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

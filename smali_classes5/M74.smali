.class public final LM74;
.super Ljava/io/OutputStream;
.source "SourceFile"

# interfaces
.implements LZI4;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010%\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\u0008\u0010#\u001a\u0004\u0018\u00010 \u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00080\u0007J\u000e\u0010\u000c\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016J \u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0016J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0010H\u0016R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00080\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0019R$\u0010\u001f\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00108\u0006@BX\u0086\u000e\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u0017\u0010\u001eR\u0016\u0010#\u001a\u0004\u0018\u00010 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"\u00a8\u0006&"
    }
    d2 = {
        "LM74;",
        "Ljava/io/OutputStream;",
        "LZI4;",
        "Lcom/facebook/GraphRequest;",
        "currentRequest",
        "",
        "a",
        "",
        "LdJ4;",
        "d",
        "",
        "size",
        "b",
        "",
        "buffer",
        "write",
        "",
        "offset",
        "length",
        "oneByte",
        "",
        "Ljava/util/Map;",
        "progressMap",
        "c",
        "Lcom/facebook/GraphRequest;",
        "LdJ4;",
        "currentRequestProgress",
        "<set-?>",
        "e",
        "I",
        "()I",
        "maxProgress",
        "Landroid/os/Handler;",
        "f",
        "Landroid/os/Handler;",
        "callbackHandler",
        "<init>",
        "(Landroid/os/Handler;)V",
        "facebook-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field public final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lcom/facebook/GraphRequest;",
            "LdJ4;",
            ">;"
        }
    .end annotation
.end field

.field public c:Lcom/facebook/GraphRequest;

.field public d:LdJ4;

.field public e:I

.field public final f:Landroid/os/Handler;


# direct methods
.method public constructor <init>(Landroid/os/Handler;)V
    .locals 0

    invoke-direct {p0}, Ljava/io/OutputStream;-><init>()V

    iput-object p1, p0, LM74;->f:Landroid/os/Handler;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, LM74;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/GraphRequest;)V
    .locals 1

    iput-object p1, p0, LM74;->c:Lcom/facebook/GraphRequest;

    if-eqz p1, :cond_0

    iget-object v0, p0, LM74;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LdJ4;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, LM74;->d:LdJ4;

    return-void
.end method

.method public final b(J)V
    .locals 3

    iget-object v0, p0, LM74;->c:Lcom/facebook/GraphRequest;

    if-eqz v0, :cond_2

    iget-object v1, p0, LM74;->d:LdJ4;

    if-nez v1, :cond_0

    new-instance v1, LdJ4;

    iget-object v2, p0, LM74;->f:Landroid/os/Handler;

    invoke-direct {v1, v2, v0}, LdJ4;-><init>(Landroid/os/Handler;Lcom/facebook/GraphRequest;)V

    iput-object v1, p0, LM74;->d:LdJ4;

    iget-object v2, p0, LM74;->b:Ljava/util/Map;

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    iget-object v0, p0, LM74;->d:LdJ4;

    if-eqz v0, :cond_1

    invoke-virtual {v0, p1, p2}, LdJ4;->b(J)V

    :cond_1
    iget v0, p0, LM74;->e:I

    long-to-int p1, p1

    add-int/2addr v0, p1

    iput v0, p0, LM74;->e:I

    :cond_2
    return-void
.end method

.method public final c()I
    .locals 1

    iget v0, p0, LM74;->e:I

    return v0
.end method

.method public final d()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lcom/facebook/GraphRequest;",
            "LdJ4;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LM74;->b:Ljava/util/Map;

    return-object v0
.end method

.method public write(I)V
    .locals 2

    const-wide/16 v0, 0x1

    invoke-virtual {p0, v0, v1}, LM74;->b(J)V

    return-void
.end method

.method public write([B)V
    .locals 2

    const-string v0, "buffer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p1, p1

    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, LM74;->b(J)V

    return-void
.end method

.method public write([BII)V
    .locals 0

    const-string p2, "buffer"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-long p1, p3

    invoke-virtual {p0, p1, p2}, LM74;->b(J)V

    return-void
.end method

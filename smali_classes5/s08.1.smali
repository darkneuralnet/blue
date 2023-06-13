.class public final Ls08;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LIj6;


# instance fields
.field public a:Z

.field public b:Z

.field public c:LSk1;

.field public final d:LnZ7;


# direct methods
.method public constructor <init>(LnZ7;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Ls08;->a:Z

    iput-boolean v0, p0, Ls08;->b:Z

    iput-object p1, p0, Ls08;->d:LnZ7;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)LIj6;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Ls08;->d()V

    iget-object v0, p0, Ls08;->d:LnZ7;

    iget-object v1, p0, Ls08;->c:LSk1;

    iget-boolean v2, p0, Ls08;->b:Z

    invoke-virtual {v0, v1, p1, v2}, LnZ7;->g(LSk1;Ljava/lang/Object;Z)LPd3;

    return-object p0
.end method

.method public final b(Z)LIj6;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p0}, Ls08;->d()V

    iget-object v0, p0, Ls08;->d:LnZ7;

    iget-object v1, p0, Ls08;->c:LSk1;

    iget-boolean v2, p0, Ls08;->b:Z

    invoke-virtual {v0, v1, p1, v2}, LnZ7;->h(LSk1;IZ)LnZ7;

    return-object p0
.end method

.method public final c(LSk1;Z)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Ls08;->a:Z

    iput-object p1, p0, Ls08;->c:LSk1;

    iput-boolean p2, p0, Ls08;->b:Z

    return-void
.end method

.method public final d()V
    .locals 2

    iget-boolean v0, p0, Ls08;->a:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Ls08;->a:Z

    return-void

    :cond_0
    new-instance v0, Lcom/google/firebase/encoders/EncodingException;

    const-string v1, "Cannot encode a second value in the ValueEncoderContext"

    invoke-direct {v0, v1}, Lcom/google/firebase/encoders/EncodingException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

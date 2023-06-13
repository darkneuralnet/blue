.class public LlG0;
.super LQ;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 0

    invoke-direct {p0, p1}, LQ;-><init>(Ljava/io/OutputStream;)V

    return-void
.end method


# virtual methods
.method public e()LQ;
    .locals 0

    return-object p0
.end method

.method public u(LS;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-virtual {p1}, LS;->y()LS;

    move-result-object p1

    invoke-virtual {p1, p0, p2}, LS;->o(LQ;Z)V

    return-void
.end method

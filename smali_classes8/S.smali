.class public abstract LS;
.super LM;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LM;-><init>()V

    return-void
.end method

.method public static v([B)LS;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    new-instance v0, LJ;

    invoke-direct {v0, p0}, LJ;-><init>([B)V

    :try_start_0
    invoke-virtual {v0}, LJ;->k()LS;

    move-result-object p0

    invoke-virtual {v0}, Ljava/io/InputStream;->available()I

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "Extra data detected in stream"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    new-instance p0, Ljava/io/IOException;

    const-string v0, "cannot recognise object in stream"

    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final c()LS;
    .locals 0

    return-object p0
.end method

.method public e(Ljava/io/OutputStream;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p1}, LQ;->a(Ljava/io/OutputStream;)LQ;

    move-result-object p1

    invoke-virtual {p1, p0}, LQ;->t(LS;)V

    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LE;

    if-eqz v1, :cond_1

    check-cast p1, LE;

    invoke-interface {p1}, LE;->c()LS;

    move-result-object p1

    invoke-virtual {p0, p1}, LS;->j(LS;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public f(Ljava/io/OutputStream;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    invoke-static {p1, p2}, LQ;->b(Ljava/io/OutputStream;Ljava/lang/String;)LQ;

    move-result-object p1

    invoke-virtual {p1, p0}, LQ;->t(LS;)V

    return-void
.end method

.method public abstract hashCode()I
.end method

.method public abstract j(LS;)Z
.end method

.method public abstract o(LQ;Z)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract s()I
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public final u(LS;)Z
    .locals 0

    if-eq p0, p1, :cond_1

    invoke-virtual {p0, p1}, LS;->j(LS;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public abstract w()Z
.end method

.method public x()LS;
    .locals 0

    return-object p0
.end method

.method public y()LS;
    .locals 0

    return-object p0
.end method

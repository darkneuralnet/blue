.class public final Lsb4;
.super Lcp;
.source "SourceFile"


# instance fields
.field public c:I

.field public d:[B


# direct methods
.method public constructor <init>(I[B)V
    .locals 2

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcp;-><init>(Z)V

    array-length v0, p2

    invoke-static {p1}, Lub4;->b(I)I

    move-result v1

    if-ne v0, v1, :cond_0

    iput p1, p0, Lsb4;->c:I

    invoke-static {p2}, LAo;->d([B)[B

    move-result-object p1

    iput-object p1, p0, Lsb4;->d:[B

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "invalid key size for security category"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public a()[B
    .locals 1

    iget-object v0, p0, Lsb4;->d:[B

    invoke-static {v0}, LAo;->d([B)[B

    move-result-object v0

    return-object v0
.end method

.method public b()I
    .locals 1

    iget v0, p0, Lsb4;->c:I

    return v0
.end method

.class public Li;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwj0;


# instance fields
.field public b:[B

.field public c:[B

.field public d:Lzk2;

.field public e:I


# direct methods
.method public constructor <init>(Lzk2;I[B[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li;->d:Lzk2;

    invoke-static {p3}, LAo;->d([B)[B

    move-result-object p1

    iput-object p1, p0, Li;->c:[B

    iput p2, p0, Li;->e:I

    invoke-static {p4}, LAo;->d([B)[B

    move-result-object p1

    iput-object p1, p0, Li;->b:[B

    return-void
.end method


# virtual methods
.method public a()[B
    .locals 1

    iget-object v0, p0, Li;->b:[B

    invoke-static {v0}, LAo;->d([B)[B

    move-result-object v0

    return-object v0
.end method

.method public b()Lzk2;
    .locals 1

    iget-object v0, p0, Li;->d:Lzk2;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Li;->e:I

    return v0
.end method

.method public d()[B
    .locals 1

    iget-object v0, p0, Li;->c:[B

    invoke-static {v0}, LAo;->d([B)[B

    move-result-object v0

    return-object v0
.end method

.class public LSq5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[B

.field public final b:[B

.field public final c:LP31;

.field public d:I

.field public e:I


# direct methods
.method public constructor <init>([B[BLP31;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSq5;->a:[B

    iput-object p2, p0, LSq5;->b:[B

    iput-object p3, p0, LSq5;->c:LP31;

    return-void
.end method


# virtual methods
.method public a([BZI)V
    .locals 0

    invoke-virtual {p0, p1, p3}, LSq5;->b([BI)[B

    if-eqz p2, :cond_0

    iget p1, p0, LSq5;->e:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LSq5;->e:I

    :cond_0
    return-void
.end method

.method public b([BI)[B
    .locals 4

    array-length v0, p1

    iget-object v1, p0, LSq5;->c:LP31;

    invoke-interface {v1}, LP31;->e()I

    move-result v1

    if-lt v0, v1, :cond_0

    iget-object v0, p0, LSq5;->c:LP31;

    iget-object v1, p0, LSq5;->a:[B

    array-length v2, v1

    const/4 v3, 0x0

    invoke-interface {v0, v1, v3, v2}, LP31;->f([BII)V

    iget-object v0, p0, LSq5;->c:LP31;

    iget v1, p0, LSq5;->d:I

    ushr-int/lit8 v1, v1, 0x18

    int-to-byte v1, v1

    invoke-interface {v0, v1}, LP31;->c(B)V

    iget-object v0, p0, LSq5;->c:LP31;

    iget v1, p0, LSq5;->d:I

    ushr-int/lit8 v1, v1, 0x10

    int-to-byte v1, v1

    invoke-interface {v0, v1}, LP31;->c(B)V

    iget-object v0, p0, LSq5;->c:LP31;

    iget v1, p0, LSq5;->d:I

    ushr-int/lit8 v1, v1, 0x8

    int-to-byte v1, v1

    invoke-interface {v0, v1}, LP31;->c(B)V

    iget-object v0, p0, LSq5;->c:LP31;

    iget v1, p0, LSq5;->d:I

    int-to-byte v1, v1

    invoke-interface {v0, v1}, LP31;->c(B)V

    iget-object v0, p0, LSq5;->c:LP31;

    iget v1, p0, LSq5;->e:I

    ushr-int/lit8 v1, v1, 0x8

    int-to-byte v1, v1

    invoke-interface {v0, v1}, LP31;->c(B)V

    iget-object v0, p0, LSq5;->c:LP31;

    iget v1, p0, LSq5;->e:I

    int-to-byte v1, v1

    invoke-interface {v0, v1}, LP31;->c(B)V

    iget-object v0, p0, LSq5;->c:LP31;

    const/4 v1, -0x1

    invoke-interface {v0, v1}, LP31;->c(B)V

    iget-object v0, p0, LSq5;->c:LP31;

    iget-object v1, p0, LSq5;->b:[B

    array-length v2, v1

    invoke-interface {v0, v1, v3, v2}, LP31;->f([BII)V

    iget-object v0, p0, LSq5;->c:LP31;

    invoke-interface {v0, p1, p2}, LP31;->a([BI)I

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "target length is less than digest size."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c(I)V
    .locals 0

    iput p1, p0, LSq5;->e:I

    return-void
.end method

.method public d(I)V
    .locals 0

    iput p1, p0, LSq5;->d:I

    return-void
.end method

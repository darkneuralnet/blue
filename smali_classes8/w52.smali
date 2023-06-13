.class public Lw52;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[I

.field public b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0xa

    invoke-direct {p0, v0}, Lw52;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lw52;->b:I

    new-array p1, p1, [I

    iput-object p1, p0, Lw52;->a:[I

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 2

    iget v0, p0, Lw52;->b:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Lw52;->b(I)V

    iget-object v0, p0, Lw52;->a:[I

    iget v1, p0, Lw52;->b:I

    aput p1, v0, v1

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lw52;->b:I

    return-void
.end method

.method public b(I)V
    .locals 2

    iget-object v0, p0, Lw52;->a:[I

    array-length v1, v0

    if-gt p1, v1, :cond_0

    return-void

    :cond_0
    array-length v0, v0

    mul-int/lit8 v0, v0, 0x2

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    iget-object v0, p0, Lw52;->a:[I

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    iput-object p1, p0, Lw52;->a:[I

    return-void
.end method

.method public c()[I
    .locals 4

    iget v0, p0, Lw52;->b:I

    new-array v1, v0, [I

    iget-object v2, p0, Lw52;->a:[I

    const/4 v3, 0x0

    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1
.end method

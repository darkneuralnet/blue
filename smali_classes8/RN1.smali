.class public final LRN1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:[I

.field public c:[I


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(LRN1;LIT;)V
    .locals 5

    iget-object v0, p0, LRN1;->c:[I

    array-length v0, v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v1, v0, :cond_0

    iget-object v3, p0, LRN1;->c:[I

    aput v2, v3, v1

    iget v3, p0, LRN1;->a:I

    iget-object v4, p0, LRN1;->b:[I

    invoke-static {v3, v4, v2, p1}, LmV0;->n(I[IILIT;)V

    add-int/lit16 v2, v2, 0x438

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static b(LRN1;II)V
    .locals 0

    iput p1, p0, LRN1;->a:I

    mul-int/lit16 p1, p2, 0x438

    new-array p1, p1, [I

    iput-object p1, p0, LRN1;->b:[I

    new-array p1, p2, [I

    iput-object p1, p0, LRN1;->c:[I

    return-void
.end method

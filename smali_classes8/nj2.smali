.class public final Lnj2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LDj2;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000c\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0010\u0019\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000c\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016J\u0008\u0010\r\u001a\u00020\u0004H\u0016J\u0008\u0010\u000e\u001a\u00020\tH\u0016J \u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\tH\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u000fH\u0002J\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000fH\u0002R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u001c\u00a8\u0006 "
    }
    d2 = {
        "Lnj2;",
        "LDj2;",
        "",
        "value",
        "",
        "a",
        "",
        "char",
        "b",
        "",
        "text",
        "d",
        "c",
        "h",
        "toString",
        "",
        "firstEscapedChar",
        "currentSize",
        "string",
        "e",
        "expected",
        "f",
        "oldSize",
        "additional",
        "g",
        "",
        "[C",
        "array",
        "I",
        "size",
        "<init>",
        "()V",
        "kotlinx-serialization-json"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public a:[C

.field public b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LUh0;->c:LUh0;

    invoke-virtual {v0}, LUh0;->d()[C

    move-result-object v0

    iput-object v0, p0, Lnj2;->a:[C

    return-void
.end method


# virtual methods
.method public a(J)V
    .locals 0

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnj2;->d(Ljava/lang/String;)V

    return-void
.end method

.method public b(C)V
    .locals 3

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lnj2;->f(I)V

    iget-object v0, p0, Lnj2;->a:[C

    iget v1, p0, Lnj2;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lnj2;->b:I

    aput-char p1, v0, v1

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 7

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    add-int/lit8 v0, v0, 0x2

    invoke-virtual {p0, v0}, Lnj2;->f(I)V

    iget-object v0, p0, Lnj2;->a:[C

    iget v1, p0, Lnj2;->b:I

    add-int/lit8 v2, v1, 0x1

    const/16 v3, 0x22

    aput-char v3, v0, v1

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v4, 0x0

    invoke-virtual {p1, v4, v1, v0, v2}, Ljava/lang/String;->getChars(II[CI)V

    add-int/2addr v1, v2

    move v4, v2

    :goto_0
    if-ge v4, v1, :cond_1

    aget-char v5, v0, v4

    invoke-static {}, LaS5;->a()[B

    move-result-object v6

    array-length v6, v6

    if-ge v5, v6, :cond_0

    invoke-static {}, LaS5;->a()[B

    move-result-object v6

    aget-byte v5, v6, v5

    if-eqz v5, :cond_0

    sub-int v0, v4, v2

    invoke-virtual {p0, v0, v4, p1}, Lnj2;->e(IILjava/lang/String;)V

    return-void

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    add-int/lit8 p1, v1, 0x1

    aput-char v3, v0, v1

    iput p1, p0, Lnj2;->b:I

    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 5

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, v0}, Lnj2;->f(I)V

    iget-object v1, p0, Lnj2;->a:[C

    iget v2, p0, Lnj2;->b:I

    const/4 v3, 0x0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {p1, v3, v4, v1, v2}, Ljava/lang/String;->getChars(II[CI)V

    iget p1, p0, Lnj2;->b:I

    add-int/2addr p1, v0

    iput p1, p0, Lnj2;->b:I

    return-void
.end method

.method public final e(IILjava/lang/String;)V
    .locals 5

    invoke-virtual {p3}, Ljava/lang/String;->length()I

    move-result v0

    :goto_0
    const/4 v1, 0x1

    if-ge p1, v0, :cond_3

    const/4 v2, 0x2

    invoke-virtual {p0, p2, v2}, Lnj2;->g(II)I

    move-result p2

    invoke-virtual {p3, p1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    invoke-static {}, LaS5;->a()[B

    move-result-object v3

    array-length v3, v3

    if-ge v2, v3, :cond_2

    invoke-static {}, LaS5;->a()[B

    move-result-object v3

    aget-byte v3, v3, v2

    if-nez v3, :cond_0

    iget-object v1, p0, Lnj2;->a:[C

    add-int/lit8 v3, p2, 0x1

    int-to-char v2, v2

    aput-char v2, v1, p2

    goto :goto_1

    :cond_0
    if-ne v3, v1, :cond_1

    invoke-static {}, LaS5;->b()[Ljava/lang/String;

    move-result-object v1

    aget-object v1, v1, v2

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {p0, p2, v2}, Lnj2;->g(II)I

    move-result p2

    iget-object v2, p0, Lnj2;->a:[C

    const/4 v3, 0x0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v1, v3, v4, v2, p2}, Ljava/lang/String;->getChars(II[CI)V

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr p2, v1

    iput p2, p0, Lnj2;->b:I

    goto :goto_2

    :cond_1
    iget-object v1, p0, Lnj2;->a:[C

    const/16 v2, 0x5c

    aput-char v2, v1, p2

    add-int/lit8 v2, p2, 0x1

    int-to-char v3, v3

    aput-char v3, v1, v2

    add-int/lit8 p2, p2, 0x2

    iput p2, p0, Lnj2;->b:I

    goto :goto_2

    :cond_2
    iget-object v1, p0, Lnj2;->a:[C

    add-int/lit8 v3, p2, 0x1

    int-to-char v2, v2

    aput-char v2, v1, p2

    :goto_1
    move p2, v3

    :goto_2
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p0, p2, v1}, Lnj2;->g(II)I

    move-result p1

    iget-object p2, p0, Lnj2;->a:[C

    add-int/lit8 p3, p1, 0x1

    const/16 v0, 0x22

    aput-char v0, p2, p1

    iput p3, p0, Lnj2;->b:I

    return-void
.end method

.method public final f(I)V
    .locals 1

    iget v0, p0, Lnj2;->b:I

    invoke-virtual {p0, v0, p1}, Lnj2;->g(II)I

    return-void
.end method

.method public final g(II)I
    .locals 2

    add-int/2addr p2, p1

    iget-object v0, p0, Lnj2;->a:[C

    array-length v1, v0

    if-gt v1, p2, :cond_0

    mul-int/lit8 v1, p1, 0x2

    invoke-static {p2, v1}, Lkotlin/ranges/RangesKt;->coerceAtLeast(II)I

    move-result p2

    invoke-static {v0, p2}, Ljava/util/Arrays;->copyOf([CI)[C

    move-result-object p2

    const-string v0, "copyOf(this, newSize)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lnj2;->a:[C

    :cond_0
    return p1
.end method

.method public h()V
    .locals 2

    sget-object v0, LUh0;->c:LUh0;

    iget-object v1, p0, Lnj2;->a:[C

    invoke-virtual {v0, v1}, LUh0;->c([C)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/String;

    iget-object v1, p0, Lnj2;->a:[C

    const/4 v2, 0x0

    iget v3, p0, Lnj2;->b:I

    invoke-direct {v0, v1, v2, v3}, Ljava/lang/String;-><init>([CII)V

    return-object v0
.end method

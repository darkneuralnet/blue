.class public final LS47;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/nio/ByteBuffer;Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbnz;)LyY6;
    .locals 3

    new-instance v0, LwY6;

    invoke-direct {v0}, LwY6;-><init>()V

    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p0

    invoke-virtual {v0, p0}, LwY6;->a([B)LwY6;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbnz;->u()I

    move-result p0

    invoke-static {p0}, LS47;->b(I)I

    move-result p0

    invoke-virtual {v0, p0}, LwY6;->f(I)LwY6;

    new-instance p0, Ld07;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbnz;->v()I

    move-result v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbnz;->y()I

    move-result v2

    invoke-direct {p0, v1, v2}, Ld07;-><init>(II)V

    invoke-virtual {v0, p0}, LwY6;->b(Ld07;)LwY6;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbnz;->E()J

    move-result-wide p0

    const-wide/16 v1, 0x3e8

    mul-long/2addr p0, v1

    invoke-virtual {v0, p0, p1}, LwY6;->c(J)LwY6;

    const/4 p0, 0x2

    invoke-virtual {v0, p0}, LwY6;->e(I)LwY6;

    invoke-virtual {v0}, LwY6;->d()LyY6;

    move-result-object p0

    return-object p0
.end method

.method public static b(I)I
    .locals 3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v1, 0x3

    const/4 v2, 0x2

    if-eq p0, v2, :cond_1

    if-eq p0, v1, :cond_0

    return v0

    :cond_0
    return v2

    :cond_1
    return v1

    :cond_2
    const/4 p0, 0x4

    return p0
.end method

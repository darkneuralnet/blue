.class public final LyE1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LAN5;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0005\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0008\u0010\u0008\u001a\u00020\u0007H\u0016J\u0008\u0010\n\u001a\u00020\tH\u0016J\u0008\u0010\u000b\u001a\u00020\tH\u0002J\u0008\u0010\u000c\u001a\u00020\tH\u0002J \u0010\u000f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J \u0010\u0015\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0002R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%\u00a8\u0006)"
    }
    d2 = {
        "LyE1;",
        "LAN5;",
        "Li30;",
        "sink",
        "",
        "byteCount",
        "read",
        "LJ46;",
        "timeout",
        "",
        "close",
        "b",
        "c",
        "buffer",
        "offset",
        "d",
        "",
        "name",
        "",
        "expected",
        "actual",
        "a",
        "",
        "B",
        "section",
        "Lbs4;",
        "Lbs4;",
        "source",
        "Ljava/util/zip/Inflater;",
        "Ljava/util/zip/Inflater;",
        "inflater",
        "LN12;",
        "e",
        "LN12;",
        "inflaterSource",
        "Ljava/util/zip/CRC32;",
        "f",
        "Ljava/util/zip/CRC32;",
        "crc",
        "<init>",
        "(LAN5;)V",
        "okio"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
.end annotation


# instance fields
.field public b:B

.field public final c:Lbs4;

.field public final d:Ljava/util/zip/Inflater;

.field public final e:LN12;

.field public final f:Ljava/util/zip/CRC32;


# direct methods
.method public constructor <init>(LAN5;)V
    .locals 2

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lbs4;

    invoke-direct {v0, p1}, Lbs4;-><init>(LAN5;)V

    iput-object v0, p0, LyE1;->c:Lbs4;

    new-instance p1, Ljava/util/zip/Inflater;

    const/4 v1, 0x1

    invoke-direct {p1, v1}, Ljava/util/zip/Inflater;-><init>(Z)V

    iput-object p1, p0, LyE1;->d:Ljava/util/zip/Inflater;

    new-instance v1, LN12;

    invoke-direct {v1, v0, p1}, LN12;-><init>(Lo30;Ljava/util/zip/Inflater;)V

    iput-object v1, p0, LyE1;->e:LN12;

    new-instance p1, Ljava/util/zip/CRC32;

    invoke-direct {p1}, Ljava/util/zip/CRC32;-><init>()V

    iput-object p1, p0, LyE1;->f:Ljava/util/zip/CRC32;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;II)V
    .locals 4

    if-ne p3, p2, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const/4 v1, 0x3

    new-array v2, v1, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    const/4 p1, 0x1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, v2, p1

    const/4 p1, 0x2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    aput-object p2, v2, p1

    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string p2, "%s: actual 0x%08x != expected 0x%08x"

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "format(this, *args)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()V
    .locals 17
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    move-object/from16 v6, p0

    iget-object v0, v6, LyE1;->c:Lbs4;

    const-wide/16 v1, 0xa

    invoke-virtual {v0, v1, v2}, Lbs4;->x2(J)V

    iget-object v0, v6, LyE1;->c:Lbs4;

    iget-object v0, v0, Lbs4;->c:Li30;

    const-wide/16 v1, 0x3

    invoke-virtual {v0, v1, v2}, Li30;->p(J)B

    move-result v7

    shr-int/lit8 v0, v7, 0x1

    const/4 v8, 0x1

    and-int/2addr v0, v8

    const/4 v9, 0x0

    if-ne v0, v8, :cond_0

    move v10, v8

    goto :goto_0

    :cond_0
    move v10, v9

    :goto_0
    if-eqz v10, :cond_1

    iget-object v0, v6, LyE1;->c:Lbs4;

    iget-object v1, v0, Lbs4;->c:Li30;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0xa

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v5}, LyE1;->d(Li30;JJ)V

    :cond_1
    iget-object v0, v6, LyE1;->c:Lbs4;

    invoke-virtual {v0}, Lbs4;->readShort()S

    move-result v0

    const-string v1, "ID1ID2"

    const/16 v2, 0x1f8b

    invoke-virtual {v6, v1, v2, v0}, LyE1;->a(Ljava/lang/String;II)V

    iget-object v0, v6, LyE1;->c:Lbs4;

    const-wide/16 v1, 0x8

    invoke-virtual {v0, v1, v2}, Lbs4;->skip(J)V

    shr-int/lit8 v0, v7, 0x2

    and-int/2addr v0, v8

    if-ne v0, v8, :cond_2

    move v0, v8

    goto :goto_1

    :cond_2
    move v0, v9

    :goto_1
    if-eqz v0, :cond_5

    iget-object v0, v6, LyE1;->c:Lbs4;

    const-wide/16 v1, 0x2

    invoke-virtual {v0, v1, v2}, Lbs4;->x2(J)V

    if-eqz v10, :cond_3

    iget-object v0, v6, LyE1;->c:Lbs4;

    iget-object v1, v0, Lbs4;->c:Li30;

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x2

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v5}, LyE1;->d(Li30;JJ)V

    :cond_3
    iget-object v0, v6, LyE1;->c:Lbs4;

    iget-object v0, v0, Lbs4;->c:Li30;

    invoke-virtual {v0}, Li30;->C()S

    move-result v0

    int-to-long v11, v0

    iget-object v0, v6, LyE1;->c:Lbs4;

    invoke-virtual {v0, v11, v12}, Lbs4;->x2(J)V

    if-eqz v10, :cond_4

    iget-object v0, v6, LyE1;->c:Lbs4;

    iget-object v1, v0, Lbs4;->c:Li30;

    const-wide/16 v2, 0x0

    move-object/from16 v0, p0

    move-wide v4, v11

    invoke-virtual/range {v0 .. v5}, LyE1;->d(Li30;JJ)V

    :cond_4
    iget-object v0, v6, LyE1;->c:Lbs4;

    invoke-virtual {v0, v11, v12}, Lbs4;->skip(J)V

    :cond_5
    shr-int/lit8 v0, v7, 0x3

    and-int/2addr v0, v8

    if-ne v0, v8, :cond_6

    move v0, v8

    goto :goto_2

    :cond_6
    move v0, v9

    :goto_2
    const-wide/16 v11, -0x1

    const-wide/16 v13, 0x1

    if-eqz v0, :cond_9

    iget-object v0, v6, LyE1;->c:Lbs4;

    invoke-virtual {v0, v9}, Lbs4;->a(B)J

    move-result-wide v15

    cmp-long v0, v15, v11

    if-eqz v0, :cond_8

    if-eqz v10, :cond_7

    iget-object v0, v6, LyE1;->c:Lbs4;

    iget-object v1, v0, Lbs4;->c:Li30;

    const-wide/16 v2, 0x0

    add-long v4, v15, v13

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v5}, LyE1;->d(Li30;JJ)V

    :cond_7
    iget-object v0, v6, LyE1;->c:Lbs4;

    add-long v1, v15, v13

    invoke-virtual {v0, v1, v2}, Lbs4;->skip(J)V

    goto :goto_3

    :cond_8
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    :cond_9
    :goto_3
    shr-int/lit8 v0, v7, 0x4

    and-int/2addr v0, v8

    if-ne v0, v8, :cond_a

    goto :goto_4

    :cond_a
    move v8, v9

    :goto_4
    if-eqz v8, :cond_d

    iget-object v0, v6, LyE1;->c:Lbs4;

    invoke-virtual {v0, v9}, Lbs4;->a(B)J

    move-result-wide v7

    cmp-long v0, v7, v11

    if-eqz v0, :cond_c

    if-eqz v10, :cond_b

    iget-object v0, v6, LyE1;->c:Lbs4;

    iget-object v1, v0, Lbs4;->c:Li30;

    const-wide/16 v2, 0x0

    add-long v4, v7, v13

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v5}, LyE1;->d(Li30;JJ)V

    :cond_b
    iget-object v0, v6, LyE1;->c:Lbs4;

    add-long/2addr v7, v13

    invoke-virtual {v0, v7, v8}, Lbs4;->skip(J)V

    goto :goto_5

    :cond_c
    new-instance v0, Ljava/io/EOFException;

    invoke-direct {v0}, Ljava/io/EOFException;-><init>()V

    throw v0

    :cond_d
    :goto_5
    if-eqz v10, :cond_e

    iget-object v0, v6, LyE1;->c:Lbs4;

    invoke-virtual {v0}, Lbs4;->i()S

    move-result v0

    iget-object v1, v6, LyE1;->f:Ljava/util/zip/CRC32;

    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v1

    long-to-int v1, v1

    int-to-short v1, v1

    const-string v2, "FHCRC"

    invoke-virtual {v6, v2, v0, v1}, LyE1;->a(Ljava/lang/String;II)V

    iget-object v0, v6, LyE1;->f:Ljava/util/zip/CRC32;

    invoke-virtual {v0}, Ljava/util/zip/CRC32;->reset()V

    :cond_e
    return-void
.end method

.method public final c()V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LyE1;->c:Lbs4;

    invoke-virtual {v0}, Lbs4;->g()I

    move-result v0

    iget-object v1, p0, LyE1;->f:Ljava/util/zip/CRC32;

    invoke-virtual {v1}, Ljava/util/zip/CRC32;->getValue()J

    move-result-wide v1

    long-to-int v1, v1

    const-string v2, "CRC"

    invoke-virtual {p0, v2, v0, v1}, LyE1;->a(Ljava/lang/String;II)V

    iget-object v0, p0, LyE1;->c:Lbs4;

    invoke-virtual {v0}, Lbs4;->g()I

    move-result v0

    iget-object v1, p0, LyE1;->d:Ljava/util/zip/Inflater;

    invoke-virtual {v1}, Ljava/util/zip/Inflater;->getBytesWritten()J

    move-result-wide v1

    long-to-int v1, v1

    const-string v2, "ISIZE"

    invoke-virtual {p0, v2, v0, v1}, LyE1;->a(Ljava/lang/String;II)V

    return-void
.end method

.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LyE1;->e:LN12;

    invoke-virtual {v0}, LN12;->close()V

    return-void
.end method

.method public final d(Li30;JJ)V
    .locals 4

    iget-object p1, p1, Li30;->b:LTq5;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    :goto_0
    iget v0, p1, LTq5;->c:I

    iget v1, p1, LTq5;->b:I

    sub-int v2, v0, v1

    int-to-long v2, v2

    cmp-long v2, p2, v2

    if-ltz v2, :cond_0

    sub-int/2addr v0, v1

    int-to-long v0, v0

    sub-long/2addr p2, v0

    iget-object p1, p1, LTq5;->f:LTq5;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    :goto_1
    const-wide/16 v0, 0x0

    cmp-long v2, p4, v0

    if-lez v2, :cond_1

    iget v2, p1, LTq5;->b:I

    int-to-long v2, v2

    add-long/2addr v2, p2

    long-to-int p2, v2

    iget p3, p1, LTq5;->c:I

    sub-int/2addr p3, p2

    int-to-long v2, p3

    invoke-static {v2, v3, p4, p5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    long-to-int p3, v2

    iget-object v2, p0, LyE1;->f:Ljava/util/zip/CRC32;

    iget-object v3, p1, LTq5;->a:[B

    invoke-virtual {v2, v3, p2, p3}, Ljava/util/zip/CRC32;->update([BII)V

    int-to-long p2, p3

    sub-long/2addr p4, p2

    iget-object p1, p1, LTq5;->f:LTq5;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-wide p2, v0

    goto :goto_1

    :cond_1
    return-void
.end method

.method public read(Li30;J)J
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    const/4 v3, 0x1

    if-ltz v2, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    if-eqz v4, :cond_7

    if-nez v2, :cond_1

    return-wide v0

    :cond_1
    iget-byte v0, p0, LyE1;->b:B

    if-nez v0, :cond_2

    invoke-virtual {p0}, LyE1;->b()V

    iput-byte v3, p0, LyE1;->b:B

    :cond_2
    iget-byte v0, p0, LyE1;->b:B

    const-wide/16 v1, -0x1

    const/4 v4, 0x2

    if-ne v0, v3, :cond_4

    invoke-virtual {p1}, Li30;->size()J

    move-result-wide v7

    iget-object v0, p0, LyE1;->e:LN12;

    invoke-virtual {v0, p1, p2, p3}, LN12;->read(Li30;J)J

    move-result-wide p2

    cmp-long v0, p2, v1

    if-eqz v0, :cond_3

    move-object v5, p0

    move-object v6, p1

    move-wide v9, p2

    invoke-virtual/range {v5 .. v10}, LyE1;->d(Li30;JJ)V

    return-wide p2

    :cond_3
    iput-byte v4, p0, LyE1;->b:B

    :cond_4
    iget-byte p1, p0, LyE1;->b:B

    if-ne p1, v4, :cond_6

    invoke-virtual {p0}, LyE1;->c()V

    const/4 p1, 0x3

    iput-byte p1, p0, LyE1;->b:B

    iget-object p1, p0, LyE1;->c:Lbs4;

    invoke-virtual {p1}, Lbs4;->O2()Z

    move-result p1

    if-eqz p1, :cond_5

    goto :goto_1

    :cond_5
    new-instance p1, Ljava/io/IOException;

    const-string p2, "gzip finished without exhausting source"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_1
    return-wide v1

    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "byteCount < 0: "

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public timeout()LJ46;
    .locals 1

    iget-object v0, p0, LyE1;->c:Lbs4;

    invoke-virtual {v0}, Lbs4;->timeout()LJ46;

    move-result-object v0

    return-object v0
.end method

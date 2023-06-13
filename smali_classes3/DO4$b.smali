.class public final LDO4$b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDO4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u000b\u0008\u0082\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\u0006\u0010\u0014\u001a\u00020\n\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000c\u0010\u0003\u001a\u0008\u0018\u00010\u0000R\u00020\u0002J\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0008\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\u000c\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0002R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u000eR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00088\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0012\u00a8\u0006\u0018"
    }
    d2 = {
        "LDO4$b;",
        "",
        "LDO4;",
        "d",
        "",
        "c",
        "",
        "a",
        "",
        "data",
        "",
        "i",
        "b",
        "",
        "J",
        "no",
        "[B",
        "leftOver",
        "I",
        "currentLastBytePos",
        "length",
        "leftOverOfLastFilePart",
        "<init>",
        "(LDO4;JI[B)V",
        "shaketoreport_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nReversedLineReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReversedLineReader.kt\nco/bird/android/lib/shaketoreport/utils/ReversedLinesFileReader$FilePart\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,379:1\n1#2:380\n*E\n"
    }
.end annotation


# instance fields
.field public final a:J

.field public final b:[B

.field public c:[B

.field public d:I

.field public final synthetic e:LDO4;


# direct methods
.method public constructor <init>(LDO4;JI[B)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JI[B)V"
        }
    .end annotation

    iput-object p1, p0, LDO4$b;->e:LDO4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, LDO4$b;->a:J

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    array-length v1, p5

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    add-int/2addr v1, p4

    new-array v1, v1, [B

    iput-object v1, p0, LDO4$b;->b:[B

    const-wide/16 v2, 0x1

    sub-long v2, p2, v2

    invoke-static {p1}, LDO4;->access$getBlockSize$p(LDO4;)I

    move-result v4

    int-to-long v4, v4

    mul-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long p2, p2, v4

    const/4 p3, 0x1

    if-lez p2, :cond_3

    invoke-static {p1}, LDO4;->access$getChannel$p(LDO4;)Ljava/nio/channels/SeekableByteChannel;

    move-result-object p2

    invoke-interface {p2, v2, v3}, Ljava/nio/channels/SeekableByteChannel;->position(J)Ljava/nio/channels/SeekableByteChannel;

    invoke-static {p1}, LDO4;->access$getChannel$p(LDO4;)Ljava/nio/channels/SeekableByteChannel;

    move-result-object p1

    invoke-static {v1, v0, p4}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/nio/channels/SeekableByteChannel;->read(Ljava/nio/ByteBuffer;)I

    move-result p1

    if-ne p1, p4, :cond_1

    move p1, p3

    goto :goto_1

    :cond_1
    move p1, v0

    :goto_1
    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Count of requested bytes and actually read bytes don\'t match"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_2
    if-eqz p5, :cond_4

    array-length p1, p5

    invoke-static {p5, v0, v1, p4, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_4
    array-length p1, v1

    sub-int/2addr p1, p3

    iput p1, p0, LDO4$b;->d:I

    const/4 p1, 0x0

    iput-object p1, p0, LDO4$b;->c:[B

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget v0, p0, LDO4$b;->d:I

    add-int/lit8 v0, v0, 0x1

    if-lez v0, :cond_0

    new-array v1, v0, [B

    iput-object v1, p0, LDO4$b;->c:[B

    iget-object v2, p0, LDO4$b;->b:[B

    const/4 v3, 0x0

    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, LDO4$b;->c:[B

    :goto_0
    const/4 v0, -0x1

    iput v0, p0, LDO4$b;->d:I

    return-void
.end method

.method public final b([BI)I
    .locals 11

    iget-object v0, p0, LDO4$b;->e:LDO4;

    invoke-static {v0}, LDO4;->access$getNewLineSequences$p(LDO4;)[[B

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_4

    aget-object v4, v0, v3

    array-length v5, v4

    add-int/lit8 v5, v5, -0x1

    const/4 v6, 0x1

    if-ltz v5, :cond_2

    move v7, v6

    :goto_1
    add-int/lit8 v8, v5, -0x1

    add-int v9, p2, v5

    array-length v10, v4

    sub-int/2addr v10, v6

    sub-int/2addr v9, v10

    if-ltz v9, :cond_0

    aget-byte v9, p1, v9

    aget-byte v5, v4, v5

    if-ne v9, v5, :cond_0

    move v5, v6

    goto :goto_2

    :cond_0
    move v5, v2

    :goto_2
    and-int/2addr v7, v5

    if-gez v8, :cond_1

    move v6, v7

    goto :goto_3

    :cond_1
    move v5, v8

    goto :goto_1

    :cond_2
    :goto_3
    if-eqz v6, :cond_3

    array-length p1, v4

    return p1

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_4
    return v2
.end method

.method public final c()Ljava/lang/String;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-wide v0, p0, LDO4$b;->a:J

    const-wide/16 v2, 0x1

    cmp-long v0, v0, v2

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    iget v3, p0, LDO4$b;->d:I

    :cond_1
    const/4 v4, -0x1

    const/4 v5, 0x0

    if-le v3, v4, :cond_6

    if-nez v0, :cond_2

    iget-object v4, p0, LDO4$b;->e:LDO4;

    invoke-static {v4}, LDO4;->access$getAvoidNewlineSplitBufferSize$p(LDO4;)I

    move-result v4

    if-ge v3, v4, :cond_2

    invoke-virtual {p0}, LDO4$b;->a()V

    goto :goto_2

    :cond_2
    iget-object v4, p0, LDO4$b;->b:[B

    invoke-virtual {p0, v4, v3}, LDO4$b;->b([BI)I

    move-result v4

    if-lez v4, :cond_5

    add-int/lit8 v6, v3, 0x1

    iget v7, p0, LDO4$b;->d:I

    sub-int/2addr v7, v6

    add-int/2addr v7, v2

    if-ltz v7, :cond_3

    goto :goto_1

    :cond_3
    move v2, v1

    :goto_1
    if-eqz v2, :cond_4

    new-array v2, v7, [B

    iget-object v8, p0, LDO4$b;->b:[B

    invoke-static {v8, v6, v2, v1, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance v1, Ljava/lang/String;

    iget-object v6, p0, LDO4$b;->e:LDO4;

    invoke-static {v6}, LDO4;->access$getEncoding$p(LDO4;)Ljava/nio/charset/Charset;

    move-result-object v6

    invoke-direct {v1, v2, v6}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    sub-int/2addr v3, v4

    iput v3, p0, LDO4$b;->d:I

    goto :goto_3

    :cond_4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected negative line length="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_5
    iget-object v4, p0, LDO4$b;->e:LDO4;

    invoke-static {v4}, LDO4;->access$getByteDecrement$p(LDO4;)I

    move-result v4

    sub-int/2addr v3, v4

    if-gez v3, :cond_1

    invoke-virtual {p0}, LDO4$b;->a()V

    :cond_6
    :goto_2
    move-object v1, v5

    :goto_3
    if-eqz v0, :cond_7

    iget-object v0, p0, LDO4$b;->c:[B

    if-eqz v0, :cond_7

    new-instance v1, Ljava/lang/String;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v2, p0, LDO4$b;->e:LDO4;

    invoke-static {v2}, LDO4;->access$getEncoding$p(LDO4;)Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    iput-object v5, p0, LDO4$b;->c:[B

    :cond_7
    return-object v1
.end method

.method public final d()LDO4$b;
    .locals 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget v0, p0, LDO4$b;->d:I

    const/4 v1, -0x1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-gt v0, v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    if-eqz v1, :cond_4

    iget-wide v0, p0, LDO4$b;->a:J

    const-wide/16 v4, 0x1

    cmp-long v6, v0, v4

    if-lez v6, :cond_1

    new-instance v2, LDO4$b;

    iget-object v8, p0, LDO4$b;->e:LDO4;

    sub-long v9, v0, v4

    invoke-static {v8}, LDO4;->access$getBlockSize$p(LDO4;)I

    move-result v11

    iget-object v12, p0, LDO4$b;->c:[B

    move-object v7, v2

    invoke-direct/range {v7 .. v12}, LDO4$b;-><init>(LDO4;JI[B)V

    return-object v2

    :cond_1
    iget-object v0, p0, LDO4$b;->c:[B

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    move v2, v3

    :goto_1
    iget-object v1, p0, LDO4$b;->e:LDO4;

    if-eqz v2, :cond_3

    const/4 v0, 0x0

    return-object v0

    :cond_3
    new-instance v2, Ljava/lang/String;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v1}, LDO4;->access$getEncoding$p(LDO4;)Ljava/nio/charset/Charset;

    move-result-object v1

    invoke-direct {v2, v0, v1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unexpected leftover of the last block: leftOverOfThisFilePart="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Current currentLastCharPos unexpectedly positive... last readLine() should have returned something! currentLastCharPos="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

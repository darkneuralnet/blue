.class public Lcp6$d$a;
.super Landroid/media/MediaDataSource;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcp6$d;->b(Landroid/media/MediaMetadataRetriever;Ljava/nio/ByteBuffer;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic b:Ljava/nio/ByteBuffer;

.field public final synthetic c:Lcp6$d;


# direct methods
.method public constructor <init>(Lcp6$d;Ljava/nio/ByteBuffer;)V
    .locals 0

    iput-object p1, p0, Lcp6$d$a;->c:Lcp6$d;

    iput-object p2, p0, Lcp6$d$a;->b:Ljava/nio/ByteBuffer;

    invoke-direct {p0}, Landroid/media/MediaDataSource;-><init>()V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 0

    return-void
.end method

.method public getSize()J
    .locals 2

    iget-object v0, p0, Lcp6$d$a;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    int-to-long v0, v0

    return-wide v0
.end method

.method public readAt(J[BII)I
    .locals 2

    iget-object v0, p0, Lcp6$d$a;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/Buffer;->limit()I

    move-result v0

    int-to-long v0, v0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    iget-object v0, p0, Lcp6$d$a;->b:Ljava/nio/ByteBuffer;

    long-to-int p1, p1

    invoke-virtual {v0, p1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object p1, p0, Lcp6$d$a;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {p1}, Ljava/nio/Buffer;->remaining()I

    move-result p1

    invoke-static {p5, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    iget-object p2, p0, Lcp6$d$a;->b:Ljava/nio/ByteBuffer;

    invoke-virtual {p2, p3, p4, p1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    return p1
.end method
.class public abstract LHU8;
.super LeV8;
.source "SourceFile"


# instance fields
.field public final a:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, LeV8;-><init>()V

    const/16 v0, 0x8

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, LHU8;->a:Ljava/nio/ByteBuffer;

    return-void
.end method


# virtual methods
.method public final a([BII)LWW8;
    .locals 1

    array-length p2, p1

    const/4 v0, 0x0

    invoke-static {v0, p3, p2}, LyK8;->h(III)V

    invoke-virtual {p0, p1, v0, p3}, LHU8;->b([BII)V

    return-object p0
.end method

.method public b([BII)V
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method

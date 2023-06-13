.class public final LfN6;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/nio/ByteBuffer;

.field public final b:J

.field public final c:J

.field public final d:J

.field public final e:Ljava/nio/ByteBuffer;


# direct methods
.method public synthetic constructor <init>(Ljava/nio/ByteBuffer;JJJLjava/nio/ByteBuffer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LfN6;->a:Ljava/nio/ByteBuffer;

    iput-wide p2, p0, LfN6;->b:J

    iput-wide p4, p0, LfN6;->c:J

    iput-wide p6, p0, LfN6;->d:J

    iput-object p8, p0, LfN6;->e:Ljava/nio/ByteBuffer;

    return-void
.end method

.method public static synthetic a(LfN6;)Ljava/nio/ByteBuffer;
    .locals 0

    iget-object p0, p0, LfN6;->a:Ljava/nio/ByteBuffer;

    return-object p0
.end method

.method public static synthetic b(LfN6;)J
    .locals 2

    iget-wide v0, p0, LfN6;->b:J

    return-wide v0
.end method

.method public static synthetic c(LfN6;)J
    .locals 2

    iget-wide v0, p0, LfN6;->c:J

    return-wide v0
.end method

.method public static synthetic d(LfN6;)J
    .locals 2

    iget-wide v0, p0, LfN6;->d:J

    return-wide v0
.end method

.method public static synthetic e(LfN6;)Ljava/nio/ByteBuffer;
    .locals 0

    iget-object p0, p0, LfN6;->e:Ljava/nio/ByteBuffer;

    return-object p0
.end method

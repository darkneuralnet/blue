.class public final synthetic LXb1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LOb1$f;

.field public final synthetic c:Landroid/media/MediaCodec$BufferInfo;

.field public final synthetic d:Landroid/media/MediaCodec;

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(LOb1$f;Landroid/media/MediaCodec$BufferInfo;Landroid/media/MediaCodec;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXb1;->b:LOb1$f;

    iput-object p2, p0, LXb1;->c:Landroid/media/MediaCodec$BufferInfo;

    iput-object p3, p0, LXb1;->d:Landroid/media/MediaCodec;

    iput p4, p0, LXb1;->e:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, LXb1;->b:LOb1$f;

    iget-object v1, p0, LXb1;->c:Landroid/media/MediaCodec$BufferInfo;

    iget-object v2, p0, LXb1;->d:Landroid/media/MediaCodec;

    iget v3, p0, LXb1;->e:I

    invoke-static {v0, v1, v2, v3}, LOb1$f;->f(LOb1$f;Landroid/media/MediaCodec$BufferInfo;Landroid/media/MediaCodec;I)V

    return-void
.end method

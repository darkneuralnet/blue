.class public final synthetic LVb1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LOb1$f;

.field public final synthetic c:Landroid/media/MediaCodec$CodecException;


# direct methods
.method public synthetic constructor <init>(LOb1$f;Landroid/media/MediaCodec$CodecException;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LVb1;->b:LOb1$f;

    iput-object p2, p0, LVb1;->c:Landroid/media/MediaCodec$CodecException;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LVb1;->b:LOb1$f;

    iget-object v1, p0, LVb1;->c:Landroid/media/MediaCodec$CodecException;

    invoke-static {v0, v1}, LOb1$f;->d(LOb1$f;Landroid/media/MediaCodec$CodecException;)V

    return-void
.end method

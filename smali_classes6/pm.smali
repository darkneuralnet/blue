.class public final synthetic Lpm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Landroid/media/Image;

.field public final synthetic c:Ljava/nio/ByteBuffer;


# direct methods
.method public synthetic constructor <init>(Landroid/media/Image;Ljava/nio/ByteBuffer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpm;->b:Landroid/media/Image;

    iput-object p2, p0, Lpm;->c:Ljava/nio/ByteBuffer;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lpm;->b:Landroid/media/Image;

    iget-object v1, p0, Lpm;->c:Ljava/nio/ByteBuffer;

    invoke-static {v0, v1}, Lqm;->a(Landroid/media/Image;Ljava/nio/ByteBuffer;)V

    return-void
.end method

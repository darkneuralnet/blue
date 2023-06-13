.class public final LFd8;
.super Laf8;
.source "SourceFile"

# interfaces
.implements LRb8;


# instance fields
.field public final b:Ljava/io/FileOutputStream;

.field public final c:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/FileOutputStream;Ljava/io/File;)V
    .locals 0

    invoke-direct {p0, p1}, Laf8;-><init>(Ljava/io/OutputStream;)V

    iput-object p1, p0, LFd8;->b:Ljava/io/FileOutputStream;

    iput-object p2, p0, LFd8;->c:Ljava/io/File;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    iget-object v0, p0, LFd8;->b:Ljava/io/FileOutputStream;

    invoke-virtual {v0}, Ljava/io/FileOutputStream;->getFD()Ljava/io/FileDescriptor;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/FileDescriptor;->sync()V

    return-void
.end method

.method public final zza()Ljava/io/File;
    .locals 1

    iget-object v0, p0, LFd8;->c:Ljava/io/File;

    return-object v0
.end method

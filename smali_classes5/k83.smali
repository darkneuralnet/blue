.class public final synthetic Lk83;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static bridge synthetic a(Ljava/nio/file/spi/FileSystemProvider;)Ljava/lang/String;
    .locals 0

    invoke-virtual {p0}, Ljava/nio/file/spi/FileSystemProvider;->getScheme()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

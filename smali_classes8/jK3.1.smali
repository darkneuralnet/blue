.class public final synthetic LjK3;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static bridge synthetic a(Ljava/nio/file/attribute/BasicFileAttributeView;)Ljava/nio/file/attribute/BasicFileAttributes;
    .locals 0

    invoke-interface {p0}, Ljava/nio/file/attribute/BasicFileAttributeView;->readAttributes()Ljava/nio/file/attribute/BasicFileAttributes;

    move-result-object p0

    return-object p0
.end method

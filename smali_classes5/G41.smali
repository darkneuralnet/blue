.class public LG41;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz41$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LG41$a;
    }
.end annotation


# instance fields
.field public final a:J

.field public final b:LG41$a;


# direct methods
.method public constructor <init>(LG41$a;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p2, p0, LG41;->a:J

    iput-object p1, p0, LG41;->b:LG41$a;

    return-void
.end method


# virtual methods
.method public build()Lz41;
    .locals 3

    iget-object v0, p0, LG41;->b:LG41$a;

    invoke-interface {v0}, LG41$a;->a()Ljava/io/File;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    return-object v1

    :cond_2
    :goto_0
    iget-wide v1, p0, LG41;->a:J

    invoke-static {v0, v1, v2}, LH41;->c(Ljava/io/File;J)Lz41;

    move-result-object v0

    return-object v0
.end method

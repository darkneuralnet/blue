.class public final Lxg5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LnV5$c;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001B3\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0006\u0010\u0014\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0008\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0007R\u0016\u0010\u000c\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0017"
    }
    d2 = {
        "Lxg5;",
        "LnV5$c;",
        "LnV5$b;",
        "configuration",
        "LnV5;",
        "a",
        "",
        "Ljava/lang/String;",
        "mCopyFromAssetPath",
        "Ljava/io/File;",
        "b",
        "Ljava/io/File;",
        "mCopyFromFile",
        "Ljava/util/concurrent/Callable;",
        "Ljava/io/InputStream;",
        "c",
        "Ljava/util/concurrent/Callable;",
        "mCopyFromInputStream",
        "d",
        "LnV5$c;",
        "mDelegate",
        "<init>",
        "(Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;LnV5$c;)V",
        "room-runtime_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/io/File;

.field public final c:Ljava/util/concurrent/Callable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/Callable<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LnV5$c;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;LnV5$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            "Ljava/util/concurrent/Callable<",
            "Ljava/io/InputStream;",
            ">;",
            "LnV5$c;",
            ")V"
        }
    .end annotation

    const-string v0, "mDelegate"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxg5;->a:Ljava/lang/String;

    iput-object p2, p0, Lxg5;->b:Ljava/io/File;

    iput-object p3, p0, Lxg5;->c:Ljava/util/concurrent/Callable;

    iput-object p4, p0, Lxg5;->d:LnV5$c;

    return-void
.end method


# virtual methods
.method public a(LnV5$b;)LnV5;
    .locals 8

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwg5;

    iget-object v2, p1, LnV5$b;->a:Landroid/content/Context;

    iget-object v3, p0, Lxg5;->a:Ljava/lang/String;

    iget-object v4, p0, Lxg5;->b:Ljava/io/File;

    iget-object v5, p0, Lxg5;->c:Ljava/util/concurrent/Callable;

    iget-object v1, p1, LnV5$b;->c:LnV5$a;

    iget v6, v1, LnV5$a;->a:I

    iget-object v1, p0, Lxg5;->d:LnV5$c;

    invoke-interface {v1, p1}, LnV5$c;->a(LnV5$b;)LnV5;

    move-result-object v7

    move-object v1, v0

    invoke-direct/range {v1 .. v7}, Lwg5;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;ILnV5;)V

    return-object v0
.end method

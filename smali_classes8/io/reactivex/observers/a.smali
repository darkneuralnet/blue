.class public abstract Lio/reactivex/observers/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/disposables/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        "U:",
        "Lio/reactivex/observers/a<",
        "TT;TU;>;>",
        "Ljava/lang/Object;",
        "Lio/reactivex/disposables/c;"
    }
.end annotation


# instance fields
.field public final b:Ljava/util/concurrent/CountDownLatch;

.field public final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Throwable;",
            ">;"
        }
    .end annotation
.end field

.field public e:J

.field public f:Ljava/lang/Thread;

.field public g:Z

.field public h:I

.field public i:I


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lio/reactivex/internal/util/t;

    invoke-direct {v0}, Lio/reactivex/internal/util/t;-><init>()V

    iput-object v0, p0, Lio/reactivex/observers/a;->c:Ljava/util/List;

    new-instance v0, Lio/reactivex/internal/util/t;

    invoke-direct {v0}, Lio/reactivex/internal/util/t;-><init>()V

    iput-object v0, p0, Lio/reactivex/observers/a;->d:Ljava/util/List;

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iput-object v0, p0, Lio/reactivex/observers/a;->b:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method

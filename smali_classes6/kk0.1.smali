.class public final Lkk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Lio/reactivex/E;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Ljava/util/concurrent/ExecutorService;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LZ94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Ljava/util/concurrent/ExecutorService;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkk0;->a:LZ94;

    return-void
.end method

.method public static a(LZ94;)Lkk0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Ljava/util/concurrent/ExecutorService;",
            ">;)",
            "Lkk0;"
        }
    .end annotation

    new-instance v0, Lkk0;

    invoke-direct {v0, p0}, Lkk0;-><init>(LZ94;)V

    return-object v0
.end method

.method public static c(Ljava/util/concurrent/ExecutorService;)Lio/reactivex/E;
    .locals 0

    invoke-static {p0}, Lgk0$c;->d(Ljava/util/concurrent/ExecutorService;)Lio/reactivex/E;

    move-result-object p0

    invoke-static {p0}, LyZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/E;

    return-object p0
.end method


# virtual methods
.method public b()Lio/reactivex/E;
    .locals 1

    iget-object v0, p0, Lkk0;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ExecutorService;

    invoke-static {v0}, Lkk0;->c(Ljava/util/concurrent/ExecutorService;)Lio/reactivex/E;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lkk0;->b()Lio/reactivex/E;

    move-result-object v0

    return-object v0
.end method

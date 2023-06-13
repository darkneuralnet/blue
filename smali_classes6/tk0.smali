.class public final Ltk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Lgk0$b;",
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

.field public final b:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lio/reactivex/E;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Ljava/util/concurrent/ExecutorService;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LZ94;LZ94;LZ94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Ljava/util/concurrent/ExecutorService;",
            ">;",
            "LZ94<",
            "Lio/reactivex/E;",
            ">;",
            "LZ94<",
            "Ljava/util/concurrent/ExecutorService;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltk0;->a:LZ94;

    iput-object p2, p0, Ltk0;->b:LZ94;

    iput-object p3, p0, Ltk0;->c:LZ94;

    return-void
.end method

.method public static a(LZ94;LZ94;LZ94;)Ltk0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Ljava/util/concurrent/ExecutorService;",
            ">;",
            "LZ94<",
            "Lio/reactivex/E;",
            ">;",
            "LZ94<",
            "Ljava/util/concurrent/ExecutorService;",
            ">;)",
            "Ltk0;"
        }
    .end annotation

    new-instance v0, Ltk0;

    invoke-direct {v0, p0, p1, p2}, Ltk0;-><init>(LZ94;LZ94;LZ94;)V

    return-object v0
.end method

.method public static c(Ljava/util/concurrent/ExecutorService;Lio/reactivex/E;Ljava/util/concurrent/ExecutorService;)Lgk0$b;
    .locals 0

    invoke-static {p0, p1, p2}, Lgk0$c;->m(Ljava/util/concurrent/ExecutorService;Lio/reactivex/E;Ljava/util/concurrent/ExecutorService;)Lgk0$b;

    move-result-object p0

    invoke-static {p0}, LyZ3;->d(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgk0$b;

    return-object p0
.end method


# virtual methods
.method public b()Lgk0$b;
    .locals 3

    iget-object v0, p0, Ltk0;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/concurrent/ExecutorService;

    iget-object v1, p0, Ltk0;->b:LZ94;

    invoke-interface {v1}, LZ94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/reactivex/E;

    iget-object v2, p0, Ltk0;->c:LZ94;

    invoke-interface {v2}, LZ94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/ExecutorService;

    invoke-static {v0, v1, v2}, Ltk0;->c(Ljava/util/concurrent/ExecutorService;Lio/reactivex/E;Ljava/util/concurrent/ExecutorService;)Lgk0$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Ltk0;->b()Lgk0$b;

    move-result-object v0

    return-object v0
.end method

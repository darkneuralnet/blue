.class public final Lsy0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ltj1<",
        "Lry0;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lw41;",
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

.field public final d:LZ94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LZ94<",
            "Lio/reactivex/E;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LZ94;LZ94;LZ94;LZ94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Ljava/lang/String;",
            ">;",
            "LZ94<",
            "Lw41;",
            ">;",
            "LZ94<",
            "Ljava/util/concurrent/ExecutorService;",
            ">;",
            "LZ94<",
            "Lio/reactivex/E;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsy0;->a:LZ94;

    iput-object p2, p0, Lsy0;->b:LZ94;

    iput-object p3, p0, Lsy0;->c:LZ94;

    iput-object p4, p0, Lsy0;->d:LZ94;

    return-void
.end method

.method public static a(LZ94;LZ94;LZ94;LZ94;)Lsy0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZ94<",
            "Ljava/lang/String;",
            ">;",
            "LZ94<",
            "Lw41;",
            ">;",
            "LZ94<",
            "Ljava/util/concurrent/ExecutorService;",
            ">;",
            "LZ94<",
            "Lio/reactivex/E;",
            ">;)",
            "Lsy0;"
        }
    .end annotation

    new-instance v0, Lsy0;

    invoke-direct {v0, p0, p1, p2, p3}, Lsy0;-><init>(LZ94;LZ94;LZ94;LZ94;)V

    return-object v0
.end method

.method public static c(Ljava/lang/String;Lw41;Ljava/util/concurrent/ExecutorService;Lio/reactivex/E;)Lry0;
    .locals 1

    new-instance v0, Lry0;

    invoke-direct {v0, p0, p1, p2, p3}, Lry0;-><init>(Ljava/lang/String;Lw41;Ljava/util/concurrent/ExecutorService;Lio/reactivex/E;)V

    return-object v0
.end method


# virtual methods
.method public b()Lry0;
    .locals 4

    iget-object v0, p0, Lsy0;->a:LZ94;

    invoke-interface {v0}, LZ94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lsy0;->b:LZ94;

    invoke-interface {v1}, LZ94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw41;

    iget-object v2, p0, Lsy0;->c:LZ94;

    invoke-interface {v2}, LZ94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/ExecutorService;

    iget-object v3, p0, Lsy0;->d:LZ94;

    invoke-interface {v3}, LZ94;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/reactivex/E;

    invoke-static {v0, v1, v2, v3}, Lsy0;->c(Ljava/lang/String;Lw41;Ljava/util/concurrent/ExecutorService;Lio/reactivex/E;)Lry0;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lsy0;->b()Lry0;

    move-result-object v0

    return-object v0
.end method

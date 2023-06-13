.class public Lgk0$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgk0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgk0$c;->m(Ljava/util/concurrent/ExecutorService;Lio/reactivex/E;Ljava/util/concurrent/ExecutorService;)Lgk0$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/util/concurrent/ExecutorService;

.field public final synthetic b:Lio/reactivex/E;

.field public final synthetic c:Ljava/util/concurrent/ExecutorService;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/ExecutorService;Lio/reactivex/E;Ljava/util/concurrent/ExecutorService;)V
    .locals 0

    iput-object p1, p0, Lgk0$c$a;->a:Ljava/util/concurrent/ExecutorService;

    iput-object p2, p0, Lgk0$c$a;->b:Lio/reactivex/E;

    iput-object p3, p0, Lgk0$c$a;->c:Ljava/util/concurrent/ExecutorService;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lgk0$c$a;->a:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    iget-object v0, p0, Lgk0$c$a;->b:Lio/reactivex/E;

    invoke-virtual {v0}, Lio/reactivex/E;->shutdown()V

    iget-object v0, p0, Lgk0$c$a;->c:Ljava/util/concurrent/ExecutorService;

    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    return-void
.end method

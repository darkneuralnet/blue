.class public final synthetic LQP2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:LSP2;

.field public final synthetic c:Lcom/google/firebase/perf/util/Timer;


# direct methods
.method public synthetic constructor <init>(LSP2;Lcom/google/firebase/perf/util/Timer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQP2;->b:LSP2;

    iput-object p2, p0, LQP2;->c:Lcom/google/firebase/perf/util/Timer;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LQP2;->b:LSP2;

    iget-object v1, p0, LQP2;->c:Lcom/google/firebase/perf/util/Timer;

    invoke-static {v0, v1}, LSP2;->a(LSP2;Lcom/google/firebase/perf/util/Timer;)V

    return-void
.end method

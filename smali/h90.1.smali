.class public final synthetic Lh90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lr90;

.field public final synthetic c:Ljava/util/concurrent/Executor;

.field public final synthetic d:Lpa0;


# direct methods
.method public synthetic constructor <init>(Lr90;Ljava/util/concurrent/Executor;Lpa0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh90;->b:Lr90;

    iput-object p2, p0, Lh90;->c:Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lh90;->d:Lpa0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lh90;->b:Lr90;

    iget-object v1, p0, Lh90;->c:Ljava/util/concurrent/Executor;

    iget-object v2, p0, Lh90;->d:Lpa0;

    invoke-static {v0, v1, v2}, Lr90;->q(Lr90;Ljava/util/concurrent/Executor;Lpa0;)V

    return-void
.end method

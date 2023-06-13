.class public final Lrb9;
.super Ljava/util/concurrent/locks/AbstractOwnableSynchronizer;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final b:LFb9;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LFb9<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public synthetic constructor <init>(LFb9;Llb9;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/locks/AbstractOwnableSynchronizer;-><init>()V

    iput-object p1, p0, Lrb9;->b:LFb9;

    return-void
.end method

.method public static synthetic a(Lrb9;Ljava/lang/Thread;)V
    .locals 0

    invoke-super {p0, p1}, Ljava/util/concurrent/locks/AbstractOwnableSynchronizer;->setExclusiveOwnerThread(Ljava/lang/Thread;)V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 0

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lrb9;->b:LFb9;

    invoke-virtual {v0}, LFb9;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

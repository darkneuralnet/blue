.class public Lio/reactivex/internal/subscribers/g;
.super Lio/reactivex/internal/subscribers/f;
.source "SourceFile"


# instance fields
.field public final c:Ljava/util/concurrent/atomic/AtomicLong;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lio/reactivex/internal/subscribers/f;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object v0, p0, Lio/reactivex/internal/subscribers/g;->c:Ljava/util/concurrent/atomic/AtomicLong;

    return-void
.end method

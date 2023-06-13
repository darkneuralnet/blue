.class Lzendesk/messaging/ObservableCounter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzendesk/messaging/ObservableCounter$OnCountCompletedListener;
    }
.end annotation


# instance fields
.field private final counter:Ljava/util/concurrent/atomic/AtomicInteger;

.field private final onCountCompletedListener:Lzendesk/messaging/ObservableCounter$OnCountCompletedListener;


# direct methods
.method public constructor <init>(Lzendesk/messaging/ObservableCounter$OnCountCompletedListener;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v0, p0, Lzendesk/messaging/ObservableCounter;->counter:Ljava/util/concurrent/atomic/AtomicInteger;

    iput-object p1, p0, Lzendesk/messaging/ObservableCounter;->onCountCompletedListener:Lzendesk/messaging/ObservableCounter$OnCountCompletedListener;

    return-void
.end method


# virtual methods
.method public increment(I)V
    .locals 1

    iget-object v0, p0, Lzendesk/messaging/ObservableCounter;->counter:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->addAndGet(I)I

    return-void
.end method

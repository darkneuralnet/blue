.class Lzendesk/support/suas/CombinedReducer$ReduceResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/support/suas/CombinedReducer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ReduceResult"
.end annotation


# instance fields
.field private final newState:Lzendesk/support/suas/State;

.field private final updatedKeys:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/Collection;Lzendesk/support/suas/State;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Lzendesk/support/suas/State;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzendesk/support/suas/CombinedReducer$ReduceResult;->updatedKeys:Ljava/util/Collection;

    iput-object p2, p0, Lzendesk/support/suas/CombinedReducer$ReduceResult;->newState:Lzendesk/support/suas/State;

    return-void
.end method


# virtual methods
.method public getNewState()Lzendesk/support/suas/State;
    .locals 1

    iget-object v0, p0, Lzendesk/support/suas/CombinedReducer$ReduceResult;->newState:Lzendesk/support/suas/State;

    return-object v0
.end method

.method public getUpdatedKeys()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzendesk/support/suas/CombinedReducer$ReduceResult;->updatedKeys:Ljava/util/Collection;

    return-object v0
.end method

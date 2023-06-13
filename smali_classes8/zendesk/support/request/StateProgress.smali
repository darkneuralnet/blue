.class Lzendesk/support/request/StateProgress;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field private final runningRequests:I


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lzendesk/support/request/StateProgress;->runningRequests:I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lzendesk/support/request/StateProgress;->runningRequests:I

    return-void
.end method

.method public static fomState(Lzendesk/support/suas/State;)Lzendesk/support/request/StateProgress;
    .locals 1

    const-class v0, Lzendesk/support/request/StateProgress;

    invoke-virtual {p0, v0}, Lzendesk/support/suas/State;->getState(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzendesk/support/request/StateProgress;

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Lzendesk/support/request/StateProgress;

    invoke-direct {p0}, Lzendesk/support/request/StateProgress;-><init>()V

    return-object p0
.end method


# virtual methods
.method public decrement()Lzendesk/support/request/StateProgress;
    .locals 2

    iget v0, p0, Lzendesk/support/request/StateProgress;->runningRequests:I

    if-lez v0, :cond_0

    new-instance v1, Lzendesk/support/request/StateProgress;

    add-int/lit8 v0, v0, -0x1

    invoke-direct {v1, v0}, Lzendesk/support/request/StateProgress;-><init>(I)V

    return-object v1

    :cond_0
    new-instance v0, Lzendesk/support/request/StateProgress;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lzendesk/support/request/StateProgress;-><init>(I)V

    return-object v0
.end method

.method public getRunningRequests()I
    .locals 1

    iget v0, p0, Lzendesk/support/request/StateProgress;->runningRequests:I

    return v0
.end method

.method public increment()Lzendesk/support/request/StateProgress;
    .locals 2

    new-instance v0, Lzendesk/support/request/StateProgress;

    iget v1, p0, Lzendesk/support/request/StateProgress;->runningRequests:I

    add-int/lit8 v1, v1, 0x1

    invoke-direct {v0, v1}, Lzendesk/support/request/StateProgress;-><init>(I)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Progress{runningRequests="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lzendesk/support/request/StateProgress;->runningRequests:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

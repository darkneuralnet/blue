.class Lzendesk/support/requestlist/CancelableCompositeCallback;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private zendeskCallbacks:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lyh5;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lzendesk/support/requestlist/CancelableCompositeCallback;->zendeskCallbacks:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public add(Lyh5;)V
    .locals 1

    iget-object v0, p0, Lzendesk/support/requestlist/CancelableCompositeCallback;->zendeskCallbacks:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public varargs add([Lyh5;)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_0

    aget-object v1, p1, v0

    invoke-virtual {p0, v1}, Lzendesk/support/requestlist/CancelableCompositeCallback;->add(Lyh5;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public cancel()V
    .locals 2

    iget-object v0, p0, Lzendesk/support/requestlist/CancelableCompositeCallback;->zendeskCallbacks:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lyh5;

    invoke-virtual {v1}, Lyh5;->cancel()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lzendesk/support/requestlist/CancelableCompositeCallback;->zendeskCallbacks:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    return-void
.end method

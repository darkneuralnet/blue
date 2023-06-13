.class abstract Lzendesk/core/PassThroughErrorZendeskCallback;
.super LlI6;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LlI6<",
        "TE;>;"
    }
.end annotation


# instance fields
.field private final callback:LlI6;


# direct methods
.method public constructor <init>(LlI6;)V
    .locals 0

    invoke-direct {p0}, LlI6;-><init>()V

    iput-object p1, p0, Lzendesk/core/PassThroughErrorZendeskCallback;->callback:LlI6;

    return-void
.end method


# virtual methods
.method public onError(Lsg1;)V
    .locals 1

    iget-object v0, p0, Lzendesk/core/PassThroughErrorZendeskCallback;->callback:LlI6;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, LlI6;->onError(Lsg1;)V

    :cond_0
    return-void
.end method

.method public abstract onSuccess(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation
.end method

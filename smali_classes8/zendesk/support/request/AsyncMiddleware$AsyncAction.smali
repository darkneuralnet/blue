.class interface abstract Lzendesk/support/request/AsyncMiddleware$AsyncAction;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lzendesk/support/request/AsyncMiddleware;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "AsyncAction"
.end annotation


# virtual methods
.method public abstract actionQueued(Lzendesk/support/suas/Dispatcher;Lzendesk/support/suas/GetState;)V
.end method

.method public abstract execute(Lzendesk/support/suas/Dispatcher;Lzendesk/support/suas/GetState;Lzendesk/support/request/AsyncMiddleware$Callback;)V
.end method

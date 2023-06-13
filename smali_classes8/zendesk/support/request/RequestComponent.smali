.class public interface abstract Lzendesk/support/request/RequestComponent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Subcomponent;
    modules = {
        Lzendesk/support/request/RequestModule;
    }
.end annotation


# virtual methods
.method public abstract inject(Lzendesk/support/request/RequestActivity;)V
.end method

.method public abstract inject(Lzendesk/support/request/RequestViewConversationsDisabled;)V
.end method

.method public abstract inject(Lzendesk/support/request/RequestViewConversationsEnabled;)V
.end method

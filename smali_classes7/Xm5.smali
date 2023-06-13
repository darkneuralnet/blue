.class public final synthetic LXm5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lcom/uber/autodispose/ScopeProvider;


# direct methods
.method public synthetic constructor <init>(Lcom/uber/autodispose/ScopeProvider;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LXm5;->b:Lcom/uber/autodispose/ScopeProvider;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LXm5;->b:Lcom/uber/autodispose/ScopeProvider;

    invoke-static {v0}, Lcom/uber/autodispose/Scopes;->a(Lcom/uber/autodispose/ScopeProvider;)Lio/reactivex/h;

    move-result-object v0

    return-object v0
.end method

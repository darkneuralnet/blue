.class public final LWF6;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LVF6;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LXF6;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LJF6;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LXF6;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "LJF6;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LWF6;->a:LY94;

    iput-object p2, p0, LWF6;->b:LY94;

    iput-object p3, p0, LWF6;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)LWF6;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "LXF6;",
            ">;",
            "LY94<",
            "Lcom/uber/autodispose/ScopeProvider;",
            ">;",
            "LY94<",
            "LJF6;",
            ">;)",
            "LWF6;"
        }
    .end annotation

    new-instance v0, LWF6;

    invoke-direct {v0, p0, p1, p2}, LWF6;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(LXF6;Lcom/uber/autodispose/ScopeProvider;LJF6;)LVF6;
    .locals 1

    new-instance v0, LVF6;

    invoke-direct {v0, p0, p1, p2}, LVF6;-><init>(LXF6;Lcom/uber/autodispose/ScopeProvider;LJF6;)V

    return-object v0
.end method


# virtual methods
.method public b()LVF6;
    .locals 3

    iget-object v0, p0, LWF6;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LXF6;

    iget-object v1, p0, LWF6;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/uber/autodispose/ScopeProvider;

    iget-object v2, p0, LWF6;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LJF6;

    invoke-static {v0, v1, v2}, LWF6;->c(LXF6;Lcom/uber/autodispose/ScopeProvider;LJF6;)LVF6;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LWF6;->b()LVF6;

    move-result-object v0

    return-object v0
.end method

.class public final LRH2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/uber/autodispose/ScopeProvider;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LwH2$c;


# direct methods
.method public constructor <init>(LwH2$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LRH2;->a:LwH2$c;

    return-void
.end method

.method public static a(LwH2$c;)LRH2;
    .locals 1

    new-instance v0, LRH2;

    invoke-direct {v0, p0}, LRH2;-><init>(LwH2$c;)V

    return-object v0
.end method

.method public static c(LwH2$c;)Lcom/uber/autodispose/ScopeProvider;
    .locals 0

    invoke-virtual {p0}, LwH2$c;->d()Lcom/uber/autodispose/ScopeProvider;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/uber/autodispose/ScopeProvider;

    return-object p0
.end method


# virtual methods
.method public b()Lcom/uber/autodispose/ScopeProvider;
    .locals 1

    iget-object v0, p0, LRH2;->a:LwH2$c;

    invoke-static {v0}, LRH2;->c(LwH2$c;)Lcom/uber/autodispose/ScopeProvider;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LRH2;->b()Lcom/uber/autodispose/ScopeProvider;

    move-result-object v0

    return-object v0
.end method

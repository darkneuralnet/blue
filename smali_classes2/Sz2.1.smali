.class public final LSz2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LRz2;


# instance fields
.field public final a:LTz2;


# direct methods
.method public constructor <init>(LTz2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LSz2;->a:LTz2;

    return-void
.end method

.method public static b(LTz2;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LTz2;",
            ")",
            "LY94<",
            "LRz2;",
            ">;"
        }
    .end annotation

    new-instance v0, LSz2;

    invoke-direct {v0, p0}, LSz2;-><init>(LTz2;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(LQA2;Lcom/uber/autodispose/ScopeProvider;Lpz2;Le13;)LQz2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LQA2;",
            "Lcom/uber/autodispose/ScopeProvider;",
            "Lpz2<",
            "Lc01;",
            ">;",
            "Le13;",
            ")",
            "LQz2;"
        }
    .end annotation

    iget-object v0, p0, LSz2;->a:LTz2;

    invoke-virtual {v0, p1, p2, p3, p4}, LTz2;->b(LQA2;Lcom/uber/autodispose/ScopeProvider;Lpz2;Le13;)LQz2;

    move-result-object p1

    return-object p1
.end method

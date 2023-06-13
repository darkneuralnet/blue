.class public final LzS3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LyS3;


# instance fields
.field public final a:LAS3;


# direct methods
.method public constructor <init>(LAS3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LzS3;->a:LAS3;

    return-void
.end method

.method public static b(LAS3;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LAS3;",
            ")",
            "LY94<",
            "LyS3;",
            ">;"
        }
    .end annotation

    new-instance v0, LzS3;

    invoke-direct {v0, p0}, LzS3;-><init>(LAS3;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LBS3;Le13;)LxS3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LBS3;",
            "Le13;",
            ")",
            "LxS3;"
        }
    .end annotation

    iget-object v0, p0, LzS3;->a:LAS3;

    invoke-virtual {v0, p1, p2, p3}, LAS3;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LBS3;Le13;)LxS3;

    move-result-object p1

    return-object p1
.end method

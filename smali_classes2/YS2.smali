.class public final LYS2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LXS2;


# instance fields
.field public final a:LZS2;


# direct methods
.method public constructor <init>(LZS2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYS2;->a:LZS2;

    return-void
.end method

.method public static b(LZS2;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZS2;",
            ")",
            "LY94<",
            "LXS2;",
            ">;"
        }
    .end annotation

    new-instance v0, LYS2;

    invoke-direct {v0, p0}, LYS2;-><init>(LZS2;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LDQ3;LcT2;Le13;)LWS2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "LDQ3;",
            "LcT2;",
            "Le13;",
            ")",
            "LWS2;"
        }
    .end annotation

    iget-object v0, p0, LYS2;->a:LZS2;

    invoke-virtual {v0, p1, p2, p3, p4}, LZS2;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;LDQ3;LcT2;Le13;)LWS2;

    move-result-object p1

    return-object p1
.end method

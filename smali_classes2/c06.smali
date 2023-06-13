.class public final Lc06;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb06;


# instance fields
.field public final a:Ld06;


# direct methods
.method public constructor <init>(Ld06;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc06;->a:Ld06;

    return-void
.end method

.method public static b(Ld06;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld06;",
            ")",
            "LY94<",
            "Lb06;",
            ">;"
        }
    .end annotation

    new-instance v0, Lc06;

    invoke-direct {v0, p0}, Lc06;-><init>(Ld06;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lf06;Le13;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;)La06;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf06;",
            "Le13;",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;)",
            "La06;"
        }
    .end annotation

    iget-object v0, p0, Lc06;->a:Ld06;

    invoke-virtual {v0, p1, p2, p3}, Ld06;->b(Lf06;Le13;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;)La06;

    move-result-object p1

    return-object p1
.end method

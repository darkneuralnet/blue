.class public final Lch0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbh0;


# instance fields
.field public final a:Ldh0;


# direct methods
.method public constructor <init>(Ldh0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch0;->a:Ldh0;

    return-void
.end method

.method public static b(Ldh0;)LY94;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldh0;",
            ")",
            "LY94<",
            "Lbh0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lch0;

    invoke-direct {v0, p0}, Lch0;-><init>(Ldh0;)V

    invoke-static {v0}, Ld52;->a(Ljava/lang/Object;)Lsj1;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Leh0;Le13;)Lah0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider<",
            "LRE;",
            ">;",
            "Leh0;",
            "Le13;",
            ")",
            "Lah0;"
        }
    .end annotation

    iget-object v0, p0, Lch0;->a:Ldh0;

    invoke-virtual {v0, p1, p2, p3}, Ldh0;->b(Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Leh0;Le13;)Lah0;

    move-result-object p1

    return-object p1
.end method

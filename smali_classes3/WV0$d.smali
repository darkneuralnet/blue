.class public final LWV0$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWV0;->d(Lio/reactivex/p;Z)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "LcW0;",
        "+",
        "Landroid/content/Intent;",
        ">;",
        "LPL4;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lkotlin/Pair;",
        "LcW0;",
        "Landroid/content/Intent;",
        "<name for destructuring parameter 0>",
        "LPL4;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lkotlin/Pair;)LPL4;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LWV0;

.field public final synthetic h:Z


# direct methods
.method public constructor <init>(LWV0;Z)V
    .locals 0

    iput-object p1, p0, LWV0$d;->g:LWV0;

    iput-boolean p2, p0, LWV0$d;->h:Z

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlin/Pair;)LPL4;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "+",
            "LcW0;",
            "+",
            "Landroid/content/Intent;",
            ">;)",
            "LPL4;"
        }
    .end annotation

    const-string v0, "<name for destructuring parameter 0>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LcW0;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/Intent;

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Landroid/content/Intent;->toUri(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "parsed intent: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v3, v1, [Ljava/lang/Object;

    invoke-static {v2, v3}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p1, v0}, LaW0;->access$copyWithDataFrom(Landroid/content/Intent;LcW0;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/content/Intent;->toUri(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "resolved intent: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v2, v1}, Lg46;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    instance-of v1, v0, Lcf6;

    if-eqz v1, :cond_0

    new-instance v1, LWV0$b;

    iget-object v2, p0, LWV0$d;->g:LWV0;

    move-object v3, v0

    check-cast v3, Lcf6;

    invoke-virtual {v3}, Lcf6;->b()Landroid/content/Intent;

    move-result-object v3

    invoke-direct {v1, v2, v3}, LWV0$b;-><init>(LWV0;Landroid/content/Intent;)V

    goto :goto_0

    :cond_0
    instance-of v1, v0, LKV0;

    if-eqz v1, :cond_2

    iget-object v1, p0, LWV0$d;->g:LWV0;

    iget-boolean v2, p0, LWV0$d;->h:Z

    invoke-virtual {v1, p1, v2}, LWV0;->n(Landroid/content/Intent;Z)LoW0;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v2, p0, LWV0$d;->g:LWV0;

    invoke-static {v2}, LWV0;->access$getDeepLinkManager$p(LWV0;)LhW0;

    move-result-object v2

    invoke-interface {v2, v1}, LhW0;->d(LoW0;)V

    :cond_1
    iget-object v1, p0, LWV0$d;->g:LWV0;

    iget-boolean v2, p0, LWV0$d;->h:Z

    invoke-static {v1, p1, v2}, LWV0;->access$toDeepLinkNavigator(LWV0;Landroid/content/Intent;Z)LMV0;

    move-result-object v1

    :goto_0
    new-instance v2, LPL4;

    invoke-direct {v2, v0, v1, p1}, LPL4;-><init>(LcW0;LMV0;Landroid/content/Intent;)V

    return-object v2

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, LWV0$d;->a(Lkotlin/Pair;)LPL4;

    move-result-object p1

    return-object p1
.end method

.class public final Li25$l2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Li25;-><init>(LTq4;Lbn;LpJ;LYR4;LXc1;LaM;Lq54;Ldr4;LGI3;Lla2;LMK4;Lys0;LoI5;Lde5;LV74;LBf1;LGl1;LEg1;Landroid/os/Handler;Lgl;Llh6;LEa;LpM3;LXX4;LzN3;LWX2;LpU4;LoF3;LQz1;LBl5;LWg6;LTL;LWU4;LMc2;Lwi2;Llw0;Ltm;LhW0;Lq95;Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;Landroid/content/Context;LG95;LP75;LwQ2;Le13;LDQ3;LsJ4;Lbz1;LZr1;LL44;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function0<",
        "LVX4;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "LVX4;",
        "b",
        "()LVX4;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Li25;


# direct methods
.method public constructor <init>(Li25;)V
    .locals 0

    iput-object p1, p0, Li25$l2;->g:Li25;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b()LVX4;
    .locals 5

    iget-object v0, p0, Li25$l2;->g:Li25;

    invoke-static {v0}, Li25;->access$getRidepaymentIntentDelegateFactory$p(Li25;)LXX4;

    move-result-object v0

    iget-object v1, p0, Li25$l2;->g:Li25;

    invoke-static {v1}, Li25;->access$getJsonDeserializer$p(Li25;)Lwi2;

    move-result-object v1

    iget-object v2, p0, Li25$l2;->g:Li25;

    invoke-static {v2}, Li25;->access$getScopeProvider$p(Li25;)Lcom/uber/autodispose/lifecycle/LifecycleScopeProvider;

    move-result-object v2

    iget-object v3, p0, Li25$l2;->g:Li25;

    invoke-static {v3}, Li25;->access$getContext$p(Li25;)Landroid/content/Context;

    move-result-object v3

    const-string v4, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Landroidx/appcompat/app/AppCompatActivity;

    invoke-interface {v0, v1, v2, v3}, LXX4;->a(Lwi2;Lcom/uber/autodispose/ScopeProvider;Landroidx/appcompat/app/AppCompatActivity;)LVX4;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li25$l2;->b()LVX4;

    move-result-object v0

    return-object v0
.end method

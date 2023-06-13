.class public final Li25$p2;
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
        "LZ84<",
        "Ljava/lang/Boolean;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0010\u0005\u001a\u0010\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "LZ84;",
        "",
        "kotlin.jvm.PlatformType",
        "invoke",
        "()LZ84;",
        "<anonymous>"
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

    iput-object p1, p0, Li25$p2;->g:Li25;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()LZ84;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LZ84<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    sget-object v0, LZ84;->d:LZ84$a;

    iget-object v1, p0, Li25$p2;->g:Li25;

    invoke-static {v1}, Li25;->access$getMutableRequirementBannerShown$p(Li25;)La94;

    move-result-object v1

    invoke-virtual {v0, v1}, LZ84$a;->b(Lio/reactivex/Observable;)LZ84;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Li25$p2;->invoke()LZ84;

    move-result-object v0

    return-object v0
.end method

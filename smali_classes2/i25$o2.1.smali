.class public final Li25$o2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


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
        "Lkotlin/jvm/functions/Function2<",
        "Lco/bird/android/buava/Optional<",
        "Li25$b;",
        ">;",
        "Lco/bird/android/buava/Optional<",
        "Li25$b;",
        ">;",
        "Lco/bird/android/buava/Optional<",
        "Li25$b;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/buava/Optional;",
        "Li25$b;",
        "oldValue",
        "newValue",
        "a",
        "(Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Li25$o2;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Li25$o2;

    invoke-direct {v0}, Li25$o2;-><init>()V

    sput-object v0, Li25$o2;->g:Li25$o2;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/buava/Optional<",
            "Li25$b;",
            ">;",
            "Lco/bird/android/buava/Optional<",
            "Li25$b;",
            ">;)",
            "Lco/bird/android/buava/Optional<",
            "Li25$b;",
            ">;"
        }
    .end annotation

    const-string v0, "oldValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newValue"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li25$b;

    invoke-virtual {p2}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li25$b;

    if-eqz v0, :cond_0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Li25$b;->b()F

    move-result v1

    invoke-virtual {v0}, Li25$b;->b()F

    move-result v0

    cmpg-float v0, v1, v0

    if-gtz v0, :cond_1

    :cond_0
    move-object p1, p2

    :cond_1
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/buava/Optional;

    check-cast p2, Lco/bird/android/buava/Optional;

    invoke-virtual {p0, p1, p2}, Li25$o2;->a(Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;

    move-result-object p1

    return-object p1
.end method

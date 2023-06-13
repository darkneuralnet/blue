.class public final LDS5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lco/bird/android/manager/payment/StripeResolverManagerImpl;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Landroid/content/Context;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LTq4;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LOh;",
            ">;"
        }
    .end annotation
.end field

.field public final d:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LRh6;",
            ">;"
        }
    .end annotation
.end field

.field public final e:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lgl;",
            ">;"
        }
    .end annotation
.end field

.field public final f:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lcom/stripe/android/Stripe;",
            ">;"
        }
    .end annotation
.end field

.field public final g:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LLifecycleOwner;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LOh;",
            ">;",
            "LY94<",
            "LRh6;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/Stripe;",
            ">;",
            "LY94<",
            "LLifecycleOwner;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LDS5;->a:LY94;

    iput-object p2, p0, LDS5;->b:LY94;

    iput-object p3, p0, LDS5;->c:LY94;

    iput-object p4, p0, LDS5;->d:LY94;

    iput-object p5, p0, LDS5;->e:LY94;

    iput-object p6, p0, LDS5;->f:LY94;

    iput-object p7, p0, LDS5;->g:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)LDS5;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Landroid/content/Context;",
            ">;",
            "LY94<",
            "LTq4;",
            ">;",
            "LY94<",
            "LOh;",
            ">;",
            "LY94<",
            "LRh6;",
            ">;",
            "LY94<",
            "Lgl;",
            ">;",
            "LY94<",
            "Lcom/stripe/android/Stripe;",
            ">;",
            "LY94<",
            "LLifecycleOwner;",
            ">;)",
            "LDS5;"
        }
    .end annotation

    new-instance v8, LDS5;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, LDS5;-><init>(LY94;LY94;LY94;LY94;LY94;LY94;LY94;)V

    return-object v8
.end method

.method public static c(Landroid/content/Context;LTq4;LOh;LRh6;Lgl;Lcom/stripe/android/Stripe;LLifecycleOwner;)Lco/bird/android/manager/payment/StripeResolverManagerImpl;
    .locals 9

    new-instance v8, Lco/bird/android/manager/payment/StripeResolverManagerImpl;

    move-object v0, v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v0 .. v7}, Lco/bird/android/manager/payment/StripeResolverManagerImpl;-><init>(Landroid/content/Context;LTq4;LOh;LRh6;Lgl;Lcom/stripe/android/Stripe;LLifecycleOwner;)V

    return-object v8
.end method


# virtual methods
.method public b()Lco/bird/android/manager/payment/StripeResolverManagerImpl;
    .locals 8

    iget-object v0, p0, LDS5;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Landroid/content/Context;

    iget-object v0, p0, LDS5;->b:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, LTq4;

    iget-object v0, p0, LDS5;->c:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, LOh;

    iget-object v0, p0, LDS5;->d:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, LRh6;

    iget-object v0, p0, LDS5;->e:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lgl;

    iget-object v0, p0, LDS5;->f:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/stripe/android/Stripe;

    iget-object v0, p0, LDS5;->g:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, LLifecycleOwner;

    invoke-static/range {v1 .. v7}, LDS5;->c(Landroid/content/Context;LTq4;LOh;LRh6;Lgl;Lcom/stripe/android/Stripe;LLifecycleOwner;)Lco/bird/android/manager/payment/StripeResolverManagerImpl;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LDS5;->b()Lco/bird/android/manager/payment/StripeResolverManagerImpl;

    move-result-object v0

    return-object v0
.end method

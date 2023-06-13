.class public final LIL3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "LHL3;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lco/bird/android/manager/payment/StripeResolverManagerImpl;",
            ">;"
        }
    .end annotation
.end field

.field public final b:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "LpM3;",
            ">;"
        }
    .end annotation
.end field

.field public final c:LY94;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY94<",
            "Lwi2;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LY94;LY94;LY94;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lco/bird/android/manager/payment/StripeResolverManagerImpl;",
            ">;",
            "LY94<",
            "LpM3;",
            ">;",
            "LY94<",
            "Lwi2;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIL3;->a:LY94;

    iput-object p2, p0, LIL3;->b:LY94;

    iput-object p3, p0, LIL3;->c:LY94;

    return-void
.end method

.method public static a(LY94;LY94;LY94;)LIL3;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LY94<",
            "Lco/bird/android/manager/payment/StripeResolverManagerImpl;",
            ">;",
            "LY94<",
            "LpM3;",
            ">;",
            "LY94<",
            "Lwi2;",
            ">;)",
            "LIL3;"
        }
    .end annotation

    new-instance v0, LIL3;

    invoke-direct {v0, p0, p1, p2}, LIL3;-><init>(LY94;LY94;LY94;)V

    return-object v0
.end method

.method public static c(Lco/bird/android/manager/payment/StripeResolverManagerImpl;LpM3;Lwi2;)LHL3;
    .locals 1

    new-instance v0, LHL3;

    invoke-direct {v0, p0, p1, p2}, LHL3;-><init>(Lco/bird/android/manager/payment/StripeResolverManagerImpl;LpM3;Lwi2;)V

    return-object v0
.end method


# virtual methods
.method public b()LHL3;
    .locals 3

    iget-object v0, p0, LIL3;->a:LY94;

    invoke-interface {v0}, LY94;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/manager/payment/StripeResolverManagerImpl;

    iget-object v1, p0, LIL3;->b:LY94;

    invoke-interface {v1}, LY94;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LpM3;

    iget-object v2, p0, LIL3;->c:LY94;

    invoke-interface {v2}, LY94;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwi2;

    invoke-static {v0, v1, v2}, LIL3;->c(Lco/bird/android/manager/payment/StripeResolverManagerImpl;LpM3;Lwi2;)LHL3;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LIL3;->b()LHL3;

    move-result-object v0

    return-object v0
.end method

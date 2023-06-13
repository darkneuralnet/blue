.class public final Lco/bird/android/feature/merchant/activity/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsj1;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lsj1<",
        "Lcom/uber/autodispose/ScopeProvider;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity$b;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/feature/merchant/activity/e;->a:Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity$b;

    return-void
.end method

.method public static a(Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity$b;)Lco/bird/android/feature/merchant/activity/e;
    .locals 1

    new-instance v0, Lco/bird/android/feature/merchant/activity/e;

    invoke-direct {v0, p0}, Lco/bird/android/feature/merchant/activity/e;-><init>(Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity$b;)V

    return-object v0
.end method

.method public static c(Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity$b;)Lcom/uber/autodispose/ScopeProvider;
    .locals 0

    invoke-virtual {p0}, Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity$b;->c()Lcom/uber/autodispose/ScopeProvider;

    move-result-object p0

    invoke-static {p0}, LxZ3;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/uber/autodispose/ScopeProvider;

    return-object p0
.end method


# virtual methods
.method public b()Lcom/uber/autodispose/ScopeProvider;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/merchant/activity/e;->a:Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity$b;

    invoke-static {v0}, Lco/bird/android/feature/merchant/activity/e;->c(Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity$b;)Lcom/uber/autodispose/ScopeProvider;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/merchant/activity/e;->b()Lcom/uber/autodispose/ScopeProvider;

    move-result-object v0

    return-object v0
.end method

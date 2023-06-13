.class public final Lco/bird/android/feature/merchant/activity/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity$a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/feature/merchant/activity/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public a:Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity$b;

.field public b:LlG2;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(LjM0;)V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/feature/merchant/activity/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(LlG2;)Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity$a$a;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/feature/merchant/activity/b$a;->c(LlG2;)Lco/bird/android/feature/merchant/activity/b$a;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic b(Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity$b;)Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity$a$a;
    .locals 0

    invoke-virtual {p0, p1}, Lco/bird/android/feature/merchant/activity/b$a;->d(Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity$b;)Lco/bird/android/feature/merchant/activity/b$a;

    move-result-object p1

    return-object p1
.end method

.method public build()Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity$a;
    .locals 4

    iget-object v0, p0, Lco/bird/android/feature/merchant/activity/b$a;->a:Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity$b;

    const-class v1, Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity$b;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    iget-object v0, p0, Lco/bird/android/feature/merchant/activity/b$a;->b:LlG2;

    const-class v1, LlG2;

    invoke-static {v0, v1}, LxZ3;->a(Ljava/lang/Object;Ljava/lang/Class;)V

    new-instance v0, Lco/bird/android/feature/merchant/activity/b$b;

    iget-object v1, p0, Lco/bird/android/feature/merchant/activity/b$a;->a:Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity$b;

    iget-object v2, p0, Lco/bird/android/feature/merchant/activity/b$a;->b:LlG2;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lco/bird/android/feature/merchant/activity/b$b;-><init>(Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity$b;LlG2;LkM0;)V

    return-object v0
.end method

.method public c(LlG2;)Lco/bird/android/feature/merchant/activity/b$a;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LlG2;

    iput-object p1, p0, Lco/bird/android/feature/merchant/activity/b$a;->b:LlG2;

    return-object p0
.end method

.method public d(Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity$b;)Lco/bird/android/feature/merchant/activity/b$a;
    .locals 0

    invoke-static {p1}, LxZ3;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity$b;

    iput-object p1, p0, Lco/bird/android/feature/merchant/activity/b$a;->a:Lco/bird/android/feature/merchant/activity/MerchantHistoryDetailsActivity$b;

    return-object p0
.end method

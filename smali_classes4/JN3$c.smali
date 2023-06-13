.class public final LJN3$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LJN3;-><init>(LLL3;LTq4;LiD1;LAM3;LVM3;LRh6;)V
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
        "Lco/bird/android/model/PaymentInfo;",
        ">;",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/PaymentInfo;",
        ">;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/PaymentInfo;",
        "old",
        "new",
        "",
        "a",
        "(Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LJN3$c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LJN3$c;

    invoke-direct {v0}, LJN3$c;-><init>()V

    sput-object v0, LJN3$c;->g:LJN3$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/PaymentInfo;",
            ">;",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/PaymentInfo;",
            ">;)",
            "Ljava/lang/Boolean;"
        }
    .end annotation

    const-string v0, "old"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "new"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/PaymentInfo;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/PaymentInfo;->getPaymentMethod()Lco/bird/android/model/BirdPayment;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-virtual {p2}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/PaymentInfo;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lco/bird/android/model/PaymentInfo;->getPaymentMethod()Lco/bird/android/model/BirdPayment;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/PaymentInfo;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/PaymentInfo;->getPaymentProvider()Lco/bird/android/model/constant/PaymentProvider;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    goto :goto_2

    :cond_2
    move-object p1, v1

    :goto_2
    invoke-virtual {p2}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lco/bird/android/model/PaymentInfo;

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Lco/bird/android/model/PaymentInfo;->getPaymentProvider()Lco/bird/android/model/constant/PaymentProvider;

    move-result-object p2

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    goto :goto_3

    :cond_3
    move-object p2, v1

    :goto_3
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lco/bird/android/model/BirdPayment;->getBrand()Ljava/lang/String;

    move-result-object p1

    goto :goto_4

    :cond_4
    move-object p1, v1

    :goto_4
    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lco/bird/android/model/BirdPayment;->getBrand()Ljava/lang/String;

    move-result-object p2

    goto :goto_5

    :cond_5
    move-object p2, v1

    :goto_5
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lco/bird/android/model/BirdPayment;->getLastCardNumbers()Ljava/lang/String;

    move-result-object p1

    goto :goto_6

    :cond_6
    move-object p1, v1

    :goto_6
    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lco/bird/android/model/BirdPayment;->getLastCardNumbers()Ljava/lang/String;

    move-result-object p2

    goto :goto_7

    :cond_7
    move-object p2, v1

    :goto_7
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lco/bird/android/model/BirdPayment;->getExpiryMonth()Ljava/lang/String;

    move-result-object p1

    goto :goto_8

    :cond_8
    move-object p1, v1

    :goto_8
    if-eqz v2, :cond_9

    invoke-virtual {v2}, Lco/bird/android/model/BirdPayment;->getExpiryMonth()Ljava/lang/String;

    move-result-object p2

    goto :goto_9

    :cond_9
    move-object p2, v1

    :goto_9
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lco/bird/android/model/BirdPayment;->getExpiryYear()Ljava/lang/String;

    move-result-object p1

    goto :goto_a

    :cond_a
    move-object p1, v1

    :goto_a
    if-eqz v2, :cond_b

    invoke-virtual {v2}, Lco/bird/android/model/BirdPayment;->getExpiryYear()Ljava/lang/String;

    move-result-object p2

    goto :goto_b

    :cond_b
    move-object p2, v1

    :goto_b
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lco/bird/android/model/BirdPayment;->getPaypalEmail()Ljava/lang/String;

    move-result-object p1

    goto :goto_c

    :cond_c
    move-object p1, v1

    :goto_c
    if-eqz v2, :cond_d

    invoke-virtual {v2}, Lco/bird/android/model/BirdPayment;->getPaypalEmail()Ljava/lang/String;

    move-result-object v1

    :cond_d
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    const/4 p1, 0x1

    goto :goto_d

    :cond_e
    const/4 p1, 0x0

    :goto_d
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/buava/Optional;

    check-cast p2, Lco/bird/android/buava/Optional;

    invoke-virtual {p0, p1, p2}, LJN3$c;->a(Lco/bird/android/buava/Optional;Lco/bird/android/buava/Optional;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.class public final Lmm3$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmm3;->a(Landroid/content/Intent;)Lio/reactivex/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/User;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/User;",
        "kotlin.jvm.PlatformType",
        "user",
        "",
        "a",
        "(Lco/bird/android/model/User;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOperatorMainAppStartNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorMainAppStartNavigator.kt\nco/bird/android/lib/deeplink/OperatorMainAppStartNavigator$navigate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,47:1\n766#2:48\n857#2,2:49\n*S KotlinDebug\n*F\n+ 1 OperatorMainAppStartNavigator.kt\nco/bird/android/lib/deeplink/OperatorMainAppStartNavigator$navigate$1\n*L\n27#1:48\n27#1:49,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lmm3;


# direct methods
.method public constructor <init>(Lmm3;)V
    .locals 0

    iput-object p1, p0, Lmm3$a;->g:Lmm3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/User;)V
    .locals 8

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lco/bird/android/model/UserKt;->getRoles$default(Lco/bird/android/model/User;Ljava/lang/Boolean;ILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    if-eqz v3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Lco/bird/android/model/UserRoleItem;

    invoke-virtual {v6}, Lco/bird/android/model/UserRoleItem;->getUserRole()Lco/bird/android/model/constant/UserRole;

    move-result-object v6

    new-array v4, v4, [Lco/bird/android/model/constant/UserRole;

    sget-object v7, Lco/bird/android/model/constant/UserRole;->RIDER:Lco/bird/android/model/constant/UserRole;

    aput-object v7, v4, v5

    sget-object v5, Lco/bird/android/model/constant/UserRole;->MECHANIC:Lco/bird/android/model/constant/UserRole;

    aput-object v5, v4, v1

    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-static {v6, v4}, Lco/bird/android/model/BirdPaymentKt;->isOneOf(Ljava/lang/Object;Ljava/util/List;)Z

    move-result v4

    xor-int/2addr v4, v1

    if-eqz v4, :cond_0

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lmm3$a;->g:Lmm3;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    xor-int/2addr v3, v1

    if-eqz v3, :cond_3

    invoke-static {p1}, Lmm3;->access$getPreference$p(Lmm3;)Lgl;

    move-result-object v3

    invoke-virtual {v3}, Lgl;->r0()Lco/bird/android/model/UserRoleItem;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-static {p1}, Lmm3;->access$getPreference$p(Lmm3;)Lgl;

    move-result-object p1

    invoke-virtual {p1}, Lgl;->r0()Lco/bird/android/model/UserRoleItem;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/UserRoleItem;->getUserRole()Lco/bird/android/model/constant/UserRole;

    move-result-object p1

    goto :goto_1

    :cond_2
    move-object p1, v0

    :goto_1
    new-array v3, v4, [Lco/bird/android/model/constant/UserRole;

    sget-object v4, Lco/bird/android/model/constant/UserRole;->RIDER:Lco/bird/android/model/constant/UserRole;

    aput-object v4, v3, v5

    sget-object v4, Lco/bird/android/model/constant/UserRole;->MECHANIC:Lco/bird/android/model/constant/UserRole;

    aput-object v4, v3, v1

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {p1, v3}, Lco/bird/android/model/BirdPaymentKt;->isOneOf(Ljava/lang/Object;Ljava/util/List;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    move v1, v5

    :cond_4
    :goto_2
    if-eqz v1, :cond_5

    move-object v0, v2

    :cond_5
    if-eqz v0, :cond_6

    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/UserRoleItem;

    if-eqz p1, :cond_6

    iget-object v0, p0, Lmm3$a;->g:Lmm3;

    invoke-static {v0}, Lmm3;->access$getPreference$p(Lmm3;)Lgl;

    move-result-object v1

    invoke-virtual {v1, p1}, Lgl;->E2(Lco/bird/android/model/UserRoleItem;)V

    invoke-static {v0}, Lmm3;->access$getPreference$p(Lmm3;)Lgl;

    move-result-object v0

    invoke-virtual {v0, p1}, Lgl;->F2(Lco/bird/android/model/UserRoleItem;)V

    :cond_6
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/User;

    invoke-virtual {p0, p1}, Lmm3$a;->a(Lco/bird/android/model/User;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

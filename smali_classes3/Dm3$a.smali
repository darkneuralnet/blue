.class public final LDm3$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDm3;->a(Landroid/content/Intent;)Lio/reactivex/c;
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
        "SMAP\nOperatorMapDeepLinkNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorMapDeepLinkNavigator.kt\nco/bird/android/lib/deeplink/navigators/OperatorMapDeepLinkNavigator$navigate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,72:1\n288#2,2:73\n*S KotlinDebug\n*F\n+ 1 OperatorMapDeepLinkNavigator.kt\nco/bird/android/lib/deeplink/navigators/OperatorMapDeepLinkNavigator$navigate$1\n*L\n33#1:73,2\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LDm3;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(LDm3;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LDm3$a;->g:LDm3;

    iput-object p2, p0, LDm3$a;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/User;)V
    .locals 4

    invoke-virtual {p1}, Lco/bird/android/model/User;->getOperatorRoles()Ljava/util/List;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    check-cast p1, Ljava/lang/Iterable;

    iget-object v1, p0, LDm3$a;->h:Ljava/lang/String;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lco/bird/android/model/OperatorRole;

    invoke-virtual {v3}, Lco/bird/android/model/OperatorRole;->getRole()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v0

    :goto_0
    check-cast v2, Lco/bird/android/model/OperatorRole;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lco/bird/android/model/OperatorRole;->toUserRoleItem()Lco/bird/android/model/UserRoleItem;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object v0, p0, LDm3$a;->g:LDm3;

    invoke-static {v0}, LDm3;->access$getPreference$p(LDm3;)Lgl;

    move-result-object v1

    invoke-virtual {v1, p1}, Lgl;->E2(Lco/bird/android/model/UserRoleItem;)V

    invoke-static {v0}, LDm3;->access$getPreference$p(LDm3;)Lgl;

    move-result-object v0

    invoke-virtual {v0, p1}, Lgl;->F2(Lco/bird/android/model/UserRoleItem;)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :cond_2
    if-nez v0, :cond_3

    iget-object p1, p0, LDm3$a;->g:LDm3;

    invoke-static {p1}, LDm3;->access$setFallbackRole(LDm3;)V

    :cond_3
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/User;

    invoke-virtual {p0, p1}, LDm3$a;->a(Lco/bird/android/model/User;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

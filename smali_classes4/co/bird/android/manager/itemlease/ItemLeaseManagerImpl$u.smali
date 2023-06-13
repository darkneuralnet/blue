.class public final Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$u;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->x(Ljava/lang/String;Lco/bird/android/model/itemlease/enum/ItemLeaseType;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/WirePaymentAuthRequest;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/MobilePartner;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/MobilePartner;",
        "partner",
        "",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/MobilePartner;)Ljava/lang/String;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$u;->g:Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/MobilePartner;)Ljava/lang/String;
    .locals 1

    const-string v0, "partner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/model/MobilePartner;->getHabitatId()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$u;->g:Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;

    invoke-static {p1}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->access$getBuildConfig$p(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)LOh;

    move-result-object p1

    invoke-static {p1}, LRh;->d(LOh;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$u;->g:Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;

    invoke-static {p1}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->access$getBuildConfig$p(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)LOh;

    move-result-object p1

    invoke-static {p1}, LRh;->c(LOh;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/MobilePartner;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$u;->a(Lco/bird/android/model/MobilePartner;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

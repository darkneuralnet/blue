.class public final Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$t;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->E(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/itemlease/LeaseStartResponse;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/itemlease/LeaseStartResponse;",
        "kotlin.jvm.PlatformType",
        "it",
        "",
        "a",
        "(Lco/bird/android/model/itemlease/LeaseStartResponse;)V"
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
        "SMAP\nItemLeaseManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemLeaseManagerImpl.kt\nco/bird/android/manager/itemlease/ItemLeaseManagerImpl$startLease$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,476:1\n1#2:477\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;

.field public final synthetic h:Lco/bird/android/model/wire/WireBird;


# direct methods
.method public constructor <init>(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;Lco/bird/android/model/wire/WireBird;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$t;->g:Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;

    iput-object p2, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$t;->h:Lco/bird/android/model/wire/WireBird;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/itemlease/LeaseStartResponse;)V
    .locals 2

    invoke-virtual {p1}, Lco/bird/android/model/itemlease/LeaseStartResponse;->getLease()Lco/bird/android/model/itemlease/ItemLease;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$t;->g:Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;

    iget-object v1, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$t;->h:Lco/bird/android/model/wire/WireBird;

    invoke-static {v0}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->access$getAppPreference$p(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)Lgl;

    move-result-object v0

    invoke-virtual {v0, v1, p1}, Lgl;->u1(Lco/bird/android/model/wire/WireBird;Lco/bird/android/model/itemlease/ItemLease;)V

    :cond_0
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/itemlease/LeaseStartResponse;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$t;->a(Lco/bird/android/model/itemlease/LeaseStartResponse;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
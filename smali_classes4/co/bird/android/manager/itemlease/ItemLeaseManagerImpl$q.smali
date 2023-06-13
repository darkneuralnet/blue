.class public final Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$q;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->u(Ljava/lang/String;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/WireLeaseReturnResponse;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/WireLeaseReturnResponse;",
        "kotlin.jvm.PlatformType",
        "response",
        "",
        "a",
        "(Lco/bird/api/response/WireLeaseReturnResponse;)V"
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

    iput-object p1, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$q;->g:Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/WireLeaseReturnResponse;)V
    .locals 2

    invoke-virtual {p1}, Lco/bird/api/response/WireLeaseReturnResponse;->getLease()Lco/bird/android/model/wire/WireLeaseObjectResponse;

    move-result-object p1

    iget-object v0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$q;->g:Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;

    invoke-static {v0}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->access$getMutableActiveLeases$p(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)La94;

    move-result-object v0

    new-instance v1, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$q$a;

    invoke-direct {v1, p1}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$q$a;-><init>(Lco/bird/android/model/wire/WireLeaseObjectResponse;)V

    invoke-virtual {v0, v1}, La94;->i(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/WireLeaseReturnResponse;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$q;->a(Lco/bird/api/response/WireLeaseReturnResponse;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

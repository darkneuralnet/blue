.class public final Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$s;
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
        "Ljava/lang/String;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/itemlease/LeaseStartResponse;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0007\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "habitatId",
        "Lio/reactivex/K;",
        "Lco/bird/android/model/itemlease/LeaseStartResponse;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "(Ljava/lang/String;)Lio/reactivex/K;",
        "<anonymous>"
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

.field public final synthetic h:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Lco/bird/api/request/WirePaymentAuthRequest;


# direct methods
.method public constructor <init>(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;Lco/bird/android/model/itemlease/enum/ItemLeaseType;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/WirePaymentAuthRequest;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$s;->g:Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;

    iput-object p2, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$s;->h:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    iput-object p3, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$s;->i:Ljava/lang/String;

    iput-object p4, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$s;->j:Ljava/lang/String;

    iput-object p5, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$s;->k:Lco/bird/api/request/WirePaymentAuthRequest;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/itemlease/LeaseStartResponse;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$s;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/itemlease/LeaseStartResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$s;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/itemlease/LeaseStartResponse;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/itemlease/LeaseStartResponse;

    return-object p0
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/K;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/K;

    return-object p0
.end method


# virtual methods
.method public final invoke(Ljava/lang/String;)Lio/reactivex/K;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/itemlease/LeaseStartResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "habitatId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$s;->g:Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;

    invoke-static {v0}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;->access$getClient$p(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)LLc2;

    move-result-object v0

    new-instance v7, Lco/bird/api/request/WireItemLeaseStartRequest;

    iget-object v1, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$s;->h:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    invoke-virtual {v1}, Lco/bird/android/model/itemlease/enum/ItemLeaseType;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$s;->i:Ljava/lang/String;

    iget-object v5, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$s;->j:Ljava/lang/String;

    iget-object v6, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$s;->k:Lco/bird/api/request/WirePaymentAuthRequest;

    move-object v1, v7

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lco/bird/api/request/WireItemLeaseStartRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/bird/api/request/WirePaymentAuthRequest;)V

    invoke-interface {v0, v7}, LLc2;->e(Lco/bird/api/request/WireItemLeaseStartRequest;)Lio/reactivex/F;

    move-result-object p1

    new-instance v0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$s$a;

    iget-object v1, p0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$s;->g:Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;

    invoke-direct {v0, v1}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$s$a;-><init>(Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl;)V

    new-instance v1, Lgd2;

    invoke-direct {v1, v0}, Lgd2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->A(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    sget-object v0, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$s$b;->g:Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$s$b;

    new-instance v1, Lhd2;

    invoke-direct {v1, v0}, Lhd2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lco/bird/android/manager/itemlease/ItemLeaseManagerImpl$s;->invoke(Ljava/lang/String;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method

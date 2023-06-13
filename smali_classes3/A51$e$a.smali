.class public final LA51$e$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LA51$e;->invoke(Lkotlin/Unit;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/DisputeRideFinalizeResponse;",
        "LA51$d;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/DisputeRideFinalizeResponse;",
        "it",
        "LA51$d;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/api/response/DisputeRideFinalizeResponse;)LA51$d;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LA51$e$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LA51$e$a;

    invoke-direct {v0}, LA51$e$a;-><init>()V

    sput-object v0, LA51$e$a;->g:LA51$e$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/DisputeRideFinalizeResponse;)LA51$d;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LA51$a;

    invoke-virtual {p1}, Lco/bird/api/response/DisputeRideFinalizeResponse;->getAmount()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p1}, Lco/bird/api/response/DisputeRideFinalizeResponse;->getCurrency()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, LA51$a;-><init>(Ljava/lang/Long;Ljava/lang/String;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/DisputeRideFinalizeResponse;

    invoke-virtual {p0, p1}, LA51$e$a;->a(Lco/bird/api/response/DisputeRideFinalizeResponse;)LA51$d;

    move-result-object p1

    return-object p1
.end method

.class public final LW66$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LW66;->a(LEc2$d;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LHM4<",
        "Lco/bird/api/response/CollectionResponse<",
        "Lco/bird/android/model/TransactionSummary;",
        ">;>;",
        "LcO4<",
        "Lco/bird/android/model/TransactionSummary;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0005*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00040\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "LHM4;",
        "Lco/bird/api/response/CollectionResponse;",
        "Lco/bird/android/model/TransactionSummary;",
        "response",
        "LcO4;",
        "kotlin.jvm.PlatformType",
        "a",
        "(LHM4;)LcO4;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:LW66$a;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, LW66$a;

    invoke-direct {v0}, LW66$a;-><init>()V

    sput-object v0, LW66$a;->g:LW66$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)LcO4;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/api/response/CollectionResponse<",
            "Lco/bird/android/model/TransactionSummary;",
            ">;>;)",
            "LcO4<",
            "Lco/bird/android/model/TransactionSummary;",
            ">;"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/api/response/CollectionResponse;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lco/bird/api/response/CollectionResponse;->getItems()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance v0, LcO4$a;

    invoke-direct {v0, p1}, LcO4$a;-><init>(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    new-instance v0, LcO4$b;

    const/4 p1, 0x1

    const/4 v1, 0x0

    invoke-direct {v0, v1, p1, v1}, LcO4$b;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, LW66$a;->a(LHM4;)LcO4;

    move-result-object p1

    return-object p1
.end method

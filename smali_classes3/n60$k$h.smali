.class public final Ln60$k$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln60$k;->j(Ljava/util/List;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/OperatorBatchStatusResponse;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/api/response/OperatorBatchStatusResponse;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/OperatorBatchStatusResponse;",
        "response",
        "Lio/reactivex/K;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/api/response/OperatorBatchStatusResponse;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Ln60$k$h;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ln60$k$h;

    invoke-direct {v0}, Ln60$k$h;-><init>()V

    sput-object v0, Ln60$k$h;->g:Ln60$k$h;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/OperatorBatchStatusResponse;)Lio/reactivex/K;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/response/OperatorBatchStatusResponse;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/api/response/OperatorBatchStatusResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/OperatorBatchStatusResponse;

    invoke-virtual {p0, p1}, Ln60$k$h;->a(Lco/bird/api/response/OperatorBatchStatusResponse;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method

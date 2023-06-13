.class public final LM40$j;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LM40;->v(Lco/bird/android/model/wire/WireServiceCenterStatus;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LnQ5$b;",
        "Lio/reactivex/K<",
        "+",
        "LnQ5$b;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LnQ5$b;",
        "response",
        "Lio/reactivex/K;",
        "kotlin.jvm.PlatformType",
        "a",
        "(LnQ5$b;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LM40;


# direct methods
.method public constructor <init>(LM40;)V
    .locals 0

    iput-object p1, p0, LM40$j;->g:LM40;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LnQ5$b;)Lio/reactivex/K;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LnQ5$b;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "LnQ5$b;",
            ">;"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LnQ5$b;->d:LnQ5$b;

    if-eq p1, v0, :cond_0

    iget-object v0, p0, LM40$j;->g:LM40;

    invoke-static {v0}, LM40;->access$getOperatorManager$p(LM40;)Lom3;

    move-result-object v0

    sget-object v1, Lco/bird/android/model/constant/BulkScanPurpose;->SERVICE_CENTER:Lco/bird/android/model/constant/BulkScanPurpose;

    invoke-interface {v0, v1}, Lom3;->r1(Lco/bird/android/model/constant/BulkScanPurpose;)Lio/reactivex/c;

    move-result-object v0

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LnQ5$b;

    invoke-virtual {p0, p1}, LM40$j;->a(LnQ5$b;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method

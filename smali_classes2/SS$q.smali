.class public final LSS$q;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LSS;->c0(Ljava/lang/String;Lco/bird/android/model/constant/BirdAction;ZLjava/lang/String;)V
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
        "Lco/bird/android/model/BirdScan;",
        ">;",
        "Lio/reactivex/B<",
        "+",
        "LHM4<",
        "Lco/bird/android/model/BirdScan;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001aB\u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000 \u0004* \u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LHM4;",
        "Lco/bird/android/model/BirdScan;",
        "scanResponse",
        "Lio/reactivex/B;",
        "kotlin.jvm.PlatformType",
        "b",
        "(LHM4;)Lio/reactivex/B;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LSS;


# direct methods
.method public constructor <init>(LSS;)V
    .locals 0

    iput-object p1, p0, LSS$q;->g:LSS;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 0

    invoke-static {p0, p1}, LSS$q;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lio/reactivex/B;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lio/reactivex/B;

    return-object p0
.end method


# virtual methods
.method public final b(LHM4;)Lio/reactivex/B;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/android/model/BirdScan;",
            ">;)",
            "Lio/reactivex/B<",
            "+",
            "LHM4<",
            "Lco/bird/android/model/BirdScan;",
            ">;>;"
        }
    .end annotation

    const-string v0, "scanResponse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/BirdScan;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lco/bird/android/model/BirdScan;->getStatus()Lco/bird/android/model/constant/ScanStatus;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    sget-object v1, Lco/bird/android/model/constant/ScanStatus;->SHOW_PRECAPTURE_MODAL:Lco/bird/android/model/constant/ScanStatus;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, LSS$q;->g:LSS;

    invoke-static {v0}, LSS;->access$getUi$p(LSS;)LZS;

    move-result-object v1

    sget-object v2, Ltk5;->d:Ltk5;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x4

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, LH31$a;->agreementDialog$default(LH31;Lf9;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LSS$q$a;

    iget-object v2, p0, LSS$q;->g:LSS;

    invoke-direct {v1, p1, v2}, LSS$q$a;-><init>(LHM4;LSS;)V

    new-instance p1, LUS;

    invoke-direct {p1, v1}, LUS;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->D(Lio/reactivex/functions/o;)Lio/reactivex/Observable;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-static {p1}, Lio/reactivex/Observable;->just(Ljava/lang/Object;)Lio/reactivex/Observable;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, LSS$q;->b(LHM4;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method

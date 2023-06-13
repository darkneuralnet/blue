.class public final LmD5$m;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LmD5;->A(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireSkuScanItem;",
        "Lio/reactivex/u<",
        "+",
        "Lco/bird/android/model/wire/WireSkuScanItem;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireSkuScanItem;",
        "skuScanResponse",
        "Lio/reactivex/u;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/android/model/wire/WireSkuScanItem;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LmD5;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(LmD5;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LmD5$m;->g:LmD5;

    iput-object p2, p0, LmD5$m;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/WireSkuScanItem;
    .locals 0

    invoke-static {p0, p1}, LmD5$m;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/WireSkuScanItem;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/wire/WireSkuScanItem;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/wire/WireSkuScanItem;

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/android/model/wire/WireSkuScanItem;)Lio/reactivex/u;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireSkuScanItem;",
            ")",
            "Lio/reactivex/u<",
            "+",
            "Lco/bird/android/model/wire/WireSkuScanItem;",
            ">;"
        }
    .end annotation

    const-string v0, "skuScanResponse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LmD5$m;->g:LmD5;

    invoke-static {v0}, LmD5;->access$getInventoryScanningUiDelegate$p(LmD5;)LN92;

    move-result-object v0

    iget-object v1, p0, LmD5$m;->h:Ljava/lang/String;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireSkuScanItem;->getErrorCode()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, LN92;->Rl(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object v0

    new-instance v1, LmD5$m$a;

    invoke-direct {v1, p1}, LmD5$m$a;-><init>(Lco/bird/android/model/wire/WireSkuScanItem;)V

    new-instance p1, LsD5;

    invoke-direct {p1, v1}, LsD5;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/F;->I(Lio/reactivex/functions/o;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->j0()Lio/reactivex/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireSkuScanItem;

    invoke-virtual {p0, p1}, LmD5$m;->b(Lco/bird/android/model/wire/WireSkuScanItem;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method

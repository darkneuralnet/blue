.class public final LmD5$l$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LmD5$l;->c(Lkotlin/Pair;)Lio/reactivex/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/DialogResponse;",
        "Lio/reactivex/u<",
        "+",
        "Lco/bird/android/model/wire/WireSkuScanItem;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/DialogResponse;",
        "it",
        "Lio/reactivex/u;",
        "Lco/bird/android/model/wire/WireSkuScanItem;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"
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

    iput-object p1, p0, LmD5$l$b;->g:LmD5;

    iput-object p2, p0, LmD5$l$b;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/DialogResponse;",
            ")",
            "Lio/reactivex/u<",
            "+",
            "Lco/bird/android/model/wire/WireSkuScanItem;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LmD5$l$b;->g:LmD5;

    invoke-static {p1}, LmD5;->access$getTransferOrderManager$p(LmD5;)LO86;

    move-result-object v0

    const/4 v1, 0x1

    iget-object p1, p0, LmD5$l$b;->g:LmD5;

    invoke-static {p1}, LmD5;->access$getSkuOrderId$p(LmD5;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, LmD5$l$b;->h:Ljava/lang/String;

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/16 v8, 0x30

    const/4 v9, 0x0

    invoke-static/range {v0 .. v9}, LO86$a;->scanSkuForSkuOrder$default(LO86;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/F;->j0()Lio/reactivex/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/DialogResponse;

    invoke-virtual {p0, p1}, LmD5$l$b;->a(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method

.class public final Lu23$j;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu23;-><init>(Llp2;LpJ;LyL;Lde5;LaM;Llh6;LEa;Lgl;LTq4;Lxk6;Lcom/uber/autodispose/ScopeProvider;Le13;Ly23;Landroid/content/ClipboardManager;LA13;Lio/reactivex/E;Lio/reactivex/E;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu23$j$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lde5$a;",
        "Lna4<",
        "+",
        "Lco/bird/android/model/Vehicle;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lde5$a;",
        "state",
        "Lna4;",
        "Lco/bird/android/model/Vehicle;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lde5$a;)Lna4;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lu23;


# direct methods
.method public constructor <init>(Lu23;)V
    .locals 0

    iput-object p1, p0, Lu23$j;->g:Lu23;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lde5$a;)Lna4;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lde5$a;",
            ")",
            "Lna4<",
            "+",
            "Lco/bird/android/model/Vehicle;",
            ">;"
        }
    .end annotation

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lu23$j;->g:Lu23;

    invoke-static {p1}, Lu23;->access$getRxBleClient$p(Lu23;)Lde5;

    move-result-object p1

    invoke-virtual {p1}, Lde5;->c()Lde5$a;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lu23$j$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    :goto_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lu23$j;->g:Lu23;

    invoke-static {p1}, Lu23;->access$getLegacyVehicleScanManager$p(Lu23;)Llp2;

    move-result-object p1

    sget-object v0, Lco/bird/api/request/BLEScanTrigger;->BIRD_FINDER:Lco/bird/api/request/BLEScanTrigger;

    invoke-interface {p1, v0}, Llp2;->b(Lco/bird/api/request/BLEScanTrigger;)Lio/reactivex/k;

    move-result-object p1

    iget-object v0, p0, Lu23$j;->g:Lu23;

    invoke-static {v0}, Lu23;->access$getBirdFinderManager$p(Lu23;)LyL;

    move-result-object v0

    invoke-interface {v0}, LyL;->d()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-virtual {p1, v0}, Lio/reactivex/k;->T0(Ljava/lang/Iterable;)Lio/reactivex/k;

    move-result-object p1

    invoke-static {}, Lio/reactivex/k;->P()Lio/reactivex/k;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/k;->z0(Lna4;)Lio/reactivex/k;

    move-result-object p1

    goto :goto_1

    :cond_1
    invoke-static {}, Lio/reactivex/k;->P()Lio/reactivex/k;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lde5$a;

    invoke-virtual {p0, p1}, Lu23$j;->a(Lde5$a;)Lna4;

    move-result-object p1

    return-object p1
.end method

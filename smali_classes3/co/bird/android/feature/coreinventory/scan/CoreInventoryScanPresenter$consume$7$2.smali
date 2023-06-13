.class final Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$7$2;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$7;->c(Lkotlin/Pair;)Lio/reactivex/K;
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
        "Lco/bird/android/model/Warehouse;",
        ">;",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/Warehouse;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u0001 \u0004*\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LHM4;",
        "Lco/bird/android/model/Warehouse;",
        "response",
        "Lco/bird/android/buava/Optional;",
        "kotlin.jvm.PlatformType",
        "a",
        "(LHM4;)Lco/bird/android/buava/Optional;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# static fields
.field public static final g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$7$2;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$7$2;

    invoke-direct {v0}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$7$2;-><init>()V

    sput-object v0, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$7$2;->g:Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$7$2;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)Lco/bird/android/buava/Optional;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/android/model/Warehouse;",
            ">;)",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/Warehouse;",
            ">;"
        }
    .end annotation

    const-string v0, "response"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, p1}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/coreinventory/scan/CoreInventoryScanPresenter$consume$7$2;->a(LHM4;)Lco/bird/android/buava/Optional;

    move-result-object p1

    return-object p1
.end method

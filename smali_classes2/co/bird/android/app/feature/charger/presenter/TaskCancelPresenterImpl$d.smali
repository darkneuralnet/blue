.class public final Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->F()V
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
        "Lco/bird/android/model/wire/WireBird;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LHM4;",
        "Lco/bird/android/model/wire/WireBird;",
        "kotlin.jvm.PlatformType",
        "response",
        "",
        "a",
        "(LHM4;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$d;->g:Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$d;->g:Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;

    invoke-virtual {p1}, LHM4;->f()Z

    move-result v1

    const-string v2, "response"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LNM4;->d(LHM4;)Ltg1;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ltg1;->c()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {v0, v1, p1}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;->access$showCancelRequestSubmitted(Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl;ZLjava/lang/String;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/charger/presenter/TaskCancelPresenterImpl$d;->a(LHM4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

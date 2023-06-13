.class public final Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$h;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->y()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LTk5;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "LTk5;",
        "kotlin.jvm.PlatformType",
        "scanResult",
        "",
        "a",
        "(LTk5;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$h;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LTk5;)V
    .locals 3

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$h;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;

    const-string v1, "scanResult"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, LnI5;->b:LnI5;

    const/4 v2, 0x0

    invoke-static {v0, p1, v1, v2}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->access$updateItemByScanResult(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;LTk5;LnI5;Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$h;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;

    invoke-static {p1, v2}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->access$setSmartlockConnection$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;Lke5;)V

    iget-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$h;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;

    invoke-static {p1, v2}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->access$setSmartlockResponse$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;Lco/bird/api/response/SmartlockResponse;)V

    iget-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$h;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;

    const/4 v0, 0x0

    new-array v0, v0, [B

    invoke-static {p1, v0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;->access$setSessionToken$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter;[B)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LTk5;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockOperatorUnlockPresenter$h;->a(LTk5;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

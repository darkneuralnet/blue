.class public final Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$t;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->y0()V
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
        "it",
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
.field public final synthetic g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$t;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LTk5;)V
    .locals 2

    iget-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$t;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    invoke-static {p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$getSmartlockResponse$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)Lco/bird/api/response/SmartlockResponse;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lco/bird/api/response/SmartlockResponse;->getNeedsRekey()Z

    move-result p1

    if-ne p1, v1, :cond_0

    move v0, v1

    :cond_0
    xor-int/lit8 p1, v0, 0x1

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$t;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    invoke-static {v0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$getUi$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)Lco/bird/android/app/feature/physicallock/smartlock/b;

    move-result-object v1

    invoke-interface {v1, p1}, Lco/bird/android/app/feature/physicallock/smartlock/b;->O(Z)V

    invoke-static {v0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$getUi$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)Lco/bird/android/app/feature/physicallock/smartlock/b;

    move-result-object v1

    invoke-interface {v1, p1}, Lco/bird/android/app/feature/physicallock/smartlock/b;->H1(Z)V

    invoke-static {v0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$getUi$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)Lco/bird/android/app/feature/physicallock/smartlock/b;

    move-result-object v0

    invoke-interface {v0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/b;->A1(Z)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LTk5;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$t;->a(LTk5;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

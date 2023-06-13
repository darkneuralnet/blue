.class public final Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$N;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;->M0(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Pair<",
        "+",
        "LTk5;",
        "+",
        "LHM4<",
        "Lco/bird/api/response/ProvisionSmartlockResponse;",
        ">;>;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0010\t\u001a\u00020\u00062^\u0010\u0005\u001aZ\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0002*,\u0012\u000c\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0002*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "Lkotlin/Pair;",
        "LTk5;",
        "kotlin.jvm.PlatformType",
        "LHM4;",
        "Lco/bird/api/response/ProvisionSmartlockResponse;",
        "<name for destructuring parameter 0>",
        "",
        "invoke",
        "(Lkotlin/Pair;)V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$N;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Pair;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$N;->invoke(Lkotlin/Pair;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Lkotlin/Pair;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "+",
            "LTk5;",
            "LHM4<",
            "Lco/bird/api/response/ProvisionSmartlockResponse;",
            ">;>;)V"
        }
    .end annotation

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LHM4;

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p1, Lco/bird/api/response/ProvisionSmartlockResponse;

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$N;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;

    invoke-virtual {p1}, Lco/bird/api/response/ProvisionSmartlockResponse;->getSmartlockResponse()Lco/bird/api/response/ProvisionalSmartlock;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/api/response/ProvisionalSmartlock;->getMacAddress()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;->access$setMacAddress$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$N;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;

    invoke-virtual {p1}, Lco/bird/api/response/ProvisionSmartlockResponse;->getKey()Lco/bird/api/response/ProvisionalKey;

    move-result-object v1

    invoke-virtual {v1}, Lco/bird/api/response/ProvisionalKey;->getAesEncryptionKey()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;->access$setNewAesKey$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$N;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;

    invoke-virtual {p1}, Lco/bird/api/response/ProvisionSmartlockResponse;->getKey()Lco/bird/api/response/ProvisionalKey;

    move-result-object p1

    invoke-virtual {p1}, Lco/bird/api/response/ProvisionalKey;->getPassword()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;->access$setNewPassword$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;Ljava/lang/String;)V

    return-void
.end method

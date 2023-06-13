.class public final Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$d;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;->W([B[B)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "[B",
        "Lio/reactivex/K<",
        "+[B>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0006\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "it",
        "Lio/reactivex/K;",
        "kotlin.jvm.PlatformType",
        "invoke",
        "([B)Lio/reactivex/K;",
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

.field public final synthetic h:[B


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;[B)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$d;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;

    iput-object p2, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$d;->h:[B

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke([B)Lio/reactivex/K;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([B)",
            "Lio/reactivex/K<",
            "+[B>;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$d;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$d;->h:[B

    invoke-static {p1, v0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;->access$newPasswordPayload(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;[B)[B

    move-result-object v0

    invoke-static {p1, v0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;->access$sendPayload(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter;[B)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationPresenter$d;->invoke([B)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method

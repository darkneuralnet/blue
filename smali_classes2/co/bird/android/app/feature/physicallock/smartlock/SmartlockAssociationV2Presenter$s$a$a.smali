.class public final Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$s$a$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$s$a;->b(Lco/bird/api/response/SmartlockResponse;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/api/response/SmartlockResponse;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/api/response/SmartlockResponse;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/api/response/SmartlockResponse;",
        "generateResponse",
        "Lio/reactivex/K;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lco/bird/api/response/SmartlockResponse;)Lio/reactivex/K;"
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

.field public final synthetic h:Lco/bird/api/response/SmartlockResponse;


# direct methods
.method public constructor <init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;Lco/bird/api/response/SmartlockResponse;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$s$a$a;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    iput-object p2, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$s$a$a;->h:Lco/bird/api/response/SmartlockResponse;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/api/response/SmartlockResponse;)Lio/reactivex/K;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/api/response/SmartlockResponse;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/api/response/SmartlockResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "generateResponse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$s$a$a;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    invoke-static {v0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$nonProvisionalKey(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;Lco/bird/api/response/SmartlockResponse;)Lco/bird/api/response/SmartlockKey;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$s$a$a;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    invoke-static {v0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$provisionalKey(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;Lco/bird/api/response/SmartlockResponse;)Lco/bird/api/response/SmartlockKey;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_1

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "missing required keys after calling generateKey, erroring out. response: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lg46;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$s$a$a;->g:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    invoke-static {p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->access$getUi$p(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)Lco/bird/android/app/feature/physicallock/smartlock/b;

    move-result-object p1

    sget v0, Lnl4;->smartlock_response_missing_expected_keys_error:I

    invoke-interface {p1, v0}, LaM5;->error(I)V

    new-instance p1, Ljava/lang/Exception;

    iget-object v0, p0, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$s$a$a;->h:Lco/bird/api/response/SmartlockResponse;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Response indicated that we needed to rekey but we did not have a provisional and non-provisional key supplied as expected ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lio/reactivex/F;->x(Ljava/lang/Throwable;)Lio/reactivex/F;

    move-result-object p1

    :goto_1
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/api/response/SmartlockResponse;

    invoke-virtual {p0, p1}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter$s$a$a;->a(Lco/bird/api/response/SmartlockResponse;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method

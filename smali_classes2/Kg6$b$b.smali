.class public final LKg6$b$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LKg6$b;->c(Lco/bird/android/model/Agreement;)Lio/reactivex/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Lio/reactivex/u<",
        "+",
        "Ltg1;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "payload",
        "Lio/reactivex/u;",
        "Ltg1;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Ljava/lang/String;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nUserAgreementPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserAgreementPresenter.kt\nco/bird/android/app/feature/useragreement/UserAgreementPresenterImpl$onCreate$2$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,180:1\n1#2:181\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LKg6;

.field public final synthetic h:Lco/bird/android/model/Agreement;


# direct methods
.method public constructor <init>(LKg6;Lco/bird/android/model/Agreement;)V
    .locals 0

    iput-object p1, p0, LKg6$b$b;->g:LKg6;

    iput-object p2, p0, LKg6$b$b;->h:Lco/bird/android/model/Agreement;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Lio/reactivex/u;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/u<",
            "+",
            "Ltg1;",
            ">;"
        }
    .end annotation

    const-string v0, "payload"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LKg6$b$b;->g:LKg6;

    invoke-static {v0, p1}, LKg6;->access$parsePayload(LKg6;Ljava/lang/String;)Lco/bird/android/model/AcceptedAgreementPayload;

    move-result-object p1

    iget-object v0, p0, LKg6$b$b;->g:LKg6;

    invoke-virtual {v0}, LKg6;->k()Lg9;

    move-result-object v0

    invoke-virtual {v0}, Lg9;->e()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_5

    iget-object v3, p0, LKg6$b$b;->h:Lco/bird/android/model/Agreement;

    invoke-virtual {v3}, Lco/bird/android/model/Agreement;->getRole()Lco/bird/android/model/AgreementRole;

    move-result-object v3

    sget-object v4, Lco/bird/android/model/AgreementRole;->MULTI_RIDE_GUEST:Lco/bird/android/model/AgreementRole;

    const/4 v5, 0x1

    if-ne v3, v4, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v2

    :goto_0
    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_5

    iget-object v3, p0, LKg6$b$b;->g:LKg6;

    iget-object v4, p0, LKg6$b$b;->h:Lco/bird/android/model/Agreement;

    invoke-virtual {v3}, LKg6;->p()LWg6;

    move-result-object v6

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lco/bird/android/model/AcceptedAgreementPayload;->getEmail()Ljava/lang/String;

    move-result-object v7

    goto :goto_2

    :cond_2
    move-object v7, v1

    :goto_2
    invoke-interface {v6, v0, v7}, LWg6;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3}, LKg6;->o()Llg6;

    move-result-object v3

    new-array v5, v5, [LvE1;

    new-instance v6, LvE1;

    invoke-virtual {v4}, Lco/bird/android/model/Agreement;->getId()Ljava/lang/String;

    move-result-object v4

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lco/bird/android/model/AcceptedAgreementPayload;->getEmail()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_4

    :cond_3
    const-string p1, ""

    :cond_4
    invoke-direct {v6, v4, v0, p1}, LvE1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    aput-object v6, v5, v2

    invoke-interface {v3, v5}, Llg6;->e([LvE1;)Lio/reactivex/p;

    move-result-object p1

    if-eqz p1, :cond_5

    goto :goto_3

    :cond_5
    iget-object p1, p0, LKg6$b$b;->g:LKg6;

    iget-object v0, p0, LKg6$b$b;->h:Lco/bird/android/model/Agreement;

    invoke-virtual {p1}, LKg6;->o()Llg6;

    move-result-object p1

    invoke-virtual {v0}, Lco/bird/android/model/Agreement;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Llg6;->h(Ljava/lang/String;)Lio/reactivex/p;

    move-result-object p1

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/p;->I(Lio/reactivex/E;)Lio/reactivex/p;

    move-result-object p1

    const-string v0, "run {\n                us\u2026dSchedulers.mainThread())"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LKg6$b$b;->g:LKg6;

    invoke-virtual {v0}, LKg6;->n()LRg6;

    move-result-object v0

    const/4 v3, 0x2

    invoke-static {p1, v0, v2, v3, v1}, LsD;->progress$default(Lio/reactivex/p;LS74;IILjava/lang/Object;)Lio/reactivex/p;

    move-result-object p1

    :goto_3
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, LKg6$b$b;->b(Ljava/lang/String;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method

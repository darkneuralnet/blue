.class public final Lyg6$q;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyg6;->J([Lco/bird/android/model/AgreementRole;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;
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
        "Lco/bird/api/response/AgreementResponse;",
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
        "Lco/bird/api/response/AgreementResponse;",
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
.field public final synthetic g:Lyg6;

.field public final synthetic h:[Lco/bird/android/model/AgreementRole;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lyg6;[Lco/bird/android/model/AgreementRole;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lyg6$q;->g:Lyg6;

    iput-object p2, p0, Lyg6$q;->h:[Lco/bird/android/model/AgreementRole;

    iput-object p3, p0, Lyg6$q;->i:Ljava/lang/String;

    iput-object p4, p0, Lyg6$q;->j:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LHM4;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/api/response/AgreementResponse;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, LHM4;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lyg6$q;->g:Lyg6;

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/api/response/AgreementResponse;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lco/bird/api/response/AgreementResponse;->getAgreements()Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_1

    :cond_0
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    move-result-object p1

    :cond_1
    iget-object v1, p0, Lyg6$q;->h:[Lco/bird/android/model/AgreementRole;

    iget-object v2, p0, Lyg6$q;->i:Ljava/lang/String;

    iget-object v3, p0, Lyg6$q;->j:Ljava/lang/String;

    invoke-static {v0, p1, v1, v2, v3}, Lyg6;->access$processIncomingAgreements(Lyg6;Ljava/util/List;[Lco/bird/android/model/AgreementRole;Ljava/lang/String;Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, Lyg6$q;->a(LHM4;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

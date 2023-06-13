.class public final Lja5$d$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lja5$d;->a(LHM4;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/buava/Optional<",
        "LMZ;",
        ">;",
        "Lco/bird/android/buava/Optional<",
        "LMZ;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lco/bird/android/buava/Optional;",
        "LMZ;",
        "it",
        "a",
        "(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/api/response/BeginnerModeRiderMapResponse;


# direct methods
.method public constructor <init>(Lco/bird/api/response/BeginnerModeRiderMapResponse;)V
    .locals 0

    iput-object p1, p0, Lja5$d$b;->g:Lco/bird/api/response/BeginnerModeRiderMapResponse;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/buava/Optional<",
            "LMZ;",
            ">;)",
            "Lco/bird/android/buava/Optional<",
            "LMZ;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lco/bird/android/buava/Optional;->c:Lco/bird/android/buava/Optional$a;

    new-instance v0, LMZ;

    iget-object v1, p0, Lja5$d$b;->g:Lco/bird/api/response/BeginnerModeRiderMapResponse;

    invoke-virtual {v1}, Lco/bird/api/response/BeginnerModeRiderMapResponse;->getBottomSheetNavigationTitle()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lja5$d$b;->g:Lco/bird/api/response/BeginnerModeRiderMapResponse;

    invoke-virtual {v2}, Lco/bird/api/response/BeginnerModeRiderMapResponse;->getActions()Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v1, v2}, LMZ;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-virtual {p1, v0}, Lco/bird/android/buava/Optional$a;->c(Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {p0, p1}, Lja5$d$b;->a(Lco/bird/android/buava/Optional;)Lco/bird/android/buava/Optional;

    move-result-object p1

    return-object p1
.end method

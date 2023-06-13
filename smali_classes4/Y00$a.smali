.class public final LY00$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LY00;->X(Ljava/lang/String;)Lio/reactivex/F;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/wire/WireBountyFlightSheetDetails;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/persistence/BountyFlightSheetDetails;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lco/bird/android/model/wire/WireBountyFlightSheetDetails;",
        "it",
        "Lio/reactivex/K;",
        "Lco/bird/android/model/persistence/BountyFlightSheetDetails;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/android/model/wire/WireBountyFlightSheetDetails;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LY00;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(LY00;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LY00$a;->g:LY00;

    iput-object p2, p0, LY00$a;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(LY00;Ljava/lang/String;)Lio/reactivex/K;
    .locals 0

    invoke-static {p0, p1}, LY00$a;->c(LY00;Ljava/lang/String;)Lio/reactivex/K;

    move-result-object p0

    return-object p0
.end method

.method public static final c(LY00;Ljava/lang/String;)Lio/reactivex/K;
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$bountyId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, LY00;->access$getBountyFlightSheetDetailsDao$p(LY00;)LK00;

    move-result-object p0

    invoke-virtual {p0, p1}, LK00;->a(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/android/model/wire/WireBountyFlightSheetDetails;)Lio/reactivex/K;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/wire/WireBountyFlightSheetDetails;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/persistence/BountyFlightSheetDetails;",
            ">;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LY00$a;->g:LY00;

    invoke-static {v0}, LY00;->access$getBountyFlightSheetDetailsDao$p(LY00;)LK00;

    move-result-object v0

    iget-object v1, p0, LY00$a;->h:Ljava/lang/String;

    invoke-static {p1, v1}, Lz00;->a(Lco/bird/android/model/wire/WireBountyFlightSheetDetails;Ljava/lang/String;)Lco/bird/android/model/persistence/BountyFlightSheetDetails;

    move-result-object p1

    invoke-virtual {v0, p1}, LK00;->c(Lco/bird/android/model/persistence/BountyFlightSheetDetails;)Lio/reactivex/c;

    move-result-object p1

    iget-object v0, p0, LY00$a;->g:LY00;

    iget-object v1, p0, LY00$a;->h:Ljava/lang/String;

    new-instance v2, LX00;

    invoke-direct {v2, v0, v1}, LX00;-><init>(LY00;Ljava/lang/String;)V

    invoke-static {v2}, Lio/reactivex/F;->k(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/wire/WireBountyFlightSheetDetails;

    invoke-virtual {p0, p1}, LY00$a;->b(Lco/bird/android/model/wire/WireBountyFlightSheetDetails;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method

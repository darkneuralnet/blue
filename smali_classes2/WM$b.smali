.class public final LWM$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LWM;->c(Ljava/lang/String;Lco/bird/android/model/wire/WirePart;Lco/bird/android/model/wire/WirePart;)Lio/reactivex/F;
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
        "Lco/bird/android/model/wire/WirePart;",
        ">;",
        "Lio/reactivex/K<",
        "+",
        "LHM4<",
        "Lco/bird/android/model/wire/WirePart;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001aB\u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000 \u0004* \u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0001 \u0004*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LHM4;",
        "Lco/bird/android/model/wire/WirePart;",
        "it",
        "Lio/reactivex/K;",
        "kotlin.jvm.PlatformType",
        "b",
        "(LHM4;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LWM;

.field public final synthetic h:Ljava/lang/String;


# direct methods
.method public constructor <init>(LWM;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, LWM$b;->g:LWM;

    iput-object p2, p0, LWM$b;->h:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LWM$b;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(LHM4;)Lio/reactivex/K;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LHM4<",
            "Lco/bird/android/model/wire/WirePart;",
            ">;)",
            "Lio/reactivex/K<",
            "+",
            "LHM4<",
            "Lco/bird/android/model/wire/WirePart;",
            ">;>;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LHM4;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/WirePart;

    if-nez v0, :cond_0

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v1, p0, LWM$b;->g:LWM;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WirePart;->getKind()Lco/bird/android/model/constant/PartKind;

    move-result-object v2

    invoke-static {v1, v2}, LWM;->access$leaseType(LWM;Lco/bird/android/model/constant/PartKind;)Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    move-result-object v1

    sget-object v2, Lco/bird/android/model/itemlease/enum/ItemLeaseType;->UNKNOWN:Lco/bird/android/model/itemlease/enum/ItemLeaseType;

    if-eq v1, v2, :cond_1

    iget-object v2, p0, LWM$b;->g:LWM;

    invoke-static {v2}, LWM;->access$getItemLeaseManager$p(LWM;)LMc2;

    move-result-object v2

    invoke-virtual {v0}, Lco/bird/android/model/wire/WirePart;->getId()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x1

    iget-object v4, p0, LWM$b;->h:Ljava/lang/String;

    invoke-interface {v2, v1, v3, v0, v4}, LMc2;->o(Lco/bird/android/model/itemlease/enum/ItemLeaseType;ZLjava/lang/String;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/F;->G()Lio/reactivex/c;

    move-result-object v0

    sget-object v1, LWM$b$a;->g:LWM$b$a;

    new-instance v2, LXM;

    invoke-direct {v2, v1}, LXM;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, v2}, Lio/reactivex/c;->B(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {v0}, Lio/reactivex/c;->Q()Lio/reactivex/c;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-static {}, Lio/reactivex/c;->p()Lio/reactivex/c;

    move-result-object v0

    :goto_0
    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/reactivex/c;->m(Lio/reactivex/K;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LHM4;

    invoke-virtual {p0, p1}, LWM$b;->b(LHM4;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method

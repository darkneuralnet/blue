.class public final LLK$L;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LLK;->d(Lco/bird/android/model/wire/WireBird;ZLKY;LbE5;ZZ)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/Vehicle;",
        "Lio/reactivex/K<",
        "+",
        "Lco/bird/android/model/Vehicle;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/model/Vehicle;",
        "vehicle",
        "Lio/reactivex/K;",
        "kotlin.jvm.PlatformType",
        "c",
        "(Lco/bird/android/model/Vehicle;)Lio/reactivex/K;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:Z

.field public final synthetic i:LLK;

.field public final synthetic j:Lco/bird/android/model/wire/WireBird;


# direct methods
.method public constructor <init>(ZZLLK;Lco/bird/android/model/wire/WireBird;)V
    .locals 0

    iput-boolean p1, p0, LLK$L;->g:Z

    iput-boolean p2, p0, LLK$L;->h:Z

    iput-object p3, p0, LLK$L;->i:LLK;

    iput-object p4, p0, LLK$L;->j:Lco/bird/android/model/wire/WireBird;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lco/bird/android/model/Vehicle;)Lco/bird/android/model/Vehicle;
    .locals 0

    invoke-static {p0}, LLK$L;->e(Lco/bird/android/model/Vehicle;)Lco/bird/android/model/Vehicle;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lco/bird/android/model/Vehicle;)Lco/bird/android/model/Vehicle;
    .locals 0

    invoke-static {p0}, LLK$L;->d(Lco/bird/android/model/Vehicle;)Lco/bird/android/model/Vehicle;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lco/bird/android/model/Vehicle;)Lco/bird/android/model/Vehicle;
    .locals 1

    const-string v0, "$vehicle"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final e(Lco/bird/android/model/Vehicle;)Lco/bird/android/model/Vehicle;
    .locals 1

    const-string v0, "$vehicle"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method


# virtual methods
.method public final c(Lco/bird/android/model/Vehicle;)Lio/reactivex/K;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/Vehicle;",
            ")",
            "Lio/reactivex/K<",
            "+",
            "Lco/bird/android/model/Vehicle;",
            ">;"
        }
    .end annotation

    const-string v0, "vehicle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, LLK$L;->g:Z

    if-eqz v0, :cond_0

    iget-boolean v1, p0, LLK$L;->h:Z

    if-eqz v1, :cond_0

    iget-object v0, p0, LLK$L;->i:LLK;

    invoke-virtual {v0}, LLK;->P1()LaM;

    move-result-object v0

    iget-object v1, p0, LLK$L;->j:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, LaM;->m1(Ljava/lang/String;)Lio/reactivex/c;

    move-result-object v0

    new-instance v1, LPK;

    invoke-direct {v1, p1}, LPK;-><init>(Lco/bird/android/model/Vehicle;)V

    invoke-virtual {v0, v1}, Lio/reactivex/c;->i0(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_0
    if-eqz v0, :cond_1

    iget-boolean v0, p0, LLK$L;->h:Z

    if-nez v0, :cond_1

    iget-object v0, p0, LLK$L;->i:LLK;

    invoke-virtual {v0}, LLK;->P1()LaM;

    move-result-object v0

    iget-object v1, p0, LLK$L;->j:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v1}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, LaM;->d1(Ljava/lang/String;)Lio/reactivex/c;

    move-result-object v0

    new-instance v1, LQK;

    invoke-direct {v1, p1}, LQK;-><init>(Lco/bird/android/model/Vehicle;)V

    invoke-virtual {v0, v1}, Lio/reactivex/c;->i0(Ljava/util/concurrent/Callable;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/Vehicle;

    invoke-virtual {p0, p1}, LLK$L;->c(Lco/bird/android/model/Vehicle;)Lio/reactivex/K;

    move-result-object p1

    return-object p1
.end method

.class public final LUz1$b$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LUz1$b;->invoke(Ljava/lang/Boolean;)Lio/reactivex/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lco/bird/android/model/User;",
        "Lio/reactivex/u<",
        "+",
        "Lco/bird/android/buava/Optional<",
        "Lco/bird/android/model/wire/WireFrequentFlyerView;",
        ">;>;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001aB\u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\u0008\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0006\u0010\u0007"
    }
    d2 = {
        "Lco/bird/android/model/User;",
        "it",
        "Lio/reactivex/u;",
        "Lco/bird/android/buava/Optional;",
        "Lco/bird/android/model/wire/WireFrequentFlyerView;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lco/bird/android/model/User;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LUz1;


# direct methods
.method public constructor <init>(LUz1;)V
    .locals 0

    iput-object p1, p0, LUz1$b$a;->g:LUz1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;
    .locals 0

    invoke-static {p0, p1}, LUz1$b$a;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/buava/Optional;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/buava/Optional;

    return-object p0
.end method


# virtual methods
.method public final b(Lco/bird/android/model/User;)Lio/reactivex/u;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/model/User;",
            ")",
            "Lio/reactivex/u<",
            "+",
            "Lco/bird/android/buava/Optional<",
            "Lco/bird/android/model/wire/WireFrequentFlyerView;",
            ">;>;"
        }
    .end annotation

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LUz1$b$a;->g:LUz1;

    invoke-static {p1}, LUz1;->access$getClient$p(LUz1;)LPz1;

    move-result-object p1

    invoke-interface {p1}, LPz1;->a()Lio/reactivex/p;

    move-result-object p1

    const/4 v0, 0x3

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, LYf5;->e0(Lio/reactivex/p;II)Lio/reactivex/p;

    move-result-object p1

    invoke-virtual {p1}, Lio/reactivex/p;->J()Lio/reactivex/p;

    move-result-object p1

    sget-object v0, LUz1$b$a$a;->g:LUz1$b$a$a;

    new-instance v1, LWz1;

    invoke-direct {v1, v0}, LWz1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/p;->H(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/model/User;

    invoke-virtual {p0, p1}, LUz1$b$a;->b(Lco/bird/android/model/User;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method

.class public final LbX4$b$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LbX4$b;->c(Lco/bird/android/model/persistence/RidePassView;)Lio/reactivex/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lkotlin/Unit;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "",
        "it",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Lkotlin/Unit;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LbX4;

.field public final synthetic h:Lco/bird/android/model/persistence/RidePassView;


# direct methods
.method public constructor <init>(LbX4;Lco/bird/android/model/persistence/RidePassView;)V
    .locals 0

    iput-object p1, p0, LbX4$b$a;->g:LbX4;

    iput-object p2, p0, LbX4$b$a;->h:Lco/bird/android/model/persistence/RidePassView;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, LbX4$b$a;->invoke$lambda$0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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
.method public final b(Lkotlin/Unit;)Lio/reactivex/h;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, LbX4$b$a;->g:LbX4;

    invoke-static {p1}, LbX4;->access$getRidePassManager$p(LbX4;)LWU4;

    move-result-object p1

    iget-object v0, p0, LbX4$b$a;->h:Lco/bird/android/model/persistence/RidePassView;

    const-string v1, "ridePass"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v0}, LWU4;->d(Lco/bird/android/model/persistence/RidePassView;)Lio/reactivex/c;

    move-result-object p1

    iget-object v0, p0, LbX4$b$a;->g:LbX4;

    invoke-static {v0}, LbX4;->access$getRidePassManager$p(LbX4;)LWU4;

    move-result-object v0

    invoke-interface {v0}, LWU4;->refresh()Lio/reactivex/c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/c;->i(Lio/reactivex/h;)Lio/reactivex/c;

    move-result-object p1

    new-instance v0, LbX4$b$a$a;

    iget-object v1, p0, LbX4$b$a;->g:LbX4;

    invoke-direct {v0, v1}, LbX4$b$a$a;-><init>(LbX4;)V

    new-instance v1, LeX4;

    invoke-direct {v1, v0}, LeX4;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/c;->E(Lio/reactivex/functions/g;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlin/Unit;

    invoke-virtual {p0, p1}, LbX4$b$a;->b(Lkotlin/Unit;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method

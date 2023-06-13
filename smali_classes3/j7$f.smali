.class public final Lj7$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lj7;->t(Lk7;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LJO5;",
        "Lio/reactivex/B<",
        "+",
        "Lco/bird/android/model/persistence/OperatorOrderView;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LJO5;",
        "state",
        "Lio/reactivex/B;",
        "Lco/bird/android/model/persistence/OperatorOrderView;",
        "kotlin.jvm.PlatformType",
        "a",
        "(LJO5;)Lio/reactivex/B;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lj7;


# direct methods
.method public constructor <init>(Lj7;)V
    .locals 0

    iput-object p1, p0, Lj7$f;->g:Lj7;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LJO5;)Lio/reactivex/B;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LJO5;",
            ")",
            "Lio/reactivex/B<",
            "+",
            "Lco/bird/android/model/persistence/OperatorOrderView;",
            ">;"
        }
    .end annotation

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lj7$f;->g:Lj7;

    invoke-static {v0}, Lj7;->access$getTransferOrderManager$p(Lj7;)LO86;

    move-result-object v0

    invoke-virtual {p1}, LJO5;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LJO5;->c()Lco/bird/android/model/constant/OperatorOrderViewType;

    move-result-object p1

    invoke-interface {v0, v1, p1}, LO86;->W(Ljava/lang/String;Lco/bird/android/model/constant/OperatorOrderViewType;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LJO5;

    invoke-virtual {p0, p1}, Lj7$f;->a(LJO5;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method

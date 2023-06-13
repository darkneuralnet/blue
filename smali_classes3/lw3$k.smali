.class public final Llw3$k;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llw3;->z(Ltw3;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "LSc0;",
        "Lio/reactivex/B<",
        "+",
        "Lco/bird/android/model/wire/WireBird;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "LSc0;",
        "cancelData",
        "Lio/reactivex/B;",
        "Lco/bird/android/model/wire/WireBird;",
        "kotlin.jvm.PlatformType",
        "a",
        "(LSc0;)Lio/reactivex/B;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Llw3;


# direct methods
.method public constructor <init>(Llw3;)V
    .locals 0

    iput-object p1, p0, Llw3$k;->g:Llw3;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(LSc0;)Lio/reactivex/B;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LSc0;",
            ")",
            "Lio/reactivex/B<",
            "+",
            "Lco/bird/android/model/wire/WireBird;",
            ">;"
        }
    .end annotation

    const-string v0, "cancelData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LSc0;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Llw3$k;->g:Llw3;

    invoke-static {v0}, Llw3;->access$getOperatorManager$p(Llw3;)Lom3;

    move-result-object v0

    invoke-virtual {p1}, LSc0;->d()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lom3;->f1(Ljava/lang/String;)Lio/reactivex/Observable;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v0, p0, Llw3$k;->g:Llw3;

    invoke-static {v0}, Llw3;->access$getNavigator$p(Llw3;)Le13;

    move-result-object v0

    invoke-virtual {p1}, LSc0;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, LSc0;->d()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Le13;->r0(Ljava/lang/String;Ljava/lang/String;)V

    iget-object p1, p0, Llw3$k;->g:Llw3;

    sget-object v0, LIL4;->a:LIL4;

    invoke-virtual {p1, v0}, Lf1;->h(Ljava/lang/Object;)V

    invoke-static {}, Lio/reactivex/Observable;->empty()Lio/reactivex/Observable;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LSc0;

    invoke-virtual {p0, p1}, Llw3$k;->a(LSc0;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method

.class public final Lco3$n$b;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco3$n;->e(Lco/bird/android/model/NestFlightSheetButton;)Lio/reactivex/K;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/util/List<",
        "+",
        "Ljava/lang/String;",
        ">;",
        "Lio/reactivex/h;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "",
        "",
        "partnerIds",
        "Lio/reactivex/h;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Ljava/util/List;)Lio/reactivex/h;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lco3;

.field public final synthetic h:Lco/bird/android/model/NestFlightSheetButton;


# direct methods
.method public constructor <init>(Lco3;Lco/bird/android/model/NestFlightSheetButton;)V
    .locals 0

    iput-object p1, p0, Lco3$n$b;->g:Lco3;

    iput-object p2, p0, Lco3$n$b;->h:Lco/bird/android/model/NestFlightSheetButton;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lio/reactivex/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lio/reactivex/h;"
        }
    .end annotation

    const-string v0, "partnerIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco3$n$b;->g:Lco3;

    invoke-static {v0}, Lco3;->access$getNestManager$p(Lco3;)Ls43;

    move-result-object v0

    iget-object v1, p0, Lco3$n$b;->h:Lco/bird/android/model/NestFlightSheetButton;

    check-cast v1, Lco/bird/android/model/FavoriteNestButton;

    invoke-virtual {v1}, Lco/bird/android/model/FavoriteNestButton;->getNestId()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ls43;->i(Ljava/lang/String;Ljava/util/List;)Lio/reactivex/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lco3$n$b;->a(Ljava/util/List;)Lio/reactivex/h;

    move-result-object p1

    return-object p1
.end method

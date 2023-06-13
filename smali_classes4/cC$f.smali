.class public final LcC$f;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LcC;->B(Lco/bird/android/model/constant/ScanMode;Lco/bird/android/model/constant/ScanIntention;Z)Lio/reactivex/Observable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Ljava/lang/String;",
        "Lio/reactivex/u<",
        "+",
        "Lco/bird/android/model/persistence/Bird;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0007\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004\"\u0008\u0008\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0007\u0010\u0008"
    }
    d2 = {
        "LjE;",
        "T",
        "",
        "result",
        "Lio/reactivex/u;",
        "Lco/bird/android/model/persistence/Bird;",
        "kotlin.jvm.PlatformType",
        "b",
        "(Ljava/lang/String;)Lio/reactivex/u;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:LcC;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LcC<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic h:Lco/bird/android/model/constant/ScanMode;

.field public final synthetic i:Lco/bird/android/model/constant/ScanIntention;


# direct methods
.method public constructor <init>(LcC;Lco/bird/android/model/constant/ScanMode;Lco/bird/android/model/constant/ScanIntention;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LcC<",
            "TT;>;",
            "Lco/bird/android/model/constant/ScanMode;",
            "Lco/bird/android/model/constant/ScanIntention;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LcC$f;->g:LcC;

    iput-object p2, p0, LcC$f;->h:Lco/bird/android/model/constant/ScanMode;

    iput-object p3, p0, LcC$f;->i:Lco/bird/android/model/constant/ScanIntention;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/String;)Lio/reactivex/u;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/u<",
            "+",
            "Lco/bird/android/model/persistence/Bird;",
            ">;"
        }
    .end annotation

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LcC$f;->g:LcC;

    invoke-virtual {v0}, LcC;->u()Lom3;

    move-result-object v0

    iget-object v1, p0, LcC$f;->h:Lco/bird/android/model/constant/ScanMode;

    iget-object v2, p0, LcC$f;->i:Lco/bird/android/model/constant/ScanIntention;

    invoke-interface {v0, p1, v1, v2}, Lom3;->c0(Ljava/lang/String;Lco/bird/android/model/constant/ScanMode;Lco/bird/android/model/constant/ScanIntention;)Lio/reactivex/p;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, LcC$f;->b(Ljava/lang/String;)Lio/reactivex/u;

    move-result-object p1

    return-object p1
.end method

.class public final LGJ1$v;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LGJ1;->R()V
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
        "LcJ1$b;",
        ">;",
        "LcJ1$b;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lco/bird/android/buava/Optional;",
        "LcJ1$b;",
        "kotlin.jvm.PlatformType",
        "it",
        "a",
        "(Lco/bird/android/buava/Optional;)LcJ1$b;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nHelmetLeaseReturnScannerPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HelmetLeaseReturnScannerPresenter.kt\nco/bird/android/feature/itemlease/offboarding/HelmetLeaseReturnScannerPresenter$onResume$5\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,445:1\n1#2:446\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:LGJ1;


# direct methods
.method public constructor <init>(LGJ1;)V
    .locals 0

    iput-object p1, p0, LGJ1$v;->g:LGJ1;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lco/bird/android/buava/Optional;)LcJ1$b;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/buava/Optional<",
            "LcJ1$b;",
            ">;)",
            "LcJ1$b;"
        }
    .end annotation

    invoke-virtual {p1}, Lco/bird/android/buava/Optional;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LcJ1$b;

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    iget-object v1, p0, LGJ1$v;->g:LGJ1;

    invoke-static {v1}, LGJ1;->access$getItemLease$p(LGJ1;)Lco/bird/android/model/itemlease/ItemLease;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, "itemLease"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v0

    :cond_0
    invoke-static {p1, v1}, LKi1;->g(LcJ1$b;Lco/bird/android/model/itemlease/ItemLease;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-static {p1}, LKi1;->b(LcJ1$b;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v1, 0x1

    :goto_1
    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    move-object p1, v0

    :goto_2
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lco/bird/android/buava/Optional;

    invoke-virtual {p0, p1}, LGJ1$v;->a(Lco/bird/android/buava/Optional;)LcJ1$b;

    move-result-object p1

    return-object p1
.end method

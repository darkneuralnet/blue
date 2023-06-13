.class public final LV40;
.super LmA;
.source "SourceFile"

# interfaces
.implements LU40;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0008\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0018\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0017"
    }
    d2 = {
        "LV40;",
        "LmA;",
        "LU40;",
        "",
        "show",
        "",
        "hiddenState",
        "",
        "showProgress",
        "LnQ5;",
        "d",
        "LnQ5;",
        "oc",
        "()LnQ5;",
        "x7",
        "(LnQ5;)V",
        "dialog",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "Lf3;",
        "binding",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;Lf3;)V",
        "bulk-scanner_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public d:LnQ5;


# direct methods
.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;Lf3;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "binding"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, LmA;-><init>(Lco/bird/android/core/mvp/BaseActivity;Lf3;)V

    return-void
.end method


# virtual methods
.method public Td()V
    .locals 0

    invoke-static {p0}, LU40$a;->a(LU40;)V

    return-void
.end method

.method public g1(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "LH6;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0, p1}, LU40$a;->b(LU40;Ljava/util/List;)V

    return-void
.end method

.method public ig(Lco/bird/android/widget/adapter/ViewHolderSupplier;)Lio/reactivex/Observable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/bird/android/widget/adapter/ViewHolderSupplier<",
            "LeT0;",
            ">;)",
            "Lio/reactivex/Observable<",
            "LnQ5$b;",
            ">;"
        }
    .end annotation

    invoke-static {p0, p1}, LU40$a;->c(LU40;Lco/bird/android/widget/adapter/ViewHolderSupplier;)Lio/reactivex/Observable;

    move-result-object p1

    return-object p1
.end method

.method public oc()LnQ5;
    .locals 1

    iget-object v0, p0, LV40;->d:LnQ5;

    return-object v0
.end method

.method public showProgress(ZI)V
    .locals 1

    invoke-virtual {p0}, LV40;->oc()LnQ5;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, LnQ5;->showProgress(ZI)V

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    invoke-super {p0, p1, p2}, LXC;->showProgress(ZI)V

    :cond_1
    return-void
.end method

.method public x7(LnQ5;)V
    .locals 0

    iput-object p1, p0, LV40;->d:LnQ5;

    return-void
.end method

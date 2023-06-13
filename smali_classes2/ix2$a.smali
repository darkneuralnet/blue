.class public final Lix2$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lix2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\r\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0011\u001a\u00020\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\t\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0018"
    }
    d2 = {
        "Lix2$a;",
        "Lw1;",
        "Landroid/view/View;",
        "view",
        "",
        "position",
        "",
        "e",
        "bind",
        "b",
        "Landroid/view/View;",
        "getView",
        "()Landroid/view/View;",
        "Lix2;",
        "c",
        "Lix2;",
        "()Lix2;",
        "adapter",
        "Ler6;",
        "d",
        "Ler6;",
        "binding",
        "<init>",
        "(Lix2;Landroid/view/View;Lix2;)V",
        "app_birdRelease"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final b:Landroid/view/View;

.field public final c:Lix2;

.field public final d:Ler6;

.field public final synthetic e:Lix2;


# direct methods
.method public constructor <init>(Lix2;Landroid/view/View;Lix2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            "Lix2;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "adapter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lix2$a;->e:Lix2;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    iput-object p2, p0, Lix2$a;->b:Landroid/view/View;

    iput-object p3, p0, Lix2$a;->c:Lix2;

    invoke-static {p2}, Ler6;->a(Landroid/view/View;)Ler6;

    move-result-object p1

    const-string p3, "bind(view)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lix2$a;->d:Ler6;

    new-instance p1, Lix2$a$a;

    invoke-direct {p1, p0}, Lix2$a$a;-><init>(Lix2$a;)V

    invoke-static {p2, p1}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lix2$a;->i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic access$getBinding$p(Lix2$a;)Ler6;
    .locals 0

    iget-object p0, p0, Lix2$a;->d:Ler6;

    return-object p0
.end method

.method public static final i(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b()Lix2;
    .locals 1

    iget-object v0, p0, Lix2$a;->c:Lix2;

    return-object v0
.end method

.method public bind(I)V
    .locals 1

    iget-object v0, p0, Lix2$a;->c:Lix2;

    invoke-virtual {v0, p1}, Lct4;->q(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/WirePhysicalLockReplacementType;

    iget-object v0, p0, Lix2$a;->d:Ler6;

    iget-object v0, v0, Ler6;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, Lco/bird/android/model/wire/WirePhysicalLockReplacementType;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final e(Landroid/view/View;I)V
    .locals 2
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CheckResult"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lix2$a;->e:Lix2;

    invoke-static {v0}, Lix2;->access$getCurrentPositionSubject$p(Lix2;)Lio/reactivex/subjects/d;

    move-result-object v0

    new-instance v1, Lix2$a$b;

    invoke-direct {v1, p2, p1, p0}, Lix2$a$b;-><init>(ILandroid/view/View;Lix2$a;)V

    new-instance p1, Lhx2;

    invoke-direct {p1, v1}, Lhx2;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

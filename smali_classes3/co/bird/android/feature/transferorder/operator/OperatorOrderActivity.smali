.class public final Lco/bird/android/feature/transferorder/operator/OperatorOrderActivity;
.super Lco/bird/android/core/mrp/BaseActivityLite;
.source "SourceFile"

# interfaces
.implements LOp3;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\u0008-\u0010.J\u0012\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\"\u0010\u000c\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\u0008\u0010\r\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0016R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\"\u0004\u0008\u0016\u0010\u0017R\"\u0010 \u001a\u00020\u00198\u0006@\u0006X\u0087.\u00a2\u0006\u0012\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0000@\u0000X\u0080.\u00a2\u0006\u0012\n\u0004\u0008\"\u0010#\u001a\u0004\u0008$\u0010%\"\u0004\u0008&\u0010\'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008*\u0010+\u00a8\u0006/"
    }
    d2 = {
        "Lco/bird/android/feature/transferorder/operator/OperatorOrderActivity;",
        "Lco/bird/android/core/mrp/BaseActivityLite;",
        "LOp3;",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onCreate",
        "",
        "requestCode",
        "resultCode",
        "Landroid/content/Intent;",
        "data",
        "onActivityResult",
        "onBackPressed",
        "LPp3;",
        "state",
        "S",
        "LMp3;",
        "j",
        "LMp3;",
        "R",
        "()LMp3;",
        "setPresenter",
        "(LMp3;)V",
        "presenter",
        "LGp3;",
        "k",
        "LGp3;",
        "Q",
        "()LGp3;",
        "setOperatorOrderNavigator",
        "(LGp3;)V",
        "operatorOrderNavigator",
        "Lco/bird/android/feature/transferorder/operator/b;",
        "l",
        "Lco/bird/android/feature/transferorder/operator/b;",
        "P",
        "()Lco/bird/android/feature/transferorder/operator/b;",
        "U",
        "(Lco/bird/android/feature/transferorder/operator/b;)V",
        "component",
        "Lx4;",
        "m",
        "Lx4;",
        "binding",
        "<init>",
        "()V",
        "co.bird.android.feature.transfer-order"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nOperatorOrderActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorOrderActivity.kt\nco/bird/android/feature/transferorder/operator/OperatorOrderActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,53:1\n1#2:54\n1855#3,2:55\n*S KotlinDebug\n*F\n+ 1 OperatorOrderActivity.kt\nco/bird/android/feature/transferorder/operator/OperatorOrderActivity\n*L\n39#1:55,2\n*E\n"
    }
.end annotation


# instance fields
.field public j:LMp3;

.field public k:LGp3;

.field public l:Lco/bird/android/feature/transferorder/operator/b;

.field public m:Lx4;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lco/bird/android/core/mrp/BaseActivityLite;-><init>()V

    return-void
.end method


# virtual methods
.method public final P()Lco/bird/android/feature/transferorder/operator/b;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/transferorder/operator/OperatorOrderActivity;->l:Lco/bird/android/feature/transferorder/operator/b;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "component"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final Q()LGp3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/transferorder/operator/OperatorOrderActivity;->k:LGp3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "operatorOrderNavigator"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final R()LMp3;
    .locals 1

    iget-object v0, p0, Lco/bird/android/feature/transferorder/operator/OperatorOrderActivity;->j:LMp3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public S(LPp3;)V
    .locals 4

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lvt2;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->F()Lsx4;

    move-result-object v0

    check-cast p1, Lvt2;

    invoke-virtual {p1}, Lvt2;->b()Z

    move-result p1

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, LS74$a;->showProgress$default(LS74;ZIILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final U(Lco/bird/android/feature/transferorder/operator/b;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/transferorder/operator/OperatorOrderActivity;->l:Lco/bird/android/feature/transferorder/operator/b;

    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 2

    invoke-super {p0, p1, p2, p3}, Lco/bird/android/core/base/BaseCoreActivity;->onActivityResult(IILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->z0()Ljava/util/List;

    move-result-object v0

    const-string v1, "supportFragmentManager.fragments"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/fragment/app/Fragment;

    invoke-virtual {v1, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onBackPressed()V
    .locals 1

    invoke-virtual {p0}, Lco/bird/android/feature/transferorder/operator/OperatorOrderActivity;->Q()LGp3;

    move-result-object v0

    invoke-virtual {v0}, LKA;->a()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-super {p0}, Lco/bird/android/core/base/BaseCoreActivity;->onBackPressed()V

    :cond_0
    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Lco/bird/android/core/mrp/BaseActivityLite;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, Lx4;->c(Landroid/view/LayoutInflater;)Lx4;

    move-result-object p1

    const-string v0, "inflate(layoutInflater)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lco/bird/android/feature/transferorder/operator/OperatorOrderActivity;->m:Lx4;

    if-nez p1, :cond_0

    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p1}, Lx4;->b()Landroid/widget/FrameLayout;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->setContentView(Landroid/view/View;)V

    invoke-static {}, Lco/bird/android/feature/transferorder/operator/a;->a()Lco/bird/android/feature/transferorder/operator/b$a;

    move-result-object p1

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->H()LlG2;

    move-result-object v0

    invoke-virtual {p0}, Lco/bird/android/core/mrp/BaseActivityLite;->E()Lco/bird/android/core/mrp/BaseActivityLite$a;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v2

    const-string v3, "supportFragmentManager"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget v3, Ldi4;->container:I

    invoke-interface {p1, v0, v1, v2, v3}, Lco/bird/android/feature/transferorder/operator/b$a;->a(LlG2;Lco/bird/android/core/mrp/BaseActivityLite$a;Landroidx/fragment/app/FragmentManager;I)Lco/bird/android/feature/transferorder/operator/b;

    move-result-object p1

    invoke-interface {p1, p0}, Lco/bird/android/feature/transferorder/operator/b;->a(Lco/bird/android/feature/transferorder/operator/OperatorOrderActivity;)V

    invoke-virtual {p0, p1}, Lco/bird/android/feature/transferorder/operator/OperatorOrderActivity;->U(Lco/bird/android/feature/transferorder/operator/b;)V

    invoke-virtual {p0}, Lco/bird/android/feature/transferorder/operator/OperatorOrderActivity;->R()LMp3;

    move-result-object p1

    invoke-virtual {p1, p0}, LMp3;->q(LOp3;)V

    return-void
.end method

.method public bridge synthetic render(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LPp3;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/transferorder/operator/OperatorOrderActivity;->S(LPp3;)V

    return-void
.end method

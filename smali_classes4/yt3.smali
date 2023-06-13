.class public final Lyt3;
.super LcE;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lyt3$a;,
        Lyt3$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LcE<",
        "LEt3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u0000 !2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\"#B\u0007\u00a2\u0006\u0004\u0008\u001f\u0010 J\u001a\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0008\u0010\t\u001a\u00020\u0007H\u0016J\"\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\n2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010R\"\u0010\u0019\u001a\u00020\u00028\u0016@\u0016X\u0097.\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R\"\u0010\u001e\u001a\u0010\u0012\u000c\u0012\n \u001b*\u0004\u0018\u00010\u00110\u00110\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006$"
    }
    d2 = {
        "Lyt3;",
        "LcE;",
        "LEt3;",
        "Landroid/view/View;",
        "view",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onViewCreated",
        "onResume",
        "",
        "requestCode",
        "resultCode",
        "Landroid/content/Intent;",
        "data",
        "onActivityResult",
        "Lio/reactivex/F;",
        "Lco/bird/android/model/wire/WireBird;",
        "N6",
        "e",
        "LEt3;",
        "a5",
        "()LEt3;",
        "t8",
        "(LEt3;)V",
        "presenter",
        "Lio/reactivex/subjects/g;",
        "kotlin.jvm.PlatformType",
        "f",
        "Lio/reactivex/subjects/g;",
        "resultSubject",
        "<init>",
        "()V",
        "g",
        "a",
        "b",
        "vehiclescanner_release"
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
        "SMAP\nOperatorSingleScanBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorSingleScanBottomSheet.kt\nco/bird/android/vehiclescanner/operator/OperatorSingleScanBottomSheet\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,126:1\n64#2:127\n1#3:128\n*S KotlinDebug\n*F\n+ 1 OperatorSingleScanBottomSheet.kt\nco/bird/android/vehiclescanner/operator/OperatorSingleScanBottomSheet\n*L\n73#1:127\n*E\n"
    }
.end annotation


# static fields
.field public static final g:Lyt3$a;


# instance fields
.field public e:LEt3;

.field public final f:Lio/reactivex/subjects/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/g<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lyt3$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lyt3$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lyt3;->g:Lyt3$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, LcE;-><init>()V

    invoke-static {}, Lio/reactivex/subjects/g;->w0()Lio/reactivex/subjects/g;

    move-result-object v0

    const-string v1, "create<WireBird>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lyt3;->f:Lio/reactivex/subjects/g;

    return-void
.end method


# virtual methods
.method public final N6()Lio/reactivex/F;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/wire/WireBird;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lyt3;->f:Lio/reactivex/subjects/g;

    invoke-virtual {v0}, Lio/reactivex/F;->F()Lio/reactivex/F;

    move-result-object v0

    const-string v1, "resultSubject.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public a5()LEt3;
    .locals 1

    iget-object v0, p0, Lyt3;->e:LEt3;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "presenter"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public bridge synthetic getPresenter()LiE;
    .locals 1

    invoke-virtual {p0}, Lyt3;->a5()LEt3;

    move-result-object v0

    return-object v0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    const/16 v0, 0x2710

    if-ne p1, v0, :cond_0

    const/4 p1, -0x1

    if-ne p2, p1, :cond_0

    if-eqz p3, :cond_0

    const-string p1, "bird"

    invoke-virtual {p3, p1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lco/bird/android/model/wire/WireBird;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lyt3;->a5()LEt3;

    move-result-object p2

    invoke-virtual {p2, p1}, LEt3;->L(Lco/bird/android/model/wire/WireBird;)V

    :cond_0
    return-void
.end method

.method public onResume()V
    .locals 6

    invoke-super {p0}, LcE;->onResume()V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_4

    const-string v1, "scan_mode"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {v0}, Lco/bird/android/model/constant/ScanMode;->valueOf(Ljava/lang/String;)Lco/bird/android/model/constant/ScanMode;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    const-string v3, "scan_intention"

    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/constant/ScanIntention;

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v3

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    const-string v5, "show_code_input"

    invoke-virtual {v3, v5, v4}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    :cond_2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v3

    if-eqz v3, :cond_3

    const-string v2, "required_vehicle_id"

    invoke-virtual {v3, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_3
    invoke-virtual {p0}, Lyt3;->a5()LEt3;

    move-result-object v3

    invoke-virtual {v3, v0, v1, v4, v2}, LEt3;->M(Lco/bird/android/model/constant/ScanMode;Lco/bird/android/model/constant/ScanIntention;ZLjava/lang/String;)V

    :cond_4
    :goto_1
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 10

    const-string p2, "view"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p2

    instance-of v0, p2, Lco/bird/android/core/mvp/BaseActivity;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p2, Lco/bird/android/core/mvp/BaseActivity;

    move-object v4, p2

    goto :goto_0

    :cond_0
    move-object v4, v1

    :goto_0
    if-nez v4, :cond_1

    return-void

    :cond_1
    invoke-static {p1}, Lf00;->a(Landroid/view/View;)Lf00;

    move-result-object v7

    const-string p1, "bind(view)"

    invoke-static {v7, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, LZM0;->a()Lyt3$b$a;

    move-result-object v2

    sget-object p1, LoG2;->a:LoG2;

    invoke-virtual {v4}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object p2

    const-string v0, "activity.application"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v3

    sget-object p1, Ljy1;->b:Ljy1;

    invoke-static {p0, p1}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->i(LLifecycleOwner;Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v5

    const-string p1, "AndroidLifecycleScopePro\u2026m(this, boundaryResolver)"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, p0, Lyt3;->f:Lio/reactivex/subjects/g;

    invoke-virtual {p0}, Landroidx/fragment/app/c;->getDialog()Landroid/app/Dialog;

    move-result-object v8

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v9, p0

    invoke-interface/range {v2 .. v9}, Lyt3$b$a;->a(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lio/reactivex/subjects/g;Lf00;Landroid/content/DialogInterface;Ldm5;)Lyt3$b;

    move-result-object p1

    invoke-interface {p1, p0}, Lyt3$b;->a(Lyt3;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_2

    const-string p2, "scan_instructions"

    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_2
    move-object p1, v1

    :goto_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_3

    const-string v0, "scan_instructions_2"

    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :cond_3
    invoke-virtual {p0}, Lyt3;->a5()LEt3;

    move-result-object p2

    invoke-virtual {p2, p1, v1}, LiE;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public bridge synthetic setPresenter(LiE;)V
    .locals 0

    check-cast p1, LEt3;

    invoke-virtual {p0, p1}, Lyt3;->t8(LEt3;)V

    return-void
.end method

.method public t8(LEt3;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lyt3;->e:LEt3;

    return-void
.end method

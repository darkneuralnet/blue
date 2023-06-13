.class public final LjI3;
.super LcE;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LjI3$a;,
        LjI3$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LcE<",
        "LqI3;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u0000 \u001d2\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001e\u001fB\u0007\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001a\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cR\"\u0010\u0015\u001a\u00020\u00028\u0016@\u0016X\u0097.\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\"\u0010\u001a\u001a\u0010\u0012\u000c\u0012\n \u0017*\u0004\u0018\u00010\r0\r0\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006 "
    }
    d2 = {
        "LjI3;",
        "LcE;",
        "LqI3;",
        "Landroid/view/View;",
        "view",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "",
        "onViewCreated",
        "Landroid/content/DialogInterface;",
        "dialog",
        "onDismiss",
        "Lio/reactivex/p;",
        "Lco/bird/android/model/wire/WirePart;",
        "N6",
        "e",
        "LqI3;",
        "a5",
        "()LqI3;",
        "t8",
        "(LqI3;)V",
        "presenter",
        "Lio/reactivex/subjects/c;",
        "kotlin.jvm.PlatformType",
        "f",
        "Lio/reactivex/subjects/c;",
        "partSubject",
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
        "SMAP\nPartScanBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PartScanBottomSheet.kt\nco/bird/android/vehiclescanner/parts/PartScanBottomSheet\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/android/lifecycle/KotlinExtensionsKt\n+ 3 Bundle+.kt\nco/bird/android/library/extension/Bundle_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Enum+.kt\nco/bird/android/library/extension/Enum_Kt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,100:1\n64#2:101\n6#3:102\n1#4:103\n13#5,2:104\n15#5,2:108\n1109#6,2:106\n*S KotlinDebug\n*F\n+ 1 PartScanBottomSheet.kt\nco/bird/android/vehiclescanner/parts/PartScanBottomSheet\n*L\n58#1:101\n66#1:102\n66#1:103\n66#1:104,2\n66#1:108,2\n66#1:106,2\n*E\n"
    }
.end annotation


# static fields
.field public static final g:LjI3$a;


# instance fields
.field public e:LqI3;

.field public final f:Lio/reactivex/subjects/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/reactivex/subjects/c<",
            "Lco/bird/android/model/wire/WirePart;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LjI3$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LjI3$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LjI3;->g:LjI3$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, LcE;-><init>()V

    invoke-static {}, Lio/reactivex/subjects/c;->k0()Lio/reactivex/subjects/c;

    move-result-object v0

    const-string v1, "create<WirePart>()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, LjI3;->f:Lio/reactivex/subjects/c;

    return-void
.end method


# virtual methods
.method public final N6()Lio/reactivex/p;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/p<",
            "Lco/bird/android/model/wire/WirePart;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LjI3;->f:Lio/reactivex/subjects/c;

    invoke-virtual {v0}, Lio/reactivex/p;->E()Lio/reactivex/p;

    move-result-object v0

    const-string v1, "partSubject.hide()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public a5()LqI3;
    .locals 1

    iget-object v0, p0, LjI3;->e:LqI3;

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

    invoke-virtual {p0}, LjI3;->a5()LqI3;

    move-result-object v0

    return-object v0
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    const-string v0, "dialog"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/fragment/app/c;->onDismiss(Landroid/content/DialogInterface;)V

    iget-object p1, p0, LjI3;->f:Lio/reactivex/subjects/c;

    invoke-virtual {p1}, Lio/reactivex/subjects/c;->onComplete()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 11

    const-string p2, "Array contains no element matching the predicate."

    const-class v0, Lco/bird/android/model/constant/PartKind;

    const-string v1, "view"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lf00;->a(Landroid/view/View;)Lf00;

    move-result-object v6

    const-string p1, "bind(view)"

    invoke-static {v6, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    instance-of v1, p1, Lco/bird/android/core/mvp/BaseActivity;

    const/4 v10, 0x0

    if-eqz v1, :cond_0

    check-cast p1, Lco/bird/android/core/mvp/BaseActivity;

    move-object v4, p1

    goto :goto_0

    :cond_0
    move-object v4, v10

    :goto_0
    if-nez v4, :cond_1

    return-void

    :cond_1
    invoke-static {}, LpN0;->a()LjI3$b$a;

    move-result-object v2

    sget-object p1, LoG2;->a:LoG2;

    invoke-virtual {v4}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    move-result-object v1

    const-string v3, "activity.application"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, LoG2;->a(Landroid/content/Context;)LlG2;

    move-result-object v3

    sget-object p1, Ljy1;->b:Ljy1;

    invoke-static {p0, p1}, Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;->i(LLifecycleOwner;Lcom/uber/autodispose/lifecycle/CorrespondingEventsFunction;)Lcom/uber/autodispose/android/lifecycle/AndroidLifecycleScopeProvider;

    move-result-object v5

    const-string p1, "AndroidLifecycleScopePro\u2026m(this, boundaryResolver)"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/c;->getDialog()Landroid/app/Dialog;

    move-result-object v7

    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v8, p0, LjI3;->f:Lio/reactivex/subjects/c;

    move-object v9, p0

    invoke-interface/range {v2 .. v9}, LjI3$b$a;->a(LlG2;Lco/bird/android/core/mvp/BaseActivity;Lcom/uber/autodispose/ScopeProvider;Lf00;Landroid/content/DialogInterface;Lio/reactivex/subjects/c;Ldm5;)LjI3$b;

    move-result-object p1

    invoke-interface {p1, p0}, LjI3$b;->a(LjI3;)V

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_9

    const-string v1, "part_kind"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    if-eqz p1, :cond_6

    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    array-length v3, v2

    move v4, v1

    :goto_1
    if-ge v4, v3, :cond_3

    aget-object v5, v2, v4

    move-object v6, v5

    check-cast v6, Ljava/lang/Enum;

    invoke-virtual {v6}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x1

    invoke-static {v6, p1, v7}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_2

    const-string p1, "{\n    E::class.java.enum\u2026.equals(name, true) }\n  }"

    invoke-static {v5, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ljava/lang/Enum;

    goto :goto_3

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1, p2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    invoke-virtual {v0}, Ljava/lang/Class;->getEnumConstants()[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    array-length v0, p1

    move v2, v1

    :goto_2
    if-ge v2, v0, :cond_5

    aget-object v3, p1, v2

    move-object v5, v3

    check-cast v5, Ljava/lang/Enum;

    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    const-string v6, "UNKNOWN"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const-string p1, "{\n    E::class.java.enum\u2026m.name == \"UNKNOWN\" }\n  }"

    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_3

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    :cond_5
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1, p2}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    move-object v5, v10

    :goto_3
    check-cast v5, Lco/bird/android/model/constant/PartKind;

    if-eqz v5, :cond_9

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_7

    const-string p2, "instructions"

    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    :cond_7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_8

    const-string p2, "warehouse_specific"

    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    :cond_8
    invoke-virtual {p0}, LjI3;->a5()LqI3;

    move-result-object p1

    invoke-virtual {p1, v5, v10, v1}, LqI3;->r(Lco/bird/android/model/constant/PartKind;Ljava/lang/String;Z)V

    return-void

    :cond_9
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "Cannot start this BottomSheet without a PartKind"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public bridge synthetic setPresenter(LiE;)V
    .locals 0

    check-cast p1, LqI3;

    invoke-virtual {p0, p1}, LjI3;->t8(LqI3;)V

    return-void
.end method

.method public t8(LqI3;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LjI3;->e:LqI3;

    return-void
.end method

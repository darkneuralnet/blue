.class public final Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity$c;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity;->onCreate(Landroid/os/Bundle;)V
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
        "Lco/bird/android/model/IdToolOption;",
        ">;",
        "Lkotlin/Unit;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\n\u00a2\u0006\u0002\u0008\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "options",
        "",
        "Lco/bird/android/model/IdToolOption;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nIdToolsLandingActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdToolsLandingActivity.kt\nco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity$onCreate$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt\n+ 4 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt$show$1\n+ 5 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n*L\n1#1,118:1\n1549#2:119\n1620#2,3:120\n819#2:132\n847#2:133\n848#2:135\n38#3,9:123\n47#3,4:136\n40#4:134\n218#5:140\n*S KotlinDebug\n*F\n+ 1 IdToolsLandingActivity.kt\nco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity$onCreate$1\n*L\n64#1:119\n64#1:120,3\n63#1:132\n63#1:133\n63#1:135\n63#1:123,9\n63#1:136,4\n63#1:134\n69#1:140\n*E\n"
    }
.end annotation


# instance fields
.field public final synthetic g:Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity;


# direct methods
.method public constructor <init>(Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity;)V
    .locals 0

    iput-object p1, p0, Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity$c;->g:Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/IdToolOption;
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity$c;->c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/IdToolOption;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity$c;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static final c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Lco/bird/android/model/IdToolOption;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lco/bird/android/model/IdToolOption;

    return-object p0
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity$c;->invoke(Ljava/util/List;)V

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final invoke(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lco/bird/android/model/IdToolOption;",
            ">;)V"
        }
    .end annotation

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity$c;->g:Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity;

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lco/bird/android/model/IdToolOption;

    invoke-static {v2}, LjQ1;->a(Lco/bird/android/model/IdToolOption;)LiQ1;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    sget-object v1, Lco/bird/android/widget/BottomSheetOptionLayout$a;->d:Lco/bird/android/widget/BottomSheetOptionLayout$a;

    iget-object v2, p0, Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity$c;->g:Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity;

    sget v3, Lnl4;->id_tools_replace_type_title:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    check-cast p1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ljava/lang/Enum;

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance p1, Lco/bird/android/widget/e;

    invoke-direct {p1}, Lco/bird/android/widget/e;-><init>()V

    const/4 v4, 0x0

    const v5, 0x800003

    invoke-static {v1, v2, v4, v5, v3}, Lco/bird/android/widget/a;->a(Lco/bird/android/widget/BottomSheetOptionLayout$a;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    invoke-virtual {v0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object v0

    const-string v1, "BottomSheetOptionFragment"

    invoke-virtual {p1, v0, v1}, Landroidx/fragment/app/c;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    invoke-virtual {p1}, Lco/bird/android/widget/e;->D9()Lio/reactivex/p;

    move-result-object p1

    new-instance v0, Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity$c$c;

    invoke-direct {v0, v3}, Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity$c$c;-><init>(Ljava/util/List;)V

    new-instance v1, Lco/bird/android/widget/a$d;

    invoke-direct {v1, v0}, Lco/bird/android/widget/a$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/p;->H(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object p1

    const-string v0, "with(BottomSheetOptionFr\u2026).map { options[it] }\n  }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity$c$a;->g:Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity$c$a;

    new-instance v1, LKR1;

    invoke-direct {v1, v0}, LKR1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v1}, Lio/reactivex/p;->H(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object p1

    const-string v0, "show(\n        which = op\u2026n -> sheetOption.option }"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity$c;->g:Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity;

    invoke-static {v0}, Lcom/uber/autodispose/AutoDispose;->a(Lcom/uber/autodispose/ScopeProvider;)Lcom/uber/autodispose/AutoDisposeConverter;

    move-result-object v0

    invoke-virtual {p1, v0}, Lio/reactivex/p;->b(Lio/reactivex/q;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "this.`as`(AutoDispose.autoDisposable(provider))"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkExpressionValueIsNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lcom/uber/autodispose/MaybeSubscribeProxy;

    new-instance v0, Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity$c$b;

    iget-object v1, p0, Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity$c;->g:Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity;

    invoke-static {v1}, Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity;->access$getAssociateOptionClick$p(Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity;)Lma4;

    move-result-object v1

    invoke-direct {v0, v1}, Lco/bird/android/feature/servicecenter/idtools/landing/IdToolsLandingActivity$c$b;-><init>(Ljava/lang/Object;)V

    new-instance v1, LLR1;

    invoke-direct {v1, v0}, LLR1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-interface {p1, v1}, Lcom/uber/autodispose/MaybeSubscribeProxy;->subscribe(Lio/reactivex/functions/g;)Lio/reactivex/disposables/c;

    return-void
.end method

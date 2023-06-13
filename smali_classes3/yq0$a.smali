.class public final Lyq0$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lyq0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "Lyq0$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LJa2;",
        "b",
        "LJa2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lyq0;Landroid/view/View;)V",
        "co.bird.android.feature.complaintresolution"
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
        "SMAP\nComplaintResolutionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplaintResolutionAdapter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapter$ActionTakenViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,259:1\n18#2:260\n9#3,4:261\n1549#4:265\n1620#4,3:266\n*S KotlinDebug\n*F\n+ 1 ComplaintResolutionAdapter.kt\nco/bird/android/feature/complaintresolution/adapter/ComplaintResolutionAdapter$ActionTakenViewHolder\n*L\n145#1:260\n145#1:261,4\n146#1:265\n146#1:266,3\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LJa2;

.field public final synthetic c:Lyq0;


# direct methods
.method public constructor <init>(Lyq0;Landroid/view/View;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lyq0$a;->c:Lyq0;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LJa2;->a(Landroid/view/View;)LJa2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lyq0$a;->b:LJa2;

    invoke-virtual {p2}, LJa2;->b()Landroid/widget/RadioGroup;

    move-result-object p2

    new-instance v0, Lxq0;

    invoke-direct {v0, p1}, Lxq0;-><init>(Lyq0;)V

    invoke-virtual {p2, v0}, Landroid/widget/RadioGroup;->setOnCheckedChangeListener(Landroid/widget/RadioGroup$OnCheckedChangeListener;)V

    return-void
.end method

.method public static synthetic a(Lyq0;Landroid/widget/RadioGroup;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lyq0$a;->b(Lyq0;Landroid/widget/RadioGroup;I)V

    return-void
.end method

.method public static final b(Lyq0;Landroid/widget/RadioGroup;I)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lyq0;->access$getActionTakenSubject$p(Lyq0;)Lio/reactivex/subjects/d;

    move-result-object p0

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/RadioButton;

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    const-string p2, "null cannot be cast to non-null type kotlin.String"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 5

    invoke-super {p0, p1}, Lw1;->bind(I)V

    iget-object v0, p0, Lyq0$a;->c:Lyq0;

    invoke-static {v0}, Lyq0;->access$getAdapterData(Lyq0;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, LfB0;->j(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    iget-object v3, p0, Lyq0$a;->b:LJa2;

    invoke-virtual {v3}, LJa2;->b()Landroid/widget/RadioGroup;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v2, v3, v4}, LKa2;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)LKa2;

    move-result-object v2

    invoke-virtual {v2}, LKa2;->b()Landroid/widget/RadioButton;

    move-result-object v2

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;->getLabel()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v1}, Lco/bird/android/model/persistence/nestedstructures/ComplaintIssueOption;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const-string v1, "inflate(context.layoutIn\u2026 option.value\n          }"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lyq0$a;->b:LJa2;

    invoke-virtual {v1}, LJa2;->b()Landroid/widget/RadioGroup;

    move-result-object v1

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget-object v1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    return-void
.end method

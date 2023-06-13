.class public final LQB5$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LQB5;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LQB5$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LHf2;",
        "b",
        "LHf2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LQB5;Landroid/view/View;)V",
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
        "SMAP\nSkuInvestigationAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkuInvestigationAdapter.kt\nco/bird/android/feature/transferorder/sku/investigation/adapters/SkuInvestigationAdapter$MissingSkuViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,82:1\n18#2:83\n18#2:88\n18#2:93\n18#2:98\n9#3,4:84\n9#3,4:89\n9#3,4:94\n9#3,4:99\n*S KotlinDebug\n*F\n+ 1 SkuInvestigationAdapter.kt\nco/bird/android/feature/transferorder/sku/investigation/adapters/SkuInvestigationAdapter$MissingSkuViewHolder\n*L\n75#1:83\n40#1:88\n48#1:93\n56#1:98\n75#1:84,4\n40#1:89,4\n48#1:94,4\n56#1:99,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LHf2;

.field public final synthetic c:LQB5;


# direct methods
.method public constructor <init>(LQB5;Landroid/view/View;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    const-string v0, "view"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LQB5$b;->c:LQB5;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LHf2;->a(Landroid/view/View;)LHf2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LQB5$b;->b:LHf2;

    iget-object v0, p2, LHf2;->c:Landroid/widget/RadioButton;

    new-instance v1, LRB5;

    invoke-direct {v1, p1, p0}, LRB5;-><init>(LQB5;LQB5$b;)V

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    iget-object v0, p2, LHf2;->b:Landroid/widget/RadioButton;

    new-instance v1, LSB5;

    invoke-direct {v1, p1, p0}, LSB5;-><init>(LQB5;LQB5$b;)V

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    iget-object v0, p2, LHf2;->f:Landroid/widget/RadioButton;

    new-instance v1, LTB5;

    invoke-direct {v1, p1, p0}, LTB5;-><init>(LQB5;LQB5$b;)V

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    iget-object p2, p2, LHf2;->e:Landroid/widget/EditText;

    new-instance v0, LQB5$b$a;

    invoke-direct {v0, p0, p1}, LQB5$b$a;-><init>(LQB5$b;LQB5;)V

    invoke-virtual {p2, v0}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void
.end method

.method public static synthetic a(LQB5;LQB5$b;Landroid/widget/CompoundButton;Z)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LQB5$b;->j(LQB5;LQB5$b;Landroid/widget/CompoundButton;Z)V

    return-void
.end method

.method public static final synthetic access$getBinding$p(LQB5$b;)LHf2;
    .locals 0

    iget-object p0, p0, LQB5$b;->b:LHf2;

    return-object p0
.end method

.method public static synthetic b(LQB5;LQB5$b;Landroid/widget/CompoundButton;Z)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LQB5$b;->i(LQB5;LQB5$b;Landroid/widget/CompoundButton;Z)V

    return-void
.end method

.method public static synthetic e(LQB5;LQB5$b;Landroid/widget/CompoundButton;Z)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, LQB5$b;->k(LQB5;LQB5$b;Landroid/widget/CompoundButton;Z)V

    return-void
.end method

.method public static final i(LQB5;LQB5$b;Landroid/widget/CompoundButton;Z)V
    .locals 0

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "this$1"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_1

    invoke-static {p0}, LQB5;->access$getAdapterData(LQB5;)LE6;

    move-result-object p2

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result p1

    invoke-virtual {p2, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, LhC5;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, LhC5;

    if-eqz p1, :cond_1

    invoke-static {p0}, LQB5;->access$getMissingSkuReasonInputSubject$p(LQB5;)Lio/reactivex/subjects/d;

    move-result-object p0

    invoke-virtual {p1}, LhC5;->b()Ljava/lang/String;

    move-result-object p1

    const-string p2, "Lost in transit"

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public static final j(LQB5;LQB5$b;Landroid/widget/CompoundButton;Z)V
    .locals 0

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "this$1"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_1

    invoke-static {p0}, LQB5;->access$getAdapterData(LQB5;)LE6;

    move-result-object p2

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result p1

    invoke-virtual {p2, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, LhC5;

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, LhC5;

    if-eqz p1, :cond_1

    invoke-static {p0}, LQB5;->access$getMissingSkuReasonInputSubject$p(LQB5;)Lio/reactivex/subjects/d;

    move-result-object p0

    invoke-virtual {p1}, LhC5;->b()Ljava/lang/String;

    move-result-object p1

    const-string p2, "Vehicle left at origin"

    invoke-static {p1, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public static final k(LQB5;LQB5$b;Landroid/widget/CompoundButton;Z)V
    .locals 0

    const-string p2, "this$0"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "this$1"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_1

    invoke-static {p0}, LQB5;->access$getAdapterData(LQB5;)LE6;

    move-result-object p2

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$D;->getAdapterPosition()I

    move-result p3

    invoke-virtual {p2, p3}, LE6;->e(I)LG6;

    move-result-object p2

    invoke-virtual {p2}, LG6;->c()Ljava/lang/Object;

    move-result-object p2

    instance-of p3, p2, LhC5;

    if-eqz p3, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    check-cast p2, LhC5;

    if-eqz p2, :cond_1

    iget-object p1, p1, LQB5$b;->b:LHf2;

    iget-object p1, p1, LHf2;->e:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0}, LQB5;->access$getMissingSkuReasonInputSubject$p(LQB5;)Lio/reactivex/subjects/d;

    move-result-object p0

    invoke-virtual {p2}, LhC5;->b()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/reactivex/subjects/d;->onNext(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 2

    iget-object v0, p0, LQB5$b;->c:LQB5;

    invoke-static {v0}, LQB5;->access$getAdapterData(LQB5;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LhC5;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, LhC5;

    if-eqz p1, :cond_1

    iget-object v0, p0, LQB5$b;->b:LHf2;

    iget-object v0, v0, LHf2;->i:Landroid/widget/TextView;

    invoke-virtual {p1}, LhC5;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LQB5$b;->b:LHf2;

    iget-object v0, v0, LHf2;->g:Landroid/widget/ImageView;

    invoke-virtual {p1}, LhC5;->c()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_1
    return-void
.end method

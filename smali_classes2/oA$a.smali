.class public final LoA$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LoA;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0084\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LoA$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lqb2;",
        "b",
        "Lqb2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LoA;Landroid/view/View;)V",
        "co.bird.android.feature.lib.command"
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
        "SMAP\nBaseCommandAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseCommandAdapter.kt\nco/bird/android/command/base/BaseCommandAdapter$CommandViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,135:1\n18#2:136\n18#2:151\n9#3,4:137\n9#3,4:152\n1603#4,9:141\n1855#4:150\n1856#4:157\n1612#4:158\n1747#4,3:159\n223#4,2:162\n1#5:156\n*S KotlinDebug\n*F\n+ 1 BaseCommandAdapter.kt\nco/bird/android/command/base/BaseCommandAdapter$CommandViewHolder\n*L\n91#1:136\n104#1:151\n91#1:137,4\n104#1:152,4\n104#1:141,9\n104#1:150\n104#1:157\n104#1:158\n106#1:159,3\n119#1:162,2\n104#1:156\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lqb2;

.field public final synthetic c:LoA;


# direct methods
.method public constructor <init>(LoA;Landroid/view/View;)V
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

    iput-object p1, p0, LoA$a;->c:LoA;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lqb2;->a(Landroid/view/View;)Lqb2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LoA$a;->b:Lqb2;

    iget-object v0, p2, Lqb2;->b:Landroid/widget/Button;

    const-string v1, "binding.bluetooth"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, LoA$a$a;

    invoke-direct {v1, p1, p0}, LoA$a$a;-><init>(LoA;LoA$a;)V

    invoke-static {v0, v1}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p2, p2, Lqb2;->d:Landroid/widget/Button;

    const-string v0, "binding.cellular"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LoA$a$b;

    invoke-direct {v0, p0, p1}, LoA$a$b;-><init>(LoA$a;LoA;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$getBinding$p(LoA$a;)Lqb2;
    .locals 0

    iget-object p0, p0, LoA$a;->b:Lqb2;

    return-object p0
.end method


# virtual methods
.method public bind(I)V
    .locals 11

    iget-object v0, p0, LoA$a;->b:Lqb2;

    iget-object v0, v0, Lqb2;->c:Landroid/widget/ProgressBar;

    const-string v1, "binding.bluetoothProgressBar"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    const/4 v3, 0x4

    invoke-static {v0, v2, v3}, Ltu6;->s(Landroid/view/View;ZI)V

    iget-object v0, p0, LoA$a;->b:Lqb2;

    iget-object v0, v0, Lqb2;->e:Landroid/widget/ProgressBar;

    const-string v4, "binding.cellularProgressBar"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v2, v3}, Ltu6;->s(Landroid/view/View;ZI)V

    iget-object v0, p0, LoA$a;->c:LoA;

    invoke-static {v0}, LoA;->access$getAdapterData(LoA;)LE6;

    move-result-object v0

    invoke-virtual {v0}, LE6;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, Lco/bird/android/model/VehicleCommand;

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v5

    :goto_0
    check-cast v0, Lco/bird/android/model/VehicleCommand;

    if-eqz v0, :cond_b

    iget-object v3, p0, LoA$a;->b:Lqb2;

    iget-object v3, v3, Lqb2;->g:Landroid/widget/ImageView;

    iget-object v6, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v0}, Lco/bird/android/model/VehicleCommand;->getIcon()I

    move-result v7

    invoke-static {v6, v7}, LNA0;->e(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {v3, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v3, p0, LoA$a;->b:Lqb2;

    iget-object v3, v3, Lqb2;->f:Landroid/widget/TextView;

    invoke-virtual {v0}, Lco/bird/android/model/VehicleCommand;->getTitle()Ljava/lang/CharSequence;

    move-result-object v6

    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, p0, LoA$a;->b:Lqb2;

    iget-object v3, v3, Lqb2;->b:Landroid/widget/Button;

    iget-object v6, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    sget v7, Lnl4;->command_center_command_bluetooth_format:I

    const/4 v8, 0x1

    new-array v9, v8, [Ljava/lang/Object;

    invoke-virtual {v0}, Lco/bird/android/model/VehicleCommand;->getCommand()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v9, v2

    invoke-virtual {v6, v7, v9}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, p0, LoA$a;->b:Lqb2;

    iget-object v3, v3, Lqb2;->d:Landroid/widget/Button;

    iget-object v6, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    sget v7, Lnl4;->command_center_command_cellular_format:I

    new-array v9, v8, [Ljava/lang/Object;

    invoke-virtual {v0}, Lco/bird/android/model/VehicleCommand;->getCommand()Ljava/lang/String;

    move-result-object v10

    aput-object v10, v9, v2

    invoke-virtual {v6, v7, v9}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, p0, LoA$a;->b:Lqb2;

    iget-object v3, v3, Lqb2;->b:Landroid/widget/Button;

    const-string v6, "binding.bluetooth"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lco/bird/android/model/VehicleCommand;->getBluetooth()Z

    move-result v6

    const/4 v7, 0x2

    invoke-static {v3, v6, v2, v7, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v3, p0, LoA$a;->b:Lqb2;

    iget-object v3, v3, Lqb2;->d:Landroid/widget/Button;

    const-string v6, "binding.cellular"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lco/bird/android/model/VehicleCommand;->getCellular()Z

    move-result v6

    invoke-static {v3, v6, v2, v7, v5}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    instance-of v3, v0, Lco/bird/android/model/WakeCommand;

    if-nez v3, :cond_7

    iget-object v3, p0, LoA$a;->c:LoA;

    invoke-static {v3}, LoA;->access$getAdapterData(LoA;)LE6;

    move-result-object v3

    invoke-virtual {v3, p1}, LE6;->i(LG6;)LH6;

    move-result-object p1

    invoke-virtual {p1}, LH6;->c()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LG6;

    invoke-virtual {v6}, LG6;->c()Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Lco/bird/android/model/VehicleCommand;

    if-eqz v7, :cond_2

    goto :goto_2

    :cond_2
    move-object v6, v5

    :goto_2
    check-cast v6, Lco/bird/android/model/VehicleCommand;

    if-eqz v6, :cond_1

    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_5

    :cond_4
    move p1, v2

    goto :goto_3

    :cond_5
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/VehicleCommand;

    instance-of v3, v3, Lco/bird/android/model/WakeCommand;

    if-eqz v3, :cond_6

    move p1, v8

    :goto_3
    iget-object v3, p0, LoA$a;->b:Lqb2;

    iget-object v3, v3, Lqb2;->b:Landroid/widget/Button;

    xor-int/lit8 v6, p1, 0x1

    invoke-virtual {v3, v6}, Landroid/view/View;->setEnabled(Z)V

    iget-object v3, p0, LoA$a;->b:Lqb2;

    iget-object v3, v3, Lqb2;->d:Landroid/widget/Button;

    xor-int/2addr p1, v8

    invoke-virtual {v3, p1}, Landroid/view/View;->setEnabled(Z)V

    goto :goto_4

    :cond_7
    iget-object p1, p0, LoA$a;->b:Lqb2;

    iget-object p1, p1, Lqb2;->b:Landroid/widget/Button;

    move-object v3, v0

    check-cast v3, Lco/bird/android/model/WakeCommand;

    invoke-virtual {v3}, Lco/bird/android/model/VehicleCommand;->getBluetooth()Z

    move-result v6

    invoke-virtual {p1, v6}, Landroid/view/View;->setEnabled(Z)V

    iget-object p1, p0, LoA$a;->b:Lqb2;

    iget-object p1, p1, Lqb2;->d:Landroid/widget/Button;

    invoke-virtual {v3}, Lco/bird/android/model/VehicleCommand;->getCellular()Z

    move-result v3

    invoke-virtual {p1, v3}, Landroid/view/View;->setEnabled(Z)V

    :goto_4
    iget-object p1, p0, LoA$a;->c:LoA;

    invoke-virtual {p1}, LoA;->A()Ljava/util/HashSet;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_b

    iget-object p1, p0, LoA$a;->c:LoA;

    invoke-virtual {p1}, LoA;->A()Ljava/util/HashSet;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lco/bird/android/model/VehicleCommand;

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    iget-object p1, p0, LoA$a;->b:Lqb2;

    iget-object p1, p1, Lqb2;->b:Landroid/widget/Button;

    invoke-virtual {p1, v2}, Landroid/view/View;->setEnabled(Z)V

    iget-object p1, p0, LoA$a;->b:Lqb2;

    iget-object p1, p1, Lqb2;->d:Landroid/widget/Button;

    invoke-virtual {p1, v2}, Landroid/view/View;->setEnabled(Z)V

    invoke-virtual {v3}, Lco/bird/android/model/VehicleCommand;->getMethod()Lco/bird/android/model/CommandMethod;

    move-result-object p1

    invoke-static {p1}, Lco/bird/android/model/VehicleCommandKt;->isBluetooth(Lco/bird/android/model/CommandMethod;)Z

    move-result p1

    if-eqz p1, :cond_9

    iget-object p1, p0, LoA$a;->b:Lqb2;

    iget-object p1, p1, Lqb2;->b:Landroid/widget/Button;

    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, LoA$a;->b:Lqb2;

    iget-object p1, p1, Lqb2;->c:Landroid/widget/ProgressBar;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ltu6;->r(Landroid/view/View;)V

    goto :goto_5

    :cond_9
    iget-object p1, p0, LoA$a;->b:Lqb2;

    iget-object p1, p1, Lqb2;->d:Landroid/widget/Button;

    invoke-virtual {p1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, LoA$a;->b:Lqb2;

    iget-object p1, p1, Lqb2;->e:Landroid/widget/ProgressBar;

    invoke-static {p1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ltu6;->r(Landroid/view/View;)V

    goto :goto_5

    :cond_a
    new-instance p1, Ljava/util/NoSuchElementException;

    const-string v0, "Collection contains no element matching the predicate."

    invoke-direct {p1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    :goto_5
    return-void
.end method

.class public final Ly7$c;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "Ly7$c;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lit6;",
        "b",
        "Lit6;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Ly7;Landroid/view/View;)V",
        "servicecenter_release"
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
        "SMAP\nAddRepairListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddRepairListAdapter.kt\nco/bird/android/feature/servicecenter/repairlogger/addrepair/adapters/AddRepairListAdapter$SubRepairItemViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,134:1\n18#2:135\n18#2:140\n18#2:145\n9#3,4:136\n9#3,4:141\n9#3,4:146\n*S KotlinDebug\n*F\n+ 1 AddRepairListAdapter.kt\nco/bird/android/feature/servicecenter/repairlogger/addrepair/adapters/AddRepairListAdapter$SubRepairItemViewHolder\n*L\n128#1:135\n129#1:140\n130#1:145\n128#1:136,4\n129#1:141,4\n130#1:146,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lit6;

.field public final synthetic c:Ly7;


# direct methods
.method public constructor <init>(Ly7;Landroid/view/View;)V
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

    iput-object p1, p0, Ly7$c;->c:Ly7;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lit6;->a(Landroid/view/View;)Lit6;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Ly7$c;->b:Lit6;

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    const-string v1, "itemView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ly7$c$a;

    invoke-direct {v1, p0}, Ly7$c$a;-><init>(Ly7$c;)V

    invoke-static {v0, v1}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p2, p2, Lit6;->b:Landroid/widget/CheckBox;

    const-string v0, "binding.checkbox"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ly7$c$b;

    invoke-direct {v0, p1, p0}, Ly7$c$b;-><init>(Ly7;Ly7$c;)V

    invoke-static {p2, v0}, LMs2;->h(Landroid/widget/CompoundButton;Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method public static final synthetic a(Ly7$c;)Lit6;
    .locals 0

    iget-object p0, p0, Ly7$c;->b:Lit6;

    return-object p0
.end method


# virtual methods
.method public bind(I)V
    .locals 4

    iget-object v0, p0, Ly7$c;->c:Ly7;

    invoke-static {v0}, Ly7;->access$getAdapterData$p(Ly7;)LE6;

    move-result-object v0

    invoke-virtual {v0}, LE6;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    iget-object v0, p0, Ly7$c;->b:Lit6;

    iget-object v0, v0, Lit6;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, LSD4;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    check-cast v1, LSD4;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, LSD4;->d()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v3

    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Ly7$c;->b:Lit6;

    iget-object v0, v0, Lit6;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, LSD4;

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    move-object v1, v3

    :goto_2
    check-cast v1, LSD4;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, LSD4;->b()Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_3
    move-object v1, v3

    :goto_3
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Ly7$c;->b:Lit6;

    iget-object v0, v0, Lit6;->b:Landroid/widget/CheckBox;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, LSD4;

    if-eqz v1, :cond_4

    move-object v3, p1

    :cond_4
    check-cast v3, LSD4;

    if-eqz v3, :cond_5

    invoke-virtual {v3}, LSD4;->c()Z

    move-result p1

    goto :goto_4

    :cond_5
    const/4 p1, 0x0

    :goto_4
    invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    return-void
.end method

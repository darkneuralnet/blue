.class public final Ly7$b;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly7;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "b"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "Ly7$b;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lkt6;",
        "b",
        "Lkt6;",
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
        "SMAP\nAddRepairListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AddRepairListAdapter.kt\nco/bird/android/feature/servicecenter/repairlogger/addrepair/adapters/AddRepairListAdapter$SearchViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,134:1\n18#2:135\n9#3,4:136\n*S KotlinDebug\n*F\n+ 1 AddRepairListAdapter.kt\nco/bird/android/feature/servicecenter/repairlogger/addrepair/adapters/AddRepairListAdapter$SearchViewHolder\n*L\n91#1:135\n91#1:136,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lkt6;

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

    iput-object p1, p0, Ly7$b;->c:Ly7;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lkt6;->a(Landroid/view/View;)Lkt6;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Ly7$b;->b:Lkt6;

    iget-object v0, p2, Lkt6;->e:Landroid/widget/EditText;

    new-instance v1, Ly7$b$a;

    invoke-direct {v1, p1}, Ly7$b$a;-><init>(Ly7;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    iget-object p1, p2, Lkt6;->e:Landroid/widget/EditText;

    const-string p2, "binding.search"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Ly7$b$b;

    invoke-direct {p2, p0}, Ly7$b$b;-><init>(Ly7$b;)V

    invoke-static {p1, p2}, LMs2;->m(Landroid/widget/TextView;Lkotlin/jvm/functions/Function3;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 3

    invoke-super {p0, p1}, Lw1;->bind(I)V

    iget-object v0, p0, Ly7$b;->c:Ly7;

    invoke-static {v0}, Ly7;->access$getAdapterData$p(Ly7;)LE6;

    move-result-object v0

    invoke-virtual {v0}, LE6;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    iget-object v0, p0, Ly7$b;->b:Lkt6;

    iget-object v0, v0, Lkt6;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Lco/bird/android/model/wire/WireBird;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v2

    :goto_0
    check-cast p1, Lco/bird/android/model/wire/WireBird;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/wire/WireBird;->getModel()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v2

    const-string p1, "this as java.lang.String).toUpperCase()"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

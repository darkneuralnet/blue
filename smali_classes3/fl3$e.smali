.class public final Lfl3$e;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfl3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "e"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "Lfl3$e;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lfe2;",
        "b",
        "Lfe2;",
        "viewBinding",
        "",
        "c",
        "Z",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lfl3;Landroid/view/View;)V",
        "filters_release"
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
        "SMAP\nOperatorFilterV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperatorFilterV2Adapter.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2Adapter$ToggleSelectFilterViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,298:1\n18#2:299\n9#3,4:300\n*S KotlinDebug\n*F\n+ 1 OperatorFilterV2Adapter.kt\nco/bird/android/feature/filters/operator/v2/adapters/OperatorFilterV2Adapter$ToggleSelectFilterViewHolder\n*L\n289#1:299\n289#1:300,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lfe2;

.field public c:Z

.field public final synthetic d:Lfl3;


# direct methods
.method public constructor <init>(Lfl3;Landroid/view/View;)V
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

    iput-object p1, p0, Lfl3$e;->d:Lfl3;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lfe2;->a(Landroid/view/View;)Lfe2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lfl3$e;->b:Lfe2;

    iget-object p2, p2, Lfe2;->b:Landroidx/appcompat/widget/SwitchCompat;

    const-string v0, "viewBinding.filter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lfl3$e$a;

    invoke-direct {v0, p0, p1}, Lfl3$e$a;-><init>(Lfl3$e;Lfl3;)V

    invoke-static {p2, v0}, LMs2;->h(Landroid/widget/CompoundButton;Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method public static final synthetic a(Lfl3$e;)Z
    .locals 0

    iget-boolean p0, p0, Lfl3$e;->c:Z

    return p0
.end method


# virtual methods
.method public bind(I)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lfl3$e;->c:Z

    iget-object v0, p0, Lfl3$e;->d:Lfl3;

    invoke-static {v0}, Lfl3;->access$getAdapterData(Lfl3;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lco/bird/android/model/persistence/OperatorToggleFilter;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lco/bird/android/model/persistence/OperatorToggleFilter;

    if-eqz p1, :cond_1

    iget-object v0, p0, Lfl3$e;->b:Lfe2;

    iget-object v0, v0, Lfe2;->b:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorToggleFilter;->getToggleTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lfl3$e;->b:Lfe2;

    iget-object v0, v0, Lfe2;->b:Landroidx/appcompat/widget/SwitchCompat;

    invoke-virtual {p1}, Lco/bird/android/model/persistence/OperatorToggleFilter;->getEnabled()Z

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    :cond_1
    const/4 p1, 0x0

    iput-boolean p1, p0, Lfl3$e;->c:Z

    return-void
.end method

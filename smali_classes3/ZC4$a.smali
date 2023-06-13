.class public final LZC4$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LZC4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "LZC4$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lco/bird/android/widget/standardcomponents/CheckableItemView;",
        "b",
        "Lco/bird/android/widget/standardcomponents/CheckableItemView;",
        "checkableItemView",
        "",
        "c",
        "Z",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LZC4;Landroid/view/View;)V",
        "repair_release"
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
        "SMAP\nRepairSelectionAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RepairSelectionAdapter.kt\nco/bird/android/feature/repair/v1/selection/adapters/RepairSelectionAdapter$RepairSelectionItemViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,57:1\n18#2:58\n9#3,4:59\n*S KotlinDebug\n*F\n+ 1 RepairSelectionAdapter.kt\nco/bird/android/feature/repair/v1/selection/adapters/RepairSelectionAdapter$RepairSelectionItemViewHolder\n*L\n50#1:58\n50#1:59,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lco/bird/android/widget/standardcomponents/CheckableItemView;

.field public c:Z

.field public final synthetic d:LZC4;


# direct methods
.method public constructor <init>(LZC4;Landroid/view/View;)V
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

    iput-object p1, p0, LZC4$a;->d:LZC4;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    check-cast p2, Lco/bird/android/widget/standardcomponents/CheckableItemView;

    iput-object p2, p0, LZC4$a;->b:Lco/bird/android/widget/standardcomponents/CheckableItemView;

    new-instance v0, LZC4$a$a;

    invoke-direct {v0, p0, p1}, LZC4$a$a;-><init>(LZC4$a;LZC4;)V

    invoke-virtual {p2, v0}, Lco/bird/android/widget/standardcomponents/CheckableItemView;->setOnCheckChangedListener(Lco/bird/android/widget/standardcomponents/CheckableItemView$b;)V

    return-void
.end method

.method public static final synthetic a(LZC4$a;)Z
    .locals 0

    iget-boolean p0, p0, LZC4$a;->c:Z

    return p0
.end method


# virtual methods
.method public bind(I)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, LZC4$a;->c:Z

    iget-object v0, p0, LZC4$a;->d:LZC4;

    invoke-static {v0}, LZC4;->access$getAdapterData(LZC4;)LE6;

    move-result-object v0

    invoke-virtual {v0}, LE6;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LG6;

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LvC4;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, LvC4;

    if-eqz p1, :cond_1

    iget-object v0, p0, LZC4$a;->b:Lco/bird/android/widget/standardcomponents/CheckableItemView;

    invoke-virtual {v0, p1}, Lco/bird/android/widget/standardcomponents/CheckableItemView;->e(Lqi0;)V

    :cond_1
    const/4 p1, 0x0

    iput-boolean p1, p0, LZC4$a;->c:Z

    return-void
.end method

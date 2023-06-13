.class public final LVu4$c;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LVu4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u0012"
    }
    d2 = {
        "LVu4$c;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LWe2;",
        "b",
        "LWe2;",
        "binding",
        "",
        "c",
        "Z",
        "isBinding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LVu4;Landroid/view/View;)V",
        "release_release"
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
        "SMAP\nReleaseScanAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReleaseScanAdapter.kt\nco/bird/android/feature/release/adapters/ReleaseScanAdapter$LockViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,160:1\n18#2:161\n9#3,4:162\n*S KotlinDebug\n*F\n+ 1 ReleaseScanAdapter.kt\nco/bird/android/feature/release/adapters/ReleaseScanAdapter$LockViewHolder\n*L\n120#1:161\n120#1:162,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LWe2;

.field public c:Z

.field public final synthetic d:LVu4;


# direct methods
.method public constructor <init>(LVu4;Landroid/view/View;)V
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

    iput-object p1, p0, LVu4$c;->d:LVu4;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LWe2;->a(Landroid/view/View;)LWe2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LVu4$c;->b:LWe2;

    iget-object p2, p2, LWe2;->b:Landroidx/appcompat/widget/SwitchCompat;

    const-string v0, "binding.lock"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LVu4$c$a;

    invoke-direct {v0, p0, p1}, LVu4$c$a;-><init>(LVu4$c;LVu4;)V

    invoke-static {p2, v0}, LMs2;->h(Landroid/widget/CompoundButton;Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method public static final synthetic a(LVu4$c;)Z
    .locals 0

    iget-boolean p0, p0, LVu4$c;->c:Z

    return p0
.end method


# virtual methods
.method public bind(I)V
    .locals 3

    const/4 v0, 0x1

    iput-boolean v0, p0, LVu4$c;->c:Z

    iget-object v1, p0, LVu4$c;->b:LWe2;

    iget-object v1, v1, LWe2;->b:Landroidx/appcompat/widget/SwitchCompat;

    iget-object v2, p0, LVu4$c;->d:LVu4;

    invoke-static {v2}, LVu4;->access$getAdapterData(LVu4;)LE6;

    move-result-object v2

    invoke-virtual {v2, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    instance-of v2, p1, Ljava/lang/Boolean;

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :cond_2
    invoke-virtual {v1, v0}, Landroidx/appcompat/widget/SwitchCompat;->setChecked(Z)V

    const/4 p1, 0x0

    iput-boolean p1, p0, LVu4$c;->c:Z

    iget-object p1, p0, LVu4$c;->d:LVu4;

    invoke-virtual {p1}, LVu4;->v()LYP3;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$D;->itemView:Landroid/view/View;

    const-string v1, "itemView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "lock"

    invoke-virtual {p1, v1, v0}, LYP3;->c(Ljava/lang/CharSequence;Landroid/view/View;)V

    :cond_3
    return-void
.end method

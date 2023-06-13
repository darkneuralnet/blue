.class public final LHA3$d;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LHA3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "d"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LHA3$d;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LIb2;",
        "b",
        "LIb2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LHA3;Landroid/view/View;)V",
        "ownedbirds_release"
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
        "SMAP\nOwnedBirdDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OwnedBirdDetailsAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/OwnedBirdDetailsAdapter$FirmwareVersionViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,348:1\n18#2:349\n9#3,4:350\n*S KotlinDebug\n*F\n+ 1 OwnedBirdDetailsAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/OwnedBirdDetailsAdapter$FirmwareVersionViewHolder\n*L\n280#1:349\n280#1:350,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LIb2;

.field public final synthetic c:LHA3;


# direct methods
.method public constructor <init>(LHA3;Landroid/view/View;)V
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

    iput-object p1, p0, LHA3$d;->c:LHA3;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LIb2;->a(Landroid/view/View;)LIb2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LHA3$d;->b:LIb2;

    iget-object p2, p2, LIb2;->e:Landroid/widget/TextView;

    const-string v0, "binding.updateLabel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LHA3$d$a;

    invoke-direct {v0, p1}, LHA3$d$a;-><init>(LHA3;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 5

    iget-object v0, p0, LHA3$d;->c:LHA3;

    invoke-static {v0}, LHA3;->access$getAdapterData(LHA3;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LKL;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, LKL;

    if-eqz p1, :cond_1

    iget-object v0, p0, LHA3$d;->b:LIb2;

    iget-object v0, v0, LIb2;->e:Landroid/widget/TextView;

    const-string v2, "binding.updateLabel"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LKL;->b()Z

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x2

    invoke-static {v0, v2, v3, v4, v1}, Ltu6;->show$default(Landroid/view/View;ZIILjava/lang/Object;)V

    iget-object v0, p0, LHA3$d;->b:LIb2;

    iget-object v0, v0, LIb2;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, LKL;->c()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    return-void
.end method

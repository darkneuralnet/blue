.class public final LU24$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU24;
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
        "LU24$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LIe2;",
        "b",
        "LIe2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LU24;Landroid/view/View;)V",
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
        "SMAP\nPrivateBirdAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrivateBirdAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/PrivateBirdAdapter$PrivateBirdViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,67:1\n18#2:68\n9#3,4:69\n*S KotlinDebug\n*F\n+ 1 PrivateBirdAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/PrivateBirdAdapter$PrivateBirdViewHolder\n*L\n57#1:68\n57#1:69,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LIe2;

.field public final synthetic c:LU24;


# direct methods
.method public constructor <init>(LU24;Landroid/view/View;)V
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

    iput-object p1, p0, LU24$a;->c:LU24;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LIe2;->a(Landroid/view/View;)LIe2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LU24$a;->b:LIe2;

    invoke-virtual {p2}, LIe2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p2

    const-string v0, "binding.root"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LU24$a$a;

    invoke-direct {v0, p0, p1}, LU24$a$a;-><init>(LU24$a;LU24;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 3

    iget-object v0, p0, LU24$a;->c:LU24;

    invoke-static {v0}, LU24;->access$getAdapterData(LU24;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LK44;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, LK44;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, LK44;->b()Lco/bird/android/model/persistence/Bird;

    move-result-object v0

    invoke-static {v0}, Lco/bird/android/model/persistence/extensions/Bird_Kt;->isBirdAir(Lco/bird/android/model/persistence/Bird;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, LK44;->c()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    iget-object v1, p0, LU24$a;->b:LIe2;

    iget-object v1, v1, LIe2;->c:Landroid/widget/TextView;

    invoke-virtual {p1}, LK44;->b()Lco/bird/android/model/persistence/Bird;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/persistence/Bird;->getPrivateBird()Lco/bird/android/model/persistence/nestedstructures/PrivateBird;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lco/bird/android/model/persistence/nestedstructures/PrivateBird;->getNickname()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, LK44;->b()Lco/bird/android/model/persistence/Bird;

    move-result-object v2

    invoke-virtual {v2}, Lco/bird/android/model/persistence/Bird;->getCode()Ljava/lang/String;

    move-result-object v2

    :goto_2
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, LU24$a;->b:LIe2;

    iget-object v1, v1, LIe2;->b:Landroid/widget/TextView;

    invoke-virtual {p1}, LK44;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p0, LU24$a;->b:LIe2;

    iget-object p1, p1, LIe2;->d:Landroid/widget/ImageView;

    const-string v1, "binding.chevron"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    xor-int/lit8 v1, v0, 0x1

    const/4 v2, 0x4

    invoke-static {p1, v1, v2}, Ltu6;->s(Landroid/view/View;ZI)V

    iget-object p1, p0, LU24$a;->b:LIe2;

    iget-object p1, p1, LIe2;->f:Landroid/widget/ImageView;

    const-string v1, "binding.info"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0, v2}, Ltu6;->s(Landroid/view/View;ZI)V

    :cond_3
    return-void
.end method

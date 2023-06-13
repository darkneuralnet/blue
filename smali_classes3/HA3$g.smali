.class public final LHA3$g;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LHA3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "g"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\u000e"
    }
    d2 = {
        "LHA3$g;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LSa2;",
        "b",
        "LSa2;",
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
        "SMAP\nOwnedBirdDetailsAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OwnedBirdDetailsAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/OwnedBirdDetailsAdapter$NicknameViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,348:1\n18#2:349\n9#3,4:350\n*S KotlinDebug\n*F\n+ 1 OwnedBirdDetailsAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/OwnedBirdDetailsAdapter$NicknameViewHolder\n*L\n268#1:349\n268#1:350,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LSa2;

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

    iput-object p1, p0, LHA3$g;->c:LHA3;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LSa2;->a(Landroid/view/View;)LSa2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LHA3$g;->b:LSa2;

    iget-object p2, p2, LSa2;->e:Landroid/widget/TextView;

    const-string v0, "binding.renameLabel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LHA3$g$a;

    invoke-direct {v0, p1}, LHA3$g$a;-><init>(LHA3;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public bind(I)V
    .locals 2

    iget-object v0, p0, LHA3$g;->b:LSa2;

    iget-object v0, v0, LSa2;->d:Landroid/widget/TextView;

    iget-object v1, p0, LHA3$g;->c:LHA3;

    invoke-static {v1}, LHA3;->access$getAdapterData(LHA3;)LE6;

    move-result-object v1

    invoke-virtual {v1, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    instance-of v1, p1, Ljava/lang/CharSequence;

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :goto_0
    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    check-cast p1, Ljava/lang/CharSequence;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.class public final LS23$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS23;
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
        "LS23$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "Lvd2;",
        "b",
        "Lvd2;",
        "binding",
        "",
        "c",
        "Z",
        "isBinding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(LS23;Landroid/view/View;)V",
        "app_birdRelease"
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
        "SMAP\nNestFavoritePartnerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestFavoritePartnerAdapter.kt\nco/bird/android/app/feature/operator/dialogs/nest/favorite/adapters/NestFavoritePartnerAdapter$PartnerViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,63:1\n18#2:64\n9#3,4:65\n1#4:69\n*S KotlinDebug\n*F\n+ 1 NestFavoritePartnerAdapter.kt\nco/bird/android/app/feature/operator/dialogs/nest/favorite/adapters/NestFavoritePartnerAdapter$PartnerViewHolder\n*L\n55#1:64\n55#1:65,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Lvd2;

.field public c:Z

.field public final synthetic d:LS23;


# direct methods
.method public constructor <init>(LS23;Landroid/view/View;)V
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

    iput-object p1, p0, LS23$a;->d:LS23;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, Lvd2;->a(Landroid/view/View;)Lvd2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, LS23$a;->b:Lvd2;

    invoke-virtual {p2}, Lvd2;->b()Landroidx/appcompat/widget/AppCompatCheckBox;

    move-result-object p2

    const-string v0, "binding.root"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LS23$a$a;

    invoke-direct {v0, p0, p1}, LS23$a$a;-><init>(LS23$a;LS23;)V

    invoke-static {p2, v0}, LMs2;->h(Landroid/widget/CompoundButton;Lkotlin/jvm/functions/Function2;)V

    return-void
.end method

.method public static final synthetic a(LS23$a;)Z
    .locals 0

    iget-boolean p0, p0, LS23$a;->c:Z

    return p0
.end method


# virtual methods
.method public bind(I)V
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, LS23$a;->c:Z

    iget-object v0, p0, LS23$a;->d:LS23;

    invoke-static {v0}, LS23;->access$getAdapterData(LS23;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lkotlin/Pair;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, Lkotlin/Pair;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/persistence/nestedstructures/NestFavoritePartner;

    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v1, p0, LS23$a;->b:Lvd2;

    invoke-virtual {v1}, Lvd2;->b()Landroidx/appcompat/widget/AppCompatCheckBox;

    move-result-object v1

    invoke-virtual {v0}, Lco/bird/android/model/persistence/nestedstructures/NestFavoritePartner;->getDisplayName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, LS23$a;->b:Lvd2;

    invoke-virtual {v0}, Lvd2;->b()Landroidx/appcompat/widget/AppCompatCheckBox;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    :cond_1
    const/4 p1, 0x0

    iput-boolean p1, p0, LS23$a;->c:Z

    return-void
.end method

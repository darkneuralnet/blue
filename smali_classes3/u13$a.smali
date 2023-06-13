.class public final Lu13$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu13;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0008\u001a\u00020\u0007*\u00020\u0006R\u0014\u0010\u000c\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0011"
    }
    d2 = {
        "Lu13$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "LTk5;",
        "",
        "a",
        "LIe2;",
        "b",
        "LIe2;",
        "binding",
        "Landroid/view/View;",
        "view",
        "<init>",
        "(Lu13;Landroid/view/View;)V",
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
        "SMAP\nNearbyBirdVehicleAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NearbyBirdVehicleAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/NearbyBirdVehicleAdapter$BirdVehicleViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n18#2:72\n9#3,4:73\n1#4:77\n*S KotlinDebug\n*F\n+ 1 NearbyBirdVehicleAdapter.kt\nco/bird/android/feature/ownedbirds/adapters/NearbyBirdVehicleAdapter$BirdVehicleViewHolder\n*L\n51#1:72\n51#1:73,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:LIe2;

.field public final synthetic c:Lu13;


# direct methods
.method public constructor <init>(Lu13;Landroid/view/View;)V
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

    iput-object p1, p0, Lu13$a;->c:Lu13;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    invoke-static {p2}, LIe2;->a(Landroid/view/View;)LIe2;

    move-result-object p2

    const-string v0, "bind(view)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p2, p0, Lu13$a;->b:LIe2;

    invoke-virtual {p2}, LIe2;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p2

    const-string v0, "binding.root"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lu13$a$a;

    invoke-direct {v0, p0, p1}, Lu13$a$a;-><init>(Lu13$a;Lu13;)V

    invoke-static {p2, v0}, LMs2;->j(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public final a(LTk5;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LUk5;->G(LTk5;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "Bird Flex"

    goto :goto_0

    :cond_0
    invoke-static {p1}, LUk5;->C(LTk5;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string p1, "Bird Bike"

    goto :goto_0

    :cond_1
    invoke-static {p1}, LUk5;->A(LTk5;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string p1, "Bird Air"

    goto :goto_0

    :cond_2
    invoke-static {p1}, LUk5;->I(LTk5;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string p1, "Bird Bikeshare EB100"

    goto :goto_0

    :cond_3
    invoke-static {p1}, LUk5;->K(LTk5;)Z

    move-result p1

    if-eqz p1, :cond_4

    const-string p1, "Bird Swappable ES400"

    goto :goto_0

    :cond_4
    const-string p1, "Bird"

    :goto_0
    return-object p1
.end method

.method public bind(I)V
    .locals 9

    iget-object v0, p0, Lu13$a;->c:Lu13;

    invoke-static {v0}, Lu13;->access$getAdapterData(Lu13;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LTk5;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    check-cast p1, LTk5;

    if-eqz p1, :cond_5

    iget-object v0, p0, Lu13$a;->b:LIe2;

    iget-object v0, v0, LIe2;->c:Landroid/widget/TextView;

    invoke-static {p1}, LUk5;->c(LTk5;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_2

    const-string v3, "bird"

    const/4 v4, 0x1

    invoke-static {v2, v3, v4}, Lkotlin/text/StringsKt;->equals(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    xor-int/2addr v3, v4

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    if-eqz v2, :cond_2

    move-object v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, LTk5;->a()Lne5;

    move-result-object v2

    invoke-interface {v2}, Lne5;->e()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_3

    const-string v1, "macAddress"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, ":"

    const-string v5, ""

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    invoke-static/range {v3 .. v8}, Lkotlin/text/StringsKt;->replace$default(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    :cond_3
    :goto_2
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lu13$a;->b:LIe2;

    iget-object v0, v0, LIe2;->b:Landroid/widget/TextView;

    invoke-static {p1}, LUk5;->A(LTk5;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v1, Lnl4;->retail_bird_ready_to_connect_label:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_3

    :cond_4
    invoke-virtual {p0, p1}, Lu13$a;->a(LTk5;)Ljava/lang/String;

    move-result-object p1

    :goto_3
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_5
    return-void
.end method

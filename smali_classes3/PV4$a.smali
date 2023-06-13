.class public final LPV4$a;
.super Lw1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LPV4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000c\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0002R\u0017\u0010\r\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0018"
    }
    d2 = {
        "LPV4$a;",
        "Lw1;",
        "",
        "position",
        "",
        "bind",
        "",
        "a",
        "Landroid/view/View;",
        "b",
        "Landroid/view/View;",
        "getView",
        "()Landroid/view/View;",
        "view",
        "Lut6;",
        "c",
        "Lut6;",
        "binding",
        "Lco/bird/android/model/persistence/RidePassView;",
        "d",
        "Lco/bird/android/model/persistence/RidePassView;",
        "pass",
        "<init>",
        "(LPV4;Landroid/view/View;)V",
        "ride-pass_release"
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
        "SMAP\nRidePassV2Adapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RidePassV2Adapter.kt\nco/bird/android/feature/ridepass/v2/list/adapter/RidePassV2Adapter$HeaderViewHolder\n+ 2 AdapterItem.kt\nco/bird/android/widget/adapter/AdapterItem\n+ 3 Any+.kt\nco/bird/android/library/extension/Any_Kt\n*L\n1#1,178:1\n18#2:179\n9#3,4:180\n*S KotlinDebug\n*F\n+ 1 RidePassV2Adapter.kt\nco/bird/android/feature/ridepass/v2/list/adapter/RidePassV2Adapter$HeaderViewHolder\n*L\n80#1:179\n80#1:180,4\n*E\n"
    }
.end annotation


# instance fields
.field public final b:Landroid/view/View;

.field public final c:Lut6;

.field public d:Lco/bird/android/model/persistence/RidePassView;

.field public final synthetic e:LPV4;


# direct methods
.method public constructor <init>(LPV4;Landroid/view/View;)V
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

    iput-object p1, p0, LPV4$a;->e:LPV4;

    invoke-direct {p0, p2}, Lw1;-><init>(Landroid/view/View;)V

    iput-object p2, p0, LPV4$a;->b:Landroid/view/View;

    invoke-static {p2}, Lut6;->a(Landroid/view/View;)Lut6;

    move-result-object p1

    const-string p2, "bind(view)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, LPV4$a;->c:Lut6;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 9

    const-string v0, " "

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    const-string v1, " "

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    sget-object v6, LPV4$a$a;->g:LPV4$a$a;

    const/16 v7, 0x1e

    const/4 v8, 0x0

    invoke-static/range {v0 .. v8}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public bind(I)V
    .locals 2

    iget-object v0, p0, LPV4$a;->e:LPV4;

    invoke-static {v0}, LPV4;->access$getAdapterData(LPV4;)LE6;

    move-result-object v0

    invoke-virtual {v0, p1}, LE6;->e(I)LG6;

    move-result-object p1

    invoke-virtual {p1}, LG6;->c()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LBH1;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    check-cast p1, LBH1;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, LBH1;->b()Lco/bird/android/model/persistence/RidePassView;

    move-result-object v0

    iput-object v0, p0, LPV4$a;->d:Lco/bird/android/model/persistence/RidePassView;

    invoke-virtual {p1}, LBH1;->b()Lco/bird/android/model/persistence/RidePassView;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/persistence/RidePassView;->isPurchased()Z

    move-result p1

    const/4 v1, 0x1

    if-ne p1, v1, :cond_1

    move v0, v1

    :cond_1
    if-eqz v0, :cond_2

    iget-object p1, p0, LPV4$a;->c:Lut6;

    iget-object p1, p1, Lut6;->c:Landroid/widget/TextView;

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lnl4;->ride_pass_screen_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "context.getString(L.string.ride_pass_screen_title)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, LPV4$a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, LPV4$a;->c:Lut6;

    iget-object p1, p1, Lut6;->c:Landroid/widget/TextView;

    invoke-virtual {p0}, Lw1;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lnl4;->ride_pass_main_body:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    :goto_1
    return-void
.end method

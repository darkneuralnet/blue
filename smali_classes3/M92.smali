.class public final LM92;
.super LxE;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004J\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004J\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004J\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004J\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004J\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004J\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004J\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004J\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004J\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004J\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004J\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004J\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004J\u0014\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0015\u001a\u00020\u0002J2\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0002\u00a8\u0006\u001f"
    }
    d2 = {
        "LM92;",
        "LxE;",
        "",
        "identifier",
        "Lio/reactivex/F;",
        "Lco/bird/android/model/DialogResponse;",
        "Ql",
        "Rl",
        "dm",
        "Sl",
        "Xl",
        "Yl",
        "Zl",
        "am",
        "bm",
        "cm",
        "Tl",
        "fm",
        "em",
        "gm",
        "Pl",
        "error",
        "Wl",
        "title",
        "body",
        "positiveButton",
        "Ul",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;)V",
        "inventory-scanning_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# direct methods
.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    return-void
.end method

.method public static synthetic Vl(LM92;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/reactivex/F;
    .locals 1

    and-int/lit8 p5, p4, 0x1

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    sget p3, Lnl4;->general_got_it:I

    const/4 p4, 0x0

    new-array p4, p4, [Ljava/lang/Object;

    invoke-virtual {p0, p3, p4}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, LM92;->Ul(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final Pl()Lio/reactivex/F;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    sget v0, Lnl4;->hard_count_already_counted:I

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v1}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, LM92;->Vl(LM92;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public final Ql(Ljava/lang/String;)Lio/reactivex/F;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "identifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lnl4;->hard_count_invalid_scan_title:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    sget v0, Lnl4;->hard_count_invalid_qr_body:I

    new-array v1, v2, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v1}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget v1, Lnl4;->hard_count_invalid_qr_positive_button:I

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {p0, v1, v2}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, p1, v0, v1}, LM92;->Ul(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final Rl(Ljava/lang/String;)Lio/reactivex/F;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "identifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget v0, Lnl4;->hard_count_invalid_scan_title:I

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-virtual {p0, v0, v1}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    sget p1, Lnl4;->hard_count_invalid_serial_body:I

    new-array v0, v2, [Ljava/lang/Object;

    invoke-virtual {p0, p1, v0}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v8}, LM92;->Vl(LM92;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final Sl()Lio/reactivex/F;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    sget v0, Lnl4;->sku_order_error_action_not_permitted_title:I

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v2}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    sget v0, Lnl4;->sku_order_error_action_not_permitted_message:I

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v1}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v8}, LM92;->Vl(LM92;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public final Tl()Lio/reactivex/F;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    sget v0, Lnl4;->sku_order_error_already_in_sku_title:I

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v2}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    sget v0, Lnl4;->sku_order_error_already_in_sku_message:I

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v1}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v8}, LM92;->Vl(LM92;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public final Ul(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v10, p1

    move-object/from16 v11, p2

    move-object/from16 v7, p3

    sget v1, Lmk4;->dialog_custom_cta:I

    sget v2, Lzi4;->primaryButton:I

    sget v4, Lzi4;->icon:I

    sget v5, Lzi4;->title:I

    sget v6, Lzi4;->body:I

    sget v9, Lrg4;->ic_missing_error:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/4 v8, 0x0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x6884

    const/16 v17, 0x0

    invoke-static/range {v0 .. v17}, LH31$a;->dialog$default(LH31;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZZLkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public final Wl(Ljava/lang/String;)Lio/reactivex/F;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v0

    sget v1, Lnl4;->error_generic_title:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    move-object v2, p0

    move-object v4, p1

    invoke-static/range {v2 .. v7}, LM92;->Vl(LM92;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final Xl()Lio/reactivex/F;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    sget v0, Lnl4;->sku_order_error_incorrect_commodity_title:I

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v2}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    sget v0, Lnl4;->sku_order_error_incorrect_commodity_message:I

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v1}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v8}, LM92;->Vl(LM92;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public final Yl()Lio/reactivex/F;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    sget v0, Lnl4;->sku_order_error_incorrect_commodity_type_title:I

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v2}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    sget v0, Lnl4;->sku_order_error_incorrect_commodity_type_message:I

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v1}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v8}, LM92;->Vl(LM92;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public final Zl()Lio/reactivex/F;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    sget v0, Lnl4;->sku_order_error_incorrect_condition_title:I

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v2}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    sget v0, Lnl4;->sku_order_error_incorrect_condition_message:I

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v1}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v8}, LM92;->Vl(LM92;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public final am()Lio/reactivex/F;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    sget v0, Lnl4;->sku_order_error_incorrect_fleet_title:I

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v2}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    sget v0, Lnl4;->sku_order_error_incorrect_fleet_message:I

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v1}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v8}, LM92;->Vl(LM92;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public final bm()Lio/reactivex/F;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    sget v0, Lnl4;->sku_order_error_incorrect_sku_title:I

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v2}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    sget v0, Lnl4;->sku_order_error_incorrect_sku_message:I

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v1}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v8}, LM92;->Vl(LM92;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public final cm()Lio/reactivex/F;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    sget v0, Lnl4;->sku_order_error_not_in_the_right_zone_title:I

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v2}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    sget v0, Lnl4;->sku_order_error_not_in_the_right_zone_message:I

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v1}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v8}, LM92;->Vl(LM92;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public final dm()Lio/reactivex/F;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    invoke-virtual {p0}, LxE;->getActivity()Lco/bird/android/core/mvp/BaseActivity;

    move-result-object v0

    invoke-virtual {v0}, Lco/bird/android/core/mvp/BaseActivity;->y()LTq4;

    move-result-object v0

    invoke-virtual {v0}, LTq4;->f8()LZ84;

    move-result-object v0

    invoke-virtual {v0}, LZ84;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lco/bird/android/model/wire/configs/Config;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/Config;->getRideConfig()Lco/bird/android/model/wire/configs/RideConfig;

    move-result-object v0

    new-instance v1, Ljk5;

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->getMinBirdCodeLength()I

    move-result v2

    invoke-virtual {v0}, Lco/bird/android/model/wire/configs/RideConfig;->getMaxBirdCodeLength()I

    move-result v0

    invoke-direct {v1, v2, v0}, Ljk5;-><init>(II)V

    const/4 v0, 0x1

    invoke-virtual {p0, v1, v0, v0}, LXC;->dialog(LNy;ZZ)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public final em()Lio/reactivex/F;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    sget v0, Lnl4;->sku_order_error_checked_in_already_title:I

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v2}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    sget v0, Lnl4;->sku_order_error_checked_in_already_message:I

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v1}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v8}, LM92;->Vl(LM92;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public final fm()Lio/reactivex/F;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    sget v0, Lnl4;->sku_order_error_not_in_sku_title:I

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v2}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    sget v0, Lnl4;->sku_order_error_not_in_sku_message:I

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v1}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v8}, LM92;->Vl(LM92;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

.method public final gm()Lio/reactivex/F;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    sget v0, Lnl4;->sku_order_error_terminated_vehicle_title:I

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v2}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    sget v0, Lnl4;->sku_order_error_terminated_vehicle_message:I

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0, v0, v1}, LXC;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object v3, p0

    invoke-static/range {v3 .. v8}, LM92;->Vl(LM92;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lio/reactivex/F;

    move-result-object v0

    return-object v0
.end method

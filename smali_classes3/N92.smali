.class public final LN92;
.super LxE;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN92$a;,
        LN92$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0019\u0008\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001e\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0014\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0008\u001a\u00020\u0002J\u0018\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005*\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0002R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\r\u00a8\u0006\u0015"
    }
    d2 = {
        "LN92;",
        "LxE;",
        "",
        "rawScan",
        "error",
        "Lio/reactivex/F;",
        "Lco/bird/android/model/DialogResponse;",
        "Rl",
        "warehouse",
        "Pl",
        "Ql",
        "LM92;",
        "b",
        "LM92;",
        "ui",
        "Lco/bird/android/core/mvp/BaseActivity;",
        "activity",
        "<init>",
        "(Lco/bird/android/core/mvp/BaseActivity;LM92;)V",
        "c",
        "a",
        "inventory-scanning_release"
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
        "SMAP\nInventoryScanningUiDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InventoryScanningUiDelegate.kt\nco/bird/android/library/inventoryscanning/ui/InventoryScanningUiDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n1#2:71\n*E\n"
    }
.end annotation


# static fields
.field public static final c:LN92$a;


# instance fields
.field public final b:LM92;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, LN92$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LN92$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, LN92;->c:LN92$a;

    return-void
.end method

.method public constructor <init>(Lco/bird/android/core/mvp/BaseActivity;LM92;)V
    .locals 1

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ui"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LxE;-><init>(Lco/bird/android/core/mvp/BaseActivity;)V

    iput-object p2, p0, LN92;->b:LM92;

    return-void
.end method


# virtual methods
.method public final Pl(Ljava/lang/String;)Lio/reactivex/F;
    .locals 7
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

    const-string v0, "warehouse"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, LDt5;

    invoke-direct {v2, p1}, LDt5;-><init>(Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, LH31$a;->birdDialog$default(LH31;LNy;ZZILjava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    return-object p1
.end method

.method public final Ql(Lio/reactivex/F;)Lio/reactivex/F;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/DialogResponse;",
            ">;)",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {}, Lio/reactivex/android/schedulers/a;->a()Lio/reactivex/E;

    move-result-object v1

    const-wide/16 v2, 0x1f4

    invoke-virtual {p1, v2, v3, v0, v1}, Lio/reactivex/F;->o(JLjava/util/concurrent/TimeUnit;Lio/reactivex/E;)Lio/reactivex/F;

    move-result-object p1

    const-string v0, "this.delaySubscription(H\u2026dSchedulers.mainThread())"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final Rl(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/F;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lio/reactivex/F<",
            "Lco/bird/android/model/DialogResponse;",
            ">;"
        }
    .end annotation

    const-string v0, "rawScan"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, LN92;->b:LM92;

    invoke-virtual {v0}, LXC;->dialogShown()Z

    move-result v0

    const-string v1, "just(DialogResponse.OTHER)"

    if-eqz v0, :cond_0

    sget-object p1, Lco/bird/android/model/DialogResponse;->OTHER:Lco/bird/android/model/DialogResponse;

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    if-eqz p2, :cond_1

    invoke-static {p2}, Lco/bird/android/model/wire/WireSkuScanItemKt;->toInventoryScanningError(Ljava/lang/String;)Lco/bird/android/model/constant/InventoryScanningError;

    move-result-object v0

    sget-object v2, Lco/bird/android/model/constant/InventoryScanningError;->UNKNOWN:Lco/bird/android/model/constant/InventoryScanningError;

    if-eq v0, v2, :cond_1

    iget-object v0, p0, LN92;->b:LM92;

    const-wide/16 v2, 0x3e8

    invoke-virtual {v0, v2, v3}, LXC;->vibrate(J)V

    :cond_1
    if-eqz p2, :cond_2

    invoke-static {p2}, Lco/bird/android/model/wire/WireSkuScanItemKt;->toInventoryScanningError(Ljava/lang/String;)Lco/bird/android/model/constant/InventoryScanningError;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_3

    const/4 v0, -0x1

    goto :goto_1

    :cond_3
    sget-object v2, LN92$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    :goto_1
    packed-switch v0, :pswitch_data_0

    if-eqz p2, :cond_4

    iget-object p1, p0, LN92;->b:LM92;

    invoke-virtual {p1, p2}, LM92;->Wl(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    if-nez p1, :cond_5

    goto/16 :goto_2

    :pswitch_0
    iget-object p1, p0, LN92;->b:LM92;

    invoke-virtual {p1}, LM92;->gm()Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p0, p1}, LN92;->Ql(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    goto/16 :goto_3

    :pswitch_1
    iget-object p1, p0, LN92;->b:LM92;

    invoke-virtual {p1}, LM92;->em()Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p0, p1}, LN92;->Ql(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    goto/16 :goto_3

    :pswitch_2
    iget-object p1, p0, LN92;->b:LM92;

    invoke-virtual {p1}, LM92;->fm()Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p0, p1}, LN92;->Ql(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    goto/16 :goto_3

    :pswitch_3
    iget-object p1, p0, LN92;->b:LM92;

    invoke-virtual {p1}, LM92;->bm()Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p0, p1}, LN92;->Ql(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    goto/16 :goto_3

    :pswitch_4
    iget-object p1, p0, LN92;->b:LM92;

    invoke-virtual {p1}, LM92;->am()Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p0, p1}, LN92;->Ql(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    goto/16 :goto_3

    :pswitch_5
    iget-object p1, p0, LN92;->b:LM92;

    invoke-virtual {p1}, LM92;->Zl()Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p0, p1}, LN92;->Ql(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    goto/16 :goto_3

    :pswitch_6
    iget-object p1, p0, LN92;->b:LM92;

    invoke-virtual {p1}, LM92;->Yl()Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p0, p1}, LN92;->Ql(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_3

    :pswitch_7
    iget-object p1, p0, LN92;->b:LM92;

    invoke-virtual {p1}, LM92;->Xl()Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p0, p1}, LN92;->Ql(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_3

    :pswitch_8
    iget-object p1, p0, LN92;->b:LM92;

    invoke-virtual {p1}, LM92;->cm()Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p0, p1}, LN92;->Ql(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_3

    :pswitch_9
    iget-object p1, p0, LN92;->b:LM92;

    invoke-virtual {p1}, LM92;->Tl()Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p0, p1}, LN92;->Ql(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_3

    :pswitch_a
    iget-object p1, p0, LN92;->b:LM92;

    invoke-virtual {p1}, LM92;->Pl()Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p0, p1}, LN92;->Ql(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_3

    :pswitch_b
    iget-object p1, p0, LN92;->b:LM92;

    invoke-virtual {p1}, LM92;->Sl()Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p0, p1}, LN92;->Ql(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_3

    :pswitch_c
    iget-object p2, p0, LN92;->b:LM92;

    invoke-virtual {p2, p1}, LM92;->Rl(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p0, p1}, LN92;->Ql(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_3

    :pswitch_d
    iget-object p2, p0, LN92;->b:LM92;

    invoke-virtual {p2, p1}, LM92;->Ql(Ljava/lang/String;)Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p0, p1}, LN92;->Ql(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_3

    :pswitch_e
    iget-object p1, p0, LN92;->b:LM92;

    invoke-virtual {p1}, LM92;->dm()Lio/reactivex/F;

    move-result-object p1

    invoke-virtual {p0, p1}, LN92;->Ql(Lio/reactivex/F;)Lio/reactivex/F;

    move-result-object p1

    goto :goto_3

    :cond_4
    :goto_2
    sget-object p1, Lco/bird/android/model/DialogResponse;->OTHER:Lco/bird/android/model/DialogResponse;

    invoke-static {p1}, Lio/reactivex/F;->H(Ljava/lang/Object;)Lio/reactivex/F;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_5
    :goto_3
    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_e
        :pswitch_e
        :pswitch_d
        :pswitch_d
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.class public final Lu23$q$a;
.super Lkotlin/jvm/internal/Lambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu23$q;->d(Lco/bird/android/model/wire/WireBird;)Lio/reactivex/B;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu23$q$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "Lkotlin/jvm/functions/Function1<",
        "Lt13;",
        "Lio/reactivex/B<",
        "+",
        "Lco/bird/android/model/Vehicle;",
        ">;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a*\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\u0008\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lt13;",
        "option",
        "Lio/reactivex/B;",
        "Lco/bird/android/model/Vehicle;",
        "kotlin.jvm.PlatformType",
        "a",
        "(Lt13;)Lio/reactivex/B;"
    }
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic g:Lu23;

.field public final synthetic h:Lco/bird/android/model/wire/WireBird;


# direct methods
.method public constructor <init>(Lu23;Lco/bird/android/model/wire/WireBird;)V
    .locals 0

    iput-object p1, p0, Lu23$q$a;->g:Lu23;

    iput-object p2, p0, Lu23$q$a;->h:Lco/bird/android/model/wire/WireBird;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lt13;)Lio/reactivex/B;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt13;",
            ")",
            "Lio/reactivex/B<",
            "+",
            "Lco/bird/android/model/Vehicle;",
            ">;"
        }
    .end annotation

    const-string v0, "option"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lu23$q$a$a;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const-string v0, "bird"

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    iget-object p1, p0, Lu23$q$a;->g:Lu23;

    invoke-static {p1}, Lu23;->access$getUi$p(Lu23;)Ly23;

    move-result-object p1

    iget-object v0, p0, Lu23$q$a;->h:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ly23;->S4(Ljava/lang/String;)V

    invoke-static {}, Lio/reactivex/Observable;->empty()Lio/reactivex/Observable;

    move-result-object p1

    goto/16 :goto_0

    :pswitch_1
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    iget-object v1, p0, Lu23$q$a;->g:Lu23;

    iget-object v2, p0, Lu23$q$a;->h:Lco/bird/android/model/wire/WireBird;

    invoke-static {v1}, Lu23;->access$getBirdSerialPartMap$p(Lu23;)Ljava/util/HashMap;

    move-result-object v1

    invoke-virtual {v2}, Lco/bird/android/model/wire/WireBird;->getSerialNumber()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/wire/WirePart;

    invoke-virtual {p1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    const-string v0, "part"

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    iget-object v0, p0, Lu23$q$a;->g:Lu23;

    invoke-static {v0}, Lu23;->access$getNavigator$p(Lu23;)Le13;

    move-result-object v0

    const/4 v1, -0x1

    invoke-interface {v0, v1, p1}, Le13;->e4(ILandroid/content/Intent;)V

    invoke-static {}, Lio/reactivex/Observable;->empty()Lio/reactivex/Observable;

    move-result-object p1

    goto :goto_0

    :pswitch_2
    iget-object p1, p0, Lu23$q$a;->g:Lu23;

    invoke-static {p1}, Lu23;->access$getNavigator$p(Lu23;)Le13;

    move-result-object p1

    iget-object v0, p0, Lu23$q$a;->h:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {p1, v0, v2, v1, v2}, Le13$a;->goToReportFraudWriteDescription$default(Le13;Ljava/util/List;Ljava/lang/Integer;ILjava/lang/Object;)V

    invoke-static {}, Lio/reactivex/Observable;->empty()Lio/reactivex/Observable;

    move-result-object p1

    goto :goto_0

    :pswitch_3
    iget-object p1, p0, Lu23$q$a;->g:Lu23;

    iget-object v1, p0, Lu23$q$a;->h:Lco/bird/android/model/wire/WireBird;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v1}, Lu23;->access$chirpAlarm(Lu23;Lco/bird/android/model/wire/WireBird;)Lio/reactivex/Observable;

    move-result-object p1

    goto :goto_0

    :pswitch_4
    iget-object p1, p0, Lu23$q$a;->g:Lu23;

    invoke-static {p1}, Lu23;->access$getClipboardManager$p(Lu23;)Landroid/content/ClipboardManager;

    move-result-object p1

    iget-object v0, p0, Lu23$q$a;->h:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->getSerialNumber()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Bird S/N"

    invoke-static {v1, v0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    invoke-static {}, Lio/reactivex/Observable;->empty()Lio/reactivex/Observable;

    move-result-object p1

    goto :goto_0

    :pswitch_5
    iget-object p1, p0, Lu23$q$a;->g:Lu23;

    invoke-static {p1}, Lu23;->access$getClipboardManager$p(Lu23;)Landroid/content/ClipboardManager;

    move-result-object p1

    iget-object v0, p0, Lu23$q$a;->h:Lco/bird/android/model/wire/WireBird;

    invoke-virtual {v0}, Lco/bird/android/model/wire/WireBird;->getCode()Ljava/lang/String;

    move-result-object v0

    const-string v1, "Bird Code"

    invoke-static {v1, v0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    invoke-static {}, Lio/reactivex/Observable;->empty()Lio/reactivex/Observable;

    move-result-object p1

    :goto_0
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lt13;

    invoke-virtual {p0, p1}, Lu23$q$a;->a(Lt13;)Lio/reactivex/B;

    move-result-object p1

    return-object p1
.end method

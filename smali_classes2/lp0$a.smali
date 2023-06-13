.class public final Llp0$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llp0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nCommandUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommandUi.kt\nco/bird/android/command/base/CommandUi$DefaultImpls\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt\n+ 4 BottomSheet.kt\nco/bird/android/widget/BottomSheetKt$showBottomSheetOptions$1\n*L\n1#1,108:1\n1549#2:109\n1620#2,3:110\n819#2:122\n847#2:123\n848#2:125\n64#3,9:113\n73#3,4:126\n66#4:124\n*S KotlinDebug\n*F\n+ 1 CommandUi.kt\nco/bird/android/command/base/CommandUi$DefaultImpls\n*L\n90#1:109\n90#1:110,3\n89#1:122\n89#1:123\n89#1:125\n89#1:113,9\n89#1:126,4\n89#1:124\n*E\n"
    }
.end annotation


# direct methods
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Integer;
    .locals 0

    invoke-static {p0, p1}, Llp0$a;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static b(Llp0;)V
    .locals 0

    invoke-interface {p0}, Llp0;->getAdapter()LoA;

    move-result-object p0

    invoke-virtual {p0}, LoA;->w()V

    return-void
.end method

.method public static c(Llp0;)Lio/reactivex/Observable;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llp0;",
            ")",
            "Lio/reactivex/Observable<",
            "Lco/bird/android/model/VehicleCommand;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Llp0;->getAdapter()LoA;

    move-result-object p0

    invoke-virtual {p0}, LoA;->x()Lio/reactivex/Observable;

    move-result-object p0

    return-object p0
.end method

.method public static d(Llp0;Lco/bird/android/model/VehicleCommand;)V
    .locals 1

    const-string v0, "command"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Llp0;->getAdapter()LoA;

    move-result-object p0

    invoke-virtual {p0, p1}, LoA;->B(Lco/bird/android/model/VehicleCommand;)V

    return-void
.end method

.method public static e(Llp0;Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llp0;",
            "Ljava/util/Collection<",
            "LH6;",
            ">;)V"
        }
    .end annotation

    const-string v0, "sections"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Llp0;->getAdapter()LoA;

    move-result-object p0

    invoke-virtual {p0, p1}, LMy;->u(Ljava/util/Collection;)V

    return-void
.end method

.method public static f(Llp0;Ljava/util/List;)Lio/reactivex/p;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llp0;",
            "Ljava/util/List<",
            "Lco/bird/android/model/AlarmOption;",
            ">;)",
            "Lio/reactivex/p<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Llp0;->getActivity()Lco/bird/android/core/base/BaseCoreActivity;

    move-result-object p0

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lco/bird/android/model/AlarmOption;

    new-instance v2, Lk9;

    invoke-virtual {v1}, Lco/bird/android/model/AlarmOption;->getLabel()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lco/bird/android/model/AlarmOption;->getDuration()I

    move-result v1

    invoke-direct {v2, v3, v1}, Lk9;-><init>(Ljava/lang/String;I)V

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object p1, Lco/bird/android/widget/BottomSheetOptionLayout$a;->d:Lco/bird/android/widget/BottomSheetOptionLayout$a;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lco/bird/android/widget/d;

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance v0, Lco/bird/android/widget/e;

    invoke-direct {v0}, Lco/bird/android/widget/e;-><init>()V

    const/4 v2, 0x0

    const v3, 0x800003

    invoke-static {p1, v2, v2, v3, v1}, Lco/bird/android/widget/a;->a(Lco/bird/android/widget/BottomSheetOptionLayout$a;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p0

    const-string p1, "BottomSheetOptionFragment"

    invoke-virtual {v0, p0, p1}, Landroidx/fragment/app/c;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    invoke-virtual {v0}, Lco/bird/android/widget/e;->D9()Lio/reactivex/p;

    move-result-object p0

    new-instance p1, Llp0$a$a;

    invoke-direct {p1, v1}, Llp0$a$a;-><init>(Ljava/util/List;)V

    new-instance v0, Lco/bird/android/widget/a$b;

    invoke-direct {v0, p1}, Lco/bird/android/widget/a$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v0}, Lio/reactivex/p;->H(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object p0

    const-string p1, "with(BottomSheetOptionFr\u2026).map { options[it] }\n  }"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Llp0$a$b;->g:Llp0$a$b;

    new-instance v0, Lkp0;

    invoke-direct {v0, p1}, Lkp0;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v0}, Lio/reactivex/p;->H(Lio/reactivex/functions/o;)Lio/reactivex/p;

    move-result-object p0

    const-string p1, "activity.showBottomSheet\u2026-> alarmOption.duration }"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "$tmp0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    return-object p0
.end method

.method public static h(Llp0;Lco/bird/android/model/VehicleCommand;)V
    .locals 1

    const-string v0, "command"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lon0;->d:Lon0$b;

    invoke-virtual {v0, p1}, Lon0$b;->a(Lco/bird/android/model/VehicleCommand;)Lon0;

    move-result-object p1

    invoke-interface {p0}, Llp0;->getActivity()Lco/bird/android/core/base/BaseCoreActivity;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p0

    const-string v0, "command_center_error_dialog"

    invoke-virtual {p1, p0, v0}, Landroidx/fragment/app/c;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    return-void
.end method

.method public static i(Llp0;Lco/bird/android/model/VehicleCommand;)V
    .locals 8

    const-string v0, "command"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lco/bird/android/model/LockCommand;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lco/bird/android/model/VehicleCommand;->getMethod()Lco/bird/android/model/CommandMethod;

    move-result-object p1

    invoke-static {p1}, Lco/bird/android/model/VehicleCommandKt;->isBluetooth(Lco/bird/android/model/CommandMethod;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget p1, Lnl4;->command_center_bluetooth_lock_success:I

    goto/16 :goto_3

    :cond_0
    sget p1, Lnl4;->command_center_cellular_lock_success:I

    goto :goto_3

    :cond_1
    instance-of v0, p1, Lco/bird/android/model/UnlockCommand;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    instance-of v0, p1, Lco/bird/android/model/UnlockBatteryCommand;

    :goto_0
    if-eqz v0, :cond_3

    move v0, v1

    goto :goto_1

    :cond_3
    instance-of v0, p1, Lco/bird/android/model/UnlockCableCommand;

    :goto_1
    if-eqz v0, :cond_4

    goto :goto_2

    :cond_4
    instance-of v1, p1, Lco/bird/android/model/UnlockHelmetCommand;

    :goto_2
    if-eqz v1, :cond_6

    invoke-virtual {p1}, Lco/bird/android/model/VehicleCommand;->getMethod()Lco/bird/android/model/CommandMethod;

    move-result-object p1

    invoke-static {p1}, Lco/bird/android/model/VehicleCommandKt;->isBluetooth(Lco/bird/android/model/CommandMethod;)Z

    move-result p1

    if-eqz p1, :cond_5

    sget p1, Lnl4;->command_center_bluetooth_unlock_success:I

    goto :goto_3

    :cond_5
    sget p1, Lnl4;->command_center_cellular_unlock_success:I

    goto :goto_3

    :cond_6
    instance-of v0, p1, Lco/bird/android/model/AlarmCommand;

    if-eqz v0, :cond_7

    sget p1, Lnl4;->command_center_bluetooth_chirp_success:I

    goto :goto_3

    :cond_7
    instance-of v0, p1, Lco/bird/android/model/LightsCommand;

    if-eqz v0, :cond_8

    sget p1, Lnl4;->command_center_bluetooth_flash_success:I

    goto :goto_3

    :cond_8
    instance-of v0, p1, Lco/bird/android/model/SleepCommand;

    if-eqz v0, :cond_a

    invoke-virtual {p1}, Lco/bird/android/model/VehicleCommand;->getMethod()Lco/bird/android/model/CommandMethod;

    move-result-object p1

    invoke-static {p1}, Lco/bird/android/model/VehicleCommandKt;->isBluetooth(Lco/bird/android/model/CommandMethod;)Z

    move-result p1

    if-eqz p1, :cond_9

    sget p1, Lnl4;->command_center_bluetooth_sleep_success:I

    goto :goto_3

    :cond_9
    sget p1, Lnl4;->command_center_cellular_sleep_success:I

    goto :goto_3

    :cond_a
    instance-of v0, p1, Lco/bird/android/model/WakeCommand;

    if-eqz v0, :cond_b

    sget p1, Lnl4;->command_center_bluetooth_wake_success:I

    goto :goto_3

    :cond_b
    instance-of p1, p1, Lco/bird/android/model/SoftResetCommand;

    if-eqz p1, :cond_c

    sget p1, Lnl4;->command_center_bluetooth_soft_reset_success:I

    :goto_3
    sget-object v0, Lzw3;->a:Lzw3$a;

    invoke-interface {p0}, Llp0;->getActivity()Lco/bird/android/core/base/BaseCoreActivity;

    move-result-object v1

    invoke-interface {p0}, Llp0;->getActivity()Lco/bird/android/core/base/BaseCoreActivity;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string p0, "activity.getString(messageRes)"

    invoke-static {v2, p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/16 v6, 0x18

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lzw3$a;->makeText$default(Lzw3$a;Landroid/content/Context;Ljava/lang/String;IILzw3$a$a;ILjava/lang/Object;)Lzw3;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    return-void

    :cond_c
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

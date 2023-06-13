.class public final Lco/bird/android/vehiclescanner/servicecenter/scan/ScanCodeActivity$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Ldagger/Module;
    includes = {
        Lco/bird/android/vehiclescanner/servicecenter/scan/ScanCodeActivity$c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lco/bird/android/vehiclescanner/servicecenter/scan/ScanCodeActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/bird/android/vehiclescanner/servicecenter/scan/ScanCodeActivity$c$a;,
        Lco/bird/android/vehiclescanner/servicecenter/scan/ScanCodeActivity$c$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u0011\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\t\u00a8\u0006\r"
    }
    d2 = {
        "Lco/bird/android/vehiclescanner/servicecenter/scan/ScanCodeActivity$c;",
        "",
        "LKj5;",
        "impl",
        "LiH1;",
        "hardCount",
        "Lnj5;",
        "a",
        "Lco/bird/android/model/constant/ScannerMode;",
        "Lco/bird/android/model/constant/ScannerMode;",
        "scanMode",
        "<init>",
        "(Lco/bird/android/model/constant/ScannerMode;)V",
        "vehiclescanner_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
.end annotation


# instance fields
.field public final a:Lco/bird/android/model/constant/ScannerMode;


# direct methods
.method public constructor <init>(Lco/bird/android/model/constant/ScannerMode;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lco/bird/android/vehiclescanner/servicecenter/scan/ScanCodeActivity$c;->a:Lco/bird/android/model/constant/ScannerMode;

    return-void
.end method


# virtual methods
.method public final a(LKj5;LiH1;)Lnj5;
    .locals 2
    .annotation runtime Ldagger/Provides;
    .end annotation

    const-string v0, "impl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hardCount"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lco/bird/android/vehiclescanner/servicecenter/scan/ScanCodeActivity$c;->a:Lco/bird/android/model/constant/ScannerMode;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lco/bird/android/vehiclescanner/servicecenter/scan/ScanCodeActivity$c$b;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_0
    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    move-object p1, p2

    :cond_1
    return-object p1
.end method

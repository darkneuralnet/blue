.class public final synthetic LUZ4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/reactivex/functions/a;


# instance fields
.field public final synthetic b:Li25;

.field public final synthetic c:Lco/bird/android/model/RideState;

.field public final synthetic d:Lco/bird/android/model/wire/configs/WarningPresentationKind;


# direct methods
.method public synthetic constructor <init>(Li25;Lco/bird/android/model/RideState;Lco/bird/android/model/wire/configs/WarningPresentationKind;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LUZ4;->b:Li25;

    iput-object p2, p0, LUZ4;->c:Lco/bird/android/model/RideState;

    iput-object p3, p0, LUZ4;->d:Lco/bird/android/model/wire/configs/WarningPresentationKind;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LUZ4;->b:Li25;

    iget-object v1, p0, LUZ4;->c:Lco/bird/android/model/RideState;

    iget-object v2, p0, LUZ4;->d:Lco/bird/android/model/wire/configs/WarningPresentationKind;

    invoke-static {v0, v1, v2}, Li25;->W(Li25;Lco/bird/android/model/RideState;Lco/bird/android/model/wire/configs/WarningPresentationKind;)V

    return-void
.end method

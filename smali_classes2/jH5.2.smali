.class public final synthetic LjH5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic b:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LjH5;->b:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LjH5;->b:Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;

    invoke-static {v0}, Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;->K(Lco/bird/android/app/feature/physicallock/smartlock/SmartlockAssociationV2Presenter;)Lio/reactivex/K;

    move-result-object v0

    return-object v0
.end method

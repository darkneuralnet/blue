.class public final synthetic LIE2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic b:Lco/bird/android/library/mlkitscanner/MLKitScanView;


# direct methods
.method public synthetic constructor <init>(Lco/bird/android/library/mlkitscanner/MLKitScanView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LIE2;->b:Lco/bird/android/library/mlkitscanner/MLKitScanView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, LIE2;->b:Lco/bird/android/library/mlkitscanner/MLKitScanView;

    invoke-static {v0}, Lco/bird/android/library/mlkitscanner/MLKitScanView;->b(Lco/bird/android/library/mlkitscanner/MLKitScanView;)V

    return-void
.end method

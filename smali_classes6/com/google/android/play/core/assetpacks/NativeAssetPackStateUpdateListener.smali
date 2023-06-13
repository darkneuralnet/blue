.class public Lcom/google/android/play/core/assetpacks/NativeAssetPackStateUpdateListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LKP5;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LSo;

    invoke-virtual {p0, p1}, Lcom/google/android/play/core/assetpacks/NativeAssetPackStateUpdateListener;->onStateUpdate(LSo;)V

    return-void
.end method

.method public native onStateUpdate(LSo;)V
.end method

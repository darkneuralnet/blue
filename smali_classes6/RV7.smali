.class public final LRV7;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a()LDV7;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/common/util/PlatformVersion;->isAtLeastO()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, LpV7;

    invoke-direct {v0}, LpV7;-><init>()V

    return-object v0

    :cond_0
    new-instance v0, LfW7;

    invoke-direct {v0}, LfW7;-><init>()V

    return-object v0
.end method

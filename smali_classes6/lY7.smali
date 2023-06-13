.class public final LlY7;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a()LRy7;
    .locals 3

    invoke-static {}, Lcom/google/android/libraries/intelligence/acceleration/AndroidSystemDetectionJNI;->GetDeviceInfo()[B

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    :try_start_0
    invoke-static {}, Lzt7;->a()Lzt7;

    move-result-object v1

    invoke-static {v0, v1}, LRy7;->E([BLzt7;)LRy7;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, LdQ7;

    const-class v2, LRy7;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, LdQ7;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;)V

    throw v1
.end method

.method public static b()LHz7;
    .locals 3

    invoke-static {}, Lcom/google/android/libraries/intelligence/acceleration/AndroidSystemDetectionJNI;->GetNNAPIInfo()[B

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    :try_start_0
    invoke-static {}, Lzt7;->a()Lzt7;

    move-result-object v1

    invoke-static {v0, v1}, LHz7;->E([BLzt7;)LHz7;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, LdQ7;

    const-class v2, LHz7;

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, LdQ7;-><init>(Ljava/lang/String;Lcom/google/android/gms/internal/mlkit_vision_internal_vkp/zzaqw;)V

    throw v1
.end method

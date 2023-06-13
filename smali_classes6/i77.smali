.class public abstract Li77;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static e(LL77;)Li77;
    .locals 4

    new-instance v0, LwQ6;

    new-instance v1, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbom;

    const-string v2, ""

    invoke-static {}, LX57;->o()LX57;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbom;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-static {}, LX57;->o()LX57;

    move-result-object v2

    const/4 v3, 0x0

    invoke-direct {v0, p0, v1, v2, v3}, LwQ6;-><init>(LL77;Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbom;LX57;Z)V

    return-object v0
.end method


# virtual methods
.method public abstract a()LX57;
.end method

.method public abstract b()Lcom/google/android/gms/internal/mlkit_vision_text_bundled_common/zbom;
.end method

.method public abstract c()LL77;
.end method

.method public abstract d()Z
.end method

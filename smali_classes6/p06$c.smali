.class public Lp06$c;
.super Lp06$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp06;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field public final e:F

.field public final f:F


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsk;Landroid/graphics/Matrix;)V
    .locals 6

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsk;->zzd()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsk;->v()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsk;->E()Ljava/util/List;

    move-result-object v3

    const-string v4, ""

    move-object v0, p0

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lp06$d;-><init>(Ljava/lang/String;Landroid/graphics/Rect;Ljava/util/List;Ljava/lang/String;Landroid/graphics/Matrix;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsk;->u()F

    move-result p2

    iput p2, p0, Lp06$c;->e:F

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsk;->s()F

    move-result p1

    iput p1, p0, Lp06$c;->f:F

    return-void
.end method

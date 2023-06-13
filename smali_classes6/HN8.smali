.class public final LHN8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxy;


# instance fields
.field public final a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsm;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsm;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHN8;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsm;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LHN8;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsm;->v()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget-object v0, p0, LHN8;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsm;->s()I

    move-result v0

    return v0
.end method

.method public final c()LBx$a;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, LHN8;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsm;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsm;->u()Lcom/google/android/gms/internal/mlkit_vision_barcode/zzse;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v17, LBx$a;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzse;->v()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzse;->F()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzse;->m0()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzse;->T()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzse;->K()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzse;->s()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzse;->zza()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzse;->zzb()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzse;->zzd()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzse;->j0()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzse;->L()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzse;->E()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzse;->u()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v1}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzse;->R()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v2, v17

    invoke-direct/range {v2 .. v16}, LBx$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v17

    :cond_0
    const/4 v1, 0x0

    return-object v1
.end method

.method public final d()Landroid/graphics/Rect;
    .locals 8

    iget-object v0, p0, LHN8;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsm;->F()[Landroid/graphics/Point;

    move-result-object v0

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    const/high16 v2, -0x80000000

    const v3, 0x7fffffff

    move v4, v3

    move v5, v4

    move v3, v2

    :goto_0
    array-length v6, v0

    if-ge v1, v6, :cond_0

    aget-object v6, v0, v1

    iget v7, v6, Landroid/graphics/Point;->x:I

    invoke-static {v4, v7}, Ljava/lang/Math;->min(II)I

    move-result v4

    iget v7, v6, Landroid/graphics/Point;->x:I

    invoke-static {v2, v7}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget v7, v6, Landroid/graphics/Point;->y:I

    invoke-static {v5, v7}, Ljava/lang/Math;->min(II)I

    move-result v5

    iget v6, v6, Landroid/graphics/Point;->y:I

    invoke-static {v3, v6}, Ljava/lang/Math;->max(II)I

    move-result v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0, v4, v5, v2, v3}, Landroid/graphics/Rect;-><init>(IIII)V

    return-object v0

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LHN8;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsm;->E()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final f()[Landroid/graphics/Point;
    .locals 1

    iget-object v0, p0, LHN8;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsm;->F()[Landroid/graphics/Point;

    move-result-object v0

    return-object v0
.end method

.method public final getFormat()I
    .locals 1

    iget-object v0, p0, LHN8;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsm;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzsm;->zza()I

    move-result v0

    return v0
.end method

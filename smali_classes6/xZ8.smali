.class public final LxZ8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxy;


# instance fields
.field public final a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LxZ8;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LxZ8;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;

    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final b()I
    .locals 1

    iget-object v0, p0, LxZ8;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;

    iget v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->e:I

    return v0
.end method

.method public final c()LBx$a;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, LxZ8;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;

    iget-object v1, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->o:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzi;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    return-object v1

    :cond_0
    new-instance v17, LBx$a;

    iget-object v3, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzi;->b:Ljava/lang/String;

    iget-object v4, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzi;->c:Ljava/lang/String;

    iget-object v5, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzi;->d:Ljava/lang/String;

    iget-object v6, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzi;->e:Ljava/lang/String;

    iget-object v7, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzi;->f:Ljava/lang/String;

    iget-object v8, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzi;->g:Ljava/lang/String;

    iget-object v9, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzi;->h:Ljava/lang/String;

    iget-object v10, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzi;->i:Ljava/lang/String;

    iget-object v11, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzi;->j:Ljava/lang/String;

    iget-object v12, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzi;->k:Ljava/lang/String;

    iget-object v13, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzi;->l:Ljava/lang/String;

    iget-object v14, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzi;->m:Ljava/lang/String;

    iget-object v15, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzi;->n:Ljava/lang/String;

    iget-object v1, v1, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzi;->o:Ljava/lang/String;

    move-object/from16 v2, v17

    move-object/from16 v16, v1

    invoke-direct/range {v2 .. v16}, LBx$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v17
.end method

.method public final d()Landroid/graphics/Rect;
    .locals 8

    iget-object v0, p0, LxZ8;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;

    iget-object v1, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->f:[Landroid/graphics/Point;

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    const/high16 v2, -0x80000000

    const v3, 0x7fffffff

    move v4, v3

    move v5, v4

    move v3, v2

    :goto_0
    iget-object v6, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->f:[Landroid/graphics/Point;

    array-length v7, v6

    if-ge v1, v7, :cond_0

    aget-object v6, v6, v1

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

    iget-object v0, p0, LxZ8;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;

    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final f()[Landroid/graphics/Point;
    .locals 1

    iget-object v0, p0, LxZ8;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;

    iget-object v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->f:[Landroid/graphics/Point;

    return-object v0
.end method

.method public final getFormat()I
    .locals 1

    iget-object v0, p0, LxZ8;->a:Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;

    iget v0, v0, Lcom/google/android/gms/internal/mlkit_vision_barcode/zzq;->b:I

    return v0
.end method

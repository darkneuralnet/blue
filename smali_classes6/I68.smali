.class public final synthetic LI68;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhs9;


# instance fields
.field public final synthetic a:Landroid/graphics/Matrix;


# direct methods
.method public synthetic constructor <init>(Landroid/graphics/Matrix;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LI68;->a:Landroid/graphics/Matrix;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v5, p0, LI68;->a:Landroid/graphics/Matrix;

    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzl;

    iget-object v0, p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzl;->c:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;

    invoke-static {v0}, Lof7;->b(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;)Ljava/util/List;

    move-result-object v3

    new-instance v9, Lp06$b;

    iget-object v0, p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzl;->f:Ljava/lang/String;

    invoke-static {v0}, Lzg7;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, ""

    goto :goto_0

    :cond_0
    iget-object v0, p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzl;->f:Ljava/lang/String;

    :goto_0
    move-object v1, v0

    invoke-static {v3}, Lof7;->a(Ljava/util/List;)Landroid/graphics/Rect;

    move-result-object v2

    iget-object v0, p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzl;->h:Ljava/lang/String;

    invoke-static {v0}, Lzg7;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "und"

    goto :goto_1

    :cond_1
    iget-object v0, p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzl;->h:Ljava/lang/String;

    :goto_1
    move-object v4, v0

    iget-object v0, p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzl;->b:[Lcom/google/android/gms/internal/mlkit_vision_text_common/zzr;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    new-instance v6, LCt8;

    invoke-direct {v6, v5}, LCt8;-><init>(Landroid/graphics/Matrix;)V

    invoke-static {v0, v6}, LzO7;->a(Ljava/util/List;Lhs9;)Ljava/util/List;

    move-result-object v6

    iget v7, p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzl;->g:F

    iget-object p1, p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzl;->c:Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;

    iget v8, p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzf;->f:F

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lp06$b;-><init>(Ljava/lang/String;Landroid/graphics/Rect;Ljava/util/List;Ljava/lang/String;Landroid/graphics/Matrix;Ljava/util/List;FF)V

    return-object v9
.end method

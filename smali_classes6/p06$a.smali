.class public Lp06$a;
.super Lp06$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp06;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final e:Ljava/util/List;

.field public final f:F

.field public final g:F


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsc;Landroid/graphics/Matrix;)V
    .locals 6

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsc;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsc;->v()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsc;->F()Ljava/util/List;

    move-result-object v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsc;->zzd()Ljava/lang/String;

    move-result-object v4

    move-object v0, p0

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lp06$d;-><init>(Ljava/lang/String;Landroid/graphics/Rect;Ljava/util/List;Ljava/lang/String;Landroid/graphics/Matrix;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsc;->u()F

    move-result v0

    iput v0, p0, Lp06$a;->f:F

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsc;->s()F

    move-result v0

    iput v0, p0, Lp06$a;->g:F

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzsc;->zzg()Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    :cond_0
    new-instance v0, LIC7;

    invoke-direct {v0, p2}, LIC7;-><init>(Landroid/graphics/Matrix;)V

    invoke-static {p1, v0}, LzO7;->a(Ljava/util/List;Lhs9;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lp06$a;->e:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/graphics/Rect;Ljava/util/List;Ljava/lang/String;Landroid/graphics/Matrix;FFLjava/util/List;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lp06$d;-><init>(Ljava/lang/String;Landroid/graphics/Rect;Ljava/util/List;Ljava/lang/String;Landroid/graphics/Matrix;)V

    iput p6, p0, Lp06$a;->f:F

    iput p7, p0, Lp06$a;->g:F

    iput-object p8, p0, Lp06$a;->e:Ljava/util/List;

    return-void
.end method

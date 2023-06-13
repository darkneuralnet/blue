.class public Lp06$b;
.super Lp06$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp06;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# instance fields
.field public final e:Ljava/util/List;

.field public final f:F

.field public final g:F


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzse;Landroid/graphics/Matrix;FF)V
    .locals 6

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzse;->E()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzse;->v()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzse;->F()Ljava/util/List;

    move-result-object v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzse;->zzd()Ljava/lang/String;

    move-result-object v4

    move-object v0, p0

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lp06$d;-><init>(Ljava/lang/String;Landroid/graphics/Rect;Ljava/util/List;Ljava/lang/String;Landroid/graphics/Matrix;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzse;->zzg()Ljava/util/List;

    move-result-object p1

    new-instance v0, LrQ7;

    invoke-direct {v0, p2}, LrQ7;-><init>(Landroid/graphics/Matrix;)V

    invoke-static {p1, v0}, LzO7;->a(Ljava/util/List;Lhs9;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lp06$b;->e:Ljava/util/List;

    iput p3, p0, Lp06$b;->f:F

    iput p4, p0, Lp06$b;->g:F

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/graphics/Rect;Ljava/util/List;Ljava/lang/String;Landroid/graphics/Matrix;Ljava/util/List;FF)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lp06$d;-><init>(Ljava/lang/String;Landroid/graphics/Rect;Ljava/util/List;Ljava/lang/String;Landroid/graphics/Matrix;)V

    iput-object p6, p0, Lp06$b;->e:Ljava/util/List;

    iput p7, p0, Lp06$b;->f:F

    iput p8, p0, Lp06$b;->g:F

    return-void
.end method


# virtual methods
.method public d()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lp06$d;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

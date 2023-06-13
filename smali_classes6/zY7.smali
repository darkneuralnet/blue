.class public final synthetic LzY7;
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

    iput-object p1, p0, LzY7;->a:Landroid/graphics/Matrix;

    return-void
.end method


# virtual methods
.method public final zza(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, LzY7;->a:Landroid/graphics/Matrix;

    check-cast p1, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzse;

    new-instance v1, Lp06$b;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzse;->u()F

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/mlkit_vision_text_common/zzse;->s()F

    move-result v3

    invoke-direct {v1, p1, v0, v2, v3}, Lp06$b;-><init>(Lcom/google/android/gms/internal/mlkit_vision_text_common/zzse;Landroid/graphics/Matrix;FF)V

    return-object v1
.end method

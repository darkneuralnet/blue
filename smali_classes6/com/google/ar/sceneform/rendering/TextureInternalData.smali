.class public Lcom/google/ar/sceneform/rendering/TextureInternalData;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/filament/proguard/UsedByNative;
    value = "material_java_wrappers.h"
.end annotation


# instance fields
.field public a:Lcom/google/android/filament/Texture;

.field public final b:Lcom/google/ar/sceneform/rendering/Texture$Sampler;


# direct methods
.method public constructor <init>(Lcom/google/android/filament/Texture;Lcom/google/ar/sceneform/rendering/Texture$Sampler;)V
    .locals 0
    .annotation build Lcom/google/android/filament/proguard/UsedByNative;
        value = "material_java_wrappers.h"
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/TextureInternalData;->a:Lcom/google/android/filament/Texture;

    iput-object p2, p0, Lcom/google/ar/sceneform/rendering/TextureInternalData;->b:Lcom/google/ar/sceneform/rendering/Texture$Sampler;

    return-void
.end method

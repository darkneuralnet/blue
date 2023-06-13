.class public Lcom/google/ar/sceneform/rendering/Texture;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/filament/proguard/UsedByNative;
    value = "material_java_wrappers.h"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/ar/sceneform/rendering/Texture$Sampler;
    }
.end annotation


# instance fields
.field public final a:Lcom/google/ar/sceneform/rendering/TextureInternalData;


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(Lcom/google/ar/sceneform/rendering/TextureInternalData;)V
    .locals 0
    .annotation build Lcom/google/android/filament/proguard/UsedByNative;
        value = "material_java_wrappers.h"
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/ar/sceneform/rendering/Texture;->a:Lcom/google/ar/sceneform/rendering/TextureInternalData;

    return-void
.end method

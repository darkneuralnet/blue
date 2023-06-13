.class final Lcom/google/ar/sceneform/rendering/MaterialParameters;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Lcom/google/android/filament/proguard/UsedByNative;
    value = "material_java_wrappers.h"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/ar/sceneform/rendering/MaterialParameters$n;,
        Lcom/google/ar/sceneform/rendering/MaterialParameters$k;,
        Lcom/google/ar/sceneform/rendering/MaterialParameters$j;,
        Lcom/google/ar/sceneform/rendering/MaterialParameters$i;,
        Lcom/google/ar/sceneform/rendering/MaterialParameters$l;,
        Lcom/google/ar/sceneform/rendering/MaterialParameters$g;,
        Lcom/google/ar/sceneform/rendering/MaterialParameters$f;,
        Lcom/google/ar/sceneform/rendering/MaterialParameters$e;,
        Lcom/google/ar/sceneform/rendering/MaterialParameters$h;,
        Lcom/google/ar/sceneform/rendering/MaterialParameters$c;,
        Lcom/google/ar/sceneform/rendering/MaterialParameters$b;,
        Lcom/google/ar/sceneform/rendering/MaterialParameters$a;,
        Lcom/google/ar/sceneform/rendering/MaterialParameters$d;,
        Lcom/google/ar/sceneform/rendering/MaterialParameters$m;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Lcom/google/ar/sceneform/rendering/MaterialParameters$m;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters;->a:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public setBoolean(Ljava/lang/String;Z)V
    .locals 2
    .annotation build Lcom/google/android/filament/proguard/UsedByNative;
        value = "material_java_wrappers.h"
    .end annotation

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters;->a:Ljava/util/HashMap;

    new-instance v1, Lcom/google/ar/sceneform/rendering/MaterialParameters$d;

    invoke-direct {v1, p1, p2}, Lcom/google/ar/sceneform/rendering/MaterialParameters$d;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setBoolean2(Ljava/lang/String;ZZ)V
    .locals 2
    .annotation build Lcom/google/android/filament/proguard/UsedByNative;
        value = "material_java_wrappers.h"
    .end annotation

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters;->a:Ljava/util/HashMap;

    new-instance v1, Lcom/google/ar/sceneform/rendering/MaterialParameters$a;

    invoke-direct {v1, p1, p2, p3}, Lcom/google/ar/sceneform/rendering/MaterialParameters$a;-><init>(Ljava/lang/String;ZZ)V

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setBoolean3(Ljava/lang/String;ZZZ)V
    .locals 2
    .annotation build Lcom/google/android/filament/proguard/UsedByNative;
        value = "material_java_wrappers.h"
    .end annotation

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters;->a:Ljava/util/HashMap;

    new-instance v1, Lcom/google/ar/sceneform/rendering/MaterialParameters$b;

    invoke-direct {v1, p1, p2, p3, p4}, Lcom/google/ar/sceneform/rendering/MaterialParameters$b;-><init>(Ljava/lang/String;ZZZ)V

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setBoolean4(Ljava/lang/String;ZZZZ)V
    .locals 8
    .annotation build Lcom/google/android/filament/proguard/UsedByNative;
        value = "material_java_wrappers.h"
    .end annotation

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters;->a:Ljava/util/HashMap;

    new-instance v7, Lcom/google/ar/sceneform/rendering/MaterialParameters$c;

    move-object v1, v7

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/google/ar/sceneform/rendering/MaterialParameters$c;-><init>(Ljava/lang/String;ZZZZ)V

    invoke-virtual {v0, p1, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setFloat(Ljava/lang/String;F)V
    .locals 2
    .annotation build Lcom/google/android/filament/proguard/UsedByNative;
        value = "material_java_wrappers.h"
    .end annotation

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters;->a:Ljava/util/HashMap;

    new-instance v1, Lcom/google/ar/sceneform/rendering/MaterialParameters$h;

    invoke-direct {v1, p1, p2}, Lcom/google/ar/sceneform/rendering/MaterialParameters$h;-><init>(Ljava/lang/String;F)V

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setFloat2(Ljava/lang/String;FF)V
    .locals 2
    .annotation build Lcom/google/android/filament/proguard/UsedByNative;
        value = "material_java_wrappers.h"
    .end annotation

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters;->a:Ljava/util/HashMap;

    new-instance v1, Lcom/google/ar/sceneform/rendering/MaterialParameters$e;

    invoke-direct {v1, p1, p2, p3}, Lcom/google/ar/sceneform/rendering/MaterialParameters$e;-><init>(Ljava/lang/String;FF)V

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setFloat3(Ljava/lang/String;FFF)V
    .locals 2
    .annotation build Lcom/google/android/filament/proguard/UsedByNative;
        value = "material_java_wrappers.h"
    .end annotation

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters;->a:Ljava/util/HashMap;

    new-instance v1, Lcom/google/ar/sceneform/rendering/MaterialParameters$f;

    invoke-direct {v1, p1, p2, p3, p4}, Lcom/google/ar/sceneform/rendering/MaterialParameters$f;-><init>(Ljava/lang/String;FFF)V

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setFloat4(Ljava/lang/String;FFFF)V
    .locals 8
    .annotation build Lcom/google/android/filament/proguard/UsedByNative;
        value = "material_java_wrappers.h"
    .end annotation

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters;->a:Ljava/util/HashMap;

    new-instance v7, Lcom/google/ar/sceneform/rendering/MaterialParameters$g;

    move-object v1, v7

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/google/ar/sceneform/rendering/MaterialParameters$g;-><init>(Ljava/lang/String;FFFF)V

    invoke-virtual {v0, p1, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setInt(Ljava/lang/String;I)V
    .locals 2
    .annotation build Lcom/google/android/filament/proguard/UsedByNative;
        value = "material_java_wrappers.h"
    .end annotation

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters;->a:Ljava/util/HashMap;

    new-instance v1, Lcom/google/ar/sceneform/rendering/MaterialParameters$l;

    invoke-direct {v1, p1, p2}, Lcom/google/ar/sceneform/rendering/MaterialParameters$l;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setInt2(Ljava/lang/String;II)V
    .locals 2
    .annotation build Lcom/google/android/filament/proguard/UsedByNative;
        value = "material_java_wrappers.h"
    .end annotation

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters;->a:Ljava/util/HashMap;

    new-instance v1, Lcom/google/ar/sceneform/rendering/MaterialParameters$i;

    invoke-direct {v1, p1, p2, p3}, Lcom/google/ar/sceneform/rendering/MaterialParameters$i;-><init>(Ljava/lang/String;II)V

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setInt3(Ljava/lang/String;III)V
    .locals 2
    .annotation build Lcom/google/android/filament/proguard/UsedByNative;
        value = "material_java_wrappers.h"
    .end annotation

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters;->a:Ljava/util/HashMap;

    new-instance v1, Lcom/google/ar/sceneform/rendering/MaterialParameters$j;

    invoke-direct {v1, p1, p2, p3, p4}, Lcom/google/ar/sceneform/rendering/MaterialParameters$j;-><init>(Ljava/lang/String;III)V

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setInt4(Ljava/lang/String;IIII)V
    .locals 8
    .annotation build Lcom/google/android/filament/proguard/UsedByNative;
        value = "material_java_wrappers.h"
    .end annotation

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters;->a:Ljava/util/HashMap;

    new-instance v7, Lcom/google/ar/sceneform/rendering/MaterialParameters$k;

    move-object v1, v7

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/google/ar/sceneform/rendering/MaterialParameters$k;-><init>(Ljava/lang/String;IIII)V

    invoke-virtual {v0, p1, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public setTexture(Ljava/lang/String;Lcom/google/ar/sceneform/rendering/Texture;)V
    .locals 2
    .annotation build Lcom/google/android/filament/proguard/UsedByNative;
        value = "material_java_wrappers.h"
    .end annotation

    iget-object v0, p0, Lcom/google/ar/sceneform/rendering/MaterialParameters;->a:Ljava/util/HashMap;

    new-instance v1, Lcom/google/ar/sceneform/rendering/MaterialParameters$n;

    invoke-direct {v1, p1, p2}, Lcom/google/ar/sceneform/rendering/MaterialParameters$n;-><init>(Ljava/lang/String;Lcom/google/ar/sceneform/rendering/Texture;)V

    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

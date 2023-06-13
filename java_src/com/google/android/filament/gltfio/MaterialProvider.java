package com.google.android.filament.gltfio;

import com.google.android.filament.Material;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.proguard.UsedByNative;
@UsedByNative("AssetLoader.cpp")
/* loaded from: classes5.dex */
public interface MaterialProvider {

    @UsedByNative("MaterialKey.cpp")
    /* loaded from: classes5.dex */
    public static class MaterialKey {
        public int alphaMode;
        public int aoUV;
        public int baseColorUV;
        public int clearCoatNormalUV;
        public int clearCoatRoughnessUV;
        public int clearCoatUV;
        public boolean doubleSided;
        public int emissiveUV;
        public boolean enableDiagnostics;
        public boolean hasBaseColorTexture;
        public boolean hasClearCoat;
        public boolean hasClearCoatNormalTexture;
        public boolean hasClearCoatRoughnessTexture;
        public boolean hasClearCoatTexture;
        public boolean hasEmissiveTexture;
        public boolean hasIOR;
        public boolean hasMetallicRoughnessTexture;
        public boolean hasNormalTexture;
        public boolean hasOcclusionTexture;
        public boolean hasSheen;
        public boolean hasSheenColorTexture;
        public boolean hasSheenRoughnessTexture;
        public boolean hasTextureTransforms;
        public boolean hasTransmission;
        public boolean hasTransmissionTexture;
        public boolean hasVertexColors;
        public boolean hasVolumeThicknessTexture;
        public int metallicRoughnessUV;
        public int normalUV;
        public int sheenColorUV;
        public int sheenRoughnessUV;
        public int transmissionUV;
        public boolean unlit;
        public boolean useSpecularGlossiness;
        public int volumeThicknessUV;

        static {
            nGlobalInit();
        }

        private static native void nConstrainMaterial(MaterialKey materialKey, int[] iArr);

        private static native void nGlobalInit();

        public void constrainMaterial(int[] iArr) {
            nConstrainMaterial(this, iArr);
        }
    }

    MaterialInstance createMaterialInstance(MaterialKey materialKey, int[] iArr, String str, String str2);

    void destroy();

    void destroyMaterials();

    Material getMaterial(MaterialKey materialKey, int[] iArr, String str);

    Material[] getMaterials();

    boolean needsDummyData(int i);
}

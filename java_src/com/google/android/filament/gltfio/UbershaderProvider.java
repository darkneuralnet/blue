package com.google.android.filament.gltfio;

import com.google.android.filament.Engine;
import com.google.android.filament.Material;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.VertexBuffer;
import com.google.android.filament.gltfio.MaterialProvider;
/* loaded from: classes5.dex */
public class UbershaderProvider implements MaterialProvider {
    private static final VertexBuffer.VertexAttribute[] sVertexAttributesValues = VertexBuffer.VertexAttribute.values();
    private long mNativeObject;

    /* renamed from: com.google.android.filament.gltfio.UbershaderProvider$1 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C174571 {

        /* renamed from: $SwitchMap$com$google$android$filament$VertexBuffer$VertexAttribute */
        static final /* synthetic */ int[] f70123xee01d349;

        static {
            int[] iArr = new int[VertexBuffer.VertexAttribute.values().length];
            f70123xee01d349 = iArr;
            try {
                iArr[VertexBuffer.VertexAttribute.UV0.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70123xee01d349[VertexBuffer.VertexAttribute.UV1.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70123xee01d349[VertexBuffer.VertexAttribute.COLOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public UbershaderProvider(Engine engine) {
        this.mNativeObject = nCreateUbershaderProvider(engine.getNativeObject());
    }

    private static native long nCreateMaterialInstance(long j, MaterialProvider.MaterialKey materialKey, int[] iArr, String str, String str2);

    private static native long nCreateUbershaderProvider(long j);

    private static native void nDestroyMaterials(long j);

    private static native void nDestroyUbershaderProvider(long j);

    private static native long nGetMaterial(long j, MaterialProvider.MaterialKey materialKey, int[] iArr, String str);

    private static native int nGetMaterialCount(long j);

    private static native void nGetMaterials(long j, long[] jArr);

    @Override // com.google.android.filament.gltfio.MaterialProvider
    public MaterialInstance createMaterialInstance(MaterialProvider.MaterialKey materialKey, int[] iArr, String str, String str2) {
        long nCreateMaterialInstance = nCreateMaterialInstance(this.mNativeObject, materialKey, iArr, str, str2);
        if (nCreateMaterialInstance == 0) {
            return null;
        }
        return new MaterialInstance((Engine) null, nCreateMaterialInstance);
    }

    @Override // com.google.android.filament.gltfio.MaterialProvider
    public void destroy() {
        nDestroyUbershaderProvider(this.mNativeObject);
        this.mNativeObject = 0L;
    }

    @Override // com.google.android.filament.gltfio.MaterialProvider
    public void destroyMaterials() {
        nDestroyMaterials(this.mNativeObject);
    }

    @Override // com.google.android.filament.gltfio.MaterialProvider
    public Material getMaterial(MaterialProvider.MaterialKey materialKey, int[] iArr, String str) {
        long nGetMaterial = nGetMaterial(this.mNativeObject, materialKey, iArr, str);
        if (nGetMaterial == 0) {
            return null;
        }
        return new Material(nGetMaterial);
    }

    @Override // com.google.android.filament.gltfio.MaterialProvider
    public Material[] getMaterials() {
        int nGetMaterialCount = nGetMaterialCount(this.mNativeObject);
        Material[] materialArr = new Material[nGetMaterialCount];
        long[] jArr = new long[nGetMaterialCount];
        nGetMaterials(this.mNativeObject, jArr);
        for (int i = 0; i < nGetMaterialCount; i++) {
            materialArr[i] = new Material(jArr[i]);
        }
        return materialArr;
    }

    public long getNativeObject() {
        return this.mNativeObject;
    }

    @Override // com.google.android.filament.gltfio.MaterialProvider
    public boolean needsDummyData(int i) {
        int i2 = C174571.f70123xee01d349[sVertexAttributesValues[i].ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            return true;
        }
        return false;
    }
}

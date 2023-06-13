package com.amazonaws.services.p026s3.model;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* renamed from: com.amazonaws.services.s3.model.ExtraMaterialsDescription */
/* loaded from: classes3.dex */
public class ExtraMaterialsDescription implements Serializable {
    public static final ExtraMaterialsDescription NONE = new ExtraMaterialsDescription(Collections.EMPTY_MAP);
    private final Map<String, String> extra;
    private final ConflictResolution resolve;

    /* renamed from: com.amazonaws.services.s3.model.ExtraMaterialsDescription$1 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C169231 {

        /* renamed from: $SwitchMap$com$amazonaws$services$s3$model$ExtraMaterialsDescription$ConflictResolution */
        static final /* synthetic */ int[] f68597xb3b15629;

        static {
            int[] iArr = new int[ConflictResolution.values().length];
            f68597xb3b15629 = iArr;
            try {
                iArr[ConflictResolution.FAIL_FAST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68597xb3b15629[ConflictResolution.OVERRIDDEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68597xb3b15629[ConflictResolution.OVERRIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: com.amazonaws.services.s3.model.ExtraMaterialsDescription$ConflictResolution */
    /* loaded from: classes3.dex */
    public enum ConflictResolution {
        FAIL_FAST,
        OVERRIDE,
        OVERRIDDEN
    }

    public ExtraMaterialsDescription(Map<String, String> map) {
        this(map, ConflictResolution.FAIL_FAST);
    }

    public ConflictResolution getConflictResolution() {
        return this.resolve;
    }

    public Map<String, String> getMaterialDescription() {
        return this.extra;
    }

    public Map<String, String> mergeInto(Map<String, String> map) {
        if (this.extra.size() == 0) {
            return map;
        }
        if (map != null && map.size() != 0) {
            int i = C169231.f68597xb3b15629[this.resolve.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        HashMap hashMap = new HashMap(map);
                        hashMap.putAll(this.extra);
                        return Collections.unmodifiableMap(hashMap);
                    }
                    throw new UnsupportedOperationException();
                }
                HashMap hashMap2 = new HashMap(this.extra);
                hashMap2.putAll(map);
                return Collections.unmodifiableMap(hashMap2);
            }
            int size = map.size() + this.extra.size();
            HashMap hashMap3 = new HashMap(map);
            hashMap3.putAll(this.extra);
            if (size == hashMap3.size()) {
                return Collections.unmodifiableMap(hashMap3);
            }
            throw new IllegalArgumentException("The supplemental material descriptions contains conflicting entries");
        }
        return this.extra;
    }

    public ExtraMaterialsDescription(Map<String, String> map, ConflictResolution conflictResolution) {
        if (map != null && conflictResolution != null) {
            this.extra = Collections.unmodifiableMap(new HashMap(map));
            this.resolve = conflictResolution;
            return;
        }
        throw new IllegalArgumentException();
    }
}

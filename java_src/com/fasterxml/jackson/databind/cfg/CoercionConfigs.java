package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.type.LogicalType;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes5.dex */
public class CoercionConfigs implements Serializable {
    private static final int TARGET_TYPE_COUNT = LogicalType.values().length;
    private static final long serialVersionUID = 1;
    protected CoercionAction _defaultAction;
    protected final MutableCoercionConfig _defaultCoercions;
    protected Map<Class<?>, MutableCoercionConfig> _perClassCoercions;
    protected MutableCoercionConfig[] _perTypeCoercions;

    /* renamed from: com.fasterxml.jackson.databind.cfg.CoercionConfigs$1 */
    /* loaded from: classes5.dex */
    public static /* synthetic */ class C173841 {
        static final /* synthetic */ int[] $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionInputShape;

        static {
            int[] iArr = new int[CoercionInputShape.values().length];
            $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionInputShape = iArr;
            try {
                iArr[CoercionInputShape.EmptyArray.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionInputShape[CoercionInputShape.Float.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionInputShape[CoercionInputShape.Integer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public CoercionConfigs() {
        this(CoercionAction.TryConvert, new MutableCoercionConfig(), null, null);
    }

    private static MutableCoercionConfig _copy(MutableCoercionConfig mutableCoercionConfig) {
        if (mutableCoercionConfig == null) {
            return null;
        }
        return mutableCoercionConfig.copy();
    }

    public boolean _isScalarType(LogicalType logicalType) {
        return logicalType == LogicalType.Float || logicalType == LogicalType.Integer || logicalType == LogicalType.Boolean || logicalType == LogicalType.DateTime;
    }

    public CoercionConfigs copy() {
        MutableCoercionConfig[] mutableCoercionConfigArr;
        MutableCoercionConfig[] mutableCoercionConfigArr2 = this._perTypeCoercions;
        HashMap hashMap = null;
        if (mutableCoercionConfigArr2 == null) {
            mutableCoercionConfigArr = null;
        } else {
            int length = mutableCoercionConfigArr2.length;
            mutableCoercionConfigArr = new MutableCoercionConfig[length];
            for (int i = 0; i < length; i++) {
                mutableCoercionConfigArr[i] = _copy(this._perTypeCoercions[i]);
            }
        }
        if (this._perClassCoercions != null) {
            hashMap = new HashMap();
            for (Map.Entry<Class<?>, MutableCoercionConfig> entry : this._perClassCoercions.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue().copy());
            }
        }
        return new CoercionConfigs(this._defaultAction, this._defaultCoercions.copy(), mutableCoercionConfigArr, hashMap);
    }

    public MutableCoercionConfig defaultCoercions() {
        return this._defaultCoercions;
    }

    public CoercionAction findCoercion(DeserializationConfig deserializationConfig, LogicalType logicalType, Class<?> cls, CoercionInputShape coercionInputShape) {
        MutableCoercionConfig mutableCoercionConfig;
        CoercionAction findAction;
        MutableCoercionConfig mutableCoercionConfig2;
        CoercionAction findAction2;
        Map<Class<?>, MutableCoercionConfig> map = this._perClassCoercions;
        if (map != null && cls != null && (mutableCoercionConfig2 = map.get(cls)) != null && (findAction2 = mutableCoercionConfig2.findAction(coercionInputShape)) != null) {
            return findAction2;
        }
        MutableCoercionConfig[] mutableCoercionConfigArr = this._perTypeCoercions;
        if (mutableCoercionConfigArr != null && logicalType != null && (mutableCoercionConfig = mutableCoercionConfigArr[logicalType.ordinal()]) != null && (findAction = mutableCoercionConfig.findAction(coercionInputShape)) != null) {
            return findAction;
        }
        CoercionAction findAction3 = this._defaultCoercions.findAction(coercionInputShape);
        if (findAction3 != null) {
            return findAction3;
        }
        int i = C173841.$SwitchMap$com$fasterxml$jackson$databind$cfg$CoercionInputShape[coercionInputShape.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && logicalType == LogicalType.Enum && deserializationConfig.isEnabled(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS)) {
                    return CoercionAction.Fail;
                }
            } else if (logicalType == LogicalType.Integer) {
                if (deserializationConfig.isEnabled(DeserializationFeature.ACCEPT_FLOAT_AS_INT)) {
                    return CoercionAction.TryConvert;
                }
                return CoercionAction.Fail;
            }
            boolean _isScalarType = _isScalarType(logicalType);
            if (_isScalarType && !deserializationConfig.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS)) {
                return CoercionAction.Fail;
            }
            if (coercionInputShape == CoercionInputShape.EmptyString) {
                if (!_isScalarType && !deserializationConfig.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
                    if (logicalType == LogicalType.OtherScalar) {
                        return CoercionAction.TryConvert;
                    }
                    return CoercionAction.Fail;
                }
                return CoercionAction.AsNull;
            }
            return this._defaultAction;
        } else if (deserializationConfig.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) {
            return CoercionAction.AsNull;
        } else {
            return CoercionAction.Fail;
        }
    }

    public CoercionAction findCoercionFromBlankString(DeserializationConfig deserializationConfig, LogicalType logicalType, Class<?> cls, CoercionAction coercionAction) {
        Boolean bool;
        CoercionAction coercionAction2;
        MutableCoercionConfig mutableCoercionConfig;
        MutableCoercionConfig mutableCoercionConfig2;
        Map<Class<?>, MutableCoercionConfig> map = this._perClassCoercions;
        if (map != null && cls != null && (mutableCoercionConfig2 = map.get(cls)) != null) {
            bool = mutableCoercionConfig2.getAcceptBlankAsEmpty();
            coercionAction2 = mutableCoercionConfig2.findAction(CoercionInputShape.EmptyString);
        } else {
            bool = null;
            coercionAction2 = null;
        }
        MutableCoercionConfig[] mutableCoercionConfigArr = this._perTypeCoercions;
        if (mutableCoercionConfigArr != null && logicalType != null && (mutableCoercionConfig = mutableCoercionConfigArr[logicalType.ordinal()]) != null) {
            if (bool == null) {
                bool = mutableCoercionConfig.getAcceptBlankAsEmpty();
            }
            if (coercionAction2 == null) {
                coercionAction2 = mutableCoercionConfig.findAction(CoercionInputShape.EmptyString);
            }
        }
        if (bool == null) {
            bool = this._defaultCoercions.getAcceptBlankAsEmpty();
        }
        if (coercionAction2 == null) {
            coercionAction2 = this._defaultCoercions.findAction(CoercionInputShape.EmptyString);
        }
        if (Boolean.FALSE.equals(bool)) {
            return coercionAction;
        }
        if (coercionAction2 != null) {
            return coercionAction2;
        }
        if (_isScalarType(logicalType)) {
            return CoercionAction.AsNull;
        }
        if (deserializationConfig.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT)) {
            return CoercionAction.AsNull;
        }
        return coercionAction;
    }

    public MutableCoercionConfig findOrCreateCoercion(LogicalType logicalType) {
        if (this._perTypeCoercions == null) {
            this._perTypeCoercions = new MutableCoercionConfig[TARGET_TYPE_COUNT];
        }
        MutableCoercionConfig mutableCoercionConfig = this._perTypeCoercions[logicalType.ordinal()];
        if (mutableCoercionConfig == null) {
            MutableCoercionConfig[] mutableCoercionConfigArr = this._perTypeCoercions;
            int ordinal = logicalType.ordinal();
            MutableCoercionConfig mutableCoercionConfig2 = new MutableCoercionConfig();
            mutableCoercionConfigArr[ordinal] = mutableCoercionConfig2;
            return mutableCoercionConfig2;
        }
        return mutableCoercionConfig;
    }

    public CoercionConfigs(CoercionAction coercionAction, MutableCoercionConfig mutableCoercionConfig, MutableCoercionConfig[] mutableCoercionConfigArr, Map<Class<?>, MutableCoercionConfig> map) {
        this._defaultCoercions = mutableCoercionConfig;
        this._defaultAction = coercionAction;
        this._perTypeCoercions = mutableCoercionConfigArr;
        this._perClassCoercions = map;
    }

    public MutableCoercionConfig findOrCreateCoercion(Class<?> cls) {
        if (this._perClassCoercions == null) {
            this._perClassCoercions = new HashMap();
        }
        MutableCoercionConfig mutableCoercionConfig = this._perClassCoercions.get(cls);
        if (mutableCoercionConfig == null) {
            MutableCoercionConfig mutableCoercionConfig2 = new MutableCoercionConfig();
            this._perClassCoercions.put(cls, mutableCoercionConfig2);
            return mutableCoercionConfig2;
        }
        return mutableCoercionConfig;
    }
}

package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
/* loaded from: classes8.dex */
public class Flags {
    public static final FlagField<ProtoBuf.Class.Kind> CLASS_KIND;
    public static final BooleanFlagField DECLARES_DEFAULT_VALUE;
    public static final BooleanFlagField DEFINITELY_NOT_NULL_TYPE;
    public static final BooleanFlagField HAS_ANNOTATIONS;
    public static final BooleanFlagField HAS_CONSTANT;
    public static final BooleanFlagField HAS_GETTER;
    public static final BooleanFlagField HAS_SETTER;
    public static final BooleanFlagField IS_CONST;
    public static final BooleanFlagField IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES;
    public static final BooleanFlagField IS_CROSSINLINE;
    public static final BooleanFlagField IS_DATA;
    public static final BooleanFlagField IS_DELEGATED;
    public static final BooleanFlagField IS_EXPECT_CLASS;
    public static final BooleanFlagField IS_EXPECT_FUNCTION;
    public static final BooleanFlagField IS_EXPECT_PROPERTY;
    public static final BooleanFlagField IS_EXTERNAL_ACCESSOR;
    public static final BooleanFlagField IS_EXTERNAL_CLASS;
    public static final BooleanFlagField IS_EXTERNAL_FUNCTION;
    public static final BooleanFlagField IS_EXTERNAL_PROPERTY;
    public static final BooleanFlagField IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES;
    public static final BooleanFlagField IS_FUN_INTERFACE;
    public static final BooleanFlagField IS_INFIX;
    public static final BooleanFlagField IS_INLINE;
    public static final BooleanFlagField IS_INLINE_ACCESSOR;
    public static final BooleanFlagField IS_INNER;
    public static final BooleanFlagField IS_LATEINIT;
    public static final BooleanFlagField IS_NEGATED;
    public static final BooleanFlagField IS_NOINLINE;
    public static final BooleanFlagField IS_NOT_DEFAULT;
    public static final BooleanFlagField IS_NULL_CHECK_PREDICATE;
    public static final BooleanFlagField IS_OPERATOR;
    public static final BooleanFlagField IS_SECONDARY;
    public static final BooleanFlagField IS_SUSPEND;
    public static final BooleanFlagField IS_TAILREC;
    public static final BooleanFlagField IS_UNSIGNED;
    public static final BooleanFlagField IS_VALUE_CLASS;
    public static final BooleanFlagField IS_VAR;
    public static final FlagField<ProtoBuf.MemberKind> MEMBER_KIND;
    public static final FlagField<ProtoBuf.Modality> MODALITY;
    public static final BooleanFlagField SUSPEND_TYPE;
    public static final FlagField<ProtoBuf.Visibility> VISIBILITY;

    /* loaded from: classes8.dex */
    public static class BooleanFlagField extends FlagField<Boolean> {
        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"));
        }

        public BooleanFlagField(int i) {
            super(i, 1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        public Boolean get(int i) {
            Boolean valueOf = Boolean.valueOf((i & (1 << this.offset)) != 0);
            if (valueOf == null) {
                $$$reportNull$$$0(0);
            }
            return valueOf;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        public int toFlags(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.offset;
            }
            return 0;
        }
    }

    /* loaded from: classes8.dex */
    public static class EnumLiteFlagField<E extends Internal.EnumLite> extends FlagField<E> {
        private final E[] values;

        private static /* synthetic */ void $$$reportNull$$$0(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
        }

        public EnumLiteFlagField(int i, E[] eArr) {
            super(i, bitWidth(eArr));
            this.values = eArr;
        }

        private static <E> int bitWidth(E[] eArr) {
            if (eArr == null) {
                $$$reportNull$$$0(0);
            }
            int length = eArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i = 31; i >= 0; i--) {
                if (((1 << i) & length) != 0) {
                    return i + 1;
                }
            }
            throw new IllegalStateException("Empty enum: " + eArr.getClass());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        public /* bridge */ /* synthetic */ int toFlags(Object obj) {
            return toFlags((EnumLiteFlagField<E>) ((Internal.EnumLite) obj));
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.FlagField
        public E get(int i) {
            E[] eArr;
            int i2 = this.offset;
            int i3 = (i & (((1 << this.bitWidth) - 1) << i2)) >> i2;
            for (E e : this.values) {
                if (e.getNumber() == i3) {
                    return e;
                }
            }
            return null;
        }

        public int toFlags(E e) {
            return e.getNumber() << this.offset;
        }
    }

    /* loaded from: classes8.dex */
    public static abstract class FlagField<E> {
        public final int bitWidth;
        public final int offset;

        /* JADX WARN: Incorrect types in method signature: <E::Lkotlin/reflect/jvm/internal/impl/protobuf/Internal$EnumLite;>(Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$FlagField<*>;[TE;)Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$FlagField<TE;>; */
        public static FlagField after(FlagField flagField, Internal.EnumLite[] enumLiteArr) {
            return new EnumLiteFlagField(flagField.offset + flagField.bitWidth, enumLiteArr);
        }

        public static BooleanFlagField booleanAfter(FlagField<?> flagField) {
            return new BooleanFlagField(flagField.offset + flagField.bitWidth);
        }

        public static BooleanFlagField booleanFirst() {
            return new BooleanFlagField(0);
        }

        public abstract E get(int i);

        public abstract int toFlags(E e);

        private FlagField(int i, int i2) {
            this.offset = i;
            this.bitWidth = i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            if (i == 2) {
                objArr[0] = "kind";
            } else if (i != 5) {
                if (i != 6) {
                    if (i != 8) {
                        if (i != 9) {
                            if (i != 11) {
                                objArr[0] = "visibility";
                            }
                        }
                    }
                }
                objArr[0] = "memberKind";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
            switch (i) {
                case 3:
                    objArr[2] = "getConstructorFlags";
                    break;
                case 4:
                case 5:
                case 6:
                    objArr[2] = "getFunctionFlags";
                    break;
                case 7:
                case 8:
                case 9:
                    objArr[2] = "getPropertyFlags";
                    break;
                case 10:
                case 11:
                    objArr[2] = "getAccessorFlags";
                    break;
                default:
                    objArr[2] = "getClassFlags";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
        objArr[0] = "modality";
        objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
        switch (i) {
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    static {
        BooleanFlagField booleanFirst = FlagField.booleanFirst();
        SUSPEND_TYPE = booleanFirst;
        DEFINITELY_NOT_NULL_TYPE = FlagField.booleanAfter(booleanFirst);
        BooleanFlagField booleanFirst2 = FlagField.booleanFirst();
        HAS_ANNOTATIONS = booleanFirst2;
        FlagField<ProtoBuf.Visibility> after = FlagField.after(booleanFirst2, ProtoBuf.Visibility.values());
        VISIBILITY = after;
        FlagField<ProtoBuf.Modality> after2 = FlagField.after(after, ProtoBuf.Modality.values());
        MODALITY = after2;
        FlagField<ProtoBuf.Class.Kind> after3 = FlagField.after(after2, ProtoBuf.Class.Kind.values());
        CLASS_KIND = after3;
        BooleanFlagField booleanAfter = FlagField.booleanAfter(after3);
        IS_INNER = booleanAfter;
        BooleanFlagField booleanAfter2 = FlagField.booleanAfter(booleanAfter);
        IS_DATA = booleanAfter2;
        BooleanFlagField booleanAfter3 = FlagField.booleanAfter(booleanAfter2);
        IS_EXTERNAL_CLASS = booleanAfter3;
        BooleanFlagField booleanAfter4 = FlagField.booleanAfter(booleanAfter3);
        IS_EXPECT_CLASS = booleanAfter4;
        BooleanFlagField booleanAfter5 = FlagField.booleanAfter(booleanAfter4);
        IS_VALUE_CLASS = booleanAfter5;
        IS_FUN_INTERFACE = FlagField.booleanAfter(booleanAfter5);
        BooleanFlagField booleanAfter6 = FlagField.booleanAfter(after);
        IS_SECONDARY = booleanAfter6;
        IS_CONSTRUCTOR_WITH_NON_STABLE_PARAMETER_NAMES = FlagField.booleanAfter(booleanAfter6);
        FlagField<ProtoBuf.MemberKind> after4 = FlagField.after(after2, ProtoBuf.MemberKind.values());
        MEMBER_KIND = after4;
        BooleanFlagField booleanAfter7 = FlagField.booleanAfter(after4);
        IS_OPERATOR = booleanAfter7;
        BooleanFlagField booleanAfter8 = FlagField.booleanAfter(booleanAfter7);
        IS_INFIX = booleanAfter8;
        BooleanFlagField booleanAfter9 = FlagField.booleanAfter(booleanAfter8);
        IS_INLINE = booleanAfter9;
        BooleanFlagField booleanAfter10 = FlagField.booleanAfter(booleanAfter9);
        IS_TAILREC = booleanAfter10;
        BooleanFlagField booleanAfter11 = FlagField.booleanAfter(booleanAfter10);
        IS_EXTERNAL_FUNCTION = booleanAfter11;
        BooleanFlagField booleanAfter12 = FlagField.booleanAfter(booleanAfter11);
        IS_SUSPEND = booleanAfter12;
        BooleanFlagField booleanAfter13 = FlagField.booleanAfter(booleanAfter12);
        IS_EXPECT_FUNCTION = booleanAfter13;
        IS_FUNCTION_WITH_NON_STABLE_PARAMETER_NAMES = FlagField.booleanAfter(booleanAfter13);
        BooleanFlagField booleanAfter14 = FlagField.booleanAfter(after4);
        IS_VAR = booleanAfter14;
        BooleanFlagField booleanAfter15 = FlagField.booleanAfter(booleanAfter14);
        HAS_GETTER = booleanAfter15;
        BooleanFlagField booleanAfter16 = FlagField.booleanAfter(booleanAfter15);
        HAS_SETTER = booleanAfter16;
        BooleanFlagField booleanAfter17 = FlagField.booleanAfter(booleanAfter16);
        IS_CONST = booleanAfter17;
        BooleanFlagField booleanAfter18 = FlagField.booleanAfter(booleanAfter17);
        IS_LATEINIT = booleanAfter18;
        BooleanFlagField booleanAfter19 = FlagField.booleanAfter(booleanAfter18);
        HAS_CONSTANT = booleanAfter19;
        BooleanFlagField booleanAfter20 = FlagField.booleanAfter(booleanAfter19);
        IS_EXTERNAL_PROPERTY = booleanAfter20;
        BooleanFlagField booleanAfter21 = FlagField.booleanAfter(booleanAfter20);
        IS_DELEGATED = booleanAfter21;
        IS_EXPECT_PROPERTY = FlagField.booleanAfter(booleanAfter21);
        BooleanFlagField booleanAfter22 = FlagField.booleanAfter(booleanFirst2);
        DECLARES_DEFAULT_VALUE = booleanAfter22;
        BooleanFlagField booleanAfter23 = FlagField.booleanAfter(booleanAfter22);
        IS_CROSSINLINE = booleanAfter23;
        IS_NOINLINE = FlagField.booleanAfter(booleanAfter23);
        BooleanFlagField booleanAfter24 = FlagField.booleanAfter(after2);
        IS_NOT_DEFAULT = booleanAfter24;
        BooleanFlagField booleanAfter25 = FlagField.booleanAfter(booleanAfter24);
        IS_EXTERNAL_ACCESSOR = booleanAfter25;
        IS_INLINE_ACCESSOR = FlagField.booleanAfter(booleanAfter25);
        BooleanFlagField booleanFirst3 = FlagField.booleanFirst();
        IS_NEGATED = booleanFirst3;
        IS_NULL_CHECK_PREDICATE = FlagField.booleanAfter(booleanFirst3);
        IS_UNSIGNED = FlagField.booleanFirst();
    }

    public static int getAccessorFlags(boolean z, ProtoBuf.Visibility visibility, ProtoBuf.Modality modality, boolean z2, boolean z3, boolean z4) {
        if (visibility == null) {
            $$$reportNull$$$0(10);
        }
        if (modality == null) {
            $$$reportNull$$$0(11);
        }
        return HAS_ANNOTATIONS.toFlags(Boolean.valueOf(z)) | MODALITY.toFlags(modality) | VISIBILITY.toFlags(visibility) | IS_NOT_DEFAULT.toFlags(Boolean.valueOf(z2)) | IS_EXTERNAL_ACCESSOR.toFlags(Boolean.valueOf(z3)) | IS_INLINE_ACCESSOR.toFlags(Boolean.valueOf(z4));
    }
}
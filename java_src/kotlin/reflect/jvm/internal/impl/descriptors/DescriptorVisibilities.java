package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeAliasConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.SuperCallReceiverValue;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ThisClassReceiver;
import kotlin.reflect.jvm.internal.impl.types.DynamicTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.util.ModuleVisibilityHelper;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;
/* loaded from: classes8.dex */
public class DescriptorVisibilities {
    public static final ReceiverValue ALWAYS_SUITABLE_RECEIVER;
    public static final DescriptorVisibility DEFAULT_VISIBILITY;
    @Deprecated
    public static final ReceiverValue FALSE_IF_PROTECTED;
    public static final DescriptorVisibility INHERITED;
    public static final DescriptorVisibility INTERNAL;
    public static final DescriptorVisibility INVISIBLE_FAKE;
    public static final Set<DescriptorVisibility> INVISIBLE_FROM_OTHER_MODULES;
    private static final ReceiverValue IRRELEVANT_RECEIVER;
    public static final DescriptorVisibility LOCAL;
    private static final ModuleVisibilityHelper MODULE_VISIBILITY_HELPER;
    private static final Map<DescriptorVisibility, Integer> ORDERED_VISIBILITIES;
    public static final DescriptorVisibility PRIVATE;
    public static final DescriptorVisibility PRIVATE_TO_THIS;
    public static final DescriptorVisibility PROTECTED;
    public static final DescriptorVisibility PUBLIC;
    public static final DescriptorVisibility UNKNOWN;
    private static final Map<Visibility, DescriptorVisibility> visibilitiesMapping;

    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = i != 16 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 16 ? 3 : 2];
        if (i != 1 && i != 3 && i != 5 && i != 7) {
            switch (i) {
                case 9:
                    break;
                case 10:
                case 12:
                    objArr[0] = "first";
                    break;
                case 11:
                case 13:
                    objArr[0] = "second";
                    break;
                case 14:
                case 15:
                    objArr[0] = "visibility";
                    break;
                case 16:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
                    break;
                default:
                    objArr[0] = "what";
                    break;
            }
            if (i == 16) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities";
            } else {
                objArr[1] = "toDescriptorVisibility";
            }
            switch (i) {
                case 2:
                case 3:
                    objArr[2] = "isVisibleIgnoringReceiver";
                    break;
                case 4:
                case 5:
                    objArr[2] = "isVisibleWithAnyReceiver";
                    break;
                case 6:
                case 7:
                    objArr[2] = "inSameFile";
                    break;
                case 8:
                case 9:
                    objArr[2] = "findInvisibleMember";
                    break;
                case 10:
                case 11:
                    objArr[2] = "compareLocal";
                    break;
                case 12:
                case 13:
                    objArr[2] = "compare";
                    break;
                case 14:
                    objArr[2] = "isPrivate";
                    break;
                case 15:
                    objArr[2] = "toDescriptorVisibility";
                    break;
                case 16:
                    break;
                default:
                    objArr[2] = "isVisible";
                    break;
            }
            String format = String.format(str, objArr);
            if (i != 16) {
                throw new IllegalStateException(format);
            }
            throw new IllegalArgumentException(format);
        }
        objArr[0] = "from";
        if (i == 16) {
        }
        switch (i) {
        }
        String format2 = String.format(str, objArr);
        if (i != 16) {
        }
    }

    static {
        Set of;
        ModuleVisibilityHelper moduleVisibilityHelper;
        DelegatedDescriptorVisibility delegatedDescriptorVisibility = new DelegatedDescriptorVisibility(Visibilities.Private.INSTANCE) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.1
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                Object[] objArr = new Object[3];
                if (i == 1) {
                    objArr[0] = "what";
                } else if (i != 2) {
                    objArr[0] = "descriptor";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$1";
                if (i == 1 || i == 2) {
                    objArr[2] = "isVisible";
                } else {
                    objArr[2] = "hasContainingSourceFile";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            private boolean hasContainingSourceFile(DeclarationDescriptor declarationDescriptor) {
                if (declarationDescriptor == null) {
                    $$$reportNull$$$0(0);
                }
                if (DescriptorUtils.getContainingSourceFile(declarationDescriptor) == SourceFile.NO_SOURCE_FILE) {
                    return false;
                }
                return true;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptorWithVisibility] */
            /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
            /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
            /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor] */
            @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
            public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z) {
                if (declarationDescriptorWithVisibility == 0) {
                    $$$reportNull$$$0(1);
                }
                if (declarationDescriptor == null) {
                    $$$reportNull$$$0(2);
                }
                if (DescriptorUtils.isTopLevelDeclaration(declarationDescriptorWithVisibility) && hasContainingSourceFile(declarationDescriptor)) {
                    return DescriptorVisibilities.inSameFile(declarationDescriptorWithVisibility, declarationDescriptor);
                }
                if (declarationDescriptorWithVisibility instanceof ConstructorDescriptor) {
                    ClassifierDescriptorWithTypeParameters containingDeclaration = ((ConstructorDescriptor) declarationDescriptorWithVisibility).getContainingDeclaration();
                    if (z && DescriptorUtils.isSealedClass(containingDeclaration) && DescriptorUtils.isTopLevelDeclaration(containingDeclaration) && (declarationDescriptor instanceof ConstructorDescriptor) && DescriptorUtils.isTopLevelDeclaration(declarationDescriptor.getContainingDeclaration()) && DescriptorVisibilities.inSameFile(declarationDescriptorWithVisibility, declarationDescriptor)) {
                        return true;
                    }
                }
                while (declarationDescriptorWithVisibility != 0) {
                    declarationDescriptorWithVisibility = declarationDescriptorWithVisibility.getContainingDeclaration();
                    if (declarationDescriptorWithVisibility instanceof ClassDescriptor) {
                        if (!DescriptorUtils.isCompanionObject(declarationDescriptorWithVisibility)) {
                            break;
                        }
                    }
                    if (declarationDescriptorWithVisibility instanceof PackageFragmentDescriptor) {
                        break;
                    }
                }
                if (declarationDescriptorWithVisibility == 0) {
                    return false;
                }
                while (declarationDescriptor != null) {
                    if (declarationDescriptorWithVisibility == declarationDescriptor) {
                        return true;
                    }
                    if (declarationDescriptor instanceof PackageFragmentDescriptor) {
                        if ((declarationDescriptorWithVisibility instanceof PackageFragmentDescriptor) && declarationDescriptorWithVisibility.getFqName().equals(((PackageFragmentDescriptor) declarationDescriptor).getFqName()) && DescriptorUtils.areInSameModule(declarationDescriptor, declarationDescriptorWithVisibility)) {
                            return true;
                        }
                        return false;
                    }
                    declarationDescriptor = declarationDescriptor.getContainingDeclaration();
                }
                return false;
            }
        };
        PRIVATE = delegatedDescriptorVisibility;
        DelegatedDescriptorVisibility delegatedDescriptorVisibility2 = new DelegatedDescriptorVisibility(Visibilities.PrivateToThis.INSTANCE) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.2
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                Object[] objArr = new Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$2";
                objArr[2] = "isVisible";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
            public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z) {
                DeclarationDescriptor parentOfType;
                if (declarationDescriptorWithVisibility == null) {
                    $$$reportNull$$$0(0);
                }
                if (declarationDescriptor == null) {
                    $$$reportNull$$$0(1);
                }
                if (DescriptorVisibilities.PRIVATE.isVisible(receiverValue, declarationDescriptorWithVisibility, declarationDescriptor, z)) {
                    if (receiverValue == DescriptorVisibilities.ALWAYS_SUITABLE_RECEIVER) {
                        return true;
                    }
                    if (receiverValue != DescriptorVisibilities.IRRELEVANT_RECEIVER && (parentOfType = DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility, ClassDescriptor.class)) != null && (receiverValue instanceof ThisClassReceiver)) {
                        return ((ThisClassReceiver) receiverValue).getClassDescriptor().getOriginal().equals(parentOfType.getOriginal());
                    }
                }
                return false;
            }
        };
        PRIVATE_TO_THIS = delegatedDescriptorVisibility2;
        DelegatedDescriptorVisibility delegatedDescriptorVisibility3 = new DelegatedDescriptorVisibility(Visibilities.Protected.INSTANCE) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.3
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                Object[] objArr = new Object[3];
                if (i == 1) {
                    objArr[0] = "from";
                } else if (i == 2) {
                    objArr[0] = "whatDeclaration";
                } else if (i != 3) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "fromClass";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$3";
                if (i == 2 || i == 3) {
                    objArr[2] = "doesReceiverFitForProtectedVisibility";
                } else {
                    objArr[2] = "isVisible";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            private boolean doesReceiverFitForProtectedVisibility(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, ClassDescriptor classDescriptor) {
                KotlinType type;
                if (declarationDescriptorWithVisibility == null) {
                    $$$reportNull$$$0(2);
                }
                if (classDescriptor == null) {
                    $$$reportNull$$$0(3);
                }
                if (receiverValue == DescriptorVisibilities.FALSE_IF_PROTECTED) {
                    return false;
                }
                if (!(declarationDescriptorWithVisibility instanceof CallableMemberDescriptor) || (declarationDescriptorWithVisibility instanceof ConstructorDescriptor) || receiverValue == DescriptorVisibilities.ALWAYS_SUITABLE_RECEIVER) {
                    return true;
                }
                if (receiverValue == DescriptorVisibilities.IRRELEVANT_RECEIVER || receiverValue == null) {
                    return false;
                }
                if (receiverValue instanceof SuperCallReceiverValue) {
                    type = ((SuperCallReceiverValue) receiverValue).getThisType();
                } else {
                    type = receiverValue.getType();
                }
                if (!DescriptorUtils.isSubtypeOfClass(type, classDescriptor) && !DynamicTypesKt.isDynamic(type)) {
                    return false;
                }
                return true;
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
            public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z) {
                ClassDescriptor classDescriptor;
                if (declarationDescriptorWithVisibility == null) {
                    $$$reportNull$$$0(0);
                }
                if (declarationDescriptor == null) {
                    $$$reportNull$$$0(1);
                }
                ClassDescriptor classDescriptor2 = (ClassDescriptor) DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility, ClassDescriptor.class);
                ClassDescriptor classDescriptor3 = (ClassDescriptor) DescriptorUtils.getParentOfType(declarationDescriptor, ClassDescriptor.class, false);
                if (classDescriptor3 == null) {
                    return false;
                }
                if (classDescriptor2 != null && DescriptorUtils.isCompanionObject(classDescriptor2) && (classDescriptor = (ClassDescriptor) DescriptorUtils.getParentOfType(classDescriptor2, ClassDescriptor.class)) != null && DescriptorUtils.isSubclass(classDescriptor3, classDescriptor)) {
                    return true;
                }
                DeclarationDescriptorWithVisibility unwrapFakeOverrideToAnyDeclaration = DescriptorUtils.unwrapFakeOverrideToAnyDeclaration(declarationDescriptorWithVisibility);
                ClassDescriptor classDescriptor4 = (ClassDescriptor) DescriptorUtils.getParentOfType(unwrapFakeOverrideToAnyDeclaration, ClassDescriptor.class);
                if (classDescriptor4 == null) {
                    return false;
                }
                if (DescriptorUtils.isSubclass(classDescriptor3, classDescriptor4) && doesReceiverFitForProtectedVisibility(receiverValue, unwrapFakeOverrideToAnyDeclaration, classDescriptor3)) {
                    return true;
                }
                return isVisible(receiverValue, declarationDescriptorWithVisibility, classDescriptor3.getContainingDeclaration(), z);
            }
        };
        PROTECTED = delegatedDescriptorVisibility3;
        DelegatedDescriptorVisibility delegatedDescriptorVisibility4 = new DelegatedDescriptorVisibility(Visibilities.Internal.INSTANCE) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.4
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                Object[] objArr = new Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$4";
                objArr[2] = "isVisible";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
            public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z) {
                if (declarationDescriptorWithVisibility == null) {
                    $$$reportNull$$$0(0);
                }
                if (declarationDescriptor == null) {
                    $$$reportNull$$$0(1);
                }
                if (!DescriptorUtils.getContainingModule(declarationDescriptor).shouldSeeInternalsOf(DescriptorUtils.getContainingModule(declarationDescriptorWithVisibility))) {
                    return false;
                }
                return DescriptorVisibilities.MODULE_VISIBILITY_HELPER.isInFriendModule(declarationDescriptorWithVisibility, declarationDescriptor);
            }
        };
        INTERNAL = delegatedDescriptorVisibility4;
        DelegatedDescriptorVisibility delegatedDescriptorVisibility5 = new DelegatedDescriptorVisibility(Visibilities.Public.INSTANCE) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.5
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                Object[] objArr = new Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$5";
                objArr[2] = "isVisible";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
            public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z) {
                if (declarationDescriptorWithVisibility == null) {
                    $$$reportNull$$$0(0);
                }
                if (declarationDescriptor == null) {
                    $$$reportNull$$$0(1);
                }
                return true;
            }
        };
        PUBLIC = delegatedDescriptorVisibility5;
        DelegatedDescriptorVisibility delegatedDescriptorVisibility6 = new DelegatedDescriptorVisibility(Visibilities.Local.INSTANCE) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.6
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                Object[] objArr = new Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$6";
                objArr[2] = "isVisible";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
            public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z) {
                if (declarationDescriptorWithVisibility == null) {
                    $$$reportNull$$$0(0);
                }
                if (declarationDescriptor == null) {
                    $$$reportNull$$$0(1);
                }
                throw new IllegalStateException("This method shouldn't be invoked for LOCAL visibility");
            }
        };
        LOCAL = delegatedDescriptorVisibility6;
        DelegatedDescriptorVisibility delegatedDescriptorVisibility7 = new DelegatedDescriptorVisibility(Visibilities.Inherited.INSTANCE) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.7
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                Object[] objArr = new Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$7";
                objArr[2] = "isVisible";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
            public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z) {
                if (declarationDescriptorWithVisibility == null) {
                    $$$reportNull$$$0(0);
                }
                if (declarationDescriptor == null) {
                    $$$reportNull$$$0(1);
                }
                throw new IllegalStateException("Visibility is unknown yet");
            }
        };
        INHERITED = delegatedDescriptorVisibility7;
        DelegatedDescriptorVisibility delegatedDescriptorVisibility8 = new DelegatedDescriptorVisibility(Visibilities.InvisibleFake.INSTANCE) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.8
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                Object[] objArr = new Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$8";
                objArr[2] = "isVisible";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
            public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z) {
                if (declarationDescriptorWithVisibility == null) {
                    $$$reportNull$$$0(0);
                }
                if (declarationDescriptor == null) {
                    $$$reportNull$$$0(1);
                }
                return false;
            }
        };
        INVISIBLE_FAKE = delegatedDescriptorVisibility8;
        DelegatedDescriptorVisibility delegatedDescriptorVisibility9 = new DelegatedDescriptorVisibility(Visibilities.Unknown.INSTANCE) { // from class: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.9
            private static /* synthetic */ void $$$reportNull$$$0(int i) {
                Object[] objArr = new Object[3];
                if (i != 1) {
                    objArr[0] = "what";
                } else {
                    objArr[0] = "from";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities$9";
                objArr[2] = "isVisible";
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility
            public boolean isVisible(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z) {
                if (declarationDescriptorWithVisibility == null) {
                    $$$reportNull$$$0(0);
                }
                if (declarationDescriptor == null) {
                    $$$reportNull$$$0(1);
                }
                return false;
            }
        };
        UNKNOWN = delegatedDescriptorVisibility9;
        of = SetsKt__SetsKt.setOf((Object[]) new DescriptorVisibility[]{delegatedDescriptorVisibility, delegatedDescriptorVisibility2, delegatedDescriptorVisibility4, delegatedDescriptorVisibility6});
        INVISIBLE_FROM_OTHER_MODULES = Collections.unmodifiableSet(of);
        HashMap newHashMapWithExpectedSize = CollectionsKt.newHashMapWithExpectedSize(4);
        newHashMapWithExpectedSize.put(delegatedDescriptorVisibility2, 0);
        newHashMapWithExpectedSize.put(delegatedDescriptorVisibility, 0);
        newHashMapWithExpectedSize.put(delegatedDescriptorVisibility4, 1);
        newHashMapWithExpectedSize.put(delegatedDescriptorVisibility3, 1);
        newHashMapWithExpectedSize.put(delegatedDescriptorVisibility5, 2);
        ORDERED_VISIBILITIES = Collections.unmodifiableMap(newHashMapWithExpectedSize);
        DEFAULT_VISIBILITY = delegatedDescriptorVisibility5;
        IRRELEVANT_RECEIVER = new ReceiverValue() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.10
            @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
            public KotlinType getType() {
                throw new IllegalStateException("This method should not be called");
            }
        };
        ALWAYS_SUITABLE_RECEIVER = new ReceiverValue() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.11
            @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
            public KotlinType getType() {
                throw new IllegalStateException("This method should not be called");
            }
        };
        FALSE_IF_PROTECTED = new ReceiverValue() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities.12
            @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue
            public KotlinType getType() {
                throw new IllegalStateException("This method should not be called");
            }
        };
        Iterator it = ServiceLoader.load(ModuleVisibilityHelper.class, ModuleVisibilityHelper.class.getClassLoader()).iterator();
        if (it.hasNext()) {
            moduleVisibilityHelper = (ModuleVisibilityHelper) it.next();
        } else {
            moduleVisibilityHelper = ModuleVisibilityHelper.EMPTY.INSTANCE;
        }
        MODULE_VISIBILITY_HELPER = moduleVisibilityHelper;
        visibilitiesMapping = new HashMap();
        recordVisibilityMapping(delegatedDescriptorVisibility);
        recordVisibilityMapping(delegatedDescriptorVisibility2);
        recordVisibilityMapping(delegatedDescriptorVisibility3);
        recordVisibilityMapping(delegatedDescriptorVisibility4);
        recordVisibilityMapping(delegatedDescriptorVisibility5);
        recordVisibilityMapping(delegatedDescriptorVisibility6);
        recordVisibilityMapping(delegatedDescriptorVisibility7);
        recordVisibilityMapping(delegatedDescriptorVisibility8);
        recordVisibilityMapping(delegatedDescriptorVisibility9);
    }

    public static Integer compare(DescriptorVisibility descriptorVisibility, DescriptorVisibility descriptorVisibility2) {
        if (descriptorVisibility == null) {
            $$$reportNull$$$0(12);
        }
        if (descriptorVisibility2 == null) {
            $$$reportNull$$$0(13);
        }
        Integer compareTo = descriptorVisibility.compareTo(descriptorVisibility2);
        if (compareTo != null) {
            return compareTo;
        }
        Integer compareTo2 = descriptorVisibility2.compareTo(descriptorVisibility);
        if (compareTo2 != null) {
            return Integer.valueOf(-compareTo2.intValue());
        }
        return null;
    }

    public static DeclarationDescriptorWithVisibility findInvisibleMember(ReceiverValue receiverValue, DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z) {
        DeclarationDescriptorWithVisibility findInvisibleMember;
        if (declarationDescriptorWithVisibility == null) {
            $$$reportNull$$$0(8);
        }
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(9);
        }
        for (DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility2 = (DeclarationDescriptorWithVisibility) declarationDescriptorWithVisibility.getOriginal(); declarationDescriptorWithVisibility2 != null && declarationDescriptorWithVisibility2.getVisibility() != LOCAL; declarationDescriptorWithVisibility2 = (DeclarationDescriptorWithVisibility) DescriptorUtils.getParentOfType(declarationDescriptorWithVisibility2, DeclarationDescriptorWithVisibility.class)) {
            if (!declarationDescriptorWithVisibility2.getVisibility().isVisible(receiverValue, declarationDescriptorWithVisibility2, declarationDescriptor, z)) {
                return declarationDescriptorWithVisibility2;
            }
        }
        if ((declarationDescriptorWithVisibility instanceof TypeAliasConstructorDescriptor) && (findInvisibleMember = findInvisibleMember(receiverValue, ((TypeAliasConstructorDescriptor) declarationDescriptorWithVisibility).getUnderlyingConstructorDescriptor(), declarationDescriptor, z)) != null) {
            return findInvisibleMember;
        }
        return null;
    }

    public static boolean inSameFile(DeclarationDescriptor declarationDescriptor, DeclarationDescriptor declarationDescriptor2) {
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(6);
        }
        if (declarationDescriptor2 == null) {
            $$$reportNull$$$0(7);
        }
        SourceFile containingSourceFile = DescriptorUtils.getContainingSourceFile(declarationDescriptor2);
        if (containingSourceFile != SourceFile.NO_SOURCE_FILE) {
            return containingSourceFile.equals(DescriptorUtils.getContainingSourceFile(declarationDescriptor));
        }
        return false;
    }

    public static boolean isPrivate(DescriptorVisibility descriptorVisibility) {
        if (descriptorVisibility == null) {
            $$$reportNull$$$0(14);
        }
        if (descriptorVisibility != PRIVATE && descriptorVisibility != PRIVATE_TO_THIS) {
            return false;
        }
        return true;
    }

    public static boolean isVisibleIgnoringReceiver(DeclarationDescriptorWithVisibility declarationDescriptorWithVisibility, DeclarationDescriptor declarationDescriptor, boolean z) {
        if (declarationDescriptorWithVisibility == null) {
            $$$reportNull$$$0(2);
        }
        if (declarationDescriptor == null) {
            $$$reportNull$$$0(3);
        }
        if (findInvisibleMember(ALWAYS_SUITABLE_RECEIVER, declarationDescriptorWithVisibility, declarationDescriptor, z) == null) {
            return true;
        }
        return false;
    }

    private static void recordVisibilityMapping(DescriptorVisibility descriptorVisibility) {
        visibilitiesMapping.put(descriptorVisibility.getDelegate(), descriptorVisibility);
    }

    public static DescriptorVisibility toDescriptorVisibility(Visibility visibility) {
        if (visibility == null) {
            $$$reportNull$$$0(15);
        }
        DescriptorVisibility descriptorVisibility = visibilitiesMapping.get(visibility);
        if (descriptorVisibility != null) {
            return descriptorVisibility;
        }
        throw new IllegalArgumentException("Inapplicable visibility: " + visibility);
    }
}

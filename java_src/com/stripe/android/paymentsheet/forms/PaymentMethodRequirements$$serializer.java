package com.stripe.android.paymentsheet.forms;

import java.lang.annotation.Annotation;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.UnknownFieldException;
import p000.InterfaceC44940mB1;
@Metadata(m28433d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002HÖ\u0001R\u0014\u0010\u0012\u001a\u00020\u000f8VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, m28432d2 = {"com/stripe/android/paymentsheet/forms/PaymentMethodRequirements.$serializer", "LmB1;", "Lcom/stripe/android/paymentsheet/forms/PaymentMethodRequirements;", "", "LKj2;", "childSerializers", "()[LKj2;", "LGV0;", "decoder", "deserialize", "Lrb1;", "encoder", "value", "", "serialize", "LMs5;", "getDescriptor", "()LMs5;", "descriptor", "<init>", "()V", "payments-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
/* loaded from: classes7.dex */
public final class PaymentMethodRequirements$$serializer implements InterfaceC44940mB1<PaymentMethodRequirements> {
    public static final int $stable = 0;
    public static final PaymentMethodRequirements$$serializer INSTANCE;
    private static final /* synthetic */ AW3 descriptor;

    static {
        PaymentMethodRequirements$$serializer paymentMethodRequirements$$serializer = new PaymentMethodRequirements$$serializer();
        INSTANCE = paymentMethodRequirements$$serializer;
        AW3 aw3 = new AW3("com.stripe.android.paymentsheet.forms.PaymentMethodRequirements", paymentMethodRequirements$$serializer, 3);
        aw3.m115697k("pi_requirements", false);
        aw3.m115697k("si_requirements", false);
        aw3.m115697k("confirm_pm_from_customer", false);
        descriptor = aw3;
    }

    private PaymentMethodRequirements$$serializer() {
    }

    @Override // p000.InterfaceC44940mB1
    public InterfaceC34036Kj2<?>[] childSerializers() {
        return new InterfaceC34036Kj2[]{C38330b40.m65021p(new C35980Sr2(new QX3(Reflection.getOrCreateKotlinClass(PIRequirement.class), new Annotation[0]))), C38330b40.m65021p(new C35980Sr2(new QX3(Reflection.getOrCreateKotlinClass(SIRequirement.class), new Annotation[0]))), C38330b40.m65021p(C9804YY.f45990a)};
    }

    @Override // p000.E01
    public PaymentMethodRequirements deserialize(GV0 decoder) {
        int i;
        Object obj;
        Object obj2;
        Object obj3;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        InterfaceC36230Tt0 mo3298b = decoder.mo3298b(descriptor2);
        Object obj4 = null;
        if (mo3298b.mo3290k()) {
            obj = mo3298b.mo3292i(descriptor2, 0, new C35980Sr2(new QX3(Reflection.getOrCreateKotlinClass(PIRequirement.class), new Annotation[0])), null);
            obj2 = mo3298b.mo3292i(descriptor2, 1, new C35980Sr2(new QX3(Reflection.getOrCreateKotlinClass(SIRequirement.class), new Annotation[0])), null);
            obj3 = mo3298b.mo3292i(descriptor2, 2, C9804YY.f45990a, null);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            Object obj5 = null;
            Object obj6 = null;
            while (z) {
                int mo11843q = mo3298b.mo11843q(descriptor2);
                if (mo11843q == -1) {
                    z = false;
                } else if (mo11843q == 0) {
                    obj4 = mo3298b.mo3292i(descriptor2, 0, new C35980Sr2(new QX3(Reflection.getOrCreateKotlinClass(PIRequirement.class), new Annotation[0])), obj4);
                    i2 |= 1;
                } else if (mo11843q == 1) {
                    obj5 = mo3298b.mo3292i(descriptor2, 1, new C35980Sr2(new QX3(Reflection.getOrCreateKotlinClass(SIRequirement.class), new Annotation[0])), obj5);
                    i2 |= 2;
                } else if (mo11843q != 2) {
                    throw new UnknownFieldException(mo11843q);
                } else {
                    obj6 = mo3298b.mo3292i(descriptor2, 2, C9804YY.f45990a, obj6);
                    i2 |= 4;
                }
            }
            i = i2;
            obj = obj4;
            obj2 = obj5;
            obj3 = obj6;
        }
        mo3298b.mo3300a(descriptor2);
        return new PaymentMethodRequirements(i, (Set) obj, (Set) obj2, (Boolean) obj3, null);
    }

    @Override // p000.InterfaceC34036Kj2, p000.InterfaceC40615et5, p000.E01
    public InterfaceC34588Ms5 getDescriptor() {
        return descriptor;
    }

    @Override // p000.InterfaceC40615et5
    public void serialize(InterfaceC48140rb1 encoder, PaymentMethodRequirements value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC34588Ms5 descriptor2 = getDescriptor();
        InterfaceC36464Ut0 mo1149b = encoder.mo1149b(descriptor2);
        PaymentMethodRequirements.write$Self(value, mo1149b, descriptor2);
        mo1149b.mo1151a(descriptor2);
    }

    @Override // p000.InterfaceC44940mB1
    public InterfaceC34036Kj2<?>[] typeParametersSerializers() {
        return InterfaceC44940mB1.C25934a.m26189a(this);
    }
}

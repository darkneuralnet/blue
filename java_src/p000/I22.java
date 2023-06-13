package p000;

import co.bird.android.model.LegacyRepairType;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002R\u001a\u0010\n\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, m28432d2 = {"LI22;", "LAW3;", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", "m", "Z", "isInline", "()Z", "", "name", "LmB1;", "generatedSerializer", "<init>", "(Ljava/lang/String;LmB1;)V", "kotlinx-serialization-core"}, m28431k = 1, m28430mv = {1, 8, 0})
@PublishedApi
@SourceDebugExtension({"SMAP\nInlineClassDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InlineClassDescriptor.kt\nkotlinx/serialization/internal/InlineClassDescriptor\n+ 2 PluginGeneratedSerialDescriptor.kt\nkotlinx/serialization/internal/PluginGeneratedSerialDescriptorKt\n*L\n1#1,44:1\n111#2,10:45\n*S KotlinDebug\n*F\n+ 1 InlineClassDescriptor.kt\nkotlinx/serialization/internal/InlineClassDescriptor\n*L\n22#1:45,10\n*E\n"})
/* renamed from: I22 */
/* loaded from: classes8.dex */
public final class I22 extends AW3 {

    /* renamed from: m */
    public final boolean f14367m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I22(String name, InterfaceC44940mB1<?> generatedSerializer) {
        super(name, generatedSerializer, 1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(generatedSerializer, "generatedSerializer");
        this.f14367m = true;
    }

    @Override // p000.AW3
    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj instanceof I22) {
            InterfaceC34588Ms5 interfaceC34588Ms5 = (InterfaceC34588Ms5) obj;
            if (Intrinsics.areEqual(mo10456h(), interfaceC34588Ms5.mo10456h())) {
                I22 i22 = (I22) obj;
                if (i22.isInline() && Arrays.equals(m115693o(), i22.m115693o())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && mo10459e() == interfaceC34588Ms5.mo10459e()) {
                    int mo10459e = mo10459e();
                    for (int i = 0; i < mo10459e; i++) {
                        if (Intrinsics.areEqual(mo10460d(i).mo10456h(), interfaceC34588Ms5.mo10460d(i).mo10456h()) && Intrinsics.areEqual(mo10460d(i).getKind(), interfaceC34588Ms5.mo10460d(i).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.AW3
    public int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // p000.AW3, p000.InterfaceC34588Ms5
    public boolean isInline() {
        return this.f14367m;
    }
}

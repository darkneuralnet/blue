package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012"}, m28432d2 = {"LRt0;", "LFt0;", "", "b", "p", "c", "o", "Lbi2;", "Lbi2;", "json", "", DateTokenConverter.CONVERTER_KEY, "I", "level", "LDj2;", "writer", "<init>", "(LDj2;Lbi2;)V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComposers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composers.kt\nkotlinx/serialization/json/internal/ComposerWithPrettyPrint\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n1#2:96\n*E\n"})
/* renamed from: Rt0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C35762Rt0 extends C32954Ft0 {

    /* renamed from: c */
    public final AbstractC38706bi2 f32792c;

    /* renamed from: d */
    public int f32793d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35762Rt0(InterfaceC32398Dj2 writer, AbstractC38706bi2 json) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f32792c = json;
    }

    @Override // p000.C32954Ft0
    /* renamed from: b */
    public void mo86248b() {
        m106323n(true);
        this.f32793d++;
    }

    @Override // p000.C32954Ft0
    /* renamed from: c */
    public void mo86247c() {
        m106323n(false);
        m106325j("\n");
        int i = this.f32793d;
        for (int i2 = 0; i2 < i; i2++) {
            m106325j(this.f32792c.m64102e().m30064j());
        }
    }

    @Override // p000.C32954Ft0
    /* renamed from: o */
    public void mo86246o() {
        m106328e(' ');
    }

    @Override // p000.C32954Ft0
    /* renamed from: p */
    public void mo86245p() {
        this.f32793d--;
    }
}

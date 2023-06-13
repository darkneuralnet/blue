package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\u000b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0006R\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u0011\u0010\u0016\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, m28432d2 = {"La26;", "", "", C17296a.f69688o, "LOs4;", "rect", "", DateTokenConverter.CONVERTER_KEY, "LF16;", "oldValue", "newValue", "f", "e", "b", "LU16;", "LU16;", "textInputService", "LkW3;", "LkW3;", "platformTextInputService", "c", "()Z", "isOpen", "<init>", "(LU16;LkW3;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextInputService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputService.kt\nandroidx/compose/ui/text/input/TextInputSession\n*L\n1#1,289:1\n153#1,5:290\n153#1,5:295\n153#1,5:300\n153#1,5:305\n*S KotlinDebug\n*F\n+ 1 TextInputService.kt\nandroidx/compose/ui/text/input/TextInputSession\n*L\n172#1:290,5\n194#1:295,5\n212#1:300,5\n227#1:305,5\n*E\n"})
/* renamed from: a26  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37723a26 {

    /* renamed from: a */
    public final U16 f49745a;

    /* renamed from: b */
    public final InterfaceC43945kW3 f49746b;

    public C37723a26(U16 textInputService, InterfaceC43945kW3 platformTextInputService) {
        Intrinsics.checkNotNullParameter(textInputService, "textInputService");
        Intrinsics.checkNotNullParameter(platformTextInputService, "platformTextInputService");
        this.f49745a = textInputService;
        this.f49746b = platformTextInputService;
    }

    /* renamed from: a */
    public final void m71963a() {
        this.f49745a.m82103e(this);
    }

    /* renamed from: b */
    public final boolean m71962b() {
        boolean m71961c = m71961c();
        if (m71961c) {
            this.f49746b.mo28879c();
        }
        return m71961c;
    }

    /* renamed from: c */
    public final boolean m71961c() {
        return Intrinsics.areEqual(this.f49745a.m82107a(), this);
    }

    /* renamed from: d */
    public final boolean m71960d(C35055Os4 rect) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        boolean m71961c = m71961c();
        if (m71961c) {
            this.f49746b.mo28878d(rect);
        }
        return m71961c;
    }

    /* renamed from: e */
    public final boolean m71959e() {
        boolean m71961c = m71961c();
        if (m71961c) {
            this.f49746b.mo28877e();
        }
        return m71961c;
    }

    /* renamed from: f */
    public final boolean m71958f(F16 f16, F16 newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        boolean m71961c = m71961c();
        if (m71961c) {
            this.f49746b.mo28880b(f16, newValue);
        }
        return m71961c;
    }
}

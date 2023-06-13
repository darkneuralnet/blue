package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B4\u0012\u0006\u0010\u0015\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b\u0012\u0019\b\u0002\u0010!\u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001d¢\u0006\u0002\b ¢\u0006\u0004\b\"\u0010#J\u0016\u0010\u0006\u001a\u00020\u0000*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006$"}, m28432d2 = {"Lc10;", "LSE3;", "LT42;", "Lg01;", "", "parentData", "g", LegacyRepairType.OTHER_KEY, "", "equals", "", "hashCode", "", "toString", "LK9;", "c", "LK9;", C17296a.f69688o, "()LK9;", "setAlignment", "(LK9;)V", "alignment", DateTokenConverter.CONVERTER_KEY, "Z", "b", "()Z", "setMatchParentSize", "(Z)V", "matchParentSize", "Lkotlin/Function1;", "LS42;", "", "Lkotlin/ExtensionFunctionType;", "inspectorInfo", "<init>", "(LK9;ZLkotlin/jvm/functions/Function1;)V", "foundation-layout_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: c10  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38893c10 extends T42 implements SE3 {

    /* renamed from: c */
    public InterfaceC4360K9 f59886c;

    /* renamed from: d */
    public boolean f59887d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38893c10(InterfaceC4360K9 alignment, boolean z, Function1<? super S42, Unit> inspectorInfo) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        this.f59886c = alignment;
        this.f59887d = z;
    }

    /* renamed from: a */
    public final InterfaceC4360K9 m62028a() {
        return this.f59886c;
    }

    /* renamed from: b */
    public final boolean m62027b() {
        return this.f59887d;
    }

    public boolean equals(Object obj) {
        C38893c10 c38893c10;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C38893c10) {
            c38893c10 = (C38893c10) obj;
        } else {
            c38893c10 = null;
        }
        if (c38893c10 == null) {
            return false;
        }
        if (Intrinsics.areEqual(this.f59886c, c38893c10.f59886c) && this.f59887d == c38893c10.f59887d) {
            return true;
        }
        return false;
    }

    @Override // p000.SE3
    /* renamed from: g */
    public C38893c10 mo62029B(InterfaceC41273g01 interfaceC41273g01, Object obj) {
        Intrinsics.checkNotNullParameter(interfaceC41273g01, "<this>");
        return this;
    }

    public int hashCode() {
        return (this.f59886c.hashCode() * 31) + Boolean.hashCode(this.f59887d);
    }

    public String toString() {
        return "BoxChildData(alignment=" + this.f59886c + ", matchParentSize=" + this.f59887d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}

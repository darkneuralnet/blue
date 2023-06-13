package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\t\b\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010\u0003\u001a\u00020\u0002R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u0014\u0010\u000e\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\r\u0082\u0001\u0007\u0016\u0017\u0018\u0019\u001a\u001b\u001c¨\u0006\u001d"}, m28432d2 = {"LQM4;", "LNy;", "", "b", "", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Integer;", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "e", "getNegativeText", "negativeText", "()I", "iconRes", "c", "color", "g", "smallIconRes", "shortTitle", "<init>", "()V", "LTZ1;", "LUZ1;", "LWZ1;", "LXZ1;", "LYZ1;", "LZZ1;", "LRM4;", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: QM4 */
/* loaded from: classes2.dex */
public abstract class QM4 extends AbstractC5751Ny {

    /* renamed from: d */
    public final Integer f30245d;

    /* renamed from: e */
    public final Integer f30246e;

    public /* synthetic */ QM4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return this.f30245d;
    }

    /* renamed from: b */
    public final boolean m88637b() {
        Integer negativeText = getNegativeText();
        return negativeText != null && negativeText.intValue() == C45871nl4.area_state_dialog_secondary_button_end_ride_anyways;
    }

    /* renamed from: c */
    public abstract int mo27708c();

    /* renamed from: d */
    public abstract int mo27707d();

    /* renamed from: e */
    public abstract int mo27706e();

    /* renamed from: g */
    public abstract int mo27705g();

    @Override // p000.AbstractC5751Ny
    public Integer getNegativeText() {
        return this.f30246e;
    }

    private QM4() {
        super(null);
        this.f30245d = Integer.valueOf(C45871nl4.area_state_dialog_primary_button_got_it);
    }
}

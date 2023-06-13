package p000;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"Ltk5;", "Lf9;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", DateTokenConverter.CONVERTER_KEY, "c", "", "b", "", "e", "Ljava/lang/Integer;", C17296a.f69688o, "()Ljava/lang/Integer;", "positiveText", "<init>", "()V", "core-base_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: tk5  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C49419tk5 extends AbstractC20244f9 {

    /* renamed from: d */
    public static final C49419tk5 f110960d = new C49419tk5();

    /* renamed from: e */
    public static final Integer f110961e = Integer.valueOf(C45871nl4.bird_action_capture);

    private C49419tk5() {
        super(null);
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: a */
    public Integer mo3215a() {
        return f110961e;
    }

    @Override // p000.AbstractC20244f9
    /* renamed from: b */
    public List<String> mo11822b(Context context) {
        List<String> listOf;
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.scan_bird_precapture_agreement_content1);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…pture_agreement_content1)");
        String string2 = context.getString(C45871nl4.scan_bird_precapture_agreement_content2);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…pture_agreement_content2)");
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{string, string2});
        return listOf;
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: c */
    public String message(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return "";
    }

    @Override // p000.AbstractC5751Ny
    /* renamed from: d */
    public String title(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(C45871nl4.scan_bird_precapture_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…an_bird_precapture_title)");
        return string;
    }
}

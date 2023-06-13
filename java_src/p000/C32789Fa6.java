package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import ch.qos.logback.core.CoreConstants;
import com.facebook.share.internal.C17296a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\u000e"}, m28432d2 = {"LFa6;", "", "", "LJa6;", "c", C17296a.f69688o, "", "cost", "b", "Landroid/content/Context;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "co.bird.android.feature.tutorial"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Fa6  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32789Fa6 {

    /* renamed from: a */
    public final Context f9735a;

    public C32789Fa6(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f9735a = context;
    }

    /* renamed from: a */
    public final List<C33725Ja6> m106931a() {
        List<C33725Ja6> listOf;
        String string = this.f9735a.getString(C45871nl4.charger_damaged_bird_first_capture_tutorial_step_1_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…re_tutorial_step_1_title)");
        String string2 = this.f9735a.getString(C45871nl4.charger_damaged_bird_first_capture_tutorial_step_1_description);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.stri…orial_step_1_description)");
        String string3 = this.f9735a.getString(C45871nl4.charger_damaged_bird_first_capture_tutorial_step_2_title);
        Intrinsics.checkNotNullExpressionValue(string3, "context.getString(L.stri…re_tutorial_step_2_title)");
        String string4 = this.f9735a.getString(C45871nl4.charger_damaged_bird_first_capture_tutorial_step_2_description);
        Intrinsics.checkNotNullExpressionValue(string4, "context.getString(L.stri…orial_step_2_description)");
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new C33725Ja6[]{new C33725Ja6("https://static.bird.co/charger_damaged_bird_capture_tutorial_step_1.png", null, string, string2, null, 18, null), new C33725Ja6("https://static.bird.co/charger_damaged_bird_capture_tutorial_step_2.png", null, string3, string4, null, 18, null)});
        return listOf;
    }

    /* renamed from: b */
    public final List<C33725Ja6> m106930b(String str) {
        String string;
        List<C33725Ja6> listOf;
        C33725Ja6[] c33725Ja6Arr = new C33725Ja6[3];
        Drawable m94299e = NA0.m94299e(this.f9735a, C48193rg4.illustration_group_ride_tutorial_add_riders);
        String string2 = this.f9735a.getString(C45871nl4.add_additional_rider_title);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.stri…d_additional_rider_title)");
        CharSequence text = this.f9735a.getText(C45871nl4.add_additional_rider_message);
        Intrinsics.checkNotNullExpressionValue(text, "context.getText(L.string…additional_rider_message)");
        c33725Ja6Arr[0] = new C33725Ja6(null, m94299e, string2, text, null, 17, null);
        Drawable m94299e2 = NA0.m94299e(this.f9735a, C48193rg4.illustration_group_ride_tutorial_responsibility);
        String string3 = this.f9735a.getString(C45871nl4.youre_in_charge_flock_title);
        Intrinsics.checkNotNullExpressionValue(string3, "context.getString(L.stri…re_in_charge_flock_title)");
        if (str != null) {
            string = this.f9735a.getString(C45871nl4.youre_in_charge_flock_message, str);
        } else {
            string = this.f9735a.getString(C45871nl4.youre_in_charge_flock_message_no_charge);
        }
        String str2 = string;
        Intrinsics.checkNotNullExpressionValue(str2, "if (cost != null) {\n    …sage_no_charge)\n        }");
        c33725Ja6Arr[1] = new C33725Ja6(null, m94299e2, string3, str2, null, 17, null);
        Drawable m94299e3 = NA0.m94299e(this.f9735a, C48193rg4.illustration_group_ride_tutorial_rules);
        String string4 = this.f9735a.getString(C45871nl4.ride_safe_follow_rules);
        Intrinsics.checkNotNullExpressionValue(string4, "context.getString(L.string.ride_safe_follow_rules)");
        String string5 = this.f9735a.getString(C45871nl4.all_riders_agree_terms);
        Intrinsics.checkNotNullExpressionValue(string5, "context.getString(L.string.all_riders_agree_terms)");
        c33725Ja6Arr[2] = new C33725Ja6(null, m94299e3, string4, string5, null, 17, null);
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) c33725Ja6Arr);
        return listOf;
    }

    /* renamed from: c */
    public final List<C33725Ja6> m106929c() {
        List<C33725Ja6> listOf;
        String string = this.f9735a.getString(C45871nl4.damage_nests_tutorial_step_1_title);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(L.stri…ts_tutorial_step_1_title)");
        String string2 = this.f9735a.getString(C45871nl4.damage_nests_tutorial_step_1_body);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(L.stri…sts_tutorial_step_1_body)");
        String string3 = this.f9735a.getString(C45871nl4.damage_nests_tutorial_step_2_title);
        Intrinsics.checkNotNullExpressionValue(string3, "context.getString(L.stri…ts_tutorial_step_2_title)");
        String string4 = this.f9735a.getString(C45871nl4.damage_nests_tutorial_step_2_body);
        Intrinsics.checkNotNullExpressionValue(string4, "context.getString(L.stri…sts_tutorial_step_2_body)");
        listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new C33725Ja6[]{new C33725Ja6("https://static.bird.co/damage_nest_intro_1.png", null, string, string2, null, 18, null), new C33725Ja6("https://static.bird.co/damage_nest_intro_2.png", null, string3, string4, null, 18, null)});
        return listOf;
    }
}

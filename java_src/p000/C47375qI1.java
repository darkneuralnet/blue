package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.constant.BirdModel;
import co.bird.android.model.wire.WireBird;
import co.bird.android.model.wire.WireDisplayValue;
import com.facebook.share.internal.C17296a;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u001e\u001a\u00020\u001c¢\u0006\u0004\b\"\u0010#J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0007\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0005J\u0012\u0010\u000f\u001a\u00020\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rJ\u0006\u0010\u0010\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014J\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0002R\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010 ¨\u0006$"}, m28432d2 = {"LqI1;", "", "", "LH6;", "sections", "", "b", "c", "g", "i", "j", "m", "f", "", "message", "k", "l", "Lco/bird/android/model/wire/WireBird;", "bird", "e", "Lco/bird/android/model/wire/WireDisplayValue;", "lastTrack", "h", "Lio/reactivex/Observable;", C17296a.f69688o, "", "issueCount", DateTokenConverter.CONVERTER_KEY, "LJ3;", "LJ3;", "healthCheckBinding", "Lbm6;", "Lbm6;", "issuesAdapter", "<init>", "(LJ3;)V", "health-check_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: qI1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C47375qI1 {

    /* renamed from: a */
    public final C3874J3 f105035a;

    /* renamed from: b */
    public final C38750bm6 f105036b;

    public C47375qI1(C3874J3 healthCheckBinding) {
        Intrinsics.checkNotNullParameter(healthCheckBinding, "healthCheckBinding");
        this.f105035a = healthCheckBinding;
        C38750bm6 c38750bm6 = new C38750bm6();
        this.f105036b = c38750bm6;
        RecyclerView recyclerView = healthCheckBinding.f16717o;
        recyclerView.setAdapter(c38750bm6);
        recyclerView.setItemAnimator(new C11894g());
        recyclerView.setLayoutManager(new LinearLayoutManager(healthCheckBinding.getRoot().getContext()));
        recyclerView.addItemDecoration(new C43980ka2());
    }

    public static /* synthetic */ void showScanRetry$default(C47375qI1 c47375qI1, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        c47375qI1.m17680k(str);
    }

    /* renamed from: a */
    public final Observable<Unit> m17690a() {
        Button button = this.f105035a.f16708f;
        Intrinsics.checkNotNullExpressionValue(button, "healthCheckBinding.footerButton");
        return C44626lf5.clicksThrottle$default(button, 0L, 1, null);
    }

    /* renamed from: b */
    public final void m17689b(List<C3023H6> sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f105036b.mo24871u(sections);
        m17687d(this.f105036b.getItemCount());
    }

    /* renamed from: c */
    public final void m17688c() {
        List<C3023H6> emptyList;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        m17689b(emptyList);
        RecyclerView recyclerView = this.f105035a.f16717o;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "healthCheckBinding.issueRecyclerView");
        C49520tu6.m11239l(recyclerView);
        TextView textView = this.f105035a.f16719q;
        Intrinsics.checkNotNullExpressionValue(textView, "healthCheckBinding.noIssuesFoundLabel");
        C49520tu6.m11239l(textView);
    }

    /* renamed from: d */
    public final void m17687d(int i) {
        this.f105035a.f16715m.setText(this.f105035a.f16715m.getContext().getResources().getQuantityString(C37089Xk4.health_check_issues_found_label, i, Integer.valueOf(i)));
    }

    /* renamed from: e */
    public final void m17686e(WireBird bird) {
        Drawable drawable;
        Intrinsics.checkNotNullParameter(bird, "bird");
        TextView textView = this.f105035a.f16706d;
        String code = bird.getCode();
        textView.setText("#" + code);
        ImageView imageView = this.f105035a.f16723u;
        BirdModel fromString = BirdModel.Companion.fromString(bird.getModel());
        if (fromString != null) {
            Context context = this.f105035a.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "healthCheckBinding.root.context");
            drawable = C6327PM.m90445a(fromString, context);
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
    }

    /* renamed from: f */
    public final void m17685f() {
        this.f105035a.f16708f.setText(C45871nl4.common_contact_support);
        this.f105035a.f16709g.setText(C45871nl4.health_check_contact_support_description);
        Group group = this.f105035a.f16711i;
        Intrinsics.checkNotNullExpressionValue(group, "healthCheckBinding.footerGroup");
        C49520tu6.m11233r(group);
        Button button = this.f105035a.f16708f;
        Intrinsics.checkNotNullExpressionValue(button, "healthCheckBinding.footerButton");
        C49520tu6.m11233r(button);
    }

    /* renamed from: g */
    public final void m17684g() {
        ImageView imageView = this.f105035a.f16716n;
        Intrinsics.checkNotNullExpressionValue(imageView, "healthCheckBinding.issueFoundIcon");
        C49520tu6.m11233r(imageView);
        RecyclerView recyclerView = this.f105035a.f16717o;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "healthCheckBinding.issueRecyclerView");
        C49520tu6.m11233r(recyclerView);
        CircularProgressIndicator circularProgressIndicator = this.f105035a.f16721s;
        Intrinsics.checkNotNullExpressionValue(circularProgressIndicator, "healthCheckBinding.progress");
        C49520tu6.m11232s(circularProgressIndicator, false, 4);
        ImageView imageView2 = this.f105035a.f16720r;
        Intrinsics.checkNotNullExpressionValue(imageView2, "healthCheckBinding.noIssuesIcon");
        C49520tu6.m11232s(imageView2, false, 4);
        TextView textView = this.f105035a.f16704b;
        Intrinsics.checkNotNullExpressionValue(textView, "healthCheckBinding.actionDescription");
        C49520tu6.m11239l(textView);
        TextView textView2 = this.f105035a.f16719q;
        Intrinsics.checkNotNullExpressionValue(textView2, "healthCheckBinding.noIssuesFoundLabel");
        C49520tu6.m11239l(textView2);
        Space space = this.f105035a.f16718p;
        Intrinsics.checkNotNullExpressionValue(space, "healthCheckBinding.issueSpace");
        C49520tu6.m11239l(space);
    }

    /* renamed from: h */
    public final void m17683h(WireDisplayValue lastTrack) {
        ForegroundColorSpan foregroundColorSpan;
        Intrinsics.checkNotNullParameter(lastTrack, "lastTrack");
        String title = lastTrack.getTitle();
        String str = title + " " + lastTrack.getDescription();
        SpannableString spannableString = new SpannableString(str);
        Long textColor = lastTrack.getTextColor();
        if (textColor != null) {
            foregroundColorSpan = new ForegroundColorSpan((int) textColor.longValue());
        } else {
            Context context = this.f105035a.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "healthCheckBinding.root.context");
            foregroundColorSpan = new ForegroundColorSpan(C40788fB0.m41776f(context, C32364Df4.black));
        }
        spannableString.setSpan(foregroundColorSpan, title.length(), str.length(), 34);
        this.f105035a.f16705c.setText(spannableString);
        TextView textView = this.f105035a.f16705c;
        Intrinsics.checkNotNullExpressionValue(textView, "healthCheckBinding.actionStatus");
        C49520tu6.m11233r(textView);
    }

    /* renamed from: i */
    public final void m17682i() {
        Group group = this.f105035a.f16711i;
        Intrinsics.checkNotNullExpressionValue(group, "healthCheckBinding.footerGroup");
        C49520tu6.m11239l(group);
        ImageView imageView = this.f105035a.f16720r;
        Intrinsics.checkNotNullExpressionValue(imageView, "healthCheckBinding.noIssuesIcon");
        C49520tu6.m11233r(imageView);
        ImageView imageView2 = this.f105035a.f16716n;
        Intrinsics.checkNotNullExpressionValue(imageView2, "healthCheckBinding.issueFoundIcon");
        C49520tu6.m11232s(imageView2, false, 4);
        CircularProgressIndicator circularProgressIndicator = this.f105035a.f16721s;
        Intrinsics.checkNotNullExpressionValue(circularProgressIndicator, "healthCheckBinding.progress");
        C49520tu6.m11232s(circularProgressIndicator, false, 4);
        TextView textView = this.f105035a.f16704b;
        Intrinsics.checkNotNullExpressionValue(textView, "healthCheckBinding.actionDescription");
        C49520tu6.m11239l(textView);
        RecyclerView recyclerView = this.f105035a.f16717o;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "healthCheckBinding.issueRecyclerView");
        C49520tu6.m11239l(recyclerView);
        Space space = this.f105035a.f16718p;
        Intrinsics.checkNotNullExpressionValue(space, "healthCheckBinding.issueSpace");
        C49520tu6.m11233r(space);
        TextView textView2 = this.f105035a.f16719q;
        Intrinsics.checkNotNullExpressionValue(textView2, "healthCheckBinding.noIssuesFoundLabel");
        C49520tu6.m11233r(textView2);
    }

    /* renamed from: j */
    public final void m17681j() {
        Group group = this.f105035a.f16711i;
        Intrinsics.checkNotNullExpressionValue(group, "healthCheckBinding.footerGroup");
        C49520tu6.m11239l(group);
        this.f105035a.f16721s.m49246u();
        ImageView imageView = this.f105035a.f16716n;
        Intrinsics.checkNotNullExpressionValue(imageView, "healthCheckBinding.issueFoundIcon");
        C49520tu6.m11232s(imageView, false, 4);
        ImageView imageView2 = this.f105035a.f16720r;
        Intrinsics.checkNotNullExpressionValue(imageView2, "healthCheckBinding.noIssuesIcon");
        C49520tu6.m11232s(imageView2, false, 4);
        TextView textView = this.f105035a.f16704b;
        Intrinsics.checkNotNullExpressionValue(textView, "healthCheckBinding.actionDescription");
        C49520tu6.m11239l(textView);
        this.f105035a.f16705c.setText(C45871nl4.health_check_scan_in_progress_status);
        TextView textView2 = this.f105035a.f16705c;
        Intrinsics.checkNotNullExpressionValue(textView2, "healthCheckBinding.actionStatus");
        C49520tu6.m11233r(textView2);
        TextView textView3 = this.f105035a.f16719q;
        Intrinsics.checkNotNullExpressionValue(textView3, "healthCheckBinding.noIssuesFoundLabel");
        C49520tu6.m11239l(textView3);
        RecyclerView recyclerView = this.f105035a.f16717o;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "healthCheckBinding.issueRecyclerView");
        C49520tu6.m11239l(recyclerView);
        Space space = this.f105035a.f16718p;
        Intrinsics.checkNotNullExpressionValue(space, "healthCheckBinding.issueSpace");
        C49520tu6.m11233r(space);
    }

    /* renamed from: k */
    public final void m17680k(String str) {
        TextView textView = this.f105035a.f16705c;
        Intrinsics.checkNotNullExpressionValue(textView, "healthCheckBinding.actionStatus");
        boolean z = false;
        C49520tu6.m11232s(textView, false, 4);
        TextView textView2 = this.f105035a.f16715m;
        Intrinsics.checkNotNullExpressionValue(textView2, "healthCheckBinding.issueCount");
        C49520tu6.m11239l(textView2);
        ImageView imageView = this.f105035a.f16716n;
        Intrinsics.checkNotNullExpressionValue(imageView, "healthCheckBinding.issueFoundIcon");
        C49520tu6.m11233r(imageView);
        CircularProgressIndicator circularProgressIndicator = this.f105035a.f16721s;
        Intrinsics.checkNotNullExpressionValue(circularProgressIndicator, "healthCheckBinding.progress");
        C49520tu6.m11232s(circularProgressIndicator, false, 4);
        ImageView imageView2 = this.f105035a.f16720r;
        Intrinsics.checkNotNullExpressionValue(imageView2, "healthCheckBinding.noIssuesIcon");
        C49520tu6.m11232s(imageView2, false, 4);
        TextView textView3 = this.f105035a.f16719q;
        Intrinsics.checkNotNullExpressionValue(textView3, "healthCheckBinding.noIssuesFoundLabel");
        C49520tu6.m11239l(textView3);
        this.f105035a.f16708f.setText(C45871nl4.health_check_bluetooth_error_button);
        Group group = this.f105035a.f16711i;
        Intrinsics.checkNotNullExpressionValue(group, "healthCheckBinding.footerGroup");
        C49520tu6.m11233r(group);
        Button button = this.f105035a.f16708f;
        Intrinsics.checkNotNullExpressionValue(button, "healthCheckBinding.footerButton");
        C49520tu6.m11233r(button);
        if (!((str == null || str.length() == 0) ? true : true)) {
            this.f105035a.f16709g.setText(str);
        } else {
            this.f105035a.f16709g.setText(C45871nl4.health_check_bluetooth_error_description);
        }
    }

    /* renamed from: l */
    public final void m17679l() {
        this.f105035a.f16708f.setText(C45871nl4.health_check_soft_reset_action_button);
        this.f105035a.f16709g.setText(C45871nl4.health_check_soft_reset_action_description);
        Group group = this.f105035a.f16711i;
        Intrinsics.checkNotNullExpressionValue(group, "healthCheckBinding.footerGroup");
        C49520tu6.m11233r(group);
        Button button = this.f105035a.f16708f;
        Intrinsics.checkNotNullExpressionValue(button, "healthCheckBinding.footerButton");
        C49520tu6.m11233r(button);
    }

    /* renamed from: m */
    public final void m17678m() {
        Group group = this.f105035a.f16711i;
        Intrinsics.checkNotNullExpressionValue(group, "healthCheckBinding.footerGroup");
        C49520tu6.m11232s(group, false, 8);
        this.f105035a.f16721s.m49246u();
        TextView textView = this.f105035a.f16704b;
        Intrinsics.checkNotNullExpressionValue(textView, "healthCheckBinding.actionDescription");
        C49520tu6.m11233r(textView);
        ImageView imageView = this.f105035a.f16716n;
        Intrinsics.checkNotNullExpressionValue(imageView, "healthCheckBinding.issueFoundIcon");
        C49520tu6.m11232s(imageView, false, 4);
        ImageView imageView2 = this.f105035a.f16720r;
        Intrinsics.checkNotNullExpressionValue(imageView2, "healthCheckBinding.noIssuesIcon");
        C49520tu6.m11232s(imageView2, false, 4);
        this.f105035a.f16705c.setText(C45871nl4.health_check_soft_reset_in_progress_status);
        this.f105035a.f16704b.setText(C45871nl4.health_check_time_remaining_description);
        TextView textView2 = this.f105035a.f16719q;
        Intrinsics.checkNotNullExpressionValue(textView2, "healthCheckBinding.noIssuesFoundLabel");
        C49520tu6.m11239l(textView2);
        TextView textView3 = this.f105035a.f16715m;
        Intrinsics.checkNotNullExpressionValue(textView3, "healthCheckBinding.issueCount");
        C49520tu6.m11233r(textView3);
        Space space = this.f105035a.f16718p;
        Intrinsics.checkNotNullExpressionValue(space, "healthCheckBinding.issueSpace");
        C49520tu6.m11233r(space);
    }
}

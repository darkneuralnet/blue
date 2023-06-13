package co.bird.android.feature.birdplus.p011v1.details;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import androidx.appcompat.app.ActionBar;
import androidx.recyclerview.widget.C11894g;
import androidx.recyclerview.widget.LinearLayoutManager;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.buava.Optional;
import co.bird.android.core.mrp.BaseActivityLite;
import co.bird.android.feature.birdplus.p011v1.details.BirdPlusDetailsActivity;
import co.bird.android.model.DialogResponse;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.persistence.BirdPlusDisplayView;
import co.bird.android.model.persistence.BirdPlusSubcriptionPlanTrialView;
import co.bird.android.model.persistence.BirdPlusSubscriptionPlanView;
import co.bird.android.model.persistence.BirdPlusUserSubscriptionView;
import co.bird.android.model.persistence.BirdPlusView;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC24507p;
import io.reactivex.InterfaceC24574u;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.C23454a;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.functions.InterfaceC23494q;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import p000.H31;
import p000.S74;
@Metadata(m28433d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0005HIJ\u001dKB\u0007¢\u0006\u0004\bE\u0010FJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0014J\"\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0017H\u0016J\u000e\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0017H\u0016R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00106\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\"\u0010;\u001a\u0010\u0012\f\u0012\n 8*\u0004\u0018\u00010\u00180\u0018078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\"\u0010?\u001a\u0010\u0012\f\u0012\n 8*\u0004\u0018\u00010\u00050\u00050<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\"\u0010A\u001a\u0010\u0012\f\u0012\n 8*\u0004\u0018\u00010\u00050\u00050<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010>R.\u0010D\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u001f 8*\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010B0B0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010>¨\u0006L"}, m28432d2 = {"Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity;", "Lco/bird/android/core/mrp/BaseActivityLite;", "Lco/bird/android/feature/birdplus/v1/details/b;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "LtQ;", TransferTable.COLUMN_STATE, "Y", "Lio/reactivex/Observable;", "Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$a;", "z3", "e0", "b1", "g0", DateTokenConverter.CONVERTER_KEY, "c0", "", "s9", "Lco/bird/android/model/persistence/BirdPlusView;", "z7", "Lco/bird/android/feature/birdplus/v1/details/a;", "j", "Lco/bird/android/feature/birdplus/v1/details/a;", "X", "()Lco/bird/android/feature/birdplus/v1/details/a;", "setPresenter", "(Lco/bird/android/feature/birdplus/v1/details/a;)V", "presenter", "La3;", "k", "La3;", "binding", "LHP;", "l", "LHP;", "converter", "LGP;", "m", "LGP;", "adapter", "LAG;", "kotlin.jvm.PlatformType", "n", "LAG;", "birdPlusIdentifierRelay", "Lma4;", "o", "Lma4;", "paymentSuccessRelay", "p", "infoClicksRelay", "Lco/bird/android/buava/Optional;", "q", "purchaseEventRelay", "<init>", "()V", "r", C17296a.f69688o, "b", "c", "e", "bird-plus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBirdPlusDetailsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BirdPlusDetailsActivity.kt\nco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,198:1\n1#2:199\n*E\n"})
/* renamed from: co.bird.android.feature.birdplus.v1.details.BirdPlusDetailsActivity */
/* loaded from: classes3.dex */
public final class BirdPlusDetailsActivity extends BaseActivityLite implements InterfaceC14581b {

    /* renamed from: r */
    public static final C14526c f63280r = new C14526c(null);

    /* renamed from: s */
    public static final Set<Integer> f63281s;

    /* renamed from: j */
    public C14537a f63282j;

    /* renamed from: k */
    public C10552a3 f63283k;

    /* renamed from: l */
    public final C3138HP f63284l = new C3138HP();

    /* renamed from: m */
    public final C2836GP f63285m = new C2836GP();

    /* renamed from: n */
    public final C0058AG<InterfaceC14524a> f63286n;

    /* renamed from: o */
    public final C45168ma4<Unit> f63287o;

    /* renamed from: p */
    public final C45168ma4<Unit> f63288p;

    /* renamed from: q */
    public final C45168ma4<Optional<String>> f63289q;

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, m28432d2 = {"Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$a;", "", "", "getValue", "()Ljava/lang/String;", "value", "Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$b;", "Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$d;", "Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$e;", "bird-plus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.birdplus.v1.details.BirdPlusDetailsActivity$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC14524a {
        String getValue();
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0011\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0004J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0088\u0001\u0011\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$b;", "Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$a;", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Ljava/lang/String;", "", "c", "(Ljava/lang/String;)I", "", LegacyRepairType.OTHER_KEY, "", "b", "(Ljava/lang/String;Ljava/lang/Object;)Z", C17296a.f69688o, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "bird-plus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @JvmInline
    /* renamed from: co.bird.android.feature.birdplus.v1.details.BirdPlusDetailsActivity$b */
    /* loaded from: classes3.dex */
    public static final class C14525b implements InterfaceC14524a {

        /* renamed from: a */
        public final String f63290a;

        public /* synthetic */ C14525b(String str) {
            this.f63290a = str;
        }

        /* renamed from: a */
        public static String m58810a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value;
        }

        /* renamed from: b */
        public static boolean m58809b(String str, Object obj) {
            return (obj instanceof C14525b) && Intrinsics.areEqual(str, ((C14525b) obj).m116240unboximpl());
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ C14525b m116239boximpl(String str) {
            return new C14525b(str);
        }

        /* renamed from: c */
        public static int m58808c(String str) {
            return str.hashCode();
        }

        /* renamed from: d */
        public static String m58807d(String str) {
            return "CodenameIdentifier(value=" + str + ")";
        }

        public boolean equals(Object obj) {
            return m58809b(this.f63290a, obj);
        }

        @Override // co.bird.android.feature.birdplus.p011v1.details.BirdPlusDetailsActivity.InterfaceC14524a
        public String getValue() {
            return this.f63290a;
        }

        public int hashCode() {
            return m58808c(this.f63290a);
        }

        public String toString() {
            return m58807d(this.f63290a);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ String m116240unboximpl() {
            return this.f63290a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, m28432d2 = {"Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$c;", "", "", "MENU_INFO_ID", "I", "", "PURCHASE_REQUEST_CODES", "Ljava/util/Set;", "<init>", "()V", "bird-plus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.birdplus.v1.details.BirdPlusDetailsActivity$c */
    /* loaded from: classes3.dex */
    public static final class C14526c {
        public /* synthetic */ C14526c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C14526c() {
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0011\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0004J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0088\u0001\u0011\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$d;", "Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$a;", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Ljava/lang/String;", "", "c", "(Ljava/lang/String;)I", "", LegacyRepairType.OTHER_KEY, "", "b", "(Ljava/lang/String;Ljava/lang/Object;)Z", C17296a.f69688o, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "bird-plus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @JvmInline
    /* renamed from: co.bird.android.feature.birdplus.v1.details.BirdPlusDetailsActivity$d */
    /* loaded from: classes3.dex */
    public static final class C14527d implements InterfaceC14524a {

        /* renamed from: a */
        public final String f63291a;

        public /* synthetic */ C14527d(String str) {
            this.f63291a = str;
        }

        /* renamed from: a */
        public static String m58806a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value;
        }

        /* renamed from: b */
        public static boolean m58805b(String str, Object obj) {
            return (obj instanceof C14527d) && Intrinsics.areEqual(str, ((C14527d) obj).m116242unboximpl());
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ C14527d m116241boximpl(String str) {
            return new C14527d(str);
        }

        /* renamed from: c */
        public static int m58804c(String str) {
            return str.hashCode();
        }

        /* renamed from: d */
        public static String m58803d(String str) {
            return "SubscriptionPlanIdentifier(value=" + str + ")";
        }

        public boolean equals(Object obj) {
            return m58805b(this.f63291a, obj);
        }

        @Override // co.bird.android.feature.birdplus.p011v1.details.BirdPlusDetailsActivity.InterfaceC14524a
        public String getValue() {
            return this.f63291a;
        }

        public int hashCode() {
            return m58804c(this.f63291a);
        }

        public String toString() {
            return m58803d(this.f63291a);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ String m116242unboximpl() {
            return this.f63291a;
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0011\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u0004J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0088\u0001\u0011\u0092\u0001\u00020\u0002ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m28432d2 = {"Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$e;", "Lco/bird/android/feature/birdplus/v1/details/BirdPlusDetailsActivity$a;", "", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Ljava/lang/String;", "", "c", "(Ljava/lang/String;)I", "", LegacyRepairType.OTHER_KEY, "", "b", "(Ljava/lang/String;Ljava/lang/Object;)Z", C17296a.f69688o, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "bird-plus_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @JvmInline
    /* renamed from: co.bird.android.feature.birdplus.v1.details.BirdPlusDetailsActivity$e */
    /* loaded from: classes3.dex */
    public static final class C14528e implements InterfaceC14524a {

        /* renamed from: a */
        public final String f63292a;

        public /* synthetic */ C14528e(String str) {
            this.f63292a = str;
        }

        /* renamed from: a */
        public static String m58802a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return value;
        }

        /* renamed from: b */
        public static boolean m58801b(String str, Object obj) {
            return (obj instanceof C14528e) && Intrinsics.areEqual(str, ((C14528e) obj).m116244unboximpl());
        }

        /* renamed from: box-impl  reason: not valid java name */
        public static final /* synthetic */ C14528e m116243boximpl(String str) {
            return new C14528e(str);
        }

        /* renamed from: c */
        public static int m58800c(String str) {
            return str.hashCode();
        }

        /* renamed from: d */
        public static String m58799d(String str) {
            return "UserSubscriptionIdentifier(value=" + str + ")";
        }

        public boolean equals(Object obj) {
            return m58801b(this.f63292a, obj);
        }

        @Override // co.bird.android.feature.birdplus.p011v1.details.BirdPlusDetailsActivity.InterfaceC14524a
        public String getValue() {
            return this.f63292a;
        }

        public int hashCode() {
            return m58800c(this.f63292a);
        }

        public String toString() {
            return m58799d(this.f63292a);
        }

        /* renamed from: unbox-impl  reason: not valid java name */
        public final /* synthetic */ String m116244unboximpl() {
            return this.f63292a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.birdplus.v1.details.BirdPlusDetailsActivity$f */
    /* loaded from: classes3.dex */
    public static final class C14529f extends Lambda implements Function1<Unit, InterfaceC24574u<? extends Unit>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.birdplus.v1.details.BirdPlusDetailsActivity$f$a */
        /* loaded from: classes3.dex */
        public static final class C14530a extends Lambda implements Function1<DialogResponse, InterfaceC24574u<? extends Unit>> {

            /* renamed from: g */
            public static final C14530a f63294g = new C14530a();

            public C14530a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC24574u<? extends Unit> invoke(DialogResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                if (response == DialogResponse.CANCEL) {
                    return AbstractC24507p.m32068G(Unit.INSTANCE);
                }
                return AbstractC24507p.m32024u();
            }
        }

        public C14529f() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC24574u m58796c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends Unit> invoke(Unit it) {
            AbstractC5751Ny abstractC5751Ny;
            Intrinsics.checkNotNullParameter(it, "it");
            C48955sx4 m58990F = BirdPlusDetailsActivity.this.m58990F();
            C10552a3 c10552a3 = BirdPlusDetailsActivity.this.f63283k;
            Boolean bool = null;
            if (c10552a3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                c10552a3 = null;
            }
            Object tag = c10552a3.f49750c.getTag();
            if (tag instanceof Boolean) {
                bool = (Boolean) tag;
            }
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                abstractC5751Ny = C27595qP.f105262d;
            } else {
                abstractC5751Ny = C26490nP.f99896d;
            }
            AbstractC23442F birdDialog$default = H31.C3014a.birdDialog$default(m58990F, abstractC5751Ny, false, false, 6, null);
            final C14530a c14530a = C14530a.f63294g;
            return birdDialog$default.m33163C(new InterfaceC23492o() { // from class: CP
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u m58796c;
                    m58796c = BirdPlusDetailsActivity.C14529f.m58796c(Function1.this, obj);
                    return m58796c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"Lco/bird/android/buava/Optional;", "", "kotlin.jvm.PlatformType", "it", C17296a.f69688o, "(Lco/bird/android/buava/Optional;)Ljava/lang/String;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.birdplus.v1.details.BirdPlusDetailsActivity$g */
    /* loaded from: classes3.dex */
    public static final class C14531g extends Lambda implements Function1<Optional<String>, String> {

        /* renamed from: g */
        public static final C14531g f63295g = new C14531g();

        public C14531g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final String invoke(Optional<String> optional) {
            return optional.m59035e();
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a*\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000 \u0003*\u0014\u0012\u000e\b\u0001\u0012\n \u0003*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.birdplus.v1.details.BirdPlusDetailsActivity$h */
    /* loaded from: classes3.dex */
    public static final class C14532h extends Lambda implements Function1<Unit, InterfaceC24574u<? extends Unit>> {

        @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "Lio/reactivex/u;", "", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.birdplus.v1.details.BirdPlusDetailsActivity$h$a */
        /* loaded from: classes3.dex */
        public static final class C14533a extends Lambda implements Function1<DialogResponse, InterfaceC24574u<? extends Unit>> {

            /* renamed from: g */
            public static final C14533a f63297g = new C14533a();

            public C14533a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final InterfaceC24574u<? extends Unit> invoke(DialogResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                if (response == DialogResponse.OK) {
                    return AbstractC24507p.m32068G(Unit.INSTANCE);
                }
                return AbstractC24507p.m32024u();
            }
        }

        public C14532h() {
            super(1);
        }

        /* renamed from: c */
        public static final InterfaceC24574u m58791c(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return (InterfaceC24574u) tmp0.invoke(obj);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends Unit> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23442F birdDialog$default = H31.C3014a.birdDialog$default(BirdPlusDetailsActivity.this.m58990F(), C7827TQ.f35433d, false, false, 6, null);
            final C14533a c14533a = C14533a.f63297g;
            return birdDialog$default.m33163C(new InterfaceC23492o() { // from class: DP
                @Override // io.reactivex.functions.InterfaceC23492o
                public final Object apply(Object obj) {
                    InterfaceC24574u m58791c;
                    m58791c = BirdPlusDetailsActivity.C14532h.m58791c(Function1.this, obj);
                    return m58791c;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"", "it", "Lio/reactivex/u;", "Lco/bird/android/model/DialogResponse;", "kotlin.jvm.PlatformType", "b", "(Lkotlin/Unit;)Lio/reactivex/u;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.birdplus.v1.details.BirdPlusDetailsActivity$i */
    /* loaded from: classes3.dex */
    public static final class C14534i extends Lambda implements Function1<Unit, InterfaceC24574u<? extends DialogResponse>> {

        @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "response", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0})
        /* renamed from: co.bird.android.feature.birdplus.v1.details.BirdPlusDetailsActivity$i$a */
        /* loaded from: classes3.dex */
        public static final class C14535a extends Lambda implements Function1<DialogResponse, Boolean> {

            /* renamed from: g */
            public static final C14535a f63299g = new C14535a();

            public C14535a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a */
            public final Boolean invoke(DialogResponse response) {
                boolean z;
                Intrinsics.checkNotNullParameter(response, "response");
                if (response == DialogResponse.OK) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }

        public C14534i() {
            super(1);
        }

        public static final boolean invoke$lambda$0(Function1 tmp0, Object obj) {
            Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
            return ((Boolean) tmp0.invoke(obj)).booleanValue();
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public final InterfaceC24574u<? extends DialogResponse> invoke(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AbstractC23442F birdDialog$default = H31.C3014a.birdDialog$default(BirdPlusDetailsActivity.this.m58990F(), GV4.f12003d, false, false, 6, null);
            final C14535a c14535a = C14535a.f63299g;
            return birdDialog$default.m33098z(new InterfaceC23494q() { // from class: EP
                @Override // io.reactivex.functions.InterfaceC23494q
                public final boolean test(Object obj) {
                    boolean invoke$lambda$0;
                    invoke$lambda$0 = BirdPlusDetailsActivity.C14534i.invoke$lambda$0(Function1.this, obj);
                    return invoke$lambda$0;
                }
            });
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lco/bird/android/model/DialogResponse;", "it", "", C17296a.f69688o, "(Lco/bird/android/model/DialogResponse;)V"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: co.bird.android.feature.birdplus.v1.details.BirdPlusDetailsActivity$j */
    /* loaded from: classes3.dex */
    public static final class C14536j extends Lambda implements Function1<DialogResponse, Unit> {

        /* renamed from: g */
        public static final C14536j f63300g = new C14536j();

        public C14536j() {
            super(1);
        }

        /* renamed from: a */
        public final void m58786a(DialogResponse it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DialogResponse dialogResponse) {
            m58786a(dialogResponse);
            return Unit.INSTANCE;
        }
    }

    static {
        Set<Integer> of;
        of = SetsKt__SetsKt.setOf((Object[]) new Integer[]{10046, 10030});
        f63281s = of;
    }

    public BirdPlusDetailsActivity() {
        C0058AG<InterfaceC14524a> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<BirdPlusViewIdentifier>()");
        this.f63286n = m115951g;
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f63287o = m25409g;
        C45168ma4<Unit> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<Unit>()");
        this.f63288p = m25409g2;
        C45168ma4<Optional<String>> m25409g3 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g3, "create<Optional<String>>()");
        this.f63289q = m25409g3;
    }

    /* renamed from: U */
    public static final InterfaceC24574u m58816U(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: Z */
    public static final InterfaceC24574u m58813Z(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: b0 */
    public static final InterfaceC24574u m58812b0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC24574u) tmp0.invoke(obj);
    }

    /* renamed from: d0 */
    public static final Unit m58811d0(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Unit) tmp0.invoke(obj);
    }

    /* renamed from: X */
    public final C14537a m58815X() {
        C14537a c14537a = this.f63282j;
        if (c14537a != null) {
            return c14537a;
        }
        Intrinsics.throwUninitializedPropertyAccessException("presenter");
        return null;
    }

    @Override // p000.InterfaceC48362rx4
    /* renamed from: Y */
    public void render(C28698tQ state) {
        boolean z;
        C28698tQ c28698tQ;
        String string;
        boolean z2;
        BirdPlusSubcriptionPlanTrialView birdPlusSubcriptionPlanTrialView;
        boolean z3;
        BirdPlusUserSubscriptionView userSubscription;
        String id;
        BirdPlusUserSubscriptionView userSubscription2;
        List<C3023H6> m103917a;
        String str;
        BirdPlusSubscriptionPlanView subscriptionPlan;
        BirdPlusDisplayView display;
        Intrinsics.checkNotNullParameter(state, "state");
        boolean z4 = false;
        String str2 = null;
        S74.C7343a.showProgress$default(m58990F(), state.m12406f(), 0, 2, null);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            BirdPlusView m12410b = state.m12410b();
            if (m12410b != null && (subscriptionPlan = m12410b.getSubscriptionPlan()) != null && (display = subscriptionPlan.getDisplay()) != null) {
                str = display.getPlanName();
            } else {
                str = null;
            }
            supportActionBar.mo70242E(str);
        }
        if (state.m12410b() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c28698tQ = state;
        } else {
            c28698tQ = null;
        }
        if (c28698tQ != null && (m103917a = this.f63284l.m103917a(c28698tQ)) != null) {
            this.f63285m.mo24871u(m103917a);
        }
        C10552a3 c10552a3 = this.f63283k;
        if (c10552a3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c10552a3 = null;
        }
        Button button = c10552a3.f49753f;
        if (state.m12409c()) {
            string = getString(C45871nl4.renew_membership);
        } else if (state.m12408d()) {
            string = getString(C45871nl4.start_free_trial_now);
        } else {
            string = getString(C45871nl4.subscribe);
        }
        button.setText(string);
        C10552a3 c10552a32 = this.f63283k;
        if (c10552a32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c10552a32 = null;
        }
        c10552a32.f49753f.setEnabled(state.m12401k());
        C10552a3 c10552a33 = this.f63283k;
        if (c10552a33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c10552a33 = null;
        }
        Button button2 = c10552a33.f49753f;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.subscribe");
        if (!state.m12403i() && !state.m12409c() && !state.m12408d()) {
            z2 = false;
        } else {
            z2 = true;
        }
        C49520tu6.show$default(button2, z2, 0, 2, null);
        C10552a3 c10552a34 = this.f63283k;
        if (c10552a34 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c10552a34 = null;
        }
        Button button3 = c10552a34.f49750c;
        Intrinsics.checkNotNullExpressionValue(button3, "binding.cancel");
        C49520tu6.show$default(button3, state.m12404h(), 0, 2, null);
        C10552a3 c10552a35 = this.f63283k;
        if (c10552a35 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c10552a35 = null;
        }
        Button button4 = c10552a35.f49750c;
        BirdPlusView m12410b2 = state.m12410b();
        if (m12410b2 != null && (userSubscription2 = m12410b2.getUserSubscription()) != null) {
            birdPlusSubcriptionPlanTrialView = userSubscription2.getTrial();
        } else {
            birdPlusSubcriptionPlanTrialView = null;
        }
        if (birdPlusSubcriptionPlanTrialView != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        button4.setTag(Boolean.valueOf(z3));
        C10552a3 c10552a36 = this.f63283k;
        if (c10552a36 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c10552a36 = null;
        }
        Button button5 = c10552a36.f49754g;
        Intrinsics.checkNotNullExpressionValue(button5, "binding.transfer");
        C49520tu6.show$default(button5, state.m12402j(), 0, 2, null);
        Throwable m12407e = state.m12407e();
        if (m12407e != null) {
            C38689bg5.m64178c(m58990F(), m12407e);
        }
        C45168ma4<Optional<String>> c45168ma4 = this.f63289q;
        Optional.C14443a c14443a = Optional.f63040c;
        BirdPlusView m12410b3 = state.m12410b();
        if (m12410b3 != null && (userSubscription = m12410b3.getUserSubscription()) != null && (id = userSubscription.getId()) != null) {
            if (!state.m12406f() && state.m12405g()) {
                z4 = true;
            }
            if (z4) {
                str2 = id;
            }
        }
        c45168ma4.accept(c14443a.m59033b(str2));
    }

    @Override // co.bird.android.feature.birdplus.p011v1.details.InterfaceC14581b
    /* renamed from: b1 */
    public Observable<Unit> mo58692b1() {
        Observable<Unit> hide = this.f63287o.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "paymentSuccessRelay.hide()");
        return hide;
    }

    @Override // co.bird.android.feature.birdplus.p011v1.details.InterfaceC14581b
    /* renamed from: c0 */
    public Observable<Unit> mo58691c0() {
        C10552a3 c10552a3 = this.f63283k;
        if (c10552a3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c10552a3 = null;
        }
        Button button = c10552a3.f49754g;
        Intrinsics.checkNotNullExpressionValue(button, "binding.transfer");
        Observable observeOn = C44626lf5.clicksThrottle$default(button, 0L, 1, null).observeOn(C23454a.m33087a());
        final C14534i c14534i = new C14534i();
        Observable flatMapMaybe = observeOn.flatMapMaybe(new InterfaceC23492o() { // from class: AP
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m58812b0;
                m58812b0 = BirdPlusDetailsActivity.m58812b0(Function1.this, obj);
                return m58812b0;
            }
        });
        final C14536j c14536j = C14536j.f63300g;
        Observable<Unit> map = flatMapMaybe.map(new InterfaceC23492o() { // from class: BP
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                Unit m58811d0;
                m58811d0 = BirdPlusDetailsActivity.m58811d0(Function1.this, obj);
                return m58811d0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "override fun transferCli…}\n      .map { Unit }\n  }");
        return map;
    }

    @Override // co.bird.android.feature.birdplus.p011v1.details.InterfaceC14581b
    /* renamed from: d */
    public Observable<Unit> mo58690d() {
        C10552a3 c10552a3 = this.f63283k;
        if (c10552a3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c10552a3 = null;
        }
        Button button = c10552a3.f49750c;
        Intrinsics.checkNotNullExpressionValue(button, "binding.cancel");
        Observable observeOn = C44626lf5.clicksThrottle$default(button, 0L, 1, null).observeOn(C23454a.m33087a());
        final C14529f c14529f = new C14529f();
        Observable<Unit> flatMapMaybe = observeOn.flatMapMaybe(new InterfaceC23492o() { // from class: zP
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m58816U;
                m58816U = BirdPlusDetailsActivity.m58816U(Function1.this, obj);
                return m58816U;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "override fun cancelClick…}\n          }\n      }\n  }");
        return flatMapMaybe;
    }

    @Override // co.bird.android.feature.birdplus.p011v1.details.InterfaceC14581b
    /* renamed from: e0 */
    public Observable<Unit> mo58689e0() {
        C10552a3 c10552a3 = this.f63283k;
        if (c10552a3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c10552a3 = null;
        }
        Button button = c10552a3.f49753f;
        Intrinsics.checkNotNullExpressionValue(button, "binding.subscribe");
        Observable observeOn = C44626lf5.clicksThrottle$default(button, 0L, 1, null).observeOn(C23454a.m33087a());
        final C14532h c14532h = new C14532h();
        Observable<Unit> flatMapMaybe = observeOn.flatMapMaybe(new InterfaceC23492o() { // from class: yP
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC24574u m58813Z;
                m58813Z = BirdPlusDetailsActivity.m58813Z(Function1.this, obj);
                return m58813Z;
            }
        });
        Intrinsics.checkNotNullExpressionValue(flatMapMaybe, "override fun subscribeCl…        }\n        }\n    }");
        return flatMapMaybe;
    }

    @Override // co.bird.android.feature.birdplus.p011v1.details.InterfaceC14581b
    /* renamed from: g0 */
    public Observable<Unit> mo58688g0() {
        Observable<Unit> hide = this.f63288p.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "infoClicksRelay.hide()");
        return hide;
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (f63281s.contains(Integer.valueOf(i)) && i2 == -1) {
            this.f63287o.accept(Unit.INSTANCE);
        }
    }

    @Override // co.bird.android.core.mrp.BaseActivityLite, co.bird.android.core.base.BaseCoreActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean isBlank;
        boolean isBlank2;
        boolean isBlank3;
        super.onCreate(bundle);
        C10552a3 m71954c = C10552a3.m71954c(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m71954c, "inflate(layoutInflater)");
        this.f63283k = m71954c;
        String str = null;
        if (m71954c == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            m71954c = null;
        }
        setContentView(m71954c.getRoot());
        C38453bH0.m64729a().mo14236a(m58989H()).mo14239a(this);
        C10552a3 c10552a3 = this.f63283k;
        if (c10552a3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c10552a3 = null;
        }
        c10552a3.f49752e.setAdapter(this.f63285m);
        C10552a3 c10552a32 = this.f63283k;
        if (c10552a32 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c10552a32 = null;
        }
        c10552a32.f49752e.setLayoutManager(new LinearLayoutManager(this));
        C10552a3 c10552a33 = this.f63283k;
        if (c10552a33 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            c10552a33 = null;
        }
        c10552a33.f49752e.setItemAnimator(new C11894g());
        m58815X().consume(this);
        String stringExtra = getIntent().getStringExtra("bird_plus_user_subscription_id");
        if (stringExtra != null) {
            isBlank3 = StringsKt__StringsJVMKt.isBlank(stringExtra);
            if (!(!isBlank3)) {
                stringExtra = null;
            }
            if (stringExtra != null) {
                this.f63286n.accept(C14528e.m116243boximpl(C14528e.m58802a(stringExtra)));
                return;
            }
        }
        String stringExtra2 = getIntent().getStringExtra("bird_plus_subscription_plan_id");
        if (stringExtra2 != null) {
            isBlank2 = StringsKt__StringsJVMKt.isBlank(stringExtra2);
            if (!(!isBlank2)) {
                stringExtra2 = null;
            }
            if (stringExtra2 != null) {
                this.f63286n.accept(C14527d.m116241boximpl(C14527d.m58806a(stringExtra2)));
                return;
            }
        }
        String stringExtra3 = getIntent().getStringExtra("bird_plus_codename");
        if (stringExtra3 != null) {
            isBlank = StringsKt__StringsJVMKt.isBlank(stringExtra3);
            if (!isBlank) {
                str = stringExtra3;
            }
            if (str != null) {
                this.f63286n.accept(C14525b.m116239boximpl(C14525b.m58810a(str)));
            }
        }
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        menu.add(0, 0, 0, getString(C45871nl4.general_info));
        MenuItem findItem = menu.findItem(0);
        findItem.setIcon(C48193rg4.ic_info);
        findItem.setShowAsAction(2);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // co.bird.android.core.base.BaseCoreActivity, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == 0) {
            this.f63288p.accept(Unit.INSTANCE);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // co.bird.android.feature.birdplus.p011v1.details.InterfaceC14581b
    /* renamed from: s9 */
    public Observable<String> mo58687s9() {
        Observable<Optional<String>> distinctUntilChanged = this.f63289q.hide().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(distinctUntilChanged, "purchaseEventRelay\n    .…  .distinctUntilChanged()");
        return C37279Yf5.m74575T(distinctUntilChanged, C14531g.f63295g);
    }

    @Override // co.bird.android.feature.birdplus.p011v1.details.InterfaceC14581b
    /* renamed from: z3 */
    public Observable<InterfaceC14524a> mo58686z3() {
        Observable<InterfaceC14524a> hide = this.f63286n.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "birdPlusIdentifierRelay.hide()");
        return hide;
    }

    @Override // co.bird.android.feature.birdplus.p011v1.details.InterfaceC14581b
    /* renamed from: z7 */
    public Observable<BirdPlusView> mo58685z7() {
        return this.f63285m.m105145z7();
    }
}

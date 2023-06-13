package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import co.bird.android.model.wire.WireBenefit;
import com.facebook.share.internal.C17296a;
import com.google.android.material.tabs.TabLayout;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.CompletableSubscribeProxy;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C32541Dz1;
@Metadata(m28433d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004D\u0018\u001d B\u0007¢\u0006\u0004\bB\u0010CJ\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0010\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\bH\u0016J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u0012\u001a\u00020\u0006H\u0002J\u0018\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\bH\u0002J\b\u0010\u0016\u001a\u00020\u0006H\u0002R!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR!\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u00178FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR*\u0010+\u001a\u00020#2\u0006\u0010$\u001a\u00020#8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R*\u00103\u001a\u00020,2\u0006\u0010$\u001a\u00020,8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u0004048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\"\u0010;\u001a\u0010\u0012\f\u0012\n 8*\u0004\u0018\u00010\b0\b078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\"\u0010?\u001a\u0010\u0012\f\u0012\n 8*\u0004\u0018\u00010\u00060\u00060<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\"\u0010A\u001a\u0010\u0012\f\u0012\n 8*\u0004\u0018\u00010\u00060\u00060<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010>¨\u0006E"}, m28432d2 = {"LDz1;", "Landroidx/recyclerview/widget/RecyclerView$h;", "LDz1$d;", "", "LDz1$a;", "benefits", "", "A", "", "position", "getItemViewType", "Landroid/view/ViewGroup;", "parent", "layoutId", "y", "getItemCount", "holder", "x", "w", "prevCount", "newCount", "u", "v", "Lio/reactivex/Observable;", "b", "Lkotlin/Lazy;", "r", "()Lio/reactivex/Observable;", "selectedTab", "c", "o", "faqClicks", DateTokenConverter.CONVERTER_KEY, "t", "termsClicks", "LDz1$c;", "value", "e", "LDz1$c;", "q", "()LDz1$c;", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "(LDz1$c;)V", "header", "LDz1$b;", "f", "LDz1$b;", "p", "()LDz1$b;", "B", "(LDz1$b;)V", "footer", "", "g", "Ljava/util/List;", "LAG;", "kotlin.jvm.PlatformType", "h", "LAG;", "selectedTabRelay", "Lma4;", "i", "Lma4;", "faqClicksRelay", "j", "termsClicksRelay", "<init>", "()V", C17296a.f69688o, "frequent-flyer_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Dz1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C32541Dz1 extends RecyclerView.AbstractC11843h<AbstractC1682d> {

    /* renamed from: b */
    public final Lazy f6667b;

    /* renamed from: c */
    public final Lazy f6668c;

    /* renamed from: d */
    public final Lazy f6669d;

    /* renamed from: e */
    public C1681c f6670e;

    /* renamed from: f */
    public C1680b f6671f;

    /* renamed from: g */
    public final List<C1679a> f6672g;

    /* renamed from: h */
    public final C0058AG<Integer> f6673h;

    /* renamed from: i */
    public final C45168ma4<Unit> f6674i;

    /* renamed from: j */
    public final C45168ma4<Unit> f6675j;

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0015"}, m28432d2 = {"LDz1$a;", "", "", "tier", "Lco/bird/android/model/wire/WireBenefit;", "benefit", C17296a.f69688o, "", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "I", "c", "()I", "b", "Lco/bird/android/model/wire/WireBenefit;", "()Lco/bird/android/model/wire/WireBenefit;", "<init>", "(ILco/bird/android/model/wire/WireBenefit;)V", "frequent-flyer_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Dz1$a */
    /* loaded from: classes3.dex */
    public static final class C1679a {

        /* renamed from: a */
        public final int f6676a;

        /* renamed from: b */
        public final WireBenefit f6677b;

        public C1679a(int i, WireBenefit benefit) {
            Intrinsics.checkNotNullParameter(benefit, "benefit");
            this.f6676a = i;
            this.f6677b = benefit;
        }

        public static /* synthetic */ C1679a copy$default(C1679a c1679a, int i, WireBenefit wireBenefit, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = c1679a.f6676a;
            }
            if ((i2 & 2) != 0) {
                wireBenefit = c1679a.f6677b;
            }
            return c1679a.m109547a(i, wireBenefit);
        }

        /* renamed from: a */
        public final C1679a m109547a(int i, WireBenefit benefit) {
            Intrinsics.checkNotNullParameter(benefit, "benefit");
            return new C1679a(i, benefit);
        }

        /* renamed from: b */
        public final WireBenefit m109546b() {
            return this.f6677b;
        }

        /* renamed from: c */
        public final int m109545c() {
            return this.f6676a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1679a) {
                C1679a c1679a = (C1679a) obj;
                return this.f6676a == c1679a.f6676a && Intrinsics.areEqual(this.f6677b, c1679a.f6677b);
            }
            return false;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f6676a) * 31) + this.f6677b.hashCode();
        }

        public String toString() {
            int i = this.f6676a;
            WireBenefit wireBenefit = this.f6677b;
            return "BenefitRow(tier=" + i + ", benefit=" + wireBenefit + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013J(\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, m28432d2 = {"LDz1$b;", "", "", "faqArticleId", "termsArticleId", C17296a.f69688o, "(Ljava/lang/Long;Ljava/lang/Long;)LDz1$b;", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "c", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;)V", "frequent-flyer_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Dz1$b */
    /* loaded from: classes3.dex */
    public static final class C1680b {

        /* renamed from: a */
        public final Long f6678a;

        /* renamed from: b */
        public final Long f6679b;

        public C1680b(Long l, Long l2) {
            this.f6678a = l;
            this.f6679b = l2;
        }

        public static /* synthetic */ C1680b copy$default(C1680b c1680b, Long l, Long l2, int i, Object obj) {
            if ((i & 1) != 0) {
                l = c1680b.f6678a;
            }
            if ((i & 2) != 0) {
                l2 = c1680b.f6679b;
            }
            return c1680b.m109544a(l, l2);
        }

        /* renamed from: a */
        public final C1680b m109544a(Long l, Long l2) {
            return new C1680b(l, l2);
        }

        /* renamed from: b */
        public final Long m109543b() {
            return this.f6678a;
        }

        /* renamed from: c */
        public final Long m109542c() {
            return this.f6679b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1680b) {
                C1680b c1680b = (C1680b) obj;
                return Intrinsics.areEqual(this.f6678a, c1680b.f6678a) && Intrinsics.areEqual(this.f6679b, c1680b.f6679b);
            }
            return false;
        }

        public int hashCode() {
            Long l = this.f6678a;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            Long l2 = this.f6679b;
            return hashCode + (l2 != null ? l2.hashCode() : 0);
        }

        public String toString() {
            Long l = this.f6678a;
            Long l2 = this.f6679b;
            return "Footer(faqArticleId=" + l + ", termsArticleId=" + l2 + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJB\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000b\u001a\u00020\u0004HÖ\u0001J\t\u0010\f\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001e"}, m28432d2 = {"LDz1$c;", "", "", "level", "", "headline", "", "tabs", "selectedTabIndex", C17296a.f69688o, "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;I)LDz1$c;", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "Ljava/util/List;", "e", "()Ljava/util/List;", DateTokenConverter.CONVERTER_KEY, "I", "()I", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;I)V", "frequent-flyer_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Dz1$c */
    /* loaded from: classes3.dex */
    public static final class C1681c {

        /* renamed from: a */
        public final Integer f6680a;

        /* renamed from: b */
        public final String f6681b;

        /* renamed from: c */
        public final List<String> f6682c;

        /* renamed from: d */
        public final int f6683d;

        public C1681c(Integer num, String str, List<String> tabs, int i) {
            Intrinsics.checkNotNullParameter(tabs, "tabs");
            this.f6680a = num;
            this.f6681b = str;
            this.f6682c = tabs;
            this.f6683d = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C1681c copy$default(C1681c c1681c, Integer num, String str, List list, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                num = c1681c.f6680a;
            }
            if ((i2 & 2) != 0) {
                str = c1681c.f6681b;
            }
            if ((i2 & 4) != 0) {
                list = c1681c.f6682c;
            }
            if ((i2 & 8) != 0) {
                i = c1681c.f6683d;
            }
            return c1681c.m109541a(num, str, list, i);
        }

        /* renamed from: a */
        public final C1681c m109541a(Integer num, String str, List<String> tabs, int i) {
            Intrinsics.checkNotNullParameter(tabs, "tabs");
            return new C1681c(num, str, tabs, i);
        }

        /* renamed from: b */
        public final String m109540b() {
            return this.f6681b;
        }

        /* renamed from: c */
        public final Integer m109539c() {
            return this.f6680a;
        }

        /* renamed from: d */
        public final int m109538d() {
            return this.f6683d;
        }

        /* renamed from: e */
        public final List<String> m109537e() {
            return this.f6682c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1681c) {
                C1681c c1681c = (C1681c) obj;
                return Intrinsics.areEqual(this.f6680a, c1681c.f6680a) && Intrinsics.areEqual(this.f6681b, c1681c.f6681b) && Intrinsics.areEqual(this.f6682c, c1681c.f6682c) && this.f6683d == c1681c.f6683d;
            }
            return false;
        }

        public int hashCode() {
            Integer num = this.f6680a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            String str = this.f6681b;
            return ((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f6682c.hashCode()) * 31) + Integer.hashCode(this.f6683d);
        }

        public String toString() {
            Integer num = this.f6680a;
            String str = this.f6681b;
            List<String> list = this.f6682c;
            int i = this.f6683d;
            return "Header(level=" + num + ", headline=" + str + ", tabs=" + list + ", selectedTabIndex=" + i + ")";
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, m28432d2 = {"LDz1$d;", "LQq;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", C17296a.f69688o, "b", "c", "LDz1$d$a;", "LDz1$d$b;", "LDz1$d$c;", "frequent-flyer_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: Dz1$d */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC1682d extends AbstractC6913Qq {

        @Metadata(m28433d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\n\u001a\u00020\t*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002R\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0013"}, m28432d2 = {"LDz1$d$a;", "LDz1$d;", "LDz1$a;", "benefitRow", "", "q", "", "", "locked", "Landroid/graphics/drawable/Drawable;", "r", "Lfc2;", "e", "Lfc2;", "binding", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "frequent-flyer_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: Dz1$d$a */
        /* loaded from: classes3.dex */
        public static final class C1683a extends AbstractC1682d {

            /* renamed from: e */
            public final C41035fc2 f6684e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1683a(View view) {
                super(view, null);
                Intrinsics.checkNotNullParameter(view, "view");
                C41035fc2 m41118a = C41035fc2.m41118a(view);
                Intrinsics.checkNotNullExpressionValue(m41118a, "bind(view)");
                this.f6684e = m41118a;
            }

            /* renamed from: q */
            public final void m109536q(C1679a benefitRow) {
                Intrinsics.checkNotNullParameter(benefitRow, "benefitRow");
                this.f6684e.f80355b.setImageDrawable(m109535r(benefitRow.m109545c(), !benefitRow.m109546b().getUnlocked()));
                this.f6684e.f80357d.setText(benefitRow.m109546b().getTitle());
                this.f6684e.f80356c.setText(benefitRow.m109546b().getDescription());
            }

            /* renamed from: r */
            public final Drawable m109535r(int i, boolean z) {
                int i2;
                int i3;
                if (i != 0) {
                    if (i != 1) {
                        Context m16904a = C47712qr6.m16904a(this);
                        if (z) {
                            i3 = C48193rg4.ic_yellow_badge_locked;
                        } else {
                            i3 = C48193rg4.ic_yellow_badge;
                        }
                        return C40788fB0.m41773i(m16904a, i3);
                    }
                    Context m16904a2 = C47712qr6.m16904a(this);
                    if (z) {
                        i2 = C48193rg4.ic_blue_badge_locked;
                    } else {
                        i2 = C48193rg4.ic_blue_badge;
                    }
                    return C40788fB0.m41773i(m16904a2, i2);
                }
                return C40788fB0.m41773i(C47712qr6.m16904a(this), C48193rg4.ic_green_badge);
            }
        }

        @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u0011"}, m28432d2 = {"LDz1$d$b;", "LDz1$d;", "LDz1$b;", "footer", "", "v", "Lgc2;", "e", "Lgc2;", "binding", "Landroid/view/View;", "view", "LZt4;", "faqClicksRelay", "termsClicksRelay", "<init>", "(Landroid/view/View;LZt4;LZt4;)V", "frequent-flyer_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        /* renamed from: Dz1$d$b */
        /* loaded from: classes3.dex */
        public static final class C1684b extends AbstractC1682d {

            /* renamed from: e */
            public final C41628gc2 f6685e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1684b(View view, final AbstractC37638Zt4<Unit> faqClicksRelay, final AbstractC37638Zt4<Unit> termsClicksRelay) {
                super(view, null);
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(faqClicksRelay, "faqClicksRelay");
                Intrinsics.checkNotNullParameter(termsClicksRelay, "termsClicksRelay");
                C41628gc2 m37980a = C41628gc2.m37980a(view);
                Intrinsics.checkNotNullExpressionValue(m37980a, "bind(view)");
                this.f6685e = m37980a;
                m37980a.f83943b.setOnClickListener(new View.OnClickListener() { // from class: Ez1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C32541Dz1.AbstractC1682d.C1684b.m109532t(AbstractC37638Zt4.this, view2);
                    }
                });
                m37980a.f83944c.setOnClickListener(new View.OnClickListener() { // from class: Fz1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        C32541Dz1.AbstractC1682d.C1684b.m109531u(AbstractC37638Zt4.this, view2);
                    }
                });
            }

            /* renamed from: t */
            public static final void m109532t(AbstractC37638Zt4 faqClicksRelay, View view) {
                Intrinsics.checkNotNullParameter(faqClicksRelay, "$faqClicksRelay");
                faqClicksRelay.accept(Unit.INSTANCE);
            }

            /* renamed from: u */
            public static final void m109531u(AbstractC37638Zt4 termsClicksRelay, View view) {
                Intrinsics.checkNotNullParameter(termsClicksRelay, "$termsClicksRelay");
                termsClicksRelay.accept(Unit.INSTANCE);
            }

            /* renamed from: v */
            public final void m109530v(C1680b footer) {
                boolean z;
                Intrinsics.checkNotNullParameter(footer, "footer");
                TextView textView = this.f6685e.f83943b;
                Intrinsics.checkNotNullExpressionValue(textView, "binding.faq");
                boolean z2 = true;
                if (footer.m109543b() != null) {
                    z = true;
                } else {
                    z = false;
                }
                C49520tu6.show$default(textView, z, 0, 2, null);
                TextView textView2 = this.f6685e.f83944c;
                Intrinsics.checkNotNullExpressionValue(textView2, "binding.terms");
                if (footer.m109542c() == null) {
                    z2 = false;
                }
                C49520tu6.show$default(textView2, z2, 0, 2, null);
            }
        }

        @Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b!\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006#"}, m28432d2 = {"LDz1$d$c;", "LDz1$d;", "LDz1$c;", "header", "", "q", "Lcom/google/android/material/tabs/TabLayout$g;", "tab", "", "selected", "u", "LAG;", "", "e", "LAG;", "selectedTabRelay", "Lhc2;", "f", "Lhc2;", "binding", "g", "Lkotlin/Lazy;", "r", "()I", "selectedTabColor", "h", "t", "unselectedTabColor", "i", "Z", "shouldUpdateSelectedTabRelay", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;LAG;)V", "frequent-flyer_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nFrequentFlyerAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FrequentFlyerAdapter.kt\nco/bird/android/feature/frequentFlyer/adapter/FrequentFlyerAdapter$ViewHolder$HeaderViewHolder\n+ 2 KotlinExtensions.kt\ncom/uber/autodispose/KotlinExtensions\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,234:1\n237#2:235\n1864#3,3:236\n*S KotlinDebug\n*F\n+ 1 FrequentFlyerAdapter.kt\nco/bird/android/feature/frequentFlyer/adapter/FrequentFlyerAdapter$ViewHolder$HeaderViewHolder\n*L\n158#1:235\n179#1:236,3\n*E\n"})
        /* renamed from: Dz1$d$c */
        /* loaded from: classes3.dex */
        public static final class C1685c extends AbstractC1682d {

            /* renamed from: e */
            public final C0058AG<Integer> f6686e;

            /* renamed from: f */
            public final C42221hc2 f6687f;

            /* renamed from: g */
            public final Lazy f6688g;

            /* renamed from: h */
            public final Lazy f6689h;

            /* renamed from: i */
            public boolean f6690i;

            @Metadata(m28433d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, m28432d2 = {"Dz1$d$c$a", "Lcom/google/android/material/tabs/TabLayout$d;", "Lcom/google/android/material/tabs/TabLayout$g;", "tab", "", C17296a.f69688o, "b", "c", "frequent-flyer_release"}, m28431k = 1, m28430mv = {1, 8, 0})
            /* renamed from: Dz1$d$c$a */
            /* loaded from: classes3.dex */
            public static final class C1686a implements TabLayout.InterfaceC17906d {
                public C1686a() {
                }

                @Override // com.google.android.material.tabs.TabLayout.InterfaceC17905c
                /* renamed from: a */
                public void mo20905a(TabLayout.C17910g tab) {
                    Intrinsics.checkNotNullParameter(tab, "tab");
                    C1685c.this.m109526u(tab, true);
                    if (C1685c.this.f6690i) {
                        C1685c.this.f6686e.accept(Integer.valueOf(tab.m48716g()));
                    }
                }

                @Override // com.google.android.material.tabs.TabLayout.InterfaceC17905c
                /* renamed from: b */
                public void mo20904b(TabLayout.C17910g tab) {
                    Intrinsics.checkNotNullParameter(tab, "tab");
                    C1685c.this.m109526u(tab, false);
                }

                @Override // com.google.android.material.tabs.TabLayout.InterfaceC17905c
                /* renamed from: c */
                public void mo20903c(TabLayout.C17910g tab) {
                    Intrinsics.checkNotNullParameter(tab, "tab");
                }
            }

            @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: Dz1$d$c$b */
            /* loaded from: classes3.dex */
            public static final class C1687b extends Lambda implements Function0<Integer> {
                public C1687b() {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Integer invoke() {
                    Context context = C1685c.this.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                    return Integer.valueOf(C40788fB0.m41776f(context, C32364Df4.birdNewRoad));
                }
            }

            @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28432d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
            /* renamed from: Dz1$d$c$c */
            /* loaded from: classes3.dex */
            public static final class C1688c extends Lambda implements Function0<Integer> {
                public C1688c() {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Integer invoke() {
                    Context context = C1685c.this.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                    return Integer.valueOf(C40788fB0.m41776f(context, C32364Df4.darkGray));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1685c(View view, C0058AG<Integer> selectedTabRelay) {
                super(view, null);
                Lazy lazy;
                Lazy lazy2;
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(selectedTabRelay, "selectedTabRelay");
                this.f6686e = selectedTabRelay;
                C42221hc2 m36164a = C42221hc2.m36164a(view);
                Intrinsics.checkNotNullExpressionValue(m36164a, "bind(view)");
                this.f6687f = m36164a;
                lazy = LazyKt__LazyJVMKt.lazy(new C1687b());
                this.f6688g = lazy;
                lazy2 = LazyKt__LazyJVMKt.lazy(new C1688c());
                this.f6689h = lazy2;
                this.f6690i = true;
                m36164a.f85606d.m48782h(new C1686a());
            }

            /* renamed from: q */
            public final void m109529q(C1681c header) {
                TextView textView;
                Intrinsics.checkNotNullParameter(header, "header");
                Integer m109539c = header.m109539c();
                if (m109539c != null) {
                    Object m33041n = this.f6687f.f85604b.m58128G(m109539c.intValue()).m33041n(AutoDispose.m45239a(this));
                    Intrinsics.checkExpressionValueIsNotNull(m33041n, "this.`as`(AutoDispose.au…isposable<Any>(provider))");
                    ((CompletableSubscribeProxy) m33041n).subscribe();
                }
                TextView textView2 = this.f6687f.f85605c;
                Intrinsics.checkNotNullExpressionValue(textView2, "binding.mainMessage");
                C49520tu6.setTextAndVisibility$default(textView2, header.m109540b(), 0, 2, null);
                this.f6690i = false;
                while (this.f6687f.f85606d.m48813E() > header.m109537e().size()) {
                    TabLayout tabLayout = this.f6687f.f85606d;
                    tabLayout.m48800R(tabLayout.m48813E() - 1);
                }
                int size = header.m109537e().size() - this.f6687f.f85606d.m48813E();
                for (int i = 0; i < size; i++) {
                    TabLayout.C17910g mo48806L = this.f6687f.f85606d.mo48806L();
                    Intrinsics.checkNotNullExpressionValue(mo48806L, "binding.tabs.newTab()");
                    Context context = this.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "itemView.context");
                    mo48806L.m48708o(C40788fB0.m41762t(context, C39922dj4.view_tab_frequent_flyer, null));
                    this.f6687f.f85606d.m48781i(mo48806L);
                }
                this.f6690i = true;
                int i2 = 0;
                for (Object obj : header.m109537e()) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    String str = (String) obj;
                    TabLayout.C17910g m48814D = this.f6687f.f85606d.m48814D(i2);
                    if (m48814D != null) {
                        Intrinsics.checkNotNullExpressionValue(m48814D, "binding.tabs.getTabAt(in… ?: return@forEachIndexed");
                        View m48718e = m48814D.m48718e();
                        if (m48718e instanceof TextView) {
                            textView = (TextView) m48718e;
                        } else {
                            textView = null;
                        }
                        if (textView != null) {
                            textView.setText(str);
                        }
                        m109526u(m48814D, false);
                    }
                    i2 = i3;
                }
                TabLayout tabLayout2 = this.f6687f.f85606d;
                Integer value = this.f6686e.getValue();
                if (value == null) {
                    value = 0;
                }
                TabLayout.C17910g m48814D2 = tabLayout2.m48814D(value.intValue());
                if (m48814D2 != null) {
                    m48814D2.m48711l();
                }
            }

            /* renamed from: r */
            public final int m109528r() {
                return ((Number) this.f6688g.getValue()).intValue();
            }

            /* renamed from: t */
            public final int m109527t() {
                return ((Number) this.f6689h.getValue()).intValue();
            }

            /* renamed from: u */
            public final void m109526u(TabLayout.C17910g c17910g, boolean z) {
                int m109527t;
                TextView textView;
                if (z) {
                    m109527t = m109528r();
                } else {
                    m109527t = m109527t();
                }
                View m48718e = c17910g.m48718e();
                if (m48718e instanceof TextView) {
                    textView = (TextView) m48718e;
                } else {
                    textView = null;
                }
                if (textView != null) {
                    textView.setTextColor(m109527t);
                }
            }
        }

        public /* synthetic */ AbstractC1682d(View view, DefaultConstructorMarker defaultConstructorMarker) {
            this(view);
        }

        public AbstractC1682d(View view) {
            super(view);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Dz1$e */
    /* loaded from: classes3.dex */
    public static final class C1689e extends Lambda implements Function0<Observable<Unit>> {
        public C1689e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Unit> invoke() {
            return C32541Dz1.this.f6674i.hide();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Dz1$f */
    /* loaded from: classes3.dex */
    public static final class C1690f extends Lambda implements Function0<Observable<Integer>> {
        public C1690f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Integer> invoke() {
            return C32541Dz1.this.f6673h.hide();
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"Lio/reactivex/Observable;", "", "kotlin.jvm.PlatformType", "b", "()Lio/reactivex/Observable;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: Dz1$g */
    /* loaded from: classes3.dex */
    public static final class C1691g extends Lambda implements Function0<Observable<Unit>> {
        public C1691g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final Observable<Unit> invoke() {
            return C32541Dz1.this.f6675j.hide();
        }
    }

    public C32541Dz1() {
        Lazy lazy;
        Lazy lazy2;
        Lazy lazy3;
        List emptyList;
        lazy = LazyKt__LazyJVMKt.lazy(new C1690f());
        this.f6667b = lazy;
        lazy2 = LazyKt__LazyJVMKt.lazy(new C1689e());
        this.f6668c = lazy2;
        lazy3 = LazyKt__LazyJVMKt.lazy(new C1691g());
        this.f6669d = lazy3;
        emptyList = CollectionsKt__CollectionsKt.emptyList();
        this.f6670e = new C1681c(null, null, emptyList, 0);
        this.f6671f = new C1680b(null, null);
        this.f6672g = new ArrayList();
        C0058AG<Integer> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<Int>()");
        this.f6673h = m115951g;
        C45168ma4<Unit> m25409g = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g, "create<Unit>()");
        this.f6674i = m25409g;
        C45168ma4<Unit> m25409g2 = C45168ma4.m25409g();
        Intrinsics.checkNotNullExpressionValue(m25409g2, "create<Unit>()");
        this.f6675j = m25409g2;
    }

    /* renamed from: A */
    public final void m109560A(List<C1679a> benefits) {
        Intrinsics.checkNotNullParameter(benefits, "benefits");
        int size = this.f6672g.size();
        this.f6672g.clear();
        this.f6672g.addAll(benefits);
        m109552u(size, this.f6672g.size());
    }

    /* renamed from: B */
    public final void m109559B(C1680b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f6671f = value;
        m109551v();
    }

    /* renamed from: C */
    public final void m109558C(C1681c value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f6670e = value;
        this.f6673h.accept(Integer.valueOf(value.m109538d()));
        m109550w();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemCount() {
        return this.f6672g.size() + 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    public int getItemViewType(int i) {
        if (i == 0) {
            return C39922dj4.item_frequent_flyer_header;
        }
        if (i == getItemCount() - 1) {
            return C39922dj4.item_frequent_flyer_footer;
        }
        return C39922dj4.item_frequent_flyer_benefit;
    }

    /* renamed from: o */
    public final Observable<Unit> m109557o() {
        Object value = this.f6668c.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-faqClicks>(...)");
        return (Observable) value;
    }

    /* renamed from: p */
    public final C1680b m109556p() {
        return this.f6671f;
    }

    /* renamed from: q */
    public final C1681c m109555q() {
        return this.f6670e;
    }

    /* renamed from: r */
    public final Observable<Integer> m109554r() {
        Object value = this.f6667b.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-selectedTab>(...)");
        return (Observable) value;
    }

    /* renamed from: t */
    public final Observable<Unit> m109553t() {
        Object value = this.f6669d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "<get-termsClicks>(...)");
        return (Observable) value;
    }

    /* renamed from: u */
    public final void m109552u(int i, int i2) {
        int min = Math.min(i, i2);
        if (i2 > i) {
            notifyItemRangeInserted(min + 1, i2 - i);
        } else if (i2 < i) {
            notifyItemRangeRemoved(min + 1, i - i2);
        }
        notifyItemRangeChanged(1, min);
    }

    /* renamed from: v */
    public final void m109551v() {
        notifyItemChanged(getItemCount() - 1);
    }

    /* renamed from: w */
    public final void m109550w() {
        notifyItemChanged(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: x */
    public void onBindViewHolder(AbstractC1682d holder, int i) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (holder instanceof AbstractC1682d.C1685c) {
            ((AbstractC1682d.C1685c) holder).m109529q(this.f6670e);
        } else if (holder instanceof AbstractC1682d.C1684b) {
            ((AbstractC1682d.C1684b) holder).m109530v(this.f6671f);
        } else if (holder instanceof AbstractC1682d.C1683a) {
            ((AbstractC1682d.C1683a) holder).m109536q(this.f6672g.get(i - 1));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        MA6.m95614a(Unit.INSTANCE);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC11843h
    /* renamed from: y */
    public AbstractC1682d onCreateViewHolder(ViewGroup parent, int i) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "parent.context");
        View m41761u = C40788fB0.m41761u(context, i, parent, false);
        if (i == C39922dj4.item_frequent_flyer_header) {
            return new AbstractC1682d.C1685c(m41761u, this.f6673h);
        }
        if (i == C39922dj4.item_frequent_flyer_footer) {
            return new AbstractC1682d.C1684b(m41761u, this.f6674i, this.f6675j);
        }
        return new AbstractC1682d.C1683a(m41761u);
    }
}

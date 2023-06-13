package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\nB\u0011\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\u0007\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016R\u0017\u0010\u000e\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, m28432d2 = {"LR06;", "", LegacyRepairType.OTHER_KEY, "", DateTokenConverter.CONVERTER_KEY, "", "toString", "equals", "", "hashCode", C17296a.f69688o, "I", "e", "()I", "mask", "<init>", "(I)V", "b", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: R06 */
/* loaded from: classes.dex */
public final class R06 {

    /* renamed from: b */
    public static final C7050a f31395b = new C7050a(null);

    /* renamed from: c */
    public static final R06 f31396c = new R06(0);

    /* renamed from: d */
    public static final R06 f31397d = new R06(1);

    /* renamed from: e */
    public static final R06 f31398e = new R06(2);

    /* renamed from: a */
    public final int f31399a;

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u000bJ\u0014\u0010\u0005\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R \u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR \u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u0007\u0012\u0004\b\u000e\u0010\u000b\u001a\u0004\b\r\u0010\tR \u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0007\u0012\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0010\u0010\t¨\u0006\u0013"}, m28432d2 = {"LR06$a;", "", "", "LR06;", "decorations", C17296a.f69688o, "None", "LR06;", "c", "()LR06;", "getNone$annotations", "()V", "Underline", DateTokenConverter.CONVERTER_KEY, "getUnderline$annotations", "LineThrough", "b", "getLineThrough$annotations", "<init>", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nTextDecoration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextDecoration.kt\nandroidx/compose/ui/text/style/TextDecoration$Companion\n+ 2 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,111:1\n108#2,3:112\n111#2,2:119\n113#2:122\n33#3,4:115\n38#3:121\n*S KotlinDebug\n*F\n+ 1 TextDecoration.kt\nandroidx/compose/ui/text/style/TextDecoration$Companion\n*L\n57#1:112,3\n57#1:119,2\n57#1:122\n57#1:115,4\n57#1:121\n*E\n"})
    /* renamed from: R06$a */
    /* loaded from: classes.dex */
    public static final class C7050a {
        public /* synthetic */ C7050a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final R06 m87430a(List<R06> decorations) {
            Intrinsics.checkNotNullParameter(decorations, "decorations");
            Integer num = 0;
            int size = decorations.size();
            for (int i = 0; i < size; i++) {
                num = Integer.valueOf(num.intValue() | decorations.get(i).m87431e());
            }
            return new R06(num.intValue());
        }

        /* renamed from: b */
        public final R06 m87429b() {
            return R06.f31398e;
        }

        /* renamed from: c */
        public final R06 m87428c() {
            return R06.f31396c;
        }

        /* renamed from: d */
        public final R06 m87427d() {
            return R06.f31397d;
        }

        private C7050a() {
        }
    }

    public R06(int i) {
        this.f31399a = i;
    }

    /* renamed from: d */
    public final boolean m87432d(R06 other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int i = this.f31399a;
        if ((other.f31399a | i) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final int m87431e() {
        return this.f31399a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof R06) && this.f31399a == ((R06) obj).f31399a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f31399a;
    }

    public String toString() {
        if (this.f31399a == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.f31399a & f31397d.f31399a) != 0) {
            arrayList.add("Underline");
        }
        if ((this.f31399a & f31398e.f31399a) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return "TextDecoration[" + C42464i06.m35393d(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}

package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import p000.InterfaceC4360K9;
@Metadata(m28433d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u00002\u00020\u0001B~\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020\u0011\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020&\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00103\u001a\u00020\u0001ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u0014\u0010!\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0013R\u0014\u0010#\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\tR\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\tR\u0014\u0010)\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\tR\u001d\u0010/\u001a\u00020,8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\n\u0004\b-\u0010.R\u0017\u00103\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b\u0012\u00102R\u0017\u00105\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010\t\u001a\u0004\b\u0016\u0010\u000bR\u0017\u00107\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\t\u001a\u0004\b\u001a\u0010\u000bR\u0017\u00109\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u0010\t\u001a\u0004\b\b\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006<"}, m28432d2 = {"LEo2;", "", "", "offset", "layoutWidth", "layoutHeight", "Lxo2;", "f", C17296a.f69688o, "I", "b", "()I", "index", "", "LOU3;", "Ljava/util/List;", "placeables", "", "c", "Z", "isVertical", "LK9$b;", DateTokenConverter.CONVERTER_KEY, "LK9$b;", "horizontalAlignment", "LK9$c;", "e", "LK9$c;", "verticalAlignment", "Lpm2;", "Lpm2;", "layoutDirection", "g", "reverseLayout", "h", "beforeContentPadding", "i", "afterContentPadding", "Lno2;", "j", "Lno2;", "placementAnimator", "k", "spacing", "LA52;", "l", "J", "visualOffset", "m", "Ljava/lang/Object;", "()Ljava/lang/Object;", "key", "n", "size", "o", "sizeWithSpacings", "p", "crossAxisSize", "<init>", "(ILjava/util/List;ZLK9$b;LK9$c;Lpm2;ZIILno2;IJLjava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLazyMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyMeasuredItem\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,193:1\n33#2,6:194\n33#2,6:200\n*S KotlinDebug\n*F\n+ 1 LazyMeasuredItem.kt\nandroidx/compose/foundation/lazy/LazyMeasuredItem\n*L\n72#1:194,6\n93#1:200,6\n*E\n"})
/* renamed from: Eo2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C32677Eo2 {

    /* renamed from: a */
    public final int f8142a;

    /* renamed from: b */
    public final List<OU3> f8143b;

    /* renamed from: c */
    public final boolean f8144c;

    /* renamed from: d */
    public final InterfaceC4360K9.InterfaceC4362b f8145d;

    /* renamed from: e */
    public final InterfaceC4360K9.InterfaceC4363c f8146e;

    /* renamed from: f */
    public final EnumC47065pm2 f8147f;

    /* renamed from: g */
    public final boolean f8148g;

    /* renamed from: h */
    public final int f8149h;

    /* renamed from: i */
    public final int f8150i;

    /* renamed from: j */
    public final C45899no2 f8151j;

    /* renamed from: k */
    public final int f8152k;

    /* renamed from: l */
    public final long f8153l;

    /* renamed from: m */
    public final Object f8154m;

    /* renamed from: n */
    public final int f8155n;

    /* renamed from: o */
    public final int f8156o;

    /* renamed from: p */
    public final int f8157p;

    public /* synthetic */ C32677Eo2(int i, List list, boolean z, InterfaceC4360K9.InterfaceC4362b interfaceC4362b, InterfaceC4360K9.InterfaceC4363c interfaceC4363c, EnumC47065pm2 enumC47065pm2, boolean z2, int i2, int i3, C45899no2 c45899no2, int i4, long j, Object obj, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list, z, interfaceC4362b, interfaceC4363c, enumC47065pm2, z2, i2, i3, c45899no2, i4, j, obj);
    }

    /* renamed from: a */
    public final int m108353a() {
        return this.f8157p;
    }

    /* renamed from: b */
    public final int m108352b() {
        return this.f8142a;
    }

    /* renamed from: c */
    public final Object m108351c() {
        return this.f8154m;
    }

    /* renamed from: d */
    public final int m108350d() {
        return this.f8155n;
    }

    /* renamed from: e */
    public final int m108349e() {
        return this.f8156o;
    }

    /* renamed from: f */
    public final C51827xo2 m108348f(int i, int i2, int i3) {
        int i4;
        long m114704a;
        int m92226i1;
        ArrayList arrayList = new ArrayList();
        if (this.f8144c) {
            i4 = i3;
        } else {
            i4 = i2;
        }
        List<OU3> list = this.f8143b;
        int size = list.size();
        int i5 = i;
        for (int i6 = 0; i6 < size; i6++) {
            OU3 ou3 = list.get(i6);
            if (this.f8144c) {
                InterfaceC4360K9.InterfaceC4362b interfaceC4362b = this.f8145d;
                if (interfaceC4362b != null) {
                    m114704a = B52.m114704a(interfaceC4362b.mo99131a(ou3.m92226i1(), i2, this.f8147f), i5);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                InterfaceC4360K9.InterfaceC4363c interfaceC4363c = this.f8146e;
                if (interfaceC4363c != null) {
                    m114704a = B52.m114704a(i5, interfaceC4363c.mo99130a(ou3.m92229d1(), i3));
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
            if (this.f8144c) {
                m92226i1 = ou3.m92229d1();
            } else {
                m92226i1 = ou3.m92226i1();
            }
            i5 += m92226i1;
            arrayList.add(new C51234wo2(m114704a, ou3, null));
        }
        return new C51827xo2(i, this.f8142a, this.f8154m, this.f8155n, -this.f8149h, i4 + this.f8150i, this.f8144c, arrayList, this.f8151j, this.f8153l, this.f8148g, i4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C32677Eo2(int i, List<? extends OU3> list, boolean z, InterfaceC4360K9.InterfaceC4362b interfaceC4362b, InterfaceC4360K9.InterfaceC4363c interfaceC4363c, EnumC47065pm2 enumC47065pm2, boolean z2, int i2, int i3, C45899no2 c45899no2, int i4, long j, Object obj) {
        int coerceAtLeast;
        this.f8142a = i;
        this.f8143b = list;
        this.f8144c = z;
        this.f8145d = interfaceC4362b;
        this.f8146e = interfaceC4363c;
        this.f8147f = enumC47065pm2;
        this.f8148g = z2;
        this.f8149h = i2;
        this.f8150i = i3;
        this.f8151j = c45899no2;
        this.f8152k = i4;
        this.f8153l = j;
        this.f8154m = obj;
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            OU3 ou3 = (OU3) list.get(i7);
            i5 += this.f8144c ? ou3.m92229d1() : ou3.m92226i1();
            i6 = Math.max(i6, !this.f8144c ? ou3.m92229d1() : ou3.m92226i1());
        }
        this.f8155n = i5;
        coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(i5 + this.f8152k, 0);
        this.f8156o = coerceAtLeast;
        this.f8157p = i6;
    }
}

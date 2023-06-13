package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0005 B[\b\u0000\u0012\u0006\u0010$\u001a\u00020\u000f\u0012\u0016\b\u0002\u0010*\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u0014\u0018\u00010\u0013\u0012\u0016\b\u0002\u0010.\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u0014\u0018\u00010\u0013\u0012\u0018\b\u0002\u0010/\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u0014\u0018\u00010\u0013¢\u0006\u0004\b5\u00106B=\b\u0016\u0012\u0006\u0010$\u001a\u00020\u000f\u0012\u0014\b\u0002\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00140\u0013\u0012\u0014\b\u0002\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00140\u0013¢\u0006\u0004\b5\u00107J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u001b\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0087\u0002J*\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00140\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002J\"\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00140\u00132\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002J\"\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00140\u00132\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002J$\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00140\u00132\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0007J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\r\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u0002H\u0016J\b\u0010\u001f\u001a\u00020\u000fH\u0016R\u0017\u0010$\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R(\u0010*\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u0014\u0018\u00010\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R(\u0010.\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u0014\u0018\u00010\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)R*\u0010/\u001a\u0012\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u001b0\u0014\u0018\u00010\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b \u0010)R\u001d\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00140\u00138F¢\u0006\u0006\u001a\u0004\b0\u0010)R\u001d\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\u00140\u00138F¢\u0006\u0006\u001a\u0004\b,\u0010)R\u0014\u00104\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u00103\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00068"}, m28432d2 = {"LDf;", "", "", "index", "", C17296a.f69688o, "startIndex", "endIndex", "n", "Ls26;", "range", "o", "(J)LDf;", LegacyRepairType.OTHER_KEY, "m", "", "tag", "start", "end", "", "LDf$b;", "i", "h", "LAa6;", "k", "LKf6;", "l", "", "", "equals", "hashCode", "toString", "b", "Ljava/lang/String;", "j", "()Ljava/lang/String;", Entry.TYPE_TEXT, "LGN5;", "c", "Ljava/util/List;", "g", "()Ljava/util/List;", "spanStylesOrNull", "LDE3;", DateTokenConverter.CONVERTER_KEY, "e", "paragraphStylesOrNull", "annotations", "f", "spanStyles", "paragraphStyles", "()I", "length", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 TempListUtils.kt\nandroidx/compose/ui/text/TempListUtilsKt\n*L\n1#1,1126:1\n1045#2:1127\n33#3,6:1128\n33#3,4:1138\n38#3:1144\n101#3,2:1146\n33#3,6:1148\n103#3:1154\n33#3,4:1158\n38#3:1164\n33#3,4:1169\n38#3:1175\n33#3,4:1180\n38#3:1186\n1#4:1134\n35#5,3:1135\n38#5,2:1142\n40#5:1145\n35#5,3:1155\n38#5,2:1162\n40#5:1165\n35#5,3:1166\n38#5,2:1173\n40#5:1176\n35#5,3:1177\n38#5,2:1184\n40#5:1187\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n*L\n86#1:1127\n86#1:1128,6\n159#1:1138,4\n159#1:1144\n167#1:1146,2\n167#1:1148,6\n167#1:1154\n182#1:1158,4\n182#1:1164\n197#1:1169,4\n197#1:1175\n213#1:1180,4\n213#1:1186\n159#1:1135,3\n159#1:1142,2\n159#1:1145\n182#1:1155,3\n182#1:1162,2\n182#1:1165\n197#1:1166,3\n197#1:1173,2\n197#1:1176\n213#1:1177,3\n213#1:1184,2\n213#1:1187\n*E\n"})
/* renamed from: Df */
/* loaded from: classes.dex */
public final class C1577Df implements CharSequence {

    /* renamed from: b */
    public final String f6142b;

    /* renamed from: c */
    public final List<C1580b<GN5>> f6143c;

    /* renamed from: d */
    public final List<C1580b<DE3>> f6144d;

    /* renamed from: e */
    public final List<C1580b<? extends Object>> f6145e;

    @Metadata(m28433d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001aB\u0011\u0012\b\b\u0002\u0010)\u001a\u00020\t¢\u0006\u0004\b*\u0010+B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0010¢\u0006\u0004\b*\u0010,J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u0012\u0010\b\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0016J\"\u0010\f\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0010J\u001e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u001e\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u001e\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ&\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tJ\u0016\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003J\u0006\u0010\u001c\u001a\u00020\u0005J\u0006\u0010\u001d\u001a\u00020\u0010R\u0018\u0010\u0004\u001a\u00060\u001ej\u0002`\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010 R \u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010#R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010#R\"\u0010'\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020&0\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\"\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020&0\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010#¨\u0006-"}, m28432d2 = {"LDf$a;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "", Entry.TYPE_TEXT, "", "i", "", "e", "", "start", "end", "f", "", "char", DateTokenConverter.CONVERTER_KEY, "LDf;", "g", "h", "LGN5;", "style", "c", "LDE3;", "b", "tag", "annotation", C17296a.f69688o, "k", "j", "l", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Ljava/lang/StringBuilder;", "", "LDf$a$a;", "Ljava/util/List;", "spanStyles", "paragraphStyles", "", "annotations", "styleStack", "capacity", "<init>", "(I)V", "(LDf;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1126:1\n33#2,6:1127\n33#2,6:1133\n33#2,6:1139\n33#2,6:1145\n33#2,6:1151\n33#2,6:1157\n151#2,3:1164\n33#2,4:1167\n154#2,2:1171\n38#2:1173\n156#2:1174\n151#2,3:1175\n33#2,4:1178\n154#2,2:1182\n38#2:1184\n156#2:1185\n151#2,3:1186\n33#2,4:1189\n154#2,2:1193\n38#2:1195\n156#2:1196\n1#3:1163\n*S KotlinDebug\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder\n*L\n396#1:1127,6\n399#1:1133,6\n403#1:1139,6\n423#1:1145,6\n426#1:1151,6\n430#1:1157,6\n640#1:1164,3\n640#1:1167,4\n640#1:1171,2\n640#1:1173\n640#1:1174\n643#1:1175,3\n643#1:1178,4\n643#1:1182,2\n643#1:1184\n643#1:1185\n646#1:1186,3\n646#1:1189,4\n646#1:1193,2\n646#1:1195\n646#1:1196\n*E\n"})
    /* renamed from: Df$a */
    /* loaded from: classes.dex */
    public static final class C1578a implements Appendable {

        /* renamed from: b */
        public final StringBuilder f6146b;

        /* renamed from: c */
        public final List<C1579a<GN5>> f6147c;

        /* renamed from: d */
        public final List<C1579a<DE3>> f6148d;

        /* renamed from: e */
        public final List<C1579a<? extends Object>> f6149e;

        /* renamed from: f */
        public final List<C1579a<? extends Object>> f6150f;

        public C1578a() {
            this(0, 1, null);
        }

        /* renamed from: a */
        public final void m110046a(String tag, String annotation, int i, int i2) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(annotation, "annotation");
            this.f6149e.add(new C1579a<>(annotation, i, i2, tag));
        }

        /* renamed from: b */
        public final void m110045b(DE3 style, int i, int i2) {
            Intrinsics.checkNotNullParameter(style, "style");
            this.f6148d.add(new C1579a<>(style, i, i2, null, 8, null));
        }

        /* renamed from: c */
        public final void m110044c(GN5 style, int i, int i2) {
            Intrinsics.checkNotNullParameter(style, "style");
            this.f6147c.add(new C1579a<>(style, i, i2, null, 8, null));
        }

        @Override // java.lang.Appendable
        /* renamed from: d */
        public C1578a append(char c) {
            this.f6146b.append(c);
            return this;
        }

        @Override // java.lang.Appendable
        /* renamed from: e */
        public C1578a append(CharSequence charSequence) {
            if (charSequence instanceof C1577Df) {
                m110040g((C1577Df) charSequence);
            } else {
                this.f6146b.append(charSequence);
            }
            return this;
        }

        @Override // java.lang.Appendable
        /* renamed from: f */
        public C1578a append(CharSequence charSequence, int i, int i2) {
            if (charSequence instanceof C1577Df) {
                m110039h((C1577Df) charSequence, i, i2);
            } else {
                this.f6146b.append(charSequence, i, i2);
            }
            return this;
        }

        /* renamed from: g */
        public final void m110040g(C1577Df text) {
            Intrinsics.checkNotNullParameter(text, "text");
            int length = this.f6146b.length();
            this.f6146b.append(text.m110052j());
            List<C1580b<GN5>> m110055g = text.m110055g();
            if (m110055g != null) {
                int size = m110055g.size();
                for (int i = 0; i < size; i++) {
                    C1580b<GN5> c1580b = m110055g.get(i);
                    m110044c(c1580b.m110028e(), c1580b.m110027f() + length, c1580b.m110029d() + length);
                }
            }
            List<C1580b<DE3>> m110057e = text.m110057e();
            if (m110057e != null) {
                int size2 = m110057e.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C1580b<DE3> c1580b2 = m110057e.get(i2);
                    m110045b(c1580b2.m110028e(), c1580b2.m110027f() + length, c1580b2.m110029d() + length);
                }
            }
            List<C1580b<? extends Object>> m110060b = text.m110060b();
            if (m110060b != null) {
                int size3 = m110060b.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    C1580b<? extends Object> c1580b3 = m110060b.get(i3);
                    this.f6149e.add(new C1579a<>(c1580b3.m110028e(), c1580b3.m110027f() + length, c1580b3.m110029d() + length, c1580b3.m110026g()));
                }
            }
        }

        /* renamed from: h */
        public final void m110039h(C1577Df text, int i, int i2) {
            Intrinsics.checkNotNullParameter(text, "text");
            int length = this.f6146b.length();
            this.f6146b.append((CharSequence) text.m110052j(), i, i2);
            List m108609d = C1921Ef.m108609d(text, i, i2);
            if (m108609d != null) {
                int size = m108609d.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C1580b c1580b = (C1580b) m108609d.get(i3);
                    m110044c((GN5) c1580b.m110028e(), c1580b.m110027f() + length, c1580b.m110029d() + length);
                }
            }
            List m108610c = C1921Ef.m108610c(text, i, i2);
            if (m108610c != null) {
                int size2 = m108610c.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    C1580b c1580b2 = (C1580b) m108610c.get(i4);
                    m110045b((DE3) c1580b2.m110028e(), c1580b2.m110027f() + length, c1580b2.m110029d() + length);
                }
            }
            List m108611b = C1921Ef.m108611b(text, i, i2);
            if (m108611b != null) {
                int size3 = m108611b.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    C1580b c1580b3 = (C1580b) m108611b.get(i5);
                    this.f6149e.add(new C1579a<>(c1580b3.m110028e(), c1580b3.m110027f() + length, c1580b3.m110029d() + length, c1580b3.m110026g()));
                }
            }
        }

        /* renamed from: i */
        public final void m110038i(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f6146b.append(text);
        }

        /* renamed from: j */
        public final void m110037j() {
            if (!this.f6150f.isEmpty()) {
                List<C1579a<? extends Object>> list = this.f6150f;
                list.remove(list.size() - 1).m110034a(this.f6146b.length());
                return;
            }
            throw new IllegalStateException("Nothing to pop.".toString());
        }

        /* renamed from: k */
        public final int m110036k(String tag, String annotation) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(annotation, "annotation");
            C1579a<? extends Object> c1579a = new C1579a<>(annotation, this.f6146b.length(), 0, tag, 4, null);
            this.f6150f.add(c1579a);
            this.f6149e.add(c1579a);
            return this.f6150f.size() - 1;
        }

        /* renamed from: l */
        public final C1577Df m110035l() {
            String sb = this.f6146b.toString();
            Intrinsics.checkNotNullExpressionValue(sb, "text.toString()");
            List<C1579a<GN5>> list = this.f6147c;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(list.get(i).m110033b(this.f6146b.length()));
            }
            ArrayList arrayList2 = null;
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            List<C1579a<DE3>> list2 = this.f6148d;
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList3.add(list2.get(i2).m110033b(this.f6146b.length()));
            }
            if (arrayList3.isEmpty()) {
                arrayList3 = null;
            }
            List<C1579a<? extends Object>> list3 = this.f6149e;
            ArrayList arrayList4 = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                arrayList4.add(list3.get(i3).m110033b(this.f6146b.length()));
            }
            if (!arrayList4.isEmpty()) {
                arrayList2 = arrayList4;
            }
            return new C1577Df(sb, arrayList, arrayList3, arrayList2);
        }

        public C1578a(int i) {
            this.f6146b = new StringBuilder(i);
            this.f6147c = new ArrayList();
            this.f6148d = new ArrayList();
            this.f6149e = new ArrayList();
            this.f6150f = new ArrayList();
        }

        @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B+\u0012\u0006\u0010\u0011\u001a\u00028\u0000\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010 J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\b\b\u0002\u0010\u0004\u001a\u00020\u0003J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\t\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\u0011\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0019\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\r\u0010\u0018R\u0017\u0010\u001e\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, m28432d2 = {"LDf$a$a;", "T", "", "", "defaultEnd", "LDf$b;", "b", "", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Ljava/lang/Object;", "getItem", "()Ljava/lang/Object;", "item", "I", "getStart", "()I", "start", "c", "getEnd", "(I)V", "end", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "tag", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
        @SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Builder$MutableRange\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1126:1\n1#2:1127\n*E\n"})
        /* renamed from: Df$a$a */
        /* loaded from: classes.dex */
        public static final class C1579a<T> {

            /* renamed from: a */
            public final T f6151a;

            /* renamed from: b */
            public final int f6152b;

            /* renamed from: c */
            public int f6153c;

            /* renamed from: d */
            public final String f6154d;

            public C1579a(T t, int i, int i2, String tag) {
                Intrinsics.checkNotNullParameter(tag, "tag");
                this.f6151a = t;
                this.f6152b = i;
                this.f6153c = i2;
                this.f6154d = tag;
            }

            /* renamed from: a */
            public final void m110034a(int i) {
                this.f6153c = i;
            }

            /* renamed from: b */
            public final C1580b<T> m110033b(int i) {
                boolean z;
                int i2 = this.f6153c;
                if (i2 != Integer.MIN_VALUE) {
                    i = i2;
                }
                if (i != Integer.MIN_VALUE) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return new C1580b<>(this.f6151a, this.f6152b, i, this.f6154d);
                }
                throw new IllegalStateException("Item.end should be set first".toString());
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C1579a) {
                    C1579a c1579a = (C1579a) obj;
                    return Intrinsics.areEqual(this.f6151a, c1579a.f6151a) && this.f6152b == c1579a.f6152b && this.f6153c == c1579a.f6153c && Intrinsics.areEqual(this.f6154d, c1579a.f6154d);
                }
                return false;
            }

            public int hashCode() {
                T t = this.f6151a;
                return ((((((t == null ? 0 : t.hashCode()) * 31) + Integer.hashCode(this.f6152b)) * 31) + Integer.hashCode(this.f6153c)) * 31) + this.f6154d.hashCode();
            }

            public String toString() {
                return "MutableRange(item=" + this.f6151a + ", start=" + this.f6152b + ", end=" + this.f6153c + ", tag=" + this.f6154d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            public /* synthetic */ C1579a(Object obj, int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this(obj, i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, (i3 & 8) != 0 ? "" : str);
            }
        }

        public /* synthetic */ C1578a(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 16 : i);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C1578a(C1577Df text) {
            this(0, 1, null);
            Intrinsics.checkNotNullParameter(text, "text");
            m110040g(text);
        }
    }

    @Metadata(m28433d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m28432d2 = {"<anonymous>", "", "T", C17296a.f69688o, "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString\n*L\n1#1,328:1\n86#2:329\n*E\n"})
    /* renamed from: Df$c */
    /* loaded from: classes.dex */
    public static final class C1581c<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int compareValues;
            compareValues = ComparisonsKt__ComparisonsKt.compareValues(Integer.valueOf(((C1580b) t).m110027f()), Integer.valueOf(((C1580b) t2).m110027f()));
            return compareValues;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
        r5 = kotlin.collections.CollectionsKt___CollectionsKt.sortedWith(r7, new p000.C1577Df.C1581c());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1577Df(String text, List<C1580b<GN5>> list, List<C1580b<DE3>> list2, List<? extends C1580b<? extends Object>> list3) {
        List sortedWith;
        Intrinsics.checkNotNullParameter(text, "text");
        this.f6142b = text;
        this.f6143c = list;
        this.f6144d = list2;
        this.f6145e = list3;
        if (list2 == null || sortedWith == null) {
            return;
        }
        int size = sortedWith.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            C1580b c1580b = (C1580b) sortedWith.get(i2);
            if (c1580b.m110027f() >= i) {
                if (c1580b.m110029d() <= this.f6142b.length()) {
                    i = c1580b.m110029d();
                } else {
                    throw new IllegalArgumentException(("ParagraphStyle range [" + c1580b.m110027f() + ", " + c1580b.m110029d() + ") is out of boundary").toString());
                }
            } else {
                throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
            }
        }
    }

    /* renamed from: a */
    public char m110061a(int i) {
        return this.f6142b.charAt(i);
    }

    /* renamed from: b */
    public final List<C1580b<? extends Object>> m110060b() {
        return this.f6145e;
    }

    /* renamed from: c */
    public int m110059c() {
        return this.f6142b.length();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return m110061a(i);
    }

    /* renamed from: d */
    public final List<C1580b<DE3>> m110058d() {
        List<C1580b<DE3>> emptyList;
        List<C1580b<DE3>> list = this.f6144d;
        if (list == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        return list;
    }

    /* renamed from: e */
    public final List<C1580b<DE3>> m110057e() {
        return this.f6144d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1577Df)) {
            return false;
        }
        C1577Df c1577Df = (C1577Df) obj;
        if (Intrinsics.areEqual(this.f6142b, c1577Df.f6142b) && Intrinsics.areEqual(this.f6143c, c1577Df.f6143c) && Intrinsics.areEqual(this.f6144d, c1577Df.f6144d) && Intrinsics.areEqual(this.f6145e, c1577Df.f6145e)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final List<C1580b<GN5>> m110056f() {
        List<C1580b<GN5>> emptyList;
        List<C1580b<GN5>> list = this.f6143c;
        if (list == null) {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
            return emptyList;
        }
        return list;
    }

    /* renamed from: g */
    public final List<C1580b<GN5>> m110055g() {
        return this.f6143c;
    }

    /* renamed from: h */
    public final List<C1580b<String>> m110054h(int i, int i2) {
        List emptyList;
        boolean z;
        List<C1580b<? extends Object>> list = this.f6145e;
        if (list != null) {
            emptyList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1580b<? extends Object> c1580b = list.get(i3);
                C1580b<? extends Object> c1580b2 = c1580b;
                if ((c1580b2.m110028e() instanceof String) && C1921Ef.m108601l(i, i2, c1580b2.m110027f(), c1580b2.m110029d())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    emptyList.add(c1580b);
                }
            }
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNull(emptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return emptyList;
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = this.f6142b.hashCode() * 31;
        List<C1580b<GN5>> list = this.f6143c;
        int i3 = 0;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        List<C1580b<DE3>> list2 = this.f6144d;
        if (list2 != null) {
            i2 = list2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        List<C1580b<? extends Object>> list3 = this.f6145e;
        if (list3 != null) {
            i3 = list3.hashCode();
        }
        return i5 + i3;
    }

    /* renamed from: i */
    public final List<C1580b<String>> m110053i(String tag, int i, int i2) {
        List emptyList;
        boolean z;
        Intrinsics.checkNotNullParameter(tag, "tag");
        List<C1580b<? extends Object>> list = this.f6145e;
        if (list != null) {
            emptyList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1580b<? extends Object> c1580b = list.get(i3);
                C1580b<? extends Object> c1580b2 = c1580b;
                if ((c1580b2.m110028e() instanceof String) && Intrinsics.areEqual(tag, c1580b2.m110026g()) && C1921Ef.m108601l(i, i2, c1580b2.m110027f(), c1580b2.m110029d())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    emptyList.add(c1580b);
                }
            }
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNull(emptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<kotlin.String>>");
        return emptyList;
    }

    /* renamed from: j */
    public final String m110052j() {
        return this.f6142b;
    }

    /* renamed from: k */
    public final List<C1580b<AbstractC31619Aa6>> m110051k(int i, int i2) {
        List emptyList;
        boolean z;
        List<C1580b<? extends Object>> list = this.f6145e;
        if (list != null) {
            emptyList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1580b<? extends Object> c1580b = list.get(i3);
                C1580b<? extends Object> c1580b2 = c1580b;
                if ((c1580b2.m110028e() instanceof AbstractC31619Aa6) && C1921Ef.m108601l(i, i2, c1580b2.m110027f(), c1580b2.m110029d())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    emptyList.add(c1580b);
                }
            }
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNull(emptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>");
        return emptyList;
    }

    /* renamed from: l */
    public final List<C1580b<C34004Kf6>> m110050l(int i, int i2) {
        List emptyList;
        boolean z;
        List<C1580b<? extends Object>> list = this.f6145e;
        if (list != null) {
            emptyList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C1580b<? extends Object> c1580b = list.get(i3);
                C1580b<? extends Object> c1580b2 = c1580b;
                if ((c1580b2.m110028e() instanceof C34004Kf6) && C1921Ef.m108601l(i, i2, c1580b2.m110027f(), c1580b2.m110029d())) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    emptyList.add(c1580b);
                }
            }
        } else {
            emptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNull(emptyList, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>");
        return emptyList;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return m110059c();
    }

    /* renamed from: m */
    public final C1577Df m110049m(C1577Df other) {
        Intrinsics.checkNotNullParameter(other, "other");
        C1578a c1578a = new C1578a(this);
        c1578a.m110040g(other);
        return c1578a.m110035l();
    }

    @Override // java.lang.CharSequence
    /* renamed from: n */
    public C1577Df subSequence(int i, int i2) {
        boolean z;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i == 0 && i2 == this.f6142b.length()) {
                return this;
            }
            String substring = this.f6142b.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new C1577Df(substring, C1921Ef.m108612a(this.f6143c, i, i2), C1921Ef.m108612a(this.f6144d, i, i2), C1921Ef.m108612a(this.f6145e, i, i2));
        }
        throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i2 + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    /* renamed from: o */
    public final C1577Df m110047o(long j) {
        return subSequence(C48413s26.m14834l(j), C48413s26.m14835k(j));
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f6142b;
    }

    @Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\u0006\u0010\u0010\u001a\u00028\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cB!\b\u0016\u0012\u0006\u0010\u0010\u001a\u00028\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001dJ\u0010\u0010\u0003\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u0017\u0010\u0010\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u0017\u0010\u0014\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, m28432d2 = {"LDf$b;", "T", "", C17296a.f69688o, "()Ljava/lang/Object;", "", "b", "c", "", "toString", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Ljava/lang/Object;", "e", "item", "I", "f", "()I", "start", DateTokenConverter.CONVERTER_KEY, "end", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "tag", "<init>", "(Ljava/lang/Object;IILjava/lang/String;)V", "(Ljava/lang/Object;II)V", "ui-text_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nAnnotatedString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedString$Range\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1126:1\n1#2:1127\n*E\n"})
    /* renamed from: Df$b */
    /* loaded from: classes.dex */
    public static final class C1580b<T> {

        /* renamed from: a */
        public final T f6155a;

        /* renamed from: b */
        public final int f6156b;

        /* renamed from: c */
        public final int f6157c;

        /* renamed from: d */
        public final String f6158d;

        public C1580b(T t, int i, int i2, String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.f6155a = t;
            this.f6156b = i;
            this.f6157c = i2;
            this.f6158d = tag;
            if (!(i <= i2)) {
                throw new IllegalArgumentException("Reversed range is not supported".toString());
            }
        }

        /* renamed from: a */
        public final T m110032a() {
            return this.f6155a;
        }

        /* renamed from: b */
        public final int m110031b() {
            return this.f6156b;
        }

        /* renamed from: c */
        public final int m110030c() {
            return this.f6157c;
        }

        /* renamed from: d */
        public final int m110029d() {
            return this.f6157c;
        }

        /* renamed from: e */
        public final T m110028e() {
            return this.f6155a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1580b) {
                C1580b c1580b = (C1580b) obj;
                return Intrinsics.areEqual(this.f6155a, c1580b.f6155a) && this.f6156b == c1580b.f6156b && this.f6157c == c1580b.f6157c && Intrinsics.areEqual(this.f6158d, c1580b.f6158d);
            }
            return false;
        }

        /* renamed from: f */
        public final int m110027f() {
            return this.f6156b;
        }

        /* renamed from: g */
        public final String m110026g() {
            return this.f6158d;
        }

        public int hashCode() {
            T t = this.f6155a;
            return ((((((t == null ? 0 : t.hashCode()) * 31) + Integer.hashCode(this.f6156b)) * 31) + Integer.hashCode(this.f6157c)) * 31) + this.f6158d.hashCode();
        }

        public String toString() {
            return "Range(item=" + this.f6155a + ", start=" + this.f6156b + ", end=" + this.f6157c + ", tag=" + this.f6158d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public C1580b(T t, int i, int i2) {
            this(t, i, i2, "");
        }
    }

    public /* synthetic */ C1577Df(String str, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3);
    }

    public /* synthetic */ C1577Df(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1577Df(String text, List<C1580b<GN5>> spanStyles, List<C1580b<DE3>> paragraphStyles) {
        this(text, r4.isEmpty() ? null : r4, r5.isEmpty() ? null : r5, null);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(paragraphStyles, "paragraphStyles");
        List<C1580b<GN5>> list = spanStyles;
        List<C1580b<DE3>> list2 = paragraphStyles;
    }
}

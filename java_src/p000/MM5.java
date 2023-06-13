package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableList;
import p000.ER3;
@Metadata(m28433d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u00016B\u0007¢\u0006\u0004\b@\u0010<J\"\u0010\u0007\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0011\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\u0018\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00122\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0005H\u0016J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0096\u0002J\u0017\u0010\u001b\u001a\u00020\u00122\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u0017J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012H\u0016J\u0017\u0010!\u001a\u00020\u00052\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\u000eJ\u001f\u0010!\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\"J\u001e\u0010#\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\u0016\u0010#\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\b\u0010$\u001a\u00020\nH\u0016J\u0017\u0010%\u001a\u00020\u00052\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b%\u0010\u000eJ\u0016\u0010&\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J\u0017\u0010'\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b'\u0010\u0015J\u0016\u0010(\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0016J \u0010)\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b)\u0010*J\u0016\u0010+\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u0012J-\u0010.\u001a\u00020\u00122\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u0006\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u0012H\u0000¢\u0006\u0004\b.\u0010/R$\u00105\u001a\u00020\b2\u0006\u00100\u001a\u00020\b8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00108\u001a\u00020\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R \u0010=\u001a\b\u0012\u0004\u0012\u00028\u0000098@X\u0080\u0004¢\u0006\f\u0012\u0004\b;\u0010<\u001a\u0004\b1\u0010:R\u0014\u0010?\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u00107¨\u0006A"}, m28432d2 = {"LMM5;", "T", "", "LFP5;", "Lkotlin/Function1;", "", "block", "j", "LHP5;", "value", "", "c", "element", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "", "iterator", "lastIndexOf", "", "listIterator", "fromIndex", "toIndex", "subList", "add", "(ILjava/lang/Object;)V", "addAll", "clear", "remove", "removeAll", "o", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "s", "start", "end", "u", "(Ljava/util/Collection;II)I", "<set-?>", "b", "LHP5;", "h", "()LHP5;", "firstStateRecord", C17296a.f69688o, "()I", "modification", "LMM5$a;", "()LMM5$a;", "getReadable$runtime_release$annotations", "()V", "readable", "f", "size", "<init>", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,457:1\n153#1:458\n189#1,6:460\n195#1:467\n153#1:468\n196#1,9:470\n149#1:479\n205#1,6:485\n214#1,6:494\n185#1,10:500\n195#1:511\n153#1:512\n196#1,9:514\n149#1:523\n205#1,6:529\n214#1,6:538\n186#1:544\n189#1,6:545\n195#1:552\n153#1:553\n196#1,9:555\n149#1:564\n205#1,6:570\n214#1,6:579\n149#1:585\n189#1,6:596\n195#1:603\n153#1:604\n196#1,9:606\n149#1:615\n205#1,6:621\n214#1,6:630\n189#1,6:636\n195#1:643\n153#1:644\n196#1,9:646\n149#1:655\n205#1,6:661\n214#1,6:670\n185#1,10:677\n195#1:688\n153#1:689\n196#1,9:691\n149#1:700\n205#1,6:706\n214#1,6:715\n186#1:721\n185#1,10:722\n195#1:733\n153#1:734\n196#1,9:736\n149#1:745\n205#1,6:751\n214#1,6:760\n186#1:766\n159#1,4:767\n163#1:772\n153#1:773\n164#1,7:775\n149#1:782\n171#1,6:788\n179#1,3:797\n159#1,4:800\n163#1:805\n153#1:806\n164#1,7:808\n149#1:815\n171#1,6:821\n179#1,3:830\n153#1:833\n159#1,4:845\n163#1:850\n153#1:851\n164#1,7:853\n149#1:860\n171#1,6:866\n179#1,3:875\n153#1:879\n149#1:881\n189#1,6:892\n195#1:899\n153#1:900\n196#1,9:902\n149#1:911\n205#1,6:917\n214#1,6:926\n153#1:933\n149#1:935\n2180#2:459\n2180#2:469\n2073#2,2:480\n1686#2:482\n2075#2,2:483\n2077#2,3:491\n2180#2:513\n2073#2,2:524\n1686#2:526\n2075#2,2:527\n2077#2,3:535\n2180#2:554\n2073#2,2:565\n1686#2:567\n2075#2,2:568\n2077#2,3:576\n2073#2,2:586\n1686#2:588\n2075#2,2:590\n2077#2,3:593\n2180#2:605\n2073#2,2:616\n1686#2:618\n2075#2,2:619\n2077#2,3:627\n2180#2:645\n2073#2,2:656\n1686#2:658\n2075#2,2:659\n2077#2,3:667\n2180#2:690\n2073#2,2:701\n1686#2:703\n2075#2,2:704\n2077#2,3:712\n2180#2:735\n2073#2,2:746\n1686#2:748\n2075#2,2:749\n2077#2,3:757\n2180#2:774\n2073#2,2:783\n1686#2:785\n2075#2,2:786\n2077#2,3:794\n2180#2:807\n2073#2,2:816\n1686#2:818\n2075#2,2:819\n2077#2,3:827\n2180#2:834\n2073#2,2:835\n1686#2:837\n2075#2,5:839\n2180#2:844\n2180#2:852\n2073#2,2:861\n1686#2:863\n2075#2,2:864\n2077#2,3:872\n2180#2:880\n2073#2,2:882\n1686#2:884\n2075#2,2:886\n2077#2,3:889\n2180#2:901\n2073#2,2:912\n1686#2:914\n2075#2,2:915\n2077#2,3:923\n2180#2:934\n2073#2,2:936\n1686#2:938\n2075#2,2:940\n2077#2,3:943\n70#3:466\n70#3:510\n70#3:551\n70#3:589\n70#3:592\n70#3:602\n70#3:642\n70#3:687\n70#3:732\n70#3:771\n70#3:804\n70#3:838\n70#3:849\n70#3:878\n70#3:885\n70#3:888\n70#3:898\n70#3:932\n70#3:939\n70#3:942\n1#4:676\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList\n*L\n62#1:458\n101#1:460,6\n101#1:467\n101#1:468\n101#1:470,9\n101#1:479\n101#1:485,6\n101#1:494,6\n102#1:500,10\n102#1:511\n102#1:512\n102#1:514,9\n102#1:523\n102#1:529,6\n102#1:538,6\n102#1:544\n107#1:545,6\n107#1:552\n107#1:553\n107#1:555,9\n107#1:564\n107#1:570,6\n107#1:579,6\n109#1:585\n116#1:596,6\n116#1:603\n116#1:604\n116#1:606,9\n116#1:615\n116#1:621,6\n116#1:630,6\n117#1:636,6\n117#1:643\n117#1:644\n117#1:646,9\n117#1:655\n117#1:661,6\n117#1:670,6\n118#1:677,10\n118#1:688\n118#1:689\n118#1:691,9\n118#1:700\n118#1:706,6\n118#1:715,6\n118#1:721\n121#1:722,10\n121#1:733\n121#1:734\n121#1:736,9\n121#1:745\n121#1:751,6\n121#1:760,6\n121#1:766\n125#1:767,4\n125#1:772\n125#1:773\n125#1:775,7\n125#1:782\n125#1:788,6\n125#1:797,3\n132#1:800,4\n132#1:805\n132#1:806\n132#1:808,7\n132#1:815\n132#1:821,6\n132#1:830,3\n145#1:833\n155#1:845,4\n155#1:850\n155#1:851\n155#1:853,7\n155#1:860\n155#1:866,6\n155#1:875,3\n163#1:879\n170#1:881\n185#1:892,6\n185#1:899\n185#1:900\n185#1:902,9\n185#1:911\n185#1:917,6\n185#1:926,6\n195#1:933\n204#1:935\n62#1:459\n101#1:469\n101#1:480,2\n101#1:482\n101#1:483,2\n101#1:491,3\n102#1:513\n102#1:524,2\n102#1:526\n102#1:527,2\n102#1:535,3\n107#1:554\n107#1:565,2\n107#1:567\n107#1:568,2\n107#1:576,3\n109#1:586,2\n109#1:588\n109#1:590,2\n109#1:593,3\n116#1:605\n116#1:616,2\n116#1:618\n116#1:619,2\n116#1:627,3\n117#1:645\n117#1:656,2\n117#1:658\n117#1:659,2\n117#1:667,3\n118#1:690\n118#1:701,2\n118#1:703\n118#1:704,2\n118#1:712,3\n121#1:735\n121#1:746,2\n121#1:748\n121#1:749,2\n121#1:757,3\n125#1:774\n125#1:783,2\n125#1:785\n125#1:786,2\n125#1:794,3\n132#1:807\n132#1:816,2\n132#1:818\n132#1:819,2\n132#1:827,3\n145#1:834\n149#1:835,2\n149#1:837\n149#1:839,5\n153#1:844\n155#1:852\n155#1:861,2\n155#1:863\n155#1:864,2\n155#1:872,3\n163#1:880\n170#1:882,2\n170#1:884\n170#1:886,2\n170#1:889,3\n185#1:901\n185#1:912,2\n185#1:914\n185#1:915,2\n185#1:923,3\n195#1:934\n204#1:936,2\n204#1:938\n204#1:940,2\n204#1:943,3\n101#1:466\n102#1:510\n107#1:551\n109#1:589\n110#1:592\n116#1:602\n117#1:642\n118#1:687\n121#1:732\n125#1:771\n132#1:804\n149#1:838\n155#1:849\n162#1:878\n170#1:885\n171#1:888\n185#1:898\n194#1:932\n204#1:939\n205#1:942\n*E\n"})
/* renamed from: MM5 */
/* loaded from: classes.dex */
public final class MM5<T> implements List<T>, FP5, KMutableList {

    /* renamed from: b */
    public HP5 f23002b = new C5275a(C34494Mi1.m95009b());

    @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B\u0017\b\u0000\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\u0017\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016R(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, m28432d2 = {"LMM5$a;", "T", "LHP5;", "value", "", C17296a.f69688o, "b", "LER3;", "c", "LER3;", "g", "()LER3;", "i", "(LER3;)V", "list", "", DateTokenConverter.CONVERTER_KEY, "I", "h", "()I", "j", "(I)V", "modification", "<init>", "runtime_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n*L\n1#1,457:1\n70#2:458\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SnapshotStateList$StateListStateRecord\n*L\n76#1:458\n*E\n"})
    /* renamed from: MM5$a */
    /* loaded from: classes.dex */
    public static final class C5275a<T> extends HP5 {

        /* renamed from: c */
        public ER3<? extends T> f23003c;

        /* renamed from: d */
        public int f23004d;

        public C5275a(ER3<? extends T> list) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f23003c = list;
        }

        @Override // p000.HP5
        /* renamed from: a */
        public void mo13268a(HP5 value) {
            Object obj;
            Intrinsics.checkNotNullParameter(value, "value");
            obj = NM5.f24485a;
            synchronized (obj) {
                this.f23003c = ((C5275a) value).f23003c;
                this.f23004d = ((C5275a) value).f23004d;
                Unit unit = Unit.INSTANCE;
            }
        }

        @Override // p000.HP5
        /* renamed from: b */
        public HP5 mo13267b() {
            return new C5275a(this.f23003c);
        }

        /* renamed from: g */
        public final ER3<T> m95401g() {
            return (ER3<? extends T>) this.f23003c;
        }

        /* renamed from: h */
        public final int m95400h() {
            return this.f23004d;
        }

        /* renamed from: i */
        public final void m95399i(ER3<? extends T> er3) {
            Intrinsics.checkNotNullParameter(er3, "<set-?>");
            this.f23003c = er3;
        }

        /* renamed from: j */
        public final void m95398j(int i) {
            this.f23004d = i;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "T", "it", "", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: MM5$b */
    /* loaded from: classes.dex */
    public static final class C5276b extends Lambda implements Function1<List<T>, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ int f23005g;

        /* renamed from: h */
        public final /* synthetic */ Collection<T> f23006h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5276b(int i, Collection<? extends T> collection) {
            super(1);
            this.f23005g = i;
            this.f23006h = collection;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return invoke((List) ((List) obj));
        }

        public final Boolean invoke(List<T> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.addAll(this.f23005g, this.f23006h));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"<anonymous>", "", "T", "it", "", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: MM5$c */
    /* loaded from: classes.dex */
    public static final class C5277c extends Lambda implements Function1<List<T>, Boolean> {

        /* renamed from: g */
        public final /* synthetic */ Collection<T> f23007g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C5277c(Collection<? extends T> collection) {
            super(1);
            this.f23007g = collection;
        }

        public final Boolean invoke(List<T> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(it.retainAll(this.f23007g));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return invoke((List) ((List) obj));
        }
    }

    /* renamed from: a */
    public final int m95408a() {
        HP5 mo13271h = mo13271h();
        Intrinsics.checkNotNull(mo13271h, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return ((C5275a) C51564xM5.m5415B((C5275a) mo13271h)).m95400h();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(T t) {
        Object obj;
        int m95400h;
        ER3<T> m95401g;
        boolean z;
        AbstractC48600sM5 m14280b;
        Object obj2;
        do {
            obj = NM5.f24485a;
            synchronized (obj) {
                HP5 mo13271h = mo13271h();
                Intrinsics.checkNotNull(mo13271h, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C5275a c5275a = (C5275a) C51564xM5.m5415B((C5275a) mo13271h);
                m95400h = c5275a.m95400h();
                m95401g = c5275a.m95401g();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(m95401g);
            ER3<T> add = m95401g.add((ER3<T>) t);
            z = false;
            if (Intrinsics.areEqual(add, m95401g)) {
                return false;
            }
            HP5 mo13271h2 = mo13271h();
            Intrinsics.checkNotNull(mo13271h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C5275a c5275a2 = (C5275a) mo13271h2;
            C51564xM5.m5411F();
            synchronized (C51564xM5.m5412E()) {
                m14280b = AbstractC48600sM5.f108670e.m14280b();
                C5275a c5275a3 = (C5275a) C51564xM5.m5385c0(c5275a2, this, m14280b);
                obj2 = NM5.f24485a;
                synchronized (obj2) {
                    if (c5275a3.m95400h() == m95400h) {
                        c5275a3.m95399i(add);
                        c5275a3.m95398j(c5275a3.m95400h() + 1);
                        z = true;
                    }
                }
            }
            C51564xM5.m5404M(m14280b, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m95405j(new C5276b(i, elements));
    }

    /* renamed from: b */
    public final C5275a<T> m95407b() {
        HP5 mo13271h = mo13271h();
        Intrinsics.checkNotNull(mo13271h, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return (C5275a) C51564xM5.m5398S((C5275a) mo13271h, this);
    }

    @Override // p000.FP5
    /* renamed from: c */
    public void mo13273c(HP5 value) {
        Intrinsics.checkNotNullParameter(value, "value");
        value.m103906e(mo13271h());
        this.f23002b = (C5275a) value;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        AbstractC48600sM5 m14280b;
        Object obj;
        HP5 mo13271h = mo13271h();
        Intrinsics.checkNotNull(mo13271h, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        C5275a c5275a = (C5275a) mo13271h;
        C51564xM5.m5411F();
        synchronized (C51564xM5.m5412E()) {
            m14280b = AbstractC48600sM5.f108670e.m14280b();
            C5275a c5275a2 = (C5275a) C51564xM5.m5385c0(c5275a, this, m14280b);
            obj = NM5.f24485a;
            synchronized (obj) {
                c5275a2.m95399i(C34494Mi1.m95009b());
                c5275a2.m95398j(c5275a2.m95400h() + 1);
            }
        }
        C51564xM5.m5404M(m14280b, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return m95407b().m95401g().contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m95407b().m95401g().containsAll(elements);
    }

    /* renamed from: f */
    public int m95406f() {
        return m95407b().m95401g().size();
    }

    @Override // java.util.List
    public T get(int i) {
        return m95407b().m95401g().get(i);
    }

    @Override // p000.FP5
    /* renamed from: h */
    public HP5 mo13271h() {
        return this.f23002b;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return m95407b().m95401g().indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return m95407b().m95401g().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        return listIterator();
    }

    /* renamed from: j */
    public final boolean m95405j(Function1<? super List<T>, Boolean> function1) {
        Object obj;
        int m95400h;
        ER3<T> m95401g;
        Boolean invoke;
        AbstractC48600sM5 m14280b;
        Object obj2;
        boolean z;
        do {
            obj = NM5.f24485a;
            synchronized (obj) {
                HP5 mo13271h = mo13271h();
                Intrinsics.checkNotNull(mo13271h, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C5275a c5275a = (C5275a) C51564xM5.m5415B((C5275a) mo13271h);
                m95400h = c5275a.m95400h();
                m95401g = c5275a.m95401g();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(m95401g);
            ER3.InterfaceC1825a<T> builder = m95401g.builder();
            invoke = function1.invoke(builder);
            ER3<T> build = builder.build();
            if (Intrinsics.areEqual(build, m95401g)) {
                break;
            }
            HP5 mo13271h2 = mo13271h();
            Intrinsics.checkNotNull(mo13271h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C5275a c5275a2 = (C5275a) mo13271h2;
            C51564xM5.m5411F();
            synchronized (C51564xM5.m5412E()) {
                m14280b = AbstractC48600sM5.f108670e.m14280b();
                C5275a c5275a3 = (C5275a) C51564xM5.m5385c0(c5275a2, this, m14280b);
                obj2 = NM5.f24485a;
                synchronized (obj2) {
                    if (c5275a3.m95400h() == m95400h) {
                        c5275a3.m95399i(build);
                        z = true;
                        c5275a3.m95398j(c5275a3.m95400h() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            C51564xM5.m5404M(m14280b, this);
        } while (!z);
        return invoke.booleanValue();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return m95407b().m95401g().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<T> listIterator() {
        return new C52777zP5(this, 0);
    }

    /* renamed from: o */
    public T m95404o(int i) {
        Object obj;
        int m95400h;
        ER3<T> m95401g;
        AbstractC48600sM5 m14280b;
        Object obj2;
        boolean z;
        T t = get(i);
        do {
            obj = NM5.f24485a;
            synchronized (obj) {
                HP5 mo13271h = mo13271h();
                Intrinsics.checkNotNull(mo13271h, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C5275a c5275a = (C5275a) C51564xM5.m5415B((C5275a) mo13271h);
                m95400h = c5275a.m95400h();
                m95401g = c5275a.m95401g();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(m95401g);
            ER3<T> mo16173U1 = m95401g.mo16173U1(i);
            if (Intrinsics.areEqual(mo16173U1, m95401g)) {
                break;
            }
            HP5 mo13271h2 = mo13271h();
            Intrinsics.checkNotNull(mo13271h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C5275a c5275a2 = (C5275a) mo13271h2;
            C51564xM5.m5411F();
            synchronized (C51564xM5.m5412E()) {
                m14280b = AbstractC48600sM5.f108670e.m14280b();
                C5275a c5275a3 = (C5275a) C51564xM5.m5385c0(c5275a2, this, m14280b);
                obj2 = NM5.f24485a;
                synchronized (obj2) {
                    if (c5275a3.m95400h() == m95400h) {
                        c5275a3.m95399i(mo16173U1);
                        z = true;
                        c5275a3.m95398j(c5275a3.m95400h() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            C51564xM5.m5404M(m14280b, this);
        } while (!z);
        return t;
    }

    @Override // java.util.List
    public final /* bridge */ T remove(int i) {
        return m95404o(i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<? extends Object> elements) {
        Object obj;
        int m95400h;
        ER3<T> m95401g;
        boolean z;
        AbstractC48600sM5 m14280b;
        Object obj2;
        Intrinsics.checkNotNullParameter(elements, "elements");
        do {
            obj = NM5.f24485a;
            synchronized (obj) {
                HP5 mo13271h = mo13271h();
                Intrinsics.checkNotNull(mo13271h, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C5275a c5275a = (C5275a) C51564xM5.m5415B((C5275a) mo13271h);
                m95400h = c5275a.m95400h();
                m95401g = c5275a.m95401g();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(m95401g);
            ER3<T> removeAll = m95401g.removeAll((Collection<? extends T>) elements);
            z = false;
            if (Intrinsics.areEqual(removeAll, m95401g)) {
                return false;
            }
            HP5 mo13271h2 = mo13271h();
            Intrinsics.checkNotNull(mo13271h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C5275a c5275a2 = (C5275a) mo13271h2;
            C51564xM5.m5411F();
            synchronized (C51564xM5.m5412E()) {
                m14280b = AbstractC48600sM5.f108670e.m14280b();
                C5275a c5275a3 = (C5275a) C51564xM5.m5385c0(c5275a2, this, m14280b);
                obj2 = NM5.f24485a;
                synchronized (obj2) {
                    if (c5275a3.m95400h() == m95400h) {
                        c5275a3.m95399i(removeAll);
                        c5275a3.m95398j(c5275a3.m95400h() + 1);
                        z = true;
                    }
                }
            }
            C51564xM5.m5404M(m14280b, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return m95405j(new C5277c(elements));
    }

    /* renamed from: s */
    public final void m95403s(int i, int i2) {
        Object obj;
        int m95400h;
        ER3<T> m95401g;
        AbstractC48600sM5 m14280b;
        Object obj2;
        boolean z;
        do {
            obj = NM5.f24485a;
            synchronized (obj) {
                HP5 mo13271h = mo13271h();
                Intrinsics.checkNotNull(mo13271h, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C5275a c5275a = (C5275a) C51564xM5.m5415B((C5275a) mo13271h);
                m95400h = c5275a.m95400h();
                m95401g = c5275a.m95401g();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(m95401g);
            ER3.InterfaceC1825a<T> builder = m95401g.builder();
            builder.subList(i, i2).clear();
            ER3<T> build = builder.build();
            if (!Intrinsics.areEqual(build, m95401g)) {
                HP5 mo13271h2 = mo13271h();
                Intrinsics.checkNotNull(mo13271h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C5275a c5275a2 = (C5275a) mo13271h2;
                C51564xM5.m5411F();
                synchronized (C51564xM5.m5412E()) {
                    m14280b = AbstractC48600sM5.f108670e.m14280b();
                    C5275a c5275a3 = (C5275a) C51564xM5.m5385c0(c5275a2, this, m14280b);
                    obj2 = NM5.f24485a;
                    synchronized (obj2) {
                        if (c5275a3.m95400h() == m95400h) {
                            c5275a3.m95399i(build);
                            z = true;
                            c5275a3.m95398j(c5275a3.m95400h() + 1);
                        } else {
                            z = false;
                        }
                    }
                }
                C51564xM5.m5404M(m14280b, this);
            } else {
                return;
            }
        } while (!z);
    }

    @Override // java.util.List
    public T set(int i, T t) {
        Object obj;
        int m95400h;
        ER3<T> m95401g;
        AbstractC48600sM5 m14280b;
        Object obj2;
        boolean z;
        T t2 = get(i);
        do {
            obj = NM5.f24485a;
            synchronized (obj) {
                HP5 mo13271h = mo13271h();
                Intrinsics.checkNotNull(mo13271h, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C5275a c5275a = (C5275a) C51564xM5.m5415B((C5275a) mo13271h);
                m95400h = c5275a.m95400h();
                m95401g = c5275a.m95401g();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(m95401g);
            ER3<T> er3 = m95401g.set(i, (int) t);
            if (Intrinsics.areEqual(er3, m95401g)) {
                break;
            }
            HP5 mo13271h2 = mo13271h();
            Intrinsics.checkNotNull(mo13271h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C5275a c5275a2 = (C5275a) mo13271h2;
            C51564xM5.m5411F();
            synchronized (C51564xM5.m5412E()) {
                m14280b = AbstractC48600sM5.f108670e.m14280b();
                C5275a c5275a3 = (C5275a) C51564xM5.m5385c0(c5275a2, this, m14280b);
                obj2 = NM5.f24485a;
                synchronized (obj2) {
                    if (c5275a3.m95400h() == m95400h) {
                        c5275a3.m95399i(er3);
                        z = true;
                        c5275a3.m95398j(c5275a3.m95400h() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            C51564xM5.m5404M(m14280b, this);
        } while (!z);
        return t2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return m95406f();
    }

    @Override // java.util.List
    public List<T> subList(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i >= 0 && i <= i2) {
            z = true;
        } else {
            z = false;
        }
        if (!z || i2 > size()) {
            z2 = false;
        }
        if (z2) {
            return new WS5(this, i, i2);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return CollectionToArray.toArray(this);
    }

    /* renamed from: u */
    public final int m95402u(Collection<? extends T> elements, int i, int i2) {
        Object obj;
        int m95400h;
        ER3<T> m95401g;
        AbstractC48600sM5 m14280b;
        Object obj2;
        boolean z;
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = size();
        do {
            obj = NM5.f24485a;
            synchronized (obj) {
                HP5 mo13271h = mo13271h();
                Intrinsics.checkNotNull(mo13271h, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C5275a c5275a = (C5275a) C51564xM5.m5415B((C5275a) mo13271h);
                m95400h = c5275a.m95400h();
                m95401g = c5275a.m95401g();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(m95401g);
            ER3.InterfaceC1825a<T> builder = m95401g.builder();
            builder.subList(i, i2).retainAll(elements);
            ER3<T> build = builder.build();
            if (Intrinsics.areEqual(build, m95401g)) {
                break;
            }
            HP5 mo13271h2 = mo13271h();
            Intrinsics.checkNotNull(mo13271h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C5275a c5275a2 = (C5275a) mo13271h2;
            C51564xM5.m5411F();
            synchronized (C51564xM5.m5412E()) {
                m14280b = AbstractC48600sM5.f108670e.m14280b();
                C5275a c5275a3 = (C5275a) C51564xM5.m5385c0(c5275a2, this, m14280b);
                obj2 = NM5.f24485a;
                synchronized (obj2) {
                    if (c5275a3.m95400h() == m95400h) {
                        c5275a3.m95399i(build);
                        z = true;
                        c5275a3.m95398j(c5275a3.m95400h() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            C51564xM5.m5404M(m14280b, this);
        } while (!z);
        return size - size();
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends T> elements) {
        Object obj;
        int m95400h;
        ER3<T> m95401g;
        boolean z;
        AbstractC48600sM5 m14280b;
        Object obj2;
        Intrinsics.checkNotNullParameter(elements, "elements");
        do {
            obj = NM5.f24485a;
            synchronized (obj) {
                HP5 mo13271h = mo13271h();
                Intrinsics.checkNotNull(mo13271h, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C5275a c5275a = (C5275a) C51564xM5.m5415B((C5275a) mo13271h);
                m95400h = c5275a.m95400h();
                m95401g = c5275a.m95401g();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(m95401g);
            ER3<T> addAll = m95401g.addAll(elements);
            z = false;
            if (Intrinsics.areEqual(addAll, m95401g)) {
                return false;
            }
            HP5 mo13271h2 = mo13271h();
            Intrinsics.checkNotNull(mo13271h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C5275a c5275a2 = (C5275a) mo13271h2;
            C51564xM5.m5411F();
            synchronized (C51564xM5.m5412E()) {
                m14280b = AbstractC48600sM5.f108670e.m14280b();
                C5275a c5275a3 = (C5275a) C51564xM5.m5385c0(c5275a2, this, m14280b);
                obj2 = NM5.f24485a;
                synchronized (obj2) {
                    if (c5275a3.m95400h() == m95400h) {
                        c5275a3.m95399i(addAll);
                        c5275a3.m95398j(c5275a3.m95400h() + 1);
                        z = true;
                    }
                }
            }
            C51564xM5.m5404M(m14280b, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List
    public ListIterator<T> listIterator(int i) {
        return new C52777zP5(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        Object obj2;
        int m95400h;
        ER3<T> m95401g;
        boolean z;
        AbstractC48600sM5 m14280b;
        Object obj3;
        do {
            obj2 = NM5.f24485a;
            synchronized (obj2) {
                HP5 mo13271h = mo13271h();
                Intrinsics.checkNotNull(mo13271h, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C5275a c5275a = (C5275a) C51564xM5.m5415B((C5275a) mo13271h);
                m95400h = c5275a.m95400h();
                m95401g = c5275a.m95401g();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(m95401g);
            ER3<T> remove = m95401g.remove((ER3<T>) obj);
            z = false;
            if (Intrinsics.areEqual(remove, m95401g)) {
                return false;
            }
            HP5 mo13271h2 = mo13271h();
            Intrinsics.checkNotNull(mo13271h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C5275a c5275a2 = (C5275a) mo13271h2;
            C51564xM5.m5411F();
            synchronized (C51564xM5.m5412E()) {
                m14280b = AbstractC48600sM5.f108670e.m14280b();
                C5275a c5275a3 = (C5275a) C51564xM5.m5385c0(c5275a2, this, m14280b);
                obj3 = NM5.f24485a;
                synchronized (obj3) {
                    if (c5275a3.m95400h() == m95400h) {
                        c5275a3.m95399i(remove);
                        c5275a3.m95398j(c5275a3.m95400h() + 1);
                        z = true;
                    }
                }
            }
            C51564xM5.m5404M(m14280b, this);
        } while (!z);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) CollectionToArray.toArray(this, array);
    }

    @Override // java.util.List
    public void add(int i, T t) {
        Object obj;
        int m95400h;
        ER3<T> m95401g;
        AbstractC48600sM5 m14280b;
        Object obj2;
        boolean z;
        do {
            obj = NM5.f24485a;
            synchronized (obj) {
                HP5 mo13271h = mo13271h();
                Intrinsics.checkNotNull(mo13271h, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
                C5275a c5275a = (C5275a) C51564xM5.m5415B((C5275a) mo13271h);
                m95400h = c5275a.m95400h();
                m95401g = c5275a.m95401g();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(m95401g);
            ER3<T> add = m95401g.add(i, (int) t);
            if (Intrinsics.areEqual(add, m95401g)) {
                return;
            }
            HP5 mo13271h2 = mo13271h();
            Intrinsics.checkNotNull(mo13271h2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateList.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
            C5275a c5275a2 = (C5275a) mo13271h2;
            C51564xM5.m5411F();
            synchronized (C51564xM5.m5412E()) {
                m14280b = AbstractC48600sM5.f108670e.m14280b();
                C5275a c5275a3 = (C5275a) C51564xM5.m5385c0(c5275a2, this, m14280b);
                obj2 = NM5.f24485a;
                synchronized (obj2) {
                    if (c5275a3.m95400h() == m95400h) {
                        c5275a3.m95399i(add);
                        z = true;
                        c5275a3.m95398j(c5275a3.m95400h() + 1);
                    } else {
                        z = false;
                    }
                }
            }
            C51564xM5.m5404M(m14280b, this);
        } while (!z);
    }
}

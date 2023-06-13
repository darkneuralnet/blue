package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.AbstractC32569Ec2;
@Metadata(m28433d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\f\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u0003:\u0005'()*+B\u0007¢\u0006\u0004\b%\u0010&J\u001f\u0010\t\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0001H&¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u0001H&¢\u0006\u0004\b\u000e\u0010\u000fJ0\u0010\u0015\u001a\u00020\u00142\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0012H&J0\u0010\u0018\u001a\u00020\u00142\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u00162\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017H&J0\u0010\u0019\u001a\u00020\u00142\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u00162\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0017H&J \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005J4\u0010\u001c\u001a\u00020\u00142\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u00102\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u001bJ4\u0010\u001e\u001a\u00020\u00142\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u00162\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u001dJ4\u0010\u001f\u001a\u00020\u00142\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u00162\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00050\u001dJ'\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00010 *\b\u0012\u0004\u0012\u00028\u00010 2\u0006\u0010!\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\"\u0010#J'\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00010 *\b\u0012\u0004\u0012\u00028\u00010 2\u0006\u0010!\u001a\u00028\u0001H\u0002¢\u0006\u0004\b$\u0010#¨\u0006,"}, m28432d2 = {"LUD3;", "Key", "Value", "LEc2;", "LTD3;", "LIa2;", "", "position", "item", "G", "(JLjava/lang/Object;)Ljava/lang/Object;", "item1", "item2", "", "E", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "LEc2$c;", "params", "LUD3$e;", "callback", "", "J", "LEc2$d;", "LUD3$c;", "H", "I", "F", "LEc2$b;", "v", "LEc2$a;", "r", "t", "", "value", "L", "(Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;", "K", "<init>", "()V", C17296a.f69688o, "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPageItemKeyedDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageItemKeyedDataSource.kt\nco/bird/android/widget/paging/pageitem/PageItemKeyedDataSource\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n350#2,7:183\n350#2,7:190\n1#3:197\n*S KotlinDebug\n*F\n+ 1 PageItemKeyedDataSource.kt\nco/bird/android/widget/paging/pageitem/PageItemKeyedDataSource\n*L\n39#1:183,7\n43#1:190,7\n*E\n"})
/* renamed from: UD3 */
/* loaded from: classes4.dex */
public abstract class UD3<Key, Value> extends AbstractC32569Ec2<TD3<Key, Value>, C33487Ia2<Value>> {

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00010\u0001B5\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0006\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b0\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0016R \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR&\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"LUD3$a;", "LUD3$c;", "", MessageExtension.FIELD_DATA, "", C17296a.f69688o, "LEc2$a;", "LIa2;", "LEc2$a;", "loadCallback", "LEc2$d;", "LTD3;", "b", "LEc2$d;", "params", "<init>", "(LUD3;LEc2$a;LEc2$d;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPageItemKeyedDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageItemKeyedDataSource.kt\nco/bird/android/widget/paging/pageitem/PageItemKeyedDataSource$LoadAfterCallbackDelegate\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n1559#2:183\n1590#2,4:184\n*S KotlinDebug\n*F\n+ 1 PageItemKeyedDataSource.kt\nco/bird/android/widget/paging/pageitem/PageItemKeyedDataSource$LoadAfterCallbackDelegate\n*L\n69#1:183\n69#1:184,4\n*E\n"})
    /* renamed from: UD3$a */
    /* loaded from: classes4.dex */
    public final class C8217a implements InterfaceC8219c<Value> {

        /* renamed from: a */
        public final AbstractC32569Ec2.AbstractC1912a<C33487Ia2<Value>> f37014a;

        /* renamed from: b */
        public final AbstractC32569Ec2.C1915d<TD3<Key, Value>> f37015b;

        /* renamed from: c */
        public final /* synthetic */ UD3<Key, Value> f37016c;

        public C8217a(UD3 ud3, AbstractC32569Ec2.AbstractC1912a<C33487Ia2<Value>> loadCallback, AbstractC32569Ec2.C1915d<TD3<Key, Value>> params) {
            Intrinsics.checkNotNullParameter(loadCallback, "loadCallback");
            Intrinsics.checkNotNullParameter(params, "params");
            this.f37016c = ud3;
            this.f37014a = loadCallback;
            this.f37015b = params;
        }

        @Override // p000.UD3.InterfaceC8219c
        /* renamed from: a */
        public void mo81810a(List<? extends Value> data) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(data, "data");
            List m81811L = this.f37016c.m81811L(data, this.f37015b.f7850a.m84187b());
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(m81811L, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            int i = 0;
            for (Object obj : m81811L) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(new C33487Ia2(this.f37015b.f7850a.m84186c() + 1 + i, obj));
                i = i2;
            }
            this.f37014a.mo71704a(arrayList);
        }
    }

    @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00010\u0001B5\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u0006\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b0\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0016R \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\bR&\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, m28432d2 = {"LUD3$b;", "LUD3$c;", "", MessageExtension.FIELD_DATA, "", C17296a.f69688o, "LEc2$a;", "LIa2;", "LEc2$a;", "loadCallback", "LEc2$d;", "LTD3;", "b", "LEc2$d;", "params", "<init>", "(LUD3;LEc2$a;LEc2$d;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPageItemKeyedDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageItemKeyedDataSource.kt\nco/bird/android/widget/paging/pageitem/PageItemKeyedDataSource$LoadBeforeCallbackDelegate\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n1559#2:183\n1590#2,4:184\n*S KotlinDebug\n*F\n+ 1 PageItemKeyedDataSource.kt\nco/bird/android/widget/paging/pageitem/PageItemKeyedDataSource$LoadBeforeCallbackDelegate\n*L\n82#1:183\n82#1:184,4\n*E\n"})
    /* renamed from: UD3$b */
    /* loaded from: classes4.dex */
    public final class C8218b implements InterfaceC8219c<Value> {

        /* renamed from: a */
        public final AbstractC32569Ec2.AbstractC1912a<C33487Ia2<Value>> f37017a;

        /* renamed from: b */
        public final AbstractC32569Ec2.C1915d<TD3<Key, Value>> f37018b;

        /* renamed from: c */
        public final /* synthetic */ UD3<Key, Value> f37019c;

        public C8218b(UD3 ud3, AbstractC32569Ec2.AbstractC1912a<C33487Ia2<Value>> loadCallback, AbstractC32569Ec2.C1915d<TD3<Key, Value>> params) {
            Intrinsics.checkNotNullParameter(loadCallback, "loadCallback");
            Intrinsics.checkNotNullParameter(params, "params");
            this.f37019c = ud3;
            this.f37017a = loadCallback;
            this.f37018b = params;
        }

        @Override // p000.UD3.InterfaceC8219c
        /* renamed from: a */
        public void mo81810a(List<? extends Value> data) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(data, "data");
            List m81812K = this.f37019c.m81812K(data, this.f37018b.f7850a.m84187b());
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(m81812K, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            int i = 0;
            for (Object obj : m81812K) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(new C33487Ia2(((this.f37018b.f7850a.m84186c() + 1) - data.size()) + i, obj));
                i = i2;
            }
            this.f37017a.mo71704a(arrayList);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003H&¨\u0006\u0007"}, m28432d2 = {"LUD3$c;", "Value", "", "", MessageExtension.FIELD_DATA, "", C17296a.f69688o, "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: UD3$c */
    /* loaded from: classes4.dex */
    public interface InterfaceC8219c<Value> {
        /* renamed from: a */
        void mo81810a(List<? extends Value> list);
    }

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00010\u0001B\u001b\u0012\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0016J&\u0010\t\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016R \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u0010"}, m28432d2 = {"LUD3$d;", "LUD3$e;", "", MessageExtension.FIELD_DATA, "", C17296a.f69688o, "", "position", "totalCount", "b", "LEc2$b;", "LIa2;", "LEc2$b;", "loadCallback", "<init>", "(LUD3;LEc2$b;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nPageItemKeyedDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PageItemKeyedDataSource.kt\nco/bird/android/widget/paging/pageitem/PageItemKeyedDataSource$LoadInitialAdapterCallback\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n1559#2:183\n1590#2,4:184\n1559#2:188\n1590#2,4:189\n*S KotlinDebug\n*F\n+ 1 PageItemKeyedDataSource.kt\nco/bird/android/widget/paging/pageitem/PageItemKeyedDataSource$LoadInitialAdapterCallback\n*L\n51#1:183\n51#1:184,4\n56#1:188\n56#1:189,4\n*E\n"})
    /* renamed from: UD3$d */
    /* loaded from: classes4.dex */
    public final class C8220d implements InterfaceC8221e<Value> {

        /* renamed from: a */
        public final AbstractC32569Ec2.AbstractC1913b<C33487Ia2<Value>> f37020a;

        /* renamed from: b */
        public final /* synthetic */ UD3<Key, Value> f37021b;

        public C8220d(UD3 ud3, AbstractC32569Ec2.AbstractC1913b<C33487Ia2<Value>> loadCallback) {
            Intrinsics.checkNotNullParameter(loadCallback, "loadCallback");
            this.f37021b = ud3;
            this.f37020a = loadCallback;
        }

        @Override // p000.UD3.InterfaceC8221e
        /* renamed from: a */
        public void mo81809a(List<? extends Value> data) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(data, "data");
            List<? extends Value> list = data;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(new C33487Ia2(i, obj));
                i = i2;
            }
            this.f37020a.mo71704a(arrayList);
        }

        @Override // p000.UD3.InterfaceC8221e
        /* renamed from: b */
        public void mo81808b(List<? extends Value> data, int i, int i2) {
            int collectionSizeOrDefault;
            Intrinsics.checkNotNullParameter(data, "data");
            List<? extends Value> list = data;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(new C33487Ia2(i3 + i, obj));
                i3 = i4;
            }
            this.f37020a.mo71703b(arrayList, i, i2);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003H&J&\u0010\n\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&¨\u0006\u000b"}, m28432d2 = {"LUD3$e;", "Value", "", "", MessageExtension.FIELD_DATA, "", C17296a.f69688o, "", "position", "totalCount", "b", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: UD3$e */
    /* loaded from: classes4.dex */
    public interface InterfaceC8221e<Value> {
        /* renamed from: a */
        void mo81809a(List<? extends Value> list);

        /* renamed from: b */
        void mo81808b(List<? extends Value> list, int i, int i2);
    }

    /* renamed from: E */
    public abstract boolean mo23898E(Value value, Value value2);

    @Override // p000.AbstractC32569Ec2
    /* renamed from: F */
    public final TD3<Key, Value> getKey(C33487Ia2<Value> item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new TD3<>(item.m101904b(), mo23897G(item.m101904b(), item.m101903c()), item.m101903c());
    }

    /* renamed from: G */
    public abstract Key mo23897G(long j, Value value);

    /* renamed from: H */
    public abstract void mo23896H(AbstractC32569Ec2.C1915d<TD3<Key, Value>> c1915d, InterfaceC8219c<Value> interfaceC8219c);

    /* renamed from: I */
    public abstract void mo23895I(AbstractC32569Ec2.C1915d<TD3<Key, Value>> c1915d, InterfaceC8219c<Value> interfaceC8219c);

    /* renamed from: J */
    public abstract void mo23894J(AbstractC32569Ec2.C1914c<TD3<Key, Value>> c1914c, InterfaceC8221e<Value> interfaceC8221e);

    /* renamed from: K */
    public final List<Value> m81812K(List<? extends Value> list, Value value) {
        boolean z;
        int size;
        Iterator<? extends Value> it = list.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (mo23898E(it.next(), value)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf.intValue() != -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            valueOf = null;
        }
        if (valueOf != null) {
            size = valueOf.intValue();
        } else {
            size = list.size();
        }
        return (List<? extends Value>) list.subList(0, size);
    }

    /* renamed from: L */
    public final List<Value> m81811L(List<? extends Value> list, Value value) {
        Iterator<? extends Value> it = list.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (mo23898E(it.next(), value)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        return (List<? extends Value>) list.subList(i + 1, list.size());
    }

    @Override // p000.AbstractC32569Ec2
    /* renamed from: r */
    public final void mo71707r(AbstractC32569Ec2.C1915d<TD3<Key, Value>> params, AbstractC32569Ec2.AbstractC1912a<C33487Ia2<Value>> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        mo23896H(params, new C8217a(this, callback, params));
    }

    @Override // p000.AbstractC32569Ec2
    /* renamed from: t */
    public final void mo71706t(AbstractC32569Ec2.C1915d<TD3<Key, Value>> params, AbstractC32569Ec2.AbstractC1912a<C33487Ia2<Value>> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        mo23895I(params, new C8218b(this, callback, params));
    }

    @Override // p000.AbstractC32569Ec2
    /* renamed from: v */
    public final void mo71705v(AbstractC32569Ec2.C1914c<TD3<Key, Value>> params, AbstractC32569Ec2.AbstractC1913b<C33487Ia2<Value>> callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        mo23894J(new AbstractC32569Ec2.C1914c<>(params.f7847a, params.f7848b, params.f7849c), new C8220d(this, callback));
    }
}

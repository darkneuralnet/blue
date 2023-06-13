package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__IndentKt;
@Metadata(m28433d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0002\u0014\u0011B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0006\u0010\u0005\u001a\u00020\u0004J\u0014\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006J\u0014\u0010\t\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006J-\u0010\r\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, m28432d2 = {"LfE3;", "", "Key", "Value", "", "c", "Lkotlin/Function0;", "onInvalidatedCallback", "e", "f", "LfE3$a;", "params", "LfE3$b;", DateTokenConverter.CONVERTER_KEY, "(LfE3$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LhE3;", TransferTable.COLUMN_STATE, "b", "(LhE3;)Ljava/lang/Object;", "Ll72;", C17296a.f69688o, "Ll72;", "invalidateCallbackTracker", "", "()Z", "invalid", "<init>", "()V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: fE3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC40818fE3<Key, Value> {

    /* renamed from: a */
    public final C44309l72<Function0<Unit>> f79717a = new C44309l72<>(C20335c.f79732g, null, 2, null);

    @Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000b*\b\b\u0002\u0010\u0002*\u00020\u00012\u00020\u0001:\u0004\u0004\u0006\u000b\u0012B\u0019\b\u0004\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0006\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00018\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u000e\u0082\u0001\u0003\u0013\u0014\u0015¨\u0006\u0016"}, m28432d2 = {"LfE3$a;", "", "Key", "", C17296a.f69688o, "I", "b", "()I", "loadSize", "", "Z", "c", "()Z", "placeholdersEnabled", "()Ljava/lang/Object;", "key", "<init>", "(IZ)V", DateTokenConverter.CONVERTER_KEY, "LfE3$a$a;", "LfE3$a$c;", "LfE3$a$d;", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: fE3$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC20325a<Key> {

        /* renamed from: c */
        public static final C20327b f79718c = new C20327b(null);

        /* renamed from: a */
        public final int f79719a;

        /* renamed from: b */
        public final boolean f79720b;

        @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003B\u001f\u0012\u0006\u0010\b\u001a\u00028\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00028\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m28432d2 = {"LfE3$a$a;", "", "Key", "LfE3$a;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Object;", C17296a.f69688o, "()Ljava/lang/Object;", "key", "", "loadSize", "", "placeholdersEnabled", "<init>", "(Ljava/lang/Object;IZ)V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
        /* renamed from: fE3$a$a */
        /* loaded from: classes.dex */
        public static final class C20326a<Key> extends AbstractC20325a<Key> {

            /* renamed from: d */
            public final Key f79721d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20326a(Key key, int i, boolean z) {
                super(i, z, null);
                Intrinsics.checkNotNullParameter(key, "key");
                this.f79721d = key;
            }

            @Override // p000.AbstractC40818fE3.AbstractC20325a
            /* renamed from: a */
            public Key mo41669a() {
                return this.f79721d;
            }
        }

        @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"LfE3$a$b;", "", "<init>", "()V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
        /* renamed from: fE3$a$b */
        /* loaded from: classes.dex */
        public static final class C20327b {
            public /* synthetic */ C20327b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C20327b() {
            }
        }

        @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003B\u001f\u0012\u0006\u0010\b\u001a\u00028\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00028\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m28432d2 = {"LfE3$a$c;", "", "Key", "LfE3$a;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Object;", C17296a.f69688o, "()Ljava/lang/Object;", "key", "", "loadSize", "", "placeholdersEnabled", "<init>", "(Ljava/lang/Object;IZ)V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
        /* renamed from: fE3$a$c */
        /* loaded from: classes.dex */
        public static final class C20328c<Key> extends AbstractC20325a<Key> {

            /* renamed from: d */
            public final Key f79722d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C20328c(Key key, int i, boolean z) {
                super(i, z, null);
                Intrinsics.checkNotNullParameter(key, "key");
                this.f79722d = key;
            }

            @Override // p000.AbstractC40818fE3.AbstractC20325a
            /* renamed from: a */
            public Key mo41669a() {
                return this.f79722d;
            }
        }

        @Metadata(m28433d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000*\b\b\u0003\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00030\u0003B!\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00018\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m28432d2 = {"LfE3$a$d;", "", "Key", "LfE3$a;", DateTokenConverter.CONVERTER_KEY, "Ljava/lang/Object;", C17296a.f69688o, "()Ljava/lang/Object;", "key", "", "loadSize", "", "placeholdersEnabled", "<init>", "(Ljava/lang/Object;IZ)V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
        /* renamed from: fE3$a$d */
        /* loaded from: classes.dex */
        public static final class C20329d<Key> extends AbstractC20325a<Key> {

            /* renamed from: d */
            public final Key f79723d;

            public C20329d(Key key, int i, boolean z) {
                super(i, z, null);
                this.f79723d = key;
            }

            @Override // p000.AbstractC40818fE3.AbstractC20325a
            /* renamed from: a */
            public Key mo41669a() {
                return this.f79723d;
            }
        }

        public /* synthetic */ AbstractC20325a(int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, z);
        }

        /* renamed from: a */
        public abstract Key mo41669a();

        /* renamed from: b */
        public final int m41671b() {
            return this.f79719a;
        }

        /* renamed from: c */
        public final boolean m41670c() {
            return this.f79720b;
        }

        public AbstractC20325a(int i, boolean z) {
            this.f79719a = i;
            this.f79720b = z;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u0001*\b\b\u0003\u0010\u0003*\u00020\u00012\u00020\u0001:\u0003\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, m28432d2 = {"LfE3$b;", "", "Key", "Value", "<init>", "()V", C17296a.f69688o, "b", "c", "LfE3$b$a;", "LfE3$b$b;", "LfE3$b$c;", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: fE3$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC20330b<Key, Value> {

        @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0086\b\u0018\u0000*\b\b\u0004\u0010\u0002*\u00020\u0001*\b\b\u0005\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0010\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, m28432d2 = {"LfE3$b$a;", "", "Key", "Value", "LfE3$b;", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "", C17296a.f69688o, "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "throwable", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
        /* renamed from: fE3$b$a */
        /* loaded from: classes.dex */
        public static final class C20331a<Key, Value> extends AbstractC20330b<Key, Value> {

            /* renamed from: a */
            public final Throwable f79724a;

            /* renamed from: a */
            public final Throwable m41668a() {
                return this.f79724a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C20331a) && Intrinsics.areEqual(this.f79724a, ((C20331a) obj).f79724a);
            }

            public int hashCode() {
                return this.f79724a.hashCode();
            }

            public String toString() {
                String trimMargin$default;
                trimMargin$default = StringsKt__IndentKt.trimMargin$default("LoadResult.Error(\n                    |   throwable: " + this.f79724a + "\n                    |) ", null, 1, null);
                return trimMargin$default;
            }
        }

        @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000*\b\b\u0004\u0010\u0002*\u00020\u0001*\b\b\u0005\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0004B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, m28432d2 = {"LfE3$b$b;", "", "Key", "Value", "LfE3$b;", "", "toString", "<init>", "()V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
        /* renamed from: fE3$b$b */
        /* loaded from: classes.dex */
        public static final class C20332b<Key, Value> extends AbstractC20330b<Key, Value> {
            public C20332b() {
                super(null);
            }

            public String toString() {
                return "LoadResult.Invalid";
            }
        }

        @Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0014\b\u0086\b\u0018\u0000 \u0013*\b\b\u0004\u0010\u0002*\u00020\u0001*\b\b\u0005\u0010\u0003*\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\u0004:\u0001\rB=\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00050\f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00018\u0004\u0012\b\u0010\u0018\u001a\u0004\u0018\u00018\u0004\u0012\b\b\u0003\u0010\u001c\u001a\u00020\u0007\u0012\b\b\u0003\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00050\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0015\u001a\u0004\u0018\u00018\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0018\u001a\u0004\u0018\u00018\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0017\u0010\u001c\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u001d\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0016\u0010\u001b¨\u0006 "}, m28432d2 = {"LfE3$b$c;", "", "Key", "Value", "LfE3$b;", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "", C17296a.f69688o, "Ljava/util/List;", "b", "()Ljava/util/List;", MessageExtension.FIELD_DATA, "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "prevKey", "c", "e", "nextKey", DateTokenConverter.CONVERTER_KEY, "I", "()I", "itemsBefore", "itemsAfter", "<init>", "(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;II)V", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
        /* renamed from: fE3$b$c */
        /* loaded from: classes.dex */
        public static final class C20333c<Key, Value> extends AbstractC20330b<Key, Value> {

            /* renamed from: f */
            public static final C20334a f79725f = new C20334a(null);

            /* renamed from: g */
            public static final C20333c f79726g;

            /* renamed from: a */
            public final List<Value> f79727a;

            /* renamed from: b */
            public final Key f79728b;

            /* renamed from: c */
            public final Key f79729c;

            /* renamed from: d */
            public final int f79730d;

            /* renamed from: e */
            public final int f79731e;

            @Metadata(m28433d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\fJ/\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u0004\"\b\b\u0006\u0010\u0002*\u00020\u0001\"\b\b\u0007\u0010\u0003*\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R,\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00048\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, m28432d2 = {"LfE3$b$c$a;", "", "Key", "Value", "LfE3$b$c;", C17296a.f69688o, "()LfE3$b$c;", "", "EMPTY", "LfE3$b$c;", "b", "getEMPTY$paging_common$annotations", "()V", "", "COUNT_UNDEFINED", "I", "<init>", "paging-common"}, m28431k = 1, m28430mv = {1, 7, 1})
            /* renamed from: fE3$b$c$a */
            /* loaded from: classes.dex */
            public static final class C20334a {
                public /* synthetic */ C20334a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                /* renamed from: a */
                public final <Key, Value> C20333c<Key, Value> m41661a() {
                    C20333c<Key, Value> m41660b = m41660b();
                    Intrinsics.checkNotNull(m41660b, "null cannot be cast to non-null type androidx.paging.PagingSource.LoadResult.Page<Key of androidx.paging.PagingSource.LoadResult.Page.Companion.empty, Value of androidx.paging.PagingSource.LoadResult.Page.Companion.empty>");
                    return m41660b;
                }

                /* renamed from: b */
                public final C20333c m41660b() {
                    return C20333c.f79726g;
                }

                private C20334a() {
                }
            }

            static {
                List emptyList;
                emptyList = CollectionsKt__CollectionsKt.emptyList();
                f79726g = new C20333c(emptyList, null, null, 0, 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C20333c(List<? extends Value> data, Key key, Key key2, int i, int i2) {
                super(null);
                boolean z;
                Intrinsics.checkNotNullParameter(data, "data");
                this.f79727a = data;
                this.f79728b = key;
                this.f79729c = key2;
                this.f79730d = i;
                this.f79731e = i2;
                boolean z2 = false;
                if (i != Integer.MIN_VALUE && i < 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    if ((i2 == Integer.MIN_VALUE || i2 >= 0) ? true : z2) {
                        return;
                    }
                    throw new IllegalArgumentException("itemsAfter cannot be negative".toString());
                }
                throw new IllegalArgumentException("itemsBefore cannot be negative".toString());
            }

            /* renamed from: b */
            public final List<Value> m41666b() {
                return this.f79727a;
            }

            /* renamed from: c */
            public final int m41665c() {
                return this.f79731e;
            }

            /* renamed from: d */
            public final int m41664d() {
                return this.f79730d;
            }

            /* renamed from: e */
            public final Key m41663e() {
                return this.f79729c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C20333c) {
                    C20333c c20333c = (C20333c) obj;
                    return Intrinsics.areEqual(this.f79727a, c20333c.f79727a) && Intrinsics.areEqual(this.f79728b, c20333c.f79728b) && Intrinsics.areEqual(this.f79729c, c20333c.f79729c) && this.f79730d == c20333c.f79730d && this.f79731e == c20333c.f79731e;
                }
                return false;
            }

            /* renamed from: f */
            public final Key m41662f() {
                return this.f79728b;
            }

            public int hashCode() {
                int hashCode = this.f79727a.hashCode() * 31;
                Key key = this.f79728b;
                int hashCode2 = (hashCode + (key == null ? 0 : key.hashCode())) * 31;
                Key key2 = this.f79729c;
                return ((((hashCode2 + (key2 != null ? key2.hashCode() : 0)) * 31) + Integer.hashCode(this.f79730d)) * 31) + Integer.hashCode(this.f79731e);
            }

            public String toString() {
                Object firstOrNull;
                Object lastOrNull;
                String trimMargin$default;
                StringBuilder sb = new StringBuilder();
                sb.append("LoadResult.Page(\n                    |   data size: ");
                sb.append(this.f79727a.size());
                sb.append("\n                    |   first Item: ");
                firstOrNull = CollectionsKt___CollectionsKt.firstOrNull((List<? extends Object>) this.f79727a);
                sb.append(firstOrNull);
                sb.append("\n                    |   last Item: ");
                lastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) this.f79727a);
                sb.append(lastOrNull);
                sb.append("\n                    |   nextKey: ");
                sb.append(this.f79729c);
                sb.append("\n                    |   prevKey: ");
                sb.append(this.f79728b);
                sb.append("\n                    |   itemsBefore: ");
                sb.append(this.f79730d);
                sb.append("\n                    |   itemsAfter: ");
                sb.append(this.f79731e);
                sb.append("\n                    |) ");
                trimMargin$default = StringsKt__IndentKt.trimMargin$default(sb.toString(), null, 1, null);
                return trimMargin$default;
            }
        }

        public /* synthetic */ AbstractC20330b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC20330b() {
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"", "Key", "Value", "Lkotlin/Function0;", "", "it", C17296a.f69688o, "(Lkotlin/jvm/functions/Function0;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: fE3$c */
    /* loaded from: classes.dex */
    public static final class C20335c extends Lambda implements Function1<Function0<? extends Unit>, Unit> {

        /* renamed from: g */
        public static final C20335c f79732g = new C20335c();

        public C20335c() {
            super(1);
        }

        /* renamed from: a */
        public final void m41659a(Function0<Unit> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.invoke();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Unit> function0) {
            m41659a(function0);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: a */
    public final boolean m41675a() {
        return this.f79717a.m27826a();
    }

    /* renamed from: b */
    public abstract Key mo40794b(C42004hE3<Key, Value> c42004hE3);

    /* renamed from: c */
    public final void m41674c() {
        if (this.f79717a.m27825b()) {
            C34630Mx2.m94547a();
        }
    }

    /* renamed from: d */
    public abstract Object mo40793d(AbstractC20325a<Key> abstractC20325a, Continuation<? super AbstractC20330b<Key, Value>> continuation);

    /* renamed from: e */
    public final void m41673e(Function0<Unit> onInvalidatedCallback) {
        Intrinsics.checkNotNullParameter(onInvalidatedCallback, "onInvalidatedCallback");
        this.f79717a.m27824c(onInvalidatedCallback);
    }

    /* renamed from: f */
    public final void m41672f(Function0<Unit> onInvalidatedCallback) {
        Intrinsics.checkNotNullParameter(onInvalidatedCallback, "onInvalidatedCallback");
        this.f79717a.m27823d(onInvalidatedCallback);
    }
}

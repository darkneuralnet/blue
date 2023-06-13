package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.User;
import co.bird.android.model.wire.WireBatch;
import co.bird.api.request.BatchAddBirdsRequestBody;
import co.bird.api.request.BatchCreateRequestBody;
import co.bird.api.request.BatchKind;
import co.bird.api.request.BatchRemoveBirdRequestBody;
import co.bird.api.response.BatchBird;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.InterfaceC23447K;
import io.reactivex.functions.InterfaceC23492o;
import io.reactivex.schedulers.C24542a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J*\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\n0\u00062\u0006\u0010\t\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016J\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\n0\u0006H\u0016J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\n0\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u001e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0016R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"LiF;", "LfF;", "", "description", "Lco/bird/api/request/BatchKind;", "batchKind", "Lio/reactivex/F;", "Lco/bird/android/model/wire/WireBatch;", "e", "batchId", "", "birdsIds", "Lco/bird/api/response/BatchBird;", "b", "c", C17296a.f69688o, "birdId", DateTokenConverter.CONVERTER_KEY, "LVE;", "LVE;", "batchClient", "Llh6;", "Llh6;", "userManager", "<init>", "(LVE;Llh6;)V", "batch_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: iF */
/* loaded from: classes4.dex */
public final class C23174iF implements InterfaceC20340fF {

    /* renamed from: a */
    public final InterfaceC8580VE f87031a;

    /* renamed from: b */
    public final InterfaceC44647lh6 f87032b;

    @Metadata(m28433d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a*\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0014\u0012\u000e\b\u0001\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"Lco/bird/android/model/User;", "user", "Lio/reactivex/K;", "Lco/bird/android/model/wire/WireBatch;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/User;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iF$a */
    /* loaded from: classes4.dex */
    public static final class C23175a extends Lambda implements Function1<User, InterfaceC23447K<? extends WireBatch>> {

        /* renamed from: h */
        public final /* synthetic */ String f87034h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23175a(String str) {
            super(1);
            this.f87034h = str;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends WireBatch> invoke(User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            InterfaceC8580VE interfaceC8580VE = C23174iF.this.f87031a;
            String id = user.getId();
            String str = this.f87034h;
            String warehouseId = user.getWarehouseId();
            if (warehouseId == null) {
                warehouseId = "";
            }
            return interfaceC8580VE.m80184c(new BatchCreateRequestBody(id, str, warehouseId, null, 8, null));
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001aB\u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003 \u0005* \u0012\u001a\b\u0001\u0012\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m28432d2 = {"Lco/bird/android/model/User;", "user", "Lio/reactivex/K;", "", "Lco/bird/android/model/wire/WireBatch;", "kotlin.jvm.PlatformType", C17296a.f69688o, "(Lco/bird/android/model/User;)Lio/reactivex/K;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: iF$b */
    /* loaded from: classes4.dex */
    public static final class C23176b extends Lambda implements Function1<User, InterfaceC23447K<? extends List<? extends WireBatch>>> {
        public C23176b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final InterfaceC23447K<? extends List<WireBatch>> invoke(User user) {
            Intrinsics.checkNotNullParameter(user, "user");
            InterfaceC8580VE interfaceC8580VE = C23174iF.this.f87031a;
            String warehouseId = user.getWarehouseId();
            if (warehouseId == null) {
                warehouseId = "";
            }
            return interfaceC8580VE.m80183d(warehouseId);
        }
    }

    public C23174iF(InterfaceC8580VE batchClient, InterfaceC44647lh6 userManager) {
        Intrinsics.checkNotNullParameter(batchClient, "batchClient");
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        this.f87031a = batchClient;
        this.f87032b = userManager;
    }

    /* renamed from: h */
    public static final InterfaceC23447K m34289h(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    /* renamed from: i */
    public static final InterfaceC23447K m34288i(Function1 tmp0, Object obj) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (InterfaceC23447K) tmp0.invoke(obj);
    }

    @Override // p000.InterfaceC20340fF
    /* renamed from: a */
    public AbstractC23442F<List<BatchBird>> mo34296a(String batchId) {
        Intrinsics.checkNotNullParameter(batchId, "batchId");
        AbstractC23442F<List<BatchBird>> m33142Y = this.f87031a.m80186a(batchId).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "batchClient.getBirdsByBa…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC20340fF
    /* renamed from: b */
    public AbstractC23442F<List<BatchBird>> mo34295b(String batchId, List<String> birdsIds) {
        Intrinsics.checkNotNullParameter(batchId, "batchId");
        Intrinsics.checkNotNullParameter(birdsIds, "birdsIds");
        AbstractC23442F<List<BatchBird>> m33142Y = this.f87031a.m80182e(new BatchAddBirdsRequestBody(batchId, birdsIds)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "batchClient.addVehiclesT…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC20340fF
    /* renamed from: c */
    public AbstractC23442F<List<WireBatch>> mo34294c() {
        AbstractC23442F<User> user = this.f87032b.getUser();
        final C23176b c23176b = new C23176b();
        AbstractC23442F<List<WireBatch>> m33142Y = user.m33165A(new InterfaceC23492o() { // from class: gF
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m34288i;
                m34288i = C23174iF.m34288i(Function1.this, obj);
                return m34288i;
            }
        }).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "override fun getBatchesF…beOn(Schedulers.io())\n  }");
        return m33142Y;
    }

    @Override // p000.InterfaceC20340fF
    /* renamed from: d */
    public AbstractC23442F<BatchBird> mo34293d(String batchId, String birdId) {
        Intrinsics.checkNotNullParameter(batchId, "batchId");
        Intrinsics.checkNotNullParameter(birdId, "birdId");
        AbstractC23442F<BatchBird> m33142Y = this.f87031a.m80185b(new BatchRemoveBirdRequestBody(batchId, birdId)).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "batchClient.removeVehicl…scribeOn(Schedulers.io())");
        return m33142Y;
    }

    @Override // p000.InterfaceC20340fF
    /* renamed from: e */
    public AbstractC23442F<WireBatch> mo34292e(String description, BatchKind batchKind) {
        Intrinsics.checkNotNullParameter(description, "description");
        AbstractC23442F<User> user = this.f87032b.getUser();
        final C23175a c23175a = new C23175a(description);
        AbstractC23442F<WireBatch> m33142Y = user.m33165A(new InterfaceC23492o() { // from class: hF
            @Override // io.reactivex.functions.InterfaceC23492o
            public final Object apply(Object obj) {
                InterfaceC23447K m34289h;
                m34289h = C23174iF.m34289h(Function1.this, obj);
                return m34289h;
            }
        }).m33142Y(C24542a.m31932c());
        Intrinsics.checkNotNullExpressionValue(m33142Y, "override fun createBatch…beOn(Schedulers.io())\n  }");
        return m33142Y;
    }
}

package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.RetryableContiguousDataSource;
import com.facebook.share.internal.C17296a;
import com.uber.autodispose.ScopeProvider;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.WS0;
@Metadata(m28433d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0004\u0012\u00028\u00010\u0004B#\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0004\u0012\u00028\u00010\u0006H\u0016J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bR \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0017\u001a\u0010\u0012\f\u0012\n \u0014*\u0004\u0018\u00010\t0\t0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m28432d2 = {"LtO4;", "K", "", "V", "LWS0$c;", "LTD3;", "LWS0;", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/Observable;", "Lco/bird/android/model/RetryableContiguousDataSource;", "h", "LsO4;", C17296a.f69688o, "LsO4;", "dataSourceDelegateFactory", "Lcom/uber/autodispose/ScopeProvider;", "b", "Lcom/uber/autodispose/ScopeProvider;", "scopeProvider", "LAG;", "kotlin.jvm.PlatformType", "c", "LAG;", "dataSource", "<init>", "(LsO4;Lcom/uber/autodispose/ScopeProvider;)V", "widget_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRetryablePageItemKeyedDataSourceFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RetryablePageItemKeyedDataSourceFactory.kt\nco/bird/android/widget/paging/pageitem/RetryablePageItemKeyedDataSourceFactory\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,26:1\n1#2:27\n*E\n"})
/* renamed from: tO4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C49210tO4<K, V> extends WS0.AbstractC9025c<TD3<K, V>, V> {

    /* renamed from: a */
    public final InterfaceC48617sO4<K, V> f110396a;

    /* renamed from: b */
    public final ScopeProvider f110397b;

    /* renamed from: c */
    public final C0058AG<RetryableContiguousDataSource> f110398c;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28432d2 = {"K", "", "V", "LIa2;", "item", C17296a.f69688o, "(LIa2;)Ljava/lang/Object;"}, m28431k = 3, m28430mv = {1, 8, 0})
    /* renamed from: tO4$a */
    /* loaded from: classes4.dex */
    public static final class C28696a extends Lambda implements Function1<C33487Ia2<V>, V> {

        /* renamed from: g */
        public static final C28696a f110399g = new C28696a();

        public C28696a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a */
        public final V invoke(C33487Ia2<V> item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return item.m101903c();
        }
    }

    public C49210tO4(InterfaceC48617sO4<K, V> dataSourceDelegateFactory, ScopeProvider scopeProvider) {
        Intrinsics.checkNotNullParameter(dataSourceDelegateFactory, "dataSourceDelegateFactory");
        Intrinsics.checkNotNullParameter(scopeProvider, "scopeProvider");
        this.f110396a = dataSourceDelegateFactory;
        this.f110397b = scopeProvider;
        C0058AG<RetryableContiguousDataSource> m115951g = C0058AG.m115951g();
        Intrinsics.checkNotNullExpressionValue(m115951g, "create<RetryableContiguousDataSource>()");
        this.f110398c = m115951g;
    }

    @Override // p000.WS0.AbstractC9025c
    /* renamed from: d */
    public WS0<TD3<K, V>, V> mo12437d() {
        C45653nO4 c45653nO4 = new C45653nO4(this.f110396a.create(), this.f110397b);
        this.f110398c.accept(c45653nO4);
        return c45653nO4.map(C28696a.f110399g);
    }

    /* renamed from: h */
    public final Observable<RetryableContiguousDataSource> m12436h() {
        Observable<RetryableContiguousDataSource> hide = this.f110398c.hide();
        Intrinsics.checkNotNullExpressionValue(hide, "dataSource.hide()");
        return hide;
    }
}

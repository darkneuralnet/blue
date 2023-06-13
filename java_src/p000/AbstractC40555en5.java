package p000;

import com.facebook.share.internal.C17296a;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b'\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m28432d2 = {"Len5;", "", "<init>", "()V", C17296a.f69688o, "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
@Module
/* renamed from: en5  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC40555en5 {

    /* renamed from: a */
    public static final C20101a f78857a = new C20101a(null);

    @Metadata(m28433d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, m28432d2 = {"Len5$a;", "", "LEa;", "analyticsManager", "Lcn5;", C17296a.f69688o, "<init>", "()V", "co.bird.android.feature.scrap"}, m28431k = 1, m28430mv = {1, 8, 0})
    @Module(includes = {AbstractC40555en5.class})
    /* renamed from: en5$a */
    /* loaded from: classes3.dex */
    public static final class C20101a {
        public /* synthetic */ C20101a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Provides
        @JvmStatic
        /* renamed from: a */
        public final InterfaceC39352cn5 m42555a(InterfaceC1880Ea analyticsManager) {
            Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
            return new C39962dn5(analyticsManager);
        }

        private C20101a() {
        }
    }

    @Provides
    @JvmStatic
    /* renamed from: a */
    public static final InterfaceC39352cn5 m42556a(InterfaceC1880Ea interfaceC1880Ea) {
        return f78857a.m42555a(interfaceC1880Ea);
    }
}

package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.wire.WirePhysicalLock;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, m28432d2 = {"LO12;", "", "<init>", "()V", C17296a.f69688o, "b", "c", DateTokenConverter.CONVERTER_KEY, "e", "LO12$a;", "LO12$b;", "LO12$e;", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: O12 */
/* loaded from: classes2.dex */
public abstract class O12 {

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"LO12$a;", "LO12;", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: O12$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC5809a extends O12 {
        public AbstractC5809a() {
            super(null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"LO12$b;", "LO12;", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: O12$b */
    /* loaded from: classes2.dex */
    public static final class C5810b extends O12 {

        /* renamed from: a */
        public static final C5810b f25522a = new C5810b();

        private C5810b() {
            super(null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, m28432d2 = {"LO12$c;", "LO12$a;", "Lco/bird/android/model/wire/WirePhysicalLock;", C17296a.f69688o, "Lco/bird/android/model/wire/WirePhysicalLock;", "()Lco/bird/android/model/wire/WirePhysicalLock;", "physicalLock", "<init>", "(Lco/bird/android/model/wire/WirePhysicalLock;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: O12$c */
    /* loaded from: classes2.dex */
    public static final class C5811c extends AbstractC5809a {

        /* renamed from: a */
        public final WirePhysicalLock f25523a;

        public C5811c(WirePhysicalLock physicalLock) {
            Intrinsics.checkNotNullParameter(physicalLock, "physicalLock");
            this.f25523a = physicalLock;
        }

        /* renamed from: a */
        public WirePhysicalLock m92997a() {
            return this.f25523a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\t"}, m28432d2 = {"LO12$d;", "LO12$a;", "Lco/bird/android/model/wire/WirePhysicalLock;", C17296a.f69688o, "Lco/bird/android/model/wire/WirePhysicalLock;", "()Lco/bird/android/model/wire/WirePhysicalLock;", "physicalLock", "<init>", "(Lco/bird/android/model/wire/WirePhysicalLock;)V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: O12$d */
    /* loaded from: classes2.dex */
    public static final class C5812d extends AbstractC5809a {

        /* renamed from: a */
        public final WirePhysicalLock f25524a;

        public C5812d(WirePhysicalLock physicalLock) {
            Intrinsics.checkNotNullParameter(physicalLock, "physicalLock");
            this.f25524a = physicalLock;
        }

        /* renamed from: a */
        public WirePhysicalLock m92996a() {
            return this.f25524a;
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m28432d2 = {"LO12$e;", "LO12;", "<init>", "()V", "app_birdRelease"}, m28431k = 1, m28430mv = {1, 8, 0})
    /* renamed from: O12$e */
    /* loaded from: classes2.dex */
    public static final class C5813e extends O12 {

        /* renamed from: a */
        public static final C5813e f25525a = new C5813e();

        private C5813e() {
            super(null);
        }
    }

    public /* synthetic */ O12(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private O12() {
    }
}

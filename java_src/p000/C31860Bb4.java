package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.QCAutoCheck;
import co.bird.android.model.QCInspection;
import co.bird.android.model.constant.QCStatus;
import co.bird.android.model.constant.QualityControlFlow;
import co.bird.android.model.wire.WireBird;
import com.facebook.share.internal.C17296a;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0016\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016J\u001e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\bH\u0016R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0015R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m28432d2 = {"LBb4;", "LAb4;", "Lco/bird/android/model/wire/WireBird;", "bird", "Lco/bird/android/model/constant/QualityControlFlow;", "flow", "", "b", "", "Lco/bird/android/model/QCAutoCheck;", "qcAutoChecks", C17296a.f69688o, "", "passed", "Lco/bird/android/model/QCInspection;", "qcInspections", "c", "LEa;", "LEa;", "analyticsManager", "", "Ljava/lang/String;", "sessionId", "Lco/bird/android/model/wire/WireBird;", DateTokenConverter.CONVERTER_KEY, "Lco/bird/android/model/constant/QualityControlFlow;", "e", "Ljava/util/List;", "<init>", "(LEa;)V", "quality-control-analytics_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nQualityControlAnalyticsManagerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QualityControlAnalyticsManagerImpl.kt\nco/bird/android/manager/qualitycontrolanalytics/QualityControlAnalyticsManagerImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n1#2:71\n1774#3,4:72\n1774#3,4:76\n1774#3,4:80\n1774#3,4:84\n*S KotlinDebug\n*F\n+ 1 QualityControlAnalyticsManagerImpl.kt\nco/bird/android/manager/qualitycontrolanalytics/QualityControlAnalyticsManagerImpl\n*L\n56#1:72,4\n57#1:76,4\n59#1:80,4\n60#1:84,4\n*E\n"})
/* renamed from: Bb4  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C31860Bb4 implements InterfaceC31626Ab4 {

    /* renamed from: a */
    public final InterfaceC1880Ea f2545a;

    /* renamed from: b */
    public String f2546b;

    /* renamed from: c */
    public WireBird f2547c;

    /* renamed from: d */
    public QualityControlFlow f2548d;

    /* renamed from: e */
    public List<QCAutoCheck> f2549e;

    public C31860Bb4(InterfaceC1880Ea analyticsManager) {
        Intrinsics.checkNotNullParameter(analyticsManager, "analyticsManager");
        this.f2545a = analyticsManager;
    }

    @Override // p000.InterfaceC31626Ab4
    /* renamed from: a */
    public void mo113829a(List<QCAutoCheck> qcAutoChecks) {
        Intrinsics.checkNotNullParameter(qcAutoChecks, "qcAutoChecks");
        this.f2549e = qcAutoChecks;
    }

    @Override // p000.InterfaceC31626Ab4
    /* renamed from: b */
    public void mo113828b(WireBird bird, QualityControlFlow qualityControlFlow) {
        Intrinsics.checkNotNullParameter(bird, "bird");
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
        this.f2546b = uuid;
        this.f2547c = bird;
        this.f2548d = qualityControlFlow;
        this.f2549e = null;
        this.f2545a.mo55905y(new C34911Oc4(null, null, null, uuid, bird.getId(), bird.getModel(), 7, null));
    }

    @Override // p000.InterfaceC31626Ab4
    /* renamed from: c */
    public void mo113827c(boolean z, List<QCInspection> qcInspections) {
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        String str;
        String name;
        int i6;
        int i7;
        Intrinsics.checkNotNullParameter(qcInspections, "qcInspections");
        String str2 = this.f2546b;
        WireBird wireBird = this.f2547c;
        if (str2 != null && wireBird != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            InterfaceC1880Ea interfaceC1880Ea = this.f2545a;
            List<QCAutoCheck> list = this.f2549e;
            if (list != null) {
                i = list.size();
            } else {
                i = 0;
            }
            List<QCAutoCheck> list2 = this.f2549e;
            if (list2 != null) {
                List<QCAutoCheck> list3 = list2;
                if ((list3 instanceof Collection) && list3.isEmpty()) {
                    i7 = 0;
                } else {
                    i7 = 0;
                    for (QCAutoCheck qCAutoCheck : list3) {
                        if (qCAutoCheck.getPassed() && (i7 = i7 + 1) < 0) {
                            CollectionsKt__CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                i2 = i7;
            } else {
                i2 = 0;
            }
            List<QCAutoCheck> list4 = this.f2549e;
            if (list4 != null) {
                List<QCAutoCheck> list5 = list4;
                if ((list5 instanceof Collection) && list5.isEmpty()) {
                    i6 = 0;
                } else {
                    i6 = 0;
                    for (QCAutoCheck qCAutoCheck2 : list5) {
                        if ((!qCAutoCheck2.getPassed()) && (i6 = i6 + 1) < 0) {
                            CollectionsKt__CollectionsKt.throwCountOverflow();
                        }
                    }
                }
                i3 = i6;
            } else {
                i3 = 0;
            }
            int size = qcInspections.size();
            List<QCInspection> list6 = qcInspections;
            boolean z5 = list6 instanceof Collection;
            if (z5 && list6.isEmpty()) {
                i4 = 0;
            } else {
                int i8 = 0;
                for (QCInspection qCInspection : list6) {
                    if (qCInspection.getStatus() == QCStatus.PASSED) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3 && (i8 = i8 + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
                i4 = i8;
            }
            if (z5 && list6.isEmpty()) {
                i5 = 0;
            } else {
                int i9 = 0;
                for (QCInspection qCInspection2 : list6) {
                    if (qCInspection2.getStatus() == QCStatus.FAILED) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4 && (i9 = i9 + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
                i5 = i9;
            }
            QualityControlFlow qualityControlFlow = this.f2548d;
            if (qualityControlFlow != null && (name = qualityControlFlow.name()) != null) {
                str = name.toLowerCase();
                Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).toLowerCase()");
            } else {
                str = null;
            }
            interfaceC1880Ea.mo55905y(new C32094Cb4(null, null, null, str2, z, i, i3, i2, size, i5, i4, str, 7, null));
            this.f2546b = null;
            this.f2547c = null;
            this.f2549e = null;
            return;
        }
        throw new IllegalArgumentException("Cannot complete quality control without starting one first".toString());
    }
}

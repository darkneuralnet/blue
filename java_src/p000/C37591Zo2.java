package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import co.bird.android.model.LegacyRepairType;
import com.facebook.share.internal.C17296a;
import io.reactivex.AbstractC23442F;
import io.reactivex.AbstractC23461c;
import io.reactivex.AbstractC24507p;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BQ\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b(\u0010)J[\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, m28432d2 = {"LZo2;", "T", "LWX;", "Lbi3;", "opMode", "Lio/reactivex/F;", "single", "Lio/reactivex/Observable;", "observable", "Lio/reactivex/p;", "maybe", "Lio/reactivex/c;", "completable", "b", "", "toString", "", "hashCode", "", LegacyRepairType.OTHER_KEY, "", "equals", C17296a.f69688o, "Lbi3;", "()Lbi3;", "Lio/reactivex/F;", "getSingle", "()Lio/reactivex/F;", "c", "Lio/reactivex/Observable;", "getObservable", "()Lio/reactivex/Observable;", DateTokenConverter.CONVERTER_KEY, "Lio/reactivex/p;", "getMaybe", "()Lio/reactivex/p;", "e", "Lio/reactivex/c;", "getCompletable", "()Lio/reactivex/c;", "<init>", "(Lbi3;Lio/reactivex/F;Lio/reactivex/Observable;Lio/reactivex/p;Lio/reactivex/c;)V", "interface_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Zo2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C37591Zo2<T> implements InterfaceC9077WX {

    /* renamed from: a */
    public final EnumC38707bi3 f49275a;

    /* renamed from: b */
    public final AbstractC23442F<T> f49276b;

    /* renamed from: c */
    public final Observable<T> f49277c;

    /* renamed from: d */
    public final AbstractC24507p<T> f49278d;

    /* renamed from: e */
    public final AbstractC23461c f49279e;

    public C37591Zo2(EnumC38707bi3 opMode, AbstractC23442F<T> abstractC23442F, Observable<T> observable, AbstractC24507p<T> abstractC24507p, AbstractC23461c abstractC23461c) {
        Intrinsics.checkNotNullParameter(opMode, "opMode");
        this.f49275a = opMode;
        this.f49276b = abstractC23442F;
        this.f49277c = observable;
        this.f49278d = abstractC24507p;
        this.f49279e = abstractC23461c;
    }

    public static /* synthetic */ C37591Zo2 copy$default(C37591Zo2 c37591Zo2, EnumC38707bi3 enumC38707bi3, AbstractC23442F abstractC23442F, Observable observable, AbstractC24507p abstractC24507p, AbstractC23461c abstractC23461c, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC38707bi3 = c37591Zo2.f49275a;
        }
        AbstractC23442F<T> abstractC23442F2 = abstractC23442F;
        if ((i & 2) != 0) {
            abstractC23442F2 = c37591Zo2.f49276b;
        }
        AbstractC23442F abstractC23442F3 = abstractC23442F2;
        Observable<T> observable2 = observable;
        if ((i & 4) != 0) {
            observable2 = c37591Zo2.f49277c;
        }
        Observable observable3 = observable2;
        AbstractC24507p<T> abstractC24507p2 = abstractC24507p;
        if ((i & 8) != 0) {
            abstractC24507p2 = c37591Zo2.f49278d;
        }
        AbstractC24507p abstractC24507p3 = abstractC24507p2;
        if ((i & 16) != 0) {
            abstractC23461c = c37591Zo2.f49279e;
        }
        return c37591Zo2.m72480b(enumC38707bi3, abstractC23442F3, observable3, abstractC24507p3, abstractC23461c);
    }

    @Override // p000.InterfaceC9077WX
    /* renamed from: a */
    public EnumC38707bi3 mo7691a() {
        return this.f49275a;
    }

    /* renamed from: b */
    public final C37591Zo2<T> m72480b(EnumC38707bi3 opMode, AbstractC23442F<T> abstractC23442F, Observable<T> observable, AbstractC24507p<T> abstractC24507p, AbstractC23461c abstractC23461c) {
        Intrinsics.checkNotNullParameter(opMode, "opMode");
        return new C37591Zo2<>(opMode, abstractC23442F, observable, abstractC24507p, abstractC23461c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C37591Zo2) {
            C37591Zo2 c37591Zo2 = (C37591Zo2) obj;
            return this.f49275a == c37591Zo2.f49275a && Intrinsics.areEqual(this.f49276b, c37591Zo2.f49276b) && Intrinsics.areEqual(this.f49277c, c37591Zo2.f49277c) && Intrinsics.areEqual(this.f49278d, c37591Zo2.f49278d) && Intrinsics.areEqual(this.f49279e, c37591Zo2.f49279e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f49275a.hashCode() * 31;
        AbstractC23442F<T> abstractC23442F = this.f49276b;
        int hashCode2 = (hashCode + (abstractC23442F == null ? 0 : abstractC23442F.hashCode())) * 31;
        Observable<T> observable = this.f49277c;
        int hashCode3 = (hashCode2 + (observable == null ? 0 : observable.hashCode())) * 31;
        AbstractC24507p<T> abstractC24507p = this.f49278d;
        int hashCode4 = (hashCode3 + (abstractC24507p == null ? 0 : abstractC24507p.hashCode())) * 31;
        AbstractC23461c abstractC23461c = this.f49279e;
        return hashCode4 + (abstractC23461c != null ? abstractC23461c.hashCode() : 0);
    }

    public String toString() {
        EnumC38707bi3 enumC38707bi3 = this.f49275a;
        AbstractC23442F<T> abstractC23442F = this.f49276b;
        Observable<T> observable = this.f49277c;
        AbstractC24507p<T> abstractC24507p = this.f49278d;
        AbstractC23461c abstractC23461c = this.f49279e;
        return "LegacyBleOperationSettings(opMode=" + enumC38707bi3 + ", single=" + abstractC23442F + ", observable=" + observable + ", maybe=" + abstractC24507p + ", completable=" + abstractC23461c + ")";
    }

    public /* synthetic */ C37591Zo2(EnumC38707bi3 enumC38707bi3, AbstractC23442F abstractC23442F, Observable observable, AbstractC24507p abstractC24507p, AbstractC23461c abstractC23461c, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC38707bi3, (i & 2) != 0 ? null : abstractC23442F, (i & 4) != 0 ? null : observable, (i & 8) != 0 ? null : abstractC24507p, (i & 16) != 0 ? null : abstractC23461c);
    }
}

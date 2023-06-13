package co.bird.android.model;

import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B)\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003HÆ\u0003J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J5\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R#\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0018"}, m28432d2 = {"Lco/bird/android/model/Listing;", "", "T", "Lio/reactivex/Observable;", "LZD3;", "component1", "Lco/bird/android/model/RetryableContiguousDataSource;", "component2", "pagedList", "retryableContiguousDataSource", "copy", "", "toString", "", "hashCode", LegacyRepairType.OTHER_KEY, "", "equals", "Lio/reactivex/Observable;", "getPagedList", "()Lio/reactivex/Observable;", "getRetryableContiguousDataSource", "<init>", "(Lio/reactivex/Observable;Lio/reactivex/Observable;)V", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class Listing<T> {
    private final Observable<ZD3<T>> pagedList;
    private final Observable<RetryableContiguousDataSource> retryableContiguousDataSource;

    public Listing(Observable<ZD3<T>> pagedList, Observable<RetryableContiguousDataSource> retryableContiguousDataSource) {
        Intrinsics.checkNotNullParameter(pagedList, "pagedList");
        Intrinsics.checkNotNullParameter(retryableContiguousDataSource, "retryableContiguousDataSource");
        this.pagedList = pagedList;
        this.retryableContiguousDataSource = retryableContiguousDataSource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Listing copy$default(Listing listing, Observable observable, Observable observable2, int i, Object obj) {
        if ((i & 1) != 0) {
            observable = listing.pagedList;
        }
        if ((i & 2) != 0) {
            observable2 = listing.retryableContiguousDataSource;
        }
        return listing.copy(observable, observable2);
    }

    public final Observable<ZD3<T>> component1() {
        return this.pagedList;
    }

    public final Observable<RetryableContiguousDataSource> component2() {
        return this.retryableContiguousDataSource;
    }

    public final Listing<T> copy(Observable<ZD3<T>> pagedList, Observable<RetryableContiguousDataSource> retryableContiguousDataSource) {
        Intrinsics.checkNotNullParameter(pagedList, "pagedList");
        Intrinsics.checkNotNullParameter(retryableContiguousDataSource, "retryableContiguousDataSource");
        return new Listing<>(pagedList, retryableContiguousDataSource);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Listing) {
            Listing listing = (Listing) obj;
            return Intrinsics.areEqual(this.pagedList, listing.pagedList) && Intrinsics.areEqual(this.retryableContiguousDataSource, listing.retryableContiguousDataSource);
        }
        return false;
    }

    public final Observable<ZD3<T>> getPagedList() {
        return this.pagedList;
    }

    public final Observable<RetryableContiguousDataSource> getRetryableContiguousDataSource() {
        return this.retryableContiguousDataSource;
    }

    public int hashCode() {
        return (this.pagedList.hashCode() * 31) + this.retryableContiguousDataSource.hashCode();
    }

    public String toString() {
        Observable<ZD3<T>> observable = this.pagedList;
        Observable<RetryableContiguousDataSource> observable2 = this.retryableContiguousDataSource;
        return "Listing(pagedList=" + observable + ", retryableContiguousDataSource=" + observable2 + ")";
    }
}

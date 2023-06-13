package co.bird.android.model;

import io.reactivex.Observable;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\rH&J\b\u0010\u000f\u001a\u00020\rH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0006¨\u0006\u0010"}, m28432d2 = {"Lco/bird/android/model/RetryableContiguousDataSource;", "", "afterState", "Lio/reactivex/Observable;", "Lco/bird/android/model/ContiguousDataState;", "getAfterState", "()Lio/reactivex/Observable;", "beforeState", "getBeforeState", "initialState", "Lco/bird/android/model/ContiguousInitialDataState;", "getInitialState", "retryAfter", "", "retryBefore", "retryInitial", "model_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes4.dex */
public interface RetryableContiguousDataSource {
    Observable<ContiguousDataState> getAfterState();

    Observable<ContiguousDataState> getBeforeState();

    Observable<ContiguousInitialDataState> getInitialState();

    void retryAfter();

    void retryBefore();

    void retryInitial();
}

package com.stripe.android;

import android.content.SharedPreferences;
import com.stripe.android.model.parsers.FraudDetectionDataJsonParser;
import com.stripe.android.networking.FraudDetectionData;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;
@Metadata(m28433d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@"}, m28432d2 = {"LZC0;", "Lcom/stripe/android/networking/FraudDetectionData;", "<anonymous>"}, m28431k = 3, m28430mv = {1, 8, 0})
@DebugMetadata(m28419c = "com.stripe.android.DefaultFraudDetectionDataStore$get$2", m28418f = "FraudDetectionDataStore.kt", m28417i = {}, m28416l = {}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
/* loaded from: classes6.dex */
public final class DefaultFraudDetectionDataStore$get$2 extends SuspendLambda implements Function2<ZC0, Continuation<? super FraudDetectionData>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DefaultFraudDetectionDataStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFraudDetectionDataStore$get$2(DefaultFraudDetectionDataStore defaultFraudDetectionDataStore, Continuation<? super DefaultFraudDetectionDataStore$get$2> continuation) {
        super(2, continuation);
        this.this$0 = defaultFraudDetectionDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefaultFraudDetectionDataStore$get$2 defaultFraudDetectionDataStore$get$2 = new DefaultFraudDetectionDataStore$get$2(this.this$0, continuation);
        defaultFraudDetectionDataStore$get$2.L$0 = obj;
        return defaultFraudDetectionDataStore$get$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super FraudDetectionData> continuation) {
        return ((DefaultFraudDetectionDataStore$get$2) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m116783constructorimpl;
        SharedPreferences prefs;
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ZC0 zc0 = (ZC0) this.L$0;
            DefaultFraudDetectionDataStore defaultFraudDetectionDataStore = this.this$0;
            try {
                Result.Companion companion = Result.Companion;
                prefs = defaultFraudDetectionDataStore.getPrefs();
                String string = prefs.getString("key_fraud_detection_data", null);
                if (string == null) {
                    string = "";
                }
                JSONObject jSONObject = new JSONObject(string);
                m116783constructorimpl = Result.m116783constructorimpl(new FraudDetectionDataJsonParser(new DefaultFraudDetectionDataStore$get$2$1$timestampSupplier$1(jSONObject)).parse(jSONObject));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                m116783constructorimpl = Result.m116783constructorimpl(ResultKt.createFailure(th));
            }
            if (Result.m116789isFailureimpl(m116783constructorimpl)) {
                return null;
            }
            return m116783constructorimpl;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}

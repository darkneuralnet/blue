package com.stripe.android.uicore.text;

import android.graphics.Bitmap;
import com.stripe.android.uicore.image.StripeImageLoader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import p000.C1577Df;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
@DebugMetadata(m28419c = "com.stripe.android.uicore.text.HtmlKt$rememberRemoteImages$1", m28418f = "Html.kt", m28417i = {}, m28416l = {167}, m28415m = "invokeSuspend", m28414n = {}, m28413s = {})
@SourceDebugExtension({"SMAP\nHtml.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Html.kt\ncom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,433:1\n1549#2:434\n1620#2,3:435\n1603#2,9:438\n1855#2:447\n1856#2:449\n1612#2:450\n1238#2,4:453\n1#3:448\n442#4:451\n392#4:452\n*S KotlinDebug\n*F\n+ 1 Html.kt\ncom/stripe/android/uicore/text/HtmlKt$rememberRemoteImages$1\n*L\n161#1:434\n161#1:435,3\n167#1:438,9\n167#1:447\n167#1:449\n167#1:450\n172#1:453,4\n167#1:448\n172#1:451\n172#1:452\n*E\n"})
/* loaded from: classes7.dex */
public final class HtmlKt$rememberRemoteImages$1 extends SuspendLambda implements Function2<ZC0, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $imageAlign;
    final /* synthetic */ InterfaceC41273g01 $localDensity;
    final /* synthetic */ Function0<Unit> $onLoaded;
    final /* synthetic */ GX2<Map<String, L22>> $remoteImages;
    final /* synthetic */ List<C1577Df.C1580b<String>> $remoteUrls;
    final /* synthetic */ StripeImageLoader $stripeImageLoader;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlKt$rememberRemoteImages$1(List<C1577Df.C1580b<String>> list, GX2<Map<String, L22>> gx2, Function0<Unit> function0, StripeImageLoader stripeImageLoader, InterfaceC41273g01 interfaceC41273g01, int i, Continuation<? super HtmlKt$rememberRemoteImages$1> continuation) {
        super(2, continuation);
        this.$remoteUrls = list;
        this.$remoteImages = gx2;
        this.$onLoaded = function0;
        this.$stripeImageLoader = stripeImageLoader;
        this.$localDensity = interfaceC41273g01;
        this.$imageAlign = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HtmlKt$rememberRemoteImages$1 htmlKt$rememberRemoteImages$1 = new HtmlKt$rememberRemoteImages$1(this.$remoteUrls, this.$remoteImages, this.$onLoaded, this.$stripeImageLoader, this.$localDensity, this.$imageAlign, continuation);
        htmlKt$rememberRemoteImages$1.L$0 = obj;
        return htmlKt$rememberRemoteImages$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ZC0 zc0, Continuation<? super Unit> continuation) {
        return ((HtmlKt$rememberRemoteImages$1) create(zc0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        int collectionSizeOrDefault;
        Object m79288a;
        InterfaceC42190hZ0 m73802b;
        Map map;
        int mapCapacity;
        Pair pair;
        coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                m79288a = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            ZC0 zc0 = (ZC0) this.L$0;
            List<C1577Df.C1580b<String>> list = this.$remoteUrls;
            StripeImageLoader stripeImageLoader = this.$stripeImageLoader;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                m73802b = Z30.m73802b(zc0, null, null, new HtmlKt$rememberRemoteImages$1$deferred$1$1((C1577Df.C1580b) it.next(), stripeImageLoader, null), 3, null);
                arrayList.add(m73802b);
            }
            this.label = 1;
            m79288a = C8811Vu.m79288a(arrayList, this);
            if (m79288a == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair2 : (Iterable) m79288a) {
            Bitmap bitmap = (Bitmap) pair2.getSecond();
            if (bitmap != null) {
                pair = new Pair(pair2.getFirst(), bitmap);
            } else {
                pair = null;
            }
            if (pair != null) {
                arrayList2.add(pair);
            }
        }
        map = MapsKt__MapsKt.toMap(arrayList2);
        GX2<Map<String, L22>> gx2 = this.$remoteImages;
        InterfaceC41273g01 interfaceC41273g01 = this.$localDensity;
        int i2 = this.$imageAlign;
        StripeImageLoader stripeImageLoader2 = this.$stripeImageLoader;
        mapCapacity = MapsKt__MapsJVMKt.mapCapacity(map.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            long m5727l = C51465xB5.m5727l(CB5.m112663a(((Bitmap) entry.getValue()).getWidth(), ((Bitmap) entry.getValue()).getHeight()), 1 / interfaceC41273g01.mo3408b());
            linkedHashMap.put(key, new L22(new TU3(N26.m94415e(C51465xB5.m5730i(m5727l)), N26.m94415e(C51465xB5.m5732g(m5727l)), i2, null), C43575jt0.m29790c(858918421, true, new HtmlKt$rememberRemoteImages$1$1$1(entry, stripeImageLoader2, m5727l))));
        }
        gx2.setValue(linkedHashMap);
        this.$onLoaded.invoke();
        return Unit.INSTANCE;
    }
}

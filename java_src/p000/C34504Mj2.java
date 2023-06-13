package p000;

import android.content.Context;
import androidx.lifecycle.AbstractC11719f;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.filament.IndirectLight;
import com.google.android.filament.Skybox;
import com.google.android.filament.utils.KTX1Loader;
import com.gorisse.thomas.lifecycle.LifecycleKt;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
@Metadata(m28433d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a.\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u001a*\u0010\u000e\u001a\u00020\r*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nH\u0007\u001a$\u0010\u0013\u001a\u00020\u0012*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u001a$\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\u0010¨\u0006\u0016"}, m28432d2 = {"Lcom/google/android/filament/utils/KTX1Loader;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroidx/lifecycle/f;", "lifecycle", "", "iblKtxFileLocation", "skyboxKtxFileLocation", "Lwf1;", "f", "Ljava/nio/Buffer;", "iblKtxBuffer", "skyboxKtxBuffer", "LLj2;", C17296a.f69688o, "buffer", "Lcom/google/android/filament/utils/KTX1Loader$Options;", "options", "Lcom/google/android/filament/IndirectLight;", "b", "Lcom/google/android/filament/Skybox;", DateTokenConverter.CONVERTER_KEY, "sceneview_release"}, m28431k = 2, m28430mv = {1, 7, 1})
/* renamed from: Mj2 */
/* loaded from: classes6.dex */
public final class C34504Mj2 {

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LLifecycleOwner;", "it", "", C17296a.f69688o, "(LLifecycleOwner;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: Mj2$a */
    /* loaded from: classes6.dex */
    public static final class C5349a extends Lambda implements Function1<LifecycleOwner, Unit> {

        /* renamed from: g */
        public final /* synthetic */ KTX1Loader f23435g;

        /* renamed from: h */
        public final /* synthetic */ IndirectLight f23436h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5349a(KTX1Loader kTX1Loader, IndirectLight indirectLight) {
            super(1);
            this.f23435g = kTX1Loader;
            this.f23436h = indirectLight;
        }

        /* renamed from: a */
        public final void m94989a(LifecycleOwner it) {
            Intrinsics.checkNotNullParameter(it, "it");
            IndirectLight indirectLight = this.f23436h;
            try {
                Result.Companion companion = Result.Companion;
                D12.m111039b(indirectLight);
                Result.m116783constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.m116783constructorimpl(ResultKt.createFailure(th));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LifecycleOwner lifecycleOwner) {
            m94989a(lifecycleOwner);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28433d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m28432d2 = {"LLifecycleOwner;", "it", "", C17296a.f69688o, "(LLifecycleOwner;)V"}, m28431k = 3, m28430mv = {1, 7, 1})
    /* renamed from: Mj2$b */
    /* loaded from: classes6.dex */
    public static final class C5350b extends Lambda implements Function1<LifecycleOwner, Unit> {

        /* renamed from: g */
        public final /* synthetic */ KTX1Loader f23437g;

        /* renamed from: h */
        public final /* synthetic */ Skybox f23438h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5350b(KTX1Loader kTX1Loader, Skybox skybox) {
            super(1);
            this.f23437g = kTX1Loader;
            this.f23438h = skybox;
        }

        /* renamed from: a */
        public final void m94988a(LifecycleOwner it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Skybox skybox = this.f23438h;
            try {
                Result.Companion companion = Result.Companion;
                WD5.m78693b(skybox);
                Result.m116783constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.m116783constructorimpl(ResultKt.createFailure(th));
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LifecycleOwner lifecycleOwner) {
            m94988a(lifecycleOwner);
            return Unit.INSTANCE;
        }
    }

    @JvmOverloads
    /* renamed from: a */
    public static final C34270Lj2 m94996a(KTX1Loader kTX1Loader, AbstractC11719f lifecycle, Buffer buffer, Buffer buffer2) {
        IndirectLight indirectLight;
        float[] fArr;
        Buffer rewind;
        Intrinsics.checkNotNullParameter(kTX1Loader, "<this>");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Skybox skybox = null;
        if (buffer != null) {
            indirectLight = m94994c(kTX1Loader, lifecycle, buffer, null, 4, null);
        } else {
            indirectLight = null;
        }
        if (buffer != null && (rewind = buffer.rewind()) != null) {
            fArr = kTX1Loader.getSphericalHarmonics(rewind);
        } else {
            fArr = null;
        }
        if (buffer2 != null) {
            skybox = m94992e(kTX1Loader, lifecycle, buffer2, null, 4, null);
        }
        return new C34270Lj2(indirectLight, skybox, fArr);
    }

    /* renamed from: b */
    public static final IndirectLight m94995b(KTX1Loader kTX1Loader, AbstractC11719f lifecycle, Buffer buffer, KTX1Loader.Options options) {
        Intrinsics.checkNotNullParameter(kTX1Loader, "<this>");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(options, "options");
        IndirectLight createIndirectLight = kTX1Loader.createIndirectLight(C39939dl1.m43784c(), buffer, options);
        LifecycleKt.m45941b(lifecycle, null, null, null, null, null, new C5349a(kTX1Loader, createIndirectLight), 31, null);
        return createIndirectLight;
    }

    /* renamed from: c */
    public static /* synthetic */ IndirectLight m94994c(KTX1Loader kTX1Loader, AbstractC11719f abstractC11719f, Buffer buffer, KTX1Loader.Options options, int i, Object obj) {
        if ((i & 4) != 0) {
            options = new KTX1Loader.Options();
        }
        return m94995b(kTX1Loader, abstractC11719f, buffer, options);
    }

    /* renamed from: d */
    public static final Skybox m94993d(KTX1Loader kTX1Loader, AbstractC11719f lifecycle, Buffer buffer, KTX1Loader.Options options) {
        Intrinsics.checkNotNullParameter(kTX1Loader, "<this>");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(options, "options");
        Skybox createSkybox = kTX1Loader.createSkybox(C39939dl1.m43784c(), buffer, options);
        LifecycleKt.m45941b(lifecycle, null, null, null, null, null, new C5350b(kTX1Loader, createSkybox), 31, null);
        return createSkybox;
    }

    /* renamed from: e */
    public static /* synthetic */ Skybox m94992e(KTX1Loader kTX1Loader, AbstractC11719f abstractC11719f, Buffer buffer, KTX1Loader.Options options, int i, Object obj) {
        if ((i & 4) != 0) {
            options = new KTX1Loader.Options();
        }
        return m94993d(kTX1Loader, abstractC11719f, buffer, options);
    }

    /* renamed from: f */
    public static final C51143wf1 m94991f(KTX1Loader kTX1Loader, Context context, AbstractC11719f lifecycle, String iblKtxFileLocation, String str) {
        ByteBuffer byteBuffer;
        Intrinsics.checkNotNullParameter(kTX1Loader, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(iblKtxFileLocation, "iblKtxFileLocation");
        ByteBuffer m25810b = C45042mM4.m25810b(context, iblKtxFileLocation);
        if (str != null) {
            byteBuffer = C45042mM4.m25810b(context, str);
        } else {
            byteBuffer = null;
        }
        C34270Lj2 m94996a = m94996a(kTX1Loader, lifecycle, m25810b, byteBuffer);
        if (m25810b != null) {
            m25810b.clear();
        }
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        return m94996a;
    }

    /* renamed from: g */
    public static /* synthetic */ C51143wf1 m94990g(KTX1Loader kTX1Loader, Context context, AbstractC11719f abstractC11719f, String str, String str2, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        return m94991f(kTX1Loader, context, abstractC11719f, str, str2);
    }
}

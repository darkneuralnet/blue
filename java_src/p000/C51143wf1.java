package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.google.android.filament.IndirectLight;
import com.google.android.filament.Skybox;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0007\b\u0017\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"Lwf1;", "Ljava/io/Closeable;", "", C17296a.f69688o, "close", "Lcom/google/android/filament/IndirectLight;", "b", "Lcom/google/android/filament/IndirectLight;", "()Lcom/google/android/filament/IndirectLight;", "indirectLight", "Lcom/google/android/filament/Skybox;", "c", "Lcom/google/android/filament/Skybox;", "()Lcom/google/android/filament/Skybox;", "skybox", "", DateTokenConverter.CONVERTER_KEY, "[F", "()[F", "sphericalHarmonics", "<init>", "(Lcom/google/android/filament/IndirectLight;Lcom/google/android/filament/Skybox;[F)V", "sceneview_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: wf1  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C51143wf1 implements Closeable {

    /* renamed from: b */
    public final IndirectLight f116312b;

    /* renamed from: c */
    public final Skybox f116313c;

    /* renamed from: d */
    public final float[] f116314d;

    public C51143wf1() {
        this(null, null, null, 7, null);
    }

    /* renamed from: a */
    public void mo1619a() {
        IndirectLight indirectLight = this.f116312b;
        if (indirectLight != null) {
            D12.m111039b(indirectLight);
        }
        Skybox skybox = this.f116313c;
        if (skybox != null) {
            WD5.m78693b(skybox);
        }
    }

    /* renamed from: b */
    public final IndirectLight m6540b() {
        return this.f116312b;
    }

    /* renamed from: c */
    public final Skybox m6539c() {
        return this.f116313c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        mo1619a();
    }

    /* renamed from: d */
    public final float[] m6538d() {
        return this.f116314d;
    }

    public C51143wf1(IndirectLight indirectLight, Skybox skybox, float[] fArr) {
        this.f116312b = indirectLight;
        this.f116313c = skybox;
        this.f116314d = fArr;
    }

    public /* synthetic */ C51143wf1(IndirectLight indirectLight, Skybox skybox, float[] fArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : indirectLight, (i & 2) != 0 ? null : skybox, (i & 4) != 0 ? null : fArr);
    }
}

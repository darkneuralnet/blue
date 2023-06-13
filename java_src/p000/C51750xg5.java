package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p000.InterfaceC45717nV5;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B3\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0006\u0010\u0014\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0016\u0010\f\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, m28432d2 = {"Lxg5;", "LnV5$c;", "LnV5$b;", "configuration", "LnV5;", C17296a.f69688o, "", "Ljava/lang/String;", "mCopyFromAssetPath", "Ljava/io/File;", "b", "Ljava/io/File;", "mCopyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "c", "Ljava/util/concurrent/Callable;", "mCopyFromInputStream", DateTokenConverter.CONVERTER_KEY, "LnV5$c;", "mDelegate", "<init>", "(Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;LnV5$c;)V", "room-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: xg5  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C51750xg5 implements InterfaceC45717nV5.InterfaceC26536c {

    /* renamed from: a */
    public final String f117966a;

    /* renamed from: b */
    public final File f117967b;

    /* renamed from: c */
    public final Callable<InputStream> f117968c;

    /* renamed from: d */
    public final InterfaceC45717nV5.InterfaceC26536c f117969d;

    public C51750xg5(String str, File file, Callable<InputStream> callable, InterfaceC45717nV5.InterfaceC26536c mDelegate) {
        Intrinsics.checkNotNullParameter(mDelegate, "mDelegate");
        this.f117966a = str;
        this.f117967b = file;
        this.f117968c = callable;
        this.f117969d = mDelegate;
    }

    @Override // p000.InterfaceC45717nV5.InterfaceC26536c
    /* renamed from: a */
    public InterfaceC45717nV5 mo4888a(InterfaceC45717nV5.C26533b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new C51157wg5(configuration.f100066a, this.f117966a, this.f117967b, this.f117968c, configuration.f100068c.f100064a, this.f117969d.mo4888a(configuration));
    }
}

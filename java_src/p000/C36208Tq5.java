package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u000bB\t\b\u0016¢\u0006\u0004\b\u001b\u0010\u001cB1\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001dJ\u0006\u0010\u0002\u001a\u00020\u0000J\u0006\u0010\u0003\u001a\u00020\u0000J\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000J\u000e\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\nJ\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0002\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0018¨\u0006\u001f"}, m28432d2 = {"LTq5;", "", DateTokenConverter.CONVERTER_KEY, "f", "b", "segment", "c", "", "byteCount", "e", "", C17296a.f69688o, "sink", "g", "", "[B", MessageExtension.FIELD_DATA, "I", "pos", "limit", "", "Z", "shared", "owner", "LTq5;", "next", "prev", "<init>", "()V", "([BIIZZ)V", "h", "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
/* renamed from: Tq5  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C36208Tq5 {

    /* renamed from: h */
    public static final C8119a f36325h = new C8119a(null);
    @JvmField

    /* renamed from: a */
    public final byte[] f36326a;
    @JvmField

    /* renamed from: b */
    public int f36327b;
    @JvmField

    /* renamed from: c */
    public int f36328c;
    @JvmField

    /* renamed from: d */
    public boolean f36329d;
    @JvmField

    /* renamed from: e */
    public boolean f36330e;
    @JvmField

    /* renamed from: f */
    public C36208Tq5 f36331f;
    @JvmField

    /* renamed from: g */
    public C36208Tq5 f36332g;

    @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, m28432d2 = {"LTq5$a;", "", "", "SHARE_MINIMUM", "I", "SIZE", "<init>", "()V", "okio"}, m28431k = 1, m28430mv = {1, 6, 0})
    /* renamed from: Tq5$a */
    /* loaded from: classes8.dex */
    public static final class C8119a {
        public /* synthetic */ C8119a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C8119a() {
        }
    }

    public C36208Tq5() {
        this.f36326a = new byte[8192];
        this.f36330e = true;
        this.f36329d = false;
    }

    /* renamed from: a */
    public final void m82376a() {
        boolean z;
        C36208Tq5 c36208Tq5 = this.f36332g;
        int i = 0;
        if (c36208Tq5 != this) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Intrinsics.checkNotNull(c36208Tq5);
            if (!c36208Tq5.f36330e) {
                return;
            }
            int i2 = this.f36328c - this.f36327b;
            C36208Tq5 c36208Tq52 = this.f36332g;
            Intrinsics.checkNotNull(c36208Tq52);
            int i3 = 8192 - c36208Tq52.f36328c;
            C36208Tq5 c36208Tq53 = this.f36332g;
            Intrinsics.checkNotNull(c36208Tq53);
            if (!c36208Tq53.f36329d) {
                C36208Tq5 c36208Tq54 = this.f36332g;
                Intrinsics.checkNotNull(c36208Tq54);
                i = c36208Tq54.f36327b;
            }
            if (i2 > i3 + i) {
                return;
            }
            C36208Tq5 c36208Tq55 = this.f36332g;
            Intrinsics.checkNotNull(c36208Tq55);
            m82370g(c36208Tq55, i2);
            m82375b();
            C38799br5.m62277b(this);
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    /* renamed from: b */
    public final C36208Tq5 m82375b() {
        C36208Tq5 c36208Tq5 = this.f36331f;
        if (c36208Tq5 == this) {
            c36208Tq5 = null;
        }
        C36208Tq5 c36208Tq52 = this.f36332g;
        Intrinsics.checkNotNull(c36208Tq52);
        c36208Tq52.f36331f = this.f36331f;
        C36208Tq5 c36208Tq53 = this.f36331f;
        Intrinsics.checkNotNull(c36208Tq53);
        c36208Tq53.f36332g = this.f36332g;
        this.f36331f = null;
        this.f36332g = null;
        return c36208Tq5;
    }

    /* renamed from: c */
    public final C36208Tq5 m82374c(C36208Tq5 segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.f36332g = this;
        segment.f36331f = this.f36331f;
        C36208Tq5 c36208Tq5 = this.f36331f;
        Intrinsics.checkNotNull(c36208Tq5);
        c36208Tq5.f36332g = segment;
        this.f36331f = segment;
        return segment;
    }

    /* renamed from: d */
    public final C36208Tq5 m82373d() {
        this.f36329d = true;
        return new C36208Tq5(this.f36326a, this.f36327b, this.f36328c, true, false);
    }

    /* renamed from: e */
    public final C36208Tq5 m82372e(int i) {
        boolean z;
        C36208Tq5 m62276c;
        if (i > 0 && i <= this.f36328c - this.f36327b) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i >= 1024) {
                m62276c = m82373d();
            } else {
                m62276c = C38799br5.m62276c();
                byte[] bArr = this.f36326a;
                byte[] bArr2 = m62276c.f36326a;
                int i2 = this.f36327b;
                ArraysKt___ArraysJvmKt.copyInto$default(bArr, bArr2, 0, i2, i2 + i, 2, (Object) null);
            }
            m62276c.f36328c = m62276c.f36327b + i;
            this.f36327b += i;
            C36208Tq5 c36208Tq5 = this.f36332g;
            Intrinsics.checkNotNull(c36208Tq5);
            c36208Tq5.m82374c(m62276c);
            return m62276c;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    /* renamed from: f */
    public final C36208Tq5 m82371f() {
        byte[] bArr = this.f36326a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, size)");
        return new C36208Tq5(copyOf, this.f36327b, this.f36328c, false, true);
    }

    /* renamed from: g */
    public final void m82370g(C36208Tq5 sink, int i) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (sink.f36330e) {
            int i2 = sink.f36328c;
            if (i2 + i > 8192) {
                if (!sink.f36329d) {
                    int i3 = sink.f36327b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = sink.f36326a;
                        ArraysKt___ArraysJvmKt.copyInto$default(bArr, bArr, 0, i3, i2, 2, (Object) null);
                        sink.f36328c -= sink.f36327b;
                        sink.f36327b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f36326a;
            byte[] bArr3 = sink.f36326a;
            int i4 = sink.f36328c;
            int i5 = this.f36327b;
            ArraysKt___ArraysJvmKt.copyInto(bArr2, bArr3, i4, i5, i5 + i);
            sink.f36328c += i;
            this.f36327b += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public C36208Tq5(byte[] data, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f36326a = data;
        this.f36327b = i;
        this.f36328c = i2;
        this.f36329d = z;
        this.f36330e = z2;
    }
}

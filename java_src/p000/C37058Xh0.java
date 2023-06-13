package p000;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import com.fasterxml.jackson.core.JsonPointer;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.ByteCompanionObject;
@Metadata(m28433d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002R\u0014\u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LXh0;", "", "", "f", "e", "", "c", "", "esc", "b", C17296a.f69688o, "", "cl", DateTokenConverter.CONVERTER_KEY, "", "[C", "ESCAPE_2_CHAR", "", "[B", "CHAR_TO_TOKEN", "<init>", "()V", "kotlinx-serialization-json"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: Xh0  reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C37058Xh0 {

    /* renamed from: a */
    public static final C37058Xh0 f43583a;
    @JvmField

    /* renamed from: b */
    public static final char[] f43584b;
    @JvmField

    /* renamed from: c */
    public static final byte[] f43585c;

    static {
        C37058Xh0 c37058Xh0 = new C37058Xh0();
        f43583a = c37058Xh0;
        f43584b = new char[117];
        f43585c = new byte[126];
        c37058Xh0.m76694f();
        c37058Xh0.m76695e();
    }

    private C37058Xh0() {
    }

    /* renamed from: a */
    public final void m76699a(char c, char c2) {
        m76698b(c, c2);
    }

    /* renamed from: b */
    public final void m76698b(int i, char c) {
        if (c != 'u') {
            f43584b[c] = (char) i;
        }
    }

    /* renamed from: c */
    public final void m76697c(char c, byte b) {
        m76696d(c, b);
    }

    /* renamed from: d */
    public final void m76696d(int i, byte b) {
        f43585c[i] = b;
    }

    /* renamed from: e */
    public final void m76695e() {
        for (int i = 0; i < 33; i++) {
            m76696d(i, ByteCompanionObject.MAX_VALUE);
        }
        m76696d(9, (byte) 3);
        m76696d(10, (byte) 3);
        m76696d(13, (byte) 3);
        m76696d(32, (byte) 3);
        m76697c(CoreConstants.COMMA_CHAR, (byte) 4);
        m76697c(CoreConstants.COLON_CHAR, (byte) 5);
        m76697c(CoreConstants.CURLY_LEFT, (byte) 6);
        m76697c(CoreConstants.CURLY_RIGHT, (byte) 7);
        m76697c('[', (byte) 8);
        m76697c(']', (byte) 9);
        m76697c('\"', (byte) 1);
        m76697c(CoreConstants.ESCAPE_CHAR, (byte) 2);
    }

    /* renamed from: f */
    public final void m76694f() {
        for (int i = 0; i < 32; i++) {
            m76698b(i, 'u');
        }
        m76698b(8, 'b');
        m76698b(9, 't');
        m76698b(10, 'n');
        m76698b(12, 'f');
        m76698b(13, 'r');
        m76699a(JsonPointer.SEPARATOR, JsonPointer.SEPARATOR);
        m76699a('\"', '\"');
        m76699a(CoreConstants.ESCAPE_CHAR, CoreConstants.ESCAPE_CHAR);
    }
}

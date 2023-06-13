package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.Stripe3ds2AuthResult;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b6\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b\u0004j\u0002\b5j\u0002\b6j\u0002\b7¨\u00068"}, m28432d2 = {"Lek2;", "", "", "b", "Z", "()Z", "editsText", "<init>", "(Ljava/lang/String;IZ)V", "c", DateTokenConverter.CONVERTER_KEY, "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE, "D", "E", "F", "G", "H", "I", "J", "K", "P", "Q", "R", "S", "T", "U", "W", "X", "Y", "p0", "q0", "r0", "foundation_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: ek2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC40522ek2 {
    LEFT_CHAR(false),
    RIGHT_CHAR(false),
    RIGHT_WORD(false),
    LEFT_WORD(false),
    NEXT_PARAGRAPH(false),
    PREV_PARAGRAPH(false),
    LINE_START(false),
    LINE_END(false),
    LINE_LEFT(false),
    LINE_RIGHT(false),
    UP(false),
    DOWN(false),
    PAGE_UP(false),
    PAGE_DOWN(false),
    HOME(false),
    END(false),
    COPY(false),
    PASTE(true),
    CUT(true),
    DELETE_PREV_CHAR(true),
    DELETE_NEXT_CHAR(true),
    DELETE_PREV_WORD(true),
    DELETE_NEXT_WORD(true),
    DELETE_FROM_LINE_START(true),
    DELETE_TO_LINE_END(true),
    SELECT_ALL(false),
    SELECT_LEFT_CHAR(false),
    SELECT_RIGHT_CHAR(false),
    SELECT_UP(false),
    SELECT_DOWN(false),
    SELECT_PAGE_UP(false),
    SELECT_PAGE_DOWN(false),
    SELECT_HOME(false),
    SELECT_END(false),
    SELECT_LEFT_WORD(false),
    SELECT_RIGHT_WORD(false),
    SELECT_NEXT_PARAGRAPH(false),
    SELECT_PREV_PARAGRAPH(false),
    SELECT_LINE_START(false),
    SELECT_LINE_END(false),
    SELECT_LINE_LEFT(false),
    SELECT_LINE_RIGHT(false),
    DESELECT(false),
    NEW_LINE(true),
    TAB(true),
    UNDO(true),
    REDO(true),
    CHARACTER_PALETTE(true);
    

    /* renamed from: b */
    public final boolean f78809b;

    EnumC40522ek2(boolean z) {
        this.f78809b = z;
    }

    /* renamed from: b */
    public final boolean m42594b() {
        return this.f78809b;
    }
}

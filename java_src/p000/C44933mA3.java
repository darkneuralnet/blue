package p000;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.share.internal.C17296a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
@Metadata(m28433d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ8\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¨\u0006\u000e"}, m28432d2 = {"LmA3;", "", "T", "Lnd3;", "oldList", "newList", "LBs2;", "callback", "Lmd3;", "diffResult", "", C17296a.f69688o, "<init>", "()V", "paging-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
/* renamed from: mA3  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44933mA3 {

    /* renamed from: a */
    public static final C44933mA3 f97481a = new C44933mA3();

    @Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u0000 '*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0014B+\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\u0006\u0010\u0004\u001a\u00020\u0003J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\"\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0002J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0018\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0016\u0010 \u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u0016\u0010\"\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0016\u0010$\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001d¨\u0006("}, m28432d2 = {"LmA3$a;", "T", "LBs2;", "", "f", "", "position", "count", "onInserted", "onRemoved", "fromPosition", "toPosition", "onMoved", "", "payload", "onChanged", "g", "e", "", "b", C17296a.f69688o, DateTokenConverter.CONVERTER_KEY, "c", "Lnd3;", "Lnd3;", "oldList", "newList", "LBs2;", "callback", "I", "placeholdersBefore", "placeholdersAfter", "storageCount", "h", "placeholdersBeforeState", "i", "placeholdersAfterState", "<init>", "(Lnd3;Lnd3;LBs2;)V", "j", "paging-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
    /* renamed from: mA3$a */
    /* loaded from: classes.dex */
    public static final class C25931a<T> implements InterfaceC32011Bs2 {

        /* renamed from: j */
        public static final C25932a f97482j = new C25932a(null);

        /* renamed from: b */
        public final InterfaceC45790nd3<T> f97483b;

        /* renamed from: c */
        public final InterfaceC45790nd3<T> f97484c;

        /* renamed from: d */
        public final InterfaceC32011Bs2 f97485d;

        /* renamed from: e */
        public int f97486e;

        /* renamed from: f */
        public int f97487f;

        /* renamed from: g */
        public int f97488g;

        /* renamed from: h */
        public int f97489h;

        /* renamed from: i */
        public int f97490i;

        @Metadata(m28433d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, m28432d2 = {"LmA3$a$a;", "", "", "UNUSED", "I", "USED_FOR_ADDITION", "USED_FOR_REMOVAL", "<init>", "()V", "paging-runtime_release"}, m28431k = 1, m28430mv = {1, 7, 1})
        /* renamed from: mA3$a$a */
        /* loaded from: classes.dex */
        public static final class C25932a {
            public /* synthetic */ C25932a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C25932a() {
            }
        }

        public C25931a(InterfaceC45790nd3<T> oldList, InterfaceC45790nd3<T> newList, InterfaceC32011Bs2 callback) {
            Intrinsics.checkNotNullParameter(oldList, "oldList");
            Intrinsics.checkNotNullParameter(newList, "newList");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f97483b = oldList;
            this.f97484c = newList;
            this.f97485d = callback;
            this.f97486e = oldList.mo23406c();
            this.f97487f = oldList.mo23405e();
            this.f97488g = oldList.mo23407b();
            this.f97489h = 1;
            this.f97490i = 1;
        }

        /* renamed from: a */
        public final boolean m26203a(int i, int i2) {
            if (i < this.f97488g || this.f97490i == 2) {
                return false;
            }
            int min = Math.min(i2, this.f97487f);
            if (min > 0) {
                this.f97490i = 3;
                this.f97485d.onChanged(this.f97486e + i, min, O31.PLACEHOLDER_TO_ITEM);
                this.f97487f -= min;
            }
            int i3 = i2 - min;
            if (i3 > 0) {
                this.f97485d.onInserted(i + min + this.f97486e, i3);
                return true;
            }
            return true;
        }

        /* renamed from: b */
        public final boolean m26202b(int i, int i2) {
            if (i > 0 || this.f97489h == 2) {
                return false;
            }
            int min = Math.min(i2, this.f97486e);
            if (min > 0) {
                this.f97489h = 3;
                this.f97485d.onChanged((0 - min) + this.f97486e, min, O31.PLACEHOLDER_TO_ITEM);
                this.f97486e -= min;
            }
            int i3 = i2 - min;
            if (i3 > 0) {
                this.f97485d.onInserted(this.f97486e + 0, i3);
                return true;
            }
            return true;
        }

        /* renamed from: c */
        public final boolean m26201c(int i, int i2) {
            int coerceAtLeast;
            if (i + i2 >= this.f97488g && this.f97490i != 3) {
                coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(Math.min(this.f97484c.mo23405e() - this.f97487f, i2), 0);
                int i3 = i2 - coerceAtLeast;
                if (coerceAtLeast > 0) {
                    this.f97490i = 2;
                    this.f97485d.onChanged(this.f97486e + i, coerceAtLeast, O31.ITEM_TO_PLACEHOLDER);
                    this.f97487f += coerceAtLeast;
                }
                if (i3 > 0) {
                    this.f97485d.onRemoved(i + coerceAtLeast + this.f97486e, i3);
                    return true;
                }
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public final boolean m26200d(int i, int i2) {
            int coerceAtLeast;
            if (i > 0 || this.f97489h == 3) {
                return false;
            }
            coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(Math.min(this.f97484c.mo23406c() - this.f97486e, i2), 0);
            int i3 = i2 - coerceAtLeast;
            if (i3 > 0) {
                this.f97485d.onRemoved(this.f97486e + 0, i3);
            }
            if (coerceAtLeast > 0) {
                this.f97489h = 2;
                this.f97485d.onChanged(this.f97486e + 0, coerceAtLeast, O31.ITEM_TO_PLACEHOLDER);
                this.f97486e += coerceAtLeast;
                return true;
            }
            return true;
        }

        /* renamed from: e */
        public final void m26199e() {
            int min = Math.min(this.f97483b.mo23406c(), this.f97486e);
            int mo23406c = this.f97484c.mo23406c() - this.f97486e;
            if (mo23406c > 0) {
                if (min > 0) {
                    this.f97485d.onChanged(0, min, O31.PLACEHOLDER_POSITION_CHANGE);
                }
                this.f97485d.onInserted(0, mo23406c);
            } else if (mo23406c < 0) {
                this.f97485d.onRemoved(0, -mo23406c);
                int i = min + mo23406c;
                if (i > 0) {
                    this.f97485d.onChanged(0, i, O31.PLACEHOLDER_POSITION_CHANGE);
                }
            }
            this.f97486e = this.f97484c.mo23406c();
        }

        /* renamed from: f */
        public final void m26198f() {
            m26199e();
            m26197g();
        }

        /* renamed from: g */
        public final void m26197g() {
            boolean z;
            int min = Math.min(this.f97483b.mo23405e(), this.f97487f);
            int mo23405e = this.f97484c.mo23405e();
            int i = this.f97487f;
            int i2 = mo23405e - i;
            int i3 = this.f97486e + this.f97488g + i;
            int i4 = i3 - min;
            if (i4 != this.f97483b.mo23408a() - min) {
                z = true;
            } else {
                z = false;
            }
            if (i2 > 0) {
                this.f97485d.onInserted(i3, i2);
            } else if (i2 < 0) {
                this.f97485d.onRemoved(i3 + i2, -i2);
                min += i2;
            }
            if (min > 0 && z) {
                this.f97485d.onChanged(i4, min, O31.PLACEHOLDER_POSITION_CHANGE);
            }
            this.f97487f = this.f97484c.mo23405e();
        }

        @Override // p000.InterfaceC32011Bs2
        public void onChanged(int i, int i2, Object obj) {
            this.f97485d.onChanged(i + this.f97486e, i2, obj);
        }

        @Override // p000.InterfaceC32011Bs2
        public void onInserted(int i, int i2) {
            if (!m26203a(i, i2) && !m26202b(i, i2)) {
                this.f97485d.onInserted(i + this.f97486e, i2);
            }
            this.f97488g += i2;
        }

        @Override // p000.InterfaceC32011Bs2
        public void onMoved(int i, int i2) {
            InterfaceC32011Bs2 interfaceC32011Bs2 = this.f97485d;
            int i3 = this.f97486e;
            interfaceC32011Bs2.onMoved(i + i3, i2 + i3);
        }

        @Override // p000.InterfaceC32011Bs2
        public void onRemoved(int i, int i2) {
            if (!m26201c(i, i2) && !m26200d(i, i2)) {
                this.f97485d.onRemoved(i + this.f97486e, i2);
            }
            this.f97488g -= i2;
        }
    }

    private C44933mA3() {
    }

    /* renamed from: a */
    public final <T> void m26204a(InterfaceC45790nd3<T> oldList, InterfaceC45790nd3<T> newList, InterfaceC32011Bs2 callback, C45197md3 diffResult) {
        Intrinsics.checkNotNullParameter(oldList, "oldList");
        Intrinsics.checkNotNullParameter(newList, "newList");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(diffResult, "diffResult");
        C25931a c25931a = new C25931a(oldList, newList, callback);
        diffResult.m25305a().m66262c(c25931a);
        c25931a.m26198f();
    }
}

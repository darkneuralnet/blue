package p000;

import android.widget.TextView;
import com.facebook.share.internal.C17296a;
import com.stripe.android.financialconnections.domain.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\b\u001a\u00020\u0007*\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"La36;", "LMt6;", "Landroid/widget/TextView;", "", "", "", "attrs", "", "c", "Ljava/lang/Class;", "b", "Ljava/lang/Class;", "getViewType", "()Ljava/lang/Class;", "viewType", "", "Ljava/util/Set;", C17296a.f69688o, "()Ljava/util/Set;", "supportedAttributes", "<init>", "()V", "reword_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextViewViewTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextViewViewTransformer.kt\ndev/b3nedikt/reword/transformer/TextViewViewTransformer\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,30:1\n215#2,2:31\n*S KotlinDebug\n*F\n+ 1 TextViewViewTransformer.kt\ndev/b3nedikt/reword/transformer/TextViewViewTransformer\n*L\n23#1:31,2\n*E\n"})
/* renamed from: a36  reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37733a36 implements InterfaceC34598Mt6<TextView> {

    /* renamed from: a */
    public static final C37733a36 f49761a = new C37733a36();

    /* renamed from: b */
    public static final Class<TextView> f49762b = TextView.class;

    /* renamed from: c */
    public static final Set<String> f49763c;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: a36$a */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C10554a extends FunctionReferenceImpl implements Function1<CharSequence, Unit> {
        public C10554a(Object obj) {
            super(1, obj, TextView.class, "setText", "setText(Ljava/lang/CharSequence;)V", 0);
        }

        /* renamed from: a */
        public final void m71944a(CharSequence charSequence) {
            ((TextView) this.receiver).setText(charSequence);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
            m71944a(charSequence);
            return Unit.INSTANCE;
        }
    }

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: a36$b */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C10555b extends FunctionReferenceImpl implements Function1<CharSequence, Unit> {
        public C10555b(Object obj) {
            super(1, obj, TextView.class, "setHint", "setHint(Ljava/lang/CharSequence;)V", 0);
        }

        /* renamed from: a */
        public final void m71943a(CharSequence charSequence) {
            ((TextView) this.receiver).setHint(charSequence);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
            m71943a(charSequence);
            return Unit.INSTANCE;
        }
    }

    static {
        Set<String> of;
        of = SetsKt__SetsKt.setOf((Object[]) new String[]{Entry.TYPE_TEXT, "android:text", "hint", "android:hint"});
        f49763c = of;
    }

    private C37733a36() {
    }

    @Override // p000.InterfaceC34598Mt6
    /* renamed from: a */
    public Set<String> mo6469a() {
        return f49763c;
    }

    @Override // p000.InterfaceC34598Mt6
    /* renamed from: c */
    public void mo6468b(TextView textView, Map<String, Integer> attrs) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        for (Map.Entry<String, Integer> entry : attrs.entrySet()) {
            String key = entry.getKey();
            switch (key.hashCode()) {
                case -1026185038:
                    if (key.equals("android:hint")) {
                        C37379Yq6.m74095a(textView, entry.getValue().intValue(), new C10555b(textView));
                        break;
                    } else {
                        break;
                    }
                case -1025831080:
                    if (key.equals("android:text")) {
                        C37379Yq6.m74095a(textView, entry.getValue().intValue(), new C10554a(textView));
                        break;
                    } else {
                        break;
                    }
                case 3202695:
                    if (key.equals("hint")) {
                        C37379Yq6.m74095a(textView, entry.getValue().intValue(), new C10555b(textView));
                        break;
                    } else {
                        break;
                    }
                case 3556653:
                    if (key.equals(Entry.TYPE_TEXT)) {
                        C37379Yq6.m74095a(textView, entry.getValue().intValue(), new C10554a(textView));
                        break;
                    } else {
                        break;
                    }
            }
        }
    }

    @Override // p000.InterfaceC34598Mt6
    public Class<? super TextView> getViewType() {
        return f49762b;
    }
}

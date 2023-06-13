package p000;

import com.facebook.share.internal.C17296a;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\b\u001a\u00020\u0007*\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m28432d2 = {"LT16;", "LMt6;", "Lcom/google/android/material/textfield/TextInputLayout;", "", "", "", "attrs", "", "c", "Ljava/lang/Class;", "b", "Ljava/lang/Class;", "getViewType", "()Ljava/lang/Class;", "viewType", "", "Ljava/util/Set;", C17296a.f69688o, "()Ljava/util/Set;", "supportedAttributes", "<init>", "()V", "reword_release"}, m28431k = 1, m28430mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextInputLayoutViewTransformer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextInputLayoutViewTransformer.kt\ndev/b3nedikt/reword/transformer/TextInputLayoutViewTransformer\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,25:1\n215#2,2:26\n*S KotlinDebug\n*F\n+ 1 TextInputLayoutViewTransformer.kt\ndev/b3nedikt/reword/transformer/TextInputLayoutViewTransformer\n*L\n19#1:26,2\n*E\n"})
/* renamed from: T16 */
/* loaded from: classes7.dex */
public final class T16 implements InterfaceC34598Mt6<TextInputLayout> {

    /* renamed from: a */
    public static final T16 f34645a = new T16();

    /* renamed from: b */
    public static final Class<TextInputLayout> f34646b = TextInputLayout.class;

    /* renamed from: c */
    public static final Set<String> f34647c;

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: T16$a */
    /* loaded from: classes7.dex */
    public /* synthetic */ class C7641a extends FunctionReferenceImpl implements Function1<CharSequence, Unit> {
        public C7641a(Object obj) {
            super(1, obj, TextInputLayout.class, "setHint", "setHint(Ljava/lang/CharSequence;)V", 0);
        }

        /* renamed from: a */
        public final void m84418a(CharSequence charSequence) {
            ((TextInputLayout) this.receiver).setHint(charSequence);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
            m84418a(charSequence);
            return Unit.INSTANCE;
        }
    }

    static {
        Set<String> of;
        of = SetsKt__SetsKt.setOf((Object[]) new String[]{"hint", "android:hint"});
        f34647c = of;
    }

    private T16() {
    }

    @Override // p000.InterfaceC34598Mt6
    /* renamed from: a */
    public Set<String> mo6469a() {
        return f34647c;
    }

    @Override // p000.InterfaceC34598Mt6
    /* renamed from: c */
    public void mo6468b(TextInputLayout textInputLayout, Map<String, Integer> attrs) {
        boolean areEqual;
        Intrinsics.checkNotNullParameter(textInputLayout, "<this>");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        for (Map.Entry<String, Integer> entry : attrs.entrySet()) {
            String key = entry.getKey();
            if (Intrinsics.areEqual(key, "android:hint")) {
                areEqual = true;
            } else {
                areEqual = Intrinsics.areEqual(key, "hint");
            }
            if (areEqual) {
                C37379Yq6.m74095a(textInputLayout, entry.getValue().intValue(), new C7641a(textInputLayout));
            }
        }
    }

    @Override // p000.InterfaceC34598Mt6
    public Class<? super TextInputLayout> getViewType() {
        return f34646b;
    }
}

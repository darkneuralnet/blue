package com.stripe.android.financialconnections.p041ui;

import android.content.Context;
import android.text.TextUtils;
import androidx.compose.p003ui.platform.C11411h;
import co.bird.android.model.LegacyRepairType;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m28432d2 = {"Lcom/stripe/android/financialconnections/ui/TextResource;", "", "", "toText", "(LEt0;I)Ljava/lang/CharSequence;", "StringId", "Text", "Lcom/stripe/android/financialconnections/ui/TextResource$StringId;", "Lcom/stripe/android/financialconnections/ui/TextResource$Text;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0})
/* renamed from: com.stripe.android.financialconnections.ui.TextResource */
/* loaded from: classes7.dex */
public interface TextResource {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nTextResource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextResource.kt\ncom/stripe/android/financialconnections/ui/TextResource$DefaultImpls\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n76#2:41\n1804#3,4:42\n*S KotlinDebug\n*F\n+ 1 TextResource.kt\ncom/stripe/android/financialconnections/ui/TextResource$DefaultImpls\n*L\n33#1:41\n32#1:42,4\n*E\n"})
    /* renamed from: com.stripe.android.financialconnections.ui.TextResource$DefaultImpls */
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static CharSequence toText(TextResource textResource, InterfaceC32720Et0 interfaceC32720Et0, int i) {
            CharSequence text;
            interfaceC32720Et0.mo89638F(2059343640);
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87816Z(2059343640, i, -1, "com.stripe.android.financialconnections.ui.TextResource.toText (TextResource.kt:23)");
            }
            if (textResource instanceof Text) {
                text = ((Text) textResource).getValue();
            } else if (textResource instanceof StringId) {
                StringId stringId = (StringId) textResource;
                text = ((Context) interfaceC32720Et0.mo89572c(C11411h.m68324g())).getResources().getText(stringId.getValue());
                int i2 = 0;
                for (Object obj : stringId.getArgs()) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                    }
                    text = TextUtils.replace(text, new String[]{"%" + i3 + "$s"}, new String[]{(String) obj});
                    i2 = i3;
                }
                Intrinsics.checkNotNullExpressionValue(text, "args.foldIndexed(\n      …rayOf(arg))\n            }");
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (C35528Qt0.m87827O()) {
                C35528Qt0.m87817Y();
            }
            interfaceC32720Et0.mo89605Q();
            return text;
        }
    }

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, m28432d2 = {"Lcom/stripe/android/financialconnections/ui/TextResource$Text;", "Lcom/stripe/android/financialconnections/ui/TextResource;", "value", "", "(Ljava/lang/CharSequence;)V", "getValue", "()Ljava/lang/CharSequence;", "component1", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "", "toString", "", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.ui.TextResource$Text */
    /* loaded from: classes7.dex */
    public static final class Text implements TextResource {
        public static final int $stable = 8;
        private final CharSequence value;

        public Text(CharSequence value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public static /* synthetic */ Text copy$default(Text text, CharSequence charSequence, int i, Object obj) {
            if ((i & 1) != 0) {
                charSequence = text.value;
            }
            return text.copy(charSequence);
        }

        public final CharSequence component1() {
            return this.value;
        }

        public final Text copy(CharSequence value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Text(value);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Text) && Intrinsics.areEqual(this.value, ((Text) obj).value);
        }

        public final CharSequence getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            CharSequence charSequence = this.value;
            return "Text(value=" + ((Object) charSequence) + ")";
        }

        @Override // com.stripe.android.financialconnections.p041ui.TextResource
        public CharSequence toText(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            return DefaultImpls.toText(this, interfaceC32720Et0, i);
        }
    }

    CharSequence toText(InterfaceC32720Et0 interfaceC32720Et0, int i);

    @Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m28432d2 = {"Lcom/stripe/android/financialconnections/ui/TextResource$StringId;", "Lcom/stripe/android/financialconnections/ui/TextResource;", "value", "", "args", "", "", "(ILjava/util/List;)V", "getArgs", "()Ljava/util/List;", "getValue", "()I", "component1", "component2", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "", "hashCode", "toString", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.financialconnections.ui.TextResource$StringId */
    /* loaded from: classes7.dex */
    public static final class StringId implements TextResource {
        public static final int $stable = 8;
        private final List<String> args;
        private final int value;

        public StringId(int i, List<String> args) {
            Intrinsics.checkNotNullParameter(args, "args");
            this.value = i;
            this.args = args;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StringId copy$default(StringId stringId, int i, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = stringId.value;
            }
            if ((i2 & 2) != 0) {
                list = stringId.args;
            }
            return stringId.copy(i, list);
        }

        public final int component1() {
            return this.value;
        }

        public final List<String> component2() {
            return this.args;
        }

        public final StringId copy(int i, List<String> args) {
            Intrinsics.checkNotNullParameter(args, "args");
            return new StringId(i, args);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof StringId) {
                StringId stringId = (StringId) obj;
                return this.value == stringId.value && Intrinsics.areEqual(this.args, stringId.args);
            }
            return false;
        }

        public final List<String> getArgs() {
            return this.args;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return (Integer.hashCode(this.value) * 31) + this.args.hashCode();
        }

        public String toString() {
            int i = this.value;
            List<String> list = this.args;
            return "StringId(value=" + i + ", args=" + list + ")";
        }

        @Override // com.stripe.android.financialconnections.p041ui.TextResource
        public CharSequence toText(InterfaceC32720Et0 interfaceC32720Et0, int i) {
            return DefaultImpls.toText(this, interfaceC32720Et0, i);
        }

        public /* synthetic */ StringId(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, (i2 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
        }
    }
}

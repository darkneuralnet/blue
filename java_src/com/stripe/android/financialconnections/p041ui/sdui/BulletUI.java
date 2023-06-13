package com.stripe.android.financialconnections.p041ui.sdui;

import co.bird.android.model.LegacyRepairType;
import com.stripe.android.financialconnections.model.Bullet;
import com.stripe.android.financialconnections.model.Image;
import com.stripe.android.financialconnections.p041ui.TextResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m28432d2 = {"Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;", "", "title", "Lcom/stripe/android/financialconnections/ui/TextResource;", "content", "icon", "", "(Lcom/stripe/android/financialconnections/ui/TextResource;Lcom/stripe/android/financialconnections/ui/TextResource;Ljava/lang/String;)V", "getContent", "()Lcom/stripe/android/financialconnections/ui/TextResource;", "getIcon", "()Ljava/lang/String;", "getTitle", "component1", "component2", "component3", "copy", "equals", "", LegacyRepairType.OTHER_KEY, "hashCode", "", "toString", "Companion", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.financialconnections.ui.sdui.BulletUI */
/* loaded from: classes7.dex */
public final class BulletUI {
    public static final Companion Companion = new Companion(null);
    private final TextResource content;
    private final String icon;
    private final TextResource title;

    @Metadata(m28433d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m28432d2 = {"Lcom/stripe/android/financialconnections/ui/sdui/BulletUI$Companion;", "", "()V", "from", "Lcom/stripe/android/financialconnections/ui/sdui/BulletUI;", "bullet", "Lcom/stripe/android/financialconnections/model/Bullet;", "financial-connections_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    @SourceDebugExtension({"SMAP\nServerDrivenUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ServerDrivenUi.kt\ncom/stripe/android/financialconnections/ui/sdui/BulletUI$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,36:1\n1#2:37\n*E\n"})
    /* renamed from: com.stripe.android.financialconnections.ui.sdui.BulletUI$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BulletUI from(Bullet bullet) {
            String str;
            TextResource.Text text;
            Intrinsics.checkNotNullParameter(bullet, "bullet");
            Image icon = bullet.getIcon();
            TextResource.Text text2 = null;
            if (icon != null) {
                str = icon.getDefault();
            } else {
                str = null;
            }
            String title = bullet.getTitle();
            if (title != null) {
                text = new TextResource.Text(ServerDrivenUiKt.fromHtml(title));
            } else {
                text = null;
            }
            String content = bullet.getContent();
            if (content != null) {
                text2 = new TextResource.Text(ServerDrivenUiKt.fromHtml(content));
            }
            return new BulletUI(text, text2, str);
        }

        private Companion() {
        }
    }

    public BulletUI(TextResource textResource, TextResource textResource2, String str) {
        this.title = textResource;
        this.content = textResource2;
        this.icon = str;
    }

    public static /* synthetic */ BulletUI copy$default(BulletUI bulletUI, TextResource textResource, TextResource textResource2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            textResource = bulletUI.title;
        }
        if ((i & 2) != 0) {
            textResource2 = bulletUI.content;
        }
        if ((i & 4) != 0) {
            str = bulletUI.icon;
        }
        return bulletUI.copy(textResource, textResource2, str);
    }

    public final TextResource component1() {
        return this.title;
    }

    public final TextResource component2() {
        return this.content;
    }

    public final String component3() {
        return this.icon;
    }

    public final BulletUI copy(TextResource textResource, TextResource textResource2, String str) {
        return new BulletUI(textResource, textResource2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BulletUI) {
            BulletUI bulletUI = (BulletUI) obj;
            return Intrinsics.areEqual(this.title, bulletUI.title) && Intrinsics.areEqual(this.content, bulletUI.content) && Intrinsics.areEqual(this.icon, bulletUI.icon);
        }
        return false;
    }

    public final TextResource getContent() {
        return this.content;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final TextResource getTitle() {
        return this.title;
    }

    public int hashCode() {
        TextResource textResource = this.title;
        int hashCode = (textResource == null ? 0 : textResource.hashCode()) * 31;
        TextResource textResource2 = this.content;
        int hashCode2 = (hashCode + (textResource2 == null ? 0 : textResource2.hashCode())) * 31;
        String str = this.icon;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        TextResource textResource = this.title;
        TextResource textResource2 = this.content;
        String str = this.icon;
        return "BulletUI(title=" + textResource + ", content=" + textResource2 + ", icon=" + str + ")";
    }
}

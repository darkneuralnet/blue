package com.stripe.android.link.p042ui;

import com.stripe.android.link.C18975R;
import com.stripe.android.link.p042ui.menus.LinkMenuItem;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(m28433d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u0019\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m28432d2 = {"Lcom/stripe/android/link/ui/LinkLogoutMenuItem;", "Lcom/stripe/android/link/ui/menus/LinkMenuItem;", "textResId", "", "isDestructive", "", "(IZ)V", "()Z", "getTextResId", "()I", "Cancel", "Logout", "Lcom/stripe/android/link/ui/LinkLogoutMenuItem$Cancel;", "Lcom/stripe/android/link/ui/LinkLogoutMenuItem$Logout;", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* renamed from: com.stripe.android.link.ui.LinkLogoutMenuItem */
/* loaded from: classes7.dex */
public abstract class LinkLogoutMenuItem implements LinkMenuItem {
    private final boolean isDestructive;
    private final int textResId;

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/link/ui/LinkLogoutMenuItem$Cancel;", "Lcom/stripe/android/link/ui/LinkLogoutMenuItem;", "()V", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.LinkLogoutMenuItem$Cancel */
    /* loaded from: classes7.dex */
    public static final class Cancel extends LinkLogoutMenuItem {
        public static final int $stable = 0;
        public static final Cancel INSTANCE = new Cancel();

        private Cancel() {
            super(C18975R.string.cancel, false, 2, null);
        }
    }

    @Metadata(m28433d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28432d2 = {"Lcom/stripe/android/link/ui/LinkLogoutMenuItem$Logout;", "Lcom/stripe/android/link/ui/LinkLogoutMenuItem;", "()V", "link_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* renamed from: com.stripe.android.link.ui.LinkLogoutMenuItem$Logout */
    /* loaded from: classes7.dex */
    public static final class Logout extends LinkLogoutMenuItem {
        public static final int $stable = 0;
        public static final Logout INSTANCE = new Logout();

        private Logout() {
            super(C18975R.string.log_out, true, null);
        }
    }

    public /* synthetic */ LinkLogoutMenuItem(int i, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z);
    }

    @Override // com.stripe.android.link.p042ui.menus.LinkMenuItem
    public int getTextResId() {
        return this.textResId;
    }

    @Override // com.stripe.android.link.p042ui.menus.LinkMenuItem
    public boolean isDestructive() {
        return this.isDestructive;
    }

    private LinkLogoutMenuItem(int i, boolean z) {
        this.textResId = i;
        this.isDestructive = z;
    }

    public /* synthetic */ LinkLogoutMenuItem(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? false : z, null);
    }
}

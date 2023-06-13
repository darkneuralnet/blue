package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.stripe3ds2.init.p048ui.UiCustomization;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import com.stripe.android.stripe3ds2.transactions.UiType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
@Metadata(m28433d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m28432d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeEntryViewFactory;", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "(Landroid/content/Context;)V", "createChallengeEntrySelectView", "Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;", "challengeResponseData", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "uiCustomization", "Lcom/stripe/android/stripe3ds2/init/ui/UiCustomization;", "createChallengeEntryTextView", "Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;", "createChallengeEntryWebView", "Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;", "3ds2sdk_release"}, m28431k = 1, m28430mv = {1, 7, 1}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class ChallengeEntryViewFactory {
    private final Context context;

    public ChallengeEntryViewFactory(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final ChallengeZoneSelectView createChallengeEntrySelectView(ChallengeResponseData challengeResponseData, UiCustomization uiCustomization) {
        boolean z;
        Intrinsics.checkNotNullParameter(challengeResponseData, "challengeResponseData");
        Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
        if (challengeResponseData.getUiType() == UiType.SingleSelect) {
            z = true;
        } else {
            z = false;
        }
        ChallengeZoneSelectView challengeZoneSelectView = new ChallengeZoneSelectView(this.context, null, 0, z, 6, null);
        challengeZoneSelectView.setTextEntryLabel(challengeResponseData.getChallengeInfoLabel(), uiCustomization.getLabelCustomization());
        challengeZoneSelectView.setChallengeSelectOptions(challengeResponseData.getChallengeSelectOptions(), uiCustomization.getButtonCustomization(UiCustomization.ButtonType.SELECT));
        return challengeZoneSelectView;
    }

    public final ChallengeZoneTextView createChallengeEntryTextView(ChallengeResponseData challengeResponseData, UiCustomization uiCustomization) {
        Intrinsics.checkNotNullParameter(challengeResponseData, "challengeResponseData");
        Intrinsics.checkNotNullParameter(uiCustomization, "uiCustomization");
        ChallengeZoneTextView challengeZoneTextView = new ChallengeZoneTextView(this.context, null, 0, 6, null);
        challengeZoneTextView.setTextEntryLabel(challengeResponseData.getChallengeInfoLabel());
        challengeZoneTextView.setTextBoxCustomization(uiCustomization.getTextBoxCustomization());
        return challengeZoneTextView;
    }

    public final ChallengeZoneWebView createChallengeEntryWebView(ChallengeResponseData challengeResponseData) {
        Intrinsics.checkNotNullParameter(challengeResponseData, "challengeResponseData");
        ChallengeZoneWebView challengeZoneWebView = new ChallengeZoneWebView(this.context, null, 0, 6, null);
        challengeZoneWebView.loadHtml(challengeResponseData.getAcsHtml());
        return challengeZoneWebView;
    }
}

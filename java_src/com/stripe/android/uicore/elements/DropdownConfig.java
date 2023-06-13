package com.stripe.android.uicore.elements;

import java.util.List;
import kotlin.Metadata;
@Metadata(m28433d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H&J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u000fH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\t¨\u0006\u001a"}, m28432d2 = {"Lcom/stripe/android/uicore/elements/DropdownConfig;", "", "debugLabel", "", "getDebugLabel", "()Ljava/lang/String;", "disableDropdownWithSingleElement", "", "getDisableDropdownWithSingleElement", "()Z", "displayItems", "", "getDisplayItems", "()Ljava/util/List;", "label", "", "getLabel", "()I", "rawItems", "getRawItems", "tinyMode", "getTinyMode", "convertFromRaw", "rawValue", "getSelectedItemLabel", "index", "stripe-ui-core_release"}, m28431k = 1, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public interface DropdownConfig {

    @Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static boolean getDisableDropdownWithSingleElement(DropdownConfig dropdownConfig) {
            return false;
        }

        public static boolean getTinyMode(DropdownConfig dropdownConfig) {
            return false;
        }
    }

    String convertFromRaw(String str);

    String getDebugLabel();

    boolean getDisableDropdownWithSingleElement();

    List<String> getDisplayItems();

    int getLabel();

    List<String> getRawItems();

    String getSelectedItemLabel(int i);

    boolean getTinyMode();
}

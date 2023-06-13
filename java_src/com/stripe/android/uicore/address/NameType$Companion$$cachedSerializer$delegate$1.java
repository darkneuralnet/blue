package com.stripe.android.uicore.address;

import com.amazonaws.mobileconnectors.p025s3.transferutility.TransferTable;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
@Metadata(m28431k = 3, m28430mv = {1, 8, 0}, m28428xi = 48)
/* loaded from: classes7.dex */
public final class NameType$Companion$$cachedSerializer$delegate$1 extends Lambda implements Function0<InterfaceC34036Kj2<Object>> {
    public static final NameType$Companion$$cachedSerializer$delegate$1 INSTANCE = new NameType$Companion$$cachedSerializer$delegate$1();

    public NameType$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final InterfaceC34036Kj2<Object> invoke() {
        return C48180rf1.m15590a("com.stripe.android.uicore.address.NameType", NameType.values(), new String[]{"area", "cedex", "city", "country", "county", "department", "district", "do_si", "eircode", "emirate", "island", "neighborhood", "oblast", "parish", "pin", "post_town", "postal", "prefecture", "province", TransferTable.COLUMN_STATE, "suburb", "suburb_or_city", "townland", "village_township", "zip"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
    }
}
